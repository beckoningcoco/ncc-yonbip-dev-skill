/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.bill.ArapBillBO
 *  nc.bs.arap.bill.ArapBillDAO
 *  nc.bs.arap.util.ArapPermissionUtils
 *  nc.bs.arap.util.SqlUtils
 *  nc.bs.dao.DAOException
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.logging.Logger
 *  nc.itf.uap.IUAPQueryBS
 *  nc.jdbc.framework.processor.ResultSetProcessor
 *  nc.md.persist.framework.MDPersistenceService
 *  nc.pubitf.ftpub.recostitem.pub.IRecostitemForPubService
 *  nc.ui.querytemplate.querytree.IQueryScheme
 *  nc.vo.arap.basebill.BaseAggVO
 *  nc.vo.arap.basebill.BaseItemVO
 *  nc.vo.arap.pub.BillEnumCollection$InureSign
 *  nc.vo.arap.pub.IArapBilltypeInfo
 *  nc.vo.fi.pub.SqlUtils
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.fipub.utils.SqlBuilder
 *  nc.vo.ftpub.adjaccount.entity.UserObjForAdjaccount
 *  nc.vo.ftpub.recostitem.entity.RecostItemVO
 *  nc.vo.ftpub.res.enumeration.FeeBusiType
 *  nc.vo.jcom.lang.StringUtil
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pubapp.pagination.PaginationQueryVO
 *  nc.vo.pubapp.pattern.exception.ExceptionUtils
 *  nc.vo.pubapp.query2.sql.process.QuerySchemeProcessor
 *  nc.vo.scmpub.res.billtype.ETBillType
 *  nc.vo.scmpub.res.billtype.ITBillType
 *  org.apache.commons.collections4.CollectionUtils
 *  org.apache.commons.lang3.StringUtils
 */
package nc.impl.arap.base;

import java.lang.reflect.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import nc.bs.arap.bill.ArapBillBO;
import nc.bs.arap.bill.ArapBillDAO;
import nc.bs.arap.util.ArapPermissionUtils;
import nc.bs.arap.util.SqlUtils;
import nc.bs.dao.DAOException;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.framework.common.NCLocator;
import nc.bs.logging.Logger;
import nc.itf.uap.IUAPQueryBS;
import nc.jdbc.framework.processor.ResultSetProcessor;
import nc.md.persist.framework.MDPersistenceService;
import nc.pubitf.ftpub.recostitem.pub.IRecostitemForPubService;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.arap.pub.IArapBilltypeInfo;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.fipub.utils.SqlBuilder;
import nc.vo.ftpub.adjaccount.entity.UserObjForAdjaccount;
import nc.vo.ftpub.recostitem.entity.RecostItemVO;
import nc.vo.ftpub.res.enumeration.FeeBusiType;
import nc.vo.jcom.lang.StringUtil;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.BusinessException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pubapp.pagination.PaginationQueryVO;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.vo.pubapp.query2.sql.process.QuerySchemeProcessor;
import nc.vo.scmpub.res.billtype.ETBillType;
import nc.vo.scmpub.res.billtype.ITBillType;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

public abstract class ArapBillQueryServiceImpl<T extends BaseAggVO> {
    protected abstract IArapBilltypeInfo getArapBilltypeInfo();

