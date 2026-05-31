/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.framework.rsa;

import java.io.IOException;

public interface UFCrypt {
    public byte[] encrypt(byte[] var1) throws IOException;

    public byte[] decrypt(byte[] var1) throws IOException;

    public String encrypt(String var1) throws IOException;

    public String decrypt(String var1) throws IOException;
}

