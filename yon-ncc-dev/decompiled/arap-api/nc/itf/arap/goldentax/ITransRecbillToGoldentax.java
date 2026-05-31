/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.arap.receivable.ReceivableBillVO
 *  nc.vo.pub.BusinessException
 */
package nc.itf.arap.goldentax;

import java.sql.SQLException;
import nc.vo.arap.goldentax.AggGoldTaxHeadVO;
import nc.vo.arap.receivable.ReceivableBillVO;
import nc.vo.pub.BusinessException;

public interface ITransRecbillToGoldentax {
    public AggGoldTaxHeadVO[] executeVOChangeTogtax(String[] var1) throws BusinessException, SQLException;

    public ReceivableBillVO[] updateWhenExportGoldTax(ReceivableBillVO[] var1) throws BusinessException;
}

