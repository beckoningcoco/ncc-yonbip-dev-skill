/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.constant.ApplicationCodeConstant
 *  com.yonyou.permission.util.AuthSdkFacadeUtils
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.mdd.ext.permissions.ICustomDataPermissionHandler
 *  com.yonyou.ucf.mdd.ext.util.OptionUtils
 *  com.yonyoucloud.uretail.sys.auth.DataPermissionRequestDto
 *  org.imeta.core.model.Entity
 *  org.imeta.spring.base.MetaBeanFactory
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.iuap.upc.dataauth;

import com.yonyou.iuap.apdoc.coredoc.constant.ApplicationCodeConstant;
import com.yonyou.permission.util.AuthSdkFacadeUtils;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.permissions.ICustomDataPermissionHandler;
import com.yonyou.ucf.mdd.ext.util.OptionUtils;
import com.yonyoucloud.uretail.sys.auth.DataPermissionRequestDto;
import java.util.Collection;
import java.util.List;
import org.imeta.core.model.Entity;
import org.imeta.spring.base.MetaBeanFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component
public class UpcCustomDataPermissionHandler
implements ICustomDataPermissionHandler {
    Logger logger = LoggerFactory.getLogger(UpcCustomDataPermissionHandler.class);

    public boolean forceDeduplicationOfData(BillContext billContext) {
        if ("aa_merchantlist".equals(billContext.getBillnum()) || "aa_merchantlist_query".equals(billContext.getBillnum())) {
            Object isMerchantListDistinct = OptionUtils.getSystemOption((Object)AppContext.getTenantId(), (String)"isMerchantListDistinct");
            if (isMerchantListDistinct != null && "1".equals(isMerchantListDistinct.toString())) {
                return false;
            }
            try {
                DataPermissionRequestDto requestDto = new DataPermissionRequestDto();
                String[] entityUris = new String[]{"aa.merchant.MerchantApplyRangeDetail", "aa.merchant.InvoicingCustomers", "aa.merchant.CustomerArea", "aa.merchant.Principal"};
                requestDto.setEntityUris(entityUris);
                requestDto.setSysCode(ApplicationCodeConstant.getApplicationCodeByFullName((String)"aa.merchant.Merchant"));
                List userDataPermissions = AuthSdkFacadeUtils.getUserDataPermissions((DataPermissionRequestDto)requestDto);
                return !CollectionUtils.isEmpty((Collection)userDataPermissions);
            }
            catch (Exception e) {
                this.logger.error("forceDeduplicationOfData:" + e.getMessage(), (Throwable)e);
                return false;
            }
        }
        return false;
    }

    public boolean forceNotUseSomeChildDataPermission(BillContext billContext, String subFullName) {
        if ("pc.product.ProductSKU".equals(subFullName) && ("pc_productlist".equals(billContext.getBillnum()) || "pc_productlist_query".equals(billContext.getBillnum()))) {
            return true;
        }
        if ("aa.merchant.MerchantApplyRangeDetail".equals(subFullName) && ("aa_merchantlist".equals(billContext.getBillnum()) || "aa_merchantlist_query".equals(billContext.getBillnum()))) {
            return true;
        }
        if ("aa.merchant.MerchantApplyRange".equals(subFullName) && ("aa_merchantlist".equals(billContext.getBillnum()) || "aa_merchantlist_query".equals(billContext.getBillnum()))) {
            return true;
        }
        if ("aa.merchant.MerchantApplyRangeExt".equals(subFullName) && ("aa_merchantlist".equals(billContext.getBillnum()) || "aa_merchantlist_query".equals(billContext.getBillnum()))) {
            return true;
        }
        if ("aa.merchant.InvoicingCustomers".equals(subFullName) && ("aa_merchantlist".equals(billContext.getBillnum()) || "aa_merchantlist_query".equals(billContext.getBillnum()))) {
            return true;
        }
        if ("aa.merchant.Principal".equals(subFullName) && ("aa_merchantlist".equals(billContext.getBillnum()) || "aa_merchantlist_query".equals(billContext.getBillnum()))) {
            return true;
        }
        return "aa.merchant.CustomerArea".equals(subFullName) && ("aa_merchantlist".equals(billContext.getBillnum()) || "aa_merchantlist_query".equals(billContext.getBillnum()));
    }

    public String getSysCode(BillContext billContext) {
        String metaFullName = billContext.getFullname();
        Entity pEntity = MetaBeanFactory.getMetaRepository().entity(metaFullName);
        String applicationCode = pEntity.getApplicationCode();
        return applicationCode;
    }
}

