/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.jcom.xml;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Writer;

public class HtmlPrintWriter
extends PrintWriter {
    public HtmlPrintWriter(OutputStream out) {
        super(out);
    }

    public HtmlPrintWriter(OutputStream out, boolean autoFlush) {
        super(out, autoFlush);
    }

    public HtmlPrintWriter(Writer out) {
        super(out);
    }

    public HtmlPrintWriter(Writer out, boolean autoFlush) {
        super(out, autoFlush);
    }

    @Override
    public void print(String pr) {
        if (pr == null) {
            super.print(pr);
            return;
        }
        char[] ca = pr.toCharArray();
        this.writeExchangeChar(ca);
    }

    @Override
    public void println() {
        super.print("<br>");
    }

    @Override
    public void println(String str) {
        if (str == null) {
            super.write("");
            return;
        }
        char[] ca = str.toCharArray();
        this.writeExchangeChar(ca);
        super.print("<br>");
    }

    private void writeExchangeChar(char[] ca) {
        block7: for (int i = 0; i < ca.length; ++i) {
            switch (ca[i]) {
                case '<': {
                    super.print("&lt;");
                    continue block7;
                }
                case '&': {
                    super.print("&amp;");
                    continue block7;
                }
                case '\n': {
                    super.print("<br>");
                    continue block7;
                }
                case '>': {
                    super.print("&gt;");
                    continue block7;
                }
                case '\t': {
                    super.print("&nbsp;&nbsp;");
                    continue block7;
                }
                default: {
                    super.write(ca[i]);
                }
            }
        }
    }
}

