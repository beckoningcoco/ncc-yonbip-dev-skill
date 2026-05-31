/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.framework.component.RemoteProcessComponent
 *  nc.bs.framework.component.RemoteProcessComponetFactory
 *  nc.pubitf.rbac.IDataPermissionPubService
 *  nc.ui.format.FormatMetaAccessor
 *  nc.ui.format.FormatMetaException
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.format.AbstractFormat
 *  nc.vo.pub.format.DateFormat
 *  nc.vo.pub.format.NumberFormat
 *  nc.vo.pub.format.TimeFormat
 *  nc.vo.pub.format.exception.FormatException
 *  nc.vo.pub.format.meta.DateFormatMeta
 *  nc.vo.pub.format.meta.NumberFormatMeta
 *  nc.vo.pub.format.meta.TimeFormatMeta
 */
package nc.web.arap.util;

import java.util.HashMap;
import nc.bs.framework.common.NCLocator;
import nc.bs.framework.component.RemoteProcessComponent;
import nc.bs.framework.component.RemoteProcessComponetFactory;
import nc.pubitf.rbac.IDataPermissionPubService;
import nc.ui.format.FormatMetaAccessor;
import nc.ui.format.FormatMetaException;
import nc.vo.pub.BusinessException;
import nc.vo.pub.format.AbstractFormat;
import nc.vo.pub.format.DateFormat;
import nc.vo.pub.format.NumberFormat;
import nc.vo.pub.format.TimeFormat;
import nc.vo.pub.format.exception.FormatException;
import nc.vo.pub.format.meta.DateFormatMeta;
import nc.vo.pub.format.meta.NumberFormatMeta;
import nc.vo.pub.format.meta.TimeFormatMeta;

public class ArapThreadCache {
    private ThreadLocal<HashMap<String, AbstractFormat>> formatCache = new ThreadLocal();
    private ThreadLocal<HashMap<String, String[]>> tableNameCache = new ThreadLocal();
    private ThreadLocal<HashMap<String, String>> materialNameCache = new ThreadLocal();
    private ThreadLocal<HashMap<String, String>> customerNameCache = new ThreadLocal();
    private ThreadLocal<HashMap<String, String>> supplierNameCache = new ThreadLocal();
    private ThreadLocal<HashMap<String, String[]>> cus_supplierNameCache = new ThreadLocal();
    private String key_number = "number";
    private String key_date = "date";
    private String key_time = "time";
    private String key_tableName = "tablename";
    private String key_customerName = "customerName";
    private String key_materialName = "materialName";
    private String key_supplierName = "supplierName";
    private String key_cus_supplierName = "cus_supplierName";
    private static ArapThreadCache cache;

    private ArapThreadCache() {
    }

    public static synchronized ArapThreadCache getInstance() {
        if (cache == null) {
            cache = new ArapThreadCache();
        }
        return cache;
    }

