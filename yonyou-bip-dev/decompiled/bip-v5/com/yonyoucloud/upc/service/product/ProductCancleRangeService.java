/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.ucf.mdd.common.model.ResultList
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.common.ResultList
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyoucloud.iuap.upc.dto.ProductQryDTO
 *  com.yonyoucloud.iuap.upc.dto.ext.UPCResultList
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.beans.factory.annotation.Qualifier
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service.product;

import com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.ucf.mdd.common.model.ResultList;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyoucloud.iuap.upc.api.service.IUPCBillService;
import com.yonyoucloud.iuap.upc.dto.ProductQryDTO;
import com.yonyoucloud.iuap.upc.dto.ext.UPCResultList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public class ProductCancleRangeService {
    private static final Logger log = LoggerFactory.getLogger(ProductCancleRangeService.class);
    @Autowired
    @Qualifier(value="pc.BillService")
    private IUPCBillService billService;

    public UPCResultList cancleProductApplyRange(List<ProductQryDTO> cancleorgDTOList) throws Exception {
        ArrayList deleteBillDatas = new ArrayList();
        for (ProductQryDTO data : cancleorgDTOList) {
            if (CollectionUtils.isEmpty((Collection)data.getOrgStringList())) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_ORG_IS_NULL);
            }
            if (CollectionUtils.isEmpty((Collection)data.getProductIdList())) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_PRODUCT_IS_NULL);
            }
            QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").in((Collection)data.getProductIdList()), QueryCondition.name((String)"orgId").in((Collection)data.getOrgStringList())});
            String selectFiled = "id as productApplyRangeId, productId as id, isCreator as isCreator, productId.code as code,productId.name as name,isApplied as isApplied, orgId as productApplyRange_orgId, orgId.name as productApplyRange_orgId_Name";
            QuerySchema querySchema = QuerySchema.create().addSelect(selectFiled).addCondition((ConditionExpression)queryConditionGroup);
            List rangeList = MetaDaoHelper.query((String)"pc.product.ProductApplyRange", (QuerySchema)querySchema);
            if (CollectionUtils.isEmpty((Collection)rangeList)) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_RANGE_NOT_FOUND, new Object[]{String.valueOf(data.getProductIdList().get(0))});
            }
            deleteBillDatas.addAll(rangeList);
        }
        BillDataDto bill = new BillDataDto();
        bill.setAction("delete");
        bill.setBillnum("pc_productlist_query");
        bill.setData(deleteBillDatas);
        com.yonyou.ucf.mdd.ext.bill.rule.common.ResultList resultList = this.billService.batchdelete(bill);
        UPCResultList upcResultList = UpcAPiTool.resultConvertOpenApi((ResultList)resultList);
        return upcResultList;
    }
}

