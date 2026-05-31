/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService
 *  com.yonyou.ucf.mdd.common.interfaces.ref.IExtRefDataHandler
 *  com.yonyou.ucf.mdd.common.model.Pager
 *  com.yonyou.ucf.mdd.common.model.ref.RefEntity
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.mdd.ext.ref.adapter.MetaExtRefDataHandler
 *  com.yonyoucloud.upc.service.utils.PubOptionDataQueryUtil
 *  org.apache.commons.lang3.ArrayUtils
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.eventbean.businesspartner;

import com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService;
import com.yonyou.ucf.mdd.common.interfaces.ref.IExtRefDataHandler;
import com.yonyou.ucf.mdd.common.model.Pager;
import com.yonyou.ucf.mdd.common.model.ref.RefEntity;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.ref.adapter.MetaExtRefDataHandler;
import com.yonyoucloud.upc.service.utils.PubOptionDataQueryUtil;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import org.apache.commons.lang3.ArrayUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="businessPartnerRefMetaExtRefDataHandler")
public class BusinessPartnerRefMetaExtRefDataHandler
extends MetaExtRefDataHandler
implements IExtRefDataHandler {
    @Autowired
    private PubOptionService pubOptionService;
    @Autowired
    private PubOptionDataQueryUtil pubOptionDataQueryUtil;

    public Pager getGridData(BillContext billContext, RefEntity refEntity, Map<String, Object> map) throws Exception {
        if (!this.pubOptionDataQueryUtil.isBusinessPartnerOrgFilterEnabled()) {
            return super.getGridData(billContext, refEntity, map);
        }
        Boolean orgGlobalShare = this.pubOptionService.getOrgGlobalShare("aa.merchant.Merchant");
        if (orgGlobalShare.booleanValue()) {
            return super.getGridData(billContext, refEntity, map);
        }
        if (billContext.getParamObj() != null && billContext.getParamObj().getExternalData() != null && ((Map)billContext.getParamObj().getExternalData()).get("orgIdList") != null) {
            Object[] simpleVOs;
            Map externalData = (Map)billContext.getParamObj().getExternalData();
            HashSet orgIdList = (HashSet)externalData.get("orgIdList");
            FilterVO condition = (FilterVO)map.get("condition");
            if (condition == null) {
                condition = new FilterVO();
            }
            SimpleFilterVO simpleFilterVO = new SimpleFilterVO();
            simpleFilterVO.setField("orgGroupId.orgGroupDetailList.orgId");
            simpleFilterVO.setOp("in");
            if (!CollectionUtils.isEmpty((Collection)orgIdList)) {
                simpleFilterVO.setValue1((Object)orgIdList);
            }
            simpleVOs = (simpleVOs = condition.getSimpleVOs()) == null ? new SimpleFilterVO[]{simpleFilterVO} : (SimpleFilterVO[])ArrayUtils.add((Object[])simpleVOs, (Object)simpleFilterVO);
            condition.setSimpleVOs((SimpleFilterVO[])simpleVOs);
        }
        return super.getGridData(billContext, refEntity, map);
    }
}

