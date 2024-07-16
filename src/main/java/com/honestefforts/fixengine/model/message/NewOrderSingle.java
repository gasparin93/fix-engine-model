package com.honestefforts.fixengine.model.message;

import com.honestefforts.fixengine.model.message.components.CommissionData;
import com.honestefforts.fixengine.model.message.components.DiscretionInstructions;
import com.honestefforts.fixengine.model.message.components.FinancingDetails;
import com.honestefforts.fixengine.model.message.components.Instrument;
import com.honestefforts.fixengine.model.message.components.NestedParties;
import com.honestefforts.fixengine.model.message.components.OrderQuantityData;
import com.honestefforts.fixengine.model.message.components.Parties;
import com.honestefforts.fixengine.model.message.components.PegInstructions;
import com.honestefforts.fixengine.model.message.components.SpreadOrBenchmarkCurveData;
import com.honestefforts.fixengine.model.message.components.Stipulations;
import com.honestefforts.fixengine.model.message.components.UnderlyingInstrument;
import com.honestefforts.fixengine.model.message.components.YieldData;
import com.honestefforts.fixengine.model.universal.Currency;
import com.honestefforts.fixengine.model.universal.MarketIdentifierCode;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NonNull;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

/**
 * Message type D.
 * Definition on <a href="https://www.onixs.biz/fix-dictionary/4.4/msgType_D_68.html">onix</a>
 */
@Getter
@SuperBuilder
@FieldDefaults(makeFinal=true, level=AccessLevel. PRIVATE)
public class NewOrderSingle extends FixMessage {
  //TODO: move similar fields into components?
  //TODO: may be better to move some of these into Enums for easier validation/conversion

