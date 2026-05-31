/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.logging.Logger
 */
package nc.vo.pub.pinyin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.BitSet;
import nc.bs.logging.Logger;

public class NCPYTable {
    private static final int COUNT = 21000;
    private static String[][] p = new String[21000][];

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static void init() {
        BufferedReader br = null;
        try {
            InputStream is = NCPYTable.class.getClassLoader().getResourceAsStream("nc/vo/pub/pinyin/NCPY.txt");
            br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
            String s = null;
            while ((s = br.readLine()) != null) {
                int index = s.charAt(0) - 19968;
                NCPYTable.p[index] = s.substring(1).split("\\s");
                for (int i = 0; i < p[index].length; ++i) {
                    NCPYTable.p[index][i] = p[index][i].intern();
                }
            }
        }
        catch (Exception e) {
        }
        finally {
            try {
                if (null != br) {
                    br.close();
                    br = null;
                }
            }
            catch (IOException e) {
                Logger.error((Object)e.getMessage());
            }
        }
    }

    public static String getPinyin(char ch) {
        int index = ch - 19968;
        if (index >= 0 && index <= 21000) {
            return p[index] != null ? p[index][0] : new String(new char[]{ch});
        }
        return new String(new char[]{ch});
    }

    public static String[] getPinyins(char ch) {
        int index = ch - 19968;
        if (index >= 0 && index <= 21000 && p[index] != null) {
            return p[index];
        }
        return new String[]{new String(new char[]{ch})};
    }

    public static char getFirstPinyin(char ch) {
        int index = ch - 19968;
        if (index >= 0 && index <= 21000) {
            return p[index] != null ? p[index][0].charAt(0) : ch;
        }
        return ch;
    }

    public static char[] getFirstPinyins(char ch) {
        int index = ch - 19968;
        if (index >= 0 && index <= 21000) {
            if (p[index].length == 1) {
                return new char[]{p[index][0].charAt(0)};
            }
            BitSet readed_flags = new BitSet();
            readed_flags.clear();
            int count = 0;
            char[] ss = new char[10];
            for (String pinyin : p[index]) {
                char initial = pinyin.charAt(0);
                int flagIndex = initial - 97;
                if (flagIndex <= 0 || flagIndex > 21000 || readed_flags.get(flagIndex)) continue;
                ss[count++] = initial;
                readed_flags.set(flagIndex);
            }
            if (count == 0) {
                ++count;
            }
            char[] result = new char[count];
            System.arraycopy(ss, 0, result, 0, count);
            return result;
        }
        return new char[]{ch};
    }

    static {
        NCPYTable.init();
    }
}

