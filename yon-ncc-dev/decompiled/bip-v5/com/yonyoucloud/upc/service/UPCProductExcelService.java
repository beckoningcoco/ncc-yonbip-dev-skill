/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.fileservice.sdk.module.CooperationFileService
 *  com.yonyou.iuap.fileservice.sdk.module.pojo.CooperationFileInfo
 *  com.yonyou.iuap.fileservice.sdk.module.pojo.FileProperty
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.iuap.yms.http.YmsHttpClient
 *  com.yonyou.ucf.mdd.common.model.ResultList
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.base.user.User
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyou.ucf.mdd.ext.model.LoginUser
 *  com.yonyou.ucf.mdd.ext.util.FileKit
 *  com.yonyou.ucf.mdd.ext.util.Toolkit
 *  com.yonyou.ucf.mdd.ext.util.file.oss.OssResult
 *  com.yonyoucloud.upc.utils.ExcelFileUtil
 *  com.yonyoucloud.upc.utils.ExcelMappingUtil
 *  com.yonyoucloud.upc.utils.FileUploadUtils
 *  com.yonyoucloud.upc.utils.ZipFileUtil
 *  org.apache.commons.io.FileUtils
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.imeta.spring.support.id.IdManager
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.beans.factory.annotation.Qualifier
 *  org.springframework.stereotype.Service
 *  org.springframework.transaction.annotation.Propagation
 *  org.springframework.transaction.annotation.Transactional
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service;

import com.alibaba.fastjson.JSON;
import com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.fileservice.sdk.module.CooperationFileService;
import com.yonyou.iuap.fileservice.sdk.module.pojo.CooperationFileInfo;
import com.yonyou.iuap.fileservice.sdk.module.pojo.FileProperty;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.iuap.yms.http.YmsHttpClient;
import com.yonyou.ucf.mdd.common.model.ResultList;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.base.user.User;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyou.ucf.mdd.ext.model.LoginUser;
import com.yonyou.ucf.mdd.ext.util.FileKit;
import com.yonyou.ucf.mdd.ext.util.Toolkit;
import com.yonyou.ucf.mdd.ext.util.file.oss.OssResult;
import com.yonyoucloud.iuap.upc.api.service.IUPCBillService;
import com.yonyoucloud.iuap.upc.api.service.IUPCProductExcelService;
import com.yonyoucloud.iuap.upc.api.service.IUPCProductQueryService;
import com.yonyoucloud.upc.billrule.productsku.ProductSkuAddSaveRule;
import com.yonyoucloud.upc.cache.BizCache;
import com.yonyoucloud.upc.event.EventService2;
import com.yonyoucloud.upc.event.EventType;
import com.yonyoucloud.upc.service.ProductImportSubDataParsingService;
import com.yonyoucloud.upc.service.ProductSkuService;
import com.yonyoucloud.upc.service.ProductTplApiDataService;
import com.yonyoucloud.upc.utils.ExcelFileUtil;
import com.yonyoucloud.upc.utils.ExcelMappingUtil;
import com.yonyoucloud.upc.utils.FileUploadUtils;
import com.yonyoucloud.upc.utils.ZipFileUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.imeta.spring.support.id.IdManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

