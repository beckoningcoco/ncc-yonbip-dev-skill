/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.dao.BaseDAO
 *  nc.bs.dao.DAOException
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.logging.Logger
 *  nc.bs.mw.sqltrans.TempTable
 *  nc.impl.pubapp.pattern.data.bill.BillQueryForDelete
 *  nc.jdbc.framework.ConnectionFactory
 *  nc.jdbc.framework.PersistenceManager
 *  nc.jdbc.framework.SQLParameter
 *  nc.jdbc.framework.exception.DbException
 *  nc.jdbc.framework.processor.BeanListProcessor
 *  nc.jdbc.framework.processor.ColumnListProcessor
 *  nc.jdbc.framework.processor.ResultSetProcessor
 *  nc.md.data.criterion.ICriterion
 *  nc.md.data.criterion.QueryCondition
 *  nc.md.data.criterion.expression.Restrictions
 *  nc.md.data.criterion.expression.SimpleExpression
 *  nc.md.model.MetaDataException
 *  nc.md.persist.framework.MDPersistenceService
 *  nc.pubitf.uapbd.ICustomerPubService
 *  nc.utils.fipub.FipubSqlExecuter
 *  nc.vo.arap.agiotage.AggAgiotageVO
 *  nc.vo.arap.gathering.GatheringBillVO
 *  nc.vo.arap.pay.PayBillVO
 *  nc.vo.arap.payable.PayableBillVO
 *  nc.vo.arap.receivable.ReceivableBillVO
 *  nc.vo.bd.cust.finance.CustFinanceVO
 *  nc.vo.fi.pub.SqlUtils
 *  nc.vo.fibd.RecpaytypeVO
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.fipub.summary.SummaryVO
 *  nc.vo.fipub.utils.SqlBuilder
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.ISuperVO
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pub.lang.UFDouble
 *  nc.vo.pubapp.pattern.model.entity.bill.IBill
 *  nc.vo.pubapp.pattern.pub.MapList
 *  nc.vo.pubapp.pattern.pub.MathTool
 *  nc.vo.trade.sqlutil.IInSqlBatchCallBack
 *  nc.vo.trade.sqlutil.InSqlBatchCaller
 *  nc.vo.util.SqlWrapper
 *  nccloud.riart.vo.pub.transtype.PublishAppVO
 *  org.apache.commons.collections4.CollectionUtils
 *  org.apache.commons.lang3.ArrayUtils
 *  org.apache.commons.lang3.StringUtils
 */
package nc.bs.arap.bill;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import nc.bs.arap.bill.ArGatherResultSetProcess;
import nc.bs.arap.bill.ArapBillPubUtil;
import nc.bs.arap.bill.ArapCreditUtil;
import nc.bs.arap.bill.ArapGeneralDAO;
import nc.bs.arap.util.ArapBillType2TableMapping;
import nc.bs.arap.util.SqlUtils;
import nc.bs.dao.BaseDAO;
import nc.bs.dao.DAOException;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.framework.common.NCLocator;
import nc.bs.logging.Logger;
import nc.bs.mw.sqltrans.TempTable;
import nc.impl.pubapp.pattern.data.bill.BillQueryForDelete;
import nc.jdbc.framework.ConnectionFactory;
import nc.jdbc.framework.PersistenceManager;
import nc.jdbc.framework.SQLParameter;
import nc.jdbc.framework.exception.DbException;
import nc.jdbc.framework.processor.BeanListProcessor;
import nc.jdbc.framework.processor.ColumnListProcessor;
import nc.jdbc.framework.processor.ResultSetProcessor;
import nc.md.data.criterion.ICriterion;
import nc.md.data.criterion.QueryCondition;
import nc.md.data.criterion.expression.Restrictions;
import nc.md.data.criterion.expression.SimpleExpression;
import nc.md.model.MetaDataException;
import nc.md.persist.framework.MDPersistenceService;
import nc.pubitf.uapbd.ICustomerPubService;
import nc.utils.fipub.FipubSqlExecuter;
import nc.vo.arap.agiotage.AggAgiotageVO;
import nc.vo.arap.agiotage.ArapBusiDataVO;
import nc.vo.arap.basebill.ArapVOFactory;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.arap.basebill.PeriodpaymentParaVO;
import nc.vo.arap.basebill.PeriodpaymentReturnVO;
import nc.vo.arap.basebill.ReCaculateARParaVO;
import nc.vo.arap.gathering.GatheringBillVO;
import nc.vo.arap.pay.PayBillVO;
import nc.vo.arap.payable.PayableBillVO;
import nc.vo.arap.pub.ArapBillTypeInfo;
import nc.vo.arap.pub.IArapBilltypeInfo;
import nc.vo.arap.receivable.ReceivableBillVO;
import nc.vo.arap.termitem.TermVO;
import nc.vo.arap.utils.StringUtil;
import nc.vo.bd.cust.finance.CustFinanceVO;
import nc.vo.fibd.RecpaytypeVO;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.fipub.summary.SummaryVO;
import nc.vo.fipub.utils.SqlBuilder;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.ISuperVO;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.model.entity.bill.IBill;
import nc.vo.pubapp.pattern.pub.MapList;
import nc.vo.pubapp.pattern.pub.MathTool;
import nc.vo.trade.sqlutil.IInSqlBatchCallBack;
import nc.vo.trade.sqlutil.InSqlBatchCaller;
import nc.vo.util.SqlWrapper;
import nccloud.bs.arap.util.Collections;
import nccloud.riart.vo.pub.transtype.PublishAppVO;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

public class ArapBillDAO {
    private static ArapBillDAO dao = null;
    private ResultSetProcessor processor = null;
    private static UFDouble ZERO = new UFDouble(0.0);
    private BaseDAO baseDao = null;

    public static ArapBillDAO getInstance() {
        if (null == dao) {
            dao = new ArapBillDAO();
        }
        return dao;
    }

    public Object[] queryBillByPKForPageQry(String[] keys, String billType) throws BusinessException {
        IArapBilltypeInfo billtypevo = ArapBillTypeInfo.getInstance(billType);
        String tableNameItem = billtypevo.getTableNameItem();
        String pkItem = billtypevo.getTablePrimaryKeyItem();
        String pkBill = billtypevo.getTablePrimaryKeyBill();
        String sql = pkItem + " in ( select " + pkItem + " from (select " + pkItem + ",row_number() over(partition by " + pkBill + " order by " + pkItem + ") rn from " + tableNameItem + " where " + nc.vo.fi.pub.SqlUtils.getInStr((String)pkBill, (String[])keys, (boolean)true) + " and dr=0 ) items  where rn=1 )";
        Object[] queryBillByPKForPageQry = this.queryBillByPKForPageQry(keys, billType, true);
        if (queryBillByPKForPageQry != null) {
            List list = (List)this.getBaseDAO().retrieveByClause(billtypevo.getItemvoClass(), sql);
            HashMap<String, BaseAggVO> aggVOMap = new HashMap<String, BaseAggVO>();
            for (Object vo : queryBillByPKForPageQry) {
                BaseAggVO aggvo = (BaseAggVO)((Object)vo);
                aggVOMap.put(aggvo.getParentVO().getPrimaryKey(), aggvo);
            }
            if (list != null) {
                for (BaseItemVO item : list) {
                    CircularlyAccessibleValueObject parentVO = ((BaseAggVO)((Object)aggVOMap.get(item.getParentPK()))).getParentVO();
                    String[] matchField = new String[]{"bankrollprojet", "busidate", "cashaccount", "cashitem", "checkelement", "costcenter", "customer", "globalrate", "grouprate", "objtype", "ordercubasdoc", "payaccount", "payreason", "pk_balatype", "pk_deptid", "pk_deptid_res", "pk_deptid_v", "pk_psndoc", "pk_rescenter", "pk_subjcode", "pu_deptid", "pu_deptid_v", "pu_org", "pu_org_v", "pu_psndoc", "rate", "recaccount", "so_deptid", "so_deptid_v", "so_org", "so_org_v", "so_psndoc", "supplier"};
                    if (parentVO == null) continue;
                    for (String field : matchField) {
                        Object attributeValue = item.getAttributeValue(field);
                        if (attributeValue == null) continue;
                        parentVO.setAttributeValue(field, attributeValue);
                    }
                }
            }
        }
        return queryBillByPKForPageQry;
    }

    public Object[] queryBillByPKForPageQry(String[] keys, String billType, boolean bLazyLoad) throws BusinessException {
        return MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByPKsWithOrder(ArapBillType2TableMapping.getVOClassByBilltype(billType), keys, bLazyLoad);
    }

    public AggregatedValueObject[] queryBillByPrimaryKeys(String[] keys, String billType) throws BusinessException {
        IBill[] query = ArapGeneralDAO.getInstance().query(ArapBillType2TableMapping.getVOClassByBilltype(billType), keys);
        return (AggregatedValueObject[])query;
    }

    public AggregatedValueObject[] queryBillByPrimaryKeysWithOrder(String[] keys, String billType, String[] parentField, String[] childField) throws BusinessException {
        IBill[] query = ArapGeneralDAO.getInstance().queryWithOrder(ArapBillType2TableMapping.getVOClassByBilltype(billType), keys, parentField, childField);
        return (AggregatedValueObject[])query;
    }

    public AggregatedValueObject[] queryBillByKeysForDelete(String[] keys, String billType) throws BusinessException {
        BillQueryForDelete query = new BillQueryForDelete(ArapBillType2TableMapping.getVOClassByBilltype(billType));
        return (AggregatedValueObject[])query.query(keys);
    }

    public BaseAggVO queryBillByPrimaryKey(String key, String billType) throws BusinessException {
        if (null == key) {
            return null;
        }
        BaseAggVO[] vos = (BaseAggVO[])this.queryBillByPrimaryKeys(new String[]{key}, billType);
        return null != vos && vos.length > 0 ? vos[0] : null;
    }

