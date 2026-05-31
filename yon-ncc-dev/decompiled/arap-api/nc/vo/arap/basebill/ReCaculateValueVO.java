/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.lang.UFDouble
 */
package nc.vo.arap.basebill;

import java.io.Serializable;
import nc.vo.arap.utils.StringUtil;
import nc.vo.pub.lang.UFDouble;

public class ReCaculateValueVO
implements Serializable {
    private static final long serialVersionUID = 6211200646122497553L;
    private String pk_group = null;
    private String pk_org = null;
    private String climittypeid = null;
    private String cprodlineid = null;
    private String vtrantypecode = null;
    private String cchanneltypeid = null;
    private String csaleorgid = null;
    private String cdeptid = null;
    private String cemployeeid = null;
    private String ccustomerid = null;
    private String corigcurrencyid = null;
    private UFDouble nestarmny = null;
    private UFDouble narmny = null;
    private UFDouble nnoverifymny = null;
    private UFDouble mny = null;
    public static UFDouble ZERO = new UFDouble(0);
    private String[] keys = new String[]{"pk_group", "pk_org", "climittypeid", "cprodlineid", "vtrantypecode", "cchanneltypeid", "csaleorgid", "cdeptid", "cemployeeid", "ccustomerid", "corigcurrencyid", "nestarmny", "narmny", "nnoverifymny"};

    public String[] getAttributeNames() {
        return this.keys;
    }

    public void setAttributeValues(String key, Object value) {
        if (key.equals("pk_group")) {
            this.pk_group = value.toString();
        } else if (key.equals("pk_org")) {
            this.pk_org = value.toString();
        } else if (key.equals("climittypeid")) {
            this.climittypeid = value.toString();
        } else if (key.equals("cprodlineid")) {
            this.cprodlineid = value.toString();
        } else if (key.equals("vtrantypecode")) {
            this.vtrantypecode = value.toString();
        } else if (key.equals("cchanneltypeid")) {
            this.cchanneltypeid = value.toString();
        } else if (key.equals("csaleorgid")) {
            this.csaleorgid = value.toString();
        } else if (key.equals("cdeptid")) {
            this.cdeptid = value.toString();
        } else if (key.equals("cemployeeid")) {
            this.cemployeeid = value.toString();
        } else if (key.equals("ccustomerid")) {
            this.ccustomerid = value.toString();
        } else if (key.equals("corigcurrencyid")) {
            this.corigcurrencyid = value.toString();
        } else if (key.equals("nestarmny")) {
            this.nestarmny = new UFDouble(value.toString());
        } else if (key.equals("narmny")) {
            this.narmny = new UFDouble(value.toString());
        } else if (key.equals("nnoverifymny")) {
            this.nnoverifymny = new UFDouble(value.toString());
        } else {
            this.mny = new UFDouble(value.toString());
        }
    }

    public Object getAttributeValues(String key) {
        if (key.equals("pk_group")) {
            return this.pk_group;
        }
        if (key.equals("pk_org")) {
            return this.pk_org;
        }
        if (key.equals("climittypeid")) {
            return this.climittypeid;
        }
        if (key.equals("cprodlineid")) {
            return this.cprodlineid;
        }
        if (key.equals("vtrantypecode")) {
            return this.vtrantypecode;
        }
        if (key.equals("cchanneltypeid")) {
            return this.cchanneltypeid;
        }
        if (key.equals("csaleorgid")) {
            return this.csaleorgid;
        }
        if (key.equals("cdeptid")) {
            return this.cdeptid;
        }
        if (key.equals("cemployeeid")) {
            return this.cemployeeid;
        }
        if (key.equals("ccustomerid")) {
            return this.ccustomerid;
        }
        if (key.equals("corigcurrencyid")) {
            return this.corigcurrencyid;
        }
        if (key.equals("nestarmny")) {
            return this.nestarmny;
        }
        if (key.equals("narmny")) {
            return this.narmny;
        }
        if (key.equals("nnoverifymny")) {
            return this.nnoverifymny;
        }
        return this.mny;
    }

    public String getKey() {
        return StringUtil.dealNullString(this.pk_group) + StringUtil.dealNullString(this.pk_org) + StringUtil.dealNullString(this.climittypeid) + StringUtil.dealNullString(this.cprodlineid) + StringUtil.dealNullString(this.vtrantypecode) + StringUtil.dealNullString(this.cchanneltypeid) + StringUtil.dealNullString(this.csaleorgid) + StringUtil.dealNullString(this.cdeptid) + StringUtil.dealNullString(this.cemployeeid) + StringUtil.dealNullString(this.ccustomerid) + StringUtil.dealNullString(this.corigcurrencyid);
    }
}

