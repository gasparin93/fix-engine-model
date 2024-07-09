package com.honestefforts.fixengine.model.endpoint.request;

import java.util.List;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.Getter;
import lombok.NonNull;
import lombok.experimental.FieldDefaults;
import lombok.extern.jackson.Jacksonized;

@Getter
@Builder
@Jacksonized
@FieldDefaults(makeFinal=true, level=AccessLevel. PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class FixMessageRequestV1 {

  @NonNull
  @Default
  String delimiter = "\\|";

  @NonNull
  @Default
  String version = "4.4";

  @NonNull
  List<String> fixMessages;
}
