package com.honestefforts.fixengine.model.message;

import com.honestefforts.fixengine.model.message.tags.RawTag;
import java.util.Map;
import java.util.Optional;
import lombok.Builder;

@Builder
public record FixMessageContext(Map<String, RawTag> processedMessages, int messageLength,
                                String messageType) {

  public boolean hasTag(String tag) {
    return Optional.ofNullable(processedMessages.get(tag))
        .map(rawTag -> rawTag.value() != null)
        .orElse(false);
  }

  public String getValueForTag(String tag) {
    return Optional.ofNullable(processedMessages.get(tag))
        .map(RawTag::value)
        .orElse(null);
  }

}
