/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 */
package nc.pubitf.arap.bill;

import java.util.List;
import java.util.Map;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.pf.PFCheckVO;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;

public interface IArapBillPubService {
    public void delete(BaseAggVO[] var1) throws BusinessException;

    public void delete(BaseAggVO var1) throws BusinessException;

    public AggregatedValueObject update(BaseAggVO var1) throws BusinessException;

    public AggregatedValueObject[] update(BaseAggVO[] var1) throws BusinessException;

    public BaseAggVO save(BaseAggVO var1) throws BusinessException;

    public BaseAggVO[] save(BaseAggVO[] var1) throws BusinessException;

    public BaseAggVO[] approve(BaseAggVO[] var1) throws BusinessException;

    public BaseAggVO approve(BaseAggVO var1) throws BusinessException;

    public BaseAggVO tempSave(BaseAggVO var1) throws BusinessException;

    public BaseAggVO[] tempSave(BaseAggVO[] var1) throws BusinessException;

    public boolean messageDrive(PFCheckVO[] var1) throws BusinessException;

    public String validateFlowBillCurr(AggregatedValueObject[] var1);

    public List<String> checkCancelPrintOfficialPrintStatus(BaseAggVO var1, String[] var2) throws BusinessException;

    public Map<String, Map<String, String>> getDeptPsnByOrg(BaseAggVO var1, boolean var2) throws BusinessException;

    public String getBilltypenameOfCurrLang(String var1) throws BusinessException;

    public Map<String, String[]> isFromRedBackBill(Map<String, String[]> var1) throws BusinessException;

    public String getTranstypeApp(String var1) throws BusinessException;

    public Map<String, Map<String, String>> isWriteBackFlow(String var1, String[] var2, String var3) throws BusinessException;

    public List<AggregatedValueObject> getChildConstrByTerm(AggregatedValueObject[] var1) throws BusinessException;
}

