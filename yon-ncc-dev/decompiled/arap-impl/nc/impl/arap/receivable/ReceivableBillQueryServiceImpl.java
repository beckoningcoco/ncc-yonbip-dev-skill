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
 *  nc.itf.arap.receivable.IArapReceivableBillQueryService
 *  nc.md.persist.framework.MDPersistenceService
 *  nc.ui.querytemplate.querytree.IQueryScheme
 *  nc.vo.arap.pub.ArapBillTypeInfo
 *  nc.vo.arap.pub.IArapBilltypeInfo
 *  nc.vo.arap.receivable.AggReceivableBillVO
 *  nc.vo.arap.receivable.ReceivableBillItemVO
 *  nc.vo.arap.receivable.ReceivableBillVO
 *  nc.vo.arap.receivable.ReceiveableViewVO
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.BusinessException
 *  nc.vo.pubapp.pattern.exception.ExceptionUtils
 *  nc.vo.pubapp.pattern.model.entity.view.AbstractDataView
 *  nc.vo.pubapp.query2.sql.process.QuerySchemeProcessor
 *  nccloud.commons.lang.ArrayUtils
 */
package nc.impl.arap.receivable;

import java.util.Collection;
import nc.bs.arap.bill.ArapBillCombineUtil;
import nc.bs.arap.bill.ArapBillDAO;
import nc.impl.arap.base.ArapBillQueryServiceImpl;
import nc.impl.pubapp.pattern.data.bill.BillLazyQuery;
import nc.impl.pubapp.pattern.data.view.ViewQuery;
import nc.impl.pubapp.pattern.database.DataAccessUtils;
import nc.itf.arap.receivable.IArapReceivableBillQueryService;
import nc.md.persist.framework.MDPersistenceService;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.arap.pub.ArapBillTypeInfo;
import nc.vo.arap.pub.IArapBilltypeInfo;
import nc.vo.arap.receivable.AggReceivableBillVO;
import nc.vo.arap.receivable.ReceivableBillItemVO;
import nc.vo.arap.receivable.ReceivableBillVO;
import nc.vo.arap.receivable.ReceiveableViewVO;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.vo.pubapp.pattern.model.entity.view.AbstractDataView;
import nc.vo.pubapp.query2.sql.process.QuerySchemeProcessor;
import nccloud.commons.lang.ArrayUtils;

public class ReceivableBillQueryServiceImpl
extends ArapBillQueryServiceImpl
implements IArapReceivableBillQueryService {
    public AggReceivableBillVO[] findBillByPrimaryKey(String[] keys) throws BusinessException {
        AggReceivableBillVO[] vos = null;
        try {
            Object[] billVOs = new ArapBillDAO().queryBillByPKForPageQry(keys, this.getArapBilltypeInfo().getCode(), false);
            vos = new AggReceivableBillVO[billVOs.length];
            System.arraycopy(billVOs, 0, vos, 0, billVOs.length);
        }
        catch (Exception e) {
            ExceptionHandler.createException((String)e.getMessage());
        }
        return vos;
    }

    public AggReceivableBillVO[] queryVOsByWhere(String whereSql) throws BusinessException {
        Collection ret = MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByCond(AggReceivableBillVO.class, whereSql, false);
        return ret.toArray(new AggReceivableBillVO[0]);
    }

    public Object[] queryByQueryScheme(IQueryScheme queryScheme) throws BusinessException {
        AggReceivableBillVO[] bills = null;
        try {
            QuerySchemeProcessor processor = new QuerySchemeProcessor(queryScheme);
            processor.appendCurrentGroup();
            processor.appendFuncPermissionOrgSql();
            BillLazyQuery qry = new BillLazyQuery(AggReceivableBillVO.class);
            bills = (AggReceivableBillVO[])qry.query(queryScheme, null);
        }
        catch (Exception ex) {
            ExceptionUtils.marsh((Exception)ex);
        }
        return bills;
    }

    public AggReceivableBillVO[] queryViewVOsByScheme(IQueryScheme queryScheme) throws BusinessException {
        DataAccessUtils utils = new DataAccessUtils();
        String sql = this.createSql(queryScheme);
        String[] bids = utils.query(sql).toOneDimensionStringArray();
        if (null != bids && bids.length > 50000) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0316_0", "02006arappub0316-0070", null, new String[]{String.valueOf(50000)}));
        }
        Object[] views = (ReceiveableViewVO[])new ViewQuery(ReceiveableViewVO.class).query(bids);
        if (ArrayUtils.isEmpty((Object[])views)) {
            return null;
        }
        AggReceivableBillVO[] queryVos = (AggReceivableBillVO[])new ArapBillCombineUtil(AggReceivableBillVO.class, ReceivableBillVO.class, ReceivableBillItemVO.class).combineViewToAgg((AbstractDataView[])views, this.getArapBilltypeInfo().getTablePrimaryKeyBill());
        return queryVos;
    }

    protected IArapBilltypeInfo getArapBilltypeInfo() {
        return ArapBillTypeInfo.getInstance((Object)"F0");
    }
}

