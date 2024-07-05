package com.honestefforts.fixengine.model.message.components;

import lombok.NonNull;

public class MessageTrailer {
  /** Tag 10 (CheckSum) */
  @NonNull String checkSum;
  /** Tag 93 (SignatureLength) */
  Integer signatureLength;
  /** Tag 89 (Signature) */
  String signature;
}
