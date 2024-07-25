package com.honestefforts.fixengine.model.message.components;

import com.honestefforts.fixengine.model.universal.Currency;
import java.time.LocalDate;
import java.util.List;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

/**
 * Definition on <a href="https://www.onixs.biz/fix-dictionary/4.4/compBlock_FinancingDetails.html">onix</a>
 */
@Getter
@Builder
@FieldDefaults(makeFinal=true, level=AccessLevel. PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class FinancingDetails {
  /** Tag 913 (AgreementDesc) */
  String agreementDesc;
  /** Tag 914 (AgreementID) */
  String agreementId;
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

  public static List<String> supportedTags() {
    return List.of("913", "914", "915", "918", "788", "916", "917", "919", "898");
  }

}
