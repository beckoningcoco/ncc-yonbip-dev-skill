/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.lang.UFDateTime
 */
package nc.vo.arap.billconfer;

import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFDateTime;

public class BillconferVO
extends SuperVO {
    private static final long serialVersionUID = -883881998765465222L;
    private String accid;
    private Integer accidflag;
    private String afterclass;
    private Integer docontrol;
    private String pk_accid;
    private String pk_bconfer;
    private String pk_cusmanid;
    private String scomment;
    private String sourcebill;
    private String sourcecorp;
    private Integer sourcesys;
    private String targetbill;
    private String targetcorp;
    private Integer targetsys;
    private UFDateTime ts;
    private Integer dr = 0;
    private String accidname;
    private String sourcebillname;
    private String targetbillname;
    private String pk_accidname;
    private String sourcecorpname;
    private String targetcorpname;
    private String controlTypeName;
    private String receivers;
    private String busitype;
    private String sourceorg;
    private String targetorg;
    private String creator;
    private UFDateTime creationtime;
    private String pk_group;
    private String receiversName;

    public BillconferVO() {
    }

    public BillconferVO(String newPk_bconfer) {
        this.pk_bconfer = newPk_bconfer;
    }

    public String getSourceorg() {
        return this.sourceorg;
    }

    public void setSourceorg(String sourceorg) {
        this.sourceorg = sourceorg;
    }

    public String getTargetorg() {
        return this.targetorg;
    }

    public void setTargetorg(String targetorg) {
        this.targetorg = targetorg;
    }

    public String getCreator() {
        return this.creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public UFDateTime getCreationtime() {
        return this.creationtime;
    }

    public void setCreationtime(UFDateTime creationtime) {
        this.creationtime = creationtime;
    }

    public String getPk_group() {
        return this.pk_group;
    }

    public void setPk_group(String pkGroup) {
        this.pk_group = pkGroup;
    }

    public Object clone() {
        Object o = null;
        try {
            o = super.clone();
        }
        catch (Exception e) {
            throw new RuntimeException("clone not supported!");
        }
        BillconferVO billconfer = (BillconferVO)((Object)o);
        return billconfer;
    }

    public String getParentPKFieldName() {
        return null;
    }

    public String getPKFieldName() {
        return "pk_bconfer";
    }

    public String getTableName() {
        return "arap_billconfer";
    }

    public String getAccid() {
        return this.accid;
    }

    public void setAccid(String accid) {
        this.accid = accid;
    }

    public Integer getAccidflag() {
        return this.accidflag;
    }

    public void setAccidflag(Integer accidflag) {
        this.accidflag = accidflag;
    }

    public String getAccidname() {
        return this.accidname;
    }

    public void setAccidname(String accidname) {
        this.accidname = accidname;
    }

    public String getAfterclass() {
        return this.afterclass;
    }

    public void setAfterclass(String afterclass) {
        this.afterclass = afterclass;
    }

    public Integer getDocontrol() {
        return this.docontrol;
    }

    public void setDocontrol(Integer docontrol) {
        this.docontrol = docontrol;
        if (docontrol != null) {
            int iControl = this.getDocontrol();
            if (iControl == 0) {
                this.setControlTypeName(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0128"));
            } else {
                this.setControlTypeName(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0549"));
            }
        } else {
            this.setControlTypeName(null);
        }
    }

    public Integer getDr() {
        return this.dr;
    }

    public void setDr(Integer dr) {
        this.dr = dr;
    }

    public String getPk_accid() {
        return this.pk_accid;
    }

    public void setPk_accid(String pk_accid) {
        this.pk_accid = pk_accid;
    }

    public String getPk_accidname() {
        return this.pk_accidname;
    }

    public void setPk_accidname(String pk_accidname) {
        this.pk_accidname = pk_accidname;
    }

    public String getPk_bconfer() {
        return this.pk_bconfer;
    }

    public void setPk_bconfer(String pk_bconfer) {
        this.pk_bconfer = pk_bconfer;
    }

    public String getPk_cusmanid() {
        return this.pk_cusmanid;
    }

    public void setPk_cusmanid(String pk_cusmanid) {
        this.pk_cusmanid = pk_cusmanid;
    }

    public String getScomment() {
        return this.scomment;
    }

    public void setScomment(String scomment) {
        this.scomment = scomment;
    }

    public String getSourcebill() {
        return this.sourcebill;
    }

    public void setSourcebill(String sourcebill) {
        this.sourcebill = sourcebill;
    }

    public String getSourcebillname() {
        return this.sourcebillname;
    }

    public void setSourcebillname(String sourcebillname) {
        this.sourcebillname = sourcebillname;
    }

    public String getSourcecorp() {
        return this.sourcecorp;
    }

    public void setSourcecorp(String sourcecorp) {
        this.sourcecorp = sourcecorp;
    }

    public String getSourcecorpname() {
        return this.sourcecorpname;
    }

    public void setSourcecorpname(String sourcecorpname) {
        this.sourcecorpname = sourcecorpname;
    }

    public Integer getSourcesys() {
        return this.sourcesys;
    }

    public void setSourcesys(Integer sourcesys) {
        this.sourcesys = sourcesys;
    }

    public String getTargetbill() {
        return this.targetbill;
    }

    public void setTargetbill(String targetbill) {
        this.targetbill = targetbill;
    }

    public String getTargetbillname() {
        return this.targetbillname;
    }

    public void setTargetbillname(String targetbillname) {
        this.targetbillname = targetbillname;
    }

    public String getTargetcorp() {
        return this.targetcorp;
    }

    public void setTargetcorp(String targetcorp) {
        this.targetcorp = targetcorp;
    }

    public String getTargetcorpname() {
        return this.targetcorpname;
    }

    public void setTargetcorpname(String targetcorpname) {
        this.targetcorpname = targetcorpname;
    }

    public Integer getTargetsys() {
        return this.targetsys;
    }

    public void setTargetsys(Integer targetsys) {
        this.targetsys = targetsys;
    }

    public UFDateTime getTs() {
        return this.ts;
    }

    public void setTs(UFDateTime ts) {
        this.ts = ts;
    }

    public String getControlTypeName() {
        return this.controlTypeName;
    }

    public void setControlTypeName(String controlTypeName) {
        this.controlTypeName = controlTypeName;
    }

    public String getReceivers() {
        return this.receivers;
    }

    public void setReceivers(String receivers) {
        this.receivers = receivers;
    }

    public String getBusitype() {
        return this.busitype;
    }

    public void setBusitype(String busitype) {
        this.busitype = busitype;
    }

    public String getReceiversName() {
        return this.receiversName;
    }

    public void setReceiversName(String receiversName) {
        this.receiversName = receiversName;
    }
}

