/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.lang.UFDate
 */
package nc.vo.pub.pa;

import java.io.Serializable;
import java.util.LinkedHashMap;
import nc.vo.pub.lang.UFDate;
import uap.vo.prealert.engine.EngineContext;
import uap.vo.prealert.engine.receiver.ReceiverContext;

public interface ICurrEnvVO
extends Serializable {
    @Deprecated
    public String getPk_org();

    @Deprecated
    public void setPk_org(String var1);

    public String[] getPk_orgs();

    public void setPk_orgs(String[] var1);

    public EngineContext getEngineContext();

    public void setEngineContext(EngineContext var1);

    public int getAlertMode();

    public String getAlertTypeName();

    public String getPk_user();

    public Object getUserData();

    public void setAlertMode(int var1);

    public void setAlertTypeName(String var1);

    public void setPk_user(String var1);

    public void setUserData(Object var1);

    public String getRegistryName();

    public void setRegistryName(String var1);

    public String getRegistryFileName();

    public void setRegistryFileName(String var1);

    @Deprecated
    public String getGroupId();

    public void setGroupId(String var1);

    public LinkedHashMap<String, Object> getKeyMap();

    public void setLogStr(String var1);

    public String getLogString();

    @Deprecated
    public String getDatasource();

    @Deprecated
    public void setDatasource(String var1);

    @Deprecated
    public UFDate getLoginDate();

    public void setLoginDate(UFDate var1);

    public String getPk_registry();

    public void setPk_registry(String var1);

    public ReceiverContext getReceiverContext();

    public String[] getSelfDefRcvCodes();

    public void setSelfDefRcvCodes(String[] var1);
}

