/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.pub.pa.customquery;

import nc.vo.pub.pa.customquery.AlertQueryTypeEnum;

public interface IAlertQueryDef {
    public String getPk_alertquery();

    public String getQuery_type();

    public AlertQueryTypeEnum getQuery_typeEnum();
}

