/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.bill.ArapBillDAO
 *  nc.bs.arap.bill.ArapGeneralDAO
 *  nc.bs.arap.util.SqlUtils
 *  nc.bs.dao.BaseDAO
 *  nc.bs.dao.DAOException
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.logging.Logger
 *  nc.bs.pub.SystemException
 *  nc.itf.fi.pub.Currency
 *  nc.jdbc.framework.JdbcSession
 *  nc.jdbc.framework.PersistenceManager
 *  nc.jdbc.framework.SQLParameter
 *  nc.jdbc.framework.exception.DbException
 *  nc.jdbc.framework.processor.ArrayListProcessor
 *  nc.jdbc.framework.processor.BeanListProcessor
 *  nc.jdbc.framework.processor.ResultSetProcessor
 *  nc.md.persist.framework.MDPersistenceService
 *  nc.pubitf.uapbd.IMaterialShareJoinTableNameService
 *  nc.utils.fipub.MemoryResultSetProcessor
 *  nc.vo.arap.basebill.BaseBillVO
 *  nc.vo.arap.estireceivable.EstiReceivableBillItemVO
 *  nc.vo.arap.itfvo.ReceivableBillInfoVO
 *  nc.vo.arap.pfflow.ArapBillMapVO
 *  nc.vo.arap.pub.BillEnumCollection$ApproveStatus
 *  nc.vo.arap.pub.BillEnumCollection$FromSystem
 *  nc.vo.arap.receivable.AggReceivableBillVO
 *  nc.vo.arap.receivable.ReceivableBillItemVO
 *  nc.vo.arap.receivable.ReceivableBillVO
 *  nc.vo.arap.tally.TallyVO
 *  nc.vo.arap.utils.TempTableDAO
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.fipub.utils.SqlBuilder
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pub.lang.UFDouble
 *  nc.vo.pub.query.ConditionVO
 *  nc.vo.pub.rs.MemoryResultSet
 *  nc.vo.pub.rs.MemoryResultSetMetaData
 *  nc.vo.so.report.multipleprofit.MultProfitSourceSystem
 *  nc.vo.so.report.multipleprofit.MultipleProfitViewVO
 *  nccloud.commons.lang.ArrayUtils
 *  nccloud.commons.lang.StringUtils
 */
package nc.bs.arap.receiveablebp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import javax.naming.NamingException;
import nc.bs.arap.bill.ArapBillDAO;
import nc.bs.arap.bill.ArapGeneralDAO;
import nc.bs.arap.receiveablebp.RecBillDAO;
import nc.bs.arap.util.SqlUtils;
import nc.bs.dao.BaseDAO;
import nc.bs.dao.DAOException;
import nc.bs.framework.common.NCLocator;
import nc.bs.logging.Logger;
import nc.bs.pub.SystemException;
import nc.itf.fi.pub.Currency;
import nc.jdbc.framework.JdbcSession;
import nc.jdbc.framework.PersistenceManager;
import nc.jdbc.framework.SQLParameter;
import nc.jdbc.framework.exception.DbException;
import nc.jdbc.framework.processor.ArrayListProcessor;
import nc.jdbc.framework.processor.BeanListProcessor;
import nc.jdbc.framework.processor.ResultSetProcessor;
import nc.md.persist.framework.MDPersistenceService;
import nc.pubitf.uapbd.IMaterialShareJoinTableNameService;
import nc.utils.fipub.MemoryResultSetProcessor;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.estireceivable.EstiReceivableBillItemVO;
import nc.vo.arap.itfvo.ReceivableBillInfoVO;
import nc.vo.arap.pfflow.ArapBillMapVO;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.arap.receivable.AggReceivableBillVO;
import nc.vo.arap.receivable.ReceivableBillItemVO;
import nc.vo.arap.receivable.ReceivableBillVO;
import nc.vo.arap.tally.TallyVO;
import nc.vo.arap.utils.TempTableDAO;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.fipub.utils.SqlBuilder;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pub.query.ConditionVO;
import nc.vo.pub.rs.MemoryResultSet;
import nc.vo.pub.rs.MemoryResultSetMetaData;
import nc.vo.so.report.multipleprofit.MultProfitSourceSystem;
import nc.vo.so.report.multipleprofit.MultipleProfitViewVO;
import nccloud.commons.lang.ArrayUtils;
import nccloud.commons.lang.StringUtils;

public class RecBillBO {
    public static final int QUERY_BILL_BY_SRC = 0;
    public static final int QUERY_BILL_BY_TOP = 1;
    private RecBillDAO dao = new RecBillDAO();

    public Map<String, UFDouble> getNewCoustomBanlanceByCubasdoc(String[] coustomId, String pk_org) throws BusinessException {
        Map<String, UFDouble> hRe = new Hashtable<String, UFDouble>();
        try {
            if (!ArrayUtils.isEmpty((Object[])coustomId)) {
                RecBillDAO idmo = new RecBillDAO();
                hRe = idmo.getNewCoustomBanlanceByCubasdoc(coustomId, pk_org);
                return hRe;
            }
        }
        catch (Exception e) {
            throw ExceptionHandler.handleException((Exception)e);
        }
        return hRe;
    }

    public AggReceivableBillVO[] findBillByPrimaryKey(String[] keys) throws BusinessException {
        return (AggReceivableBillVO[])ArapGeneralDAO.getInstance().query(AggReceivableBillVO.class, keys);
    }

    public AggReceivableBillVO[] queryBillsBySourceBillID(String[] srcBillIDs) throws BusinessException {
        try {
            return this.dao.queryBillsBySourceBillIDs(srcBillIDs);
        }
        catch (Exception e) {
            throw ExceptionHandler.handleException((Exception)e);
        }
    }

    public AggReceivableBillVO[] queryBillsBySourceRowID(String[] srcRowIDs, String pk_org) throws BusinessException {
        try {
            return this.dao.queryBillsBySourceRowIDs(srcRowIDs, pk_org);
        }
        catch (Exception e) {
            throw ExceptionHandler.handleException((Exception)e);
        }
    }

