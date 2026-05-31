/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.bill.ArapBillPubUtil
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.impl.pubapp.pattern.database.DataAccessUtils
 *  nc.vo.arap.basebill.BaseBillVO
 *  nc.vo.arap.basebill.BaseItemVO
 *  nc.vo.arap.pub.BillEnumCollection$InureSign
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pf.change.PfUtilBaseTools
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.lang.UFDouble
 *  nc.vo.pubapp.pattern.data.IRowSet
 *  nc.vo.pubapp.pattern.pub.SqlBuilder
 */
package nc.bs.arap.util;

import java.util.ArrayList;
import java.util.Arrays;
import nc.bs.arap.bill.ArapBillPubUtil;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.impl.pubapp.pattern.database.DataAccessUtils;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pf.change.PfUtilBaseTools;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.data.IRowSet;
import nc.vo.pubapp.pattern.pub.SqlBuilder;

public class ArapBillGenerateUtil {
    public static AggregatedValueObject validateGenerateBill(AggregatedValueObject bill) throws BusinessException {
        BaseBillVO headVO = (BaseBillVO)bill.getParentVO();
        Integer effectstatus = headVO.getEffectstatus();
        if (!ArapBillGenerateUtil.hasGenerateDriveAction(headVO.getPk_busitype(), InvocationInfoProxy.getInstance().getUserId())) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61008_0", "02006v61008-0387"));
        }
        if (effectstatus.intValue() != BillEnumCollection.InureSign.OKINURE.VALUE.intValue()) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61008_0", "02006v61008-0384"));
        }
        return ArapBillGenerateUtil.removeOccuZealItem(bill);
    }

    public static AggregatedValueObject removeOccuZealItem(AggregatedValueObject bill) throws BusinessException {
        ArrayList<BaseItemVO> items = new ArrayList<BaseItemVO>(Arrays.asList((BaseItemVO[])bill.getChildrenVO()));
        for (int i = 0; i < items.size(); ++i) {
            Object occupationmny = ((BaseItemVO)items.get(i)).getAttributeValue("occupationmny");
            if (!UFDouble.ZERO_DBL.equals((Object)((UFDouble)occupationmny))) continue;
            items.remove(i);
            --i;
        }
        if (items.size() == 0) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61008_0", "02006v61008-0385"));
        }
        bill.setChildrenVO((CircularlyAccessibleValueObject[])items.toArray(new BaseItemVO[0]));
        ArapBillPubUtil.refreshChildVO2HeadVO((AggregatedValueObject[])new AggregatedValueObject[]{bill});
        return bill;
    }

    private static boolean hasGenerateDriveAction(String pk_busitype, String userId) {
        SqlBuilder sql = new SqlBuilder();
        sql.append("select pk_sourcebilltype,pk_billtype,actiontype");
        sql.append(" from pub_messagedrive where ");
        sql.append("pk_sourcebusinesstype", pk_busitype);
        sql.append(" and ");
        sql.append("sourceaction", "GENERATE");
        sql.append(" and (");
        sql.append("configflag", 1);
        sql.append(" or (");
        sql.append("configflag", 2);
        sql.append(" and ");
        sql.append("operator", userId);
        sql.append(") or (");
        sql.append("configflag", 3);
        sql.append(" and operator in(select pk_role from sm_user_role where ");
        sql.append("cuserid", userId);
        sql.append("))) ");
        DataAccessUtils util = new DataAccessUtils();
        IRowSet result = util.query(sql.toString());
        if (null == result || 0 == result.size()) {
            return false;
        }
        while (result.next()) {
            String destBilltype = PfUtilBaseTools.getRealBilltype((String)result.getString(1));
            String actiontype = result.getString(2);
            if (!"36D1".equals(destBilltype) && !"SAVE".equals(actiontype)) continue;
            return true;
        }
        return false;
    }
}

