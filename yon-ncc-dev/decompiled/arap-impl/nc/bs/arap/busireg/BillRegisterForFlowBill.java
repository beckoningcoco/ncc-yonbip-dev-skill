/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.agiotage.IBusiDataService
 *  nc.bs.arap.bill.ArapBillDAO
 *  nc.bs.arap.bill.ArapBillPubUtil
 *  nc.bs.arap.util.SqlUtils
 *  nc.bs.businessevent.BdUpdateEvent$BDUpdateUserObj
 *  nc.bs.businessevent.BusinessEvent$BusinessUserObj
 *  nc.bs.dao.BaseDAO
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.uap.lock.PKLock
 *  nc.impl.pubapp.pattern.data.bill.BillOperator
 *  nc.md.persist.framework.MDPersistenceService
 *  nc.pubitf.para.SysInitQuery
 *  nc.vo.arap.agiotage.ArapBusiDataVO
 *  nc.vo.arap.basebill.BaseAggVO
 *  nc.vo.arap.basebill.BaseBillVO
 *  nc.vo.arap.basebill.BaseItemVO
 *  nc.vo.arap.flowbill.FlowBillDataVO
 *  nc.vo.arap.gathering.AggGatheringBillVO
 *  nc.vo.arap.gathering.GatheringBillItemVO
 *  nc.vo.arap.pay.AggPayBillVO
 *  nc.vo.arap.pay.PayBillItemVO
 *  nc.vo.arap.payable.AggPayableBillVO
 *  nc.vo.arap.payable.PayableBillItemVO
 *  nc.vo.arap.pub.BillEnumCollection$BillSatus
 *  nc.vo.arap.pub.BillEnumCollection$InureSign
 *  nc.vo.arap.receivable.AggReceivableBillVO
 *  nc.vo.arap.receivable.ReceivableBillItemVO
 *  nc.vo.arap.termitem.TermVO
 *  nc.vo.arap.utils.StringUtil
 *  nc.vo.fipub.utils.ArrayUtil
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pub.lang.UFDateTime
 *  nc.vo.pub.lang.UFDouble
 *  nc.vo.pubapp.pattern.exception.ExceptionUtils
 *  nc.vo.pubapp.pattern.model.entity.bill.IBill
 *  nccloud.bs.arap.sagas.util.SagasUtils
 *  nccloud.bs.arap.util.Collections
 *  org.apache.commons.lang3.ArrayUtils
 */
package nc.bs.arap.busireg;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import nc.bs.arap.agiotage.IBusiDataService;
import nc.bs.arap.bill.ArapBillDAO;
import nc.bs.arap.bill.ArapBillPubUtil;
import nc.bs.arap.util.SqlUtils;
import nc.bs.businessevent.BdUpdateEvent;
import nc.bs.businessevent.BusinessEvent;
import nc.bs.dao.BaseDAO;
import nc.bs.framework.common.NCLocator;
import nc.bs.uap.lock.PKLock;
import nc.impl.pubapp.pattern.data.bill.BillOperator;
import nc.md.persist.framework.MDPersistenceService;
import nc.pubitf.para.SysInitQuery;
import nc.vo.arap.agiotage.ArapBusiDataVO;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.arap.flowbill.FlowBillDataVO;
import nc.vo.arap.gathering.AggGatheringBillVO;
import nc.vo.arap.gathering.GatheringBillItemVO;
import nc.vo.arap.pay.AggPayBillVO;
import nc.vo.arap.pay.PayBillItemVO;
import nc.vo.arap.payable.AggPayableBillVO;
import nc.vo.arap.payable.PayableBillItemVO;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.arap.receivable.AggReceivableBillVO;
import nc.vo.arap.receivable.ReceivableBillItemVO;
import nc.vo.arap.termitem.TermVO;
import nc.vo.arap.utils.StringUtil;
import nc.vo.fipub.utils.ArrayUtil;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.vo.pubapp.pattern.model.entity.bill.IBill;
import nccloud.bs.arap.sagas.util.SagasUtils;
import nccloud.bs.arap.util.Collections;
import org.apache.commons.lang3.ArrayUtils;

