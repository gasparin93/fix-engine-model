package com.honestefforts.fixengine.model.converter;

import com.honestefforts.fixengine.model.message.FixMessage;
import com.honestefforts.fixengine.model.message.tags.RawTag;
import java.util.Map;

public interface FixConverter<T extends FixMessage> {
  T convert(Map<String, RawTag> tagMap);
  String supports();
}
