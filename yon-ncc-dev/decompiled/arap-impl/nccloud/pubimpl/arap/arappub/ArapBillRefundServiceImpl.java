/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.actions.PayablebillSaveBatchBSAction
 *  nc.bs.arap.bill.ArapBillPubUtil
 *  nc.bs.arap.util.SqlUtils
 *  nc.bs.dao.BaseDAO
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.uap.lock.PKLock
 *  nc.bs.uif2.LockFailedException
 *  nc.impl.pubapp.pattern.data.bill.BillOperator
 *  nc.impl.pubapp.pattern.database.DataAccessUtils
 *  nc.itf.arap.billconfer.IBConferMapQryService
 *  nc.itf.arap.payable.IArapPayableBillQueryService
 *  nc.itf.arap.pub.IArapBillService
 *  nc.itf.uap.IUAPQueryBS
 *  nc.itf.uap.pf.IPFBusiAction
 *  nc.md.persist.framework.MDPersistenceService
 *  nc.vo.arap.agiotage.ArapBusiDataVO
 *  nc.vo.arap.basebill.BaseAggVO
 *  nc.vo.arap.basebill.BaseItemVO
 *  nc.vo.arap.billconfer.BcMapVO
 *  nc.vo.arap.payable.AggPayableBillVO
 *  nc.vo.arap.pub.BillEnumCollection$ApproveStatus
 *  nc.vo.arap.pub.BillEnumCollection$InureSign
 *  nc.vo.arap.tally.TallyVO
 *  nc.vo.arap.termitem.TermVO
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pf.change.PfUtilBaseTools
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pub.lang.UFDateTime
 *  nc.vo.pub.lang.UFDouble
 *  nc.vo.pubapp.pattern.data.IRowSet
 *  nc.vo.pubapp.pattern.model.entity.bill.IBill
 *  nc.vo.pubapp.pattern.pub.SqlBuilder
 *  nc.vo.util.BDVersionValidationUtil
 *  nccloud.bs.arap.sagas.util.SagasUtils
 *  nccloud.pubitf.arap.arappub.IArapBillRefundService
 */
package nccloud.pubimpl.arap.arappub;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import nc.bs.arap.actions.PayablebillSaveBatchBSAction;
import nc.bs.arap.bill.ArapBillPubUtil;
import nc.bs.arap.busireg.ArapBillRefundBO;
import nc.bs.arap.util.SqlUtils;
import nc.bs.dao.BaseDAO;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.framework.common.NCLocator;
import nc.bs.uap.lock.PKLock;
import nc.bs.uif2.LockFailedException;
import nc.impl.pubapp.pattern.data.bill.BillOperator;
import nc.impl.pubapp.pattern.database.DataAccessUtils;
import nc.itf.arap.billconfer.IBConferMapQryService;
import nc.itf.arap.payable.IArapPayableBillQueryService;
import nc.itf.arap.pub.IArapBillService;
import nc.itf.uap.IUAPQueryBS;
import nc.itf.uap.pf.IPFBusiAction;
import nc.md.persist.framework.MDPersistenceService;
import nc.vo.arap.agiotage.ArapBusiDataVO;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.arap.billconfer.BcMapVO;
import nc.vo.arap.payable.AggPayableBillVO;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.arap.tally.TallyVO;
import nc.vo.arap.termitem.TermVO;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pf.change.PfUtilBaseTools;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.data.IRowSet;
import nc.vo.pubapp.pattern.model.entity.bill.IBill;
import nc.vo.pubapp.pattern.pub.SqlBuilder;
import nc.vo.util.BDVersionValidationUtil;
import nccloud.bs.arap.sagas.compensate.utils.RefundCompensateUtils;
import nccloud.bs.arap.sagas.util.SagasUtils;
import nccloud.pubitf.arap.arappub.IArapBillRefundService;