    public BaseAggVO[] queryVOsByWhere(String condition, Class<? extends BaseAggVO> voClass) throws BusinessException {
        try {
            Collection c = MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByCond(voClass, condition, false);
            BaseAggVO[] ret = null;
            Class<?> clazz = c.iterator().next().getClass();
            if (clazz.equals(voClass)) {
                ret = c.toArray(new BaseAggVO[0]);
            }
            return ret;
        }
        catch (Exception e) {
            throw ExceptionHandler.handleException((Exception)e);
        }
    }

    public List<AggregatedValueObject> queryBillOfVOByCond(Class<?> beanClass, String[] pks) throws BusinessException {
        QueryCondition conds = new QueryCondition(beanClass);
        conds.addCondition(Restrictions.in((String)"top_billid", (Object[])pks));
        ArrayList<SimpleExpression> ls = new ArrayList<SimpleExpression>();
        ls.add(Restrictions.eq((String)"dr", (Object)"0"));
        conds.addCondition((ICriterion)Restrictions.and(ls));
        ArrayList vos = (ArrayList)MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByCond(conds, false);
        return vos;
    }

    public List<String> queryPksByCondition(String cond, String billType) throws BusinessException {
        String sql = "";
        if (cond != null && cond.length() > 0) {
            if (cond.trim().indexOf("select") == 0 || cond.trim().indexOf("SELECT") == 0) {
                sql = cond;
            } else {
                sql = "select " + ArapBillType2TableMapping.getParentTablePK(billType) + " from " + ArapBillType2TableMapping.getParentTable(billType);
                sql = sql + " where " + cond;
            }
        } else {
            sql = "select " + ArapBillType2TableMapping.getParentTablePK(billType) + " from " + ArapBillType2TableMapping.getParentTable(billType);
        }
        List pks = (List)new BaseDAO().executeQuery(sql, new ResultSetProcessor(){
            private static final long serialVersionUID = 2244036624513966990L;

            public Object handleResultSet(ResultSet rs) throws SQLException {
                ArrayList<String> ret = new ArrayList<String>();
                while (rs.next()) {
                    ret.add(rs.getString(1));
                }
                return ret;
            }
        });
        return pks;
    }

    public List<BaseBillVO> queryByCondition(String cond, String billType) throws BusinessException {
        String sql = "";
        if (cond != null && cond.length() > 0) {
            if (cond.trim().indexOf("select") == 0 || cond.trim().indexOf("SELECT") == 0) {
                sql = cond;
            } else {
                sql = "select " + ArapBillType2TableMapping.getParentTablePK(billType) + ",ts from " + ArapBillType2TableMapping.getParentTable(billType);
                sql = sql + " where " + cond;
            }
        } else {
            sql = "select " + ArapBillType2TableMapping.getParentTablePK(billType) + ",ts from " + ArapBillType2TableMapping.getParentTable(billType);
        }
        List result = (List)new BaseDAO().executeQuery(sql, (ResultSetProcessor)new BeanListProcessor(ArapBillType2TableMapping.getParentVOByBilltype(billType)));
        return result;
    }

    public List<BaseBillVO> queryParentVOByPKs(String[] pks, String billType) throws BusinessException {
        if (null == pks || null == billType) {
            return null;
        }
        List list = null;
        try {
            String cond = SqlUtils.getInStr(ArapBillType2TableMapping.getParentTablePK(billType), pks) + " and " + SqlUtils.convertParentCond(billType, "dr") + " = 0 order by " + ArapBillType2TableMapping.getParentTablePK(billType);
            list = (List)this.getBaseDAO().retrieveByClause(ArapVOFactory.getParentVOInstance(billType).getClass(), cond);
        }
        catch (DAOException e) {
            Logger.error((Object)e.getMessage(), (Throwable)e);
            throw ExceptionHandler.handleException((Exception)((Object)e));
        }
        return list;
    }

    public List<BaseItemVO> queryChildrenVOByPks(String[] pks, String billType) throws BusinessException {
        if (null == pks || null == billType) {
            return null;
        }
        List list = null;
        try {
            String cond = SqlUtils.getInStr(ArapBillType2TableMapping.getChildren_ParentPK(billType), pks) + "and " + SqlUtils.convertChildrenCond(billType, "dr") + " = 0 order by " + ArapBillType2TableMapping.getChildrenTablePK(billType);
            list = (List)this.getBaseDAO().retrieveByClause(ArapVOFactory.getChildrenVOInstance(billType).getClass(), cond);
        }
        catch (DAOException e) {
            Logger.error((Object)e.getMessage(), (Throwable)e);
            throw ExceptionHandler.handleException((Exception)((Object)e));
        }
        return list;
    }

    public List<BaseBillVO> queryParentVOByPKs(String[] pks, String billType, String whereClause) throws BusinessException {
        if (null == pks || null == billType) {
            return null;
        }
        List list = null;
        list = (List)this.getBaseDAO().retrieveByClause(ArapVOFactory.getParentVOInstance(billType.trim()).getClass(), whereClause);
        return list;
    }

    public List<BaseItemVO> queryChildrenVOByPks(String[] pks, String billType, String whereClause) throws BusinessException {
        if (null == pks || null == billType) {
            return null;
        }
        List list = null;
        list = (List)this.getBaseDAO().retrieveByClause(ArapVOFactory.getChildrenVOInstance(billType.trim()).getClass(), whereClause);
        return list;
    }

    public HashMap<String, ArrayList<String>> getBillTypeAndPKMapping(String[] pks) throws BusinessException {
        String sql = "select pk_billtype, pk_bill from arap_bill where  " + SqlUtils.getInStr("pk_bill", pks) + "and dr = 0";
        return (HashMap)new BaseDAO().executeQuery(sql, new ResultSetProcessor(){
            private static final long serialVersionUID = 2244036624513966990L;

            public Object handleResultSet(ResultSet rs) throws SQLException {
                HashMap mapp = new HashMap();
                while (rs.next()) {
                    if (null == mapp.get(rs.getString(1))) {
                        ArrayList<String> ls = new ArrayList<String>();
                        ls.add(rs.getString(2));
                        mapp.put(rs.getString(1), ls);
                        continue;
                    }
                    ((ArrayList)mapp.get(rs.getString(1))).add(rs.getString(2));
                }
                return mapp;
            }
        });
    }

    public void updateCooperateFlag(List<String> pk_items, Integer flag) throws BusinessException {
        if (null == pk_items || pk_items.size() == 0) {
            return;
        }
        flag = flag == null ? Integer.valueOf(0) : flag;
        PersistenceManager pm = null;
        try {
            String sql = "update arap_item set coordflag = " + flag + " where  " + SqlUtils.getInStr("pk_item", pk_items.toArray(new String[0])) + " and dr=0 ";
            pm = PersistenceManager.getInstance((String)InvocationInfoProxy.getInstance().getUserDataSource());
            pm.getJdbcSession().executeUpdate(sql);
        }
        catch (Exception e) {
            throw ExceptionHandler.handleException(this.getClass(), (Exception)e);
        }
        finally {
            if (pm != null) {
                pm.release();
            }
        }
    }

    public BaseBillVO updateBillEffectStatus(BaseBillVO parent) throws BusinessException {
        return null;
    }

    public BaseBillVO updateSignStatus(BaseBillVO parent) throws SQLException, DbException, BusinessException {
        return null;
    }

    public void updateSourceBillIsReded(String pk_bill) throws BusinessException {
        if (null == pk_bill) {
            return;
        }
        String sql = "update arap_bill set isreded = 'N' where pk_bill = '" + pk_bill + "'";
        PersistenceManager pm = null;
        try {
            pm = PersistenceManager.getInstance((String)InvocationInfoProxy.getInstance().getUserDataSource());
            pm.getJdbcSession().executeUpdate(sql);
        }
        catch (Exception e) {
            throw ExceptionHandler.handleException(this.getClass(), (Exception)e);
        }
        finally {
            if (pm != null) {
                pm.release();
            }
        }
    }

    public void updateSourceBillBatchIsReded(List<String> pk_bills) throws BusinessException {
        if (null == pk_bills || pk_bills.size() == 0) {
            return;
        }
        String insql = null;
        try {
            insql = SqlUtils.getInStr("pk_bill", pk_bills.toArray(new String[0]), true);
        }
        catch (SQLException e1) {
            throw ExceptionHandler.handleException((Exception)e1);
        }
        String sql = "update arap_bill set isreded = 'N' where " + insql;
        PersistenceManager pm = null;
        try {
            pm = PersistenceManager.getInstance((String)InvocationInfoProxy.getInstance().getUserDataSource());
            pm.getJdbcSession().executeUpdate(sql);
        }
        catch (Exception e) {
            throw ExceptionHandler.handleException(this.getClass(), (Exception)e);
        }
        finally {
            if (pm != null) {
                pm.release();
            }
        }
    }

    public void updateTermItem(TermVO[] terms) throws BusinessException {
        this.getBaseDAO().updateVOArray((SuperVO[])terms);
    }

    public Map<String, Integer> queryBalanceByCustomers(String[] pk_customers) throws BusinessException {
        SqlBuilder builder = new SqlBuilder();
        builder.append("select customer ,sum(money_bal) ");
        builder.append("from arap_receivableitem ");
        builder.append("where ");
        builder.append("customer", pk_customers);
        builder.append("and money_bal <> 0 ");
        builder.append("and dr = 0 ");
        builder.append("group by ");
        builder.append("customer ");
        HashMap<String, Integer> map = new HashMap();
        map = (Map)this.getBaseDAO().executeQuery(builder.toString(), ArapBillPubUtil.getResultSetProcessor());
        return map;
    }

