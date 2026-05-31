/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.bill.ArapBillDAO
 *  nc.bs.arap.billact.ApproveBatchBSAction
 *  nc.bs.arap.billact.DeleteBatchBSAction
 *  nc.bs.arap.billact.IValidatorFactory
 *  nc.bs.arap.billact.InsertBatchBSAction
 *  nc.bs.arap.billact.UnApproveBatchBSAction
 *  nc.bs.arap.billact.UpdateBatchBSAction
 *  nc.bs.arap.util.BillTradetypeUtils
 *  nc.bs.arap.validator.ValidatorFactory
 *  nc.bs.dao.BaseDAO
 *  nc.bs.dao.DAOException
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.uap.lock.PKLock
 *  nc.bs.uif2.validation.ValidationException
 *  nc.bs.uif2.validation.ValidationFrameworkUtil
 *  nc.bs.uif2.validation.Validator
 *  nc.impl.pubapp.pattern.database.IDQueryBuilder
 *  nc.itf.arap.pub.IArapBillService
 *  nc.jdbc.framework.processor.ColumnProcessor
 *  nc.jdbc.framework.processor.ResultSetProcessor
 *  nc.pubitf.arap.pub.IArapCheckBillDealService
 *  nc.vo.arap.basebill.BaseAggVO
 *  nc.vo.arap.basebill.BaseBillVO
 *  nc.vo.arap.basebill.BaseItemVO
 *  nc.vo.arap.pub.ArapBillTypeInfo
 *  nc.vo.arap.pub.BillEnumCollection$ApproveStatus
 *  nc.vo.arap.pub.BillEnumCollection$BillSatus
 *  nc.vo.arap.pub.IArapBilltypeInfo
 *  nc.vo.arap.utils.ArrayUtil
 *  nc.vo.arap.utils.StringUtil
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pub.lang.UFDate
 *  nccloud.commons.lang.ArrayUtils
 *  org.apache.commons.collections4.CollectionUtils
 */
package nc.impl.arap.base;

import java.lang.reflect.Array;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import nc.bs.arap.bill.ArapBillDAO;
import nc.bs.arap.billact.ApproveBatchBSAction;
import nc.bs.arap.billact.DeleteBatchBSAction;
import nc.bs.arap.billact.IValidatorFactory;
import nc.bs.arap.billact.InsertBatchBSAction;
import nc.bs.arap.billact.UnApproveBatchBSAction;
import nc.bs.arap.billact.UpdateBatchBSAction;
import nc.bs.arap.util.BillTradetypeUtils;
import nc.bs.arap.validator.ValidatorFactory;
import nc.bs.dao.BaseDAO;
import nc.bs.dao.DAOException;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.framework.common.NCLocator;
import nc.bs.uap.lock.PKLock;
import nc.bs.uif2.validation.ValidationException;
import nc.bs.uif2.validation.ValidationFrameworkUtil;
import nc.bs.uif2.validation.Validator;
import nc.impl.pubapp.pattern.database.IDQueryBuilder;
import nc.itf.arap.pub.IArapBillService;
import nc.jdbc.framework.processor.ColumnProcessor;
import nc.jdbc.framework.processor.ResultSetProcessor;
import nc.pubitf.arap.pub.IArapCheckBillDealService;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.arap.pub.ArapBillTypeInfo;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.arap.pub.IArapBilltypeInfo;
import nc.vo.arap.utils.ArrayUtil;
import nc.vo.arap.utils.StringUtil;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nccloud.commons.lang.ArrayUtils;
import org.apache.commons.collections4.CollectionUtils;

public abstract class ArapBillBaseServiceImpl<T extends BaseAggVO> {
    IValidatorFactory vf;

    protected abstract IArapBilltypeInfo getArapBilltypeInfo();

    protected abstract InsertBatchBSAction getSaveBSAction();

    protected abstract UpdateBatchBSAction getUpdateBSAction();

    protected abstract DeleteBatchBSAction getDeleteBSAction();

    protected abstract ApproveBatchBSAction getApproveBSAction();

    protected abstract UnApproveBatchBSAction getUnapproveBSAction();

    private T[] convert(T bill) {
        BaseAggVO[] array = (BaseAggVO[])Array.newInstance(this.getArapBilltypeInfo().getAggvoClass(), 1);
        array[0] = bill;
        return array;
    }

    public void delete(T bill) throws BusinessException {
        this.delete((T)this.convert((BaseAggVO)bill));
    }