public class ArapBillRefundServiceImpl
implements IArapBillRefundService {
    public void refundBill(AggregatedValueObject bill) throws BusinessException {
        if (!PKLock.getInstance().addDynamicLock(bill.getParentVO().getPrimaryKey())) {
            throw new LockFailedException(bill.getParentVO().getPrimaryKey());
        }
        this.refundBillValidate(bill);
        bill.getParentVO().setAttributeValue("isrefund", (Object)"Y");
        this.frozenAndAddSaga(bill);
    }

    public void cancelRefundBill(AggregatedValueObject bill) throws BusinessException {
        this.cancelRefundBillValidate(bill);
        this.frozenAndAddSaga(bill);
        String top_billid = bill.getParentVO().getPrimaryKey();
        String whereSql = "pk_payablebill in (select distinct pk_payablebill from ap_payableitem where " + SqlUtils.getInStr((String)"top_billid", (String[])new String[]{top_billid}) + ") and isrefund = 'Y' and dr = 0";
        AggPayableBillVO[] payablebillVOs = ((IArapPayableBillQueryService)NCLocator.getInstance().lookup(IArapPayableBillQueryService.class)).queryVOsByWhere(whereSql);
        if (payablebillVOs == null || payablebillVOs.length == 0) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0141"));
        }
        this.deleteRefundBill((AggregatedValueObject[])payablebillVOs);
    }

    public void saveRefundBill(AggregatedValueObject[] bills) throws BusinessException {
        AggregatedValueObject[] insertVOs = this.doInsertBill(bills);
        this.doApproveBill(insertVOs);
        String top_billid = (String)bills[0].getChildrenVO()[0].getAttributeValue("top_billid");
        String top_billtype = (String)bills[0].getChildrenVO()[0].getAttributeValue("top_billtype");
        BaseAggVO[] topbills = ((IArapBillService)NCLocator.getInstance().lookup(IArapBillService.class)).queryArapBillByPKs(new String[]{top_billid}, top_billtype);
        this.refundWriteBack((AggregatedValueObject)topbills[0]);
    }

    public void deleteRefundBill(AggregatedValueObject[] bills) throws BusinessException {
        bills[0].getParentVO().setAttributeValue("isAuto", (Object)true);
        String pk_billtype = (String)bills[0].getParentVO().getAttributeValue("pk_billtype");
        ((IPFBusiAction)NCLocator.getInstance().lookup(IPFBusiAction.class)).processBatch("UNAPPROVE", pk_billtype, bills, null, null, null);
        ((IPFBusiAction)NCLocator.getInstance().lookup(IPFBusiAction.class)).processBatch("DELETE", pk_billtype, bills, null, null, null);
        this.cancelRefundWriteBack(bills);
    }

    private AggregatedValueObject[] doInsertBill(AggregatedValueObject[] bills) throws BusinessException {
        PayablebillSaveBatchBSAction saveAction = new PayablebillSaveBatchBSAction();
        AggregatedValueObject[] insertVOs = saveAction.insertVOs(bills);
        ArapBillPubUtil.refreshChildVO2HeadVO((AggregatedValueObject[])insertVOs);
        return insertVOs;
    }

    private void doApproveBill(AggregatedValueObject[] bills) throws BusinessException {
        for (AggregatedValueObject aggvo : bills) {
            CircularlyAccessibleValueObject parentVO = aggvo.getParentVO();
            parentVO.setAttributeValue("approver", (Object)InvocationInfoProxy.getInstance().getUserId());
            parentVO.setAttributeValue("approvedate", (Object)new UFDate(InvocationInfoProxy.getInstance().getBizDateTime()));
            parentVO.setAttributeValue("approvestatus", (Object)BillEnumCollection.ApproveStatus.COMMIT.VALUE);
        }
        String pk_billtype = (String)bills[0].getParentVO().getAttributeValue("pk_billtype");
        if (bills.length > 1) {
            ((IPFBusiAction)NCLocator.getInstance().lookup(IPFBusiAction.class)).processBatch("APPROVE", pk_billtype, bills, null, null, null);
        } else {
            ((IPFBusiAction)NCLocator.getInstance().lookup(IPFBusiAction.class)).processAction("APPROVE", pk_billtype, null, bills[0], null, null);
        }
    }

    private void refundWriteBack(AggregatedValueObject bill) throws BusinessException {
        RefundCompensateUtils refundCompensateDataBO = new RefundCompensateUtils(bill);
        refundCompensateDataBO.extractCompensateData(bill.getParentVO(), "BillVO");
        CircularlyAccessibleValueObject parentVO = bill.getParentVO();
        CircularlyAccessibleValueObject[] childrenVO = bill.getChildrenVO();
        parentVO.setAttributeValue("isrefund", (Object)"Y");
        parentVO.setStatus(1);
        for (CircularlyAccessibleValueObject item : childrenVO) {
            refundCompensateDataBO.extractCompensateData(item, "BillItemVO");
            item.setStatus(1);
            item.setAttributeValue("occupationmny", (Object)UFDouble.ZERO_DBL);
        }
        AggregatedValueObject[] originBill = this.getOriginBill(new AggregatedValueObject[]{bill});
        bill = this.doUpdate(new AggregatedValueObject[]{bill}, originBill)[0];
        this.refundResetSpecialFields(bill, refundCompensateDataBO);
        refundCompensateDataBO.setCompensateService();
    }

    private void cancelRefundWriteBack(AggregatedValueObject[] bills) throws BusinessException {
        HashMap<String, UFDouble> pk_item_money = new HashMap<String, UFDouble>();
        String top_billtype = (String)bills[0].getChildrenVO()[0].getAttributeValue("top_billtype");
        for (AggregatedValueObject bill : bills) {
            BaseItemVO[] items;
            for (BaseItemVO item : items = (BaseItemVO[])bill.getChildrenVO()) {
                if ("F2".equals(top_billtype)) {
                    pk_item_money.put(item.getTop_itemid(), item.getMoney_cr());
                    continue;
                }
                pk_item_money.put(item.getTop_itemid(), item.getMoney_cr().multiply(new UFDouble("-1")));
            }
        }
        String top_billid = (String)bills[0].getChildrenVO()[0].getAttributeValue("top_billid");
        BaseAggVO[] topbills = ((IArapBillService)NCLocator.getInstance().lookup(IArapBillService.class)).queryArapBillByPKs(new String[]{top_billid}, top_billtype);
        BaseAggVO topbill = topbills[0];
        if (!PKLock.getInstance().addDynamicLock(topbill.getParentVO().getPrimaryKey())) {
            throw new LockFailedException(topbill.getParentVO().getPrimaryKey());
        }
        this.checkBillsTs((AggregatedValueObject[])topbills);
        RefundCompensateUtils refundCompensateDataBO = new RefundCompensateUtils((AggregatedValueObject)topbill);
        refundCompensateDataBO.extractCompensateData(topbill.getParentVO(), "BillVO");
        CircularlyAccessibleValueObject parentVO = topbill.getParentVO();
        CircularlyAccessibleValueObject[] childrenVO = topbill.getChildrenVO();
        parentVO.setAttributeValue("isrefund", (Object)"N");
        parentVO.setStatus(1);
        for (CircularlyAccessibleValueObject item : childrenVO) {
            refundCompensateDataBO.extractCompensateData(item, "BillItemVO");
            item.setStatus(1);
            item.setAttributeValue("occupationmny", pk_item_money.get(item.getPrimaryKey()));
        }
        AggregatedValueObject[] originBill = this.getOriginBill(new AggregatedValueObject[]{topbill});
        this.doUpdate(new AggregatedValueObject[]{topbill}, originBill);
        this.cancelRefundResetSpecialFields((AggregatedValueObject)topbill, pk_item_money, refundCompensateDataBO);
        refundCompensateDataBO.setCompensateService();
    }

    private void refundResetSpecialFields(AggregatedValueObject bill, RefundCompensateUtils refundCompensateDataBO) throws BusinessException {
        IUAPQueryBS queryService = (IUAPQueryBS)NCLocator.getInstance().lookup(IUAPQueryBS.class);
        BaseDAO baseDao = new BaseDAO();
        UFDateTime dateTime = new UFDateTime(InvocationInfoProxy.getInstance().getBizDateTime());
        String primaryKey = bill.getParentVO().getPrimaryKey();
        Collection termvos = queryService.retrieveByClause(TermVO.class, SqlUtils.getInStr((String)"pk_bill", (String[])new String[]{primaryKey}));
        for (Object termvo : termvos) {
            refundCompensateDataBO.extractCompensateData((CircularlyAccessibleValueObject)termvo, "TermVO");
            termvo.setOccupationmny(UFDouble.ZERO_DBL);
            termvo.setTs(dateTime);
        }
        baseDao.updateVOArray(termvos.toArray(new SuperVO[0]), new String[]{"occupationmny", "ts"});
        Collection busivos = queryService.retrieveByClause(ArapBusiDataVO.class, SqlUtils.getInStr((String)"pk_bill", (String[])new String[]{primaryKey}));
        for (ArapBusiDataVO busivo : busivos) {
            refundCompensateDataBO.extractCompensateData((CircularlyAccessibleValueObject)busivo, "ArapBusiDataVO");
            busivo.setIsrefund(UFBoolean.valueOf((boolean)true));
            busivo.setOccupationmny(UFDouble.ZERO_DBL);
            busivo.setTs(dateTime);
        }
        baseDao.updateVOArray(busivos.toArray(new SuperVO[0]), new String[]{"isrefund", "occupationmny", "ts"});
        Collection tallyvos = queryService.retrieveByClause(TallyVO.class, SqlUtils.getInStr((String)"pk_bill", (String[])new String[]{primaryKey}));
        for (TallyVO tallyvo : tallyvos) {
            refundCompensateDataBO.extractCompensateData((CircularlyAccessibleValueObject)tallyvo, "TallyVO");
            tallyvo.setIsrefund(UFBoolean.valueOf((boolean)true));
            tallyvo.setTs(dateTime);
        }
        baseDao.updateVOArray(tallyvos.toArray(new SuperVO[0]), new String[]{"isrefund", "ts"});
    }

    private void cancelRefundResetSpecialFields(AggregatedValueObject bill, Map<String, UFDouble> pk_item_money, RefundCompensateUtils refundCompensateDataBO) throws BusinessException {
        IUAPQueryBS queryService = (IUAPQueryBS)NCLocator.getInstance().lookup(IUAPQueryBS.class);
        BaseDAO baseDao = new BaseDAO();
        UFDateTime dateTime = new UFDateTime(InvocationInfoProxy.getInstance().getBizDateTime());
        String primaryKey = bill.getParentVO().getPrimaryKey();
        Collection termvos = queryService.retrieveByClause(TermVO.class, SqlUtils.getInStr((String)"pk_bill", (String[])new String[]{primaryKey}));
        HashMap<String, UFDouble> pk_item_money2 = new HashMap<String, UFDouble>(pk_item_money);
        for (Object termvo : termvos) {
            refundCompensateDataBO.extractCompensateData((CircularlyAccessibleValueObject)termvo, "TermVO");
            UFDouble itemMoney = (UFDouble)pk_item_money2.get(termvo.getPk_item());
            UFDouble money_bal = termvo.getMoney_bal();
            if (itemMoney.compareTo((Object)money_bal) <= 0) {
                termvo.setOccupationmny(itemMoney);
            } else if (itemMoney.compareTo((Object)money_bal) > 0) {
                termvo.setOccupationmny(money_bal);
                pk_item_money2.put(termvo.getPk_item(), itemMoney.sub(money_bal));
            }
            termvo.setTs(dateTime);
        }
        baseDao.updateVOArray(termvos.toArray(new SuperVO[0]), new String[]{"occupationmny", "ts"});
        Collection busivos = queryService.retrieveByClause(ArapBusiDataVO.class, SqlUtils.getInStr((String)"pk_bill", (String[])new String[]{primaryKey}));
        for (ArapBusiDataVO busivo : busivos) {
            refundCompensateDataBO.extractCompensateData((CircularlyAccessibleValueObject)busivo, "ArapBusiDataVO");
            busivo.setIsrefund(UFBoolean.valueOf((boolean)false));
            busivo.setOccupationmny(pk_item_money.get(busivo.getPk_item()));
            busivo.setTs(dateTime);
        }
        baseDao.updateVOArray(busivos.toArray(new SuperVO[0]), new String[]{"isrefund", "occupationmny", "ts"});
        Collection tallyvos = queryService.retrieveByClause(TallyVO.class, SqlUtils.getInStr((String)"pk_bill", (String[])new String[]{primaryKey}));
        for (TallyVO tallyvo : tallyvos) {
            refundCompensateDataBO.extractCompensateData((CircularlyAccessibleValueObject)tallyvo, "TallyVO");
            tallyvo.setIsrefund(UFBoolean.valueOf((boolean)false));
            tallyvo.setTs(dateTime);
        }
        baseDao.updateVOArray(tallyvos.toArray(new SuperVO[0]), new String[]{"isrefund", "ts"});
    }

    private void refundBillValidate(AggregatedValueObject bill) throws BusinessException {
        this.checkBillsTs(bill);
        CircularlyAccessibleValueObject parentVO = bill.getParentVO();
        UFBoolean isrefund = (UFBoolean)parentVO.getAttributeValue("isrefund");
        if (isrefund != null && isrefund.booleanValue()) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0142"));
        }
        int effectstatus = (Integer)parentVO.getAttributeValue("effectstatus");
        if (BillEnumCollection.InureSign.OKINURE.VALUE != effectstatus) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0143"));
        }
        String pk_billtype = (String)parentVO.getAttributeValue("pk_billtype");
        BaseItemVO[] childrenVO = (BaseItemVO[])bill.getChildrenVO();
        ArrayList<BaseItemVO> newchildren = new ArrayList<BaseItemVO>();
        for (BaseItemVO baseItemVO : childrenVO) {
            if (UFBoolean.TRUE.equals((Object)baseItemVO.getPausetransact())) {
                throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0144"));
            }
            if (0 != baseItemVO.getObjtype()) {
                throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0145"));
            }
            if ("F0".equals(pk_billtype)) {
                if (baseItemVO.getMoney_de().doubleValue() > 0.0 || baseItemVO.getMoney_cr().doubleValue() > 0.0) {
                    throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0146"));
                }
            } else if ("F2".equals(pk_billtype) && (baseItemVO.getMoney_de().doubleValue() < 0.0 || baseItemVO.getMoney_cr().doubleValue() < 0.0)) {
                throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0147"));
            }
            if (baseItemVO.getOccupationmny().compareTo((Object)UFDouble.ZERO_DBL) == 0) continue;
            newchildren.add(baseItemVO);
        }
        if (newchildren.size() == 0) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0148"));
        }
        BcMapVO[] bcMapVos = ((IBConferMapQryService)NCLocator.getInstance().lookup(IBConferMapQryService.class)).queryBCMapByIDAndBType(parentVO.getPrimaryKey(), pk_billtype);
        if (bcMapVos != null && bcMapVos.length > 0) {
            IArapBillService iArapBillService;
            BaseAggVO[] bills;
            ArrayList<String> pks = new ArrayList<String>();
            String billtype = bcMapVos[0].getDest_billtype();
            for (BcMapVO vo : bcMapVos) {
                if (vo == null) continue;
                pks.add(vo.getDest_billid());
            }
            if (pks.size() > 0 && (bills = (iArapBillService = (IArapBillService)NCLocator.getInstance().lookup(IArapBillService.class)).queryArapBillByPKs(pks.toArray(new String[0]), billtype)) != null && bills.length > 0) {
                throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0149"));
            }
        }
    }

    private void cancelRefundBillValidate(AggregatedValueObject bill) throws BusinessException {
        BaseItemVO[] items;
        CircularlyAccessibleValueObject parentVO = bill.getParentVO();
        UFBoolean isrefund = (UFBoolean)parentVO.getAttributeValue("isrefund");
        if (isrefund != null && !isrefund.booleanValue()) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0150"));
        }
        for (BaseItemVO item : items = ((BaseAggVO)bill).getItems()) {
            if (!UFBoolean.TRUE.equals((Object)item.getPausetransact())) continue;
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0151"));
        }
    }

    private AggregatedValueObject[] getOriginBill(AggregatedValueObject[] bills) throws BusinessException {
        String[] pks = new String[bills.length];
        for (int index = 0; index < pks.length; ++index) {
            pks[index] = bills[index].getParentVO().getPrimaryKey();
        }
        Collection vo = MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByPKs(bills[0].getClass(), pks, false);
        HashMap<String, AggregatedValueObject> map = new HashMap<String, AggregatedValueObject>();
        ArrayList<BaseItemVO> rets = new ArrayList<BaseItemVO>();
        for (Object object : vo) {
            AggregatedValueObject bill = (AggregatedValueObject)object;
            for (CircularlyAccessibleValueObject item : bill.getChildrenVO()) {
                if (Integer.valueOf(1).equals(item.getAttributeValue("dr"))) continue;
                rets.add((BaseItemVO)item);
            }
            bill.setChildrenVO((CircularlyAccessibleValueObject[])rets.toArray(new BaseItemVO[0]));
            rets.clear();
            map.put(bill.getParentVO().getPrimaryKey(), bill);
        }
        ArrayList list = new ArrayList();
        for (int i = 0; i < pks.length; ++i) {
            list.add(map.get(pks[i]));
        }
        return (AggregatedValueObject[])list.toArray(new BaseAggVO[0]);
    }

    private AggregatedValueObject[] doUpdate(AggregatedValueObject[] bills, AggregatedValueObject[] orginBills) throws BusinessException {
        if (bills instanceof IBill[]) {
            IBill[] obills = null;
            if (orginBills instanceof IBill[]) {
                obills = (IBill[])orginBills;
            } else if (orginBills != null && orginBills.length > 0 && orginBills[0] instanceof IBill) {
                obills = new IBill[orginBills.length];
                System.arraycopy(orginBills, 0, obills, 0, orginBills.length);
            }
            new BillOperator().update((IBill[])bills, obills);
        } else if (null != bills && bills.length > 0 && bills[0] instanceof IBill) {
            IBill[] ibills = new IBill[bills.length];
            System.arraycopy(bills, 0, ibills, 0, bills.length);
            IBill[] obills = new IBill[orginBills.length];
            System.arraycopy(orginBills, 0, obills, 0, orginBills.length);
            new BillOperator().update(ibills, obills);
        }
        return bills;
    }

    private boolean hasSendAPDriveAction(String pk_busitype, String operator) {
        SqlBuilder sql = new SqlBuilder();
        sql.append("select pk_sourcebilltype,pk_billtype,actiontype");
        sql.append(" from pub_messagedrive where ");
        sql.append("pk_sourcebusinesstype", pk_busitype);
        sql.append(" and ");
        sql.append("sourceaction", "REFUND");
        sql.append(" and (");
        sql.append("configflag", 1);
        sql.append(" or (");
        sql.append("configflag", 2);
        sql.append(" and ");
        sql.append("operator", operator);
        sql.append(") or (");
        sql.append("configflag", 3);
        sql.append(" and operator in(select pk_role from sm_user_role where ");
        sql.append("cuserid", operator);
        sql.append("))) ");
        DataAccessUtils util = new DataAccessUtils();
        IRowSet result = util.query(sql.toString());
        if (null == result || 0 == result.size()) {
            return false;
        }
        while (result.next()) {
            String sourcetype = result.getString(0);
            String tartype = result.getString(1);
            String actiontype = result.getString(2);
            String realBilltype = PfUtilBaseTools.getRealBilltype((String)sourcetype);
            if (!"F0".equals(realBilltype) && !"F2".equals(realBilltype) || !"SAVE".equals(actiontype) || !"F1".equals(PfUtilBaseTools.getRealBilltype((String)tartype))) continue;
            return true;
        }
        return false;
    }

    private void frozenAndAddSaga(AggregatedValueObject bill) throws BusinessException {
        SagasUtils.frozenAndAddSaga((String)"refund", (AggregatedValueObject[])new AggregatedValueObject[]{bill});
        SagasUtils.frozenBusidataAndAddSaga((String)"other", (AggregatedValueObject[])new AggregatedValueObject[]{bill});
    }

    protected void checkBillsTs(AggregatedValueObject ... bills) throws BusinessException {
        ArrayList<SuperVO> superVOs = new ArrayList<SuperVO>();
        for (AggregatedValueObject bill : bills) {
            superVOs.add((SuperVO)bill.getParentVO());
        }
        BDVersionValidationUtil.validateSuperVO((SuperVO[])superVOs.toArray(new SuperVO[0]));
    }

    public void refundF3TOF2(AggregatedValueObject[] bills) throws BusinessException {
        ArapBillRefundBO.refundF3TOF2(bills);
    }

    public void cancelRefundF3TOF2(AggregatedValueObject[] bills) throws BusinessException {
        ArapBillRefundBO.cancelRefundF3TOF2(bills);
    }
}

