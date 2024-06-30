package com.honestefforts.fixengine.model.message;

import com.honestefforts.fixengine.model.message.tags.HandlingInstructions;
import com.honestefforts.fixengine.model.message.tags.OrderType;
import com.honestefforts.fixengine.model.message.tags.Side;
import java.time.Instant;
import lombok.EqualsAndHashCode;
import lombok.NonNull;
import lombok.Value;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Value
@SuperBuilder
public class NewOrderSingle extends FixMessage {

  @NonNull
  String clordid;
  @NonNull
  HandlingInstructions handlingInstructions;
  @NonNull
  String symbol;
  @NonNull
  Side side;
  @NonNull
  Instant transactTime;
  @NonNull
  OrderType orderType;

  NewOrderSingleOptionalFields optionalFields;

}