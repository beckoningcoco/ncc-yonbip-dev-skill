/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.logging.Logger
 */
package nc.vo.jcom.util;

import java.util.ArrayList;
import java.util.Vector;
import nc.bs.logging.Logger;

public class OrderByRuleUtil {
    ArrayList m_alRule = null;
    int counter = 0;
    int MAXCOUNT = 200;

    public OrderByRuleUtil(ArrayList ruleList) {
        this.m_alRule = ruleList;
    }

    public OrderByRuleUtil(ArrayList ruleList, int allowedMaxCount) {
        this.m_alRule = ruleList;
        this.MAXCOUNT = allowedMaxCount;
    }

    public int getCounter() {
        return this.counter;
    }

    public int[] getOrderedIndex(Object[] obj) throws Exception {
        if (this.m_alRule == null || this.m_alRule.size() == 0) {
            return null;
        }
        if (obj == null || obj.length == 0) {
            return null;
        }
        int[] orderValues = new int[obj.length];
        for (int i = 0; i < obj.length; ++i) {
            orderValues[i] = this.getValue(obj[i]);
        }
        int[] newOrder = OrderByRuleUtil.sortBubble(orderValues);
        for (int i = 0; i < newOrder.length; ++i) {
            Object o1 = obj[newOrder[i]];
            for (int j = i; j < newOrder.length; ++j) {
                if (!obj[newOrder[j]].equals(o1) || newOrder[i] <= newOrder[j]) continue;
                int idx = newOrder[i];
                newOrder[i] = newOrder[j];
                newOrder[j] = idx;
            }
        }
        return newOrder;
    }

    public Object[] getOrderedObj() throws Exception {
        if (this.m_alRule == null || this.m_alRule.size() == 0) {
            return null;
        }
        Vector<Object> vec = new Vector<Object>();
        for (int i = 0; i < this.m_alRule.size(); ++i) {
            Object[] rule = (Object[])this.m_alRule.get(i);
            if (vec.indexOf(rule[0]) < 0) {
                vec.add(rule[0]);
            }
            if (vec.indexOf(rule[1]) >= 0) continue;
            vec.add(rule[1]);
        }
        Object[] obj = new Object[vec.size()];
        vec.copyInto(obj);
        int[] newOrder = this.getOrderedIndex(obj);
        Object[] objArray = new Object[obj.length];
        for (int i = 0; i < obj.length; ++i) {
            objArray[i] = obj[newOrder[i]];
        }
        return objArray;
    }

    private int getValue(Object obj) throws Exception {
        if (this.counter++ > this.MAXCOUNT) {
            Logger.error((Object)"\u89c4\u5219\u51fa\u73b0\u95ed\u73af\u9519\u8bef,\u8bf7\u8fdb\u884c\u68c0\u67e5!");
            return 1;
        }
        int value = 1;
        for (int i = 0; i < this.m_alRule.size(); ++i) {
            if (!((Object[])this.m_alRule.get(i))[1].equals(obj)) continue;
            value += this.getValue(((Object[])this.m_alRule.get(i))[0]);
        }
        return value;
    }

    private static int[] sortBubble(int[] s1) {
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