    public Map<String, Integer> queryBalanceBySupplier(String[] pk_customers) throws BusinessException {
        SqlBuilder builder = new SqlBuilder();
        builder.append("select supplier ,sum(money_bal) ");
        builder.append("from arap_payitem ");
        builder.append("where ");
        builder.append("supplier", pk_customers);
        builder.append("and money_bal <> 0 ");
        builder.append("and dr = 0 ");
        builder.append("and (src_syscode = 0 or src_syscode = 1) ");
        builder.append("group by ");
        builder.append("supplier ");
        HashMap<String, Integer> map = new HashMap();
        map = (Map)this.getBaseDAO().executeQuery(builder.toString(), ArapBillPubUtil.getResultSetProcessor());
        return map;
    }

    public void deleteTermItemByPK(String[] pks) throws BusinessException {
        try {
            this.getBaseDAO().deleteByClause(TermVO.class, SqlUtils.getInStr("pk_bill", pks));
        }
        catch (DAOException e) {
            throw ExceptionHandler.createException((Throwable)e);
        }
    }

    public void deleteTermItemByItemPK(String[] pks) throws BusinessException {
        try {
            this.getBaseDAO().deleteByClause(TermVO.class, SqlUtils.getInStr("pk_item", pks));
        }
        catch (DAOException e) {
            throw ExceptionHandler.createException((Throwable)e);
        }
    }

    public void insertTermVOs(TermVO[] terms) throws BusinessException {
        try {
            String[] pks = this.getBaseDAO().insertVOArrayWithPK((SuperVO[])terms);
            if (terms.length > pks.length) {
                ArrayList<TermVO> orginVOs = new ArrayList<TermVO>();
                for (int index = 0; index < terms.length; ++index) {
                    if (index > pks.length) continue;
                    if (!terms[index].getPrimaryKey().equals(pks[index])) {
                        orginVOs.add(terms[index]);
                        continue;
                    }
                    orginVOs.add(terms[index]);
                }
                this.getBaseDAO().insertVOArray((SuperVO[])orginVOs.toArray(terms));
            }
        }
        catch (DAOException e) {
            throw ExceptionHandler.createException((Throwable)e);
        }
    }

    public void deleteBillSourceBillPK(String pk) throws BusinessException {
        new SqlBuilder();
    }

    public int doReCaculate(String srctable, ReCaculateARParaVO vo, String intotable) throws BusinessException {
        PersistenceManager pm = null;
        try {
            int count;
            pm = PersistenceManager.getInstance((String)InvocationInfoProxy.getInstance().getUserDataSource());
            pm.getJdbcSession().addBatch(vo.getSql(srctable, 1, intotable));
            pm.getJdbcSession().addBatch(vo.getSql(srctable, 3, intotable));
            pm.getJdbcSession().addBatch(vo.getSql(srctable, 0, intotable));
            pm.getJdbcSession().addBatch(vo.getSql(srctable, 2, intotable));
            int n = count = pm.getJdbcSession().executeBatch();
            return n;
        }
        catch (Exception e) {
            throw ExceptionHandler.handleException(this.getClass(), (Exception)e);
        }
        finally {
            if (pm != null) {
                pm.release();
            }
        }
    }

    public Map<String, PeriodpaymentReturnVO[]> getMoneyForPeriodpaymentCheck(PeriodpaymentParaVO[] paras) throws BusinessException {
        HashMap<String, PeriodpaymentReturnVO[]> map = new HashMap<String, PeriodpaymentReturnVO[]>();
        this.setInnerctldeferdays(paras);
        PeriodpaymentParaVO combine = ArapCreditUtil.canCombine(paras, false);
        if (combine != null) {
            PeriodpaymentReturnVO[] arvalue = this.queryArBill(combine, false);
            PeriodpaymentReturnVO[] gathervalue = this.queryGatherBill(combine, false);
            for (PeriodpaymentParaVO para : paras) {
                PeriodpaymentReturnVO[] arvalue1 = ArapCreditUtil.dealResult(arvalue, combine, para);
                PeriodpaymentReturnVO[] gathervalue1 = ArapCreditUtil.dealResult(gathervalue, combine, para);
                PeriodpaymentReturnVO[] result = this.dealResult(arvalue1, gathervalue1, para, false);
                map.put(para.getKey(), result);
            }
        } else {
            for (PeriodpaymentParaVO para : paras) {
                PeriodpaymentReturnVO[] arvalue = this.queryArBill(para, false);
                PeriodpaymentReturnVO[] gathervalue = this.queryGatherBill(para, false);
                PeriodpaymentReturnVO[] result = this.dealResult(arvalue, gathervalue, para, false);
                map.put(para.getKey(), result);
            }
        }
        return map;
    }

    public Map<String, PeriodpaymentReturnVO[]> getMoneyForPeriodpaymentCheckAll(PeriodpaymentParaVO[] paras) throws BusinessException {
        HashMap<String, PeriodpaymentReturnVO[]> map = new HashMap<String, PeriodpaymentReturnVO[]>();
        this.setInnerctldeferdays(paras);
        for (PeriodpaymentParaVO para : paras) {
            PeriodpaymentReturnVO[] arvalue = this.queryArBill(para, true);
            PeriodpaymentReturnVO[] gathervalue = this.queryGatherBill(para, true);
            PeriodpaymentReturnVO[] result = this.dealResult(arvalue, gathervalue, para, true);
            map.put(para.getKey(), result);
        }
        return map;
    }

    private void setInnerctldeferdays(PeriodpaymentParaVO[] paras) throws BusinessException {
        ArrayList<String> pk_customers = new ArrayList<String>();
        for (PeriodpaymentParaVO para : paras) {
            pk_customers.add(para.getCustomer());
        }
        Map custFinanceVOs = ((ICustomerPubService)NCLocator.getInstance().lookup(ICustomerPubService.class)).getCustFinanceVO(pk_customers.toArray(new String[0]), new String[]{"innerctldeferdays"});
        if (null == custFinanceVOs) {
            return;
        }
        for (PeriodpaymentParaVO para : paras) {
            List list = (List)custFinanceVOs.get(para.getCustomer());
            if (null == list) continue;
            for (CustFinanceVO vo : list) {
                if (null == vo.getInnerctldeferdays() || vo.getInnerctldeferdays().compareTo(para.getInnerctldeferdays()) <= 0) continue;
                para.setInnerctldeferdays(vo.getInnerctldeferdays());
            }
        }
    }

    private PeriodpaymentReturnVO[] dealResult(PeriodpaymentReturnVO[] arvalue, PeriodpaymentReturnVO[] gathervalue, PeriodpaymentParaVO para, boolean isAll) {
        if (ArrayUtils.isEmpty((Object[])arvalue) && ArrayUtils.isEmpty((Object[])gathervalue)) {
            return new PeriodpaymentReturnVO[0];
        }
        HashMap<String, PeriodpaymentReturnVO> armap = new HashMap<String, PeriodpaymentReturnVO>();
        HashMap<String, PeriodpaymentReturnVO> gathermap = new HashMap<String, PeriodpaymentReturnVO>();
        HashMap<String, String> currtype = new HashMap<String, String>();
        if (isAll) {
            return this.dealResultForArAcc(armap, gathermap, arvalue, currtype, gathervalue, para);
        }
        if (ArrayUtils.isNotEmpty((Object[])arvalue)) {
            for (PeriodpaymentReturnVO value : arvalue) {
                armap.put(value.getCurrtype(), value);
                currtype.put(value.getCurrtype(), value.getCurrtype());
            }
        }
        if (ArrayUtils.isNotEmpty((Object[])gathervalue)) {
            for (PeriodpaymentReturnVO value : gathervalue) {
                gathermap.put(value.getCurrtype(), value);
                currtype.put(value.getCurrtype(), value.getCurrtype());
            }
        }
        String[] types = currtype.values().toArray(new String[currtype.values().size()]);
        ArrayList<PeriodpaymentReturnVO> returnvalue = new ArrayList<PeriodpaymentReturnVO>();
        for (String value : types) {
            PeriodpaymentReturnVO ar = (PeriodpaymentReturnVO)armap.get(value);
            PeriodpaymentReturnVO gather = (PeriodpaymentReturnVO)gathermap.get(value);
            UFDouble armny = ar == null ? ZERO : ar.getMoney();
            UFDouble gathermny = gather == null ? ZERO : gather.getMoney();
            Integer day = -10000;
            if (null != ar && null != ar.getDate()) {
                day = para.getDate().getDaysAfter(ar.getDate());
            }
            PeriodpaymentReturnVO valVO = new PeriodpaymentReturnVO(value, armny.sub(gathermny), ar == null ? new UFDate() : ar.getDate());
            valVO.setDay(day);
            valVO.setInnerdays(day - para.getInnerctldeferdays() < 0 ? -10000 : day - para.getInnerctldeferdays());
            returnvalue.add(valVO);
        }
        return returnvalue.toArray(new PeriodpaymentReturnVO[returnvalue.size()]);
    }

