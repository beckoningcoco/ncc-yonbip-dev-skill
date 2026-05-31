/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.dao.BaseDAO
 *  nc.bs.dao.DAOException
 *  nc.bs.framework.common.NCLocator
 *  nc.itf.cmp.busi.ISettleinfoCarrier
 *  nc.itf.cmp.settlement.ISettlementQueryService
 *  nc.itf.fi.pub.SysInit
 *  nc.jdbc.framework.processor.ResultSetProcessor
 *  nc.vo.cmp.BusiStatus
 *  nc.vo.cmp.SettleStatus
 *  nc.vo.cmp.SettleType
 *  nc.vo.cmp.bill.BaseBillVO
 *  nc.vo.cmp.bill.BillEnumCollection$Direction
 *  nc.vo.cmp.pub.BillEnumCollection$FromSystem
 *  nc.vo.cmp.settlement.CmpMsg
 *  nc.vo.cmp.settlement.SettleEnumCollection$Direction
 *  nc.vo.cmp.settlement.SettleEnumCollection$OperateType
 *  nc.vo.cmp.settlement.SettlementAggVO
 *  nc.vo.cmp.settlement.SettlementBatchOperateVO
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.BusinessRuntimeException
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pub.lang.UFDateTime
 *  nc.vo.pub.lang.UFDouble
 *  nc.vo.pubapp.pattern.pub.MapList
 *  org.apache.commons.lang3.ArrayUtils
 */
package nc.bs.arap.util;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import nc.bs.arap.bill.ArapBillPubUtil;
import nc.bs.arap.util.ArapBillType2TableMapping;
import nc.bs.arap.util.BillTradetypeUtils;
import nc.bs.arap.util.SqlUtils;
import nc.bs.dao.BaseDAO;
import nc.bs.dao.DAOException;
import nc.bs.framework.common.NCLocator;
import nc.itf.cmp.busi.ISettleinfoCarrier;
import nc.itf.cmp.settlement.ISettlementQueryService;
import nc.itf.fi.pub.SysInit;
import nc.jdbc.framework.processor.ResultSetProcessor;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.arap.sysinit.SysinitConst;
import nc.vo.arap.utils.ARAPModuleEnableUtil;
import nc.vo.arap.utils.Lists;
import nc.vo.arap.utils.StringUtil;
import nc.vo.cmp.BusiStatus;
import nc.vo.cmp.SettleStatus;
import nc.vo.cmp.SettleType;
import nc.vo.cmp.bill.BillEnumCollection;
import nc.vo.cmp.pub.BillEnumCollection;
import nc.vo.cmp.settlement.CmpMsg;
import nc.vo.cmp.settlement.SettleEnumCollection;
import nc.vo.cmp.settlement.SettlementAggVO;
import nc.vo.cmp.settlement.SettlementBatchOperateVO;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.BusinessRuntimeException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.pub.MapList;
import org.apache.commons.lang3.ArrayUtils;

public final class BillSettlementUtils {
    private static final String BILLTYPE_36JD = "36JD";
    private static final String BILLTYPE_36JC = "36JC";
    private static final String BILLTYPE_36JB = "36JB";
    private static final String BILLTYPE_36JA = "36JA";
    private static final String BILLTYPE_36J5 = "36J5";
    private static final String BILLTYPE_36J4 = "36J4";
    private static final String BILLTYPE_36J3 = "36J3";
    private static final String BILLTYPE_36J2 = "36J2";
    private static final String BILLTYPE_36J1 = "36J1";
    private static final String BILLTYPE_36J7 = "36J7";
    private static final int ISINDEPENDCE = 8;
    private static List<String> fts_billtype = Arrays.asList("36J1", "36J2", "36J3", "36J5", "36JA", "36JB", "36JC", "36JD");

