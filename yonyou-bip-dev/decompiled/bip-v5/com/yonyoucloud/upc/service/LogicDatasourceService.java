/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 */
package com.yonyoucloud.upc.service;

import com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogicDatasourceService {
    @Autowired
    private YMSParamConfig ymsParamConfig;

    public String getLogicDatasource() {
        return "iuap-apdoc-material_main_dataSource";
    }
}

