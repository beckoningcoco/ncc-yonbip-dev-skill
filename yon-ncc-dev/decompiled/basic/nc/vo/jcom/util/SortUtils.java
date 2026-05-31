/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.jcom.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import nc.vo.jcom.util.SortFragMent;

public class SortUtils {
    private static final int INSERTIONSORT_THRESHOLD = 7;

    public static void sort(List list, int[] searchAry, Comparator c) {
        SortUtils.sort(list, null, null, searchAry, c);
    }

    public static void sort(List list, List[] listAry, Object[][] objAry, int[] searchAry, Comparator c) {
        Object[] a = list.toArray();
        Object[][] rela_a = null;
        if (listAry != null) {
            int intAry = 0;
            intAry = objAry != null ? listAry.length + objAry.length : listAry.length;
            rela_a = new Object[intAry][];
            for (int i = 0; i < intAry; ++i) {
                rela_a[i] = i < listAry.length ? listAry[i].toArray() : objAry[i - listAry.length];
            }
        } else {
            rela_a = objAry;
        }
        SortUtils.sort(a, rela_a, searchAry, c);
        ListIterator<Object> i = list.listIterator();
        for (int j = 0; j < a.length; ++j) {
            i.next();
            i.set(a[j]);
        }
        if (listAry != null) {
            for (int k = 0; k < listAry.length; ++k) {
                i = listAry[k].listIterator();
                for (int j = 0; j < rela_a[k].length; ++j) {
                    i.next();
                    i.set(rela_a[k][j]);
                }
            }
            if (objAry != null && objAry.length > 0) {
                System.arraycopy(rela_a, listAry.length, objAry, 0, objAry.length);
            }
        } else {
            objAry = rela_a;
        }
    }

    public static void sort(List list, List[] listAry, Object[][] objAry, int[] searchAry, Comparator c, SortFragMent[] fragments) {
        if (fragments == null || fragments.length == 0) {
            SortUtils.sort(list, listAry, objAry, searchAry, c);
            return;
        }
        List[] fraglists = new List[fragments.length];
        for (int i = 0; i < fragments.length; ++i) {
            fraglists[i] = new ArrayList();
            for (int j = fragments[i].beginIndex; j <= fragments[i].endIndex; ++j) {
                if (j >= list.size() || j < 0) {
                    throw new RuntimeException("Wrong fragment parameter!Can't be sorted!");
                }
                fraglists[i].add(list.get(j));
            }
            SortUtils.sort(fraglists[i], listAry, objAry, searchAry, c);
        }
        int nindex = 0;
        for (int i = 0; i < fragments.length; ++i) {
            nindex = fragments[i].beginIndex;
            for (int j = 0; j < fraglists.length; ++j) {
                list.set(nindex++, fraglists[i].get(j));
            }
        }
    }

    public static void sort(Object[] a, int[] searchAry, Comparator c) {
        SortUtils.sort(a, null, searchAry, c);
    }

    public static void sort(Object[] a, Object[][] relaObj, int[] searchAry, Comparator c) {
        Object[][] aux_rela = null;
        if (relaObj != null) {
            aux_rela = new Object[relaObj.length][];
            for (int i = 0; i < relaObj.length; ++i) {
                if (relaObj[i].length != a.length) {
                    throw new IllegalArgumentException("relation soft objct[] size not equal sorted object's size");
                }
                aux_rela[i] = (Object[])relaObj[i].clone();
            }
        }
        Object[] aux = (Object[])a.clone();
        SortUtils.mergeSort(aux, a, aux_rela, relaObj, 0, a.length, 0, c, searchAry);
    }

    private static void mergeSort(Object[] src, Object[] dest, Object[][] rela_src, Object[][] rela_dest, int low, int high, int off, Comparator c, int[] iSearchAry) {
        int length = high - low;
        if (length < 7) {
            SortUtils.bubbleSort(dest, rela_dest, low, high, c, iSearchAry);
            return;
        }
        int destLow = low;
        int destHigh = high;
        int mid = (low += off) + (high += off) >> 1;
        SortUtils.mergeSort(dest, src, rela_dest, rela_src, low, mid, -off, c, iSearchAry);
        SortUtils.mergeSort(dest, src, rela_dest, rela_src, mid, high, -off, c, iSearchAry);
        if (c.compare(src[mid - 1], src[mid]) <= 0) {
            System.arraycopy(src, low, dest, destLow, length);
            if (rela_src != null) {
                for (int i = 0; i < rela_src.length; ++i) {
                    System.arraycopy(rela_src[i], low, rela_dest[i], destLow, length);
                }
            }
            return;
        }
        SortUtils.mergesort2(src, dest, rela_src, rela_dest, low, high, c, iSearchAry, destLow, destHigh, mid);
    }

    private static void mergesort2(Object[] src, Object[] dest, Object[][] rela_src, Object[][] rela_dest, int low, int high, Comparator c, int[] iSearchAry, int destLow, int destHigh, int mid) {
        HashSet<Integer> set = new HashSet<Integer>();
        int[] recChangeIndex = null;
        if (iSearchAry != null) {
            recChangeIndex = new int[iSearchAry.length];
        }
        int p = low;
        int q = mid;
        for (int i = destLow; i < destHigh; ++i) {
            int k;
            if (q >= high || p < mid && c.compare(src[p], src[q]) <= 0) {
                dest[i] = src[p];
                if (rela_dest != null) {
                    for (k = 0; k < rela_dest.length; ++k) {
                        rela_dest[k][i] = rela_src[k][p];
                    }
                }
                SortUtils.recordExchange(set, recChangeIndex, iSearchAry, p, i);
                ++p;
                continue;
            }
            dest[i] = src[q];
            if (rela_dest != null) {
                for (k = 0; k < rela_dest.length; ++k) {
                    rela_dest[k][i] = rela_src[k][q];
                }
            }
            SortUtils.recordExchange(set, recChangeIndex, iSearchAry, q, i);
            ++q;
        }
    }

    private static void bubbleSort(Object[] dest, Object[][] rela_dest, int low, int high, Comparator c, int[] iSearchAry) {
        for (int i = low; i < high; ++i) {
            for (int j = i; j > low; --j) {
                int k;
                if (c.compare(dest[j - 1], dest[j]) <= 0) continue;
                if (iSearchAry != null) {
                    for (k = 0; k < iSearchAry.length; ++k) {
                        if (iSearchAry[k] == j) {
                            iSearchAry[k] = j - 1;
                            continue;
                        }
                        if (iSearchAry[k] != j - 1) continue;
                        iSearchAry[k] = j;
                    }
                }
                SortUtils.swap(dest, j, j - 1);
                if (rela_dest == null) continue;
                for (k = 0; k < rela_dest.length; ++k) {
                    SortUtils.swap(rela_dest[k], j, j - 1);
                }
            }
        }
    }

    private static void recordExchange(Set<Integer> set, int[] recChangeIndex, int[] iSearchAry, int iChangebeforeRow, int iChangAfterRow) {
        if (set.contains(iChangAfterRow)) {
            return;
        }
        if (iSearchAry == null) {
            return;
        }
        if (set.size() == iSearchAry.length) {
            return;
        }
        for (int k = 0; k < iSearchAry.length; ++k) {
            if (recChangeIndex[k] == 1 || iSearchAry[k] != iChangebeforeRow) continue;
            iSearchAry[k] = iChangAfterRow;
            set.add(iChangAfterRow);
            recChangeIndex[k] = 1;
        }
    }

    private static void swap(Object[] x, int a, int b) {
        Object t = x[a];
        x[a] = x[b];
        x[b] = t;
    }
}

