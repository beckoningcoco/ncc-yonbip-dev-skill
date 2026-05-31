/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.pub.format;

import java.awt.Color;

public class FormatResult {
    private String value = null;
    private Color color = Color.BLACK;

    public FormatResult() {
    }

    public FormatResult(String value) {
        this.value = value;
    }

    public FormatResult(String value, Color color) {
        this.value = value;
        this.color = color;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Color getColor() {
        return this.color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}

