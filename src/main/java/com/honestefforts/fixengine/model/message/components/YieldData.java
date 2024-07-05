package com.honestefforts.fixengine.model.message.components;

import java.time.LocalDate;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

/**
 * Definition on <a href="https://www.onixs.biz/fix-dictionary/4.4/compBlock_YieldData.html">onix</a>
 */
@Getter
@Builder
@FieldDefaults(makeFinal=true, level=AccessLevel. PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class YieldData {
  /** Tag 235 (YieldType) */
  String yieldType;
  /** Tag 236 (Yield) */
  Double yield;
  /** Tag 701 (YieldCalcDate) */
  LocalDate yieldCalcDate;
  /** Tag 696 (YieldRedemptionDate) */
  LocalDate yieldRedemptionDate;
  /** Tag 697 (YieldRedemptionPrice) */
  Double yieldRedemptionPrice;
  /** Tag 698 (YieldRedemptionPriceType) */
  Integer yieldRedemptionPriceType;
}
