/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.context.InvocationInfoProxy
 *  com.yonyou.iuap.yms.api.IYmsJdbcApi
 *  com.yonyou.iuap.yms.param.BaseEntity
 *  com.yonyou.iuap.yms.param.SQLParameter
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyoucloud.upc.aa.merchant.ContactEntity
 *  com.yonyoucloud.upc.aa.merchant.Contacter
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 */
package com.yonyoucloud.upc.service.merchant;

import com.yonyou.iuap.context.InvocationInfoProxy;
import com.yonyou.iuap.yms.api.IYmsJdbcApi;
import com.yonyou.iuap.yms.param.BaseEntity;
import com.yonyou.iuap.yms.param.SQLParameter;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyoucloud.upc.aa.merchant.ContactEntity;
import com.yonyoucloud.upc.aa.merchant.Contacter;
import java.util.HashMap;
import java.util.List;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactEntityService {
    private static final Logger log = LoggerFactory.getLogger(ContactEntityService.class);
    @Autowired
    private IYmsJdbcApi ymsJdbcApi;

    public ContactEntity queryContactEntityById(Long id) {
        HashMap<String, Long> conditions = new HashMap<String, Long>();
        conditions.put("id", id);
        ContactEntity contactEntity = new ContactEntity();
        contactEntity.setFullName("aa.merchant.Contacter");
        String[] selectedFields = new String[]{"id", "merchantId", "fullName", "mobile", "isDefault"};
        return (ContactEntity)this.ymsJdbcApi.selectOne((BaseEntity)contactEntity, conditions, selectedFields);
    }

    public List<ContactEntity> queryContactEntityByNoId(Long merchantId, Long id) {
        SQLParameter sqlParameter = new SQLParameter();
        sqlParameter.addParam(InvocationInfoProxy.getTenantid());
        sqlParameter.addParam((Object)merchantId);
        sqlParameter.addParam((Object)id);
        String sql = "select * from contacter where ytenant_id = ? and imerchantId = ? and id <> ?";
        return this.ymsJdbcApi.queryForDTOList(sql, sqlParameter, ContactEntity.class);
    }

    public void deleteContactEntity(ContactEntity contactEntity) throws Exception {
        Contacter contacter = new Contacter();
        contacter.setId((Object)contactEntity.getId());
        contacter.setMerchantId(contactEntity.getMerchantId());
        contacter.setIsDefault(contactEntity.getIsDefault());
        contacter.setMobile(contactEntity.getMobile());
        contacter.setEntityStatus(EntityStatus.Delete);
        MetaDaoHelper.delete((String)"aa.merchant.Contacter", (BizObject)contacter);
    }
}