public class BillRegisterForFlowBill {
    public static UFDouble ONE_DOWN_ZERO = new UFDouble(-1);
    static List<String> billtypes = Arrays.asList("F0", "F1", "F2", "F3");
    protected String eventType;

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getEventType() {
        return this.eventType;
    }

    protected AggregatedValueObject[] dealUserObj(Object obj) {
        if (obj instanceof BusinessEvent.BusinessUserObj) {
            obj = ((BusinessEvent.BusinessUserObj)obj).getUserObj();
        } else if (obj instanceof BdUpdateEvent.BDUpdateUserObj) {
            obj = ((BdUpdateEvent.BDUpdateUserObj)obj).getNewObj();
        }
        AggregatedValueObject[] retvos = null;
        retvos = obj.getClass().isArray() ? (AggregatedValueObject[])obj : new AggregatedValueObject[]{(AggregatedValueObject)obj};
        ArrayList<AggregatedValueObject> list = new ArrayList<AggregatedValueObject>();
        for (AggregatedValueObject vo : retvos) {
            if (vo == null || vo.getParentVO().getAttributeValue("billstatus").equals(BillEnumCollection.BillSatus.TEMPEORARY.VALUE)) continue;
            list.add(vo);
        }
        if (list == null || list.size() == 0) {
            return null;
        }
        return (AggregatedValueObject[])list.toArray((BaseAggVO[])Array.newInstance(((AggregatedValueObject)list.get(0)).getClass(), list.size()));
    }

    public void doWriteBack(List<FlowBillDataVO> flows) throws BusinessException {
        HashMap<String, FlowBillDataVO> rec = null;
        ArrayList<String> pk_recbill = new ArrayList<String>();
        HashMap<String, FlowBillDataVO> gather = null;
        ArrayList<String> pk_gatherbill = new ArrayList<String>();
        HashMap<String, FlowBillDataVO> payable = null;
        ArrayList<String> pk_payablebill = new ArrayList<String>();
        HashMap<String, FlowBillDataVO> pay = null;
        ArrayList<String> pk_paybill = new ArrayList<String>();
        for (FlowBillDataVO vo : flows) {
            if ("F0".equals(vo.getBilltype())) {
                if (null == rec) {
                    rec = new HashMap<String, FlowBillDataVO>();
                }
                if (rec.get(vo.getPk_billitem()) != null) {
                    vo.setMnychanged(((FlowBillDataVO)rec.get(vo.getPk_billitem())).getMnychanged().add(vo.getMnychanged()));
                }
                rec.put(vo.getPk_billitem(), vo);
                if (pk_recbill.contains(vo.getPk_bill())) continue;
                pk_recbill.add(vo.getPk_bill());
                continue;
            }
            if ("F2".equals(vo.getBilltype())) {
                if (null == gather) {
                    gather = new HashMap<String, FlowBillDataVO>();
                }
                if (gather.get(vo.getPk_billitem()) != null) {
                    vo.setMnychanged(((FlowBillDataVO)gather.get(vo.getPk_billitem())).getMnychanged().add(vo.getMnychanged()));
                }
                gather.put(vo.getPk_billitem(), vo);
                if (pk_gatherbill.contains(vo.getPk_bill())) continue;
                pk_gatherbill.add(vo.getPk_bill());
                continue;
            }
            if ("F1".equals(vo.getBilltype())) {
                if (null == payable) {
                    payable = new HashMap<String, FlowBillDataVO>();
                }
                if (payable.get(vo.getPk_billitem()) != null) {
                    vo.setMnychanged(((FlowBillDataVO)payable.get(vo.getPk_billitem())).getMnychanged().add(vo.getMnychanged()));
                }
                payable.put(vo.getPk_billitem(), vo);
                if (pk_payablebill.contains(vo.getPk_bill())) continue;
                pk_payablebill.add(vo.getPk_bill());
                continue;
            }
            if (!"F3".equals(vo.getBilltype())) continue;
            if (null == pay) {
                pay = new HashMap<String, FlowBillDataVO>();
            }
            if (pay.get(vo.getPk_billitem()) != null) {
                vo.setMnychanged(((FlowBillDataVO)pay.get(vo.getPk_billitem())).getMnychanged().add(vo.getMnychanged()));
            }
            pay.put(vo.getPk_billitem(), vo);
            if (pk_paybill.contains(vo.getPk_bill())) continue;
            pk_paybill.add(vo.getPk_bill());
        }
        HashMap<String, String[]> map = new HashMap<String, String[]>();
        if (null != rec) {
            this.updateRecBills(rec, pk_recbill);
            this.updateTerm(rec, pk_recbill, "F0");
            map.put("F0", pk_recbill.toArray(new String[0]));
        }
        if (null != gather) {
            this.updateGatherBills(gather, pk_gatherbill);
            this.updateTerm(gather, pk_gatherbill, "F2");
            map.put("F2", pk_gatherbill.toArray(new String[0]));
        }
        if (null != payable) {
            this.updatePayableBills(payable, pk_payablebill);
            this.updateTerm(payable, pk_payablebill, "F1");
            map.put("F1", pk_payablebill.toArray(new String[0]));
        }
        if (null != pay) {
            this.updatePayBill(pay, pk_paybill);
            this.updateTerm(pay, pk_paybill, "F3");
            map.put("F3", pk_gatherbill.toArray(new String[0]));
        }
        this.frozenSrcBillAndBusidata(map);
    }