    public ReceivableBillItemVO[] findBillItemByPrimarykey(String[] keys) throws BusinessException {
        Collection bills = MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByPKs(ReceivableBillItemVO.class, keys, false);
        return bills.toArray(new ReceivableBillItemVO[0]);
    }

    public AggReceivableBillVO[] queryBillsBySrcBillID(String[] srcBillIDs) throws BusinessException {
        try {
            return this.dao.queryBillsBySrcBillIDs(srcBillIDs);
        }
        catch (Exception e) {
            throw ExceptionHandler.handleException((Exception)e);
        }
    }

    public AggReceivableBillVO[] queryBillsBySrcRowID(String[] srcRowIDs, String pk_org) throws BusinessException {
        try {
            return this.dao.queryBillsBySrcRowIDs(srcRowIDs, pk_org);
        }
        catch (Exception e) {
            throw ExceptionHandler.handleException((Exception)e);
        }
    }

    public boolean checkTradetypeUsed(String pkTradetype, String pkGroup) throws BusinessException {
        try {
            return this.dao.checkTradetypeUsed(pkTradetype, pkGroup);
        }
        catch (DAOException e) {
            ExceptionHandler.handleException((Exception)((Object)e));
            return false;
        }
    }

    public ArapBillMapVO[] queryArapBillmap(String[] topids) throws BusinessException {
        try {
            ReceivableBillItemVO[] items;
            ArrayList<ArapBillMapVO> list = new ArrayList<ArapBillMapVO>();
            for (ReceivableBillItemVO item : items = this.dao.querySoBillsBySourceRowIDs(topids, new String[]{"pk_recbill", "pk_recitem", "money_de", "money_bal", "pk_currtype", "src_itemid", "src_billid", "pk_billtype", "pk_org"})) {
                ArapBillMapVO vo = new ArapBillMapVO();
                vo.setS_billid(item.getSrc_billid());
                vo.setS_itemid(item.getSrc_itemid());
                vo.setT_billid(item.getPk_recbill());
                vo.setT_billtype(item.getPk_billtype());
                vo.setT_itemid(item.getPk_recitem());
                vo.setPk_currtype(item.getPk_currtype());
                vo.setPk_org(item.getPk_org());
                vo.setYbje(item.getMoney_de());
                vo.setYbye(item.getMoney_bal());
                vo.setS_system(BillEnumCollection.FromSystem.SO.VALUE.intValue());
                list.add(vo);
            }
            return list.toArray(new ArapBillMapVO[0]);
        }
        catch (Exception e) {
            ExceptionHandler.handleException((Exception)e);
            return null;
        }
    }

    public Map<String, Integer> queryReceivableBillStatusBySource(String[] srcBillIDs) throws BusinessException {
        AggReceivableBillVO[] bills = null;
        try {
            bills = this.dao.queryBillsBySourceBillIDs(srcBillIDs);
        }
        catch (Exception e) {
            throw new BusinessException(e.getMessage(), (Throwable)e);
        }
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (AggReceivableBillVO vo : bills) {
            for (ReceivableBillItemVO item : vo.getBodyVOs()) {
                map.put(item.getTop_billid(), vo.getHeadVO().getBillstatus());
            }
        }
        return map;
    }

    public Map<String, UFDouble> queryMoneyBalBySrcitemids(String[] srcids) throws Exception {
        if (null == srcids) {
            return null;
        }
        String whereString = " dr = 0 and " + SqlUtils.getInStr((String)"src_itemid", (String[])srcids, (boolean[])new boolean[]{true});
        Collection bills = new BaseDAO().retrieveByClause(ReceivableBillItemVO.class, whereString, new String[]{"src_itemid", "money_bal"});
        if (null == bills || bills.size() == 0) {
            return null;
        }
        HashMap<String, UFDouble> map = new HashMap<String, UFDouble>();
        for (ReceivableBillItemVO vo : bills) {
            map.put(vo.getSrc_itemid(), vo.getMoney_bal());
        }
        return map;
    }

    public Map<String, UFDouble> getNotaxForSoorder(String[] srcbids) throws BusinessException {
        SqlBuilder sql = new SqlBuilder();
        sql.append("select src_itemid, sum(local_notax_de) from ar_recitem inner join ar_recbill on ar_recitem.pk_recbill = ar_recbill.pk_recbill and ar_recitem.dr = 0 ");
        sql.append(" where ");
        sql.append(SqlUtils.getInStr((String)"src_itemid", (String[])srcbids));
        sql.append(" and ");
        sql.append("src_syscode", 3);
        sql.append(" group by src_itemid");
        Map map = (Map)new BaseDAO().executeQuery(sql.toString(), new ResultSetProcessor(){
            private static final long serialVersionUID = 1L;

            public Map<String, UFDouble> handleResultSet(ResultSet rs) throws SQLException {
                HashMap<String, UFDouble> result = new HashMap<String, UFDouble>();
                while (rs.next()) {
                    result.put(rs.getString(1), new UFDouble(rs.getBigDecimal(2)));
                }
                return result;
            }
        });
        return map;
    }

