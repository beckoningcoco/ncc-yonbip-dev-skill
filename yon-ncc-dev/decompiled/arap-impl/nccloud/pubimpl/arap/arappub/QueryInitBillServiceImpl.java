/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.bill.ArapBillPubUtil
 *  nc.bs.arap.util.ArapBillType2TableMapping
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.ui.querytemplate.querytree.IQueryScheme
 *  nc.vo.arap.basebill.BaseAggVO
 *  nc.vo.arap.basebill.BaseBillVO
 *  nc.vo.arap.pub.ArapConstant
 *  nc.vo.arap.pub.BillEnumCollection$VerifyStatus
 *  nc.vo.arap.pub.BillEnumCollection$VoucherStatus
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.query.ConditionVO
 *  nc.vo.pubapp.pagination.PaginationQueryVO
 *  nc.vo.pubapp.query2.sql.process.QuerySchemeProcessor
 *  nccloud.commons.lang.ArrayUtils
 *  nccloud.dto.arap.arappub.PageQueryVO
 *  nccloud.pubitf.arap.arappub.IQueryInitBillService
 */
package nccloud.pubimpl.arap.arappub;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import nc.bs.arap.bill.ArapBillPubUtil;
import nc.bs.arap.util.ArapBillType2TableMapping;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.pub.ArapConstant;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.pub.BusinessException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.query.ConditionVO;
import nc.vo.pubapp.pagination.PaginationQueryVO;
import nc.vo.pubapp.query2.sql.process.QuerySchemeProcessor;
import nccloud.commons.lang.ArrayUtils;
import nccloud.dto.arap.arappub.PageQueryVO;
import nccloud.pubitf.arap.arappub.IQueryInitBillService;

