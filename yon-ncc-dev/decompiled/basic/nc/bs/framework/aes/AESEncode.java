/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.RuntimeEnv
 *  nc.bs.logging.Logger
 *  org.apache.commons.crypto.cipher.CryptoCipher
 *  org.apache.commons.crypto.utils.Utils
 *  org.bouncycastle.jce.provider.BouncyCastleProvider
 */
package nc.bs.framework.aes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.security.Provider;
import java.security.Security;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Properties;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import nc.bs.framework.aes.AESGeneratorKey;
import nc.bs.framework.common.RuntimeEnv;
import nc.bs.logging.Logger;
import nc.vo.framework.rsa.Encode;
import org.apache.commons.crypto.cipher.CryptoCipher;
import org.apache.commons.crypto.utils.Utils;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

public class AESEncode {
    static final IvParameterSpec iv = new IvParameterSpec(AESEncode.getUTF8Bytes("1234567890123456"));
    static final String transform = "AES/CBC/PKCS5Padding";
    private static final String FLAY = "#";
    private static String KEY = null;

    public static String encrypt(String data) {
        return FLAY + AESEncode.aesEncode(data);
    }

    public static String decrypt(String data) {
        if (data.substring(0, 1).equals(FLAY)) {
            data = data.substring(1);
            return AESEncode.aesDecode(data);
        }
        return new Encode().decode(data);
    }

    public static String aesEncode(String text) {
        Properties properties = new Properties();
        int bufferSize = 1024;
        String encodedString = null;
        Security.addProvider((Provider)new BouncyCastleProvider());
        try (CryptoCipher encipher = Utils.getCipherInstance((String)transform, (Properties)properties);){
            ByteBuffer inBuffer = ByteBuffer.allocateDirect(1024);
            ByteBuffer outBuffer = ByteBuffer.allocateDirect(1024);
            inBuffer.put(AESEncode.getUTF8Bytes(text));
            inBuffer.flip();
            SecretKeySpec keySpec = null;
            if (AESEncode.query() != null) {
                keySpec = new SecretKeySpec(AESEncode.parseHexStr2Byte(AESEncode.query()), "AES");
            } else {
                byte[] keysecByte = AESGeneratorKey.genBindIpKey();
                AESEncode.insert(AESEncode.parseByte2HexStr(keysecByte));
                keySpec = new SecretKeySpec(keysecByte, "AES");
            }
            encipher.init(1, (Key)keySpec, (AlgorithmParameterSpec)iv);
            int updateBytes = encipher.update(inBuffer, outBuffer);
            int finalBytes = encipher.doFinal(inBuffer, outBuffer);
            outBuffer.flip();
            byte[] encoded = new byte[updateBytes + finalBytes];
            outBuffer.duplicate().get(encoded);
            encodedString = AESEncode.parseByte2HexStr(encoded);
        }
        catch (Exception exception) {
            // empty catch block
        }
        return encodedString;
    }

    public static String aesDecode(String encodedString) {
        Security.addProvider((Provider)new BouncyCastleProvider());
        Properties properties = new Properties();
        int bufferSize = 1024;
        ByteBuffer decoded = ByteBuffer.allocateDirect(1024);
        try (CryptoCipher decipher = Utils.getCipherInstance((String)transform, (Properties)properties);){
            SecretKeySpec keySpec = null;
            if (AESEncode.query() != null) {
                keySpec = new SecretKeySpec(AESEncode.parseHexStr2Byte(AESEncode.query()), "AES");
            } else {
                byte[] keysecByte = AESGeneratorKey.genBindIpKey();
                AESEncode.insert(AESEncode.parseByte2HexStr(keysecByte));
                keySpec = new SecretKeySpec(keysecByte, "AES");
            }
            decipher.init(2, (Key)keySpec, (AlgorithmParameterSpec)iv);
            ByteBuffer outBuffer = ByteBuffer.allocateDirect(1024);
            outBuffer.put(AESEncode.parseHexStr2Byte(encodedString));
            outBuffer.flip();
            decipher.update(outBuffer, decoded);
            decipher.doFinal(outBuffer, decoded);
            decoded.flip();
        }
        catch (Throwable e) {
            Logger.error((Object)e);
            return null;
        }
        return AESEncode.asString(decoded);
    }

    public static String parseByte2HexStr(byte[] buf) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < buf.length; ++i) {
            String hex = Integer.toHexString(buf[i] & 0xFF);
            if (hex.length() == 1) {
                hex = '0' + hex;
            }
            sb.append(hex.toUpperCase());
        }
        return sb.toString();
    }

    public static byte[] parseHexStr2Byte(String hexStr) {
        if (hexStr.length() < 1) {
            return null;
        }
        byte[] result = new byte[hexStr.length() / 2];
        for (int i = 0; i < hexStr.length() / 2; ++i) {
            int high = Integer.parseInt(hexStr.substring(i * 2, i * 2 + 1), 16);
            int low = Integer.parseInt(hexStr.substring(i * 2 + 1, i * 2 + 2), 16);
            result[i] = (byte)(high * 16 + low);
        }
        return result;
    }

    private static byte[] getUTF8Bytes(String input) {
        return input.getBytes(StandardCharsets.UTF_8);
    }

    private static String asString(ByteBuffer buffer) {
        ByteBuffer copy = buffer.duplicate();
        byte[] bytes = new byte[copy.remaining()];
        copy.get(bytes);
        return new String(bytes, StandardCharsets.UTF_8);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static String query() {
        if (KEY != null) {
            return KEY;
        }
        String ncHome = RuntimeEnv.getInstance().getNCHome();
        if (ncHome.contains("bin")) {
            ncHome = ncHome.split("bin")[0];
            ncHome = ncHome.substring(0, ncHome.length() - 1);
        }
        Properties properties = new Properties();
        File propFile = new File(ncHome, "/ierp/bin/key.properties");
        FileInputStream fileStream = null;
        if (propFile.exists()) {
            try {
                fileStream = new FileInputStream(propFile);
                properties.load(fileStream);
                KEY = properties.get("secret_key").toString();
            }
            catch (Exception e) {
                Logger.error((Object)"Query the secret_key properties error!", (Throwable)e);
            }
            finally {
                try {
                    if (fileStream != null) {
                        fileStream.close();
                    }
                }
                catch (IOException e) {
                    Logger.error((Object)"close io exception ", (Throwable)e);
                }
            }
        }
        return KEY;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void insert(String secret_key) {
        String ncHome = RuntimeEnv.getInstance().getNCHome();
        if (ncHome.contains("bin")) {
            ncHome = ncHome.split("bin")[0];
            ncHome = ncHome.substring(0, ncHome.length() - 1);
        }
        File propFile = new File(ncHome, "/ierp/bin/key.properties");
        Properties properties = new Properties();
        properties.setProperty("secret_key", secret_key);
        FileOutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream(propFile);
            properties.store(outputStream, null);
            KEY = secret_key;
        }
        catch (Exception e) {
            Logger.error((Object)"Write the secret_key properties error!", (Throwable)e);
        }
        finally {
            if (outputStream != null) {
                try {
                    outputStream.close();
                }
                catch (IOException e) {
                    Logger.error((Object)"close io exception ", (Throwable)e);
                }
            }
        }
    }
}

