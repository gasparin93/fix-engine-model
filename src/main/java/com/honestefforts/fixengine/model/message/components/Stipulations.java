package com.honestefforts.fixengine.model.message.components;

import java.util.List;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

/**
 * Definition on <a href="https://www.onixs.biz/fix-dictionary/4.4/compBlock_Stipulations.html">onix</a>
 */
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

  @Getter
  private static final List<Integer> supportedTags = List.of(232,233,234);

}
