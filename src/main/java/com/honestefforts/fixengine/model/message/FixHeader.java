package com.honestefforts.fixengine.model.message;

import com.honestefforts.fixengine.model.message.tags.BeginString;
import com.honestefforts.fixengine.model.message.tags.MessageType;
import lombok.*;

import java.time.Instant;

@Value
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
class FixHeader {
    @NonNull
    BeginString version;
    @NonNull
    Integer checkSum;
    @NonNull
    MessageType messageType;
    @NonNull
    String senderCompID;
    @NonNull
    String targetCompID;
    @NonNull
    Integer msgSeqNum;
    @NonNull
    Instant sendingTime;
}
