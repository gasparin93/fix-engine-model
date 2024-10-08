package com.honestefforts.fixengine.model.converter;

import com.honestefforts.fixengine.model.message.FixMessage;
import com.honestefforts.fixengine.model.message.FixMessageContext;
import com.honestefforts.fixengine.model.message.enums.MessageType;

public interface FixConverter<T extends FixMessage> {
  T convert(FixMessageContext context);
  MessageType supports();
}
