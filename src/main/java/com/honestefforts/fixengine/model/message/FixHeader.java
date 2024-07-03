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
public class FixHeader {
  /**
   * BeginString (tag 8), must be first element in the message
   */
  @NonNull
  String version; //should be position 1
  @NonNull
  Integer bodyLength; //should be position 2
  @NonNull
  String messageType; //should be position 3
  @NonNull
  Integer msgSeqNum;
  @NonNull
  Instant sendingTime;
  @NonNull
  String senderCompID;
  @NonNull
  String targetCompID;
  String onBehalfOfCompID;
  String deliverToCompID;
  Integer secureDataLength;
  String secureData; //should be after secureDataLength, both must be included if one is
  String senderSubID;
  String senderLocationID;
  String targetSubID;
  String targetLocationID;
  String onBehalfOfSubID;
  String onBehalfOfLocationID;
  String deliverToSubID;
  String deliverToLocationID;
  Boolean possibleDuplicationFlag; //Y/N
  Boolean possibleResend; //Y/N
  Instant originalSendingTime;
  Integer xmlDataLength;
  String xmlData;
  String messageEncoding;
  Integer lastMsgSeqNumProcessed;
  Integer numberOfHops;
  String hopCompID;
  Instant hopSendingTime;
  String hopRefID;

}