    public void removeCache() {
        this.formatCache.set(null);
        this.tableNameCache.set(null);
        this.materialNameCache.set(null);
        this.customerNameCache.set(null);
        this.supplierNameCache.set(null);
        this.cus_supplierNameCache.set(null);
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

    public String getMaterialTable(String cuserid, String beanID, String operationcode, String pk_group) throws BusinessException {
        if (this.materialNameCache.get() == null) {
            this.loadMaterialTable(cuserid, beanID, operationcode, pk_group);
        }
        return this.materialNameCache.get().get(this.key_materialName);
    }

    public String getMaterialTables(String cuserid, String[] beanID, String operationcode, String pk_group) throws BusinessException {
        if (this.materialNameCache.get() == null) {
            this.loadMaterialTables(cuserid, beanID, operationcode, pk_group);
        }
        return this.materialNameCache.get().get(this.key_materialName);
    }

    public String getCustomerTable(String cuserid, String beanID, String operationcode, String pk_group) throws BusinessException {
        if (this.customerNameCache.get() == null) {
            this.loadCustomerTable(cuserid, beanID, operationcode, pk_group);
        }
        return this.customerNameCache.get().get(this.key_customerName);
    }

    public String getCustomerTables(String cuserid, String[] beanID, String operationcode, String pk_group) throws BusinessException {
        if (this.customerNameCache.get() == null) {
            this.loadCustomerTables(cuserid, beanID, operationcode, pk_group);
        }
        return this.customerNameCache.get().get(this.key_customerName);
    }

    public String getSupplierTables(String cuserid, String[] beanID, String operationcode, String pk_group) throws BusinessException {
        if (this.supplierNameCache.get() == null) {
            this.loadSupplierTables(cuserid, beanID, operationcode, pk_group);
        }
        return this.supplierNameCache.get().get(this.key_supplierName);
    }

    public String[] getCusSupplierTables(String cuserid, String[] beanID, String[] operationcode, String pk_group) throws BusinessException {
        if (this.cus_supplierNameCache.get() == null) {
            this.loadCusSupplierTables(cuserid, beanID, operationcode, pk_group);
        }
        return this.cus_supplierNameCache.get().get(this.key_cus_supplierName);
    }

    public String[] getTmpTables(String cuserid, String[] beanID, String[] operationcode, String pk_group) throws BusinessException {
        if (this.tableNameCache.get() == null) {
            this.loadTmpTables(cuserid, beanID, operationcode, pk_group);
        }
        return this.tableNameCache.get().get(this.key_tableName);
    }

    private void loadCusSupplierTables(String cuserid, String[] beanID, String[] operationcode, String pk_group) throws BusinessException {
        HashMap<String, String[]> map = new HashMap<String, String[]>();
        String[] tmpTables = ((IDataPermissionPubService)NCLocator.getInstance().lookup(IDataPermissionPubService.class)).getDataPermProfileTableNameByBeanID(cuserid, beanID, operationcode, pk_group);
        map.put(this.key_cus_supplierName, tmpTables);
        this.cus_supplierNameCache.set(map);
        RemoteProcessComponetFactory irc = (RemoteProcessComponetFactory)NCLocator.getInstance().lookup("RemoteProcessComponetFactory");
        ArapClearFormatThreadCacheRemoteProcess cleaner = new ArapClearFormatThreadCacheRemoteProcess();
        irc.addThreadScopePostProcess(ArapClearFormatThreadCacheRemoteProcess.class.getName(), (RemoteProcessComponent)cleaner);
    }

    private void loadSupplierTables(String cuserid, String[] beanID, String operationcode, String pk_group) throws BusinessException {
        HashMap<String, String> map = new HashMap<String, String>();
        String[] tmpTables = ((IDataPermissionPubService)NCLocator.getInstance().lookup(IDataPermissionPubService.class)).getDataPermProfileTableNameByBeanID(cuserid, beanID, new String[]{operationcode}, pk_group);
        StringBuilder tmp = new StringBuilder();
        for (String tmpTable : tmpTables) {
            tmp.append(tmpTable + ",");
        }
        map.put(this.key_supplierName, tmp.toString());
        this.supplierNameCache.set(map);
        RemoteProcessComponetFactory irc = (RemoteProcessComponetFactory)NCLocator.getInstance().lookup("RemoteProcessComponetFactory");
        ArapClearFormatThreadCacheRemoteProcess cleaner = new ArapClearFormatThreadCacheRemoteProcess();
        irc.addThreadScopePostProcess(ArapClearFormatThreadCacheRemoteProcess.class.getName(), (RemoteProcessComponent)cleaner);
    }

    private void loadMaterialTable(String cuserid, String beanID, String operationcode, String pk_group) throws BusinessException {
        HashMap<String, String> map = new HashMap<String, String>();
        String tmpTables = ((IDataPermissionPubService)NCLocator.getInstance().lookup(IDataPermissionPubService.class)).getDataPermProfileTableNameByBeanID(cuserid, beanID, operationcode, pk_group);
        map.put(this.key_materialName, tmpTables);
        this.materialNameCache.set(map);
        RemoteProcessComponetFactory irc = (RemoteProcessComponetFactory)NCLocator.getInstance().lookup("RemoteProcessComponetFactory");
        ArapClearFormatThreadCacheRemoteProcess cleaner = new ArapClearFormatThreadCacheRemoteProcess();
        irc.addThreadScopePostProcess(ArapClearFormatThreadCacheRemoteProcess.class.getName(), (RemoteProcessComponent)cleaner);
    }

    private void loadMaterialTables(String cuserid, String[] beanID, String operationcode, String pk_group) throws BusinessException {
        HashMap<String, String> map = new HashMap<String, String>();
        String[] tmpTables = ((IDataPermissionPubService)NCLocator.getInstance().lookup(IDataPermissionPubService.class)).getDataPermProfileTableNameByBeanID(cuserid, beanID, new String[]{operationcode}, pk_group);
        StringBuilder tmp = new StringBuilder();
        for (String tmpTable : tmpTables) {
            tmp.append(tmpTable + ",");
        }
        map.put(this.key_materialName, tmp.toString());
        this.materialNameCache.set(map);
        RemoteProcessComponetFactory irc = (RemoteProcessComponetFactory)NCLocator.getInstance().lookup("RemoteProcessComponetFactory");
        ArapClearFormatThreadCacheRemoteProcess cleaner = new ArapClearFormatThreadCacheRemoteProcess();
        irc.addThreadScopePostProcess(ArapClearFormatThreadCacheRemoteProcess.class.getName(), (RemoteProcessComponent)cleaner);
    }

    private void loadCustomerTable(String cuserid, String beanID, String operationcode, String pk_group) throws BusinessException {
        HashMap<String, String> map = new HashMap<String, String>();
        String tmpTables = ((IDataPermissionPubService)NCLocator.getInstance().lookup(IDataPermissionPubService.class)).getDataPermProfileTableNameByBeanID(cuserid, beanID, operationcode, pk_group);
        map.put(this.key_customerName, tmpTables);
        this.customerNameCache.set(map);
        RemoteProcessComponetFactory irc = (RemoteProcessComponetFactory)NCLocator.getInstance().lookup("RemoteProcessComponetFactory");
        ArapClearFormatThreadCacheRemoteProcess cleaner = new ArapClearFormatThreadCacheRemoteProcess();
        irc.addThreadScopePostProcess(ArapClearFormatThreadCacheRemoteProcess.class.getName(), (RemoteProcessComponent)cleaner);
    }

    private void loadCustomerTables(String cuserid, String[] beanID, String operationcode, String pk_group) throws BusinessException {
        HashMap<String, String> map = new HashMap<String, String>();
        String[] tmpTables = ((IDataPermissionPubService)NCLocator.getInstance().lookup(IDataPermissionPubService.class)).getDataPermProfileTableNameByBeanID(cuserid, beanID, new String[]{operationcode}, pk_group);
        StringBuilder tmp = new StringBuilder();
        for (String tmpTable : tmpTables) {
            tmp.append(tmpTable + ",");
        }
        map.put(this.key_customerName, tmp.toString());
        this.customerNameCache.set(map);
        RemoteProcessComponetFactory irc = (RemoteProcessComponetFactory)NCLocator.getInstance().lookup("RemoteProcessComponetFactory");
        ArapClearFormatThreadCacheRemoteProcess cleaner = new ArapClearFormatThreadCacheRemoteProcess();
        irc.addThreadScopePostProcess(ArapClearFormatThreadCacheRemoteProcess.class.getName(), (RemoteProcessComponent)cleaner);
    }

    private void loadTmpTables(String cuserid, String[] beanID, String[] operationcode, String pk_group) throws BusinessException {
        HashMap<String, String[]> map = new HashMap<String, String[]>();
        String[] tmpTables = ((IDataPermissionPubService)NCLocator.getInstance().lookup(IDataPermissionPubService.class)).getDataPermProfileTableNameByBeanID(cuserid, beanID, operationcode, pk_group);
        map.put(this.key_tableName, tmpTables);
        this.tableNameCache.set(map);
        RemoteProcessComponetFactory irc = (RemoteProcessComponetFactory)NCLocator.getInstance().lookup("RemoteProcessComponetFactory");
        ArapClearFormatThreadCacheRemoteProcess cleaner = new ArapClearFormatThreadCacheRemoteProcess();
        irc.addThreadScopePostProcess(ArapClearFormatThreadCacheRemoteProcess.class.getName(), (RemoteProcessComponent)cleaner);
    }

    private void loadFormatMeta() throws FormatException {
        HashMap<String, Object> map = new HashMap<String, Object>();
        try {
            NumberFormatMeta nfm = FormatMetaAccessor.getNumberFormatMeta();
            nfm.setMarkSymbol(",");
            nfm.setPointSymbol(".");
            nfm.setNegativeFormat("-n");
            NumberFormat nf = new NumberFormat(nfm);
            map.put(this.key_number, nf);
            DateFormatMeta dfm = FormatMetaAccessor.getDateFormatMeta();
            dfm.setFormat("yyyy-MM-dd");
            dfm.setSperatorSymbol("-");
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
        ArapClearFormatThreadCacheRemoteProcess cleaner = new ArapClearFormatThreadCacheRemoteProcess();
        irc.addThreadScopePostProcess(ArapClearFormatThreadCacheRemoteProcess.class.getName(), (RemoteProcessComponent)cleaner);
    }

    class ArapClearFormatThreadCacheRemoteProcess
    implements RemoteProcessComponent {
        ArapClearFormatThreadCacheRemoteProcess() {
        }

        public void postErrorProcess(Throwable arg0) {
            this.clearThreadCache();
        }

        public void postProcess() {
            this.clearThreadCache();
        }

        public void preProcess() {
        }

        private void clearThreadCache() {
            ArapThreadCache.getInstance().removeCache();
        }
    }
}