    public Map<String, ReceivableBillInfoVO> queryReceivableBillInfoByTopBill(String billType, int queryBy, boolean includeEsti, String[] billids, String[] itemids) throws BusinessException {
        boolean separateByItem = !ArrayUtils.isEmpty((Object[])itemids);
        StringBuffer select = new StringBuffer(" select ");
        select.append((1 == queryBy ? "top_billid" : "src_billid") + " pk_billid");
        select.append(", " + (separateByItem ? (1 == queryBy ? "top_itemid" : "src_itemid") : "null") + " pk_itemid");
        select.append(", sum(quantity_de) quantity_de");
        select.append(", sum(quantity_bal) quantity_bal");
        select.append(", sum(quantity_bal) quantity_bal");
        select.append(", sum(money_de) money_de");
        select.append(", sum(money_bal) money_bal");
        select.append(", sum(local_money_de) local_money_de");
        select.append(", sum(local_money_bal) local_money_bal");
        select.append(", sum(groupdebit) groupdebit");
        select.append(", sum(groupbalance) groupbalance");
        select.append(", sum(globaldebit) globaldebit");
        select.append(", sum(globalbalance) globalbalance");
        select.append(", sum(local_notax_de) local_notax_de");
        select.append(", sum(local_tax_de) local_tax_de");
        StringBuffer where = new StringBuffer(" where dr =0 and ");
        if (StringUtils.isEmpty((CharSequence)billType)) {
            where.append(" 1 = 1 ");
        } else {
            where.append(1 == queryBy ? "top_billtype" : "src_billtype").append(" = '" + billType + "'");
        }
        where.append(" and ").append(SqlUtils.getInStr((String)(1 == queryBy ? "top_billid" : "src_billid"), (String[])billids));
        if (separateByItem) {
            where.append(" and ").append(SqlUtils.getInStr((String)(1 == queryBy ? "top_itemid" : "src_itemid"), (String[])itemids));
        }
        StringBuffer groupby = new StringBuffer(" group by ");
        groupby.append(1 == queryBy ? "top_billid" : "src_billid");
        if (separateByItem) {
            groupby.append(", ").append(1 == queryBy ? "top_itemid" : "src_itemid");
        }
        HashMap<String, ReceivableBillInfoVO> retMap = new HashMap<String, ReceivableBillInfoVO>();
        try {
            BaseDAO dao = new BaseDAO();
            String from1 = " from " + ReceivableBillItemVO.getDefaultTable();
            String where2 = " and isnull(ar_recitem.rowtype, 5)<>5 ";
            String recsql = select + from1 + where + " and rowtype <> 5 " + groupby;
            List ret1 = (List)dao.executeQuery(recsql, (ResultSetProcessor)new BeanListProcessor(ReceivableBillInfoVO.class));
            for (ReceivableBillInfoVO infoVO : ret1) {
                retMap.put(separateByItem ? infoVO.getPk_itemid() : infoVO.getPk_billid(), infoVO);
            }
            if (includeEsti) {
                String from2 = " from " + new EstiReceivableBillItemVO().getTableName();
                List ret2 = (List)dao.executeQuery(select + from2 + where + groupby, (ResultSetProcessor)new BeanListProcessor(ReceivableBillInfoVO.class));
                if (ret2.size() > 0) {
                    for (ReceivableBillInfoVO infoVO : ret2) {
                        if (retMap.get(separateByItem ? infoVO.getPk_itemid() : infoVO.getPk_billid()) != null) {
                            ReceivableBillInfoVO vo = (ReceivableBillInfoVO)retMap.get(separateByItem ? infoVO.getPk_itemid() : infoVO.getPk_billid());
                            vo.setQuantity_de(vo.getQuantity_de().add(infoVO.getQuantity_de()));
                            vo.setQuantity_bal(vo.getQuantity_bal().add(infoVO.getQuantity_bal()));
                            vo.setMoney_de(vo.getMoney_de().add(infoVO.getMoney_de()));
                            vo.setMoney_bal(vo.getMoney_bal().add(infoVO.getMoney_bal()));
                            vo.setLocal_money_de(vo.getLocal_money_de().add(infoVO.getLocal_money_de()));
                            vo.setLocal_money_bal(vo.getLocal_money_bal().add(infoVO.getLocal_money_bal()));
                            vo.setGlobaldebit(vo.getGlobaldebit().add(infoVO.getGlobaldebit()));
                            vo.setGlobalbalance(vo.getGlobalbalance().add(infoVO.getGlobalbalance()));
                            vo.setGroupdebit(vo.getGroupdebit().add(infoVO.getGroupdebit()));
                            vo.setGroupbalance(vo.getGroupbalance().add(infoVO.getGroupbalance()));
                            vo.setLocal_notax_de(vo.getLocal_notax_de().add(infoVO.getLocal_notax_de()));
                            vo.setLocal_tax_de(vo.getLocal_tax_de().add(infoVO.getLocal_tax_de()));
                            retMap.put(separateByItem ? infoVO.getPk_itemid() : infoVO.getPk_billid(), vo);
                            continue;
                        }
                        retMap.put(separateByItem ? infoVO.getPk_itemid() : infoVO.getPk_billid(), infoVO);
                    }
                }
                if (1 == queryBy) {
                    List ret3;
                    StringBuffer select1 = new StringBuffer(" select ");
                    select1.append((1 == queryBy ? "est2.top_billid" : "est2.src_billid") + " pk_billid");
                    select1.append(", " + (separateByItem ? (1 == queryBy ? "est2.top_itemid" : "est2.src_itemid") : "null") + " pk_itemid");
                    select1.append(" , sum(est1.quantity_de) quantity_de, sum(est1.quantity_bal) quantity_bal, sum(est1.quantity_bal) quantity_bal, sum(est1.money_de) money_de, sum(est1.money_bal) money_bal, sum(est1.local_money_de) local_money_de, sum(est1.local_money_bal) local_money_bal, sum(est1.groupdebit) groupdebit, sum(est1.groupbalance) groupbalance, sum(est1.globaldebit) globaldebit, sum(est1.globalbalance) globalbalance, sum(est1.local_notax_de) local_notax_de, sum(est1.local_tax_de) local_tax_de ");
                    select1.append(" from ar_estirecitem est1 left join ar_estirecitem est2 on est1.TOP_ITEMID = est2.PK_ESTIRECITEM  ");
                    if (separateByItem) {
                        select1.append(" where est1.dr=0 and est1.TOP_ITEMID in( select PK_ESTIRECITEM from ar_estirecitem  ").append(where + " ) ");
                    } else {
                        select1.append(" where est1.dr=0 and est1.top_billid in( select PK_ESTIRECBILL from ar_estirecitem  ").append(where + " ) ");
                    }
                    StringBuffer groupby1 = new StringBuffer(" group by ");
                    groupby1.append(1 == queryBy ? "est2.top_billid" : "est2.src_billid");
                    if (separateByItem) {
                        groupby1.append(", ").append(1 == queryBy ? "est2.top_itemid" : "est2.src_itemid");
                    }
                    if ((ret3 = (List)dao.executeQuery(select1 + groupby1.toString(), (ResultSetProcessor)new BeanListProcessor(ReceivableBillInfoVO.class))).size() > 0) {
                        for (ReceivableBillInfoVO infoVO : ret3) {
                            if (retMap.get(separateByItem ? infoVO.getPk_itemid() : infoVO.getPk_billid()) != null) {
                                ReceivableBillInfoVO vo = (ReceivableBillInfoVO)retMap.get(separateByItem ? infoVO.getPk_itemid() : infoVO.getPk_billid());
                                vo.setQuantity_de(vo.getQuantity_de().add(infoVO.getQuantity_de()));
                                vo.setQuantity_bal(vo.getQuantity_bal().add(infoVO.getQuantity_bal()));
                                vo.setMoney_de(vo.getMoney_de().add(infoVO.getMoney_de()));
                                vo.setMoney_bal(vo.getMoney_bal().add(infoVO.getMoney_bal()));
                                vo.setLocal_money_de(vo.getLocal_money_de().add(infoVO.getLocal_money_de()));
                                vo.setLocal_money_bal(vo.getLocal_money_bal().add(infoVO.getLocal_money_bal()));
                                vo.setGlobaldebit(vo.getGlobaldebit().add(infoVO.getGlobaldebit()));
                                vo.setGlobalbalance(vo.getGlobalbalance().add(infoVO.getGlobalbalance()));
                                vo.setGroupdebit(vo.getGroupdebit().add(infoVO.getGroupdebit()));
                                vo.setGroupbalance(vo.getGroupbalance().add(infoVO.getGroupbalance()));
                                vo.setLocal_notax_de(vo.getLocal_notax_de().add(infoVO.getLocal_notax_de()));
                                vo.setLocal_tax_de(vo.getLocal_tax_de().add(infoVO.getLocal_tax_de()));
                                retMap.put(separateByItem ? infoVO.getPk_itemid() : infoVO.getPk_billid(), vo);
                                continue;
                            }
                            retMap.put(separateByItem ? infoVO.getPk_itemid() : infoVO.getPk_billid(), infoVO);
                        }
                    }
                }
            }
        }
        catch (DAOException e) {
            throw ExceptionHandler.handleException((Exception)((Object)e));
        }
        return retMap;
    }

