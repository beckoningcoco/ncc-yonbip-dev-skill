/*
 * Decompiled with CFR 0.152.
 */
package nc.web.arap.foroutsystem.info;

import java.io.Serializable;

public class SendInvoiceInfo
implements Serializable {
    private static final long serialVersionUID = 1L;
    private String src_pk_org;
    private String src_spr;
    private String src_billno;
    private String src_billid;
    private String src_billtypeid;
    private String src_billtype;
    private String src_tradetypeid;
    private String src_tradetype;

    public String getSrc_pk_org() {
        return this.src_pk_org;
    }

    public void setSrc_pk_org(String src_pk_org) {
        this.src_pk_org = src_pk_org;
    }

    public String getSrc_spr() {
        return this.src_spr;
    }

    public void setSrc_spr(String src_spr) {
        this.src_spr = src_spr;
    }

    public String getSrc_billno() {
        return this.src_billno;
    }

    public void setSrc_billno(String src_billno) {
        this.src_billno = src_billno;
    }

    public String getSrc_billid() {
        return this.src_billid;
    }

    public void setSrc_billid(String src_billid) {
        this.src_billid = src_billid;
    }

    public String getSrc_billtypeid() {
        return this.src_billtypeid;
    }

    public void setSrc_billtypeid(String src_billtypeid) {
        this.src_billtypeid = src_billtypeid;
    }

    public String getSrc_billtype() {
        return this.src_billtype;
    }

    public void setSrc_billtype(String src_billtype) {
        this.src_billtype = src_billtype;
    }

    public String getSrc_tradetypeid() {
        return this.src_tradetypeid;
    }

    public void setSrc_tradetypeid(String src_tradetypeid) {
        this.src_tradetypeid = src_tradetypeid;
    }

    public String getSrc_tradetype() {
        return this.src_tradetype;
    }

    public void setSrc_tradetype(String src_tradetype) {
        this.src_tradetype = src_tradetype;
    }
}

