/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.ui.pub.ButtonObject
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.NullFieldException
 *  nc.vo.pub.ValidationException
 *  nc.vo.pub.lang.UFBoolean
 */
package nc.vo.arap.global;

import java.util.ArrayList;
import nc.ui.pub.ButtonObject;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.NullFieldException;
import nc.vo.pub.ValidationException;
import nc.vo.pub.lang.UFBoolean;

public class BusiTransVO
extends CircularlyAccessibleValueObject {
    private static final long serialVersionUID = 2414713048329576233L;
    public String m_pk_id;
    public String m_syscode;
    public UFBoolean m_isUsed;
    public String m_className;
    public String m_usesyscode;
    public String m_actName;
    public Integer m_iSerial;
    public String m_OpType;
    public Integer m_TransactionType;
    public String m_condClassName;
    public Integer m_version;
    public Integer m_timeTrans;
    public String m_systemname;
    public String m_usesystemname;
    public String m_note;
    public String m_sourcenode;
    public String m_sysname_resourceid;
    public String m_usesysname_resourceid;
    public String m_note_resourceid;
    private Object m_InfClass;
    public ButtonObject m_BtnAssistant;

    public BusiTransVO() {
    }

    public BusiTransVO(String newPk_id) {
        this.m_pk_id = newPk_id;
    }

    public Object clone() {
        Object o = null;
        try {
            o = super.clone();
        }
        catch (Exception e) {
            throw new RuntimeException("clone not supported!");
        }
        BusiTransVO busiTrans = (BusiTransVO)((Object)o);
        return busiTrans;
    }

    public String getActName() {
        return this.m_actName;
    }

    public String[] getAttributeNames() {
        return new String[]{"syscode", "isUsed", "className", "usesyscode", "actName", "iSerial", "OpType", "TransactionType", "condClassName", "version", "timeTrans", "systemname", "usesystemname", "note"};
    }

    public Object getAttributeValue(String attributeName) {
        if (attributeName.equals("pk_id")) {
            return this.m_pk_id;
        }
        if (attributeName.equals("syscode")) {
            return this.m_syscode;
        }
        if (attributeName.equals("isUsed")) {
            return this.m_isUsed;
        }
        if (attributeName.equals("className")) {
            return this.m_className;
        }
        if (attributeName.equals("usesyscode")) {
            return this.m_usesyscode;
        }
        if (attributeName.equals("actName")) {
            return this.m_actName;
        }
        if (attributeName.equals("iSerial")) {
            return this.m_iSerial;
        }
        if (attributeName.equals("OpType")) {
            return this.m_OpType;
        }
        if (attributeName.equals("TransactionType")) {
            return this.m_TransactionType;
        }
        if (attributeName.equals("condClassName")) {
            return this.m_condClassName;
        }
        if (attributeName.equals("version")) {
            return this.m_version;
        }
        if (attributeName.equals("timeTrans")) {
            return this.m_timeTrans;
        }
        if (attributeName.equals("systemname")) {
            return this.m_systemname;
        }
        if (attributeName.equals("usesystemname")) {
            return this.m_usesystemname;
        }
        if (attributeName.equals("note")) {
            return this.m_note;
        }
        return null;
    }

    public ButtonObject getBtnAssistant() {
        return this.m_BtnAssistant;
    }

    public String getClassName() {
        return this.m_className;
    }

    public String getCondClassName() {
        return this.m_condClassName;
    }

    public String getEntityName() {
        return "BusiTrans";
    }

    public Object getInfClass() {
        return this.m_InfClass;
    }

    public Integer getISerial() {
        return this.m_iSerial;
    }

    public UFBoolean getIsUsed() {
        return this.m_isUsed;
    }

    public String getNote() {
        return this.m_note;
    }

    public String getOpType() {
        return this.m_OpType;
    }

    public String getPk_id() {
        return this.m_pk_id;
    }

    public String getPrimaryKey() {
        return this.m_pk_id;
    }

    public String getSyscode() {
        return this.m_syscode;
    }

    public String getSystemname() {
        return this.m_systemname;
    }

    public Integer getTimeTrans() {
        return this.m_timeTrans;
    }

    public Integer getTransactionType() {
        return this.m_TransactionType;
    }

    public String getUsesyscode() {
        return this.m_usesyscode;
    }

    public String getUsesystemname() {
        return this.m_usesystemname;
    }

    public Integer getVersion() {
        return this.m_version;
    }

    public void setActName(String newActName) {
        this.m_actName = newActName;
    }

    public void setAttributeValue(String name, Object value) {
        try {
            if (name.equals("pk_id")) {
                this.m_pk_id = (String)value;
            } else if (name.equals("syscode")) {
                this.m_syscode = (String)value;
            } else if (name.equals("isUsed")) {
                this.m_isUsed = (UFBoolean)value;
            } else if (name.equals("className")) {
                this.m_className = (String)value;
            } else if (name.equals("usesyscode")) {
                this.m_usesyscode = (String)value;
            } else if (name.equals("actName")) {
                this.m_actName = (String)value;
            } else if (name.equals("iSerial")) {
                this.m_iSerial = (Integer)value;
            } else if (name.equals("OpType")) {
                this.m_OpType = (String)value;
            } else if (name.equals("TransactionType")) {
                this.m_TransactionType = (Integer)value;
            } else if (name.equals("condClassName")) {
                this.m_condClassName = (String)value;
            } else if (name.equals("version")) {
                this.m_version = (Integer)value;
            } else if (name.equals("timeTrans")) {
                this.m_timeTrans = (Integer)value;
            } else if (name.equals("systemname")) {
                this.m_systemname = (String)value;
            } else if (name.equals("usesystemname")) {
                this.m_usesystemname = (String)value;
            } else if (name.equals("note")) {
                this.m_note = (String)value;
            }
        }
        catch (ClassCastException e) {
            throw new ClassCastException(NCLangRes4VoTransl.getNCLangRes().getStrByID("200602", "UPP200602-000040") + name + NCLangRes4VoTransl.getNCLangRes().getStrByID("200602", "UPP200602-000041") + value + NCLangRes4VoTransl.getNCLangRes().getStrByID("200602", "UPP200602-000042"));
        }
    }

    public void setBtnAssistant(ButtonObject newBtnAssistant) {
        this.m_BtnAssistant = newBtnAssistant;
    }

    public void setClassName(String newClassName) {
        this.m_className = newClassName;
    }

    public void setCondClassName(String newCondClassName) {
        this.m_condClassName = newCondClassName;
    }

    public void setInfClass(Object newInfClass) {
        this.m_InfClass = newInfClass;
    }

    public void setISerial(Integer newISerial) {
        this.m_iSerial = newISerial;
    }

    public void setIsUsed(UFBoolean newIsUsed) {
        this.m_isUsed = newIsUsed;
    }

    public void setNote(String newNote) {
        this.m_note = newNote;
    }

    public void setOpType(String newOpType) {
        this.m_OpType = newOpType;
    }

    public void setPk_id(String newPk_id) {
        this.m_pk_id = newPk_id;
    }

    public void setPrimaryKey(String newPk_id) {
        this.m_pk_id = newPk_id;
    }

    public void setSyscode(String newSyscode) {
        this.m_syscode = newSyscode;
    }

    public void setSystemname(String newSystemname) {
        this.m_systemname = newSystemname;
    }

    public void setTimeTrans(Integer newTimeTrans) {
        this.m_timeTrans = newTimeTrans;
    }

    public void setTransactionType(Integer newTransactionType) {
        this.m_TransactionType = newTransactionType;
    }

    public void setUsesyscode(String newUsesyscode) {
        this.m_usesyscode = newUsesyscode;
    }

    public void setUsesystemname(String newUsesystemname) {
        this.m_usesystemname = newUsesystemname;
    }

    public void setVersion(Integer newVersion) {
        this.m_version = newVersion;
    }

    public void validate() throws ValidationException {
        ArrayList<String> errFields = new ArrayList<String>();
        if (this.m_pk_id == null) {
            errFields.add("m_pk_id");
        }
        StringBuffer message = new StringBuffer();
        message.append(NCLangRes4VoTransl.getNCLangRes().getStrByID("200602", "UPP200602-000043"));
        if (errFields.size() > 0) {
            String[] temp = errFields.toArray(new String[0]);
            message.append(temp[0]);
            for (int i = 1; i < temp.length; ++i) {
                message.append(NCLangRes4VoTransl.getNCLangRes().getStrByID("200602", "UPP200602-000044"));
                message.append(temp[i]);
            }
            throw new NullFieldException(message.toString());
        }
    }

    public String getNote_resourceid() {
        return this.m_note_resourceid;
    }

    public void setNote_resourceid(String note_resourceid) {
        this.m_note_resourceid = note_resourceid;
    }

    public String getSourcenode() {
        return this.m_sourcenode;
    }

    public void setSourcenode(String sourcenode) {
        this.m_sourcenode = sourcenode;
    }

    public String getSysname_resourceid() {
        return this.m_sysname_resourceid;
    }

    public void setSysname_resourceid(String sysname_resourceid) {
        this.m_sysname_resourceid = sysname_resourceid;
    }

    public String getUsesysname_resourceid() {
        return this.m_usesysname_resourceid;
    }

    public void setUsesysname_resourceid(String usesysname_resourceid) {
        this.m_usesysname_resourceid = usesysname_resourceid;
    }
}

