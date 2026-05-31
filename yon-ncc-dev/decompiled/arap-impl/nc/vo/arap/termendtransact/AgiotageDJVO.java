/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.ValidationException
 *  nc.vo.pub.ValueObject
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pub.lang.UFDouble
 */
package nc.vo.arap.termendtransact;

import nc.vo.pub.ValidationException;
import nc.vo.pub.ValueObject;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDouble;

public class AgiotageDJVO
extends ValueObject {
    private static final long serialVersionUID = -2357813998183416518L;
    public String m_vouchid;
    public String m_fb_oid;
    public String m_fkxyb_oid;
    public String m_ywbm;
    public String m_djdl;
    public String m_djlxmc;
    public String m_djbh;
    public Integer m_flbh;
    public UFDate m_djrq;
    public UFDate m_shrq;
    public UFDate m_xydqr;
    public UFDouble m_ybye;
    public UFDouble m_fbye;
    public UFDouble m_bbye;
    public int m_Fx;
    public String m_ordercusmandoc;
    public boolean m_IsLock;
    private UFDouble m_groupbb;
    private UFDouble m_globalbb;
    private String ts;

    public UFDouble getGroupbb() {
        return this.m_groupbb;
    }

    public void setGroupbb(UFDouble mGroupbb) {
        this.m_groupbb = mGroupbb;
    }

    public UFDouble getGlobalbb() {
        return this.m_globalbb;
    }

    public void setGlobalbb(UFDouble mGlobalbb) {
        this.m_globalbb = mGlobalbb;
    }

    public String getTs() {
        return this.ts;
    }

    public void setTs(String ts) {
        this.ts = ts;
    }

    public AgiotageDJVO() {
    }

    public AgiotageDJVO(String newClb_oid) {
    }

    public Object clone() {
        Object o = null;
        try {
            o = super.clone();
        }
        catch (Exception e) {
            throw new RuntimeException("clone not supported!");
        }
        AgiotageDJVO dJCLB = (AgiotageDJVO)((Object)o);
        return dJCLB;
    }

    public UFDouble getBbye() {
        return this.m_bbye;
    }

    public String getDjbh() {
        return this.m_djbh;
    }

    public String getDjdl() {
        return this.m_djdl;
    }

    public String getDjlxmc() {
        return this.m_djlxmc;
    }

    public UFDate getDjrq() {
        return this.m_djrq;
    }

    public String getEntityName() {
        return "DJCLB";
    }

    public String getFboid() {
        return this.m_fb_oid;
    }

    public UFDouble getFbye() {
        return this.m_fbye;
    }

    public String getFkxyboid() {
        return this.m_fkxyb_oid;
    }

    public Integer getFlbh() {
        return this.m_flbh;
    }

    public int getFx() {
        return this.m_Fx;
    }

    public boolean getIsLock() {
        return this.m_IsLock;
    }

    public String getOrderCusmanDoc() {
        return this.m_ordercusmandoc;
    }

    public UFDate getShrq() {
        return this.m_shrq;
    }

    public String getVouchid() {
        return this.m_vouchid;
    }

    public UFDate getXydqr() {
        return this.m_xydqr;
    }

    public UFDouble getYbye() {
        return this.m_ybye;
    }

    public String getYwbm() {
        return this.m_ywbm;
    }

    public void setBbye(UFDouble bbye) {
        this.m_bbye = bbye;
    }

    public void setDjbh(String newDjbh) {
        this.m_djbh = newDjbh;
    }

    public void setDjdl(String newDjdl) {
        this.m_djdl = newDjdl;
    }

    public void setDjlxmc(String djlxmc) {
        this.m_djlxmc = djlxmc;
    }

    public void setDjrq(UFDate newDjrq) {
        this.m_djrq = newDjrq;
    }

    public void setFboid(String newFb_oid) {
        this.m_fb_oid = newFb_oid;
    }

    public void setFbye(UFDouble fbye) {
        this.m_fbye = fbye;
    }

    public void setFkxyboid(String newFkxyb_oid) {
        this.m_fkxyb_oid = newFkxyb_oid;
    }

    public void setFlbh(Integer newFlbh) {
        this.m_flbh = newFlbh;
    }

    public void setFx(int fx) {
        this.m_Fx = fx;
    }

    public void setIsLock(boolean isLock) {
        this.m_IsLock = isLock;
    }

    public void setOrderCusmanDoc(String order) {
        this.m_ordercusmandoc = order;
    }

    public void setShrq(UFDate newShrq) {
        this.m_shrq = newShrq;
    }

    public void setVouchid(String newVouchid) {
        this.m_vouchid = newVouchid;
    }

    public void setXydqr(UFDate newXydqr) {
        this.m_xydqr = newXydqr;
    }

    public void setYbye(UFDouble ybye) {
        this.m_ybye = ybye;
    }

    public void setYwbm(String newYwbm) {
        this.m_ywbm = newYwbm;
    }

    public void validate() throws ValidationException {
    }
}

