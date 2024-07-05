package com.honestefforts.fixengine.model.message.components;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

/**
 * Definition on <a href="https://www.onixs.biz/fix-dictionary/4.4/compBlock_NestedParties.html">onix</a>
 */
@Getter
@Builder
@FieldDefaults(makeFinal=true, level=AccessLevel. PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class NestedParties {
  /** Tag 539 (NoNestedPartyIDs) */
  Integer numberOfNestedPartyIds;
  /** Tag 524 (NestedPartyID) */
  String nestedPartyId;
  /** Tag 525 (NestedPartyIDSource) */
  Character nestedPartyIdSource;
  /** Tag 538 (NestedPartyRole) */
  Integer nestedPartyRole;
  /** Tag 804 (NoNestedPartySubIDs) */
  Integer numberOfNestedPartySubIds;
  /** Tag 545 (NestedPartySubID) */
  String nestedPartySubId;
  /** Tag 805 (NestedPartySubIDType) */
  Integer nestedPartySubIdType;
}
