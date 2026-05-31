/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.logging.Logger
 *  nc.itf.uap.IUAPQueryBS
 *  nc.itf.uap.IVOPersistence
 *  nc.jdbc.framework.JdbcSession
 *  nc.jdbc.framework.PersistenceManager
 *  nc.jdbc.framework.SQLParameter
 *  nc.vo.jcom.lang.StringUtil
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.trade.sqlutil.IInSqlBatchCallBack
 *  nc.vo.trade.sqlutil.InSqlBatchCaller
 */
package nc.bs.pub.pa;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import nc.bs.framework.common.NCLocator;
import nc.bs.logging.Logger;
import nc.itf.uap.IUAPQueryBS;
import nc.itf.uap.IVOPersistence;
import nc.jdbc.framework.JdbcSession;
import nc.jdbc.framework.PersistenceManager;
import nc.jdbc.framework.SQLParameter;
import nc.vo.jcom.lang.StringUtil;
import nc.vo.pub.BusinessException;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.pa.AlertRegistryOrgVO;
import nc.vo.pub.pa.AlertregistryVO;
import nc.vo.pub.pa.AlerttypeBVO;
import nc.vo.pub.pa.AlerttypeconfigVO;
import nc.vo.trade.sqlutil.IInSqlBatchCallBack;
import nc.vo.trade.sqlutil.InSqlBatchCaller;

public class AlertRegistryUpgrader {
    private String moduleName = null;
    private Map<String, String> typeFieldnameMap = new HashMap<String, String>();
    final IUAPQueryBS queryService = (IUAPQueryBS)NCLocator.getInstance().lookup(IUAPQueryBS.class);

    public AlertRegistryUpgrader(String moduleName) {
        this.moduleName = moduleName;
    }

    public void putAlertType(String pk_alerttype, String pk_orgFieldName) {
        this.typeFieldnameMap.put(pk_alerttype, pk_orgFieldName);
    }

    public void putAlertType(String pk_alerttype) {
        this.typeFieldnameMap.put(pk_alerttype, null);
    }

    private void queryRegistries(final UpgraderContext context) throws BusinessException, SQLException {
        String[] pk_alerttypes = context.typeFieldnameMap.keySet().toArray(new String[0]);
        new InSqlBatchCaller(pk_alerttypes).execute(new IInSqlBatchCallBack(){

            public Object doWithInSql(String inSql) throws BusinessException, SQLException {
                String condition = "pk_alerttype in " + inSql;
                Collection registryCol = AlertRegistryUpgrader.this.queryService.retrieveByClause(AlertregistryVO.class, condition, new String[]{"pk_alertregistry", "pk_alerttype", "pk_org"});
                if (registryCol != null) {
                    for (AlertregistryVO registry : registryCol) {
                        String pk_alertregistry = registry.getPrimaryKey();
                        String fieldName = (String)AlertRegistryUpgrader.this.typeFieldnameMap.get(registry.getPk_alerttype());
                        context.registrypkVOMap.put(pk_alertregistry, registry);
                        if (StringUtil.isEmptyWithTrim((String)fieldName)) continue;
                        context.registrypkFieldNameMap.put(pk_alertregistry, fieldName);
                    }
                }
                return null;
            }
        });
    }

    private void queryConfigs(UpgraderContext context) throws BusinessException {
        StringBuffer sb = new StringBuffer();
        for (Map.Entry<String, String> entry : context.registrypkFieldNameMap.entrySet()) {
            String pk_alertregistry = entry.getKey();
            String fieldName = entry.getValue();
            if (StringUtil.isEmptyWithTrim((String)fieldName)) continue;
            sb.append(" or ");
            sb.append("(pk_alertregistry='");
            sb.append(pk_alertregistry);
            sb.append("' and fieldname='");
            sb.append(fieldName);
            sb.append("')");
        }
        if (sb.length() > 0) {
            String condition = sb.substring(4);
            Collection configCol = this.queryService.retrieveByClause(AlerttypeconfigVO.class, condition, new String[]{"pk_alerttypeconfig", "pk_alertregistry", "fieldname", "value"});
            if (configCol != null) {
                for (AlerttypeconfigVO config : configCol) {
                    context.registrypkConfigMap.put(config.getPk_alertregistry(), config);
                }
            }
        }
    }

    private void generateOrgVO(UpgraderContext context) throws BusinessException {
        for (Map.Entry<String, AlertregistryVO> entry : context.registrypkVOMap.entrySet()) {
            String pk_alertregistry = entry.getKey();
            AlertregistryVO registry = entry.getValue();
            String fieldName = this.typeFieldnameMap.get(registry.getPk_alerttype());
            if (StringUtil.isEmptyWithTrim((String)fieldName)) {
                String pk_org = registry.getPk_org();
                if (StringUtil.isEmptyWithTrim((String)pk_org)) continue;
                context.orgvoList.addAll(this.createOrgVO(pk_alertregistry, pk_org));
                continue;
            }
            AlerttypeconfigVO config = context.registrypkConfigMap.get(pk_alertregistry);
            if (config == null) continue;
            context.configvoList.add(config);
            String value = config.getValue();
            if (StringUtil.isEmptyWithTrim((String)value)) continue;
            if (value.contains(",")) {
                String[] pk_orgs = value.split(",");
                context.orgvoList.addAll(this.createOrgVO(registry.getPrimaryKey(), pk_orgs));
                continue;
            }
            String pk_org = value;
            context.orgvoList.addAll(this.createOrgVO(registry.getPrimaryKey(), pk_org));
        }
    }

