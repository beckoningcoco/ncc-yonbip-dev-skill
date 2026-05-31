/*
 * Decompiled with CFR 0.152.
 */
package nc.bs.pub.taskcenter;

import java.util.concurrent.atomic.AtomicLong;

public class SimpleIDGenerator {
    private static AtomicLong nowId = new AtomicLong(1000L);

    private SimpleIDGenerator() {
    }

    public static String generate() {
        String name = System.getProperty("nc.server.name");
        if (name != null && !"".equals(name.trim())) {
            return name + "/" + nowId.getAndIncrement();
        }
        return String.valueOf(nowId.getAndIncrement());
    }
}

