/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.pub.util;

import java.util.Vector;

public class StringOperator {
    private byte[] info = new byte[0];

    public StringOperator() {
    }

    public StringOperator(byte[] strByte) {
        this.info = strByte;
    }

    public StringOperator(String str) {
        this.info = str != null ? str.getBytes() : "null".getBytes();
    }

    public StringOperator(StringOperator stro) {
        this.info = (byte[])stro.info.clone();
    }

    public StringOperator append(String str) {
        return this.append(new StringOperator(str));
    }

    public StringOperator append(StringOperator so) {
        byte[] newByte = new byte[this.info.length + so.info.length];
        System.arraycopy(this.info, 0, newByte, 0, this.info.length);
        System.arraycopy(so.info, 0, newByte, this.info.length, so.info.length);
        this.info = newByte;
        return this;
    }

    public StringOperator getStr(String strBegin, String strEnd) {
        return this.getStr(new StringOperator(strBegin), new StringOperator(strEnd));
    }

    public StringOperator getStr(StringOperator strBegin, StringOperator strEnd) {
        int index = this.indexOf(strBegin);
        int index1 = this.indexOf(strEnd);
        return this.substring(index + strBegin.info.length, index1);
    }

    public int indexOf(StringOperator so) {
        int scanLength = this.info.length - so.info.length;
        boolean found = false;
        for (int i = 0; i <= scanLength; ++i) {
            found = true;
            for (int j = 0; j < so.info.length; ++j) {
                if (this.info[i + j] == so.info[j]) continue;
                found = false;
                break;
            }
            if (!found) continue;
            return i;
        }
        return -1;
    }

    public int indexOf(StringOperator so, int begin) {
        int scanLength = this.info.length - so.info.length;
        boolean found = false;
        for (int i = begin; i <= scanLength; ++i) {
            found = true;
            for (int j = 0; j < so.info.length; ++j) {
                if (this.info[i + j] == so.info[j]) continue;
                found = false;
                break;
            }
            if (!found) continue;
            return i;
        }
        return -1;
    }

    private void remove(int loc1, int loc2) {
        if (loc1 < -1 || loc2 < -1 || loc2 < loc1) {
            return;
        }
        int removeLength = loc2 - loc1;
        byte[] newByte = new byte[this.info.length - removeLength];
        System.arraycopy(this.info, 0, newByte, 0, loc1);
        System.arraycopy(this.info, loc2, newByte, loc1, this.info.length - loc2);
        this.info = newByte;
    }

    public StringOperator removeStr(String strBegin, String strEnd) {
        return this.removeStr(new StringOperator(strBegin), new StringOperator(strEnd));
    }

    public StringOperator removeStr(StringOperator strBegin, StringOperator strEnd) {
        int index = this.indexOf(strBegin);
        int index1 = this.indexOf(strEnd);
        this.remove(index, index1 + strEnd.info.length);
        return this;
    }

    public void replaceAllString(String beReplace, String newSo) {
        this.replaceAllString(new StringOperator(beReplace), new StringOperator(newSo));
    }

    public void replaceAllString(String beReplace, StringOperator newSo) {
        this.replaceAllString(new StringOperator(beReplace), newSo);
    }

    public void replaceAllString(StringOperator beReplace, String newSo) {
        this.replaceAllString(beReplace, new StringOperator(newSo));
    }

    public void replaceAllString(StringOperator beReplace, StringOperator newSo) {
        if (newSo == null) {
            newSo = new StringOperator("null");
        }
        Vector<Integer> vctLocations = new Vector<Integer>();
        int loc = 0;
        int indexLoc = this.indexOf(beReplace);
        while (indexLoc >= 0) {
            vctLocations.addElement(indexLoc);
            loc = indexLoc + newSo.info.length + 1;
            indexLoc = this.indexOf(beReplace, loc);
        }
        int oneAppendLength = newSo.info.length - beReplace.info.length;
        int appendLength = vctLocations.size() * oneAppendLength;
        byte[] newByte = new byte[this.info.length + appendLength];
        int lastLoc = 0;
        int fittedLoc = 0;
        for (int i = 0; i < vctLocations.size(); ++i) {
            Integer locInt = (Integer)vctLocations.elementAt(i);
            int begin = lastLoc;
            int length = locInt - begin;
            System.arraycopy(this.info, begin, newByte, fittedLoc, length);
            System.arraycopy(newSo.info, 0, newByte, fittedLoc += length, newSo.info.length);
            fittedLoc += newSo.info.length;
            lastLoc = locInt + beReplace.info.length;
        }
        if (fittedLoc < newByte.length) {
            System.arraycopy(this.info, lastLoc, newByte, fittedLoc, newByte.length - fittedLoc);
        }
        this.info = newByte;
    }

    public StringOperator replaceFromTo(String strBegin, String strEnd, String replaced) {
        return this.replaceFromTo(new StringOperator(strBegin), new StringOperator(strEnd), new StringOperator(replaced));
    }

    public StringOperator replaceFromTo(StringOperator soBegin, StringOperator soEnd, StringOperator replaced) {
        int b = this.indexOf(soBegin);
        int e = this.indexOf(soEnd) + soEnd.info.length;
        if (e < b) {
            return this;
        }
        int rLength = replaced.info.length;
        byte[] newByte = new byte[this.info.length + replaced.info.length - (e - b)];
        System.arraycopy(this.info, 0, newByte, 0, b);
        System.arraycopy(replaced.info, 0, newByte, b, rLength);
        int length = this.info.length - e;
        System.arraycopy(this.info, e, newByte, b + rLength, length);
        this.info = newByte;
        return this;
    }

    public StringOperator substring(int index1, int index2) {
        if (index1 == -1 || index2 == -1 || index2 < index1) {
            return null;
        }
        byte[] newByte = new byte[index2 - index1];
        System.arraycopy(this.info, index1, newByte, 0, index2 - index1);
        return new StringOperator(newByte);
    }

    public String toString() {
        return new String(this.info);
    }
}

