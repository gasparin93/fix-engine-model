package com.honestefforts.fixengine.model.validation;

import com.honestefforts.fixengine.model.message.tags.RawTag;
import java.util.Map;

public interface Validator {
  ValidationError validate(RawTag rawTag, Map<String, RawTag> context);
}
