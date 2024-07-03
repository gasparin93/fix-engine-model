package com.honestefforts.fixengine.model.message;

import com.honestefforts.fixengine.model.message.tags.ExecutionInstructions;
import com.honestefforts.fixengine.model.universal.MarketIdentifierCode;
import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class NewOrderSingleOptionalFields {

  String account;
  ExecutionInstructions executionInstructions;
  MarketIdentifierCode executionDestination;
  MarketIdentifierCode securityExchange;
  LocalDate expireDate;
  LocalDateTime expireTime;

}