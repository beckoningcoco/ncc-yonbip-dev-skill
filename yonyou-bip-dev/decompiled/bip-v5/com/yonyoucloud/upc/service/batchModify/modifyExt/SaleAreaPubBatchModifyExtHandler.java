/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.batchmodify.extinterface.IPubBatchModifyEntityExtService
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil
 *  com.yonyoucloud.upc.coredoc.batchentity.dto.PubBatchModifyEntitySaveDTO
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service.batchModify.modifyExt;

import com.yonyou.iuap.apdoc.coredoc.batchmodify.extinterface.IPubBatchModifyEntityExtService;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil;
import com.yonyoucloud.upc.coredoc.batchentity.dto.PubBatchModifyEntitySaveDTO;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public class SaleAreaPubBatchModifyExtHandler
implements IPubBatchModifyEntityExtService {
    private static final Logger log = LoggerFactory.getLogger(SaleAreaPubBatchModifyExtHandler.class);

    public void batchModifyIsCheckField(BizObject bizObject, Map<String, Object> pubBatchModifyEntityFieldSaveIsCheckMap, PubBatchModifyEntitySaveDTO pubBatchModifyEntitySaveDTO) throws Exception {
    }

    public void extendQuerySchema(QuerySchema querySchema, PubBatchModifyEntitySaveDTO pubBatchModifyEntitySaveDTO) throws Exception {
        List extIdList = pubBatchModifyEntitySaveDTO.getExtIdList();
        if (!CollectionUtils.isEmpty((Collection)extIdList)) {
            querySchema.appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"saleAreaApplyRange.id").in((Collection)extIdList)});
            querySchema.addSelect("saleAreaApplyRange.isCreator as isCreator,code");
        }
    }

    public void checkBatchModifyEntity(BizObject bizObject) throws Exception {
        if (bizObject != null && !BooleanUtil.isTrue((Object)bizObject.get("isCreator"))) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801450);
        }
    }
}

