/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.yonyou.cloud.middleware.rpc.RemoteCall
 *  com.yonyou.iuap.apdoc.coredoc.dto.keymapping.ProductAPIUtils
 *  com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.po.pub.BatchApiQueryParamWithOrg
 *  com.yonyou.iuap.apdoc.coredoc.vo.productline.ProductLineVO
 *  com.yonyou.iuap.international.MultiLangText
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.permission.mdd.services.MddDefBillDataPermissionService
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.api.service.ApiImportCommandService
 *  com.yonyou.ucf.mdd.ext.bill.biz.BillBiz
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.common.ResultList
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.iuap.upc.api.IProductLineService
 *  com.yonyoucloud.iuap.upc.dto.ProductLineDTO
 *  com.yonyoucloud.iuap.upc.dto.ProductLineQryDTO
 *  com.yonyoucloud.iuap.upc.dto.ext.UPCResultList
 *  com.yonyoucloud.upc.pc.productline.ProductLine
 *  com.yonyoucloud.upc.utils.CoreDocJsonResult
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QueryField
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.BeanUtils
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.beans.factory.annotation.Qualifier
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 *  org.springframework.util.ObjectUtils
 *  org.springframework.util.StringUtils
 */
package com.yonyoucloud.upc.service.api;

import com.alibaba.fastjson.JSON;
import com.yonyou.cloud.middleware.rpc.RemoteCall;
import com.yonyou.iuap.apdoc.coredoc.dto.keymapping.ProductAPIUtils;
import com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.po.pub.BatchApiQueryParamWithOrg;
import com.yonyou.iuap.apdoc.coredoc.vo.productline.ProductLineVO;
import com.yonyou.iuap.international.MultiLangText;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.permission.mdd.services.MddDefBillDataPermissionService;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.api.service.ApiImportCommandService;
import com.yonyou.ucf.mdd.ext.bill.biz.BillBiz;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.common.ResultList;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.iuap.ipass.utils.IPassServiceUtils;
import com.yonyoucloud.iuap.upc.api.IProductLineService;
import com.yonyoucloud.iuap.upc.api.service.IUPCBillService;
import com.yonyoucloud.iuap.upc.dto.ProductLineDTO;
import com.yonyoucloud.iuap.upc.dto.ProductLineQryDTO;
import com.yonyoucloud.iuap.upc.dto.ext.UPCResultList;
import com.yonyoucloud.upc.pc.productline.ProductLine;
import com.yonyoucloud.upc.service.utils.ProductUtil;
import com.yonyoucloud.upc.utils.CoreDocJsonResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QueryField;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

