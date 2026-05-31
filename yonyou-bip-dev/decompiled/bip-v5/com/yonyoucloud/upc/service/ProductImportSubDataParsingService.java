/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSONObject
 *  com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyou.ucf.mdd.ext.datatransfer.DataTransferHelper
 *  com.yonyoucloud.upc.data.cls.ManagementClassDao
 *  com.yonyoucloud.upc.pc.cls.ManagementClass
 *  com.yonyoucloud.upc.pc.product.ProductAlbum
 *  com.yonyoucloud.upc.pc.product.ProductApplyRange
 *  com.yonyoucloud.upc.pc.product.ProductAssistClass
 *  com.yonyoucloud.upc.pc.product.ProductAssistUnitExchange
 *  com.yonyoucloud.upc.pc.product.ProductAttachment
 *  com.yonyoucloud.upc.pc.product.ProductBarCode
 *  com.yonyoucloud.upc.pc.product.ProductCheckFreeExtend
 *  com.yonyoucloud.upc.pc.product.ProductDescription
 *  com.yonyoucloud.upc.pc.product.ProductLoadWay
 *  com.yonyoucloud.upc.pc.product.ProductTag
 *  com.yonyoucloud.upc.pc.product.ProductTagExtend
 *  com.yonyoucloud.upc.pc.product.UnitUseTypeEnum
 *  com.yonyoucloud.upc.utils.EncryptionUtil
 *  org.apache.commons.lang3.ObjectUtils
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.imeta.spring.support.id.IdManager
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service;

import com.alibaba.fastjson.JSONObject;
import com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyou.ucf.mdd.ext.datatransfer.DataTransferHelper;
import com.yonyoucloud.upc.data.cls.ManagementClassDao;
import com.yonyoucloud.upc.pc.cls.ManagementClass;
import com.yonyoucloud.upc.pc.product.ProductAlbum;
import com.yonyoucloud.upc.pc.product.ProductApplyRange;
import com.yonyoucloud.upc.pc.product.ProductAssistClass;
import com.yonyoucloud.upc.pc.product.ProductAssistUnitExchange;
import com.yonyoucloud.upc.pc.product.ProductAttachment;
import com.yonyoucloud.upc.pc.product.ProductBarCode;
import com.yonyoucloud.upc.pc.product.ProductCheckFreeExtend;
import com.yonyoucloud.upc.pc.product.ProductDescription;
import com.yonyoucloud.upc.pc.product.ProductLoadWay;
import com.yonyoucloud.upc.pc.product.ProductTag;
import com.yonyoucloud.upc.pc.product.ProductTagExtend;
import com.yonyoucloud.upc.pc.product.UnitUseTypeEnum;
import com.yonyoucloud.upc.utils.EncryptionUtil;
import java.math.BigDecimal;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Collectors;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.imeta.spring.support.id.IdManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="productImportSubDataParsingService")
public class ProductImportSubDataParsingService {
    @Autowired
    private YMSParamConfig ymsParamConfig;
    @Autowired
    private ManagementClassDao managementClassDao;

