package com.honestefforts.fixengine.model.message.components;

import java.util.List;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.experimental.FieldDefaults;

/**
 * Required component for all fix messages.
 * Definition on <a href="https://www.onixs.biz/fix-dictionary/4.4/compBlock_StandardTrailer.html">onix</a>
 */
@Getter
@Builder
@FieldDefaults(makeFinal=true, level=AccessLevel. PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class FixTrailer {
  /** Tag 10 (CheckSum) */
  @NonNull String checkSum;
  /** Tag 93 (SignatureLength) */
  Integer signatureLength;
  /** Tag 89 (Signature) */
  String signature;

  public static List<String> supportedTags() {
    return List.of("10","93","89");
  }
}
