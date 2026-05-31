/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.lang.UFDouble
 */
package nc.vo.arap.transaction;

import java.io.Serializable;
import nc.vo.arap.pub.UFDoubleTool;
import nc.vo.pub.lang.UFDouble;

public class Je
implements Serializable {
    private static final long serialVersionUID = 1L;
    private String m_Bzbm = null;
    private UFDouble m_Yb = null;
    private UFDouble m_Bb = null;
    private UFDouble group_Bb = null;
    private UFDouble global_Bb = null;

    public Je(String bzbm) {
        this.setBzbm(bzbm);
        this.setYb(UFDouble.ZERO_DBL);
        this.setBb(UFDouble.ZERO_DBL);
        this.setGroupBb(UFDouble.ZERO_DBL);
        this.setGlobalBb(UFDouble.ZERO_DBL);
    }

    public Je(String bzbm, UFDouble yb, UFDouble bb, UFDouble groupbb, UFDouble globalbb) {
        this.setBzbm(bzbm);
        if (yb == null) {
            yb = UFDouble.ZERO_DBL;
        }
        if (bb == null) {
            bb = UFDouble.ZERO_DBL;
        }
        this.setYb(yb);
        this.setBb(bb);
        this.setGroupBb(groupbb);
        this.setGlobalBb(globalbb);
    }

    public Je(Je aJe) {
        this(aJe.getBzbm(), aJe.getYb(), aJe.getBb(), aJe.getGroupBb(), aJe.getGlobalBb());
    }

    public Je abs() {
        return new Je(this.getBzbm(), this.getYb().abs(), this.getBb().abs(), this.getGroupBb().abs(), this.getGlobalBb().abs());
    }

    public Je add(Je je) {
        Je aJe = new Je(this.getBzbm());
        aJe.setYb(this.getYb().add(je.getYb()));
        aJe.setBb(this.getBb().add(je.getBb()));
        aJe.setGroupBb(this.getGroupBb().add(je.getGroupBb()));
        aJe.setGlobalBb(this.getGlobalBb().add(je.getGlobalBb()));
        return aJe;
    }

    public String getBzbm() {
        if (this.m_Bzbm == null) {
            this.m_Bzbm = "";
        }
        return this.m_Bzbm;
    }

    public boolean isAllZero() {
        return UFDoubleTool.isZero(this.getYb()) && UFDoubleTool.isZero(this.getBb()) && UFDoubleTool.isZero(this.getGroupBb()) && UFDoubleTool.isZero(this.getGlobalBb());
    }

    public void setBzbm(String bzbm) {
        this.m_Bzbm = bzbm;
    }

    public void setZero() {
        this.setYb(UFDouble.ZERO_DBL);
        this.setBb(UFDouble.ZERO_DBL);
        this.setGroupBb(UFDouble.ZERO_DBL);
        this.setGlobalBb(UFDouble.ZERO_DBL);
    }

    public static int signum(UFDouble str) {
        return str.toBigDecimal().signum();
    }

    public static UFDouble subtract(UFDouble num1, UFDouble num2) {
        return num1.sub(num2);
    }

    public Je subtract(Je je) {
        Je aJe = new Je(this.getBzbm());
        aJe.setYb(Je.subtract(this.getYb(), je.getYb()));
        aJe.setBb(Je.subtract(this.getBb(), je.getBb()));
        aJe.setGroupBb(Je.subtract(this.getGroupBb(), je.getGroupBb()));
        aJe.setGlobalBb(Je.subtract(this.getGlobalBb(), je.getGlobalBb()));
        return aJe;
    }

    public UFDouble getGroupBb() {
        return this.group_Bb;
    }

    public void setGroupBb(UFDouble groupbb) {
        this.group_Bb = groupbb;
    }

    public UFDouble getGlobalBb() {
        return this.global_Bb;
    }

    public void setGlobalBb(UFDouble globalbb) {
        this.global_Bb = globalbb;
    }

    public UFDouble getBb() {
        return this.m_Bb;
    }

    public void setBb(UFDouble bb) {
        this.m_Bb = bb;
    }

    public UFDouble getYb() {
        return this.m_Yb;
    }

    public void setYb(UFDouble yb) {
        this.m_Yb = yb;
    }

    public Je clone() {
        Je newJe = new Je(this.m_Bzbm);
        newJe.setBb(this.m_Bb);
        newJe.setYb(this.m_Yb);
        newJe.setGroupBb(this.group_Bb);
        newJe.setGlobalBb(this.global_Bb);
        return newJe;
    }
}