    private void updateRecBills(Map<String, FlowBillDataVO> rec, List<String> pkRecbill) throws BusinessException {
        this.lock(pkRecbill);
        Collection bills = MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByPKs(AggReceivableBillVO.class, pkRecbill.toArray(new String[0]), false);
        ArrayList<AggReceivableBillVO> oldbills = new ArrayList<AggReceivableBillVO>();
        UFDateTime newTs = new UFDateTime();
        for (AggReceivableBillVO vo : bills) {
            this.checkBillStatus((BaseAggVO)vo);
            oldbills.add(vo.clone());
            for (ReceivableBillItemVO item : vo.getBodyVOs()) {
                UFDouble mny = item.getOccupationmny() == null ? UFDouble.ZERO_DBL : item.getOccupationmny();
                UFDouble chgmny = rec.get(item.getPk_recitem()) == null || rec.get(item.getPk_recitem()).getMnychanged() == null ? UFDouble.ZERO_DBL : rec.get(item.getPk_recitem()).getMnychanged();
                UFDouble newOccupationmny = mny.sub(chgmny.abs());
                Boolean isUpZero = item.getMoney_de().compareTo((Object)UFDouble.ZERO_DBL) >= 0;
                if (!isUpZero.booleanValue() && newOccupationmny.compareTo((Object)UFDouble.ZERO_DBL) > 0) {
                    throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0310"));
                }
                UFDouble flowOccupamny = mny.sub(chgmny);
                this.checkMoney(flowOccupamny, item.getMoney_de(), isUpZero);
                item.setOccupationmny(isUpZero != false ? flowOccupamny.abs() : flowOccupamny);
                item.setStatus(1);
                item.setTs(newTs);
                vo.getHeadVO().setTs(newTs);
            }
        }
        this.update((IBill[])bills.toArray(new AggReceivableBillVO[0]), (IBill[])oldbills.toArray(new AggReceivableBillVO[0]));
    }

