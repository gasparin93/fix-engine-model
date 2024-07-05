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
public class OrderQuantityData {
  /** Tag 38 (OrderQty) */
  Integer orderQuantity;
  /** Tag 152 (CashOrderQty) */
  Integer cashOrderQuantity;
  /** Tag 516 (OrderPercent) */
  Double orderPercent;
  /** Tag 468 (RoundingDirection) */
  Character roundingDirection;
  /** Tag 469 (RoundingModulus) */
  Double roundingModulus;
}
