package com.honestefforts.fixengine.model.message.components;

import com.honestefforts.fixengine.model.universal.CountryCode;
import com.honestefforts.fixengine.model.universal.Currency;
import com.honestefforts.fixengine.model.universal.MarketIdentifierCode;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.List;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

/**
 * Definition on <a href="https://www.onixs.biz/fix-dictionary/4.4/compBlock_Instrument.html">onix</a>
 */
@Getter
@Builder
@FieldDefaults(makeFinal=true, level=AccessLevel. PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Instrument {
  /** Tag 55 (Symbol) */
  String symbol;
  /** Tag 65 (SymbolSfx) */
  String symbolSfx;
  /** Tag 48 (SecurityID) */
  String securityId;
  /** Tag 22 (SecurityIDSource) */
  String securityIdSource;
  /** Tag 454 (NoSecurityAltID) */
  Integer numberOfAlternativeSecurityIds;
  /** Tag 455 (SecurityAltID) */
  String alternativeSecurityId;
  /** Tag 456 (SecurityAltIDSource) */
  String alternativeSecurityIdSource;
  /** Tag 460 (Product) */
  Integer product;
  /** Tag 461 (CFICode) */
  String classificationOfFinancialInstrumentsCode; //TODO: iso
  /** Tag 167 (SecurityType) */
  String securityType;
  /** Tag 762 (SecuritySubType) */
  String securitySubType;
  /** Tag 200 (MaturityMonthYear) */
  YearMonth maturityMonthYear;
  /** Tag 541 (MaturityDate) */
  LocalDate maturityDate;
  /** Tag 224 (CouponPaymentDate) */
  LocalDate couponPaymentDate;
  /** Tag 225 (IssueDate) */
  LocalDate issueDate;
  /** Tag 239 (RepoCollateralSecurityType) */
  String repoCollateralSecurityType;
  /** Tag 226 (RepurchaseTerm) */
  Integer repurchaseTerm;
  /** Tag 227 (RepurchaseRate) */
  Double repurchaseRate;
  /** Tag 228 (Factor) */
  Double factor;
  /** Tag 255 (CreditRating) */
  String creditRating;
  /** Tag 543 (InstrRegistry) */
  String instrumentRegistry;
  /** Tag 470 (CountryOfIssue) */
  CountryCode countryOfIssue;
  /** Tag 471 (StateOrProvinceOfIssue) */
  String stateOrProvinceOfIssue;
  /** Tag 472 (LocaleOfIssue) */
  String localeOfIssue;
  /** Tag 240 (RedemptionDate) */
  @Deprecated LocalDate redemptionDate;
  /** Tag 202 (StrikePrice) */
  Double strikePrice;
  /** Tag 947 (StrikeCurrency) */
  Currency strikeCurrency;
  /** Tag 206 (OptAttribute) */
  Character optionAttribute;
  /** Tag 231 (ContractMultiplier) */
  Double contractMultiplier;
  /** Tag 223 (CouponRate) */
  Double couponRate;
  /** Tag 207 (SecurityExchange) */
  MarketIdentifierCode securityExchange;
  /** Tag 106 (Issuer) */
  String issuer;
  /** Tag 348 (EncodedIssuerLen) */
  Integer encodedIssuerLength;
  /** Tag 349 (EncodedIssuer) */
  String encodedIssuer;
  /** Tag 107 (SecurityDesc) */
  String securityDescription;
  /** Tag 350 (EncodedSecurityDescLen) */
  Integer encodedSecurityDescriptionLength;
  /** Tag 351 (EncodedSecurityDesc) */
  String encodedSecurityDescription;
  /** Tag 691 (Pool) */
  String pool;
  /** Tag 667 (ContractSettlMonth) */
  YearMonth contractSettlementMonth;
  /** Tag 875 (CPProgram) */
  Integer commercialPaperProgram;
  /** Tag 876 (CPRegType) */
  String commercialPaperRegistrationType;
  /** Tag 864 (NoEvents) */
  Integer numberOfEvents;
  /** Tag 865 (EventType) */
  Integer eventType;
  /** Tag 866 (EventDate) */
  LocalDate eventDate;
  /** Tag 867 (EventPx) */
  Double eventPx;
  /** Tag 868 (EventText) */
  String eventText;
  /** Tag 873 (DatedDate) */
  LocalDate datedDate;
  /** Tag 874 (InterestAccrualDate) */
  LocalDate interestAccrualDate;

  @Getter
  private static final List<Integer> supportedTags = List.of(
      55,65,48,22,454,455,456,460,461,167,762,200, 541,224,225,239,226,227,228,255,543,470,471,472,
      240,202,947, 206,231,223,207,106,348,349,107,350,351,691,667,875,876,864,865,866,867,868,873,
      874);

}
