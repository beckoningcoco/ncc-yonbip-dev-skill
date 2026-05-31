/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.dao.BaseDAO
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.framework.core.service.TimeService
 *  nc.bs.pf.pub.PfDataCache
 *  nc.vo.arap.estipayable.AggEstiPayableBillVO
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.billtype.BilltypeVO
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pub.lang.UFDateTime
 *  nc.vo.pub.lang.UFDouble
 *  nccloud.commons.lang.ArrayUtils
 *  nccloud.commons.lang.StringUtils
 */
package nc.bs.arap.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import nc.bs.arap.bill.ArapBillPubUtil;
import nc.bs.arap.util.BillAccountCalendarUtils;
import nc.bs.arap.util.CheckException;
import nc.bs.dao.BaseDAO;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.framework.core.service.TimeService;
import nc.bs.pf.pub.PfDataCache;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.arap.estipayable.AggEstiPayableBillVO;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.SuperVO;
import nc.vo.pub.billtype.BilltypeVO;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.lang.UFDouble;
import nccloud.commons.lang.ArrayUtils;
import nccloud.commons.lang.StringUtils;

public final class BillStatusUtils {
    private static int increase;

    public static <T extends AggregatedValueObject> Map<String, Integer> enUpdateVOStauts(T[] aggvos, T[] orignalaggvo) throws BusinessException {
        SuperVO[] items = BillStatusUtils.constructItems(aggvos);
        SuperVO[] oriItems = BillStatusUtils.constructItems(orignalaggvo);
        Map<String, SuperVO> items4Now = BillStatusUtils.constructItemMap(items);
        Map<String, SuperVO> itemMap = BillStatusUtils.constructItemMap(oriItems);
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < items.length; ++i) {
            SuperVO item = items[i];
            if (item.getStatus() == 2) {
                map.put(BillStatusUtils.getStatusKey(item), 2);
                continue;
            }
            if (item.getStatus() == 3) {
                map.put(BillStatusUtils.getStatusKey(item), 3);
                continue;
            }
            if (item.getStatus() == 1) {
                if (!BillStatusUtils.isRealChange((BaseItemVO)item, itemMap.get(item.getPrimaryKey()))) continue;
                map.put(BillStatusUtils.getStatusKey(item), 1);
                continue;
            }
            if (item.getStatus() != 0) continue;
            map.put(BillStatusUtils.getStatusKey(item), 0);
        }
        ArrayList<SuperVO> deleteList = new ArrayList<SuperVO>();
        for (int i = 0; i < oriItems.length; ++i) {
            SuperVO item = oriItems[i];
            if (!StringUtils.isNotEmpty((CharSequence)item.getPrimaryKey()) || items4Now.get(item.getPrimaryKey()) != null) continue;
            item.setStatus(3);
            deleteList.add(item);
        }
        if (deleteList.size() > 0) {
            new BaseDAO().deleteVOArray(deleteList.toArray(new SuperVO[0]));
        }
        return map;
    }

    private static boolean isRealChange(BaseItemVO baseItemVO, SuperVO superVO) {
        return true;
    }

    private static Map<String, SuperVO> constructItemMap(SuperVO[] oriItems) {
        HashMap<String, SuperVO> map = new HashMap<String, SuperVO>();
        for (SuperVO item : oriItems) {
            map.put(item.getPrimaryKey(), item);
        }
        return map;
    }

    private static SuperVO[] constructItems(AggregatedValueObject[] orignalaggvo) {
        ArrayList<SuperVO> items = new ArrayList<SuperVO>();
        for (AggregatedValueObject oriaggvo : orignalaggvo) {
            for (CircularlyAccessibleValueObject superVO : oriaggvo.getChildrenVO()) {
                items.add((SuperVO)superVO);
            }
        }
        return items.toArray(new SuperVO[0]);
    }

    public static int getIncrease() {
        if (increase > 100) {
            increase = 1;
        }
        return increase++;
    }

    public static String getStatusKey(SuperVO next) {
        UFDouble money;
        Integer rownum = (Integer)next.getAttributeValue("rowno");
        if (rownum == null) {
            rownum = BillStatusUtils.getIncrease() + 10;
            next.setAttributeValue("rowno", (Object)rownum);
        }
        if ((money = (UFDouble)next.getAttributeValue("money_de")) == null || money.compareTo((Object)UFDouble.ZERO_DBL) == 0) {
            money = (UFDouble)next.getAttributeValue("money_cr");
        }
        return next.getAttributeValue("billno") + "#" + rownum + "#" + money;
    }

    public static <T extends AggregatedValueObject> Map<String, Integer> enNewVOStauts(T[] aggvos) throws BusinessException {
        return BillStatusUtils.enVOStauts(aggvos, (int)2);
    }

    public static <T extends AggregatedValueObject> Map<String, Integer> enDeleteVOStauts(T[] aggvos) {
        return BillStatusUtils.enVOStauts(aggvos, (int)3);
    }

    private static <T extends AggregatedValueObject> Map<String, Integer> enVOStauts(T[] aggvos, int vostatus) {
        LinkedList<CircularlyAccessibleValueObject> newChildren = new LinkedList<CircularlyAccessibleValueObject>();
        ConcurrentLinkedQueue<String> billnoqueue = null;
        ConcurrentLinkedQueue<Integer> link = null;
        boolean bnempty = StringUtils.isEmpty((CharSequence)((String)aggvos[0].getChildrenVO()[0].getAttributeValue("billno")));
        if (bnempty) {
            billnoqueue = new ConcurrentLinkedQueue<String>();
            link = new ConcurrentLinkedQueue<Integer>();
        }
        for (T aggvo : aggvos) {
            newChildren.addAll(Arrays.asList(aggvo.getChildrenVO()));
            ((SuperVO)aggvo.getParentVO()).setStatus(vostatus);
            if (!bnempty) continue;
            billnoqueue.add((String)aggvo.getParentVO().getAttributeValue("billno"));
            link.add(aggvo.getChildrenVO().length);
        }
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        int i = 0;
        int index = 0;
        String billno = null;
        int row = 0;
        for (CircularlyAccessibleValueObject next : newChildren) {
            if (!bnempty) {
                billno = (String)next.getAttributeValue("billno");
            } else if (i >= index) {
                Integer poll = (Integer)link.poll();
                index += poll == null ? 0 : poll;
                String poll2 = (String)billnoqueue.poll();
                billno = poll2 == null ? null : poll2;
            }
            next.setStatus(vostatus);
            Object rowno = next.getAttributeValue("rowno");
            if (rowno == null) {
                next.setAttributeValue("rowno", (Object)row);
                map.put(billno + "#" + row, vostatus);
                ++row;
            } else {
                map.put(billno + "#" + rowno, vostatus);
            }
            ++i;
        }
        return map;
    }

    private static <T extends CircularlyAccessibleValueObject> void enVOStauts(T[] cavos, int vostatus) {
        for (T vo : cavos) {
            vo.setStatus(vostatus);
        }
    }

    public static <T extends AggregatedValueObject> void enCUDVODefVals(T[] aggvos) {
        BillStatusUtils.enCUDVODefVals(aggvos, (boolean)false, null);
    }

    public static <T extends AggregatedValueObject> void enCUDVODefVals(T[] aggvos, boolean isupdate, T[] aggvos_ori) {
        LinkedList<CircularlyAccessibleValueObject> childrenVOs = new LinkedList<CircularlyAccessibleValueObject>();
        HashMap<String, CircularlyAccessibleValueObject> ori_childMap = new HashMap<String, CircularlyAccessibleValueObject>();
        try {
            if (isupdate && aggvos_ori != null) {
                for (T aggvo : aggvos_ori) {
                    CircularlyAccessibleValueObject[] childrenVO = aggvo.getChildrenVO();
                    if (childrenVO == null) continue;
                    for (CircularlyAccessibleValueObject child : childrenVO) {
                        if (child == null || child.getPrimaryKey() == null) continue;
                        ori_childMap.put(child.getPrimaryKey(), child);
                    }
                }
            }
        }
        catch (Exception e) {
            ExceptionHandler.handleRuntimeException((Exception)e);
        }
        for (T aggvo : aggvos) {
            CircularlyAccessibleValueObject vo = aggvo.getParentVO();
            if (BillEnumCollection.BillSatus.TEMPEORARY.VALUE.equals(vo.getAttributeValue("billstatus"))) {
                try {
                    BillAccountCalendarUtils.setAccperiodYearMonth(new AggregatedValueObject[]{aggvo});
                }
                catch (BusinessException e) {
                    ExceptionHandler.consume((Throwable)e);
                }
            }
            childrenVOs.addAll(Arrays.asList(aggvo.getChildrenVO()));
            BillStatusUtils.enCUDVODefVals(vo, false, null, false);
            BillStatusUtils.enRedundantVODefVals(aggvo);
            if (!ArrayUtils.isEmpty((Object[])aggvo.getChildrenVO())) {
                vo.setAttributeValue("pk_currtype", aggvo.getChildrenVO()[0].getAttributeValue("pk_currtype"));
                vo.setAttributeValue("rate", aggvo.getChildrenVO()[0].getAttributeValue("rate"));
            }
            try {
                for (CircularlyAccessibleValueObject child : childrenVOs) {
                    String pk_billtype = (String)vo.getAttributeValue("pk_billtype");
                    if (pk_billtype != null) {
                        if (pk_billtype.equals("F0") || pk_billtype.equals("F3") || pk_billtype.equals("23E0")) {
                            child.setAttributeValue("direction", (Object)BillEnumCollection.Direction.DEBIT.VALUE);
                        } else if (pk_billtype.equals("F1") || pk_billtype.equals("F2") || pk_billtype.equals("23E1")) {
                            child.setAttributeValue("direction", (Object)BillEnumCollection.Direction.CREDIT.VALUE);
                        }
                    }
                    if (vo.getAttributeValue("src_syscode") != null && child.getAttributeValue("src_syscode") == null) {
                        child.setAttributeValue("src_syscode", vo.getAttributeValue("src_syscode"));
                    }
                    if (isupdate && child.getStatus() == 1 && child.getPrimaryKey() != null && ori_childMap.get(child.getPrimaryKey()) != null) {
                        BillStatusUtils.enCUDVODefVals(child, true, (CircularlyAccessibleValueObject)ori_childMap.get(child.getPrimaryKey()), ArapBillPubUtil.isFromArap((BaseBillVO)vo, (BaseItemVO)child));
                        continue;
                    }
                    BillStatusUtils.enCUDVODefVals(child, false, null, ArapBillPubUtil.isFromArap((BaseBillVO)vo, (BaseItemVO)child));
                }
            }
            catch (Exception e) {
                ExceptionHandler.handleRuntimeException((Exception)e);
            }
        }
    }

    public static <T extends CircularlyAccessibleValueObject> void enCUDVODefVals(T vo, boolean isupdate, T vo_ori, boolean isArapPullBill) {
        String pk_tradetype = (String)vo.getAttributeValue("pk_tradetype");
        BilltypeVO billTypevo = PfDataCache.getBillType((String)pk_tradetype);
        vo.setAttributeValue("pk_tradetypeid", (Object)(billTypevo == null ? null : billTypevo.getPk_billtypeid()));
        String top_billtype = (String)vo.getAttributeValue("top_billtype");
        String pk_billtype = (String)vo.getAttributeValue("pk_billtype");
        if (vo.getAttributeValue("src_syscode") == null || vo.getAttributeValue("src_syscode").toString().trim().length() == 0 || vo.getAttributeValue("src_syscode").equals(0)) {
            if (ArapBillPubUtil.isARSysBilltype(pk_billtype)) {
                vo.setAttributeValue("src_syscode", (Object)BillEnumCollection.FromSystem.AR.VALUE);
            } else {
                vo.setAttributeValue("src_syscode", (Object)BillEnumCollection.FromSystem.AP.VALUE);
            }
        }
        switch (vo.getStatus()) {
            case 2: {
                Integer direction;
                if (!(vo instanceof BaseBillVO)) {
                    try {
                        vo.setPrimaryKey(null);
                    }
                    catch (BusinessException e) {
                        ExceptionHandler.consume((Throwable)e);
                    }
                }
                vo.setAttributeValue("billstatus", (Object)BillEnumCollection.BillSatus.SAVE.VALUE);
                vo.setAttributeValue("creationtime", (Object)TimeService.getInstance().getUFDateTime());
                if (null == vo.getAttributeValue("isinit")) {
                    vo.setAttributeValue("isinit", (Object)"N");
                }
                if ((direction = (Integer)vo.getAttributeValue("direction")) != null && direction.equals(BillEnumCollection.Direction.CREDIT.VALUE)) {
                    vo.setAttributeValue("money_bal", vo.getAttributeValue("money_cr"));
                    vo.setAttributeValue("local_money_bal", vo.getAttributeValue("local_money_cr"));
                    break;
                }
                if (direction == null || !direction.equals(BillEnumCollection.Direction.DEBIT.VALUE)) break;
                vo.setAttributeValue("money_bal", vo.getAttributeValue("money_de"));
                vo.setAttributeValue("local_money_bal", vo.getAttributeValue("local_money_de"));
                break;
            }
            case 1: {
                Object atrrValue = vo.getAttributeValue("billstatus");
                int oldStatus = -1;
                if (atrrValue != null) {
                    oldStatus = (Integer)atrrValue;
                }
                if (oldStatus != BillEnumCollection.BillSatus.TEMPEORARY.VALUE && oldStatus != BillEnumCollection.BillSatus.UNCOMFIRM.VALUE) {
                    vo.setAttributeValue("billstatus", (Object)BillEnumCollection.BillSatus.SAVE.VALUE);
                }
                vo.setAttributeValue("modifiedtime", (Object)TimeService.getInstance().getUFDateTime());
                vo.setAttributeValue("modifier", (Object)BillStatusUtils.getUserID());
                Integer direction = (Integer)vo.getAttributeValue("direction");
                if (direction != null && direction.equals(BillEnumCollection.Direction.CREDIT.VALUE)) {
                    vo.setAttributeValue("money_bal", vo.getAttributeValue("money_cr"));
                    vo.setAttributeValue("local_money_bal", vo.getAttributeValue("local_money_cr"));
                    break;
                }
                if (direction == null || !direction.equals(BillEnumCollection.Direction.DEBIT.VALUE)) break;
                vo.setAttributeValue("money_bal", vo.getAttributeValue("money_de"));
                vo.setAttributeValue("local_money_bal", vo.getAttributeValue("local_money_de"));
                break;
            }
            case 3: {
                vo.setAttributeValue("billstatus", (Object)BillEnumCollection.BillSatus.DELETED.VALUE);
                break;
            }
        }
        BillStatusUtils.dealOccupationmny(vo, isupdate, vo_ori, top_billtype, pk_billtype, isArapPullBill);
    }

    private static <T extends CircularlyAccessibleValueObject> void dealOccupationmny(T vo, boolean isupdate, T vo_ori, String top_billtype, String pk_billtype, boolean isArapPullBill) {
        if (isupdate) {
            Object money_bal2;
            if (isArapPullBill) {
                vo.setAttributeValue("occupationmny", (Object)UFDouble.ZERO_DBL);
                return;
            }
            Object occmny2A = vo_ori.getAttributeValue("occupationmny");
            Object occmny2 = occmny2A == null ? UFDouble.ZERO_DBL : occmny2A;
            Object money_bal2A = vo_ori.getAttributeValue("money_bal");
            Object object = money_bal2 = money_bal2A == null ? UFDouble.ZERO_DBL : money_bal2A;
            if (money_bal2.compareTo(occmny2) == 0) {
                vo.setAttributeValue("occupationmny", vo.getAttributeValue("money_bal"));
                return;
            }
            vo.setAttributeValue("occupationmny", (Object)((UFDouble)vo.getAttributeValue("money_bal")).sub(money_bal2.sub(occmny2)));
            return;
        }
        if (isArapPullBill) {
            vo.setAttributeValue("occupationmny", (Object)UFDouble.ZERO_DBL);
            return;
        }
        if (top_billtype != null && (top_billtype.equals("4D50") || top_billtype.equals("4D46") || top_billtype.equals("4D48")) && StringUtils.isNotEmpty((CharSequence)((String)vo.getAttributeValue("src_billid")))) {
            return;
        }
        if (top_billtype != null && top_billtype.equals(pk_billtype)) {
            vo.setAttributeValue("occupationmny", vo.getAttributeValue("money_de") == null || vo.getAttributeValue("money_de").equals(UFDouble.ZERO_DBL) ? vo.getAttributeValue("money_cr") : vo.getAttributeValue("money_de"));
        } else {
            vo.setAttributeValue("occupationmny", vo.getAttributeValue("money_bal"));
        }
    }

    private static UFDateTime getCurrDate() {
        return new UFDateTime();
    }

    private static String getUserID() {
        return InvocationInfoProxy.getInstance().getUserId();
    }

    public static <T extends AggregatedValueObject> void enHeadChgBodyUnChgVOStatus(T[] vos) {
        LinkedList<CircularlyAccessibleValueObject> linklist = new LinkedList<CircularlyAccessibleValueObject>();
        for (T t : vos) {
            t.getParentVO().setStatus(1);
            linklist.addAll(Arrays.asList(t.getChildrenVO()));
        }
        BillStatusUtils.enVOStauts((CircularlyAccessibleValueObject[])linklist.toArray(vos[0].getChildrenVO()), (int)0);
    }

    public static <T extends AggregatedValueObject> void enHeadChgBodyUnChgVOStatus(List<T> vos) {
        LinkedList<CircularlyAccessibleValueObject> linklist = new LinkedList<CircularlyAccessibleValueObject>();
        for (AggregatedValueObject t : vos) {
            t.getParentVO().setStatus(1);
            linklist.addAll(Arrays.asList(t.getChildrenVO()));
        }
        BillStatusUtils.enVOStauts((CircularlyAccessibleValueObject[])linklist.toArray(((AggregatedValueObject)vos.get(0)).getChildrenVO()), (int)0);
    }

    public static void setBeanBodyStatusUnChange(AggregatedValueObject aggBean) {
        SuperVO head = (SuperVO)aggBean.getParentVO();
        SuperVO[] bodys = (SuperVO[])aggBean.getChildrenVO();
        head.setStatus(1);
        if (!CheckException.checkArraysIsNull(bodys)) {
            for (SuperVO bean : bodys) {
                bean.setStatus(0);
            }
        }
    }

    public static <T extends AggregatedValueObject> void enRedundantVODefVals(T vo) {
        Object billno = vo.getParentVO().getAttributeValue("billno");
        Object tradetype = vo.getParentVO().getAttributeValue("pk_tradetype");
        Object billtype = vo.getParentVO().getAttributeValue("pk_billtype");
        block10: for (CircularlyAccessibleValueObject childvo : vo.getChildrenVO()) {
            switch (childvo.getStatus()) {
                case 2: {
                    childvo.setAttributeValue("billno", billno);
                    childvo.setAttributeValue("pk_tradetype", tradetype);
                    childvo.setAttributeValue("pk_billtype", billtype);
                    continue block10;
                }
                case 3: {
                    continue block10;
                }
                case 1: {
                    continue block10;
                }
            }
        }
        switch (vo.getParentVO().getStatus()) {
            case 2: {
                break;
            }
            case 3: {
                break;
            }
            case 1: {
                break;
            }
        }
        if (!ArrayUtils.isEmpty((Object[])vo.getChildrenVO())) {
            vo.getParentVO().setAttributeValue("pk_currtype", vo.getChildrenVO()[0].getAttributeValue("pk_currtype"));
            vo.getParentVO().setAttributeValue("rate", vo.getChildrenVO()[0].getAttributeValue("rate"));
        }
    }

    public static <T extends AggregatedValueObject> void enInitRedundantVODefVals(T vo) {
        Object billno = vo.getParentVO().getAttributeValue("billno");
        Object tradetype = vo.getParentVO().getAttributeValue("pk_tradetype");
        Object billtype = vo.getParentVO().getAttributeValue("pk_billtype");
        Object billdate = vo.getParentVO().getAttributeValue("billdate");
        block7: for (CircularlyAccessibleValueObject childvo : vo.getChildrenVO()) {
            switch (childvo.getStatus()) {
                case 2: {
                    try {
                        childvo.setPrimaryKey(null);
                    }
                    catch (BusinessException e) {
                        ExceptionHandler.consume((Throwable)e);
                    }
                    childvo.setAttributeValue("billno", billno);
                    childvo.setAttributeValue("billdate", billdate);
                    childvo.setAttributeValue("pk_tradetype", tradetype);
                    childvo.setAttributeValue("pk_billtype", billtype);
                    continue block7;
                }
                case 3: {
                    continue block7;
                }
                case 1: {
                    continue block7;
                }
            }
        }
        if (!ArrayUtils.isEmpty((Object[])vo.getChildrenVO())) {
            vo.getParentVO().setAttributeValue("pk_currtype", vo.getChildrenVO()[0].getAttributeValue("pk_currtype"));
            vo.getParentVO().setAttributeValue("rate", vo.getChildrenVO()[0].getAttributeValue("rate"));
        }
    }

    public static <T extends AggregatedValueObject> void enInitCUDAppEffVODefVals(T[] vos) {
        String cacheorg = null;
        UFDate billdate = null;
        for (T aggvo : vos) {
            UFDateTime currDate = BillStatusUtils.getCurrDate();
            String userID = BillStatusUtils.getUserID();
            String pk_billtype = (String)aggvo.getParentVO().getAttributeValue("pk_billtype");
            String systemcode = PfDataCache.getBillType((String)pk_billtype).getSystemcode();
            String pk_org = (String)aggvo.getParentVO().getAttributeValue("pk_org");
            switch (aggvo.getParentVO().getStatus()) {
                case 2: {
                    billdate = (UFDate)aggvo.getParentVO().getAttributeValue("billdate");
                    if (billdate == null && !pk_org.equals(cacheorg)) {
                        billdate = ArapBillPubUtil.getArapCreateDate(systemcode.equalsIgnoreCase("AR"), pk_org);
                        cacheorg = pk_org;
                    }
                    aggvo.getParentVO().setAttributeValue("billmaker", (Object)userID);
                    aggvo.getParentVO().setAttributeValue("effectstatus", (Object)BillEnumCollection.InureSign.OKINURE.VALUE);
                    aggvo.getParentVO().setAttributeValue("effectdate", (Object)billdate);
                    aggvo.getParentVO().setAttributeValue("billdate", (Object)billdate);
                    for (CircularlyAccessibleValueObject vo : aggvo.getChildrenVO()) {
                        vo.setAttributeValue("billdate", (Object)billdate);
                    }
                    aggvo.getParentVO().setAttributeValue("effectuser", (Object)userID);
                    aggvo.getParentVO().setAttributeValue("billstatus", (Object)BillEnumCollection.BillSatus.AUDIT.VALUE);
                    aggvo.getParentVO().setAttributeValue("creationtime", (Object)new UFDateTime());
                    break;
                }
                case 1: {
                    billdate = ArapBillPubUtil.getArapCreateDate(systemcode.equalsIgnoreCase("AR"), pk_org);
                    aggvo.getParentVO().setAttributeValue("modifier", (Object)userID);
                    aggvo.getParentVO().setAttributeValue("modifiedtime", (Object)currDate);
                    aggvo.getParentVO().setAttributeValue("effectstatus", (Object)BillEnumCollection.InureSign.OKINURE.VALUE);
                    aggvo.getParentVO().setAttributeValue("effectuser", (Object)userID);
                    aggvo.getParentVO().setAttributeValue("billstatus", (Object)BillEnumCollection.BillSatus.AUDIT.VALUE);
                    break;
                }
                case 3: {
                    aggvo.getParentVO().setAttributeValue("modifier", (Object)userID);
                    aggvo.getParentVO().setAttributeValue("modifiedtime", (Object)currDate);
                    aggvo.getParentVO().setAttributeValue("billstatus", (Object)BillEnumCollection.BillSatus.DELETED.VALUE);
                    break;
                }
                case 0: {
                    break;
                }
            }
            aggvo.getParentVO().setAttributeValue("isinit", (Object)UFBoolean.TRUE);
            BillStatusUtils.enInitRedundantVODefVals(aggvo);
        }
    }

    public static <T extends AggregatedValueObject> void enApprove4EffectVODefVals(T[] aggVO) {
        String userID = BillStatusUtils.getUserID();
        for (T vo : aggVO) {
            UFDate date = BillStatusUtils.getBusiDate();
            if (vo instanceof AggEstiPayableBillVO && ((UFBoolean)vo.getParentVO().getAttributeValue("isinit")).booleanValue() && vo.getParentVO().getAttributeValue("approvedate") != null) {
                date = ((UFDateTime)vo.getParentVO().getAttributeValue("approvedate")).getDate();
            }
            vo.getParentVO().setAttributeValue("billstatus", (Object)BillEnumCollection.BillSatus.AUDIT.VALUE);
            vo.getParentVO().setAttributeValue("effectstatus", (Object)BillEnumCollection.InureSign.OKINURE.VALUE);
            vo.getParentVO().setAttributeValue("effectdate", (Object)date);
            vo.getParentVO().setAttributeValue("effectuser", (Object)userID);
        }
    }

    private static UFDate getBusiDate() {
        UFDate date = new UFDate(InvocationInfoProxy.getInstance().getBizDateTime());
        return date;
    }

    public static <T extends AggregatedValueObject> void enUnApv4UnEftVODefVals(T[] aggVO) {
        for (T vo : aggVO) {
            vo.getParentVO().setAttributeValue("billstatus", (Object)BillEnumCollection.BillSatus.SAVE.VALUE);
            vo.getParentVO().setAttributeValue("effectstatus", (Object)BillEnumCollection.InureSign.NOINURE.VALUE);
            vo.getParentVO().setAttributeValue("effectdate", null);
            vo.getParentVO().setAttributeValue("effectuser", null);
            if (vo.getParentVO().getAttributeValue("officialprintuser") == null) continue;
            vo.getParentVO().setAttributeValue("officialprintdate", null);
            vo.getParentVO().setAttributeValue("officialprintuser", null);
        }
    }

    public static <T extends AggregatedValueObject> void enUnSign4UnEffectVODefVals(T[] bills) {
        for (T vo : bills) {
            vo.getParentVO().setAttributeValue("pk_signer", null);
            vo.getParentVO().setAttributeValue("pk_signdate", null);
            vo.getParentVO().setAttributeValue("effectstatus", (Object)BillEnumCollection.InureSign.NOINURE.VALUE);
            vo.getParentVO().setAttributeValue("effectdate", null);
            vo.getParentVO().setAttributeValue("effectuser", null);
        }
    }

    public static <T extends AggregatedValueObject> void enEffectVODefVals(T[] aggVO) {
        for (T vo : aggVO) {
            vo.getParentVO().setAttributeValue("effectstatus", (Object)BillEnumCollection.InureSign.OKINURE.VALUE);
        }
    }

    public static <T extends AggregatedValueObject> void refreshApvStatus2ApvingStatus(T[] bills) {
    }

    public static <T extends AggregatedValueObject> void refreshUnApvStatus2ApvingStatus(T[] bills) {
        for (T t : bills) {
            t.getParentVO().setAttributeValue("billstatus", (Object)BillEnumCollection.BillSatus.SAVE.VALUE);
            t.getParentVO().setAttributeValue("effectstatus", (Object)BillEnumCollection.InureSign.NOINURE.VALUE);
        }
    }

    public static <T extends AggregatedValueObject> void enApvStatus(T[] bills) {
        for (T t : bills) {
            t.getParentVO().setAttributeValue("billstatus", (Object)BillEnumCollection.BillSatus.AUDIT.VALUE);
        }
    }

    public static <T extends AggregatedValueObject> void enUnApvStatus(T[] bills) {
        for (T t : bills) {
            t.getParentVO().setAttributeValue("billstatus", (Object)BillEnumCollection.BillSatus.SAVE.VALUE);
            if (t.getParentVO().getAttributeValue("officialprintuser") == null) continue;
            t.getParentVO().setAttributeValue("officialprintdate", null);
            t.getParentVO().setAttributeValue("officialprintuser", null);
        }
    }
}

