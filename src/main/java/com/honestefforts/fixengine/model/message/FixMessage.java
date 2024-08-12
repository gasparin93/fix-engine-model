package com.honestefforts.fixengine.model.message;

import com.honestefforts.fixengine.model.message.components.FixHeader;
import com.honestefforts.fixengine.model.message.components.FixTrailer;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder(toBuilder = true)
//@AllArgsConstructor(access = AccessLevel.PRIVATE)
public abstract class FixMessage {
  @NonNull
  private final FixHeader fixHeader;

  @NonNull
  private final FixTrailer fixTrailer;

  public abstract FixMessageBuilder<?, ?> toBuilder();

  public String getMessageType() {
    return getFixHeader().getMessageType();
  }

}