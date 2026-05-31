/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.diwork.ott.exexutors.RobotExecutors
 *  com.yonyou.iuap.yms.api.IYmsJdbcApi
 *  com.yonyou.iuap.yms.param.SQLParameter
 *  com.yonyou.ucf.mdd.ext.base.tenant.Tenant
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.option.util.OptionUtils
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.beans.factory.annotation.Qualifier
 *  org.springframework.stereotype.Service
 */
package com.yonyou.iuap.upc.dataupdate;

import com.yonyou.diwork.ott.exexutors.RobotExecutors;
import com.yonyou.iuap.upc.dataupdate.DataUpdateBaseServcie;
import com.yonyou.iuap.yms.api.IYmsJdbcApi;
import com.yonyou.iuap.yms.param.SQLParameter;
import com.yonyou.ucf.mdd.ext.base.tenant.Tenant;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.option.util.OptionUtils;
import java.util.concurrent.Callable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class DealWithProductUnitRateData
extends DataUpdateBaseServcie {
    Logger logger = LoggerFactory.getLogger(DealWithProductUnitRateData.class);
    @Autowired
    @Qualifier(value="busiBaseDAO")
    private IYmsJdbcApi ymsJdbcApi;

    @Override
    public int businessDataUpdate(Tenant tenant, int capacity) throws Exception {
        return this.upgradeUnitRate(tenant.getYTenantId());
    }

    public int dataUpdateForTenant(int capacity) throws Exception {
        Tenant tenant = new Tenant();
        tenant.setId(AppContext.getCurrentUser().getTenant());
        tenant.setYTenantId(AppContext.getCurrentUser().getYTenantId());
        return this.upgradeUnitRate(AppContext.getCurrentUser().getYTenantId());
    }

    @Override
    public String getTaskName() {
        return "\u6570\u636e\u6cbb\u7406\uff1a\u7269\u6599\u3001\u7269\u6599\u6a21\u677f\u66f4\u65b0\u8ba1\u91cf\u5355\u4f4d\u4e3b\u8f85\u6362\u7b97\u7387";
    }

    public int upgradeUnitRate(String ytenant) throws Exception {
        Callable<Object> call = () -> OptionUtils.getSysOptionByName((String)"conversionAccuracy");
        Object conversionAccuracy = RobotExecutors.runAs((String)ytenant, call);
        int scale = (conversionAccuracy == null ? 0 : (Integer)conversionAccuracy) > 2 ? (Integer)conversionAccuracy : 2;
        SQLParameter parameter = new SQLParameter();
        parameter.addParam(ytenant);
        int tenantProductCount = this.ymsJdbcApi.update("update  productassistunitexchange set fMainUnitCount=ROUND(mainUnitCount/fAssistUnitCount," + scale + "),mainUnitRate=ROUND(mainUnitCount/fAssistUnitCount," + scale + ") where  fMainUnitCount!=ROUND(mainUnitCount/fAssistUnitCount," + scale + ")  and ytenant_id  = ? ", parameter);
        int tenantProductTplCount = this.ymsJdbcApi.update("update  producttpl_assist_unitexchange set fMainUnitCount=ROUND(mainUnitCount/fAssistUnitCount," + scale + "),mainUnitRate=ROUND(mainUnitCount/fAssistUnitCount," + scale + ") where  fMainUnitCount!=ROUND(mainUnitCount/fAssistUnitCount," + scale + ")  and ytenant_id  = ? ", parameter);
        return tenantProductTplCount + tenantProductCount;
    }
}

