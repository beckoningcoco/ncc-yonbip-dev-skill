/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.trade.summarize;

import nc.vo.pub.lang.UFDouble;
import nc.vo.trade.summarize.ICombine;

public class ObjectCombine
implements ICombine {
    private static ObjectCombine m_objCombine = new ObjectCombine();

    private ObjectCombine() {
    }

    @Override
    public Object combine(Object obj1, Object obj2) throws Exception {
        if (obj1 == null && obj2 == null) {
            return null;
        }
        if (obj1 == null && obj2 != null) {
            return obj2;
        }
        if (obj1 != null && obj2 == null) {
            return obj1;
        }
        if (obj1.getClass().equals(Integer.class)) {
            int data1 = (Integer)obj1;
            int data2 = (Integer)obj2;
            return data1 + data2;
        }
        if (obj1.getClass().equals(UFDouble.class)) {
            obj1 = ((UFDouble)obj1).add((UFDouble)obj2);
            return obj1;
        }
        if (obj1.getClass().equals(Double.class)) {
            double data1 = (Double)obj1;
            double data2 = (Double)obj2;
            return new Double(data1 + data2);
        }
        return null;
    }

    public static ICombine getInstance() {
        return m_objCombine;
    }
}