    private PeriodpaymentReturnVO[] dealResultForArAcc(Map<String, PeriodpaymentReturnVO> armap, Map<String, PeriodpaymentReturnVO> gathermap, PeriodpaymentReturnVO[] arvalue, Map<String, String> currtype, PeriodpaymentReturnVO[] gathervalue, PeriodpaymentParaVO para) {
        if (ArrayUtils.isNotEmpty((Object[])arvalue)) {
            for (PeriodpaymentReturnVO value : arvalue) {
                armap.put(value.getCurrtype() + "-" + value.getPk_item(), value);
                currtype.put(value.getCurrtype(), value.getCurrtype());
            }
        }
        if (ArrayUtils.isNotEmpty((Object[])gathervalue)) {
            for (PeriodpaymentReturnVO value : gathervalue) {
                gathermap.put(value.getCurrtype() + "-" + value.getPk_item(), value);
                currtype.put(value.getCurrtype(), value.getCurrtype());
            }
        }
        String[] types = currtype.values().toArray(new String[currtype.values().size()]);
        ArrayList<PeriodpaymentReturnVO> returnvalue = new ArrayList<PeriodpaymentReturnVO>();
        for (String value : types) {
            for (Map.Entry<String, PeriodpaymentReturnVO> pParm : armap.entrySet()) {
                String currt = pParm.getKey().split("-")[0];
                if (!value.equals(currt)) continue;
                PeriodpaymentReturnVO ar = pParm.getValue();
                UFDouble armny = ar == null ? ZERO : ar.getMoney();
                Integer day = -10000;
                if (null != ar && null != ar.getDate()) {
                    day = this.getDay4BeginAndEnd(para.getDate(), ar.getDate());
                }
                UFDouble mny = null;
                if (gathermap.get(value) == null && gathermap.isEmpty()) {
                    mny = ZERO;
                } else {
                    for (Map.Entry<String, PeriodpaymentReturnVO> g : gathermap.entrySet()) {
                        if (value.equals(g.getKey().split("-")[0])) {
                            mny = g.getValue().getMoney() == null ? ZERO : g.getValue().getMoney();
                            continue;
                        }
                        mny = ZERO;
                    }
                }
                PeriodpaymentReturnVO valVO = new PeriodpaymentReturnVO(value, armny, ar == null ? new UFDate() : ar.getDate());
                valVO.setDay(day);
                valVO.setInnerdays(day - para.getInnerctldeferdays() < 0 ? -10000 : day - para.getInnerctldeferdays());
                this.setValue(true, ar, valVO);
                returnvalue.add(valVO);
            }
            for (Map.Entry<String, PeriodpaymentReturnVO> gParm : gathermap.entrySet()) {
                UFDouble mny = UFDouble.ZERO_DBL;
                String currt = gParm.getKey().split("-")[0];
                if (!value.equals(currt)) continue;
                PeriodpaymentReturnVO gather = gParm.getValue();
                mny = gParm.getValue().getMoney() == null ? ZERO : gParm.getValue().getMoney();
                UFDouble armny = ZERO;
                UFDouble gathermny = gather == null ? ZERO : gather.getMoney();
                Integer day = -10000;
                if (gParm.getValue() != null && gParm.getValue().getDate() != null) {
                    day = this.getDay4BeginAndEnd(para.getDate(), gather.getDate());
                }
                PeriodpaymentReturnVO valVO = new PeriodpaymentReturnVO(value, gathermny, gather == null ? new UFDate() : gather.getDate());
                valVO.setDay(day);
                valVO.setInnerdays(day - para.getInnerctldeferdays() < 0 ? -10000 : day - para.getInnerctldeferdays());
                this.setValue(true, gather, valVO);
                returnvalue.add(valVO);
            }
        }
        return returnvalue.toArray(new PeriodpaymentReturnVO[returnvalue.size()]);
    }

    public int getDay4BeginAndEnd(UFDate begin, UFDate end) {
        int day = 0;
        int compare = begin.compareTo(end);
        if (compare == 1) {
            day = begin.getDaysAfter(end);
        } else {
            day = end.getDaysAfter(begin);
            if (day != 0) {
                day = 0 - day;
            }
        }
        return day;
    }

    private void setValue(boolean isAll, PeriodpaymentReturnVO vo, PeriodpaymentReturnVO valVO) {
        if (isAll) {
            valVO.setBillno(vo.getBillno());
            valVO.setBilltype(vo.getBilltype());
            valVO.setChanneltype(vo.getChanneltype());
            valVO.setBilldate(vo.getBilldate());
            valVO.setCustomer(vo.getCustomer());
            valVO.setRowno(vo.getRowno());
            valVO.setVtrancode(vo.getVtrancode());
            valVO.setProtectline(vo.getProtectline());
            valVO.setPk_bill(vo.getPk_bill());
        }
    }

    private PeriodpaymentReturnVO[] queryGatherBill(PeriodpaymentParaVO para, boolean isAll) throws BusinessException {
        String selectSqlGa = "";
        String sql = "";
        if (isAll) {
            selectSqlGa = "select ar_gatheritem.money_bal ,ar_gatheritem.pk_currtype, arap_termitem.expiredate,ar_gatheritem.customer,ar_gatheritem.pk_billtype,ar_gatheritem.billno,ar_gatheritem.billdate,ar_gatheritem.rowno,ar_gatheritem.so_ordertype,ar_gatheritem.so_transtype,ar_gatheritem.productline,ar_gatheritem.ordercubasdoc,arap_termitem.pk_termitem,ar_gatheritem.pk_gatherbill";
            sql = selectSqlGa + para.getOtherSelectSql(false, false) + " from arap_termitem, ar_gatheritem where arap_termitem.pk_item = ar_gatheritem.pk_gatheritem  and ar_gatheritem.dr = 0 and arap_termitem.dr  = 0 and (ar_gatheritem.money_bal>0 or ar_gatheritem.money_bal<0)" + para.getWhereSql(false, false, true);
        } else {
            selectSqlGa = "select sum(ar_gatheritem.money_bal),ar_gatheritem.pk_currtype,min(ar_gatherbill.billdate) ";
            sql = selectSqlGa + para.getOtherSelectSql(false, false) + " from ar_gatherbill, ar_gatheritem where ar_gatherbill.pk_gatherbill = ar_gatheritem.pk_gatherbill and ar_gatheritem.dr = 0" + para.getWhereSql(false, false, false);
        }
        ArrayList val = null;
        try {
            val = (ArrayList)this.getBaseDAO().executeQuery(sql, this.getProcessor(para));
        }
        catch (DAOException e) {
            throw ExceptionHandler.handleException((Exception)((Object)e));
        }
        return val == null ? null : val.toArray(new PeriodpaymentReturnVO[val.size()]);
    }

    private PeriodpaymentReturnVO[] queryArBill(PeriodpaymentParaVO para, boolean isAll) throws BusinessException {
        String sql = "";
        String estisql = "";
        if (isAll) {
            sql = "select arap_termitem.money_bal, ar_recitem.pk_currtype,arap_termitem.expiredate ,ar_recitem.customer,ar_recitem.pk_billtype,ar_recitem.billno,ar_recitem.billdate,ar_recitem.rowno,ar_recitem.so_ordertype,ar_recitem.so_transtype,ar_recitem.productline, ar_recitem.ordercubasdoc,arap_termitem.pk_termitem,ar_recitem.pk_recbill " + para.getOtherSelectSql(true, false) + " from ar_recitem,arap_termitem where  ar_recitem.pk_recitem = arap_termitem.pk_item and arap_termitem.dr = 0   and ar_recitem.dr = 0  " + para.getWhereSql(true, false, isAll);
            estisql = "SELECT  arap_termitem.money_bal,   ar_estirecitem.pk_currtype, arap_termitem.expiredate,ar_estirecitem.customer,ar_estirecitem.pk_billtype,ar_estirecitem.billno,ar_estirecitem.billdate,ar_estirecitem.rowno,ar_estirecitem.so_ordertype,ar_estirecitem.so_transtype,ar_estirecitem.productline, ar_estirecitem.ordercubasdoc,arap_termitem.pk_termitem,ar_estirecitem.pk_estirecbill " + para.getOtherSelectSql(true, true) + " from ar_estirecitem, arap_termitem WHERE  ar_estirecitem.pk_estirecitem = arap_termitem.pk_item     and arap_termitem.dr  = 0     and ar_estirecitem.dr     = 0 " + para.getWhereSql(true, true, isAll);
        } else {
            sql = "select sum(arap_termitem.money_bal), ar_recitem.pk_currtype,min(arap_termitem.expiredate) " + para.getOtherSelectSql(true, false) + " from ar_recitem,arap_termitem where  ar_recitem.pk_recitem = arap_termitem.pk_item and arap_termitem.dr = 0   and ar_recitem.dr = 0  " + para.getWhereSql(true, false, isAll);
            estisql = "SELECT   sum(arap_termitem.money_bal),   ar_estirecitem.pk_currtype,  min(arap_termitem.expiredate) " + para.getOtherSelectSql(true, true) + " from ar_estirecitem, arap_termitem WHERE  ar_estirecitem.pk_estirecitem = arap_termitem.pk_item     and arap_termitem.dr  = 0     and ar_estirecitem.dr     = 0 " + para.getWhereSql(true, true, isAll);
        }
        ArrayList val = null;
        try {
            val = (ArrayList)this.getBaseDAO().executeQuery(sql, this.getProcessor(para));
        }
        catch (DAOException e) {
            throw ExceptionHandler.handleException((Exception)((Object)e));
        }
        ArrayList estival = null;
        try {
            estival = (ArrayList)this.getBaseDAO().executeQuery(estisql, this.getProcessor(para));
        }
        catch (DAOException e) {
            throw ExceptionHandler.handleException((Exception)((Object)e));
        }
        if (para.getCombineKey() != null && para.getCombineKey().size() != 0) {
            val.addAll(estival);
            return val.toArray(new PeriodpaymentReturnVO[val.size()]);
        }
        if (null != estival && estival.size() > 0) {
            HashSet<String> pk_currtypes = new HashSet<String>();
            HashMap<String, PeriodpaymentReturnVO> map = new HashMap<String, PeriodpaymentReturnVO>();
            HashMap<String, PeriodpaymentReturnVO> estimap = new HashMap<String, PeriodpaymentReturnVO>();
            if (!isAll) {
                for (PeriodpaymentReturnVO vo : estival) {
                    estimap.put(vo.getCurrtype(), vo);
                    pk_currtypes.add(vo.getCurrtype());
                }
                for (PeriodpaymentReturnVO vo : val) {
                    map.put(vo.getCurrtype(), vo);
                    pk_currtypes.add(vo.getCurrtype());
                }
            }
            ArrayList<Object> newval = new ArrayList<Object>();
            if (isAll) {
                newval.addAll(estival);
                newval.addAll(val);
            } else {
                for (String pk_currtype : pk_currtypes) {
                    if (null == map.get(pk_currtype)) {
                        newval.add(estimap.get(pk_currtype));
                        continue;
                    }
                    if (null == estimap.get(pk_currtype)) {
                        newval.add(map.get(pk_currtype));
                        continue;
                    }
                    PeriodpaymentReturnVO vo = (PeriodpaymentReturnVO)map.get(pk_currtype);
                    vo.setMoney(MathTool.add((UFDouble)vo.getMoney(), (UFDouble)((PeriodpaymentReturnVO)estimap.get(pk_currtype)).getMoney()));
                    vo.setDate(vo.getDate().before(((PeriodpaymentReturnVO)estimap.get(pk_currtype)).getDate()) ? vo.getDate() : ((PeriodpaymentReturnVO)estimap.get(pk_currtype)).getDate());
                    newval.add(vo);
                }
            }
            return newval.toArray(new PeriodpaymentReturnVO[newval.size()]);
        }
        return val == null ? null : val.toArray(new PeriodpaymentReturnVO[val.size()]);
    }

