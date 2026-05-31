/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.common.model.ref.RefEntity
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.mdd.ext.model.LoginUser
 *  com.yonyoucloud.upc.data.productPro.ProductProDao
 *  com.yonyoucloud.upc.pc.userdef.BillItemBase
 *  com.yonyoucloud.upc.pc.userdef.UserDefineClass
 *  org.imeta.core.base.ConditionOperator
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.brand;

import com.yonyou.ucf.mdd.common.model.ref.RefEntity;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.model.LoginUser;
import com.yonyoucloud.upc.data.productPro.ProductProDao;
import com.yonyoucloud.upc.pc.userdef.BillItemBase;
import com.yonyoucloud.upc.pc.userdef.UserDefineClass;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.imeta.core.base.ConditionOperator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="BrandProRefFilter")
public class BrandProRefFilter
extends AbstractCommonRule {
    @Autowired
    ProductProDao productproDao;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(map);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        RefEntity refEntity = billDataDto.getRefEntity();
        String key = billDataDto.getKey();
        HashMap<String, Object> maptemp = new HashMap<String, Object>();
        LoginUser user = AppContext.getCurrentUser();
        if (user != null && user.getTenant() != null) {
            maptemp.put("tenant_id", user.getTenant());
        }
        maptemp.put("cName", key);
        maptemp.put("cSubId", "pc");
        String skyStr = "";
        String defindIdKey = "";
        List baselist = this.productproDao.selectBillItemBase(maptemp);
        if (baselist != null && baselist.size() > 0) {
            skyStr = ((BillItemBase)baselist.get(0)).getcCaption();
        }
        maptemp.put("defineIdOther", skyStr);
        List udc = this.productproDao.selectUserdefClassByMap(maptemp);
        if (udc != null && udc.size() > 0) {
            defindIdKey = ((UserDefineClass)udc.get(0)).getDefineId();
        }
        if ("pc_userdefref".equals(refEntity.refType) && !"".equals(defindIdKey)) {
            HashMap<String, String> params = new HashMap<String, String>();
            params.put("defineId", defindIdKey);
            FilterVO gridFilter = billDataDto.getCondition();
            if (gridFilter == null) {
                gridFilter = new FilterVO();
            }
            for (String item : params.keySet()) {
                gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO(item, "eq", params.get(item))});
            }
            billDataDto.setCondition(gridFilter);
            this.putParam(map, billDataDto);
        }
        return new RuleExecuteResult();
    }
}

