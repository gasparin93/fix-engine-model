package com.honestefforts.fixengine.model.message.tags;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum MessageType {
    HEARTBEAT("0", "Heartbeat <0>", false),
    TEST_REQUEST("1", "Test Request <1>", false),
    RESEND_REQUEST("2", "Resend Request <2>", false),
    REJECT("3", "Reject <3>", false),
    SEQUENCE_RESET("4", "Sequence Reset <4>", false),
    LOGOUT("5", "Logout <5>", false),
    INDICATION_OF_INTEREST("6", "Indication of Interest <6>", false),
    ADVERTISEMENT("7", "Advertisement <7>", false),
    EXECUTION_REPORT("8", "Execution Report <8>", false),
    ORDER_CANCEL_REJECT("9", "Order Cancel Reject <9>", false),
    LOGON("A", "Logon <A>", false),
    NEWS("B", "News <B>", false),
    EMAIL("C", "Email <C>", false),
    NEW_ORDER_SINGLE("D", "New Order Single <D>", true),
    NEW_ORDER_LIST("E", "New Order List <E>", false),
    ORDER_CANCEL_REQUEST("F", "Order Cancel Request <F>", false),
    ORDER_CANCEL_REPLACE_REQUEST("G", "Order Cancel/Replace Request <G>", false),
    ORDER_STATUS_REQUEST("H", "Order Status Request <H>", false),
    ALLOCATION_INSTRUCTION("J", "Allocation Instruction <J>", false),
    LIST_CANCEL_REQUEST("K", "List Cancel Request <K>", false),
    LIST_EXECUTE("L", "List Execute <L>", false),
    LIST_STATUS_REQUEST("M", "List Status Request <M>", false),
    LIST_STATUS("N", "List Status <N>", false),
    ALLOCATION_INSTRUCTION_ACK("P", "Allocation Instruction Ack <P>", false),
    DONT_KNOW_TRADE("Q", "Don't Know Trade <Q> (DK)", false),
    QUOTE_REQUEST("R", "Quote Request <R>", false),
    QUOTE("S", "Quote <S>", false),
    SETTLEMENT_INSTRUCTIONS("T", "Settlement Instructions <T>", false),
    MARKET_DATA_REQUEST("V", "Market Data Request <V>", false),
    MARKET_DATA_SNAPSHOT_FULL_REFRESH("W", "Market Data-Snapshot/Full Refresh <W>", false),
    MARKET_DATA_INCREMENTAL_REFRESH("X", "Market Data-Incremental Refresh <X>", false),
    MARKET_DATA_REQUEST_REJECT("Y", "Market Data Request Reject <Y>", false),
    QUOTE_CANCEL("Z", "Quote Cancel <Z>", false),
    QUOTE_STATUS_REQUEST("a", "Quote Status Request <a>", false),
    MASS_QUOTE_ACKNOWLEDGEMENT("b", "Mass Quote Acknowledgement <b>", false),
    SECURITY_DEFINITION_REQUEST("c", "Security Definition Request <c>", false),
    SECURITY_DEFINITION("d", "Security Definition <d>", false),
    SECURITY_STATUS_REQUEST("e", "Security Status Request <e>", false),
    SECURITY_STATUS("f", "Security Status <f>", false),
    TRADING_SESSION_STATUS_REQUEST("g", "Trading Session Status Request <g>", false),
    TRADING_SESSION_STATUS("h", "Trading Session Status <h>", false),
    MASS_QUOTE("i", "Mass Quote <i>", false),
    BUSINESS_MESSAGE_REJECT("j", "Business Message Reject <j>", false),
    BID_REQUEST("k", "Bid Request <k>", false),
    BID_RESPONSE("l", "Bid Response <l> (lowercase L)", false),
    LIST_STRIKE_PRICE("m", "List Strike Price <m>", false),
    XML_MESSAGE("n", "XML message <n> (e.g. non-FIX MsgType)", false);

    private final String tag;
    private final String description;
    private final boolean supported;

}
