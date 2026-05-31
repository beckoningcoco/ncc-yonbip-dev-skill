/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.framework.rsa;

import java.io.IOException;
import java.io.OutputStream;
import nc.vo.framework.rsa.DES;

public class DESOutputStream
extends OutputStream {
    private DES des = null;
    private OutputStream out;
    private byte[] p = new byte[8];
    private int loc = 0;

    public DESOutputStream(OutputStream outSet, DES desSet) {
        this.des = desSet;
        this.out = outSet;
    }

    @Override
    public void close() throws IOException {
        this.writeOUT();
        this.out.close();
    }

    @Override
    public void flush() throws IOException {
        this.p[this.loc++] = 100;
        if (this.loc == 8) {
            this.writeOUT();
        }
        this.p[this.loc++] = 0;
        this.writeOUT();
    }

    @Override
    public void write(int b) throws IOException {
        if (b == 100) {
            this.p[this.loc++] = (byte)(b & 0xFF);
            if (this.loc == 8) {
                this.writeOUT();
            }
            this.p[this.loc++] = (byte)(b & 0xFF);
        } else {
            this.p[this.loc++] = (byte)(b & 0xFF);
        }
        if (this.loc == 8) {
            this.writeOUT();
            return;
        }
    }

    public void writeOUT() throws IOException {
        if (this.loc < 8) {
            this.p[this.loc++] = 100;
        }
        long l = this.des.encrypt(this.des.bytes2long(this.p));
        this.des.long2bytes(l, this.p);
        this.out.write(this.p);
        this.loc = 0;
        this.out.flush();
    }
}