    protected String createSql(IQueryScheme queryScheme) throws BusinessException {
        QuerySchemeProcessor qrySchemeProcessor = new QuerySchemeProcessor(queryScheme);
        String[] pk_orgs = qrySchemeProcessor.getQueryCondition("pk_org").getValues();
        String srcbilltype = this.getArapBilltypeInfo().getCode();
        SqlBuilder h_sql = new SqlBuilder();
        String mainTableAlias = qrySchemeProcessor.getMainTableAlias();
        h_sql.append("select distinct(" + mainTableAlias + "." + this.getArapBilltypeInfo().getTablePrimaryKeyBill() + ")");
        h_sql.append(qrySchemeProcessor.getFinalFromWhere());
        h_sql.append(" and " + this.getArapBilltypeInfo().getTableNameBill() + ".effectstatus", BillEnumCollection.InureSign.OKINURE.VALUE);
        h_sql.append(" and " + this.getArapBilltypeInfo().getTableNameBill() + ".pk_group", InvocationInfoProxy.getInstance().getGroupId());
        h_sql.append(" and isnull(" + this.getArapBilltypeInfo().getTableNameBill() + "." + "saga_frozen" + ",0)", 0);
        h_sql.append(ArapPermissionUtils.getOtherAttrDataPermissionSql((String)this.getArapBilltypeInfo().getCode()));
        List pk_busitypes = (List)queryScheme.get("pk_busitype");
        this.constructTranstype(pk_busitypes, h_sql, srcbilltype);
        SqlBuilder b_sql = new SqlBuilder();
        if (null != queryScheme.get("ISREDAR") && ((UFBoolean)queryScheme.get("ISREDAR")).booleanValue()) {
            b_sql.append("select (" + this.getArapBilltypeInfo().getTableNameItem() + "." + this.getArapBilltypeInfo().getTablePrimaryKeyItem() + ") from " + this.getArapBilltypeInfo().getTableNameItem() + " where pausetransact = 'N' and money_bal !=0 and occupationmny < 0 and objtype = 0 ");
        } else {
            b_sql.append("select (" + this.getArapBilltypeInfo().getTableNameItem() + "." + this.getArapBilltypeInfo().getTablePrimaryKeyItem() + ") from " + this.getArapBilltypeInfo().getTableNameItem() + " where pausetransact = 'N' and money_bal !=0 and occupationmny != 0 ");
        }
        Object userobj = queryScheme.get("EI");
        if (null != userobj) {
            this.appendSqlForEI(userobj, b_sql, this.getArapBilltypeInfo().getTableNameItem(), pk_orgs);
        }
        b_sql.append(" and " + this.getArapBilltypeInfo().getTablePrimaryKeyBill() + " in (");
        b_sql.append((Object)h_sql);
        b_sql.append(")");
        b_sql.append("order by ");
        b_sql.append(this.getArapBilltypeInfo().getTableNameItem() + ".rowno");
        return b_sql.toString();
    }

    private void constructTranstype(List<String> list, SqlBuilder h_sql, String srcbilltype) throws DAOException {
        if (srcbilltype == null) {
            return;
        }
        boolean flag = false;
        ArrayList transList = new ArrayList();
        ArapBillDAO dao = new ArapBillDAO();
        Map billtypeAndTranstypeMap = dao.getBilltypeAndTranstypeBybusitype(list, new String[]{srcbilltype});
        if (billtypeAndTranstypeMap == null || billtypeAndTranstypeMap != null && billtypeAndTranstypeMap.size() == 0) {
            return;
        }
        for (Map.Entry parm : billtypeAndTranstypeMap.entrySet()) {
            if (!srcbilltype.equals(parm.getValue())) continue;
            if (StringUtils.isNotEmpty((CharSequence)((CharSequence)parm.getKey()))) {
                transList.add(parm.getKey());
                continue;
            }
            flag = true;
            break;
        }
        if (CollectionUtils.isEmpty(transList) || flag) {
            return;
        }
        h_sql.append(" and ");
        h_sql.append(this.getArapBilltypeInfo().getTableNameBill() + "." + "pk_tradetype", transList.toArray(new String[0]));
    }

    private void appendSqlForEI(Object userobj, SqlBuilder b_sql, String bodyTableName, String[] pk_orgs) {
        UserObjForAdjaccount ituserObj = (UserObjForAdjaccount)userobj;
        String code = ituserObj.getCode();
        if (code.equals(ETBillType.CONTRACT.getCode())) {
            IRecostitemForPubService service = (IRecostitemForPubService)NCLocator.getInstance().lookup(IRecostitemForPubService.class);
            RecostItemVO[] revos = null;
            try {
                revos = service.queryRecostitemByBusitype(new int[]{FeeBusiType.AGENTGOODS.getType()}, pk_orgs);
            }
            catch (BusinessException e) {
                ExceptionUtils.wrappException((Exception)((Object)e));
                return;
            }
            HashSet<String> costSet = new HashSet<String>();
            for (RecostItemVO revo : revos) {
                costSet.add(revo.getCrecostitemid());
            }
            b_sql.append(" and ");
            b_sql.append(this.getArapBilltypeInfo().getTableNameItem() + ".top_billtype", new String[]{ETBillType.CONTRACT.getCode(), ETBillType.RECEIPT.getCode(), "36UA"});
            b_sql.append(" and " + bodyTableName + ".top_billid <> " + bodyTableName + ".top_itemid");
            b_sql.append(" and " + bodyTableName + ".contractno is not null");
            b_sql.append(" and ");
            if (null == revos || revos.length == 0) {
                b_sql.append("1=0");
            } else {
                b_sql.append(bodyTableName + ".pk_subjcode  ", costSet.toArray(new String[costSet.size()]));
            }
        } else if (code.equals(ITBillType.Contract.getCode())) {
            b_sql.append(" and ");
            b_sql.append(bodyTableName + ".top_billtype", new String[]{ITBillType.Contract.getCode(), "~"});
            b_sql.append(" and " + bodyTableName + ".so_org <> '~'");
        }
    }

