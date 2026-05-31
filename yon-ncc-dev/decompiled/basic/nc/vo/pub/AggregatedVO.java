/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.pub;

import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.ExtendedAggregatedValueObject;

public class AggregatedVO
extends AggregatedValueObject {
    private ExtendedAggregatedValueObject m_vo = null;

    public AggregatedVO(ExtendedAggregatedValueObject vo) {
        this.m_vo = vo;
    }

    @Override
    public CircularlyAccessibleValueObject[] getChildrenVO() {
        return this.m_vo.getTableVO(this.m_vo.getTableCodes()[0]);
    }

    @Override
    public CircularlyAccessibleValueObject getParentVO() {
        return this.m_vo.getParentVO();
    }

    @Override
    public void setChildrenVO(CircularlyAccessibleValueObject[] children) {
        this.m_vo.setTableVO(this.m_vo.getTableCodes()[0], children);
    }

    @Override
    public void setParentVO(CircularlyAccessibleValueObject parent) {
        this.m_vo.setParentVO(parent);
    }
}

