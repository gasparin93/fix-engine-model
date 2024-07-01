package com.honestefforts.fixengine.model.message;

import com.honestefforts.fixengine.model.message.tags.RawTag;
import java.util.Map;
import lombok.NonNull;

public interface FixObject<T extends FixObject<T>> {
  T fromMapOfTags(@NonNull final Map<String, RawTag> mapOfTags);
}