/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pub.workflownote.WorkflownoteVO
 */
package nc.itf.arap.pub;

import java.util.List;
import java.util.Map;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.workflownote.WorkflownoteVO;

public interface IArapBillService {
    public BaseAggVO[] queryArapBillByPKs(String[] var1, String var2) throws BusinessException;

    public BaseAggVO saveArapBill(BaseAggVO var1) throws BusinessException;

    public BaseAggVO[] saveArapBills(BaseAggVO[] var1) throws BusinessException;

    public void deleteArapBill(BaseAggVO var1) throws BusinessException;

    public BaseAggVO saveTempBillForNew(BaseAggVO var1) throws BusinessException;

    public BaseAggVO saveTempBillForEdit(BaseAggVO var1) throws BusinessException;

    public void deleteTempBills(BaseAggVO var1) throws BusinessException;

    public BaseAggVO doBillWriteBack(BaseAggVO var1) throws BusinessException;

    public BaseAggVO pausetransact(BaseAggVO var1) throws BusinessException;

    public BaseAggVO cancelPausetransact(BaseAggVO var1) throws BusinessException;

    public UFBoolean[] checkHasFlowBills(String[] var1, String var2) throws BusinessException;

    public UFBoolean[] checkHasFlowItems(String[] var1) throws BusinessException;

    public UFBoolean[] checkHasPreVerifyLinkBills(String[] var1) throws BusinessException;

    public BaseAggVO doBillPrepay(BaseAggVO var1, List<String> var2) throws BusinessException;

    public void doIsredUpdate(Map<String, String> var1) throws BusinessException;

    public Map<String, Object> queryCustomerMap(String var1, String var2) throws BusinessException;

    public Map<String, String> queryCustomerMapB(String var1) throws BusinessException;

    public WorkflownoteVO[] getNoteVO(String var1, BaseAggVO var2) throws BusinessException;

    public BaseAggVO[] queryArapBillByPKs(String[] var1, String var2, String[] var3, String[] var4) throws BusinessException;

    public BaseBillVO[] getRelateBill(BaseAggVO[] var1) throws BusinessException;
}

