package com.honestefforts.fixengine.model.message.components;

import com.honestefforts.fixengine.model.universal.Currency;
import java.time.LocalDate;
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
public class FinancingDetails {
  /** Tag 913 (AgreementDesc) */
  String agreementDesc;
  /** Tag 914 (AgreementID) */
  String agreementID;
  /** Tag 915 (AgreementDate) */
  LocalDate agreementDate;
  /** Tag 918 (AgreementCurrency) */
  Currency agreementCurrency;
  /** Tag 788 (TerminationType) */
  Integer terminationType;
  /** Tag 916 (StartDate) */
  LocalDate startDate;
  /** Tag 917 (EndDate) */
  LocalDate endDate;
  /** Tag 919 (DeliveryType) */
  Integer deliveryType;
  /** Tag 898 (MarginRatio) */
  Double marginRatio;

}
