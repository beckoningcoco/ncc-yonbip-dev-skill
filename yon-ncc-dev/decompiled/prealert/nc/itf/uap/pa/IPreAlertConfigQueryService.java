/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.BusinessException
 */
package nc.itf.uap.pa;

import java.util.List;
import nc.bs.pub.taskcenter.WorkingLogVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.pa.AlertmessageVO;
import nc.vo.pub.pa.AlertregistryVO;
import nc.vo.pub.pa.AlerttypeVO;

public interface IPreAlertConfigQueryService {
    public AlerttypeVO[] queryAllAlertTypes() throws BusinessException;

    public AlerttypeVO[] queryAlertTypesByClause(String var1) throws BusinessException;

    public AlerttypeVO queryAlertyTypeByPK(String var1) throws BusinessException;

    public AlerttypeVO[] queryAlertyTypesByPKs(String[] var1) throws BusinessException;

    public AlerttypeVO queryAlertyTypeByPKAgg(String var1) throws BusinessException;

    public AlerttypeVO[] queryAlertyTypesByPKsAgg(String[] var1) throws BusinessException;

    public AlerttypeVO[] queryAllAlertTypesAgg() throws BusinessException;

    public AlerttypeVO[] queryAllPrealertAlertTypesAgg() throws BusinessException;

    public AlerttypeVO[] queryAllBackgrounAlertTypesAgg() throws BusinessException;

    public AlerttypeVO[] queryAllBgAndTempAlertTypesAgg() throws BusinessException;

    public AlertregistryVO queryRegistryByPK(String var1) throws BusinessException;

    public AlertregistryVO queryRegistryByPKAgg(String var1) throws BusinessException;

    public AlertregistryVO[] queryRegistryByPKs(String[] var1) throws BusinessException;

    public AlertregistryVO[] queryRegistryByPKsAgg(String[] var1) throws BusinessException;

    public AlertregistryVO[] queryRegistriesByAlertType(String[] var1) throws BusinessException;

    public AlertregistryVO[] queryRegistriesByAlertTypeAgg(String[] var1) throws BusinessException;

    public AlertregistryVO[] queryAllRegistries() throws BusinessException;

    public AlertregistryVO[] queryRegistriesByOrg(String var1) throws BusinessException;

    public AlertregistryVO[] queryAllRegistriesAgg(String var1) throws BusinessException;

    public AlertregistryVO[] queryRegistriesByOrgAgg(String var1) throws BusinessException;

    public AlertregistryVO[] queryRegistriesByClause(String var1, String var2) throws BusinessException;

    public AlertmessageVO queryMessagesByPK(String var1) throws BusinessException;

    public AlertmessageVO[] queryMessageByClause(String var1, String var2) throws BusinessException;

    public AlertmessageVO[] queryNewMessagesInMethods(int[] var1, String var2) throws BusinessException;

    public AlertregistryVO[] queryAggAlertRegistrysByUserPK(String var1, String var2, String var3) throws BusinessException;

    public AlertregistryVO[] queryLoadAlertRegistrysByUserPK(String var1, String var2, String var3) throws BusinessException;

    public AlertregistryVO[] queryAggAlertRegistrysByFuncode(String var1, String var2, String var3, String ... var4) throws BusinessException;

    public AlertregistryVO[] queryAggAlertRegistrysByWhereClause(String var1, String var2) throws BusinessException;

    public AlertregistryVO[] queryRegistriesByOrgAgg(String var1, String var2) throws BusinessException;

    public List<WorkingLogVO> getAllTaskLogs(String var1) throws BusinessException;

    public String[] getTaskLogPKs(String var1) throws BusinessException;

    public String[] getAlertMsgPKs(String var1) throws BusinessException;

    public List<AlertmessageVO> getAlertMsgs(String var1) throws BusinessException;

    public AlertregistryVO[] querySchedulableRegistriesAgg(String var1) throws BusinessException;

    public AlertregistryVO[] queryScheduleableRegistries(String var1, String[] var2) throws BusinessException;

    public String getDevModuleName(String var1) throws BusinessException;

    public String getClusterFlag() throws BusinessException;
}

