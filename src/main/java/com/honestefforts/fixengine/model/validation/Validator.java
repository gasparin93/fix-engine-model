package com.honestefforts.fixengine.model.validation;

import com.honestefforts.fixengine.model.message.tags.RawTag;
import java.util.Map;

public interface Validator {

  public final static String REQUIRED_ERROR_MSG = "Tag is required!";

  ValidationError validate(RawTag rawTag, Map<String, RawTag> context);

}