@Service(value="pc.productExcelService")
public class UPCProductExcelService
implements IUPCProductExcelService {
    private static final Logger log = LoggerFactory.getLogger(UPCProductExcelService.class);
    @Autowired
    CooperationFileService cooperationFileService;
    @Autowired
    YMSParamConfig ymsParamConfig;
    @Autowired
    ProductImportSubDataParsingService productImportSubDataParsingService;
    @Autowired
    @Qualifier(value="coredocYmsHttpClient")
    private YmsHttpClient ymsHttpClient;
    private static Logger logger = LoggerFactory.getLogger(UPCProductExcelService.class);
    private static final String ZIPPATTERN = "^(zip|ZIP)$";
    private static final Map<Object, List<String>> SPECFREES_CHECK_DOMAIN;
    private static final HashMap<String, String> DOMAIN_RULE;
    private static Set<String> skuAPIUpdateUnreplaceKeySet;
    @Autowired
    private IUPCProductQueryService upcProductQueryService;
    @Autowired
    BizCache cache;
    @Autowired
    private FileUploadUtils fileUpload;
    @Autowired
    @Qualifier(value="pc.billApiService")
    private IUPCBillService upcBillService;
    private static final String REGEX_SCRIPT = "<((?i)script)[^>]*?>[\\s\\S]*?<\\/((?i)script)>";
    @Autowired
    private EventService2 eventService2;
    @Autowired
    ProductTplApiDataService productTplApiDataService;
    @Autowired
    ProductSkuService productSkuService;
    @Autowired
    ProductSkuAddSaveRule productSkuAddSaveRule;
    boolean isFirstSKU = false;
    String checkProductCode = "";

    private static Object turnEnum(String enumtype, Object enumValue) {
        Object enumKey = null;
        switch (enumtype) {
            case "saleStyle": {
                if (UPCProductExcelService.isNotNull(enumValue) && InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080815", (String)"\u79ef\u5206\u6362\u8d2d").equals(enumValue.toString())) {
                    enumKey = "2";
                    break;
                }
                enumKey = "1";
                break;
            }
            case "boolean": {
                if (UPCProductExcelService.isNotNull(enumValue) && (InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408081B", (String)"\u662f").equals(enumValue.toString()) || "true".equals(enumValue.toString().toLowerCase()) || "1".equals(enumValue.toString()))) {
                    enumKey = true;
                    break;
                }
                enumKey = false;
                break;
            }
            case "expireDateUnit": {
                if (UPCProductExcelService.isNotNull(enumValue) && InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408081E", (String)"\u5e74").equals(enumValue.toString())) {
                    enumKey = 1;
                    break;
                }
                if (UPCProductExcelService.isNotNull(enumValue) && InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408081F", (String)"\u6708").equals(enumValue.toString())) {
                    enumKey = 2;
                    break;
                }
                enumKey = 6;
                break;
            }
            case "retailPriceDimension": {
                if (UPCProductExcelService.isNotNull(enumValue) && InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080823", (String)"\u5546\u54c1SKU").equals(enumValue.toString())) {
                    enumKey = 2;
                    break;
                }
                enumKey = 1;
                break;
            }
            case "istatus": {
                if (UPCProductExcelService.isNotNull(enumValue) && InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080827", (String)"\u4e0a\u67b6").equals(enumValue.toString())) {
                    enumKey = true;
                    break;
                }
                enumKey = false;
                break;
            }
        }
        return enumKey;
    }

    private static boolean isNotNull(Object obj) {
        return null != obj && !"".equals(obj.toString().trim());
    }

    private static boolean isNull(Object obj) {
        return null == obj || "".equals(obj.toString().trim());
    }

    private static String removeHtml(String htmlStr) {
        Pattern p_w = Pattern.compile(REGEX_SCRIPT, 2);
        Matcher m_w = p_w.matcher(htmlStr);
        htmlStr = m_w.replaceAll("");
        return htmlStr.trim();
    }

    @Override
    public ResultList importProAlbumAndDesc(InputStream fileInputStream, String billnum, BillDataDto bill) throws Exception {
        log.info(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408082F", (String)"\u8fdb\u5165\u5546\u54c1\u56fe\u518c\u8be6\u60c5\u4fe1\u606f\u5bfc\u5165--importProAlbumAndDesc---------------------"));
        LoginUser user = AppContext.getCurrentUser();
        Long tenantid = (Long)AppContext.getTenantId();
        String fileName = (String)bill.getPartParam().get("multipartFileName");
        String postfix = fileName.substring(fileName.lastIndexOf("."));
        String prefix = fileName.substring(0, fileName.lastIndexOf("."));
        File productFile = new File(System.getenv("java.io.tmpdir") + prefix + UUID.randomUUID().toString().replace("-", "") + postfix);
        productFile.setExecutable(true);
        productFile.setReadable(true);
        productFile.setWritable(true);
        try (InputStream is = fileInputStream;
             FileOutputStream os = new FileOutputStream(productFile);){
            int len;
            byte[] buffer = new byte[8192];
            while ((len = is.read(buffer)) != -1) {
                ((OutputStream)os).write(buffer, 0, len);
            }
        }
        long iLength = productFile.length();
        log.info(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408083E", (String)"\u5546\u54c1\u4fe1\u606f\u5bfc\u5165_importProAlbumAndDesc_tenant:") + tenantid.toString() + "_user" + user.getId().toString() + iLength);
        if (iLength > 0x6400000L) {
            productFile.delete();
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801078);
        }
        String cKey = "ImportProduct_" + tenantid;
        String cImportProdcutMark = AppContext.cache().get(cKey);
        if (UPCProductExcelService.isNotNull(cImportProdcutMark)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801079);
        }
        AppContext.cache().set(cKey, "ImportProduct", 3);
        Pattern excelpattern = Pattern.compile("^(xls|XLS|XLSX|xlsx)$");
        Pattern zippattern = Pattern.compile(ZIPPATTERN);
        File excelFile = null;
        File unzipFolder = null;
        File picFolder = null;
        File descriptionPicFolder = null;
        File picMapFile = null;
        File descriptionMapFile = null;
        if (excelpattern.matcher(FileKit.getFileExtension((File)productFile)).matches()) {
            excelFile = productFile;
            excelFile.setExecutable(true);
            excelFile.setReadable(true);
            excelFile.setWritable(true);
        }
        if (zippattern.matcher(FileKit.getFileExtension((File)productFile)).matches()) {
            String uuid = UUID.randomUUID().toString().replace("-", "");
            String upzipFolder = AppContext.getApplicationPath() + File.separator + "tmp" + File.separator + uuid + File.separator;
            unzipFolder = FileUtils.getFile((String[])new String[]{upzipFolder});
            unzipFolder.setExecutable(true);
            unzipFolder.setReadable(true);
            unzipFolder.setWritable(true);
            if (!unzipFolder.exists()) {
                unzipFolder.mkdirs();
            }
            ZipFileUtil.unzip((String)productFile.getPath(), (String)upzipFolder);
            productFile.delete();
            for (File temFile : unzipFolder.listFiles()) {
                temFile.setExecutable(true);
                temFile.setReadable(true);
                temFile.setWritable(true);
                if (temFile.isDirectory()) {
                    if ("image".equals(temFile.getName())) {
                        picFolder = temFile;
                        picFolder.setExecutable(true);
                        picFolder.setReadable(true);
                        picFolder.setWritable(true);
                        continue;
                    }
                    if (!"description".equals(temFile.getName())) continue;
                    descriptionPicFolder = temFile;
                    descriptionPicFolder.setExecutable(true);
                    descriptionPicFolder.setReadable(true);
                    descriptionPicFolder.setWritable(true);
                    continue;
                }
                if (excelpattern.matcher(FileKit.getFileExtension((File)temFile)).matches()) {
                    excelFile = temFile;
                    excelFile.setExecutable(true);
                    excelFile.setReadable(true);
                    excelFile.setWritable(true);
                    continue;
                }
                if (temFile.getPath().contains("description_map.json")) {
                    descriptionMapFile = temFile;
                    descriptionMapFile.setExecutable(true);
                    descriptionMapFile.setReadable(true);
                    descriptionMapFile.setWritable(true);
                    continue;
                }
                if (!temFile.getPath().contains("image_map.json")) continue;
                picMapFile = temFile;
                picMapFile.setExecutable(true);
                picMapFile.setReadable(true);
                picMapFile.setWritable(true);
            }
        }
        ResultList result = new ResultList();
        String fileServerUrl = this.fileUpload.getFileServerUrl();
        if (excelFile != null) {
            excelFile.setExecutable(true);
            excelFile.setWritable(true);
            excelFile.setReadable(true);
            ArrayList<BizObject> productList = new ArrayList<BizObject>();
            log.info(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040807F3", (String)"\u5546\u54c1\u4fe1\u606f\u66f4\u65b0----importProAlbumAndDesc-------\u5bfc\u5165\u5546\u54c1\u56fe\u518c\u8be6\u60c5\u4fe1\u606f\u5f00\u59cb------------"));
            this.importProAlbumAndDescFile(excelFile, result, tenantid, (User)user, descriptionPicFolder, picFolder, productList, fileServerUrl, bill);
            log.info(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040807F4", (String)"\u5546\u54c1\u4fe1\u606f\u66f4\u65b0----importProAlbumAndDesc-------\u5bfc\u5165\u5546\u54c1\u56fe\u518c\u8be6\u60c5\u4fe1\u606f\u7ed3\u675f------------"));
        }
        if (unzipFolder != null) {
            unzipFolder.setExecutable(true);
            unzipFolder.setWritable(true);
            unzipFolder.setReadable(true);
            FileKit.deleteDir((File)unzipFolder);
        }
        AppContext.cache().del(new String[]{cKey});
        return result;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void importProAlbumAndDescFile(File excelFile, ResultList result, Long tenantid, User user, File descriptionPicFolder, File picFolder, List<BizObject> productList, String fileServerUrl, BillDataDto billDataDto) {
        HashMap<String, Object> data = new HashMap<String, Object>();
        HashMap<String, Object> processMap = new HashMap<String, Object>();
        String fileName = excelFile.getName();
        excelFile.setReadable(true);
        excelFile.setWritable(true);
        excelFile.setExecutable(true);
        try {
            if ("csv".equals(FileKit.getFileExtension((File)excelFile)) || "CSV".equals(FileKit.getFileExtension((File)excelFile))) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801080);
            }
            Map mapping = ExcelMappingUtil.getProAlbumAndDescMapping();
            try (FileInputStream fis = new FileInputStream(excelFile);){
                Map<String, Object> saveresult;
                List psMap = ExcelFileUtil.parseExcel((InputStream)fis, (String)fileName, (Map)mapping, (int)0, (int)2);
                this.checkPsMap(psMap);
                if (picFolder != null) {
                    picFolder.setReadable(true);
                    picFolder.setWritable(true);
                    picFolder.setExecutable(true);
                }
                if (descriptionPicFolder != null) {
                    descriptionPicFolder.setReadable(true);
                    descriptionPicFolder.setWritable(true);
                    descriptionPicFolder.setExecutable(true);
                }
                result.setCount(((Integer)((saveresult = this.doSaveProAlbumAndDesc(psMap, tenantid, descriptionPicFolder, picFolder, fileServerUrl, billDataDto)).get("count") == null ? Integer.valueOf(0) : saveresult.get("count"))).intValue());
                result.setSucessCount(((Integer)(saveresult.get("succount") == null ? Integer.valueOf(0) : saveresult.get("succount"))).intValue());
                result.setFailCount(((Integer)(saveresult.get("errcount") == null ? Integer.valueOf(0) : saveresult.get("errcount"))).intValue());
                result.setMessages((List)saveresult.get("errMessage"));
                if (!StringUtils.isEmpty((CharSequence)billDataDto.getAsyncKey())) {
                    data.put("messages", result.getMessages());
                    data.put("count", result.getCount());
                    data.put("sucessCount", result.getSucessCount());
                    data.put("failCount", result.getFailCount());
                    data.put("percentage", "100.00");
                    processMap.put("data", data);
                    processMap.put("flag", 1);
                    processMap.put("code", 200);
                    processMap.put("count", result.getCount());
                    processMap.put("totalCount", result.getCount());
                    processMap.put("percentage", "100.00");
                    AppContext.cache().set(billDataDto.getAsyncKey(), JSON.toJSONString(processMap));
                }
            }
        }
        catch (Exception e1) {
            log.info(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080805", (String)"importProAlbumAndDescFile-\u5546\u54c1\u56fe\u518c\u5bfc\u5165\u5931\u8d25:{}"), (Throwable)e1);
            ArrayList<String> resultlist = new ArrayList<String>();
            resultlist.add(e1.getMessage());
            result.setMessages(resultlist);
            if (UPCProductExcelService.isNotNull(billDataDto.getAsyncKey())) {
                processMap.put("data", result.getMessages().toString());
                processMap.put("flag", "0");
                AppContext.cache().set(billDataDto.getAsyncKey(), JSON.toJSONString(processMap));
            }
        }
        finally {
            if (excelFile.exists()) {
                excelFile.delete();
            }
        }
    }

    private void checkPsMap(List<Map<String, Object>> psMap) {
        Iterator<Map<String, Object>> iter = psMap.iterator();
        while (iter.hasNext()) {
            Map<String, Object> psitem = iter.next();
            if (!UPCProductExcelService.isNull(psitem.get("code")) || !UPCProductExcelService.isNull(psitem.get("name")) || !UPCProductExcelService.isNull(psitem.get("productAlbums_fileName")) || !UPCProductExcelService.isNull(psitem.get("description_description")) || !UPCProductExcelService.isNull(psitem.get("description_mobileDescription")) || !UPCProductExcelService.isNull(psitem.get("description_titleMemo"))) continue;
            iter.remove();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Map<String, Object> doSaveProAlbumAndDesc(List<Map<String, Object>> psMap, Long tenantid, File descriptionPicFolder, File picFolder, String fileUrl, BillDataDto billDataDto) throws Exception {
        HashMap<String, Object> resultMap = new HashMap<String, Object>();
        HashMap resultps = new HashMap();
        ArrayList<Object> errMessagelist = new ArrayList<Object>();
        HashMap<String, Object> data = new HashMap<String, Object>();
        HashMap<String, Object> processMap = new HashMap<String, Object>();
        Integer count = 0;
        Integer errcount = 0;
        Integer currentrow = 2;
        log.info(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080818", (String)"\u5546\u54c1\u56fe\u518c\u4e0e\u8be6\u60c5\u66f4\u65b0\u5bfc\u5165doSaveProAlbumAndDesc-begin"));
        log.info(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408081A", (String)"\u5546\u54c1\u56fe\u518c\u4e0e\u8be6\u60c5\u66f4\u65b0\u5bfc\u5165doSaveProAlbumAndDesc-begin-\u5546\u54c1\u6570\u636e\uff1a{}"), psMap);
        for (Map<String, Object> psitem : psMap) {
            currentrow = currentrow + 1;
            count = count + 1;
            Object result = null;
            try {
                errcount = this.saveMaterialAlbum(psMap, tenantid, descriptionPicFolder, picFolder, fileUrl, billDataDto, psitem, currentrow, errMessagelist, errcount, data, count, processMap);
            }
            catch (Exception e) {
                try {
                    log.info(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408082E", (String)"\u5546\u54c1\u56fe\u518c\u4e0e\u8be6\u60c5\u66f4\u65b0\u5bfc\u5165doSaveProAlbumAndDesc-exception-\u5546\u54c1\u7f16\u7801\uff1a{}"), (Throwable)e);
                    errMessagelist.add(e.getMessage());
                    errcount = errcount + 1;
                    log.info(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080832", (String)"\u5546\u54c1\u56fe\u518c\u4e0e\u8be6\u60c5\u66f4\u65b0\u5bfc\u5165doSaveProAlbumAndDesc-rollback2-\u5546\u54c1\u7f16\u7801"));
                }
                catch (Throwable throwable) {
                    if (!StringUtils.isEmpty((CharSequence)billDataDto.getAsyncKey())) {
                        data.put("count", psMap.size());
                        data.put("totalcount", psMap.size());
                        data.put("sucessCount", count - errcount);
                        data.put("failCount", errcount);
                        data.put("percentage", Toolkit.getPrecentValue((int)psMap.size(), (int)count));
                        data.put("messages", errMessagelist);
                        processMap.put("data", data);
                        processMap.put("percentage", Toolkit.getPrecentValue((int)psMap.size(), (int)count));
                        processMap.put("count", psMap.size());
                        processMap.put("totalCount", psMap.size());
                        processMap.put("flag", "1");
                        processMap.put("code", 200);
                        AppContext.cache().set(billDataDto.getAsyncKey(), JSON.toJSONString(processMap));
                    }
                    throw throwable;
                }
                if (StringUtils.isEmpty((CharSequence)billDataDto.getAsyncKey())) continue;
                data.put("count", psMap.size());
                data.put("totalcount", psMap.size());
                data.put("sucessCount", count - errcount);
                data.put("failCount", errcount);
                data.put("percentage", Toolkit.getPrecentValue((int)psMap.size(), (int)count));
                data.put("messages", errMessagelist);
                processMap.put("data", data);
                processMap.put("percentage", Toolkit.getPrecentValue((int)psMap.size(), (int)count));
                processMap.put("count", psMap.size());
                processMap.put("totalCount", psMap.size());
                processMap.put("flag", "1");
                processMap.put("code", 200);
                AppContext.cache().set(billDataDto.getAsyncKey(), JSON.toJSONString(processMap));
                continue;
            }
            if (StringUtils.isEmpty((CharSequence)billDataDto.getAsyncKey())) continue;
            data.put("count", psMap.size());
            data.put("totalcount", psMap.size());
            data.put("sucessCount", count - errcount);
            data.put("failCount", errcount);
            data.put("percentage", Toolkit.getPrecentValue((int)psMap.size(), (int)count));
            data.put("messages", errMessagelist);
            processMap.put("data", data);
            processMap.put("percentage", Toolkit.getPrecentValue((int)psMap.size(), (int)count));
            processMap.put("count", psMap.size());
            processMap.put("totalCount", psMap.size());
            processMap.put("flag", "1");
            processMap.put("code", 200);
            AppContext.cache().set(billDataDto.getAsyncKey(), JSON.toJSONString(processMap));
        }
        log.info(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408083B", (String)"\u5546\u54c1\u56fe\u518c\u4e0e\u8be6\u60c5\u66f4\u65b0\u5bfc\u5165doSaveProAlbumAndDesc-end"));
        resultMap.put("errMessage", errMessagelist);
        resultMap.put("count", count);
        resultMap.put("succount", count - errcount);
        resultMap.put("errcount", errcount);
        return resultMap;
    }

    @Transactional(propagation=Propagation.REQUIRED, rollbackFor={Exception.class})
    private Integer saveMaterialAlbum(List<Map<String, Object>> psMap, Long tenantid, File descriptionPicFolder, File picFolder, String fileUrl, BillDataDto billDataDto, Map<String, Object> psitem, Integer currentrow, List<Object> errMessagelist, Integer errcount, Map<String, Object> data, Integer count, Map<String, Object> processMap) throws Exception {
        RuleExecuteResult result;
        if (null != picFolder) {
            picFolder.setReadable(true);
            picFolder.setWritable(true);
            picFolder.setExecutable(true);
        }
        if (null != descriptionPicFolder) {
            descriptionPicFolder.setReadable(true);
            descriptionPicFolder.setWritable(true);
            descriptionPicFolder.setExecutable(true);
        }
        if ((result = this.saveOneAlbumAndDesc(psitem, currentrow, tenantid, descriptionPicFolder, picFolder, fileUrl)).getMsgCode() != 1) {
            errMessagelist.add(result.getMessage());
            errcount = errcount + 1;
            log.info(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408082A", (String)"\u5546\u54c1\u56fe\u518c\u4e0e\u8be6\u60c5\u66f4\u65b0\u5bfc\u5165doSaveProAlbumAndDesc-rollback1-\u5546\u54c1\u7f16\u7801"));
        } else {
            log.info(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408082C", (String)"\u5546\u54c1\u56fe\u518c\u4e0e\u8be6\u60c5\u66f4\u65b0\u5bfc\u5165doSaveProAlbumAndDesc-commit-\u5546\u54c1\u7f16\u7801"));
        }
        return errcount;
    }

    private RuleExecuteResult saveOneAlbumAndDesc(Map<String, Object> psitem, Integer currentrow, Long tenantid, File descriptionPicFolder, File picFolder, String fileUrl) throws Exception {
        RuleExecuteResult result = new RuleExecuteResult();
        result.setMsgCode(1);
        if (UPCProductExcelService.isNull(psitem.get("code"))) {
            result.setMsgCode(-1);
            result.setMessage(MessageFormat.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080845", (String)"\u7b2c[{0}]\u884c\u7684\u7f16\u7801\u4e3a\u7a7a\uff0c\u4e0d\u80fd\u66f4\u65b0\u56fe\u518c"), currentrow.toString()));
            return result;
        }
        List products = MetaDaoHelper.query((String)"pc.product.Product", (QuerySchema)QuerySchema.create().addSelect(new String[]{"id", "name"}).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").in(new Object[]{psitem.get("code")})})));
        if (CollectionUtils.isEmpty((Collection)products)) {
            result.setMsgCode(-1);
            result.setMessage(MessageFormat.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080849", (String)"\u7b2c[{0}]\u884c\u7269\u6599\u7f16\u7801\u5bf9\u5e94\u7684\u7269\u6599\u672a\u627e\u5230\uff0c\u8bf7\u68c0\u67e5\uff01"), currentrow.toString()));
            return result;
        }
        Boolean updateAlbums = false;
        Boolean updateDesc = false;
        Object proAlbums = null;
        Map<Object, Object> imgBusinessIdMap = new HashMap();
        if (UPCProductExcelService.isNotNull(psitem.get("productAlbums_fileName"))) {
            updateAlbums = true;
            try {
                if (null != picFolder) {
                    picFolder.setReadable(true);
                    picFolder.setWritable(true);
                    picFolder.setExecutable(true);
                }
                imgBusinessIdMap = this.changeimgbusinessId(psitem.get("productAlbums_fileName"), tenantid, picFolder, fileUrl);
            }
            catch (Exception e) {
                result.setMsgCode(-1);
                result.setMessage(MessageFormat.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040807E2", (String)"\u7b2c[{0}]\u884c\u6570\u636e\u6709\u56fe\u7247\u672a\u627e\u5230\uff0c\u8bf7\u68c0\u67e5\uff01"), currentrow.toString()));
                return result;
            }
        }
        HashMap proDesc = new HashMap();
        Object proPCDesc = null;
        Object proMobileDesc = null;
        Object protitleMemoDesc = null;
        if (UPCProductExcelService.isNotNull(psitem.get("description_description"))) {
            updateDesc = true;
            if (null != descriptionPicFolder) {
                descriptionPicFolder.setReadable(true);
                descriptionPicFolder.setWritable(true);
                descriptionPicFolder.setExecutable(true);
            }
            proPCDesc = this.changeProDesc(psitem.get("description_description"), tenantid, descriptionPicFolder, fileUrl);
        }
        if (UPCProductExcelService.isNotNull(psitem.get("description_mobileDescription"))) {
            updateDesc = true;
            proMobileDesc = this.changeProDesc(psitem.get("description_mobileDescription"), tenantid, descriptionPicFolder, fileUrl);
        }
        if (UPCProductExcelService.isNotNull(psitem.get("description_titleMemo"))) {
            updateDesc = true;
            protitleMemoDesc = psitem.get("description_titleMemo");
        }
        if (!updateAlbums.booleanValue() && !updateDesc.booleanValue()) {
            result.setMsgCode(-1);
            result.setMessage(MessageFormat.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040807EB", (String)"\u7b2c[{0}]\u884c\u5546\u54c1\u3010{1}\u3011\u7684\u6ca1\u6709\u8981\u66f4\u65b0\u7684\u6570\u636e"), currentrow.toString(), psitem.get("code").toString()));
            return result;
        }
        HashMap<String, Object> paramMap = new HashMap<String, Object>();
        if (updateAlbums.booleanValue() && !imgBusinessIdMap.isEmpty()) {
            paramMap = new HashMap();
            if (imgBusinessIdMap.get("homepageBusinessId") != null) {
                paramMap.put("homepageBusinessId", imgBusinessIdMap.get("homepageBusinessId"));
            }
            if (imgBusinessIdMap.get("imgBusinessId") != null) {
                paramMap.put("imgBusinessId", imgBusinessIdMap.get("imgBusinessId"));
            }
            paramMap.put("tenantid", tenantid);
            paramMap.put("procode", psitem.get("code").toString());
            SqlHelper.update((String)"com.yonyoucloud.upc.productBatchHandle.dao.productdata.upProImgBusinessIdByCode_Update", paramMap);
        }
        if (updateDesc.booleanValue()) {
            paramMap = new HashMap();
            paramMap.put("tenantid", tenantid);
            paramMap.put("procode", psitem.get("code").toString());
            paramMap.put("proPCDesc", proPCDesc);
            paramMap.put("proMobileDesc", proMobileDesc);
            paramMap.put("protitleMemoDesc", protitleMemoDesc);
            paramMap.put("ytenantId", AppContext.getYTenantId());
            paramMap.put("id", IdManager.getInstance().nextId());
            SqlHelper.update((String)"com.yonyoucloud.upc.productBatchHandle.dao.productdata.upProDescByCode_Insert", paramMap);
            SqlHelper.update((String)"com.yonyoucloud.upc.productBatchHandle.dao.productdata.upProDescByCode_Update", paramMap);
        }
        EventType eventType = EventType.find("pc_product", "import", "AlbumAndDescImport");
        HashMap<String, Object> businessObject = new HashMap<String, Object>();
        businessObject.put("fullname", "pc.product.Product");
        businessObject.put("productId", ((Map)products.get(0)).get("id").toString());
        try {
            this.eventService2.sendEvent("YXYBASEDOC", eventType.toString(), businessObject);
        }
        catch (Exception e) {
            logger.error("\u7269\u6599\u6863\u6848\u66f4\u65b0\u56fe\u518c\u5bfc\u5165\u53d1\u9001\u4e8b\u4ef6\u5931\u8d25({})\uff1a" + e.getMessage(), (Throwable)e);
        }
        return result;
    }

    private Map<String, Object> changeimgbusinessId(Object productAlbums_fileName, Long tenantid, File picFolder, String fileUrl) throws Exception {
        HashMap<String, Object> imgbusinessIds = new HashMap<String, Object>();
        String imgBusinessId = UUID.randomUUID().toString();
        String homepageBusinessId = UUID.randomUUID().toString();
        if (productAlbums_fileName != null) {
            String[] productAlbumsFileNameList = StringUtils.split((String)productAlbums_fileName.toString(), (String)";");
            int uploadNum = 0;
            for (String productAlbumsFileName : productAlbumsFileNameList) {
                String filename = productAlbumsFileName.replace("\\image\\", "");
                if (picFolder == null || !picFolder.exists() || !picFolder.isDirectory()) continue;
                picFolder.setWritable(false);
                picFolder.setExecutable(false);
                picFolder.setReadable(true);
                for (File temFile : picFolder.listFiles()) {
                    String fileId;
                    if (!temFile.getName().equalsIgnoreCase(filename)) continue;
                    temFile.setReadable(true);
                    if (uploadNum == 0 && !"".equals(fileId = this.uploadFile("iuap-apdoc-material", homepageBusinessId, temFile))) {
                        imgbusinessIds.put("homepageBusinessId", homepageBusinessId);
                    }
                    if ("".equals(fileId = this.uploadFile("iuap-apdoc-material", imgBusinessId, temFile))) continue;
                    ++uploadNum;
                }
            }
            if (uploadNum != productAlbumsFileNameList.length) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801081);
            }
            imgbusinessIds.put("imgBusinessId", imgBusinessId);
        }
        return imgbusinessIds;
    }

    private String uploadFile(String appCode, String businessId, File file) throws Exception {
        String fileId = "";
        String yhtTenantId = AppContext.getCurrentUser().getYhtTenantId();
        String yhtUserId = AppContext.getCurrentUser().getYhtUserId();
        FileProperty fileProperty = FileProperty.builder().tenantId(yhtTenantId).yhtUserId(yhtUserId).build();
        try {
            CooperationFileInfo cooperationFileInfo = this.cooperationFileService.uploadFile(appCode, businessId, file, fileProperty);
            fileId = cooperationFileInfo.getFileId();
        }
        catch (Exception e) {
            log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080816", (String)"uploadFile-\u4e0a\u4f20\u5546\u54c1\u56fe\u7247\u51fa\u9519_\u79df\u6237id{}_\u9519\u8bef\u4fe1\u606f_{}"), (Object)(yhtTenantId + e.getMessage()), (Object)e);
        }
        return fileId;
    }

    private Object changeProDesc(Object description, Long tenantid, File descriptionPicFolder, String fileUrl) throws Exception {
        String descriptiontmp = "";
        if (descriptionPicFolder != null) {
            descriptionPicFolder.setExecutable(true);
            descriptionPicFolder.setWritable(true);
            descriptionPicFolder.setReadable(true);
        }
        if (description != null && !"".equals(description.toString())) {
            String[] descstrlist;
            for (String descstr : descstrlist = StringUtils.split((String)description.toString(), (String)"|")) {
                if (descstr.indexOf("$$") > -1) {
                    String filename = descstr.replace("$$\\description\\", "");
                    String imgUrl = "";
                    imgUrl = this.fileUploadBackurl(filename, descriptionPicFolder);
                    if (!"".equals(imgUrl)) {
                        String imgStr = "<img src='" + imgUrl + "' title='' alt=''/>";
                        descriptiontmp = descriptiontmp + imgStr;
                        continue;
                    }
                    descriptiontmp = descriptiontmp + descstr.toString();
                    continue;
                }
                descriptiontmp = descriptiontmp + descstr.toString();
            }
        }
        descriptiontmp = UPCProductExcelService.removeHtml(descriptiontmp);
        return descriptiontmp;
    }

    private OssResult findFileAndUpload(String productAlbumsFileName, Long tenantid, File fileFolder, String fileUrl) throws Exception {
        OssResult ossResult;
        block3: {
            ossResult = null;
            try {
                if (fileFolder == null || !fileFolder.exists() || !fileFolder.isDirectory()) break block3;
                fileFolder.setWritable(false);
                fileFolder.setExecutable(false);
                fileFolder.setReadable(true);
                for (File temFile : fileFolder.listFiles()) {
                    if (!temFile.getName().equalsIgnoreCase(productAlbumsFileName)) continue;
                    temFile.setReadable(true);
                    ossResult = this.fileUpload.uploadGoodsPicPhoto(temFile, tenantid, null, "");
                    break;
                }
            }
            catch (Exception e) {
                log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080816", (String)"findFileAndUpload-\u4e0a\u4f20\u5546\u54c1\u56fe\u7247\u51fa\u9519_\u79df\u6237id{}_\u9519\u8bef\u4fe1\u606f_{}"), (Object)(tenantid + e.getMessage()), (Object)e);
            }
        }
        return ossResult;
    }

    private String fileUploadBackurl(String productAlbumsFileName, File fileFolder) throws Exception {
        String fileId;
        block3: {
            String attBusinessId = UUID.randomUUID().toString();
            fileId = "";
            try {
                if (fileFolder == null || !fileFolder.exists() || !fileFolder.isDirectory()) break block3;
                fileFolder.setWritable(false);
                fileFolder.setExecutable(false);
                fileFolder.setReadable(true);
                for (File temFile : fileFolder.listFiles()) {
                    if (!temFile.getName().equalsIgnoreCase(productAlbumsFileName)) continue;
                    temFile.setReadable(true);
                    fileId = this.uploadFile("iuap-apdoc-material", attBusinessId, temFile);
                    break;
                }
            }
            catch (Exception e) {
                log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080816", (String)"findFileAndUpload-\u4e0a\u4f20\u5546\u54c1\u56fe\u7247\u51fa\u9519_\u79df\u6237id{}_\u9519\u8bef\u4fe1\u606f_{}"), (Object)(AppContext.getCurrentUser().getYhtTenantId() + e.getMessage()), (Object)e);
            }
        }
        return this.productImportSubDataParsingService.replaceUrlForImage(fileId);
    }

    static {
        skuAPIUpdateUnreplaceKeySet = new HashSet<String>(){
            {
                this.add("id");
                this.add("code");
                this.add("specs");
                this.add("productId");
                this.add("productApplyRangeId");
            }
        };
        SPECFREES_CHECK_DOMAIN = new HashMap<Object, List<String>>();
        SPECFREES_CHECK_DOMAIN.put(0, (List<String>)new ArrayList<String>(){
            {
                this.add("yonyoufi");
                this.add("retail");
            }
        });
        SPECFREES_CHECK_DOMAIN.put(1, (List<String>)new ArrayList<String>(){
            {
                this.add("engineeringdata");
                this.add("upu");
                this.add("udinghuo");
            }
        });
        DOMAIN_RULE = new HashMap();
        DOMAIN_RULE.put("yonyoufi", "productIdReferCheckRule");
        DOMAIN_RULE.put("upu", "upuProductQuoteNoOrgCheckRule");
        DOMAIN_RULE.put("engineeringdata", "deleteMaterialCheckRule");
        DOMAIN_RULE.put("retail", "retailProductQuoteNoOrgCheckRule");
    }
}