public abstract class QueryInitBillServiceImpl
implements IQueryInitBillService {
    public PageQueryVO queryByQueryScheme(IQueryScheme qryScheme, Integer pageSize) throws BusinessException {
        Object beanid = qryScheme.get("bean_id");
        String selectSql = QueryInitBillServiceImpl.getSql(qryScheme, beanid);
        PaginationQueryVO vo = this.getQueryService().queryPaginationQueryVO(selectSql, Integer.valueOf(100000));
        String[] pks = vo == null ? null : vo.getAllpks();
        BaseAggVO[] vos = null;
        ArrayList<BaseBillVO> allVOs = new ArrayList<BaseBillVO>();
        if (pks != null) {
            int copySize = pks.length < pageSize ? pks.length : pageSize;
            String[] pagepks = Arrays.copyOf(pks, copySize);
            vos = this.getQueryService().findBillByPrimaryKey(pagepks);
            Map map = vo.getBillmap();
            String[] stringArray = pks;
            int n = stringArray.length;
            for (int i = 0; i < n; ++i) {
                String pk = stringArray[i];
                allVOs.add((BaseBillVO)map.get(pk));
            }
        }
        CircularlyAccessibleValueObject[] headVos = null;
        ArrayList<BaseBillVO> list = new ArrayList<BaseBillVO>();
        if (vos != null && vos.length != 0) {
            ArapBillPubUtil.refreshChildVO2HeadVO(vos);
            for (BaseAggVO aggvo : vos) {
                list.add(aggvo.getHeadVO());
            }
            headVos = list.toArray((CircularlyAccessibleValueObject[])Array.newInstance(((CircularlyAccessibleValueObject)list.get(0)).getClass(), 0));
        }
        PageQueryVO pageQueryVO = new PageQueryVO();
        pageQueryVO.setPks(pks);
        pageQueryVO.setHeadvos(headVos);
        pageQueryVO.setCrossList(allVOs.toArray(new BaseBillVO[0]));
        return pageQueryVO;
    }

    public static String getSql(IQueryScheme qryScheme, Object beanid) throws BusinessException {
        QuerySchemeProcessor qrySchemeProcessor = new QuerySchemeProcessor(qryScheme);
        qrySchemeProcessor.appendCurrentGroup();
        qrySchemeProcessor.appendFuncPermissionOrgSql();
        String table = "";
        String table_b = "";
        String billType = "";
        String moneyfield = "";
        String tablepk = "";
        if (ArapConstant.ARAP_MDID_RECBILL.equals(beanid)) {
            tablepk = "pk_recbill";
            table = "ar_recbill.";
            table_b = "ar_recitem.";
            billType = "F0";
            moneyfield = "money_de";
        } else if (ArapConstant.ARAP_MDID_GATHERBILL.equals(beanid)) {
            tablepk = "pk_gatherbill";
            table = "ar_gatherbill.";
            table_b = "ar_gatheritem.";
            billType = "F2";
            moneyfield = "money_cr";
        } else if (ArapConstant.ARAP_MDID_PAYBILL.equals(beanid)) {
            tablepk = "pk_paybill";
            table = "ap_paybill.";
            table_b = "ap_payitem.";
            billType = "F3";
            moneyfield = "money_de";
        } else if (ArapConstant.ARAP_MDID_PAYABLEBILL.equals(beanid)) {
            tablepk = "pk_payablebill";
            table = "ap_payablebill.";
            table_b = "ap_payableitem.";
            billType = "F1";
            moneyfield = "money_cr";
        } else if (ArapConstant.ARAP_MDID_ESTIRECBILL.equals(beanid)) {
            tablepk = "pk_estirecbill";
            table = "ar_estirecbill.";
            table_b = "ar_estirecitem.";
            billType = "23E0";
            moneyfield = "money_de";
        } else if (ArapConstant.ARAP_MDID_ESTIPAYABLEBILL.equals(beanid)) {
            tablepk = "pk_estipayablebill";
            table = "ap_estipayablebill.";
            table_b = "ap_estipayableitem.";
            billType = "23E1";
            moneyfield = "money_cr";
        }
        String selectSql = "SELECT DISTINCT  " + ArapBillType2TableMapping.getParentTablePK((String)billType) + "," + table + "billdate, " + table + "billno," + table + "ts";
        String voucherSql = "";
        String voucherStatus = "";
        String verifyCondSql = "";
        String verifySql = "";
        String verifyStatus = "";
        Object[] condVOs = (ConditionVO[])qryScheme.get("logicalcondition");
        if (condVOs != null && !ArrayUtils.isEmpty((Object[])condVOs)) {
            for (Object condVO : condVOs) {
                if (condVO == null) continue;
                if ("voucherstatus".equals(condVO.getFieldCode())) {
                    voucherStatus = condVO.getValue();
                    continue;
                }
                if (!"verifystatus".equals(condVO.getFieldCode())) continue;
                verifyStatus = condVO.getValue();
            }
        }
        if (voucherStatus != null && voucherStatus.length() == 1) {
            if (BillEnumCollection.VoucherStatus.VOUCHER_NOT_GENERATE.VALUE.equals(voucherStatus)) {
                voucherSql = " AND ( " + table + tablepk + " NOT IN ( SELECT fr.src_relationid FROM fip_relation fr where fr.des_org in (select pk_accountingbook from org_accountingbook where accounttype = 1) and fr.src_relationid is not null )) ";
            } else if (BillEnumCollection.VoucherStatus.VOUCHER_GENERATED.VALUE.equals(voucherStatus)) {
                voucherSql = " INNER JOIN fip_relation fr ON " + table + tablepk + "= fr.src_relationid AND fr.des_billtype='C0'  AND fr.des_org IN (select pk_accountingbook from org_accountingbook where accounttype = 1)";
            } else if (BillEnumCollection.VoucherStatus.ACCOUNTING_VOUCHER.VALUE.equals(voucherStatus)) {
                voucherSql = " INNER JOIN fip_relation fr ON " + table + tablepk + " = fr.src_relationid  INNER join gl_voucher gv ON fr.des_relationid = gv.pk_voucher AND gv.pk_manager <> 'N/A'  and fr.des_org IN (SELECT pk_accountingbook FROM org_accountingbook where accounttype = 1)";
            }
        }
        if (verifyStatus != null && verifyStatus.length() == 1) {
            selectSql = selectSql + ", SUM(" + table_b + moneyfield + "), SUM(" + table_b + "money_bal" + ") ";
            if (BillEnumCollection.VerifyStatus.NOT_VERIFY.VALUE.equals(verifyStatus)) {
                verifyCondSql = "SUM(ABS(" + table_b + "money_bal" + ")) = SUM(ABS(" + table_b + moneyfield + ")) ";
            } else if (BillEnumCollection.VerifyStatus.VERIFIED.VALUE.equals(verifyStatus)) {
                verifyCondSql = "SUM(ABS(" + table_b + "money_bal" + ")) = 0 ";
            } else if (BillEnumCollection.VerifyStatus.PART_VERIFIED.VALUE.equals(verifyStatus)) {
                verifyCondSql = "SUM(ABS(" + table_b + "money_bal" + ")) != 0 AND SUM(ABS(" + table_b + "money_bal" + ")) != SUM(ABS(" + table_b + moneyfield + ")) ";
            }
        }
        selectSql = selectSql + qryScheme.getTableJoinFromWhereSQL();
        if (verifyStatus != null && verifyStatus.length() == 1) {
            String verifyJoinSql = " INNER JOIN " + table_b.substring(0, table_b.length() - 1).trim() + " ON " + table + tablepk + " = " + table_b + tablepk + " ";
            selectSql = selectSql.indexOf("WHERE") >= 0 ? selectSql.split("WHERE")[0] + verifyJoinSql + " WHERE " + selectSql.split("WHERE")[1] : selectSql + verifyJoinSql + " WHERE ";
            verifySql = " GROUP BY " + ArapBillType2TableMapping.getParentTablePK((String)billType) + "," + table + "billdate, " + table + "billno, " + table + "ts HAVING " + verifyCondSql;
        }
        if (BillEnumCollection.VoucherStatus.VOUCHER_NOT_GENERATE.VALUE.equals(voucherStatus)) {
            selectSql = selectSql + voucherSql;
        }
        selectSql = selectSql != null && selectSql.length() > 0 ? selectSql + " and " + table + "isinit = 'Y' and " + table + "dr=0 and " + table + "pk_group = '" + InvocationInfoProxy.getInstance().getGroupId() + "'" : " " + table + "isinit = 'Y' and " + table + "dr=0 and " + table + "pk_group = '" + InvocationInfoProxy.getInstance().getGroupId() + "'";
        if (verifyStatus != null && verifyStatus.length() == 1) {
            selectSql = selectSql + verifySql;
        }
        return selectSql;
    }

    public abstract IQueryInitBillService getQueryService();
}

