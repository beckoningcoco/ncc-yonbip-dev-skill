/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.jcom.io.fileparse;

public class FileParseException
extends Exception {
    private String hint;

    public FileParseException() {
    }

    public FileParseException(String s) {
        super(s);
    }

    public String getHint() {
        return this.hint;
    }

    public void setHint(String newHint) {
        this.hint = newHint;
    }
}

