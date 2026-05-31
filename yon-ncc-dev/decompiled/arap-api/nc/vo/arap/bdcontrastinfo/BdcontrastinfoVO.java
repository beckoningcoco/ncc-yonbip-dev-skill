/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.NullFieldException
 *  nc.vo.pub.ValidationException
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pub.lang.UFDateTime
 */
package nc.vo.arap.bdcontrastinfo;

import java.util.ArrayList;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.NullFieldException;
import nc.vo.pub.ValidationException;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDateTime;

public class BdcontrastinfoVO
extends CircularlyAccessibleValueObject {
    private static final long serialVersionUID = 6659445572082166447L;
    public String m_pk_bdcontrastinfo;
    public String m_accessclass;
    public String m_bdcode;
    public String m_bdname;
    public Integer m_bdtype;
    public String m_budgetconst;
    public String m_codefieldname;
    public String m_corpfieldname;
    public Integer m_dr;
    public UFBoolean m_isdef;
    public UFBoolean m_isselfref;
    public String m_namefieldname;
    public String m_pk_bdinfo;
    public String m_pk_corp;
    public String m_pk_defdef;
    public String m_refnodename;
    public String m_refsystem;
    public String m_reserved1;
    public String m_reserved2;
    public String m_selfrefclass;
    public String m_tablename;
    public String m_tablepkname;
    public UFDateTime m_ts;
    public String m_att_fld;
    public String m_att_fld_desc;
    public String m_bdinfo_type;
    public String m_bill_type;
    public String m_busi_type;
    public String m_busisys_id;
    public String m_busisys_name;
    public UFBoolean isLevelControl;

    public BdcontrastinfoVO() {
    }

    public BdcontrastinfoVO(String newPk_bdcontrastinfo) {
        this.m_pk_bdcontrastinfo = newPk_bdcontrastinfo;
    }

    public Object clone() {
        Object o = null;
        try {
            o = super.clone();
        }
        catch (Exception e) {
            throw new RuntimeException("clone not supported!");
        }
        BdcontrastinfoVO bdcontrastinfo = (BdcontrastinfoVO)((Object)o);
        return bdcontrastinfo;
    }

    public String getEntityName() {
        return "Bdcontrastinfo";
    }

    public String getPrimaryKey() {
        return this.m_pk_bdcontrastinfo;
    }

    public void setPrimaryKey(String newPk_bdcontrastinfo) {
        this.m_pk_bdcontrastinfo = newPk_bdcontrastinfo;
    }

    public String getPk_bdcontrastinfo() {
        return this.m_pk_bdcontrastinfo;
    }

    public String getAccessclass() {
        return this.m_accessclass;
    }

    public String getBdcode() {
        return this.m_bdcode;
    }

    public String getBdname() {
        return this.m_bdname;
    }

    public Integer getBdtype() {
        return this.m_bdtype;
    }

    public String getBudgetconst() {
        return this.m_budgetconst;
    }

    public String getCodefieldname() {
        return this.m_codefieldname;
    }

    public String getCorpfieldname() {
        return this.m_corpfieldname;
    }

    public Integer getDr() {
        return this.m_dr;
    }

    public UFBoolean getIsdef() {
        return this.m_isdef;
    }

    public UFBoolean getIsselfref() {
        return this.m_isselfref;
    }

    public String getNamefieldname() {
        return this.m_namefieldname;
    }

    public String getPk_bdinfo() {
        return this.m_pk_bdinfo;
    }

    public String getPk_corp() {
        return this.m_pk_corp;
    }

    public String getPk_defdef() {
        return this.m_pk_defdef;
    }

    public String getRefnodename() {
        return this.m_refnodename;
    }

    public String getRefsystem() {
        return this.m_refsystem;
    }

    public String getReserved1() {
        return this.m_reserved1;
    }

    public String getReserved2() {
        return this.m_reserved2;
    }

    public String getSelfrefclass() {
        return this.m_selfrefclass;
    }

    public String getTablename() {
        return this.m_tablename;
    }

    public String getTablepkname() {
        return this.m_tablepkname;
    }

    public UFDateTime getTs() {
        return this.m_ts;
    }

    public String getAtt_fld() {
        return this.m_att_fld;
    }

    public String getAtt_fld_desc() {
        return this.m_att_fld_desc;
    }

    public String getBdinfo_type() {
        return this.m_bdinfo_type;
    }

    public String getBill_type() {
        return this.m_bill_type;
    }

    public String getBusi_type() {
        return this.m_busi_type;
    }

    public String getBusisys_id() {
        return this.m_busisys_id;
    }

    public String getBusisys_name() {
        return this.m_busisys_name;
    }

    public void setPk_bdcontrastinfo(String newPk_bdcontrastinfo) {
        this.m_pk_bdcontrastinfo = newPk_bdcontrastinfo;
    }

    public void setAccessclass(String newAccessclass) {
        this.m_accessclass = newAccessclass;
    }

    public void setBdcode(String newBdcode) {
        this.m_bdcode = newBdcode;
    }

    public void setBdname(String newBdname) {
        this.m_bdname = newBdname;
    }

    public void setBdtype(Integer newBdtype) {
        this.m_bdtype = newBdtype;
    }

    public void setBudgetconst(String newBudgetconst) {
        this.m_budgetconst = newBudgetconst;
    }

    public void setCodefieldname(String newCodefieldname) {
        this.m_codefieldname = newCodefieldname;
    }

    public void setCorpfieldname(String newCorpfieldname) {
        this.m_corpfieldname = newCorpfieldname;
    }

    public void setDr(Integer newDr) {
        this.m_dr = newDr;
    }

    public void setIsdef(UFBoolean newIsdef) {
        this.m_isdef = newIsdef;
    }

    public void setIsselfref(UFBoolean newIsselfref) {
        this.m_isselfref = newIsselfref;
    }

    public void setNamefieldname(String newNamefieldname) {
        this.m_namefieldname = newNamefieldname;
    }

    public void setPk_bdinfo(String newPk_bdinfo) {
        this.m_pk_bdinfo = newPk_bdinfo;
    }

    public void setPk_corp(String newPk_corp) {
        this.m_pk_corp = newPk_corp;
    }

    public void setPk_defdef(String newPk_defdef) {
        this.m_pk_defdef = newPk_defdef;
    }

    public void setRefnodename(String newRefnodename) {
        this.m_refnodename = newRefnodename;
    }

    public void setRefsystem(String newRefsystem) {
        this.m_refsystem = newRefsystem;
    }

    public void setReserved1(String newReserved1) {
        this.m_reserved1 = newReserved1;
    }

    public void setReserved2(String newReserved2) {
        this.m_reserved2 = newReserved2;
    }

    public void setSelfrefclass(String newSelfrefclass) {
        this.m_selfrefclass = newSelfrefclass;
    }

    public void setTablename(String newTablename) {
        this.m_tablename = newTablename;
    }

    public void setTablepkname(String newTablepkname) {
        this.m_tablepkname = newTablepkname;
    }

    public void setTs(UFDateTime newTs) {
        this.m_ts = newTs;
    }

    public void setAtt_fld(String newAtt_fld) {
        this.m_att_fld = newAtt_fld;
    }

    public void setAtt_fld_desc(String newAtt_fld_desc) {
        this.m_att_fld_desc = newAtt_fld_desc;
    }

    public void setBdinfo_type(String newBdinfo_type) {
        this.m_bdinfo_type = newBdinfo_type;
    }

    public void setBill_type(String newBill_type) {
        this.m_bill_type = newBill_type;
    }

    public void setBusi_type(String newBusi_type) {
        this.m_busi_type = newBusi_type;
    }

    public void setBusisys_id(String newBusisys_id) {
        this.m_busisys_id = newBusisys_id;
    }

    public void setBusisys_name(String newBusisys_name) {
        this.m_busisys_name = newBusisys_name;
    }

    public void validate() throws ValidationException {
        ArrayList<String> errFields = new ArrayList<String>();
        if (this.m_pk_bdcontrastinfo == null) {
            errFields.add("m_pk_bdcontrastinfo");
        }
        if (this.m_bdcode == null) {
            errFields.add("m_bdcode");
        }
        if (this.m_bdname == null) {
            errFields.add("m_bdname");
        }
        if (this.m_pk_bdinfo == null) {
            errFields.add("m_pk_bdinfo");
        }
        if (this.m_pk_corp == null) {
            errFields.add("m_pk_corp");
        }
        StringBuffer message = new StringBuffer();
        String msg = "";
        if (errFields.size() > 0) {
            String[] temp = errFields.toArray(new String[0]);
            msg = msg + temp[0];
            for (int i = 1; i < temp.length; ++i) {
                msg = msg + NCLangRes4VoTransl.getNCLangRes().getStrByID("20060504", "UPP20060504-000276");
                msg = msg + temp[i];
            }
            message.append(NCLangRes4VoTransl.getNCLangRes().getStrByID("20060504", "UPP20060504-000275", null, new String[]{msg}));
            throw new NullFieldException(message.toString());
        }
    }

    public String[] getAttributeNames() {
        return new String[]{"accessclass", "bdcode", "bdname", "bdtype", "budgetconst", "codefieldname", "corpfieldname", "dr", "isdef", "isselfref", "namefieldname", "pk_bdinfo", "pk_corp", "pk_defdef", "refnodename", "refsystem", "reserved1", "reserved2", "selfrefclass", "tablename", "tablepkname", "ts", "att_fld", "att_fld_desc", "bdinfo_type", "bill_type", "busi_type", "busisys_id", "busisys_name"};
    }

    public Object getAttributeValue(String attributeName) {
        if (attributeName.equals("pk_bdcontrastinfo")) {
            return this.m_pk_bdcontrastinfo;
        }
        if (attributeName.equals("accessclass")) {
            return this.m_accessclass;
        }
        if (attributeName.equals("bdcode")) {
            return this.m_bdcode;
        }
        if (attributeName.equals("bdname")) {
            return this.m_bdname;
        }
        if (attributeName.equals("bdtype")) {
            return this.m_bdtype;
        }
        if (attributeName.equals("budgetconst")) {
            return this.m_budgetconst;
        }
        if (attributeName.equals("codefieldname")) {
            return this.m_codefieldname;
        }
        if (attributeName.equals("corpfieldname")) {
            return this.m_corpfieldname;
        }
        if (attributeName.equals("dr")) {
            return this.m_dr;
        }
        if (attributeName.equals("isdef")) {
            return this.m_isdef;
        }
        if (attributeName.equals("isselfref")) {
            return this.m_isselfref;
        }
        if (attributeName.equals("namefieldname")) {
            return this.m_namefieldname;
        }
        if (attributeName.equals("pk_bdinfo")) {
            return this.m_pk_bdinfo;
        }
        if (attributeName.equals("pk_corp")) {
            return this.m_pk_corp;
        }
        if (attributeName.equals("pk_defdef")) {
            return this.m_pk_defdef;
        }
        if (attributeName.equals("refnodename")) {
            return this.m_refnodename;
        }
        if (attributeName.equals("refsystem")) {
            return this.m_refsystem;
        }
        if (attributeName.equals("reserved1")) {
            return this.m_reserved1;
        }
        if (attributeName.equals("reserved2")) {
            return this.m_reserved2;
        }
        if (attributeName.equals("selfrefclass")) {
            return this.m_selfrefclass;
        }
        if (attributeName.equals("tablename")) {
            return this.m_tablename;
        }
        if (attributeName.equals("tablepkname")) {
            return this.m_tablepkname;
        }
        if (attributeName.equals("ts")) {
            return this.m_ts;
        }
        if (attributeName.equals("att_fld")) {
            return this.m_att_fld;
        }
        if (attributeName.equals("att_fld_desc")) {
            return this.m_att_fld_desc;
        }
        if (attributeName.equals("bdinfo_type")) {
            return this.m_bdinfo_type;
        }
        if (attributeName.equals("bill_type")) {
            return this.m_bill_type;
        }
        if (attributeName.equals("busi_type")) {
            return this.m_busi_type;
        }
        if (attributeName.equals("busisys_id")) {
            return this.m_busisys_id;
        }
        if (attributeName.equals("busisys_name")) {
            return this.m_busisys_name;
        }
        return null;
    }

    public void setAttributeValue(String name, Object value) {
        try {
            if (name.equals("pk_bdcontrastinfo")) {
                this.m_pk_bdcontrastinfo = (String)value;
            } else if (name.equals("accessclass")) {
                this.m_accessclass = (String)value;
            } else if (name.equals("bdcode")) {
                this.m_bdcode = (String)value;
            } else if (name.equals("bdname")) {
                this.m_bdname = (String)value;
            } else if (name.equals("bdtype")) {
                this.m_bdtype = (Integer)value;
            } else if (name.equals("budgetconst")) {
                this.m_budgetconst = (String)value;
            } else if (name.equals("codefieldname")) {
                this.m_codefieldname = (String)value;
            } else if (name.equals("corpfieldname")) {
                this.m_corpfieldname = (String)value;
            } else if (name.equals("dr")) {
                this.m_dr = (Integer)value;
            } else if (name.equals("isdef")) {
                this.m_isdef = (UFBoolean)value;
            } else if (name.equals("isselfref")) {
                this.m_isselfref = (UFBoolean)value;
            } else if (name.equals("namefieldname")) {
                this.m_namefieldname = (String)value;
            } else if (name.equals("pk_bdinfo")) {
                this.m_pk_bdinfo = (String)value;
            } else if (name.equals("pk_corp")) {
                this.m_pk_corp = (String)value;
            } else if (name.equals("pk_defdef")) {
                this.m_pk_defdef = (String)value;
            } else if (name.equals("refnodename")) {
                this.m_refnodename = (String)value;
            } else if (name.equals("refsystem")) {
                this.m_refsystem = (String)value;
            } else if (name.equals("reserved1")) {
                this.m_reserved1 = (String)value;
            } else if (name.equals("reserved2")) {
                this.m_reserved2 = (String)value;
            } else if (name.equals("selfrefclass")) {
                this.m_selfrefclass = (String)value;
            } else if (name.equals("tablename")) {
                this.m_tablename = (String)value;
            } else if (name.equals("tablepkname")) {
                this.m_tablepkname = (String)value;
            } else if (name.equals("ts")) {
                this.m_ts = (UFDateTime)value;
            } else if (name.equals("att_fld")) {
                this.m_att_fld = (String)value;
            } else if (name.equals("att_fld_desc")) {
                this.m_att_fld_desc = (String)value;
            } else if (name.equals("bdinfo_type")) {
                this.m_bdinfo_type = (String)value;
            } else if (name.equals("bill_type")) {
                this.m_bill_type = (String)value;
            } else if (name.equals("busi_type")) {
                this.m_busi_type = (String)value;
            } else if (name.equals("busisys_id")) {
                this.m_busisys_id = (String)value;
            } else if (name.equals("busisys_name")) {
                this.m_busisys_name = (String)value;
            }
        }
        catch (ClassCastException e) {
            String msg = NCLangRes4VoTransl.getNCLangRes().getStrByID("20060504", "UPP20060504-000277", null, new String[]{name, "" + value});
            throw new ClassCastException(msg);
        }
    }

    public UFBoolean IsLevelControl() {
        return this.isLevelControl;
    }

    public void setIsLevelControl(UFBoolean isLevelControl) {
        this.isLevelControl = isLevelControl;
    }
}

