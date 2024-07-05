package com.honestefforts.fixengine.model.endpoint.response;

import com.honestefforts.fixengine.model.message.FixMessage;
import com.honestefforts.fixengine.model.validation.ValidationError;
import java.util.Collection;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.experimental.FieldDefaults;
import lombok.extern.jackson.Jacksonized;

@Getter
@Builder
@Jacksonized
@FieldDefaults(makeFinal=true, level=AccessLevel. PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class FixMessageResponseV1 {

  @NonNull
  FixMessage response;

  Collection<ValidationError> errors;
}