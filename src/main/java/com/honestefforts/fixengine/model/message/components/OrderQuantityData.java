package com.honestefforts.fixengine.model.message.components;

import java.util.List;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

/**
 * Definition on <a href="https://www.onixs.biz/fix-dictionary/4.4/compBlock_OrderQtyData.html">onix</a>
 */
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

  @Getter
  private static final List<Integer> supportedTags = List.of(38,152,516,468,469);

}