@Service
@RemoteCall(value="productcenter@c87e2267-1001-4c70-bb2a-ab41f3b81aa3")
public class ProductLineServiceImpl
implements IProductLineService {
    private static final Logger log = LoggerFactory.getLogger(ProductLineServiceImpl.class);
    @Autowired
    private IUPCBillService billService;
    @Autowired
    @Qualifier(value="data")
    MddDefBillDataPermissionService permissionService;
    @Autowired
    private ApiImportCommandService apiImportSingleService;

    public List<ProductLineDTO> listProductLineByCondition(List<ProductLineQryDTO> qryDTOList, Integer pageIndex, Integer pageSize) throws Exception {
        UpcAPiTool.checkTenantInfo();
        if (pageIndex == null || pageIndex < 1) {
            pageIndex = UpcAPiTool.DEFAULT_PAGE_INDEX;
        }
        if (pageSize == null || pageSize > UpcAPiTool.MAX_COUNT) {
            pageSize = UpcAPiTool.MAX_COUNT;
        }
        HashMap<String, Object> params = new HashMap<String, Object>();
        params.put("pageFrom", (pageIndex - 1) * pageSize);
        params.put("pageEnd", pageSize);
        params.put("ytenant", AppContext.getYTenantId());
        ArrayList querys = new ArrayList();
        this.changeName(qryDTOList);
        if (!qryDTOList.isEmpty()) {
            qryDTOList.forEach(qryDTO -> {
                if (qryDTO.getSearchProperty() != null && qryDTO.getSearchRule() != null) {
                    querys.add(qryDTO);
                }
            });
        }
        params.put("qryDTOs", querys);
        List productLineList = SqlHelper.selectList((String)"com.yonyoucloud.upc.product.dao.ProductLine.selectProductLineByCondition", params);
        if (productLineList != null) {
            return JSON.parseArray((String)JSON.toJSONString((Object)productLineList), ProductLineDTO.class);
        }
        return null;
    }

    public Integer listProductLineCount(List<ProductLineQryDTO> qryDTOList) throws Exception {
        UpcAPiTool.checkTenantInfo();
        HashMap<String, Object> params = new HashMap<String, Object>();
        params.put("ytenant", AppContext.getYTenantId());
        ArrayList querys = new ArrayList();
        this.changeName(qryDTOList);
        if (!qryDTOList.isEmpty()) {
            qryDTOList.forEach(qryDTO -> {
                if (qryDTO.getSearchProperty() != null && qryDTO.getSearchRule() != null) {
                    querys.add(qryDTO);
                }
            });
        }
        params.put("qryDTOs", querys);
        Map count = (Map)SqlHelper.selectOne((String)"com.yonyoucloud.upc.product.dao.ProductLine.selectProductLineCount", params);
        if (count != null && count.get("count") != null) {
            return Integer.valueOf(count.get("count").toString());
        }
        return null;
    }

    public List<ProductLineDTO> listProductLineByQryDTO(ProductLineQryDTO qryDTO) throws Exception {
        QueryConditionGroup queryConditionGroup;
        UpcAPiTool.checkTenantInfo();
        if (qryDTO == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801122);
        }
        if (qryDTO.getPageSize() == null || qryDTO.getPageSize() != null && qryDTO.getPageSize() < 0 && qryDTO.getPageSize() > UpcAPiTool.PAGE_MAX_SIZE) {
            qryDTO.setPageSize(UpcAPiTool.PAGE_MAX_SIZE);
        }
        if ((queryConditionGroup = UpcAPiTool.setAllCondition((Object)qryDTO, (Map)ProductAPIUtils.productLineFieldMap)) == null) {
            queryConditionGroup = new QueryConditionGroup();
        }
        QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)ProductAPIUtils.productLineFieldMap, (String[])qryDTO.getFields());
        QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)queryConditionGroup);
        schema.addPager(0, qryDTO.getPageSize().intValue());
        BillContext billContext = ProductUtil.getBillContext("pc_productline", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1979C27404580057", (String)"\u4ea7\u54c1\u7ebf"), "pc.productline.ProductLine", "query");
        this.permissionService.handleAuthPermission((Object)billContext, (Object)schema);
        List productLineList = MetaDaoHelper.query((String)"pc.productline.ProductLine", (QuerySchema)schema);
        return JSON.parseArray((String)JSON.toJSONString((Object)productLineList), ProductLineDTO.class);
    }

    public UPCResultList deleteProductLineByCode(List<String> productLinCodeList) throws Exception {
        UPCResultList resultList = new UPCResultList();
        if (productLinCodeList != null) {
            QuerySchema schema = QuerySchema.create().fullname("pc.product.Product").addSelect("id,code,name,remark,productLineCharacterDef.*").appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"code").in(productLinCodeList)});
            List queryList = MetaDaoHelper.query((String)"pc.productline.ProductLine", (QuerySchema)schema);
            BillDataDto billDataDto = new BillDataDto();
            billDataDto.setBillnum("pc_productlinelist");
            billDataDto.setData((Object)queryList);
            billDataDto.setFromApi(true);
            HashMap<String, String> externalData = new HashMap<String, String>();
            externalData.put("serviceCode", "pc_productline");
            externalData.put("cmdname", "cmdBatchDelete");
            externalData.put("businessActName", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_21A830A20538008F", (String)"\u4ea7\u54c1\u7ebf-\u5220\u9664"));
            externalData.put("terminalType", "1");
            billDataDto.setExternalData(externalData);
            ResultList batchdelete = this.billService.batchdelete(billDataDto);
            BeanUtils.copyProperties((Object)batchdelete, (Object)resultList);
        }
        return resultList;
    }

    public UPCResultList deleteProductLine(List<Long> productLineIdList) throws Exception {
        UPCResultList resultList = new UPCResultList();
        if (productLineIdList != null) {
            QuerySchema schema = QuerySchema.create().fullname("pc.product.Product").addSelect("id,code, name, remark,productLineCharacterDef.*").appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"id").in(productLineIdList)});
            List queryList = MetaDaoHelper.query((String)"pc.productline.ProductLine", (QuerySchema)schema);
            BillDataDto billDataDto = new BillDataDto();
            billDataDto.setBillnum("pc_productlinelist");
            billDataDto.setData((Object)queryList);
            billDataDto.setFromApi(true);
            HashMap<String, String> externalData = new HashMap<String, String>();
            externalData.put("serviceCode", "pc_productline");
            externalData.put("cmdname", "cmdBatchDelete");
            externalData.put("businessActName", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_21A830A20538008F", (String)"\u4ea7\u54c1\u7ebf-\u5220\u9664"));
            externalData.put("terminalType", "1");
            billDataDto.setExternalData(externalData);
            ResultList batchdelete = this.billService.batchdelete(billDataDto);
            BeanUtils.copyProperties((Object)batchdelete, (Object)resultList);
        }
        return resultList;
    }

    private void changeName(List<ProductLineQryDTO> qryDTOList) {
        if (!qryDTOList.isEmpty()) {
            qryDTOList.forEach(qryDTO -> {
                if (qryDTO.getSearchProperty() != null && qryDTO.getSearchRule() != null) {
                    if ("name".equals(qryDTO.getSearchProperty())) {
                        qryDTO.setSearchProperty("cName");
                    }
                    if ("code".equals(qryDTO.getSearchProperty())) {
                        qryDTO.setSearchProperty("cCode");
                    }
                    if ("name2".equals(qryDTO.getSearchProperty())) {
                        qryDTO.setSearchProperty("cName2");
                    }
                    if ("name3".equals(qryDTO.getSearchProperty())) {
                        qryDTO.setSearchProperty("cName3");
                    }
                }
            });
        }
    }

    public CoreDocJsonResult<ProductLineVO> queryProductLine(BatchApiQueryParamWithOrg batchApiQueryParamWithOrg) throws Exception {
        CoreDocJsonResult coreDocJsonResult;
        int recordCount = IPassServiceUtils.getRecordsCount(batchApiQueryParamWithOrg, "pc.productline.ProductLine");
        if (recordCount > 0) {
            if (batchApiQueryParamWithOrg.getPageSize() > (long)UpcAPiTool.PAGE_MAX_SIZE.intValue()) {
                batchApiQueryParamWithOrg.setPageSize((long)UpcAPiTool.PAGE_MAX_SIZE.intValue());
            }
            QuerySchema schema = QuerySchema.create().addSelect("id,code,name,remark,stopstatus,productLineCharacterDef").addCondition((ConditionExpression)IPassServiceUtils.getQueryConditionGroup(batchApiQueryParamWithOrg)).addPager(Long.valueOf(batchApiQueryParamWithOrg.getPageIndex()).intValue(), Long.valueOf(batchApiQueryParamWithOrg.getPageSize()).intValue());
            List productLineList = MetaDaoHelper.queryObject((String)"pc.productline.ProductLine", (boolean)true, (QuerySchema)schema, null);
            ArrayList<ProductLineVO> productLineVOList = new ArrayList<ProductLineVO>();
            for (ProductLine productLine : productLineList) {
                ProductLineVO productLineVO = (ProductLineVO)JSON.parseObject((String)JSON.toJSONString((Object)productLine), ProductLineVO.class);
                if (productLine.get("name") != null) {
                    productLineVO.setName(new MultiLangText((Map)productLine.get("name")));
                }
                if (productLine.get("remark") != null) {
                    productLineVO.setRemark(new MultiLangText((Map)productLine.get("remark")));
                }
                productLineVOList.add(productLineVO);
            }
            coreDocJsonResult = CoreDocJsonResult.success(productLineVOList);
        } else {
            coreDocJsonResult = CoreDocJsonResult.success(null);
        }
        coreDocJsonResult.setTotalCount(Integer.valueOf(recordCount));
        return coreDocJsonResult;
    }

    public Long productLineSave(String matchRule, ProductLineVO productLineVO) throws Exception {
        Long id = 0L;
        ProductLine productLine = this.convertProductLine(matchRule, productLineVO);
        this.dataPreprocessing(matchRule, productLine);
        productLine.put("_fromApi", (Object)true);
        BillDataDto billDataDto = UpcAPiTool.builderBillData((String)"pc_productline", (Object)productLine, (boolean)true, (int)4);
        Object result = this.apiImportSingleService.singleSave4Api(billDataDto);
        if (result != null) {
            id = (Long)((ProductLine)result).getId();
        }
        return id;
    }

    private void dataPreprocessing(String matchRule, ProductLine productLine) throws Exception {
        if (!"id".equals(matchRule)) {
            QueryConditionGroup condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq((Object)productLine.getCode())});
            QuerySchema schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)condition);
            List productLineList = MetaDaoHelper.queryObject((String)"pc.productline.ProductLine", (boolean)true, (QuerySchema)schema, null);
            if (!CollectionUtils.isEmpty((Collection)productLineList)) {
                productLine.setId(((ProductLine)productLineList.get(0)).getId());
                productLine.setEntityStatus(EntityStatus.Update);
            } else {
                productLine.setEntityStatus(EntityStatus.Insert);
                if (productLine.getStopstatus() == null) {
                    productLine.setStopstatus(Boolean.valueOf(false));
                }
            }
        } else if (productLine != null && productLine.getId() != null && !"".equals(productLine.getId())) {
            QueryConditionGroup condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(productLine.getId())});
            QuerySchema schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)condition);
            List productLineList = MetaDaoHelper.queryObject((String)"pc.productline.ProductLine", (boolean)true, (QuerySchema)schema, null);
            if (!CollectionUtils.isEmpty((Collection)productLineList)) {
                productLine.setId(((ProductLine)productLineList.get(0)).getId());
                productLine.setEntityStatus(EntityStatus.Update);
            } else {
                productLine.setEntityStatus(EntityStatus.Insert);
                if (productLine.getStopstatus() == null) {
                    productLine.setStopstatus(Boolean.valueOf(false));
                }
            }
        } else {
            productLine.setEntityStatus(EntityStatus.Insert);
            if (productLine.getStopstatus() == null) {
                productLine.setStopstatus(Boolean.valueOf(false));
            }
        }
    }

    private ProductLine convertProductLine(String matchRule, ProductLineVO productLineVO) {
        ProductLine productLine = (ProductLine)JSON.parseObject((String)JSON.toJSONString((Object)productLineVO), ProductLine.class);
        if (ObjectUtils.isEmpty((Object)productLineVO.getName())) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.CUSTOMER_TRADE_NAME_NOT_NULL);
        }
        productLine.set("name", (Object)productLineVO.getName().toMap());
        if (!ObjectUtils.isEmpty((Object)productLineVO.getRemark())) {
            productLine.set("remark", (Object)productLineVO.getRemark().toMap());
        }
        if (!ObjectUtils.isEmpty((Object)productLineVO.getProductLineCharacterDef())) {
            productLine.put("productLineCharacterDef", (Object)productLineVO.getProductLineCharacterDef());
        }
        return productLine;
    }

    public String delete(String productLineId, String productLineCode) throws Exception {
        if (!StringUtils.hasLength((String)productLineId) && !StringUtils.hasLength((String)productLineCode)) {
            return null;
        }
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())});
        if (StringUtils.hasLength((String)productLineId)) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"id").eq((Object)Long.parseLong(productLineId)));
        } else if (StringUtils.hasLength((String)productLineCode)) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"code").eq((Object)productLineCode));
        }
        QuerySchema schema = QuerySchema.create().addSelect("id,code,name,remark,stopstatus,productLineCharacterDef").addCondition((ConditionExpression)queryConditionGroup);
        List productLineList = MetaDaoHelper.queryObject((String)"pc.productline.ProductLine", (QuerySchema)schema, null);
        if (CollectionUtils.isEmpty((Collection)productLineList)) {
            return null;
        }
        BillDataDto bill = new BillDataDto();
        bill.setData((Object)productLineList);
        bill.setBillnum("pc_productlinelist");
        RuleExecuteResult result = BillBiz.delete((BillDataDto)bill);
        if (!CollectionUtils.isEmpty((Collection)result.getMessages())) {
            return result.getMessages().get(0).toString();
        }
        return null;
    }
}

