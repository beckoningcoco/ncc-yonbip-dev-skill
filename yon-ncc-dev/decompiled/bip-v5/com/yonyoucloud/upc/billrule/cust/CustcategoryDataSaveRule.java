/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.aa.custcategory.CustCategory
 *  org.imeta.core.model.Entity
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.springframework.stereotype.Component
 *  org.springframework.util.StringUtils
 */
package com.yonyoucloud.upc.billrule.cust;

import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.aa.custcategory.CustCategory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.imeta.core.model.Entity;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component(value="custcategoryDataSaveRule")
public class CustcategoryDataSaveRule
extends AbstractCommonRule {
    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(map);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        List custInfo = this.getBills(billContext, map);
        this.fillLevelMessage(billContext.getBillnum(), custInfo);
        return new RuleExecuteResult();
    }

    private void fillLevelMessage(String billNum, List<BizObject> bizObjectList) throws Exception {
        ArrayList idList = new ArrayList();
        bizObjectList.forEach(bizObject -> {
            if (bizObject.getId() != null) {
                idList.add(bizObject.getId().toString());
            }
        });
        HashMap<String, Object> params = new HashMap<String, Object>();
        Entity entity = MetaDaoHelper.getEntity((String)"aa.custcategory.CustCategory");
        params.put("tableName", entity.getMainTableName());
        params.put("ytenantid", AppContext.getCurrentUser().getYTenantId());
        params.put("ids", idList);
        List custCategoryMapList = SqlHelper.selectList((String)"com.yonyoucloud.upc.aa.cust.selectMClsByPathLikeId", params);
        HashMap custCategoryMap = new HashMap();
        custCategoryMapList.forEach(a -> custCategoryMap.put(a.get("id").toString(), a));
        for (BizObject bizObject2 : bizObjectList) {
            CustCategory custCategory;
            if (!"aa_custcategory".equals(billNum) || !custCategoryMap.containsKey((custCategory = (CustCategory)bizObject2).getId().toString())) continue;
            HashMap custCategoryClassPathMap = (HashMap)custCategoryMap.get(custCategory.getId().toString());
            custCategory.setPath((String)custCategoryClassPathMap.get("cPath"));
        }
        if ("aa_custcategory".equals(billNum)) {
            for (Map map : custCategoryMapList) {
                if (StringUtils.isEmpty(map.get("cPath"))) continue;
                String[] pathArray = map.get("cPath").toString().split("[|]");
                CustCategory custCategoryForUpdateLevel = new CustCategory();
                custCategoryForUpdateLevel.setId(map.get("id"));
                custCategoryForUpdateLevel.setFirstLevel(null);
                custCategoryForUpdateLevel.setSecondLevel(null);
                custCategoryForUpdateLevel.setThirdLevel(null);
                custCategoryForUpdateLevel.setFourthLevel(null);
                custCategoryForUpdateLevel.setFifthLevel(null);
                custCategoryForUpdateLevel.setSixthLevel(null);
                custCategoryForUpdateLevel.setSeventhLevel(null);
                custCategoryForUpdateLevel.setEighthLevel(null);
                for (int i = 0; i < pathArray.length; ++i) {
                    if (i == 0) {
                        custCategoryForUpdateLevel.setFirstLevel(Long.valueOf(Long.parseLong(pathArray[i])));
                        continue;
                    }
                    if (i == 1) {
                        custCategoryForUpdateLevel.setSecondLevel(Long.valueOf(Long.parseLong(pathArray[i])));
                        continue;
                    }
                    if (i == 2) {
                        custCategoryForUpdateLevel.setThirdLevel(Long.valueOf(Long.parseLong(pathArray[i])));
                        continue;
                    }
                    if (i == 3) {
                        custCategoryForUpdateLevel.setFourthLevel(Long.valueOf(Long.parseLong(pathArray[i])));
                        continue;
                    }
                    if (i == 4) {
                        custCategoryForUpdateLevel.setFifthLevel(Long.valueOf(Long.parseLong(pathArray[i])));
                        continue;
                    }
                    if (i == 5) {
                        custCategoryForUpdateLevel.setSixthLevel(Long.valueOf(Long.parseLong(pathArray[i])));
                        continue;
                    }
                    if (i == 6) {
                        custCategoryForUpdateLevel.setSeventhLevel(Long.valueOf(Long.parseLong(pathArray[i])));
                        continue;
                    }
                    if (i != 7) continue;
                    custCategoryForUpdateLevel.setEighthLevel(Long.valueOf(Long.parseLong(pathArray[i])));
                }
                custCategoryForUpdateLevel.setEntityStatus(EntityStatus.Update);
                MetaDaoHelper.update((String)"aa.custcategory.CustCategory", (BizObject)custCategoryForUpdateLevel);
            }
        }
    }
}

