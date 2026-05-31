/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.alibaba.fastjson.JSONObject
 *  com.alibaba.fastjson.serializer.SerializerFeature
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.yonyou.diwork.ott.exexutors.RobotExecutors
 *  com.yonyou.iuap.apdoc.coredoc.busidoc.common.service.IYpdBizDocBillService
 *  com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig
 *  com.yonyou.iuap.apdoc.coredoc.constants.CheckLimitConstant
 *  com.yonyou.iuap.apdoc.coredoc.dao.material.MaterialQryDao
 *  com.yonyou.iuap.apdoc.coredoc.dao.merchant.MerchantQryDao
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.po.material.MaterialPO
 *  com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil
 *  com.yonyou.iuap.bd.customerdoc.entity.BdRestParam
 *  com.yonyou.iuap.bd.customerdoc.entity.dto.DefDocList
 *  com.yonyou.iuap.bd.customerdoc.service.itf.DefDocListService
 *  com.yonyou.iuap.bd.customerdoc.utils.Condition
 *  com.yonyou.iuap.bd.customerdoc.utils.Sorter
 *  com.yonyou.iuap.bd.pub.param.ConditionVO
 *  com.yonyou.iuap.bd.pub.param.Page
 *  com.yonyou.iuap.context.InvocationInfoProxy
 *  com.yonyou.iuap.fileservice.sdk.module.CooperationFileService
 *  com.yonyou.iuap.fileservice.sdk.module.pojo.BatchBusinessFilesRequest
 *  com.yonyou.iuap.fileservice.sdk.module.pojo.CooperationSuiteFile
 *  com.yonyou.iuap.org.service.itf.core.IOrgUnitQueryService
 *  com.yonyou.iuap.tenant.sdk.TenantCenter
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.common.enums.OperationTypeEnum
 *  com.yonyou.ucf.mdd.common.model.Pager
 *  com.yonyou.ucf.mdd.common.model.ref.RefEntity
 *  com.yonyou.ucf.mdd.common.model.ref.RefInfo
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.common.model.rule.RuleRegister
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO
 *  com.yonyou.ucf.mdd.common.model.uimeta.ui.Entity
 *  com.yonyou.ucf.mdd.common.model.uimeta.ui.Field
 *  com.yonyou.ucf.mdd.common.model.uimeta.ui.ViewModel
 *  com.yonyou.ucf.mdd.common.utils.json.GsonHelper
 *  com.yonyou.ucf.mdd.ext.bill.biz.BillBiz
 *  com.yonyou.ucf.mdd.ext.bill.dto.BaseDto
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.meta.service.BillMetaService
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.IRpcRule
 *  com.yonyou.ucf.mdd.ext.bill.rule.common.ErrorMessage
 *  com.yonyou.ucf.mdd.ext.bill.rule.common.InfoData
 *  com.yonyou.ucf.mdd.ext.bill.rule.common.ResultList
 *  com.yonyou.ucf.mdd.ext.bill.rule.template.CommonOperator
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.dao.meta.UIMetaUtils
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyou.ucf.mdd.ext.data.fill.DataTransferUtils
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.mdd.ext.poi.model.ExcelExportData
 *  com.yonyou.ucf.mdd.ext.poi.model.ExcelField
 *  com.yonyou.ucf.mdd.ext.print.model.TableBody
 *  com.yonyou.ucf.mdd.ext.service.DefaultBillService
 *  com.yonyou.ucf.mdd.ext.util.BillContextUtils
 *  com.yonyou.ucf.mdd.ext.util.FileKit
 *  com.yonyou.ucf.mdd.ext.util.RedisTool
 *  com.yonyou.ucf.mdd.ext.util.schema.DbSchemaUtil
 *  com.yonyou.upc.utils.excel.util.ExcelType
 *  com.yonyou.upc.utils.excel.util.GridExcel
 *  com.yonyou.ypd.bd.api.IBDQueryRepository
 *  com.yonyoucloud.upc.aa.billdeleteforce.BillDeleteForce
 *  com.yonyoucloud.upc.aa.billdeleteforce.DataStatus
 *  com.yonyoucloud.upc.aa.billdeleteforce.FullNameEnum
 *  com.yonyoucloud.upc.aa.billdeleteforce.OperateType
 *  com.yonyoucloud.upc.aa.customertype.CustomerType
 *  com.yonyoucloud.upc.aa.merchant.Merchant
 *  com.yonyoucloud.upc.aa.merchant.MerchantApplyRangeDetail
 *  com.yonyoucloud.upc.pc.product.Product
 *  com.yonyoucloud.upc.pc.product.ProductSpecItemAlbum
 *  com.yonyoucloud.upc.pc.userdef.UserDefineClass
 *  com.yonyoucloud.upc.service.utils.PubOptionDataQueryUtil
 *  com.yonyoucloud.upc.utils.BizQueryBuilder
 *  com.yonyoucloud.upc.utils.DataUploadUtils
 *  com.yonyoucloud.upc.utils.ExcelFileUtil
 *  com.yonyoucloud.upc.utils.MultilangUtil
 *  com.yonyoucloud.upc.utils.TreeBillDataUtil
 *  javax.servlet.http.HttpServletRequest
 *  javax.servlet.http.HttpServletResponse
 *  org.apache.commons.lang3.StringUtils
 *  org.apache.poi.ss.usermodel.CellType
 *  org.imeta.biz.base.BizContext
 *  org.imeta.biz.base.Objectlizer
 *  org.imeta.core.model.Entity
 *  org.imeta.core.model.Property
 *  org.imeta.core.model.PropertyMap
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.imeta.spring.support.id.IdManager
 *  org.jetbrains.annotations.NotNull
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.BeanWrapperImpl
 *  org.springframework.beans.factory.InitializingBean
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.beans.factory.annotation.Qualifier
 *  org.springframework.context.annotation.Primary
 *  org.springframework.stereotype.Service
 *  org.springframework.transaction.annotation.Transactional
 *  org.springframework.util.CollectionUtils
 *  org.springframework.util.StringUtils
 *  org.springframework.web.multipart.MultipartFile
 */
package com.yonyoucloud.upc.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.yonyou.diwork.ott.exexutors.RobotExecutors;
import com.yonyou.iuap.apdoc.coredoc.busidoc.common.service.IYpdBizDocBillService;
import com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig;
import com.yonyou.iuap.apdoc.coredoc.constants.CheckLimitConstant;
import com.yonyou.iuap.apdoc.coredoc.dao.material.MaterialQryDao;
import com.yonyou.iuap.apdoc.coredoc.dao.merchant.MerchantQryDao;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.po.material.MaterialPO;
import com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil;
import com.yonyou.iuap.bd.customerdoc.entity.BdRestParam;
import com.yonyou.iuap.bd.customerdoc.entity.dto.DefDocList;
import com.yonyou.iuap.bd.customerdoc.service.itf.DefDocListService;
import com.yonyou.iuap.bd.customerdoc.utils.Condition;
import com.yonyou.iuap.bd.customerdoc.utils.Sorter;
import com.yonyou.iuap.bd.pub.param.ConditionVO;
import com.yonyou.iuap.bd.pub.param.Page;
import com.yonyou.iuap.context.InvocationInfoProxy;
import com.yonyou.iuap.fileservice.sdk.module.CooperationFileService;
import com.yonyou.iuap.fileservice.sdk.module.pojo.BatchBusinessFilesRequest;
import com.yonyou.iuap.fileservice.sdk.module.pojo.CooperationSuiteFile;
import com.yonyou.iuap.org.service.itf.core.IOrgUnitQueryService;
import com.yonyou.iuap.tenant.sdk.TenantCenter;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.common.enums.OperationTypeEnum;
import com.yonyou.ucf.mdd.common.model.Pager;
import com.yonyou.ucf.mdd.common.model.ref.RefEntity;
import com.yonyou.ucf.mdd.common.model.ref.RefInfo;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.common.model.rule.RuleRegister;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO;
import com.yonyou.ucf.mdd.common.model.uimeta.ui.Field;
import com.yonyou.ucf.mdd.common.model.uimeta.ui.ViewModel;
import com.yonyou.ucf.mdd.common.utils.json.GsonHelper;
import com.yonyou.ucf.mdd.ext.bill.biz.BillBiz;
import com.yonyou.ucf.mdd.ext.bill.dto.BaseDto;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.meta.service.BillMetaService;
import com.yonyou.ucf.mdd.ext.bill.rule.base.IRpcRule;
import com.yonyou.ucf.mdd.ext.bill.rule.common.ErrorMessage;
import com.yonyou.ucf.mdd.ext.bill.rule.common.InfoData;
import com.yonyou.ucf.mdd.ext.bill.rule.common.ResultList;
import com.yonyou.ucf.mdd.ext.bill.rule.template.CommonOperator;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.dao.meta.UIMetaUtils;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyou.ucf.mdd.ext.data.fill.DataTransferUtils;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.poi.model.ExcelExportData;
import com.yonyou.ucf.mdd.ext.poi.model.ExcelField;
import com.yonyou.ucf.mdd.ext.print.model.TableBody;
import com.yonyou.ucf.mdd.ext.service.DefaultBillService;
import com.yonyou.ucf.mdd.ext.util.BillContextUtils;
import com.yonyou.ucf.mdd.ext.util.FileKit;
import com.yonyou.ucf.mdd.ext.util.RedisTool;
import com.yonyou.ucf.mdd.ext.util.schema.DbSchemaUtil;
import com.yonyou.upc.utils.excel.util.ExcelType;
import com.yonyou.upc.utils.excel.util.GridExcel;
import com.yonyou.ypd.bd.api.IBDQueryRepository;
import com.yonyoucloud.iuap.upc.api.service.ApiDto;
import com.yonyoucloud.iuap.upc.api.service.IProductUpdateOtherDbService;
import com.yonyoucloud.iuap.upc.api.service.IUPCBillService;
import com.yonyoucloud.iuap.upc.api.service.IUPCProductQueryService;
import com.yonyoucloud.iuap.upc.constants.UpcDataFormat;
import com.yonyoucloud.upc.aa.billdeleteforce.BillDeleteForce;
import com.yonyoucloud.upc.aa.billdeleteforce.DataStatus;
import com.yonyoucloud.upc.aa.billdeleteforce.FullNameEnum;
import com.yonyoucloud.upc.aa.billdeleteforce.OperateType;
import com.yonyoucloud.upc.aa.customertype.CustomerType;
import com.yonyoucloud.upc.aa.merchant.Merchant;
import com.yonyoucloud.upc.aa.merchant.MerchantApplyRangeDetail;
import com.yonyoucloud.upc.async.AsyncTask;
import com.yonyoucloud.upc.async.TaskRegister;
import com.yonyoucloud.upc.cache.BizCache;
import com.yonyoucloud.upc.event.EventService2;
import com.yonyoucloud.upc.event.EventType;
import com.yonyoucloud.upc.pc.product.Product;
import com.yonyoucloud.upc.pc.product.ProductSpecItemAlbum;
import com.yonyoucloud.upc.pc.userdef.UserDefineClass;
import com.yonyoucloud.upc.service.ApiDataService;
import com.yonyoucloud.upc.service.DataSourceService;
import com.yonyoucloud.upc.service.MQSaveProductNewArchTaskService;
import com.yonyoucloud.upc.service.MQSaveTaskService;
import com.yonyoucloud.upc.service.ProductApiDataService;
import com.yonyoucloud.upc.service.openapi.MerchantOldOpenApiServiceImpl;
import com.yonyoucloud.upc.service.operationalTools.DeleteToolDto;
import com.yonyoucloud.upc.service.utils.ProductUtil;
import com.yonyoucloud.upc.service.utils.PubOptionDataQueryUtil;
import com.yonyoucloud.upc.thread.SaveSyncThread;
import com.yonyoucloud.upc.utils.BizQueryBuilder;
import com.yonyoucloud.upc.utils.DataUploadUtils;
import com.yonyoucloud.upc.utils.ExcelFileUtil;
import com.yonyoucloud.upc.utils.MultilangUtil;
import com.yonyoucloud.upc.utils.TreeBillDataUtil;
import java.beans.PropertyDescriptor;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.ss.usermodel.CellType;
import org.imeta.biz.base.BizContext;
import org.imeta.biz.base.Objectlizer;
import org.imeta.core.model.Entity;
import org.imeta.core.model.Property;
import org.imeta.core.model.PropertyMap;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.imeta.spring.support.id.IdManager;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import org.springframework.web.multipart.MultipartFile;

