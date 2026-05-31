/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pubapp.pattern.pub.MapList
 */
package nc.vo.arap.bill.util;

import java.util.HashMap;
import java.util.Map;
import nc.vo.arap.basebill.IH2BMapping;
import nc.vo.pubapp.pattern.pub.MapList;

public class ArapH2BMapping
implements IH2BMapping {
    protected Map<String, String> htob = null;
    protected Map<String, String> version = null;
    protected MapList<String, String> otherOrgs = null;

    @Override
    public Map<String, String> getHTOBMap() {
        if (null == this.htob) {
            this.htob = new HashMap<String, String>();
            this.htob.put("pk_tradetype", "pk_tradetype");
            this.htob.put("billdate", "billdate");
            this.htob.put("pk_org", "pk_org");
            this.htob.put("pk_group", "pk_group");
            this.htob.put("pk_fiorg", "pk_fiorg");
            this.htob.put("pk_pcorg", "pk_pcorg");
            this.htob.put("sett_org_v", "sett_org_v");
            this.htob.put("sett_org", "sett_org");
            this.htob.put("pk_billtype", "pk_billtype");
            this.htob.put("pk_tradetype", "pk_tradetype");
            this.htob.put("billclass", "billclass");
            this.htob.put("rate", "rate");
            this.htob.put("grouprate", "grouprate");
            this.htob.put("globalrate", "globalrate");
            this.htob.put("payaccount", "payaccount");
            this.htob.put("recaccount", "recaccount");
            this.htob.put("cashaccount", "cashaccount");
            this.htob.put("objtype", "objtype");
            this.htob.put("payman", "payman");
            this.htob.put("pk_rescenter", "pk_rescenter");
            this.htob.put("pk_group", "pk_group");
            this.htob.put("checkelement", "checkelement");
            this.htob.put("pk_deptid", "pk_deptid");
            this.htob.put("pk_deptid_v", "pk_deptid_v");
            this.htob.put("pk_psndoc", "pk_psndoc");
            this.htob.put("customer", "customer");
            this.htob.put("supplier", "supplier");
            this.htob.put("pu_org", "pu_org");
            this.htob.put("pu_org_v", "pu_org_v");
            this.htob.put("pk_balatype", "pk_balatype");
            this.htob.put("pk_org_v", "pk_org_v");
            this.htob.put("pk_fiorg_v", "pk_fiorg_v");
            this.htob.put("pk_pcorg_v", "pk_pcorg_v");
            this.htob.put("so_org", "so_org");
            this.htob.put("so_org_v", "so_org_v");
            this.htob.put("cashitem", "cashitem");
            this.htob.put("bankrollprojet", "bankrollprojet");
            this.htob.put("pk_subjcode", "pk_subjcode");
            this.htob.put("so_psndoc", "so_psndoc");
            this.htob.put("pu_psndoc", "pu_psndoc");
            this.htob.put("so_deptid", "so_deptid");
            this.htob.put("pu_deptid", "pu_deptid");
            this.htob.put("so_deptid_v", "so_deptid_v");
            this.htob.put("pu_deptid_v", "pu_deptid_v");
            this.htob.put("busidate", "busidate");
            this.htob.put("ordercubasdoc", "ordercubasdoc");
            this.htob.put("costcenter", "costcenter");
            this.htob.put("payreason", "payreason");
            this.htob.put("invoiceno", "invoiceno");
            this.htob.put("pk_currtype", "pk_currtype");
            this.htob.put("supplier_v", "supplier_v");
            this.htob.put("customer_v", "customer_v");
            this.htob.put("ordercubasdoc_v", "ordercubasdoc_v");
            this.htob.put("pk_ratetype", "pk_ratetype");
            this.htob.put("ratedate", "ratedate");
        }
        return this.htob;
    }

    @Override
    public Map<String, String> getVERMap() {
        if (null == this.version) {
            this.version = new HashMap<String, String>();
            this.version.put("pu_deptid", "pu_deptid_v");
            this.version.put("pk_fiorg", "pk_fiorg_v");
            this.version.put("so_deptid", "so_deptid_v");
            this.version.put("pk_pcorg", "pk_pcorg_v");
            this.version.put("pk_org", "pk_org_v");
            this.version.put("pu_org", "pu_org_v");
            this.version.put("so_org", "so_org_v");
            this.version.put("sett_org", "sett_org_v");
            this.version.put("pk_deptid", "pk_deptid_v");
            this.version.put("customer", "customer_v");
            this.version.put("supplier", "supplier_v");
            this.version.put("ordercubasdoc", "ordercubasdoc_v");
            HashMap<String, String> copy = new HashMap<String, String>(this.version);
            for (String key : copy.keySet()) {
                this.version.put(this.version.get(key), key);
            }
        }
        return this.version;
    }

    @Override
    public MapList<String, String> getOtherOrgMap() {
        if (null == this.otherOrgs) {
            this.otherOrgs = new MapList();
            this.otherOrgs.put((Object)"pu_org_v", (Object)"pu_deptid_v");
            this.otherOrgs.put((Object)"pu_org_v", (Object)"pu_psndoc");
            this.otherOrgs.put((Object)"pk_pcorg_v", (Object)"checkelement");
            this.otherOrgs.put((Object)"so_org_v", (Object)"so_deptid_v");
            this.otherOrgs.put((Object)"so_org_v", (Object)"so_psndoc");
            this.otherOrgs.put((Object)"pu_deptid_v", (Object)"pu_psndoc");
            this.otherOrgs.put((Object)"so_deptid_v", (Object)"so_deptid");
            this.otherOrgs.put((Object)"pk_org_v", (Object)"so_org_v");
            this.otherOrgs.put((Object)"pk_org_v", (Object)"pu_org_v");
        }
        return this.otherOrgs;
    }
}

