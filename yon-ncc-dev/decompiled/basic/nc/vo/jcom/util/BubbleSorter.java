/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.jcom.util;

public class BubbleSorter {
    public static int[] sort(String[] s1) {
        int i;
        if (s1 == null) {
            return null;
        }
        int length = s1.length;
        String[] temp = new String[length];
        int[] s2 = new int[length];
        for (i = 0; i < length; ++i) {
            temp[i] = s1[i];
            s2[i] = i;
        }
        for (i = 0; i < length; ++i) {
            String index = temp[i];
            for (int j = i; j < length; ++j) {
                String idx = temp[j];
                if (index.compareTo(idx) <= 0) continue;
                String tt = temp[j];
                int tt2 = s2[j];
                temp[j] = temp[i];
                s2[j] = s2[i];
                temp[i] = tt;
                s2[i] = tt2;
                index = idx;
            }
        }
        return s2;
    }

    public static int[] sort(int[] s1) {
        int i;
        int length = s1.length;
        int[] temp = new int[length];
        int[] s2 = new int[length];
        for (i = 0; i < length; ++i) {
            temp[i] = s1[i];
            s2[i] = i;
        }
        for (i = 0; i < length; ++i) {
            int index = temp[i];
            for (int j = i; j < length; ++j) {
                int idx = temp[j];
                if (index <= idx) continue;
                int tt = temp[j];
                int tt2 = s2[j];
                temp[j] = temp[i];
                s2[j] = s2[i];
                temp[i] = tt;
                s2[i] = tt2;
                index = idx;
            }
        }
        return s2;
    }
}

