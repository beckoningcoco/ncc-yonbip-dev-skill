/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.framework.rsa;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.Security;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import nc.vo.framework.rsa.AES;

public class AESDecode
implements AES {
    public static final String DEFAULT_PROVIDER_NAME = "BC";
    private Cipher cipher;
    private SecretKeySpec key;
    private boolean encrypt = false;

    public AESDecode(byte[] keyBytes) {
        this(keyBytes, true);
    }

    public AESDecode(byte[] keyBytes, boolean noPadding) {
        if (Security.getProvider(DEFAULT_PROVIDER_NAME) == null) {
            try {
                String clsName = "org.bouncycastle.jce.provider.BouncyCastleProvider";
                Object o = Class.forName(clsName).newInstance();
                Security.addProvider((Provider)o);
            }
            catch (Exception clsName) {
                // empty catch block
            }
        }
        try {
            this.key = new SecretKeySpec(keyBytes, "AES");
            try {
                this.cipher = noPadding ? (Security.getProvider(DEFAULT_PROVIDER_NAME) == null ? Cipher.getInstance("AES/ECB/NoPadding") : Cipher.getInstance("AES/ECB/NoPadding", DEFAULT_PROVIDER_NAME)) : (Security.getProvider(DEFAULT_PROVIDER_NAME) == null ? Cipher.getInstance("AES") : Cipher.getInstance("AES", DEFAULT_PROVIDER_NAME));
            }
            catch (NoSuchProviderException e) {
                throw new IOException("get cipher error :no such provider " + e.getMessage());
            }
            catch (NoSuchAlgorithmException e) {
                throw new IOException("get cipher error :no such algorithm " + e.getMessage());
            }
            catch (NoSuchPaddingException e) {
                throw new IOException("get cipher error :no such padding " + e.getMessage());
            }
            try {
                this.cipher.init(2, this.key);
            }
            catch (InvalidKeyException e) {
                throw new IOException("initial cipher error :invalid key " + e.getMessage());
            }
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }

    public void init(byte[] keyBytes) throws IOException {
        try {
            this.cipher.init(2, this.key);
            this.encrypt = false;
        }
        catch (InvalidKeyException e) {
            throw new IOException("initial cipher error :invalid key " + e.getMessage());
        }
    }

    @Override
    public byte[] decrypt(byte[] keyBytes) throws IOException {
        try {
            return this.cipher.doFinal(keyBytes);
        }
        catch (IllegalBlockSizeException e) {
            throw new IOException("decrypt error :illegal block size " + e.getMessage());
        }
        catch (BadPaddingException e) {
            throw new IOException("decrypt error :bad padding " + e.getMessage());
        }
    }

    @Override
    public byte[] encrypt(byte[] content) throws IOException {
        if (!this.encrypt) {
            try {
                this.cipher.init(2, this.key);
            }
            catch (InvalidKeyException e) {
                throw new IOException("initial cipher ENCRYPT_MODE error :invalid key " + e.getMessage());
            }
            this.encrypt = true;
        }
        try {
            return this.cipher.doFinal(content);
        }
        catch (IllegalBlockSizeException e) {
            throw new IOException("encrypt error :illegal block size " + e.getMessage());
        }
        catch (BadPaddingException e) {
            throw new IOException("encrypt error :bad padding " + e.getMessage());
        }
    }
}