    public Map<String, ReceivableBillInfoVO> queryReceivableBillInfoByTopBillExcludeTusun(String billType, int queryBy, boolean includeEsti, String[] billids, String[] itemids) throws BusinessException {
        boolean separateByItem = !ArrayUtils.isEmpty((Object[])itemids);
        StringBuffer select = new StringBuffer(" select ");
        select.append((1 == queryBy ? "top_billid" : "src_billid") + " pk_billid");
        select.append(", " + (separateByItem ? (1 == queryBy ? "top_itemid" : "src_itemid") : "null") + " pk_itemid");
        select.append(", sum(quantity_de) quantity_de");
        select.append(", sum(quantity_bal) quantity_bal");
        select.append(", sum(quantity_bal) quantity_bal");
        select.append(", sum(money_de) money_de");
        select.append(", sum(money_bal) money_bal");
        select.append(", sum(local_money_de) local_money_de");
        select.append(", sum(local_money_bal) local_money_bal");
        select.append(", sum(groupdebit) groupdebit");
        select.append(", sum(groupbalance) groupbalance");
        select.append(", sum(globaldebit) globaldebit");
        select.append(", sum(globalbalance) globalbalance");
        select.append(", sum(local_notax_de) local_notax_de");
        select.append(", sum(local_tax_de) local_tax_de");
        StringBuffer where = new StringBuffer(" where dr =0 and ");
        if (StringUtils.isEmpty((CharSequence)billType)) {
            where.append("  1 = 1 ");
        } else {
            where.append(1 == queryBy ? "top_billtype" : "src_billtype").append(" = '" + billType + "'");
        }
        where.append(" and ").append("top_billtype <> '4453' ");
        where.append(" and ").append(SqlUtils.getInStr((String)(1 == queryBy ? "top_billid" : "src_billid"), (String[])billids));
        if (separateByItem) {
            where.append(" and ").append(SqlUtils.getInStr((String)(1 == queryBy ? "top_itemid" : "src_itemid"), (String[])itemids));
        }
        StringBuffer groupby = new StringBuffer(" group by ");
        groupby.append(1 == queryBy ? "top_billid" : "src_billid");
        if (separateByItem) {
            groupby.append(", ").append(1 == queryBy ? "top_itemid" : "src_itemid");
        }
        HashMap<String, ReceivableBillInfoVO> retMap = new HashMap<String, ReceivableBillInfoVO>();
        try {
            BaseDAO dao = new BaseDAO();
            String from1 = " from " + ReceivableBillItemVO.getDefaultTable();
            List ret1 = (List)dao.executeQuery(select + from1 + where + groupby, (ResultSetProcessor)new BeanListProcessor(ReceivableBillInfoVO.class));
            for (ReceivableBillInfoVO infoVO : ret1) {
                retMap.put(separateByItem ? infoVO.getPk_itemid() : infoVO.getPk_billid(), infoVO);
            }
            if (includeEsti) {
                String from2 = " from " + new EstiReceivableBillItemVO().getTableName();
                List ret2 = (List)dao.executeQuery(select + from2 + where + groupby, (ResultSetProcessor)new BeanListProcessor(ReceivableBillInfoVO.class));
                for (ReceivableBillInfoVO infoVO : ret2) {
                    if (retMap.get(separateByItem ? infoVO.getPk_itemid() : infoVO.getPk_billid()) != null) {
                        ReceivableBillInfoVO vo = (ReceivableBillInfoVO)retMap.get(separateByItem ? infoVO.getPk_itemid() : infoVO.getPk_billid());
                        vo.setQuantity_de(vo.getQuantity_de().add(infoVO.getQuantity_de()));
                        vo.setQuantity_bal(vo.getQuantity_bal().add(infoVO.getQuantity_bal()));
                        vo.setMoney_de(vo.getMoney_de().add(infoVO.getMoney_de()));
                        vo.setMoney_bal(vo.getMoney_bal().add(infoVO.getMoney_bal()));
                        vo.setLocal_money_de(vo.getLocal_money_de().add(infoVO.getLocal_money_de()));
                        vo.setLocal_money_bal(vo.getLocal_money_bal().add(infoVO.getLocal_money_bal()));
                        vo.setGlobaldebit(vo.getGlobaldebit().add(infoVO.getGlobaldebit()));
                        vo.setGlobalbalance(vo.getGlobalbalance().add(infoVO.getGlobalbalance()));
                        vo.setGroupdebit(vo.getGroupdebit().add(infoVO.getGroupdebit()));
                        vo.setGroupbalance(vo.getGroupbalance().add(infoVO.getGroupbalance()));
                        vo.setLocal_notax_de(vo.getLocal_notax_de().add(infoVO.getLocal_notax_de()));
                        vo.setLocal_tax_de(vo.getLocal_tax_de().add(infoVO.getLocal_tax_de()));
                        retMap.put(separateByItem ? infoVO.getPk_itemid() : infoVO.getPk_billid(), vo);
                        continue;
                    }
                    retMap.put(separateByItem ? infoVO.getPk_itemid() : infoVO.getPk_billid(), infoVO);
                }
            }
        }
        catch (DAOException e) {
            throw ExceptionHandler.handleException((Exception)((Object)e));
        }
        return retMap;
    }

