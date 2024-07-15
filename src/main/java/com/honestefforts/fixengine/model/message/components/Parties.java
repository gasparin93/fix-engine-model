package com.honestefforts.fixengine.model.message.components;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

/**
 * Definition on <a href="https://www.onixs.biz/fix-dictionary/4.4/compBlock_Parties.html">onix</a>
 */
//TODO: NestedParties is the same thing, reduce to one class
@Getter
@Builder
@FieldDefaults(makeFinal=true, level=AccessLevel. PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Parties {
  /** Tag 453 (NoPartyIDs) */
  Integer numberOfPartyIds;
  /** Tag 448 (PartyID) */
  String partyId;
  /** Tag 447 (PartyIDSource) */
  Character partyIdSource;
  /** Tag 452 (PartyRole) */
  Integer partyRole;
  /** Tag 802 (NoPartySubIDs) */
  Integer numberOfPartySubIds;
  /** Tag 523 (PartySubID) */
  String partySubId;
  /** Tag 803 (PartySubIDType) */
  Integer partySubIdType;
}
