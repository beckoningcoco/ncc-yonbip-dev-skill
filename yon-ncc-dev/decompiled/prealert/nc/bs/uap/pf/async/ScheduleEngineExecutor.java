/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.server.ServerConfiguration
 *  nc.bs.logging.Logger
 */
package nc.bs.uap.pf.async;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import nc.bs.framework.server.ServerConfiguration;
import nc.bs.logging.Logger;

@Deprecated
public class ScheduleEngineExecutor
implements Executor {
    public static ExecutorService fixedThreadPool = new ThreadPoolExecutor(Runtime.getRuntime().availableProcessors() * 2, Runtime.getRuntime().availableProcessors() * 2, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>(1024), new ThreadPoolExecutor.AbortPolicy());

    @Override
    public void execute(Runnable runnable) {
        if (this.isMaster()) {
            String message = "current business logic cannot be executed on master";
            Logger.error((Object)message, (Throwable)new Throwable());
            return;
        }
        fixedThreadPool.submit(runnable);
    }

    private boolean isMaster() {
        ServerConfiguration sc = ServerConfiguration.getServerConfiguration();
        return !sc.isSingle() && sc.isMaster();
    }
}

