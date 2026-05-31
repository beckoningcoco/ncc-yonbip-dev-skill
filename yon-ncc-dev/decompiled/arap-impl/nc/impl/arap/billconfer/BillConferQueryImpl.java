/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.util.ArapBillType2TableMapping
 *  nc.bs.arap.util.SqlUtils
 *  nc.bs.dao.BaseDAO
 *  nc.bs.dao.DAOException
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.logging.Log
 *  nc.itf.arap.billconfer.IBillConferQueryService
 *  nc.jdbc.framework.SQLParameter
 *  nc.jdbc.framework.processor.ResultSetProcessor
 *  nc.md.model.MetaDataException
 *  nc.md.persist.framework.MDPersistenceService
 *  nc.pubitf.uapbd.ICustomerPubService
 *  nc.pubitf.uapbd.ICustsupPubService
 *  nc.pubitf.uapbd.ISupplierPubService
 *  nc.vo.arap.basebill.BaseAggVO
 *  nc.vo.arap.billconfer.BCMiddleVO
 *  nc.vo.arap.billconfer.BCParamVO
 *  nc.vo.arap.billconfer.BillconferVO
 *  nc.vo.arap.pub.BillEnumCollection$ObjType
 *  nc.vo.bd.cust.finance.CustFinanceVO
 *  nc.vo.bd.supplier.finance.SupFinanceVO
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.jcom.lang.StringUtil
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFBoolean
 *  nccloud.commons.lang.ArrayUtils
 *  nccloud.commons.lang.StringUtils
 */
package nc.impl.arap.billconfer;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import nc.bs.arap.util.ArapBillType2TableMapping;
import nc.bs.arap.util.SqlUtils;
import nc.bs.dao.BaseDAO;
import nc.bs.dao.DAOException;
import nc.bs.framework.common.NCLocator;
import nc.bs.logging.Log;
import nc.itf.arap.billconfer.IBillConferQueryService;
import nc.jdbc.framework.SQLParameter;
import nc.jdbc.framework.processor.ResultSetProcessor;
import nc.md.model.MetaDataException;
import nc.md.persist.framework.MDPersistenceService;
import nc.pubitf.uapbd.ICustomerPubService;
import nc.pubitf.uapbd.ICustsupPubService;
import nc.pubitf.uapbd.ISupplierPubService;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.billconfer.BCMiddleVO;
import nc.vo.arap.billconfer.BCParamVO;
import nc.vo.arap.billconfer.BillconferVO;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.bd.cust.finance.CustFinanceVO;
import nc.vo.bd.supplier.finance.SupFinanceVO;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.jcom.lang.StringUtil;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFBoolean;
import nccloud.commons.lang.ArrayUtils;
import nccloud.commons.lang.StringUtils;

