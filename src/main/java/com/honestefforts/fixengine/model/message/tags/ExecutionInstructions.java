package com.honestefforts.fixengine.model.message.tags;

import lombok.AllArgsConstructor;
import lombok.Getter;

//TODO: this field can contain multiple instructions separated by space
@Getter
@AllArgsConstructor
public enum ExecutionInstructions {
  NOT_HELD("1", "Not held"),
  WORK("2", "Work"),
  GO_ALONG("3", "Go along"),
  OVER_THE_DAY("4", "Over the day"),
  HELD("5", "Held"),
  PARTICIPATE_DONT_INITIATE("6", "Participate don't initiate"),
  STRICT_SCALE("7", "Strict scale"),
  TRY_TO_SCALE("8", "Try to scale"),
  STAY_ON_BIDSIDE("9", "Stay on bidside"),
  STAY_ON_OFFERSIDE("0", "Stay on offerside"),
  NO_CROSS_("A", "No cross (cross is forbidden)"),
  OK_TO_CROSS("B", "OK to cross"),
  CALL_FIRST("C", "Call first"),
  PERCENT_OF_VOLUME("D", "Percent of volume (indicates that the sender does not want to be all of the volume on the floor vs. a specific percentage)"),
  DO_NOT_INCREASE("E", "Do not increase - DNI"),
  DO_NOT_REDUCE("F", "Do not reduce - DNR"),
  ALL_OR_NONE("G", "All or none - AON"),
  REINSTATE_ON_SYSTEM_FAILURE("H", "Reinstate on System Failure (mutually exclusive with Q)"),
  INSTITUTIONS_ONLY("I", "Institutions only"),
  REINSTATE_ON_TRADING_HALT("J", "Reinstate on Trading Halt (mutually exclusive with K)"),
  CANCEL_ON_TRADING_HALT("K", "Cancel on Trading Halt (mutually exclusive with L)"),
  LAST_PEG("L", "Last peg (last sale)"),
  MID_PRICE_PEG("M", "Mid-price peg (midprice of inside quote)"),
  NON_NEGOTIABLE("N", "Non-negotiable"),
  OPENING_PEG("O", "Opening peg"),
  MARKET_PEG("P", "Market peg"),
  CANCEL_ON_SYSTEM_FAILURE("Q", "Cancel on System Failure (mutually exclusive with H)"),
  PRIMARY_PEG("R", "Primary peg (primary market - buy at bid/sell at offer)"),
  SUSPEND("S", "Suspend"),
  FIXED_PEG_TO_LOCAL_BEST_BID_OR_OFFER_AT_TIME_OF_ORDER("T", "Fixed Peg to Local best bid or offer at time of order (Replaced)"),
  CUSTOMER_DISPLAY_INSTRUCTION("U", "Customer Display Instruction (RuleAc-/4)"),
  NETTING_("V", "Netting (for Forex)"),
  PEG_TO_VWAP("W", "Peg to VWAP"),
  TRADE_ALONG("X", "Trade Along"),
  TRY_TO_STOP("Y", "Try to Stop"),
  CANCEL_IF_NOT_BEST("Z", "Cancel if Not Best"),
  TRAILING_STOP_PEG("a", "Trailing Stop Peg"),
  STRICT_LIMIT("b", "Strict Limit (No Price Improvement)"),
  IGNORE_PRICE_VALIDITY_CHECKS("c", "Ignore Price Validity Checks"),
  PEG_TO_LIMIT_PRICE("d", "Peg to Limit Price"),
  WORK_TO_TARGET_STRATEGY("e", "Work to Target Strategy");

  private final String tag;
  private final String description;
}
