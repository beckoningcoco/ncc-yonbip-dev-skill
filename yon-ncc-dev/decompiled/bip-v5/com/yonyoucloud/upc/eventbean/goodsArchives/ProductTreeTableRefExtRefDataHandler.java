/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.common.interfaces.ref.IExtRefDataHandler
 *  com.yonyou.ucf.mdd.common.model.Pager
 *  com.yonyou.ucf.mdd.common.model.ref.RefEntity
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.mdd.ext.ref.adapter.MetaExtRefDataHandler
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.eventbean.goodsArchives;

import com.yonyou.ucf.mdd.common.interfaces.ref.IExtRefDataHandler;
import com.yonyou.ucf.mdd.common.model.Pager;
import com.yonyou.ucf.mdd.common.model.ref.RefEntity;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.ref.adapter.MetaExtRefDataHandler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Component;

@Component(value="productTreeTableRefExtRefDataHandler")
public class ProductTreeTableRefExtRefDataHandler
extends MetaExtRefDataHandler
implements IExtRefDataHandler {
    public List<?> getTreeData(BillContext billContext, RefEntity refEntity, Map<String, Object> map) throws Exception {
        List<String> codelist = this.getCodeList();
        if (codelist.contains(billContext.getBillnum()) || codelist.contains(refEntity.getCode())) {
            HashMap<String, Boolean> context = new HashMap<String, Boolean>();
            context.put("modifySchema", true);
            billContext.setContext(context);
        }
        return super.getTreeData(billContext, refEntity, map);
    }

    public Pager getTreeDataByPage(BillContext billContext, RefEntity refEntity, Map<String, Object> map) throws Exception {
        List<String> codelist = this.getCodeList();
        if (codelist.contains(billContext.getBillnum()) || codelist.contains(refEntity.getCode())) {
            HashMap<String, Boolean> context = new HashMap<String, Boolean>();
            context.put("modifySchema", true);
            billContext.setContext(context);
        }
        return super.getTreeDataByPage(billContext, refEntity, map);
    }

    public Pager getGridData(BillContext billContext, RefEntity refEntity, Map<String, Object> map) throws Exception {
        return super.getGridData(billContext, refEntity, map);
    }

    private List<String> getCodeList() {
        ArrayList<String> codeList = new ArrayList<String>();
        codeList.add("productref");
        codeList.add("pc_nomalproductref");
        codeList.add("pc_productmasterquerygridref");
        codeList.add("pc_productquerytreeref");
        codeList.add("pc_managementclassref");
        codeList.add("productskuref");
        codeList.add("pc_productskuquerytreeref");
        codeList.add("pc_productskuquerymaintreeref");
        codeList.add("pc_productskuqueryfiltertreeref");
        codeList.add("baseProductRef");
        return codeList;
    }
}