    private void updateGatherBills(Map<String, FlowBillDataVO> gather, List<String> pkGatherbill) throws BusinessException {
        this.lock(pkGatherbill);
        Collection bills = MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByPKs(AggGatheringBillVO.class, pkGatherbill.toArray(new String[0]), false);
        ArrayList<AggGatheringBillVO> oldbills = new ArrayList<AggGatheringBillVO>();
        UFDateTime newTs = new UFDateTime();
        for (AggGatheringBillVO vo : bills) {
            this.checkBillStatus((BaseAggVO)vo);
            oldbills.add(vo.clone());
            for (GatheringBillItemVO item : vo.getBodyVOs()) {
                UFDouble mny = item.getOccupationmny() == null ? UFDouble.ZERO_DBL : item.getOccupationmny();
                UFDouble chgmny = gather.get(item.getPk_gatheritem()) == null || gather.get(item.getPk_gatheritem()).getMnychanged() == null ? UFDouble.ZERO_DBL : gather.get(item.getPk_gatheritem()).getMnychanged();
                UFDouble newOccupationmny = mny.sub(chgmny.abs());
                Boolean isUpZero = item.getMoney_cr().compareTo((Object)UFDouble.ZERO_DBL) >= 0;
                if (!isUpZero.booleanValue() && newOccupationmny.compareTo((Object)UFDouble.ZERO_DBL) > 0) {
                    throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0310"));
                }
                UFDouble flowOccupamny = mny.sub(chgmny);
                this.checkMoney(flowOccupamny, item.getMoney_cr(), isUpZero);
                item.setOccupationmny(isUpZero != false ? flowOccupamny.abs() : flowOccupamny);
                item.setStatus(1);
                item.setTs(newTs);
                vo.getHeadVO().setTs(newTs);
            }
        }
        this.update((IBill[])bills.toArray(new AggGatheringBillVO[0]), (IBill[])oldbills.toArray(new AggGatheringBillVO[0]));
    }

    private void updatePayableBills(Map<String, FlowBillDataVO> payable, List<String> pkPayablebill) throws BusinessException {
        this.lock(pkPayablebill);
        Collection bills = MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByPKs(AggPayableBillVO.class, pkPayablebill.toArray(new String[0]), false);
        ArrayList<AggPayableBillVO> oldbills = new ArrayList<AggPayableBillVO>();
        UFDateTime newTs = new UFDateTime();
        for (AggPayableBillVO vo : bills) {
            this.checkBillStatus((BaseAggVO)vo);
            oldbills.add(vo.clone());
            for (PayableBillItemVO item : vo.getBodyVOs()) {
                FlowBillDataVO flowBillDataVO = payable.get(item.getPk_payableitem());
                if (flowBillDataVO == null) continue;
                UFDouble mny = item.getOccupationmny() == null ? UFDouble.ZERO_DBL : item.getOccupationmny();
                UFDouble chgmny = flowBillDataVO == null ? UFDouble.ZERO_DBL : flowBillDataVO.getMnychanged();
                UFDouble newOccupationmny = mny.sub(chgmny.abs());
                Boolean isUpZero = item.getMoney_cr().compareTo((Object)UFDouble.ZERO_DBL) >= 0;
                if (!isUpZero.booleanValue() && newOccupationmny.compareTo((Object)UFDouble.ZERO_DBL) > 0) {
                    throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0310"));
                }
                UFDouble flowOccupamny = mny.sub(chgmny);
                this.checkMoney(flowOccupamny, item.getMoney_cr(), isUpZero);
                item.setOccupationmny(isUpZero != false ? flowOccupamny.abs() : flowOccupamny);
                item.setStatus(1);
                item.setTs(newTs);
                vo.getHeadVO().setTs(newTs);
            }
        }
        this.update((IBill[])bills.toArray(new AggPayableBillVO[0]), (IBill[])oldbills.toArray(new AggPayableBillVO[0]));
    }

