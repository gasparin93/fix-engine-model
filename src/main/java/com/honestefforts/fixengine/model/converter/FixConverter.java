package com.honestefforts.fixengine.model.converter;

import com.honestefforts.fixengine.model.message.FixMessage;
import com.honestefforts.fixengine.model.message.FixMessageContext;

public interface FixConverter<T extends FixMessage> {
  T convert(FixMessageContext context);
  String supports();
}
