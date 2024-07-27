package com.honestefforts.fixengine.model.message.components;

import java.util.List;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

/**
 * Definition on <a href="https://www.onixs.biz/fix-dictionary/4.4/compBlock_DiscretionInstructions.html">onix</a>
 */
@Getter
@Builder
@FieldDefaults(makeFinal=true, level=AccessLevel. PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class DiscretionInstructions {
  /** Tag 388 (DiscretionInst) */
  Character discretionInstruction;
  /** Tag 389 (DiscretionOffsetValue) */
  Double discretionOffsetValue;
  /** Tag 841 (DiscretionMoveType) */
  Integer discretionMoveType;
  /** Tag 842 (DiscretionOffsetType) */
  Integer discretionOffsetType;
  /** Tag 843 (DiscretionLimitType) */
  Integer discretionLimitType;
  /** Tag 844 (DiscretionRoundDirection) */
  Integer discretionRoundDirection;
  /** Tag 846 (DiscretionScope) */
  Integer discretionScope;

  @Getter
  private static final List<Integer> supportedTags = List.of(388,389,841,842,843,844,846);

}
