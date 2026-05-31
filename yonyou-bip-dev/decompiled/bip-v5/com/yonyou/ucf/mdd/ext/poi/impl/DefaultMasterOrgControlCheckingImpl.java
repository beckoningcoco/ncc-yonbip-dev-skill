/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.diwork.service.auth.IServiceIsolateService
 *  com.yonyou.iuap.BusinessException
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.permission.util.AuthSdkFacadeUtils
 *  com.yonyou.ucf.mdd.common.model.uimeta.ui.Entity
 *  com.yonyou.ucf.mdd.common.model.uimeta.ui.Field
 *  com.yonyou.ucf.mdd.common.utils.json.GsonHelper
 *  com.yonyou.ucf.mdd.core.utils.MetaAttributeUtils
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.model.LoginUser
 *  com.yonyou.ucf.mdd.ext.poi.api.ImportProvilegeChecking
 *  com.yonyou.ucf.mdd.ext.poi.context.ImportContext
 *  com.yonyou.ucf.mdd.ext.poi.enums.ImportPromptMsgEnum
 *  com.yonyou.ucf.mdd.ext.poi.exception.ImportSkipRowException
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.core.lang.BooleanUtils
 *  org.imeta.core.model.Entity
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.boot.autoconfigure.condition.ConditionalOnClass
 *  org.springframework.core.annotation.Order
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyou.ucf.mdd.ext.poi.impl;

