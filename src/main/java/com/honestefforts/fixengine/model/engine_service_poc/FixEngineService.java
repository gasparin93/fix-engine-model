package com.honestefforts.fixengine.model.engine_service_poc;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;
import lombok.NonNull;

//TODO: handle resiliency, have more standardized logging for errors
public class FixEngineService {
  public static void process() {
    Instant before = Instant.now();
    IntStream.range(1,10000).mapToObj(i -> parseStringToMapVirtual(
        "key1=val1|key2=val2|key3=val3|key4=val4|key5=val5|key6=val6|key7=val7|key8=val8|key9=val9")
            .entrySet())
        .forEach(System.out::println);
    System.out.println(Duration.between(before, Instant.now()).getSeconds()+" seconds");
  }

  public static Map<String, String> parseStringToMapVirtual(@NonNull final String message) {
    return execute(Executors.newVirtualThreadPerTaskExecutor(), message);
  }

  public static Map<String, String> parseStringToMapPlatform(@NonNull final String message) {
    return execute(Executors.newFixedThreadPool(8), message);
  }

  private static Map<String, String> execute(ExecutorService executor, String message) {
    String[] keyValPair = message.split("\\|");

    Map<String, String> map = new ConcurrentHashMap<>();

    Arrays.stream(keyValPair)
        .map(pair -> executor.submit(() -> {
          String[] keyValue = pair.split("=");
          if (keyValue.length == 2) {
            map.put(keyValue[0], keyValue[1]);
          }
          return null;
        }))
        .forEach(future -> {
          try {
            future.get();
          } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
          }
        });

    executor.shutdown();

    return map;
  }

  public static void main(String[] args) {
    process();
  }
}
