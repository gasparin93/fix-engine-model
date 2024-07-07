package com.honestefforts.fixengine.model.message.tags;

import com.honestefforts.fixengine.model.validation.TagType;
import lombok.Builder;
import lombok.NonNull;

@Builder
public record RawTag(@NonNull String tag, @NonNull String value, @NonNull TagType dataType,
                     String version, int position) {}