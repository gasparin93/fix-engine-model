package com.honestefforts.fixengine.model.message.components;

import java.time.LocalDate;

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
