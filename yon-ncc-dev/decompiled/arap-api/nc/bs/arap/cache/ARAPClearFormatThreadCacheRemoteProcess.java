/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.component.RemoteProcessComponent
 */
package nc.bs.arap.cache;

import nc.bs.arap.cache.ARAPFormatThreadCache;
import nc.bs.framework.component.RemoteProcessComponent;

public class ARAPClearFormatThreadCacheRemoteProcess
implements RemoteProcessComponent {
    public void postErrorProcess(Throwable arg0) {
        this.clearThreadCache();
    }

    public void postProcess() {
        this.clearThreadCache();
    }

    private void clearThreadCache() {
        ARAPFormatThreadCache.getInstance().removeCache();
    }

    public void preProcess() {
    }
}

