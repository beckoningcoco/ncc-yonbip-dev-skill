/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.BusinessException
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyoucloud.upc.common.TaxRevenueDTO
 *  com.yonyoucloud.upc.pc.tax.TaxRevenuePolicy
 *  com.yonyoucloud.upc.utils.CoreDocJsonResult
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.stereotype.Service
 *  org.springframework.util.ObjectUtils
 */
package com.yonyoucloud.upc.service.api;

import com.yonyou.iuap.BusinessException;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyoucloud.upc.common.TaxRevenueDTO;
import com.yonyoucloud.upc.pc.tax.TaxRevenuePolicy;
import com.yonyoucloud.upc.utils.CoreDocJsonResult;
import java.text.MessageFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

@Service
public class TaxRevenueSaveServiceImpl {
    private static final Logger log = LoggerFactory.getLogger(TaxRevenueSaveServiceImpl.class);

    public CoreDocJsonResult<TaxRevenueDTO> addTaxRevenuePolicy(TaxRevenueDTO taxRevenueDTO) throws Exception {
        try {
            if (taxRevenueDTO == null) {
                throw new CoreDocBusinessException("\u5165\u53c2\u4e0d\u80fd\u4e3a\u7a7a");
            }
            if (ObjectUtils.isEmpty((Object)taxRevenueDTO.getTaxRevenueId()) || ObjectUtils.isEmpty((Object)taxRevenueDTO.getRevenuePolicyDesc())) {
                throw new CoreDocBusinessException("\u65b0\u589e\u7a0e\u6536\u4f18\u60e0\u653f\u7b56\u65f6\uff0c\u7a0e\u6536\u5206\u7c7b\u7f16\u7801\u548c\u4f18\u60e0\u653f\u7b56\u8bf4\u660e\u4e0d\u80fd\u4e3a\u7a7a\uff01");
            }
            QuerySchema queryTaxRevenuePolicySchema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"taxRevenue").eq((Object)taxRevenueDTO.getTaxRevenueId()), QueryCondition.name((String)"name").eq((Object)taxRevenueDTO.getRevenuePolicyDesc())}));
            Map map = MetaDaoHelper.queryOne((String)"pc.tax.TaxRevenuePolicy", (QuerySchema)queryTaxRevenuePolicySchema);
            if (!ObjectUtils.isEmpty((Object)map)) {
                throw new CoreDocBusinessException(MessageFormat.format("\u7a0e\u6536\u4f18\u60e0\u653f\u7b56id\u4e3a[{0}]\uff0c\u6570\u636e\u5df2\u5b58\u5728\uff01", map.get("id")));
            }
            TaxRevenuePolicy taxRevenuePolicy = new TaxRevenuePolicy();
            taxRevenuePolicy.setId((Object)AppContext.getOid());
            taxRevenuePolicy.setTaxRevenue(Long.valueOf(Long.parseLong(taxRevenueDTO.getTaxRevenueId())));
            taxRevenuePolicy.setTaxRevenueCode(taxRevenueDTO.getTaxRevenueId());
            taxRevenuePolicy.setName(taxRevenueDTO.getRevenuePolicyDesc());
            MetaDaoHelper.insertNoPartition((String)"pc.tax.TaxRevenuePolicy", (BizObject)taxRevenuePolicy);
            TaxRevenueDTO saveResult = new TaxRevenueDTO();
            saveResult.setTaxRevenueId(taxRevenuePolicy.getId().toString());
            return CoreDocJsonResult.success((Object)saveResult);
        }
        catch (BusinessException businessException) {
            return CoreDocJsonResult.error((BusinessException)businessException);
        }
        catch (Exception e) {
            log.error("\u65b0\u589e\u7a0e\u6536\u4f18\u60e0\u653f\u7b56\u9519\u8bef:" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
    }

    public CoreDocJsonResult<TaxRevenueDTO> addTaxRevenueClass(TaxRevenueDTO taxRevenueDTO) throws Exception {
        try {
            if (taxRevenueDTO == null) {
                throw new CoreDocBusinessException("\u5165\u53c2\u4e0d\u80fd\u4e3a\u7a7a");
            }
            if (ObjectUtils.isEmpty((Object)taxRevenueDTO.getTaxRevenueId()) || ObjectUtils.isEmpty((Object)taxRevenueDTO.getTaxRevenueName())) {
                throw new CoreDocBusinessException("\u65b0\u589e\u7a0e\u6536\u5206\u7c7b\u65f6\uff0c\u7a0e\u6536\u5206\u7c7b\u7f16\u7801\u548c\u7a0e\u6536\u5206\u7c7b\u540d\u79f0\u4e0d\u80fd\u4e3a\u7a7a\uff01");
            }
            List queryList = MetaDaoHelper.queryById((String)"pc.tax.TaxRevenueclass", (String)"id", (Object)taxRevenueDTO.getTaxRevenueId());
            if (!ObjectUtils.isEmpty((Object)queryList)) {
                throw new CoreDocBusinessException(MessageFormat.format("\u7a0e\u6536\u5206\u7c7bid\u4e3a[{0}]\uff0c\u6570\u636e\u5df2\u5b58\u5728\uff01", ((Map)queryList.get(0)).get("id")));
            }
            QuerySchema querySchema = QuerySchema.create().addSelect("path").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)taxRevenueDTO.getParentTaxRevenueId())}));
            Map queryOne = MetaDaoHelper.queryOne((String)"pc.tax.TaxRevenueclass", (QuerySchema)querySchema);
            if (ObjectUtils.isEmpty((Object)queryOne)) {
                throw new CoreDocBusinessException("\u65b0\u589e\u7a0e\u6536\u5206\u7c7b\u65f6\uff0c\u8bf7\u5148\u65b0\u589e\u4e0a\u7ea7\u5206\u7c7b\uff0c\u518d\u65b0\u589e\u5b50\u7c7b\uff01");
            }
            String path = queryOne.get("path").toString() + taxRevenueDTO.getTaxRevenueId() + "|";
            Integer level = path.split("\\|").length;
            HashMap<String, Object> paramMap = new HashMap<String, Object>();
            paramMap.put("id", taxRevenueDTO.getTaxRevenueId());
            paramMap.put("code", taxRevenueDTO.getTaxRevenueId());
            paramMap.put("name", taxRevenueDTO.getTaxRevenueName());
            paramMap.put("simpleName", taxRevenueDTO.getTaxRevenueShortForm());
            paramMap.put("taxDesc", taxRevenueDTO.getTaxRevenueDes());
            paramMap.put("parentId", taxRevenueDTO.getParentTaxRevenueId());
            paramMap.put("parentCode", taxRevenueDTO.getParentTaxRevenueId());
            paramMap.put("path", path);
            paramMap.put("level", level);
            paramMap.put("isEnd", taxRevenueDTO.getIsEnd());
            paramMap.put("taxRevenueClassId", taxRevenueDTO.getTaxRevenueId());
            SqlHelper.insert((String)"com.yonyoucloud.upc.mapper.TaxRevenue.addTaxRevenueClass", paramMap);
            SqlHelper.insert((String)"com.yonyoucloud.upc.mapper.TaxRevenue.addTaxRevenue", paramMap);
            TaxRevenueDTO saveResult = new TaxRevenueDTO();
            saveResult.setTaxRevenueId(taxRevenueDTO.getTaxRevenueId());
            return CoreDocJsonResult.success((Object)saveResult);
        }
        catch (BusinessException businessException) {
            return CoreDocJsonResult.error((BusinessException)businessException);
        }
        catch (Exception e) {
            log.error("\u65b0\u589e\u7a0e\u6536\u5206\u7c7b\u9519\u8bef:" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
    }
}