    public PaginationQueryVO queryPaginationQueryVO(String condition, Integer billcount) throws BusinessException {
        condition = this.dealConfirmuser(condition);
        String verifySql = "";
        if (condition.trim().indexOf("GROUP BY") >= 0) {
            String[] conditionSplit = condition.split("GROUP BY");
            condition = conditionSplit[0];
            verifySql = conditionSplit[1];
        }
        if (condition.trim().indexOf("select") != 0 && condition.trim().indexOf("SELECT") != 0) {
            condition = condition + " AND " + SqlUtils.convertParentCond((String)this.getArapBilltypeInfo().getCode(), (String)"dr") + " =0 ";
            if (verifySql != null && verifySql.length() > 0) {
                condition = condition + " GROUP BY " + verifySql;
            }
            condition = condition + "ORDER BY billdate,billno";
            return new ArapBillBO().queryPaginationQueryVO(condition, billcount, this.getArapBilltypeInfo().getCode());
        }
        if (null != condition && condition.trim().length() > 0) {
            if (condition.trim().indexOf("where") == -1 && condition.trim().indexOf("WHERE") == -1) {
                condition = condition + " WHERE " + SqlUtils.convertParentCond((String)this.getArapBilltypeInfo().getCode(), (String)"dr") + " =0 ";
            } else {
                String sql = condition.replace(" ", "");
                boolean combinAnd = sql.endsWith("WHERE") || condition.endsWith("where");
                condition = condition + (!combinAnd ? " AND " : " ") + SqlUtils.convertParentCond((String)this.getArapBilltypeInfo().getCode(), (String)"dr") + " =0 ";
            }
        } else {
            condition = " WHERE " + SqlUtils.convertParentCond((String)this.getArapBilltypeInfo().getCode(), (String)"dr") + " =0 ";
        }
        if (verifySql != null && verifySql.length() > 0) {
            condition = condition + " GROUP BY " + verifySql;
        }
        condition = condition + " ORDER BY " + this.getArapBilltypeInfo().getTableNameBill() + ".billdate," + this.getArapBilltypeInfo().getTableNameBill() + ".billno";
        return new ArapBillBO().queryPaginationQueryVO(condition, billcount, this.getArapBilltypeInfo().getCode());
    }

    public BaseAggVO[] findBillByPrimaryKey(String[] keys) throws BusinessException {
        BaseAggVO[] vos = null;
        try {
            Object[] billVOs = new ArapBillDAO().queryBillByPKForPageQry(keys, this.getArapBilltypeInfo().getCode(), false);
            vos = new BaseAggVO[billVOs.length];
            System.arraycopy(billVOs, 0, vos, 0, billVOs.length);
            return vos;
        }
        catch (Exception e) {
            throw ExceptionHandler.createException((String)e.getMessage());
        }
    }

    public T[] queryBillByPKForPageQry(String[] keys) throws BusinessException {
        try {
            String billType = this.getArapBilltypeInfo().getCode();
            Object[] vos = new ArapBillDAO().queryBillByPKForPageQry(keys, billType);
            Class voClass = this.getArapBilltypeInfo().getAggvoClass();
            BaseAggVO[] newInstance = (BaseAggVO[])Array.newInstance(voClass, vos.length);
            System.arraycopy(vos, 0, newInstance, 0, vos.length);
            return newInstance;
        }
        catch (Exception e) {
            throw ExceptionHandler.createException((String)e.getMessage());
        }
    }

    public BaseAggVO[] findBillByTopBillKey(String[] keys) throws BusinessException {
        try {
            return new ArapBillDAO().queryBillByTopBillKeys(keys, this.getArapBilltypeInfo());
        }
        catch (Exception e) {
            throw ExceptionHandler.createException((String)e.getMessage());
        }
    }

    public BaseAggVO[] findBillByTopItemKey(String[] keys) throws BusinessException {
        try {
            return new ArapBillDAO().queryBillByTopItemKeys(keys, this.getArapBilltypeInfo());
        }
        catch (Exception e) {
            throw ExceptionHandler.createException((String)e.getMessage());
        }
    }

    public BaseAggVO[] findBillBySrcBillKey(String[] keys) throws BusinessException {
        try {
            return new ArapBillDAO().queryBillBySrcBillKeys(keys, this.getArapBilltypeInfo());
        }
        catch (Exception e) {
            throw ExceptionHandler.createException((String)e.getMessage());
        }
    }

