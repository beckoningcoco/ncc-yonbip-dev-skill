/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.bill.ArapBillPubUtil
 *  nc.bs.arap.util.ArapBillType2TableMapping
 *  nc.bs.arap.util.ArapPermissionUtils
 *  nc.bs.dao.BaseDAO
 *  nc.bs.dao.DAOException
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.pub.pf.PfUtilTools
 *  nc.itf.cmp.apply.IApplyQueryService
 *  nc.pubitf.cmp.apply.IMultiBillSrcQueryForApply
 *  nc.ui.querytemplate.querytree.IQueryScheme
 *  nc.vo.arap.agiotage.ArapBusiDataVO
 *  nc.vo.arap.basebill.BaseAggVO
 *  nc.vo.cmp.apply.ApplyTransferVO
 *  nc.vo.fi.pub.SqlUtils
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.fipub.utils.SqlBuilder
 *  nc.vo.jcom.lang.StringUtil
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pub.lang.UFDouble
 *  nc.vo.pub.query.ConditionVO
 *  nc.vo.pubapp.query2.sql.process.QueryCondition
 *  nccloud.commons.lang.StringUtils
 *  nccloud.impl.platform.common.util.CollectionUtils
 */
package nc.vo.arap.payable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import nc.bs.arap.bill.ArapBillPubUtil;
import nc.bs.arap.util.ArapBillType2TableMapping;
import nc.bs.arap.util.ArapPermissionUtils;
import nc.bs.dao.BaseDAO;
import nc.bs.dao.DAOException;
import nc.bs.framework.common.NCLocator;
import nc.bs.pub.pf.PfUtilTools;
import nc.itf.cmp.apply.IApplyQueryService;
import nc.pubitf.cmp.apply.IMultiBillSrcQueryForApply;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.arap.agiotage.ArapBusiDataVO;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.payable.PayableBillItemVO;
import nc.vo.arap.payable.PayableBillVO;
import nc.vo.cmp.apply.ApplyTransferVO;
import nc.vo.fi.pub.SqlUtils;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.fipub.utils.SqlBuilder;
import nc.vo.jcom.lang.StringUtil;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pub.query.ConditionVO;
import nc.vo.pubapp.query2.sql.process.QueryCondition;
import nccloud.commons.lang.StringUtils;
import nccloud.impl.platform.common.util.CollectionUtils;