public class BillConferQueryImpl
implements IBillConferQueryService {
    public BillconferVO[] findBillByPrimaryKeys(String[] keys) {
        Collection bills = null;
        try {
            bills = MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByPKs(BillconferVO.class, keys, false);
        }
        catch (MetaDataException e) {
            ExceptionHandler.consume((Throwable)e);
        }
        if (bills != null && bills.size() > 0) {
            return bills.toArray(new BillconferVO[0]);
        }
        return null;
    }

    public BillconferVO[] queryVOByBothTrade(String tradetype, String pkGroup) {
        StringBuilder sb = new StringBuilder();
        if (!StringUtil.isEmpty((String)tradetype)) {
            sb.append("(sourcebill").append("='").append(tradetype).append("' or ").append("targetbill").append("='").append(tradetype).append("')").append(" and ");
        }
        if (StringUtils.isNotEmpty((CharSequence)pkGroup)) {
            sb.append("pk_group").append("= '").append(pkGroup).append("' and ");
        }
        if (sb.length() == 0) {
            return null;
        }
        sb.delete(sb.lastIndexOf("and"), sb.length() - 1);
        Collection bills = null;
        try {
            bills = MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByCond(BillconferVO.class, sb.toString(), false);
        }
        catch (MetaDataException e) {
            ExceptionHandler.consume((Throwable)e);
        }
        if (bills != null && bills.size() > 0) {
            return bills.toArray(new BillconferVO[0]);
        }
        return null;
    }

    public Map<String, List<BillconferVO>> queryVOByBothTrade(String[] tradetypes, String pkGroup) {
        StringBuilder sb = new StringBuilder();
        if (!ArrayUtils.isEmpty((Object[])tradetypes)) {
            try {
                sb.append("(" + SqlUtils.getInStr((String)"sourcebill", (String[])tradetypes)).append(" or ").append(SqlUtils.getInStr((String)"targetbill", (String[])tradetypes) + ")").append(" and ");
            }
            catch (BusinessException e) {
                ExceptionHandler.consume((Throwable)e);
            }
        }
        if (StringUtils.isNotEmpty((CharSequence)pkGroup)) {
            sb.append("pk_group").append("= '").append(pkGroup).append("' and ");
        }
        if (sb.length() == 0) {
            return null;
        }
        sb.delete(sb.lastIndexOf("and"), sb.length() - 1);
        Collection bills = null;
        try {
            bills = MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByCond(BillconferVO.class, sb.toString(), false);
        }
        catch (MetaDataException e) {
            ExceptionHandler.consume((Throwable)e);
        }
        HashMap<String, List<BillconferVO>> map = new HashMap<String, List<BillconferVO>>();
        if (bills != null && bills.size() > 0) {
            for (BillconferVO vo : bills) {
                ArrayList<BillconferVO> list;
                if (map.containsKey(vo.getSourcebill())) {
                    if (null == map.get(vo.getSourcebill())) {
                        list = new ArrayList<BillconferVO>();
                        list.add(vo);
                        map.put(vo.getSourcebill(), list);
                        continue;
                    }
                    ((List)map.get(vo.getSourcebill())).add(vo);
                    continue;
                }
                if (!map.containsKey(vo.getTargetbill())) continue;
                if (null == map.get(vo.getTargetbill())) {
                    list = new ArrayList();
                    list.add(vo);
                    map.put(vo.getTargetbill(), list);
                    continue;
                }
                ((List)map.get(vo.getTargetbill())).add(vo);
            }
            return map;
        }
        return null;
    }

    public BillconferVO[] queryVOByDesTrade(String desTradetype, String pkGroup) {
        StringBuilder sb = new StringBuilder();
        if (!StringUtil.isEmpty((String)desTradetype)) {
            sb.append("targetbill").append("='").append(desTradetype).append("'").append(" and ");
        }
        if (StringUtils.isNotEmpty((CharSequence)pkGroup)) {
            sb.append("pk_group").append("= '").append(pkGroup).append("' and ");
        }
        if (sb.length() == 0) {
            return null;
        }
        sb.delete(sb.lastIndexOf("and"), sb.length() - 1);
        Collection bills = null;
        try {
            bills = MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByCond(BillconferVO.class, sb.toString(), false);
        }
        catch (MetaDataException e) {
            ExceptionHandler.consume((Throwable)e);
        }
        if (bills != null && bills.size() > 0) {
            return bills.toArray(new BillconferVO[0]);
        }
        return null;
    }

    public Map<String, List<BillconferVO>> queryVOByDesTrade(String[] desTradetypes, String pkGroup) {
        StringBuilder sb = new StringBuilder();
        if (!ArrayUtils.isEmpty((Object[])desTradetypes)) {
            try {
                sb.append(SqlUtils.getInStr((String)"targetbill", (String[])desTradetypes)).append(" and ");
            }
            catch (BusinessException e) {
                ExceptionHandler.consume((Throwable)e);
            }
        }
        if (StringUtils.isNotEmpty((CharSequence)pkGroup)) {
            sb.append("pk_group").append("= '").append(pkGroup).append("' and ");
        }
        if (sb.length() == 0) {
            return null;
        }
        sb.delete(sb.lastIndexOf("and"), sb.length() - 1);
        Collection bills = null;
        try {
            bills = MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByCond(BillconferVO.class, sb.toString(), false);
        }
        catch (MetaDataException e) {
            ExceptionHandler.consume((Throwable)e);
        }
        HashMap<String, List<BillconferVO>> map = new HashMap<String, List<BillconferVO>>();
        if (bills != null && bills.size() > 0) {
            for (BillconferVO vo : bills) {
                if (!map.containsKey(vo.getTargetbill())) continue;
                if (null == map.get(vo.getTargetbill())) {
                    ArrayList<BillconferVO> list = new ArrayList<BillconferVO>();
                    list.add(vo);
                    map.put(vo.getTargetbill(), list);
                    continue;
                }
                ((List)map.get(vo.getTargetbill())).add(vo);
            }
            return map;
        }
        return null;
    }

    public BillconferVO[] queryVOBySrcTrade(String srcTradetype, String pkGroup) {
        StringBuilder sb = new StringBuilder();
        if (!StringUtil.isEmpty((String)srcTradetype)) {
            sb.append("sourcebill").append("='").append(srcTradetype).append("'").append(" and ");
        }
        if (StringUtils.isNotEmpty((CharSequence)pkGroup)) {
            sb.append("pk_group").append("= '").append(pkGroup).append("' and ");
        }
        if (sb.length() == 0) {
            return null;
        }
        sb.append(" and dr =0 ");
        Collection bills = null;
        try {
            bills = MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByCond(BillconferVO.class, sb.toString(), false);
        }
        catch (MetaDataException e) {
            ExceptionHandler.consume((Throwable)e);
        }
        if (bills != null && bills.size() > 0) {
            return bills.toArray(new BillconferVO[0]);
        }
        return null;
    }

    public Map<String, List<BillconferVO>> queryVOBySrcTrade(String[] srcTradetypes, String pkGroup) {
        StringBuilder sb = new StringBuilder();
        if (!ArrayUtils.isEmpty((Object[])srcTradetypes)) {
            try {
                sb.append(SqlUtils.getInStr((String)"targetbill", (String[])srcTradetypes)).append(" and ");
            }
            catch (BusinessException e) {
                ExceptionHandler.consume((Throwable)e);
            }
        }
        if (StringUtils.isNotEmpty((CharSequence)pkGroup)) {
            sb.append("pk_group").append("= '").append(pkGroup).append("' and ");
        }
        if (sb.length() == 0) {
            return null;
        }
        sb.delete(sb.lastIndexOf("and"), sb.length() - 1);
        Collection bills = null;
        try {
            bills = MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByCond(BillconferVO.class, sb.toString(), false);
        }
        catch (MetaDataException e) {
            ExceptionHandler.consume((Throwable)e);
        }
        HashMap<String, List<BillconferVO>> map = new HashMap<String, List<BillconferVO>>();
        if (bills != null && bills.size() > 0) {
            for (BillconferVO vo : bills) {
                if (!map.containsKey(vo.getSourcebill())) continue;
                if (null == map.get(vo.getSourcebill())) {
                    ArrayList<BillconferVO> list = new ArrayList<BillconferVO>();
                    list.add(vo);
                    map.put(vo.getSourcebill(), list);
                    continue;
                }
                ((List)map.get(vo.getSourcebill())).add(vo);
            }
            return map;
        }
        return null;
    }

    public BaseAggVO linkBConferVO(String headVoPK, String tradetype, String pk_group) {
        StringBuffer sb = new StringBuffer();
        sb.append("select * from arap_billconfer where busitype =? and pk_group = ? and tradetype =?");
        try {
            Collection collection = new BaseDAO().retrieveByClause(BillconferVO.class, sb.toString());
        }
        catch (DAOException e) {
            Log.getInstance((String)"arapExceptionLog").error((Object)e);
        }
        String billType = null;
        ArapBillType2TableMapping.getChildren_ParentPK(billType);
        ArapBillType2TableMapping.getChildrenTable(billType);
        return null;
    }

    public BCMiddleVO queryBillConfer(BCParamVO paramVO) throws BusinessException {
        UFBoolean cooperateflag;
        BCMiddleVO retVO = new BCMiddleVO();
        BillEnumCollection.ObjType objType = paramVO.getObjType();
        String srcCustsup = paramVO.getSrcCustsup();
        String srcOrg = paramVO.getSrcorg();
        if (StringUtils.isEmpty((CharSequence)srcCustsup) || StringUtils.isEmpty((CharSequence)srcOrg)) {
            return retVO;
        }
        ICustsupPubService service = (ICustsupPubService)NCLocator.getInstance().lookup(ICustsupPubService.class);
        String targetCustSup = service.queryCustsupPkByOrgPk(srcOrg, objType == BillEnumCollection.ObjType.SUPPLIER);
        Map targetOrg = service.queryOrgPkByCustsupPk(new String[]{srcCustsup});
        ICustomerPubService customers = (ICustomerPubService)NCLocator.getInstance().lookup(ICustomerPubService.class);
        ISupplierPubService suppliers = (ISupplierPubService)NCLocator.getInstance().lookup(ISupplierPubService.class);
        if (objType == BillEnumCollection.ObjType.CUSTOMER) {
            SupFinanceVO[] supFinanceVO = suppliers.getSupFinanceVO(new String[]{srcCustsup}, srcOrg, new String[]{"pk_supplier", "cooperateflag"});
            if (supFinanceVO == null || supFinanceVO.length == 0) {
                return retVO;
            }
            cooperateflag = supFinanceVO[0].getCooperateflag();
            if (cooperateflag == null || !cooperateflag.booleanValue()) {
                return retVO;
            }
        } else {
            CustFinanceVO[] custFinanceVO = customers.getCustFinanceVO(new String[]{srcCustsup}, srcOrg, new String[]{"pk_customer", "cooperateflag"});
            if (custFinanceVO == null || custFinanceVO.length == 0) {
                return retVO;
            }
            cooperateflag = custFinanceVO[0].getCooperateflag();
            if (cooperateflag == null || !cooperateflag.booleanValue()) {
                return retVO;
            }
        }
        final ArrayList<String> ret = new ArrayList<String>();
        if (targetCustSup == null) {
            return retVO;
        }
        ret.add(targetCustSup);
        if (targetOrg == null || targetOrg.size() == 0) {
            return retVO;
        }
        ret.add((String)targetOrg.values().iterator().next());
        String srcBilltype = paramVO.getSrcTradetype();
        String srcbusitype = paramVO.getBusitype();
        String sql = "select  targetbill , targetorg,receivers from arap_billconfer where dr= 0 and  sourcebill =?  and isnull(sourceorg,'" + srcOrg + "') = ?  and busitype =? and isnull(targetorg,'" + (String)ret.get(1) + "') = ? ";
        SQLParameter parameter = new SQLParameter();
        parameter.addParam(srcBilltype);
        parameter.addParam(srcOrg);
        parameter.addParam(srcbusitype);
        parameter.addParam((String)ret.get(1));
        final ArrayList ret2 = new ArrayList();
        BaseDAO baseDAO = new BaseDAO();
        baseDAO.executeQuery(sql, parameter, new ResultSetProcessor(){
            private static final long serialVersionUID = -7281543883410993267L;

            public Object handleResultSet(ResultSet rs) throws SQLException {
                while (rs.next()) {
                    ret2.add(rs.getString(1));
                    ret2.add(ret.get(1));
                    ret2.add(rs.getString(3));
                }
                return null;
            }
        });
        if (ret2.size() == 0) {
            return retVO;
        }
        retVO.setTargetbill((String)ret2.get(0));
        retVO.setTargetorg((String)ret2.get(1));
        retVO.setCustsup((String)ret.get(0));
        retVO.setObjtype(objType == BillEnumCollection.ObjType.SUPPLIER ? BillEnumCollection.ObjType.SUPPLIER.VALUE : BillEnumCollection.ObjType.CUSTOMER.VALUE);
        retVO.setReceiver((String)ret2.get(2));
        return retVO;
    }
}

