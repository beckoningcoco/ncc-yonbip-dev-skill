/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.ui.bd.ref.model.AccountDefaultRefModel
 *  nc.vo.bd.account.AccAsoaVO
 *  nc.vo.fipub.freevalue.accountbook.proxy.AccountBookUtil
 */
package nc.ui.arap.ref;

import nc.ui.bd.ref.model.AccountDefaultRefModel;
import nc.vo.bd.account.AccAsoaVO;
import nc.vo.fipub.freevalue.accountbook.proxy.AccountBookUtil;

public class ArapAccountRefModel
extends AccountDefaultRefModel {
    private String pk_accOrg = null;

    public String getPk_accOrg() {
        return this.pk_accOrg;
    }

    public void setPk_accOrg(String pkAccOrg) {
        this.pk_accOrg = pkAccOrg;
    }

    public void setPk_org(String pk_org) {
        if (pk_org == null || pk_org.equals(this.getPk_accOrg())) {
            return;
        }
        this.setPk_accOrg(pk_org);
        String pk_accbook = AccountBookUtil.getDefaultPk_AccountingBook((String)pk_org);
        this.setPara(new String[]{pk_accbook, "9999-99-99"}, true);
    }

    public String getRefShowNameField() {
        return AccAsoaVO.getDefaultTableName() + "." + "dispname";
    }
}

