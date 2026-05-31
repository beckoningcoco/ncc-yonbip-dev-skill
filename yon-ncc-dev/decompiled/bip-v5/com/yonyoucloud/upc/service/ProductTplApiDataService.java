/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.common.ResultList
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyoucloud.upc.pc.product.Product
 *  com.yonyoucloud.upc.pc.tpl.ProductTpl
 *  com.yonyoucloud.upc.pc.tpl.ProductTplSKUProperty
 *  com.yonyoucloud.upc.pc.tpl.ProductTplSKUPropertySum
 *  com.yonyoucloud.upc.pc.tpl.ProductTplSpec
 *  com.yonyoucloud.upc.pc.tpl.ProductTplSpecSum
 *  com.yonyoucloud.upc.utils.MultilangUtil
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.imeta.spring.support.id.IdManager
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.beans.factory.annotation.Qualifier
 *  org.springframework.stereotype.Service
 *  org.springframework.util.Assert
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service;

import com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.common.ResultList;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyoucloud.iuap.upc.api.service.IUPCBillService;
import com.yonyoucloud.upc.pc.product.Product;
import com.yonyoucloud.upc.pc.tpl.ProductTpl;
import com.yonyoucloud.upc.pc.tpl.ProductTplSKUProperty;
import com.yonyoucloud.upc.pc.tpl.ProductTplSKUPropertySum;
import com.yonyoucloud.upc.pc.tpl.ProductTplSpec;
import com.yonyoucloud.upc.pc.tpl.ProductTplSpecSum;
import com.yonyoucloud.upc.utils.MultilangUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.imeta.spring.support.id.IdManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import org.springframework.util.CollectionUtils;

@Service
public class ProductTplApiDataService {
    @Autowired
    @Qualifier(value="pc.billApiService")
    private IUPCBillService upcBillService;
    @Autowired
    PubOptionService pubOptionService;

