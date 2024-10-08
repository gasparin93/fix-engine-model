package com.honestefforts.fixengine.model.message.components;

import com.honestefforts.fixengine.model.universal.Currency;
import java.util.List;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

/**
 * Definition on <a href="https://www.onixs.biz/fix-dictionary/4.4/compBlock_CommissionData.html">onix</a>
 */
@Getter
@Builder
@FieldDefaults(makeFinal=true, level=AccessLevel. PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class CommissionData {
  /** Tag 12 (Commission)*/
  Double commission;
  /** Tag 13 (CommType)*/
  Character commissionType;
  /** Tag 479 (CommCurrency)*/
  Currency commissionCurrency;
  /** Tag 497 (FundRenewWaiv)*/
  Boolean fundRenewCommissionWaived; //TODO: technically this is a char in onix, but functions as bool - revisit

  @Getter
  private static final List<Integer> supportedTags = List.of(12, 13, 479, 497);

}
