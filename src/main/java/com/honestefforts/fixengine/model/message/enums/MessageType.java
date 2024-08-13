package com.honestefforts.fixengine.model.message.enums;

import com.honestefforts.fixengine.model.message.components.Instrument;
import com.honestefforts.fixengine.model.message.components.OrderQuantityData;
import com.honestefforts.fixengine.model.message.types.NewOrderSingle;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.experimental.FieldDefaults;

@Getter
@AllArgsConstructor
@FieldDefaults(makeFinal=true, level= AccessLevel. PRIVATE)
public enum MessageType {
  NEW_ORDER_SINGLE("D", NewOrderSingle.getRequiredTags(), List.of(
      new RequiredComponent(Instrument.class.getSimpleName(),
          Instrument.getSupportedTags()),
      new RequiredComponent(OrderQuantityData.class.getSimpleName(),
          OrderQuantityData.getSupportedTags())
  ));

  @NonNull
  String fixSymbol;
  @NonNull
  Set<Integer> requiredTags;
  @NonNull
  List<RequiredComponent> requiredComponents;

  private static final Map<String, MessageType> lookupMap = Arrays.stream(MessageType.values())
      .collect(Collectors.toMap(MessageType::getFixSymbol, Function.identity()));

  public static boolean isAValidMessageType(String strMessageType) {
    return lookupMap.containsKey(strMessageType);
  }

  public static MessageType getMessageType(String strMessageType) {
    return lookupMap.get(strMessageType);
  }

  public record RequiredComponent(String component, List<Integer> supportedTags) {}

}
