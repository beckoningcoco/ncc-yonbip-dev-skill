/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.dao.BaseDAO
 *  nc.impl.pubapp.pattern.data.bill.SchemeBillQuery
 *  nc.itf.arap.reminder.IArapNoticeService
 *  nc.jdbc.framework.processor.ResultSetProcessor
 *  nc.md.persist.framework.MDPersistenceService
 *  nc.ui.querytemplate.querytree.IQueryScheme
 *  nc.vo.arap.reminder.AggArapNoticeVO
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.pub.BusinessException
 *  nc.vo.pubapp.pagination.PaginationQueryVO
 *  nc.vo.pubapp.pattern.exception.ExceptionUtils
 *  nccloud.commons.lang.ArrayUtils
 */
package nc.impl.arap.reminder;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import nc.bs.dao.BaseDAO;
import nc.impl.pubapp.pattern.data.bill.SchemeBillQuery;
import nc.itf.arap.reminder.IArapNoticeService;
import nc.jdbc.framework.processor.ResultSetProcessor;
import nc.md.persist.framework.MDPersistenceService;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.arap.reminder.AggArapNoticeVO;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pagination.PaginationQueryVO;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nccloud.commons.lang.ArrayUtils;

public class ArapNoticeServiceImpl
implements IArapNoticeService {
    public PaginationQueryVO queryPaginationQueryVO(String condition, Integer billCount) throws BusinessException {
        PaginationQueryVO vo = null;
        try {
            List<String> pks = this.queryPksByCondition(condition);
            if (null != pks && pks.size() > 0) {
                AggArapNoticeVO[] aggVOs;
                int count = billCount;
                if (count > pks.size()) {
                    count = pks.size();
                }
                if ((aggVOs = this.findBillByPrimaryKey(pks.subList(0, count).toArray(new String[0]))) != null && aggVOs.length != 0) {
                    vo = new PaginationQueryVO();
                    HashMap<String, AggArapNoticeVO> map = new HashMap<String, AggArapNoticeVO>();
                    for (AggArapNoticeVO bill : aggVOs) {
                        map.put(bill.getParentVO().getPrimaryKey(), bill);
                    }
                    vo.setBillmap(map);
                    vo.setAllpks(pks.toArray(new String[0]));
                }
            }
        }
        catch (Exception e) {
            throw ExceptionHandler.handleException((Exception)e);
        }
        return vo;
    }

    public List<String> queryPksByCondition(String condition) throws BusinessException {
        String sql = "select pk_notice  from arap_notice where dr=0 ";
        if (null != condition && condition.trim().length() > 0) {
            sql = sql + "and " + condition;
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

    public AggArapNoticeVO[] findBillByPrimaryKey(String[] keys) throws BusinessException {
        Object[] vos = null;
        try {
            vos = MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByPKs(AggArapNoticeVO.class, keys, false).toArray();
        }
        catch (Exception e) {
            throw ExceptionHandler.handleException((Exception)e);
        }
        return this.castObjectToAggArapNoticeVO(vos);
    }

    private AggArapNoticeVO[] castObjectToAggArapNoticeVO(Object[] objs) {
        if (ArrayUtils.isEmpty((Object[])objs)) {
            return null;
        }
        AggArapNoticeVO[] newObjs = new AggArapNoticeVO[objs.length];
        for (int i = 0; i < objs.length; ++i) {
            newObjs[i] = (AggArapNoticeVO)objs[i];
        }
        return newObjs;
    }

    public AggArapNoticeVO[] queryByScheme(IQueryScheme queryscheme) throws BusinessException {
        try {
            if (queryscheme == null) {
                return null;
            }
            SchemeBillQuery querytool = new SchemeBillQuery(AggArapNoticeVO.class);
            AggArapNoticeVO[] vos = (AggArapNoticeVO[])querytool.query(queryscheme, null);
            return vos;
        }
        catch (Exception ex) {
            ExceptionUtils.marsh((Exception)ex);
            return null;
        }
    }
}

