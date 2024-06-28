package com.honestefforts.fixengine.model.message;

import lombok.NonNull;

public interface FixMessage {
  @NonNull
  FixHeader fixHeader = null;
}
