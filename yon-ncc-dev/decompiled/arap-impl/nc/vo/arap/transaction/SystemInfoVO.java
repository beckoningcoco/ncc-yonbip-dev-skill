/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.ValidationException
 *  nc.vo.pub.ValueObject
 *  nc.vo.pub.lang.UFDate
 */
package nc.vo.arap.transaction;

import java.util.List;
import nc.vo.pub.ValidationException;
import nc.vo.pub.ValueObject;
import nc.vo.pub.lang.UFDate;

public class SystemInfoVO
extends ValueObject {
    private static final long serialVersionUID = 1738475165565406459L;
    private String m_Sfbz;
    private String m_sProdID;
    private String m_CurSystem;
    private String m_CurDwbm;
    private String m_CurNd;
    private String m_CurQj;
    private UFDate m_CurRq;
    private String m_CurUser;
    private boolean m_HxMode;
    private int m_AgiotageMode;
    private boolean m_HsMode;
    private boolean m_HxSeq;
    private boolean m_ZkShow;
    private String m_checkMode1;
    private String m_checkMode2;
    private String m_checkMode3;
    private String m_checkMode4;
    private String m_checkMode5;
    private boolean m_IsMultiV;
    private List<String> bzbm;
    private UFDate clrq;
    private boolean iszgagiotage;
    private String m_latitude;
    private String pk_org;
    private String pk_group;

    public String getPk_group() {
        return this.pk_group;
    }

    public void setPk_group(String pkGroup) {
        this.pk_group = pkGroup;
    }

    public String getPk_org() {
        return this.pk_org;
    }

    public void setPk_org(String pkOrg) {
        this.pk_org = pkOrg;
    }

    public boolean getIszgagiotage() {
        return this.iszgagiotage;
    }

    public void setIszgagiotage(boolean iszgagiotage) {
        this.iszgagiotage = iszgagiotage;
    }

    public List<String> getBzbm() {
        return this.bzbm;
    }

    public void setBzbm(List<String> bzbm) {
        this.bzbm = bzbm;
    }

    public String getCheckMode1() {
        return this.m_checkMode1;
    }

    public String getCheckMode2() {
        return this.m_checkMode2;
    }

    public String getCheckMode3() {
        return this.m_checkMode3;
    }

    public String getCheckMode4() {
        return this.m_checkMode4;
    }

    public String getCheckMode5() {
        return this.m_checkMode5;
    }

    public String getCurDwbm() {
        return this.m_CurDwbm;
    }

    public String getCurNd() {
        return this.m_CurNd;
    }

    public String getCurQj() {
        return this.m_CurQj;
    }

    public UFDate getCurRq() {
        return this.m_CurRq;
    }

    public String getCurSystem() {
        return this.m_CurSystem;
    }

    public String getCurUser() {
        return this.m_CurUser;
    }

    public String getEntityName() {
        return null;
    }

    public boolean getHsMode() {
        return this.m_HsMode;
    }

    public boolean getIsDocument() {
        return this.m_HxMode;
    }

    public int getModeType() {
        return this.m_AgiotageMode;
    }

    public boolean getIsMostEarly() {
        return this.m_HxSeq;
    }

    public boolean getIsMultiV() {
        return this.m_IsMultiV;
    }

    public boolean getIsZkShow() {
        return this.m_ZkShow;
    }

    public String getProdID() {
        return this.m_sProdID;
    }

    public String getSfbz() {
        return this.m_Sfbz;
    }

    public void setAgiotageMode(int mode) {
        this.m_AgiotageMode = mode;
    }

    public void setCheckMode1(String mode1) {
        this.m_checkMode1 = mode1;
    }

    public void setCheckMode2(String mode2) {
        this.m_checkMode2 = mode2;
    }

    public void setCheckMode3(String mode3) {
        this.m_checkMode3 = mode3;
    }

    public void setCheckMode4(String mode4) {
        this.m_checkMode4 = mode4;
    }

    public void setCheckMode5(String mode5) {
        this.m_checkMode5 = mode5;
    }

    public void setCurDwbm(String dwbm) {
        this.m_CurDwbm = dwbm;
    }

    public void setCurNd(String curnd) {
        this.m_CurNd = curnd;
    }

    public void setCurQj(String curqj) {
        this.m_CurQj = curqj;
    }

    public void setCurRq(UFDate currq) {
        this.m_CurRq = currq;
    }

    public void setCurSystem(String system) {
        this.m_CurSystem = system;
    }

    public void setCurUser(String curuser) {
        this.m_CurUser = curuser;
    }

    public void setHsMode(boolean mode) {
        this.m_HsMode = mode;
    }

    public void setHxMode(boolean mode) {
        this.m_HxMode = mode;
    }

    public void setHxSeq(boolean seq) {
        this.m_HxSeq = seq;
    }

    public void setIsMultiV(boolean newIsMultiV) {
        this.m_IsMultiV = newIsMultiV;
    }

    public void setProdID(String id) {
        this.m_sProdID = id;
    }

    public void setSfbz(String sfbz) {
        this.m_Sfbz = sfbz;
    }

    public void setZkShow(boolean show) {
        this.m_ZkShow = show;
    }

    public void validate() throws ValidationException {
    }

    public UFDate getClrq() {
        return this.clrq;
    }

    public void setClrq(UFDate clrq) {
        this.clrq = clrq;
    }

    public String getLatitude() {
        return this.m_latitude;
    }

    public void setLatitude(String mLatitude) {
        this.m_latitude = mLatitude;
    }
}