    private ResultSetProcessor getProcessor(PeriodpaymentParaVO para) {
        if (null == this.processor) {
            this.processor = new ArGatherResultSetProcess();
        }
        ((ArGatherResultSetProcess)this.processor).setPara(para);
        return this.processor;
    }

    public BaseAggVO[] queryBillByTopBillKeys(String[] keys, IArapBilltypeInfo arapBilltypeInfo) {
        String inStr;
        try {
            inStr = SqlUtils.getInStr("top_billid", keys, true);
        }
        catch (SQLException e) {
            ExceptionHandler.consume((Throwable)e);
            return null;
        }
        return this.queryBillByTopKeys(keys, arapBilltypeInfo, inStr);
    }

    private BaseAggVO[] queryBillByTopKeys(String[] keys, IArapBilltypeInfo arapBilltypeInfo, String wheresql) {
        try {
            Collection items = this.getBaseDAO().retrieveByClause(arapBilltypeInfo.getItemvoClass(), wheresql + " and dr=0 ");
            Map<String, String> map = this.constructMap(items);
            HashSet<String> mapValuesSet = new HashSet<String>(map.values());
            Collection heads = MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByPKs(arapBilltypeInfo.getBillvoClass(), mapValuesSet.toArray(new String[0]), false);
            if (heads == null || heads.size() == 0) {
                return new BaseAggVO[0];
            }
            List<BaseAggVO> list = this.constructAggVO(items, heads, arapBilltypeInfo);
            return list.toArray(new BaseAggVO[0]);
        }
        catch (Exception e) {
            ExceptionHandler.consume((Throwable)e);
            return null;
        }
    }

    private List<BaseAggVO> constructAggVO(Collection<?> items, Collection<?> heads, IArapBilltypeInfo arapBilltypeInfo) {
        MapList maplist = new MapList();
        for (Object object : items) {
            maplist.put((Object)((BaseItemVO)object).getParentPK(), (Object)((BaseItemVO)object));
        }
        ArrayList<BaseAggVO> bills = new ArrayList<BaseAggVO>();
        for (Object object : heads) {
            BaseAggVO bill = null;
            try {
                bill = arapBilltypeInfo.getAggvoClass().newInstance();
            }
            catch (Exception e) {
                ExceptionHandler.consume((Throwable)e);
                continue;
            }
            bill.setParent((ISuperVO)((BaseBillVO)object));
            bill.setChildrenVO((CircularlyAccessibleValueObject[])maplist.get((Object)((BaseBillVO)object).getPrimaryKey()).toArray(new BaseItemVO[0]));
            bills.add(bill);
        }
        return bills;
    }

    private Map<String, String> constructMap(Collection<?> retrieves) {
        HashMap<String, String> map = new HashMap<String, String>();
        for (Object object : retrieves) {
            if (object instanceof BaseItemVO) {
                BaseItemVO item = (BaseItemVO)object;
                map.put(item.getPrimaryKey(), item.getParentPK());
                continue;
            }
            return map;
        }
        return map;
    }

    public BaseAggVO[] queryBillByTopItemKeys(String[] keys, IArapBilltypeInfo arapBilltypeInfo) {
        String fieldcode = "top_itemid";
        return this.queryBillByFieldcode(keys, arapBilltypeInfo, fieldcode);
    }

    private BaseAggVO[] queryBillByFieldcode(String[] keys, IArapBilltypeInfo arapBilltypeInfo, String fieldcode) {
        try {
            String inStr = SqlUtils.getInStr(fieldcode, keys, true);
            return this.queryBillByTopKeys(keys, arapBilltypeInfo, inStr);
        }
        catch (SQLException e) {
            ExceptionHandler.consume((Throwable)e);
            return null;
        }
    }

    public BaseAggVO[] queryBillBySrcBillKeys(String[] keys, IArapBilltypeInfo arapBilltypeInfo) {
        String fieldcode = "src_billid";
        return this.queryBillByFieldcode(keys, arapBilltypeInfo, fieldcode);
    }

    public BaseAggVO[] queryBillBySrcItemKeys(String[] keys, IArapBilltypeInfo arapBilltypeInfo) {
        String fieldcode = "src_itemid";
        return this.queryBillByFieldcode(keys, arapBilltypeInfo, fieldcode);
    }

    protected <T extends BaseAggVO> Collection<T> queryBillVO(Class<T> clazz, String whereString) throws MetaDataException {
        return MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByCond(clazz, whereString, true, false);
    }

    public int doReCaculateByDetail(String srctable, ReCaculateARParaVO vo, String intotable) throws BusinessException {
        PersistenceManager pm = null;
        try {
            int count;
            pm = PersistenceManager.getInstance((String)InvocationInfoProxy.getInstance().getUserDataSource());
            pm.getJdbcSession().addBatch(vo.getSqlByDetail(srctable, 1, intotable));
            pm.getJdbcSession().addBatch(vo.getSqlByDetail(srctable, 3, intotable));
            pm.getJdbcSession().addBatch(vo.getSqlByDetail(srctable, 0, intotable));
            pm.getJdbcSession().addBatch(vo.getSqlByDetail(srctable, 2, intotable));
            int n = count = pm.getJdbcSession().executeBatch();
            return n;
        }
        catch (Exception e) {
            throw ExceptionHandler.handleException(this.getClass(), (Exception)e);
        }
        finally {
            if (pm != null) {
                pm.release();
            }
        }
    }

    public BaseAggVO[] quereyVoByBilltypeAndBillNO(String[] billtype, String[] billno) throws DAOException {
        if (!(null != billtype && billtype.length != 0 || null != billno && billno.length != 0)) {
            return null;
        }
        BaseDAO dao = new BaseDAO();
        Class<ReceivableBillVO> clazz = null;
        Object vos = null;
        ArrayList<BaseAggVO> bills = new ArrayList<BaseAggVO>();
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("ys", "F0");
        map.put("yf", "F1");
        map.put("sk", "F2");
        map.put("fk", "F3");
        SqlBuilder condition = new SqlBuilder();
        for (int i = 0; i < billtype.length; ++i) {
            if (map.get(billtype[i]) == null) continue;
            if ("F0".equals(map.get(billtype[i]))) {
                clazz = ReceivableBillVO.class;
            } else if ("F1".equals(map.get(billtype[i]))) {
                clazz = PayableBillVO.class;
            } else if ("F2".equals(map.get(billtype[i]))) {
                clazz = GatheringBillVO.class;
            } else if ("F3".equals(map.get(billtype[i]))) {
                clazz = PayBillVO.class;
            }
            condition.append(" dr=0 and");
            condition.append("billno", billno);
            Collection retvos = dao.retrieveByClause(clazz, condition.toString());
            bills.add((BaseAggVO)((Object)retvos));
        }
        if (bills.size() == 0) {
            return null;
        }
        return bills.toArray(new BaseAggVO[0]);
    }

    public ArapBusiDataVO[] queryAllBusidataVO(SuperVO[] bills) throws BusinessException {
        String[] keys = new String[bills.length];
        for (int i = 0; i < bills.length; ++i) {
            keys[i] = ((ArapBusiDataVO)bills[i]).getPk_bill();
        }
        String[] queryFields = new String[]{"pk_busidata", "billno", "pk_billtype", "pk_bill"};
        return this.queryBusiDataByBillKeys(keys, queryFields);
    }

    public List<String> queryBusiDataKeysByBillKeys(String[] keys) throws BusinessException {
        if (ArrayUtils.isEmpty((Object[])keys)) {
            return null;
        }
        ArapBusiDataVO[] busidataVOs = this.queryBusiDataByBillKeys(keys, new String[]{"pk_busidata"});
        if (ArrayUtils.isEmpty((Object[])busidataVOs)) {
            return null;
        }
        ArrayList<String> pkList = new ArrayList<String>();
        for (ArapBusiDataVO busidataVO : busidataVOs) {
            pkList.add(busidataVO.getPk_busidata());
        }
        return pkList;
    }

