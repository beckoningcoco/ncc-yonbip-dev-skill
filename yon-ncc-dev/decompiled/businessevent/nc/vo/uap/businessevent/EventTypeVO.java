/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.lang.UFDateTime
 */
package nc.vo.uap.businessevent;

import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFDateTime;

public class EventTypeVO
extends SuperVO {
    private String pk_eventtype;
    private String sourceid;
    private String sourcename;
    private String sourcename2;
    private String sourcename3;
    private String sourcename4;
    private String sourcename5;
    private String sourcename6;
    private String owner;
    private String eventtypecode;
    private String eventtypename;
    private String eventtypename2;
    private String eventtypename3;
    private String eventtypename4;
    private String eventtypename5;
    private String eventtypename6;
    private String note;
    private Integer dr = 0;
    private UFDateTime ts;
    public static final String PK_EVENTTYPE = "pk_eventtype";
    public static final String SOURCEID = "sourceid";
    public static final String SOURCENAME = "sourcename";
    public static final String SOURCENAME2 = "sourcename2";
    public static final String SOURCENAME3 = "sourcename3";
    public static final String SOURCENAME4 = "sourcename4";
    public static final String SOURCENAME5 = "sourcename5";
    public static final String SOURCENAME6 = "sourcename6";
    public static final String OWNER = "owner";
    public static final String EVENTTYPECODE = "eventtypecode";
    public static final String EVENTTYPENAME = "eventtypename";
    public static final String EVENTTYPENAME2 = "eventtypename2";
    public static final String EVENTTYPENAME3 = "eventtypename3";
    public static final String EVENTTYPENAME4 = "eventtypename4";
    public static final String EVENTTYPENAME5 = "eventtypename5";
    public static final String EVENTTYPENAME6 = "eventtypename6";
    public static final String NOTE = "note";

    public String getPk_eventtype() {
        return this.pk_eventtype;
    }

    public void setPk_eventtype(String newPk_eventtype) {
        this.pk_eventtype = newPk_eventtype;
    }

    public String getSourceid() {
        return this.sourceid;
    }

    public void setSourceid(String newSourceid) {
        this.sourceid = newSourceid;
    }

    public String getSourcename() {
        return this.sourcename;
    }

    public void setSourcename(String newSourcename) {
        this.sourcename = newSourcename;
    }

    public String getSourcename2() {
        return this.sourcename2;
    }

    public void setSourcename2(String newSourcename2) {
        this.sourcename2 = newSourcename2;
    }

    public String getSourcename3() {
        return this.sourcename3;
    }

    public void setSourcename3(String newSourcename3) {
        this.sourcename3 = newSourcename3;
    }

    public String getSourcename4() {
        return this.sourcename4;
    }

    public void setSourcename4(String newSourcename4) {
        this.sourcename4 = newSourcename4;
    }

    public String getSourcename5() {
        return this.sourcename5;
    }

    public void setSourcename5(String newSourcename5) {
        this.sourcename5 = newSourcename5;
    }

    public String getSourcename6() {
        return this.sourcename6;
    }

    public void setSourcename6(String newSourcename6) {
        this.sourcename6 = newSourcename6;
    }

    public String getOwner() {
        return this.owner;
    }

    public void setOwner(String newOwner) {
        this.owner = newOwner;
    }

    public String getEventtypecode() {
        return this.eventtypecode;
    }

    public void setEventtypecode(String newEventtypecode) {
        this.eventtypecode = newEventtypecode;
    }

    public String getEventtypename() {
        return this.eventtypename;
    }

    public void setEventtypename(String newEventtypename) {
        this.eventtypename = newEventtypename;
    }

    public String getEventtypename2() {
        return this.eventtypename2;
    }

    public void setEventtypename2(String newEventtypename2) {
        this.eventtypename2 = newEventtypename2;
    }

    public String getEventtypename3() {
        return this.eventtypename3;
    }

    public void setEventtypename3(String newEventtypename3) {
        this.eventtypename3 = newEventtypename3;
    }

    public String getEventtypename4() {
        return this.eventtypename4;
    }

    public void setEventtypename4(String newEventtypename4) {
        this.eventtypename4 = newEventtypename4;
    }

    public String getEventtypename5() {
        return this.eventtypename5;
    }

    public void setEventtypename5(String newEventtypename5) {
        this.eventtypename5 = newEventtypename5;
    }

    public String getEventtypename6() {
        return this.eventtypename6;
    }

    public void setEventtypename6(String newEventtypename6) {
        this.eventtypename6 = newEventtypename6;
    }

    public String getNote() {
        return this.note;
    }

    public void setNote(String newNote) {
        this.note = newNote;
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
        return PK_EVENTTYPE;
    }

    public String getTableName() {
        return "pub_eventtype";
    }

    public static String getDefaultTableName() {
        return "pub_eventtype";
    }
}

