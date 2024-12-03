package com.honestefforts.fixengine.model.endpoint.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.honestefforts.fixengine.model.message.FixMessage;
import com.honestefforts.fixengine.model.validation.ValidationError;
import java.util.Collection;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.jackson.Jacksonized;

@Getter
@Builder
@Jacksonized
@JsonInclude(Include.NON_NULL)
@FieldDefaults(makeFinal=true, level=AccessLevel. PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
public class FixMessageResponseV1 {

  @Default
  FixMessage response = null;

  Collection<ValidationError> errors = null;
}