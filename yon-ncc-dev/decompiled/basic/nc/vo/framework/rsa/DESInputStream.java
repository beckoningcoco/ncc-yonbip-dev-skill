/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.framework.rsa;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import nc.vo.framework.rsa.DES;

public class DESInputStream
extends InputStream {
    private DES des = null;
    private byte[] p = new byte[8];
    private InputStream in;
    private int loc = 9;
    public static final byte ENDEDCODE = 100;
    private boolean changMeaning = false;
    private boolean inBlock = false;

    public DESInputStream(InputStream inSet, DES desSet) {
        this.des = desSet;
        this.in = inSet;
    }

    @Override
    public void close() throws IOException {
        super.close();
        this.in.close();
    }

    @Override
    public int read() throws IOException {
        while (true) {
            if (this.loc >= 8) {
                int len = this.in.read(this.p);
                if (len == -1) {
                    throw new EOFException("The end of the file.");
                }
                while (len < 8) {
                    this.p[len] = (byte)this.in.read();
                    ++len;
                }
                long s = this.des.bytes2long(this.p);
                long l = this.des.decrypt(s);
                this.des.long2bytes(l, this.p);
                this.loc = 0;
            }
            if (this.changMeaning) {
                this.changMeaning = false;
                if (this.p[this.loc] != 0) break;
                this.loc = 8;
                if (!this.inBlock) continue;
                throw new IOException("END OF THIS BLOCK");
            }
            if (this.p[this.loc] != 100) break;
            this.changMeaning = true;
            ++this.loc;
        }
        byte pb = this.p[this.loc++];
        int pi = pb & 0xFF;
        return pi;
    }

    @Override
    public int read(byte[] b) throws IOException {
        return this.read(b, 0, b.length);
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int i;
        if (len <= 0) {
            return 0;
        }
        int c = this.read();
        if (c == -1) {
            return -1;
        }
        this.inBlock = true;
        b[off] = (byte)c;
        try {
            for (i = 1; i < len && (c = this.read()) != -1; ++i) {
                if (b == null) continue;
                b[off + i] = (byte)c;
            }
        }
        catch (IOException iOException) {
            // empty catch block
        }
        this.inBlock = false;
        return i;
    }
}

