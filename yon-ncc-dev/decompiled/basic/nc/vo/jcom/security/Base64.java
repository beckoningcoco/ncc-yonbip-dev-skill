/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.jcom.security;

public class Base64 {
    private static final int fillchar = 61;
    private static final String cvt = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";

    public static String encode(String data) {
        if (data == null) {
            return null;
        }
        return Base64.getString(Base64.encode(Base64.getBinaryBytes(data)));
    }

    public static byte[] encode(byte[] data) {
        if (null == data) {
            return null;
        }
        int len = data.length;
        StringBuffer ret = new StringBuffer((len / 3 + 1) * 4);
        for (int i = 0; i < len; ++i) {
            int c = data[i] >> 2 & 0x3F;
            ret.append(cvt.charAt(c));
            c = data[i] << 4 & 0x3F;
            if (++i < len) {
                c |= data[i] >> 4 & 0xF;
            }
            ret.append(cvt.charAt(c));
            if (i < len) {
                c = data[i] << 2 & 0x3F;
                if (++i < len) {
                    c |= data[i] >> 6 & 3;
                }
                ret.append(cvt.charAt(c));
            } else {
                ++i;
                ret.append('=');
            }
            if (i < len) {
                c = data[i] & 0x3F;
                ret.append(cvt.charAt(c));
                continue;
            }
            ret.append('=');
        }
        return Base64.getBinaryBytes(ret.toString());
    }

    public static String decode(String data) {
        if (data == null) {
            return null;
        }
        return Base64.getString(Base64.decode(Base64.getBinaryBytes(data)));
    }

    public static byte[] decode(byte[] data) {
        if (null == data) {
            return null;
        }
        int len = data.length;
        StringBuffer ret = new StringBuffer(len * 3 / 4);
        for (int i = 0; i < len; ++i) {
            int c = cvt.indexOf(data[i]);
            int c1 = cvt.indexOf(data[++i]);
            c = c << 2 | c1 >> 4 & 3;
            ret.append((char)c);
            if (++i < len) {
                c = data[i];
                if (61 == c) break;
                c = cvt.indexOf((char)c);
                c1 = c1 << 4 & 0xF0 | c >> 2 & 0xF;
                ret.append((char)c1);
            }
            if (++i >= len) continue;
            c1 = data[i];
            if (61 == c1) break;
            c1 = cvt.indexOf((char)c1);
            c = c << 6 & 0xC0 | c1;
            ret.append((char)c);
        }
        return Base64.getBinaryBytes(ret.toString());
    }

    public static String getString(byte[] arr) {
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < arr.length; ++i) {
            buf.append((char)arr[i]);
        }
        return buf.toString();
    }

    private static byte[] getBinaryBytes(String str) {
        byte[] b = new byte[str.length()];
        for (int i = 0; i < b.length; ++i) {
            b[i] = (byte)str.charAt(i);
        }
        return b;
    }
}

