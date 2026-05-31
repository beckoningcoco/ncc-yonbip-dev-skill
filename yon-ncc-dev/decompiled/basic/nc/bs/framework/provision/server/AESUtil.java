/*
 * Decompiled with CFR 0.152.
 */
package nc.bs.framework.provision.server;

import nc.vo.framework.rsa.DES;

public class AESUtil {
    private static long key = 1231234234L;

    public static void setKey(long k) {
        key = k;
    }

    public static String decode(String s, long k) {
        if (s == null) {
            return null;
        }
        DES des = new DES(k);
        byte[] sBytes = s.getBytes();
        int bytesLength = sBytes.length / 16;
        byte[] byteList = new byte[bytesLength * 8];
        int i = 0;
        while (i < bytesLength) {
            byte[] theBytes = new byte[8];
            int j = 0;
            while (j <= 7) {
                byte byte1 = (byte)(sBytes[16 * i + 2 * j] - 97);
                byte byte2 = (byte)(sBytes[16 * i + 2 * j + 1] - 97);
                theBytes[j] = (byte)(byte1 * 16 + byte2);
                ++j;
            }
            long x = des.bytes2long(theBytes);
            byte[] result = new byte[8];
            des.long2bytes(des.decrypt(x), result);
            System.arraycopy(result, 0, byteList, i * 8, 8);
            ++i;
        }
        String rtn = new String(AESUtil.subArr(byteList));
        return rtn;
    }

    public static String decrypt(String s) {
        return AESUtil.decode(s, key);
    }

    public static String encode(String s, long k) {
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
        int i = 0;
        while (i < newLength) {
            newBytes[i] = i <= length - 1 ? sBytes[i] : space;
            ++i;
        }
        i = 0;
        while (i < newLength / 8) {
            byte[] theBytes = new byte[8];
            int j = 0;
            while (j <= 7) {
                theBytes[j] = newBytes[8 * i + j];
                ++j;
            }
            long x = des.bytes2long(theBytes);
            byte[] result = new byte[8];
            des.long2bytes(des.encrypt(x), result);
            byte[] doubleResult = new byte[16];
            int j2 = 0;
            while (j2 < 8) {
                doubleResult[2 * j2] = (byte)((((char)result[j2] & 0xF0) >> 4) + 97);
                doubleResult[2 * j2 + 1] = (byte)(((char)result[j2] & 0xF) + 97);
                ++j2;
            }
            sb.append(new String(doubleResult));
            ++i;
        }
        return sb.toString();
    }

    public static String encrypt(String s) {
        return AESUtil.encode(s, key);
    }

    private static byte[] subArr(byte[] a) {
        int al = a.length;
        int end = AESUtil.checkEnd(a);
        if (end == 0) {
            return a;
        }
        byte[] rtn = new byte[al - end];
        System.arraycopy(a, 0, rtn, 0, al - end);
        return rtn;
    }

    private static int checkEnd(byte[] arr) {
        int rtn = 0;
        int i = arr.length - 1;
        while (i > 0) {
            if (arr[i] != 32) break;
            ++rtn;
            --i;
        }
        return rtn;
    }
}

