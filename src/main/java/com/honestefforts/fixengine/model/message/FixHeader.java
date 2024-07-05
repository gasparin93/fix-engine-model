package com.honestefforts.fixengine.model.message;

import java.time.Instant;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.Value;
import lombok.experimental.FieldDefaults;

/**
 * Required set of components for all fix messages.
 * Definition in <a href="https://www.onixs.biz/fix-dictionary/4.4/compBlock_StandardHeader.html">onix</a>
 */
@Getter
@Builder
@FieldDefaults(makeFinal=true, level=AccessLevel. PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class FixHeader {
  /** Tag 8 (BeginString) */
  @NonNull String version; //should be position 1
  /** Tag 9 (BodyLength) */
  @NonNull Integer bodyLength; //should be position 2
  /** Tag 35 (MsgType) */
  @NonNull String messageType; //should be position 3
  /** Tag 34 (MsgSeqNum) */
  @NonNull Integer msgSeqNum;
  /** Tag 52 (SendingTime) */
  @NonNull Instant sendingTime;
  /** Tag 49 (SenderCompID) */
  @NonNull String senderCompID;
  /** Tag 56 (TargetCompID) */
  @NonNull String targetCompID;
  /** Tag 115 (OnBehalfOfCompID) */
  String onBehalfOfCompID;
  /** Tag 128 (DeliverToCompID) */
  String deliverToCompID;
  /** Tag 90 (SecureDataLen) */
  Integer secureDataLength;
  /** Tag 91 (SecureData) */
  String secureData; //should be after secureDataLength, both must be included if one is
  /** Tag 50 (SenderSubID) */
  String senderSubID;
  /** Tag 142 (SenderLocationID) */
  String senderLocationID;
  /** Tag 57 (TargetSubID) */
  String targetSubID;
  /** Tag 143 (TargetLocationID) */
  String targetLocationID;
  /** Tag 116 (OnBehalfOfSubID) */
  String onBehalfOfSubID;
  /** Tag 144 (OnBehalfOfLocationID) */
  String onBehalfOfLocationID;
  /** Tag 129 (DeliverToSubID) */
  String deliverToSubID;
  /** Tag 145 (DeliverToLocationID) */
  String deliverToLocationID;
  /** Tag 43 (PossDupFlag) */
  Boolean possibleDuplicationFlag; //Y/N
  /** Tag 97 (PossResend) */
  Boolean possibleResend; //Y/N
  /** Tag 122 (OrigSendingTime) */
  Instant originalSendingTime;
  /** Tag 212 (XmlDataLen) */
  Integer xmlDataLength;
  /** Tag 213 (XmlData) */
  String xmlData;
  /** Tag 347 (MessageEncoding) */
  String messageEncoding;
  /** Tag 369 (LastMsgSeqNumProcessed) */
  Integer lastMsgSeqNumProcessed;
  /** Tag 627 (NoHops) */
  Integer numberOfHops;
  /** Tag 628 (HopCompIDD) */
  String hopCompID;
  /** Tag 629 (HopSendingTime) */
  Instant hopSendingTime;
  /** Tag 630 (HopRefID) */
  String hopRefID;

}
