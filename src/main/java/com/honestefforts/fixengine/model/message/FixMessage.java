package com.honestefforts.fixengine.model.message;

import com.honestefforts.fixengine.model.message.components.FixHeader;
import com.honestefforts.fixengine.model.message.components.FixTrailer;
import com.honestefforts.fixengine.model.message.enums.MessageType;
import lombok.Getter;
import lombok.NonNull;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder(toBuilder = true)
public abstract class FixMessage {
  @NonNull
  private final FixHeader fixHeader;

  @NonNull
  private final FixTrailer fixTrailer;

  public abstract FixMessageBuilder<?, ?> toBuilder();

  public MessageType getMessageType() {
    return getFixHeader().getMessageType();
  }

}