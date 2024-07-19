package com.honestefforts.fixengine.model.validation;

import com.honestefforts.fixengine.model.message.tags.RawTag;
import java.util.Map;
import java.util.Optional;

public interface FixValidator {

  String REQUIRED_ERROR_MSG = "Tag is required!";
  String EMPTY_OR_NULL_VALUE = "Tag value is empty!";

  ValidationError validate(RawTag rawTag, Map<String, RawTag> context);

  String supports();

  static ValidationError validateBlankOrNull(RawTag rawTag) {
    return Optional.of(rawTag.value()).filter(val -> !val.isBlank())
        .map(_ -> ValidationError.empty())
        .orElse(ValidationError.builder().submittedTag(rawTag).error(EMPTY_OR_NULL_VALUE).build());
  }

}