    public ArapBusiDataVO[] queryBusiDataByBillKeys(String[] keys, String[] queryFields) throws BusinessException {
        List result = null;
        try {
            String condition = SqlUtils.getInStr("pk_bill", keys, true);
            result = ArrayUtils.isEmpty((Object[])queryFields) ? (List)this.getBaseDAO().retrieveByClause(ArapBusiDataVO.class, condition) : (List)this.getBaseDAO().retrieveByClause(ArapBusiDataVO.class, condition, queryFields);
        }
        catch (SQLException e) {
            throw new BusinessException((Throwable)e);
        }
        return Collections.isEmpty(result) ? null : result.toArray(new ArapBusiDataVO[0]);
    }

    public AggregatedValueObject[] recoveryDeleteBills(AggregatedValueObject[] bills) throws BusinessException {
        if (ArrayUtils.isEmpty((Object[])bills)) {
            return null;
        }
        String[] keys = new String[bills.length];
        for (int i = 0; i < bills.length; ++i) {
            keys[i] = bills[i].getParentVO().getPrimaryKey();
        }
        String billType = (String)bills[0].getParentVO().getAttributeValue("pk_billtype");
        IArapBilltypeInfo billtypeInfo = ArapBillTypeInfo.getInstance(billType);
        Function<String, String> sqlBuildFuc = tableName -> {
            StringBuilder sql = new StringBuilder();
            sql.append("UPDATE ");
            sql.append((String)tableName);
            sql.append(" SET ");
            sql.append("dr");
            sql.append(" = 0");
            sql.append(" WHERE ");
            try {
                sql.append(SqlUtils.getInStr(billtypeInfo.getTablePrimaryKeyBill(), keys, true));
            }
            catch (SQLException e) {
                throw new RuntimeException(e);
            }
            return sql.toString();
        };
        try {
            String updateParentSql = sqlBuildFuc.apply(billtypeInfo.getTableNameBill());
            String updateChildSql = sqlBuildFuc.apply(billtypeInfo.getTableNameItem());
            this.getBaseDAO().executeUpdate(updateParentSql);
            this.getBaseDAO().executeUpdate(updateChildSql);
        }
        catch (Exception e) {
            throw new BusinessException((Throwable)e);
        }
        Collection vos = MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByPKs(bills[0].getClass(), keys, false);
        return vos.toArray(new AggregatedValueObject[0]);
    }

    public RecpaytypeVO[] queryRecpaytypeVOByPK(String[] pkrecpaytype, String[] queryFields) throws BusinessException {
        List result = null;
        try {
            String condition = SqlUtils.getInStr("pk_recpaytype", pkrecpaytype, true);
            result = ArrayUtils.isEmpty((Object[])queryFields) ? (List)this.getBaseDAO().retrieveByClause(RecpaytypeVO.class, condition) : (List)this.getBaseDAO().retrieveByClause(RecpaytypeVO.class, condition, queryFields);
        }
        catch (SQLException e) {
            throw new BusinessException((Throwable)e);
        }
        return Collections.isEmpty(result) ? null : result.toArray(new RecpaytypeVO[0]);
    }

    public SummaryVO[] getSummoryVOBypk(String[] pks) throws BusinessException {
        InSqlBatchCaller caller = new InSqlBatchCaller(pks);
        List list = null;
        try {
            list = (List)caller.execute(new IInSqlBatchCallBack(){
                private List<SummaryVO> list = new ArrayList<SummaryVO>();

                public Object doWithInSql(String inSql) throws BusinessException, SQLException {
                    Collection col = ArapBillDAO.this.getBaseDAO().retrieveByClause(SummaryVO.class, "pk_summary in " + inSql);
                    this.list.addAll(col);
                    return this.list;
                }
            });
        }
        catch (SQLException e) {
            Logger.error((Object)e.getMessage(), (Throwable)e);
            throw new BusinessException(e.getMessage());
        }
        return list == null ? null : list.toArray(new SummaryVO[0]);
    }

    public List<String> getBusiActionCode(String pk_group, String appcode, String cuserid) throws BusinessException {
        String sql = "SELECT DISTINCT busi.code FROM sm_resp_app respapp LEFT JOIN sm_appbusiactivereg busi ON respapp.pk_app = busi.pk_busiactive LEFT JOIN sm_appbusi_btn busibtn ON busi.pk_busiactive = busibtn.pk_busiactive LEFT JOIN sm_appregister app ON busi.parent_id = app.pk_appregister WHERE type = 1 AND btncode IS NOT NULL AND app.code = {appcode?} AND pk_responsibility IN ( SELECT DISTINCT ruleid FROM sm_perm_func WHERE subjectid IN ( ( SELECT pk_role FROM sm_user_role WHERE cuserid = {cuserid?})))";
        SqlWrapper wrapper = new SqlWrapper(sql);
        wrapper.bind("appcode", (Object)appcode);
        wrapper.bind("cuserid", (Object)cuserid);
        List btncodes = (List)this.getBaseDAO().executeQuery(wrapper.getSql(), wrapper.getSqlParameter(), (ResultSetProcessor)new ColumnListProcessor());
        return btncodes;
    }

    public List<String> getRedBillTopbillid(String billType, String[] topids) throws BusinessException {
        String mainTableName = ArapBillType2TableMapping.getParentTable(billType);
        String chilTableName = ArapBillType2TableMapping.getChildrenTable(billType);
        String mainTablePK = ArapBillType2TableMapping.getParentTablePK(billType).split("\\.")[1];
        SqlBuilder sql = new SqlBuilder();
        sql.append(" select b.tbillid from ");
        sql.append(chilTableName);
        sql.append(" a,");
        sql.append(" (select t.top_billid as tbillid, t.");
        sql.append(mainTablePK);
        sql.append(" as pk from ");
        sql.append(chilTableName);
        sql.append("  t,");
        sql.append(mainTableName);
        sql.append("  n ");
        sql.append(" where t.");
        sql.append(mainTablePK);
        sql.append(" = n.");
        sql.append(mainTablePK);
        sql.append(" and ");
        sql.append("t.top_billid", topids);
        sql.append(" and n.isreded = 'Y') b ");
        sql.append(" where  a.top_billid = b.pk ");
        sql.append(" and a.occupationmny<>0 ");
        List topbillidList = (List)this.getBaseDAO().executeQuery(sql.toString(), (ResultSetProcessor)new ColumnListProcessor());
        return CollectionUtils.isEmpty((Collection)topbillidList) ? null : topbillidList;
    }

    public Map<Integer, String> getTranstypeApps(String transtypeOrbilltype) {
        String sql = "select b.publishappid,a.code,b.pagecode,b.sence from pub_publishapp b,sm_appregister a where b.publishappid=a.pk_appregister and  b.pk_billtypecode=? and b.pk_group=?  order by b.ts desc";
        SQLParameter para = new SQLParameter();
        para.addParam(transtypeOrbilltype);
        para.addParam(InvocationInfoProxy.getInstance().getGroupId());
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        try {
            ArrayList vos;
            Object obj = this.getBaseDAO().executeQuery(sql, para, (ResultSetProcessor)new BeanListProcessor(PublishAppVO.class));
            if (obj != null && (vos = (ArrayList)obj).size() > 0) {
                ArrayList list = new ArrayList();
                for (int i = 0; i < vos.size(); ++i) {
                    map.put(((PublishAppVO)vos.get(i)).getSence(), ((PublishAppVO)vos.get(i)).getCode());
                }
                return map;
            }
        }
        catch (BusinessException e) {
            Logger.error((Object)e.getMessage(), (Throwable)e);
        }
        return null;
    }

    public Map<String, String> getTaxCodeByMaterial(String[] materials, Map<String, String[]> parmMap) throws DAOException {
        if (ArrayUtils.isEmpty((Object[])materials)) {
            return null;
        }
        SqlBuilder condition = new SqlBuilder();
        for (Map.Entry<String, String[]> parm : parmMap.entrySet()) {
            if ("taxcountryid".equals(parm.getKey()) && parm.getValue() != null && parm.getValue()[0] != null) {
                condition.append(" and ");
                condition.append("t.reptaxcountry", parm.getValue());
                continue;
            }
            if ("rececountryid".equals(parm.getKey()) && parm.getValue() != null && parm.getValue()[0] != null) {
                condition.append(" and ");
                condition.append("t.cuscountry", parm.getValue());
                continue;
            }
            if (!"sendcountryid".equals(parm.getKey()) || parm.getValue() == null || parm.getValue()[0] == null) continue;
            condition.append(" and ");
            condition.append("t.supcountry", parm.getValue());
        }
        SqlBuilder sql = new SqlBuilder();
        sql.append(" select m.pk_material,t.pk_taxcode from bd_taxcode t left join bd_material m on t.mattaxes = m.pk_mattaxes where ");
        sql.append("m.pk_material", materials);
        sql.append(" and t.enablestate =  2");
        sql.append((Object)condition);
        Map map = new HashMap();
        map = (Map)this.getBaseDAO().executeQuery(sql.toString(), ArapBillPubUtil.getResultSetProcessorMap());
        return map != null && map.size() != 0 ? map : null;
    }

    public List<String> getArapBillTypes() throws DAOException {
        SqlBuilder sql = new SqlBuilder();
        sql.append(" select p.pk_billtypecode from bd_billtype p where systemcode in ('AR','AP') ");
        List billtypes = (List)this.getBaseDAO().executeQuery(sql.toString(), (ResultSetProcessor)new ColumnListProcessor());
        return billtypes;
    }

    public List<String> getEnableBusitype(String[] pk_busitypes) throws DAOException {
        SqlBuilder sql = new SqlBuilder();
        sql.append(" select b.pk_busitype from bd_busitype b where ");
        sql.append("b.pk_busitype", pk_busitypes);
        sql.append(" and b.validity =1 ");
        List billtypes = (List)this.getBaseDAO().executeQuery(sql.toString(), (ResultSetProcessor)new ColumnListProcessor());
        return billtypes;
    }

