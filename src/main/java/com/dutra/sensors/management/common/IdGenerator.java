package com.dutra.sensors.management.common;

import io.hypersistence.tsid.TSID;

public class IdGenerator {

    private IdGenerator() {
    }

    public static TSID generate() {
        return TSID.Factory.getTsid();
    }

}
