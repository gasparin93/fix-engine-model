package com.honestefforts.fixengine.model.message;

import com.honestefforts.fixengine.model.message.tags.BeginString;
import com.honestefforts.fixengine.model.message.tags.MessageType;
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
public class NewOrderSingle implements FixMessage {

  @NonNull
  String clordid;
  @NonNull
  String handlingInstructions;
  @NonNull
  String symbol;
  @NonNull
  Side side;
  @NonNull
  Instant transactTime;
  @NonNull
  OrderType orderType;

}