@Service(value="pc.BillService")
@Primary
public class UPCBillService
extends DefaultBillService
implements IUPCBillService,
InitializingBean {
    private static final Logger log = LoggerFactory.getLogger(UPCBillService.class);
    public static final String ATTACHMENT_GROUP_ID = "attachmentGroupId";
    public static final String ORG_CODE = "orgCode";
    public static final String MERCHANT_CODE = "merchantCode";
    public static final String MERCHANT_ID = "merchantId";
    @Autowired(required=false)
    private BillMetaService billMetaService;
    @Autowired
    private IUPCProductQueryService upcProductQueryService;
    @Autowired
    CooperationFileService cooperationFileService;
    @Autowired
    UPCBillService upcBillService;
    @Autowired
    TaskRegister taskRegister;
    @Autowired
    private EventService2 eventService2;
    @Autowired
    @Qualifier(value="mq.saveTaskService")
    MQSaveTaskService mqSaveTaskService;
    @Autowired
    private IProductUpdateOtherDbService productUpdateOtherDbService;
    @Autowired
    private DataSourceService dataSourceService;
    @Autowired
    private DefDocListService defDocListService;
    @Autowired
    private YMSParamConfig ymsParamConfig;
    @Autowired
    private MerchantOldOpenApiServiceImpl merchantOldOpenApiService;
    @Autowired
    ApiDataService apiDataService;
    @Autowired
    ProductApiDataService productApiDataService;
    @Autowired
    PubOptionDataQueryUtil pubOptionDataQueryUtil;
    @Autowired
    MerchantQryDao merchantQryDao;
    @Autowired
    private IOrgUnitQueryService iOrgUnitQueryService;
    @Autowired
    MaterialQryDao materialQryDao;
    @Autowired
    private IYpdBizDocBillService ypdBizDocBillService;
    @Autowired
    private IBDQueryRepository billQueryRepository;
    @Autowired
    private MQSaveProductNewArchTaskService mQSaveProductNewArchTaskService;
    private static final Logger logger = LoggerFactory.getLogger(UPCBillService.class);

    public RuleExecuteResult executeUpdate(String action, BillDataDto bill) throws Exception {
        if ("save".equals(action) && "aa_merchant".equals(bill.getBillnum()) && bill.getConvertType() != null && "2".equals(bill.getConvertType().toString())) {
            Merchant merchant;
            RuleExecuteResult ruleExecuteResult = BillBiz.executeUpdate((String)action, (BillDataDto)this.dealBillDataForApi(bill, action));
            if (ruleExecuteResult != null && ruleExecuteResult.getData() != null && (merchant = (Merchant)ruleExecuteResult.getData()) != null && merchant.get(ATTACHMENT_GROUP_ID) != null && StringUtils.isNumeric((CharSequence)merchant.get(ATTACHMENT_GROUP_ID).toString())) {
                merchant.put(ATTACHMENT_GROUP_ID, (Object)Long.parseLong(merchant.get(ATTACHMENT_GROUP_ID).toString()));
            }
            return ruleExecuteResult;
        }
        return BillBiz.executeUpdate((String)action, (BillDataDto)bill);
    }

    public Pager queryByPage(BillDataDto bill) throws Exception {
        return BillBiz.queryByPage((BillDataDto)bill);
    }

    public Map detail(BillDataDto bill) throws Exception {
        return BillBiz.detail((BillDataDto)bill);
    }

    public List<Map<String, Object>> listdetail(BillDataDto bill) throws Exception {
        return BillBiz.listdetail((BillDataDto)bill);
    }

    public List querytree(BillDataDto bill) throws Exception {
        return BillBiz.querytree((BillDataDto)bill);
    }

    public Map enter(BillDataDto bill) throws Exception {
        return BillBiz.enter((BillDataDto)bill);
    }

    public Map movefirst(BillDataDto bill) throws Exception {
        return BillBiz.movefirst((BillDataDto)bill);
    }

    public Map movelast(BillDataDto bill) throws Exception {
        return BillBiz.movelast((BillDataDto)bill);
    }

    public Map movenext(BillDataDto bill) throws Exception {
        return BillBiz.movenext((BillDataDto)bill);
    }

    public Map moveprev(BillDataDto bill) throws Exception {
        return BillBiz.moveprev((BillDataDto)bill);
    }

    public String add(BillDataDto bill) throws Exception {
        return BillBiz.add((BillDataDto)bill);
    }

    public RuleExecuteResult delete(BillDataDto bill) throws Exception {
        return BillBiz.delete((BillDataDto)bill);
    }

    public RuleExecuteResult handle(BillDataDto bill) throws Exception {
        return BillBiz.handle((BillDataDto)bill);
    }

    public ResultList batchDo(BillDataDto bill) throws Exception {
        return BillBiz.batchDo((BillDataDto)bill);
    }

    public ResultList batchdelete(BillDataDto bill) throws Exception {
        TreeBillDataUtil.treeBillDataSortAndRemovePubts((BillDataDto)bill);
        return BillBiz.batchdelete((BillDataDto)bill);
    }

    @Override
    public ResultList batchDeleteByErpcode(BillDataDto bill) throws Exception {
        bill.setAction("delete");
        return this.batchDoByErpcode(bill);
    }

    public ResultList batchDoByErpcode(BillDataDto bill) throws Exception {
        try {
            BillContext billContext = BillContextUtils.getBillContext((String)bill.getBillnum());
            String fullname = billContext.getFullname();
            String billnum = bill.getBillnum();
            Object obj = bill.getData();
            ArrayList<Map<String, Object>> list = new ArrayList<Map>();
            if (obj instanceof Map) {
                list.add((Map)obj);
            } else if (obj instanceof List) {
                list = (List)obj;
            }
            int type = 1;
            if (bill.getConvertType() != null) {
                type = bill.getConvertType();
            }
            String foreignBillnum = billnum.substring(0, billnum.length() - 4);
            ResultList resultList = this.batchDoByErpcode(bill, foreignBillnum, fullname, list, type, bill.getAction());
            return resultList;
        }
        catch (Exception var7) {
            throw new CoreDocBusinessException(var7.getMessage());
        }
    }

    private ResultList batchDoByErpcode(BillDataDto bill, String foreignBillnum, String fullname, List<Map<String, Object>> list, int type, String action) throws Exception {
        ResultList resultList = new ResultList(list.size());
        assert (Objects.nonNull(list) && list.size() < CheckLimitConstant.DEFAULT_LIMIT);
        Iterator<Map<String, Object>> var6 = list.iterator();
        Integer count = 0;
        while (var6.hasNext()) {
            assert (count < CheckLimitConstant.DEFAULT_LIMIT);
            Integer n = count;
            count = count + 1;
            Map<String, Object> data = var6.next();
            logger.info("api json:{}", data);
            BizObject obj = Objectlizer.convert(data, (String)fullname);
            DataTransferUtils.fill((String)foreignBillnum, (String)fullname, (Object)obj, (int)type);
            if (null != obj.get("__errorMessage")) {
                resultList.incFailCount();
                if (null != bill.getKey()) {
                    resultList.addMessage((Object)new ErrorMessage((String)obj.get("__errorMessage"), obj.get(bill.getKey())));
                    continue;
                }
                resultList.addMessage(obj.get("__errorMessage"));
                continue;
            }
            obj.set("_fromApi", (Object)true);
            this.batchupdate(bill, obj, action, resultList, data);
        }
        return resultList;
    }

    public void batchupdate(BillDataDto bill, BizObject obj, String action, ResultList resultList, Map<String, Object> data) throws Exception {
        try {
            BillDataDto oneBill = new BillDataDto(bill.getBillnum());
            oneBill.setData((Object)obj);
            oneBill.setMapCondition(bill.getMapCondition());
            RuleExecuteResult result = BillBiz.executeUpdate((String)action, (BillDataDto)oneBill);
            if (result.getMsgCode() == 1) {
                resultList.incSucessCount();
                if (null != bill.getKey()) {
                    resultList.addInfo((Object)new InfoData(result.getData(), data.get(bill.getKey())));
                } else {
                    resultList.addInfo(result.getData());
                }
            } else {
                resultList.incFailCount();
                if (null != bill.getKey()) {
                    resultList.addMessage((Object)new ErrorMessage(result.getMessage(), data.get(bill.getKey()), data.get("code")));
                } else {
                    resultList.addMessage((Object)result.getMessage());
                }
            }
        }
        catch (Exception var12) {
            logger.error(var12.getMessage(), (Throwable)var12);
            resultList.incFailCount();
            if (null != bill.getKey()) {
                resultList.addMessage((Object)new ErrorMessage(var12.getMessage(), data.get(bill.getKey()), data.get("code")));
            }
            resultList.addMessage((Object)var12.getMessage());
        }
    }

    public ResultList batchaudit(BillDataDto bill) throws Exception {
        return BillBiz.batchaudit((BillDataDto)bill);
    }

    public ResultList batchunaudit(BillDataDto bill) throws Exception {
        return BillBiz.batchunaudit((BillDataDto)bill);
    }

    public RuleExecuteResult check(BillDataDto checkItem) throws Exception {
        return BillBiz.check((BillDataDto)checkItem);
    }

    public RuleExecuteResult audit(BillDataDto bill) throws Exception {
        return BillBiz.audit((BillDataDto)bill);
    }

    public RuleExecuteResult unaudit(BillDataDto bill) throws Exception {
        return BillBiz.unaudit((BillDataDto)bill);
    }

    public RuleExecuteResult stop(BillDataDto bill) throws Exception {
        return BillBiz.stop((BillDataDto)bill);
    }

    public RuleExecuteResult unstop(BillDataDto bill) throws Exception {
        return BillBiz.unstop((BillDataDto)bill);
    }

    public RefInfo showref(BillDataDto bill) throws Exception {
        return BillBiz.showref((BillDataDto)bill);
    }

    public Object getRefData(BillDataDto bill) throws Exception {
        return BillBiz.getRefData((BillDataDto)bill);
    }

    public Pager getGridData(BillDataDto bill) throws Exception {
        return BillBiz.getGridData((BillDataDto)bill);
    }

    public RefEntity getref(BillDataDto bill) throws Exception {
        return BillBiz.getref((BillDataDto)bill);
    }

    public RuleExecuteResult save(BillDataDto bill) throws Exception {
        return BillBiz.save((BillDataDto)bill);
    }

    public String copy(BillDataDto bill) throws Exception {
        return BillBiz.copy((BillDataDto)bill);
    }

    public ExcelExportData export(BillDataDto bill) throws Exception {
        if (StringUtils.isNotBlank((CharSequence)bill.getAsyncKey())) {
            return super.export(bill);
        }
        return BillBiz.export((BillDataDto)bill);
    }

    public ResultList billImport(BillDataDto bill) throws Exception {
        return BillBiz.importData((BillDataDto)bill);
    }

    public TableBody exportPdf(BillDataDto bill) throws Exception {
        return BillBiz.exportPdf((BillDataDto)bill);
    }

    public ResultList batchSave(BillDataDto bill) throws Exception {
        logger.debug("api\u8bf7\u6c42\u53c2\u6570\uff0capi json:{}", bill.getData());
        return BillBiz.batchSave4Api((BillDataDto)bill);
    }

    @Override
    public ResultList batchSaveSync(BillDataDto bill) throws Exception {
        BillContext billContext = BillContextUtils.getBillContext((String)bill.getBillnum());
        String fullname = billContext.getFullname();
        String billnum = bill.getBillnum();
        Map mapCondition = bill.getMapCondition();
        Object obj = bill.getData();
        List list = new ArrayList<Map>();
        if (obj instanceof Map) {
            list.add((Map)obj);
        } else if (obj instanceof List) {
            list = (List)obj;
        }
        int size = list.size();
        CountDownLatch begin = new CountDownLatch(size);
        ArrayList<SaveSyncThread> saveSyncThreads = new ArrayList<SaveSyncThread>();
        for (Map data : list) {
            bill.setData((Object)data);
            SaveSyncThread sst = new SaveSyncThread(begin, data, billnum, fullname, "save", mapCondition);
            new Thread(sst).start();
            saveSyncThreads.add(sst);
        }
        begin.await();
        ResultList result = new ResultList();
        result.setCount(size);
        for (SaveSyncThread sst : saveSyncThreads) {
            RuleExecuteResult ruleResult = sst.getRuleResult();
            if (ruleResult.getMsgCode() == 1) {
                result.incSucessCount();
                if (null != bill.getKey()) {
                    result.addInfo((Object)new InfoData(ruleResult.getData(), sst.getData().get(bill.getKey())));
                    continue;
                }
                result.addInfo(ruleResult.getData());
                continue;
            }
            result.incFailCount();
            if (null != bill.getKey()) {
                result.addMessage((Object)new ErrorMessage(ruleResult.getMessage(), sst.getData().get(bill.getKey()), sst.getData().get("code")));
                continue;
            }
            result.addMessage((Object)ruleResult.getMessage());
        }
        return result;
    }

    public Map<String, Object> getTemplateStructure(Map<String, Object> params) throws Exception {
        return BillBiz.getTemplateStructure(params);
    }

    public String getAllMetaObject(String name) {
        return BillBiz.getAllMetaObject((String)name);
    }

    public List<Map<String, Object>> getPrintCounts(Map<String, Object> map) throws Exception {
        return null;
    }

    public String getPrintData(String billno, List<Object> ids, String code) throws Exception {
        return BillBiz.getPrintData((String)billno, ids, (String)code);
    }

    @Override
    public List<Map> getBizData(BillDataDto dto) throws Exception {
        BillContext billContext = null;
        if (null != dto.getBillnum()) {
            billContext = BillContextUtils.getBillContext((String)dto.getBillnum());
        } else {
            billContext = new BillContext();
            billContext.setFullname(dto.getFullname());
        }
        QuerySchema schema = BizQueryBuilder.buildQuerySchema((BillDataDto)dto);
        return MetaDaoHelper.query((BillContext)billContext, (QuerySchema)schema);
    }

    @Override
    public Pager getBizDataPage(BillDataDto dto) throws Exception {
        BillContext billContext = null;
        if (null != dto.getBillnum()) {
            billContext = BillContextUtils.getBillContext((String)dto.getBillnum());
        } else {
            billContext = new BillContext();
            billContext.setFullname(dto.getFullname());
        }
        QuerySchema schema = BizQueryBuilder.buildQuerySchema((BillDataDto)dto);
        return MetaDaoHelper.queryByPage((BillContext)billContext, (QuerySchema)schema);
    }

    @Override
    public List<Map> getBizDataPartitionable(ApiDto dto) throws Exception {
        BillContext billContext = null;
        if (null != dto.getBillnum()) {
            billContext = BillContextUtils.getBillContext((String)dto.getBillnum());
        } else {
            billContext = new BillContext();
            billContext.setFullname(dto.getFullname());
        }
        QuerySchema schema = BizQueryBuilder.buildQuerySchema((BillDataDto)dto);
        boolean partitionable = dto.isPartitionable();
        if (!partitionable) {
            schema.setPartitionable(partitionable);
        }
        return MetaDaoHelper.query((BillContext)billContext, (QuerySchema)schema);
    }

    @Override
    public Pager getBizDataPagePartitionable(ApiDto dto) throws Exception {
        BillContext billContext = null;
        if (null != dto.getBillnum()) {
            billContext = BillContextUtils.getBillContext((String)dto.getBillnum());
        } else {
            billContext = new BillContext();
            billContext.setFullname(dto.getFullname());
        }
        QuerySchema schema = BizQueryBuilder.buildQuerySchema((BillDataDto)dto);
        boolean partitionable = dto.isPartitionable();
        if (!partitionable) {
            schema.setPartitionable(partitionable);
        }
        return MetaDaoHelper.queryByPage((BillContext)billContext, (QuerySchema)schema);
    }

    @Override
    public String uploadData(BillDataDto dto) throws Exception {
        String resultStr = null;
        if (dto.getData() == null) {
            return InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080079", (String)"\u672a\u63d0\u4ea4\u6570\u636e\u3002");
        }
        if (dto.getDatasource() == null) {
            return InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408007A", (String)"\u672a\u6307\u5b9a\u4e1a\u52a1\u57df\u3002");
        }
        if (dto.getFullname() == null) {
            return InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408007C", (String)"\u672a\u6307\u5b9a\u6570\u636e\u5b9e\u4f53\u3002");
        }
        resultStr = "sql".equalsIgnoreCase(dto.getDataType()) ? DataUploadUtils.upload((String)dto.getDatasource(), (String)dto.getFullname(), (String)dto.getData().toString()) : DataUploadUtils.upload((String)dto.getDatasource(), (String)dto.getFullname(), (List)((List)dto.getData()));
        try {
            if ("pc.product.Product".equals(dto.getFullname()) && !"sql".equalsIgnoreCase(dto.getDataType())) {
                HashMap tenantIdMap = new HashMap();
                HashMap tenantIdForProductTagMap = new HashMap();
                HashMap tenantIdForSkuTagMap = new HashMap();
                HashMap tenantIdForOrderPropertyMap = new HashMap();
                List data = (List)dto.getData();
                for (Map record : data) {
                    String tenantId = (record.get("tenant_id") == null ? record.get("tenant") : record.get("tenant_id")).toString();
                    if (tenantIdMap.containsKey(Long.parseLong(tenantId))) {
                        ((List)tenantIdMap.get(Long.parseLong(tenantId))).add(Long.parseLong(record.get("id").toString()));
                        continue;
                    }
                    ArrayList<Long> productIdList = new ArrayList<Long>();
                    productIdList.add(Long.parseLong(record.get("id").toString()));
                    tenantIdMap.put(Long.parseLong(tenantId), productIdList);
                }
                if (!tenantIdMap.isEmpty()) {
                    for (Long tenantId : tenantIdMap.keySet()) {
                        HashMap<String, String> params = new HashMap<String, String>();
                        params.put("ytenant", AppContext.getCurrentUser().getYTenantId());
                        params.put("productIdList", (String)tenantIdMap.get(tenantId));
                        SqlHelper.update((String)"com.yonyoucloud.upc.data.ProductDoubleWriteDao.updateProductApplyRangeDetailId", params);
                        SqlHelper.update((String)"com.yonyoucloud.upc.data.ProductDoubleWriteDao.updateProductApplyRangeTimeDetailId", params);
                        SqlHelper.update((String)"com.yonyoucloud.upc.data.ProductDoubleWriteDao.updateProductApplyRangeData", params);
                        SqlHelper.update((String)"com.yonyoucloud.upc.data.ProductDoubleWriteDao.updateProductDepositTimeDetail", params);
                    }
                }
            }
        }
        catch (Exception e) {
            logger.error("\u4e91\u91c7sql\u540c\u6b65\u7269\u6599\u53cc\u5199\u5f02\u5e38({}):" + e.getMessage(), (Throwable)e);
        }
        return resultStr;
    }

    @Override
    public String getNewestPositionCode(String ytenantId) throws Exception {
        return this.ypdBizDocBillService.getNewestPositionCode(ytenantId);
    }

    @Override
    public Map checkreferencebyfieldname(Map data) throws Exception {
        if (data.get("fullname") == null || data.get("id") == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800889);
        }
        HashMap<String, Object> result = new HashMap<String, Object>();
        result.put("result", true);
        String fullname = data.get("fullname").toString();
        String id = data.get("id").toString();
        String fieldname = data.get("name") == null ? null : data.get("name").toString();
        String fieldValue = data.get("fieldValue").toString();
        if ("true".equals(fieldValue)) {
            fieldValue = "false";
        } else if ("false".equals(fieldValue)) {
            fieldValue = "true";
        }
        StringBuffer buffer = new StringBuffer("");
        if ("aa.warehouse.Warehouse".equals(fullname) && "iSerialManage".equals(fieldname)) {
            QuerySchema querySchema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"warehouse").eq((Object)id)}));
            List list = MetaDaoHelper.query((String)"sn.serialnumber.SNstate", (QuerySchema)querySchema, (String)"ustock");
            if (!CollectionUtils.isEmpty((Collection)list)) {
                result.put("result", false);
                result.put("msg", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040800B2", (String)"\u8be5\u4ed3\u5e93\u5df2\u7ecf\u88ab\u5e93\u5b58\u9886\u57df-\u5e8f\u5217\u53f7\u6863\u6848\u4f7f\u7528\uff0c\u5e8f\u5217\u53f7\u7ba1\u7406\u5c5e\u6027\u65e0\u6cd5\u4fee\u6539\uff01"));
            }
        } else if ("aa.warehouse.Warehouse".equals(fullname) && "wStore".equals(fieldname)) {
            QuerySchema querySchema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"warehouse").eq((Object)id)}));
            List list = MetaDaoHelper.query((String)"aa.store.StoreOweWarehouse", (QuerySchema)querySchema, (String)"yxybase");
            if (!CollectionUtils.isEmpty((Collection)list)) {
                result.put("result", false);
                result.put("msg", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040800B4", (String)"\u8be5\u4ed3\u5e93\u5df2\u7ecf\u88ab\u8425\u9500\u516c\u5171-\u7ec8\u7aef\u7f51\u70b9\u6216\u96f6\u552e\u5e97\u94fa\u4f7f\u7528\uff0c\u95e8\u5e97\u4ed3\u5c5e\u6027\u65e0\u6cd5\u4fee\u6539\uff01"));
            }
        } else if ("aa.warehouse.Warehouse".equals(fullname) && "isGoodsPositionStock".equals(fieldname)) {
            BillContext billContext = new BillContext();
            billContext.setBillnum("aa_warehouse");
            billContext.setFullname("aa.warehouse.Warehouse");
            BillDataDto dto = new BillDataDto();
            dto.setId(data.get("id").toString());
            dto.setBillnum("aa_warehouse");
            data.put("isGoodsPositionStock", fieldValue);
            dto.setData((Object)data);
            HashMap<String, BillDataDto> paramMap = new HashMap<String, BillDataDto>();
            paramMap.put("param", dto);
            logger.info(String.format("\u4ed3\u5e93\u8d27\u4f4d\u5bc4\u5b58\u91cf\u9a8c\u8bc1,paramMap:%s", paramMap));
            RuleExecuteResult ruleExecuteResult = BillBiz.executeRule((String)"checkgoodsstock", (BillContext)billContext, paramMap);
        } else if ("aa.warehouse.Warehouse".equals(fullname) && "isGoodsPosition".equals(fieldname)) {
            QuerySchema getWarehouseById = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"warehouseId").eq((Object)id)}));
            List mapList = this.billQueryRepository.queryMapBySchema("aa.goodsposition.GoodsPosition", getWarehouseById);
            if (mapList != null && mapList.size() > 0) {
                result.put("result", false);
                result.put("msg", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040800BD", (String)"\u8be5\u4ed3\u5e93\u5df2\u7ecf\u88ab\u8d27\u4f4d\u5f15\u7528\uff0c\u4e0d\u53ef\u4fee\u6539\u8d27\u4f4d\u7ba1\u7406"));
                return result;
            }
        } else {
            if (data.get("domain") != null && !"null".equals(data.get("domain").toString())) {
                String[] domainList = data.get("domain").toString().split(",");
                for (int i = 0; i < domainList.length && (buffer = MetaDaoHelper.referenceCheck((String)fullname, (String)id, null, (String)domainList[i])).length() <= 0; ++i) {
                }
            } else {
                buffer = MetaDaoHelper.referenceCheck((String)fullname, (String)id, null);
            }
            if (buffer.length() > 0) {
                result.put("result", false);
                result.put("msg", buffer.toString());
            }
        }
        return result;
    }

    @Override
    public String getRegionIdByPCD(String pcd) throws Exception {
        if (pcd != null && pcd.length() != 0) {
            List mapList;
            int i;
            String[] regionNameList = pcd.split("#");
            String[] regionIdList = new String[regionNameList.length];
            boolean flag = false;
            String tenantId = (String)AppContext.getYhtTenantId();
            QuerySchema queryRegionId = null;
            for (i = 0; i < regionNameList.length; ++i) {
                queryRegionId = i - 1 >= 0 ? QuerySchema.create().addSelect("id,parent").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"name").eq((Object)regionNameList[i]), QueryCondition.name((String)"parent").eq((Object)regionIdList[i - 1]), QueryCondition.name((String)"tenant").eq((Object)tenantId)})) : QuerySchema.create().addSelect("id,parent").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"name").eq((Object)regionNameList[i]), QueryCondition.name((String)"tenant").eq((Object)tenantId)}));
                mapList = MetaDaoHelper.query((String)"bd.region.BaseRegionVO", (QuerySchema)queryRegionId, (String)"ucfbasedoc");
                if (mapList == null || mapList.size() == 0) {
                    flag = true;
                    break;
                }
                regionIdList[i] = ((Map)mapList.get(0)).get("id").toString();
                flag = false;
            }
            if (flag) {
                tenantId = "global";
                for (i = 0; i < regionNameList.length; ++i) {
                    queryRegionId = i - 1 >= 0 ? QuerySchema.create().addSelect("id,parent").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"name").eq((Object)regionNameList[i]), QueryCondition.name((String)"parent").eq((Object)regionIdList[i - 1]), QueryCondition.name((String)"tenant").eq((Object)tenantId)})) : QuerySchema.create().addSelect("id,parent").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"name").eq((Object)regionNameList[i]), QueryCondition.name((String)"tenant").eq((Object)tenantId)}));
                    mapList = MetaDaoHelper.query((String)"bd.region.BaseRegionVO", (QuerySchema)queryRegionId, (String)"ucfbasedoc");
                    if (mapList == null || mapList.size() == 0) {
                        flag = true;
                        break;
                    }
                    regionIdList[i] = ((Map)mapList.get(0)).get("id").toString();
                    flag = false;
                }
            }
            if (flag) {
                return "not found!!";
            }
            return regionIdList[regionIdList.length - 1];
        }
        return null;
    }

    @Override
    public ResultList relationsave(Map map) throws Exception {
        ResultList result = new ResultList();
        HashMap<String, String> msgmap = new HashMap<String, String>();
        if (!map.containsKey("fullname") || map.get("fullname") == null || org.springframework.util.StringUtils.isEmpty((Object)map.get("fullname").toString()) || !map.containsKey("checkfields") || map.get("checkfields") == null || org.springframework.util.StringUtils.isEmpty((Object)map.get("checkfields").toString())) {
            throw new CoreDocBusinessException(null, "fullname or checkfields is empty");
        }
        String fullname = map.get("fullname").toString();
        String checkfields = map.get("checkfields").toString();
        Map<String, Object> partitionMap = this.getPartitionFields();
        Entity entity = BizContext.getMetaRepository().entity(fullname);
        String tableName = entity.getMainTableName();
        boolean isYtenantId = DbSchemaUtil.checkTableAndColumn((String)"meta", (String)tableName, (String)"ytenant_id");
        List datalist = (List)map.get("data");
        result.setCount(datalist.size());
        int sucessCount = 0;
        int failCount = 0;
        ArrayList senEventData = new ArrayList();
        PropertyMap attrmap = entity.attrMap();
        for (Map data : datalist) {
            try {
                Map checkdata = this.checkdata(data, attrmap);
                Map<String, Object> userDefFieldsMap = this.getUserDefFields(checkdata, partitionMap);
                String tableandfields = this.getTableAndFields(isYtenantId, tableName, checkdata, attrmap);
                logger.info("==============tableandfields=" + tableandfields);
                String values = this.getValues(checkdata);
                logger.info("==============values=" + values);
                String checkfieldsandvalue = this.getCheckFieldsAndValue(checkfields, checkdata, attrmap);
                logger.info("==============checkfieldsandvalue=" + checkfieldsandvalue);
                String updatefieldsvalues = this.getUpdateFieldsValues(checkdata, attrmap);
                logger.info("==============updatefieldsvalues=" + updatefieldsvalues);
                HashMap<String, Object> params = new HashMap<String, Object>();
                params.put("tablename", tableName);
                params.put("tableandfields", tableandfields);
                params.put("fieldvalues", values);
                params.put("uniquecheck", checkfieldsandvalue);
                params.put("updatefieldsvalues", updatefieldsvalues);
                params.putAll(partitionMap);
                params.putAll(userDefFieldsMap);
                String salResult = "insert/Affected rows: ";
                int insert = SqlHelper.insert((String)"com.yonyoucloud.upc.member.dao.apibillDao.relationsave", params);
                data.put("id", params.get("id"));
                this.afterInsertExtend(data, map);
                salResult = salResult + insert;
                if (0 == insert) {
                    int update = SqlHelper.insert((String)"com.yonyoucloud.upc.member.dao.apibillDao.relationupdate", params);
                    salResult = salResult + ", update/Affected rows: " + update;
                } else {
                    HashMap rangMap = new HashMap();
                    rangMap.put(MERCHANT_ID, data.get(MERCHANT_ID));
                    rangMap.put("merchantApplyRangeId", data.get("id"));
                    rangMap.put("orgId", data.get("orgId"));
                    rangMap.put("rangeType", 1);
                    rangMap.put("stopstatus", false);
                    senEventData.add(rangMap);
                }
                msgmap.put(data.toString(), salResult);
                ++sucessCount;
                result.addInfo((Object)data);
            }
            catch (Exception e) {
                logger.error("relationsave error:" + e.getMessage(), (Throwable)e);
                ++failCount;
                String logmsg = InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408004C", (String)"\u62a5\u9519\u539f\u56e0\uff1a") + e.getLocalizedMessage() + "," + e.getStackTrace()[0].toString();
                String resultmsg = InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408004C", (String)"\u62a5\u9519\u539f\u56e0\uff1a") + e.getLocalizedMessage();
                msgmap.put(data.toString(), logmsg);
                result.addMessage((Object)this.buildMessage(data, resultmsg));
            }
        }
        if (!CollectionUtils.isEmpty(senEventData)) {
            Map<String, List<Map>> senEventMap = senEventData.stream().collect(Collectors.groupingBy(eventData -> eventData.get(MERCHANT_ID).toString()));
            HashMap<String, Object> businessObject = new HashMap<String, Object>();
            HashMap<String, Object> archive = new HashMap<String, Object>();
            businessObject.put("billnum", map.get("billnum"));
            businessObject.put("fullname", fullname);
            String eventType = String.valueOf((Object)EventType.find("aa_merchantlist", "addmerchantsuitorg", null));
            for (String key : senEventMap.keySet()) {
                archive.put(MERCHANT_ID, key);
                archive.put("merchantApplyRanges", senEventMap.get(key));
                businessObject.put("archive", JSONObject.toJSONString(archive, (SerializerFeature[])new SerializerFeature[]{SerializerFeature.WriteDateUseDateFormat}));
                try {
                    this.eventService2.sendEvent("YXYBASEDOC", eventType, businessObject);
                }
                catch (Exception e) {
                    logger.error("\u53cb\u4f01\u8054\u53d1\u9001\u5206\u914d\u7ec4\u7ec7\u4e8b\u4ef6\u5931\u8d25\uff1a" + e.getMessage(), (Throwable)e);
                }
            }
        }
        result.setSucessCount(sucessCount);
        result.setFailCount(failCount);
        String msgMapStr = GsonHelper.ToJSon(msgmap);
        logger.info("\u540c\u6b65\u7ed3\u675f\u62a5\u544a\uff0d\uff0d\uff0d>\n{}", (Object)msgMapStr);
        return result;
    }

    @Override
    public void sendEvent(String billnum, Map map) throws Exception {
        HashMap<String, Object> businessObject = new HashMap<String, Object>();
        businessObject.put("billnum", billnum);
        businessObject.put("archive", JSONObject.toJSONString((Object)map, (SerializerFeature[])new SerializerFeature[]{SerializerFeature.WriteDateUseDateFormat}));
        String eventType = String.valueOf((Object)EventType.find("base_doc", "detail", "MakeUp"));
        try {
            this.eventService2.sendEvent("YXYBASEDOC", eventType, businessObject);
        }
        catch (Exception e) {
            logger.error("\u53d1\u9001\u8865\u507f\u4e8b\u4ef6\u5931\u8d25" + e.getMessage(), (Throwable)e);
        }
    }

    @Override
    public void getSysToken(String fullname, String id, HttpServletRequest request, HttpServletResponse response) throws Exception {
        QuerySchema queryTenantId = QuerySchema.create().addSelect("tenant").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)id)}));
        queryTenantId.setPartitionable(false);
        Map queryTenantIdBiz = MetaDaoHelper.queryOne((String)fullname, (QuerySchema)queryTenantId);
        if (!queryTenantIdBiz.containsKey("tenant") || queryTenantIdBiz.get("tenant") == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800890, new Object[]{fullname, id});
        }
        QuerySchema queryYHTTenant = QuerySchema.create().addSelect("tenantCenter").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(queryTenantIdBiz.get("tenant"))}));
        queryYHTTenant.setPartitionable(false);
        Map queryYHTTenantBiz = MetaDaoHelper.queryOne((String)"base.tenant.Tenant", (QuerySchema)queryYHTTenant);
        if (!queryYHTTenantBiz.containsKey("tenantCenter") || queryYHTTenantBiz.get("tenantCenter") == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800891, new Object[]{queryTenantIdBiz.get("tenant_id")});
        }
        HashMap params = new HashMap();
        params.put("yhtTenantId", queryYHTTenantBiz.get("tenantCenter"));
        params.put("isAgent", false);
    }

    @Override
    @Transactional(rollbackFor={Throwable.class})
    public ResultList billdeleteforce(MultipartFile mpfile, Map<String, Object> params) throws Exception {
        String currentTimeStr = UpcDataFormat.DATE_FORMAT.format(new Date());
        params.put("batchcode", currentTimeStr);
        File excelFile = this.getExcelFile(mpfile);
        List titles = ExcelFileUtil.fetchExcelTitle((File)excelFile, (int)0, (int)0);
        FileInputStream in = new FileInputStream(excelFile);
        List maps = GridExcel.readByEventModel((InputStream)in, Map.class, (ExcelType)ExcelType.XLSX).get();
        GridExcel.readByEventModel((InputStream)in, Map.class, (ExcelType)ExcelType.XLSX).window(5, ts -> this.deletehandle(params, (List<Map>)ts)).process(cs -> {
            HashMap<String, Object> map = new HashMap<String, Object>();
            for (int y = 0; y < cs.size(); ++y) {
                map.put((String)titles.get(y), cs.get(y));
            }
            return map;
        }, 2);
        ((InputStream)in).close();
        return new ResultList();
    }

    @NotNull
    public File getExcelFile(MultipartFile mpfile) throws Exception {
        String sanitizePathTraversal = mpfile.getOriginalFilename();
        File excelFile = null;
        if (sanitizePathTraversal != null) {
            excelFile = ExcelFileUtil.createTempFile((String)sanitizePathTraversal, (byte[])mpfile.getBytes());
        }
        if (excelFile == null) {
            throw new CoreDocBusinessException("excelFile is null");
        }
        excelFile.setExecutable(true);
        excelFile.setReadable(true);
        excelFile.setWritable(true);
        Pattern excelpattern = Pattern.compile("^(xls|XLS|XLSX|xlsx)$");
        if (!excelpattern.matcher(FileKit.getFileExtension((File)excelFile)).matches()) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800892);
        }
        return excelFile;
    }

    private void deletehandle(Map<String, Object> params, List<Map> ts) {
        try {
            String fullname = String.valueOf(params.get("fullname"));
            FullNameEnum fullNameEnum = FullNameEnum.find((String)fullname);
            if (null == fullNameEnum) {
                return;
            }
            for (Map map : ts) {
                this.deleteOneBill(fullNameEnum, params, map);
            }
        }
        catch (Exception e) {
            logger.error("com.yonyoucloud.upc.service.UPCBillService.deletehandle" + e.getMessage(), (Throwable)e);
        }
    }

    private void deleteOneBill(FullNameEnum fullNameEnum, Map<String, Object> params, Map map) {
        try {
            String tenantIdStr = String.valueOf(params.get("tenantid"));
            QueryConditionGroup condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"tenantCenter").eq((Object)tenantIdStr)});
            QuerySchema querySchema = QuerySchema.create().addSelect("*").appendQueryCondition(new ConditionExpression[]{condition});
            querySchema.setPartitionable(false);
            Map tenantmap = MetaDaoHelper.queryOne((String)"base.tenant.Tenant", (QuerySchema)querySchema);
            long tenantId = Long.valueOf(String.valueOf(tenantmap.get("id")));
            String batchcode = String.valueOf(params.get("batchcode"));
            Map<String, Object> selectMap = this.queryBillByCode(fullNameEnum, tenantId, map);
            if (null == selectMap || !selectMap.containsKey("id")) {
                return;
            }
            this.savebilldeleteforce(fullNameEnum, tenantId, tenantIdStr, batchcode, selectMap);
            String sql = "update " + fullNameEnum.getTablename() + " set tenant_id = if(tenant_id>0,tenant_id*-1,tenant_id) where id = " + selectMap.get("id").toString();
            this.executeOneSql(sql);
            if ("product".equals(fullNameEnum.getTablename())) {
                sql = "update productsku set tenant_id = if(tenant_id>0,tenant_id*-1,tenant_id) where productid = " + selectMap.get("id").toString();
                this.executeOneSql(sql);
            }
        }
        catch (Exception e) {
            logger.error("com.yonyoucloud.upc.service.UPCBillService.deleteOneMerchant" + e.getMessage(), (Throwable)e);
        }
    }

    private Map<String, Object> queryBillByCode(FullNameEnum fullNameEnum, long tenantId, Map map) throws Exception {
        QueryConditionGroup condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq(map.get("code")), QueryCondition.name((String)"tenant").eq((Object)tenantId)});
        QuerySchema querySchema = QuerySchema.create().addSelect("*").appendQueryCondition(new ConditionExpression[]{condition});
        querySchema.setPartitionable(false);
        return MetaDaoHelper.queryOne((String)fullNameEnum.getFullname(), (QuerySchema)querySchema);
    }

    private void executeOneSql(String sql) throws Exception {
        HashMap<String, String> params = new HashMap<String, String>();
        params.put("sql", sql);
        SqlHelper.update((String)"com.yonyoucloud.upc.dao.meta.init.executeOneSql", params);
    }

    private void savebilldeleteforce(FullNameEnum fullNameEnum, long tenantId, String yhttenantId, String batchcode, Map<String, Object> map) throws Exception {
        BizObject bizObject = new BizObject(map);
        String jsonString = JSON.toJSONString((Object)bizObject);
        BillDeleteForce bdf = new BillDeleteForce();
        bdf.setBatchcode(batchcode);
        bdf.setBillname(fullNameEnum.getName());
        bdf.setBillnumber(fullNameEnum.getBillnumbar());
        bdf.setFullname(fullNameEnum.getFullname());
        bdf.setTablename(fullNameEnum.getTablename());
        bdf.setDataid(bizObject.getId().toString());
        bdf.setDatacode((String)bizObject.get("code"));
        bdf.setDataname((String)bizObject.get("name"));
        bdf.setOptype(OperateType.Delete);
        bdf.setDatastatus(DataStatus.Deleted);
        bdf.setDatajson(jsonString);
        bdf.setTenant(Long.valueOf(tenantId));
        bdf.setYhttenant(yhttenantId);
        bdf.setCreator(AppContext.getCurrentUser().getName());
        bdf.put("creatorId", AppContext.getCurrentUser().getId());
        Date createDate = new Date();
        bdf.setCreateTime(createDate);
        bdf.setCreateDate(createDate);
        bdf.setEntityStatus(EntityStatus.Insert);
        MetaDaoHelper.insert((String)"coredoc.pub.BillDeleteForce", (BizObject)bdf);
    }

    @Override
    @Transactional(rollbackFor={Throwable.class})
    public ResultList repaire(Map<String, Object> map) throws Exception {
        List params = (List)map.get("data");
        for (Map param : params) {
            BillDeleteForce billDeleteForce = new BillDeleteForce();
            billDeleteForce.init(param);
            this.repaireOneBill(billDeleteForce);
        }
        return new ResultList();
    }

    @Override
    public String tenantValidateCheck(DeleteToolDto deleteToolContext) throws Exception {
        Map tenantmap;
        String reMessage = "";
        if (deleteToolContext.getTargetYTenantId() == null || deleteToolContext.getTargetTenantName() == null) {
            reMessage = InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408009E", (String)"\u79df\u6237ID\u548c\u79df\u6237\u540d\u79f0\u4e0d\u80fd\u4e3a\u7a7a");
        }
        String tenantid = deleteToolContext.getTargetYTenantId();
        String tenantname = deleteToolContext.getTargetTenantName();
        String result = TenantCenter.getUpcTenantById((String)tenantid);
        Map resultMap = (Map)JSON.parseObject((String)result, Map.class);
        if (resultMap != null && resultMap.get("status") != null && 1 == Integer.parseInt(resultMap.get("status").toString())) {
            Map tenantMap = (Map)resultMap.get("tenant");
            if (!tenantname.equals((String)tenantMap.get("tenantName"))) {
                reMessage = InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040800A3", (String)"\u79df\u6237\u4fe1\u606f\u6709\u8bef\uff0c\u8bf7\u786e\u8ba4");
            }
        } else {
            reMessage = InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040800A3", (String)"\u79df\u6237\u4fe1\u606f\u6709\u8bef\uff0c\u8bf7\u786e\u8ba4");
        }
        QueryConditionGroup condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"tenantCenter").eq((Object)deleteToolContext.getTargetYTenantId())});
        QuerySchema querySchema = QuerySchema.create().addSelect("*").appendQueryCondition(new ConditionExpression[]{condition});
        querySchema.setPartitionable(false);
        List tenantlist = MetaDaoHelper.query((String)"base.tenant.Tenant", (QuerySchema)querySchema);
        if (CollectionUtils.isEmpty((Collection)tenantlist)) {
            reMessage = InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040800A3", (String)"\u79df\u6237\u4fe1\u606f\u6709\u8bef\uff0c\u8bf7\u786e\u8ba4");
        }
        if (null == (tenantmap = (Map)tenantlist.get(0)) || tenantmap.isEmpty()) {
            reMessage = InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040800A3", (String)"\u79df\u6237\u4fe1\u606f\u6709\u8bef\uff0c\u8bf7\u786e\u8ba4");
        }
        return reMessage == "" ? "\u6821\u9a8c\u901a\u8fc7" : reMessage;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void repaireOneBill(BillDeleteForce billDeleteForce) {
        try {
            String sql = "update " + billDeleteForce.getTablename() + " set tenant_id = if(tenant_id<0,tenant_id*-1,tenant_id) where id = " + billDeleteForce.getDataid();
            this.executeOneSql(sql);
            billDeleteForce.setOptype(OperateType.Repair);
            billDeleteForce.setDatastatus(DataStatus.Repaired);
            if ("product".equals(billDeleteForce.getTablename())) {
                sql = "update productsku set tenant_id = if(tenant_id<0,tenant_id*-1,tenant_id) where productid = " + billDeleteForce.getDataid();
                this.executeOneSql(sql);
            }
        }
        catch (Exception e) {
            String errorinfo = e.getMessage().substring(0, 900).trim();
            billDeleteForce.setErrorinfo(errorinfo);
            logger.error("com.yonyoucloud.upc.service.UPCBillService.repaireOneBill" + e.getMessage(), (Throwable)e);
        }
        finally {
            try {
                billDeleteForce.put("modifierId", AppContext.getCurrentUser().getId());
                billDeleteForce.setModifier(AppContext.getCurrentUser().getName());
                Date modifyDate = new Date();
                billDeleteForce.setModifyTime(modifyDate);
                billDeleteForce.setModifyDate(modifyDate);
                SqlHelper.update((String)"com.yonyoucloud.upc.dao.meta.init.updatebdf", (Object)billDeleteForce);
            }
            catch (Exception e) {
                logger.error("com.yonyoucloud.upc.service.UPCBillService.repaireOneBill" + e.getMessage(), (Throwable)e);
            }
        }
    }

    private void afterInsertExtend(Map data, Map map) throws Exception {
        if ("aa.merchant.MerchantApplyRange".equals(map.get("fullname"))) {
            this.saveMergchantDetail(data);
        }
    }

    private void saveMergchantDetail(Map data) throws Exception {
        if (data.get(MERCHANT_ID) != null && data.get("id") != null) {
            logger.info("==============saveMergchantDetail=" + data);
            MerchantApplyRangeDetail merchantApplyRangeDetail = new MerchantApplyRangeDetail();
            merchantApplyRangeDetail.put("id", data.get(MERCHANT_ID));
            merchantApplyRangeDetail.put("merchantApplyRangeId", data.get("id"));
            merchantApplyRangeDetail.setStopstatus(Boolean.valueOf(false));
            List RangeDetail = MetaDaoHelper.query((String)"aa.merchant.MerchantApplyRangeDetail", (QuerySchema)QuerySchema.create().addSelect("*").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(merchantApplyRangeDetail.get("id")), QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantApplyRangeId").eq(merchantApplyRangeDetail.get("merchantApplyRangeId"))})})));
            if (!CollectionUtils.isEmpty((Collection)RangeDetail)) {
                merchantApplyRangeDetail.setEntityStatus(EntityStatus.Update);
                MetaDaoHelper.update((String)"aa.merchant.MerchantApplyRangeDetail", (BizObject)merchantApplyRangeDetail);
            } else {
                merchantApplyRangeDetail.setEntityStatus(EntityStatus.Insert);
                MetaDaoHelper.insert((String)"aa.merchant.MerchantApplyRangeDetail", (BizObject)merchantApplyRangeDetail);
            }
        } else {
            String msg = String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040800BC", (String)"\u62a5\u9519\u539f\u56e0:\u6ca1\u6709\u627e\u5230\u5ba2\u6237\u6216\u5206\u914d\u5173\u7cfb"), new Object[0]);
            throw new CoreDocBusinessException(msg);
        }
    }

    private Map<String, Object> getUserDefFields(Map<String, Object> checkdata, Map<String, Object> partitionMap) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        for (Map.Entry<String, Object> entry : checkdata.entrySet()) {
            if (null == entry.getValue()) continue;
            String evaluestr = entry.getValue().toString();
            String ekeystr = entry.getKey();
            if (!evaluestr.contains("$")) continue;
            evaluestr = null == partitionMap.get(evaluestr = evaluestr.replace("$", "")) ? null : partitionMap.get(evaluestr).toString();
            checkdata.put(ekeystr, evaluestr);
            map.put(ekeystr, evaluestr);
        }
        return map;
    }

    private Map<String, Object> getPartitionFields() {
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("tenant", AppContext.getTenantId());
        map.put("shop", AppContext.getCurrentUser().getDocId());
        return map;
    }

    private Map buildMessage(Map data, String msg) {
        HashMap<String, String> message = new HashMap<String, String>();
        message.putAll(data);
        message.put("message", msg);
        message.put("key", (String)data.get("erpCode"));
        return message;
    }

    private Map checkdata(Map data, PropertyMap attrmap) {
        HashMap<String, Object> checkdata = new HashMap<String, Object>();
        for (Object key : data.keySet()) {
            if (!attrmap.containsKey(key.toString())) continue;
            checkdata.put(key.toString(), data.get(key.toString()));
        }
        checkdata.put("ytenant_id", AppContext.getYTenantId());
        return checkdata;
    }

    @NotNull
    private String getCheckFieldsAndValue(String checkfields, Map data, PropertyMap attrmap) {
        String[] checkfieldssplit;
        String checkfieldsandvalue = "1=1";
        for (String checkfield : checkfieldssplit = checkfields.split(",")) {
            Property attr = attrmap.get(checkfield);
            String columnName = attr.columnName();
            String title = attr.title();
            if (null == data.get(checkfield) || "".equals(data.get(checkfield).toString().trim())) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800893);
            }
            String value = null == data.get(checkfield) ? null : ("".equals(data.get(checkfield).toString().trim()) ? "''" : data.get(checkfield).toString());
            checkfieldsandvalue = checkfieldsandvalue + " and " + columnName + "=" + value;
        }
        return checkfieldsandvalue;
    }

    @NotNull
    private String getValues(Map data) {
        String values = "";
        for (Object value : data.values()) {
            String vstr = null == value ? null : ("".equals(value.toString().trim()) ? "''" : (value instanceof String ? "'" + value.toString() + "'" : value.toString()));
            values = values + vstr + ", ";
        }
        values = values.substring(0, values.length() - 2);
        return values;
    }

    @NotNull
    private String getTableAndFields(boolean isYtenantId, String tableName, Map data, PropertyMap attrmap) {
        StringBuffer tableandfields = new StringBuffer();
        tableandfields.append(tableName + " (");
        if (isYtenantId) {
            tableandfields.append("`ytenant_id`,");
        }
        for (Object key : data.keySet()) {
            if ("ytenant_id".equals(key.toString())) continue;
            Property attr = attrmap.get(key.toString());
            tableandfields.append("`" + attr.columnName() + "`, ");
        }
        tableandfields.delete(tableandfields.lastIndexOf(","), tableandfields.length());
        tableandfields.append(") ");
        return tableandfields.toString();
    }

    private String getUpdateFieldsValues(Map data, PropertyMap attrmap) {
        String updatefieldsvalues = "";
        for (Object key : data.keySet()) {
            if ("ytenant_id".equals(key.toString())) continue;
            Property attr = attrmap.get(key.toString());
            String columnName = attr.columnName();
            String value = null == data.get(key) ? null : ("".equals(data.get(key).toString().trim()) ? "''" : data.get(key).toString());
            updatefieldsvalues = updatefieldsvalues + "`" + columnName + "` = " + value + ", ";
        }
        updatefieldsvalues = updatefieldsvalues.substring(0, updatefieldsvalues.length() - 2);
        return updatefieldsvalues;
    }

    @Override
    public Map getBizObject(BillDataDto dto) throws Exception {
        QuerySchema schema = QuerySchema.create().addSelect(dto.getData() == null ? "*" : dto.getData().toString()).appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)dto.getId())});
        return MetaDaoHelper.queryOne((String)dto.getFullname(), (QuerySchema)schema);
    }

    @Override
    public Map getBizObject(String fullName, Long id) throws Exception {
        List mapList = MetaDaoHelper.queryById((String)fullName, (String)"*", (Object)id);
        if (!CollectionUtils.isEmpty((Collection)mapList)) {
            return (Map)mapList.get(0);
        }
        return null;
    }

    @Override
    @Deprecated
    public List<UserDefineClass> getSpecification(Long productId) throws Exception {
        log.error("com.yonyoucloud.upc.service.UPCBillService.getSpecification\u5b58\u5728\u8c03\u7528");
        HashMap<String, String> param = new HashMap<String, String>();
        param.put("productId", String.valueOf(productId));
        List results = SqlHelper.selectList((String)"com.yonyoucloud.uretail.mall.dao.QuerySpecificationDao.querySpecification", param);
        return results;
    }

    @Override
    @Deprecated
    public List<Map<String, Object>> getSpecification(List<String> productIds) throws Exception {
        log.error("com.yonyoucloud.upc.service.UPCBillService.getSpecification(java.util.List<java.lang.String>)\u5b58\u5728\u8c03\u7528");
        HashMap<String, List<String>> param = new HashMap<String, List<String>>();
        param.put("productIds", productIds);
        List results = SqlHelper.selectList((String)"com.yonyoucloud.uretail.mall.dao.QuerySpecificationDao.querySpecificationByProductIds", param);
        return results;
    }

    public ResultList batchDelete4Api(BillDataDto bill) throws Exception {
        return BillBiz.batchDelete4Api((BillDataDto)bill);
    }

    @Override
    @Deprecated
    public List<Map> getProductAlbumByProductIDs(BillDataDto bill) throws Exception {
        log.error("com.yonyoucloud.upc.service.UPCBillService.getProductAlbumByProductIDs\u5b58\u5728\u8c03\u7528");
        List productIds = (List)bill.getData();
        List albums = null;
        QuerySchema schema = QuerySchema.create().addSelect("productId,folder,imgName,sort,type,size").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").in((Collection)productIds)}));
        albums = MetaDaoHelper.query((String)"pc.product.ProductAlbum", (QuerySchema)schema);
        return albums;
    }

    @Override
    @Deprecated
    public List<Map> getProductDefaultAlbumByProductIDs(BillDataDto bill) throws Exception {
        log.error("com.yonyoucloud.upc.service.UPCBillService.getProductDefaultAlbumByProductIDs\u5b58\u5728\u8c03\u7528");
        Object productIds = bill.getData();
        List albums = null;
        QuerySchema schema = QuerySchema.create().addSelect("id as productId,url").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(new Object[]{productIds})}));
        albums = MetaDaoHelper.query((String)"pc.product.Product", (QuerySchema)schema);
        return albums;
    }

    @Override
    @Deprecated
    public List<Map> getProductParamByProductId(BillDataDto bill) throws Exception {
        log.error("com.yonyoucloud.upc.service.UPCBillService.getProductParamByProductId\u5b58\u5728\u8c03\u7528");
        String productId = bill.getData().toString();
        List params = null;
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq((Object)productId), QueryCondition.name((String)"param.name").is_not_null(), QueryCondition.name((String)"isCreator").eq((Object)true)});
        QuerySchema schema = QuerySchema.create().addSelect("id,pubts,productId,param as paramId,param.group as groupName,param.name as paramName,paramValue").addCondition((ConditionExpression)queryConditionGroup).addOrderBy("param.group");
        params = MetaDaoHelper.query((String)"pc.product.ProductParameters", (QuerySchema)schema);
        return params;
    }

    @Override
    @Deprecated
    public List<Map> getProductSKUByProductSKUIds(BillDataDto bill) throws Exception {
        log.error("com.yonyoucloud.upc.service.UPCBillService.getProductSKUByProductSKUIds\u5b58\u5728\u8c03\u7528");
        List ids = (List)bill.getData();
        List details = null;
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in((Collection)ids)});
        QuerySchema schema = QuerySchema.create().addSelect("*,productId.code as productCode,productId.deliveryDays ").addCondition((ConditionExpression)queryConditionGroup);
        details = MetaDaoHelper.query((String)"pc.product.ProductSKU", (QuerySchema)schema);
        return details;
    }

    @Override
    @Deprecated
    public List<Map> getProductUOrderUpCountByProductIDs(BillDataDto bill) throws Exception {
        log.error("com.yonyoucloud.upc.service.UPCBillService.getProductUOrderUpCountByProductIDs\u5b58\u5728\u8c03\u7528");
        List productIds = (List)bill.getData();
        ArrayList<Map> results = null;
        QueryConditionGroup queryConditionGroup = null;
        if (null == productIds || productIds.size() == 0) {
            return null;
        }
        if (productIds.size() == 1 && Long.parseLong(productIds.get(0).toString()) == -1L) {
            queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"iUOrderStatus").eq((Object)1)});
        } else {
            if (productIds.size() == 1 && Long.parseLong(productIds.get(0).toString()) == -2L) {
                return null;
            }
            queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in((Collection)productIds), QueryCondition.name((String)"iUOrderStatus").eq((Object)1)});
        }
        QuerySchema schema = QuerySchema.create().addSelect("count(1) as productUpCount,sum(uorderupcount) as skuUpCount").addCondition((ConditionExpression)queryConditionGroup);
        results = MetaDaoHelper.query((String)"pc.product.Product", (QuerySchema)schema);
        if (null == results) {
            results = new ArrayList<Map>();
        }
        if (results.size() == 0) {
            results.add(new HashMap());
        }
        if (!((Map)results.get(0)).containsKey("productUpCount")) {
            ((Map)results.get(0)).put("productUpCount", 0);
        }
        if (!((Map)results.get(0)).containsKey("skuUpCount")) {
            ((Map)results.get(0)).put("skuUpCount", 0);
        }
        return results;
    }

    @Override
    @Deprecated
    public List<Map> getProductDescriptionByProductId(BillDataDto bill) throws Exception {
        log.error("com.yonyoucloud.upc.service.UPCBillService.getProductDescriptionByProductId\u5b58\u5728\u8c03\u7528");
        Long productId = (Long)bill.getData();
        List params = null;
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)productId)});
        QuerySchema schema = QuerySchema.create().addSelect("id,titleMemo,description,mobileDescription").addCondition((ConditionExpression)queryConditionGroup);
        params = MetaDaoHelper.query((String)"pc.product.ProductDescription", (QuerySchema)schema);
        return params;
    }

    @Override
    @Deprecated
    public List<Map> getProductSKUByProductId(BillDataDto bill) throws Exception {
        log.error("com.yonyoucloud.upc.service.UPCBillService.getProductSKUByProductId\u5b58\u5728\u8c03\u7528");
        Long id = (Long)bill.getData();
        List details = null;
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq((Object)id)});
        QuerySchema schema = QuerySchema.create().addSelect("* ").addCondition((ConditionExpression)queryConditionGroup);
        details = MetaDaoHelper.query((String)"pc.product.ProductSKU", (QuerySchema)schema);
        return details;
    }

    @Override
    @Deprecated
    public List<Map> getProductSpecs(BillDataDto bill) throws Exception {
        log.error("com.yonyoucloud.upc.service.UPCBillService.getProductSpecs\u5b58\u5728\u8c03\u7528");
        LinkedHashMap params = (LinkedHashMap)bill.getData();
        Long productId = (Long)params.get("productid");
        String uOrderStatus = params.get("iUStatus").toString();
        HashMap<String, Object> param = new HashMap<String, Object>();
        param.put("tenant_id", AppContext.getCurrentUser().getTenant());
        param.put("ytenant_id", AppContext.getYTenantId());
        param.put("productId", productId);
        if (!uOrderStatus.isEmpty()) {
            param.put("iUStatus", uOrderStatus);
        }
        List specs = SqlHelper.selectList((String)"com.yonyoucloud.upc.productAPI.dao.productdata.QueryProductSpecs", param);
        ArrayList<Map> results = new ArrayList<Map>();
        for (int i = 0; i < specs.size(); ++i) {
            Long specid = (Long)((Map)specs.get(i)).get("specId");
            if (results.stream().filter(spec -> ((Long)spec.get("specId")).equals(specid)).count() != 0L) continue;
            HashMap mapSpec = new HashMap();
            mapSpec.put("specId", ((Map)specs.get(i)).get("specId"));
            mapSpec.put("specName", ((Map)specs.get(i)).get("specName"));
            mapSpec.put("iSpecOrder", ((Map)specs.get(i)).get("iSpecOrder"));
            mapSpec.put("specErpCode", ((Map)specs.get(i)).get("specErpCode"));
            mapSpec.put("specMemo", ((Map)specs.get(i)).get("specMemo"));
            results.add(mapSpec);
        }
        Map mapSpec = null;
        for (int i = 0; i < results.size(); ++i) {
            ArrayList mapSpecItems = new ArrayList();
            mapSpec = (Map)results.get(i);
            for (int j = 0; j < specs.size(); ++j) {
                if (!((Map)results.get(i)).get("specId").equals(((Map)specs.get(j)).get("specId"))) continue;
                Long specItemId = (Long)((Map)specs.get(j)).get("specItemId");
                if (mapSpecItems.stream().filter(specItem -> ((Long)specItem.get("specItemId")).equals(specItemId)).count() != 0L) continue;
                HashMap mapSpecItem = new HashMap();
                mapSpecItem.put("specItemId", ((Map)specs.get(j)).get("specItemId"));
                mapSpecItem.put("specItemName", ((Map)specs.get(j)).get("specItemName"));
                mapSpecItem.put("specItemErpCode", ((Map)specs.get(j)).get("specItemErpCode"));
                mapSpecItem.put("specItemOrder", ((Map)specs.get(j)).get("specItemOrder"));
                mapSpecItems.add(mapSpecItem);
            }
            mapSpec.put("specitems", mapSpecItems);
        }
        return results;
    }

    @Override
    @Deprecated
    public List<Map> getProductSKUsBySKUQuery(BillDataDto bill) throws Exception {
        String specItemIdGroup;
        log.error("com.yonyoucloud.upc.service.UPCBillService.getProductSKUsBySKUQuery\u5b58\u5728\u8c03\u7528");
        LinkedHashMap params = (LinkedHashMap)bill.getData();
        HashMap<String, Object> queryParam = new HashMap<String, Object>();
        queryParam.put("tenant_id", AppContext.getCurrentUser().getTenant());
        queryParam.put("ytenant_id", AppContext.getYTenantId());
        queryParam.put("productId", params.get("productId"));
        queryParam.put("iUStatus", params.get("iUStatus"));
        if (!org.springframework.util.StringUtils.isEmpty((Object)((String)params.get("code")))) {
            queryParam.put("code", params.get("code").toString());
        }
        if (!org.springframework.util.StringUtils.isEmpty((Object)((String)params.get("erpCode")))) {
            queryParam.put("erpCode", params.get("erpCode").toString());
        }
        if (!org.springframework.util.StringUtils.isEmpty((Object)((String)params.get("barCode")))) {
            queryParam.put("cBarCode", params.get("barCode").toString());
        }
        if (params.get("skuIds") != null) {
            queryParam.put("skuIds", params.get("skuIds"));
        }
        if (!org.springframework.util.StringUtils.isEmpty((Object)(specItemIdGroup = (String)params.get("speciItemIds")))) {
            String[] specItemIdGroupArray = specItemIdGroup.split("\\|");
            ArrayList specItemIdsGroupList = new ArrayList();
            for (int i = 0; i < specItemIdGroupArray.length; ++i) {
                String[] specItemIds = specItemIdGroupArray[i].split(",");
                ArrayList<Long> specItemIdsList = new ArrayList<Long>();
                for (int j = 0; j < specItemIds.length; ++j) {
                    specItemIdsList.add(Long.parseLong(specItemIds[j]));
                }
                specItemIdsGroupList.add(specItemIdsList);
            }
            queryParam.put("specItemsList", specItemIdsGroupList);
        }
        List skus = SqlHelper.selectList((String)"com.yonyoucloud.upc.productAPI.dao.productdata.QueryProductSKUsBySKUQuery", queryParam);
        return skus;
    }

    @Override
    public ResultList changeEnabled(String action, BillDataDto bill) throws Exception {
        BillContext billContext = BillContextUtils.getBillContext((String)bill.getBillnum());
        Entity entity = BizContext.getMetaRepository().entity(billContext.getFullname());
        String tableName = entity.getMainTableName();
        Object datas = bill.getData();
        ArrayList<Map> list = null;
        if (datas instanceof String) {
            String data = bill.getData().toString();
            list = (List)JSON.parseObject((String)data, List.class);
        } else if (datas instanceof List) {
            list = (ArrayList<Map>)datas;
        } else if (datas instanceof Map) {
            list = new ArrayList<Map>();
            list.add((Map)datas);
        }
        if (list != null && list.size() != 0) {
            for (Map data : list) {
                if (data.get("id") == null) continue;
                BizObject bizObject = new BizObject();
                bizObject.setId((Object)Long.parseLong(data.get("id").toString()));
                bizObject.set("isEnabled", data.get("isEnabled"));
                bizObject.setEntityStatus(EntityStatus.Update);
                MetaDaoHelper.update((String)entity.fullname(), (BizObject)bizObject);
                try {
                    EventType eventType = EventType.find(bill.getBillnum(), bill.getAction(), null);
                    if (eventType != null) {
                        String eventTypeCode = eventType.toString();
                        this.eventService2.sendEvent("YXYBASEDOC", eventTypeCode, (HashMap<String, Object>)bizObject);
                        continue;
                    }
                    log.error(bill.getBillnum() + "\u83b7\u53d6\u4e8b\u4ef6\u7c7b\u578b\u4e3a\u7a7a\uff0c\u52a8\u4f5c\u7c7b\u578b\u4e3a\uff1a" + bill.getAction());
                }
                catch (Exception e) {
                    log.error("\u53d1\u9001\u4e8b\u4ef6\u5931\u8d25" + bill.getBillnum() + e.getMessage(), (Throwable)e);
                }
            }
        }
        return null;
    }

    @Override
    @Deprecated
    public ExcelExportData productExport(BillDataDto bill, String billNum) throws Exception {
        log.error("com.yonyoucloud.upc.service.UPCBillService.productExport\u5b58\u5728\u8c03\u7528");
        Long start = System.currentTimeMillis();
        bill.setIsIncludeMeta(true);
        RuleExecuteResult result = null;
        Object vm = null;
        if (bill.getData() != null) {
            result = new RuleExecuteResult(bill.getData());
            vm = UIMetaUtils.getViewModel((String)bill.getBillnum(), (Map)bill.getPartParam());
        } else {
            result = bill.getId() != null ? new CommonOperator(OperationTypeEnum.DETAIL).execute((BaseDto)bill) : new CommonOperator(OperationTypeEnum.QUERY).execute((BaseDto)bill);
        }
        logger.info("getdata time:" + (System.currentTimeMillis() - start), new Object[0]);
        if (result.getMsgCode() != 1) {
            throw new CoreDocBusinessException(result.getMessage());
        }
        ExcelExportData exportData = null;
        List datas = null;
        List sumDatas = null;
        HashMap data = null;
        if (bill.getData() != null) {
            datas = (ArrayList<HashMap>)JSON.parseObject((String)result.getData().toString(), List.class);
        } else if (bill.getId() != null) {
            data = (HashMap)result.getData();
            vm = data.get("_viewmodel");
        } else {
            Pager pager = (Pager)result.getData();
            vm = "".equals(billNum) ? pager.getViewmodel() : this.billMetaService.getSimpleVM(billNum, null, Boolean.valueOf(true));
            datas = pager.getRecordList();
            sumDatas = pager.getSumRecordList();
        }
        if (vm != null) {
            ViewModel viewModel = vm;
            LinkedHashSet entities = viewModel.getEntities();
            ArrayList<String[]> columnNameList = new ArrayList<String[]>();
            ArrayList<String[]> fieldNameList = new ArrayList<String[]>();
            ArrayList<ExcelField[]> excelFields = new ArrayList<ExcelField[]>();
            LinkedHashMap dataMap = new LinkedHashMap();
            LinkedHashMap<String, List> sumDataMap = new LinkedHashMap<String, List>();
            LinkedHashMap headersMap = new LinkedHashMap();
            if (entities != null && !entities.isEmpty()) {
                assert (entities.size() < CheckLimitConstant.DEFAULT_LIMIT);
                Iterator var16 = entities.iterator();
                while (true) {
                    if (!var16.hasNext()) {
                        exportData = new ExcelExportData(dataMap, (String[])null, columnNameList, fieldNameList);
                        exportData.setFields(excelFields);
                        exportData.setHeadersMap(headersMap);
                        exportData.setSumMap(sumDataMap);
                        break;
                    }
                    com.yonyou.ucf.mdd.common.model.uimeta.ui.Entity entity = (com.yonyou.ucf.mdd.common.model.uimeta.ui.Entity)var16.next();
                    if (!"Bill".equalsIgnoreCase(entity.getType())) continue;
                    List fields = entity.getFields();
                    if (Objects.nonNull(fields)) assert (fields.size() < CheckLimitConstant.DEFAULT_LIMIT);
                    if (fields == null) continue;
                    String primaryKey = entity.getPrimaryKey();
                    String foriegnKey = entity.getForeignKey();
                    ArrayList<String> cloumnNames = new ArrayList<String>();
                    ArrayList<ExcelField> fieldsArray = new ArrayList<ExcelField>();
                    ArrayList<String> fieldNames = new ArrayList<String>();
                    ArrayList<Map<String, Object>> headerMap = new ArrayList<Map<String, Object>>();
                    assert (Objects.nonNull(fields) && fields.size() < CheckLimitConstant.FIELD_LIMIT);
                    for (Field field : fields) {
                        String fieldName = field.getFieldName();
                        if (field.getHidden().booleanValue() && !fieldName.equals(primaryKey) && !fieldName.equals(foriegnKey)) continue;
                        cloumnNames.add(field.getCaption());
                        fieldNames.add(field.getItemName());
                        ExcelField excelField = new ExcelField();
                        excelField.setFieldName(field.getItemName());
                        excelField.setEnumString(field.getEnumString());
                        excelField.setIsEnum(field.getEnum());
                        excelField.setIsNull(field.getIsNull());
                        if ("InputNumber".equalsIgnoreCase(field.getControlType())) {
                            excelField.setCellType(CellType.NUMERIC);
                        } else {
                            excelField.setCellType(CellType.STRING);
                        }
                        fieldsArray.add(excelField);
                        headerMap.add(UPCBillService.transFieldToMap(field));
                    }
                    String name = null;
                    name = null != entity.getDataSourceName() ? entity.getDataSourceName().substring(entity.getDataSourceName().lastIndexOf(".") + 1) : entity.getCode();
                    String fullname = name + "(" + entity.getEntityName() + ")";
                    headersMap.put(fullname, headerMap);
                    columnNameList.add(cloumnNames.toArray(new String[columnNameList.size()]));
                    fieldNameList.add(fieldNames.toArray(new String[fieldNames.size()]));
                    excelFields.add(fieldsArray.toArray(new ExcelField[fieldsArray.size()]));
                    if (bill.getData() == null) {
                        if (bill.getId() != null) {
                            if (entity.getIsMain().booleanValue()) {
                                datas = new ArrayList<HashMap>(1);
                                datas.add(data);
                            } else {
                                datas = (List)data.get(entity.getChildrenField());
                            }
                        } else {
                            sumDataMap.put(entity.getCode(), sumDatas);
                        }
                    }
                    Long start1 = System.currentTimeMillis();
                    logger.info("processData time:" + (System.currentTimeMillis() - start1), new Object[0]);
                    dataMap.put(fullname, datas);
                }
            }
        }
        logger.info("exportData time:" + (System.currentTimeMillis() - start), new Object[0]);
        return exportData;
    }

    @Override
    @Deprecated
    public ExcelExportData productTempExport(BillDataDto bill, String billNum) throws Exception {
        log.error("com.yonyoucloud.upc.service.UPCBillService.productTempExport\u5b58\u5728\u8c03\u7528");
        Long start = System.currentTimeMillis();
        bill.setIsIncludeMeta(true);
        RuleExecuteResult result = null;
        ViewModel vm = null;
        result = new CommonOperator(OperationTypeEnum.QUERY).execute((BaseDto)bill);
        if (result.getMsgCode() != 1) {
            throw new CoreDocBusinessException(result.getMessage());
        }
        ExcelExportData exportData = null;
        Object datas = null;
        Object sumDatas = null;
        Object data = null;
        vm = this.billMetaService.getSimpleVM(billNum, null, Boolean.valueOf(true));
        if (vm != null) {
            ViewModel viewModel = vm;
            LinkedHashSet entities = viewModel.getEntities();
            ArrayList<String[]> columnNameList = new ArrayList<String[]>();
            ArrayList<String[]> fieldNameList = new ArrayList<String[]>();
            ArrayList<ExcelField[]> excelFields = new ArrayList<ExcelField[]>();
            LinkedHashMap<String, List<Map>> dataMap = new LinkedHashMap<String, List<Map>>();
            LinkedHashMap<String, Object> sumDataMap = new LinkedHashMap<String, Object>();
            LinkedHashMap headersMap = new LinkedHashMap();
            String[] productTempField = new String[]{"productId", "id", "code", "name", "productApplyRangeId", "productSKUDetail.id", "productSKUDetail.batchPrice", "productSKUDetail.markPrice", "productSKUDetail.salePrice", "productSKUDetail.fMarketPrice", "productSKUDetail.fPrimeCosts", "productSKUDetail.inventoryCount", "productSKUDetail.inventoryCount", "detail.id", "detail.batchPrice", "detail.fMarkPrice", "detail.fLowestMarkPrice", "detail.fSalePrice", "detail.fMarketPrice", "detail.fPrimeCosts", "detail.iMinOrderQuantity"};
            if (entities != null && !entities.isEmpty()) {
                assert (entities.size() < CheckLimitConstant.DEFAULT_LIMIT);
                Iterator var16 = entities.iterator();
                block10: while (true) {
                    if (!var16.hasNext()) {
                        exportData = new ExcelExportData(dataMap, (String[])null, columnNameList, fieldNameList);
                        exportData.setFields(excelFields);
                        exportData.setHeadersMap(headersMap);
                        exportData.setSumMap(sumDataMap);
                        break;
                    }
                    com.yonyou.ucf.mdd.common.model.uimeta.ui.Entity entity = (com.yonyou.ucf.mdd.common.model.uimeta.ui.Entity)var16.next();
                    if (!"Bill".equalsIgnoreCase(entity.getType())) continue;
                    List fields = entity.getFields();
                    if (Objects.nonNull(fields)) assert (fields.size() < CheckLimitConstant.DEFAULT_LIMIT);
                    if (fields == null) continue;
                    String name = null;
                    name = null != entity.getDataSourceName() ? entity.getDataSourceName().substring(entity.getDataSourceName().lastIndexOf(".") + 1) : entity.getCode();
                    if (!"ProductSKU".equals(name) && !"Product".equals(name) && !"ProductApplyRange".equals(name)) continue;
                    String fullname = name + "(" + entity.getEntityName() + ")";
                    ArrayList<String> cloumnNames = new ArrayList<String>();
                    ArrayList<ExcelField> fieldsArray = new ArrayList<ExcelField>();
                    ArrayList<String> fieldNames = new ArrayList<String>();
                    ArrayList<Map<String, Object>> headerMap = new ArrayList<Map<String, Object>>();
                    assert (Objects.nonNull(fields) && fields.size() < CheckLimitConstant.DEFAULT_LIMIT);
                    for (Field field : fields) {
                        String fieldName = field.getFieldName();
                        String itemName = field.getItemName();
                        if (!Arrays.asList(productTempField).contains(fieldName) && !Arrays.asList(productTempField).contains(itemName)) continue;
                        cloumnNames.add(field.getCaption());
                        fieldNames.add(itemName);
                        ExcelField excelField = new ExcelField();
                        excelField.setFieldName(itemName);
                        excelField.setEnumString(field.getEnumString());
                        excelField.setIsEnum(field.getEnum());
                        excelField.setIsNull(field.getIsNull());
                        if ("InputNumber".equalsIgnoreCase(field.getControlType())) {
                            excelField.setCellType(CellType.NUMERIC);
                        } else {
                            excelField.setCellType(CellType.STRING);
                        }
                        fieldsArray.add(excelField);
                        headerMap.add(UPCBillService.transFieldToMap(field));
                    }
                    headersMap.put(fullname, headerMap);
                    columnNameList.add(cloumnNames.toArray(new String[columnNameList.size()]));
                    fieldNameList.add(fieldNames.toArray(new String[fieldNames.size()]));
                    excelFields.add(fieldsArray.toArray(new ExcelField[fieldsArray.size()]));
                    if (bill.getData() == null) {
                        sumDataMap.put(entity.getCode(), sumDatas);
                    }
                    Long start1 = System.currentTimeMillis();
                    logger.info("processData time:" + (System.currentTimeMillis() - start1), new Object[0]);
                    List<Map> products = null;
                    List<Map> productIds = null;
                    switch (name) {
                        case "Product": {
                            products = this.getProductsByIDs(bill);
                            dataMap.put(fullname, products);
                            continue block10;
                        }
                        case "ProductSKU": {
                            productIds = this.getProductSKUByProductIds(bill);
                            dataMap.put(fullname, productIds);
                            continue block10;
                        }
                        case "ProductApplyRange": {
                            productIds = this.getProductsRangeByIDs(bill);
                            dataMap.put(fullname, productIds);
                            continue block10;
                        }
                    }
                    dataMap.put(fullname, (List<Map>)datas);
                }
            }
        }
        logger.info("exportData time:" + (System.currentTimeMillis() - start), new Object[0]);
        return exportData;
    }

    public List<Map> getProductsByIDs(BillDataDto bill) throws Exception {
        List<String> productIds = Arrays.asList(bill.getIds().split(","));
        List products = null;
        QuerySchema schema = QuerySchema.create().addSelect("id ,code,name ").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(productIds)}));
        products = MetaDaoHelper.query((String)"pc.product.Product", (QuerySchema)schema);
        return products;
    }

    public List<Map> getProductSKUByProductIds(BillDataDto bill) throws Exception {
        String productRangeids = (String)bill.getExternalData();
        List<String> productApplyRangeids = Arrays.asList(productRangeids.split(","));
        List details = null;
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productApplyRangeId").in(productApplyRangeids)});
        QuerySchema schema = QuerySchema.create().addSelect("productId,skuId as id,skuId.name as name,skuId.code as code,id as productSKUDetail!id,batchPrice as productSKUDetail!batchPrice,markPrice as productSKUDetail!markPrice,salePrice as productSKUDetail!salePrice,fMarketPrice as productSKUDetail!fMarketPrice, fPrimeCosts as  productSKUDetail!fPrimeCosts,inventoryCount as productSKUDetail!inventoryCount ").addCondition((ConditionExpression)queryConditionGroup);
        details = MetaDaoHelper.query((String)"pc.product.ProductSkuDetailNew", (QuerySchema)schema);
        return details;
    }

    public List<Map> getProductsRangeByIDs(BillDataDto bill) throws Exception {
        String productRangeids = (String)bill.getExternalData();
        List<String> productApplyRangeids = Arrays.asList(productRangeids.split(","));
        List products = null;
        QuerySchema schema = QuerySchema.create().addSelect("id.productId as productId ,id,id as detail!id,batchPrice as detail!batchPrice, fMarkPrice as detail!fMarkPrice ,fLowestMarkPrice as detail!fLowestMarkPrice, fSalePrice as detail!fSalePrice, fMarketPrice as detail!fMarketPrice,fPrimeCosts as detail!fPrimeCosts,isDisplayPrice as detail!isDisplayPrice,iMinOrderQuantity as detail!iMinOrderQuantity ").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productApplyRangeId").in(productApplyRangeids)}));
        products = MetaDaoHelper.query((String)"pc.product.ProductDetail", (QuerySchema)schema);
        return products;
    }

    private static Map<String, Object> transFieldToMap(Object field) throws Exception {
        PropertyDescriptor[] propertyDescriptors;
        HashMap<String, Object> map = new HashMap<String, Object>();
        BeanWrapperImpl beanWrapper = new BeanWrapperImpl(field);
        for (PropertyDescriptor pd : propertyDescriptors = beanWrapper.getPropertyDescriptors()) {
            if ("class".equals(pd.getName())) continue;
            Object value = beanWrapper.getPropertyValue(pd.getName());
            map.put(pd.getName(), value);
        }
        Object obj = map.get("parent1");
        if (obj != null && obj instanceof Field) {
            map.put("parent", UPCBillService.transFieldToMap(obj));
        }
        return map;
    }

    @Override
    @Deprecated
    public List<Map> getClassByParentID(BillDataDto bill) throws Exception {
        log.error("com.yonyoucloud.upc.service.UPCBillService.getClassByParentID\u5b58\u5728\u8c03\u7528");
        List data = null;
        String id = bill.getId();
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"parent").eq((Object)id)});
        QuerySchema schema = QuerySchema.create().addSelect("*").addCondition((ConditionExpression)queryConditionGroup);
        data = MetaDaoHelper.query((String)"pc.cls.PresentationClass", (QuerySchema)schema);
        return data;
    }

    @Override
    @Deprecated
    public List<Map> getSkus(BillDataDto bill) throws Exception {
        log.error("com.yonyoucloud.upc.service.UPCBillService.getSkus\u5b58\u5728\u8c03\u7528");
        Map status = (Map)bill.getData();
        List data = null;
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"status").eq(status.get("status"))});
        QuerySchema schema = QuerySchema.create().addSelect("id,pubts ").addCondition((ConditionExpression)queryConditionGroup);
        data = MetaDaoHelper.query((String)"pc.product.ProductSKU", (QuerySchema)schema);
        return data;
    }

    @Override
    @Deprecated
    public String updateSKUInventoryCount(BillDataDto bill) throws Exception {
        LinkedHashMap params = (LinkedHashMap)bill.getData();
        HashMap<String, Object> queryParam = new HashMap<String, Object>();
        queryParam.put("tenant", AppContext.getCurrentUser().getTenant());
        queryParam.put("erpCode", params.get("erpCode").toString());
        queryParam.put("inventoryCount", params.get("inventoryCount").toString());
        queryParam.put("ytenant", AppContext.getYTenantId());
        int skus = 0;
        skus = SqlHelper.update((String)"com.yonyoucloud.upc.product.dao.ProductUpdate.updateProductSKUDetailInventoryCount", queryParam);
        return InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080085", (String)"\u6210\u529f\u66f4\u65b0") + skus + InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080086", (String)"\u6761\u3002");
    }

    @Override
    public List<Map<String, Object>> updateSKUInventoryCountBatchByShopId(BillDataDto bill) throws Exception {
        List params = (List)bill.getData();
        String lockValue = UUID.randomUUID().toString();
        for (Map paramsitem : params) {
            String lockKey = "updateSKUInventoryCountKey" + AppContext.getCurrentUser().getTenant() + paramsitem.get("id").toString();
            if (RedisTool.tryGetLock((String)lockKey, (String)lockValue, (int)60)) {
                HashMap<String, Object> queryParam = new HashMap<String, Object>();
                queryParam.put("tenant", AppContext.getCurrentUser().getTenant());
                queryParam.put("ytenant", AppContext.getYTenantId());
                queryParam.put("skuid", paramsitem.get("skuid").toString());
                queryParam.put("inventoryCount", paramsitem.get("inventoryCount").toString());
                queryParam.put("shopid", paramsitem.get("shopid") == null ? "" : paramsitem.get("shopid").toString());
                BigDecimal inventoryCount = (BigDecimal)SqlHelper.selectFirst((String)"com.yonyoucloud.upc.product.dao.ProductUpdate.selectInventoryCount", queryParam);
                BigDecimal inventoryCheckCount = (inventoryCount == null ? BigDecimal.ZERO : inventoryCount).add(new BigDecimal(paramsitem.get("inventoryCount").toString()));
                if (inventoryCheckCount.compareTo(BigDecimal.ZERO) < 0) {
                    paramsitem.put("updated", false);
                    paramsitem.put("message", String.format("skuId%s%s%s%s", paramsitem.get("skuid"), InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408008C", (String)"\u5f53\u524d\u5e93\u5b58\u91cf\u4e3a"), inventoryCount, InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408008D", (String)",\u6263\u51cf\u540e\u5c06\u53d8\u4e3a\u8d1f\u503c\uff0c\u8bf7\u68c0\u67e5\u5165\u53c2\uff01")));
                    RedisTool.releaseLock((String)lockKey, (String)lockValue);
                    continue;
                }
                int skus = 0;
                boolean isPremises = this.dataSourceService.getDataSourceIsOscar();
                if (paramsitem.get("shopid") != null && !"".equals(paramsitem.get("shopid").toString())) {
                    skus = isPremises ? this.productUpdateOtherDbService.updateProductSkuInventoryCountByShopIdOtherDb(queryParam) : SqlHelper.update((String)"com.yonyoucloud.upc.product.dao.ProductUpdate.updateProductSKUInventoryCountByShopIdForSkuDetailNew", queryParam);
                    if (skus == 0) {
                        skus = isPremises ? this.productUpdateOtherDbService.updateProductSkuInventoryCountByNoShopIdOtherDb(queryParam) : SqlHelper.update((String)"com.yonyoucloud.upc.product.dao.ProductUpdate.updateProductSKUInventoryCountByNoShopIdForSkuDetailNew", queryParam);
                    }
                } else {
                    skus = isPremises ? this.productUpdateOtherDbService.updateProductSkuInventoryCountByNoShopIdOtherDb(queryParam) : SqlHelper.update((String)"com.yonyoucloud.upc.product.dao.ProductUpdate.updateProductSKUInventoryCountByNoShopIdForSkuDetailNew", queryParam);
                }
                RedisTool.releaseLock((String)lockKey, (String)lockValue);
                paramsitem.put("message", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080085", (String)"\u6210\u529f\u66f4\u65b0") + skus + InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080097", (String)"\u6761"));
                paramsitem.put("updated", true);
                BizCache.instance().delete("pc.product.Product", (Object)paramsitem.get("id").toString());
                BizCache.instance().delete("pc.product.ProductSKU", (Object)paramsitem.get("skuid").toString());
                continue;
            }
            paramsitem.put("updated", false);
            paramsitem.put("message", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080099", (String)"\u5b58\u5728\u5e76\u53d1\u64cd\u4f5c"));
        }
        return params;
    }

    @Override
    public String updateProductSKUPrice(BillDataDto bill) throws Exception {
        LinkedHashMap params = (LinkedHashMap)bill.getData();
        HashMap<String, Object> queryParam = new HashMap<String, Object>();
        queryParam.put("tenant", AppContext.getCurrentUser().getTenant());
        queryParam.put("ytenant", AppContext.getYTenantId());
        queryParam.put("erpCode", params.get("erpCode"));
        queryParam.put("batchPrice", params.get("batchPrice"));
        queryParam.put("markPrice", params.get("markPrice"));
        queryParam.put("salePrice", params.get("salePrice"));
        queryParam.put("fMarketPrice", params.get("fMarketPrice"));
        queryParam.put("fPrimeCosts", params.get("fPrimeCosts"));
        int skus = 0;
        skus = SqlHelper.update((String)"com.yonyoucloud.upc.product.dao.ProductUpdate.updateProductSKUDetailPrice", queryParam);
        return InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080085", (String)"\u6210\u529f\u66f4\u65b0") + skus + InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080086", (String)"\u6761\u3002");
    }

    @Override
    public ResultList productupdown(BillDataDto bill) throws Exception {
        if ("productsup".equalsIgnoreCase(bill.getAction()) || "productsdown".equalsIgnoreCase(bill.getAction())) {
            if ("productsup".equalsIgnoreCase(bill.getAction())) {
                bill.setAction("shelve");
            } else {
                bill.setAction("unshelve");
            }
            if (!bill.getData().equals(null)) {
                ArrayList codes = (ArrayList)((LinkedHashMap)bill.getData()).get("code");
                String bizType = ((LinkedHashMap)bill.getData()).get("biz").toString();
                List<Object> productids = null;
                StringBuilder sids = new StringBuilder();
                if (codes == null) {
                    productids = (ArrayList)((LinkedHashMap)bill.getData()).get("id");
                } else if (codes.size() > 0) {
                    QuerySchema schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").in((Collection)codes)}));
                    productids = MetaDaoHelper.query((String)"pc.product.Product", (QuerySchema)schema);
                    productids = productids.stream().map(map -> ((Map)map).get("id")).collect(Collectors.toList());
                }
                if (productids == null || productids.size() == 0) {
                    ResultList result = new ResultList();
                    if (codes != null) {
                        result.setCount(codes.size());
                        result.setFailCount(codes.size());
                        ArrayList<String> messages = new ArrayList<String>();
                        for (Object code : codes) {
                            messages.add(String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040800AB", (String)"\u672a\u627e\u5230\u7f16\u7801\u4e3a%s\u7684\u5546\u54c1\u3002"), code));
                        }
                        result.setMessages(messages);
                    } else {
                        result.setCount(0);
                        result.setFailCount(0);
                    }
                    result.setSucessCount(0);
                    return result;
                }
                ArrayList products = new ArrayList();
                for (Object item : productids) {
                    String id = item.toString();
                    Map<String, Object> arrageid = this.upcProductQueryService.SetParams(Long.valueOf(id), null, null, null, null);
                    HashMap<String, Object> product = new HashMap<String, Object>();
                    product.put("id", id);
                    product.put("biz", bizType);
                    product.put("isCreator", arrageid.get("isCreator"));
                    product.put("productApplyRangeId", arrageid.get("@productApplyRangeId"));
                    products.add(product);
                }
                bill.setData((Object)JSON.toJSONString(products));
            }
        }
        ResultList resultList = this.batchDo(bill);
        return resultList;
    }

    @Override
    public ResultList changeStopStatus(String action, BillDataDto bill) throws Exception {
        ArrayList<Map> datas = new ArrayList<Map>();
        Object data = bill.getData();
        if (data != null && data instanceof List) {
            List list = (List)data;
            for (Map obj : list) {
                if ("stop".equals(action)) {
                    obj.put("stopstatus", true);
                    obj.put("stoptime", new Date());
                    obj.put("isEnabled", false);
                }
                if ("unstop".equals(action)) {
                    obj.put("stopstatus", false);
                    obj.put("stoptime", null);
                    obj.put("isEnabled", true);
                }
                obj.put("datasource", "ncc");
                datas.add(obj);
            }
        }
        bill.setAction(action);
        bill.setData(datas);
        ResultList resultList = this.batchDoByErpcode(bill);
        return resultList;
    }

    @Override
    public String mqSave(Map param) throws Exception {
        Object billnum;
        Object data;
        BillDataDto bill = new BillDataDto();
        Object key = param.get("key");
        if (key != null) {
            bill.setKey(key.toString());
        }
        if ((data = param.get("data")) != null) {
            bill.setData(data);
        }
        if ((billnum = param.get("billnum")) != null) {
            bill.setBillnum(billnum.toString());
        }
        int size = 0;
        if (data instanceof Map) {
            size = 1;
        } else if (data instanceof List) {
            size = ((List)data).size();
        }
        Object tenantId = param.get("tenantId");
        if (tenantId == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800863);
        }
        String yhtTenantId = tenantId.toString();
        AsyncTask asyncTask = new AsyncTask(bill, "mQSaveProductNewArchTaskService", param, yhtTenantId);
        Gson gson = new GsonBuilder().create();
        if (gson.toJson((Object)asyncTask).getBytes(StandardCharsets.UTF_8).length > 0x100000) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800894);
        }
        if (!this.ymsParamConfig.useKafka()) {
            this.mQSaveProductNewArchTaskService.dealWithAck(asyncTask);
            return null;
        }
        return (String)RobotExecutors.runAs((String)yhtTenantId, () -> this.taskRegister.registerProductNewArchTask(asyncTask));
    }

    public void checkDubblePoint(Object iDoubleSale, int scaleP, String showCaption) throws Exception {
        if (null == iDoubleSale) {
            return;
        }
        BigDecimal decimal = new BigDecimal(iDoubleSale.toString()).stripTrailingZeros();
        int scale = decimal.scale();
        if (scale > scaleP) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800895, new Object[]{scaleP});
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public BillDataDto dealBillDataForApi(BillDataDto bill, String action) throws Exception {
        List productApplyRange;
        QuerySchema schema;
        Object errorMessage;
        int dealNumOneTime = 100;
        List<Object> billList = new ArrayList();
        billList = "aa_custcategory".equals(bill.getBillnum()) || "aa_salearealist".equals(bill.getBillnum()) ? this.getBillData(bill) : this.apiDataService.converBillData(bill);
        if ("save".equals(action)) {
            Map name;
            List userDefineClass;
            QueryConditionGroup queryConditionGroup;
            List<String> typeList;
            if ("aa_merchant".equals(bill.getBillnum()) && bill.getConvertType() != null && "2".equals(bill.getConvertType().toString())) {
                errorMessage = "";
                this.merchantOldOpenApiService.dealMerchantBillDataForApi(billList);
                if (!"".equals(errorMessage)) {
                    throw new CoreDocBusinessException(null, errorMessage);
                }
                bill.setData(billList);
            } else if ("pc_product".equals(bill.getBillnum())) {
                this.productApiDataService.checkProductDatasApi(billList, null, null);
            } else if ("pc_productdetail".equals(bill.getBillnum())) {
                for (Object billOne : billList) {
                    QueryConditionGroup queryConditionGroup4 = new QueryConditionGroup();
                    if (billOne.get("id") != null) {
                        queryConditionGroup4.addCondition((ConditionExpression)QueryCondition.name((String)"productId").eq(billOne.get("id")));
                    } else if (billOne.get("code") != null) {
                        queryConditionGroup4.addCondition((ConditionExpression)QueryCondition.name((String)"productId.code").eq(billOne.get("code")));
                    } else {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800587);
                    }
                    if (billOne.get("belogOrg") != null) {
                        queryConditionGroup4.addCondition((ConditionExpression)QueryCondition.name((String)"orgId").eq(billOne.get("belogOrg")));
                    } else if (billOne.get("belogOrg_Code") != null) {
                        queryConditionGroup4.addCondition((ConditionExpression)QueryCondition.name((String)"orgId.code").eq(billOne.get("belogOrg_Code")));
                    } else if (billOne.get("orgId") != null) {
                        queryConditionGroup4.addCondition((ConditionExpression)QueryCondition.name((String)"orgId").eq(billOne.get("orgId")));
                    } else if (billOne.get("orgId_Code") != null) {
                        queryConditionGroup4.addCondition((ConditionExpression)QueryCondition.name((String)"orgId.code").eq(billOne.get("orgId_Code")));
                    } else {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800833);
                    }
                    QuerySchema querySchema = QuerySchema.create().addSelect("id,productId,isApplied,isCreator").addCondition((ConditionExpression)queryConditionGroup4);
                    List productapplys = MetaDaoHelper.query((String)"pc.product.ProductApplyRange", (QuerySchema)querySchema);
                    if (CollectionUtils.isEmpty((Collection)productapplys)) {
                        String string = InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080074", (String)"\u5f53\u524d\u7ec4\u7ec7\u4e0b\u6ca1\u6709\u7ec4\u7ec7\u7ea7\u6570\u636e\uff0c\u8bf7\u68c0\u67e5\u6570\u636e\u662f\u5426\u6b63\u786e\uff01");
                        throw new CoreDocBusinessException(null, String.format("%s,productId:%s,OrgId:%s", string, billOne.get("id"), billOne.get("belogOrg")));
                    }
                    if (!billOne.containsKey("detail") || billOne.get("detail") == null) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800834);
                    }
                    Map map2 = (Map)billOne.get("detail");
                    this.productApiDataService.removeDetailDataForDetailSave(map2);
                    billOne.put("productApplyRangeId", ((Map)productapplys.get(0)).get("id").toString());
                    billOne.put("isCreator", ((Map)productapplys.get(0)).get("isCreator"));
                    billOne.put("isApplied", ((Map)productapplys.get(0)).get("isApplied"));
                    BillDataDto billtemp = new BillDataDto("pc_productdetail", ((Map)productapplys.get(0)).get("productId").toString());
                    HashMap<String, Comparable<Long>> params = new HashMap<String, Comparable<Long>>();
                    params.put("@productApplyRangeId", Long.valueOf(Long.parseLong(((Map)productapplys.get(0)).get("id").toString())));
                    params.put("isCreator", Boolean.valueOf(Boolean.parseBoolean(((Map)productapplys.get(0)).get("isCreator").toString())));
                    params.put("isApplied", Boolean.valueOf(Boolean.parseBoolean(((Map)productapplys.get(0)).get("isApplied").toString())));
                    billtemp.setMapCondition(params);
                    Map map22 = this.detail(billtemp);
                    if (map22.get("productBarCodes") != null) {
                        List productBarCodes = (List)map22.get("productBarCodes");
                        for (Map productBarCode : productBarCodes) {
                            if (!productBarCode.containsKey("pubts")) continue;
                            productBarCode.remove("pubts");
                        }
                    }
                    assert (Objects.nonNull(map22) && map22.size() < 10000);
                    for (String key : map22.keySet()) {
                        if (key.startsWith("detail!")) {
                            String newKey = key.replace("detail!", "");
                            if (map2.keySet().contains(newKey)) continue;
                            map2.put(key.replace("detail!", ""), map22.get(key));
                            continue;
                        }
                        billOne.put(key, map22.get(key));
                    }
                    this.productApiDataService.dealDetailDataForDetailSave(map2);
                    this.productApiDataService.dealChildObjecType((Map<String, Object>)billOne);
                    if (map2.get("productExtendCharacterDef") != null) {
                        if (map2.get("productExtendCharacterDef__id") != null) {
                            ((Map)map2.get("productExtendCharacterDef")).put("id", map2.get("productExtendCharacterDef__id"));
                            ((Map)map2.get("productExtendCharacterDef")).put("_status", "Update");
                        } else {
                            ((Map)map2.get("productExtendCharacterDef")).put("_status", "Insert");
                            ((Map)map2.get("productExtendCharacterDef")).put("id", IdManager.getInstance().nextId());
                        }
                    }
                    billOne.put("detail", map2);
                    billOne.put("_status", "Update");
                }
            } else if ("pc_productpro".equals(bill.getBillnum())) {
                errorMessage = "";
                typeList = Arrays.asList("Date", "DateTime", "Double", "Integer", "ReferArchive", "String", "Time", "CustArchive");
                List<String> coomonList = Arrays.asList("true", "false");
                List<String> list = Arrays.asList("1", "0");
                for (Map map3 : billList) {
                    if (!map3.containsKey("_status") || map3.get("_status") == null) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800896);
                    }
                    this.dealMultilingualism(map3);
                    if ("Update".equals(map3.get("_status").toString())) {
                        if (!map3.containsKey("id") || map3.get("id") == null) {
                            errorMessage = String.format("%s%s", errorMessage, InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080087", (String)"\u5f53\u64cd\u4f5c\u72b6\u6001\u4e3a\u66f4\u65b0\u65f6\uff0c\u7269\u6599\u5c5e\u6027id\u5fc5\u8f93"));
                        } else {
                            QueryConditionGroup queryConditionGroup5 = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(map3.get("id"))});
                            QuerySchema schema5 = QuerySchema.create().addSelect("id,showItem").addCondition((ConditionExpression)queryConditionGroup5);
                            List userDefineClass2 = MetaDaoHelper.query((String)"pc.userdef.UserDefineClass", (QuerySchema)schema5);
                            if (userDefineClass2 == null || userDefineClass2.isEmpty()) {
                                errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080089", (String)"\u672a\u627e\u5230\u7269\u6599\u5c5e\u6027id\uff1a%s\u5bf9\u5e94\u6570\u636e\uff0c\u8bf7\u68c0\u67e5\u4f20\u53c2\u662f\u5426\u6b63\u786e\uff1b"), map3.get("id").toString()));
                            }
                        }
                    }
                    Map name2 = (Map)map3.get("showItem");
                    if (!map3.containsKey("type") || map3.get("type") == null || !typeList.contains(map3.get("type").toString())) {
                        errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080056", (String)"\u5c5e\u6027\u540d\u79f0\u4e3a %s \u7684\u5c5e\u6027\u7c7b\u578btype\u4f20\u503c\u4e0d\u6b63\u786e\uff0c\u8bf7\u6309\u7167\u8bf4\u660e\u7ed9\u51fa\u7684\u6837\u4f8b\u8fdb\u884c\u4f20\u503c"), name2.get("zh_CN")));
                    }
                    if (!map3.containsKey("orderNum") || map3.get("orderNum") == null || !map3.get("orderNum").toString().matches("\\d+")) {
                        errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080059", (String)"\u5c5e\u6027\u540d\u79f0\u4e3a %s \u7684\u6392\u5e8f\u5e8f\u53f7orderNum\u4f20\u503c\u4e0d\u6b63\u786e\uff0c\u8bf7\u6309\u7167\u8bf4\u660e\u7ed9\u51fa\u7684\u6837\u4f8b\u8fdb\u884c\u4f20\u503c"), name2.get("zh_CN")));
                    }
                    if (map3.containsKey("isSerInput") && (map3.get("isSerInput") == null || !coomonList.contains(map3.get("isSerInput").toString()))) {
                        errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408008F", (String)"\u5c5e\u6027\u540d\u79f0\u4e3a %s \u7684\u5ba2\u5546\u6863\u6848\u662f\u5426\u5fc5\u8f93isSerInput\u4f20\u503c\u4e0d\u6b63\u786e\uff0c\u8bf7\u6309\u7167\u8bf4\u660e\u7ed9\u51fa\u7684\u6837\u4f8b\u8fdb\u884c\u4f20\u503c"), name2.get("zh_CN")));
                    }
                    if (!map3.containsKey("isWebShow") || map3.get("isWebShow") == null || !coomonList.contains(map3.get("isWebShow").toString())) {
                        errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080093", (String)"\u5c5e\u6027\u540d\u79f0\u4e3a %s \u7684\u524d\u7aef\u662f\u5426\u663e\u793aisWebShow\u4f20\u503c\u4e0d\u6b63\u786e\uff0c\u8bf7\u6309\u7167\u8bf4\u660e\u7ed9\u51fa\u7684\u6837\u4f8b\u8fdb\u884c\u4f20\u503c"), name2.get("zh_CN")));
                    }
                    if (!map3.containsKey("isEnabled") || map3.get("isEnabled") == null || !list.contains(map3.get("isEnabled").toString())) {
                        errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080095", (String)"\u5c5e\u6027\u540d\u79f0\u4e3a %s \u7684\u662f\u5426\u542f\u7528isEnabled\u4f20\u503c\u4e0d\u6b63\u786e\uff0c\u8bf7\u6309\u7167\u8bf4\u660e\u7ed9\u51fa\u7684\u6837\u4f8b\u8fdb\u884c\u4f20\u503c"), name2.get("zh_CN")));
                    }
                    if (!map3.containsKey("userdefMode") || map3.get("userdefMode") == null || !list.contains(map3.get("userdefMode").toString())) {
                        errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080096", (String)"\u5c5e\u6027\u540d\u79f0\u4e3a %s \u7684\u5f55\u5165\u65b9\u5f0fuserdefMode\u4f20\u503c\u4e0d\u6b63\u786e\uff0c\u8bf7\u6309\u7167\u8bf4\u660e\u7ed9\u51fa\u7684\u6837\u4f8b\u8fdb\u884c\u4f20\u503c"), name2.get("zh_CN")));
                    }
                    if (!(!"String".equals(map3.get("type").toString()) && !"Double".equals(map3.get("type").toString()) && !"Integer".equals(map3.get("type").toString()) || map3.containsKey("maxInputLen") && map3.get("maxInputLen") != null && map3.get("maxInputLen").toString().matches("\\d+"))) {
                        errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408005A", (String)"\u5c5e\u6027\u540d\u79f0\u4e3a %s \u7684\u5f55\u5165\u957f\u5ea6maxInputLen\u4f20\u503c\u4e0d\u6b63\u786e\uff0c\u8bf7\u6309\u7167\u8bf4\u660e\u7ed9\u51fa\u7684\u6837\u4f8b\u8fdb\u884c\u4f20\u503c"), name2.get("zh_CN")));
                    } else {
                        if ("String".equals(map3.get("type").toString()) && Long.valueOf(map3.get("maxInputLen").toString()) > 255L) {
                            errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080044", (String)"\u5c5e\u6027\u540d\u79f0\u4e3a %s \u7684\u5c5e\u6027\u7c7b\u578b\u4e3a\u6587\u672c\u65f6\uff0c\u5f55\u5165\u957f\u5ea6\u6700\u5927\u4e3a255\uff1b"), name2.get("zh_CN")));
                        }
                        if (("Double".equals(map3.get("type").toString()) || "Integer".equals(map3.get("type").toString())) && Long.valueOf(map3.get("maxInputLen").toString()) > 15L) {
                            errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080047", (String)"\u5c5e\u6027\u540d\u79f0\u4e3a %s \u7684\u5c5e\u6027\u7c7b\u578b\u4e3a\u6570\u503c\u6216\u6574\u578b\u65f6\uff0c\u5f55\u5165\u957f\u5ea6\u6700\u5927\u4e3a15\uff1b"), name2.get("zh_CN")));
                        }
                    }
                    if (map3.get("achiveDefineCode") != null) {
                        Condition condition = new Condition();
                        condition.setPageIndex(Integer.valueOf(1));
                        condition.setPageSize(Integer.valueOf(5));
                        ConditionVO conditionVO = new ConditionVO();
                        conditionVO.setOperator("=");
                        conditionVO.setDatatype("string");
                        conditionVO.setField("code");
                        conditionVO.setValue(map3.get("achiveDefineCode").toString());
                        condition.addCondition(conditionVO);
                        Sorter sorter = new Sorter();
                        sorter.addOrder("id", "DESC");
                        BdRestParam bdRestParam = new BdRestParam();
                        bdRestParam.setSysId("diwork");
                        bdRestParam.setTenantId(AppContext.getYhtTenantId().toString());
                        bdRestParam.setUserId(AppContext.getCurrentUser().getId().toString());
                        this.defDocListService.setBdRestParam(bdRestParam);
                        Page pagination = this.defDocListService.pagination(condition, sorter, 1, 5);
                        if (pagination.getContent() == null || pagination.getContent().size() == 0) {
                            errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408009D", (String)"\u7f16\u7801\u4e3a %s \u7684\u81ea\u5b9a\u4e49\u6863\u6848\u4e0d\u5b58\u5728\uff0c\u8bf7\u68c0\u67e5\u4f20\u53c2\uff1b"), map3.get("achiveDefineCode").toString()));
                        } else {
                            map3.put("achiveDefineName", ((DefDocList)pagination.getContent().get(0)).getName());
                        }
                    }
                    if ("CustArchive".equals(map3.get("type").toString())) {
                        map3.put("achiveDomain", "ucfbasedoc");
                    }
                    if ("name".equals(map3.get("achiveReturn"))) {
                        map3.put("achiveReturnCaption", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040800A1", (String)"\u540d\u79f0"));
                        continue;
                    }
                    if (!"code".equals(map3.get("achiveReturn"))) continue;
                    map3.put("achiveReturnCaption", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040800A2", (String)"\u7f16\u7801"));
                }
                if (!"".equals(errorMessage)) {
                    throw new CoreDocBusinessException(null, (String)errorMessage);
                }
            } else if ("pc_unitgroup".equals(bill.getBillnum())) {
                for (Object billOne : billList) {
                    if (billOne.containsKey("stopstatus") && billOne.get("stopstatus") != null) continue;
                    billOne.put("stopstatus", false);
                }
            } else if ("aa_customerType".equals(bill.getBillnum())) {
                for (Object billOne : billList) {
                    QueryConditionGroup queryConditionGroup2;
                    if (!billOne.containsKey("_status") || billOne.get("_status") == null) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800908);
                    }
                    if (!"Update".equals(billOne.get("_status").toString())) continue;
                    if (!billOne.containsKey("id") || billOne.get("id") == null) {
                        queryConditionGroup2 = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq(billOne.get("code"))});
                        QuerySchema querySchema = QuerySchema.create().addSelect("id,name").addCondition((ConditionExpression)queryConditionGroup2);
                        List customerType2 = MetaDaoHelper.query((String)"aa.customertype.CustomerType", (QuerySchema)querySchema);
                        if (customerType2 == null || customerType2.isEmpty()) {
                            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800909);
                        }
                        billOne.put("id", Long.valueOf(((Map)customerType2.get(0)).get("id").toString()));
                        continue;
                    }
                    queryConditionGroup2 = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(billOne.get("id"))});
                    QuerySchema querySchema = QuerySchema.create().addSelect("id,code").addCondition((ConditionExpression)queryConditionGroup2);
                    List customerType = MetaDaoHelper.query((String)"aa.customertype.CustomerType", (QuerySchema)querySchema);
                    if (customerType != null && !customerType.isEmpty()) continue;
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800910, new Object[]{billOne.get("id").toString()});
                }
                bill.setData(billList);
            } else if ("pc_productline".equals(bill.getBillnum())) {
                errorMessage = "";
                for (Object billOne : billList) {
                    if (!billOne.containsKey("_status") || billOne.get("_status") == null) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800911);
                    }
                    this.dealMultilingualism((Map<String, Object>)billOne);
                    if (!"Update".equals(billOne.get("_status").toString())) continue;
                    if (!billOne.containsKey("id") || billOne.get("id") == null) {
                        QueryConditionGroup queryConditionGroup3 = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq(billOne.get("code"))});
                        schema = QuerySchema.create().addSelect("id,name").addCondition((ConditionExpression)queryConditionGroup3);
                        List list = MetaDaoHelper.query((String)"pc.productline.ProductLine", (QuerySchema)schema);
                        if (list == null || list.isEmpty()) {
                            errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040800B8", (String)"\u4fee\u6539\u4ea7\u54c1\u7ebf\u7f16\u7801\u65f6\uff0c\u4ea7\u54c1\u7ebfid\u4e3a\u5fc5\u8f93\uff0c\u8bf7\u68c0\u67e5\u4f20\u53c2\u662f\u5426\u6b63\u786e\uff1b\u7f16\u7801\u4e3a\uff1a%s\uff1b"), billOne.get("code").toString()));
                            continue;
                        }
                        billOne.put("id", Long.valueOf(((Map)list.get(0)).get("id").toString()));
                        continue;
                    }
                    QueryConditionGroup queryConditionGroup4 = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(billOne.get("id"))});
                    schema = QuerySchema.create().addSelect("id,code").addCondition((ConditionExpression)queryConditionGroup4);
                    List list = MetaDaoHelper.query((String)"pc.productline.ProductLine", (QuerySchema)schema);
                    if (list != null && !list.isEmpty()) continue;
                    errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040800BA", (String)"\u672a\u627e\u5230\u4ea7\u54c1\u7ebfid\uff1a%s\u5bf9\u5e94\u6570\u636e\uff0c\u8bf7\u68c0\u67e5\u4f20\u53c2\u662f\u5426\u6b63\u786e\uff1b"), billOne.get("id").toString()));
                }
                if (!"".equals(errorMessage)) {
                    throw new CoreDocBusinessException((String)errorMessage);
                }
                bill.setData(billList);
            } else if ("aa_custcategory".equals(bill.getBillnum())) {
                errorMessage = "";
                for (Object billOne : billList) {
                    if (!billOne.containsKey("_status") || billOne.get("_status") == null) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800912);
                    }
                    this.dealMultilingualism((Map<String, Object>)billOne);
                    if (!"Update".equals(billOne.get("_status").toString())) continue;
                    if (!billOne.containsKey("id") || billOne.get("id") == null) {
                        QueryConditionGroup queryConditionGroup5 = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq(billOne.get("code"))});
                        schema = QuerySchema.create().addSelect("id,name").addCondition((ConditionExpression)queryConditionGroup5);
                        List list = MetaDaoHelper.query((String)"aa.custcategory.CustCategory", (QuerySchema)schema);
                        if (list == null || list.isEmpty()) {
                            errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040800C0", (String)"\u4fee\u6539\u5ba2\u6237\u5206\u7c7b\u7f16\u7801\u65f6\uff0c\u5ba2\u6237\u5206\u7c7bid\u4e3a\u5fc5\u8f93\uff0c\u8bf7\u68c0\u67e5\u4f20\u53c2\u662f\u5426\u6b63\u786e\uff1b\u7f16\u7801\u4e3a\uff1a%s\uff1b"), billOne.get("code").toString()));
                            continue;
                        }
                        billOne.put("id", Long.valueOf(((Map)list.get(0)).get("id").toString()));
                        continue;
                    }
                    QueryConditionGroup queryConditionGroup6 = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(billOne.get("id"))});
                    schema = QuerySchema.create().addSelect("id,code").addCondition((ConditionExpression)queryConditionGroup6);
                    List list = MetaDaoHelper.query((String)"aa.custcategory.CustCategory", (QuerySchema)schema);
                    if (list != null && !list.isEmpty()) continue;
                    errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040800C2", (String)"\u672a\u627e\u5230\u5ba2\u6237\u5206\u7c7bid\uff1a%s\u5bf9\u5e94\u6570\u636e\uff0c\u8bf7\u68c0\u67e5\u4f20\u53c2\u662f\u5426\u6b63\u786e\uff1b"), billOne.get("id").toString()));
                }
                if (!"".equals(errorMessage)) {
                    throw new CoreDocBusinessException((String)errorMessage);
                }
                bill.setData(billList);
            } else if ("aa_customertrade".equals(bill.getBillnum())) {
                errorMessage = "";
                for (Object billOne : billList) {
                    if (!billOne.containsKey("_status") || billOne.get("_status") == null) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800913);
                    }
                    this.dealMultilingualism((Map<String, Object>)billOne);
                    if (!"Update".equals(billOne.get("_status").toString())) continue;
                    if (!billOne.containsKey("id") || billOne.get("id") == null) {
                        QueryConditionGroup queryConditionGroup7 = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq(billOne.get("code"))});
                        schema = QuerySchema.create().addSelect("id,name").addCondition((ConditionExpression)queryConditionGroup7);
                        List list = MetaDaoHelper.query((String)"aa.customertrade.CustomerTrade", (QuerySchema)schema);
                        if (list == null || list.isEmpty()) {
                            errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040800CD", (String)"\u4fee\u6539\u5ba2\u6237\u884c\u4e1a\u7f16\u7801\u65f6\uff0c\u5ba2\u6237\u884c\u4e1aid\u4e3a\u5fc5\u8f93\uff0c\u8bf7\u68c0\u67e5\u4f20\u53c2\u662f\u5426\u6b63\u786e\uff1b\u7f16\u7801\u4e3a\uff1a%s\uff1b"), billOne.get("code").toString()));
                            continue;
                        }
                        billOne.put("id", Long.valueOf(((Map)list.get(0)).get("id").toString()));
                        continue;
                    }
                    QueryConditionGroup queryConditionGroup8 = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(billOne.get("id"))});
                    schema = QuerySchema.create().addSelect("id,code").addCondition((ConditionExpression)queryConditionGroup8);
                    List list = MetaDaoHelper.query((String)"aa.customertrade.CustomerTrade", (QuerySchema)schema);
                    if (list != null && !list.isEmpty()) continue;
                    errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040800D2", (String)"\u672a\u627e\u5230\u5ba2\u6237\u884c\u4e1aid\uff1a%s\u5bf9\u5e94\u6570\u636e\uff0c\u8bf7\u68c0\u67e5\u4f20\u53c2\u662f\u5426\u6b63\u786e\uff1b"), billOne.get("id").toString()));
                }
                if (!"".equals(errorMessage)) {
                    throw new CoreDocBusinessException((String)errorMessage);
                }
                bill.setData(billList);
            } else if ("pc_addressarchives".equals(bill.getBillnum())) {
                errorMessage = "";
                for (Object billOne : billList) {
                    if (!billOne.containsKey("_status") || billOne.get("_status") == null) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800914);
                    }
                    if (!(billOne.containsKey("parent") && billOne.get("parent") != null || billOne.containsKey("parentCode") && billOne.get("parentCode") != null)) {
                        errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040800D7", (String)"\u7f16\u7801\u4e3a\uff1a%s \u7684\u5730\u5740\uff0c\u4e0a\u7ea7\u5730\u5740id\u4e0e\u4e0a\u7ea7\u5730\u5740\u7f16\u7801\u4e0d\u80fd\u540c\u65f6\u4e3a\u7a7a\uff1b"), billOne.get("code").toString()));
                    }
                    this.dealMultilingualism((Map<String, Object>)billOne);
                    if (!"Update".equals(billOne.get("_status").toString())) continue;
                    if (!billOne.containsKey("id") || billOne.get("id") == null) {
                        QueryConditionGroup queryConditionGroup9 = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq(billOne.get("code"))});
                        schema = QuerySchema.create().addSelect("id,name").addCondition((ConditionExpression)queryConditionGroup9);
                        List list = MetaDaoHelper.query((String)"aa.regioncorp.RegionCorp", (QuerySchema)schema);
                        if (list == null || list.isEmpty()) {
                            errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040800DB", (String)"\u4fee\u6539\u5730\u5740\u7f16\u7801\u65f6\uff0c\u5ba2\u6237\u884c\u4e1aid\u4e3a\u5fc5\u8f93\uff0c\u8bf7\u68c0\u67e5\u4f20\u53c2\u662f\u5426\u6b63\u786e\uff1b\u7f16\u7801\u4e3a\uff1a%s\uff1b"), billOne.get("code").toString()));
                            continue;
                        }
                        billOne.put("id", Long.valueOf(((Map)list.get(0)).get("id").toString()));
                        continue;
                    }
                    QueryConditionGroup queryConditionGroup10 = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(billOne.get("id"))});
                    schema = QuerySchema.create().addSelect("id,code").addCondition((ConditionExpression)queryConditionGroup10);
                    List list = MetaDaoHelper.query((String)"aa.regioncorp.RegionCorp", (QuerySchema)schema);
                    if (list != null && !list.isEmpty()) continue;
                    errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040800DE", (String)"\u672a\u627e\u5230\u5730\u5740id\uff1a%s\u5bf9\u5e94\u6570\u636e\uff0c\u8bf7\u68c0\u67e5\u4f20\u53c2\u662f\u5426\u6b63\u786e\uff1b"), billOne.get("id").toString()));
                }
                if (!"".equals(errorMessage)) {
                    throw new CoreDocBusinessException((String)errorMessage);
                }
                bill.setData(billList);
            } else if ("aa_customerpro".equals(bill.getBillnum())) {
                errorMessage = "";
                typeList = Arrays.asList("Date", "DateTime", "Double", "Integer", "ReferArchive", "String", "Time");
                for (Map map4 : billList) {
                    if (!map4.containsKey("_status") || map4.get("_status") == null) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800896);
                    }
                    this.dealMultilingualism(map4);
                    if ("Update".equals(map4.get("_status").toString())) {
                        if (!map4.containsKey("id") || map4.get("id") == null) {
                            errorMessage = String.format("%s%s", errorMessage, InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040800E2", (String)"\u5f53\u64cd\u4f5c\u72b6\u6001\u4e3a\u66f4\u65b0\u65f6\uff0c\u5ba2\u6237\u5c5e\u6027id\u5fc5\u8f93"));
                        } else {
                            queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(map4.get("id"))});
                            QuerySchema querySchema = QuerySchema.create().addSelect("id,showItem").addCondition((ConditionExpression)queryConditionGroup);
                            userDefineClass = MetaDaoHelper.query((String)"pc.userdef.UserDefineClass", (QuerySchema)querySchema);
                            if (userDefineClass == null || userDefineClass.isEmpty()) {
                                errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040800E4", (String)"\u672a\u627e\u5230\u5ba2\u6237\u5c5e\u6027id\uff1a%s\u5bf9\u5e94\u6570\u636e\uff0c\u8bf7\u68c0\u67e5\u4f20\u53c2\u662f\u5426\u6b63\u786e\uff1b"), map4.get("id").toString()));
                            }
                        }
                    }
                    name = (Map)map4.get("showItem");
                    if (!map4.containsKey("type") || map4.get("type") == null || !typeList.contains(map4.get("type").toString())) {
                        errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080056", (String)"\u5c5e\u6027\u540d\u79f0\u4e3a %s \u7684\u5c5e\u6027\u7c7b\u578btype\u4f20\u503c\u4e0d\u6b63\u786e\uff0c\u8bf7\u6309\u7167\u8bf4\u660e\u7ed9\u51fa\u7684\u6837\u4f8b\u8fdb\u884c\u4f20\u503c"), name.get("zh_CN")));
                    }
                    if (!map4.containsKey("orderNum") || map4.get("orderNum") == null || !map4.get("orderNum").toString().matches("\\d+")) {
                        errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080059", (String)"\u5c5e\u6027\u540d\u79f0\u4e3a %s \u7684\u6392\u5e8f\u5e8f\u53f7orderNum\u4f20\u503c\u4e0d\u6b63\u786e\uff0c\u8bf7\u6309\u7167\u8bf4\u660e\u7ed9\u51fa\u7684\u6837\u4f8b\u8fdb\u884c\u4f20\u503c"), name.get("zh_CN")));
                    }
                    if (!(!"String".equals(map4.get("type").toString()) && !"Double".equals(map4.get("type").toString()) && !"Integer".equals(map4.get("type").toString()) || map4.containsKey("maxInputLen") && map4.get("maxInputLen") != null && map4.get("maxInputLen").toString().matches("\\d+"))) {
                        errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408005A", (String)"\u5c5e\u6027\u540d\u79f0\u4e3a %s \u7684\u5f55\u5165\u957f\u5ea6maxInputLen\u4f20\u503c\u4e0d\u6b63\u786e\uff0c\u8bf7\u6309\u7167\u8bf4\u660e\u7ed9\u51fa\u7684\u6837\u4f8b\u8fdb\u884c\u4f20\u503c"), name.get("zh_CN")));
                        continue;
                    }
                    if ("String".equals(map4.get("type").toString()) && Long.valueOf(map4.get("maxInputLen").toString()) > 255L) {
                        errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080044", (String)"\u5c5e\u6027\u540d\u79f0\u4e3a %s \u7684\u5c5e\u6027\u7c7b\u578b\u4e3a\u6587\u672c\u65f6\uff0c\u5f55\u5165\u957f\u5ea6\u6700\u5927\u4e3a255\uff1b"), name.get("zh_CN")));
                    }
                    if (!"Double".equals(map4.get("type").toString()) && !"Integer".equals(map4.get("type").toString()) || Long.valueOf(map4.get("maxInputLen").toString()) <= 15L) continue;
                    errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080047", (String)"\u5c5e\u6027\u540d\u79f0\u4e3a %s \u7684\u5c5e\u6027\u7c7b\u578b\u4e3a\u6570\u503c\u6216\u6574\u578b\u65f6\uff0c\u5f55\u5165\u957f\u5ea6\u6700\u5927\u4e3a15\uff1b"), name.get("zh_CN")));
                }
                if (!"".equals(errorMessage)) {
                    throw new CoreDocBusinessException((String)errorMessage);
                }
            } else if ("pc_productbrandpro".equals(bill.getBillnum())) {
                errorMessage = "";
                typeList = Arrays.asList("Date", "DateTime", "Double", "Integer", "ReferArchive", "String", "Time");
                for (Map map5 : billList) {
                    if (!map5.containsKey("_status") || map5.get("_status") == null) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800915);
                    }
                    this.dealMultilingualism(map5);
                    if ("Update".equals(map5.get("_status").toString())) {
                        if (!map5.containsKey("id") || map5.get("id") == null) {
                            errorMessage = String.format("%s%s", errorMessage, InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408004F", (String)"\u5f53\u64cd\u4f5c\u72b6\u6001\u4e3a\u66f4\u65b0\u65f6\uff0c\u54c1\u724c\u5c5e\u6027id\u5fc5\u8f93"));
                        } else {
                            queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(map5.get("id"))});
                            QuerySchema querySchema = QuerySchema.create().addSelect("id,showItem").addCondition((ConditionExpression)queryConditionGroup);
                            userDefineClass = MetaDaoHelper.query((String)"pc.userdef.UserDefineClass", (QuerySchema)querySchema);
                            if (userDefineClass == null || userDefineClass.isEmpty()) {
                                errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080051", (String)"\u672a\u627e\u5230\u54c1\u724c\u5c5e\u6027id\uff1a%s\u5bf9\u5e94\u6570\u636e\uff0c\u8bf7\u68c0\u67e5\u4f20\u53c2\u662f\u5426\u6b63\u786e\uff1b"), map5.get("id").toString()));
                            }
                        }
                    }
                    name = (Map)map5.get("showItem");
                    if (!map5.containsKey("type") || map5.get("type") == null || !typeList.contains(map5.get("type").toString())) {
                        errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080056", (String)"\u5c5e\u6027\u540d\u79f0\u4e3a %s \u7684\u5c5e\u6027\u7c7b\u578btype\u4f20\u503c\u4e0d\u6b63\u786e\uff0c\u8bf7\u6309\u7167\u8bf4\u660e\u7ed9\u51fa\u7684\u6837\u4f8b\u8fdb\u884c\u4f20\u503c"), name.get("zh_CN")));
                    }
                    if (!map5.containsKey("orderNum") || map5.get("orderNum") == null || !map5.get("orderNum").toString().matches("\\d+")) {
                        errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080059", (String)"\u5c5e\u6027\u540d\u79f0\u4e3a %s \u7684\u6392\u5e8f\u5e8f\u53f7orderNum\u4f20\u503c\u4e0d\u6b63\u786e\uff0c\u8bf7\u6309\u7167\u8bf4\u660e\u7ed9\u51fa\u7684\u6837\u4f8b\u8fdb\u884c\u4f20\u503c"), name.get("zh_CN")));
                    }
                    if (!(!"String".equals(map5.get("type").toString()) && !"Double".equals(map5.get("type").toString()) && !"Integer".equals(map5.get("type").toString()) || map5.containsKey("maxInputLen") && map5.get("maxInputLen") != null && map5.get("maxInputLen").toString().matches("\\d+"))) {
                        errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408005A", (String)"\u5c5e\u6027\u540d\u79f0\u4e3a %s \u7684\u5f55\u5165\u957f\u5ea6maxInputLen\u4f20\u503c\u4e0d\u6b63\u786e\uff0c\u8bf7\u6309\u7167\u8bf4\u660e\u7ed9\u51fa\u7684\u6837\u4f8b\u8fdb\u884c\u4f20\u503c"), name.get("zh_CN")));
                        continue;
                    }
                    if ("String".equals(map5.get("type").toString()) && Long.valueOf(map5.get("maxInputLen").toString()) > 255L) {
                        errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080044", (String)"\u5c5e\u6027\u540d\u79f0\u4e3a %s \u7684\u5c5e\u6027\u7c7b\u578b\u4e3a\u6587\u672c\u65f6\uff0c\u5f55\u5165\u957f\u5ea6\u6700\u5927\u4e3a255\uff1b"), name.get("zh_CN")));
                    }
                    if (!"Double".equals(map5.get("type").toString()) && !"Integer".equals(map5.get("type").toString()) || Long.valueOf(map5.get("maxInputLen").toString()) <= 15L) continue;
                    errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080047", (String)"\u5c5e\u6027\u540d\u79f0\u4e3a %s \u7684\u5c5e\u6027\u7c7b\u578b\u4e3a\u6570\u503c\u6216\u6574\u578b\u65f6\uff0c\u5f55\u5165\u957f\u5ea6\u6700\u5927\u4e3a15\uff1b"), name.get("zh_CN")));
                }
                if (!"".equals(errorMessage)) {
                    throw new CoreDocBusinessException((String)errorMessage);
                }
            } else if ("pc_brandclass".equals(bill.getBillnum())) {
                errorMessage = "";
                for (Object billOne : billList) {
                    if (billOne.containsKey("id") && billOne.get("id") != null) {
                        billOne.put("_status", "Update");
                    }
                    if (!billOne.containsKey("_status") || billOne.get("_status") == null) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800911);
                    }
                    this.dealMultilingualism((Map<String, Object>)billOne);
                    if (!"Update".equals(billOne.get("_status").toString())) continue;
                    if (!billOne.containsKey("id") || billOne.get("id") == null) {
                        QueryConditionGroup queryConditionGroup11 = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq(billOne.get("code"))});
                        schema = QuerySchema.create().addSelect("id,name").addCondition((ConditionExpression)queryConditionGroup11);
                        List list = MetaDaoHelper.query((String)"pc.brand.BrandClass", (QuerySchema)schema);
                        if (list == null || list.isEmpty()) {
                            errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080063", (String)"\u4fee\u6539\u54c1\u724c\u5206\u7ec4\u7f16\u7801\u65f6\uff0c\u4ea7\u54c1\u7ebfid\u4e3a\u5fc5\u8f93\uff0c\u8bf7\u68c0\u67e5\u4f20\u53c2\u662f\u5426\u6b63\u786e\uff1b\u7f16\u7801\u4e3a\uff1a%s\uff1b"), billOne.get("code").toString()));
                            continue;
                        }
                        billOne.put("id", Long.valueOf(((Map)list.get(0)).get("id").toString()));
                        continue;
                    }
                    QueryConditionGroup queryConditionGroup12 = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(billOne.get("id"))});
                    schema = QuerySchema.create().addSelect("id,code").addCondition((ConditionExpression)queryConditionGroup12);
                    List list = MetaDaoHelper.query((String)"pc.brand.BrandClass", (QuerySchema)schema);
                    if (list != null && !list.isEmpty()) continue;
                    errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080069", (String)"\u672a\u627e\u5230\u54c1\u724c\u5206\u7ec4id\uff1a%s\u5bf9\u5e94\u6570\u636e\uff0c\u8bf7\u68c0\u67e5\u4f20\u53c2\u662f\u5426\u6b63\u786e\uff1b"), billOne.get("id").toString()));
                }
                if (!"".equals(errorMessage)) {
                    throw new CoreDocBusinessException((String)errorMessage);
                }
                bill.setData(billList);
            } else if ("pc_spepro".equals(bill.getBillnum())) {
                void var8_34;
                errorMessage = "";
                Iterator<Object> erpCodeBillList = billList.stream().filter(p -> p.containsKey("erpCode") && p.get("erpCode") != null).collect(Collectors.toList());
                List<Object> erpCodeInDb = new ArrayList();
                if (!CollectionUtils.isEmpty(erpCodeBillList)) {
                    List list = erpCodeBillList.stream().map(p -> p.get("erpCode").toString()).collect(Collectors.toList());
                    QueryConditionGroup queryConditionGroup3 = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"erpCode").in(list)});
                    QuerySchema querySchema = QuerySchema.create().addSelect("id,defineId,erpCode").addCondition((ConditionExpression)queryConditionGroup3);
                    List specproByErpInDb = MetaDaoHelper.query((String)"pc.userdef.UserDefineClassSpec", (QuerySchema)querySchema);
                    if (!CollectionUtils.isEmpty((Collection)specproByErpInDb)) {
                        erpCodeInDb = specproByErpInDb.stream().map(p -> p.get("erpCode").toString()).collect(Collectors.toList());
                        Map<String, Map> collectInDb = specproByErpInDb.stream().collect(Collectors.toMap(p -> p.get("erpCode").toString(), p -> p));
                        List userdefidList = specproByErpInDb.stream().map(p -> p.get("id").toString()).collect(Collectors.toList());
                        queryConditionGroup3 = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"userdefid").in(userdefidList)});
                        QuerySchema querySchema2 = QuerySchema.create().addSelect("id,userdefid,code,name").addCondition((ConditionExpression)queryConditionGroup3);
                        List userDefineInDb = MetaDaoHelper.query((String)"pc.userdef.UserDefineSpec", (QuerySchema)querySchema2);
                        Map<Object, Object> collectInuserDefineDb = new HashMap();
                        if (!CollectionUtils.isEmpty((Collection)userDefineInDb)) {
                            collectInuserDefineDb = userDefineInDb.stream().collect(Collectors.groupingBy(map -> map.get("userdefid").toString()));
                        }
                        for (Map map6 : billList) {
                            String erpCodetemp = map6.get("erpCode").toString();
                            if (!erpCodeInDb.contains(erpCodetemp)) continue;
                            map6.put("id", Long.valueOf(collectInDb.get(erpCodetemp).get("id").toString()));
                            map6.put("defineId", collectInDb.get(erpCodetemp).get("defineId").toString());
                            map6.put("_status", "Update");
                            if (!map6.containsKey("userdefinespecs") || map6.get("userdefinespecs") == null || CollectionUtils.isEmpty((Collection)((List)map6.get("userdefinespecs")))) continue;
                            for (Map userdefinespec : (List)map6.get("userdefinespecs")) {
                                userdefinespec.put("userdefid", map6.get("id"));
                                if (collectInuserDefineDb == null || !collectInuserDefineDb.containsKey(map6.get("id").toString())) continue;
                                for (Map userdefineIndb : (List)collectInuserDefineDb.get(map6.get("id").toString())) {
                                    if ("Delete".equals(userdefinespec.get("_status").toString()) || !userdefineIndb.get("code").toString().equals(userdefinespec.get("code")) && !userdefineIndb.get("name").toString().equals(userdefinespec.get("name"))) continue;
                                    userdefinespec.put("id", Long.valueOf(userdefineIndb.get("id").toString()));
                                    userdefinespec.put("_status", "Update");
                                }
                            }
                        }
                    }
                }
                ArrayList arrayList = new ArrayList();
                if (!CollectionUtils.isEmpty(erpCodeInDb)) {
                    ArrayList finalErpCodeInDb = erpCodeInDb;
                    List list = billList.stream().filter(p -> !p.containsKey("erpCode") || p.get("erpCode") == null || !finalErpCodeInDb.contains(p.get("erpCode").toString())).collect(Collectors.toList());
                } else {
                    List<Object> list = billList;
                }
                if (!CollectionUtils.isEmpty((Collection)var8_34)) {
                    List showItemList = var8_34.stream().map(p -> (String)((Map)p.get("showItem")).get("zh_CN")).collect(Collectors.toList());
                    QueryConditionGroup queryConditionGroup13 = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"showItem").in(showItemList)});
                    QuerySchema schema2 = QuerySchema.create().addSelect("id,defineId,showItem").addCondition((ConditionExpression)queryConditionGroup13);
                    List specproByItemInDb = MetaDaoHelper.query((String)"pc.userdef.UserDefineClassSpec", (QuerySchema)schema2);
                    if (!CollectionUtils.isEmpty((Collection)specproByItemInDb)) {
                        List showItemInDb = specproByItemInDb.stream().map(p -> p.get("showItem").toString()).collect(Collectors.toList());
                        Map<String, Map> collectInDb = specproByItemInDb.stream().collect(Collectors.toMap(p -> p.get("showItem").toString(), p -> p));
                        List userdefidList = specproByItemInDb.stream().map(p -> p.get("id").toString()).collect(Collectors.toList());
                        QueryConditionGroup queryConditionGroup14 = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"userdefid").in(userdefidList)});
                        schema2 = QuerySchema.create().addSelect("id,userdefid,code,name").addCondition((ConditionExpression)queryConditionGroup14);
                        List userDefineInDb = MetaDaoHelper.query((String)"pc.userdef.UserDefineSpec", (QuerySchema)schema2);
                        HashMap hashMap = new HashMap();
                        if (!CollectionUtils.isEmpty((Collection)userDefineInDb)) {
                            Map<String, List<Map>> map7 = userDefineInDb.stream().collect(Collectors.groupingBy(map -> map.get("userdefid").toString()));
                        }
                        for (Map map8 : billList) {
                            String nameTemp = (String)((Map)map8.get("showItem")).get("zh_CN");
                            if (!showItemInDb.contains(nameTemp)) continue;
                            map8.put("id", Long.valueOf(collectInDb.get(nameTemp).get("id").toString()));
                            map8.put("defineId", collectInDb.get(nameTemp).get("defineId").toString());
                            map8.put("_status", "Update");
                            if (!map8.containsKey("userdefinespecs") || map8.get("userdefinespecs") == null || CollectionUtils.isEmpty((Collection)((List)map8.get("userdefinespecs")))) continue;
                            for (Map userdefinespec : (List)map8.get("userdefinespecs")) {
                                void var17_270;
                                userdefinespec.put("userdefid", map8.get("id"));
                                if (var17_270 == null || !var17_270.containsKey(map8.get("id").toString())) continue;
                                for (Map userdefineIndb : (List)var17_270.get(map8.get("id").toString())) {
                                    if ("Delete".equals(userdefinespec.get("_status").toString()) || !userdefineIndb.get("code").toString().equals(userdefinespec.get("code")) && !userdefineIndb.get("name").toString().equals(userdefinespec.get("name"))) continue;
                                    userdefinespec.put("id", Long.valueOf(userdefineIndb.get("id").toString()));
                                    userdefinespec.put("_status", "Update");
                                }
                            }
                        }
                    }
                }
                if (!"".equals(errorMessage)) {
                    throw new CoreDocBusinessException((String)errorMessage);
                }
                bill.setData(billList);
            } else if ("pc_producttpl".equals(bill.getBillnum())) {
                bill.setConvertType(Integer.valueOf(0));
                errorMessage = "";
                for (Object billOne : billList) {
                    void var8_35;
                    if (!billOne.containsKey("_status") || billOne.get("_status") == null) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800916);
                    }
                    if (!"Update".equals(billOne.get("_status").toString()) || billOne.containsKey("id") && billOne.get("id") != null) continue;
                    String string = "";
                    Map productName = (Map)billOne.get("name");
                    if (null != productName.get(InvocationInfoProxy.getLocale())) {
                        String string2 = String.valueOf(productName.get(InvocationInfoProxy.getLocale()));
                    } else {
                        String string3 = String.valueOf(productName.get("zh_CN"));
                    }
                    QueryConditionGroup queryConditionGroup15 = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"name").eq((Object)var8_35)});
                    QuerySchema schema2 = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)queryConditionGroup15);
                    List productTpl = MetaDaoHelper.query((String)"pc.tpl.ProductTpl", (QuerySchema)schema2);
                    if (productTpl == null || productTpl.isEmpty()) {
                        errorMessage = InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17A2451E042000A1", (String)"\u6839\u636e\u6a21\u677f\u540d\u79f0\u672a\u627e\u5230\u76f8\u5e94\u7684\u6a21\u7248\u4fe1\u606f\uff01\uff08\u66f4\u65b0\u6a21\u677f\u4fe1\u606f\u65f6\uff0c\u4e0d\u53ef\u66f4\u65b0\u6a21\u677f\u540d\u79f0\uff09");
                        continue;
                    }
                    billOne.put("id", Long.valueOf(((Map)productTpl.get(0)).get("id").toString()));
                }
                if (!"".equals(errorMessage)) {
                    throw new CoreDocBusinessException((String)errorMessage);
                }
                bill.setData(billList);
            }
        }
        if ("delete".equals(action)) {
            if (billList.size() > 100) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800917, new Object[]{dealNumOneTime});
            }
            if ("aa_merchantlist".equals(bill.getBillnum())) {
                errorMessage = "";
                for (Object billOne : billList) {
                    if (!billOne.containsKey(MERCHANT_ID) || billOne.get(MERCHANT_ID) == null) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800918);
                    }
                    if (!billOne.containsKey("orgId") || billOne.get("orgId") == null) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800919);
                    }
                    billOne.put("id", Long.valueOf(billOne.get(MERCHANT_ID).toString()));
                    billOne.put("orgId", billOne.get("orgId").toString());
                    billOne.put("belongOrg", billOne.get("orgId").toString());
                    QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)MERCHANT_ID).eq(billOne.get(MERCHANT_ID)), QueryCondition.name((String)"orgId").eq(billOne.get("orgId")), QueryCondition.name((String)"isPotential").eq((Object)false)});
                    schema = QuerySchema.create().addSelect("id,isCreator").addCondition((ConditionExpression)queryConditionGroup);
                    List list = MetaDaoHelper.query((String)"aa.merchant.MerchantApplyRange", (QuerySchema)schema);
                    if (!list.isEmpty() && list != null) {
                        billOne.put("merchantApplyRangeId", Long.valueOf(((Map)list.get(0)).get("id").toString()));
                        billOne.put("isCreator", Boolean.valueOf((Boolean)((Map)list.get(0)).get("isCreator")));
                        QueryConditionGroup queryConditionGroup16 = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantApplyRangeId").eq(((Map)list.get(0)).get("id")), QueryCondition.name((String)"id").eq(billOne.get(MERCHANT_ID))});
                        schema = QuerySchema.create().addSelect("*").addCondition((ConditionExpression)queryConditionGroup16);
                        List merchantApplyRangeDetail = MetaDaoHelper.query((String)"aa.merchant.MerchantApplyRangeDetail", (QuerySchema)schema);
                        if (!merchantApplyRangeDetail.isEmpty() && merchantApplyRangeDetail != null) {
                            billOne.put("merchantAppliedDetail", merchantApplyRangeDetail.get(0));
                        } else {
                            errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408008B", (String)"\u8be5\u5ba2\u6237\u672a\u5206\u914d\u7ed9\u8be5\u7ec4\u7ec7\uff0c\u5ba2\u6237id\uff1a%s\uff0c\u7ec4\u7ec7id\uff1a%s\uff0c\u8bf7\u68c0\u67e5\u4f20\u53c2\u662f\u5426\u6b63\u786e\uff1b"), billOne.get(MERCHANT_ID).toString(), billOne.get("orgId").toString()));
                        }
                        if (billOne.containsKey("code") && billOne.get("code") != null) continue;
                        billOne.put("code", billOne.get(MERCHANT_ID).toString());
                        continue;
                    }
                    errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408008B", (String)"\u8be5\u5ba2\u6237\u672a\u5206\u914d\u7ed9\u8be5\u7ec4\u7ec7\uff0c\u5ba2\u6237id\uff1a%s\uff0c\u7ec4\u7ec7id\uff1a%s\uff0c\u8bf7\u68c0\u67e5\u4f20\u53c2\u662f\u5426\u6b63\u786e\uff1b"), billOne.get(MERCHANT_ID).toString(), billOne.get("orgId").toString()));
                }
                if (!"".equals(errorMessage)) {
                    throw new CoreDocBusinessException(errorMessage);
                }
                bill.setData(billList);
            } else if ("pc_productlist".equals(bill.getBillnum())) {
                errorMessage = "";
                Iterator<Object> iterator = billList.iterator();
                while (iterator.hasNext()) {
                    Object billOne;
                    billOne = (Map)iterator.next();
                    if (!billOne.containsKey("data_from") || billOne.get("data_from") == null) {
                        if (!billOne.containsKey("productId") || billOne.get("productId") == null) {
                            errorMessage = String.format("%s%s", errorMessage, InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040800AE", (String)"\u7269\u6599\u6863\u6848id\u4e0d\u80fd\u4e3a\u7a7a"));
                            iterator.remove();
                        }
                        if (!billOne.containsKey("createOrgId") || billOne.get("createOrgId") == null) {
                            errorMessage = String.format("%s%s", errorMessage, InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040800A0", (String)"\u521b\u5efa\u7ec4\u7ec7id\u4e0d\u80fd\u4e3a\u7a7a"));
                            iterator.remove();
                        }
                        billOne.put("id", Long.valueOf(billOne.get("productId").toString()));
                        billOne.put("orgId", billOne.get("createOrgId").toString());
                        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq(billOne.get("productId")), QueryCondition.name((String)"orgId").eq(billOne.get("createOrgId"))});
                        schema = QuerySchema.create().addSelect("id,isCreator").addCondition((ConditionExpression)queryConditionGroup);
                        List list = MetaDaoHelper.query((String)"pc.product.ProductApplyRange", (QuerySchema)schema);
                        if (!list.isEmpty() && list != null) {
                            billOne.put("productApplyRangeId", Long.valueOf(((Map)list.get(0)).get("id").toString()));
                            billOne.put("isCreator", Boolean.valueOf((Boolean)((Map)list.get(0)).get("isCreator")));
                            if (!((Boolean)((Map)list.get(0)).get("isCreator")).booleanValue()) {
                                errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040800B5", (String)"\u4f20\u5165\u7684\u521b\u5efa\u7ec4\u7ec7id\uff1a%s\uff0c\u4e0d\u662f\u521b\u5efa\u8005\uff0c\u8bf7\u68c0\u67e5\u4f20\u53c2\u662f\u5426\u6b63\u786e\uff1b"), billOne.get("createOrgId").toString()));
                                iterator.remove();
                            }
                            if (billOne.containsKey("code") && billOne.get("code") != null) continue;
                            billOne.put("code", billOne.get("productId").toString());
                            continue;
                        }
                        errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408004E", (String)"\u8be5\u7269\u6599\u672a\u5206\u914d\u7ed9\u8be5\u7ec4\u7ec7\uff0c\u7269\u6599id\uff1a%s\uff0c\u7ec4\u7ec7id\uff1a%s\uff0c\u8bf7\u68c0\u67e5\u4f20\u53c2\u662f\u5426\u6b63\u786e\uff1b"), billOne.get("productId").toString(), billOne.get("createOrgId").toString()));
                        iterator.remove();
                        continue;
                    }
                    if (!billOne.containsKey("erpCode") || billOne.get("erpCode") == null) {
                        iterator.remove();
                    }
                    if (!billOne.containsKey("orgId") || billOne.get("orgId") == null) {
                        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId.erpCode").eq(billOne.get("erpCode")), QueryCondition.name((String)"isCreator").eq((Object)true)});
                        schema = QuerySchema.create().addSelect("id,productId,orgId,isCreator").addCondition((ConditionExpression)queryConditionGroup);
                        List list = MetaDaoHelper.query((String)"pc.product.ProductApplyRange", (QuerySchema)schema);
                        if (!list.isEmpty() && list != null) {
                            billOne.put("id", Long.valueOf(((Map)list.get(0)).get("productId").toString()));
                            billOne.put("orgId", ((Map)list.get(0)).get("orgId"));
                            billOne.put("productApplyRangeId", Long.valueOf(((Map)list.get(0)).get("id").toString()));
                            billOne.put("isCreator", Boolean.valueOf((Boolean)((Map)list.get(0)).get("isCreator")));
                            continue;
                        }
                        iterator.remove();
                        continue;
                    }
                    billOne.put("id", Long.valueOf(billOne.get("productId").toString()));
                    billOne.put("orgId", billOne.get("createOrgId").toString());
                    QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId.erpCode").eq(billOne.get("erpCode")), QueryCondition.name((String)"orgId").eq(billOne.get("orgId"))});
                    schema = QuerySchema.create().addSelect("id,isCreator").addCondition((ConditionExpression)queryConditionGroup);
                    List list = MetaDaoHelper.query((String)"pc.product.ProductApplyRange", (QuerySchema)schema);
                    if (!list.isEmpty() && list != null) {
                        billOne.put("productApplyRangeId", Long.valueOf(((Map)list.get(0)).get("id").toString()));
                        billOne.put("isCreator", Boolean.valueOf((Boolean)((Map)list.get(0)).get("isCreator")));
                        continue;
                    }
                    iterator.remove();
                }
                if (!"".equals(errorMessage)) {
                    throw new CoreDocBusinessException(errorMessage);
                }
                bill.setData(billList);
            } else if ("pc_producttpllist".equals(bill.getBillnum())) {
                for (Object billOne : billList) {
                    if (!billOne.containsKey("id") || billOne.get("id") == null) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800920);
                    }
                    if (billOne.containsKey("code") && billOne.get("code") != null) continue;
                    billOne.put("code", billOne.get("id").toString());
                }
                bill.setData(billList);
            } else if ("pc_speprolist".equals(bill.getBillnum())) {
                errorMessage = "";
                for (Object billOne : billList) {
                    if (!billOne.containsKey("id") || billOne.get("id") == null) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800921);
                    }
                    QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(billOne.get("id"))});
                    schema = QuerySchema.create().addSelect("showItem,item,isShowSpec,isEnabled,iorder,defineId").addCondition((ConditionExpression)queryConditionGroup);
                    List list = MetaDaoHelper.query((String)"pc.userdef.UserDefineClass", (QuerySchema)schema);
                    if (list != null && !list.isEmpty()) {
                        billOne.put("showItem", ((Map)list.get(0)).get("showItem").toString());
                        billOne.put("item", ((Map)list.get(0)).get("item").toString());
                        billOne.put("isShowSpec", Boolean.valueOf((Boolean)((Map)list.get(0)).get("isShowSpec")));
                        billOne.put("isEnabled", ((Map)list.get(0)).get("isEnabled"));
                        billOne.put("iorder", Long.valueOf(((Map)list.get(0)).get("iorder").toString()));
                        billOne.put("defineId", ((Map)list.get(0)).get("defineId").toString());
                        if (billOne.containsKey("code") && billOne.get("code") != null) continue;
                        billOne.put("code", billOne.get("id").toString());
                        continue;
                    }
                    errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040800D3", (String)"\u672a\u627e\u5230\u7269\u6599\u89c4\u683cid\uff1a%s\u5bf9\u5e94\u6570\u636e\uff0c\u8bf7\u68c0\u67e5\u4f20\u53c2\u662f\u5426\u6b63\u786e\uff1b"), billOne.get("id")));
                }
                if (!"".equals(errorMessage)) {
                    throw new CoreDocBusinessException((String)errorMessage);
                }
                bill.setData(billList);
            } else if ("pc_managementclasslist".equals(bill.getBillnum())) {
                errorMessage = "";
                for (Object billOne : billList) {
                    if (!billOne.containsKey("code") || billOne.get("code") == null) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800922);
                    }
                    QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq(billOne.get("code"))});
                    schema = QuerySchema.create().addSelect("id,parent").addCondition((ConditionExpression)queryConditionGroup);
                    List list = MetaDaoHelper.query((String)"pc.cls.ManagementClass", (QuerySchema)schema);
                    if (list != null && !list.isEmpty()) {
                        billOne.put("id", Long.valueOf(((Map)list.get(0)).get("id").toString()));
                        if (((Map)list.get(0)).get("parent") == null) continue;
                        billOne.put("parent", Long.valueOf(((Map)list.get(0)).get("parent").toString()));
                        continue;
                    }
                    errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040800DF", (String)"\u7f16\u7801\u4e3a%s\u7269\u6599\u5206\u7c7b\u6570\u636e\u4e3a\u7a7a\uff0c\u8bf7\u68c0\u67e5\u4f20\u53c2\u662f\u5426\u6b63\u786e\uff1b"), billOne.get("code").toString()));
                }
                if (!"".equals(errorMessage)) {
                    throw new CoreDocBusinessException((String)errorMessage);
                }
                bill.setData(billList);
            } else if ("pc_productskuprolist".equals(bill.getBillnum())) {
                errorMessage = "";
                for (Object billOne : billList) {
                    if (!billOne.containsKey("id") || billOne.get("id") == null) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800923);
                    }
                    QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(billOne.get("id"))});
                    schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)queryConditionGroup);
                    List list = MetaDaoHelper.query((String)"pc.userdef.UserDefineClass", (QuerySchema)schema);
                    if (list != null && !list.isEmpty()) {
                        if (billOne.containsKey("code") && billOne.get("code") != null) continue;
                        billOne.put("code", billOne.get("id").toString());
                        continue;
                    }
                    errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040800E3", (String)"id\u4e3a%s\u7684SKU\u5c5e\u6027\u6570\u636e\u4e3a\u7a7a\uff0c\u8bf7\u68c0\u67e5\u4f20\u53c2\u662f\u5426\u6b63\u786e\uff1b"), billOne.get("id").toString()));
                }
                if (!"".equals(errorMessage)) {
                    throw new CoreDocBusinessException((String)errorMessage);
                }
                bill.setData(billList);
            } else if ("pc_productprolist".equals(bill.getBillnum())) {
                errorMessage = "";
                for (Object billOne : billList) {
                    if (!billOne.containsKey("id") || billOne.get("id") == null) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800924);
                    }
                    QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(billOne.get("id"))});
                    schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)queryConditionGroup);
                    List list = MetaDaoHelper.query((String)"pc.userdef.UserDefineClass", (QuerySchema)schema);
                    if (list != null && !list.isEmpty()) {
                        if (billOne.containsKey("code") && billOne.get("code") != null) continue;
                        billOne.put("code", billOne.get("id").toString());
                        continue;
                    }
                    errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080048", (String)"id\u4e3a%s\u7684\u7269\u6599\u5c5e\u6027\u6570\u636e\u4e3a\u7a7a\uff0c\u8bf7\u68c0\u67e5\u4f20\u53c2\u662f\u5426\u6b63\u786e\uff1b"), billOne.get("id").toString()));
                }
                if (!"".equals(errorMessage)) {
                    throw new CoreDocBusinessException((String)errorMessage);
                }
                bill.setData(billList);
            } else if ("pc_brandlist".equals(bill.getBillnum())) {
                errorMessage = "";
                for (Object billOne : billList) {
                    if (!(billOne.containsKey("id") && billOne.get("id") != null || billOne.containsKey("name") && billOne.get("name") != null)) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800925);
                    }
                    if (billOne.containsKey("id") && billOne.get("id") != null) {
                        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(billOne.get("id"))});
                        schema = QuerySchema.create().addSelect("id,name").addCondition((ConditionExpression)queryConditionGroup);
                        List list = MetaDaoHelper.query((String)"pc.brand.Brand", (QuerySchema)schema);
                        if (list == null || list.isEmpty()) {
                            errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408004D", (String)"id\u4e3a\uff1a%s\u7684\u54c1\u724c\u4e0d\u5b58\u5728\uff0c\u8bf7\u68c0\u67e5\u8f93\u5165\u53c2\u6570\uff1b"), billOne.get("id").toString()));
                        } else {
                            billOne.put("name", ((Map)list.get(0)).get("name").toString());
                        }
                    } else if (billOne.containsKey("name") && billOne.get("name") != null) {
                        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"name").eq(billOne.get("name"))});
                        schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)queryConditionGroup);
                        List list = MetaDaoHelper.query((String)"pc.brand.Brand", (QuerySchema)schema);
                        if (list == null || list.isEmpty()) {
                            errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080052", (String)"\u540d\u79f0\u4e3a\uff1a%s\u7684\u54c1\u724c\u4e0d\u5b58\u5728\uff0c\u8bf7\u68c0\u67e5\u8f93\u5165\u53c2\u6570\uff1b"), billOne.get("name").toString()));
                        } else {
                            billOne.put("id", Long.valueOf(((Map)list.get(0)).get("id").toString()));
                        }
                    }
                    if (billOne.containsKey("name") && billOne.get("name") != null) continue;
                    billOne.put("name", billOne.get("id").toString());
                }
                if (!"".equals(errorMessage)) {
                    throw new CoreDocBusinessException((String)errorMessage);
                }
                bill.setData(billList);
            } else if ("pc_unitlist".equals(bill.getBillnum())) {
                errorMessage = "";
                for (Object billOne : billList) {
                    if (!(billOne.containsKey("id") && billOne.get("id") != null || billOne.containsKey("code") && billOne.get("code") != null)) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800926);
                    }
                    if (billOne.containsKey("id") && billOne.get("id") != null) {
                        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(billOne.get("id"))});
                        schema = QuerySchema.create().addSelect("id,code").addCondition((ConditionExpression)queryConditionGroup);
                        List list = MetaDaoHelper.query((String)"pc.unit.Unit", (QuerySchema)schema);
                        if (list == null || list.isEmpty()) {
                            errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408005D", (String)"id\u4e3a\uff1a%s\u7684\u8ba1\u91cf\u5355\u4f4d\u4e0d\u5b58\u5728\uff0c\u8bf7\u68c0\u67e5\u8f93\u5165\u53c2\u6570\uff1b"), billOne.get("id").toString()));
                        } else {
                            billOne.put("code", ((Map)list.get(0)).get("code").toString());
                        }
                    } else if (billOne.containsKey("code") && billOne.get("code") != null) {
                        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq(billOne.get("code"))});
                        schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)queryConditionGroup);
                        List list = MetaDaoHelper.query((String)"pc.unit.Unit", (QuerySchema)schema);
                        if (list == null || list.isEmpty()) {
                            errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080060", (String)"\u7f16\u7801\u4e3a\uff1a%s\u7684\u8ba1\u91cf\u5355\u4f4d\u4e0d\u5b58\u5728\uff0c\u8bf7\u68c0\u67e5\u8f93\u5165\u53c2\u6570\uff1b"), billOne.get("code").toString()));
                        } else {
                            billOne.put("id", Long.valueOf(((Map)list.get(0)).get("id").toString()));
                        }
                    }
                    if (billOne.containsKey("code") && billOne.get("code") != null) continue;
                    billOne.put("code", billOne.get("id").toString());
                }
                if (!"".equals(errorMessage)) {
                    throw new CoreDocBusinessException((String)errorMessage);
                }
                bill.setData(billList);
            } else if ("aa_custcategorylist".equals(bill.getBillnum())) {
                errorMessage = "";
                for (Object billOne : billList) {
                    if (!(billOne.containsKey("id") && billOne.get("id") != null || billOne.containsKey("code") && billOne.get("code") != null)) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800927);
                    }
                    if (billOne.containsKey("id") && billOne.get("id") != null) {
                        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(billOne.get("id"))});
                        schema = QuerySchema.create().addSelect("id,code,orgId").addCondition((ConditionExpression)queryConditionGroup);
                        List list = MetaDaoHelper.query((String)"aa.custcategory.CustCategory", (QuerySchema)schema);
                        if (list == null || list.isEmpty()) {
                            errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408006A", (String)"id\u4e3a\uff1a%s\u7684\u5ba2\u6237\u5206\u7c7b\u4e0d\u5b58\u5728\uff0c\u8bf7\u68c0\u67e5\u8f93\u5165\u53c2\u6570\uff1b"), billOne.get("id").toString()));
                        } else {
                            billOne.put("code", ((Map)list.get(0)).get("code").toString());
                            billOne.put("orgId", ((Map)list.get(0)).get("orgId").toString());
                        }
                    } else if (billOne.containsKey("code") && billOne.get("code") != null) {
                        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq(billOne.get("code"))});
                        schema = QuerySchema.create().addSelect("id,orgId").addCondition((ConditionExpression)queryConditionGroup);
                        List list = MetaDaoHelper.query((String)"aa.custcategory.CustCategory", (QuerySchema)schema);
                        if (list == null || list.isEmpty()) {
                            errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408006D", (String)"\u7f16\u7801\u4e3a\uff1a%s\u7684\u5ba2\u6237\u5206\u7c7b\u4e0d\u5b58\u5728\uff0c\u8bf7\u68c0\u67e5\u8f93\u5165\u53c2\u6570\uff1b"), billOne.get("code").toString()));
                        } else {
                            billOne.put("id", Long.valueOf(((Map)list.get(0)).get("id").toString()));
                            billOne.put("orgId", ((Map)list.get(0)).get("orgId").toString());
                        }
                    }
                    if (billOne.containsKey("code") && billOne.get("code") != null) continue;
                    billOne.put("code", billOne.get("id").toString());
                }
                if (!"".equals(errorMessage)) {
                    throw new CoreDocBusinessException((String)errorMessage);
                }
                bill.setData(billList);
            } else if ("aa_salearealist".equals(bill.getBillnum())) {
                errorMessage = "";
                for (Object billOne : billList) {
                    if (!(billOne.containsKey("id") && billOne.get("id") != null || billOne.containsKey("code") && billOne.get("code") != null)) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800928);
                    }
                    if (billOne.containsKey("id") && billOne.get("id") != null) {
                        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(billOne.get("id"))});
                        schema = QuerySchema.create().addSelect("id,code").addCondition((ConditionExpression)queryConditionGroup);
                        List list = MetaDaoHelper.query((String)"aa.salearea.SaleArea", (QuerySchema)schema);
                        if (list == null || list.isEmpty()) {
                            errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080075", (String)"id\u4e3a\uff1a%s\u7684\u9500\u552e\u533a\u57df\u4e0d\u5b58\u5728\uff0c\u8bf7\u68c0\u67e5\u8f93\u5165\u53c2\u6570\uff1b"), billOne.get("id").toString()));
                        } else {
                            billOne.put("code", ((Map)list.get(0)).get("code").toString());
                        }
                    } else if (billOne.containsKey("code") && billOne.get("code") != null) {
                        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq(billOne.get("code"))});
                        schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)queryConditionGroup);
                        List list = MetaDaoHelper.query((String)"aa.salearea.SaleArea", (QuerySchema)schema);
                        if (list == null || list.isEmpty()) {
                            errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080078", (String)"\u7f16\u7801\u4e3a\uff1a%s\u7684\u9500\u552e\u533a\u57df\u4e0d\u5b58\u5728\uff0c\u8bf7\u68c0\u67e5\u8f93\u5165\u53c2\u6570\uff1b"), billOne.get("code").toString()));
                        } else {
                            billOne.put("id", Long.valueOf(((Map)list.get(0)).get("id").toString()));
                        }
                    }
                    if (billOne.containsKey("code") && billOne.get("code") != null) continue;
                    billOne.put("code", billOne.get("id").toString());
                }
                if (!"".equals(errorMessage)) {
                    throw new CoreDocBusinessException((String)errorMessage);
                }
                bill.setData(billList);
            } else if ("aa_customertradelist".equals(bill.getBillnum())) {
                errorMessage = "";
                for (Object billOne : billList) {
                    if (!(billOne.containsKey("id") && billOne.get("id") != null || billOne.containsKey("code") && billOne.get("code") != null)) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800929);
                    }
                    if (billOne.containsKey("id") && billOne.get("id") != null) {
                        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(billOne.get("id"))});
                        schema = QuerySchema.create().addSelect("id,code").addCondition((ConditionExpression)queryConditionGroup);
                        List list = MetaDaoHelper.query((String)"aa.customertrade.CustomerTrade", (QuerySchema)schema);
                        if (list == null || list.isEmpty()) {
                            errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080080", (String)"id\u4e3a\uff1a%s\u7684\u5ba2\u6237\u884c\u4e1a\u4e0d\u5b58\u5728\uff0c\u8bf7\u68c0\u67e5\u8f93\u5165\u53c2\u6570\uff1b"), billOne.get("id").toString()));
                        } else {
                            billOne.put("code", ((Map)list.get(0)).get("code").toString());
                        }
                    } else if (billOne.containsKey("code") && billOne.get("code") != null) {
                        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq(billOne.get("code"))});
                        schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)queryConditionGroup);
                        List list = MetaDaoHelper.query((String)"aa.customertrade.CustomerTrade", (QuerySchema)schema);
                        if (list == null || list.isEmpty()) {
                            errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080081", (String)"\u7f16\u7801\u4e3a\uff1a%s\u7684\u5ba2\u6237\u884c\u4e1a\u4e0d\u5b58\u5728\uff0c\u8bf7\u68c0\u67e5\u8f93\u5165\u53c2\u6570\uff1b"), billOne.get("code").toString()));
                        } else {
                            billOne.put("id", Long.valueOf(((Map)list.get(0)).get("id").toString()));
                        }
                    }
                    if (billOne.containsKey("code") && billOne.get("code") != null) continue;
                    billOne.put("code", billOne.get("id").toString());
                }
                if (!"".equals(errorMessage)) {
                    throw new CoreDocBusinessException((String)errorMessage);
                }
                bill.setData(billList);
            } else if ("aa_cuslevellist".equals(bill.getBillnum())) {
                errorMessage = "";
                for (Object billOne : billList) {
                    if (!(billOne.containsKey("id") && billOne.get("id") != null || billOne.containsKey("code") && billOne.get("code") != null)) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800930);
                    }
                    if (billOne.containsKey("id") && billOne.get("id") != null) {
                        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(billOne.get("id"))});
                        schema = QuerySchema.create().addSelect("id,code").addCondition((ConditionExpression)queryConditionGroup);
                        List list = MetaDaoHelper.query((String)"aa.agentlevel.AgentLevel", (QuerySchema)schema);
                        if (list == null || list.isEmpty()) {
                            errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408008A", (String)"id\u4e3a\uff1a%s\u7684\u5ba2\u6237\u7ea7\u522b\u4e0d\u5b58\u5728\uff0c\u8bf7\u68c0\u67e5\u8f93\u5165\u53c2\u6570\uff1b"), billOne.get("id").toString()));
                        } else {
                            billOne.put("code", ((Map)list.get(0)).get("code").toString());
                        }
                    } else if (billOne.containsKey("code") && billOne.get("code") != null) {
                        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq(billOne.get("code"))});
                        schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)queryConditionGroup);
                        List list = MetaDaoHelper.query((String)"aa.agentlevel.AgentLevel", (QuerySchema)schema);
                        if (list == null || list.isEmpty()) {
                            errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408008E", (String)"\u7f16\u7801\u4e3a\uff1a%s\u7684\u5ba2\u6237\u7ea7\u522b\u4e0d\u5b58\u5728\uff0c\u8bf7\u68c0\u67e5\u8f93\u5165\u53c2\u6570\uff1b"), billOne.get("code").toString()));
                        } else {
                            billOne.put("id", Long.valueOf(((Map)list.get(0)).get("id").toString()));
                        }
                    }
                    if (billOne.containsKey("code") && billOne.get("code") != null) continue;
                    billOne.put("code", billOne.get("id").toString());
                }
                if (!"".equals(errorMessage)) {
                    throw new CoreDocBusinessException((String)errorMessage);
                }
                bill.setData(billList);
            } else if ("aa_customerTypelist".equals(bill.getBillnum())) {
                errorMessage = "";
                for (Object billOne : billList) {
                    if (!(billOne.containsKey("id") && billOne.get("id") != null || billOne.containsKey("code") && billOne.get("code") != null)) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800931);
                    }
                    if (billOne.containsKey("id") && billOne.get("id") != null) {
                        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(billOne.get("id"))});
                        schema = QuerySchema.create().addSelect("id,code").addCondition((ConditionExpression)queryConditionGroup);
                        List list = MetaDaoHelper.query((String)"aa.customertype.CustomerType", (QuerySchema)schema);
                        if (list == null || list.isEmpty()) {
                            errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080053", (String)"id\u4e3a\uff1a%s\u7684\u9500\u552e\u6e20\u9053\u4e0d\u5b58\u5728\uff0c\u8bf7\u68c0\u67e5\u8f93\u5165\u53c2\u6570\uff1b"), billOne.get("id").toString()));
                        } else {
                            billOne.put("code", ((Map)list.get(0)).get("code").toString());
                        }
                    } else if (billOne.containsKey("code") && billOne.get("code") != null) {
                        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq(billOne.get("code"))});
                        schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)queryConditionGroup);
                        List list = MetaDaoHelper.query((String)"aa.customertype.CustomerType", (QuerySchema)schema);
                        if (list == null || list.isEmpty()) {
                            errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080058", (String)"\u7f16\u7801\u4e3a\uff1a%s\u7684\u9500\u552e\u6e20\u9053\u4e0d\u5b58\u5728\uff0c\u8bf7\u68c0\u67e5\u8f93\u5165\u53c2\u6570\uff1b"), billOne.get("code").toString()));
                        } else {
                            billOne.put("id", Long.valueOf(((Map)list.get(0)).get("id").toString()));
                        }
                    }
                    if (billOne.containsKey("code") && billOne.get("code") != null) continue;
                    billOne.put("code", billOne.get("id").toString());
                }
                if (!"".equals(errorMessage)) {
                    throw new CoreDocBusinessException((String)errorMessage);
                }
                bill.setData(billList);
            }
        }
        if ("aa_merchantlist".equals(bill.getBillnum()) && "addmerchantsuitorg".equals(action)) {
            if (billList.size() > 100) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800932, new Object[]{dealNumOneTime});
            }
            errorMessage = "";
            for (Object billOne : billList) {
                if (!billOne.containsKey(MERCHANT_ID) || billOne.get(MERCHANT_ID) == null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800933);
                }
                if (!billOne.containsKey("orgIds") || billOne.get("orgIds") == null || ((List)billOne.get("orgIds")).size() < 1) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800934);
                }
                if (!billOne.containsKey("createOrgId") || billOne.get("createOrgId") == null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800935);
                }
                billOne.put("id", billOne.get(MERCHANT_ID).toString());
                if (billOne.get("merchantApplyRangeId") != null) continue;
                QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)MERCHANT_ID).eq(billOne.get(MERCHANT_ID)), QueryCondition.name((String)"orgId").eq(billOne.get("createOrgId")), QueryCondition.name((String)"isPotential").eq((Object)false)});
                schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)queryConditionGroup);
                List list = MetaDaoHelper.query((String)"aa.merchant.MerchantApplyRange", (QuerySchema)schema);
                if (list != null && !list.isEmpty()) {
                    billOne.put("merchantApplyRangeId", ((Map)list.get(0)).get("id").toString());
                    continue;
                }
                errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408008B", (String)"\u8be5\u5ba2\u6237\u672a\u5206\u914d\u7ed9\u8be5\u7ec4\u7ec7\uff0c\u5ba2\u6237id\uff1a%s\uff0c\u7ec4\u7ec7id\uff1a%s\uff0c\u8bf7\u68c0\u67e5\u4f20\u53c2\u662f\u5426\u6b63\u786e\uff1b"), billOne.get(MERCHANT_ID).toString(), billOne.get("createOrgId").toString()));
            }
            if (!"".equals(errorMessage)) {
                throw new CoreDocBusinessException(errorMessage);
            }
            bill.setData(billList);
        }
        if ("pc_productlist".equals(bill.getBillnum()) && "addprosuitorg".equals(action)) {
            if (billList.size() > 100) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800932, new Object[]{dealNumOneTime});
            }
            errorMessage = "";
            for (Object billOne : billList) {
                if (!billOne.containsKey("productId") || billOne.get("productId") == null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800933);
                }
                if (!billOne.containsKey("orgIds") || billOne.get("orgIds") == null || ((List)billOne.get("orgIds")).size() < 1) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800934);
                }
                if (!billOne.containsKey("createOrgId") || billOne.get("createOrgId") == null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800935);
                }
                QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq(billOne.get("productId")), QueryCondition.name((String)"orgId").eq(billOne.get("createOrgId"))});
                schema = QuerySchema.create().addSelect("id,isCreator").addCondition((ConditionExpression)queryConditionGroup);
                List list = MetaDaoHelper.query((String)"pc.product.ProductApplyRange", (QuerySchema)schema);
                if (list != null && !list.isEmpty()) {
                    billOne.put("productApplyRangeId", Long.valueOf(((Map)list.get(0)).get("id").toString()));
                    billOne.put("isCreator", Boolean.valueOf((Boolean)((Map)list.get(0)).get("isCreator")));
                    continue;
                }
                errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408004E", (String)"\u8be5\u7269\u6599\u672a\u5206\u914d\u7ed9\u8be5\u7ec4\u7ec7\uff0c\u7269\u6599id\uff1a%s\uff0c\u7ec4\u7ec7id\uff1a%s\uff0c\u8bf7\u68c0\u67e5\u4f20\u53c2\u662f\u5426\u6b63\u786e\uff1b"), billOne.get("productId").toString(), billOne.get("createOrgId").toString()));
            }
            if (!"".equals(errorMessage)) {
                throw new CoreDocBusinessException((String)errorMessage);
            }
            bill.setData(billList);
        }
        if ("pc_product".equals(bill.getBillnum()) && ("unshelve".equals(action) || "shelve".equals(action))) {
            if (billList.size() > 100) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800932, new Object[]{dealNumOneTime});
            }
            errorMessage = "";
            for (Object billOne : billList) {
                if (!(billOne.containsKey("productId") && billOne.get("productId") != null || billOne.containsKey("productCode") && billOne.get("productCode") != null)) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800936);
                }
                if (billOne.containsKey("productId") && billOne.get("productId") != null) {
                    if (billOne.containsKey("orgId") && billOne.get("orgId") != null) {
                        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq(billOne.get("productId")), QueryCondition.name((String)"orgId").eq(billOne.get("orgId"))});
                        schema = QuerySchema.create().addSelect("id,isCreator").addCondition((ConditionExpression)queryConditionGroup);
                        List list = MetaDaoHelper.query((String)"pc.product.ProductApplyRange", (QuerySchema)schema);
                        if (list != null && !list.isEmpty()) {
                            billOne.put("id", Long.valueOf(billOne.get("productId").toString()));
                            billOne.put("productApplyRangeId", Long.valueOf(((Map)list.get(0)).get("id").toString()));
                            billOne.put("isCreator", Boolean.valueOf((Boolean)((Map)list.get(0)).get("isCreator")));
                            continue;
                        }
                        errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408004E", (String)"\u8be5\u7269\u6599\u672a\u5206\u914d\u7ed9\u8be5\u7ec4\u7ec7\uff0c\u7269\u6599id\uff1a%s\uff0c\u7ec4\u7ec7id\uff1a%s\uff0c\u8bf7\u68c0\u67e5\u4f20\u53c2\u662f\u5426\u6b63\u786e\uff1b"), billOne.get("productId").toString(), billOne.get("orgId").toString()));
                        continue;
                    }
                    QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq(billOne.get("productId")), QueryCondition.name((String)"isCreator").eq((Object)true)});
                    schema = QuerySchema.create().addSelect("id,isCreator").addCondition((ConditionExpression)queryConditionGroup);
                    List list = MetaDaoHelper.query((String)"pc.product.ProductApplyRange", (QuerySchema)schema);
                    if (list != null && !list.isEmpty()) {
                        billOne.put("id", Long.valueOf(billOne.get("productId").toString()));
                        billOne.put("productApplyRangeId", Long.valueOf(((Map)list.get(0)).get("id").toString()));
                        billOne.put("isCreator", Boolean.valueOf((Boolean)((Map)list.get(0)).get("isCreator")));
                        continue;
                    }
                    errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040800BF", (String)"\u8be5\u7269\u6599\u672a\u5206\u914d\u521b\u5efa\u7ec4\u7ec7\uff0c\u7269\u6599id\uff1a%s\uff0c\u8bf7\u68c0\u67e5\u4f20\u53c2\u662f\u5426\u6b63\u786e\uff1b"), billOne.get("productId").toString()));
                    continue;
                }
                if (!billOne.containsKey("productCode") || billOne.get("productCode") == null) continue;
                if (billOne.containsKey("orgId") && billOne.get("orgId") != null) {
                    QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId.code").eq(billOne.get("productCode")), QueryCondition.name((String)"orgId").eq(billOne.get("orgId"))});
                    schema = QuerySchema.create().addSelect("productId,id,isCreator").addCondition((ConditionExpression)queryConditionGroup);
                    List list = MetaDaoHelper.query((String)"pc.product.ProductApplyRange", (QuerySchema)schema);
                    if (list != null && !list.isEmpty()) {
                        billOne.put("id", Long.valueOf(((Map)list.get(0)).get("productId").toString()));
                        billOne.put("productApplyRangeId", Long.valueOf(((Map)list.get(0)).get("id").toString()));
                        billOne.put("isCreator", Boolean.valueOf((Boolean)((Map)list.get(0)).get("isCreator")));
                        continue;
                    }
                    errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040800C3", (String)"\u8be5\u7269\u6599\u672a\u5206\u914d\u7ed9\u8be5\u7ec4\u7ec7\uff0c\u7269\u6599\u7f16\u7801\uff1a%s\uff0c\u7ec4\u7ec7id\uff1a%s\uff0c\u8bf7\u68c0\u67e5\u4f20\u53c2\u662f\u5426\u6b63\u786e\uff1b"), billOne.get("productCode").toString(), billOne.get("orgId").toString()));
                    continue;
                }
                QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId.code").eq(billOne.get("productCode")), QueryCondition.name((String)"isCreator").eq((Object)true)});
                schema = QuerySchema.create().addSelect("productId,id,isCreator").addCondition((ConditionExpression)queryConditionGroup);
                List list = MetaDaoHelper.query((String)"pc.product.ProductApplyRange", (QuerySchema)schema);
                if (list != null && !list.isEmpty()) {
                    billOne.put("id", Long.valueOf(((Map)list.get(0)).get("productId").toString()));
                    billOne.put("productApplyRangeId", Long.valueOf(((Map)list.get(0)).get("id").toString()));
                    billOne.put("isCreator", Boolean.valueOf((Boolean)((Map)list.get(0)).get("isCreator")));
                    continue;
                }
                errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040800C7", (String)"\u8be5\u7269\u6599\u672a\u5206\u914d\u521b\u5efa\u7ec4\u7ec7\uff0c\u7269\u6599\u7f16\u7801\uff1a%s\uff0c\u8bf7\u68c0\u67e5\u4f20\u53c2\u662f\u5426\u6b63\u786e\uff1b"), billOne.get("productCode").toString()));
            }
            if (!"".equals(errorMessage)) {
                throw new CoreDocBusinessException((String)errorMessage);
            }
            bill.setData(billList);
        }
        if ("batchtag".equals(action) || "batchcleartag".equals(action)) {
            if (billList.size() > 100) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800937, new Object[]{dealNumOneTime});
            }
            if ("pc_product".equals(bill.getBillnum())) {
                errorMessage = "";
                for (Object billOne : billList) {
                    if (!billOne.containsKey("productId") || billOne.get("productId") == null) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800938);
                    }
                    if (!billOne.containsKey("orgId") || billOne.get("orgId") == null) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800919);
                    }
                    if (!billOne.containsKey("tags")) {
                        ArrayList arrayList = new ArrayList();
                        billOne.put("tags", arrayList);
                    }
                    billOne.put("id", Long.valueOf(billOne.get("productId").toString()));
                    QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq(billOne.get("productId")), QueryCondition.name((String)"orgId").eq(billOne.get("orgId"))});
                    schema = QuerySchema.create().addSelect("id,isCreator").addCondition((ConditionExpression)queryConditionGroup);
                    List list = MetaDaoHelper.query((String)"pc.product.ProductApplyRange", (QuerySchema)schema);
                    if (list != null && !list.isEmpty()) {
                        billOne.put("productApplyRangeId", Long.valueOf(((Map)list.get(0)).get("id").toString()));
                        billOne.put("isCreator", Boolean.valueOf((Boolean)((Map)list.get(0)).get("isCreator")));
                        if (!"batchtag".equals(action) || !billOne.containsKey("tags") || billOne.get("tags") == null || ((List)billOne.get("tags")).size() <= 0) continue;
                        QueryConditionGroup queryConditionGroup17 = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq((Object)billOne.get("productId").toString()), QueryCondition.name((String)"productApplyRangeId").eq((Object)((Map)list.get(0)).get("id").toString())});
                        schema = QuerySchema.create().addSelect("tagId.id,tagId.tag_position").addCondition((ConditionExpression)queryConditionGroup17);
                        List tempSKUTags = new ArrayList();
                        tempSKUTags = MetaDaoHelper.query((String)"pc.product.ProductTagNew", (QuerySchema)schema);
                        Date date = new Date();
                        String today = new SimpleDateFormat("yyyy-MM-dd").format(date);
                        ArrayList<String> topLeft = new ArrayList<String>();
                        ArrayList<String> topRight = new ArrayList<String>();
                        ArrayList<String> bottomLeft = new ArrayList<String>();
                        ArrayList<String> arrayList = new ArrayList<String>();
                        for (String string : (List)billOne.get("tags")) {
                            QueryConditionGroup queryConditionGroup18 = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)string)});
                            schema = QuerySchema.create().addSelect("id,tag_position,dEndTime,stopstatus").addCondition((ConditionExpression)queryConditionGroup18);
                            List tempTags = MetaDaoHelper.query((String)"pc.tag.Tag", (QuerySchema)schema);
                            if (tempTags != null && !tempTags.isEmpty()) {
                                if (((Boolean)((Map)tempTags.get(0)).get("stopstatus")).booleanValue()) {
                                    errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080064", (String)"\u6807\u7b7eid\uff1a%s\u5bf9\u5e94\u6807\u7b7e\u5df2\u505c\u7528\uff0c\u65e0\u6cd5\u8fdb\u884c\u8bbe\u7f6e\u64cd\u4f5c\uff1b"), string));
                                    continue;
                                }
                                if (((Map)tempTags.get(0)).get("dEndTime") != null && today.compareTo(((Map)tempTags.get(0)).get("dEndTime").toString()) > 0) {
                                    errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080066", (String)"\u6807\u7b7eid\uff1a%s\u5bf9\u5e94\u6807\u7b7e\uff0c\u7ed3\u675f\u65e5\u671f\u5728\u4eca\u65e5\u4e4b\u524d\uff0c\u65e0\u6cd5\u8fdb\u884c\u8bbe\u7f6e\u64cd\u4f5c\uff1b"), string));
                                    continue;
                                }
                                if (((Map)tempTags.get(0)).get("tag_position") == null) continue;
                                if ("1".equals(((Map)tempTags.get(0)).get("tag_position").toString())) {
                                    topLeft.add(string);
                                    continue;
                                }
                                if ("2".equals(((Map)tempTags.get(0)).get("tag_position").toString())) {
                                    topRight.add(string);
                                    continue;
                                }
                                if ("3".equals(((Map)tempTags.get(0)).get("tag_position").toString())) {
                                    bottomLeft.add(string);
                                    continue;
                                }
                                if (!"4".equals(((Map)tempTags.get(0)).get("tag_position").toString())) continue;
                                arrayList.add(string);
                                continue;
                            }
                            errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080070", (String)"\u672a\u627e\u5230\u6807\u7b7eid\uff1a%s\u5bf9\u5e94\u6807\u7b7e\uff0c\u8bf7\u68c0\u67e5\u4f20\u53c2\u662f\u5426\u6b63\u786e\uff1b"), string));
                        }
                        if (topLeft.size() > 1) {
                            errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080071", (String)"\u6240\u4f20\u6807\u7b7eid\uff1a%s\u5bf9\u5e94\u6807\u7b7e\u4f4d\u7f6e\u91cd\u590d\uff0c\u8bf7\u68c0\u67e5\u4f20\u53c2\u662f\u5426\u6b63\u786e\uff1b"), ((Object)topLeft).toString()));
                        }
                        if (topRight.size() > 1) {
                            errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080071", (String)"\u6240\u4f20\u6807\u7b7eid\uff1a%s\u5bf9\u5e94\u6807\u7b7e\u4f4d\u7f6e\u91cd\u590d\uff0c\u8bf7\u68c0\u67e5\u4f20\u53c2\u662f\u5426\u6b63\u786e\uff1b"), ((Object)topRight).toString()));
                        }
                        if (bottomLeft.size() > 1) {
                            errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080071", (String)"\u6240\u4f20\u6807\u7b7eid\uff1a%s\u5bf9\u5e94\u6807\u7b7e\u4f4d\u7f6e\u91cd\u590d\uff0c\u8bf7\u68c0\u67e5\u4f20\u53c2\u662f\u5426\u6b63\u786e\uff1b"), ((Object)bottomLeft).toString()));
                        }
                        if (arrayList.size() > 1) {
                            errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080071", (String)"\u6240\u4f20\u6807\u7b7eid\uff1a%s\u5bf9\u5e94\u6807\u7b7e\u4f4d\u7f6e\u91cd\u590d\uff0c\u8bf7\u68c0\u67e5\u4f20\u53c2\u662f\u5426\u6b63\u786e\uff1b"), ((Object)arrayList).toString()));
                        }
                        if (tempSKUTags == null || tempSKUTags.isEmpty()) continue;
                        for (Map map9 : tempSKUTags) {
                            if (map9.get("tagId_tag_position") != null && "1".equals(map9.get("tagId_tag_position").toString()) && topLeft.size() > 0) {
                                errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080045", (String)"\u7269\u6599\u6863\u6848\u5df2\u5b58\u5728\u6807\u7b7eid\uff1a%s\u5bf9\u5e94\u4f4d\u7f6e\u6807\u7b7e\uff0c\u540c\u4e00\u4f4d\u7f6e\u8bf7\u52ff\u91cd\u590d\u8bbe\u7f6e\uff1b"), ((Object)topLeft).toString()));
                            }
                            if (map9.get("tagId_tag_position") != null && "2".equals(map9.get("tagId_tag_position").toString()) && topRight.size() > 0) {
                                errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080045", (String)"\u7269\u6599\u6863\u6848\u5df2\u5b58\u5728\u6807\u7b7eid\uff1a%s\u5bf9\u5e94\u4f4d\u7f6e\u6807\u7b7e\uff0c\u540c\u4e00\u4f4d\u7f6e\u8bf7\u52ff\u91cd\u590d\u8bbe\u7f6e\uff1b"), ((Object)topRight).toString()));
                            }
                            if (map9.get("tagId_tag_position") != null && "3".equals(map9.get("tagId_tag_position").toString()) && bottomLeft.size() > 0) {
                                errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080045", (String)"\u7269\u6599\u6863\u6848\u5df2\u5b58\u5728\u6807\u7b7eid\uff1a%s\u5bf9\u5e94\u4f4d\u7f6e\u6807\u7b7e\uff0c\u540c\u4e00\u4f4d\u7f6e\u8bf7\u52ff\u91cd\u590d\u8bbe\u7f6e\uff1b"), ((Object)bottomLeft).toString()));
                            }
                            if (map9.get("tagId_tag_position") == null || !"4".equals(map9.get("tagId_tag_position").toString()) || arrayList.size() <= 0) continue;
                            errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080045", (String)"\u7269\u6599\u6863\u6848\u5df2\u5b58\u5728\u6807\u7b7eid\uff1a%s\u5bf9\u5e94\u4f4d\u7f6e\u6807\u7b7e\uff0c\u540c\u4e00\u4f4d\u7f6e\u8bf7\u52ff\u91cd\u590d\u8bbe\u7f6e\uff1b"), ((Object)arrayList).toString()));
                        }
                        continue;
                    }
                    errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408004E", (String)"\u8be5\u7269\u6599\u672a\u5206\u914d\u7ed9\u8be5\u7ec4\u7ec7\uff0c\u7269\u6599id\uff1a%s\uff0c\u7ec4\u7ec7id\uff1a%s\uff0c\u8bf7\u68c0\u67e5\u4f20\u53c2\u662f\u5426\u6b63\u786e\uff1b"), billOne.get("productId").toString(), billOne.get("orgId").toString()));
                }
                if (!"".equals(errorMessage)) {
                    throw new CoreDocBusinessException((String)errorMessage);
                }
                bill.setData(billList);
            } else if ("pc_goodsproductskuprolist".equals(bill.getBillnum())) {
                errorMessage = "";
                for (Object billOne : billList) {
                    if (!billOne.containsKey("skuId") || billOne.get("skuId") == null) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800939);
                    }
                    if (!billOne.containsKey("orgId") || billOne.get("orgId") == null) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800919);
                    }
                    billOne.put("id", Long.valueOf(billOne.get("skuId").toString()));
                    QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(billOne.get("skuId"))});
                    schema = QuerySchema.create().addSelect("productId").addCondition((ConditionExpression)queryConditionGroup);
                    List list = MetaDaoHelper.query((String)"pc.product.ProductSKU", (QuerySchema)schema);
                    if (list != null && !list.isEmpty()) {
                        QueryConditionGroup queryConditionGroup19 = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq((Object)((Map)list.get(0)).get("productId").toString()), QueryCondition.name((String)"orgId").eq(billOne.get("orgId"))});
                        schema = QuerySchema.create().addSelect("id,isCreator").addCondition((ConditionExpression)queryConditionGroup19);
                        productApplyRange = MetaDaoHelper.query((String)"pc.product.ProductApplyRange", (QuerySchema)schema);
                        if (!productApplyRange.isEmpty() && productApplyRange != null) {
                            billOne.put("productApplyRangeId", Long.valueOf(((Map)productApplyRange.get(0)).get("id").toString()));
                            billOne.put("isCreator", Boolean.valueOf((Boolean)((Map)productApplyRange.get(0)).get("isCreator")));
                            if (!"batchtag".equals(action) || !billOne.containsKey("tags") || billOne.get("tags") == null || ((List)billOne.get("tags")).size() <= 0) continue;
                            QueryConditionGroup queryConditionGroup20 = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"skuId").eq((Object)billOne.get("skuId").toString()), QueryCondition.name((String)"productApplyRangeId").eq((Object)((Map)productApplyRange.get(0)).get("id").toString())});
                            schema = QuerySchema.create().addSelect("tagId.id,tagId.tag_position").addCondition((ConditionExpression)queryConditionGroup20);
                            List tempSKUTags = new ArrayList();
                            tempSKUTags = MetaDaoHelper.query((String)"pc.product.SkuTagNew", (QuerySchema)schema);
                            Date date = new Date();
                            String today = new SimpleDateFormat("yyyy-MM-dd").format(date);
                            ArrayList<String> topLeft = new ArrayList<String>();
                            ArrayList<String> topRight = new ArrayList<String>();
                            ArrayList<String> arrayList = new ArrayList<String>();
                            ArrayList<String> bottomRight = new ArrayList<String>();
                            for (String tagId : (List)billOne.get("tags")) {
                                QueryConditionGroup queryConditionGroup21 = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)tagId)});
                                schema = QuerySchema.create().addSelect("id,tag_position,dEndTime,stopstatus").addCondition((ConditionExpression)queryConditionGroup21);
                                List tempTags = MetaDaoHelper.query((String)"pc.tag.Tag", (QuerySchema)schema);
                                if (tempTags != null && !tempTags.isEmpty()) {
                                    if (((Boolean)((Map)tempTags.get(0)).get("stopstatus")).booleanValue()) {
                                        errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080064", (String)"\u6807\u7b7eid\uff1a%s\u5bf9\u5e94\u6807\u7b7e\u5df2\u505c\u7528\uff0c\u65e0\u6cd5\u8fdb\u884c\u8bbe\u7f6e\u64cd\u4f5c\uff1b"), tagId));
                                        continue;
                                    }
                                    if (((Map)tempTags.get(0)).get("dEndTime") != null && today.compareTo(((Map)tempTags.get(0)).get("dEndTime").toString()) > 0) {
                                        errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080066", (String)"\u6807\u7b7eid\uff1a%s\u5bf9\u5e94\u6807\u7b7e\uff0c\u7ed3\u675f\u65e5\u671f\u5728\u4eca\u65e5\u4e4b\u524d\uff0c\u65e0\u6cd5\u8fdb\u884c\u8bbe\u7f6e\u64cd\u4f5c\uff1b"), tagId));
                                        continue;
                                    }
                                    if (((Map)tempTags.get(0)).get("tag_position") == null) continue;
                                    if ("1".equals(((Map)tempTags.get(0)).get("tag_position").toString())) {
                                        topLeft.add(tagId);
                                        continue;
                                    }
                                    if ("2".equals(((Map)tempTags.get(0)).get("tag_position").toString())) {
                                        topRight.add(tagId);
                                        continue;
                                    }
                                    if ("3".equals(((Map)tempTags.get(0)).get("tag_position").toString())) {
                                        arrayList.add(tagId);
                                        continue;
                                    }
                                    if (!"4".equals(((Map)tempTags.get(0)).get("tag_position").toString())) continue;
                                    bottomRight.add(tagId);
                                    continue;
                                }
                                errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080070", (String)"\u672a\u627e\u5230\u6807\u7b7eid\uff1a%s\u5bf9\u5e94\u6807\u7b7e\uff0c\u8bf7\u68c0\u67e5\u4f20\u53c2\u662f\u5426\u6b63\u786e\uff1b"), tagId));
                            }
                            if (topLeft.size() > 1) {
                                errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080071", (String)"\u6240\u4f20\u6807\u7b7eid\uff1a%s\u5bf9\u5e94\u6807\u7b7e\u4f4d\u7f6e\u91cd\u590d\uff0c\u8bf7\u68c0\u67e5\u4f20\u53c2\u662f\u5426\u6b63\u786e\uff1b"), ((Object)topLeft).toString()));
                            }
                            if (topRight.size() > 1) {
                                errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080071", (String)"\u6240\u4f20\u6807\u7b7eid\uff1a%s\u5bf9\u5e94\u6807\u7b7e\u4f4d\u7f6e\u91cd\u590d\uff0c\u8bf7\u68c0\u67e5\u4f20\u53c2\u662f\u5426\u6b63\u786e\uff1b"), ((Object)topRight).toString()));
                            }
                            if (arrayList.size() > 1) {
                                errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080071", (String)"\u6240\u4f20\u6807\u7b7eid\uff1a%s\u5bf9\u5e94\u6807\u7b7e\u4f4d\u7f6e\u91cd\u590d\uff0c\u8bf7\u68c0\u67e5\u4f20\u53c2\u662f\u5426\u6b63\u786e\uff1b"), ((Object)arrayList).toString()));
                            }
                            if (bottomRight.size() > 1) {
                                errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080071", (String)"\u6240\u4f20\u6807\u7b7eid\uff1a%s\u5bf9\u5e94\u6807\u7b7e\u4f4d\u7f6e\u91cd\u590d\uff0c\u8bf7\u68c0\u67e5\u4f20\u53c2\u662f\u5426\u6b63\u786e\uff1b"), ((Object)bottomRight).toString()));
                            }
                            if (tempSKUTags == null || tempSKUTags.isEmpty()) continue;
                            for (Map tempSKUTag : tempSKUTags) {
                                if (tempSKUTag.get("tagId_tag_position") != null && "1".equals(tempSKUTag.get("tagId_tag_position").toString()) && topLeft.size() > 0) {
                                    errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080076", (String)"\u8d27\u54c1\u5df2\u5b58\u5728\u6807\u7b7eid\uff1a%s\u5bf9\u5e94\u4f4d\u7f6e\u6807\u7b7e\uff0c\u540c\u4e00\u4f4d\u7f6e\u8bf7\u52ff\u91cd\u590d\u8bbe\u7f6e\uff1b"), ((Object)topLeft).toString()));
                                }
                                if (tempSKUTag.get("tagId_tag_position") != null && "2".equals(tempSKUTag.get("tagId_tag_position").toString()) && topRight.size() > 0) {
                                    errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080076", (String)"\u8d27\u54c1\u5df2\u5b58\u5728\u6807\u7b7eid\uff1a%s\u5bf9\u5e94\u4f4d\u7f6e\u6807\u7b7e\uff0c\u540c\u4e00\u4f4d\u7f6e\u8bf7\u52ff\u91cd\u590d\u8bbe\u7f6e\uff1b"), ((Object)topRight).toString()));
                                }
                                if (tempSKUTag.get("tagId_tag_position") != null && "3".equals(tempSKUTag.get("tagId_tag_position").toString()) && arrayList.size() > 0) {
                                    errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080076", (String)"\u8d27\u54c1\u5df2\u5b58\u5728\u6807\u7b7eid\uff1a%s\u5bf9\u5e94\u4f4d\u7f6e\u6807\u7b7e\uff0c\u540c\u4e00\u4f4d\u7f6e\u8bf7\u52ff\u91cd\u590d\u8bbe\u7f6e\uff1b"), ((Object)arrayList).toString()));
                                }
                                if (tempSKUTag.get("tagId_tag_position") == null || !"4".equals(tempSKUTag.get("tagId_tag_position").toString()) || bottomRight.size() <= 0) continue;
                                errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080076", (String)"\u8d27\u54c1\u5df2\u5b58\u5728\u6807\u7b7eid\uff1a%s\u5bf9\u5e94\u4f4d\u7f6e\u6807\u7b7e\uff0c\u540c\u4e00\u4f4d\u7f6e\u8bf7\u52ff\u91cd\u590d\u8bbe\u7f6e\uff1b"), ((Object)bottomRight).toString()));
                            }
                            continue;
                        }
                        errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408007E", (String)"\u672a\u627e\u5230\u8be5\u7ec4\u7ec7\u5bf9\u5e94\u7269\u6599\uff0c\u7ec4\u7ec7id\uff1a%s\uff0c\u8bf7\u68c0\u67e5\u4f20\u53c2\u662f\u5426\u6b63\u786e\uff1b"), billOne.get("orgId").toString()));
                        continue;
                    }
                    errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408007F", (String)"\u672a\u627e\u5230\u8be5\u8d27\u54c1\uff0c\u8d27\u54c1id\uff1a%s,\u8bf7\u68c0\u67e5\u4f20\u53c2\u662f\u5426\u6b63\u786e\uff1b"), billOne.get("skuId").toString()));
                }
                if (!"".equals(errorMessage)) {
                    throw new CoreDocBusinessException((String)errorMessage);
                }
                bill.setData(billList);
            }
        }
        if ("unstop".equals(action) || "stop".equals(action)) {
            if (billList.size() > 100) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800940, new Object[]{dealNumOneTime});
            }
            if ("aa_merchant".equals(bill.getBillnum())) {
                errorMessage = "";
                for (Object billOne : billList) {
                    this.setMerchantIdByCode((Map<String, Object>)billOne);
                    this.setOrgIdByCode((Map<String, Object>)billOne);
                    if (!billOne.containsKey(MERCHANT_ID) || billOne.get(MERCHANT_ID) == null) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800933);
                    }
                    if (!billOne.containsKey("orgId") || billOne.get("orgId") == null) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800919);
                    }
                    billOne.put("id", billOne.get(MERCHANT_ID).toString());
                    QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)MERCHANT_ID).eq(billOne.get(MERCHANT_ID)), QueryCondition.name((String)"orgId").eq(billOne.get("orgId")), QueryCondition.name((String)"isPotential").eq((Object)false)});
                    schema = QuerySchema.create().addSelect("id,isCreator").addCondition((ConditionExpression)queryConditionGroup);
                    List list = MetaDaoHelper.query((String)"aa.merchant.MerchantApplyRange", (QuerySchema)schema);
                    if (!list.isEmpty() && list != null) {
                        billOne.put("merchantApplyRangeId", ((Map)list.get(0)).get("id").toString());
                        billOne.put("isCreator", Boolean.valueOf((Boolean)((Map)list.get(0)).get("isCreator")));
                        continue;
                    }
                    if (billOne.get(MERCHANT_CODE) != null && billOne.get(ORG_CODE) != null) {
                        errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_202108BA04280008", (String)"\u8be5\u5ba2\u6237\u672a\u5206\u914d\u7ed9\u8be5\u7ec4\u7ec7\uff0c\u5ba2\u6237\u7f16\u7801\uff1a%s\uff0c\u7ec4\u7ec7\u7f16\u7801\uff1a%s\uff0c\u8bf7\u68c0\u67e5\u4f20\u53c2\u662f\u5426\u6b63\u786e\uff1b"), billOne.get(MERCHANT_CODE).toString(), billOne.get(ORG_CODE).toString()));
                        continue;
                    }
                    errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408008B", (String)"\u8be5\u5ba2\u6237\u672a\u5206\u914d\u7ed9\u8be5\u7ec4\u7ec7\uff0c\u5ba2\u6237id\uff1a%s\uff0c\u7ec4\u7ec7id\uff1a%s\uff0c\u8bf7\u68c0\u67e5\u4f20\u53c2\u662f\u5426\u6b63\u786e\uff1b"), billOne.get(MERCHANT_ID).toString(), billOne.get("orgId").toString()));
                }
                if (!"".equals(errorMessage)) {
                    throw new CoreDocBusinessException((String)errorMessage);
                }
                bill.setData(billList);
            } else if ("pc_product".equals(bill.getBillnum())) {
                errorMessage = "";
                for (Object billOne : billList) {
                    this.setProductIdByCode((Map<String, Object>)billOne);
                    this.setOrgIdByCode((Map<String, Object>)billOne);
                    if (!billOne.containsKey("productId") || billOne.get("productId") == null) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800938);
                    }
                    if (!billOne.containsKey("orgId") || billOne.get("orgId") == null) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800919);
                    }
                    if (!billOne.containsKey("enablesku") || billOne.get("enablesku") == null) {
                        if ("unstop".equals(action)) {
                            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800941);
                        }
                        billOne.put("enablesku", false);
                    }
                    billOne.put("id", Long.valueOf(billOne.get("productId").toString()));
                    QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq(billOne.get("productId")), QueryCondition.name((String)"orgId").eq((Object)billOne.get("orgId").toString())});
                    schema = QuerySchema.create().addSelect("id,isCreator").addCondition((ConditionExpression)queryConditionGroup);
                    List list = MetaDaoHelper.query((String)"pc.product.ProductApplyRange", (QuerySchema)schema);
                    if (list != null && !list.isEmpty()) {
                        billOne.put("productApplyRangeId", ((Map)list.get(0)).get("id").toString());
                        billOne.put("isCreator", Boolean.valueOf((Boolean)((Map)list.get(0)).get("isCreator")));
                        continue;
                    }
                    if (billOne.get("productCode") != null && billOne.get(ORG_CODE) != null) {
                        errorMessage = String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_20291C6804780009", (String)"\u8be5\u7269\u6599\u672a\u5206\u914d\u7ed9\u8be5\u7ec4\u7ec7\uff0c\u7269\u6599\u7f16\u7801\uff1a%s\uff0c\u7ec4\u7ec7\u7f16\u7801\uff1a%s\uff0c\u8bf7\u68c0\u67e5\u4f20\u53c2\u662f\u5426\u6b63\u786e\uff1b"), billOne.get("productCode").toString(), billOne.get(ORG_CODE).toString());
                        continue;
                    }
                    errorMessage = String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408004E", (String)"\u8be5\u7269\u6599\u672a\u5206\u914d\u7ed9\u8be5\u7ec4\u7ec7\uff0c\u7269\u6599id\uff1a%s\uff0c\u7ec4\u7ec7id\uff1a%s\uff0c\u8bf7\u68c0\u67e5\u4f20\u53c2\u662f\u5426\u6b63\u786e\uff1b"), billOne.get("productId").toString(), billOne.get("orgId").toString());
                }
                if (!"".equals(errorMessage)) {
                    throw new CoreDocBusinessException((String)errorMessage);
                }
                bill.setData(billList);
            } else if ("pc_goodsproductskuprolist".equals(bill.getBillnum())) {
                errorMessage = "";
                for (Object billOne : billList) {
                    if (!billOne.containsKey("skuId") || billOne.get("skuId") == null) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800939);
                    }
                    if (!billOne.containsKey("orgId") || billOne.get("orgId") == null) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800919);
                    }
                    billOne.put("id", Long.valueOf(billOne.get("skuId").toString()));
                    QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(billOne.get("skuId"))});
                    schema = QuerySchema.create().addSelect("productId,productId.name").addCondition((ConditionExpression)queryConditionGroup);
                    List list = MetaDaoHelper.query((String)"pc.product.ProductSKU", (QuerySchema)schema);
                    if (list != null && !list.isEmpty()) {
                        billOne.put("productId", Long.valueOf(((Map)list.get(0)).get("productId").toString()));
                        billOne.put("name", ((Map)list.get(0)).get("productId_name").toString());
                        QueryConditionGroup queryConditionGroup22 = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq((Object)((Map)list.get(0)).get("productId").toString()), QueryCondition.name((String)"orgId").eq(billOne.get("orgId"))});
                        schema = QuerySchema.create().addSelect("id,isCreator").addCondition((ConditionExpression)queryConditionGroup22);
                        productApplyRange = MetaDaoHelper.query((String)"pc.product.ProductApplyRange", (QuerySchema)schema);
                        if (!productApplyRange.isEmpty() && productApplyRange != null) {
                            billOne.put("productApplyRangeId", Long.valueOf(((Map)productApplyRange.get(0)).get("id").toString()));
                            billOne.put("isCreator", Boolean.valueOf((Boolean)((Map)productApplyRange.get(0)).get("isCreator")));
                            continue;
                        }
                        errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408007E", (String)"\u672a\u627e\u5230\u8be5\u7ec4\u7ec7\u5bf9\u5e94\u7269\u6599\uff0c\u7ec4\u7ec7id\uff1a%s\uff0c\u8bf7\u68c0\u67e5\u4f20\u53c2\u662f\u5426\u6b63\u786e\uff1b"), billOne.get("orgId").toString()));
                        continue;
                    }
                    errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408007F", (String)"\u672a\u627e\u5230\u8be5\u8d27\u54c1\uff0c\u8d27\u54c1id\uff1a%s,\u8bf7\u68c0\u67e5\u4f20\u53c2\u662f\u5426\u6b63\u786e\uff1b"), billOne.get("skuId").toString()));
                }
                if (!"".equals(errorMessage)) {
                    throw new CoreDocBusinessException((String)errorMessage);
                }
                bill.setData(billList);
            } else if ("pc_managementclass".equals(bill.getBillnum())) {
                errorMessage = "";
                for (Object billOne : billList) {
                    if (!billOne.containsKey("id") || billOne.get("id") == null) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800942);
                    }
                    QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(billOne.get("id"))});
                    schema = QuerySchema.create().addSelect("code,parent.stopstatus").addCondition((ConditionExpression)queryConditionGroup);
                    List list = MetaDaoHelper.query((String)"pc.cls.ManagementClass", (QuerySchema)schema);
                    if (list == null || list.isEmpty()) {
                        errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040800AD", (String)"id\u4e3a\uff1a%s\u7684\u7269\u6599\u5206\u7c7b\u4e0d\u5b58\u5728\uff0c\u8bf7\u68c0\u67e5\u8f93\u5165\u53c2\u6570\uff1b"), billOne.get("id").toString()));
                        continue;
                    }
                    if (!"unstop".equals(action) || ((Map)list.get(0)).get("parent_stopstatus") == null || !((Boolean)((Map)list.get(0)).get("parent_stopstatus")).booleanValue()) continue;
                    errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040800AF", (String)"id\u4e3a\uff1a%s\u7684\u7269\u6599\u5206\u7c7b\u5176\u7236\u7ea7\u7269\u6599\u4e3a\u505c\u7528\u72b6\u6001\uff0c\u4e0d\u80fd\u8fdb\u884c\u542f\u7528\u64cd\u4f5c\uff1b"), billOne.get("id").toString()));
                }
                if (!"".equals(errorMessage)) {
                    throw new CoreDocBusinessException((String)errorMessage);
                }
            } else if ("pc_presentationclass".equals(bill.getBillnum())) {
                errorMessage = "";
                for (Object billOne : billList) {
                    if (!billOne.containsKey("id") || billOne.get("id") == null) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800944);
                    }
                    QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(billOne.get("id"))});
                    schema = QuerySchema.create().addSelect("code,parent.stopstatus").addCondition((ConditionExpression)queryConditionGroup);
                    List list = MetaDaoHelper.query((String)"pc.cls.PresentationClass", (QuerySchema)schema);
                    if (list == null || list.isEmpty()) {
                        errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040800B6", (String)"id\u4e3a\uff1a%s\u7684\u5546\u54c1\u5206\u7c7b\u4e0d\u5b58\u5728\uff0c\u8bf7\u68c0\u67e5\u8f93\u5165\u53c2\u6570\uff1b"), billOne.get("id").toString()));
                        continue;
                    }
                    if (!"unstop".equals(action) || ((Map)list.get(0)).get("parent_stopstatus") == null || !((Boolean)((Map)list.get(0)).get("parent_stopstatus")).booleanValue()) continue;
                    errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040800B7", (String)"id\u4e3a\uff1a%s\u7684\u5546\u54c1\u5206\u7c7b\u5176\u7236\u7ea7\u7269\u6599\u4e3a\u505c\u7528\u72b6\u6001\uff0c\u4e0d\u80fd\u8fdb\u884c\u542f\u7528\u64cd\u4f5c\uff1b"), billOne.get("id").toString()));
                }
                if (!"".equals(errorMessage)) {
                    throw new CoreDocBusinessException((String)errorMessage);
                }
            } else if ("aa_salearealist".equals(bill.getBillnum())) {
                errorMessage = "";
                for (Object billOne : billList) {
                    if (!(billOne.containsKey("id") && billOne.get("id") != null || billOne.containsKey("code") && billOne.get("code") != null)) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800945);
                    }
                    if (billOne.containsKey("id") && billOne.get("id") != null) {
                        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(billOne.get("id"))});
                        schema = QuerySchema.create().addSelect("id,code").addCondition((ConditionExpression)queryConditionGroup);
                        List list = MetaDaoHelper.query((String)"aa.salearea.SaleArea", (QuerySchema)schema);
                        if (list == null || list.isEmpty()) {
                            errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080075", (String)"id\u4e3a\uff1a%s\u7684\u9500\u552e\u533a\u57df\u4e0d\u5b58\u5728\uff0c\u8bf7\u68c0\u67e5\u8f93\u5165\u53c2\u6570\uff1b"), billOne.get("id").toString()));
                            continue;
                        }
                        billOne.put("code", ((Map)list.get(0)).get("code").toString());
                        continue;
                    }
                    if (!billOne.containsKey("code") || billOne.get("code") == null) continue;
                    QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq(billOne.get("code"))});
                    schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)queryConditionGroup);
                    List list = MetaDaoHelper.query((String)"aa.salearea.SaleArea", (QuerySchema)schema);
                    if (list == null || list.isEmpty()) {
                        errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080078", (String)"\u7f16\u7801\u4e3a\uff1a%s\u7684\u9500\u552e\u533a\u57df\u4e0d\u5b58\u5728\uff0c\u8bf7\u68c0\u67e5\u8f93\u5165\u53c2\u6570\uff1b"), billOne.get("code").toString()));
                        continue;
                    }
                    billOne.put("id", Long.valueOf(((Map)list.get(0)).get("id").toString()));
                }
                if (!"".equals(errorMessage)) {
                    throw new CoreDocBusinessException((String)errorMessage);
                }
                bill.setData(billList);
            } else if ("aa_customertrade".equals(bill.getBillnum())) {
                errorMessage = "";
                for (Object billOne : billList) {
                    if (!(billOne.containsKey("id") && billOne.get("id") != null || billOne.containsKey("code") && billOne.get("code") != null)) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800929);
                    }
                    if (billOne.containsKey("id") && billOne.get("id") != null) {
                        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(billOne.get("id"))});
                        schema = QuerySchema.create().addSelect("id,code").addCondition((ConditionExpression)queryConditionGroup);
                        List list = MetaDaoHelper.query((String)"aa.customertrade.CustomerTrade", (QuerySchema)schema);
                        if (list == null || list.isEmpty()) {
                            errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080080", (String)"id\u4e3a\uff1a%s\u7684\u5ba2\u6237\u884c\u4e1a\u4e0d\u5b58\u5728\uff0c\u8bf7\u68c0\u67e5\u8f93\u5165\u53c2\u6570\uff1b"), billOne.get("id").toString()));
                            continue;
                        }
                        billOne.put("code", ((Map)list.get(0)).get("code").toString());
                        continue;
                    }
                    if (!billOne.containsKey("code") || billOne.get("code") == null) continue;
                    QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq(billOne.get("code"))});
                    schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)queryConditionGroup);
                    List list = MetaDaoHelper.query((String)"aa.customertrade.CustomerTrade", (QuerySchema)schema);
                    if (list == null || list.isEmpty()) {
                        errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080081", (String)"\u7f16\u7801\u4e3a\uff1a%s\u7684\u5ba2\u6237\u884c\u4e1a\u4e0d\u5b58\u5728\uff0c\u8bf7\u68c0\u67e5\u8f93\u5165\u53c2\u6570\uff1b"), billOne.get("code").toString()));
                        continue;
                    }
                    billOne.put("id", Long.valueOf(((Map)list.get(0)).get("id").toString()));
                }
                if (!"".equals(errorMessage)) {
                    throw new CoreDocBusinessException((String)errorMessage);
                }
                bill.setData(billList);
            } else if ("aa_cuslevel".equals(bill.getBillnum())) {
                errorMessage = "";
                for (Object billOne : billList) {
                    if (!(billOne.containsKey("id") && billOne.get("id") != null || billOne.containsKey("code") && billOne.get("code") != null)) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800930);
                    }
                    if (billOne.containsKey("id") && billOne.get("id") != null) {
                        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(billOne.get("id"))});
                        schema = QuerySchema.create().addSelect("id,code").addCondition((ConditionExpression)queryConditionGroup);
                        List list = MetaDaoHelper.query((String)"aa.agentlevel.AgentLevel", (QuerySchema)schema);
                        if (list == null || list.isEmpty()) {
                            errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408008A", (String)"id\u4e3a\uff1a%s\u7684\u5ba2\u6237\u7ea7\u522b\u4e0d\u5b58\u5728\uff0c\u8bf7\u68c0\u67e5\u8f93\u5165\u53c2\u6570\uff1b"), billOne.get("id").toString()));
                        } else {
                            billOne.put("code", ((Map)list.get(0)).get("code").toString());
                        }
                    } else if (billOne.containsKey("code") && billOne.get("code") != null) {
                        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq(billOne.get("code"))});
                        schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)queryConditionGroup);
                        List list = MetaDaoHelper.query((String)"aa.agentlevel.AgentLevel", (QuerySchema)schema);
                        if (list == null || list.isEmpty()) {
                            errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408008E", (String)"\u7f16\u7801\u4e3a\uff1a%s\u7684\u5ba2\u6237\u7ea7\u522b\u4e0d\u5b58\u5728\uff0c\u8bf7\u68c0\u67e5\u8f93\u5165\u53c2\u6570\uff1b"), billOne.get("code").toString()));
                        } else {
                            billOne.put("id", Long.valueOf(((Map)list.get(0)).get("id").toString()));
                        }
                    }
                    if ("unstop".equals(action)) {
                        billOne.put("isEnabled", true);
                        continue;
                    }
                    billOne.put("isEnabled", false);
                }
                if (!"".equals(errorMessage)) {
                    throw new CoreDocBusinessException((String)errorMessage);
                }
                bill.setData(billList);
            } else if ("pc_brand".equals(bill.getBillnum())) {
                errorMessage = "";
                for (Object billOne : billList) {
                    if (!(billOne.containsKey("id") && billOne.get("id") != null || billOne.containsKey("name") && billOne.get("name") != null)) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800925);
                    }
                    if (billOne.containsKey("id") && billOne.get("id") != null) {
                        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(billOne.get("id"))});
                        schema = QuerySchema.create().addSelect("id,name").addCondition((ConditionExpression)queryConditionGroup);
                        List list = MetaDaoHelper.query((String)"pc.brand.Brand", (QuerySchema)schema);
                        if (list == null || list.isEmpty()) {
                            errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408004D", (String)"id\u4e3a\uff1a%s\u7684\u54c1\u724c\u4e0d\u5b58\u5728\uff0c\u8bf7\u68c0\u67e5\u8f93\u5165\u53c2\u6570\uff1b"), billOne.get("id").toString()));
                            continue;
                        }
                        billOne.put("name", ((Map)list.get(0)).get("name").toString());
                        continue;
                    }
                    if (!billOne.containsKey("name") || billOne.get("name") == null) continue;
                    QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"name").eq(billOne.get("name"))});
                    schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)queryConditionGroup);
                    List list = MetaDaoHelper.query((String)"pc.brand.Brand", (QuerySchema)schema);
                    if (list == null || list.isEmpty()) {
                        errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080052", (String)"\u540d\u79f0\u4e3a\uff1a%s\u7684\u54c1\u724c\u4e0d\u5b58\u5728\uff0c\u8bf7\u68c0\u67e5\u8f93\u5165\u53c2\u6570\uff1b"), billOne.get("name").toString()));
                        continue;
                    }
                    billOne.put("id", Long.valueOf(((Map)list.get(0)).get("id").toString()));
                }
                if (!"".equals(errorMessage)) {
                    throw new CoreDocBusinessException((String)errorMessage);
                }
                bill.setData(billList);
            } else if ("pc_unit".equals(bill.getBillnum())) {
                errorMessage = "";
                for (Object billOne : billList) {
                    if (!(billOne.containsKey("id") && billOne.get("id") != null || billOne.containsKey("code") && billOne.get("code") != null)) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800926);
                    }
                    if (billOne.containsKey("id") && billOne.get("id") != null) {
                        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(billOne.get("id"))});
                        schema = QuerySchema.create().addSelect("id,code").addCondition((ConditionExpression)queryConditionGroup);
                        List list = MetaDaoHelper.query((String)"pc.unit.Unit", (QuerySchema)schema);
                        if (list == null || list.isEmpty()) {
                            errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408005D", (String)"id\u4e3a\uff1a%s\u7684\u8ba1\u91cf\u5355\u4f4d\u4e0d\u5b58\u5728\uff0c\u8bf7\u68c0\u67e5\u8f93\u5165\u53c2\u6570\uff1b"), billOne.get("id").toString()));
                            continue;
                        }
                        billOne.put("code", ((Map)list.get(0)).get("code").toString());
                        continue;
                    }
                    if (!billOne.containsKey("code") || billOne.get("code") == null) continue;
                    QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq(billOne.get("code"))});
                    schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)queryConditionGroup);
                    List list = MetaDaoHelper.query((String)"pc.unit.Unit", (QuerySchema)schema);
                    if (list == null || list.isEmpty()) {
                        errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080060", (String)"\u7f16\u7801\u4e3a\uff1a%s\u7684\u8ba1\u91cf\u5355\u4f4d\u4e0d\u5b58\u5728\uff0c\u8bf7\u68c0\u67e5\u8f93\u5165\u53c2\u6570\uff1b"), billOne.get("code").toString()));
                        continue;
                    }
                    billOne.put("id", Long.valueOf(((Map)list.get(0)).get("id").toString()));
                }
                if (!"".equals(errorMessage)) {
                    throw new CoreDocBusinessException((String)errorMessage);
                }
                bill.setData(billList);
            } else if ("aa_settlemethodlist".equals(bill.getBillnum())) {
                errorMessage = "";
                for (Object billOne : billList) {
                    if (!(billOne.containsKey("id") && billOne.get("id") != null || billOne.containsKey("code") && billOne.get("code") != null)) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800946);
                    }
                    if (billOne.containsKey("id") && billOne.get("id") != null) {
                        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(billOne.get("id"))});
                        schema = QuerySchema.create().addSelect("id,code").addCondition((ConditionExpression)queryConditionGroup);
                        List list = MetaDaoHelper.query((String)"aa.settlemethod.SettleMethod", (QuerySchema)schema);
                        if (list == null || list.isEmpty()) {
                            errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080046", (String)"id\u4e3a\uff1a%s\u7684\u7ed3\u7b97\u65b9\u5f0f\u4e0d\u5b58\u5728\uff0c\u8bf7\u68c0\u67e5\u8f93\u5165\u53c2\u6570\uff1b"), billOne.get("id").toString()));
                            continue;
                        }
                        billOne.put("code", ((Map)list.get(0)).get("code").toString());
                        continue;
                    }
                    if (!billOne.containsKey("code") || billOne.get("code") == null) continue;
                    QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq(billOne.get("code"))});
                    schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)queryConditionGroup);
                    List list = MetaDaoHelper.query((String)"aa.settlemethod.SettleMethod", (QuerySchema)schema);
                    if (list == null || list.isEmpty()) {
                        errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080049", (String)"\u7f16\u7801\u4e3a\uff1a%s\u7684\u7ed3\u7b97\u65b9\u5f0f\u4e0d\u5b58\u5728\uff0c\u8bf7\u68c0\u67e5\u8f93\u5165\u53c2\u6570\uff1b"), billOne.get("code").toString()));
                        continue;
                    }
                    billOne.put("id", Long.valueOf(((Map)list.get(0)).get("id").toString()));
                }
                if (!"".equals(errorMessage)) {
                    throw new CoreDocBusinessException((String)errorMessage);
                }
                bill.setData(billList);
            } else if ("aa_customerTypelist".equals(bill.getBillnum())) {
                errorMessage = "";
                for (Object billOne : billList) {
                    if (!(billOne.containsKey("id") && billOne.get("id") != null || billOne.containsKey("code") && billOne.get("code") != null)) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800931);
                    }
                    if (billOne.containsKey("id") && billOne.get("id") != null) {
                        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(billOne.get("id"))});
                        schema = QuerySchema.create().addSelect("id,code").addCondition((ConditionExpression)queryConditionGroup);
                        List list = MetaDaoHelper.query((String)"aa.customertype.CustomerType", (QuerySchema)schema);
                        if (list == null || list.isEmpty()) {
                            errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080053", (String)"id\u4e3a\uff1a%s\u7684\u9500\u552e\u6e20\u9053\u4e0d\u5b58\u5728\uff0c\u8bf7\u68c0\u67e5\u8f93\u5165\u53c2\u6570\uff1b"), billOne.get("id").toString()));
                            continue;
                        }
                        billOne.put("code", ((Map)list.get(0)).get("code").toString());
                        continue;
                    }
                    if (!billOne.containsKey("code") || billOne.get("code") == null) continue;
                    QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq(billOne.get("code"))});
                    schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)queryConditionGroup);
                    List list = MetaDaoHelper.query((String)"aa.customertype.CustomerType", (QuerySchema)schema);
                    if (list == null || list.isEmpty()) {
                        errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080058", (String)"\u7f16\u7801\u4e3a\uff1a%s\u7684\u9500\u552e\u6e20\u9053\u4e0d\u5b58\u5728\uff0c\u8bf7\u68c0\u67e5\u8f93\u5165\u53c2\u6570\uff1b"), billOne.get("code").toString()));
                        continue;
                    }
                    billOne.put("id", Long.valueOf(((Map)list.get(0)).get("id").toString()));
                }
                if (!"".equals(errorMessage)) {
                    throw new CoreDocBusinessException((String)errorMessage);
                }
                bill.setData(billList);
            } else if ("pc_productlinelist".equals(bill.getBillnum())) {
                errorMessage = "";
                for (Object billOne : billList) {
                    if (!(billOne.containsKey("id") && billOne.get("id") != null || billOne.containsKey("code") && billOne.get("code") != null)) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800947);
                    }
                    if (billOne.containsKey("id") && billOne.get("id") != null) {
                        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(billOne.get("id"))});
                        schema = QuerySchema.create().addSelect("id,code").addCondition((ConditionExpression)queryConditionGroup);
                        List list = MetaDaoHelper.query((String)"pc.productline.ProductLine", (QuerySchema)schema);
                        if (list == null || list.isEmpty()) {
                            errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408005F", (String)"id\u4e3a\uff1a%s\u7684\u4ea7\u54c1\u7ebf\u4e0d\u5b58\u5728\uff0c\u8bf7\u68c0\u67e5\u8f93\u5165\u53c2\u6570\uff1b"), billOne.get("id").toString()));
                            continue;
                        }
                        billOne.put("code", ((Map)list.get(0)).get("code").toString());
                        continue;
                    }
                    if (!billOne.containsKey("code") || billOne.get("code") == null) continue;
                    QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq(billOne.get("code"))});
                    schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)queryConditionGroup);
                    List list = MetaDaoHelper.query((String)"pc.productline.ProductLine", (QuerySchema)schema);
                    if (list == null || list.isEmpty()) {
                        errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080062", (String)"\u7f16\u7801\u4e3a\uff1a%s\u7684\u4ea7\u54c1\u7ebf\u4e0d\u5b58\u5728\uff0c\u8bf7\u68c0\u67e5\u8f93\u5165\u53c2\u6570\uff1b"), billOne.get("code").toString()));
                        continue;
                    }
                    billOne.put("id", Long.valueOf(((Map)list.get(0)).get("id").toString()));
                }
                if (!"".equals(errorMessage)) {
                    throw new CoreDocBusinessException((String)errorMessage);
                }
                bill.setData(billList);
            } else if ("aa_sendtranswaylist".equals(bill.getBillnum())) {
                errorMessage = "";
                for (Object billOne : billList) {
                    if (!(billOne.containsKey("id") && billOne.get("id") != null || billOne.containsKey("code") && billOne.get("code") != null)) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800948);
                    }
                    if (billOne.containsKey("id") && billOne.get("id") != null) {
                        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(billOne.get("id"))});
                        schema = QuerySchema.create().addSelect("id,code").addCondition((ConditionExpression)queryConditionGroup);
                        List list = this.billQueryRepository.queryMapBySchema("aa.sendtrans.SendTransWay", schema);
                        if (list == null || list.isEmpty()) {
                            errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408006C", (String)"id\u4e3a\uff1a%s\u7684\u53d1\u8fd0\u65b9\u5f0f\u4e0d\u5b58\u5728\uff0c\u8bf7\u68c0\u67e5\u8f93\u5165\u53c2\u6570\uff1b"), billOne.get("id").toString()));
                            continue;
                        }
                        billOne.put("code", ((Map)list.get(0)).get("code").toString());
                        continue;
                    }
                    if (!billOne.containsKey("code") || billOne.get("code") == null) continue;
                    QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq(billOne.get("code"))});
                    schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)queryConditionGroup);
                    List list = this.billQueryRepository.queryMapBySchema("aa.sendtrans.SendTransWay", schema);
                    if (list == null || list.isEmpty()) {
                        errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408006F", (String)"\u7f16\u7801\u4e3a\uff1a%s\u7684\u53d1\u8fd0\u65b9\u5f0f\u4e0d\u5b58\u5728\uff0c\u8bf7\u68c0\u67e5\u8f93\u5165\u53c2\u6570\uff1b"), billOne.get("code").toString()));
                        continue;
                    }
                    billOne.put("id", Long.valueOf(((Map)list.get(0)).get("id").toString()));
                }
                if (!"".equals(errorMessage)) {
                    throw new CoreDocBusinessException((String)errorMessage);
                }
                bill.setData(billList);
            }
        }
        return bill;
    }

    @Override
    public BillDataDto dealBillDataForMq(BillDataDto bill, String action) throws Exception {
        List data = (List)bill.getData();
        for (Map tempMap : data) {
            tempMap.put("data_from", "YQL");
        }
        return bill;
    }

    public void dealMultilingualism(Map<String, Object> billOne) {
        Map<String, String> tempName = new HashMap<String, String>();
        if (billOne.get("name") != null) {
            if (billOne.get("name") instanceof String) {
                tempName.put("zh_CN", billOne.get("name").toString());
                billOne.put("name", tempName);
            }
            if (billOne.get("name") instanceof Map && ((tempName = (Map)billOne.get("name")).get("zh_CN") == null || "".equals(tempName.get("zh_CN")))) {
                if (tempName.get("en_US") != null && !"".equals(tempName.get("en_US"))) {
                    tempName.put("zh_CN", (String)tempName.get("en_US"));
                }
                if (tempName.get("zh_TW") != null && !"".equals(tempName.get("zh_TW"))) {
                    tempName.put("zh_CN", (String)tempName.get("zh_TW"));
                }
            }
        }
        if (billOne.get("showItem") != null) {
            if (billOne.get("showItem") instanceof String) {
                tempName.put("zh_CN", billOne.get("showItem").toString());
                billOne.put("showItem", tempName);
            }
            if (billOne.get("showItem") instanceof Map && ((tempName = (Map)billOne.get("showItem")).get("zh_CN") == null || "".equals(tempName.get("zh_CN")))) {
                if (tempName.get("en_US") != null && !"".equals(tempName.get("en_US"))) {
                    tempName.put("zh_CN", (String)tempName.get("en_US"));
                }
                if (tempName.get("zh_TW") != null && !"".equals(tempName.get("zh_TW"))) {
                    tempName.put("zh_CN", (String)tempName.get("zh_TW"));
                }
            }
        }
        if (billOne.get("userdefAlias") != null) {
            if (billOne.get("userdefAlias") instanceof String) {
                tempName.put("zh_CN", billOne.get("userdefAlias").toString());
                billOne.put("userdefAlias", tempName);
            }
            if (billOne.get("userdefAlias") instanceof Map && ((tempName = (Map)billOne.get("userdefAlias")).get("zh_CN") == null || "".equals(tempName.get("zh_CN")))) {
                if (tempName.get("en_US") != null && !"".equals(tempName.get("en_US"))) {
                    tempName.put("zh_CN", (String)tempName.get("en_US"));
                }
                if (tempName.get("zh_TW") != null && !"".equals(tempName.get("zh_TW"))) {
                    tempName.put("zh_CN", (String)tempName.get("zh_TW"));
                }
            }
        }
    }

    public List<Map<String, Object>> getBillData(BillDataDto bill) throws Exception {
        Object obj = bill.getData();
        List<Map<String, Object>> list = new ArrayList<Object>();
        if (obj instanceof Map) {
            list.add((Map<String, Object>)obj);
        } else if (obj instanceof List) {
            list = (List)obj;
        } else if (obj instanceof String) {
            Object jsonObject = JSON.parse((String)((String)obj));
            if (jsonObject instanceof Map) {
                list.add((Map<String, Object>)jsonObject);
            } else if (jsonObject instanceof List) {
                list = (List)jsonObject;
            }
            bill.setData(list);
        }
        if (list == null || list.size() == 0) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800518);
        }
        return list;
    }

    @Override
    public List<Map<String, Object>> findIdByCode(String billnum, Object code) throws Exception {
        List<Map<String, Object>> returnList = new ArrayList<Map<String, Object>>();
        if (code != null && !"".equals(code.toString().trim())) {
            if ("aa_merchant".equals(billnum)) {
                QueryConditionGroup queryMerchantNameCondition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq((Object)String.valueOf(code))});
                QuerySchema queryMerchantNameSchema = QuerySchema.create().addSelect("id,orgId").addCondition((ConditionExpression)queryMerchantNameCondition);
                List merchant = MetaDaoHelper.query((String)"aa.merchant.Merchant", (QuerySchema)queryMerchantNameSchema);
                if (merchant == null || merchant.isEmpty()) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800949, new Object[]{code.toString()});
                }
                if (merchant.size() > 1) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800950, new Object[]{code.toString()});
                }
                returnList = merchant;
            } else if ("pc_brand".equals(billnum)) {
                QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq((Object)code.toString())});
                QuerySchema schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)queryConditionGroup);
                returnList = MetaDaoHelper.query((String)"pc.brand.Brand", (QuerySchema)schema);
                if (returnList == null || returnList.isEmpty()) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800952, new Object[]{code.toString()});
                }
                if (returnList.size() > 1) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800953, new Object[]{code.toString()});
                }
            }
        }
        return returnList;
    }

    @Override
    public List<Map<String, Object>> findApplyRangeIdById(String billnum, String id) throws Exception {
        List<Map<String, Object>> returnList = new ArrayList<Map<String, Object>>();
        if (id != null && !"".equals(id.toString().trim()) && "aa_merchant".equals(billnum)) {
            QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)MERCHANT_ID).eq((Object)id), QueryCondition.name((String)"isCreator").eq((Object)true), QueryCondition.name((String)"isPotential").eq((Object)false)});
            QuerySchema schema = QuerySchema.create().addSelect("id,isCreator").addCondition((ConditionExpression)queryConditionGroup);
            List merchantapplyrange = MetaDaoHelper.query((String)"aa.merchant.MerchantApplyRange", (QuerySchema)schema);
            if (merchantapplyrange != null && !merchantapplyrange.isEmpty()) {
                returnList = merchantapplyrange;
            }
        }
        return returnList;
    }

    @Override
    public List<Map<String, Object>> findApplyRangeIdByorgId(String billnum, String id, String orgId) throws Exception {
        List<Map<String, Object>> returnList = new ArrayList<Map<String, Object>>();
        if (orgId != null && !"".equals(orgId.toString().trim())) {
            if ("pc_product".equals(billnum)) {
                QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq((Object)id), QueryCondition.name((String)"orgId").eq((Object)orgId)});
                QuerySchema schema = QuerySchema.create().addSelect("id,isCreator").addCondition((ConditionExpression)queryConditionGroup);
                List productApplyRange = MetaDaoHelper.query((String)"pc.product.ProductApplyRange", (QuerySchema)schema);
                if (productApplyRange != null && !productApplyRange.isEmpty()) {
                    returnList = productApplyRange;
                }
            } else if ("aa_merchant".equals(billnum)) {
                QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)MERCHANT_ID).eq((Object)id), QueryCondition.name((String)"orgId").eq((Object)orgId), QueryCondition.name((String)"isPotential").eq((Object)false)});
                QuerySchema schema = QuerySchema.create().addSelect("id,isCreator").addCondition((ConditionExpression)queryConditionGroup);
                List merchantApplyRange = MetaDaoHelper.query((String)"aa.merchant.MerchantApplyRange", (QuerySchema)schema);
                if (merchantApplyRange != null && !merchantApplyRange.isEmpty()) {
                    returnList = merchantApplyRange;
                }
            }
        }
        return returnList;
    }

    @Override
    public RuleExecuteResult dealResultForApi(RuleExecuteResult result) throws Exception {
        Object tempData = result.getData();
        ArrayList<BizObject> tempList = null;
        if (tempData instanceof List) {
            tempList = (ArrayList<BizObject>)tempData;
        } else if (tempData instanceof BizObject) {
            tempList = new ArrayList<BizObject>();
            tempList.add((BizObject)tempData);
        } else {
            tempList = new ArrayList(1);
        }
        if (!CollectionUtils.isEmpty((Collection)tempList)) {
            for (Map map : tempList) {
                map.keySet().removeIf(key -> key.equals("_realtype"));
                map.keySet().removeIf(key -> key.equals("_entityName"));
                map.keySet().removeIf(key -> key.equals("_keyName"));
                map.keySet().removeIf(key -> key.equals("_status"));
            }
        }
        result.setData(tempList);
        return result;
    }

    @Override
    public Object getSpecitemParams(Map<String, Object> map) throws Exception {
        ArrayList reParams = null;
        ArrayList resultList = new ArrayList();
        List specitem = new ArrayList();
        ArrayList<Map> showSpecitem = new ArrayList<Map>();
        if (org.springframework.util.StringUtils.isEmpty((Object)map.get("productId"))) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800954);
        }
        QueryConditionGroup queryTemplateCondition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(map.get("productId"))});
        QuerySchema queryTemplateNameSchema = QuerySchema.create().addSelect("productTemplate").addCondition((ConditionExpression)queryTemplateCondition);
        List productTemplate = MetaDaoHelper.query((String)"pc.product.Product", (QuerySchema)queryTemplateNameSchema);
        if (productTemplate.isEmpty() || org.springframework.util.StringUtils.isEmpty(((Map)productTemplate.get(0)).get("productTemplate"))) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800955);
        }
        HashMap<String, Object> para = new HashMap<String, Object>(3);
        para.put("ytenant", AppContext.getYTenantId());
        para.put("productTemplateId", ((Map)productTemplate.get(0)).get("productTemplate"));
        if (org.springframework.util.StringUtils.isEmpty((Object)map.get("productSKUId"))) {
            specitem = SqlHelper.selectList((String)"com.yonyoucloud.upc.product.dao.Specitem.specitem", para);
        } else {
            QueryConditionGroup querySpecIdsCondition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(map.get("productSKUId"))});
            QuerySchema querySpecIdsSchema = QuerySchema.create().addSelect("specIds").addCondition((ConditionExpression)querySpecIdsCondition);
            List SpecIds = MetaDaoHelper.query((String)"pc.product.ProductSKU", (QuerySchema)querySpecIdsSchema);
            if (SpecIds.isEmpty() || org.springframework.util.StringUtils.isEmpty(((Map)SpecIds.get(0)).get("specIds"))) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800956);
            }
            String specIds = ((Map)SpecIds.get(0)).get("specIds").toString();
            specIds = specIds.endsWith(";") ? specIds.substring(0, specIds.length() - 1).replace(";", ",") : specIds.replace(";", ",");
            para.put("specIds", specIds);
            specitem = SqlHelper.selectList((String)"com.yonyoucloud.upc.product.dao.Specitem.specitemByspecId", para);
        }
        if (specitem != null && !specitem.isEmpty()) {
            assert (specitem.size() < CheckLimitConstant.DEFAULT_LIMIT);
            Iterator entries = specitem.iterator();
            while (entries.hasNext()) {
                Map data = (Map)entries.next();
                if (!"0".equals(data.get("isShowSpec")) && ((Boolean)data.get("isShowSpec")).booleanValue()) continue;
                showSpecitem.add(data);
                entries.remove();
            }
        }
        if (showSpecitem != null && !showSpecitem.isEmpty()) {
            for (int j = 0; j < showSpecitem.size(); ++j) {
                ((Map)showSpecitem.get(j)).put("defineId", "freex" + (j + 1));
            }
            specitem.addAll(showSpecitem);
        }
        resultList.addAll(specitem);
        reParams = resultList;
        return reParams;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public Object returnProductSKU(Map<String, Object> map) throws Exception {
        RuleRegister billRuleRegister;
        RuleExecuteResult ruleResult;
        Map outmap;
        IRpcRule rpcRule;
        void var17_21;
        ArrayList reParams = null;
        ArrayList resultList = new ArrayList();
        List domainResultList = new ArrayList();
        List skuDetail = new ArrayList();
        QuerySchema querySchema = new QuerySchema();
        List<String> enginList = Arrays.asList("engineeringdata", "productionorder");
        List SpecSums = (List)map.get("SpecSums");
        if (org.springframework.util.StringUtils.isEmpty((Object)map.get("productId"))) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800957);
        }
        String tenant_id = AppContext.getTenantId().toString();
        HashMap<String, Object> para = new HashMap<String, Object>(8);
        para.put("ytenant", AppContext.getYTenantId());
        para.put("productId", map.get("productId"));
        para.put("orgId", org.springframework.util.StringUtils.isEmpty((Object)map.get("org")) ? "666666" : map.get("org"));
        para.put("refCode", !org.springframework.util.StringUtils.isEmpty((Object)map.get("refCode")) && map.get("refCode").toString().contains("pc_productskuquerytreeref") ? "pc_productskuquerytreeref" : "aa_productsku");
        para.put("domain", map.get("domain"));
        if (!org.springframework.util.StringUtils.isEmpty((Object)map.get("productSKUId"))) {
            para.put("productSKUId", map.get("productSKUId"));
        } else {
            List templateSpecs = SqlHelper.selectList((String)"com.yonyoucloud.upc.product.dao.Specitem.getTemplateSpecs", para);
            if (null == templateSpecs || templateSpecs.size() == 0) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800958);
            }
            Map<String, List<Map>> specsBySpecifi = templateSpecs.stream().collect(Collectors.groupingBy(specsMap -> specsMap.get("specification").toString()));
            querySchema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq(map.get("productId"))}));
            for (Map SpecSum : SpecSums) {
                if (null != specsBySpecifi.get(SpecSum.get("specification").toString())) {
                    for (Map map2 : specsBySpecifi.get(SpecSum.get("specification").toString())) {
                        if (!map2.get("lsSpecItems_id").equals(SpecSum.get("lsSpecItems_id")) || map2.get("specValue").equals(SpecSum.get("specValue"))) continue;
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800959, new Object[]{SpecSum.get("specValue")});
                    }
                } else {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800960, new Object[]{SpecSum.get("specification_showItem")});
                }
                querySchema.appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)SpecSum.get("defineId").toString()).eq(SpecSum.get("specValue"))});
            }
            Map resultMap = MetaDaoHelper.queryOne((String)"pc.product.ProductSKU", (QuerySchema)querySchema);
            if (resultMap != null && !resultMap.isEmpty()) {
                para.put("productSKUId", resultMap.get("id"));
            } else {
                Map generateMap = this.generateSKUbySpecs(map, SpecSums);
                String specS = (String)generateMap.get("specS");
                RuleExecuteResult result = (RuleExecuteResult)generateMap.get("result");
                if (null != result && result.getMsgCode() != 1) {
                    throw new CoreDocBusinessException(result.getMessage());
                }
                for (HashMap productSku : (List)((Product)result.getData()).get("productskus")) {
                    if (productSku.get("specs") == null || !specS.equals(productSku.get("specs"))) continue;
                    para.put("productSKUId", productSku.get("id"));
                }
                if (org.springframework.util.StringUtils.isEmpty(para.get("productSKUId"))) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800961);
                }
            }
        }
        skuDetail = SqlHelper.selectList((String)"com.yonyoucloud.upc.product.dao.Specitem.getSkuDetailBySkuId", para);
        HashMap<String, BillDataDto> contMap = new HashMap<String, BillDataDto>();
        ArrayList<HashMap<String, Object>> result = new ArrayList<HashMap<String, Object>>();
        BillContext billContext = BillContextUtils.getBillContext((String)"pc_product");
        BillDataDto billDataDto = new BillDataDto();
        billDataDto.setBillnum("pc_product");
        result.add((HashMap<String, Object>)(!CollectionUtils.isEmpty(skuDetail) ? (Map)skuDetail.get(0) : para));
        billDataDto.setData(result);
        contMap.put("param", billDataDto);
        String ruleTenant = String.format("%s%s_%s_%s_%s", "billrule_", 0, "pc_product", "skudetailquery", map.get("domain"));
        List list = (List)AppContext.cacheEnableEmpty().getObject(ruleTenant);
        if (CollectionUtils.isEmpty((Collection)list)) {
            List list2 = SqlHelper.selectList((String)"com.yonyoucloud.upc.product.dao.Specitem.getSkuDetailRule", para);
            AppContext.cache().setObject(ruleTenant, (Object)list2, 604800);
        }
        if (!CollectionUtils.isEmpty((Collection)var17_21) && null != (rpcRule = (IRpcRule)AppContext.getBean(IRpcRule.class)) && (outmap = (ruleResult = rpcRule.execute(billRuleRegister = ProductUtil.getBillRuleRegister("pc_product", "delete", ((Map)var17_21.get(0)).get("ruleId").toString(), ((Map)var17_21.get(0)).get("domain").toString()), billContext, contMap)).getOutParams()).containsKey("paramMap")) {
            Map paramMap = (Map)outmap.get("paramMap");
            domainResultList = (List)paramMap.get("return");
        }
        if (!CollectionUtils.isEmpty(domainResultList)) {
            resultList.addAll(domainResultList);
        } else {
            resultList.addAll(skuDetail);
        }
        reParams = resultList;
        return reParams;
    }

    @Override
    public void addSkuForDetailMap(Map map) throws Exception {
        if (map != null && !map.isEmpty()) {
            QueryConditionGroup conditionTemp = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq((Object)map.get("id").toString())});
            QuerySchema productspecitemsSceama = QuerySchema.create().addSelect("id,productId,haveImg,iOrder,iSpecId,iSpecId.showItem,lsSpecItems_id,specValue,lsSpecItems_id.orderNum").addCondition((ConditionExpression)conditionTemp);
            List productspecitems = MetaDaoHelper.query((String)"pc.product.ProductSpecItem", (QuerySchema)productspecitemsSceama);
            if (!CollectionUtils.isEmpty((Collection)productspecitems)) {
                ArrayList businessIdList = new ArrayList();
                HashMap businessAndCharacterItemsMap = new HashMap();
                productspecitems.forEach(data -> {
                    if (null != data.get("imgBusinessId")) {
                        businessIdList.add(data.get("imgBusinessId").toString());
                        businessAndCharacterItemsMap.put(data.get("imgBusinessId").toString(), data);
                    }
                });
                if (!CollectionUtils.isEmpty(businessIdList)) {
                    ArrayList<BatchBusinessFilesRequest> batchBusinessFilesRequestList = new ArrayList<BatchBusinessFilesRequest>();
                    BatchBusinessFilesRequest batchBusinessFilesRequest = new BatchBusinessFilesRequest();
                    batchBusinessFilesRequest.setBusinessType("iuap-apdoc-material");
                    batchBusinessFilesRequest.setBusinessIds(businessIdList);
                    batchBusinessFilesRequest.setCancelFileExit(Boolean.valueOf(true));
                    batchBusinessFilesRequestList.add(batchBusinessFilesRequest);
                    CooperationSuiteFile cooperationSuiteFile = this.cooperationFileService.batchBusinessFiles(batchBusinessFilesRequestList);
                    List cooperationFileInfoList = cooperationSuiteFile.getData();
                    if (!CollectionUtils.isEmpty((Collection)cooperationFileInfoList)) {
                        cooperationFileInfoList.forEach(cooperationFileVO -> {
                            String objectId = cooperationFileVO.getObjectId();
                            Map productspecitem = (Map)businessAndCharacterItemsMap.get(objectId);
                            if (null != productspecitem) {
                                if (null == productspecitem.get("productspecitemalbums")) {
                                    productspecitem.put("productspecitemalbums", new ArrayList());
                                }
                                List albumList = (List)productspecitem.get("productspecitemalbums");
                                ProductSpecItemAlbum specItemAlbum = new ProductSpecItemAlbum();
                                specItemAlbum.setProductId(Long.valueOf(Long.parseLong(productspecitem.get("productId").toString())));
                                specItemAlbum.setProductSpecItemId(Long.valueOf(Long.parseLong(productspecitem.get("productSpecItemId").toString())));
                                specItemAlbum.setFolder(cooperationFileVO.getBucketUrl());
                                specItemAlbum.setImgName(cooperationFileVO.getFileName());
                                albumList.add(specItemAlbum);
                            }
                        });
                    }
                }
            }
            map.put("productspecitems", productspecitems);
            QuerySchema productskusSceama = QuerySchema.create().addSelect("id,productId,code,name,model,weight,volume,batchUnit,batchRate,isSKU,modelDescription,specIds,specs,specNames").addCondition((ConditionExpression)conditionTemp).addPager(1, 500);
            List productskus = MetaDaoHelper.query((String)"pc.product.ProductSKU", (QuerySchema)productskusSceama);
            if (!CollectionUtils.isEmpty((Collection)productskus)) {
                List skuIds = productskus.stream().map(sku -> Long.parseLong(sku.get("id").toString())).collect(Collectors.toList());
                Map detailMap = (Map)map.get("detail");
                Long productApplyRangeId = null;
                if (detailMap != null && detailMap.get("productApplyRangeId") != null) {
                    productApplyRangeId = Long.parseLong(detailMap.get("productApplyRangeId").toString());
                } else if (map.get("detail!productApplyRangeId") != null) {
                    productApplyRangeId = Long.parseLong(map.get("detail!productApplyRangeId").toString());
                }
                QueryConditionGroup skuCondition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq((Object)map.get("id").toString()), QueryCondition.name((String)"skuId").in(skuIds)});
                QueryConditionGroup skuTagCondition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"skuId").in(skuIds)});
                if (productApplyRangeId != null) {
                    skuCondition.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productApplyRangeId").eq((Object)productApplyRangeId)}));
                    skuTagCondition.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productApplyRangeId").eq((Object)productApplyRangeId)}));
                }
                QuerySchema productskudetailsSceama = QuerySchema.create().addSelect("id as productSKUDetail!id,productId as productSKUDetail!productId,productDetailId as productSKUDetail!productDetailId,skuId as productSKUDetail!skuId,productApplyRangeId as productSKUDetail!productApplyRangeId,shortName as productSKUDetail!shortName,status as productSKUDetail!status,ustatus as productSKUDetail!ustatus,batchPrice as productSKUDetail!batchPrice,markPrice as productSKUDetail!markPrice,fLowestMarkPrice as productSKUDetail!fLowestMarkPrice,salePrice as productSKUDetail!salePrice,fNoTaxCostPrice as productSKUDetail!fNoTaxCostPrice,fMarketPrice as productSKUDetail!fMarketPrice,fPrimeCosts as productSKUDetail!fPrimeCosts,fSettleAccountsRate as productSKUDetail!fSettleAccountsRate,barCode as productSKUDetail!barCode,mnemonicCode as productSKUDetail!mnemonicCode,inventoryCount as productSKUDetail!inventoryCount,iOrder as productSKUDetail!iOrder,salePoints as productSKUDetail!salePoints,saled as productSKUDetail!saled,iMinOrderQuantity as productSKUDetail!iMinOrderQuantity,batchDeliveryDays as productSKUDetail!batchDeliveryDays,erpOuterCode as productSKUDetail!erpOuterCode,safetyStock as productSKUDetail!safetyStock,stockUnit as productSKUDetail!stockUnit,iDoubleSale as productSKUDetail!iDoubleSale,highestStock as productSKUDetail!highestStock,lowestStock as productSKUDetail!lowestStock,stopstatus as productSKUDetail!stopstatus,pubts as productSKUDetail!pubts").addCondition((ConditionExpression)skuCondition);
                List productskudetails = MetaDaoHelper.query((String)"pc.product.ProductSkuDetailNew", (QuerySchema)productskudetailsSceama);
                QuerySchema productSkuOrderPropertySceama = QuerySchema.create().addSelect("id,productId,productDetailId,skuId,productApplyRangeId,promptMessage,isShow,isRequired,iOrder,skuPropertyTypeId,iLimitNum").addCondition((ConditionExpression)skuCondition);
                List skuOrderProperties = MetaDaoHelper.query((String)"pc.product.ProductSkuOrderProperty", (QuerySchema)productSkuOrderPropertySceama);
                QuerySchema skuTagSceama = QuerySchema.create().addSelect("id,skuId,productDetailId,productApplyRangeId,tagId").addCondition((ConditionExpression)skuTagCondition);
                List skuTags = MetaDaoHelper.query((String)"pc.product.SkuTagNew", (QuerySchema)skuTagSceama);
                Map<Object, Object> productskudetailMap = new HashMap();
                Map<Object, Object> productSkuOrderPropertyMap = new HashMap();
                Map<Object, Object> skuTagMap = new HashMap();
                if (!CollectionUtils.isEmpty((Collection)productskudetails)) {
                    productskudetailMap = productskudetails.stream().collect(Collectors.groupingBy(skuDetail -> skuDetail.get("productSKUDetail!skuId").toString()));
                }
                if (!CollectionUtils.isEmpty((Collection)skuOrderProperties)) {
                    productSkuOrderPropertyMap = skuOrderProperties.stream().collect(Collectors.groupingBy(skuOrderProperty -> skuOrderProperty.get("skuId").toString()));
                }
                if (!CollectionUtils.isEmpty((Collection)skuTags)) {
                    skuTagMap = skuTags.stream().collect(Collectors.groupingBy(skuTag -> skuTag.get("skuId").toString()));
                }
                for (Map sku2 : productskus) {
                    if (productskudetailMap != null && productskudetailMap.get(sku2.get("id").toString()) != null) {
                        sku2.putAll((Map)((List)productskudetailMap.get(sku2.get("id").toString())).get(0));
                    }
                    if (productSkuOrderPropertyMap != null && !productSkuOrderPropertyMap.isEmpty()) {
                        if (productSkuOrderPropertyMap.get(sku2.get("id").toString()) != null) {
                            sku2.put("skuOrderProperties", productSkuOrderPropertyMap.get(sku2.get("id").toString()));
                        } else {
                            sku2.put("skuOrderProperties", new ArrayList());
                        }
                    }
                    if (skuTagMap == null || skuTagMap.get(sku2.get("id").toString()) == null) continue;
                    sku2.put("skuTags", skuTagMap.get(sku2.get("id").toString()));
                }
            }
            map.put("productskus", productskus);
        }
    }

    @Override
    public void dealDataForCustomertrade(List list) throws Exception {
        for (Object tempData : list) {
            if (((Map)tempData).get("stopstatus") == null) continue;
            ((Map)tempData).put("stopstatus", Boolean.parseBoolean(((Map)tempData).get("stopstatus").toString()) ? 1 : 0);
        }
    }

    @Override
    public void dealResultDataForDetail(String billnum, Map map) throws Exception {
        if ("pc_product".equals(billnum)) {
            this.addSkuForDetailMap(map);
        } else if (("aa_customertrade".equals(billnum) || "pc_unit".equals(billnum)) && map != null && map.get("stopstatus") != null) {
            map.put("stopstatus", Boolean.parseBoolean(map.get("stopstatus").toString()) ? 1 : 0);
        }
    }

    private Map generateSKUbySpecs(Map<String, Object> map, List<Map<String, Object>> specSums) throws Exception {
        HashMap<String, String> resultMap = new HashMap<String, String>();
        BillDataDto savebill = new BillDataDto("pc_productsku_add", map.get("productId").toString());
        Map detail = this.detail(savebill);
        detail.put("_status", EntityStatus.Update);
        Map productName = (Map)detail.get("name");
        HashMap<String, Object> productsku = new HashMap<String, Object>();
        ArrayList productspecItems = new ArrayList();
        List productspecitems = (List)detail.get("productspecitems");
        if (productspecitems != null) {
            for (HashMap productspecitem : productspecitems) {
                productspecitem.put("_status", EntityStatus.Unchanged);
            }
        }
        productsku.put("productSKUDetail!stopstatus", false);
        productsku.put("productSKUDetail!ustatus", 0);
        productsku.put("productSKUDetail!status", 0);
        productsku.put("hasDefaultInit", true);
        productsku.put("isShow", true);
        Object[] specItemIds = new Long[specSums.size()];
        Object[] specs = new String[specSums.size()];
        String specItems = "";
        int currentArrayIndex = 0;
        for (Map<String, Object> SpecSum : specSums) {
            productsku.put(SpecSum.get("defineId").toString(), SpecSum.get("specValue"));
            if (!((Boolean)SpecSum.get("isShowSpec")).booleanValue() || "0".equals(SpecSum.get("isShowSpec"))) {
                productsku.put(SpecSum.get("defineId").toString().replace("free", "freeid"), SpecSum.get("lsSpecItems_id"));
                productsku.put(SpecSum.get("defineId").toString().replace("free", "freeid") + "_Name", SpecSum.get("specification_showItem"));
            }
            specItems = specItems + SpecSum.get("specValue");
            specItemIds[currentArrayIndex] = Long.valueOf(SpecSum.get("lsSpecItems_id").toString());
            specs[currentArrayIndex] = SpecSum.get("specification_showItem") + ":" + SpecSum.get("specValue") + ";";
            ++currentArrayIndex;
            if (productspecitems != null && !productspecitems.stream().noneMatch(spec -> spec.get("iSpecId").equals(SpecSum.get("specification")) && spec.get("lsSpecItems_id").equals(SpecSum.get("lsSpecItems_id")))) continue;
            HashMap<String, Object> productspecItem = new HashMap<String, Object>();
            productspecItem.put("specValue", SpecSum.get("specValue"));
            productspecItem.put("iSpecId", SpecSum.get("specification"));
            productspecItem.put("lsSpecItems_id", SpecSum.get("lsSpecItems_id"));
            productspecItem.put("haveImg", false);
            productspecItem.put("_status", EntityStatus.Insert);
            productspecItems.add(productspecItem);
        }
        String specS = ProductUtil.Arrays2String(specs, Character.valueOf(';'));
        productsku.put("specIds", ProductUtil.Arrays2String(specItemIds, Character.valueOf(';')));
        productsku.put("specs", specS);
        productsku.put("erpCode", null);
        productsku.put("productSKUDetail!batchPrice", 0);
        productsku.put("productSKUDetail!saled", 0);
        productsku.put("productSKUDetail!inventoryCount", null);
        productsku.put("productSKUDetail!weight", null);
        productsku.put("productSKUDetail!barCode", null);
        productsku.put("productSKUDetail!batchUnit_Name", null);
        productsku.put("productSKUDetail!batchRate", null);
        productsku.put("productSKUDetail!fLowestMarkPrice", 0);
        HashMap<String, String> nameMap = new HashMap<String, String>();
        if (null != productName.get(InvocationInfoProxy.getLocale())) {
            nameMap.put(InvocationInfoProxy.getLocale(), productName.get(InvocationInfoProxy.getLocale()).toString() + specItems);
        } else {
            nameMap.put("zh_CN", productName.get("zh_CN").toString() + specItems);
        }
        productsku.put("name", nameMap);
        productsku.put("_status", EntityStatus.Insert);
        ArrayList<HashMap<String, Object>> productskus = new ArrayList<HashMap<String, Object>>();
        productskus.add(productsku);
        if (detail.get("productskus") == null) {
            detail.put("productskus", productskus);
        } else {
            ((List)detail.get("productskus")).add(productsku);
        }
        if (detail.get("productspecitems") == null) {
            detail.put("productspecitems", productspecItems);
        } else {
            ((List)detail.get("productspecitems")).addAll(productspecItems);
        }
        for (HashMap productSku : (List)detail.get("productskus")) {
            if (productSku.get("id") == null || org.springframework.util.StringUtils.isEmpty(productSku.get("id"))) continue;
            productSku.put("_status", EntityStatus.Update);
        }
        BillDataDto saveDto = new BillDataDto();
        saveDto.setData((Object)Objectlizer.convert((Map)detail, (String)"pc.product.Product"));
        saveDto.setBillnum("pc_productsku_add");
        RuleExecuteResult result = this.upcBillService.executeUpdate("save", saveDto);
        resultMap.put("specS", specS);
        resultMap.put("result", (String)result);
        return resultMap;
    }

    @Override
    public void updateErpcodeById(BillDataDto bill) throws Exception {
        List<Map> datas = new ArrayList();
        if (bill.getData() != null && bill.getData() instanceof List) {
            datas = (List)bill.getData();
        } else if (bill.getData() != null && bill.getData() instanceof Map) {
            datas.add((Map)bill.getData());
        }
        if (datas != null && datas.size() > 0) {
            for (Map tempData : datas) {
                if (!tempData.containsKey("id") || !tempData.containsKey("objid") && !tempData.containsKey("erpCode")) continue;
                HashMap<String, Object> params = new HashMap<String, Object>();
                if (tempData.containsKey("objid") && tempData.get("objid") != null) {
                    params.put("erpCode", tempData.get("objid"));
                }
                if (tempData.containsKey("erpCode") && tempData.get("erpCode") != null) {
                    params.put("erpCode", tempData.get("erpCode"));
                }
                params.put("id", tempData.get("id"));
                if (!"pc.pc.product".equals(bill.getFullname())) continue;
                params.put("ytenant", AppContext.getYTenantId());
                SqlHelper.update((String)"com.yonyoucloud.upc.product.dao.ProductUpdate.updateProductErpcodeById", params);
            }
        }
    }

    @Override
    public void setUserDefineClassIsEnabledForSave(BillDataDto bill) throws Exception {
        List<String> billNumList = Arrays.asList("aa_customerpro", "pc_productpro", "pc_productskupro", "pc_spepro", "pc_productbrandpro", "pc_productorderpro");
        if (billNumList.contains(bill.getBillnum())) {
            List<Map<String, Object>> billList = this.getBillData(bill);
            for (Map<String, Object> billMap : billList) {
                if (!billMap.containsKey("isEnabled") || billMap.get("isEnabled") == null || !(billMap.get("isEnabled") instanceof Boolean) && !(billMap.get("isEnabled") instanceof String)) continue;
                if (BooleanUtil.isTrue((Object)billMap.get("isEnabled"))) {
                    billMap.put("isEnabled", 1);
                    continue;
                }
                billMap.put("isEnabled", 0);
            }
        }
    }

    @Override
    public void setResultListUserDefineClassIsEnabledForSave(BillDataDto bill, ResultList result) {
        List billList;
        List<String> billNumList = Arrays.asList("aa_customerpro", "pc_productpro", "pc_productskupro", "pc_spepro", "pc_productbrandpro", "pc_productorderpro");
        if (billNumList.contains(bill.getBillnum()) && !CollectionUtils.isEmpty((Collection)(billList = result.getInfos()))) {
            for (Object billObject : billList) {
                Map billMap;
                if (!(billObject instanceof Map) || (billMap = (Map)billObject).get("isEnabled") == null) continue;
                if ("1".equals(billMap.get("isEnabled").toString())) {
                    billMap.put("isEnabled", true);
                    continue;
                }
                if (!"0".equals(billMap.get("isEnabled").toString())) continue;
                billMap.put("isEnabled", false);
            }
        }
    }

    @Override
    public void setResultListUserDefineClassIsEnabledForSave(BillDataDto bill, RuleExecuteResult result) {
        Object billData;
        List<String> billNumList = Arrays.asList("aa_customerpro", "pc_productpro", "pc_productskupro", "pc_spepro", "pc_productbrandpro", "pc_productorderpro");
        if (billNumList.contains(bill.getBillnum()) && (billData = result.getData()) != null) {
            Map billMap;
            if (billData instanceof List) {
                List billList = (List)billData;
                for (Map billMap2 : billList) {
                    if (billMap2.get("isEnabled") == null) continue;
                    if ("1".equals(billMap2.get("isEnabled").toString())) {
                        billMap2.put("isEnabled", true);
                        continue;
                    }
                    if (!"0".equals(billMap2.get("isEnabled").toString())) continue;
                    billMap2.put("isEnabled", false);
                }
            } else if (billData instanceof Map && (billMap = (Map)billData).get("isEnabled") != null) {
                if ("1".equals(billMap.get("isEnabled").toString())) {
                    billMap.put("isEnabled", true);
                } else if ("0".equals(billMap.get("isEnabled").toString())) {
                    billMap.put("isEnabled", false);
                }
            }
        }
    }

    @Override
    public void setBizDataUserDefineClassIsEnabled(ApiDto bill) {
        FilterVO filterVO;
        List<String> billNumList = Arrays.asList("pc.userdef.UserDefineClass");
        if (billNumList.contains(bill.getFullname()) && (filterVO = bill.getCondition()) != null && filterVO.getSimpleVOs() != null) {
            SimpleFilterVO[] simpleFilterVO = filterVO.getSimpleVOs();
            for (int i = 0; i < simpleFilterVO.length; ++i) {
                if (simpleFilterVO[i].getField() != null && simpleFilterVO[i].getField().equals("isEnabled") && simpleFilterVO[i].getValue1() != null) {
                    if ("true".equals(simpleFilterVO[i].getValue1().toString())) {
                        simpleFilterVO[i].setValue1((Object)1);
                        continue;
                    }
                    if (!"false".equals(simpleFilterVO[i].getValue1().toString())) continue;
                    simpleFilterVO[i].setValue1((Object)0);
                    continue;
                }
                if (simpleFilterVO[i].getConditions() == null || simpleFilterVO[i].getConditions().size() == 0) continue;
                List simpleFilterVOList = simpleFilterVO[i].getConditions();
                for (SimpleFilterVO simpleFilterVO1 : simpleFilterVOList) {
                    if (simpleFilterVO1.getField() == null || !simpleFilterVO1.getField().equals("isEnabled") || simpleFilterVO1.getValue1() == null) continue;
                    if ("true".equals(simpleFilterVO1.getValue1().toString())) {
                        simpleFilterVO1.setValue1((Object)1);
                        continue;
                    }
                    if (!"false".equals(simpleFilterVO1.getValue1().toString())) continue;
                    simpleFilterVO1.setValue1((Object)0);
                }
            }
        }
    }

    @Override
    public void setBillPagerUserDefineClassIsEnabled(Pager pager, BillDataDto bill) {
        List billList;
        List<String> billNumList = Arrays.asList("aa_customerprolist", "pc_productprolist", "pc_productskuprolist", "pc_speprolist", "pc_productbrandprolist", "pc_productorderprolist");
        if (billNumList.contains(bill.getBillnum()) && !CollectionUtils.isEmpty((Collection)(billList = pager.getRecordList()))) {
            for (Map billMap : billList) {
                if (billMap.get("isEnabled") == null) continue;
                if ("1".equals(billMap.get("isEnabled").toString())) {
                    billMap.put("isEnabled", true);
                    continue;
                }
                if (!"0".equals(billMap.get("isEnabled").toString())) continue;
                billMap.put("isEnabled", false);
            }
        }
    }

    @Override
    public void setBillDetailUserDefineClassIsEnabled(Map billMap, String billnum) {
        List<String> billNumList = Arrays.asList("aa_customerpro", "pc_productpro", "pc_productskupro", "pc_spepro", "pc_productbrandpro", "pc_productorderpro");
        if (billNumList.contains(billnum) && billMap.get("isEnabled") != null) {
            if ("1".equals(billMap.get("isEnabled").toString())) {
                billMap.put("isEnabled", true);
            } else if ("0".equals(billMap.get("isEnabled").toString())) {
                billMap.put("isEnabled", false);
            }
        }
    }

    @Override
    public void setBillDetailStopstatus(Map billMap, String billnum) {
        if (("pc_brand".equals(billnum) || "pc_managementclass".equals(billnum)) && billMap.containsKey("stopstatus") && billMap.get("stopstatus") != null) {
            if ("true".equals(billMap.get("stopstatus").toString())) {
                billMap.put("stopstatus", 1);
            } else if ("false".equals(billMap.get("stopstatus").toString())) {
                billMap.put("stopstatus", 0);
            }
        }
    }

    @Override
    public void handleBillDetailBool(Map billMap, String billnum) {
        List<String> billNumList = Arrays.asList("aa_customerpro", "pc_productpro", "pc_productskupro", "pc_spepro", "pc_productbrandpro", "pc_productorderpro");
        if (billNumList.contains(billnum)) {
            if (billMap.get("isSerInput") != null) {
                if ("1".equals(billMap.get("isSerInput").toString())) {
                    billMap.put("isSerInput", true);
                } else if ("0".equals(billMap.get("isSerInput").toString())) {
                    billMap.put("isSerInput", false);
                }
            }
            if (billMap.get("isWebShow") != null) {
                if ("1".equals(billMap.get("isWebShow").toString())) {
                    billMap.put("isWebShow", true);
                } else if ("0".equals(billMap.get("isWebShow").toString())) {
                    billMap.put("isWebShow", false);
                }
            }
            if (billMap.get("isWebInput") != null) {
                if ("1".equals(billMap.get("isWebInput").toString())) {
                    billMap.put("isWebInput", true);
                } else if ("0".equals(billMap.get("isWebInput").toString())) {
                    billMap.put("isWebInput", false);
                }
            }
        }
    }

    @Override
    public void setBillListUserDefineClassIsEnabled(List<Map> billList, ApiDto bill) {
        List<String> billNumList = Arrays.asList("pc.userdef.UserDefineClass");
        if (billNumList.contains(bill.getFullname()) && !CollectionUtils.isEmpty(billList)) {
            for (Map billMap : billList) {
                if (billMap.get("isEnabled") == null) continue;
                if ("1".equals(billMap.get("isEnabled").toString())) {
                    billMap.put("isEnabled", true);
                    continue;
                }
                if (!"0".equals(billMap.get("isEnabled").toString())) continue;
                billMap.put("isEnabled", false);
            }
        }
    }

    @Override
    public void setBillPagerNameForSave(BillDataDto bill, RuleExecuteResult result) {
        Object billData;
        List<String> billNumList = Arrays.asList("aa_customerType");
        if (billNumList.contains(bill.getBillnum()) && (billData = result.getData()) != null) {
            Map billMap;
            if (billData instanceof List) {
                List billList = (List)billData;
                for (Map billMap2 : billList) {
                    if (billMap2.get("name") == null) continue;
                    CustomerType customerType = new CustomerType();
                    customerType.set("name", billMap2.get("name"));
                    String localeName = (String)MultilangUtil.getAttr((String)"aa.customertype.CustomerType", (String)"name", (BizObject)customerType, null);
                    billMap2.put("name", localeName);
                }
            } else if (billData instanceof Map && (billMap = (Map)billData).get("name") != null) {
                CustomerType customerType = new CustomerType();
                customerType.set("name", billMap.get("name"));
                String localeName = (String)MultilangUtil.getAttr((String)"aa.customertype.CustomerType", (String)"name", (BizObject)customerType, null);
                billMap.put("name", localeName);
            }
        }
    }

    @Override
    public void setBillPagerIdForSave(BillDataDto bill, RuleExecuteResult result) {
        Object billData;
        List<String> billNumList = Arrays.asList("aa_merchant");
        List<String> actionList = Arrays.asList("batchenable", "batchdisable");
        if (billNumList.contains(bill.getBillnum()) && actionList.contains(bill.getAction()) && (billData = result.getData()) != null) {
            Map billMap;
            if (billData instanceof List) {
                List billList = (List)billData;
                for (Map billMap2 : billList) {
                    if (billMap2.get("id") == null) continue;
                    billMap2.put("id", billMap2.get("id").toString());
                }
            } else if (billData instanceof Map && (billMap = (Map)billData).get("id") != null) {
                billMap.put("id", billMap.get("id").toString());
            }
        }
    }

    private void setMerchantIdByCode(Map<String, Object> billOne) throws Exception {
        if (billOne.containsKey(MERCHANT_CODE) && billOne.get(MERCHANT_CODE) != null) {
            String merchantCode = billOne.get(MERCHANT_CODE).toString();
            List merchantPOList = this.merchantQryDao.queryMerchantBaseFieldByCode(Collections.singletonList(merchantCode));
            if (CollectionUtils.isEmpty((Collection)merchantPOList)) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801634, new Object[]{merchantCode});
            }
            merchantPOList.stream().filter(merchant -> merchant.getCode().equals(merchantCode)).findFirst().ifPresent(merchant -> billOne.put(MERCHANT_ID, merchant.getId()));
        }
    }

    private void setOrgIdByCode(Map<String, Object> billOne) throws CoreDocBusinessException {
        if (billOne.containsKey(ORG_CODE) && billOne.get(ORG_CODE) != null) {
            String orgCode = billOne.get(ORG_CODE).toString();
            List orgList = this.iOrgUnitQueryService.listByCodes(AppContext.getYhtTenantId().toString(), Collections.singletonList(orgCode), null);
            if (CollectionUtils.isEmpty((Collection)orgList)) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801635, new Object[]{orgCode});
            }
            orgList.stream().filter(org -> org.getCode().equals(orgCode)).findFirst().ifPresent(org -> billOne.put("orgId", org.getId()));
        }
    }

    public void afterPropertiesSet() throws Exception {
    }

    private void setProductIdByCode(Map<String, Object> billOne) {
        if (billOne.containsKey("productCode") && !org.springframework.util.StringUtils.isEmpty((Object)billOne.get("productCode"))) {
            MaterialPO materialPO = this.materialQryDao.queryMaterialIdByCode(billOne.get("productCode").toString());
            if (materialPO == null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801072);
            }
            billOne.put("productId", materialPO.getId());
        }
    }
}

