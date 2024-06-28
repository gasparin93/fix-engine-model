package com.honestefforts.fixengine.model.message.tags;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum OrderType {
  MARKET("1", "Market"),
  LIMIT("2", "Limit"),
  STOP("3", "Stop"),
  STOP_LIMIT("4", "Stop limit"),
  WITH_OR_WITHOUT("6", "With or without"),
  LIMIT_OR_BETTER("7", "Limit or better (Deprecated)"),
  LIMIT_WITH_OR_WITHOUT("8", "Limit with or without"),
  ON_BASIS("9", "On basis"),
  PREVIOUSLY_QUOTED("D", "Previously quoted"),
  PREVIOUS_INDICATED("E", "Previously indicated"),
  FOREX("G", "Forex - Swap"),
  FUNARI("I",
      "Funari (Limit Day Order with unexecuted portion handled as Market On Close. E.g. Japan)"),
  MARKET_IF_TOUCHED("J", "Market If Touched (MIT)"),
  MARKET_WITH_LEFTOVER_AS_LIMIT("K",
      "Market with Leftover as Limit (market order then unexecuted quantity becomes limit order at last price)"),
  PREVIOUS_FUND_VALUATION_POINT("L", "Previous Fund Valuation Point (Historic pricing) (for CIV)"),
  NEXT_FUND_VALUATION_POINT("M", "Next Fund Valuation Point (Forward pricing) (for CIV)"),
  PEGGED("P", "Pegged");

  private final String tag;
  private final String description;

}