  /** Tag 11 (ClOrdID) */
  @NonNull String clordid;
  /** Tag 54 (Side) */
  @NonNull Character side;
  /** Tag 60 (TransactTime) */
  @NonNull LocalDateTime transactTime;
  /** Tag 40 (OrdType) */
  @NonNull Character orderType;
  /** Component block, see {@link Instrument} */
  @NonNull Instrument instrument;
  /** Component block, see {@link OrderQuantityData} */
  @NonNull OrderQuantityData orderQuantityData;
  /** Tag 526 (SecondaryClOrdID) */
  String secondaryClordid;
  /** Tag 583 (ClOrdLinkID) */
  String clordidLinkId;
  /** Component block, see {@link Parties} */
  Parties parties;
  /** Tag 229 (TradeOriginationDate) */
  LocalDate tradeOriginationDate;
  /** Tag 75 (TradeDate) */
  LocalDate tradeDate; //TODO: this is local market date, handle timezones?
  /** Tag 1 (Account) */
  String account;
  /** Tag 660 (AcctIDSource) */
  Integer accountIdSource;
  /** Tag 581 (AccountType) */
  Integer accountType;
  /** Tag 589 (DayBookingInst) */
  Character dayBookingInstruction;
  /** Tag 590 (BookingUnit) */
  Character bookingUnit;
  /** Tag 591 (PreallocMethod) */
  Character preallocationMethod;
  /** Tag 70 (AllocID) */
  String allocationId;
  /** Tag 78 (NoAllocs) */
  Integer numberOfAllocations;
  /** Tag 79	(AllocAccount) */
  String allocationAccount;
  /** Tag 661	(AllocAcctIDSource) */
  Integer allocationAccountIdSource;
  /** Tag 736	(AllocSettlCurrency) */
  Currency allocationSettlementCurrency;
  /** Tag 467 (IndividualAllocID) */
  String individualAllocationId;
  /** Component block, see {@link NestedParties} */
  NestedParties nestedParties;
  /** Tag 80 (AllocQty) */
  Double allocatedQuantity;
  /** Tag 63 (SettlType) */
  Character settlementType;
  /** Tag 64 (SettlDate) */
  LocalDate settlementDate;
  /** Tag 544 (CashMargin) */
  Character cashMargin;
  /** Tag 635 (ClearingFeeIndicator) */
  String clearingFeeIndicator;
  /** Tag 21 (HandlInst) */
  Character handlingInstructions;
  /** Tag 18 (ExecInst) */
  List<Character> executionInstructions;
  /** Tag 110 (MinQty) */
  Double minimumQuantity;
  /** Tag 111	(MaxFloor) */
  Double maxFloor;
  /** Tag 100 (ExDestination) */
  MarketIdentifierCode executionDestination;
  /** Tag 386 (NoTradingSessions) */
  Integer numberOfTradingSessions;
  /** Tag 336 (TradingSessionID) */
  String tradingSessionId;
  /** Tag 625 (TradingSessionSubID) */
  String tradingSessionSubID;
  /** Tag 81 (ProcessCode) */
  Character processCode;
  /** Component block, see {@link FinancingDetails} */
  FinancingDetails financingDetails;
  /** Tag 711 (NoUnderlyings) */
  Integer numberOfUnderlyingLegs;
  /** Component block, see {@link UnderlyingInstrument} */
  UnderlyingInstrument underlyingInstrument;
  /** Tag 140 (PrevClosePx) */
  Double previousClosePrice;
  /** Tag 114 (LocateReqd) */
  Boolean locateRequired;
  /** Component block, see {@link Stipulations} */
  Stipulations stipulations;
  /** Tag 854 (QtyType) */
  Integer quantityType;
  /** Tag 423 (PriceType) */
  Integer priceType;
  /** Tag 44 (Price) */
  Double price;
  /** Tag 99 (StopPx) */
  Double stopPrice;
  /** Component block, see {@link SpreadOrBenchmarkCurveData} */
  SpreadOrBenchmarkCurveData spreadOrBenchmarkCurveData;
  /** Component block, see {@link YieldData} */
  YieldData yieldData;
  /** Tag 15 (Currency) */
  Currency currency;
  /** Tag 376 (ComplianceID) */
  String complianceId;
  /** Tag 377 (SolicitedFlag) */
  Boolean solicitedFlag;
  /** Tag 23 (IOIID) */
  String indicationOfInterestId;
  /** Tag 117 (QuoteID) */
  String quoteId;
  /** Tag 59 (TimeInForce) */
  Character timeInForce;
  /** Tag 168 (EffectiveTime) */
  LocalDateTime effectiveTime;
  /** Tag 432 (ExpireDate) */
  LocalDate expireDate;
  /** Tag 126 (ExpireTime) */
  LocalDateTime expireTime;
  /** Tag 427 (GTBookingInst) */
  Integer gtBookingInst;
  /** Component block, see {@link CommissionData} */
  CommissionData commissionData;
  /** Tag 528 (OrderCapacity) */
  Character orderCapacity;
  /** Tag 529 (OrderRestrictions) */
  List<String> orderRestrictions;
  /** Tag 582 (CustOrderCapacity) */
  Integer customerOrderCapacity;
  /** Tag 121 (ForexReq) */
  Boolean forexRequest;
  /** Tag 120 (SettlCurrency) */
  Currency settlementCurrency;
  /** Tag 775 (BookingType) */
  Integer bookingType;
  /** Tag 58 (Text) */
  String text;
  /** Tag 354 (EncodedTextLen) */
  Integer encodedTextLength;
  /** Tag 355 (EncodedText) */
  String encodedText;
  /** Tag 193 (SettlDate2) */
  LocalDate settlementDateFuture;
  /** Tag 192 (OrderQty2) */
  Integer orderQuantityFuture;
  /** Tag 640 (Price2) */
  Double priceFuture;
  /** Tag 77 (PositionEffect) */
  Character positionEffect;
  /** Tag 203 (CoveredOrUncovered) */
  Integer coveredOrUncovered;
  /** Tag 210 (MaxShow) */
  Integer maxShow;
  /** Component block, see {@link PegInstructions} */
  PegInstructions pegInstructions;
  /** Component block, see {@link DiscretionInstructions} */
  DiscretionInstructions discretionInstructions;
  /** Tag 847 (TargetStrategy) */
  Integer targetStrategy;
  /** Tag 848 (TargetStrategyParameters) */
  String targetStrategyParameters;
  /** Tag 849 (ParticipationRate) */
  Double participationRate;
  /** Tag 480 (CancellationRights) */
  Character cancellationRights;
  /** Tag 481 (MoneyLaunderingStatus) */
  Character moneyLaunderingStatus;
  /** Tag 513 (RegistID) */
  String registrationId;
  /** Tag 494 (Designation) */
  String designation;
}
