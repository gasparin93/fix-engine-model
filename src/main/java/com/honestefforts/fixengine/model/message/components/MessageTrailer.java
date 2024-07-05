package com.honestefforts.fixengine.model.message.components;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.Value;
import lombok.experimental.FieldDefaults;

@Getter
@Builder
@FieldDefaults(makeFinal=true, level=AccessLevel. PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class MessageTrailer {
  /** Tag 10 (CheckSum) */
  @NonNull String checkSum;
  /** Tag 93 (SignatureLength) */
  Integer signatureLength;
  /** Tag 89 (Signature) */
  String signature;
}