    private void checkParameters(T[] bill) throws BusinessException {
        if (ArrayUtils.isEmpty((Object[])bill)) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61008_0", "02006v61008-0122"));
        }
        if (!bill[0].getClass().equals(this.getArapBilltypeInfo().getAggvoClass()) && !bill[0].getClass().equals(BaseAggVO.class)) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61008_0", "02006v61008-0257") + this.getClass() + NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61008_0", "02006v61008-0258") + bill.getClass());
        }
    }

    IValidatorFactory getValidatorFactory() {
        return new ValidatorFactory();
    }

    protected void validate(int[] unionCode, AggregatedValueObject ... bills) throws ValidationException {
        List validatorList;
        if (null == this.vf) {
            this.vf = this.getValidatorFactory();
        }
        if (null != this.vf && null != (validatorList = this.vf.build(unionCode))) {
            ValidationFrameworkUtil.createValidationService((Validator[])validatorList.toArray(new Validator[0])).validate((Object)bills);
        }
    }

    protected void validateHasDeal(Set<String> pks, String billtype) throws BusinessException {
        UFBoolean[] checkHasFlowBills = new UFBoolean[]{};
        try {
            checkHasFlowBills = ((IArapBillService)NCLocator.getInstance().lookup(IArapBillService.class)).checkHasFlowBills(pks.toArray(new String[0]), billtype);
        }
        catch (BusinessException e) {
            ExceptionHandler.handleException((Exception)((Object)e));
        }
        for (int index = 0; index < checkHasFlowBills.length; ++index) {
            if (!checkHasFlowBills[index].booleanValue()) continue;
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61008_0", "02006v61008-0259"));
        }
        ((IArapCheckBillDealService)NCLocator.getInstance().lookup(IArapCheckBillDealService.class)).checkDeal(pks.toArray(new String[0]));
    }

    public void delete(T[] bills) throws BusinessException {
        this.checkParameters((BaseAggVO[])bills);
        this.getDeleteBSAction().deleteVOs(bills);
    }

    public T save(T bill) throws BusinessException {
        return (T)((BaseAggVO)ArrayUtil.getFirstInArrays((Object[])this.save((T)this.convert((BaseAggVO)bill))));
    }

    public T[] save(T[] bills) throws BusinessException {
        this.checkParameters((BaseAggVO[])bills);
        return (BaseAggVO[])this.getSaveBSAction().insertVOs(bills);
    }

    public T update(T bill) throws BusinessException {
        return (T)((BaseAggVO)ArrayUtil.getFirstInArrays((Object[])this.update((T)this.convert((BaseAggVO)bill))));
    }

    public T[] update(T[] bills) throws BusinessException {
        this.checkParameters((BaseAggVO[])bills);
        return (BaseAggVO[])this.getUpdateBSAction().updateVOs(bills);
    }

    public T[] approve(T[] bills) throws BusinessException {
        return (BaseAggVO[])this.getApproveBSAction().approveVOs(bills);
    }

    public T[] unapprove(T[] bills) throws BusinessException {
        for (T bill : bills) {
            BaseAggVO vo = (BaseAggVO)bill;
            vo.getHeadVO().setApprovedate(null);
            vo.getHeadVO().setApprover(null);
            vo.getHeadVO().setApprovestatus(BillEnumCollection.ApproveStatus.COMMIT.VALUE);
        }
        return (BaseAggVO[])this.getUnapproveBSAction().unapproveVOs(bills);
    }

    public void updatePrintFlag(String[] pks, UFDate printTime) throws BusinessException {
        if (ArrayUtils.isEmpty((Object[])pks)) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006gat_0", "02006gat-0009"));
        }
        if (!PKLock.getInstance().addBatchDynamicLock(pks)) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006gat_0", "02006gat-0010"));
        }
        IDQueryBuilder builder = new IDQueryBuilder();
        String pk_bill = this.getArapBilltypeInfo().getTablePrimaryKeyBill();
        Class billclassName = this.getArapBilltypeInfo().getBillvoClass();
        String billTable = this.getArapBilltypeInfo().getTableNameBill();
        String sql = builder.buildSQL(pk_bill, pks);
        BaseDAO baseDAO = new BaseDAO();
        sql = "update " + billTable + " set officialprintdate='" + printTime.toPersisted() + "',  officialprintuser='" + InvocationInfoProxy.getInstance().getUserId() + "' where " + sql + " and (officialprintuser = '~' or officialprintuser = '' or officialprintuser is null)";
        int executeUpdate = baseDAO.executeUpdate(sql);
        if (executeUpdate < pks.length) {
            String sql1 = builder.buildSQL(pk_bill, pks);
            sql1 = " where " + sql1 + " and (officialprintuser <> '~' and officialprintuser <> '' and officialprintuser is not null)";
            Collection bills = baseDAO.retrieveByClause(billclassName, sql1);
            StringBuilder msg = new StringBuilder();
            msg.append(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006gat_0", "02006gat-0011"));
            for (Object billVO : bills) {
                msg.append(((BaseBillVO)billVO).getBillno() + NCLangRes4VoTransl.getNCLangRes().getStrByID("2006gat_0", "02006gat-0012"));
            }
            msg.append(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006gat_0", "02006gat-0013"));
            throw new BusinessException(msg.toString());
        }
    }

    public String cleanPrintFlag(String[] pks) throws BusinessException {
        if (ArrayUtils.isEmpty((Object[])pks)) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006gat_0", "02006gat-0009"));
        }
        if (!PKLock.getInstance().addBatchDynamicLock(pks)) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006gat_0", "02006gat-0010"));
        }
        String billPkname = this.getArapBilltypeInfo().getTablePrimaryKeyBill();
        String billTable = this.getArapBilltypeInfo().getTableNameBill();
        IDQueryBuilder builder = new IDQueryBuilder();
        String sql = builder.buildSQL(billPkname, pks);
        sql = "update " + billTable + " set officialprintdate= null,  officialprintuser=null where " + sql;
        BaseDAO baseDAO = new BaseDAO();
        baseDAO.executeUpdate(sql);
        String sql1 = builder.buildSQL(billPkname, pks);
        sql1 = "select ts from " + billTable + "  where " + sql1;
        return (String)baseDAO.executeQuery(sql1, (ResultSetProcessor)new ColumnProcessor(1));
    }

    protected void setQr(BaseAggVO[] bills) {
        for (BaseAggVO bill : bills) {
            BaseBillVO headVO = bill.getHeadVO();
            boolean isqr = false;
            boolean exp1 = BillEnumCollection.BillSatus.SIGN.VALUE.equals(headVO.getBillstatus());
            boolean exp2 = BillTradetypeUtils.isqr((String)headVO.getPk_tradetype());
            if (exp1 && exp2) {
                isqr = true;
            }
            headVO.setAttributeValue("isqr", (Object)isqr);
        }
    }

    public void vaildteRedBack(BaseAggVO[] aggvos, String billtype) throws BusinessException {
        if (ArrayUtils.isEmpty((Object[])aggvos) || billtype == null) {
            return;
        }
        String pkitem = ArapBillTypeInfo.getInstance((Object)billtype).getTablePrimaryKeyItem();
        ArrayList<String> topitems = new ArrayList<String>();
        SuperVO[] childrenVO = (SuperVO[])aggvos[0].getChildrenVO();
        String top_billtype = (String)childrenVO[0].getAttributeValue("top_billtype");
        for (SuperVO chil : childrenVO) {
            topitems.add((String)chil.getAttributeValue("top_itemid"));
        }
        if (CollectionUtils.isEmpty(topitems) || !billtype.equals(top_billtype)) {
            return;
        }
        ArapBillDAO dao = new ArapBillDAO();
        Map retmap = dao.getCanRedBackItems(topitems.toArray(new String[0]), billtype);
        if (retmap == null || retmap != null && retmap.size() == 0) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006gat_0", "02006gat-0029", null, new String[]{this.getbillName(billtype)}));
        }
        if (retmap != null && retmap.size() != topitems.size()) {
            ArrayList<SuperVO> list = new ArrayList<SuperVO>();
            for (SuperVO chil : childrenVO) {
                String occ = (String)retmap.get(chil.getAttributeValue("top_itemid"));
                if (occ == null) continue;
                list.add(chil);
            }
            if (CollectionUtils.isNotEmpty(list)) {
                aggvos[0].setChildrenVO(list.toArray(new CircularlyAccessibleValueObject[0]));
            }
        }
    }

    private String getbillName(String billtype) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("F0", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0144"));
        map.put("F1", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0145"));
        map.put("F2", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0146"));
        map.put("F3", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0147"));
        return (String)map.get(billtype);
    }

    public void setSrcFieldBychild(BaseItemVO[] childs, String billtype) throws DAOException, SQLException {
        if (ArrayUtils.isEmpty((Object[])childs) || StringUtil.isEmpty((String)billtype)) {
            return;
        }
        List<String> field = Arrays.asList("src_billid", "src_billtype", "src_itemid", "src_tradetype");
        ArrayList<String> chilpks = new ArrayList<String>();
        for (BaseItemVO child : childs) {
            chilpks.add(child.getPrimaryKey());
        }
        Map resultMap = new ArapBillDAO().getBillFieldBypk(chilpks.toArray(new String[0]), billtype, field, null);
        if (resultMap == null) {
            return;
        }
        for (BaseItemVO child : childs) {
            String key = child.getPrimaryKey();
            List list = (List)resultMap.get(key);
            if (CollectionUtils.isEmpty((Collection)list)) continue;
            child.setSrc_billid((String)list.get(0));
            child.setSrc_billtype((String)list.get(1));
            child.setSrc_itemid((String)list.get(2));
            child.setSrc_tradetype((String)list.get(3));
        }
    }
}
