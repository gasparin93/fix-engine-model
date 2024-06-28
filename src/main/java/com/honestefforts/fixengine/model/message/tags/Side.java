package com.honestefforts.fixengine.model.message.tags;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Side {
  BUY("1", "Buy"),
  SELL("2", "Sell"),
  BUY_MINUS("3", "Buy minus"),
  SELL_PLUS("4", "Sell plus"),
  SELL_SHORT("5", "Sell short"),
  SELL_SHORT_EXEMPT("6", "Sell short exempt"),
  UNDISCLOSED("7", "Undisclosed (valid for IOI and List Order messages only)"),
  CROSS("8",
      "Cross (orders where counterparty is an exchange, valid for all messages except IOIs)"),
  CROSS_SHORT("9", "Cross short"),
  CROSS_SHORT_EXEMPT("A", "Cross short exempt"),
  AS_DEFINED("B", "\"As Defined\" (for use with multileg instruments)"),
  OPPOSITE("C", "\"Opposite\" (for use with multileg instruments)"),
  SUBSCRIBE("D", "Subscribe (e.g. CIV)"),
  REDEEM("E", "Redeem (e.g. CIV)"),
  LEND("F", "Lend (FINANCING - identifies direction of collateral)"),
  BORROW("G", "Borrow (FINANCING - identifies direction of collateral)");

  private final String tag;
  private final String description;
}
