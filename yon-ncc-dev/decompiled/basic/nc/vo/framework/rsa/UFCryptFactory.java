/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.framework.rsa;

import java.io.IOException;
import nc.vo.framework.rsa.UFCrypt;
import nc.vo.framework.rsa.UFCryptImpl;

public class UFCryptFactory {
    private static final int LONG_TO_BYTE = 8;
    private static final int KEY_TO_BYTE = 8;
    private static final int BYTE_LENGTH = 8;
    private static final String DEFAULT_SEED = "uapCrypt";
    private static final int MOD_NUM = 128;
    private static final int LOW_LENGTH = 128;
    private static final int MIDDLE_LENGTH = 192;
    private static final int HIGH_LENGTH = 256;

    public static UFCrypt creatUFCrypt() throws IOException {
        return UFCryptFactory.creatUFCrypt(SECURITY_LEVEL.LOW);
    }

    public static UFCrypt creatUFCrypt(byte[] key) throws IOException {
        if (key.length % 16 != 0) {
            throw new IOException("key length must be a multiple of 16");
        }
        return new UFCryptImpl(key);
    }

    public static UFCrypt creatUFCrypt(SECURITY_LEVEL securityLevel) throws IOException {
        byte[] key = UFCryptFactory.genKeys(securityLevel, null);
        return new UFCryptImpl(key);
    }

    public static UFCrypt creatUFCrypt(String seed) throws IOException {
        byte[] key = UFCryptFactory.genKeys(SECURITY_LEVEL.LOW, seed);
        return new UFCryptImpl(key);
    }

    public static UFCrypt creatUFCrypt(SECURITY_LEVEL securityLevel, String seed) throws IOException {
        byte[] key = UFCryptFactory.genKeys(securityLevel, seed);
        return new UFCryptImpl(key);
    }

    private static byte[] genKeys(SECURITY_LEVEL securityLevel, String seed) throws IOException {
        int keyLength = SECURITY_LEVEL.LOW == securityLevel ? 128 : (SECURITY_LEVEL.HIGH == securityLevel ? 256 : 192);
        int length = keyLength / 8;
        byte[] key = new byte[length];
        int count = length / 8;
        byte[] tempBytes = new byte[8];
        long tempLong = 0L;
        if (seed == null || seed.equals("")) {
            seed = DEFAULT_SEED;
        }
        long seedLong1 = seed.hashCode();
        long seedLong2 = DEFAULT_SEED.hashCode();
        long index = seedLong1 % 128L;
        for (int i = 0; i < count; ++i) {
            tempLong = (seedLong1 | (seedLong2 << 32) + index) >>> (i + 1) * 2;
            tempBytes = UFCryptFactory.long2bytes(tempLong);
            System.arraycopy(tempBytes, 0, key, i * 8, 8);
        }
        return key;
    }

    private static byte[] long2bytes(long sd) {
        byte[] dd = new byte[8];
        for (int i = 7; i >= 0; --i) {
            dd[i] = (byte)sd;
            sd >>>= 8;
        }
        return dd;
    }

    public static enum SECURITY_LEVEL {
        LOW,
        MIDDLE,
        HIGH;

    }
}

