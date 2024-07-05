package com.honestefforts.fixengine.model.message.components;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Value;
import lombok.experimental.FieldDefaults;

@Getter
@Builder
@FieldDefaults(makeFinal=true, level=AccessLevel. PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class UnderlyingStipulations {
  //TODO: this is an exact copy of Stipulations, remove this class
  /** Tag 887 (NoUnderlyingStips) */
  Integer numberOfUnderlyingStipulations;
  /** Tag 888 (UnderlyingStipType) */
  String underlyingStipulationType;
  /** Tag 889 (UnderlyingStipValue) */
  String underlyingStipulationValue;
}
