package com.honestefforts.fixengine.model.message.tags;

import lombok.Builder;

@Builder
public record RawTag(String tag, String value, String version, int position) {}