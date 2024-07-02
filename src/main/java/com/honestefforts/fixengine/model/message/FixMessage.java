package com.honestefforts.fixengine.model.message;

import com.honestefforts.fixengine.model.message.tags.RawTag;
import java.util.Map;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.experimental.SuperBuilder;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@SuperBuilder
public abstract class FixMessage {
  @NonNull
  private final FixHeader fixHeader;

}