    public static <T extends AggregatedValueObject> SettlementBatchOperateVO[] settleInfo4Insert(T[] bills, SettleEnumCollection.OperateType add) {
        int voCount = bills.length;
        if (ArrayUtils.isEmpty((Object[])bills)) {
            return null;
        }
        SettlementBatchOperateVO[] sboVOs = new SettlementBatchOperateVO[voCount];
        List<BaseAggVO> rededBills = BillSettlementUtils.getRededBills((BaseAggVO[])bills);
        for (int idx = 0; idx < voCount; ++idx) {
            nc.vo.cmp.bill.BaseBillVO bbVO = new nc.vo.cmp.bill.BaseBillVO();
            bbVO.setBeanList(new AggregatedValueObject[]{bills[idx]});
            bbVO.setIdMap(null);
            boolean isredbill = BillSettlementUtils.isNetRedBills(bills[idx]);
            if (SettleEnumCollection.OperateType.ADD.equals((Object)add)) {
                bbVO.setOperateType(SettleEnumCollection.OperateType.ADD);
            }
            SettlementBatchOperateVO operatevo = new SettlementBatchOperateVO();
            CmpMsg cmpMsgVo = BillSettlementUtils.convertBeanToCmpMsg(bbVO);
            if (isredbill) {
                cmpMsgVo.setEbankRed(true);
            }
            operatevo.setBusibill(bills[idx]);
            operatevo.setMsg(cmpMsgVo);
            operatevo.setSettlementAgg(null);
            sboVOs[idx] = operatevo;
        }
        return sboVOs;
    }

    private static boolean isNetRedBills(AggregatedValueObject bill) {
        boolean ret = false;
        String netPayType = "0001Z0100000000000Y2";
        CircularlyAccessibleValueObject chilvo = bill.getChildrenVO()[0];
        String pk_billtype = (String)chilvo.getAttributeValue("pk_billtype");
        String top_billtype = (String)chilvo.getAttributeValue("top_billtype");
        String pk_balatype = (String)chilvo.getAttributeValue("pk_balatype");
        if (!StringUtil.isEmptyWithTrim(pk_billtype) && pk_billtype.equals(top_billtype) && netPayType.equals(pk_balatype)) {
            ret = true;
        }
        return ret;
    }

    private static List<BaseAggVO> getRededBills(BaseAggVO[] bills) {
        HashSet<String> pkbills = new HashSet<String>();
        for (BaseAggVO baseAggVO : bills) {
            pkbills.add(baseAggVO.getHeadVO().getPrimaryKey());
        }
        String billType = bills[0].getHeadVO().getPk_billtype();
        String parentID = ArapBillType2TableMapping.getParentTablePK(billType);
        String PidInChildTable = ArapBillType2TableMapping.getChildren_ParentPK(billType);
        String ParentTABLE = ArapBillType2TableMapping.getParentTable(billType);
        String ChildTABLE = ArapBillType2TableMapping.getChildrenTable(billType);
        StringBuilder sql = new StringBuilder();
        sql.append("select distinct " + PidInChildTable + " , top_billid  from ");
        sql.append(ParentTABLE + " " + ParentTABLE).append(" inner join ").append(ChildTABLE + " " + ChildTABLE);
        sql.append("  on " + parentID + " = " + ChildTABLE + "." + "top_billid");
        sql.append(" where ");
        try {
            sql.append(SqlUtils.getInStr(PidInChildTable, pkbills.toArray(new String[0])).trim()).append(" and ");
        }
        catch (BusinessException e1) {
            ExceptionHandler.consume((Throwable)e1);
        }
        sql.append(ParentTABLE + ".isreded ='Y'");
        final HashMap pkbillMap = new HashMap();
        try {
            new BaseDAO().executeQuery(sql.toString(), new ResultSetProcessor(){
                private static final long serialVersionUID = 5048573231667144605L;

                public Object handleResultSet(ResultSet rs) throws SQLException {
                    while (rs.next()) {
                        pkbillMap.put(rs.getString(1), rs.getString(2));
                    }
                    return null;
                }
            });
        }
        catch (DAOException e) {
            ExceptionHandler.consume((Throwable)e);
        }
        ArrayList<BaseAggVO> list = new ArrayList<BaseAggVO>();
        HashMap pkbill2BillMap = new HashMap();
        for (BaseAggVO baseAggVO : bills) {
            if (pkbillMap.containsKey(baseAggVO.getHeadVO().getPrimaryKey())) {
                list.add(baseAggVO);
            }
            if (pkbillMap.get(baseAggVO.getHeadVO().getPrimaryKey()) == null) continue;
            pkbill2BillMap.put(pkbillMap.get(baseAggVO.getHeadVO().getPrimaryKey()), baseAggVO);
        }
        if (pkbill2BillMap.size() > 0 && ARAPModuleEnableUtil.isCMPEnable((String)bills[0].getParentVO().getAttributeValue("pk_group"))) {
            try {
                SettlementAggVO[] settlementAggVOs1 = ((ISettlementQueryService)NCLocator.getInstance().lookup(ISettlementQueryService.class)).querySettlementAggsByPk_busibills(pkbill2BillMap.keySet().toArray(new String[0]));
                HashMap<String, String> extra = new HashMap<String, String>();
                extra.put("systemcode", BillEnumCollection.FromSystem.AR.VALUE.toString());
                MapList headPktoBodyPk = new MapList();
                for (SettlementAggVO billvo : settlementAggVOs1) {
                    for (CircularlyAccessibleValueObject item : billvo.getChildrenVO()) {
                        headPktoBodyPk.put((Object)billvo.getParentVO().getPrimaryKey(), (Object)item.getPrimaryKey());
                    }
                }
                Map map = ((ISettlementQueryService)NCLocator.getInstance().lookup(ISettlementQueryService.class)).queryRedResetInfo(headPktoBodyPk, extra);
                for (BaseAggVO baseAggVO : bills) {
                    SettlementAggVO settlementAggVO;
                    HashSet<String> topbillid = new HashSet<String>();
                    for (BaseItemVO item : baseAggVO.getItems()) {
                        topbillid.add(item.getTop_billid());
                    }
                    if (topbillid.size() <= 0 || (settlementAggVO = (SettlementAggVO)map.get(topbillid.toArray()[0])) == null) continue;
                    ((ISettleinfoCarrier)baseAggVO).setSettlementInfo(settlementAggVO);
                }
            }
            catch (BusinessException e) {
                ExceptionHandler.consume((Throwable)e);
            }
        }
        return list;
    }

