/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.framework.rsa;

import java.io.IOException;
import nc.vo.framework.rsa.AESDecode;
import nc.vo.framework.rsa.AESEncode;
import nc.vo.framework.rsa.UFCrypt;

class UFCryptImpl
implements UFCrypt {
    private AESEncode encode;
    private AESDecode decode;

    public UFCryptImpl(byte[] key) {
        this.encode = new AESEncode(key, false);
        this.decode = new AESDecode(key, false);
    }

    @Override
    public byte[] encrypt(byte[] content) throws IOException {
        return this.encode.encrypt(content);
    }

    @Override
    public byte[] decrypt(byte[] content) throws IOException {
        return this.decode.decrypt(content);
    }

    @Override
    public String encrypt(String content) throws IOException {
        if (content == null) {
            return null;
        }
        String res = "";
        byte[] src = content.getBytes();
        byte[] result = this.encrypt(src);
        int length = result.length;
        for (int i = 0; i < length / 16; ++i) {
            byte[] theBytes = new byte[16];
            for (int j = 0; j <= 15; ++j) {
                theBytes[j] = result[16 * i + j];
            }
            byte[] doubleResult = new byte[32];
            for (int j = 0; j < 16; ++j) {
                doubleResult[2 * j] = (byte)((((char)theBytes[j] & 0xF0) >> 4) + 97);
                doubleResult[2 * j + 1] = (byte)(((char)theBytes[j] & 0xF) + 97);
            }
            res = res + new String(doubleResult);
        }
        return res;
    }

    @Override
    public String decrypt(String content) throws IOException {
        if (content == null) {
            return null;
        }
        String res = "";
        byte[] src = content.getBytes();
        int length = src.length;
        byte[] theBytes = new byte[length / 2];
        for (int i = 0; i < length / 32; ++i) {
            for (int j = 0; j <= 15; ++j) {
                byte byte1 = (byte)(src[32 * i + 2 * j] - 97);
                byte byte2 = (byte)(src[32 * i + 2 * j + 1] - 97);
                theBytes[16 * i + j] = (byte)(byte1 * 16 + byte2);
            }
        }
        res = new String(this.decrypt(theBytes));
        return res.trim();
    }
}

