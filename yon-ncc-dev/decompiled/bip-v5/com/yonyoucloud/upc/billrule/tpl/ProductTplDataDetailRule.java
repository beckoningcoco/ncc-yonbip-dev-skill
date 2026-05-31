/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.filter.util.StringUtil
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  org.apache.commons.lang3.ObjectUtils
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.tpl;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.filter.util.StringUtil;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.datarule.ProductTplService;
import java.util.ArrayList;
import java.util.Map;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="productTplDataDetailRule")
public class ProductTplDataDetailRule
extends AbstractCommonRule {
    @Autowired
    ProductTplService productTplService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(map);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        if ("listdetail".equals(billContext.getAction())) {
            String[] idArray;
            String ids = billDataDto.getIds();
            if (ObjectUtils.isEmpty((Object)ids)) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800132);
            }
            ArrayList<Map> dataList = new ArrayList<Map>();
            for (String id : idArray = ids.split(",")) {
                Map data = this.productTplService.getTemplateData(Long.parseLong(id));
                dataList.add(data);
            }
            this.putParam(map, "return", dataList);
        } else {
            String id = billDataDto.getId();
            if (StringUtil.isEmpty((String)id)) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800132);
            }
            Map data = this.productTplService.getTemplateData(Long.parseLong(billDataDto.getId()));
            this.putParam(map, "return", data);
        }
        return new RuleExecuteResult();
    }
}