    public Map<String, Map<String, String>> getOrgInformation(String key, String code, String name) throws DAOException {
        SqlBuilder sql = new SqlBuilder();
        sql.append(" select code,name,");
        if ("pk_org".equals(key)) {
            sql.append("pk_org from org_orgs_v ");
        } else {
            sql.append("pk_vid from org_orgs ");
        }
        sql.append(" where  code = '");
        sql.append(code);
        sql.append("'  or  name = '");
        sql.append(name);
        sql.append("' order by vstartdate desc ");
        Map retMap = (Map)this.getBaseDAO().executeQuery(sql.toString(), ArapBillPubUtil.getResultSetProcessorDoubleMap());
        return retMap;
    }

    public Map<String, String> getOrgNamebyPks(String[] pkorgs) throws BusinessException {
        if (ArrayUtils.isEmpty((Object[])pkorgs)) {
            return new HashMap<String, String>();
        }
        SqlBuilder sql = new SqlBuilder();
        sql.append(" select pk_org , name from org_orgs where ");
        sql.append(SqlUtils.getInStr("pk_org", pkorgs));
        Map map = (Map)this.getBaseDAO().executeQuery(sql.toString(), ArapBillPubUtil.getResultSetProcessorMap());
        if (map == null || map != null && map.size() == 0) {
            return new HashMap<String, String>();
        }
        return map;
    }

    public List<String> getBusitypeByCodeOrName(String[] codeOrName) throws DAOException {
        SqlBuilder sql = new SqlBuilder();
        sql.append(" select b.pk_busitype from bd_busitype b where ");
        sql.append("b.businame", codeOrName);
        sql.append(" or ");
        sql.append("b.busicode", codeOrName);
        sql.append(" and b.validity =1 ");
        List billtypes = (List)this.getBaseDAO().executeQuery(sql.toString(), (ResultSetProcessor)new ColumnListProcessor());
        return billtypes;
    }

    public String getTempTableSql(String[] fields, String[] pks, Integer[] types) throws SQLException {
        StringBuffer sql = new StringBuffer();
        String tableName = "tmp_table_forIn" + fields[0];
        String createTmpTable = this.createTmpTable(tableName, fields, types);
        StringBuffer tempSql = new StringBuffer();
        int len = pks.length;
        if (1 == SqlBuilder.getDatabaseType()) {
            tempSql.append(" insert all ");
            for (int i = 0; i < len; ++i) {
                tempSql.append(" into ");
                tempSql.append(tableName);
                tempSql.append("(" + fields[0] + ") values (");
                tempSql.append("'" + pks[i] + "'");
                tempSql.append(")");
            }
            tempSql.append("select * from dual");
        } else {
            tempSql.append(" insert into " + tableName);
            tempSql.append(" (" + fields[0] + ")");
            tempSql.append(" values");
            int index = 0;
            for (String pk : pks) {
                tempSql.append("('" + pk + "')");
                if (index != len - 1) {
                    tempSql.append(",");
                }
                ++index;
            }
        }
        try {
            new FipubSqlExecuter().executeUpdate(tempSql.toString());
        }
        catch (DAOException e) {
            throw new SQLException(e.getMessage());
        }
        sql.append("select * from " + createTmpTable);
        sql.append(" where " + tableName + "." + fields[0]);
        return sql.toString();
    }

    private String createTmpTable(String tableName, String[] colNames, Integer[] colTypes) throws SQLException {
        String[] types = new String[colTypes.length];
        block5: for (int i = 0; i < colTypes.length; ++i) {
            switch (colTypes[i]) {
                case 12: {
                    if (" brief".equals(colNames[i])) {
                        types[i] = "varchar(300)";
                        continue block5;
                    }
                    types[i] = "varchar(100)";
                    continue block5;
                }
                case 3: {
                    types[i] = "decimal(28, 8)";
                    continue block5;
                }
                case 4: {
                    types[i] = "integer";
                    continue block5;
                }
            }
        }
        return this.createTmpTable(tableName, colNames, types);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private String createTmpTable(String tableName, String[] colNames, String[] colTypes) throws SQLException {
        Connection conn = null;
        Statement stmt1 = null;
        Statement stmt2 = null;
        try {
            conn = ConnectionFactory.getConnection();
            stmt1 = conn.createStatement();
            StringBuffer colsBuffer = new StringBuffer();
            for (int i = 0; i < colTypes.length; ++i) {
                colsBuffer.append(colNames[i]).append(" ").append(colTypes[i]).append(", ");
            }
            String cols = colsBuffer.toString().substring(0, colsBuffer.length() - 2);
            if (ArapBillDAO.isTempTableOut(stmt1, colNames, tableName = new TempTable().createTempTable(conn, tableName, cols, null))) {
                String dropSql = "drop table " + tableName;
                stmt2 = conn.createStatement();
                stmt2.execute(dropSql);
                tableName = new TempTable().createTempTable(conn, tableName, cols, null);
            }
        }
        finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            }
            catch (Exception e) {
                Logger.error((Object)e.getMessage(), (Throwable)e);
            }
            try {
                if (stmt1 != null) {
                    stmt1.close();
                }
            }
            catch (Exception e) {
                Logger.error((Object)e.getMessage(), (Throwable)e);
            }
            try {
                if (stmt2 != null) {
                    stmt2.close();
                }
            }
            catch (Exception e) {
                Logger.error((Object)e.getMessage(), (Throwable)e);
            }
        }
        return tableName;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static boolean isTempTableOut(Statement stmt, String[] colNames, String tableName) {
        int j;
        StringBuffer selectSql = new StringBuffer("select ");
        for (j = 0; j < colNames.length - 1; ++j) {
            selectSql.append(colNames[j]).append(", ");
        }
        selectSql.append(colNames[j]);
        selectSql.append(" from ").append(tableName);
        try (ResultSet resultSet = stmt.executeQuery(selectSql.toString());){
            if (resultSet.getMetaData().getColumnCount() == colNames.length) {
                boolean bl2 = false;
                return bl2;
            }
            boolean bl = true;
            return bl;
        }
        catch (Exception e) {
            return true;
        }
    }

    public String getAppCodeByAppid(String appid) throws DAOException {
        SqlBuilder selectSql = new SqlBuilder();
        selectSql.append("select a.code from sm_appregister a where ");
        selectSql.append("a.pk_appregister", appid);
        List appcodes = (List)this.getBaseDAO().executeQuery(selectSql.toString(), (ResultSetProcessor)new ColumnListProcessor());
        return CollectionUtils.isEmpty((Collection)appcodes) ? null : (String)appcodes.get(0);
    }

    public Map<String, String> getBilltypeAndTranstypeBybusitype(List<String> pk_busitype, String[] src_billtype) throws DAOException {
        if (CollectionUtils.isEmpty(pk_busitype)) {
            return null;
        }
        SqlBuilder selectSql = new SqlBuilder();
        selectSql.append("select distinct transtype,pk_billtype from pub_billbusiness where ");
        selectSql.append("pk_businesstype", pk_busitype.toArray(new String[0]));
        selectSql.append(" and ");
        selectSql.append("pk_billtype", src_billtype);
        Map map = (Map)this.getBaseDAO().executeQuery(selectSql.toString(), ArapBillPubUtil.getResultSetProcessorMap());
        return map;
    }

    public List<String> getPkBusinessByBtAndTT(String[] billtypes, String[] tradetypes) throws DAOException {
        if (ArrayUtils.isEmpty((Object[])billtypes) && ArrayUtils.isEmpty((Object[])tradetypes)) {
            return null;
        }
        SqlBuilder selectSql = new SqlBuilder();
        selectSql.append(" select distinct pk_businesstype from pub_billbusiness where ");
        selectSql.append("pk_billtype", billtypes);
        selectSql.append(" and ");
        selectSql.append("transtype", tradetypes);
        List pkbusitypes = (List)this.getBaseDAO().executeQuery(selectSql.toString(), (ResultSetProcessor)new ColumnListProcessor());
        return pkbusitypes;
    }

    public Map<String, Map<String, Map<String, String>>> getTopSrcbillTypeByitemPks(String arapbilltype, String[] items) throws DAOException, SQLException {
        if (StringUtils.isEmpty((CharSequence)arapbilltype) || ArrayUtils.isEmpty((Object[])items)) {
            return null;
        }
        List<String> araplist = Arrays.asList("F0", "F1", "F2", "F3");
        if (!araplist.contains(arapbilltype)) {
            return null;
        }
        IArapBilltypeInfo billtypevo = ArapBillTypeInfo.getInstance(arapbilltype);
        SqlBuilder selectSql = new SqlBuilder();
        String pkitem = billtypevo.getTablePrimaryKeyItem();
        String tableitem = billtypevo.getTableNameItem();
        selectSql.append("select a.top_billtype,a.top_billid,a.top_itemid,a.src_billtype,a.src_billid,a.src_itemid,b.");
        selectSql.append(pkitem);
        selectSql.append(" from ");
        selectSql.append(tableitem + " a ");
        selectSql.append(" join ");
        selectSql.append(tableitem + " b ");
        selectSql.append(" on ");
        selectSql.append("b.top_billtype", arapbilltype);
        selectSql.append(" and ");
        selectSql.append(SqlUtils.getInStr(" b." + pkitem, items, true));
        selectSql.append(" and ");
        selectSql.append(" a." + pkitem + " = b.top_itemid ");
        Map retmap = (Map)this.getBaseDAO().executeQuery(selectSql.toString(), ArapBillPubUtil.getProcessorThreeMap());
        return retmap;
    }