    public MultipleProfitViewVO[] queryMultProfit(ConditionVO[] conditions, MultProfitSourceSystem sourSys, String[] sumKeys) throws BusinessException {
        ArrayList<String> sumKeysList = new ArrayList<String>();
        for (String sumKey : sumKeys) {
            if ("sourcesystem".equals(sumKey) || "pk_org".equals(sumKey)) continue;
            sumKeysList.add(sumKey);
        }
        ConditionVO[] arapConditions = new ConditionVO[conditions.length];
        for (int c = 0; c < conditions.length; ++c) {
            arapConditions[c] = (ConditionVO)conditions[c].clone();
        }
        StringBuffer select = new StringBuffer("select ").append("recbill.src_syscode").append(", ");
        select.append(" sum(recitem.quantity_de) quantity_de, sum(recitem.local_notax_de) local_notax_de,sum(recitem.groupnotax_de\t) groupnotax_de,recitem.pk_org");
        StringBuffer from1 = new StringBuffer();
        from1.append(" from ");
        from1.append(ReceivableBillVO.getDefaultTable());
        from1.append(" recbill inner join ");
        from1.append(ReceivableBillItemVO.getDefaultTable());
        from1.append(" recitem on recbill.pk_recbill = recitem.pk_recbill ");
        StringBuffer from2 = new StringBuffer();
        from2.append(" from ");
        from2.append(" ar_estirecbill recbill inner join ar_estirecitem recitem ");
        from2.append(" on recbill.pk_estirecbill = recitem.pk_estirecbill ");
        Map<String, String> sumKeytoSelectMap = this.getSumKeytoSelectMap();
        StringBuffer groupby = new StringBuffer(" group by ");
        groupby.append("recbill.src_syscode, recitem.pk_org, ");
        for (String key : sumKeysList) {
            if (!sumKeytoSelectMap.containsKey(key)) continue;
            select.append(", ").append(sumKeytoSelectMap.get(key)).append(" ").append(key);
            groupby.append(sumKeytoSelectMap.get(key)).append(", ");
        }
        StringBuffer pubfrom = new StringBuffer();
        ArrayList<String> condFieldCodeList = new ArrayList<String>();
        for (ConditionVO cond : arapConditions) {
            condFieldCodeList.add(cond.getFieldCode());
        }
        if ((sumKeysList.contains("ccustomerid") || condFieldCodeList.contains("ccustomerid")) && (sumKeysList.contains("pk_custclass") || sumKeysList.contains("pk_areacl") || condFieldCodeList.contains("pk_custclass") || condFieldCodeList.contains("pk_areacl"))) {
            pubfrom.append(" left join bd_customer on (recitem.ordercubasdoc = bd_customer.pk_customer ");
            pubfrom.append(" and recitem.customer = bd_customer.pk_customer) ");
        } else {
            if (sumKeysList.contains("ccustomerid") || condFieldCodeList.contains("ccustomerid")) {
                pubfrom.append(" left join bd_customer on recitem.ordercubasdoc = bd_customer.pk_customer");
            }
            if (sumKeysList.contains("pk_custclass") || sumKeysList.contains("pk_areacl") || condFieldCodeList.contains("pk_custclass") || condFieldCodeList.contains("pk_areacl")) {
                pubfrom.append(" left join bd_customer on recitem.customer = bd_customer.pk_customer");
            }
        }
        if (sumKeysList.contains("cmaterialid") || sumKeysList.contains("pk_marbasclass") || condFieldCodeList.contains("cmaterialcode") || condFieldCodeList.contains("cmaterialname") || condFieldCodeList.contains("pk_marbasclass")) {
            pubfrom.append(" left join bd_material on recitem.material = bd_material.pk_material");
        }
        if (sumKeysList.contains("pk_custsaleclass") || condFieldCodeList.contains("pk_custsaleclass")) {
            pubfrom.append(" left join bd_custsale on recitem.customer = bd_custsale.pk_customer and recitem.pk_org = bd_custsale.pk_org ");
        }
        if (sumKeysList.contains("pk_marsaleclass") || condFieldCodeList.contains("pk_marsaleclass")) {
            ArrayList<String> orgList = new ArrayList<String>();
            ArrayList<String> materiallist = new ArrayList<String>();
            ConditionVO[] conditionVOArray = conditions;
            int cond = conditionVOArray.length;
            for (int i = 0; i < cond; ++i) {
                String value;
                ConditionVO vo = conditionVOArray[i];
                if (vo == null) continue;
                if ("pk_org".equals(vo.getFieldCode())) {
                    value = vo.getValue();
                    value = value.replace("(", "").replace(")", "").replace("'", "");
                    String[] orgArray = value.split(",");
                    orgList.addAll(Arrays.asList(orgArray));
                    continue;
                }
                if (!"cmaterialcode".equals(vo.getFieldCode()) || vo.getValue() == null) continue;
                value = vo.getValue();
                value = value.replace("(", "").replace(")", "").replace("'", "");
                String[] materialArray = value.split(",");
                materiallist.addAll(Arrays.asList(materialArray));
            }
            String bd_materialsale = ((IMaterialShareJoinTableNameService)NCLocator.getInstance().lookup(IMaterialShareJoinTableNameService.class)).getJoinTableNameByArrays("bd_materialsale", materiallist.size() == 0 ? null : materiallist.toArray(new String[0]), orgList.size() == 0 ? new String[]{} : orgList.toArray(new String[0]));
            pubfrom.append(" left join " + bd_materialsale + " bd_materialsale on recitem.material = bd_materialsale.pk_material and recitem.pk_org = bd_materialsale.pk_org");
        }
        StringBuffer where = new StringBuffer(" where recitem.dr = 0 ");
        Map<String, String> fieldCodeMap = this.getFieldCode();
        for (ConditionVO cond : arapConditions) {
            String fieldCode = fieldCodeMap.get(cond.getFieldCode());
            if (fieldCode == null) continue;
            cond.setFieldCode(fieldCode);
            where.append(cond.getSQLStr());
        }
        if (sourSys == MultProfitSourceSystem.RESOURCE_SALE) {
            where.append(" and recbill.").append("src_syscode").append(" = ").append(BillEnumCollection.FromSystem.SO.VALUE);
        } else if (sourSys == MultProfitSourceSystem.RESOURCE_INNER) {
            where.append(" and recbill.").append("src_syscode").append(" = ").append(BillEnumCollection.FromSystem.TO.VALUE);
        } else if (sourSys == MultProfitSourceSystem.RESOURCE_SALE_INNER) {
            try {
                where.append(SqlUtils.getInInt((String)" and recbill.src_syscode", (Integer[])new Integer[]{BillEnumCollection.FromSystem.SO.VALUE, BillEnumCollection.FromSystem.TO.VALUE}, (boolean[])new boolean[]{false}));
            }
            catch (SQLException e) {
                ExceptionHandler.handleException((Exception)e);
            }
        } else {
            where.append(" and 1 = 2 ");
        }
        where.append(" and recitem.rowtype<>5 ");
        BaseDAO dao = new BaseDAO();
        MemoryResultSetProcessor processor = new MemoryResultSetProcessor();
        String tablename = null;
        ArrayList<String> dataTypeList = new ArrayList<String>();
        ArrayList<String> colNamesList = new ArrayList<String>();
        dataTypeList.add("varchar(50)");
        colNamesList.add("src_syscode");
        dataTypeList.add("decimal(28, 8)");
        colNamesList.add("quantity_de");
        dataTypeList.add("decimal(28, 8)");
        colNamesList.add("local_notax_de");
        dataTypeList.add("varchar(20)");
        colNamesList.add("groupnotax_de");
        dataTypeList.add("varchar(20)");
        colNamesList.add("pk_org");
        for (String colName : sumKeysList) {
            dataTypeList.add("varchar(20)");
            colNamesList.add(colName);
        }
        dataTypeList.add("varchar(20)");
        colNamesList.add("pk_recitem");
        String[] dataTypes = dataTypeList.toArray(new String[0]);
        String[] colNames = colNamesList.toArray(new String[0]);
        try {
            long time = System.currentTimeMillis();
            tablename = new TempTableDAO().createTable("TMP_ARAP_ZHMLFX" + time, colNames, dataTypes);
        }
        catch (SQLException | NamingException | SystemException e1) {
            Logger.error((Object)e1.getMessage(), (Throwable)e1);
        }
        StringBuffer insertSql = new StringBuffer().append("insert into ").append(tablename).append("(src_syscode,quantity_de,local_notax_de,groupnotax_de,pk_org,");
        for (String colName : sumKeysList) {
            insertSql.append(colName).append(",");
        }
        insertSql.append("pk_recitem)");
        insertSql.append(select).append(",recitem.pk_recitem ").append(from1).append(pubfrom).append(where).append(groupby.substring(0, groupby.length() - 2)).append(",recitem.pk_recitem");
        dao.executeUpdate(insertSql.toString());
        StringBuffer sb = new StringBuffer();
        if (12 == dao.getDBType()) {
            String tablename2 = null;
            try {
                long time = System.currentTimeMillis();
                tablename2 = new TempTableDAO().createTable("TMP_ARAP_ZHMLFX" + time, colNames, dataTypes);
            }
            catch (SQLException | NamingException | SystemException e1) {
                Logger.error((Object)e1.getMessage(), (Throwable)e1);
            }
            StringBuffer insertSql2 = new StringBuffer().append("insert into ").append(tablename2).append(" select * from " + tablename);
            dao.executeUpdate(insertSql2.toString());
            sb.append("select a.pk_item,b.local_notax_de-a.local_notax_de,b.groupnotax_de - a.groupnotax_de from (select pk_item,sum(local_notax_de) local_notax_de,sum(groupnotax_de) groupnotax_de from (select transfer.pk_item pk_item,busidata.pk_item pk_item2,item.local_notax_de local_notax_de ,item.groupnotax_de groupnotax_de from ARAP_DEBTSTRANSFER transfer inner join ").append(tablename).append(" tmp on transfer.pk_item = tmp.pk_recitem left join arap_busidata busidata on transfer.PK_HISDATA2=busidata.pk_busidata ").append(" left join ar_recitem item on busidata.pk_item = item.pk_recitem ").append(" where transfer.dr=0 and item.dr=0) h group by h.pk_item) a inner join ").append(tablename2).append(" b on a.pk_item=b.pk_recitem ");
        } else {
            sb.append("select a.pk_item,b.local_notax_de-a.local_notax_de,b.groupnotax_de - a.groupnotax_de from (select pk_item,sum(local_notax_de) local_notax_de,sum(groupnotax_de) groupnotax_de from (select transfer.pk_item pk_item,busidata.pk_item pk_item2,item.local_notax_de local_notax_de ,item.groupnotax_de groupnotax_de from ARAP_DEBTSTRANSFER transfer inner join ").append(tablename).append(" tmp on transfer.pk_item = tmp.pk_recitem left join arap_busidata busidata on transfer.PK_HISDATA2=busidata.pk_busidata ").append(" left join ar_recitem item on busidata.pk_item = item.pk_recitem ").append(" where transfer.dr=0 and item.dr=0) h group by h.pk_item) a inner join ").append(tablename).append(" b on a.pk_item=b.pk_recitem ");
        }
        List objs = (List)dao.executeQuery(sb.toString(), (ResultSetProcessor)new ArrayListProcessor());
        if (objs != null && objs.size() > 0) {
            String updateSql = "update " + tablename + " set local_notax_de = ? where pk_recitem=?";
            ArrayList paramList = new ArrayList();
            PersistenceManager manager = null;
            try {
                manager = PersistenceManager.getInstance();
                JdbcSession session = manager.getJdbcSession();
                for (Object[] obj : objs) {
                    SQLParameter param = new SQLParameter();
                    param.addParam(obj[1]);
                    param.addParam(obj[0]);
                    session.addBatch(updateSql, param);
                }
                session.executeBatch();
            }
            catch (DbException e) {
                Logger.error((Object)e.getMessage(), (Throwable)e);
                throw new BusinessException(e.getMessage());
            }
            finally {
                if (manager != null) {
                    manager.release();
                }
            }
        }
        StringBuffer strbuf = new StringBuffer("select src_syscode,quantity_de,local_notax_de,groupnotax_de,pk_org,");
        for (String colName : sumKeysList) {
            strbuf.append(colName).append(",");
        }
        strbuf.deleteCharAt(strbuf.length() - 1);
        strbuf.append(" from ").append(tablename).append(" where local_notax_de<>0 or groupnotax_de <> 0");
        String querysql = strbuf.toString();
        MemoryResultSet resultSet1 = (MemoryResultSet)dao.executeQuery(querysql, (ResultSetProcessor)processor);
        MemoryResultSet resultSet2 = (MemoryResultSet)dao.executeQuery(new StringBuffer().append(select).append(from2).append(pubfrom).append(where).append(groupby.substring(0, groupby.length() - 2)).toString(), (ResultSetProcessor)processor);
        return this.getMultiProRetList(resultSet1, resultSet2, sumKeysList.toArray(new String[sumKeysList.size()]), sourSys);
    }

