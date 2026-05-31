/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.dao.DAOException
 *  nc.impl.pubapp.pattern.data.bill.BillOperator
 *  nc.impl.pubapp.pattern.data.vo.VOUpdate
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.ISuperVO
 *  nc.vo.pub.SuperVO
 *  nc.vo.pubapp.pattern.model.entity.bill.IBill
 */
package nc.bs.arap.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import nc.bs.dao.DAOException;
import nc.impl.pubapp.pattern.data.bill.BillOperator;
import nc.impl.pubapp.pattern.data.vo.VOUpdate;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.utils.ArrayUtil;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.ISuperVO;
import nc.vo.pub.SuperVO;
import nc.vo.pubapp.pattern.model.entity.bill.IBill;

public final class BillPersistenceUtils {
    public static List<String> EFFICTFIELD = Arrays.asList("effectstatus", "effectdate", "effectuser");
    public static final List<String> SIGNFIELD = Arrays.asList("billstatus", "signdate", "signperiod", "signuser", "signyear", "settleflag");

    @Deprecated
    public static <T extends AggregatedValueObject> T[] updateBills(T[] bills, BillOperator<IBill> operator) {
        if (bills instanceof IBill[]) {
            operator.update((IBill[])bills, (IBill[])bills);
        } else if (null != bills && bills.length > 0 && bills[0] instanceof IBill) {
            IBill[] ibills = new IBill[bills.length];
            System.arraycopy(bills, 0, ibills, 0, bills.length);
            operator.update(ibills, ibills);
        }
        return bills;
    }

    public static <T extends AggregatedValueObject> T[] persistenceApproveVOs(T[] bills) throws DAOException {
        ArrayList<String> list = new ArrayList<String>();
        list.add("billstatus");
        list.add("approvedate");
        list.add("approver");
        list.add("approvestatus");
        list.add("officialprintdate");
        list.add("officialprintuser");
        return BillPersistenceUtils.persistenceHeadVOs(bills, (String[])BillPersistenceUtils.getFieldName(bills[0], list).toArray(new String[0]));
    }

    private static <T extends AggregatedValueObject> List<String> getFieldName(T bill, List<String> list) {
        ArrayList<String> ret = new ArrayList<String>(list);
        for (int index = 0; index < list.size(); ++index) {
            String fname = list.get(index);
            ret.set(index, fname);
        }
        return ret;
    }

    public static <T extends AggregatedValueObject> T[] persistenceEftVOs(T[] bills) throws DAOException {
        List<String> list = BillPersistenceUtils.getFieldName(bills[0], EFFICTFIELD);
        list.addAll(BillPersistenceUtils.getFieldName(bills[0], SIGNFIELD));
        return BillPersistenceUtils.persistenceHeadVOs(bills, (String[])list.toArray(new String[0]));
    }

    public static <T extends AggregatedValueObject> T[] persistenceApvAndEftVOs(T[] bills) throws DAOException {
        List<String> list = BillPersistenceUtils.getFieldName(bills[0], EFFICTFIELD);
        list.add("billstatus");
        list.add("approvedate");
        list.add("approver");
        list.add("approvestatus");
        list.add("officialprintdate");
        list.add("officialprintuser");
        return BillPersistenceUtils.persistenceHeadVOs(bills, (String[])list.toArray(new String[0]));
    }

    public static <T extends AggregatedValueObject> T[] persistenceHeadVOs(T[] bills, String[] fieldNames) throws DAOException {
        SuperVO[] headvos = (SuperVO[])ArrayUtil.convertAggVO2HeadVos(bills);
        HashSet<String> uniqueKeys = new HashSet<String>();
        for (String item : fieldNames) {
            uniqueKeys.add(item);
        }
        uniqueKeys.add("lastapproveid");
        VOUpdate bo = new VOUpdate();
        for (SuperVO vo : headvos) {
            vo.setAttributeValue("lastapproveid", vo.getAttributeValue("approver"));
        }
        bo.update((ISuperVO[])((BaseBillVO[])headvos), uniqueKeys.toArray(new String[0]));
        return bills;
    }

    public static <T extends AggregatedValueObject> T[] persistenceDebtHeadVOs(T[] bills, String[] fieldNames) throws DAOException {
        SuperVO[] headvos = (SuperVO[])ArrayUtil.convertAggVO2HeadVos(bills);
        HashSet<String> uniqueKeys = new HashSet<String>();
        for (String item : fieldNames) {
            uniqueKeys.add(item);
        }
        VOUpdate bo = new VOUpdate();
        bo.update((ISuperVO[])headvos, uniqueKeys.toArray(new String[0]));
        return bills;
    }

    public static <T extends AggregatedValueObject> T[] persistenceHeadVOs(T[] bills, List<String> list) throws DAOException {
        return BillPersistenceUtils.persistenceHeadVOs(bills, (String[])BillPersistenceUtils.getFieldName(bills[0], list).toArray(new String[0]));
    }
}