    public List<String> getTaxrateByTaxcode(List<String> taxcode) throws DAOException {
        SqlBuilder selectSql = new SqlBuilder();
        selectSql.append(" select taxrate from bd_taxrate where pk_taxcode in (select pk_taxcode from bd_taxcode  where ");
        selectSql.append("code", taxcode.toArray(new String[0]));
        selectSql.append(" or ");
        selectSql.append("description", taxcode.toArray(new String[0]));
        selectSql.append(" or ");
        selectSql.append("pk_taxcode", taxcode.toArray(new String[0]));
        selectSql.append(")");
        List query = (List)this.getBaseDAO().executeQuery(selectSql.toString(), (ResultSetProcessor)new ColumnListProcessor());
        return CollectionUtils.isEmpty((Collection)query) ? null : query;
    }

    public void updatePrepaybyTopItem(String billtype, String[] topItems) throws DAOException {
        if (StringUtils.isEmpty((CharSequence)billtype) || ArrayUtils.isEmpty((Object[])topItems) || !"F2".equals(billtype) && !"F3".equals(billtype)) {
            return;
        }
        IArapBilltypeInfo billtypevo = ArapBillTypeInfo.getInstance(billtype);
        String chilName = billtypevo.getTableNameItem();
        String chilpk = billtypevo.getTablePrimaryKeyItem();
        SqlBuilder sql = new SqlBuilder();
        sql.append("select b.t_itemid from ");
        sql.append(chilName + " a,");
        sql.append("arap_billmap b where ");
        sql.append("a." + chilpk, topItems);
        sql.append(" and ");
        sql.append(" a." + chilpk + " = b.s_itemid and a.prepay = '1';");
        List list = (List)this.getBaseDAO().executeQuery(sql.toString(), (ResultSetProcessor)new ColumnListProcessor());
        if (CollectionUtils.isEmpty((Collection)list)) {
            return;
        }
        SqlBuilder updatesql = new SqlBuilder();
        updatesql.append("update ");
        updatesql.append(chilName);
        updatesql.append(" set prepay = '1'");
        updatesql.append(" where ");
        updatesql.append(chilpk, list.toArray(new String[0]));
        this.getBaseDAO().executeUpdate(updatesql.toString());
    }

    public List<String> getTranstypecodeFilterLockandDel(String[] transtype, String pk_group) throws DAOException {
        if (ArrayUtils.isEmpty((Object[])transtype) || pk_group == null) {
            return new ArrayList<String>();
        }
        SqlBuilder sql = new SqlBuilder();
        sql.append(" select pk_billtypecode from bd_billtype where parentBilltype in (");
        sql.append(" select parentBilltype from bd_billtype where ");
        sql.append("pk_billtypecode", transtype);
        sql.append(") and isLock = 'N' ");
        sql.append(" and ");
        sql.append("pk_group", pk_group);
        sql.append(" and isnull(dr,'0')<>1 order by pk_billtypecode ");
        List transtypes = (List)this.getBaseDAO().executeQuery(sql.toString(), (ResultSetProcessor)new ColumnListProcessor());
        return transtypes;
    }

    public Map<String, String> getProvisionfreq(String[] pk_orgs, String pk_group) throws DAOException {
        SqlBuilder sql = new SqlBuilder();
        sql.append(" select a.pk_org, a.provisionfreq from arap_bdprovisionrule a left join arap_bdprovisionrule_d b on a.pk_bdprovisionrule = b.pk_bdprovisionrule where ");
        sql.append("(");
        sql.append("a.pk_org", pk_orgs);
        sql.append(" or (");
        sql.append("a.pk_group", pk_group);
        sql.append(" and ");
        sql.append("a.pk_org='~' ))");
        sql.append(" and b.enablestate = 2 ");
        Map ret = (Map)this.getBaseDAO().executeQuery(sql.toString(), ArapBillPubUtil.getResultSetProcessorMap());
        return ret;
    }

    public Map<String, String> getCanRedBackItems(String[] topitems, String billtype) throws DAOException {
        if (ArrayUtils.isEmpty((Object[])topitems) || billtype == null) {
            return null;
        }
        IArapBilltypeInfo billtypevo = ArapBillTypeInfo.getInstance(billtype);
        String pkitem = billtypevo.getTablePrimaryKeyItem();
        String tableitem = billtypevo.getTableNameItem();
        SqlBuilder sql = new SqlBuilder();
        sql.append("select " + pkitem + " ,occupationmny from " + tableitem + " where ");
        sql.append(pkitem, topitems);
        sql.append(" and occupationmny<>0 ");
        Map ret = (Map)this.getBaseDAO().executeQuery(sql.toString(), ArapBillPubUtil.getResultSetProcessorMap());
        return ret;
    }

    public Map<String, List<String>> getBillFieldBypk(String[] pks, String billtype, List<String> queryField, List<String> sqlField) throws SQLException, DAOException {
        Map ret;
        if (CollectionUtils.isEmpty(queryField) || ArrayUtils.isEmpty((Object[])pks) || StringUtil.isEmpty(billtype)) {
            return null;
        }
        IArapBilltypeInfo billtypevo = ArapBillTypeInfo.getInstance(billtype);
        int len = queryField.size();
        SqlBuilder sql = new SqlBuilder();
        sql.append(" select " + billtypevo.getTablePrimaryKeyItem() + ",");
        sql.append(String.join((CharSequence)",", queryField));
        sql.append(" from ");
        sql.append(billtypevo.getTableNameItem());
        sql.append(" where ");
        sql.append(SqlUtils.getInStr(billtypevo.getTablePrimaryKeyItem(), pks, true));
        if (!CollectionUtils.isEmpty(sqlField)) {
            String headSql = sqlField.get(0);
            String bodySql = null;
            if (sqlField.size() > 1) {
                bodySql = sqlField.get(1);
            }
            if (!StringUtil.isEmptyWithTrim(headSql)) {
                SqlBuilder head = new SqlBuilder();
                head.append(" select ");
                head.append(billtypevo.getTablePrimaryKeyBill());
                head.append(" from ");
                head.append(billtypevo.getTableNameBill());
                head.append(" where ");
                head.append(headSql);
                sql.append(" and ");
                sql.append(billtypevo.getTablePrimaryKeyBill());
                sql.append(" in (" + head + ")");
            }
            if (!StringUtil.isEmptyWithTrim(bodySql)) {
                sql.append(" and " + bodySql);
            }
        }
        if ((ret = (Map)this.getBaseDAO().executeQuery(sql.toString(), ArapBillPubUtil.getResultMapListProcessor(len))) == null || ret != null && ret.isEmpty()) {
            return null;
        }
        return ret;
    }

    public Map<String, Map<String, String>> getObjectValueByOrg(String[] pk_orgs) throws DAOException {
        if (ArrayUtils.isEmpty((Object[])pk_orgs)) {
            return null;
        }
        SqlBuilder sql = new SqlBuilder();
        List<String> tableName = Arrays.asList("bd_customer-pk_customer", "bd_supplier-pk_supplier", "org_dept-pk_dept", "org_admin_dept-pk_busirole");
        HashMap<String, Map<String, String>> typePkMap = new HashMap<String, Map<String, String>>();
        for (String table : tableName) {
            String tName = table.split("-")[0];
            sql.append(" select ");
            sql.append(table.split("-")[1]);
            sql.append(",pk_org from ");
            sql.append(tName);
            sql.append(" where ");
            sql.append("pk_org", pk_orgs);
            sql.append(" or pk_org='");
            sql.append(InvocationInfoProxy.getInstance().getGroupId());
            sql.append("'");
            sql.append(" and enablestate in (2) ");
            Map map = (Map)this.getBaseDAO().executeQuery(sql.toString().toString(), ArapBillPubUtil.getResultSetProcessorMap());
            String key = null;
            if ("bd_customer".equals(tName)) {
                key = "0";
            } else if ("bd_supplier".equals(tName)) {
                key = "1";
            } else if ("org_dept".equals(tName)) {
                key = "2";
            } else if ("org_admin_dept".equals(tName)) {
                key = "3";
            }
            typePkMap.put(key, map);
            sql.reset();
        }
        return typePkMap;
    }

    public List<AggAgiotageVO> getAgioVOByVerifyPks(String[] pks) throws SQLException, DAOException, MetaDataException {
        if (ArrayUtils.isEmpty((Object[])pks)) {
            return null;
        }
        SqlBuilder sql = new SqlBuilder();
        sql.append(" select pk_agiotage from arap_agiotage where ");
        sql.append(" dealno in( ");
        sql.append(" select busino from arap_verifydetail where ");
        sql.append(SqlUtils.getInStr("pk_verify", pks, true));
        sql.append(")");
        List agiopks = (List)this.getBaseDAO().executeQuery(sql.toString(), (ResultSetProcessor)new ColumnListProcessor());
        if (CollectionUtils.isEmpty((Collection)agiopks)) {
            return null;
        }
        Collection ncObjects = MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByCond(AggAgiotageVO.class, SqlUtils.getInStr("pk_agiotage", agiopks.toArray(new String[0]), true), false);
        if (CollectionUtils.isEmpty((Collection)ncObjects)) {
            return null;
        }
        Class<?> clazz = ncObjects.iterator().next().getClass();
        ArrayList<AggAgiotageVO> ret = new ArrayList<AggAgiotageVO>();
        if (clazz.equals(AggAgiotageVO.class)) {
            for (Object vo : ncObjects) {
                ret.add((AggAgiotageVO)vo);
            }
        }
        return ret;
    }

    public Map<String, Map<String, Set<String>>> getPayableItemPkFromPU() throws DAOException {
        String sql = "select top_billtype,top_itemid,pk_payableitem from ap_payableitem where top_billtype in ('25','45') and dr=0 ";
        return (Map)this.getBaseDAO().executeQuery(sql, ArapBillPubUtil.getResultMapSetProcessorMap());
    }

    private BaseDAO getBaseDAO() {
        if (null == this.baseDao) {
            this.baseDao = new BaseDAO();
        }
        return this.baseDao;
    }
}

