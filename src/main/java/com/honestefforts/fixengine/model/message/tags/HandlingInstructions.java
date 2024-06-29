package com.honestefforts.fixengine.model.message.tags;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum HandlingInstructions {
  AUTOMATED_PRIVATE("1", "Automated execution order, private, no Broker intervention"),
  AUTOMATED_PUBLIC("2", "Automated execution order, public, Broker intervention OK"),
  MANUAL("3", "Manual order, best execution");

  private final String tag;
  private final String description;
}