    private MultipleProfitViewVO[] getMultiProRetList(MemoryResultSet resultSet1, MemoryResultSet resultSet2, String[] sumKeys, MultProfitSourceSystem sourSys) throws BusinessException {
        HashMap<String, MultipleProfitViewVO> resultmap = new HashMap<String, MultipleProfitViewVO>();
        try {
            MemoryResultSetMetaData resultMD = resultSet1.getMetaData0();
            ArrayList resultList1 = resultSet1.getResultArrayList();
            int[] sumKeyIdxs = new int[sumKeys.length];
            for (int i = 0; i < sumKeyIdxs.length; ++i) {
                sumKeyIdxs[i] = resultMD.getNameIndex(sumKeys[i]);
            }
            int sourSysIdx = resultMD.getNameIndex("src_syscode");
            int nshouldreceivnumIdx = resultMD.getNameIndex("quantity_de");
            int ntotalreceivmnyIdx = resultMD.getNameIndex("local_notax_de");
            int groupntotalreceivmnyIdx = resultMD.getNameIndex("groupnotax_de");
            int pkOrgIdx = resultMD.getNameIndex("pk_org");
            for (List innerlist : resultList1) {
                MultipleProfitViewVO mulproViewVO = new MultipleProfitViewVO();
                StringBuffer resultMapKey = new StringBuffer();
                for (int i = 0; i < sumKeys.length; ++i) {
                    resultMapKey.append(innerlist.get(sumKeyIdxs[i]));
                    resultMapKey.append(innerlist.get(sourSysIdx));
                    mulproViewVO.setAttributeValue(sumKeys[i], innerlist.get(sumKeyIdxs[i]));
                }
                mulproViewVO.setAttributeValue("nshouldreceivnum", innerlist.get(nshouldreceivnumIdx));
                mulproViewVO.setAttributeValue("ntotalreceivmny", innerlist.get(ntotalreceivmnyIdx));
                mulproViewVO.setAttributeValue("ntotalreceivgroupmny", innerlist.get(groupntotalreceivmnyIdx));
                mulproViewVO.setAttributeValue("sourcesystem", innerlist.get(sourSysIdx));
                mulproViewVO.setAttributeValue("pk_org", innerlist.get(pkOrgIdx));
                mulproViewVO.setAttributeValue("corigcurrencyid", (Object)Currency.getLocalCurrPK((String)mulproViewVO.getPk_org()));
                if (resultmap.get(resultMapKey.toString()) == null) {
                    resultmap.put(resultMapKey.toString(), mulproViewVO);
                    continue;
                }
                MultipleProfitViewVO recMulproViewVO = (MultipleProfitViewVO)resultmap.get(resultMapKey.toString());
                recMulproViewVO.setNshouldreceivnum(this.add(recMulproViewVO.getNshouldreceivnum(), mulproViewVO.getNshouldreceivnum()));
                recMulproViewVO.setNtotalreceivmny(this.add(recMulproViewVO.getNtotalreceivmny(), mulproViewVO.getNtotalreceivmny()));
            }
            ArrayList resultList2 = resultSet2.getResultArrayList();
            for (List innerlist : resultList2) {
                MultipleProfitViewVO mulproViewVO = new MultipleProfitViewVO();
                StringBuffer resultMapKey = new StringBuffer();
                for (int i = 0; i < sumKeys.length; ++i) {
                    resultMapKey.append(innerlist.get(sumKeyIdxs[i]));
                    mulproViewVO.setAttributeValue(sumKeys[i], innerlist.get(sumKeyIdxs[i]));
                }
                mulproViewVO.setAttributeValue("nshouldreceivnum", innerlist.get(nshouldreceivnumIdx));
                mulproViewVO.setAttributeValue("ntotalreceivmny", innerlist.get(ntotalreceivmnyIdx));
                mulproViewVO.setAttributeValue("ntotalreceivgroupmny", innerlist.get(groupntotalreceivmnyIdx));
                mulproViewVO.setAttributeValue("sourcesystem", innerlist.get(sourSysIdx));
                mulproViewVO.setAttributeValue("pk_org", innerlist.get(pkOrgIdx));
                mulproViewVO.setAttributeValue("corigcurrencyid", (Object)Currency.getLocalCurrPK((String)mulproViewVO.getPk_org()));
                if (resultmap.get(resultMapKey.toString()) == null) {
                    resultmap.put(resultMapKey.toString(), mulproViewVO);
                    continue;
                }
                MultipleProfitViewVO recMulproViewVO = (MultipleProfitViewVO)resultmap.get(resultMapKey.toString());
                recMulproViewVO.setNshouldreceivnum(this.add(recMulproViewVO.getNshouldreceivnum(), mulproViewVO.getNshouldreceivnum()));
                recMulproViewVO.setNtotalreceivmny(this.add(recMulproViewVO.getNtotalreceivmny(), mulproViewVO.getNtotalreceivmny()));
            }
        }
        catch (SQLException e) {
            ExceptionHandler.handleException((Exception)e);
        }
        return resultmap.values().toArray(new MultipleProfitViewVO[0]);
    }

