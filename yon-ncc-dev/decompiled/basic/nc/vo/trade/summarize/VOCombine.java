/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.trade.summarize;

import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.SuperVO;
import nc.vo.trade.summarize.ICombine;
import nc.vo.trade.summarize.ObjectCombine;

public class VOCombine
implements ICombine {
    String[] m_TotalFields;

    public VOCombine(String[] totalFields) {
        this.m_TotalFields = totalFields == null || totalFields.length == 0 ? new String[0] : totalFields;
    }

    @Override
    public Object combine(Object o1, Object o2) throws Exception {
        if (o1 == null && o2 != null) {
            return ((SuperVO)o2).clone();
        }
        if (!(o1 instanceof CircularlyAccessibleValueObject)) {
            throw new IllegalArgumentException("VOCombine o1 must be subclass of CircularlyAccessibleValueObject");
        }
        if (!(o2 instanceof CircularlyAccessibleValueObject)) {
            throw new IllegalArgumentException("VOCombine o2 must be subclass of CircularlyAccessibleValueObject");
        }
        SuperVO vo1 = (SuperVO)o1;
        SuperVO vo2 = (SuperVO)o2;
        SuperVO vo = (SuperVO)vo1.clone();
        for (int i = 0; i < this.m_TotalFields.length; ++i) {
            String field = this.m_TotalFields[i];
            vo.setAttributeValue(field, ObjectCombine.getInstance().combine(vo1.getAttributeValue(field), vo2.getAttributeValue(field)));
        }
        return vo;
    }
}

