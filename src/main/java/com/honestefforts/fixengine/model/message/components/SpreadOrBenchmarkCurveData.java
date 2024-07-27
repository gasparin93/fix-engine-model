package com.honestefforts.fixengine.model.message.components;

import com.honestefforts.fixengine.model.universal.Currency;
import java.util.List;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

/**
 * Definition on <a href="https://www.onixs.biz/fix-dictionary/4.4/compBlock_SpreadOrBenchmarkCurveData.html">onix</a>
 */
@Getter
@Builder
@FieldDefaults(makeFinal=true, level=AccessLevel. PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class SpreadOrBenchmarkCurveData {
  /** Tag 218	(Spread) */
  Double spread;
  /** Tag 220 (BenchmarkCurveCurrency) */
  Currency benchmarkCurveCurrency;
  /** Tag 221 (BenchmarkCurveName) */
  String benchmarkCurveName;
  /** Tag 222 (BenchmarkCurvePoint) */
  String benchmarkCurvePoint;
  /** Tag 662 (BenchmarkPrice) */
  Double benchmarkPrice;
  /** Tag 663 (BenchmarkPriceType) */
  Integer benchmarkPriceType;
  /** Tag 699 (BenchmarkSecurityID) */
  String benchmarkSecurityId;
  /** Tag 761 (BenchmarkSecurityIDSource) */
  String benchmarkSecurityIdSource;

  @Getter
  private static final List<Integer> supportedTags = List.of(218,220,221,222,662,663,699,761);

}
