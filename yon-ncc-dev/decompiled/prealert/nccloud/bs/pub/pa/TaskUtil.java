/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.cloud.iuap.iris.IrisNCLocator
 *  com.yonyou.cloud.ncc.NCCEnv
 *  nc.bs.dao.BaseDAO
 *  nc.bs.dao.DAOException
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.framework.common.RuntimeEnv
 *  nc.bs.logging.Logger
 *  nc.vo.pub.BusinessException
 *  nc.vo.sm.funcreg.ModuleVO
 *  nccloud.commons.lang.StringUtils
 *  nccloud.impl.platform.common.util.CollectionUtils
 *  nccloud.install.util.InstallProperties
 */
package nccloud.bs.pub.pa;

import com.yonyou.cloud.iuap.iris.IrisNCLocator;
import com.yonyou.cloud.ncc.NCCEnv;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import nc.bs.dao.BaseDAO;
import nc.bs.dao.DAOException;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.framework.common.NCLocator;
import nc.bs.framework.common.RuntimeEnv;
import nc.bs.logging.Logger;
import nc.itf.uap.pa.IPreAlertConfigQueryService;
import nc.vo.pub.BusinessException;
import nc.vo.pub.pa.AlertregistryVO;
import nc.vo.pub.pa.AlerttypeVO;
import nc.vo.pub.pa.TimingSettingVO;
import nc.vo.sm.funcreg.ModuleVO;
import ncc.task.quartz.dao.entity.NCCTimeSettingVO;
import ncc.task.quartz.dao.entity.ScheduleJob;
import nccloud.commons.lang.StringUtils;
import nccloud.impl.platform.common.util.CollectionUtils;
import nccloud.install.util.InstallProperties;

