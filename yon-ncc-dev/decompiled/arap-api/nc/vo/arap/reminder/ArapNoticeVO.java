/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.arap.basebill.BaseBillVO
 *  nc.vo.pub.IVOMeta
 *  nc.vo.pub.lang.UFDateTime
 *  nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory
 */
package nc.vo.arap.reminder;

import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.pub.IVOMeta;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory;

public class ArapNoticeVO
extends BaseBillVO {
    private static final long serialVersionUID = 1L;
    private String beizhu;
    private String code;
    private String name;
    private String pk_org = "";
    private String pk_curr = "";
    private String pk_timecontrol;
    private String pk_notice;
    private Integer type;
    private Integer dr = 0;
    private UFDateTime ts;
    public static final String BEIZHU = "beizhu";
    public static final String CODE = "code";
    public static final String NAME = "name";
    public static final String PK_ORG = "pk_org";
    public static final String PK_CURR = "pk_curr";
    public static final String PK_TIMECONTROL = "pk_timecontrol";
    public static final String PK_NOTICE = "pk_notice";
    public static final String TYPE = "type";

    public String getBeizhu() {
        return this.beizhu;
    }

    public void setBeizhu(String newBeizhu) {
        this.beizhu = newBeizhu;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String newCode) {
        this.code = newCode;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getPk_org() {
        return this.pk_org;
    }

    public void setPk_org(String newPk_org) {
        this.pk_org = newPk_org;
    }

    public String getPk_curr() {
        return this.pk_curr;
    }

    public void setPk_curr(String newPk_curr) {
        this.pk_curr = newPk_curr;
    }

    public String getPk_timecontrol() {
        return this.pk_timecontrol;
    }

    public void setPk_timecontrol(String newPk_timecontrol) {
        this.pk_timecontrol = newPk_timecontrol;
    }

    public String getPk_notice() {
        return this.pk_notice;
    }

    public void setPk_notice(String newPk_notice) {
        this.pk_notice = newPk_notice;
    }

    public Integer getType() {
        return this.type;
    }

    public void setType(Integer newType) {
        this.type = newType;
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
        return null;
    }

    public String getPKFieldName() {
        return PK_NOTICE;
    }

    public String getTableName() {
        return "arap_notice";
    }

    public static String getDefaultTableName() {
        return "arap_notice";
    }

    public IVOMeta getMetaData() {
        return VOMetaFactory.getInstance().getVOMeta("arap.ArapNotice");
    }
}