    public static CmpMsg settleInfo4Query(AggregatedValueObject bill) {
        nc.vo.cmp.bill.BaseBillVO bbVO = new nc.vo.cmp.bill.BaseBillVO();
        bbVO.setBeanList(new AggregatedValueObject[]{bill});
        bbVO.setIdMap(null);
        return BillSettlementUtils.convertBeanToCmpMsg(bbVO);
    }

    public static CmpMsg convertBeanToCmpMsg(nc.vo.cmp.bill.BaseBillVO basebill) {
        AggregatedValueObject aggvo = basebill.getBeanList()[0];
        BaseBillVO bean = (BaseBillVO)aggvo.getParentVO();
        BaseItemVO itemBean = (BaseItemVO)aggvo.getChildrenVO()[0];
        String top_billtype = (String)aggvo.getChildrenVO()[0].getAttributeValue("top_billtype");
        CmpMsg msg = new CmpMsg();
        Map settlemenHeadVOValus = msg.getSettlemenHeadVOValus();
        String creditRefInfo = null;
        boolean exp = bean.getSyscode().intValue() == BillEnumCollection.FromSystem.AR.VALUE.intValue() || ArapBillPubUtil.isARSysBilltype(bean.getPk_billtype());
        try {
            creditRefInfo = SysInit.getParaString((String)bean.getPk_org(), (String)(exp ? SysinitConst.AR36 : SysinitConst.AP36));
        }
        catch (BusinessException e) {
            ExceptionHandler.handleRuntimeException((Exception)((Object)e));
        }
        if (creditRefInfo != null) {
            String creditrefstd = bean.getCreditrefstd();
            settlemenHeadVOValus.put("structuredstandard", creditrefstd);
            if ("NONE".equals(creditrefstd)) {
                settlemenHeadVOValus.put("invoiceno", (Serializable)itemBean.getAttributeValue(creditRefInfo));
                settlemenHeadVOValus.put("creditorreference", null);
            } else if ("ISO".equals(creditrefstd) || "BBA".equals(creditrefstd)) {
                settlemenHeadVOValus.put("invoiceno", null);
                settlemenHeadVOValus.put("creditorreference", (Serializable)itemBean.getAttributeValue(creditRefInfo));
            }
        }
        msg.setAuthList(null);
        msg.setAutoSign(false);
        msg.setBillclass("bill_type");
        msg.setBillcode(bean.getBillno());
        msg.setBillDate(bean.getBilldate());
        msg.setBillkey(bean.getPrimaryKey());
        msg.setBillOperator(bean.getCreator());
        String pk_billtype = bean.getPk_tradetype();
        msg.setBilltype(pk_billtype);
        msg.setBusiFlow(bean.getPk_busitype());
        if (bean.getBillstatus() == -1) {
            msg.setBusistatus(BusiStatus.Free);
        } else {
            msg.setBusistatus(BusiStatus.convertInt2Enum((int)bean.getBillstatus()));
        }
        if (SettleEnumCollection.OperateType.CRASH.equals((Object)basebill.getOperateType()) && bean.getModifiedtime() == null) {
            msg.setOperateStatus(SettleEnumCollection.OperateType.CRASH.VALUE.intValue());
        } else {
            UFBoolean isfromindependent = bean.getIsfromindependent() == null ? UFBoolean.FALSE : bean.getIsfromindependent();
            List<String> topbilltype = Arrays.asList(BILLTYPE_36J7, BILLTYPE_36J5);
            if (isfromindependent.booleanValue() && topbilltype.contains(top_billtype) && SettleEnumCollection.OperateType.ADD.equals((Object)basebill.getOperateType())) {
                msg.setOperateStatus(8);
            } else {
                int status = BillSettlementUtils.getOperteStatus(bean, aggvo);
                if (9 == status && !SettleEnumCollection.OperateType.ADD.equals((Object)basebill.getOperateType())) {
                    msg.setOperateStatus(0);
                } else {
                    msg.setOperateStatus(status);
                }
            }
        }
        msg.setCopyMap(BillSettlementUtils.getCopyMap(aggvo));
        msg.setDirection(BillSettlementUtils.getDirection(aggvo));
        msg.setEbankRed(false);
        msg.setFtsExec(bean.getAttributeValue("isjszxzf") == null ? false : ((UFBoolean)bean.getAttributeValue("isjszxzf")).booleanValue());
        msg.setIdmap(basebill.getIdMap());
        msg.setIspay(BillSettlementUtils.getDirection(aggvo) == 1);
        msg.setLastOperator(bean.getModifier());
        UFDateTime datetime = bean.getModifiedtime();
        msg.setLastOperatorDate(datetime == null ? null : datetime.getDate());
        msg.setIsauthpass(UFBoolean.valueOf((boolean)bean.isAuthAccount()));
        BaseItemVO[] itemVOs = (BaseItemVO[])aggvo.getChildrenVO();
        UFDouble local_money = UFDouble.ZERO_DBL;
        UFDouble money = UFDouble.ZERO_DBL;
        String billclass = bean.getBillclass();
        for (BaseItemVO item : itemVOs) {
            if (UFBoolean.TRUE.equals((Object)item.getIsdiscount())) continue;
            UFDouble localde = item.getLocal_money_de() == null ? UFDouble.ZERO_DBL : item.getLocal_money_de();
            UFDouble localcr = item.getLocal_money_cr() == null ? UFDouble.ZERO_DBL : item.getLocal_money_cr();
            local_money = local_money.add("fk".equals(billclass) ? localde : localcr);
            money = money.add("fk".equals(billclass) ? item.getMoney_de() : item.getMoney_cr());
        }
        msg.setLocal(local_money);
        msg.setPrimal(money);
        msg.setPk_group(bean.getPk_group());
        msg.setPk_org(bean.getPk_org());
        msg.setPk_org_v(bean.getPk_org_v());
        msg.setSystem(ArapBillPubUtil.isARSysBilltype(bean.getPk_billtype()) ? String.valueOf(BillEnumCollection.FromSystem.AR.VALUE) : String.valueOf(BillEnumCollection.FromSystem.AP.VALUE));
        msg.setIscommpay(bean.getIsforce());
        UFDate billdate = (UFDate)aggvo.getChildrenVO()[0].getAttributeValue("billdate");
        if (fts_billtype.contains(top_billtype)) {
            msg.setFts_billtype(top_billtype);
            msg.setPk_ftsbill((String)aggvo.getChildrenVO()[0].getAttributeValue("top_billid"));
            msg.setPk_upbill(null);
            if (bean.getIsforce() != null && bean.getIsforce().booleanValue()) {
                msg.setSettlestatus(null);
                msg.setSettledate(null);
                msg.setSettleType(null);
            } else {
                msg.setSettlestatus(SettleStatus.SUCCESSSETTLE);
                msg.setSettledate(billdate);
                if (BILLTYPE_36J1.equals(top_billtype) || BILLTYPE_36J5.equals(top_billtype)) {
                    msg.setSettleType(SettleType.COMMISION_PAY);
                } else if (BILLTYPE_36J2.equals(top_billtype) || BILLTYPE_36J4.equals(top_billtype)) {
                    msg.setSettleType(SettleType.COMMISION_RECEIVCE);
                } else if (BILLTYPE_36J3.equals(top_billtype)) {
                    msg.setSettleType(SettleType.INNER_TRANSFER);
                } else {
                    throw new BusinessRuntimeException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61008_0", "02006v61008-0256") + top_billtype);
                }
            }
        }
        boolean IsRetailBill = bean.getSrc_syscode().equals(BillEnumCollection.FromSystem.CR09.VALUE);
        if ("36S3".equals(top_billtype) || IsRetailBill) {
            msg.setIsTempAndSettle(true);
        }
        msg.setCommpayEnddate(bean.getCommpayenddate());
        msg.setCommpayBegindate(bean.getCommpaybegindate());
        msg.setLastauditer(bean.getApprover());
        msg.setLastauditedate(bean.getApprovedate() == null ? null : bean.getApprovedate().getDate());
        if (!BillTradetypeUtils.isqr(bean.getPk_tradetype())) {
            msg.setAutoSign(true);
        }
        if (bean.isForceEffect()) {
            msg.setAutoSign(true);
        }
        msg.setApplyCombine(UFBoolean.TRUE.equals((Object)BillTradetypeUtils.isApplyCombine(bean.getPk_tradetype())) ? 1 : 0);
        return msg;
    }

