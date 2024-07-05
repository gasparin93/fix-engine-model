package com.honestefforts.fixengine.model.message;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public abstract class FixMessage {
  @NonNull
  private final FixHeader fixHeader;

  public String getMessageType() {
    return getFixHeader().getMessageType();
  }

}