    public void dealAssistUnit(List<Map<String, Object>> mapList) throws Exception {
        List tplIds = mapList.stream().filter(data -> data.get("productTemplate") != null).map(data -> data.get("productTemplate").toString()).collect(Collectors.toList());
        List unitUseTypes = mapList.stream().filter(data -> data.get("unitUseType") != null).map(data -> data.get("unitUseType").toString()).collect(Collectors.toList());
        if (!CollectionUtils.isEmpty(tplIds)) {
            List sptUnitExchange = new ArrayList();
            List sptUnit = new ArrayList();
            if (!CollectionUtils.isEmpty(unitUseTypes) && unitUseTypes.contains("1")) {
                QueryConditionGroup sptUnitExchangeconditiongroup = new QueryConditionGroup();
                QuerySchema sptUnitExchangeschema = QuerySchema.create().addSelect("template,template.name as template_Name,unitExchangeType,assistUnit,assistUnitCount,mainUnitCount,iOrder,mainUnitCountNew,mainUnitRate,assistVersValue").addCondition((ConditionExpression)sptUnitExchangeconditiongroup);
                sptUnitExchange = MetaDaoHelper.query((String)"pc.tpl.ProductTplAssistUnitExchange", (QuerySchema)sptUnitExchangeschema);
                QueryConditionGroup sptUnitconditiongroup = new QueryConditionGroup();
                QuerySchema sptUnitschema = QuerySchema.create().addSelect("template,template.name as template_Name,enableAssistUnit,unit,purchaseUnit,stockUnit,batchUnit,onlineUnit,offlineUnit,requireUnit,batchPriceUnit,purchasePriceUnit,produceUnit,inspectionUnit,demandPlanningUnit").addCondition((ConditionExpression)sptUnitconditiongroup);
                sptUnit = MetaDaoHelper.query((String)"pc.tpl.ProductTplUnit", (QuerySchema)sptUnitschema);
            }
            for (Map<String, Object> psmap : mapList) {
                if (psmap.get("unitUseType") == null || UnitUseTypeEnum.USE_TIMPLATE.getValue() != Short.parseShort(psmap.get("unitUseType").toString()) || psmap.get("productTemplate") == null) continue;
                if (psmap.get("productTemplate") == null) {
                    this.addOneErrorMessages(psmap, InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080331", (String)"\u8ba1\u91cf\u5355\u4f4d\u8bbe\u7f6e\u89c4\u5219\u4e3a\u4f7f\u7528\u6a21\u677f\u7684\u8ba1\u91cf\u5355\u4f4d\uff0c\u5f53\u524d\u672a\u4f20\u7269\u6599\u6a21\u677f\u6570\u636e\uff0c\u8bf7\u68c0\u67e5\uff01"));
                    continue;
                }
                ArrayList<ProductAssistUnitExchange> productAssistUnitExchange = new ArrayList<ProductAssistUnitExchange>();
                String excelRowNo = psmap.get("poiExcelRowNum") + ".";
                if (sptUnitExchange != null) {
                    int rowNoTemp = 1;
                    for (Map sptUnitExchangeItem : sptUnitExchange) {
                        if (!psmap.get("productTemplate").equals(sptUnitExchangeItem.get("template"))) continue;
                        ProductAssistUnitExchange productAssistUnitExchangeItem = new ProductAssistUnitExchange();
                        productAssistUnitExchangeItem.put("poiExcelSheetName", psmap.get("poiExcelSheetName"));
                        productAssistUnitExchangeItem.put("poiExcelRowNum", (Object)(excelRowNo + rowNoTemp));
                        productAssistUnitExchangeItem.set("unitExchangeType", (Object)Integer.parseInt(sptUnitExchangeItem.get("unitExchangeType").toString()));
                        productAssistUnitExchangeItem.set("assistUnit", sptUnitExchangeItem.get("assistUnit"));
                        productAssistUnitExchangeItem.set("assistUnitCount", sptUnitExchangeItem.get("assistUnitCount"));
                        productAssistUnitExchangeItem.set("mainUnitCount", sptUnitExchangeItem.get("mainUnitCount"));
                        productAssistUnitExchangeItem.set("mainUnitCountNew", sptUnitExchangeItem.get("mainUnitCountNew"));
                        productAssistUnitExchangeItem.set("mainUnitRate", sptUnitExchangeItem.get("mainUnitRate"));
                        productAssistUnitExchangeItem.set("assistVersValue", sptUnitExchangeItem.get("assistVersValue"));
                        productAssistUnitExchangeItem.set("iOrder", sptUnitExchangeItem.get("iOrder"));
                        productAssistUnitExchangeItem.setEntityStatus(EntityStatus.Insert);
                        productAssistUnitExchange.add(productAssistUnitExchangeItem);
                        ++rowNoTemp;
                    }
                }
                boolean hasUnit = false;
                if (sptUnit != null) {
                    for (Map sptUnitItem : sptUnit) {
                        if (!psmap.get("productTemplate").equals(sptUnitItem.get("template"))) continue;
                        psmap.put("enableAssistUnit", sptUnitItem.get("enableAssistUnit"));
                        psmap.put("unit", sptUnitItem.get("unit"));
                        psmap.remove("unit_Name");
                        hasUnit = true;
                    }
                }
                if (!hasUnit) {
                    this.addOneErrorMessages(psmap, InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408032E", (String)"\u8ba1\u91cf\u5355\u4f4d\u8bbe\u7f6e\u89c4\u5219\u4e3a\u4f7f\u7528\u6a21\u677f\u7684\u8ba1\u91cf\u5355\u4f4d\uff0c\u6240\u4f20\u6a21\u677f\u4e0d\u5305\u542b\u8ba1\u91cf\u5355\u4f4d\u6570\u636e\uff0c\u8bf7\u68c0\u67e5\uff01"));
                    continue;
                }
                psmap.put("productAssistUnitExchanges", productAssistUnitExchange);
            }
        }
    }

    public void dealAssistUnitString(List<Map<String, Object>> mapList) throws Exception {
        for (Map<String, Object> psmap : mapList) {
            if (psmap.get("unitUseType") != null && UnitUseTypeEnum.USE_PRODUCT.getValue() == Short.parseShort(psmap.get("unitUseType").toString()) && psmap.get("productAssistUnitExchanges") != null) {
                ArrayList<ProductAssistUnitExchange> productAssistUnitExchange = new ArrayList<ProductAssistUnitExchange>();
                String excelRowNo = psmap.get("poiExcelRowNum") + ".";
                Map productAssistUnitExchangeMap = (Map)((List)psmap.get("productAssistUnitExchanges")).get(0);
                if (productAssistUnitExchangeMap.get("assistUnit_Name") == null || productAssistUnitExchangeMap.get("unitExchangeType") == null) {
                    this.addOneErrorMessages(psmap, InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080322", (String)"\u542f\u7528\u8f85\u8ba1\u91cf\u72b6\u6001\u4e3a\u542f\u7528\uff0c\u8ba1\u91cf\u5355\u4f4d\u8bbe\u7f6e\u89c4\u5219\u4e3a\u4f7f\u7528\u81ea\u5df1\u7684\u8ba1\u91cf\u5355\u4f4d\uff0c\u6362\u7b97\u65b9\u5f0f\u4ee5\u53ca\u8f85\u8ba1\u91cf\u5355\u4f4d\u90fd\u9700\u8981\u4f20\u53c2\uff01\uff01\uff01"));
                } else {
                    String unitExchangeType = productAssistUnitExchangeMap.get("unitExchangeType").toString();
                    String[] assistUnitList = StringUtils.split((String)productAssistUnitExchangeMap.get("assistUnit_Name").toString(), (String)"|");
                    int iOrder = 0;
                    int rowNoTemp = 1;
                    for (String assistUnit : assistUnitList) {
                        String[] assistUnitNameValue = StringUtils.split((String)assistUnit, (String)":");
                        ProductAssistUnitExchange productAssistUnitExchangeItem = new ProductAssistUnitExchange();
                        productAssistUnitExchangeItem.putAll(productAssistUnitExchangeMap);
                        productAssistUnitExchangeItem.put("poiExcelRowNum", (Object)(excelRowNo + rowNoTemp));
                        productAssistUnitExchangeItem.set("unitExchangeType", (Object)Integer.parseInt(unitExchangeType));
                        productAssistUnitExchangeItem.set("assistUnit_Name", (Object)assistUnitNameValue[0]);
                        if (assistUnitNameValue.length == 2) {
                            productAssistUnitExchangeItem.set("assistUnitCount", (Object)new BigDecimal(1));
                            productAssistUnitExchangeItem.set("mainUnitCountNew", (Object)ProductImportSubDataParsingService.turnBigDecimal(assistUnitNameValue[1]));
                        } else if (assistUnitNameValue.length == 3) {
                            productAssistUnitExchangeItem.set("assistUnitCount", (Object)ProductImportSubDataParsingService.turnBigDecimal(assistUnitNameValue[1]));
                            productAssistUnitExchangeItem.set("mainUnitCountNew", (Object)ProductImportSubDataParsingService.turnBigDecimal(assistUnitNameValue[2]));
                        } else {
                            this.addOneErrorMessages(psmap, InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408031F", (String)"\u542f\u7528\u8f85\u8ba1\u91cf\u72b6\u6001\u4e3a\u542f\u7528\uff0c\u7ec4\u88c5\u8f85\u8ba1\u91cf\u6570\u636e\u65f6\u51fa\u73b0\u95ee\u9898\uff0c\u8bf7\u68c0\u67e5\u8f85\u8ba1\u91cf\u4f20\u53c2\u662f\u5426\u6b63\u786e"));
                            break;
                        }
                        productAssistUnitExchangeItem.set("iOrder", (Object)iOrder);
                        ++iOrder;
                        productAssistUnitExchangeItem.setEntityStatus(EntityStatus.Insert);
                        productAssistUnitExchange.add(productAssistUnitExchangeItem);
                        ++rowNoTemp;
                    }
                }
                psmap.put("productAssistUnitExchanges", productAssistUnitExchange);
                continue;
            }
            if (psmap.get("unitUseType") == null || UnitUseTypeEnum.USE_TIMPLATE.getValue() != Short.parseShort(psmap.get("unitUseType").toString())) continue;
            psmap.remove("unit");
            psmap.remove("unit_Name");
            psmap.remove("productAssistUnitExchanges");
        }
    }

    public void dealProductTagsForNewSDK(List<Map<String, Object>> mapList) throws Exception {
        List productList = mapList.stream().filter(data -> data.get("productTags") != null).collect(Collectors.toList());
        if (!CollectionUtils.isEmpty(productList)) {
            QueryConditionGroup tagconditiongroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"stopstatus").eq((Object)false)});
            QuerySchema tagschema = QuerySchema.create().addSelect("id,name,tag_position").addCondition((ConditionExpression)tagconditiongroup);
            List tag = MetaDaoHelper.query((String)"pc.tag.Tag", (QuerySchema)tagschema);
            if (!CollectionUtils.isEmpty((Collection)tag)) {
                Map<String, List<Map>> tagMapInDb = tag.stream().collect(Collectors.groupingBy(data -> data.get("name").toString()));
                for (Map psmap : productList) {
                    ArrayList<ProductTagExtend> productTagsList = new ArrayList<ProductTagExtend>();
                    String excelRowNo = psmap.get("poiExcelRowNum") + ".";
                    Map tagMap = (Map)((List)psmap.get("productTags")).get(0);
                    String[] productTagsS = StringUtils.split((String)tagMap.get("tagId_name").toString(), (String)"|");
                    int tagNumber = 0;
                    int rowNoTemp = 1;
                    for (String productTagsSitem : productTagsS) {
                        if (tagMapInDb.get(productTagsSitem) == null) continue;
                        ProductTagExtend productTags = new ProductTagExtend();
                        productTags.putAll(tagMap);
                        productTags.put("poiExcelRowNum", (Object)(excelRowNo + rowNoTemp));
                        productTags.setEntityStatus(EntityStatus.Insert);
                        productTags.put("tagId", tagMapInDb.get(productTagsSitem).get(0).get("id"));
                        productTags.put("tagId_name", tagMapInDb.get(productTagsSitem).get(0).get("name"));
                        productTags.put("tagId_position", tagMapInDb.get(productTagsSitem).get(0).get("tag_position"));
                        productTagsList.add(productTags);
                        ++tagNumber;
                        ++rowNoTemp;
                    }
                    if (tagNumber != productTagsS.length) {
                        this.addOneErrorMessages(psmap, InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080325", (String)"\u5f53\u524d\u7269\u6599\u6709\u6807\u7b7e\u672a\u627e\u5230\uff0c\u8bf7\u68c0\u67e5\uff01"));
                        continue;
                    }
                    boolean tagPositionflag = false;
                    for (int i = 0; i < productTagsList.size(); ++i) {
                        for (int j = i + 1; j < productTagsList.size(); ++j) {
                            if (((ProductTagExtend)productTagsList.get(i)).get("tagId_position") == null || !((ProductTagExtend)productTagsList.get(i)).get("tagId_position").equals(((ProductTagExtend)productTagsList.get(j)).get("tagId_position"))) continue;
                            tagPositionflag = true;
                            break;
                        }
                        if (tagPositionflag) break;
                    }
                    if (tagPositionflag) {
                        this.addOneErrorMessages(psmap, InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080333", (String)"\u5f53\u524d\u7269\u6599\u6709\u6807\u7b7e\u4f4d\u7f6e\u91cd\u590d\uff0c\u8bf7\u68c0\u67e5\uff01"));
                        continue;
                    }
                    if (!CollectionUtils.isEmpty(productTagsList)) {
                        psmap.put("productTags", productTagsList);
                        continue;
                    }
                    this.addOneErrorMessages(psmap, InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080321", (String)"\u7269\u6599\u6807\u7b7e\u89e3\u6790\u6570\u636e\u51fa\u73b0\u95ee\u9898\uff0c\u8bf7\u68c0\u67e5\u6807\u7b7e\u4f20\u53c2\uff01"));
                }
            }
        }
    }

    public void dealProductTags(List<Map<String, Object>> mapList) throws Exception {
        List productList = mapList.stream().filter(data -> data.get("productTags") != null).collect(Collectors.toList());
        if (!CollectionUtils.isEmpty(productList)) {
            QueryConditionGroup tagconditiongroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"stopstatus").eq((Object)false)});
            QuerySchema tagschema = QuerySchema.create().addSelect("id,name,tag_position").addCondition((ConditionExpression)tagconditiongroup);
            List tag = MetaDaoHelper.query((String)"pc.tag.Tag", (QuerySchema)tagschema);
            if (!CollectionUtils.isEmpty((Collection)tag)) {
                Map<String, List<Map>> tagMapInDb = tag.stream().collect(Collectors.groupingBy(data -> data.get("name").toString()));
                for (Map psmap : productList) {
                    ArrayList<ProductTag> productTagsList = new ArrayList<ProductTag>();
                    String excelRowNo = psmap.get("poiExcelRowNum") + ".";
                    Map tagMap = (Map)((List)psmap.get("productTags")).get(0);
                    String[] productTagsS = StringUtils.split((String)tagMap.get("tagId_name").toString(), (String)"|");
                    int tagNumber = 0;
                    int rowNoTemp = 1;
                    for (String productTagsSitem : productTagsS) {
                        if (tagMapInDb.get(productTagsSitem) == null) continue;
                        ProductTag productTags = new ProductTag();
                        productTags.putAll(tagMap);
                        productTags.put("poiExcelRowNum", (Object)(excelRowNo + rowNoTemp));
                        productTags.setEntityStatus(EntityStatus.Insert);
                        productTags.put("tagId", tagMapInDb.get(productTagsSitem).get(0).get("id"));
                        productTags.put("tagId_name", tagMapInDb.get(productTagsSitem).get(0).get("name"));
                        productTags.put("tagId_position", tagMapInDb.get(productTagsSitem).get(0).get("tag_position"));
                        productTagsList.add(productTags);
                        ++tagNumber;
                        ++rowNoTemp;
                    }
                    if (tagNumber != productTagsS.length) {
                        this.addOneErrorMessages(psmap, InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080325", (String)"\u5f53\u524d\u7269\u6599\u6709\u6807\u7b7e\u672a\u627e\u5230\uff0c\u8bf7\u68c0\u67e5\uff01"));
                        continue;
                    }
                    boolean tagPositionflag = false;
                    for (int i = 0; i < productTagsList.size(); ++i) {
                        for (int j = i + 1; j < productTagsList.size(); ++j) {
                            if (((ProductTag)productTagsList.get(i)).get("tagId_position") == null || !((ProductTag)productTagsList.get(i)).get("tagId_position").equals(((ProductTag)productTagsList.get(j)).get("tagId_position"))) continue;
                            tagPositionflag = true;
                            break;
                        }
                        if (tagPositionflag) break;
                    }
                    if (tagPositionflag) {
                        this.addOneErrorMessages(psmap, InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080333", (String)"\u5f53\u524d\u7269\u6599\u6709\u6807\u7b7e\u4f4d\u7f6e\u91cd\u590d\uff0c\u8bf7\u68c0\u67e5\uff01"));
                        continue;
                    }
                    if (!CollectionUtils.isEmpty(productTagsList)) {
                        psmap.put("productTags", productTagsList);
                        continue;
                    }
                    this.addOneErrorMessages(psmap, InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080321", (String)"\u7269\u6599\u6807\u7b7e\u89e3\u6790\u6570\u636e\u51fa\u73b0\u95ee\u9898\uff0c\u8bf7\u68c0\u67e5\u6807\u7b7e\u4f20\u53c2\uff01"));
                }
            }
        }
    }

    public void dealProductLoadWay(List<Map<String, Object>> mapList) throws Exception {
        QuerySchema schema;
        List productLoadWaysListMap;
        List productList = mapList.stream().filter(data -> data.get("productLoadWays") != null).collect(Collectors.toList());
        if (!CollectionUtils.isEmpty(productList) && !CollectionUtils.isEmpty((Collection)(productLoadWaysListMap = MetaDaoHelper.query((String)"base.loadway.LoadWay", (QuerySchema)(schema = QuerySchema.create().addSelect("id,name").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"stopstatus").eq((Object)false)}))))))) {
            Map<String, List<Map>> loadWayMapInDb = productLoadWaysListMap.stream().collect(Collectors.groupingBy(data -> data.get("name").toString()));
            for (Map psmap : productList) {
                String excelRowNo = psmap.get("poiExcelRowNum") + ".";
                Map loadWayTempMap = (Map)((List)psmap.get("productLoadWays")).get(0);
                String[] loadWay_names = StringUtils.split((String)loadWayTempMap.get("loadWay_Name").toString(), (String)"|");
                HashMap<String, Boolean> loadWayMap = new HashMap<String, Boolean>();
                boolean nameFlag = false;
                for (String loadWay_name : loadWay_names) {
                    if (null != loadWayMap.get(loadWay_name)) {
                        nameFlag = true;
                        break;
                    }
                    loadWayMap.put(loadWay_name, true);
                }
                if (nameFlag) {
                    this.addOneErrorMessages(psmap, InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080326", (String)"\u7269\u6599\u88c5\u8f7d\u65b9\u5f0f\u540d\u79f0\u91cd\u590d\uff0c\u8bf7\u68c0\u67e5\uff01"));
                    continue;
                }
                boolean loadWayFlag = true;
                ArrayList<ProductLoadWay> productLoadWaysList = new ArrayList<ProductLoadWay>();
                int rowNoTemp = 1;
                for (String loadWay_name : loadWay_names) {
                    loadWayFlag = false;
                    if (loadWayMapInDb.get(loadWay_name) != null) {
                        ProductLoadWay productLoadWay = new ProductLoadWay();
                        productLoadWay.putAll(loadWayTempMap);
                        productLoadWay.put("poiExcelRowNum", (Object)(excelRowNo + rowNoTemp));
                        productLoadWay.setEntityStatus(EntityStatus.Insert);
                        productLoadWay.set("loadWay", loadWayMapInDb.get(loadWay_name).get(0).get("id"));
                        productLoadWay.set("loadWay_Name", loadWayMapInDb.get(loadWay_name).get(0).get("name"));
                        productLoadWaysList.add(productLoadWay);
                        loadWayFlag = true;
                        ++rowNoTemp;
                    }
                    if (!loadWayFlag) break;
                }
                if (!loadWayFlag) {
                    this.addOneErrorMessages(psmap, InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080323", (String)"\u7269\u6599\u88c5\u8f7d\u65b9\u5f0f\u4e0d\u5b58\u5728\uff0c\u8bf7\u68c0\u67e5\uff01"));
                    continue;
                }
                if (!CollectionUtils.isEmpty(productLoadWaysList)) {
                    psmap.put("productLoadWays", productLoadWaysList);
                    continue;
                }
                this.addOneErrorMessages(psmap, InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080328", (String)"\u7269\u6599\u88c5\u8f7d\u65b9\u5f0f\u89e3\u6790\u6570\u636e\u51fa\u73b0\u95ee\u9898\uff0c\u8bf7\u68c0\u67e5\u88c5\u8f7d\u65b9\u5f0f\u4f20\u53c2\uff01"));
            }
        }
    }

    public void dealAssistClasses(List<Map<String, Object>> mapList) throws Exception {
        List productList = mapList.stream().filter(data -> data.get("productAssistClasses") != null).collect(Collectors.toList());
        if (!CollectionUtils.isEmpty(productList)) {
            QueryConditionGroup pclassconditiongroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"stopstatus").eq((Object)false)});
            QuerySchema pclassschema = QuerySchema.create().addSelect("id,code,name,isEnd,stopstatus").addCondition((ConditionExpression)pclassconditiongroup);
            List pclass = MetaDaoHelper.query((String)"pc.cls.PresentationClass", (QuerySchema)pclassschema);
            if (!CollectionUtils.isEmpty((Collection)pclass)) {
                Map<String, List<Map>> assistClassMapInDb = pclass.stream().collect(Collectors.groupingBy(data -> data.get("code").toString()));
                for (Map psmap : productList) {
                    ArrayList<ProductAssistClass> productAssistClassesList = new ArrayList<ProductAssistClass>();
                    String excelRowNo = psmap.get("poiExcelRowNum") + ".";
                    Map assistClassTempMap = (Map)((List)psmap.get("productAssistClasses")).get(0);
                    String[] productAssistClassesS = StringUtils.split((String)assistClassTempMap.get("assClass_Name").toString(), (String)"|");
                    int rowNoTemp = 1;
                    for (String productAssistClassesSitem : productAssistClassesS) {
                        if (assistClassMapInDb.get(productAssistClassesSitem) == null) continue;
                        ProductAssistClass productAssistClasses = new ProductAssistClass();
                        productAssistClasses.putAll(assistClassTempMap);
                        productAssistClasses.put("poiExcelRowNum", (Object)(excelRowNo + rowNoTemp));
                        productAssistClasses.setEntityStatus(EntityStatus.Insert);
                        productAssistClasses.put("productClassId", assistClassMapInDb.get(productAssistClassesSitem).get(0).get("id"));
                        productAssistClasses.put("productClassId_code", assistClassMapInDb.get(productAssistClassesSitem).get(0).get("code"));
                        productAssistClasses.put("assClass_Name", assistClassMapInDb.get(productAssistClassesSitem).get(0).get("name"));
                        productAssistClasses.put("productClassId_stopstatus", assistClassMapInDb.get(productAssistClassesSitem).get(0).get("stopstatus"));
                        productAssistClassesList.add(productAssistClasses);
                        ++rowNoTemp;
                    }
                    if (!CollectionUtils.isEmpty(productAssistClassesList)) {
                        psmap.put("productAssistClasses", productAssistClassesList);
                        continue;
                    }
                    this.addOneErrorMessages(psmap, InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408032D", (String)"\u7269\u6599\u8f85\u52a9\u5206\u7c7b\u89e3\u6790\u6570\u636e\u51fa\u73b0\u95ee\u9898\uff0c\u8bf7\u68c0\u67e5\u8f85\u52a9\u5206\u7c7b\u4f20\u53c2\uff01"));
                }
            }
        }
    }

    public void dealBarCodes(List<Map<String, Object>> mapList) throws Exception {
        List productList = mapList.stream().filter(data -> data.get("productBarCodes") != null).collect(Collectors.toList());
        if (!CollectionUtils.isEmpty(productList)) {
            for (Map psmap : productList) {
                ArrayList<ProductBarCode> productBarCodesList = new ArrayList<ProductBarCode>();
                Map barCodesTempMap = (Map)((List)psmap.get("productBarCodes")).get(0);
                String excelRowNo = psmap.get("poiExcelRowNum") + ".";
                String[] productBarCodes = StringUtils.split((String)barCodesTempMap.get("barCode").toString(), (String)",");
                int rowNoTemp = 1;
                for (String productBarCodesSitem : productBarCodes) {
                    ProductBarCode productBarCode = new ProductBarCode();
                    productBarCode.putAll(barCodesTempMap);
                    productBarCode.put("poiExcelRowNum", (Object)(excelRowNo + rowNoTemp));
                    productBarCode.setEntityStatus(EntityStatus.Insert);
                    productBarCode.setBarCode(productBarCodesSitem);
                    productBarCode.setEntityStatus(EntityStatus.Insert);
                    productBarCodesList.add(productBarCode);
                    ++rowNoTemp;
                }
                if (!CollectionUtils.isEmpty(productBarCodesList)) {
                    psmap.put("productBarCodes", productBarCodesList);
                    continue;
                }
                this.addOneErrorMessages(psmap, InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408032B", (String)"\u7269\u6599\u591a\u6761\u7801\u89e3\u6790\u6570\u636e\u51fa\u73b0\u95ee\u9898\uff0c\u8bf7\u68c0\u67e5\u591a\u6761\u7801\u4f20\u53c2\uff01"));
            }
        }
    }

    public void dealProductImages(List<Map<String, Object>> mapList) throws Exception {
        List productList = mapList.stream().filter(data -> data.get("productAlbums") != null).collect(Collectors.toList());
        if (!CollectionUtils.isEmpty(productList)) {
            for (Map psmap : productList) {
                String excelRowNo = psmap.get("poiExcelRowNum") + ".";
                List productImgTempMaps = (List)psmap.get("productAlbums");
                ArrayList<ProductAlbum> productAlbums = new ArrayList<ProductAlbum>();
                int rowNoTemp = 1;
                for (Map productImgTempMap : productImgTempMaps) {
                    Map imgMap = (Map)JSONObject.parseObject((String)productImgTempMap.get("productAlbums_imgName").toString(), Map.class);
                    for (Map.Entry entry : imgMap.entrySet()) {
                        Map ossResult = (Map)entry.getValue();
                        String curl = ossResult.get("cUrl") != null ? ossResult.get("cUrl").toString() : (String)entry.getKey();
                        curl = this.replaceUrl(curl);
                        ProductAlbum productAlbum = new ProductAlbum();
                        productAlbum.putAll(productImgTempMap);
                        productAlbum.put("poiExcelRowNum", (Object)(excelRowNo + rowNoTemp));
                        productAlbum.setEntityStatus(EntityStatus.Insert);
                        productAlbum.put("folder", (Object)curl);
                        productAlbum.put("size", (Object)Long.parseLong(ossResult.get("cFileSize").toString()));
                        productAlbum.put("type", (Object)("image/" + ossResult.get("cExtName")));
                        if ("jpg".equals(ossResult.get("cExtName"))) {
                            productAlbum.put("type", (Object)"image/jpeg");
                        }
                        productAlbum.put("imgName", entry.getKey());
                        productAlbum.put("sort", (Object)rowNoTemp);
                        productAlbums.add(productAlbum);
                        ++rowNoTemp;
                    }
                }
                if (!CollectionUtils.isEmpty(productAlbums)) {
                    psmap.put("productAlbums", productAlbums);
                    continue;
                }
                this.addOneErrorMessages(psmap, InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080332", (String)"\u7269\u6599\u56fe\u7247\u89e3\u6790\u6570\u636e\u51fa\u73b0\u95ee\u9898\uff0c\u8bf7\u68c0\u67e5\u7269\u6599\u56fe\u7247\u4f20\u53c2\uff01"));
            }
        }
    }

    public void dealProductVideos(List<Map<String, Object>> mapList) throws Exception {
        List productList = mapList.stream().filter(data -> data.get("productVideos") != null).collect(Collectors.toList());
        if (!CollectionUtils.isEmpty(productList)) {
            for (Map psmap : productList) {
                String excelRowNo = psmap.get("poiExcelRowNum") + ".";
                List productVideoTempMaps = (List)psmap.get("productVideos");
                ArrayList<ProductAttachment> productVideos = new ArrayList<ProductAttachment>();
                int rowNoTemp = 1;
                for (Map productVideoTempMap : productVideoTempMaps) {
                    Map imgMap = (Map)JSONObject.parseObject((String)productVideoTempMap.get("productVideo_fileName").toString(), Map.class);
                    for (Map.Entry entry : imgMap.entrySet()) {
                        Map ossResult = (Map)entry.getValue();
                        String curl = ossResult.get("cUrl") != null ? ossResult.get("cUrl").toString() : (String)entry.getKey();
                        curl = this.replaceUrl(curl);
                        ProductAttachment productVideo = new ProductAttachment();
                        productVideo.putAll(productVideoTempMap);
                        productVideo.put("poiExcelRowNum", (Object)(excelRowNo + rowNoTemp));
                        productVideo.setEntityStatus(EntityStatus.Insert);
                        productVideo.put("folder", (Object)curl);
                        productVideo.put("size", (Object)Long.parseLong(ossResult.get("cFileSize").toString()));
                        productVideo.put("type", (Object)("video/" + ossResult.get("cExtName")));
                        productVideo.put("fileName", entry.getKey());
                        productVideo.put("sort", (Object)rowNoTemp);
                        productVideos.add(productVideo);
                        ++rowNoTemp;
                    }
                }
                if (!CollectionUtils.isEmpty(productVideos)) {
                    psmap.put("productVideos", productVideos);
                    continue;
                }
                this.addOneErrorMessages(psmap, InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080324", (String)"\u7269\u6599\u89c6\u9891\u89e3\u6790\u6570\u636e\u51fa\u73b0\u95ee\u9898\uff0c\u8bf7\u68c0\u67e5\u7269\u6599\u89c6\u9891\u4f20\u53c2\uff01"));
            }
        }
    }

    public void dealProductDescriptionForNewSDK(List<Map<String, Object>> mapList) throws Exception {
        List productList = mapList.stream().filter(data -> data.get("description") != null).collect(Collectors.toList());
        if (!CollectionUtils.isEmpty(productList)) {
            for (Map psmap : productList) {
                ProductDescription productDescription = (ProductDescription)psmap.get("description");
                productDescription.setEntityStatus(EntityStatus.Insert);
                if (productDescription.get("description") != null) {
                    productDescription.put("description", (Object)this.turnImageurlForDescription(productDescription.get("description").toString()));
                }
                if (productDescription.get("mobileDescription") != null) {
                    productDescription.put("mobileDescription", (Object)this.turnImageurlForDescription(productDescription.get("mobileDescription").toString()));
                }
                if (productDescription.get("description") != null || productDescription.get("mobileDescription") != null) continue;
                psmap.remove("description");
            }
        }
    }

    public void dealProductDescription(List<Map<String, Object>> mapList) throws Exception {
        List productList = mapList.stream().filter(data -> data.get("description!description") != null || data.get("description!mobileDescription") != null).collect(Collectors.toList());
        if (!CollectionUtils.isEmpty(productList)) {
            for (Map psmap : productList) {
                if (psmap.get("description!description") != null) {
                    psmap.put("description!description", this.turnImageurlForDescription(psmap.get("description!description").toString()));
                }
                if (psmap.get("description!mobileDescription") == null) continue;
                psmap.put("description!mobileDescription", this.turnImageurlForDescription(psmap.get("description!mobileDescription").toString()));
            }
        }
    }

    public void dealProductOrgs(List<Map<String, Object>> mapList) throws Exception {
        List productList = mapList.stream().filter(data -> data.get("productOrgs") != null).collect(Collectors.toList());
        if (!CollectionUtils.isEmpty(productList)) {
            for (Map psmap : productList) {
                List productOrgTempMaps;
                if (psmap.get("productCustomers") != null) {
                    psmap.remove("productCustomers");
                }
                if (psmap.get("productShops") != null) {
                    psmap.remove("productShops");
                }
                if (psmap.get("productApplyRange") != null) {
                    psmap.remove("productApplyRange");
                }
                if ((productOrgTempMaps = (List)((List)psmap.get("productOrgs")).stream().collect(Collectors.collectingAndThen(Collectors.toCollection(() -> new TreeSet<Map>(Comparator.comparing(m -> m.get("orgCode").toString()))), ArrayList::new))).size() > 1000) {
                    psmap.remove("productOrgs");
                    this.addOneErrorMessages(psmap, InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408032C", (String)"\u5f53\u524d\u7269\u6599\u9002\u7528\u8303\u56f4\u6570\u91cf\u8d85\u8fc71000\u6761\uff0c\u8bf7\u901a\u8fc7\u5176\u4ed6\u65b9\u5f0f\u8fdb\u884c\u65b0\u589e\u64cd\u4f5c\uff01\uff01\uff01"));
                    continue;
                }
                List<ProductApplyRange> productApplyRanges = this.dealProductOrgTempMaps(productOrgTempMaps, psmap);
                if (!CollectionUtils.isEmpty(productApplyRanges)) {
                    psmap.put("productOrgs", productApplyRanges);
                    continue;
                }
                this.addOneErrorMessages(psmap, InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080330", (String)"\u7269\u6599\u9002\u7528\u8303\u56f4\u89e3\u6790\u6570\u636e\u51fa\u73b0\u95ee\u9898\uff0c\u8bf7\u68c0\u67e5\u7269\u6599\u9002\u7528\u8303\u56f4\u4f20\u53c2\uff01"));
            }
        }
    }

    public void dealProductCheckFrees(List<Map<String, Object>> mapList) throws Exception {
        List productList = mapList.stream().filter(data -> data.get("productCheckFrees") != null).collect(Collectors.toList());
        if (!CollectionUtils.isEmpty(productList)) {
            boolean mfilter = true;
            HashMap<String, String> filters = new HashMap<String, String>();
            filters.put("type", "checkFree");
            List checkFilters = SqlHelper.selectList((String)"com.yonyoucloud.upc.mapper.filter.tenant", filters);
            if (!CollectionUtils.isEmpty((Collection)checkFilters) && checkFilters.contains(AppContext.getTenantId().toString())) {
                mfilter = false;
            }
            for (Map psmap : productList) {
                String excelRowNo = psmap.get("poiExcelRowNum") + ".";
                List productSpecFreeTempMaps = (List)psmap.get("productCheckFrees");
                ArrayList<ProductCheckFreeExtend> productSpecFrees = new ArrayList<ProductCheckFreeExtend>(productSpecFreeTempMaps.size());
                List<Object> manufactureFreeNames = new ArrayList();
                List<Object> checkFreeNames = new ArrayList();
                int rowNoTemp = 1;
                for (Map productSpecFreeTempMap : productSpecFreeTempMaps) {
                    if (productSpecFreeTempMap.get("freeType") == null || productSpecFreeTempMap.get("freeId_Name") == null) continue;
                    if ("0".equals(productSpecFreeTempMap.get("freeType").toString())) {
                        checkFreeNames.add(productSpecFreeTempMap.get("freeId_Name").toString());
                        continue;
                    }
                    if (!"1".equals(productSpecFreeTempMap.get("freeType").toString())) continue;
                    manufactureFreeNames.add(productSpecFreeTempMap.get("freeId_Name").toString());
                }
                HashMap<String, ProductCheckFreeExtend> productSpecFreesMap = new HashMap<String, ProductCheckFreeExtend>();
                if (!CollectionUtils.isEmpty(manufactureFreeNames)) {
                    manufactureFreeNames = manufactureFreeNames.stream().distinct().collect(Collectors.toList());
                    boolean noFlag = true;
                    QueryConditionGroup userDefineClassSpecGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"classId").eq((Object)"productSpec"), QueryCondition.name((String)"showItem").in(manufactureFreeNames)});
                    QuerySchema userDefineClassSpecSchema = QuerySchema.create().addSelect("id,defineId,showItem").addCondition((ConditionExpression)userDefineClassSpecGroup);
                    List userDefineClassSpecs = MetaDaoHelper.query((String)"pc.userdef.UserDefineClassSpec", (QuerySchema)userDefineClassSpecSchema);
                    if (CollectionUtils.isEmpty((Collection)userDefineClassSpecs)) {
                        noFlag = false;
                        break;
                    }
                    Map<String, List<Map>> userDefineClassSpecsMap = userDefineClassSpecs.stream().collect(Collectors.groupingBy(data -> data.get("showItem").toString()));
                    for (String string : manufactureFreeNames) {
                        if (userDefineClassSpecsMap.get(string) != null) {
                            ProductCheckFreeExtend productCheckFreeExtend = new ProductCheckFreeExtend();
                            productCheckFreeExtend.putAll((Map)productSpecFreeTempMaps.get(0));
                            productCheckFreeExtend.put("poiExcelRowNum", (Object)(excelRowNo + rowNoTemp));
                            productCheckFreeExtend.setEntityStatus(EntityStatus.Insert);
                            productCheckFreeExtend.put("freeId", userDefineClassSpecsMap.get(string).get(0).get("id"));
                            productCheckFreeExtend.put("freeType", (Object)1);
                            productCheckFreeExtend.put("hasDefaultInit", (Object)true);
                            productCheckFreeExtend.put("freeId_Name", (Object)string);
                            productCheckFreeExtend.put("checked", (Object)true);
                            productCheckFreeExtend.put("id", (Object)IdManager.getInstance().nextId());
                            productCheckFreeExtend.put("freeId_DefineId", userDefineClassSpecsMap.get(string).get(0).get("defineId"));
                            ++rowNoTemp;
                            productSpecFrees.add(productCheckFreeExtend);
                            productSpecFreesMap.put(string, productCheckFreeExtend);
                            continue;
                        }
                        noFlag = false;
                        break;
                    }
                    if (!noFlag) {
                        this.addOneErrorMessages(psmap, InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408031E", (String)"\u7269\u6599\u5236\u9020\u4f7f\u7528\u89c4\u683c\u5b58\u5728\u672a\u627e\u5230\u6216\u975e\u5355\u72ec\u663e\u793a\u7684\u89c4\u683c\uff0c\u8bf7\u68c0\u67e5\uff01"));
                        continue;
                    }
                }
                if (!CollectionUtils.isEmpty(checkFreeNames)) {
                    checkFreeNames = checkFreeNames.stream().distinct().collect(Collectors.toList());
                    boolean noFlag = true;
                    boolean cFlag = true;
                    QueryConditionGroup userDefineClassSpecGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"classId").eq((Object)"productSpec"), QueryCondition.name((String)"showItem").in(checkFreeNames)});
                    QuerySchema userDefineClassSpecSchema = QuerySchema.create().addSelect("id,defineId,showItem,isShowSpec").addCondition((ConditionExpression)userDefineClassSpecGroup);
                    List userDefineClassSpecs = MetaDaoHelper.query((String)"pc.userdef.UserDefineClassSpec", (QuerySchema)userDefineClassSpecSchema);
                    if (CollectionUtils.isEmpty((Collection)userDefineClassSpecs)) {
                        noFlag = false;
                        break;
                    }
                    Map<String, List<Map>> userDefineClassSpecsMap = userDefineClassSpecs.stream().collect(Collectors.groupingBy(data -> data.get("showItem").toString()));
                    for (String string : checkFreeNames) {
                        if (userDefineClassSpecsMap.get(string) != null && userDefineClassSpecsMap.get(string).get(0).get("isShowSpec").equals(true)) {
                            if (!mfilter || productSpecFreesMap.containsKey(string) && manufactureFreeNames.contains(string)) {
                                ProductCheckFreeExtend productSpecFree = new ProductCheckFreeExtend();
                                productSpecFree.putAll((Map)productSpecFreeTempMaps.get(0));
                                productSpecFree.put("poiExcelRowNum", (Object)(excelRowNo + rowNoTemp));
                                productSpecFree.setEntityStatus(EntityStatus.Insert);
                                productSpecFree.put("freeType", (Object)0);
                                productSpecFree.put("id", (Object)IdManager.getInstance().nextId());
                                productSpecFree.put("freeId", userDefineClassSpecsMap.get(string).get(0).get("id"));
                                productSpecFree.put("hasDefaultInit", (Object)true);
                                productSpecFree.put("freeId_Name", (Object)string);
                                productSpecFree.put("checked", (Object)true);
                                productSpecFree.put("freeId_DefineId", userDefineClassSpecsMap.get(string).get(0).get("defineId"));
                                productSpecFrees.add(productSpecFree);
                                ++rowNoTemp;
                                continue;
                            }
                            cFlag = false;
                        } else {
                            noFlag = false;
                        }
                        break;
                    }
                    if (!noFlag) {
                        this.addOneErrorMessages(psmap, InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080329", (String)"\u7269\u6599\u5b58\u8d27\u6838\u7b97\u89c4\u683c\u5b58\u5728\u672a\u627e\u5230\u6216\u975e\u5355\u72ec\u663e\u793a\u7684\u89c4\u683c\uff0c\u8bf7\u68c0\u67e5\uff01"));
                        continue;
                    }
                    if (!cFlag) {
                        this.addOneErrorMessages(psmap, InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408032A", (String)"\u7269\u6599\u5b58\u8d27\u6838\u7b97\u89c4\u683c\u4e0d\u80fd\u5927\u4e8e\u5236\u9020\u4f7f\u7528\u89c4\u683c\uff0c\u8bf7\u68c0\u67e5\uff01"));
                        continue;
                    }
                }
                psmap.put("productSpecFrees", productSpecFrees);
                psmap.remove("productCheckFrees");
            }
        }
    }

    private static BigDecimal turnBigDecimal(Object value) {
        BigDecimal returnvalue = new BigDecimal(0);
        if (value != null && !"".equals(value.toString().trim())) {
            try {
                returnvalue = new BigDecimal(value.toString().trim());
            }
            catch (Exception e) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800708, new Object[]{value});
            }
        }
        return returnvalue;
    }

    private String turnImageurlForDescription(String description) throws Exception {
        String descriptiontmp = "";
        if (description != null && !"".equals(description.toString())) {
            String[] descstrlist;
            for (String descstr : descstrlist = StringUtils.split((String)description, (String)"|")) {
                if (descstr.indexOf("$$") > -1) {
                    String imgUrl = descstr.replace("$$", "");
                    if (!"".equals(imgUrl)) {
                        imgUrl = this.replaceUrlForImage(imgUrl);
                    }
                    String imgStr = "<img src='" + imgUrl + "' title='' alt=''/>";
                    descriptiontmp = descriptiontmp + imgStr;
                    continue;
                }
                descriptiontmp = descriptiontmp + descstr;
            }
        }
        return descriptiontmp;
    }

    private List<ProductApplyRange> dealProductOrgTempMaps(List<Map<String, Object>> productOrgTempMaps, Map<String, Object> psmap) {
        ArrayList<ProductApplyRange> productApplyRanges = new ArrayList<ProductApplyRange>();
        String excelRowNo = psmap.get("poiExcelRowNum") + ".";
        int rowNoTemp = 1;
        boolean hasCreateOrg = false;
        for (Map<String, Object> productOrgTempMap : productOrgTempMaps) {
            if (psmap.get("orgId_Code") == null || productOrgTempMap.get("orgCode") == null) continue;
            ProductApplyRange productApplyRange = new ProductApplyRange();
            productApplyRange.putAll(productOrgTempMap);
            productApplyRange.put("poiExcelRowNum", (Object)(excelRowNo + rowNoTemp));
            productApplyRange.setEntityStatus(EntityStatus.Insert);
            productApplyRange.setRangeType(Integer.valueOf(1));
            if (psmap.get("orgId_Code").toString().equals(productOrgTempMap.get("orgCode").toString())) {
                productApplyRange.setIsApplied(Boolean.valueOf(true));
                productApplyRange.setIsCreator(Boolean.valueOf(true));
                hasCreateOrg = true;
            } else {
                productApplyRange.setIsApplied(Boolean.valueOf(false));
                productApplyRange.setIsCreator(Boolean.valueOf(false));
            }
            productApplyRanges.add(productApplyRange);
            ++rowNoTemp;
        }
        if (!hasCreateOrg) {
            ProductApplyRange productApplyRange = new ProductApplyRange();
            productApplyRange.putAll(productOrgTempMaps.get(0));
            productApplyRange.put("poiExcelRowNum", (Object)(excelRowNo + 0));
            productApplyRange.setEntityStatus(EntityStatus.Insert);
            productApplyRange.setRangeType(Integer.valueOf(1));
            productApplyRange.setIsApplied(Boolean.valueOf(true));
            productApplyRange.setIsCreator(Boolean.valueOf(true));
            productApplyRange.set("orgCode", psmap.get("orgId_Code"));
            productApplyRanges.add(productApplyRange);
        }
        return productApplyRanges;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void addOneErrorMessages(Map<String, Object> data, String errMessage) {
        String errorMessage = (String)data.get("__errorMessage");
        StringBuilder sb = new StringBuilder();
        if (null != errorMessage) {
            sb.append(errorMessage);
            sb.append(";");
        }
        sb.append(errMessage);
        Map<String, Object> map = data;
        synchronized (map) {
            data.put("__errorMessage", sb.toString());
            DataTransferHelper.getInstance().addErrorMsg(data);
        }
    }

    public void splitParallelTable(Map<String, Object> paramMap) {
        BizObject newItemMap = new BizObject();
        Iterator<Map.Entry<String, Object>> it = paramMap.entrySet().iterator();
        Object sheetNameObj = paramMap.get("poiExcelSheetName");
        Object rowNumObj = paramMap.get("poiExcelRowNum");
        String sheetName = String.valueOf(sheetNameObj);
        Integer rowNum = Double.valueOf(Double.parseDouble(rowNumObj.toString())).intValue();
        while (it.hasNext()) {
            Map.Entry<String, Object> mapEntry = it.next();
            String key = mapEntry.getKey();
            if (key.indexOf("!") <= 0) continue;
            Object value = paramMap.get(key);
            if (key.indexOf("!") < 0) continue;
            this.getTargetBizObj(key, (Map<String, Object>)newItemMap, value, sheetName, rowNum);
        }
        if (newItemMap.size() > 0) {
            for (Map.Entry entry : newItemMap.entrySet()) {
                String newKey = (String)entry.getKey();
                Object newValue = entry.getValue();
                Object targetObject = paramMap.get(newKey);
                if (targetObject == null) {
                    paramMap.put(newKey, newValue);
                    continue;
                }
                if (newValue instanceof Map) {
                    if (!(targetObject instanceof Map)) continue;
                    ((Map)targetObject).putAll(new BizObject((Map)newValue));
                    continue;
                }
                if (!(newValue instanceof Collections) || !(targetObject instanceof List)) continue;
                ((List)targetObject).addAll((List)newValue);
            }
        }
    }

    private void getTargetBizObj(String key, Map<String, Object> bizObject, Object v, String sheetName, int rowNum) {
        Object o;
        String[] arr = key.split("!");
        for (int j = 0; j < arr.length - 1 && ((o = bizObject.get(arr[j])) == null || o instanceof Map); ++j) {
            Map m = null;
            m = o == null || ((Map)o).size() == 0 ? new HashMap() : (Map)o;
            if (j + 2 < arr.length) {
                if (m.get(arr[j + 1]) == null) {
                    m.put(arr[j + 1], new HashMap());
                }
            } else {
                m.put(arr[j + 1], v);
                m.put("poiExcelSheetName", sheetName);
                m.put("__orginSheetName", sheetName);
                m.put("poiExcelRowNum", rowNum);
                m.put("__rowNum", rowNum);
            }
            bizObject.put(arr[j], m);
            bizObject = m;
        }
    }

    private String replaceUrl(String url) {
        if (StringUtils.isNotBlank((CharSequence)this.ymsParamConfig.getOssFileServer()) && StringUtils.isNotBlank((CharSequence)this.ymsParamConfig.getOssDownloadEndpoint())) {
            String fileServer = this.ymsParamConfig.getOssFileServer();
            String downloadServer = this.ymsParamConfig.getOssDownloadEndpoint();
            if (!downloadServer.toLowerCase().startsWith("https://") && !downloadServer.toLowerCase().startsWith("http://")) {
                downloadServer = "https://" + downloadServer;
            }
            if (url.contains(fileServer)) {
                url = url.replace(fileServer, downloadServer);
            }
        }
        return url;
    }

    public String replaceUrlForImage(String fileId) throws Exception {
        if (StringUtils.isEmpty((CharSequence)fileId)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800835);
        }
        String localUrl = "";
        if (StringUtils.isNotBlank((CharSequence)AppContext.getEnvConfig((String)"domain.url"))) {
            localUrl = this.ymsParamConfig.getUrlInnerHost() + "/iuap-apdoc-material/productbill/richtext/image/url" + "?fileId=" + URLEncoder.encode(EncryptionUtil.encrypt((String)fileId, (String)"atFileId"), "utf-8") + "&yTenantId=" + URLEncoder.encode(EncryptionUtil.encrypt((String)AppContext.getYTenantId().toString(), (String)"yTenantId"), "utf-8");
        }
        return localUrl;
    }

    public void dealChildrenEntityStatus(List<Map<String, Object>> mapList, List<String> childrendEntityFields) {
        if (!CollectionUtils.isEmpty(mapList) && !CollectionUtils.isEmpty(childrendEntityFields)) {
            for (Map<String, Object> data : mapList) {
                for (String childrendEntityField : childrendEntityFields) {
                    List childList;
                    if (data == null || childrendEntityField == null || !ObjectUtils.isNotEmpty((Object)(childList = (List)data.get(childrendEntityField)))) continue;
                    for (Map childData : childList) {
                        childData.put("_status", EntityStatus.Insert);
                    }
                }
            }
        }
    }

    public void dealProductManageClass(List<Map<String, Object>> mapList) throws Exception {
        List ids = mapList.stream().filter(data -> data.get("manageClass") != null).map(data -> Long.parseLong(data.get("manageClass").toString())).collect(Collectors.toList());
        List managementClasses = this.managementClassDao.queryManagementClassById(ids);
        if (ObjectUtils.isNotEmpty((Object)managementClasses)) {
            Map<Long, ManagementClass> managementClassMap = managementClasses.stream().collect(Collectors.toMap(v -> Long.parseLong(v.getId().toString()), v -> v));
            for (Map<String, Object> data2 : mapList) {
                ManagementClass managementClass;
                if (data2.get("id") != null || !EntityStatus.Insert.name().equals(String.valueOf(data2.get("_status"))) || data2.get("manageClass") == null || data2.get("productTemplate") != null || (managementClass = managementClassMap.get(Long.parseLong(String.valueOf(data2.get("manageClass"))))) == null) continue;
                data2.put("productTemplate", managementClass.getTemplate());
            }
        }
    }
}

