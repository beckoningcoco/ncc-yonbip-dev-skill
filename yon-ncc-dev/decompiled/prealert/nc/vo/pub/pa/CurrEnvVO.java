/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.lang.UFDate
 */
package nc.vo.pub.pa;

import java.util.LinkedHashMap;
import nc.bs.pub.pa.PreAlertContext;
import nc.bs.pub.taskcenter.BgWorkingContext;
import nc.vo.pub.lang.UFDate;
import uap.vo.prealert.engine.EngineContext;
import uap.vo.prealert.engine.receiver.ReceiverContext;

public class CurrEnvVO
implements PreAlertContext,
BgWorkingContext {
    private String datasource;
    private String groupId;
    @Deprecated
    private String pk_org;
    private String[] pk_orgs;
    private String pk_registry;
    private String pk_user;
    @Deprecated
    private UFDate loginDate;
    private String preAlertTypeName;
    private String registryName;
    private String registryFileName;
    private int preAlertMode;
    private LinkedHashMap<String, Object> keyMap;
    private EngineContext engineContext;
    private Object userData;
    private String logString;
    private String[] selfDefRcvCodes;

    @Override
    public String getPk_org() {
        return this.pk_org;
    }

    @Override
    public void setPk_org(String pk_org) {
        this.pk_org = pk_org;
    }

    @Override
    public String[] getPk_orgs() {
        return this.pk_orgs;
    }

    @Override
    public void setPk_orgs(String[] pk_orgs) {
        this.pk_orgs = pk_orgs;
    }

    @Override
    public EngineContext getEngineContext() {
        return this.engineContext;
    }

    @Override
    public void setEngineContext(EngineContext engineContext) {
        this.engineContext = engineContext;
    }

    @Override
    public int getAlertMode() {
        return this.preAlertMode;
    }

    @Override
    public String getAlertTypeName() {
        return this.preAlertTypeName;
    }

    @Override
    public String getPk_user() {
        return this.pk_user;
    }

    @Override
    public Object getUserData() {
        return this.userData;
    }

    @Override
    public void setAlertMode(int newAlertMethod) {
        this.preAlertMode = newAlertMethod;
    }

    @Override
    public void setAlertTypeName(String newAlertTypeName) {
        this.preAlertTypeName = newAlertTypeName;
    }

    @Override
    public void setPk_user(String newPk_user) {
        this.pk_user = newPk_user;
    }

    @Override
    public void setUserData(Object newUserData) {
        this.userData = newUserData;
    }

    @Override
    public String getRegistryName() {
        return this.registryName;
    }

    @Override
    public void setRegistryName(String registryName) {
        this.registryName = registryName;
    }

    @Override
    public String getRegistryFileName() {
        return this.registryFileName;
    }

    @Override
    public void setRegistryFileName(String registryFileName) {
        this.registryFileName = registryFileName;
    }

    @Override
    public String getGroupId() {
        return this.groupId;
    }

    @Override
    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    @Override
    public LinkedHashMap<String, Object> getKeyMap() {
        if (this.keyMap == null) {
            this.keyMap = new LinkedHashMap();
        }
        return this.keyMap;
    }

    @Override
    public void setLogStr(String logString) {
        this.logString = logString;
    }

    @Override
    public String getLogString() {
        return this.logString;
    }

    @Override
    public String getDatasource() {
        return this.datasource;
    }

    @Override
    public void setDatasource(String datasource) {
        this.datasource = datasource;
    }

    @Override
    public UFDate getLoginDate() {
        return this.loginDate;
    }

    @Override
    public void setLoginDate(UFDate loginDate) {
        this.loginDate = loginDate;
    }

    @Override
    public String getPk_registry() {
        return this.pk_registry;
    }

    @Override
    public void setPk_registry(String pk_registry) {
        this.pk_registry = pk_registry;
    }

    @Override
    public ReceiverContext getReceiverContext() {
        return this.engineContext.getReceiverContext();
    }

    @Override
    public String[] getSelfDefRcvCodes() {
        return this.selfDefRcvCodes;
    }

    @Override
    public void setSelfDefRcvCodes(String[] codes) {
        this.selfDefRcvCodes = codes;
    }
}