    private void updatePayBill(Map<String, FlowBillDataVO> pay, List<String> pkPaybill) throws BusinessException {
        this.lock(pkPaybill);
        Collection bills = MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByPKs(AggPayBillVO.class, pkPaybill.toArray(new String[0]), false);
        ArrayList<AggPayBillVO> oldbills = new ArrayList<AggPayBillVO>();
        UFDateTime newTs = new UFDateTime();
        for (AggPayBillVO vo : bills) {
            this.checkBillStatus((BaseAggVO)vo);
            oldbills.add(vo.clone());
            for (PayBillItemVO item : vo.getBodyVOs()) {
                UFDouble mny = item.getOccupationmny() == null ? UFDouble.ZERO_DBL : item.getOccupationmny();
                UFDouble chgmny = pay.get(item.getPk_payitem()) == null || pay.get(item.getPk_payitem()).getMnychanged() == null ? UFDouble.ZERO_DBL : pay.get(item.getPk_payitem()).getMnychanged();
                UFDouble newOccupationmny = mny.sub(chgmny.abs());
                Boolean isUpZero = item.getMoney_de().compareTo((Object)UFDouble.ZERO_DBL) >= 0;
                if (!isUpZero.booleanValue() && newOccupationmny.compareTo((Object)UFDouble.ZERO_DBL) > 0) {
                    throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0310"));
                }
                UFDouble flowOccupamny = mny.sub(chgmny);
                this.checkMoney(flowOccupamny, item.getMoney_de(), isUpZero);
                item.setOccupationmny(isUpZero != false ? flowOccupamny.abs() : flowOccupamny);
                item.setStatus(1);
                item.setTs(newTs);
                vo.getHeadVO().setTs(newTs);
            }
        }
        this.update((IBill[])bills.toArray(new AggPayBillVO[0]), (IBill[])oldbills.toArray(new AggPayBillVO[0]));
    }

