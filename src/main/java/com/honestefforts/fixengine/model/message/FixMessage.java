package com.honestefforts.fixengine.model.message;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

@AllArgsConstructor
@Getter
@SuperBuilder
public abstract class FixMessage {
  private final FixHeader fixHeader;
}