    private Map<String, String> getSumKeytoSelectMap() {
        HashMap<String, String> sumKeytoSelectMap = new HashMap<String, String>();
        sumKeytoSelectMap.put("pk_org", "recitem.pk_org");
        sumKeytoSelectMap.put("sourcesystem", "recbill.src_syscode");
        sumKeytoSelectMap.put("csaleorgid", "recitem.so_org");
        sumKeytoSelectMap.put("cdptid", "recitem.pk_deptid");
        sumKeytoSelectMap.put("cbizid", "recitem.pk_psndoc");
        sumKeytoSelectMap.put("cprodlineid", "recitem.productline");
        sumKeytoSelectMap.put("pk_marbasclass", "bd_material.pk_marbasclass");
        sumKeytoSelectMap.put("pk_marsaleclass", "bd_materialsale.pk_marsaleclass");
        sumKeytoSelectMap.put("cmaterialid", "recitem.material_src");
        sumKeytoSelectMap.put("vbatchcode", "recitem.batchcode");
        sumKeytoSelectMap.put("pk_custclass", "bd_customer.pk_custclass");
        sumKeytoSelectMap.put("pk_custsaleclass", "bd_custsale.pk_custsaleclass");
        sumKeytoSelectMap.put("pk_areacl", "bd_customer.pk_areacl");
        sumKeytoSelectMap.put("ccustomerid", "recitem.ordercubasdoc");
        sumKeytoSelectMap.put("corigcurrencyid", "recitem.pk_currtype");
        sumKeytoSelectMap.put("yearmonth", "substring(recitem.billdate,0,7)");
        return sumKeytoSelectMap;
    }

