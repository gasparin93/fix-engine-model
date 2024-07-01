package com.honestefforts.fixengine.model.validation;

import com.honestefforts.fixengine.model.message.tags.RawTag;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;

@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ValidationError {

  private final String error;
  private final RawTag submittedTag;
  @Builder.Default
  private final boolean critical = false;
  private boolean empty = false;

  public boolean isEmpty() {
    return empty;
  }

  public static ValidationError empty() {
    return new ValidationError(null, null, false, true);
  }

}
