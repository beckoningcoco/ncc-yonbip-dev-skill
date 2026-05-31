/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.constant.ApplicationCodeConstant
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyoucloud.uretail.sys.auth.DataPermissionResponseDto
 *  com.yonyoucloud.uretail.sys.pubItf.IDataPermissionService
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 */
package com.yonyoucloud.upc.service;

import com.yonyou.iuap.apdoc.coredoc.constant.ApplicationCodeConstant;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyoucloud.iuap.upc.api.service.IUPCDataAuthService;
import com.yonyoucloud.uretail.sys.auth.DataPermissionResponseDto;
import com.yonyoucloud.uretail.sys.pubItf.IDataPermissionService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UPCDataAuthService
implements IUPCDataAuthService {
    private static final Logger log = LoggerFactory.getLogger(UPCDataAuthService.class);
    @Autowired
    private IDataPermissionService dataPermissionService;

    @Override
    public Map<String, List<String>> getDataPermission(String[] fullnameArgs) throws Exception {
        HashMap<String, List<String>> resultMap = new HashMap<String, List<String>>();
        if (fullnameArgs != null && fullnameArgs.length > 0) {
            DataPermissionResponseDto dataPermissionResponseDto = this.dataPermissionService.getDataPermissionBySysCode(ApplicationCodeConstant.getApplicationCodeByFullName((String)fullnameArgs[0]), false, fullnameArgs);
            log.info("=========>  dataPermissionMapList:" + dataPermissionResponseDto.getDataPermissionMapList());
            List dataPermissionMapList = dataPermissionResponseDto.getDataPermissionMapList();
            for (Map dataPermission : dataPermissionMapList) {
                String fullname = (String)dataPermission.get("fullname");
                List ids = SqlHelper.selectList((String)"com.yonyoucloud.upc.aa.auth.getDataAuth", (Object)dataPermission);
                resultMap.put(fullname, ids);
            }
        }
        return resultMap;
    }
}

