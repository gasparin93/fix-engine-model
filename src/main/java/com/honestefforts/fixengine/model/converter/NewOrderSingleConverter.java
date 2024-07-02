package com.honestefforts.fixengine.model.converter;

import com.honestefforts.fixengine.model.message.NewOrderSingle;
import com.honestefforts.fixengine.model.message.tags.RawTag;
import java.util.Map;

public class NewOrderSingleConverter {
  public static NewOrderSingle convert(Map<String, RawTag> tagMap) {
    return NewOrderSingle.builder().build();
  }
}
