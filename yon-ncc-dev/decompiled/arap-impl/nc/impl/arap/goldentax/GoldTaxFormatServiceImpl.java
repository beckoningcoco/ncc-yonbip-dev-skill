/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.dao.BaseDAO
 *  nc.bs.dao.DAOException
 *  nc.itf.arap.goldentax.IGoldTaxFormatService
 *  nc.itf.arap.goldentax.SysParaInitQuery
 *  nc.jdbc.framework.mapping.IMappingMeta
 *  nc.jdbc.framework.processor.BeanListProcessor
 *  nc.jdbc.framework.processor.ResultSetProcessor
 *  nc.vo.arap.goldentax.GoldTaxFormatVO
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.SuperVO
 *  nc.vo.pubapp.pattern.exception.ExceptionUtils
 *  nc.vo.pubapp.pattern.pub.SqlBuilder
 *  nc.vo.uap.rbac.util.SuperVOMappingMetaAdaptor
 */
package nc.impl.arap.goldentax;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import nc.bs.dao.BaseDAO;
import nc.bs.dao.DAOException;
import nc.impl.arap.goldentax.ArapConfQuery;
import nc.itf.arap.goldentax.IGoldTaxFormatService;
import nc.itf.arap.goldentax.SysParaInitQuery;
import nc.jdbc.framework.mapping.IMappingMeta;
import nc.jdbc.framework.processor.BeanListProcessor;
import nc.jdbc.framework.processor.ResultSetProcessor;
import nc.vo.arap.goldentax.GoldTaxFormatVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.SuperVO;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.vo.pubapp.pattern.pub.SqlBuilder;
import nc.vo.uap.rbac.util.SuperVOMappingMetaAdaptor;

public class GoldTaxFormatServiceImpl
implements IGoldTaxFormatService {
    public Map<String, Object> getARAPParas(String pk_org, String[] paranames) throws BusinessException {
        HashMap<String, Object> paras = new HashMap<String, Object>();
        for (String paraname : paranames) {
            if ("AR5101".equals(paraname)) {
                paras.put(paraname, SysParaInitQuery.getParaInt((String)pk_org, (String)paraname));
            }
            if ("AR54".equals(paraname)) {
                paras.put(paraname, SysParaInitQuery.getParaDbl((String)pk_org, (String)paraname));
            }
            if ("AR55".equals(paraname)) {
                paras.put(paraname, SysParaInitQuery.getParaBoolean((String)pk_org, (String)paraname));
            }
            if ("AR56".equals(paraname)) {
                paras.put(paraname, SysParaInitQuery.getParaInt((String)pk_org, (String)paraname));
            }
            if ("goldtaxSplit".equals(paraname)) {
                paras.put(paraname, ArapConfQuery.getParaString(paraname));
            }
            if (!"goldtaxDiscountMode".equals(paraname)) continue;
            paras.put(paraname, ArapConfQuery.getParaString(paraname));
        }
        return paras;
    }

    public GoldTaxFormatVO[] queryGoldTaxFormat(String pkOrg) throws BusinessException {
        SqlBuilder sql = new SqlBuilder();
        sql.append("select pk_org,code,name,isselected,ishead,showorder ");
        sql.append("from arap_goldtaxfomat where pk_org", pkOrg);
        sql.append(" order by showorder,ishead,isselected");
        BaseDAO dao = new BaseDAO();
        List initVOList = null;
        try {
            initVOList = (List)dao.executeQuery(sql.toString(), (ResultSetProcessor)new BeanListProcessor(GoldTaxFormatVO.class));
        }
        catch (DAOException e) {
            ExceptionUtils.marsh((Exception)((Object)e));
            return new GoldTaxFormatVO[0];
        }
        return initVOList.toArray(new GoldTaxFormatVO[0]);
    }

    public void saveGoldTaxFormat(String pkOrg, GoldTaxFormatVO[] goldTaxFormatVO) throws BusinessException {
        String deleteSql = "delete from arap_goldtaxfomat where pk_org='" + pkOrg + "'";
        BaseDAO dao = new BaseDAO();
        try {
            dao.executeUpdate(deleteSql);
            dao.insertObject((Object[])goldTaxFormatVO, (IMappingMeta)new SuperVOMappingMetaAdaptor((SuperVO)new GoldTaxFormatVO()));
        }
        catch (Exception e) {
            ExceptionUtils.marsh((Exception)e);
        }
    }
}

