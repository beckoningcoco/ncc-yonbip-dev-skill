/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.framework.rsa;

import java.io.IOException;

public interface AES {
    public byte[] encrypt(byte[] var1) throws IOException;

    public byte[] decrypt(byte[] var1) throws IOException;
}

