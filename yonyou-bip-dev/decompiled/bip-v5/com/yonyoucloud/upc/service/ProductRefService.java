/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO
 *  org.springframework.stereotype.Service
 */
package com.yonyoucloud.upc.service;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO;
import org.springframework.stereotype.Service;

@Service
public class ProductRefService {
    private static final String PRODUCT_ORG_META_OLD = "productApplyRange.orgId";
    private static final String PRODUCT_ORG_META_NEW = "productApplyRangeGroup.orgGroupId.orgGroupDetailList.orgId";
    private static final String PRODUCTSKU_ORG_META_OLD = "productId.productApplyRange.orgId";
    private static final String PRODUCTSKU_ORG_META_NEW = "productId.productApplyRangeGroup.orgGroupId.orgGroupDetailList.orgId";

    public void checkOrgCondition(FilterVO gridFilter, String billNum) throws CoreDocBusinessException {
        SimpleFilterVO[] simpleVOs;
        boolean hasOrgCondition = false;
        for (SimpleFilterVO simpleFilterVO : simpleVOs = gridFilter.getSimpleVOs()) {
            String field = simpleFilterVO.getField();
            hasOrgCondition = "productref".equals(billNum) && PRODUCT_ORG_META_NEW.equals(field) ? true : ("pc_productquerytreeref".equals(billNum) && PRODUCT_ORG_META_OLD.equals(field) ? true : ("productskuref".equals(billNum) && PRODUCTSKU_ORG_META_NEW.equals(field) ? true : true));
        }
        if (!hasOrgCondition) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.COMMON_NO_ORG_FILTER_ERROR);
        }
    }
}

