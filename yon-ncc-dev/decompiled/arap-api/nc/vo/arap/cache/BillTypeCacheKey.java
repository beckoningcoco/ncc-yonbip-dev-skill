/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.arap.cache;

public class BillTypeCacheKey {
    private String billtype;
    private String pk_group;

    public BillTypeCacheKey buildBilltype(String billtype) {
        this.billtype = billtype;
        return this;
    }

    public BillTypeCacheKey buildPkGroup(String pk_group) {
        this.pk_group = pk_group;
        return this;
    }

    public String getKey() {
        return this.billtype + (this.pk_group == null || "".equals(this.pk_group) ? "" : this.pk_group);
    }

    public String getBilltype() {
        return this.billtype;
    }

    public String getPk_group() {
        return this.pk_group;
    }
}

