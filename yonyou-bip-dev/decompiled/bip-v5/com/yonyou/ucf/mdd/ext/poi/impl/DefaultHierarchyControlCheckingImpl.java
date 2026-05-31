/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.data.service.itf.TenantStatusApi
 *  com.yonyou.iuap.dto.CheckMCSetDTO
 *  com.yonyou.iuap.org.dto.TenantMultiOrgInfo
 *  com.yonyou.iuap.service.MCSetManageService
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.common.model.uimeta.ui.Entity
 *  com.yonyou.ucf.mdd.common.model.uimeta.ui.Field
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dubbo.DubboReferenceUtils
 *  com.yonyou.ucf.mdd.ext.poi.api.ImportProvilegeChecking
 *  com.yonyou.ucf.mdd.ext.poi.context.ImportContext
 *  com.yonyou.ucf.mdd.ext.poi.enums.ImportPromptMsgEnum
 *  com.yonyou.ucf.mdd.ext.poi.exception.ImportSkipRowException
 *  org.imeta.core.model.Entity
 *  org.imeta.core.model.Property
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.boot.autoconfigure.condition.ConditionalOnClass
 *  org.springframework.core.annotation.Order
 *  org.springframework.stereotype.Component
 */
package com.yonyou.ucf.mdd.ext.poi.impl;

