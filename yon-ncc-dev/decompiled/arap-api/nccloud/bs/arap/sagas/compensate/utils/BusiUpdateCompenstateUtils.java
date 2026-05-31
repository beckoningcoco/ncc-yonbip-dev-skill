/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.dao.BaseDAO
 *  nc.impl.pubapp.env.BSContext
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 */
package nccloud.bs.arap.sagas.compensate.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import nc.bs.arap.util.SqlUtils;
import nc.bs.dao.BaseDAO;
import nc.impl.pubapp.env.BSContext;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.pub.ArapBillTypeInfo;
import nc.vo.arap.pub.IArapBilltypeInfo;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nccloud.bs.arap.sagas.compensate.info.EffectInfo;
import nccloud.bs.arap.util.Collections;

public class BusiUpdateCompenstateUtils {
    public static final String COMPENSATE_BUSINESS_INFOS = "COMPENSATE_BUSINESS_INFOS";
    private static String[] fields = new String[]{"billstatus", "effectstatus", "effectdate", "effectuser", "signdate", "signuser"};

    public static void recordBusiInfo(AggregatedValueObject[] bills) throws BusinessException {
        HashSet<String> keys = new HashSet<String>();
        for (AggregatedValueObject vo : bills) {
            keys.add(vo.getParentVO().getPrimaryKey());
        }
        String pk_billType = (String)bills[0].getParentVO().getAttributeValue("pk_billtype");
        IArapBilltypeInfo billTypeInfo = ArapBillTypeInfo.getInstance(pk_billType);
        Collection results = new BaseDAO().retrieveByClause(billTypeInfo.getBillvoClass(), SqlUtils.getInStr(billTypeInfo.getTablePrimaryKeyBill(), keys.toArray(new String[0])), fields);
        if (Collections.isEmpty(results)) {
            return;
        }
        ArrayList<EffectInfo> effectInfos = new ArrayList<EffectInfo>();
        for (Object result : results) {
            BaseBillVO headVO = (BaseBillVO)result;
            EffectInfo effectInfo = new EffectInfo();
            effectInfo.setPrimaryKey(headVO.getPrimaryKey());
            effectInfo.setBillstatus(headVO.getBillstatus());
            effectInfo.setEffectstatus(headVO.getEffectstatus());
            effectInfo.setEffectdate(headVO.getEffectdate());
            effectInfo.setEffectuser(headVO.getEffectuser());
            effectInfo.setSigndate(headVO.getSigndate());
            effectInfo.setSignuser(headVO.getSignuser());
            effectInfos.add(effectInfo);
        }
        BSContext.getInstance().setSession(COMPENSATE_BUSINESS_INFOS, effectInfos);
    }

    public static ArrayList<EffectInfo> fetchBusiInfos() {
        return (ArrayList)BSContext.getInstance().getSession(COMPENSATE_BUSINESS_INFOS);
    }
}

