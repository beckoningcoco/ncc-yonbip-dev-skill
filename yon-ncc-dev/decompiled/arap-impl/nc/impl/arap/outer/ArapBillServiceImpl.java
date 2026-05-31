/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.actions.ArapBillSaveBatchBSAction
 *  nc.bs.arap.actions.BillDeleteBatchBSAction
 *  nc.bs.arap.actions.BillPrepayBSAction
 *  nc.bs.arap.actions.BillTempSaveBatchAction
 *  nc.bs.arap.actions.BillTmpDelBthBSAction
 *  nc.bs.arap.actions.CancelPauseTransactBSAction
 *  nc.bs.arap.actions.EditTempBillBSAction
 *  nc.bs.arap.actions.PauseTransactBSAction
 *  nc.bs.arap.agiotage.IBusiDataService
 *  nc.bs.arap.bill.ArapBillBO
 *  nc.bs.arap.bill.ArapBillPubUtil
 *  nc.bs.arap.util.SqlUtils
 *  nc.bs.dao.BaseDAO
 *  nc.bs.dao.DAOException
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.logging.Logger
 *  nc.bs.uap.lock.PKLock
 *  nc.bs.uif2.LockFailedException
 *  nc.itf.arap.bill.IArapBillBaseService
 *  nc.itf.arap.pub.IArapBillService
 *  nc.itf.uap.pf.IWorkflowMachine
 *  nc.md.persist.framework.MDPersistenceService
 *  nc.pubitf.cmp.apply.IApplyPubService
 *  nc.pubitf.uapbd.IBankaccPubQueryService
 *  nc.pubitf.uapbd.ICustomerPubService
 *  nc.pubitf.uapbd.ICustomerPubService_C
 *  nc.vo.arap.basebill.BaseAggVO
 *  nc.vo.arap.basebill.BaseBillVO
 *  nc.vo.arap.basebill.BaseItemVO
 *  nc.vo.arap.payable.PayableBillItemVO
 *  nc.vo.arap.payable.PayableBillVO
 *  nc.vo.arap.pfflow.ArapBillMapVO
 *  nc.vo.arap.pub.ArapBillTypeInfo
 *  nc.vo.arap.pub.BillEnumCollection$PreSigns
 *  nc.vo.arap.utils.ARAPModuleEnableUtil
 *  nc.vo.arap.utils.ArrayUtil
 *  nc.vo.bd.cust.CustomerVO
 *  nc.vo.bd.cust.saleinfo.CustsaleVO
 *  nc.vo.fipub.annotation.Business
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pub.workflownote.WorkflownoteVO
 *  nccloud.bs.arap.util.Collections
 *  org.apache.commons.lang3.ArrayUtils
 */
package nc.impl.arap.outer;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import nc.bs.arap.actions.ArapBillSaveBatchBSAction;
import nc.bs.arap.actions.BillDeleteBatchBSAction;
import nc.bs.arap.actions.BillPrepayBSAction;
import nc.bs.arap.actions.BillTempSaveBatchAction;
import nc.bs.arap.actions.BillTmpDelBthBSAction;
import nc.bs.arap.actions.CancelPauseTransactBSAction;
import nc.bs.arap.actions.EditTempBillBSAction;
import nc.bs.arap.actions.PauseTransactBSAction;
import nc.bs.arap.agiotage.IBusiDataService;
import nc.bs.arap.bill.ArapBillBO;
import nc.bs.arap.bill.ArapBillPubUtil;
import nc.bs.arap.util.SqlUtils;
import nc.bs.dao.BaseDAO;
import nc.bs.dao.DAOException;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.framework.common.NCLocator;
import nc.bs.logging.Logger;
import nc.bs.uap.lock.PKLock;
import nc.bs.uif2.LockFailedException;
import nc.itf.arap.bill.IArapBillBaseService;
import nc.itf.arap.pub.IArapBillService;
import nc.itf.uap.pf.IWorkflowMachine;
import nc.md.persist.framework.MDPersistenceService;
import nc.pubitf.cmp.apply.IApplyPubService;
import nc.pubitf.uapbd.IBankaccPubQueryService;
import nc.pubitf.uapbd.ICustomerPubService;
import nc.pubitf.uapbd.ICustomerPubService_C;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.arap.payable.PayableBillItemVO;
import nc.vo.arap.payable.PayableBillVO;
import nc.vo.arap.pfflow.ArapBillMapVO;
import nc.vo.arap.pub.ArapBillTypeInfo;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.arap.utils.ARAPModuleEnableUtil;
import nc.vo.arap.utils.ArrayUtil;
import nc.vo.bd.cust.CustomerVO;
import nc.vo.bd.cust.saleinfo.CustsaleVO;
import nc.vo.fipub.annotation.Business;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.workflownote.WorkflownoteVO;
import nccloud.bs.arap.util.Collections;
import org.apache.commons.lang3.ArrayUtils;

