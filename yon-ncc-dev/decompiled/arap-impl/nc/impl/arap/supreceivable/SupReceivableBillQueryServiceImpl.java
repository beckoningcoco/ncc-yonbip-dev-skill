/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.bill.ArapBillCombineUtil
 *  nc.bs.arap.bill.ArapBillDAO
 *  nc.impl.arap.base.ArapBillQueryServiceImpl
 *  nc.impl.pubapp.pattern.data.bill.BillLazyQuery
 *  nc.impl.pubapp.pattern.data.view.ViewQuery
 *  nc.impl.pubapp.pattern.database.DataAccessUtils
 *  nc.itf.arap.supreceivable.IArapSupReceivableBillQueryService
 *  nc.md.persist.framework.MDPersistenceService
 *  nc.ui.querytemplate.querytree.IQueryScheme
 *  nc.vo.arap.pub.ArapBillTypeInfo
 *  nc.vo.arap.pub.IArapBilltypeInfo
 *  nc.vo.arap.supreceivable.AggSupReceivableBillVO
 *  nc.vo.arap.supreceivable.SupReceivableBillItemVO
 *  nc.vo.arap.supreceivable.SupReceivableBillVO
 *  nc.vo.arap.supreceivable.SupReceivableBillViewVO
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.BusinessException
 *  nc.vo.pubapp.pattern.exception.ExceptionUtils
 *  nc.vo.pubapp.pattern.model.entity.view.AbstractDataView
 *  nc.vo.pubapp.query2.sql.process.QuerySchemeProcessor
 *  nccloud.commons.lang.ArrayUtils
 */
package nc.impl.arap.supreceivable;

import java.util.Collection;
import nc.bs.arap.bill.ArapBillCombineUtil;
import nc.bs.arap.bill.ArapBillDAO;
import nc.impl.arap.base.ArapBillQueryServiceImpl;
import nc.impl.pubapp.pattern.data.bill.BillLazyQuery;
import nc.impl.pubapp.pattern.data.view.ViewQuery;
import nc.impl.pubapp.pattern.database.DataAccessUtils;
import nc.itf.arap.supreceivable.IArapSupReceivableBillQueryService;
import nc.md.persist.framework.MDPersistenceService;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.arap.pub.ArapBillTypeInfo;
import nc.vo.arap.pub.IArapBilltypeInfo;
import nc.vo.arap.supreceivable.AggSupReceivableBillVO;
import nc.vo.arap.supreceivable.SupReceivableBillItemVO;
import nc.vo.arap.supreceivable.SupReceivableBillVO;
import nc.vo.arap.supreceivable.SupReceivableBillViewVO;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.vo.pubapp.pattern.model.entity.view.AbstractDataView;
import nc.vo.pubapp.query2.sql.process.QuerySchemeProcessor;
import nccloud.commons.lang.ArrayUtils;

public class SupReceivableBillQueryServiceImpl
extends ArapBillQueryServiceImpl
implements IArapSupReceivableBillQueryService {
    public AggSupReceivableBillVO[] findBillByPrimaryKey(String[] keys) throws BusinessException {
        AggSupReceivableBillVO[] vos = null;
        try {
            vos = (AggSupReceivableBillVO[])new ArapBillDAO().queryBillByPrimaryKeys(keys, "23F0");
        }
        catch (Exception e) {
            ExceptionHandler.createException((String)e.getMessage());
        }
        return vos;
    }

    public AggSupReceivableBillVO[] queryVOsByWhere(String whereSql) throws BusinessException {
        try {
            Collection ret = MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByCond(AggSupReceivableBillVO.class, whereSql, false);
            return ret.toArray(new AggSupReceivableBillVO[0]);
        }
        catch (BusinessException e) {
            ExceptionHandler.handleException((Exception)((Object)e));
            return null;
        }
    }

    public Object[] queryByQueryScheme(IQueryScheme queryScheme) throws BusinessException {
        AggSupReceivableBillVO[] bills = null;
        try {
            QuerySchemeProcessor processor = new QuerySchemeProcessor(queryScheme);
            processor.appendCurrentGroup();
            processor.appendFuncPermissionOrgSql();
            BillLazyQuery qry = new BillLazyQuery(AggSupReceivableBillVO.class);
            bills = (AggSupReceivableBillVO[])qry.query(queryScheme, null);
        }
        catch (Exception ex) {
            ExceptionUtils.marsh((Exception)ex);
        }
        return bills;
    }

    public AggSupReceivableBillVO[] queryViewVOsByScheme(IQueryScheme queryScheme) throws BusinessException {
        DataAccessUtils utils = new DataAccessUtils();
        String sql = this.createSql(queryScheme);
        String[] bids = utils.query(sql).toOneDimensionStringArray();
        if (null != bids && bids.length > 50000) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0316_0", "02006arappub0316-0070", null, new String[]{String.valueOf(50000)}));
        }
        Object[] views = (SupReceivableBillViewVO[])new ViewQuery(SupReceivableBillViewVO.class).query(bids);
        if (ArrayUtils.isEmpty((Object[])views)) {
            return null;
        }
        AggSupReceivableBillVO[] queryVos = (AggSupReceivableBillVO[])new ArapBillCombineUtil(AggSupReceivableBillVO.class, SupReceivableBillVO.class, SupReceivableBillItemVO.class).combineViewToAgg((AbstractDataView[])views, this.getArapBilltypeInfo().getTablePrimaryKeyBill());
        return queryVos;
    }

    protected IArapBilltypeInfo getArapBilltypeInfo() {
        return ArapBillTypeInfo.getInstance((Object)"23F0");
    }
}

