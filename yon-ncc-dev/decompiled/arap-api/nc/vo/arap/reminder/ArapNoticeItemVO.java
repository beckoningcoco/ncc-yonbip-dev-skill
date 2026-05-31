/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.arap.basebill.BaseItemVO
 *  nc.vo.pub.IVOMeta
 *  nc.vo.pub.lang.UFDateTime
 *  nc.vo.pub.lang.UFDouble
 *  nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory
 */
package nc.vo.arap.reminder;

import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.pub.IVOMeta;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory;

public class ArapNoticeItemVO
extends BaseItemVO {
    private static final long serialVersionUID = 1L;
    private String pk_notice;
    private String beizhu;
    private UFDouble startvalue;
    private UFDouble endvalue;
    private String notice;
    private String pk_notice_b;
    private Integer propertyid;
    private Integer dr = 0;
    private UFDateTime ts;
    public static final String PK_NOTICE = "pk_notice";
    public static final String BEIZHU = "beizhu";
    public static final String STARTVALUE = "startvalue";
    public static final String ENDVALUE = "endvalue";
    public static final String NOTICE = "notice";
    public static final String PK_NOTICE_B = "pk_notice_b";
    public static final String PROPERTYID = "propertyid";

    public String getPk_notice() {
        return this.pk_notice;
    }

    public void setPk_notice(String newPk_notice) {
        this.pk_notice = newPk_notice;
    }

    public String getBeizhu() {
        return this.beizhu;
    }

    public void setBeizhu(String newBeizhu) {
        this.beizhu = newBeizhu;
    }

    public UFDouble getStartvalue() {
        return this.startvalue;
    }

    public void setStartvalue(UFDouble newStartvalue) {
        this.startvalue = newStartvalue;
    }

    public UFDouble getEndvalue() {
        return this.endvalue;
    }

    public void setEndvalue(UFDouble newEndvalue) {
        this.endvalue = newEndvalue;
    }

    public String getNotice() {
        return this.notice;
    }

    public void setNotice(String newNotice) {
        this.notice = newNotice;
    }

    public String getPk_notice_b() {
        return this.pk_notice_b;
    }

    public void setPk_notice_b(String newPk_notice_b) {
        this.pk_notice_b = newPk_notice_b;
    }

    public Integer getPropertyid() {
        return this.propertyid;
    }

    public void setPropertyid(Integer newPropertyid) {
        this.propertyid = newPropertyid;
    }

    public Integer getDr() {
        return this.dr;
    }

    public void setDr(Integer newDr) {
        this.dr = newDr;
    }

    public UFDateTime getTs() {
        return this.ts;
    }

    public void setTs(UFDateTime newTs) {
        this.ts = newTs;
    }

    public String getParentPKFieldName() {
        return PK_NOTICE;
    }

    public String getPKFieldName() {
        return PK_NOTICE_B;
    }

    public String getTableName() {
        return "arap_notice_b";
    }

    public static String getDefaultTableName() {
        return "arap_notice_b";
    }

    public String getChildrenPK() {
        return PK_NOTICE_B;
    }

    public String getParentPK() {
        return PK_NOTICE;
    }

    public IVOMeta getMetaData() {
        return VOMetaFactory.getInstance().getVOMeta("arap.NoticeItem");
    }

    public void setParentPK(String newParentPK) {
    }

    public void setChildrenPK(String newChildrenPK) {
    }
}

