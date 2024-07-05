package com.honestefforts.fixengine.model.message.components;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Value;
import lombok.experimental.FieldDefaults;

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

}