    public BaseAggVO[] findBillBySrcItemKey(String[] keys) throws BusinessException {
        try {
            return new ArapBillDAO().queryBillBySrcItemKeys(keys, this.getArapBilltypeInfo());
        }
        catch (Exception e) {
            throw ExceptionHandler.createException((String)e.getMessage());
        }
    }

    public CircularlyAccessibleValueObject[] queryChildrenByParentPk(String parentPk) throws BusinessException {
        if (StringUtil.isEmpty((String)parentPk)) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61008_0", "02006v61008-0260"));
        }
        String itemTable = this.getArapBilltypeInfo().getTableNameItem();
        String whereCondStr = itemTable + "." + this.getArapBilltypeInfo().getTablePrimaryKeyBill() + "= '" + parentPk + "' and " + itemTable + ".dr = 0 ";
        Collection itemCollections = MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByCond(this.getArapBilltypeInfo().getItemvoClass(), whereCondStr, false);
        return (CircularlyAccessibleValueObject[])itemCollections.toArray(new BaseItemVO[0]);
    }

    public BaseItemVO[] queryChildrenByParentPks(String[] parentPk) throws BusinessException {
        if (parentPk == null || parentPk.length == 0) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61008_0", "02006v61008-0260"));
        }
        String itemTable = this.getArapBilltypeInfo().getTableNameItem();
        Collection itemCollections = MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByCond(this.getArapBilltypeInfo().getItemvoClass(), nc.vo.fi.pub.SqlUtils.getInStr((String)(itemTable + "." + this.getArapBilltypeInfo().getTablePrimaryKeyBill()), (String[])parentPk, (boolean)true) + " and " + itemTable + ".dr = 0", false);
        return itemCollections.toArray(new BaseItemVO[0]);
    }

    public SuperVO[] queryChildrenByPks(String[] itemPKs) throws BusinessException {
        Collection vos = MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByPKs(this.getArapBilltypeInfo().getItemvoClass(), itemPKs, false);
        return (SuperVO[])vos.toArray(new BaseItemVO[0]);
    }

    public SuperVO[] queryChildrenTopItemsByPks(String[] itemPks) throws BusinessException {
        if (itemPks == null || itemPks.length == 0) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61008_0", "02006v61008-0260"));
        }
        String itemTable = this.getArapBilltypeInfo().getTableNameItem();
        Collection itemCollections = MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByCond(this.getArapBilltypeInfo().getItemvoClass(), nc.vo.fi.pub.SqlUtils.getInStr((String)(itemTable + "." + "top_itemid"), (String[])itemPks, (boolean)true) + " and " + itemTable + ".dr = 0", false);
        return (SuperVO[])itemCollections.toArray(new BaseItemVO[0]);
    }

    public Map<String, UFDate> queryBusiDate(BaseItemVO[] items) {
        throw new UnsupportedOperationException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0316_0", "02006arappub0316-0024"));
    }

    public String dealConfirmuser(String cond) {
        if (!cond.contains("confirmuser") || cond.indexOf("'%") == -1) {
            return cond;
        }
        String pName = cond.substring(cond.indexOf("'%") + 2, cond.indexOf("%'") == -1 ? 0 : cond.indexOf("%'"));
        String sql = "select cuserid from sm_user where user_name like '%" + pName + "%'";
        String cuseridWherePart = "";
        try {
            cuseridWherePart = (String)((IUAPQueryBS)NCLocator.getInstance().lookup(IUAPQueryBS.class)).executeQuery(sql, new ResultSetProcessor(){
                private static final long serialVersionUID = 1L;

                public Object handleResultSet(ResultSet rs) throws SQLException {
                    ArrayList<String> pks = new ArrayList<String>();
                    while (rs.next()) {
                        pks.add(rs.getString(1));
                    }
                    try {
                        if (CollectionUtils.isEmpty(pks)) {
                            return null;
                        }
                        return nc.vo.fi.pub.SqlUtils.getInStr((String)"confirmuser", (String[])pks.toArray(new String[0]), (boolean)false);
                    }
                    catch (BusinessException e) {
                        Logger.error((Object)e.getMessage(), (Throwable)e);
                        return null;
                    }
                }
            });
        }
        catch (BusinessException e1) {
            Logger.error((Object)e1.getMessage(), (Throwable)e1);
        }
        if (cuseridWherePart != null) {
            String temCond = cond.substring(0, cond.indexOf("confirmuser"));
            int index = cond.indexOf("%'");
            cond = temCond + cuseridWherePart + cond.substring(index == -1 ? 0 : index + 2);
        }
        return cond;
    }
}

