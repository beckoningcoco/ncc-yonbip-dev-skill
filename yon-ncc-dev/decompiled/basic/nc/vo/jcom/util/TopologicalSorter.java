/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.jcom.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TopologicalSorter {
    private static int decreaseInDegree(HashMap dataMap, Object data) throws Exception {
        if (dataMap.containsKey(data)) {
            Integer IInDegree = (Integer)dataMap.get(data);
            int iIndegree = IInDegree - 1;
            if (iIndegree == 0) {
                dataMap.remove(data);
            } else {
                dataMap.put(data, iIndegree);
            }
            return iIndegree;
        }
        return 0;
    }

    private static List delZeroInDegree(List dataList, HashMap dataMap, Object[][] dataReliance) throws Exception {
        ArrayList zeroIndegreeData = new ArrayList();
        int restSize = dataList.size();
        for (int i = restSize - 1; i >= 0; --i) {
            Object obj = dataList.get(i);
            if (TopologicalSorter.queryInDegree(dataMap, obj) != 0) continue;
            zeroIndegreeData.add(obj);
            dataList.remove(i);
        }
        HashSet zidSet = new HashSet();
        zidSet.addAll(zeroIndegreeData);
        int relianceSize = dataReliance.length;
        for (int i = 0; i < relianceSize; ++i) {
            if (dataReliance[i][0] == null || !zidSet.contains(dataReliance[i][0])) continue;
            TopologicalSorter.decreaseInDegree(dataMap, dataReliance[i][1]);
        }
        return zeroIndegreeData;
    }

    private static int increaseInDegree(HashMap dataMap, Object data) throws Exception {
        if (!dataMap.containsKey(data)) {
            dataMap.put(data, 1);
            return 1;
        }
        Integer inDegree = (Integer)dataMap.get(data);
        int newInDegree = inDegree + 1;
        dataMap.put(data, newInDegree);
        return newInDegree;
    }

    private static int queryInDegree(HashMap dataMap, Object data) throws Exception {
        if (dataMap.containsKey(data)) {
            Integer iInDegree = (Integer)dataMap.get(data);
            return iInDegree;
        }
        return 0;
    }

    public static List topologicalSort(Object[][] dataReliance) throws Exception {
        HashMap<Object, Integer> dataMap = new HashMap<Object, Integer>();
        int size = dataReliance.length;
        Integer iZero = 0;
        for (int i = 0; i < size; ++i) {
            if (dataReliance[i][0] != null) {
                if (!dataMap.containsKey(dataReliance[i][0])) {
                    dataMap.put(dataReliance[i][0], iZero);
                }
                if (dataReliance[i][1] == null) continue;
                TopologicalSorter.increaseInDegree(dataMap, dataReliance[i][1]);
                continue;
            }
            if (dataReliance[i][1] == null || dataMap.containsKey(dataReliance[i][1])) continue;
            dataMap.put(dataReliance[i][1], iZero);
        }
        return TopologicalSorter.topologicalSort(dataMap, dataReliance);
    }

    private static List topologicalSort(HashMap dataMap, Object[][] dataReliance) throws Exception {
        Iterator it = dataMap.keySet().iterator();
        LinkedList dataList = new LinkedList();
        while (it.hasNext()) {
            dataList.add(it.next());
        }
        ArrayList sortedResult = new ArrayList(dataList.size());
        while (dataList.size() > 0) {
            List zeroIndegreeData = TopologicalSorter.delZeroInDegree(dataList, dataMap, dataReliance);
            if (zeroIndegreeData.size() == 0) {
                StringBuffer strBuf = new StringBuffer("The data can not be sorted by topologicalSort: ");
                int restSize = dataList.size();
                for (int i = 0; i < restSize; ++i) {
                    if (i > 0) {
                        strBuf.append(",");
                    }
                    strBuf.append(dataList.get(i));
                }
                strBuf.append("Linked lists constitute loop");
                throw new Exception(strBuf.toString());
            }
            sortedResult.addAll(zeroIndegreeData);
        }
        return sortedResult;
    }

    public static List topologicalSort(List dataReliance) throws Exception {
        Object[][] data = null;
        int size = dataReliance.size();
        data = new Object[size][];
        dataReliance.toArray((T[])data);
        return TopologicalSorter.topologicalSort(data);
    }
}

