package com.honestefforts.fixengine.model.message.components;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

/**
 * Definition on <a href="https://www.onixs.biz/fix-dictionary/4.4/compBlock_PegInstructions.html">onix</a>
 */
@Getter
@Builder
@FieldDefaults(makeFinal=true, level=AccessLevel. PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class PegInstructions {
  /** Tag 211 (PegOffsetValue) */
  Double pegOffsetValue;
  /** Tag 835 (PegMoveType) */
  Integer pegMoveType;
  /** Tag 836 (PegOffsetType) */
  Integer pegOffsetType;
  /** Tag 837 (PegLimitType) */
  Integer pegLimitType;
  /** Tag 838 (PegRoundDirection) */
  Integer pegRoundDirection;
  /** Tag 840 (PegScope) */
  Integer pegScope;
}
