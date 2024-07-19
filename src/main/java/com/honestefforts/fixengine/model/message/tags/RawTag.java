package com.honestefforts.fixengine.model.message.tags;

import com.honestefforts.fixengine.model.validation.TagType;
import com.honestefforts.fixengine.model.validation.ValidationError;
import lombok.Builder;
import lombok.NonNull;

@Builder
public record RawTag(@NonNull String tag, String value, @NonNull TagType dataType,
                     String version, Integer position) {

  public boolean isCompliant() {
    return dataType.isCompliant(value);
  }

  public ValidationError errorIfNotCompliant(boolean isCritical) {
    return isCompliant() ? ValidationError.builder().critical(isCritical).submittedTag(this)
        .error("Tag violates expected format!").build() : ValidationError.empty();
  }

}