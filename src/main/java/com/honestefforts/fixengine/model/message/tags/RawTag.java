package com.honestefforts.fixengine.model.message.tags;

import static com.honestefforts.fixengine.model.validation.FixValidator.EMPTY_OR_NULL_VALUE;

import com.honestefforts.fixengine.model.validation.TagType;
import com.honestefforts.fixengine.model.validation.ValidationError;
import java.util.Optional;
import lombok.Builder;
import lombok.NonNull;

@Builder
public record RawTag(@NonNull Integer tag, String value, @NonNull TagType dataType,
                     String version, Integer position) {

  public boolean isCompliant() {
    return dataType.isCompliant(value);
  }

  public ValidationError errorIfNotCompliant(boolean isCritical) {
    return Optional.ofNullable(value)
        .map(_ -> isCompliant() ? ValidationError.empty()
            : ValidationError.builder().critical(isCritical).submittedTag(this)
                .error("Tag violates expected format!").build())
        .orElse(ValidationError.builder().critical(isCritical).submittedTag(this)
            .error(EMPTY_OR_NULL_VALUE).build());
  }

}