    private Map<String, String> getFieldCode() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("pk_org", "recitem.pk_org");
        map.put("dbilldate", "recitem.billdate");
        map.put("csaleorgid", "recitem.so_org");
        map.put("cdptid", "recitem.pk_deptid");
        map.put("cbizid", "recitem.pk_psndoc");
        map.put("cprodlineid", "recitem.productline");
        map.put("pk_marbasclass", "bd_material.pk_marbasclass");
        map.put("pk_marsaleclass", "bd_materialsale.pk_marsaleclass");
        map.put("cmaterialcode", "bd_material.code");
        map.put("cmaterialname", "bd_material.name");
        map.put("vbatchcode", "pk_batchcode");
        map.put("pk_custclass", "bd_customer.pk_custclass");
        map.put("pk_custsaleclass", "bd_custsale.pk_custsaleclass");
        map.put("pk_areacl", "bd_customer.pk_areacl");
        map.put("ccustomerid", "recitem.ordercubasdoc");
        map.put("vbillcode", "recitem.purchaseorder");
        return map;
    }

    private UFDouble add(UFDouble d1, UFDouble d2) {
        if (d1 == null && d2 == null) {
            return UFDouble.ZERO_DBL;
        }
        if (d1 == null) {
            return d2;
        }
        if (d2 == null) {
            return d1;
        }
        return d1.add(d2);
    }

    public ReceivableBillVO[] findUnConfirmBillsByPeriod(String pk_org, UFDate begindate, UFDate enddate) throws BusinessException {
        SQLParameter param = new SQLParameter();
        param.addParam(pk_org);
        param.addParam(begindate.toStdString());
        param.addParam(enddate.getDateAfter(1).toStdString());
        String whereString = "pk_org =? and coordflag = 0 and billdate >=? and billdate <?";
        Collection bills = new BaseDAO().retrieveByClause(ReceivableBillVO.class, whereString, param);
        return bills.toArray(new ReceivableBillVO[0]);
    }

    public boolean isDebtTransfer(String pk_bill) throws BusinessException {
        if (pk_bill != null) {
            SQLParameter param = new SQLParameter();
            param.addParam(pk_bill);
            String whereString = " pk_bill =? and dealflag = 41";
            Collection bills = new BaseDAO().retrieveByClause(TallyVO.class, whereString, param);
            if (bills != null && bills.size() > 0) {
                return true;
            }
        }
        return false;
    }

    public Map<String, UFBoolean> isEffect(String[] pk_bills) throws BusinessException {
        List bills = ArapBillDAO.getInstance().queryParentVOByPKs(pk_bills, "F0");
        if (bills == null || bills.size() == 0) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0765"));
        }
        HashMap<String, UFBoolean> resultMap = new HashMap<String, UFBoolean>();
        for (BaseBillVO bill : bills) {
            Object approveStatus = bill.getAttributeValue("approvestatus");
            if (BillEnumCollection.ApproveStatus.PASSING.VALUE.equals(approveStatus)) {
                resultMap.put(bill.getPrimaryKey(), UFBoolean.TRUE);
                continue;
            }
            resultMap.put(bill.getPrimaryKey(), UFBoolean.FALSE);
        }
        return resultMap;
    }
}

