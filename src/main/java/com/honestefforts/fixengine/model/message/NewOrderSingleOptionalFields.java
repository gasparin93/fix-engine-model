package com.honestefforts.fixengine.model.message;

import com.honestefforts.fixengine.model.message.tags.ExecutionInstructions;
import com.honestefforts.fixengine.model.message.tags.OrderType;
import com.honestefforts.fixengine.model.message.tags.Side;
import java.time.Instant;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;

@Value
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class NewOrderSingleOptionalFields {

  String account;
  ExecutionInstructions executionInstructions;
  String symbol;
  Side side;
  Instant transactTime;
  OrderType orderType;

}