    public List<Map<String, Object>> dealProductData(List<Map<String, Object>> data, List<Object> msgs) throws Exception {
        ArrayList products = new ArrayList();
        HashSet<String> productCodes = new HashSet<String>();
        ArrayList<ProductTpl> tpls = new ArrayList<ProductTpl>();
        HashMap<String, ProductTpl> tplMap = new HashMap<String, ProductTpl>();
        HashMap<String, List<String>> tpl_products = new HashMap<String, List<String>>();
        List productcodes = data.stream().map(map -> map.get("product_code").toString()).collect(Collectors.toList());
        QuerySchema schema = QuerySchema.create().addSelect("code,productTemplate.name as tpl_name").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").in(productcodes), QueryCondition.name((String)"productTemplate").is_not_null()}));
        List productsIndb = MetaDaoHelper.query((String)"pc.product.Product", (QuerySchema)schema);
        Map<Object, Object> tempMaps = new HashMap();
        if (productsIndb != null && productsIndb.size() > 0) {
            tempMaps = productsIndb.stream().filter(temmap -> temmap.get("tpl_name") != null).collect(Collectors.toMap(map -> map.get("code").toString(), map -> map.get("tpl_name").toString(), (key1, key2) -> key2));
        }
        for (Map<String, Object> sku : data) {
            if (null != sku.get("skuDefines")) {
                sku.put("skuDefines", this.dealSkuDefine(sku.get("skuDefines")));
            }
            ArrayList<String> specs = new ArrayList<String>();
            ArrayList<String> specNames = new ArrayList<String>();
            String tplName = null;
            if (sku.containsKey("specdatas")) {
                ArrayList<ProductTplSpec> tplSpecs = new ArrayList<ProductTplSpec>();
                Map specdata = (Map)sku.get("specdatas");
                Set entries = specdata.entrySet();
                Iterator iterator = entries.iterator();
                boolean isSkuCheck = true;
                while (iterator.hasNext()) {
                    Map.Entry next = iterator.next();
                    String key = (String)next.getKey();
                    String value = (String)next.getValue();
                    if (StringUtils.isEmpty((CharSequence)value)) {
                        iterator.remove();
                        continue;
                    }
                    specs.add(key);
                    specNames.add(value);
                    ProductTplSpec tplSpec = new ProductTplSpec();
                    tplSpec.setSpecitem(value);
                    tplSpec.put("specName", (Object)key);
                    tplSpecs.add(tplSpec);
                }
                specs.sort((o1, o2) -> {
                    int i = o1.hashCode() > o2.hashCode() ? 1 : 0;
                    return i;
                });
                tplName = String.join((CharSequence)"_", specs);
                if (!tempMaps.isEmpty() && isSkuCheck && tempMaps.keySet().contains(sku.get("product_code").toString()) && !tplName.equals(tempMaps.get(sku.get("product_code").toString()))) {
                    HashMap<String, Object> map2 = new HashMap<String, Object>();
                    map2.put("message", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080C63", (String)"\u5bfc\u5165SKU\u65f6\uff0c\u4e0d\u53ef\u53d8\u66f4\u5f53\u524d\u7269\u6599\u7684\u7269\u6599\u6a21\u677f\uff0c\u8bf7\u68c0\u67e5\u89c4\u683c\u9879\u662f\u5426\u6b63\u786e"));
                    map2.put("key", sku.get("product_code"));
                    msgs.add(map2);
                    isSkuCheck = false;
                }
                sku.put("isSkuCheck", isSkuCheck);
                if (!isSkuCheck) continue;
                if (!productCodes.contains(sku.get("product_code").toString())) {
                    HashMap<String, Object> productMap = new HashMap<String, Object>();
                    productMap.put("product_code", sku.get("product_code"));
                    productMap.put("product_name", sku.get("product_name"));
                    productMap.put("product_templete", tplName);
                    productMap.put("specs", String.join((CharSequence)"|", specs));
                    products.add(productMap);
                    productCodes.add(sku.get("product_code").toString());
                }
                sku.put("skuDefine", this.getSkuDefine(sku.get("skuDefines")));
                ProductTpl tpl = (ProductTpl)tplMap.get(tplName);
                if (tpl == null) {
                    tpl = new ProductTpl();
                    tplMap.put(tplName, tpl);
                    tpls.add(tpl);
                }
                if (tpl.Specs() != null) {
                    tpl.Specs().addAll(tplSpecs);
                } else {
                    tpl.setSpecs(tplSpecs);
                }
                tpl.setName(tplName);
                ArrayList<String> ps = (ArrayList<String>)tpl_products.get(tplName);
                if (ps == null) {
                    ps = new ArrayList<String>();
                    tpl_products.put(tplName, ps);
                }
                ps.add(sku.get("product_code").toString());
                sku.put("specs", String.join((CharSequence)"|", specNames));
                sku.put("product_templete", tplName);
            }
            if (null == sku.get("skuDefines")) continue;
            ProductTpl tpl = (ProductTpl)tplMap.get(tplName);
            Map skuDefines = (Map)sku.get("skuDefines");
            Iterator iterator = skuDefines.entrySet().iterator();
            while (iterator.hasNext()) {
                ProductTplSKUProperty skuProperty = new ProductTplSKUProperty();
                Map.Entry next = iterator.next();
                skuProperty.set("skuName", (Object)((String)next.getKey()));
                skuProperty.set("skuValue", (Object)((String)next.getValue()));
                ArrayList<ProductTplSKUProperty> productTplSKUProperties = tpl.SKUProperties();
                if (null == productTplSKUProperties) {
                    productTplSKUProperties = new ArrayList<ProductTplSKUProperty>();
                    tpl.setSKUProperties(productTplSKUProperties);
                }
                productTplSKUProperties.add(skuProperty);
            }
        }
        data = data.stream().filter(m -> m.containsKey("isSkuCheck") && Boolean.parseBoolean(m.get("isSkuCheck").toString())).collect(Collectors.toList());
        data.addAll(0, products);
        this.dealTplData(tpls, tpl_products);
        return data;
    }

    private String getSkuDefine(Object skuDefines) {
        if (null == skuDefines) {
            return null;
        }
        Map skuDefineMap = (Map)skuDefines;
        int index = 0;
        String definesStr = "";
        for (Map.Entry next : skuDefineMap.entrySet()) {
            definesStr = 0 == index ? definesStr + (String)next.getKey() + ":" + (String)next.getValue() : definesStr + "|" + (String)next.getKey() + ":" + (String)next.getValue();
            ++index;
        }
        return definesStr;
    }

    private Map<String, String> dealSkuDefine(Object skuDefines) throws Exception {
        if (null == skuDefines) {
            return null;
        }
        Map skuDefineMap = (Map)skuDefines;
        HashMap<String, String> tempMap = new HashMap<String, String>();
        for (Map.Entry next : skuDefineMap.entrySet()) {
            String skuShowItem = (String)next.getKey();
            QueryConditionGroup skudefineconditiongroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"classId").eq((Object)"productSku"), QueryCondition.name((String)"showItem").eq((Object)skuShowItem)});
            QuerySchema skudefineschema = QuerySchema.create().addSelect("id,showItem,userdefMode").addCondition((ConditionExpression)skudefineconditiongroup);
            Map skudefine = MetaDaoHelper.queryOne((String)"pc.userdef.UserDefineClass", (QuerySchema)skudefineschema);
            if (null == skudefine || skudefine.isEmpty()) continue;
            if ("1".equals(skudefine.get("userdefMode").toString())) {
                List<String> nameList = Arrays.asList(((String)next.getValue()).split(";"));
                if (null == nameList || nameList.isEmpty()) continue;
                String tempValue = "";
                for (String tempName : nameList) {
                    QueryConditionGroup userDefineGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"userdefid").eq(skudefine.get("id")), QueryCondition.name((String)"name").eq((Object)tempName)});
                    QuerySchema userDefineSchema = QuerySchema.create().addSelect("*").addCondition((ConditionExpression)userDefineGroup);
                    List userDefines = MetaDaoHelper.query((String)"pc.userdef.Userdefine", (QuerySchema)userDefineSchema);
                    if (userDefines == null || userDefines.size() == 0) continue;
                    if (!"".equals(tempValue)) {
                        tempValue = tempValue + "; " + tempName;
                        continue;
                    }
                    tempValue = tempName;
                }
                tempMap.put(skuShowItem, tempValue);
                continue;
            }
            tempMap.put(skuShowItem, (String)next.getValue());
        }
        if (null == tempMap || tempMap.isEmpty()) {
            return null;
        }
        return tempMap;
    }

    private void dealTplData(List<ProductTpl> tpls, Map<String, List<String>> tpl_products) throws Exception {
        HashMap<String, Object> specs = new HashMap<String, Object>();
        if (CollectionUtils.isEmpty(tpls)) {
            return;
        }
        for (ProductTpl tpl : tpls) {
            tpl.setErpCode(tpl.getName());
            tpl.setSkuBusinessDynamic(Boolean.valueOf(false));
            tpl.setSkuBusinessDynamic(Boolean.valueOf(false));
            QuerySchema schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"name").eq((Object)tpl.getName())}));
            List querytpl = MetaDaoHelper.query((String)"pc.tpl.ProductTpl", (QuerySchema)schema);
            if (querytpl != null && querytpl.size() > 0) {
                tpl.setEntityStatus(EntityStatus.Update);
                tpl.setId(((Map)querytpl.get(0)).get("id"));
            } else {
                tpl.setEntityStatus(EntityStatus.Insert);
            }
            this.dealTplSpecData(tpl, specs);
            this.dealTplSkuProperties(tpl);
        }
        BillDataDto dataDto = new BillDataDto();
        dataDto.setBillnum("pc_producttpl");
        dataDto.setData(tpls);
        ResultList resultList = this.upcBillService.batchSave(dataDto);
        List infos = resultList.getInfos();
        if (infos != null) {
            for (Object o : infos) {
                ProductTpl tpl = (ProductTpl)o;
                List<String> productcodes = tpl_products.get(MultilangUtil.getAttr((String)"pc.tpl.ProductTpl", (String)"name", (BizObject)tpl, null));
                for (String productcode : productcodes) {
                    Object tplId = tpl.getId();
                    QuerySchema schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq((Object)productcode)}));
                    List products = MetaDaoHelper.query((String)"pc.product.Product", (QuerySchema)schema);
                    if (products == null || products.size() != 1) continue;
                    Object productId = ((Map)products.get(0)).get("id");
                    Product p = new Product();
                    p.setId(productId);
                    p.setProductTemplate(Long.valueOf(Long.parseLong(tplId.toString())));
                    p.setEntityStatus(EntityStatus.Update);
                    MetaDaoHelper.update((String)"pc.product.Product", (BizObject)p);
                }
            }
        }
    }

    private void dealTplSkuProperties(ProductTpl tpl) throws Exception {
        ProductTplSKUPropertySum skuPropertySum;
        if (null == tpl.SKUProperties()) {
            return;
        }
        List querytplSKUProperty = new ArrayList();
        if ("Update".equals(tpl.getEntityStatus().toString())) {
            HashMap valueIndb = new HashMap();
            QuerySchema schema = QuerySchema.create().addSelect("id,alias,propertyType,order").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"template").eq(tpl.getId())}));
            schema.addCompositionSchema(QuerySchema.create().name("valueItems").fullname("pc.tpl.ProductTplExtendPropertyValue").addSelect("value"));
            querytplSKUProperty = MetaDaoHelper.query((String)"pc.tpl.ProductTplSKUProperty", (QuerySchema)schema);
        }
        List productTplSKUProperties = tpl.SKUProperties();
        HashMap<String, ProductTplSKUPropertySum> existsSkuDefine = new HashMap<String, ProductTplSKUPropertySum>(productTplSKUProperties.size());
        for (ProductTplSKUProperty skuProperty : productTplSKUProperties) {
            String values;
            QuerySchema schema = QuerySchema.create().addSelect("id, showItem, userdefAlias, orderNum, userdefMode").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"showItem").eq(skuProperty.get("skuName")), QueryCondition.name((String)"classId").eq((Object)"productSku")}));
            List skuDefines = MetaDaoHelper.query((String)"pc.userdef.UserDefineClass", (QuerySchema)schema);
            if (CollectionUtils.isEmpty((Collection)skuDefines)) continue;
            skuPropertySum = new ProductTplSKUPropertySum();
            if (existsSkuDefine.containsKey(skuProperty.get("skuName"))) {
                skuPropertySum = (ProductTplSKUPropertySum)existsSkuDefine.get(skuProperty.get("skuName"));
            }
            existsSkuDefine.put((String)skuProperty.get("skuName"), skuPropertySum);
            skuPropertySum.setIsRequired(Boolean.valueOf(false));
            skuPropertySum.set("alias", ((Map)skuDefines.get(0)).get("userdefAlias"));
            skuPropertySum.put("propertyType_showItem", ((Map)skuDefines.get(0)).get("userdefAlias"));
            skuPropertySum.set("order", ((Map)skuDefines.get(0)).get("orderNum"));
            skuPropertySum.setPropertyType(Long.valueOf(Long.parseLong(((Map)skuDefines.get(0)).get("id").toString())));
            skuPropertySum.setEntityStatus(EntityStatus.Insert);
            if (null == ((Map)skuDefines.get(0)).get("userdefMode") || !"1".equals(((Map)skuDefines.get(0)).get("userdefMode").toString())) continue;
            List tempPropertys = querytplSKUProperty.stream().filter(map -> map.get("alias") != null && skuProperty.get("skuName").equals(map.get("alias").toString())).collect(Collectors.toList());
            List<Object> tempValues = new ArrayList();
            if (!CollectionUtils.isEmpty(tempPropertys) && ((Map)tempPropertys.get(0)).get("valueItems") != null) {
                tempValues = ((List)((Map)tempPropertys.get(0)).get("valueItems")).stream().map(m -> m.get("value").toString()).collect(Collectors.toList());
            }
            if (null == skuPropertySum.getValues()) {
                values = (String)skuProperty.get("skuValue");
            } else {
                values = skuPropertySum.getValues();
                values = values + "; " + skuProperty.get("skuValue");
            }
            if (!CollectionUtils.isEmpty(tempValues)) {
                for (String tempValue : tempValues) {
                    if (null == values || "".equals(values)) {
                        values = tempValue;
                        continue;
                    }
                    if (values.contains(tempValue)) continue;
                    values = values + "; " + tempValue;
                }
            }
            skuPropertySum.setValues(values);
        }
        List skuNames = productTplSKUProperties.stream().map(m -> m.get("skuName").toString()).collect(Collectors.toList());
        List tempPropertys = querytplSKUProperty.stream().filter(map -> !skuNames.contains(map.get("alias").toString())).collect(Collectors.toList());
        if (!CollectionUtils.isEmpty(tempPropertys)) {
            for (Map tempProperty : tempPropertys) {
                skuPropertySum = new ProductTplSKUPropertySum();
                if (existsSkuDefine.containsKey(tempProperty.get("alias"))) {
                    skuPropertySum = (ProductTplSKUPropertySum)existsSkuDefine.get(tempProperty.get("alias"));
                }
                existsSkuDefine.put(tempProperty.get("alias").toString(), skuPropertySum);
                skuPropertySum.setIsRequired(Boolean.valueOf(false));
                skuPropertySum.set("alias", tempProperty.get("alias"));
                skuPropertySum.put("propertyType_showItem", tempProperty.get("alias"));
                skuPropertySum.set("order", tempProperty.get("order"));
                skuPropertySum.setPropertyType(Long.valueOf(Long.parseLong(tempProperty.get("propertyType").toString())));
                skuPropertySum.setEntityStatus(EntityStatus.Insert);
                List<Object> tempValues = new ArrayList();
                if (tempProperty.get("valueItems") != null) {
                    tempValues = ((List)tempProperty.get("valueItems")).stream().map(m -> m.get("value").toString()).collect(Collectors.toList());
                }
                String values = null;
                if (!CollectionUtils.isEmpty(tempValues)) {
                    for (String tempValue : tempValues) {
                        if (null == values || "".equals(values)) {
                            values = tempValue;
                            continue;
                        }
                        if (values.contains(tempValue)) continue;
                        values = values + "; " + tempValue;
                    }
                }
                if (values == null) continue;
                skuPropertySum.setValues(values);
            }
        }
        ArrayList<ProductTplSKUPropertySum> skuPropertySums = new ArrayList<ProductTplSKUPropertySum>();
        Iterator iterator = existsSkuDefine.entrySet().iterator();
        while (iterator.hasNext()) {
            skuPropertySums.add((ProductTplSKUPropertySum)iterator.next().getValue());
        }
        tpl.setSKUPropertySums(skuPropertySums);
    }

    private void dealTplSpecData(ProductTpl tpl, Map<String, Object> specs) throws Exception {
        List tplSpecs = tpl.Specs();
        HashMap<String, ArrayList<String>> specItems = new HashMap<String, ArrayList<String>>(16);
        ArrayList<ProductTplSpecSum> tplSpecSums = new ArrayList<ProductTplSpecSum>();
        ArrayList<ProductTplSpec> tplSpecsToDb = new ArrayList<ProductTplSpec>();
        ArrayList<String> specValues = new ArrayList<String>();
        for (ProductTplSpec tplSpec : tplSpecs) {
            ArrayList<String> specName;
            if (!specs.containsKey(tplSpec.get("specName"))) {
                QuerySchema schema = QuerySchema.create().addSelect(new String[]{"id", "isShowSpec"}).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"showItem").eq(tplSpec.get("specName")), QueryCondition.name((String)"classId").eq((Object)"productSpec")}));
                List querySpec = MetaDaoHelper.query((String)"pc.userdef.UserDefineClass", (QuerySchema)schema);
                Assert.notEmpty((Collection)querySpec, (String)(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080C64", (String)"\u89c4\u683c") + tplSpec.get("specName") + InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080C65", (String)"\u4e0d\u5b58\u5728")));
                specs.put(tplSpec.get("specName").toString(), ((Map)querySpec.get(0)).get("id"));
                specs.put(tplSpec.get("specName").toString() + "_isShowSpec", ((Map)querySpec.get(0)).get("isShowSpec"));
            }
            if ((specName = (ArrayList<String>)specItems.get(tplSpec.get("specName").toString())) == null) {
                specName = new ArrayList<String>();
                specItems.put(tplSpec.get("specName").toString(), specName);
            }
            specName.add(tplSpec.getSpecitem());
            if (!tpl.getEntityStatus().equals((Object)EntityStatus.Update)) continue;
            ProductTplSpec productTplSpec = new ProductTplSpec();
            productTplSpec.setId((Object)IdManager.getInstance().nextId());
            productTplSpec.setOrder(Integer.valueOf(1));
            productTplSpec.setTemplate((Long)tpl.getId());
            productTplSpec.setSpecBusinessDynamic(Boolean.valueOf(false));
            productTplSpec.setSpecification(Long.valueOf(Long.parseLong(specs.get(tplSpec.get("specName").toString()).toString())));
            productTplSpec.setSpecitem(tplSpec.getSpecitem());
            productTplSpec.setTwoDimensionalInput(Boolean.valueOf(false));
            tplSpecsToDb.add(productTplSpec);
            specValues.add(tplSpec.getSpecitem());
        }
        if (tpl.getEntityStatus().equals((Object)EntityStatus.Update) && this.pubOptionService.getTplIncrement() == 1) {
            this.saveSpecValues(tplSpecsToDb, specValues, tpl);
        } else {
            int specSumOrder = 1;
            for (Map.Entry entry : specItems.entrySet()) {
                List value = (List)entry.getValue();
                String key = (String)entry.getKey();
                ProductTplSpecSum specSum = new ProductTplSpecSum();
                specSum.setSpecBusinessDynamic(Boolean.valueOf(false));
                specSum.setSpecification(Long.valueOf(Long.parseLong(specs.get(key).toString())));
                specSum.set("specification_isShowSpec", (Object)((Boolean)specs.get(key + "_isShowSpec")));
                specSum.setSpecitem(String.join((CharSequence)"; ", value));
                specSum.setTwoDimensionalInput(Boolean.valueOf(false));
                specSum.setOrder(Integer.valueOf(specSumOrder));
                specSum.setEntityStatus(EntityStatus.Insert);
                tplSpecSums.add(specSum);
                ++specSumOrder;
            }
            tpl.setSpecSums(tplSpecSums);
        }
        tpl.put("increment", (Object)1);
    }

    private void saveSpecValues(List<ProductTplSpec> tplSpecsToDb, List<String> specValues, ProductTpl tpl) throws Exception {
        QuerySchema schema = QuerySchema.create().addSelect("specitem").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"template").eq(tpl.getId()), QueryCondition.name((String)"specitem").in(specValues)}));
        List specItemInDb = MetaDaoHelper.query((String)"pc.tpl.ProductTplSpec", (QuerySchema)schema);
        if (CollectionUtils.isEmpty((Collection)specItemInDb)) {
            MetaDaoHelper.insert((String)"pc.tpl.ProductTplSpec", tplSpecsToDb);
        } else {
            HashMap<String, String> specItemInDbMap = new HashMap<String, String>();
            for (Map specItem : specItemInDb) {
                String specitem = specItem.get("specitem").toString();
                specItemInDbMap.put(specitem, specitem);
            }
            ArrayList<ProductTplSpec> saveSpecs = new ArrayList<ProductTplSpec>();
            for (ProductTplSpec tplSpec : tplSpecsToDb) {
                String specitem = tplSpec.getSpecitem();
                if (specItemInDbMap.containsKey(specitem)) continue;
                saveSpecs.add(tplSpec);
            }
            MetaDaoHelper.insert((String)"pc.tpl.ProductTplSpec", saveSpecs);
        }
    }

    public List<Map<String, Object>> translatData(List<Map<String, Object>> data) throws Exception {
        List productIds = data.stream().filter(d -> d.get("productId") != null).map(d -> (Long)d.get("productId")).collect(Collectors.toList());
        List products = new ArrayList();
        if (productIds != null && productIds.size() > 0) {
            QuerySchema schema = QuerySchema.create().addSelect("id,code,name").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(productIds)}));
            products = MetaDaoHelper.query((String)"pc.product.Product", (QuerySchema)schema);
        }
        List batchUnitCodes = data.stream().filter(d -> d.get("batchUnit_Code") != null).map(d -> (String)d.get("batchUnit_Code")).collect(Collectors.toList());
        List batchUnitsByCode = new ArrayList();
        if (batchUnitCodes != null && batchUnitCodes.size() > 0) {
            QuerySchema schema = QuerySchema.create().addSelect("id,code,name").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").in(batchUnitCodes)}));
            batchUnitsByCode = MetaDaoHelper.query((String)"pc.unit.Unit", (QuerySchema)schema);
        }
        List batchUnitIds = data.stream().filter(d -> d.get("batchUnit") != null).map(d -> (Long)d.get("batchUnit")).collect(Collectors.toList());
        List batchUnitsById = new ArrayList();
        if (batchUnitIds != null && batchUnitIds.size() > 0) {
            QuerySchema schema = QuerySchema.create().addSelect("id,code,name").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(batchUnitIds)}));
            batchUnitsById = MetaDaoHelper.query((String)"pc.unit.Unit", (QuerySchema)schema);
        }
        int i = 1;
        for (Map<String, Object> tempData : data) {
            if (tempData.containsKey("productId") && tempData.get("productId") != null && products != null && products.size() > 0) {
                for (Map tempProduct : products) {
                    if (!tempProduct.get("id").toString().equals(tempData.get("productId").toString())) continue;
                    tempData.put("product_code", tempProduct.get("code").toString());
                    tempData.put("product_name", tempProduct.get("name").toString());
                }
            }
            if (tempData.containsKey("batchUnit_Code") && tempData.get("batchUnit_Code") != null && batchUnitsByCode != null && batchUnitsByCode.size() > 0) {
                for (Map tempUnit : batchUnitsByCode) {
                    if (!tempUnit.get("code").toString().equals(tempData.get("batchUnit_Code").toString())) continue;
                    tempData.put("batchUnit_Name", tempUnit.get("name").toString());
                }
            }
            if (tempData.containsKey("batchUnit") && tempData.get("batchUnit") != null && batchUnitsById != null && batchUnitsById.size() > 0) {
                for (Map tempUnit : batchUnitsById) {
                    if (!tempUnit.get("id").toString().equals(tempData.get("batchUnit").toString())) continue;
                    tempData.put("batchUnit_Code", tempUnit.get("code").toString());
                    tempData.put("batchUnit_Name", tempUnit.get("name").toString());
                }
            }
            tempData.put("_rowNo", i);
            ++i;
        }
        return data;
    }
}

