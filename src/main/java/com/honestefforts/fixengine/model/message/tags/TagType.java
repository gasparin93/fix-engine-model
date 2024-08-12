package com.honestefforts.fixengine.model.message.tags;

import ch.qos.logback.core.util.StringUtil;
import com.honestefforts.fixengine.model.universal.CountryCode;
import com.honestefforts.fixengine.model.universal.Currency;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import lombok.AllArgsConstructor;

//TODO: handle lists

/**
 * Enum to handle type-validation and conversion of tags. Required for every RawTag instance.
 *
 * Note: enums are parsed and returned as Strings. This is because they cannot be cast as (<EnumType>),
 *  they need to be cast as EnumType.valueOf - this can be done on the enum-user side.
 */
@AllArgsConstructor
public enum TagType {
  /** data, string, multipleValueString */
  STRING(StringUtil::notNullNorEmpty),
  /** char */
  CHARACTER(Pattern.compile("^\\w$").asMatchPredicate()),
  /** country */
  COUNTRY(CountryCode::isAValidCountryCode),
  /** currency */
  CURRENCY(Currency::isAValidCurrency),
  /** exchange */
  EXCHANGE(Pattern.compile("^[\\p{Lu}0-9]{3}$").asMatchPredicate()),
  /** boolean */
  BOOLEAN(Pattern.compile("^[YN]$").asMatchPredicate()),
  /** int */
  INTEGER(Pattern.compile("^-?[0-9]+$").asMatchPredicate()),
  /** length, numInGroup, seqNum */
  POSITIVE_INTEGER(Pattern.compile("^[0-9]+$").asMatchPredicate()),
  /** tagNum */
  POSITIVE_INTEGER_NO_LEADING_ZEROES(Pattern.compile("^[1-9][0-9]*$").asMatchPredicate()),
  /** float, percentage, price, qty, amt, priceOffset */
  FLOAT(Pattern.compile("^-?[0-9]+(\\.[0-9]+)?$").asMatchPredicate()),
  /** same as float, but may not be used as strictly, depends on tag */ //TODO: revisit
  POSITIVE_FLOAT(Pattern.compile("^[0-9]+(\\.[0-9]+)?$").asMatchPredicate()),
  /** dayOfMonth */
  DAY_OF_MONTH(Pattern.compile("^[0-3]?[0-9]$").asMatchPredicate()),
  /** localMktDate, utcDateOnly */
  LOCAL_DATE(Pattern.compile("^[1-2][0-9]{3}[0-1][0-9][0-3][0-9]$").asMatchPredicate()), //more strict than FIX requirements
  /** monthYear */
  MONTH_YEAR(Pattern.compile("^[1-2][0-9]{3}[0-1][0-9](w[1-5])?$").asMatchPredicate()), //more strict than FIX requirements
  /** utcTimeOnly */
  TIME(Pattern.compile("^[0-2][0-9]:[0-5][0-9]:[0-6][0-9](\\.[0-9]{1,3})?$").asMatchPredicate()),
  /** utcTimestamp */
  DATE_TIME(Pattern.compile(
      "^[1-2][0-9]{3}[0-1][0-9][0-3][0-9]-[0-2][0-9]:[0-5][0-9]:[0-6][0-9](\\.[0-9]{1,3})?$")
      .asMatchPredicate());

  private final Predicate<String> typeValidationMatch;

  public boolean isCompliant(String tagValue) {
    return typeValidationMatch.test(tagValue);
  }

}
