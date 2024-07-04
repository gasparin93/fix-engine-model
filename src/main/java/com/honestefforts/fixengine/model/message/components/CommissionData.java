package com.honestefforts.fixengine.model.message.components;

import com.honestefforts.fixengine.model.universal.Currency;

public class CommissionData {
  /** Tag 12 (Commission)*/
  Double commission;
  /** Tag 13 (CommType)*/
  Character commissionType;
  /** Tag 479 (CommCurrency)*/
  Currency commissionCurrency;
  /** Tag 497 (FundRenewWaiv)*/
  Boolean fundRenewCommissionWaived; //TODO: technically this is a char in onix, but functions as bool - revisit
}
