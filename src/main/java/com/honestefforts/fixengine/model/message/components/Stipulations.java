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
public class Stipulations {
  /** Tag 232 (NoStipulations) */
  Integer numberOfStipulations;
  /** Tag 233 (StipulationType) */
  String stipulationType;
  /** Tag 234 (StipulationValue) */
  String stipulationValue;
}
