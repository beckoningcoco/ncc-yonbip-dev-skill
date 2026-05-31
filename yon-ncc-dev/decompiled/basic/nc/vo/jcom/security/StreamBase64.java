/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.jcom.security;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.util.Hashtable;

public class StreamBase64 {
    private static String padChar = "=";
    private static String[] BaseTable = new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "+", "/"};
    private static Hashtable ht = new Hashtable();

    public static void decode(BufferedInputStream inStream, BufferedOutputStream outStream) throws Exception {
        StreamBase64 base = new StreamBase64();
        base.decode0(inStream, outStream);
    }

    public static void encode(BufferedInputStream inStream, BufferedOutputStream outStream) throws Exception {
        StreamBase64 base = new StreamBase64();
        base.encode0(inStream, outStream);
    }

    private void decodeBytesAndWrite(int[] bytes, BufferedOutputStream out) throws Exception {
        int[] rets = new int[]{0, 0, 0};
        rets[0] = (this.getCode(bytes[0]) & 0x3F) << 2 | this.getCode(bytes[1]) >> 4 & 3;
        out.write(rets[0]);
        if (bytes[2] != 61) {
            rets[1] = (this.getCode(bytes[1]) & 0xF) << 4 | this.getCode(bytes[2]) >> 2 & 0xF;
            out.write(rets[1]);
            if (bytes[3] != 61) {
                rets[2] = (this.getCode(bytes[2]) & 3) << 6 | this.getCode(bytes[3]) & 0x3F;
                out.write(rets[2]);
            }
        }
    }

    private void encodeBytesAndWrite(int[] bytes, BufferedOutputStream out) throws Exception {
        if (bytes[0] != -1) {
            int i0 = bytes[0] >> 2 & 0x3F;
            out.write(BaseTable[i0].getBytes());
            int i1 = 0;
            i1 = bytes[1] != -1 ? (bytes[0] << 6 >> 2 | bytes[1] >> 4) & 0x3F : bytes[0] << 6 >> 2 & 0x3F;
            out.write(BaseTable[i1].getBytes());
            int i2 = 0;
            if (bytes[1] != -1) {
                i2 = bytes[2] != -1 ? (bytes[1] << 4 >> 2 | bytes[2] >> 6) & 0x3F : bytes[1] << 4 >> 2 & 0x3F;
                out.write(BaseTable[i2].getBytes());
            } else {
                out.write(padChar.getBytes());
            }
            if (bytes[2] != -1) {
                int i3 = bytes[2] & 0x3F;
                out.write(BaseTable[i3].getBytes());
            } else {
                out.write(padChar.getBytes());
            }
        }
    }

    protected void decode0(BufferedInputStream srcStream, BufferedOutputStream outStream) throws Exception {
        boolean isend = false;
        do {
            int[] bytes;
            if ((bytes = this.readBytes(srcStream, 4))[0] == -1) {
                isend = true;
                continue;
            }
            this.decodeBytesAndWrite(bytes, outStream);
        } while (!isend);
        outStream.flush();
    }

    protected void encode0(BufferedInputStream srcStream, BufferedOutputStream outStream) throws Exception {
        boolean isend = false;
        do {
            int[] bytes;
            if ((bytes = this.readBytes(srcStream, 3))[0] == -1) {
                isend = true;
                continue;
            }
            this.encodeBytesAndWrite(bytes, outStream);
        } while (!isend);
        outStream.flush();
    }

    private int getCode(int s) {
        return (Integer)ht.get(new String(new byte[]{(byte)s}));
    }

    private int[] readBytes(BufferedInputStream in, int num) throws IOException {
        int[] ret = new int[num];
        for (int i = 0; i < num; ++i) {
            ret[i] = in.read();
        }
        return ret;
    }

    static {
        for (int i = 0; i < BaseTable.length; ++i) {
            ht.put(BaseTable[i], i);
        }
    }
}

