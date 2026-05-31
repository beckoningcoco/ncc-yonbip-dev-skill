/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.framework.rsa;

import nc.vo.framework.rsa.DES;

public class Encode {
    private static long key = 1231234234L;

    public static void setKey(long k) {
        key = k;
    }

    public String decode(String s, long k) {
        if (s == null) {
            return null;
        }
        DES des = new DES(k);
        byte[] sBytes = s.getBytes();
        int bytesLength = sBytes.length / 16;
        byte[] byteList = new byte[bytesLength * 8];
        for (int i = 0; i < bytesLength; ++i) {
            byte[] theBytes = new byte[8];
            for (int j = 0; j <= 7; ++j) {
                byte byte1 = (byte)(sBytes[16 * i + 2 * j] - 97);
                byte byte2 = (byte)(sBytes[16 * i + 2 * j + 1] - 97);
                theBytes[j] = (byte)(byte1 * 16 + byte2);
            }
            long x = des.bytes2long(theBytes);
            byte[] result = new byte[8];
            des.long2bytes(des.decrypt(x), result);
            System.arraycopy(result, 0, byteList, i * 8, 8);
        }
        String rtn = new String(this.subArr(byteList));
        return rtn;
    }

    public String decode(String s) {
        return this.decode(s, key);
    }

    public String encode(String s, long k) {
        int i;
        if (s == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        DES des = new DES(k);
        int space = 32;
        byte[] sBytes = s.getBytes();
        int length = sBytes.length;
        int newLength = length + (8 - length % 8) % 8;
        byte[] newBytes = new byte[newLength];
        for (i = 0; i < newLength; ++i) {
            newBytes[i] = i <= length - 1 ? sBytes[i] : space;
        }
        for (i = 0; i < newLength / 8; ++i) {
            byte[] theBytes = new byte[8];
            for (int j = 0; j <= 7; ++j) {
                theBytes[j] = newBytes[8 * i + j];
            }
            long x = des.bytes2long(theBytes);
            byte[] result = new byte[8];
            des.long2bytes(des.encrypt(x), result);
            byte[] doubleResult = new byte[16];
            for (int j = 0; j < 8; ++j) {
                doubleResult[2 * j] = (byte)((((char)result[j] & 0xF0) >> 4) + 97);
                doubleResult[2 * j + 1] = (byte)(((char)result[j] & 0xF) + 97);
            }
            sb.append(new String(doubleResult));
        }
        return sb.toString();
    }

    public String encode(String s) {
        return this.encode(s, key);
    }

    private byte[] subArr(byte[] a) {
        int al = a.length;
        int end = this.checkEnd(a);
        if (end == 0) {
            return a;
        }
        byte[] rtn = new byte[al - end];
        System.arraycopy(a, 0, rtn, 0, al - end);
        return rtn;
    }

    private int checkEnd(byte[] arr) {
        int rtn = 0;
        for (int i = arr.length - 1; i > 0 && arr[i] == 32; --i) {
            ++rtn;
        }
        return rtn;
    }
}