public class ArapBillServiceImpl
implements IArapBillService {
    public void deleteArapBill(BaseAggVO bill) throws BusinessException {
        new BillDeleteBatchBSAction().deleteVOs((AggregatedValueObject[])new BaseAggVO[]{bill});
    }

    public BaseAggVO[] queryArapBillByPKs(String[] pks, String billtype) throws BusinessException {
        return (BaseAggVO[])new ArapBillBO().queryBillByPrimaryKeys(pks, billtype);
    }

    public BaseAggVO saveArapBill(BaseAggVO bill) throws BusinessException {
        ArapBillSaveBatchBSAction billSaveBatchBSAction = new ArapBillSaveBatchBSAction(){};
        return (BaseAggVO)ArrayUtil.getFirstInArrays((Object[])billSaveBatchBSAction.insertVOs(new AggregatedValueObject[]{bill}));
    }

    public BaseAggVO saveTempBillForNew(BaseAggVO bill) throws BusinessException {
        BaseAggVO temp = bill;
        Object[] vos = new BillTempSaveBatchAction().insertVOs(new AggregatedValueObject[]{temp});
        return ((BaseAggVO[])ArrayUtil.convertSupers2Subs((Object[])vos, BaseAggVO.class))[0];
    }

    public BaseAggVO saveTempBillForEdit(BaseAggVO bill) throws BusinessException {
        return (BaseAggVO)new EditTempBillBSAction().updateVO((AggregatedValueObject)bill);
    }

    public void deleteTempBills(BaseAggVO bill) throws BusinessException {
        new BillTmpDelBthBSAction().deleteVOs(new AggregatedValueObject[]{bill});
    }

    public BaseAggVO[] saveArapBills(BaseAggVO[] bills) throws BusinessException {
        BaseAggVO[] array = new BaseAggVO[bills.length];
        for (int i = 1; i < bills.length; ++i) {
            array[i] = this.saveArapBill(bills[i]);
        }
        return array;
    }

    @Business(business="\u57fa\u7840\u5355\u636e", subBusiness="\u7ea2\u51b2", description="\u540e\u53f0\u6267\u884c\u7ea2\u51b2\u52a8\u4f5c\uff0c\u76f4\u63a5\u4fdd\u5b58\u540e\u53f0\u5355\u636e", type="\u6838\u5fc3\u4e1a\u52a1")
    public BaseAggVO doBillWriteBack(BaseAggVO bill) throws BusinessException {
        InvocationInfoProxy info = InvocationInfoProxy.getInstance();
        BaseAggVO writeBackBill = ArapBillPubUtil.getWriteBackBillVO((BaseAggVO)bill, (UFDate)new UFDate(info.getBizDateTime()), (String)info.getUserId());
        ((BaseBillVO)bill.getParentVO()).setIsreded(UFBoolean.TRUE);
        String billtype = (String)writeBackBill.getParentVO().getAttributeValue("pk_billtype");
        Class service = ArapBillTypeInfo.getInstance((Object)billtype).getBillService();
        ((IArapBillBaseService)NCLocator.getInstance().lookup(service)).save(writeBackBill);
        new BaseDAO().updateVO((SuperVO)bill.getParentVO(), new String[]{"isreded"});
        return bill;
    }

    public BaseAggVO cancelPausetransact(BaseAggVO bill) throws BusinessException {
        this.dynamicLock(new AggregatedValueObject[]{bill});
        List<String> items = this.getItemPks(bill, false);
        new CancelPauseTransactBSAction().updateVO((AggregatedValueObject)bill);
        try {
            ((IBusiDataService)NCLocator.getInstance().lookup(IBusiDataService.class)).updateBusiDataStatus(items, false);
        }
        catch (SQLException e) {
            ExceptionHandler.createException((String)e.toString());
        }
        return bill;
    }

    private List<String> getItemPks(BaseAggVO bill, boolean pause) throws BusinessException {
        ArrayList<String> items = new ArrayList<String>();
        ArrayList<CircularlyAccessibleValueObject> items2 = new ArrayList<CircularlyAccessibleValueObject>();
        for (CircularlyAccessibleValueObject item : bill.getChildrenVO()) {
            UFBoolean pausetransact = ((BaseItemVO)item).getPausetransact();
            if (pausetransact == null) {
                pausetransact = UFBoolean.FALSE;
            }
            if (pausetransact.booleanValue() != pause) continue;
            items2.add(item);
            items.add(item.getPrimaryKey());
        }
        return items;
    }

    public BaseAggVO pausetransact(BaseAggVO bill) throws BusinessException {
        this.dynamicLock(new AggregatedValueObject[]{bill});
        List<String> items = this.getItemPks(bill, true);
        CircularlyAccessibleValueObject[] childrenVO = bill.getChildrenVO();
        CircularlyAccessibleValueObject[] clone = (CircularlyAccessibleValueObject[])childrenVO.clone();
        ArrayList<CircularlyAccessibleValueObject> filterItems = new ArrayList<CircularlyAccessibleValueObject>();
        for (int i = 0; i < clone.length; ++i) {
            if (!items.contains(clone[i].getPrimaryKey())) continue;
            filterItems.add(clone[i]);
        }
        SuperVO[] array = filterItems.toArray(new SuperVO[0]);
        bill.setChildrenVO((CircularlyAccessibleValueObject[])array);
        bill.setChildrenVO(childrenVO);
        new PauseTransactBSAction().updateVO((AggregatedValueObject)bill);
        try {
            ((IBusiDataService)NCLocator.getInstance().lookup(IBusiDataService.class)).updateBusiDataStatus(items, true);
        }
        catch (SQLException e) {
            ExceptionHandler.createException((String)e.toString());
        }
        bill.setChildrenVO((CircularlyAccessibleValueObject[])array);
        bill.setChildrenVO(childrenVO);
        return bill;
    }

    public UFBoolean[] checkHasFlowBills(String[] billids, String billtype) throws BusinessException {
        String whereCondStr = null;
        UFBoolean[] result = new UFBoolean[billids.length];
        try {
            whereCondStr = SqlUtils.getInStr((String)"s_billid", (String[])billids, (boolean[])new boolean[]{false}) + " and dr = 0";
            whereCondStr = whereCondStr + " and ismanual<>'Y'";
        }
        catch (SQLException e) {
            ExceptionHandler.createException((String)e.toString());
        }
        Collection ret = new BaseDAO().retrieveByClause(ArapBillMapVO.class, whereCondStr);
        HashMap<String, ArapBillMapVO> map = new HashMap<String, ArapBillMapVO>();
        for (ArapBillMapVO vo : ret) {
            map.put(vo.getS_billid(), vo);
        }
        for (int i = 0; i < billids.length; ++i) {
            result[i] = null != map.get(billids[i]) ? UFBoolean.valueOf((boolean)true) : UFBoolean.valueOf((boolean)false);
            if (!ARAPModuleEnableUtil.isCMPEnable((String)InvocationInfoProxy.getInstance().getGroupId()) || result[i].booleanValue() || !"F1".equals(billtype)) continue;
            result[i] = UFBoolean.valueOf((boolean)((IApplyPubService)NCLocator.getInstance().lookup(IApplyPubService.class)).getAgglyVOS("F1", billids[i]));
        }
        return result;
    }

    public UFBoolean[] checkHasFlowItems(String[] itemids) throws BusinessException {
        String whereCondStr = null;
        UFBoolean[] result = new UFBoolean[itemids.length];
        try {
            whereCondStr = SqlUtils.getInStr((String)"S_ITEMID", (String[])itemids, (boolean[])new boolean[]{false}) + " and dr = 0";
        }
        catch (SQLException e) {
            ExceptionHandler.createException((String)e.toString());
        }
        Collection ret = new BaseDAO().retrieveByClause(ArapBillMapVO.class, whereCondStr);
        HashMap<String, ArapBillMapVO> map = new HashMap<String, ArapBillMapVO>();
        for (ArapBillMapVO vo : ret) {
            map.put(vo.getS_itemid(), vo);
        }
        for (int i = 0; i < itemids.length; ++i) {
            result[i] = null != map.get(itemids[i]) ? UFBoolean.valueOf((boolean)true) : UFBoolean.valueOf((boolean)false);
        }
        return result;
    }

    public BaseAggVO doBillPrepay(BaseAggVO bill, List<String> changedKeys) throws BusinessException {
        BaseAggVO updateVO = (BaseAggVO)new BillPrepayBSAction(changedKeys).updateVO((AggregatedValueObject)bill);
        BaseDAO baseDAO = new BaseDAO();
        String itemInsql = SqlUtils.getInStr((String)"pk_item", (String[])changedKeys.toArray(new String[0]));
        String updatePre = "update arap_termitem set prepay = '" + UFBoolean.TRUE + "' where " + itemInsql;
        this.executeSql(baseDAO, updatePre);
        String busidataPre = "update arap_busidata set prepay=" + BillEnumCollection.PreSigns.ISPRE.VALUE + " where " + itemInsql;
        this.executeSql(baseDAO, busidataPre);
        return updateVO;
    }

    private void executeSql(BaseDAO baseDAO, String sql) throws DAOException {
        baseDAO.executeUpdate(sql);
    }

    public void doIsredUpdate(Map<String, String> redMap) throws BusinessException {
        String[] sqls = new String[redMap.size()];
        int i = 0;
        for (Map.Entry<String, String> redBill : redMap.entrySet()) {
            sqls[i++] = "update " + redBill.getValue() + " set ISREDED = 'Y' where " + redBill.getKey();
        }
        for (String sql : sqls) {
            this.executeSql(new BaseDAO(), sql);
        }
    }

    public Map<String, Object> queryCustomerMap(String pk_customer, String pk_org) throws BusinessException {
        HashMap<String, Object> customerMap = new HashMap<String, Object>();
        CustsaleVO[] custsaleVOs = ((ICustomerPubService_C)NCLocator.getInstance().lookup(ICustomerPubService_C.class)).getCustSaleVO(new String[]{pk_customer}, pk_org, new String[]{"channel"});
        customerMap.put("custsaleVOs", custsaleVOs);
        CustomerVO customerVO = (CustomerVO)MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByPK(CustomerVO.class, pk_customer, false);
        customerMap.put("customerVO", customerVO);
        String cusBankaccs = ((ICustomerPubService)NCLocator.getInstance().lookup(ICustomerPubService.class)).getDefaultBankAcc(pk_customer);
        customerMap.put("cusBankaccs", cusBankaccs);
        Map curr_subAccMap = ((IBankaccPubQueryService)NCLocator.getInstance().lookup(IBankaccPubQueryService.class)).queryBankAccSubByPk(new String[]{"pk_bankaccsub", "pk_currtype"}, new String[]{cusBankaccs});
        if (null != curr_subAccMap && curr_subAccMap.size() > 0) {
            customerMap.put("defaultBankSubAccCurrtype", curr_subAccMap.get(cusBankaccs));
        }
        return customerMap;
    }

    public Map<String, String> queryCustomerMapB(String pk_customer) throws BusinessException {
        HashMap<String, String> customerMapB = new HashMap<String, String>();
        Map country = ((ICustomerPubService)NCLocator.getInstance().lookup(ICustomerPubService.class)).getCountryByCustID(new String[]{pk_customer});
        if (null != country && country.size() > 0) {
            customerMapB.put("rececountryid", (String)country.values().iterator().next());
            String[] vat = ((ICustomerPubService)NCLocator.getInstance().lookup(ICustomerPubService.class)).getVatcodeByCustomerCountry(new String[]{pk_customer}, new String[]{(String)country.values().iterator().next()});
            if (null != vat && vat.length > 0) {
                customerMapB.put("custvatcode", vat[0]);
            }
        }
        return customerMapB;
    }

    public String dynamicLock(AggregatedValueObject ... bills) throws BusinessException {
        String[] pks = new String[bills.length];
        int size = pks.length;
        for (int i = 0; i < size; ++i) {
            pks[i] = bills[i].getParentVO().getPrimaryKey();
        }
        if (!PKLock.getInstance().addBatchDynamicLock(pks)) {
            throw new LockFailedException(pks);
        }
        return null;
    }

    public UFBoolean[] checkHasPreVerifyLinkBills(String[] billids) throws BusinessException {
        String whereCondStr = null;
        UFBoolean[] result = new UFBoolean[billids.length];
        try {
            whereCondStr = SqlUtils.getInStr((String)"s_billid", (String[])billids, (boolean[])new boolean[]{false}) + " and dr = 0" + " and s_billid<>t_billid and ISMANUAL='Y' ";
        }
        catch (SQLException e) {
            ExceptionHandler.createException((String)e.toString());
        }
        Collection ret = new BaseDAO().retrieveByClause(ArapBillMapVO.class, whereCondStr);
        HashMap<String, ArapBillMapVO> map = new HashMap<String, ArapBillMapVO>();
        for (ArapBillMapVO vo : ret) {
            map.put(vo.getS_billid(), vo);
        }
        for (int i = 0; i < billids.length; ++i) {
            result[i] = null != map.get(billids[i]) ? UFBoolean.valueOf((boolean)true) : UFBoolean.valueOf((boolean)false);
        }
        return result;
    }

    public WorkflownoteVO[] getNoteVO(String tranType, BaseAggVO bill) throws BusinessException {
        WorkflownoteVO[] vo = ((IWorkflowMachine)NCLocator.getInstance().lookup(IWorkflowMachine.class)).queryWorkitemsNotCheck(tranType, bill.getHeadVO().getPrimaryKey(), bill.getHeadVO().getBillmaker());
        return vo;
    }

    public BaseAggVO[] queryArapBillByPKs(String[] pks, String billtype, String[] parentField, String[] childField) throws BusinessException {
        if (ArrayUtils.isEmpty((Object[])parentField) && ArrayUtils.isEmpty((Object[])childField)) {
            return this.queryArapBillByPKs(pks, billtype);
        }
        return (BaseAggVO[])new ArapBillBO().queryBillByPrimaryKeysWithOrder(pks, billtype, parentField, childField);
    }

    public BaseBillVO[] getRelateBill(BaseAggVO[] bills) throws BusinessException {
        if (ArrayUtils.isEmpty((Object[])bills)) {
            return null;
        }
        String PKPAYABLEBILL = "pk_payablebill";
        BaseDAO dao = new BaseDAO();
        ArrayList<String> srcbillidList = new ArrayList<String>();
        ArrayList<String> pkList = new ArrayList<String>();
        for (BaseAggVO bill : bills) {
            srcbillidList.add(bill.getPrimaryKey());
        }
        String childCondition = null;
        String parentCondition = null;
        try {
            PayableBillItemVO[] itemvos;
            childCondition = SqlUtils.getInStr((String)"src_billid", (String[])srcbillidList.toArray(new String[0]), (boolean[])new boolean[]{true});
            childCondition = childCondition + " and src_billtype='F0' ";
            childCondition = childCondition + " and dr=0 ";
            List cresult = (List)dao.retrieveByClause(PayableBillItemVO.class, childCondition, PKPAYABLEBILL);
            if (Collections.isEmpty((Collection)cresult)) {
                return null;
            }
            for (PayableBillItemVO item : itemvos = cresult.toArray(new PayableBillItemVO[0])) {
                pkList.add(item.getParentPK());
            }
            parentCondition = SqlUtils.getInStr((String)PKPAYABLEBILL, (String[])pkList.toArray(new String[0]), (boolean[])new boolean[]{true});
            parentCondition = parentCondition + " and dr=0 ";
        }
        catch (SQLException e) {
            Logger.error((Object)(e.getMessage() + "Get relateBill  Sql For F1"));
            throw new BusinessException(e.getMessage());
        }
        List presult = (List)dao.retrieveByClause(PayableBillVO.class, parentCondition);
        return Collections.isEmpty((Collection)presult) ? null : presult.toArray(new BaseBillVO[0]);
    }
}

