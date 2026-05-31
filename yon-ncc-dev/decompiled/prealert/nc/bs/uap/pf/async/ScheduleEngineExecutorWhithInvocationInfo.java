/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.InvocationInfo
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.framework.server.ServerConfiguration
 *  nc.bs.logging.Logger
 *  nc.bs.uap.scheduler.ITask
 *  nc.bs.uap.scheduler.ITaskBody
 *  nc.bs.uap.scheduler.ITaskJudger
 *  nc.bs.uap.scheduler.ITaskManager
 *  nc.vo.pub.BusinessException
 *  nc.vo.uap.scheduler.TaskPriority
 *  nc.vo.uap.scheduler.TaskStatus
 *  nc.vo.uap.scheduler.TimeConfigVO
 */
package nc.bs.uap.pf.async;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import nc.bs.framework.common.InvocationInfo;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.framework.common.NCLocator;
import nc.bs.framework.server.ServerConfiguration;
import nc.bs.logging.Logger;
import nc.bs.uap.scheduler.ITask;
import nc.bs.uap.scheduler.ITaskBody;
import nc.bs.uap.scheduler.ITaskJudger;
import nc.bs.uap.scheduler.ITaskManager;
import nc.vo.pub.BusinessException;
import nc.vo.uap.scheduler.TaskPriority;
import nc.vo.uap.scheduler.TaskStatus;
import nc.vo.uap.scheduler.TimeConfigVO;

public class ScheduleEngineExecutorWhithInvocationInfo
implements Executor {
    @Override
    public void execute(Runnable command) {
        if (this.isMaster()) {
            String message = "current business logic cannot be executed on master";
            Logger.error((Object)message, (Throwable)new Throwable());
            return;
        }
        ITaskManager mgr = (ITaskManager)NCLocator.getInstance().lookup(ITaskManager.class);
        InvocationInfoProxy.getInstance();
        Boolean forceSetCallServer = (Boolean)InvocationInfoProxy.forceSetCallServer.get();
        Map invocationInfo = InvocationInfoProxy.getInstance().getInvocationInfomation();
        InvocationInfo info = (InvocationInfo)invocationInfo.get("InvocationInfo");
        ConcurrentHashMap invProperties = (ConcurrentHashMap)invocationInfo.get("invProperties");
        Object clintInvocationInfoInstance = invocationInfo.get("ClientInvocationInfo");
        final RunnableProxy body = new RunnableProxy(command, info, forceSetCallServer, invProperties, clintInvocationInfoInstance, InvocationInfoProxy.getInstance());
        TimeConfigVO tc = new TimeConfigVO();
        tc.setJustInTime(true);
        mgr.add((ITask)new Task(tc, new ITaskBody(){
            private static final long serialVersionUID = 7181631954994294773L;

            public TaskStatus getStatus() {
                return null;
            }

            public void execute() throws BusinessException {
                try {
                    body.run();
                }
                catch (Exception e) {
                    throw new BusinessException((Throwable)e);
                }
            }

            public void cancelExecute() throws BusinessException {
            }
        }), TaskPriority.GENERAL);
    }

    private boolean isMaster() {
        ServerConfiguration sc = ServerConfiguration.getServerConfiguration();
        return !sc.isSingle() && sc.isMaster();
    }

    class RunnableProxy
    implements Runnable {
        Runnable realRunnable;
        InvocationInfoProxy infoProxy;
        InvocationInfo invocationInfo;
        Boolean forceSetCallServer;
        Map invProperties;
        Object clintInvocationInfoInstance;

        public RunnableProxy(Runnable realRunnable, InvocationInfo invocationInfo, Boolean forceSetCallServer, Map invProperties, Object clintInvocationInfoInstance, InvocationInfoProxy infoProxy) {
            this.realRunnable = realRunnable;
            this.invocationInfo = invocationInfo;
            this.forceSetCallServer = forceSetCallServer;
            this.invProperties = invProperties;
            this.clintInvocationInfoInstance = clintInvocationInfoInstance;
            this.infoProxy = infoProxy;
        }

        @Override
        public void run() {
            InvocationInfoProxy info = InvocationInfoProxy.getInstance();
            HashMap<String, Object> map = new HashMap<String, Object>(4, 1.0f);
            map.put("InvocationInfo", this.invocationInfo);
            map.put("ClientInvocationInfo", this.clintInvocationInfoInstance);
            map.put("invProperties", this.invocationInfo);
            info.setInvocationInfomation(map);
            InvocationInfoProxy.forceSetCallServer.set(this.forceSetCallServer);
            this.realRunnable.run();
        }

        public String toString() {
            return this.realRunnable.toString();
        }
    }

    class Task
    implements ITask {
        private static final long serialVersionUID = -774042430981254693L;
        private TimeConfigVO tc;
        ITaskBody body;

        public Task(TimeConfigVO tc, ITaskBody body) {
            this.tc = tc;
            this.body = body;
        }

        public String getType() {
            return null;
        }

        public TimeConfigVO getTimeConfig() {
            return this.tc;
        }

        public ITaskJudger getTaskJudger() {
            return null;
        }

        public ITaskBody getTaskBody() {
            return this.body;
        }

        public String getName() {
            return null;
        }
    }
}

