/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.dao.materialncc.MaterialNccQryDao
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.org.dto.RefCheckDTO
 *  com.yonyoucloud.upc.aa.agentlevel.AgentLevel
 *  org.imeta.biz.base.BizContext
 *  org.imeta.core.base.ConditionOperator
 *  org.imeta.core.model.PropertyMap
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.imeta.orm.schema.SimpleCondition
 *  org.jetbrains.annotations.NotNull
 *  org.springframework.beans.factory.InitializingBean
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.context.annotation.Lazy
 *  org.springframework.context.annotation.Primary
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.common;

import com.yonyou.iuap.apdoc.coredoc.dao.materialncc.MaterialNccQryDao;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.org.dto.RefCheckDTO;
import com.yonyoucloud.upc.aa.agentlevel.AgentLevel;
import com.yonyoucloud.upc.deletelog.DocDeleteLogService;
import com.yonyoucloud.upc.service.ReferenceCheckService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.imeta.biz.base.BizContext;
import org.imeta.core.base.ConditionOperator;
import org.imeta.core.model.PropertyMap;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.imeta.orm.schema.SimpleCondition;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="pc.referenceCheckRule")
@Primary
@Lazy
public class ReferenceCheckRule
extends AbstractCommonRule
implements InitializingBean {
    @Autowired
    ReferenceCheckService referenceCheckService;
    @Autowired
    DocDeleteLogService docDeleteLogService;
    @Autowired
    MaterialNccQryDao materialNccQryDao;
    private List<String> excludeObjects;
    private static Map<String, String> fullNameMap = new HashMap<String, String>();

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        StringBuffer buffer;
        String fullname = billContext.getFullname();
        String id = null;
        List bills = this.getBills(billContext, paramMap);
        if (fullNameMap.get(fullname) != null && null != bills && bills.size() > 0) {
            if ("pc.userdef.UserDefineClass".equals(fullname) && ("pc_productorderprolist".equals(billContext.getBillnum()) || "pc_productorderpro".equals(billContext.getBillnum()))) {
                this.deleteCheck((BizObject)bills.get(0), fullname);
            } else if (!"pc.userdef.UserDefineClass".equals(fullname)) {
                this.deleteCheck((BizObject)bills.get(0), fullname);
            }
            return this.writeDeleteLog(fullname, (BizObject)bills.get(0));
        }
        if (null != bills && bills.size() > 0) {
            id = ((BizObject)bills.get(0)).getId().toString();
            if (((BizObject)bills.get(0)).get("isEnd") != null && !((Boolean)((BizObject)bills.get(0)).get("isEnd")).booleanValue()) {
                PropertyMap propertyMap = BizContext.getMetaRepository().entity(fullname).attrMap();
                ArrayList<QueryCondition> queryConditionList = new ArrayList<QueryCondition>();
                queryConditionList.add(QueryCondition.name((String)"parent").eq((Object)id));
                if (propertyMap.containsKey("dr")) {
                    queryConditionList.add(QueryCondition.name((String)"dr").eq((Object)0));
                }
                QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])((ConditionExpression[])queryConditionList.toArray(new QueryCondition[0])));
                QuerySchema getWarehouseById = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)queryConditionGroup);
                List mapList = MetaDaoHelper.query((String)fullname, (QuerySchema)getWarehouseById);
                if (mapList != null && mapList.size() > 0) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800326, new Object[]{((BizObject)bills.get(0)).get("code").toString()});
                }
                return this.writeDeleteLog(fullname, (BizObject)bills.get(0));
            }
            if (!((BizObject)bills.get(0)).containsKey((Object)"code") || ((BizObject)bills.get(0)).get("code") == null) {
                ((BizObject)bills.get(0)).put("code", (Object)id);
            }
        } else {
            return this.writeDeleteLog(fullname, (BizObject)bills.get(0));
        }
        if ("pc.brand.BrandClass".equals(fullname) || "pc.tag.TagClass".equals(fullname)) {
            QuerySchema schema1 = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq((Object)((BizObject)bills.get(0)).get("code").toString())}));
            Map queryOne = MetaDaoHelper.queryOne((String)fullname, (QuerySchema)schema1);
            if (null == queryOne.get("id")) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800327);
            }
            QuerySchema schema2 = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)("pc.brand.BrandClass".equals(fullname) ? "brandClass" : "tagClass")).eq(queryOne.get("id"))}));
            List query = null;
            if ("pc.brand.BrandClass".equals(fullname)) {
                MetaDaoHelper.query((String)"pc.brand.Brand", (QuerySchema)schema2);
            } else {
                MetaDaoHelper.query((String)"pc.tag.Tag", (QuerySchema)schema2);
            }
            if (null != query && query.size() > 0) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800328);
            }
        }
        ArrayList<String> excludeObjects = new ArrayList<String>();
        List excludeList = (List)paramMap.get("excludeList");
        if (excludeList != null && excludeList.size() > 0) {
            for (String exclude : excludeList) {
                if (excludeObjects.contains(exclude)) continue;
                excludeObjects.add(exclude);
            }
        }
        if (fullname.equals("pc.product.Product")) {
            String code = "";
            if (((BizObject)bills.get(0)).get("code") != null) {
                code = ((BizObject)bills.get(0)).get("code").toString();
            }
            String applyRangeOrgId = "";
            if (((BizObject)bills.get(0)).get("productApplyRange_orgId") != null) {
                applyRangeOrgId = ((BizObject)bills.get(0)).get("productApplyRange_orgId").toString();
            } else if (((BizObject)bills.get(0)).get("productApplyRange_OrgId") != null) {
                applyRangeOrgId = ((BizObject)bills.get(0)).get("productApplyRange_OrgId").toString();
            }
            if (BooleanUtil.isTrue((Object)((BizObject)bills.get(0)).get("isCreator"))) {
                ArrayList<SimpleCondition> conditions = new ArrayList<SimpleCondition>();
                conditions.add(new SimpleCondition("productId", ConditionOperator.eq, (Object)id));
                conditions.add(new SimpleCondition("ytenant", ConditionOperator.eq, (Object)AppContext.getCurrentUser().getYTenantId()));
                MetaDaoHelper.batchDelete((String)"pc.product.ProductTagNew", conditions);
            }
            List<RefCheckDTO> refCheckResults = this.referenceCheckService.deleteCheckProductInUse(id, code, applyRangeOrgId);
            StringBuilder stringBuilder = new StringBuilder();
            for (RefCheckDTO refCheckResult : refCheckResults) {
                stringBuilder.append(refCheckResult.getMessage());
            }
            return stringBuilder.length() > 0 ? new RuleExecuteResult(0, stringBuilder.toString()) : this.writeDeleteLog(fullname, (BizObject)bills.get(0));
        }
        if (fullname.equals("pc.product.ProductSKU") && !excludeObjects.contains("stock.currentstockcontrast.CurrentStockContrast")) {
            excludeObjects.add("stock.currentstockcontrast.CurrentStockContrast");
        }
        if ("aa.merchant.Merchant".equalsIgnoreCase(fullname)) {
            return this.writeDeleteLog(fullname, (BizObject)bills.get(0));
        }
        if ("aa.warehouse.Warehouse".equals(fullname)) {
            excludeObjects.add("stock.currentstock.CurrentStockCommitLog");
            excludeObjects.add("stock.currentstock.CurrentStock");
            excludeObjects.add("stock.currentstock.CurrentStockLocation");
            excludeObjects.add("st.batchno.Batchno");
            if (!excludeObjects.contains("stock.currentstockcontrast.CurrentStockContrast")) {
                excludeObjects.add("stock.currentstockcontrast.CurrentStockContrast");
            }
            if (((BizObject)bills.get(0)).containsKey((Object)"fromMerchantCall")) {
                excludeObjects.add("aa.merchant.AddressInfo");
            }
        }
        ArrayList<String> domainList = new ArrayList<String>();
        if ("aa.warehouse.Warehouse".equals(fullname)) {
            domainList.add("uinttrade");
            domainList.add("ustock");
            domainList.add("retail");
            domainList.add("productionorder");
            domainList.add("ucf-amc-aum");
            domainList.add("IMP-WMS");
            domainList.add("ucf-amc-rmm");
            domainList.add("requirementsplanning");
            domainList.add("yonyoufi");
            domainList.add("ucf-amc-mro");
            domainList.add("engineeringdata");
            domainList.add("IMP-ILS-LES");
            domainList.add("uscmf");
            domainList.add("dst");
            domainList.add("ucfbasedoc");
            domainList.add("IMP-DFM-WMS");
            domainList.add("sact");
            domainList.add("upu");
            domainList.add("IMP-WJMD");
            domainList.add("productcenter");
            domainList.add("udinghuo");
            domainList.add("ILS-LRS");
            domainList.add("IMP-WIM");
            domainList.add("IMP-WJM");
            domainList.add("fima");
            domainList.add("quote");
            domainList.add("mf-ecn");
            domainList.add("IMP-DFM");
            domainList.add("uhy");
            domainList.add("mall");
            domainList.add("fieaai");
            domainList.add("yxybase");
            domainList.add("ucf-amc-ambd");
            domainList.add("IMP-DFM-TAM");
            domainList.add("yycrm");
            domainList.add("uinttrade");
            domainList.add("ucf-amc-aim");
            domainList.add("yonbip-fi-eis");
            domainList.add("yonbip-fi-eia");
            domainList.add("yonbip-mm-plan");
        }
        if ("aa.warehouse.Warehouse".equals(fullname)) {
            for (int i = 0; i < domainList.size(); ++i) {
                buffer = MetaDaoHelper.referenceCheck((String)fullname, (String)id, excludeObjects, (String)((String)domainList.get(i)));
                if (buffer.length() <= 0) continue;
                throw new CoreDocBusinessException(buffer.toString());
            }
            return this.writeDeleteLog(fullname, (BizObject)bills.get(0));
        }
        if ("aa.goodsposition.GoodsPosition".equals(fullname)) {
            domainList.add("ustock");
            domainList.add("retail");
            domainList.add("upu");
            domainList.add("dst");
            domainList.add("uorderbase");
            domainList.add("mall");
        }
        if ("aa.goodsposition.GoodsPosition".equals(fullname)) {
            BizObject position = (BizObject)bills.get(0);
            for (int i = 0; i < domainList.size(); ++i) {
                StringBuffer buffer2 = MetaDaoHelper.referenceCheck((String)fullname, (String)id, excludeObjects, (String)((String)domainList.get(i)));
                if (buffer2.length() <= 0) continue;
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800329, new Object[]{position.getString("code")});
            }
            return this.writeDeleteLog(fullname, (BizObject)bills.get(0));
        }
        if ("aa.agentlevel.AgentLevel".equals(fullname)) {
            AgentLevel agentlevel = (AgentLevel)bills.get(0);
            String MAPPER = "com.yonyoucloud.upc.data.agentLevel.";
            HashMap<String, Object> arg = new HashMap<String, Object>();
            arg.put("oCustomerLevel_id", Long.parseLong(id));
            arg.put("ytenant_id", AppContext.getCurrentUser().getYTenantId());
            List delAgentLevelCheck = SqlHelper.selectList((String)(MAPPER + "delAgentLevelCheck"), arg);
            if (delAgentLevelCheck != null && delAgentLevelCheck.size() > 0) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800330, new Object[]{agentlevel.getCode()});
            }
            return this.writeDeleteLog(fullname, (BizObject)bills.get(0));
        }
        if ("pc.userdef.UserDefineClass".equals(fullname) || "pc.userdef.UserDefineClassSpec".equals(fullname) || "pc.userdef.Userdefine".equals(fullname) || "pc.userdef.UserDefineSpec".equals(fullname)) {
            if (!excludeObjects.contains("pc.spec.SpecTplProduct")) {
                excludeObjects.add("pc.spec.SpecTplProduct");
            }
            if (!excludeObjects.contains("pc.spec.SpecTplProductItem")) {
                excludeObjects.add("pc.spec.SpecTplProductItem");
            }
            if (!excludeObjects.contains("aa.product.RetailSku")) {
                excludeObjects.add("aa.product.RetailSku");
            }
        }
        if ("base_businesspartnerlist".equals(billContext.getBillnum()) || "base_businesspartner".equals(billContext.getBillnum())) {
            excludeObjects.add("aa.merchant.Merchant");
        }
        if ((buffer = "pc_spepro".equals(billContext.getBillnum()) && "pc.userdef.UserDefineClassSpec".equals(fullname) ? MetaDaoHelper.referenceCheck((String)"pc.userdef.UserDefineClass", (String)id, excludeObjects, (String)"productcenter") : MetaDaoHelper.referenceCheck((String)fullname, (String)id, excludeObjects, (String)"productcenter")).length() > 0) {
            throw new CoreDocBusinessException(buffer.toString());
        }
        if ("pc.tpl.ProductTpl".equals(fullname)) {
            this.materialNccQryDao.deleteProductTplNcc(id);
        }
        return this.writeDeleteLog(fullname, (BizObject)bills.get(0));
    }

    @NotNull
    private RuleExecuteResult writeDeleteLog(String fullname, BizObject data) {
        this.docDeleteLogService.writeDeleteLog(fullname, data);
        return new RuleExecuteResult();
    }

    public void afterPropertiesSet() throws Exception {
        this.excludeObjects = new ArrayList<String>();
    }

    private void deleteCheck(BizObject bill, String fullName) throws Exception {
        String code = "";
        String name = "";
        ArrayList<String> ids = new ArrayList<String>();
        if (bill.get("code") != null) {
            code = bill.get("code").toString();
        }
        if (bill.get("name") != null) {
            name = bill.get("name").toString();
        }
        if (bill.get("showItem") != null && name.length() == 0) {
            name = bill.get("showItem").toString();
        }
        if (bill.get("id") != null) {
            ids.add(bill.get("id").toString());
        }
        String moduleNames = "";
        List<RefCheckDTO> refCheckDTOList = this.referenceCheckService.refCheckResult(ids, fullNameMap.get(fullName), "", "");
        if (!CollectionUtils.isEmpty(refCheckDTOList)) {
            for (RefCheckDTO dto : refCheckDTOList) {
                moduleNames = moduleNames + dto.getServiceName() + " ";
            }
        }
        if (code.isEmpty() && name.isEmpty()) {
            try {
                List mapList = MetaDaoHelper.queryByIds((String)fullName, (String)"code,name", ids);
                if (mapList != null && mapList.size() > 0) {
                    Map stringObjectMap = (Map)mapList.get(0);
                    if (stringObjectMap.containsKey("code")) {
                        code = stringObjectMap.get("code").toString();
                    }
                    if (stringObjectMap.containsKey("name")) {
                        name = stringObjectMap.get("name").toString();
                    }
                }
            }
            catch (Exception mapList) {
                // empty catch block
            }
        }
        if (moduleNames.length() != 0) {
            String message = String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1A0040500490000B", (String)"\u7f16\u7801:[%s]\u540d\u79f0:[%s]\uff0c\u88ab[%s]\u5f15\u7528\uff01\u65e0\u6cd5\u5220\u9664\uff01"), code, name, moduleNames);
            throw new CoreDocBusinessException(message);
        }
    }

    static {
        fullNameMap.put("pc.unit.Unit", "pc_unit");
        fullNameMap.put("pc.cls.ManagementClass", "pc_managementclass");
        fullNameMap.put("aa.custcategory.CustCategory", "aa_custcategory");
        fullNameMap.put("aa.salearea.SaleArea", "aa_salearea");
        fullNameMap.put("pc.userdef.UserDefineClass", "pc_productorderpro");
    }
}

