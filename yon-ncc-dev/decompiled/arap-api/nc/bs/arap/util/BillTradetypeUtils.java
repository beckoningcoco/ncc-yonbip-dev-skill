/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.pf.pub.PfDataCache
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.billtype.BilltypeVO
 *  nc.vo.pub.lang.UFBoolean
 *  nccloud.commons.lang.ArrayUtils
 */
package nc.bs.arap.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.framework.common.NCLocator;
import nc.bs.pf.pub.PfDataCache;
import nc.pubitf.arap.djlx.IBillTypePublic;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.cache.FiPubDataCache;
import nc.vo.arap.djlx.DjLXVO;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.billtype.BilltypeVO;
import nc.vo.pub.lang.UFBoolean;
import nccloud.commons.lang.ArrayUtils;

public class BillTradetypeUtils {
    public static AggregatedValueObject[] getBillsOfcommit(AggregatedValueObject[] bills) {
        HashSet<String> tradetypeset = new HashSet<String>();
        for (AggregatedValueObject bill : bills) {
            tradetypeset.add((String)bill.getParentVO().getAttributeValue("pk_tradetype"));
        }
        DjLXVO[] djlvo = null;
        try {
            IBillTypePublic lookup = (IBillTypePublic)NCLocator.getInstance().lookup(IBillTypePublic.class);
            djlvo = lookup.queryBillTypeByBillTypeCode(tradetypeset.toArray(new String[0]), (String)bills[0].getParentVO().getAttributeValue("pk_group"));
        }
        catch (BusinessException e) {
            ExceptionHandler.consume((Throwable)e);
        }
        tradetypeset.clear();
        if (!ArrayUtils.isEmpty(djlvo)) {
            for (DjLXVO vo : djlvo) {
                if (!vo.getIscommit().equals((Object)UFBoolean.TRUE)) continue;
                tradetypeset.add(vo.getDjlxbm());
            }
        }
        ArrayList<AggregatedValueObject> ret = new ArrayList<AggregatedValueObject>();
        for (AggregatedValueObject bill : bills) {
            if (!tradetypeset.contains(bill.getParentVO().getAttributeValue("pk_tradetype"))) continue;
            ret.add(bill);
        }
        return ret.toArray(new AggregatedValueObject[0]);
    }

    public static boolean isqr(AggregatedValueObject[] bills) {
        return BillTradetypeUtils.isqr(bills[0]);
    }

    public static boolean isqr(AggregatedValueObject bill) {
        BaseBillVO head = (BaseBillVO)bill.getParentVO();
        return BillTradetypeUtils.isqr(head.getPk_tradetype(), head.getPk_group());
    }

    private static boolean isqr(String tradetype, String pk_group) {
        List<String> skfk = Arrays.asList("F2", "F3");
        BilltypeVO billTypeVO = PfDataCache.getBillType((String)tradetype);
        if (billTypeVO == null) {
            return false;
        }
        if (!skfk.contains(billTypeVO.getParentbilltype())) {
            return false;
        }
        DjLXVO billType = FiPubDataCache.getBillType(tradetype, pk_group);
        return billType == null ? false : billType.getIsqr() == UFBoolean.TRUE;
    }

    public static boolean isqr(String tradetype) {
        return BillTradetypeUtils.isqr(tradetype, InvocationInfoProxy.getInstance().getGroupId());
    }

    public static UFBoolean isApplyCombine(String tradetype) {
        List<String> skfk = Arrays.asList("F2", "F3");
        BilltypeVO billTypeVO = PfDataCache.getBillType((String)tradetype);
        if (billTypeVO == null) {
            return UFBoolean.FALSE;
        }
        if (!skfk.contains(billTypeVO.getParentbilltype())) {
            return UFBoolean.FALSE;
        }
        DjLXVO billType = FiPubDataCache.getBillType(tradetype, InvocationInfoProxy.getInstance().getGroupId());
        return billType == null || billType.getIscombine() == null ? UFBoolean.FALSE : billType.getIscombine();
    }
}

