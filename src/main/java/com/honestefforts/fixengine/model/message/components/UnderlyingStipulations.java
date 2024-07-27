package com.honestefforts.fixengine.model.message.components;

import java.util.List;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

/**
 * Definition on <a href="https://www.onixs.biz/fix-dictionary/4.4/compBlock_UnderlyingStipulations.html">onix</a>
 */
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

  @Getter
  private static final List<Integer> supportedTags = List.of(887,888,889);

}