import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.data.service.itf.TenantStatusApi;
import com.yonyou.iuap.dto.CheckMCSetDTO;
import com.yonyou.iuap.org.dto.TenantMultiOrgInfo;
import com.yonyou.iuap.service.MCSetManageService;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.common.model.uimeta.ui.Field;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dubbo.DubboReferenceUtils;
import com.yonyou.ucf.mdd.ext.poi.api.ImportProvilegeChecking;
import com.yonyou.ucf.mdd.ext.poi.context.ImportContext;
import com.yonyou.ucf.mdd.ext.poi.enums.ImportPromptMsgEnum;
import com.yonyou.ucf.mdd.ext.poi.exception.ImportSkipRowException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.imeta.core.model.Entity;
import org.imeta.core.model.Property;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnClass(value={MCSetManageService.class, TenantStatusApi.class})
@Order(value=2)
public class DefaultHierarchyControlCheckingImpl
implements ImportProvilegeChecking {
    private static final Logger log = LoggerFactory.getLogger(DefaultHierarchyControlCheckingImpl.class);
    public static final String DEFAULT_SYSID = "diwork";
    @Autowired
    private TenantStatusApi tenantStatusApi;

    private boolean isMCDocType(String fullname, MCSetManageService mcSetManageService) throws Exception {
        CheckMCSetDTO checkMCSetDTO = new CheckMCSetDTO();
        checkMCSetDTO.setTenantid(AppContext.getCurrentUser().getYhtTenantId());
        checkMCSetDTO.setSysid(DEFAULT_SYSID);
        checkMCSetDTO.setDoctype(fullname);
        return mcSetManageService.checkMCSet(checkMCSetDTO);
    }

    private boolean isOrgMulti() throws CoreDocBusinessException {
        TenantMultiOrgInfo tenantMultiOrgInfo;
        if (this.tenantStatusApi == null) {
            this.tenantStatusApi = (TenantStatusApi)DubboReferenceUtils.getDubboService(TenantStatusApi.class, (String)"orgcenter", null);
        }
        try {
            tenantMultiOrgInfo = this.tenantStatusApi.getTenantMultiOrgInfo(AppContext.getCurrentUser().getYhtTenantId(), DEFAULT_SYSID);
        }
        catch (Exception e) {
            log.error("\u83b7\u53d6\u79df\u6237\u7ec4\u7ec7\u7c7b\u578bTenantMultiOrgInfo\u5931\u8d25,\u5206\u7ea7\u7ba1\u63a7\u6821\u9a8c\u53ef\u80fd\u5931\u8d25 " + e.getMessage());
            throw new CoreDocBusinessException(InternationalUtils.getMessage((String)"P_YS_PF_GZTBDM_0000036383"));
        }
        return tenantMultiOrgInfo != null && "multi".equalsIgnoreCase(tenantMultiOrgInfo.getType());
    }

    public void checkPrivilege(ImportContext ctx, Entity entity, Map<String, Object> row, String sheetName, StringBuilder errorMessage) throws Exception {
        if (entity == null) {
            log.info("\u5143\u6570\u636e\u5b9e\u4f53\u4e0d\u80fd\u4e3a\u7a7a,\u5c06\u8df3\u8fc7\u5206\u7ea7\u7ba1\u63a7\u6821\u9a8c");
            return;
        }
        if (row == null || row.size() == 0) {
            log.info("sheet\u5185\u6570\u4e3a\u7a7a,\u5c06\u8df3\u8fc7\u5206\u7ea7\u7ba1\u63a7\u6821\u9a8c");
            return;
        }
        MCSetManageService mcSetManageService = (MCSetManageService)AppContext.getBean(MCSetManageService.class);
        if (mcSetManageService == null) {
            log.info("\u672a\u6ce8\u518c\u5206\u7ea7\u7ba1\u63a7BEAN\uff0c\u4eceRPC\u6ce8\u518c\u4e2d\u5fc3\u83b7\u53d6\u5b9e\u73b0");
            mcSetManageService = (MCSetManageService)DubboReferenceUtils.getDubboService(MCSetManageService.class, (String)"ucfmcservice", null);
        }
        if (null == mcSetManageService) {
            log.info("\u672a\u6ce8\u518c\u5206\u7ea7\u7ba1\u63a7BEAN\uff0c\u4e5f\u672a\u80fd\u4eceRPC\u6ce8\u518c\u4e2d\u5fc3\u83b7\u53d6\u5b9e\u73b0\uff0c\u8df3\u8fc7\u5206\u7ea7\u7ba1\u63a7\u6821\u9a8c");
            return;
        }
        if (!this.isMCDocType(ctx.getBillContext().getFullname(), mcSetManageService)) {
            return;
        }
        if ("unknown".equalsIgnoreCase(ctx.getOrgType())) {
            if (this.isOrgMulti()) {
                ctx.setOrgType("multi");
            } else {
                ctx.setOrgType("single");
            }
        }
        if ("single".equalsIgnoreCase(ctx.getOrgType())) {
            log.info("\u5f53\u524d\u79df\u6237\u4e3a\u5355\u7ec4\u7ec7\u7c7b\u578b,\u5c06\u8df3\u8fc7\u5206\u7ea7\u7ba1\u63a7\u6821\u9a8c");
            return;
        }
        Iterator attrItr = entity.attrMap().iterator();
        Property orgProp = null;
        while (attrItr.hasNext()) {
            Property prop = (Property)attrItr.next();
            if (!prop.isAppearance()) continue;
            orgProp = prop;
            break;
        }
        if (orgProp == null) {
            log.info("\u5f53\u524dsheet\u6570\u636e\u5bf9\u5e94\u7684\u5143\u6570\u636e\u4e0d\u5305\u542b\u4e3b\u7ec4\u7ec7\u5c5e\u6027(isMasterOrg=true),\u5c06\u8df3\u8fc7\u5206\u7ea7\u7ba1\u63a7\u6821\u9a8c");
            return;
        }
        Field orgField = null;
        String fullName = entity.fullname();
        com.yonyou.ucf.mdd.common.model.uimeta.ui.Entity uiEntity = (com.yonyou.ucf.mdd.common.model.uimeta.ui.Entity)ctx.getUiEntities().get(fullName.substring(fullName.lastIndexOf(".") + 1, fullName.length()));
        if (null != uiEntity) {
            for (Field field : uiEntity.getFields()) {
                if (!field.getFieldName().equalsIgnoreCase(orgProp.name())) continue;
                orgField = field;
                break;
            }
        }
        if (orgField == null) {
            log.info("\u5f53\u524dsheet\u6570\u636e\u5bf9\u5e94\u7684UI\u5143\u6570\u636e\u4e0d\u5305\u542b\u4e3b\u7ec4\u7ec7\u5217,\u5c06\u8df3\u8fc7\u5206\u7ea7\u7ba1\u63a7\u6821\u9a8c");
            return;
        }
        CheckMCSetDTO dto = new CheckMCSetDTO();
        dto.setDocid(fullName);
        dto.setTenantid(AppContext.getCurrentUser().getYhtTenantId());
        Object orgId = row.get(orgField.getItemName());
        ArrayList<String> orglist = new ArrayList<String>();
        orglist.add(String.valueOf(orgId));
        dto.setOrgid(String.valueOf(orgId));
        dto.setOrglist(orglist);
        dto.setSysid(DEFAULT_SYSID);
        List resultlist = mcSetManageService.orgMCFilter(dto);
        if (resultlist == null || resultlist.size() == 0) {
            log.error("\u5206\u7ea7\u7ba1\u63a7\u6821\u9a8c\u672a\u901a\u8fc7: {}\u884c\u7684{}={}", new Object[]{row.get("poiExcelRowNum"), orgField.getItemName(), dto.getOrgid()});
            String orgFieldCaption = null != orgField.getShowCaption() ? orgField.getShowCaption() : orgField.getCaption();
            String msg = InternationalUtils.getMessage((String)ImportPromptMsgEnum.msg03642.getCode(), (Object[])new Object[]{orgFieldCaption}, (String)ImportPromptMsgEnum.msg03642.getDefaultMsg(), null);
            errorMessage.append(msg);
            throw new ImportSkipRowException(msg);
        }
    }
}

