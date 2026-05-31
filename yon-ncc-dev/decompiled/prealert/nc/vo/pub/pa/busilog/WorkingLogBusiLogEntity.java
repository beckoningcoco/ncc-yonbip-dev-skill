/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.busilog.vo.BusinessLogContext
 *  nc.bs.dao.BaseDAO
 *  nc.bs.dao.DAOException
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFBoolean
 */
package nc.vo.pub.pa.busilog;

import nc.bs.busilog.vo.BusinessLogContext;
import nc.bs.dao.BaseDAO;
import nc.bs.dao.DAOException;
import nc.bs.pub.taskcenter.WorkingLogVO;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.pa.AlertregistryVO;
import nc.vo.pub.pa.busilog.AbstractPABusiLogEntity;

public class WorkingLogBusiLogEntity
extends AbstractPABusiLogEntity {
    private WorkingLogVO workingLog = null;
    private String operation = null;

    public WorkingLogBusiLogEntity(WorkingLogVO workinglog, String operation) {
        this.workingLog = workinglog;
        this.operation = operation;
    }

    @Override
    public BusinessLogContext fillBusiInfo(BusinessLogContext context) {
        context.setPk_busiobj(this.workingLog.getPrimaryKey());
        context.setBusiobjcode(this.workingLog.getPrimaryKey());
        context.setBusiobjname(this.workingLog.getTaskname());
        context.setTypepk_busiobj("5be3532f-4e84-41d9-a0ab-c8ab4195a468");
        context.setBusiobjvo((Object)this.workingLog);
        context.setPk_operation(this.operation);
        return context;
    }

    @Override
    public String buildLogmsg() throws BusinessException {
        StringBuffer sb = new StringBuffer();
        sb.append(this.extractKeyInformation(this.workingLog));
        return sb.toString();
    }

    private String extractKeyInformation(WorkingLogVO log) throws BusinessException {
        if (log == null) {
            return "";
        }
        AlertregistryVO registry = this.getRegistryOfLog(log);
        StringBuffer sb = new StringBuffer();
        if (registry != null) {
            sb.append(WorkingLogBusiLogEntity.getCategoryString(registry.getRegistrytype()));
            sb.append(", ");
            sb.append(WorkingLogBusiLogEntity.getAlertTypeNameString(registry.getPk_alerttype()));
            sb.append(", ");
            sb.append(WorkingLogBusiLogEntity.getRegistryNameString(registry));
            sb.append(", ");
        }
        sb.append(this.getResultString(log));
        sb.append(", ");
        sb.append(this.getStarttimeString(log));
        sb.append(", ");
        sb.append(this.getEndtimeString(log));
        sb.append(", ");
        sb.append(this.getServernameString(log));
        return sb.toString();
    }

    private String getResultString(WorkingLogVO log) {
        String str = NCLangRes4VoTransl.getNCLangRes().getStrByID("prealertres", "WorkingLogBusiLogEntity-000000");
        String resultStr = null;
        resultStr = UFBoolean.TRUE.equals((Object)log.getWorkingresult()) ? NCLangRes4VoTransl.getNCLangRes().getStrByID("prealertres", "WorkingLogBusiLogEntity-000001") : NCLangRes4VoTransl.getNCLangRes().getStrByID("prealertres", "WorkingLogBusiLogEntity-000002");
        return WorkingLogBusiLogEntity.getFormattedString(str, resultStr);
    }

    private String getStarttimeString(WorkingLogVO log) {
        String str = NCLangRes4VoTransl.getNCLangRes().getStrByID("prealertres", "WorkingLogBusiLogEntity-000003");
        String beginTime = log.getStarttime().toStdString();
        return WorkingLogBusiLogEntity.getFormattedString(str, beginTime);
    }

    private String getEndtimeString(WorkingLogVO log) {
        String str = NCLangRes4VoTransl.getNCLangRes().getStrByID("prealertres", "WorkingLogBusiLogEntity-000004");
        String endTime = log.getEndtime().toStdString();
        return WorkingLogBusiLogEntity.getFormattedString(str, endTime);
    }

    private String getServernameString(WorkingLogVO log) {
        String str = NCLangRes4VoTransl.getNCLangRes().getStrByID("prealertres", "AlertRuntimeBusiLogEntity-000002");
        String name = log.getServername();
        return WorkingLogBusiLogEntity.getFormattedString(str, name);
    }

    private AlertregistryVO getRegistryOfLog(WorkingLogVO log) throws DAOException {
        AlertregistryVO registry = log.getRegistry();
        if (registry == null) {
            BaseDAO dao = new BaseDAO();
            WorkingLogVO logvo = (WorkingLogVO)((Object)dao.retrieveByPK(WorkingLogVO.class, log.getPrimaryKey(), new String[]{"registry"}));
            registry = logvo.getRegistry();
        }
        return registry;
    }
}

