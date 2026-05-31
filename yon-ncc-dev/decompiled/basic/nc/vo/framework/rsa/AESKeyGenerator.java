/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.framework.rsa;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.Security;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class AESKeyGenerator {
    private static final byte[] KEY_END = new byte[]{43, 65, 23, 6, -54, -24, -16, 26, 7, 34, -29, -52, -14, 27, 38, 41};
    private static final int AESKEY_LENGTH = 128;
    private static final int KEY_LENGTH = 32;
    private static final int TRANS_KEY_LENGTH = 16;
    private static final byte[] DEFAULT_TRANS_KEY = new byte[]{34, 25, 64, 23, 54, 65, 76, 34, -3, -54, -13, -35, 34, 54, 23};
    public static final String DEFAULT_PROVIDER_NAME = "BC";
    private static final String DEFAUL_WAY = "SHA1PRNG";

    public static byte[] genKey() throws IOException {
        try {
            SecureRandom secureRandom = SecureRandom.getInstance(DEFAUL_WAY);
            SecretKey secretKey = null;
            KeyGenerator kgen = null;
            kgen = Security.getProvider(DEFAULT_PROVIDER_NAME) == null ? KeyGenerator.getInstance("AES") : KeyGenerator.getInstance("AES", DEFAULT_PROVIDER_NAME);
            kgen.init(128, secureRandom);
            secretKey = kgen.generateKey();
            return secretKey.getEncoded();
        }
        catch (NoSuchProviderException e) {
            throw new IOException("gen key error:" + e.getMessage());
        }
        catch (NoSuchAlgorithmException e) {
            throw new IOException(e.getMessage());
        }
    }

    public static byte[] genKey(byte[] transKey) throws IOException {
        SecretKey secretKey = null;
        byte[] key = new byte[16];
        System.arraycopy(transKey, 8, key, 0, 8);
        System.arraycopy(KEY_END, 0, key, 8, 8);
        try {
            SecureRandom secureRandom = SecureRandom.getInstance(DEFAUL_WAY);
            KeyGenerator kgen = null;
            kgen = Security.getProvider(DEFAULT_PROVIDER_NAME) == null ? KeyGenerator.getInstance("AES") : KeyGenerator.getInstance("AES", DEFAULT_PROVIDER_NAME);
            secureRandom.setSeed(key);
            kgen.init(128, secureRandom);
            secretKey = kgen.generateKey();
            return key;
        }
        catch (NoSuchProviderException e) {
            throw new IOException("gen key error:" + e.getMessage());
        }
        catch (NoSuchAlgorithmException e) {
            throw new IOException(e.getMessage());
        }
    }

    public static byte[] genTransKey() {
        String ClientIP = null;
        byte[] transKey = new byte[16];
        try {
            ClientIP = InetAddress.getLocalHost().getHostAddress();
        }
        catch (UnknownHostException unknownHostException) {
            // empty catch block
        }
        if (ClientIP == null || ClientIP.equals("")) {
            ClientIP = "uap:localHost";
        }
        try {
            byte[] srcKey = ClientIP.getBytes("unicode");
            if (srcKey.length > 16) {
                System.arraycopy(srcKey, 0, transKey, 0, 16);
            } else {
                System.arraycopy(srcKey, 0, transKey, 0, srcKey.length);
                for (int i = srcKey.length; i < 16; ++i) {
                    transKey[i] = 0;
                }
            }
            return transKey;
        }
        catch (UnsupportedEncodingException e) {
            return DEFAULT_TRANS_KEY;
        }
    }

    static {
        if (Security.getProvider(DEFAULT_PROVIDER_NAME) == null) {
            try {
                String clsName = "org.bouncycastle.jce.provider.BouncyCastleProvider";
                Object o = Class.forName(clsName).newInstance();
                Security.addProvider((Provider)o);
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }
}

