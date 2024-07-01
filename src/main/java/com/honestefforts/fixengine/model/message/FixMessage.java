package com.honestefforts.fixengine.model.message;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.experimental.SuperBuilder;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@SuperBuilder
public abstract class FixMessage<T extends FixMessage<T>> implements FixObject<T> {
  @NonNull
  private final FixHeader fixHeader;
}