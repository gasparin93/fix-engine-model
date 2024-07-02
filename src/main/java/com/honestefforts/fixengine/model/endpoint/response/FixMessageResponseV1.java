package com.honestefforts.fixengine.model.endpoint.response;

import com.honestefforts.fixengine.model.message.FixMessage;
import com.honestefforts.fixengine.model.validation.ValidationError;
import java.util.Collection;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Value
@Builder
@Jacksonized
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class FixMessageResponseV1 {

  @NonNull
  FixMessage response;

  Collection<ValidationError> errors;
}