package com.dutra.sensors.management.common;

import io.hypersistence.tsid.TSID;

public class IdGenerator {

    public static TSID generate() {
        return TSID.Factory.getTsid();
    }

}