    private static int getOperteStatus(BaseBillVO bean, AggregatedValueObject aggvo) {
        int ret = 0;
        if (bean.getIsfromindependent() != null && bean.getIsfromindependent().booleanValue()) {
            if (aggvo instanceof ISettleinfoCarrier) {
                ret = ((ISettleinfoCarrier)aggvo).getSettlementInfo() == null && bean.getIsforce() != null && bean.getIsforce().booleanValue() && "F3".equals(bean.getPk_billtype()) ? 9 : (((ISettleinfoCarrier)aggvo).getSettlementInfo() != null ? 8 : 0);
            }
        } else if (bean.getIsforce() != null && bean.getIsforce().booleanValue() && "F3".equals(bean.getPk_billtype())) {
            return 9;
        }
        return ret;
    }

    private static Map<String, List<String>> getCopyMap(AggregatedValueObject vo) {
        SuperVO[] details;
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();
        ArrayList detailIds = Lists.newArrayList();
        for (SuperVO supervo : details = (SuperVO[])vo.getChildrenVO()) {
            detailIds.add(supervo.getPrimaryKey());
        }
        map.put(((SuperVO)vo.getParentVO()).getPrimaryKey(), detailIds);
        return map;
    }

    private static int getDirection(AggregatedValueObject vo) {
        SuperVO[] details = (SuperVO[])vo.getChildrenVO();
        HashSet<Integer> direction = new HashSet<Integer>();
        for (SuperVO detail : details) {
            if (detail.getAttributeValue("direction") == null) continue;
            direction.add((Integer)detail.getAttributeValue("direction"));
        }
        if (direction.size() == 1) {
            Integer i = (Integer)direction.iterator().next();
            if (i.equals(BillEnumCollection.Direction.JF.VALUE)) {
                return SettleEnumCollection.Direction.PAY.VALUE;
            }
            return SettleEnumCollection.Direction.REC.VALUE;
        }
        return SettleEnumCollection.Direction.CHANGE.VALUE;
    }
}

