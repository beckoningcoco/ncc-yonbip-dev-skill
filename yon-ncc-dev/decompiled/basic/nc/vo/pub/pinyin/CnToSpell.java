/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.pub.pinyin;

import java.util.ArrayList;
import nc.vo.pub.pinyin.NCPYTable;

public class CnToSpell {
    public static String getFullSpell(String cnStr) {
        if (null == cnStr || "".equals(cnStr.trim())) {
            return cnStr;
        }
        char[] chars = cnStr.toCharArray();
        StringBuffer retuBuf = new StringBuffer();
        int Len = chars.length;
        for (int i = 0; i < Len; ++i) {
            retuBuf.append(NCPYTable.getPinyin(chars[i]));
        }
        return retuBuf.toString();
    }

    public static String[] getFullSpells(String cnStr) {
        if (null == cnStr || "".equals(cnStr.trim())) {
            return new String[]{cnStr};
        }
        char[] chars = cnStr.toCharArray();
        ArrayList<StringBuffer> bufs = new ArrayList<StringBuffer>();
        StringBuffer buf = new StringBuffer();
        bufs.add(buf);
        int Len = chars.length;
        for (int i = 0; i < Len; ++i) {
            String[] ccs = NCPYTable.getPinyins(chars[i]);
            CnToSpell.appendToBufs(ccs, bufs);
        }
        String[] results = new String[bufs.size()];
        for (int i = 0; i < results.length; ++i) {
            results[i] = bufs.get(i).toString();
        }
        return results;
    }

    public static String getFirstSpell(String cnStr) {
        if (null == cnStr || "".equals(cnStr.trim())) {
            return cnStr;
        }
        char[] chars = cnStr.toCharArray();
        StringBuffer retuBuf = new StringBuffer();
        int Len = chars.length;
        for (int i = 0; i < Len; ++i) {
            retuBuf.append(NCPYTable.getFirstPinyin(chars[i]));
        }
        return retuBuf.toString();
    }

    public static String[] getFirstSpells(String cnStr) {
        if (null == cnStr || "".equals(cnStr.trim())) {
            return new String[]{cnStr};
        }
        char[] chars = cnStr.toCharArray();
        ArrayList<StringBuffer> bufs = new ArrayList<StringBuffer>();
        StringBuffer buf = new StringBuffer();
        bufs.add(buf);
        int Len = chars.length;
        for (int i = 0; i < Len; ++i) {
            char[] ccs = NCPYTable.getFirstPinyins(chars[i]);
            CnToSpell.appendToBufs(ccs, bufs);
        }
        String[] results = new String[bufs.size()];
        for (int i = 0; i < results.length; ++i) {
            results[i] = bufs.get(i).toString();
        }
        return results;
    }

    public static String[] getFullAndFirstSpells(String cnStr) {
        String[] s1 = CnToSpell.getFirstSpells(cnStr);
        String[] s2 = CnToSpell.getFullSpells(cnStr);
        String[] results = new String[s1.length + s2.length];
        System.arraycopy(s1, 0, results, 0, s1.length);
        System.arraycopy(s2, 0, results, s1.length, s2.length);
        return results;
    }

    private static void appendToBufs(char[] chars, ArrayList<StringBuffer> bufs) {
        int bufCount = bufs.size();
        CnToSpell.duplicateBuf(bufs, chars.length);
        for (int i = 0; i < chars.length; ++i) {
            for (int j = 0; j < bufCount; ++j) {
                bufs.get(i * bufCount + j).append(chars[i]);
            }
        }
    }

    private static void appendToBufs(String[] pinyins, ArrayList<StringBuffer> bufs) {
        int bufCount = bufs.size();
        CnToSpell.duplicateBuf(bufs, pinyins.length);
        for (int i = 0; i < pinyins.length; ++i) {
            for (int j = 0; j < bufCount; ++j) {
                bufs.get(i * bufCount + j).append(pinyins[i]);
            }
        }
    }

    private static void duplicateBuf(ArrayList<StringBuffer> bufs, int copys) {
        int originalSize = bufs.size();
        for (int i = 0; i < copys - 1; ++i) {
            for (int j = 0; j < originalSize; ++j) {
                bufs.add(new StringBuffer(bufs.get(j)));
            }
        }
    }
}

