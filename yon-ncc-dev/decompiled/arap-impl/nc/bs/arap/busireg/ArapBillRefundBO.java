/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.actions.GatheringbillApproveBatchBSAction
 *  nc.bs.arap.actions.GatheringbillSaveBatchBSAction
 *  nc.bs.arap.bill.ArapBillDAO
 *  nc.bs.arap.util.SqlUtils
 *  nc.bs.dao.BaseDAO
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.framework.common.NCLocator
 *  nc.itf.arap.gathering.IArapGatheringBillQueryService
 *  nc.itf.uap.IUAPQueryBS
 *  nc.itf.uap.pf.IPFBusiAction
 *  nc.itf.uap.pf.IPfExchangeService
 *  nc.vo.arap.basebill.BaseBillVO
 *  nc.vo.arap.basebill.BaseItemVO
 *  nc.vo.arap.gathering.AggGatheringBillVO
 *  nc.vo.arap.gathering.GatheringBillItemVO
 *  nc.vo.arap.pay.PayBillItemVO
 *  nc.vo.arap.payable.PayableBillItemVO
 *  nc.vo.arap.pfflow.ArapBillMapVO
 *  nc.vo.arap.pub.BillEnumCollection$ApproveStatus
 *  nc.vo.cmp.apply.ApplyBVO
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pub.lang.UFDate
 *  nccloud.commons.lang.StringUtils
 *  org.apache.commons.lang3.ArrayUtils
 */
package nc.bs.arap.busireg;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import nc.bs.arap.actions.GatheringbillApproveBatchBSAction;
import nc.bs.arap.actions.GatheringbillSaveBatchBSAction;
import nc.bs.arap.bill.ArapBillDAO;
import nc.bs.arap.util.SqlUtils;
import nc.bs.dao.BaseDAO;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.framework.common.NCLocator;
import nc.itf.arap.gathering.IArapGatheringBillQueryService;
import nc.itf.uap.IUAPQueryBS;
import nc.itf.uap.pf.IPFBusiAction;
import nc.itf.uap.pf.IPfExchangeService;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.arap.gathering.AggGatheringBillVO;
import nc.vo.arap.gathering.GatheringBillItemVO;
import nc.vo.arap.pay.PayBillItemVO;
import nc.vo.arap.payable.PayableBillItemVO;
import nc.vo.arap.pfflow.ArapBillMapVO;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.cmp.apply.ApplyBVO;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nccloud.commons.lang.StringUtils;
import org.apache.commons.lang3.ArrayUtils;

public class ArapBillRefundBO {
    public static void refundF3TOF2(AggregatedValueObject[] bills) throws BusinessException {
        UFBoolean isrefund;
        String pk_billtype = (String)bills[0].getParentVO().getAttributeValue("pk_billtype");
        UFBoolean uFBoolean = isrefund = bills[0].getParentVO().getAttributeValue("isrefund") == null ? UFBoolean.FALSE : (UFBoolean)bills[0].getParentVO().getAttributeValue("isrefund");
        if (!"F3".equals(pk_billtype) || !isrefund.booleanValue()) {
            return;
        }
        AggregatedValueObject[] f2Bills = ((IPfExchangeService)NCLocator.getInstance().lookup(IPfExchangeService.class)).runChangeDataAry(pk_billtype, "F2-Refund", bills, null);
        new GatheringbillSaveBatchBSAction().insertVOs(f2Bills);
        Map<String, String[]> relationMap = ArapBillRefundBO.getRedF2WithF0Relations(f2Bills);
        List<ArapBillMapVO> mapvos = ArapBillRefundBO.constructBillMap(f2Bills, relationMap);
        ArapBillRefundBO.doInsertRegister(mapvos);
        ArapBillRefundBO.setPrepay(relationMap, f2Bills);
        for (AggregatedValueObject aggvo : f2Bills) {
            CircularlyAccessibleValueObject parentVO = aggvo.getParentVO();
            parentVO.setAttributeValue("approver", (Object)InvocationInfoProxy.getInstance().getUserId());
            parentVO.setAttributeValue("approvedate", (Object)new UFDate(InvocationInfoProxy.getInstance().getBizDateTime()));
            parentVO.setAttributeValue("approvestatus", (Object)BillEnumCollection.ApproveStatus.COMMIT.VALUE);
        }
        new GatheringbillApproveBatchBSAction().approveVOs(f2Bills);
    }

