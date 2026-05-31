/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.NullFieldException
 *  nc.vo.pub.ValidationException
 *  nc.vo.pub.ValueObject
 */
package nc.vo.arap.pub;

import java.util.ArrayList;
import java.util.List;
import nc.vo.arap.pub.QryCondVO;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.NullFieldException;
import nc.vo.pub.ValidationException;
import nc.vo.pub.ValueObject;

public class QryObjectVO
extends ValueObject {
    private static final long serialVersionUID = 721081255531370385L;
    public String m_obj_oid;
    public String m_point;
    public String m_disp_tab;
    public String m_disp_fld;
    public String m_cond_tab;
    public String m_cond_fld;
    public String m_obj_name;
    public Integer m_obj_datatype;
    public String m_refname;
    public Integer m_disp_order;
    public String m_value_tab;
    public String m_value_fld;
    public String m_pk_defdef;
    public String m_bdname;
    public String m_selfrefclass;
    public String m_pk_doclist;
    public String m_pk_bdbdinfo;
    private Integer m_valuetype;
    private List<QryCondVO> condvos = new ArrayList<QryCondVO>();

    public List<QryCondVO> getQryCondvos() {
        return this.condvos;
    }

    public Integer getValueType() {
        return this.m_valuetype;
    }

    public void setValueType(Integer inte) {
        this.m_valuetype = inte;
    }

    public QryObjectVO() {
    }

    public QryObjectVO(String newObj_oid) {
        this.m_obj_oid = newObj_oid;
    }

    public Object clone() {
        Object o = null;
        try {
            o = super.clone();
        }
        catch (Exception e) {
            throw new RuntimeException("clone not supported!");
        }
        QryObjectVO qryobj = (QryObjectVO)((Object)o);
        return qryobj;
    }

    public String getBdInfo() {
        return this.m_bdname;
    }

    public String getBdName() {
        return this.m_bdname;
    }

    public String getCond_fld() {
        return this.m_cond_fld;
    }

    public String getCond_tab() {
        return this.m_cond_tab;
    }

    public String getDisp_fld() {
        return this.m_disp_fld;
    }

    public Integer getDisp_order() {
        return this.m_disp_order;
    }

    public String getDisp_tab() {
        return this.m_disp_tab;
    }

    public String getEntityName() {
        return "Qryobj";
    }

    public Integer getObj_datatype() {
        return this.m_obj_datatype;
    }

    public String getObj_name() {
        return this.m_obj_name;
    }

    public String getObj_oid() {
        return this.m_obj_oid;
    }

    public String getPk_defdef() {
        return this.m_pk_defdef;
    }

    public String getPk_Doclist() {
        return this.m_pk_doclist;
    }

    public String getPoint() {
        return this.m_point;
    }

    public String getPrimaryKey() {
        return this.m_obj_oid;
    }

    public String getRefClass() {
        return this.m_selfrefclass;
    }

    public String getRefname() {
        return this.m_refname;
    }

    public String getValue_fld() {
        return this.m_value_fld;
    }

    public String getValue_tab() {
        return this.m_value_tab;
    }

    public void setBdName(String info) {
        this.m_bdname = info;
    }

    public void setCond_fld(String newCond_fld) {
        this.m_cond_fld = newCond_fld;
    }

    public void setCond_tab(String newCond_tab) {
        this.m_cond_tab = newCond_tab;
    }

    public void setDisp_fld(String newDisp_fld) {
        this.m_disp_fld = newDisp_fld;
    }

    public void setDisp_order(Integer newDisp_order) {
        this.m_disp_order = newDisp_order;
    }

    public void setDisp_tab(String newDisp_tab) {
        this.m_disp_tab = newDisp_tab;
    }

    public void setObj_datatype(Integer newObj_datatype) {
        this.m_obj_datatype = newObj_datatype;
    }

    public void setObj_name(String newObj_name) {
        this.m_obj_name = newObj_name;
    }

    public void setObj_oid(String newObj_oid) {
        this.m_obj_oid = newObj_oid;
    }

    public void setpk_defdef(String newpk_defdef) {
        this.m_pk_defdef = newpk_defdef;
    }

    public void setPk_Doclist(String doclist) {
        this.m_pk_doclist = doclist;
    }

    public void setPoint(String newPoint) {
        this.m_point = newPoint;
    }

    public void setPrimaryKey(String newObj_oid) {
        this.m_obj_oid = newObj_oid;
    }

    public void setRefname(String newRefname) {
        this.m_refname = newRefname;
    }

    public void setselfrefclass(String refclass) {
        this.m_selfrefclass = refclass;
    }

    public void setValue_fld(String newValue_fld) {
        this.m_value_fld = newValue_fld;
    }

    public void setValue_tab(String newValue_tab) {
        this.m_value_tab = newValue_tab;
    }

    public void validate() throws ValidationException {
        ArrayList<String> errFields = new ArrayList<String>();
        if (this.m_obj_oid == null) {
            errFields.add("m_obj_oid");
        }
        if (this.m_point == null) {
            errFields.add("m_point");
        }
        if (this.m_disp_tab == null) {
            errFields.add("m_disp_tab");
        }
        if (this.m_disp_fld == null) {
            errFields.add("m_disp_fld");
        }
        if (this.m_cond_tab == null) {
            errFields.add("m_cond_tab");
        }
        if (this.m_cond_fld == null) {
            errFields.add("m_cond_fld");
        }
        if (this.m_obj_name == null) {
            errFields.add("m_obj_name");
        }
        if (this.m_obj_datatype == null) {
            errFields.add("m_obj_datatype");
        }
        if (this.m_disp_order == null) {
            errFields.add("m_disp_order");
        }
        if (this.m_value_tab == null) {
            errFields.add("m_value_tab");
        }
        if (this.m_value_fld == null) {
            errFields.add("m_value_fld");
        }
        StringBuffer message = new StringBuffer();
        String msg = "";
        if (errFields.size() > 0) {
            String[] temp = errFields.toArray(new String[0]);
            message.append(temp[0]);
            for (int i = 1; i < temp.length; ++i) {
                msg = msg + NCLangRes4VoTransl.getNCLangRes().getStrByID("20060504", "UPP20060504-000276");
                msg = msg + temp[i];
            }
            message.append(NCLangRes4VoTransl.getNCLangRes().getStrByID("20060504", "UPP20060504-000275", null, new String[]{msg}));
            throw new NullFieldException(message.toString());
        }
    }

    public String getPk_bdbdinfo() {
        return this.m_pk_bdbdinfo;
    }

    public void setPk_bdbdinfo(String m_pk_bdbdinfo) {
        this.m_pk_bdbdinfo = m_pk_bdbdinfo;
    }
}