public class TaskUtil {
    private static final String DEFAULT_URL = "http://127.0.0.1:9001";

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static String getQuartzURL() {
        String ncHome = RuntimeEnv.getInstance().getNCHome();
        File file = new File(ncHome, "ierp/quartz.properties");
        FileInputStream fileInputStream = null;
        Properties prop = new Properties();
        try {
            fileInputStream = new FileInputStream(file);
            prop.load(fileInputStream);
        }
        catch (Exception e) {
            String string = DEFAULT_URL;
            return string;
        }
        finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                }
                catch (IOException e) {
                    Logger.error((Object)e);
                }
            }
        }
        return prop.getProperty("url");
    }

    public static ScheduleJob createJobEntity(AlertregistryVO registry) {
        try {
            registry = ((IPreAlertConfigQueryService)NCLocator.getInstance().lookup(IPreAlertConfigQueryService.class)).queryRegistryByPKAgg(registry.getPrimaryKey());
        }
        catch (BusinessException e1) {
            return null;
        }
        String moduleserverName = "";
        String modulecode = "";
        String taskClass = "";
        try {
            AlerttypeVO type = (AlerttypeVO)((Object)new BaseDAO().retrieveByPK(AlerttypeVO.class, registry.getPk_alerttype()));
            moduleserverName = IrisNCLocator.getInstance().getServiceByModule(type.getBelong_system().toLowerCase());
            modulecode = type.getBelong_system();
            modulecode = TaskUtil.getDevmodule(modulecode, type);
            taskClass = type.getBusi_plugin();
        }
        catch (DAOException e) {
            Logger.error((Object)e.getMessage(), (Throwable)e);
        }
        ScheduleJob job = TaskUtil.createScheduleJob(registry, moduleserverName, modulecode, taskClass);
        return job;
    }

    public static ScheduleJob[] createMulJobEntity(AlertregistryVO registry) {
        try {
            registry = ((IPreAlertConfigQueryService)NCLocator.getInstance().lookup(IPreAlertConfigQueryService.class)).queryRegistryByPKAgg(registry.getPrimaryKey());
        }
        catch (BusinessException e1) {
            return null;
        }
        String moduleserverName = "";
        String modulecode = "";
        String taskClass = "";
        try {
            AlerttypeVO type = (AlerttypeVO)((Object)new BaseDAO().retrieveByPK(AlerttypeVO.class, registry.getPk_alerttype()));
            moduleserverName = IrisNCLocator.getInstance().getServiceByModule(type.getBelong_system().toLowerCase());
            modulecode = type.getBelong_system();
            modulecode = TaskUtil.getDevmodule(modulecode, type);
            taskClass = type.getBusi_plugin();
        }
        catch (DAOException e) {
            Logger.error((Object)e.getMessage(), (Throwable)e);
        }
        ArrayList<ScheduleJob> joblist = new ArrayList<ScheduleJob>();
        boolean isToAll = false;
        boolean isbdMerged = NCCEnv.isDBMerged();
        if (!isbdMerged) {
            if (!StringUtils.isEmpty((CharSequence)modulecode) && "uap_toall".equals(modulecode)) {
                isToAll = true;
            }
            if ("1001Z01000000003KXB6".equals(registry.getPrimaryKey())) {
                isToAll = true;
            }
        }
        if (isToAll) {
            Set serverNameset = InstallProperties.getInstance().getAllService();
            if (serverNameset != null) {
                for (String serverName : serverNameset) {
                    ScheduleJob job = TaskUtil.createScheduleJob(registry, serverName, modulecode, taskClass);
                    job.setServerName(serverName);
                    job.setTaskName(serverName + "/" + registry.getMultiLangAlertname());
                    joblist.add(job);
                }
            }
        } else {
            ScheduleJob job = TaskUtil.createScheduleJob(registry, moduleserverName, modulecode, taskClass);
            joblist.add(job);
        }
        return joblist.toArray(new ScheduleJob[0]);
    }

    private static ScheduleJob createScheduleJob(AlertregistryVO registry, String serverName, String modulecode, String taskClass) {
        ScheduleJob job = new ScheduleJob();
        job.setTaskId(registry.getPrimaryKey());
        job.setGroupId(registry.getGroupId());
        job.setJobClassName("ncc.task.quartz.job.PreAlertJob");
        job.setDataSource(registry.getDataSource());
        if (job.getDataSource() == null) {
            job.setDataSource(InvocationInfoProxy.getInstance().getUserDataSource());
        }
        job.setTenant(job.getDataSource());
        job.setModuleCode(modulecode);
        job.setTaskClass(taskClass);
        job.setServerName(serverName);
        job.setTaskName(registry.getMultiLangAlertname());
        job.setTaskType(registry.getRegistrytype());
        job.setRunCount(0);
        job.setDr(0);
        job.setIsTiming(registry.getIstiming().toString());
        NCCTimeSettingVO timeSettingVO = TaskUtil.transferTimingSettingVO(registry.getTimingSettingVo());
        job.setTimeSettingVO(timeSettingVO);
        return job;
    }

    public static NCCTimeSettingVO transferTimingSettingVO(TimingSettingVO timingSettingVO) {
        NCCTimeSettingVO timeConfigVO = null;
        if (timingSettingVO != null) {
            timeConfigVO = new NCCTimeSettingVO();
            timeConfigVO.setEffibegindate(timingSettingVO.getEffibegindate());
            timeConfigVO.setEffibegintime(timingSettingVO.getEffibegintime());
            timeConfigVO.setEffienddate(timingSettingVO.getEffienddate());
            timeConfigVO.setEffiendtime(timingSettingVO.getEffiendtime());
            timeConfigVO.setEndtime(timingSettingVO.getEndtime());
            timeConfigVO.setExecuteday(timingSettingVO.getExecuteday());
            timeConfigVO.setExecuteinterval(timingSettingVO.getExecuteinterval());
            timeConfigVO.setExecutetime(timingSettingVO.getExecutetime());
            timeConfigVO.setExeintervalunit(timingSettingVO.getExeintervalunit());
            timeConfigVO.setFrequencytype(timingSettingVO.getFrequencytype());
            timeConfigVO.setIntervaltime(timingSettingVO.getIntervaltime());
            timeConfigVO.setIsruncycledaily(timingSettingVO.getIsruncycledaily().toString());
            timeConfigVO.setPkReference(timingSettingVO.getPk_reference());
            timeConfigVO.setPkTimeconfig(timingSettingVO.getPrimaryKey());
            timeConfigVO.setStarttime(timingSettingVO.getStarttime());
            timeConfigVO.setTimezone(timingSettingVO.getTimezone());
            timeConfigVO.setDr(0L);
        }
        return timeConfigVO;
    }

    private static String getDevmodule(String modulecode, AlerttypeVO type) throws DAOException {
        if (type != null && type.getTasktype() == 0 && type.getCategory() != null && type.getCategory().equalsIgnoreCase("custom")) {
            Iterator iterator;
            Collection modules = new BaseDAO().retrieveByClause(ModuleVO.class, " systypecode='" + modulecode + "'");
            ModuleVO module = null;
            if (CollectionUtils.isNotEmpty((Collection)modules) && (iterator = modules.iterator()).hasNext()) {
                ModuleVO vo;
                module = vo = (ModuleVO)iterator.next();
            }
            if (module != null && module.getDevmodule() != null) {
                modulecode = module.getDevmodule();
            }
        }
        return modulecode;
    }
}

