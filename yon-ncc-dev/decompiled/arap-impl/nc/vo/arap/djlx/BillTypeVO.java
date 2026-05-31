/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.CircularlyAccessibleValueObject
 */
package nc.vo.arap.djlx;

import nc.vo.arap.djlx.DjLXVO;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.CircularlyAccessibleValueObject;

public class BillTypeVO
extends AggregatedValueObject
implements Cloneable {
    private static final long serialVersionUID = 4129859872464524169L;
    private boolean m_isDirty = false;
    private DjLXVO parent = null;
    private String parentbilltype;

    public Object clone() {
        Object o = null;
        try {
            o = super.clone();
        }
        catch (CloneNotSupportedException e) {
            throw new RuntimeException("clone not supported!");
        }
        return o;
    }

    public CircularlyAccessibleValueObject[] getChildrenVO() {
        return null;
    }

    public String getDjdl() {
        return this.parent.getDjdl();
    }

    public String getDjlxbm() {
        return null == this.parent ? null : this.parent.getDjlxbm();
    }

    public String getDjlxoid() {
        return this.parent.getPk_billtype();
    }

    public CircularlyAccessibleValueObject getParentVO() {
        return this.parent;
    }

    public boolean isDirty() {
        return this.m_isDirty;
    }

    public void setChildrenVO(CircularlyAccessibleValueObject[] children) {
    }

    public void setDirty(boolean isDirty) {
        this.m_isDirty = isDirty;
    }

    public void setParentVO(CircularlyAccessibleValueObject parent) {
        this.parent = (DjLXVO)parent;
    }

    public String toString() {
        if (this.parent != null) {
            return this.parent.getDjlxbm();
        }
        return "";
    }

    public String getParentBillType() {
        return this.parentbilltype;
    }

    public void setParentBillType(String parentbilltype) {
        this.parentbilltype = parentbilltype;
    }
}