    private static Map<String, String[]> getRedF2WithF0Relations(AggregatedValueObject[] f2Bills) throws BusinessException {
        AggGatheringBillVO[] bills = (AggGatheringBillVO[])f2Bills;
        IUAPQueryBS queryService = (IUAPQueryBS)NCLocator.getInstance().lookup(IUAPQueryBS.class);
        HashMap<String, String> f2map = new HashMap<String, String>();
        HashSet<String> f3pks = new HashSet<String>();
        for (AggGatheringBillVO bill : bills) {
            GatheringBillItemVO[] childrenVO = (GatheringBillItemVO[])bill.getChildrenVO();
            for (GatheringBillItemVO item : childrenVO) {
                f2map.put(item.getPk_gatheritem(), item.getTop_itemid());
                if (!"F3".equals(item.getTop_billtype())) continue;
                f3pks.add(item.getTop_itemid());
            }
        }
        HashMap<String, String> f3map = new HashMap<String, String>();
        HashSet<String> f1pks = new HashSet<String>();
        HashSet<String> applypks = new HashSet<String>();
        Collection f3Items = queryService.retrieveByClause(PayBillItemVO.class, SqlUtils.getInStr((String)"pk_payitem", (String[])f3pks.toArray(new String[0])));
        for (PayBillItemVO item : f3Items) {
            f3map.put(item.getPk_payitem(), item.getTop_itemid());
            if ("F1".equals(item.getTop_billtype())) {
                f1pks.add(item.getTop_itemid());
            }
            if (!"36D1".equals(item.getTop_billtype())) continue;
            applypks.add(item.getTop_itemid());
        }
        HashMap<String, String> applymap = new HashMap<String, String>();
        if (applypks.size() > 0) {
            Collection applyItems = queryService.retrieveByClause(ApplyBVO.class, SqlUtils.getInStr((String)"pk_apply_b", (String[])applypks.toArray(new String[0])));
            for (ApplyBVO item : applyItems) {
                applymap.put(item.getPk_apply_b(), item.getPk_srcbillrowid());
                if (!"F1".equals(item.getSrcbilltypecode())) continue;
                f1pks.add(item.getPk_srcbillrowid());
            }
        }
        HashMap<String, String[]> f1map = new HashMap<String, String[]>();
        Collection f1Items = queryService.retrieveByClause(PayableBillItemVO.class, SqlUtils.getInStr((String)"pk_payableitem", (String[])f1pks.toArray(new String[0])));
        for (GatheringBillItemVO item : f1Items) {
            String[] pks = new String[]{item.getTop_billid(), item.getTop_itemid(), item.getTop_billtype()};
            f1map.put(item.getPrimaryKey(), pks);
        }
        HashMap<String, String[]> map = new HashMap<String, String[]>();
        Set f2_itempks = f2map.keySet();
        for (String f2_itempk : f2_itempks) {
            String f3_itempk = (String)f2map.get(f2_itempk);
            String f1_36D1_itempk = (String)f3map.get(f3_itempk);
            String[] f0_itempk = null;
            f0_itempk = StringUtils.isNotBlank((CharSequence)((CharSequence)applymap.get(f1_36D1_itempk))) ? (String[])f1map.get(applymap.get(f1_36D1_itempk)) : (String[])f1map.get(f1_36D1_itempk);
            map.put(f2_itempk, f0_itempk);
        }
        return map;
    }

