package com.honestefforts.fixengine.model.message;

import com.honestefforts.fixengine.model.message.tags.RawTag;
import java.util.Map;
import lombok.*;

import java.time.Instant;

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