public class PayableBillSrcQueryForApply
implements IMultiBillSrcQueryForApply {
    private static final String F1BILLTYPEID = "0000Z3000000000000F1";
    private static List<String> srcitemList = new ArrayList<String>();

    public List<ApplyTransferVO> queryApplyBills(IQueryScheme scheme) {
        List<ApplyTransferVO> transVOList = null;
        try {
            transVOList = this.parseScheme(scheme);
        }
        catch (BusinessException e) {
            ExceptionHandler.handleRuntimeException((Exception)((Object)e));
        }
        return transVOList;
    }

    protected List<ApplyTransferVO> parseScheme(IQueryScheme scheme) throws BusinessException {
        AggregatedValueObject[] appvos;
        ConditionVO[] condVOs = (ConditionVO[])scheme.get("logicalcondition");
        HashMap allcondition = (HashMap)scheme.get("all_condition");
        boolean isqualitymy = false;
        boolean containsF1 = true;
        StringBuffer mainsql = new StringBuffer();
        StringBuffer bodysql = new StringBuffer();
        StringBuffer termsql = new StringBuffer();
        HashMap<String, String> mainfildMap = new HashMap<String, String>();
        mainfildMap.put("pk_org", "pk_org");
        mainfildMap.put("billmaker", "billmaker");
        mainfildMap.put("billmakedate", "billdate");
        mainfildMap.put("approver", "approver");
        mainfildMap.put("dapprovedate", "approvedate");
        HashMap<String, String> fildMap = new HashMap<String, String>();
        fildMap.put("pk_supplier", "supplier");
        fildMap.put("pk_project", "project");
        fildMap.put("pk_currtype", "pk_currtype");
        fildMap.put("pk_deptid", "pk_deptid");
        fildMap.put("customer", "customer");
        String maintableas = "ap_payablebill.";
        String bodytableas = "ap_payableitem.";
        for (ConditionVO condVO : condVOs) {
            String sqlPart;
            String applyField = condVO.getFieldCode();
            if (applyField.equals("pk_billtypeid") && !(sqlPart = condVO.getSQLStr()).contains(F1BILLTYPEID)) {
                containsF1 = false;
                break;
            }
            if ("isqualitymy".equals(applyField) && !StringUtil.isEmpty((String)condVO.getValue())) {
                isqualitymy = condVO.getValue().equals("Y");
            }
            if ("balance_date".equals(applyField) && StringUtils.isNotEmpty((CharSequence)(sqlPart = condVO.getSQLStr()))) {
                termsql.append(sqlPart.replaceAll(applyField, "arap_busidata.expiredate"));
            }
            if (mainfildMap.keySet().contains(applyField) && StringUtils.isNotEmpty((CharSequence)(sqlPart = condVO.getSQLStr()))) {
                sqlPart = sqlPart.replaceAll(applyField, maintableas + (String)mainfildMap.get(applyField));
                mainsql.append(sqlPart);
                mainsql.append(" and ap_payablebill.saga_frozen=0 ");
            }
            if (!fildMap.keySet().contains(applyField) || !StringUtils.isNotEmpty((CharSequence)(sqlPart = condVO.getSQLStr()))) continue;
            sqlPart = sqlPart.replaceAll(applyField, bodytableas + (String)fildMap.get(applyField));
            bodysql.append(sqlPart);
        }
        if (allcondition != null && allcondition.size() != 0) {
            for (Map.Entry entry : allcondition.entrySet()) {
                String key;
                QueryCondition con;
                if (entry == null) continue;
                if ("pk_supplier".equals(entry.getKey())) {
                    SqlBuilder sqlBuilder = new SqlBuilder();
                    con = (QueryCondition)entry.getValue();
                    key = "ap_payableitem.supplier";
                    sqlBuilder.append(" and ");
                    sqlBuilder.append(key, con.getValues());
                    bodysql.append(sqlBuilder.toString());
                    continue;
                }
                if ("olcratetype".equals(entry.getKey())) {
                    SqlBuilder sqlBuilder = new SqlBuilder();
                    con = (QueryCondition)entry.getValue();
                    key = "ap_payableitem.pk_ratetype";
                    sqlBuilder.append(" and ");
                    sqlBuilder.append(key, con.getValues());
                    bodysql.append(sqlBuilder.toString());
                    continue;
                }
                if ("olcratedate".equals(entry.getKey())) {
                    SqlBuilder sqlBuilder = new SqlBuilder();
                    con = (QueryCondition)entry.getValue();
                    key = "ap_payableitem.ratedate";
                    sqlBuilder.append(" and ");
                    sqlBuilder.append(key, con.getValues());
                    bodysql.append(sqlBuilder.toString());
                    continue;
                }
                if (!"pk_trantypeid".equals(entry.getKey())) continue;
                SqlBuilder sqlBuilder = new SqlBuilder();
                con = (QueryCondition)entry.getValue();
                key = "ap_payableitem.pk_tradetypeid";
                sqlBuilder.append(" and ");
                sqlBuilder.append(key, con.getValues());
                bodysql.append(sqlBuilder.toString());
            }
        }
        if (!containsF1) {
            return new ArrayList<ApplyTransferVO>();
        }
        if (isqualitymy) {
            mainsql.append("and arap_busidata.insurance = 'Y'");
        } else {
            mainsql.append("and arap_busidata.insurance = 'N'");
        }
        Collection<ArapBusiDataVO> termdatas = this.queryTermVOs(mainsql, bodysql, termsql);
        if (termdatas == null || termdatas.isEmpty()) {
            return new ArrayList<ApplyTransferVO>();
        }
        BaseAggVO[] baseAggVOArray = this.constractAggVO(termdatas);
        Map<String, UFBoolean> map = this.conInsurance(baseAggVOArray);
        ArrayList<ApplyTransferVO> isqualitymylist = new ArrayList<ApplyTransferVO>();
        ArrayList<ApplyTransferVO> notisqualitymylist = new ArrayList<ApplyTransferVO>();
        Map<String, UFDouble> settleMoneyMap = this.getMap4SettleMoney();
        for (AggregatedValueObject aggregatedValueObject : appvos = PfUtilTools.runChangeDataAry((String)"F1", (String)"36OV", (AggregatedValueObject[])baseAggVOArray)) {
            ApplyTransferVO applyTransferVo = (ApplyTransferVO)aggregatedValueObject.getParentVO();
            if (applyTransferVo == null) continue;
            UFDouble settlemoney = settleMoneyMap.get(applyTransferVo.getAttributeValue("pk_srcbill_b"));
            applyTransferVo.setSettlepaymny(settlemoney);
            UFBoolean boolean1 = map.get(applyTransferVo.getAttributeValue("pk_srcbill_b"));
            if ((applyTransferVo.getIsqualitymy() != null || boolean1 != null) && (applyTransferVo.getIsqualitymy() != null && applyTransferVo.getIsqualitymy().booleanValue() || boolean1.booleanValue())) {
                if (applyTransferVo.getIsqualitymy() == null || applyTransferVo.getIsqualitymy() == null || !applyTransferVo.getIsqualitymy().booleanValue()) {
                    applyTransferVo.setIsqualitymy(UFBoolean.TRUE);
                }
                isqualitymylist.add(applyTransferVo);
                continue;
            }
            notisqualitymylist.add(applyTransferVo);
            applyTransferVo.setIsqualitymy(UFBoolean.FALSE);
        }
        if (isqualitymy) {
            return isqualitymylist;
        }
        return notisqualitymylist;
    }

    private Map<String, UFBoolean> conInsurance(BaseAggVO[] vos) {
        HashMap<String, UFBoolean> retMap = new HashMap<String, UFBoolean>();
        for (BaseAggVO vo : vos) {
            for (CircularlyAccessibleValueObject childrenVO : vo.getChildrenVO()) {
                Boolean isinsurance = (Boolean)childrenVO.getAttributeValue("insurance");
                retMap.put((String)childrenVO.getAttributeValue(ArapBillType2TableMapping.getChildrenTablePK((String)"F1").split("\\.")[1]), UFBoolean.valueOf((boolean)(isinsurance == null ? false : isinsurance)));
            }
        }
        return retMap;
    }

    private BaseAggVO[] constractAggVO(Collection<ArapBusiDataVO> termdatas) throws DAOException, BusinessException {
        BaseDAO dao = new BaseDAO();
        HashSet<String> itempks = new HashSet<String>();
        HashSet<String> billpks = new HashSet<String>();
        ArrayList<String> list1 = new ArrayList<String>();
        for (ArapBusiDataVO termvo : termdatas) {
            if (!list1.contains(termvo.getPk_item())) {
                list1.add(termvo.getPk_item());
            }
            itempks.add(termvo.getPk_item());
            billpks.add(termvo.getPk_bill());
        }
        List billdatas = (List)dao.retrieveByClause(PayableBillVO.class, SqlUtils.getInStr((String)"pk_payablebill", (String[])billpks.toArray(new String[0]), (boolean)true));
        Collection itemdatas = dao.retrieveByClause(PayableBillItemVO.class, SqlUtils.getInStr((String)"pk_payableitem", (String[])itempks.toArray(new String[0]), (boolean)true));
        HashMap<String, Object> itemmap = new HashMap<String, Object>();
        for (Object itemvo : itemdatas) {
            itemmap.put(itemvo.getPrimaryKey(), itemvo);
            srcitemList.add(itemvo.getPrimaryKey());
        }
        ArrayList<PayableBillItemVO> list = new ArrayList<PayableBillItemVO>();
        for (ArapBusiDataVO vo : termdatas) {
            if (itemmap.get(vo.getPk_item()) == null) continue;
            PayableBillItemVO termVO = (PayableBillItemVO)((Object)((PayableBillItemVO)((Object)itemmap.get(vo.getPk_item()))).clone());
            termVO.setMoney_bal(vo.getMoney_bal());
            termVO.setMoney_cr(vo.getMoney_cr());
            termVO.setOccupationmny(vo.getOccupationmny());
            termVO.setGlobalcrebit(vo.getGlobal_money_bal());
            termVO.setGlobalbalance(vo.getGlobal_money_bal());
            termVO.setGroupcrebit(vo.getGroup_money_bal());
            termVO.setGroupbalance(vo.getGroup_money_bal());
            termVO.setLocal_money_cr(vo.getLocal_money_bal());
            termVO.setLocal_money_bal(vo.getLocal_money_bal());
            termVO.setQuantity_cr(vo.getQuantity_bal());
            termVO.setQuantity_bal(vo.getQuantity_bal());
            termVO.setSupplier(vo.getSupplier());
            termVO.setPk_payterm(vo.getPk_termitem());
            termVO.setAttributeValue("pk_termitem", vo.getPk_termitem());
            termVO.setAttributeValue("expiredate", vo.getExpiredate());
            Integer prepay = vo.getPrepay();
            termVO.setAttributeValue("prepay", prepay != null && prepay == 1 ? UFBoolean.TRUE : UFBoolean.FALSE);
            UFBoolean insurance = vo.getInsurance();
            termVO.setAttributeValue("insurance", insurance != null ? Boolean.valueOf(insurance.booleanValue()) : UFBoolean.FALSE);
            list.add(termVO);
        }
        BaseAggVO[] vos = ArapBillPubUtil.assemBaseAggVOs((List)billdatas, list);
        ArapBillPubUtil.refreshChildVO2HeadVO((AggregatedValueObject[])vos);
        return vos;
    }

    private Collection<ArapBusiDataVO> queryTermVOs(StringBuffer mainsql, StringBuffer bodysql, StringBuffer termsql) throws BusinessException, DAOException {
        String[] termqryFields = new String[]{"pk_busidata", "pk_bill", "pk_item", "pk_termitem", "expiredate", "money_bal", "occupationmny", "local_money_bal", "group_money_bal", "global_money_bal", "quantity_bal", "insurance", "prepay", "supplier", "money_cr"};
        StringBuffer sf = new StringBuffer();
        sf.append("EXISTS");
        sf.append("    (");
        sf.append("        SELECT");
        sf.append("            1");
        sf.append("        FROM");
        sf.append("            ap_payablebill ap_payablebill,");
        sf.append("            ap_payableitem ap_payableitem");
        sf.append("        WHERE");
        sf.append("            arap_busidata.pk_item = ap_payableitem.pk_payableitem");
        sf.append("        AND ap_payableitem.pk_payablebill=ap_payablebill.pk_payablebill");
        sf.append("        AND isnull(ap_payablebill.dr,0)= 0");
        sf.append("        AND isnull(ap_payablebill.saga_frozen,0)= 0");
        sf.append("        AND ap_payablebill.effectstatus = 10");
        sf.append("        AND (ap_payableitem.money_bal <> 0 AND ap_payableitem.occupationmny <> 0)");
        sf.append("        AND (ap_payableitem.pausetransact ='N')");
        sf.append(mainsql.toString());
        sf.append(bodysql.toString());
        sf.append(ArapPermissionUtils.getDataPermissionSql((String)"F1"));
        sf.append(")");
        sf.append(termsql.toString());
        sf.append(" AND (arap_busidata.money_bal <> 0 AND arap_busidata.occupationmny <> 0) ");
        BaseDAO dao = new BaseDAO();
        Collection termdatas = dao.retrieveByClause(ArapBusiDataVO.class, sf.toString(), termqryFields);
        if (termdatas != null && termdatas.size() > 10000) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0316_0", "02006arappub0316-0070", null, new String[]{String.valueOf(10000)}));
        }
        return termdatas;
    }

    private Map<String, UFDouble> getMap4SettleMoney() throws BusinessException {
        if (CollectionUtils.isEmpty(srcitemList)) {
            return new HashMap<String, UFDouble>();
        }
        Map retMap = ((IApplyQueryService)NCLocator.getInstance().lookup(IApplyQueryService.class)).querySettleMoneyByPayBillBPk(srcitemList.toArray(new String[0]));
        return retMap == null ? new HashMap() : retMap;
    }

    public String getSourceSystem() {
        return "2006";
    }

    public String getField() {
        return "20";
    }
}

