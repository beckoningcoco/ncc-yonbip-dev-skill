/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.arap.basebill.BaseAggVO
 *  nc.vo.pub.BusinessException
 *  nc.vo.sscivm.ivmpub.InvoiceTypeEnum
 */
package nc.itf.arap.receivable.sscivm;

import java.util.Map;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.pub.BusinessException;
import nc.vo.sscivm.ivmpub.InvoiceTypeEnum;

public interface IInvoiceGenerateService {
    public Map<String, Object> generateInvoice(BaseAggVO[] var1, InvoiceTypeEnum var2, Boolean var3) throws BusinessException;
}

