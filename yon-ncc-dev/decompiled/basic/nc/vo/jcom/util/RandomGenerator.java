/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.jcom.util;

import java.security.SecureRandom;

public class RandomGenerator {
    private static SecureRandom sr = new SecureRandom();

    public static byte[] generateRandom(int randomLength) {
        return sr.generateSeed(randomLength);
    }
}

