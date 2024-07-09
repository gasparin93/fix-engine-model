package com.honestefforts.fixengine.model.validation;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.honestefforts.fixengine.model.message.tags.RawTag;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.Getter;

@Builder
@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ValidationError {

  private final String error;
  private final RawTag submittedTag;
  @Default
  private final boolean critical = false;
  @JsonIgnore
  @Default
  private transient final boolean empty = false;

  public boolean hasErrors() {
    return !empty;
  }

  public boolean isCritical() {
    return this.critical;
  }

  public static ValidationError empty() {
    return new ValidationError(null, null, false, true);
  }

}