    private void lock(List<String> pks) throws BusinessException {
        if (pks == null) {
            return;
        }
        if (!PKLock.getInstance().addBatchDynamicLock(pks.toArray(new String[0]))) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0311"));
        }
    }

    private void lock(String[] pks) throws BusinessException {
        if (pks == null) {
            return;
        }
        if (!PKLock.getInstance().addBatchDynamicLock(pks)) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0311"));
        }
    }

    private void update(IBill[] bills, IBill[] oldbills) {
        new BillOperator().update(bills, oldbills);
    }

    public boolean isArapFlowBusi(BaseBillVO vo, BaseItemVO item) {
        return ArapBillPubUtil.isFromArap((BaseBillVO)vo, (BaseItemVO)item);
    }

    private void updateTerm(Map<String, FlowBillDataVO> flows, List<String> pk_bills, String pk_billtype) throws BusinessException {
        try {
            Collection bills = MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByCond(TermVO.class, SqlUtils.getInStr((String)"pk_bill", (String[])pk_bills.toArray(new String[0]), (boolean[])new boolean[]{true}), true);
            Map<String, List<TermVO>> map = this.chgCollectionToMap(bills);
            ArrayList<ArapBusiDataVO> all_busidatas = new ArrayList<ArapBusiDataVO>();
            ArrayList<TermVO> all_termvos = new ArrayList<TermVO>();
            for (Map.Entry<String, List<TermVO>> billentry : map.entrySet()) {
                List<TermVO> listvos = billentry.getValue();
                TermVO[] vos = listvos.toArray(new TermVO[0]);
                if (null == vos[0].getPk_org()) {
                    ExceptionUtils.wrappBusinessException((String)NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0312"));
                }
                String para = SysInitQuery.getParaString((String)vos[0].getPk_org(), (String)this.getInitCode(pk_billtype));
                Arrays.sort(vos, new TermComparator(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0313").equals(para)));
                for (int i = vos.length - 1; i >= 0; --i) {
                    UFDouble chgmny;
                    TermVO vo = vos[i];
                    UFDouble mny = vo.getOccupationmny() == null ? UFDouble.ZERO_DBL : vo.getOccupationmny();
                    UFDouble mnybal = vo.getMoney_bal() == null ? UFDouble.ZERO_DBL : vo.getMoney_bal();
                    UFDouble uFDouble = chgmny = flows.get(vo.getPk_item()) == null || flows.get(vo.getPk_item()).getMnychanged() == null ? UFDouble.ZERO_DBL : flows.get(vo.getPk_item()).getMnychanged();
                    if (chgmny.compareTo((Object)UFDouble.ZERO_DBL) == 0) continue;
                    if (mnybal.compareTo((Object)UFDouble.ZERO_DBL) > 0) {
                        if (chgmny.compareTo((Object)UFDouble.ZERO_DBL) > 0) {
                            if (mny.abs().compareTo((Object)chgmny.abs()) > 0) {
                                vo.setOccupationmny(mny.sub(chgmny));
                                flows.get(vo.getPk_item()).setMnychanged(UFDouble.ZERO_DBL);
                            } else {
                                vo.setOccupationmny(UFDouble.ZERO_DBL);
                                flows.get(vo.getPk_item()).setMnychanged(chgmny.sub(mny));
                            }
                        } else if (mnybal.sub(mny).abs().compareTo((Object)chgmny.abs()) <= 0) {
                            vo.setOccupationmny(mnybal);
                            flows.get(vo.getPk_item()).setMnychanged(chgmny.add(mnybal.sub(mny)));
                        } else if (mnybal.sub(mny).abs().compareTo((Object)chgmny.abs()) > 0) {
                            vo.setOccupationmny(mny.sub(chgmny));
                            flows.get(vo.getPk_item()).setMnychanged(UFDouble.ZERO_DBL);
                        }
                    } else if (chgmny.compareTo((Object)UFDouble.ZERO_DBL) < 0) {
                        if (mny.abs().compareTo((Object)chgmny.abs()) > 0) {
                            vo.setOccupationmny(mny.sub(chgmny));
                            flows.get(vo.getPk_item()).setMnychanged(UFDouble.ZERO_DBL);
                        } else {
                            vo.setOccupationmny(UFDouble.ZERO_DBL);
                            flows.get(vo.getPk_item()).setMnychanged(chgmny.sub(mny));
                        }
                    } else if (mnybal.sub(mny).abs().compareTo((Object)chgmny.abs()) <= 0) {
                        vo.setOccupationmny(mnybal);
                        flows.get(vo.getPk_item()).setMnychanged(chgmny.add(mnybal.sub(mny)));
                    } else if (mnybal.sub(mny).abs().compareTo((Object)chgmny.abs()) > 0) {
                        vo.setOccupationmny(mny.sub(chgmny));
                        flows.get(vo.getPk_item()).setMnychanged(UFDouble.ZERO_DBL);
                    }
                    ArapBusiDataVO busidata = new ArapBusiDataVO();
                    busidata.setPk_termitem(vo.getPk_termitem());
                    busidata.setOccupationmny(vo.getOccupationmny());
                    all_busidatas.add(busidata);
                    vo.setStatus(1);
                    all_termvos.add(vo);
                }
            }
            TermVO[] allvo = all_termvos.toArray(new TermVO[0]);
            this.lock(StringUtil.chgFieldToStringArray((SuperVO[])allvo, (String)"pk_termitem"));
            new BaseDAO().updateVOArray((SuperVO[])allvo);
            for (Map.Entry<String, FlowBillDataVO> entry : flows.entrySet()) {
                FlowBillDataVO vo = entry.getValue();
                if (vo.getMnychanged() == null || vo.getMnychanged().compareTo((Object)UFDouble.ZERO_DBL) == 0) continue;
                throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1313"));
            }
            ((IBusiDataService)NCLocator.getInstance().lookup(IBusiDataService.class)).updateOccupationmny(all_busidatas);
        }
        catch (SQLException e) {
            throw new BusinessException((Throwable)e);
        }
    }

    private String getInitCode(String pk_billtype) {
        if ("F0".equals(pk_billtype) || "F2".equals(pk_billtype)) {
            return "AR1";
        }
        return "AP1";
    }

    private Map<String, List<TermVO>> chgCollectionToMap(Collection<TermVO> bills) {
        if (ArrayUtil.isArrayIsNull((Object[])new Object[]{bills})) {
            return null;
        }
        HashMap<String, List<TermVO>> map = new HashMap<String, List<TermVO>>();
        for (TermVO vo : bills) {
            if (null == map.get(vo.getPk_bill())) {
                map.put(vo.getPk_bill(), new ArrayList());
            }
            ((List)map.get(vo.getPk_bill())).add(vo);
        }
        return map;
    }

    private void frozenSrcBillAndBusidata(Map<String, String[]> map) throws BusinessException {
        String condition;
        if (Collections.isEmpty(map)) {
            return;
        }
        ArapBillDAO dao = new ArapBillDAO();
        Set<String> billTypeSet = map.keySet();
        HashSet<Object> keySet = new HashSet<Object>();
        for (String pk_billType : billTypeSet) {
            Object vos;
            Object[] pks = map.get(pk_billType);
            if (!ArrayUtils.isNotEmpty((Object[])pks) || !ArrayUtils.isNotEmpty((Object[])(vos = dao.queryBillByPrimaryKeys((String[])pks, pk_billType)))) continue;
            SagasUtils.frozenAndAddSaga((String)"other", (AggregatedValueObject[])vos);
            keySet.addAll(Arrays.asList(pks));
        }
        try {
            condition = SqlUtils.getInStr((String)"pk_bill", (String[])keySet.toArray(new String[0]), (boolean[])new boolean[]{true});
        }
        catch (SQLException e) {
            throw new BusinessException((Throwable)e);
        }
        List result = (List)new BaseDAO().retrieveByClause(ArapBusiDataVO.class, condition);
        if (Collections.isEmpty((Collection)result)) {
            return;
        }
        HashMap<String, ArrayList<ArapBusiDataVO>> busidataMap = new HashMap<String, ArrayList<ArapBusiDataVO>>();
        for (ArapBusiDataVO busidataVO : result) {
            String pk_billtype = busidataVO.getPk_billtype();
            ArrayList<ArapBusiDataVO> tmpList = null;
            tmpList = (ArrayList<ArapBusiDataVO>)busidataMap.get(pk_billtype);
            if (tmpList == null) {
                tmpList = new ArrayList<ArapBusiDataVO>();
            }
            tmpList.add(busidataVO);
            busidataMap.put(pk_billtype, tmpList);
        }
        Set busiEntrySet = busidataMap.entrySet();
        for (Map.Entry entry : busiEntrySet) {
            SagasUtils.frozenAndAddSaga((String)"other", (SuperVO[])((SuperVO[])((List)entry.getValue()).toArray(new ArapBusiDataVO[0])), (String)"billno", (String)((String)entry.getKey()));
        }
    }

    public void checkBillStatus(BaseAggVO vo) {
        if ("F3".equals(vo.getHeadVO().getPk_billtype()) || "F2".equals(vo.getHeadVO().getPk_billtype())) {
            return;
        }
        if (vo.getHeadVO().getEffectstatus().intValue() != BillEnumCollection.InureSign.OKINURE.VALUE.intValue()) {
            ExceptionUtils.wrappBusinessException((String)(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0316_0", "02006arappub0316-0016") + vo.getHeadVO().getBillno() + NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0316_0", "02006arappub0316-0017")));
        }
    }

    private void checkMoney(UFDouble newOcc, UFDouble money, Boolean isUpZero) throws BusinessException {
        if (newOcc.compareTo((Object)UFDouble.ZERO_DBL) < 0) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1251"));
        }
    }

    class TermComparator<T extends TermVO>
    implements Comparator<T>,
    Serializable {
        private static final long serialVersionUID = 1L;
        private boolean isEarly = false;

        public TermComparator(boolean para) {
            this.isEarly = para;
        }

        @Override
        public int compare(T arg0, T arg1) {
            if (this.isEarly) {
                return arg0.getExpiredate().compareTo(arg1.getExpiredate());
            }
            return Integer.valueOf(UFDate.getDaysBetween((UFDate)arg0.getExpiredate(), (UFDate)new UFDate())).compareTo(UFDate.getDaysBetween((UFDate)arg1.getExpiredate(), (UFDate)new UFDate()));
        }
    }
}

