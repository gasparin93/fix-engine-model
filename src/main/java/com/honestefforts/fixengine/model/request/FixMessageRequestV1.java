package com.honestefforts.fixengine.model.request;

import java.util.List;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Value
@Builder
@Jacksonized
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class FixMessageRequestV1 {

  @NonNull
  @Builder.Default
  String delimiter = "\\|";

  @NonNull
  List<String> fixMessages;
}
