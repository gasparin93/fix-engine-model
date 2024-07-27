package com.honestefforts.fixengine.model.message.components;

import com.honestefforts.fixengine.model.universal.CountryCode;
import com.honestefforts.fixengine.model.universal.Currency;
import com.honestefforts.fixengine.model.universal.MarketIdentifierCode;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.List;
import java.util.stream.Stream;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

/**
 * Definition on <a href="https://www.onixs.biz/fix-dictionary/4.4/compBlock_UnderlyingInstrument.html">onix</a>
 */
@Getter
@Builder
@FieldDefaults(makeFinal=true, level=AccessLevel. PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class UnderlyingInstrument {
  //TODO: this is an exact copy of Instrument, except without:
  ///** Tag 691 (Pool) */
  //String pool;
  ///** Tag 667 (ContractSettlMonth) */
  //YearMonth contractSettlementMonth;
  // /** Tag 864 (NoEvents) */
  //  Integer numberOfEvents;
  //  /** Tag 865 (EventType) */
  //  Integer eventType;
  //  /** Tag 866 (EventDate) */
  //  LocalDate eventDate;
  //  /** Tag 867 (EventPx) */
  //  Double eventPx;
  //  /** Tag 868 (EventText) */
  //  String eventText;
  //  /** Tag 873 (DatedDate) */
  //  LocalDate datedDate;
  //  /** Tag 874 (InterestAccrualDate) */
  //  LocalDate interestAccrualDate;
  //has unique fields:
  // /** Tag 318 (UnderlyingCurrency) */
  //  Currency underlyingCurrency;
  //  /** Tag 879 (UnderlyingQty) */
  //  Integer underlyingQuantity;
  // /** Tag 810 (UnderlyingPx) */
  //  Double underlyingPrice;
  //  /** Tag 882 (UnderlyingDirtyPrice) */
  //  Double underlyingDirtyPrice;
  //  /** Tag 883 (UnderlyingEndPrice) */
  //  Double underlyingEndPrice;
  //  /** Tag 884 (UnderlyingStartValue) */
  //  Double underlyingStartValue;
  //  /** Tag 885 (UnderlyingCurrentValue) */
  //  Double underlyingCurrentValue;
  //  /** Tag 886	UnderlyingEndValue */
  //  Double underlyingEndValue;
  //  /** Component block, see {@link UnderlyingStipulations} */
  //  UnderlyingStipulations underlyingStipulations;
  //TODO: move shared fields into an abstract class

  /** Tag 311 (UnderlyingSymbol) */
  String underlyingSymbol;
  /** Tag 312 (UnderlyingSymbolSfx) */
  String underlyingSymbolSfx;
  /** Tag 309 (UnderlyingSecurityID) */
  String underlyingSecurityID;
  /** Tag 305 (UnderlyingSecurityIDSource) */
  String underlyingSecurityIDSource;
  /** Tag 457 (NoUnderlyingSecurityAltID) */
  Integer numberOfUnderlyingAlternativeSecurityIds;
  /** Tag 458 (UnderlyingSecurityAltID) */
  String underlyingAlternativeSecurityId;
  /** Tag 459 (UnderlyingSecurityAltIDSource) */
  String underlyingAlternativeSecurityIdSource;
  /** Tag 462 (UnderlyingProduct) */
  Integer underlyingProduct;
  /** Tag 463 (UnderlyingCFICode) */
  String underlyingClassificationOfFinancialInstrumentsCode; //TODO: iso
  /** Tag 310 (UnderlyingSecurityType) */
  String underlyingSecurityType;
  /** Tag 763 (UnderlyingSecuritySubType) */
  String underlyingSecuritySubType;
  /** Tag 313 (UnderlyingMaturityMonthYear) */
  YearMonth underlyingMaturityMonthYear;
  /** Tag 542 (UnderlyingMaturityDate) */
  LocalDate underlyingMaturityDate;
  /** Tag 241 (UnderlyingCouponPaymentDate) */
  LocalDate underlyingCouponPaymentDate;
  /** Tag 242 (UnderlyingIssueDate) */
  LocalDate underlyingIssueDate;
  /** Tag 243 (UnderlyingRepoCollateralSecurityType) */
  String underlyingRepoCollateralSecurityType;
  /** Tag 244 (UnderlyingRepurchaseTerm) */
  Integer underlyingRepurchaseTerm;
  /** Tag 245 (UnderlyingRepurchaseRate) */
  Double underlyingRepurchaseRate;
  /** Tag 246 (UnderlyingFactor) */
  Double underlyingFactor;
  /** Tag 256 (UnderlyingCreditRating) */
  String underlyingCreditRating;
  /** Tag 595 (UnderlyingInstrRegistry) */
  String underlyingInstrumentRegistry;
  /** Tag 592 (UnderlyingCountryOfIssue) */
  CountryCode underlyingCountryOfIssue;
  /** Tag 593 (UnderlyingStateOrProvinceOfIssue) */
  String underlyingStateOrProvinceOfIssue;
  /** Tag 594 (UnderlyingLocaleOfIssue) */
  String underlyingLocaleOfIssue;
  /** Tag 247 (UnderlyingRedemptionDate) */
  @Deprecated LocalDate underlyingRedemptionDate;
  /** Tag 316 (UnderlyingStrikePrice) */
  Double underlyingStrikePrice;
  /** Tag 941 (UnderlyingStrikeCurrency) */
  Currency underlyingStrikeCurrency;
  /** Tag 317 (UnderlyingOptAttribute) */
  Character underlyingOptionAttribute;
  /** Tag 436 (UnderlyingContractMultiplier) */
  Double underlyingContractMultiplier;
  /** Tag 435 (UnderlyingCouponRate) */
  Double underlyingCouponRate;
  /** Tag 308 (UnderlyingSecurityExchange) */
  MarketIdentifierCode underlyingSecurityExchange;
  /** Tag 306	UnderlyingIssuer */
  String underlyingIssuer;
  /** Tag 362 (EncodedUnderlyingIssuerLen) */
  Integer encodedUnderlyingIssuerLength;
  /** Tag 363 (EncodedUnderlyingIssuer) */
  String encodedUnderlyingIssuer;
  /** Tag 307 (UnderlyingSecurityDesc) */
  String underlyingSecurityDescription;
  /** Tag 364 (EncodedUnderlyingSecurityDescLen) */
  Integer encodedUnderlyingSecurityDescriptionLength;
  /** Tag 365 (EncodedUnderlyingSecurityDesc) */
  String encodedUnderlyingSecurityDescription;
  /** Tag 877 (UnderlyingCPProgram) */
  Integer underlyingCommercialPaperProgram;
  /** Tag 878 (UnderlyingCPRegType) */
  String underlyingCommercialPaperRegistrationType;
  /** Tag 318 (UnderlyingCurrency) */
  Currency underlyingCurrency;
  /** Tag 879 (UnderlyingQty) */
  Integer underlyingQuantity;
  /** Tag 810 (UnderlyingPx) */
  Double underlyingPrice;
  /** Tag 882 (UnderlyingDirtyPrice) */
  Double underlyingDirtyPrice;
  /** Tag 883 (UnderlyingEndPrice) */
  Double underlyingEndPrice;
  /** Tag 884 (UnderlyingStartValue) */
  Double underlyingStartValue;
  /** Tag 885 (UnderlyingCurrentValue) */
  Double underlyingCurrentValue;
  /** Tag 886	UnderlyingEndValue */
  Double underlyingEndValue;
  /** Component block, see {@link UnderlyingStipulations} */
  UnderlyingStipulations underlyingStipulations;

  @Getter
  private static final List<Integer> supportedTags = Stream.concat(
      Stream.of(311,312,309,305,457,458,459,462,463,310,763,313,542,241,242,243,244,245,246,256,
          595,592,593,594,247,316,941,317,436,435,308,306,362,363,307,364,365,877,878,318,879,810,
          882,883,884,885,886), UnderlyingStipulations.getSupportedTags().stream())
      .toList();

}
