/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.framework.component.RemoteProcessComponent
 *  nc.bs.framework.component.RemoteProcessComponetFactory
 *  nc.ui.format.FormatMetaAccessor
 *  nc.ui.format.FormatMetaException
 *  nc.vo.pub.format.AbstractFormat
 *  nc.vo.pub.format.DateFormat
 *  nc.vo.pub.format.NumberFormat
 *  nc.vo.pub.format.TimeFormat
 *  nc.vo.pub.format.exception.FormatException
 *  nc.vo.pub.format.meta.DateFormatMeta
 *  nc.vo.pub.format.meta.NumberFormatMeta
 *  nc.vo.pub.format.meta.TimeFormatMeta
 */
package nc.bs.arap.cache;

import java.util.HashMap;
import nc.bs.arap.cache.ARAPClearFormatThreadCacheRemoteProcess;
import nc.bs.framework.common.NCLocator;
import nc.bs.framework.component.RemoteProcessComponent;
import nc.bs.framework.component.RemoteProcessComponetFactory;
import nc.ui.format.FormatMetaAccessor;
import nc.ui.format.FormatMetaException;
import nc.vo.pub.format.AbstractFormat;
import nc.vo.pub.format.DateFormat;
import nc.vo.pub.format.NumberFormat;
import nc.vo.pub.format.TimeFormat;
import nc.vo.pub.format.exception.FormatException;
import nc.vo.pub.format.meta.DateFormatMeta;
import nc.vo.pub.format.meta.NumberFormatMeta;
import nc.vo.pub.format.meta.TimeFormatMeta;

public class ARAPFormatThreadCache {
    private ThreadLocal<HashMap<String, AbstractFormat>> formatCache = new ThreadLocal();
    private String key_number = "number";
    private String key_date = "date";
    private String key_time = "time";
    private static ARAPFormatThreadCache cache;

    private ARAPFormatThreadCache() {
    }

    public static synchronized ARAPFormatThreadCache getInstance() {
        if (cache == null) {
            cache = new ARAPFormatThreadCache();
        }
        return cache;
    }

    public void removeCache() {
        this.formatCache.set(null);
    }

    public NumberFormat getNumberFormat() throws FormatException {
        if (this.formatCache.get() == null) {
            this.loadFormatMeta();
        }
        return (NumberFormat)this.formatCache.get().get(this.key_number);
    }

    public DateFormat getDateFormat() throws FormatException {
        if (this.formatCache.get() == null) {
            this.loadFormatMeta();
        }
        return (DateFormat)this.formatCache.get().get(this.key_date);
    }

    public TimeFormat getTimeFormat() throws FormatException {
        if (this.formatCache.get() == null) {
            this.loadFormatMeta();
        }
        return (TimeFormat)this.formatCache.get().get(this.key_time);
    }

    private void loadFormatMeta() throws FormatException {
        HashMap<String, Object> map = new HashMap<String, Object>();
        try {
            NumberFormatMeta nfm = FormatMetaAccessor.getNumberFormatMeta();
            NumberFormat nf = new NumberFormat(nfm);
            map.put(this.key_number, nf);
            DateFormatMeta dfm = FormatMetaAccessor.getDateFormatMeta();
            DateFormat df = new DateFormat(dfm);
            map.put(this.key_date, df);
            TimeFormatMeta tfm = FormatMetaAccessor.getTimeFormatMeta();
            TimeFormat tf = new TimeFormat(tfm);
            map.put(this.key_time, tf);
        }
        catch (FormatMetaException e) {
            throw new FormatException((Throwable)e);
        }
        this.formatCache.set(map);
        RemoteProcessComponetFactory irc = (RemoteProcessComponetFactory)NCLocator.getInstance().lookup("RemoteProcessComponetFactory");
        ARAPClearFormatThreadCacheRemoteProcess cleaner = new ARAPClearFormatThreadCacheRemoteProcess();
        irc.addThreadScopePostProcess(ARAPClearFormatThreadCacheRemoteProcess.class.getName(), (RemoteProcessComponent)cleaner);
    }
}

