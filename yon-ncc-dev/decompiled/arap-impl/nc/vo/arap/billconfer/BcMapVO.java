/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.lang.UFDateTime
 */
package nc.vo.arap.billconfer;

import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFDateTime;

public class BcMapVO
extends SuperVO {
    private static final long serialVersionUID = 1L;
    private String bcmapid;
    private String src_billtype;
    private String src_billid;
    private String dest_billtype;
    private String dest_billid;
    private String dest_org;
    private Integer dr = 0;
    private UFDateTime ts;
    private String receiver;
    private String message;
    public static final String BCMAPID = "bcmapid";
    public static final String SRC_BILLTYPE = "src_billtype";
    public static final String SRC_BILLID = "src_billid";
    public static final String DEST_BILLTYPE = "dest_billtype";
    public static final String DEST_BILLID = "dest_billid";
    public static final String DEST_ORG = "dest_org";
    public static final String ARAP_BCMAP = "arap_bcmap";

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getReceiver() {
        return this.receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getBcmapid() {
        return this.bcmapid;
    }

    public void setBcmapid(String newBcmapid) {
        this.bcmapid = newBcmapid;
    }

    public String getSrc_billtype() {
        return this.src_billtype;
    }

    public void setSrc_billtype(String newSrc_billtype) {
        this.src_billtype = newSrc_billtype;
    }

    public String getSrc_billid() {
        return this.src_billid;
    }

    public void setSrc_billid(String newSrc_billid) {
        this.src_billid = newSrc_billid;
    }

    public String getDest_billtype() {
        return this.dest_billtype;
    }

    public void setDest_billtype(String newDest_billtype) {
        this.dest_billtype = newDest_billtype;
    }

    public String getDest_billid() {
        return this.dest_billid;
    }

    public void setDest_billid(String newDest_billid) {
        this.dest_billid = newDest_billid;
    }

    public String getDest_org() {
        return this.dest_org;
    }

    public void setDest_org(String dest_org) {
        this.dest_org = dest_org;
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
        return BCMAPID;
    }

    public String getTableName() {
        return ARAP_BCMAP;
    }

    public static String getDefaultTableName() {
        return ARAP_BCMAP;
    }
}