import com.yonyou.diwork.service.auth.IServiceIsolateService;
import com.yonyou.iuap.BusinessException;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.permission.util.AuthSdkFacadeUtils;
import com.yonyou.ucf.mdd.common.model.uimeta.ui.Field;
import com.yonyou.ucf.mdd.common.utils.json.GsonHelper;
import com.yonyou.ucf.mdd.core.utils.MetaAttributeUtils;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.model.LoginUser;
import com.yonyou.ucf.mdd.ext.poi.api.ImportProvilegeChecking;
import com.yonyou.ucf.mdd.ext.poi.context.ImportContext;
import com.yonyou.ucf.mdd.ext.poi.enums.ImportPromptMsgEnum;
import com.yonyou.ucf.mdd.ext.poi.exception.ImportSkipRowException;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.apache.commons.lang3.StringUtils;
import org.imeta.core.lang.BooleanUtils;
import org.imeta.core.model.Entity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component
@ConditionalOnClass(value={IServiceIsolateService.class})
@Order(value=1)
public class DefaultMasterOrgControlCheckingImpl
implements ImportProvilegeChecking {
    private static final Logger log = LoggerFactory.getLogger(DefaultMasterOrgControlCheckingImpl.class);
    private static final String MASTER_ORG_NAME = "isMasterOrg";
    private static final String DEFAULT_ORG_NAME = "org";
    private static final String SERVICE_CODE = "serviceCode";

    public void checkPrivilege(ImportContext ctx, Entity entity, Map<String, Object> row, String sheetName, StringBuilder errorMessage) throws Exception {
        Boolean shopUser = ctx.getShopUser();
        if (BooleanUtils.b((Object)shopUser, (boolean)false)) {
            return;
        }
        if (null != row) {
            String fullname = entity.fullname();
            String masterOrgFieldName = MetaAttributeUtils.getMasterOrgField((String)fullname, (String)DEFAULT_ORG_NAME);
            if (StringUtils.isNotBlank((CharSequence)masterOrgFieldName)) {
                Field orgField = null;
                com.yonyou.ucf.mdd.common.model.uimeta.ui.Entity uiEntity = (com.yonyou.ucf.mdd.common.model.uimeta.ui.Entity)ctx.getUiEntities().get(fullname.substring(fullname.lastIndexOf(".") + 1, fullname.length()));
                if (uiEntity == null) {
                    log.info("not found valid uientity");
                    return;
                }
                for (Field field : uiEntity.getFields()) {
                    if (!masterOrgFieldName.equalsIgnoreCase(field.getFieldName())) continue;
                    orgField = field;
                    break;
                }
                if (orgField != null) {
                    String itemName = orgField.getItemName();
                    Object masterOrgValue = row.get(itemName);
                    if (null != masterOrgValue) {
                        Map externalData = (Map)ctx.getExternalData();
                        String authId = (String)externalData.get(SERVICE_CODE);
                        LoginUser currentUser = AppContext.getCurrentUser();
                        Set orgIds = null;
                        String yhtUserId = currentUser.getYhtUserId();
                        String yhtTenantId = currentUser.getYhtTenantId();
                        try {
                            orgIds = AuthSdkFacadeUtils.getUserMasterOrgPermission((String)yhtUserId, (String)yhtTenantId, (String)authId, (Boolean)false);
                        }
                        catch (BusinessException e) {
                            block22: {
                                try {
                                    if (log.isErrorEnabled()) {
                                        log.error(String.format("DefaultMasterOrgControlCheckingImpl::\u901a\u8fc7AuthSdkFacadeUtils\u83b7\u53d6\u4e3b\u7ec4\u7ec7\u6743\u9650\u5f02\u5e38\uff0c\u53c2\u6570\u5982\u4e0b,yhtUserId={},yhtTenantid{}={},authId={}", yhtUserId, yhtTenantId, authId));
                                    }
                                }
                                catch (Exception exception) {
                                    if (!log.isErrorEnabled()) break block22;
                                    log.error("DefaultMasterOrgControlCheckingImpl::\u901a\u8fc7AuthSdkFacadeUtils\u83b7\u53d6\u4e3b\u7ec4\u7ec7\u6743\u9650\u5f02\u5e38\u6355\u83b7\u8fc7\u7a0b\u4e2d\u53d1\u751f\u9519\u8bef\uff01");
                                }
                            }
                            throw new ImportSkipRowException(InternationalUtils.getMessageWithDefault((String)ImportPromptMsgEnum.msg35449.getCode(), (String)ImportPromptMsgEnum.msg35449.getDefaultMsg()));
                        }
                        if (CollectionUtils.isEmpty((Collection)orgIds) && log.isErrorEnabled()) {
                            log.error(String.format("DefaultMasterOrgControlCheckingImpl::\u901a\u8fc7AuthSdkFacadeUtils\u83b7\u53d6\u4e3b\u7ec4\u7ec7\u6743\u9650\u7ed3\u679c\u96c6\u4e3a\u7a7a\uff0c\u53c2\u6570\u5982\u4e0b,yhtUserId={},yhtTenantid{}={},authId={}", yhtUserId, yhtTenantId, authId));
                        }
                        if (!orgIds.contains(masterOrgValue.toString())) {
                            block23: {
                                try {
                                    if (log.isErrorEnabled()) {
                                        String orgId = "nocache";
                                        if (null != currentUser) {
                                            orgId = currentUser.getOrgId();
                                        }
                                        log.error(String.format("DefaultMasterOrgControlCheckingImpl::\u4e3b\u7ec4\u7ec7\u6821\u9a8c\u672a\u901a\u8fc7\uff0c\u53c2\u6570\u5982\u4e0b::yhtUserId={},yhtTenantid{}={},authId={},MasterOrgValue={},MastOrg\u5c5e\u6027\u540d\u79f0=={},\u4e0a\u4e0b\u6587\u4e2dOrgId={},\u8fd4\u56deOrgSet\u7ed3\u679c={}", new Object[0]), new Object[]{yhtUserId, yhtTenantId, authId, masterOrgValue, itemName, orgId, GsonHelper.ToJSon((Object)orgIds)});
                                    }
                                }
                                catch (Exception exception) {
                                    if (!log.isErrorEnabled()) break block23;
                                    log.error("\u6355\u83b7DefaultMasterOrgControlCheckingImpl::\u4e3b\u7ec4\u7ec7\u6821\u9a8c\u672a\u901a\u8fc7\u5f02\u5e38\u8fc7\u7a0b\u53d1\u751f\u9519\u8bef\uff01");
                                }
                            }
                            String msg = InternationalUtils.getMessageWithDefault((String)ImportPromptMsgEnum.msg24854.getCode(), (String)ImportPromptMsgEnum.msg24854.getDefaultMsg());
                            errorMessage.append(msg);
                            throw new ImportSkipRowException(msg);
                        }
                    }
                } else if (log.isInfoEnabled()) {
                    log.info("\u65e0\u9700\u8fdb\u884c\u4e3b\u7ec4\u7ec7\u8fc7\u6ee4");
                }
            } else if (log.isInfoEnabled()) {
                log.info("\u65e0\u9700\u8fdb\u884c\u4e3b\u7ec4\u7ec7\u8fc7\u6ee4");
            }
        }
    }
}

