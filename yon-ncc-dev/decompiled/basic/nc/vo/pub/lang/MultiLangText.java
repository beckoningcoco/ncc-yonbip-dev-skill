/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.logging.Logger
 */
package nc.vo.pub.lang;

import java.io.Serializable;
import java.lang.reflect.Method;
import nc.bs.logging.Logger;
import nc.vo.jcom.lang.StringUtil;

public class MultiLangText
implements Comparable<MultiLangText>,
Serializable,
Cloneable {
    private static final long serialVersionUID = -7822831748045371831L;
    private String text = null;
    private String text2 = null;
    private String text3 = null;
    private String text4 = null;
    private String text5 = null;
    private String text6 = null;
    private static Method getInstance = null;
    private static Method getCurrentLangSeq = null;
    private static Class<?> cl = null;

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText2() {
        return this.text2;
    }

    public void setText2(String text2) {
        this.text2 = text2;
    }

    public String getText3() {
        return this.text3;
    }

    public void setText3(String text3) {
        this.text3 = text3;
    }

    public String getText4() {
        return this.text4;
    }

    public void setText4(String text4) {
        this.text4 = text4;
    }

    public String getText5() {
        return this.text5;
    }

    public void setText5(String text5) {
        this.text5 = text5;
    }

    public String getText6() {
        return this.text6;
    }

    public void setText6(String text6) {
        this.text6 = text6;
    }

    public String toString() {
        String text = this.getText(this.getCurrLangIndex());
        if (text == null) {
            text = this.getText(0);
        }
        return text;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public int getCurrLangIndex() {
        int langIndex = 0;
        try {
            if (cl == null) {
                Class<MultiLangText> clazz = MultiLangText.class;
                // MONITORENTER : nc.vo.pub.lang.MultiLangText.class
                if (cl == null) {
                    cl = Class.forName("nc.vo.ml.MultiLangContext");
                    getInstance = cl.getMethod("getInstance", null);
                    getCurrentLangSeq = cl.getMethod("getCurrentLangSeq", null);
                }
                // MONITOREXIT : clazz
            }
            Object multiLangContextInstance = getInstance.invoke(cl, null);
            Integer langSeq = (Integer)getCurrentLangSeq.invoke(multiLangContextInstance, null);
            langIndex = langSeq - 1;
        }
        catch (Exception e) {
            Logger.error((Object)e);
        }
        if (langIndex < 0) return 0;
        if (langIndex <= 5) return langIndex;
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof MultiLangText)) {
            return false;
        }
        MultiLangText mtObj = (MultiLangText)obj;
        return this.isEqual(this.getText(), mtObj.getText()) && this.isEqual(this.getText2(), mtObj.getText2()) && this.isEqual(this.getText3(), mtObj.getText3()) && this.isEqual(this.getText4(), mtObj.getText4()) && this.isEqual(this.getText5(), mtObj.getText5()) && this.isEqual(this.getText6(), mtObj.getText6());
    }

    public int hashCode() {
        if (this.getText() == null && this.getText2() == null && this.getText3() == null && this.getText4() == null && this.getText5() == null && this.getText6() == null) {
            return super.hashCode();
        }
        int hashcode = this.getText() == null ? 0 : this.getText().hashCode();
        int hashcode2 = this.getText2() == null ? 0 : this.getText2().hashCode();
        int hashcode3 = this.getText3() == null ? 0 : this.getText3().hashCode();
        int hashcode4 = this.getText4() == null ? 0 : this.getText4().hashCode();
        int hashcode5 = this.getText5() == null ? 0 : this.getText5().hashCode();
        int hashcode6 = this.getText6() == null ? 0 : this.getText6().hashCode();
        return hashcode + hashcode2 + hashcode3 + hashcode4 + hashcode5 + hashcode6;
    }

    private boolean isEqual(String str1, String str2) {
        if (str1 == null && str2 == null) {
            return true;
        }
        if (str1 == null && str2 != null) {
            return false;
        }
        return str1.equals(str2);
    }

    @Override
    public int compareTo(MultiLangText o) {
        if (o == null) {
            return 1;
        }
        int value = StringUtil.compare(this.getText(), o.getText());
        if (value != 0) {
            return value;
        }
        int value2 = StringUtil.compare(this.getText2(), o.getText2());
        if (value2 != 0) {
            return value2;
        }
        int value3 = StringUtil.compare(this.getText3(), o.getText3());
        if (value3 != 0) {
            return value3;
        }
        int value4 = StringUtil.compare(this.getText4(), o.getText4());
        if (value4 != 0) {
            return value4;
        }
        int value5 = StringUtil.compare(this.getText5(), o.getText5());
        if (value5 != 0) {
            return value5;
        }
        int value6 = StringUtil.compare(this.getText6(), o.getText6());
        if (value6 != 0) {
            return value6;
        }
        return 0;
    }

    public String getText(int index) {
        if (index == 0) {
            return this.getText();
        }
        if (index == 1) {
            return this.getText2();
        }
        if (index == 2) {
            return this.getText3();
        }
        if (index == 3) {
            return this.getText4();
        }
        if (index == 4) {
            return this.getText5();
        }
        if (index == 5) {
            return this.getText6();
        }
        return this.getText();
    }

    public void setText(int index, String text) {
        if (index == 0) {
            this.setText(text);
        } else if (index == 1) {
            this.setText2(text);
        } else if (index == 2) {
            this.setText3(text);
        } else if (index == 3) {
            this.setText4(text);
        } else if (index == 4) {
            this.setText5(text);
        } else if (index == 5) {
            this.setText6(text);
        }
    }

    public Object clone() {
        Object o = null;
        try {
            o = super.clone();
        }
        catch (CloneNotSupportedException e) {
            throw new RuntimeException("clone not supported!");
        }
        return o;
    }
}

