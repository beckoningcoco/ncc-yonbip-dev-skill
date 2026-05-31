/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pub.lang.UFDateTime
 */
package nc.vo.uap.businessevent;

import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDateTime;

public class EventListenerVO
extends SuperVO {
    private String pk_eventlistener;
    private String pk_eventtype;
    private String name;
    private String name2;
    private String name3;
    private String name4;
    private String name5;
    private String name6;
    private String implclassname;
    private String owner;
    private String note;
    private Integer operindex;
    private UFBoolean enabled;
    private String localtype;
    private String industrytype;
    private String listenertype;
    private Integer dr = 0;
    private UFDateTime ts;
    public static final String PK_EVENTLISTENER = "pk_eventlistener";
    public static final String PK_EVENTTYPE = "pk_eventtype";
    public static final String NAME = "name";
    public static final String NAME2 = "name2";
    public static final String NAME3 = "name3";
    public static final String NAME4 = "name4";
    public static final String NAME5 = "name5";
    public static final String NAME6 = "name6";
    public static final String IMPLCLASSNAME = "implclassname";
    public static final String OWNER = "owner";
    public static final String NOTE = "note";
    public static final String OPERINDEX = "operindex";
    public static final String ENABLED = "enabled";
    public static final String LOCALTYPE = "localtype";
    public static final String INDUSTRYTYPE = "industrytype";
    public static final String LISTENERTYPE = "listenertype";

    public String getPk_eventlistener() {
        return this.pk_eventlistener;
    }

    public void setPk_eventlistener(String newPk_eventlistener) {
        this.pk_eventlistener = newPk_eventlistener;
    }

    public String getPk_eventtype() {
        return this.pk_eventtype;
    }

    public void setPk_eventtype(String newPk_eventtype) {
        this.pk_eventtype = newPk_eventtype;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getName2() {
        return this.name2;
    }

    public void setName2(String newName2) {
        this.name2 = newName2;
    }

    public String getName3() {
        return this.name3;
    }

    public void setName3(String newName3) {
        this.name3 = newName3;
    }

    public String getName4() {
        return this.name4;
    }

    public void setName4(String newName4) {
        this.name4 = newName4;
    }

    public String getName5() {
        return this.name5;
    }

    public void setName5(String newName5) {
        this.name5 = newName5;
    }

    public String getName6() {
        return this.name6;
    }

    public void setName6(String newName6) {
        this.name6 = newName6;
    }

    public String getImplclassname() {
        return this.implclassname;
    }

    public void setImplclassname(String newImplclassname) {
        this.implclassname = newImplclassname;
    }

    public String getOwner() {
        return this.owner;
    }

    public void setOwner(String newOwner) {
        this.owner = newOwner;
    }

    public String getNote() {
        return this.note;
    }

    public void setNote(String newNote) {
        this.note = newNote;
    }

    public Integer getOperindex() {
        return this.operindex;
    }

    public void setOperindex(Integer newOperindex) {
        this.operindex = newOperindex;
    }

    public UFBoolean getEnabled() {
        return this.enabled;
    }

    public void setEnabled(UFBoolean newEnabled) {
        this.enabled = newEnabled;
    }

    public String getLocaltype() {
        return this.localtype;
    }

    public void setLocaltype(String newLocaltype) {
        this.localtype = newLocaltype;
    }

    public String getIndustrytype() {
        return this.industrytype;
    }

    public void setIndustrytype(String newIndustrytype) {
        this.industrytype = newIndustrytype;
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
        return PK_EVENTLISTENER;
    }

    public String getListenertype() {
        return this.listenertype;
    }

    public void setListenertype(String listenertype) {
        this.listenertype = listenertype;
    }

    public String getTableName() {
        return "pub_eventlistener";
    }

    public static String getDefaultTableName() {
        return "pub_eventlistener";
    }
}

