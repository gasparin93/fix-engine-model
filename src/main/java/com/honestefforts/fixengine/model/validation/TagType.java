package com.honestefforts.fixengine.model.validation;

import com.honestefforts.fixengine.model.universal.CountryCode;
import com.honestefforts.fixengine.model.universal.Currency;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum TagType {
  /** data, string, multipleValueString */
  STRING(Objects::nonNull),
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
  /** float, percentage, price, qty, priceOffset */
  FLOAT(Pattern.compile("^-?[0-9]+(\\.[0-9]+)?$").asMatchPredicate()),
  /** same as gloat, but may not be used as strictly, depends on tag */ //TODO: revisit
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
