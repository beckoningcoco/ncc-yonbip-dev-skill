/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pub.lang.UFDateTime
 *  nc.vo.pub.lang.UFDouble
 */
package nc.vo.arap.pfflow;

import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.lang.UFDouble;

public class ArapBillMapVO
extends SuperVO {
    private static final long serialVersionUID = 7099021388892488173L;
    private String s_billtype;
    private String contractno;
    private int s_system;
    private UFDouble ybye;
    private int maptype;
    private UFDouble ybje;
    private String t_termid;
    private String t_itemid;
    private String t_billid;
    private String t_billtype;
    private String s_termid;
    private String s_itemid;
    private String s_billid;
    private String pk_billmap;
    private UFDouble oldje;
    private UFDateTime ts;
    private Integer dr;
    private String pk_org;
    private String pk_currtype;
    private String settlecurr;
    private UFDouble settlemoney;
    private String pk_org1;
    private UFBoolean ismanual;

    public String getPk_org1() {
        return this.pk_org1;
    }

    public void setPk_org1(String pkOrg1) {
        this.pk_org1 = pkOrg1;
    }

    public String getSettlecurr() {
        return this.settlecurr;
    }

    public void setSettlecurr(String settlecurr) {
        this.settlecurr = settlecurr;
    }

    public UFDouble getSettlemoney() {
        return this.settlemoney;
    }

    public void setSettlemoney(UFDouble settlemoney) {
        this.settlemoney = settlemoney;
    }

    public String getContractno() {
        return this.contractno;
    }

    public void setContractno(String contractno) {
        this.contractno = contractno;
    }

    public String getPk_org() {
        return this.pk_org;
    }

    public void setPk_org(String pkOrg) {
        this.pk_org = pkOrg;
    }

    public String getPk_currtype() {
        return this.pk_currtype;
    }

    public void setPk_currtype(String pkCurrtype) {
        this.pk_currtype = pkCurrtype;
    }

    public String getPKFieldName() {
        return "pk_billmap";
    }

    public String getParentPKFieldName() {
        return null;
    }

    public Integer getDr() {
        return this.dr;
    }

    public void setDr(Integer dr) {
        this.dr = dr;
    }

    public String getPk_billmap() {
        return this.pk_billmap;
    }

    public void setPk_billmap(String pk_billmap) {
        this.pk_billmap = pk_billmap;
    }

    public String getS_billid() {
        return this.s_billid;
    }

    public void setS_billid(String s_billid) {
        this.s_billid = s_billid;
    }

    public String getS_itemid() {
        return this.s_itemid;
    }

    public void setS_itemid(String s_itemid) {
        this.s_itemid = s_itemid;
    }

    public int getS_system() {
        return this.s_system;
    }

    public void setS_system(int s_system) {
        this.s_system = s_system;
    }

    public String getT_billid() {
        return this.t_billid;
    }

    public void setT_billid(String t_billid) {
        this.t_billid = t_billid;
    }

    public String getT_billtype() {
        return this.t_billtype;
    }

    public void setT_billtype(String t_billtype) {
        this.t_billtype = t_billtype;
    }

    public String getT_itemid() {
        return this.t_itemid;
    }

    public void setT_itemid(String t_itemid) {
        this.t_itemid = t_itemid;
    }

    public UFDateTime getTs() {
        return this.ts;
    }

    public void setTs(UFDateTime ts) {
        this.ts = ts;
    }

    public UFDouble getYbje() {
        return this.ybje;
    }

    public void setYbje(UFDouble ybje) {
        this.ybje = ybje;
    }

    public UFDouble getYbye() {
        return this.ybye;
    }

    public void setYbye(UFDouble ybye) {
        this.ybye = ybye;
    }

    public String getTableName() {
        return "arap_billmap";
    }

    public String getS_billtype() {
        return this.s_billtype;
    }

    public void setS_billtype(String s_billtype) {
        this.s_billtype = s_billtype;
    }

    public UFDouble getOldje() {
        return this.oldje;
    }

    public void setOldje(UFDouble oldje) {
        this.oldje = oldje;
    }

    public int getMaptype() {
        return this.maptype;
    }

    public void setMaptype(int maptype) {
        this.maptype = maptype;
    }

    public String getT_termid() {
        return this.t_termid;
    }

    public void setT_termid(String tTermid) {
        this.t_termid = tTermid;
    }

    public String getS_termid() {
        return this.s_termid;
    }

    public void setS_termid(String sTermid) {
        this.s_termid = sTermid;
    }

    public UFBoolean getIsmanual() {
        return this.ismanual;
    }

    public void setIsmanual(UFBoolean ismanual) {
        this.ismanual = ismanual;
    }
}

