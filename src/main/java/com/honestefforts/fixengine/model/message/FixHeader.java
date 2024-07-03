package com.honestefforts.fixengine.model.message;

import com.honestefforts.fixengine.model.message.tags.RawTag;
import java.time.Instant;
import java.util.Map;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;

@Value
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class FixHeader implements FixObject<FixHeader> {

  @NonNull
  String version;
  @NonNull
  Integer checkSum;
  @NonNull
  String messageType;
  @NonNull
  String senderCompID;
  @NonNull
  String targetCompID;
  @NonNull
  Integer msgSeqNum;
  @NonNull
  Instant sendingTime;

  @Override
  public FixHeader fromMapOfTags(@NonNull final Map<String, RawTag> mapOfTags) {
    return FixHeader.builder().build();
  }
}