    private static List<ArapBillMapVO> constructBillMap(AggregatedValueObject[] bills, Map<String, String[]> relationMap) {
        ArrayList<ArapBillMapVO> mapList = new ArrayList<ArapBillMapVO>();
        for (AggregatedValueObject bill : bills) {
            BaseItemVO[] items;
            BaseBillVO head = (BaseBillVO)bill.getParentVO();
            for (BaseItemVO item : items = (BaseItemVO[])bill.getChildrenVO()) {
                ArapBillMapVO vo = new ArapBillMapVO();
                vo.setDr(Integer.valueOf(0));
                vo.setS_billid(relationMap.get(item.getPrimaryKey())[0]);
                vo.setS_itemid(relationMap.get(item.getPrimaryKey())[1]);
                vo.setS_billtype(relationMap.get(item.getPrimaryKey())[2]);
                vo.setS_system(head.getSyscode() == null ? 0 : head.getSyscode());
                vo.setT_billtype(head.getPk_billtype());
                vo.setT_billid(head.getPrimaryKey());
                vo.setT_itemid(item.getPrimaryKey());
                vo.setT_billtype(head.getPk_billtype());
                vo.setYbje(item.getMoney_bal());
                vo.setYbye(item.getMoney_bal());
                vo.setOldje(item.getMoney_bal());
                vo.setMaptype(0);
                vo.setPk_org(head.getPk_org());
                vo.setPk_currtype(item.getPk_currtype());
                vo.setSettlecurr(item.getSettlecurr());
                vo.setSettlemoney(item.getSettlemoney());
                vo.setIsmanual(UFBoolean.FALSE);
                mapList.add(vo);
            }
        }
        return mapList;
    }

    private static void setPrepay(Map<String, String[]> relamap, AggregatedValueObject[] f2Bills) throws BusinessException {
        ArrayList<Object> srcF2itemId = new ArrayList<Object>();
        if (relamap == null || relamap != null && relamap.size() == 0 || ArrayUtils.isEmpty((Object[])f2Bills)) {
            return;
        }
        HashMap<Object, Object> billtypeMap = new HashMap<Object, Object>();
        for (Map.Entry<String, String[]> parm : relamap.entrySet()) {
            Object[] value = parm.getValue();
            if (ArrayUtils.isEmpty((Object[])value)) continue;
            srcF2itemId.add(value[1]);
            billtypeMap.put(value[2], value[2]);
        }
        String[] billtypes = billtypeMap.values().toArray(new String[0]);
        ArapBillDAO dao = new ArapBillDAO();
        dao.updatePrepaybyTopItem(billtypes[0], srcF2itemId.toArray(new String[0]));
    }

    public static void cancelRefundF3TOF2(AggregatedValueObject[] bills) throws BusinessException {
        UFBoolean isrefund;
        String pk_billtype = (String)bills[0].getParentVO().getAttributeValue("pk_billtype");
        UFBoolean uFBoolean = isrefund = bills[0].getParentVO().getAttributeValue("isrefund") == null ? UFBoolean.FALSE : (UFBoolean)bills[0].getParentVO().getAttributeValue("isrefund");
        if (!"F3".equals(pk_billtype) || !isrefund.booleanValue()) {
            return;
        }
        String[] top_billids = new String[bills.length];
        for (int i = 0; i < bills.length; ++i) {
            top_billids[i] = bills[i].getParentVO().getPrimaryKey();
        }
        String whereSql = "pk_gatherbill in (select distinct pk_gatherbill from ar_gatheritem where " + SqlUtils.getInStr((String)"top_billid", (String[])top_billids) + ") and isrefund = 'Y' and dr = 0";
        AggGatheringBillVO[] gatheringbills = ((IArapGatheringBillQueryService)NCLocator.getInstance().lookup(IArapGatheringBillQueryService.class)).queryVOsByWhere(whereSql);
        if (gatheringbills == null || gatheringbills.length == 0) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0960"));
        }
        for (AggGatheringBillVO gatheringbill : gatheringbills) {
            gatheringbill.getHeadVO().setAttributeValue("isAuto", (Object)true);
        }
        ((IPFBusiAction)NCLocator.getInstance().lookup(IPFBusiAction.class)).processBatch("UNAPPROVE", "F2", (AggregatedValueObject[])gatheringbills, null, null, null);
        ((IPFBusiAction)NCLocator.getInstance().lookup(IPFBusiAction.class)).processBatch("DELETE", "F2", (AggregatedValueObject[])gatheringbills, null, null, null);
    }

    private static void doInsertRegister(List<ArapBillMapVO> insertdatas) throws BusinessException {
        new BaseDAO().insertVOList(insertdatas);
    }
}