    private void validateTypeB(UpgraderContext context) throws BusinessException {
        String condition = context.buildAlertTypeBCondClause();
        Collection typebvoList = this.queryService.retrieveByClause(AlerttypeBVO.class, condition, new String[]{"pk_alerttype", "pk_alerttype_b", "fieldname", "issingleselected", "notnullable"});
        if (typebvoList != null) {
            for (AlerttypeBVO alerttypeBVO : typebvoList) {
                context.typepkBVOMap.put(alerttypeBVO.getPk_alerttype(), alerttypeBVO);
            }
        }
        for (Map.Entry entry : context.typeFieldnameMap.entrySet()) {
            AlerttypeBVO bvo;
            String pk_alerttype = (String)entry.getKey();
            String fieldName = (String)entry.getValue();
            if (fieldName == null || (bvo = context.typepkBVOMap.get(pk_alerttype)) != null) continue;
            Logger.error((Object)("alerttype pk='" + pk_alerttype + "' does not own a threshold entry coded as '" + fieldName + "'"));
        }
    }

    public void doUpgrade() throws BusinessException {
        long beginMills = System.currentTimeMillis();
        try {
            if (this.typeFieldnameMap.isEmpty()) {
                return;
            }
            UpgraderContext context = new UpgraderContext(this.typeFieldnameMap);
            this.validateTypeB(context);
            this.queryRegistries(context);
            this.queryConfigs(context);
            this.generateOrgVO(context);
            context.flush();
        }
        catch (Exception e) {
            Logger.error((Object)("prealert upgrade process of module: " + this.moduleName + "encountered problem: " + e.getMessage()), (Throwable)e);
            if (e instanceof BusinessException) {
                throw (BusinessException)((Object)e);
            }
            throw new BusinessException(e.getMessage(), (Throwable)e);
        }
        long elapsed = System.currentTimeMillis() - beginMills;
        Logger.debug((Object)("prealert upgrade process of module: " + this.moduleName + " finished, cost time: " + elapsed + "ms"));
    }

    private List<AlertRegistryOrgVO> createOrgVO(String pk_alertregistry, String ... pk_orgs) {
        ArrayList<AlertRegistryOrgVO> orgvoList = new ArrayList<AlertRegistryOrgVO>();
        for (String pk_org : pk_orgs) {
            AlertRegistryOrgVO orgvo = new AlertRegistryOrgVO();
            orgvo.setPk_alertregistry(pk_alertregistry);
            orgvo.setPk_org(String.valueOf(pk_org).trim());
            orgvoList.add(orgvo);
        }
        return orgvoList;
    }

    private class UpgraderContext {
        Map<String, String> typeFieldnameMap = null;
        final Map<String, AlertregistryVO> registrypkVOMap = new HashMap<String, AlertregistryVO>();
        final Map<String, String> registrypkFieldNameMap = new HashMap<String, String>();
        final Map<String, AlerttypeconfigVO> registrypkConfigMap = new HashMap<String, AlerttypeconfigVO>();
        final List<AlerttypeconfigVO> configvoList = new ArrayList<AlerttypeconfigVO>();
        final List<AlertRegistryOrgVO> orgvoList = new ArrayList<AlertRegistryOrgVO>();
        final Map<String, AlerttypeBVO> typepkBVOMap = new HashMap<String, AlerttypeBVO>();

        private UpgraderContext(Map<String, String> typeFieldnameMap) {
            this.typeFieldnameMap = typeFieldnameMap;
        }

        void flush() throws BusinessException {
            IVOPersistence persistence = (IVOPersistence)NCLocator.getInstance().lookup(IVOPersistence.class);
            persistence.insertVOList(this.orgvoList);
            persistence.deleteVOList(this.configvoList);
            persistence.deleteVOArray((SuperVO[])this.typepkBVOMap.values().toArray(new AlerttypeBVO[0]));
            this.updateAlertTypeVO();
        }

        private void updateAlertTypeVO() throws BusinessException {
            PersistenceManager persist = null;
            try {
                persist = PersistenceManager.getInstance();
                JdbcSession session = persist.getJdbcSession();
                for (AlerttypeBVO bvo : this.typepkBVOMap.values()) {
                    UFBoolean isSingle = bvo.getIssingleselected();
                    UFBoolean isNotNull = bvo.getNotnullable();
                    String pk_alerttype = bvo.getPk_alerttype();
                    String sql = "update pub_alerttype set org_multiselectable=?, org_nullable=? where pk_alerttype=?";
                    SQLParameter param = new SQLParameter();
                    param.addParam(UFBoolean.valueOf((!isSingle.booleanValue() ? 1 : 0) != 0).toString());
                    param.addParam(UFBoolean.valueOf((!isNotNull.booleanValue() ? 1 : 0) != 0).toString());
                    param.addParam(pk_alerttype);
                    session.addBatch(sql, param);
                }
                session.executeBatch();
            }
            catch (Exception e) {
                throw new BusinessException(e.getMessage(), (Throwable)e);
            }
            finally {
                if (persist != null) {
                    persist.release();
                }
            }
        }

        private String buildAlertTypeBCondClause() {
            StringBuffer sb = new StringBuffer();
            for (Map.Entry<String, String> entry : this.typeFieldnameMap.entrySet()) {
                String pk_alerttype = entry.getKey();
                String fieldName = entry.getValue();
                if (fieldName == null) continue;
                sb.append(" or ");
                sb.append("(pk_alerttype='");
                sb.append(pk_alerttype);
                sb.append("' and fieldname='");
                sb.append(fieldName);
                sb.append("')");
            }
            if (sb.length() > 0) {
                return sb.substring(4);
            }
            return "1=2";
        }
    }
}

