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
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.mdd.ext.model.LoginUser
 *  com.yonyoucloud.upc.data.productPro.ProductProDao
 *  com.yonyoucloud.upc.pc.userdef.BillItemBase
 *  com.yonyoucloud.upc.pc.userdef.UserDefineClass
 *  org.imeta.core.base.ConditionOperator
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.userdefine;

import com.yonyou.ucf.mdd.common.model.ref.RefEntity;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
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

@Component(value="userdefValueRefFilter")
public class UserdefValueRefFilter
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
        String cSelfDefineType = billDataDto.getcSelfDefineType();
        HashMap<String, Object> maptemp = new HashMap<String, Object>();
        LoginUser user = AppContext.getCurrentUser();
        if (user != null && user.getTenant() != null) {
            maptemp.put("tenant_id", user.getTenant());
        }
        if (cSelfDefineType == null && key != null && user != null && user.getTenant() != null) {
            HashMap<String, String> param = new HashMap<String, String>();
            param.put("itemName", key);
            param.put("ytenantId", user.getYTenantId());
            Object o = SqlHelper.selectOne((String)"com.yonyoucloud.upc.userdef.dao.UserDefClass.selectCFieldNameByItemName", param);
            if (o != null) {
                Map data = (Map)o;
                String dataSource = data.get("dataSource").toString();
                maptemp.put("cFieldName", dataSource);
            } else {
                maptemp.put("cFieldName", key);
            }
        }
        maptemp.put("cSelfDefineType", cSelfDefineType);
        String skyStr = "";
        String defindIdKey = "";
        List baselist = this.productproDao.selectBillItemBase(maptemp);
        if (baselist != null && baselist.size() > 0) {
            skyStr = ((BillItemBase)baselist.get(0)).getcSelfDefineType();
        }
        maptemp.put("defineId", skyStr);
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

