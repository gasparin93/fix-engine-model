package com.honestefforts.fixengine.model.tags;

public enum BeginString {
    VERSION_4_0("4.0", false),
    VERSION_4_1("4.1", false),
    VERSION_4_2("4.2", false),
    VERSION_4_3("4.3", false),
    VERSION_4_4("4.4", true),
    VERSION_5_0("5.0", false);

    public final String version;
    public final boolean supported;

    BeginString(String version, boolean supported) {
        this.version = version;
        this.supported = supported;
    }
}
