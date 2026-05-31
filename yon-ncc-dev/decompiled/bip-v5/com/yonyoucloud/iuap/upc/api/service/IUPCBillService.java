/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.common.model.Pager
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.api.IBillService
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.common.ResultList
 *  com.yonyou.ucf.mdd.ext.poi.model.ExcelExportData
 *  com.yonyoucloud.upc.pc.userdef.UserDefineClass
 *  javax.servlet.http.HttpServletRequest
 *  javax.servlet.http.HttpServletResponse
 *  org.springframework.web.multipart.MultipartFile
 */
package com.yonyoucloud.iuap.upc.api.service;

import com.yonyou.ucf.mdd.common.model.Pager;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.api.IBillService;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.common.ResultList;
import com.yonyou.ucf.mdd.ext.poi.model.ExcelExportData;
import com.yonyoucloud.iuap.upc.api.service.ApiDto;
import com.yonyoucloud.upc.pc.userdef.UserDefineClass;
import com.yonyoucloud.upc.service.operationalTools.DeleteToolDto;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.multipart.MultipartFile;

public interface IUPCBillService
extends IBillService {
    public List<Map> getBizData(BillDataDto var1) throws Exception;

    public Pager getBizDataPage(BillDataDto var1) throws Exception;

    public Map getBizObject(BillDataDto var1) throws Exception;

    public Map getBizObject(String var1, Long var2) throws Exception;

    public List<Map<String, Object>> getSpecification(List<String> var1) throws Exception;

    public List<UserDefineClass> getSpecification(Long var1) throws Exception;

    public List<Map> getProductAlbumByProductIDs(BillDataDto var1) throws Exception;

    public List<Map> getProductDefaultAlbumByProductIDs(BillDataDto var1) throws Exception;

    public List<Map> getProductParamByProductId(BillDataDto var1) throws Exception;

    public List<Map> getProductSKUByProductSKUIds(BillDataDto var1) throws Exception;

    public List<Map> getProductUOrderUpCountByProductIDs(BillDataDto var1) throws Exception;

    public List<Map> getProductDescriptionByProductId(BillDataDto var1) throws Exception;

    public List<Map> getProductSKUByProductId(BillDataDto var1) throws Exception;

    public List<Map> getProductSpecs(BillDataDto var1) throws Exception;

    public List<Map> getProductSKUsBySKUQuery(BillDataDto var1) throws Exception;

    public ExcelExportData productExport(BillDataDto var1, String var2) throws Exception;

    public ExcelExportData productTempExport(BillDataDto var1, String var2) throws Exception;

    public List<Map> getClassByParentID(BillDataDto var1) throws Exception;

    public List<Map> getSkus(BillDataDto var1) throws Exception;

    public String updateSKUInventoryCount(BillDataDto var1) throws Exception;

    public String updateProductSKUPrice(BillDataDto var1) throws Exception;

    public void updateErpcodeById(BillDataDto var1) throws Exception;

    public ResultList productupdown(BillDataDto var1) throws Exception;

    public List<Map<String, Object>> updateSKUInventoryCountBatchByShopId(BillDataDto var1) throws Exception;

    public ResultList batchDeleteByErpcode(BillDataDto var1) throws Exception;

    public ResultList batchSaveSync(BillDataDto var1) throws Exception;

    public ResultList changeEnabled(String var1, BillDataDto var2) throws Exception;

    public ResultList changeStopStatus(String var1, BillDataDto var2) throws Exception;

    public String mqSave(Map var1) throws Exception;

    public List<Map> getBizDataPartitionable(ApiDto var1) throws Exception;

    public Pager getBizDataPagePartitionable(ApiDto var1) throws Exception;

    public String uploadData(BillDataDto var1) throws Exception;

    public String getNewestPositionCode(String var1) throws Exception;

    public Map checkreferencebyfieldname(Map var1) throws Exception;

    public String getRegionIdByPCD(String var1) throws Exception;

    public ResultList relationsave(Map var1) throws Exception;

    public void sendEvent(String var1, Map var2) throws Exception;

    public void getSysToken(String var1, String var2, HttpServletRequest var3, HttpServletResponse var4) throws Exception;

    public ResultList billdeleteforce(MultipartFile var1, Map<String, Object> var2) throws Exception;

    public ResultList repaire(Map<String, Object> var1) throws Exception;

    public String tenantValidateCheck(DeleteToolDto var1) throws Exception;

    public BillDataDto dealBillDataForApi(BillDataDto var1, String var2) throws Exception;

    public BillDataDto dealBillDataForMq(BillDataDto var1, String var2) throws Exception;

    public List<Map<String, Object>> findIdByCode(String var1, Object var2) throws Exception;

    public List<Map<String, Object>> findApplyRangeIdById(String var1, String var2) throws Exception;

    public List<Map<String, Object>> findApplyRangeIdByorgId(String var1, String var2, String var3) throws Exception;

    public RuleExecuteResult dealResultForApi(RuleExecuteResult var1) throws Exception;

    public Object getSpecitemParams(Map<String, Object> var1) throws Exception;

    public Object returnProductSKU(Map<String, Object> var1) throws Exception;

    public void addSkuForDetailMap(Map var1) throws Exception;

    public void dealDataForCustomertrade(List var1) throws Exception;

    public void dealResultDataForDetail(String var1, Map var2) throws Exception;

    public void setUserDefineClassIsEnabledForSave(BillDataDto var1) throws Exception;

    public void setResultListUserDefineClassIsEnabledForSave(BillDataDto var1, ResultList var2);

    public void setResultListUserDefineClassIsEnabledForSave(BillDataDto var1, RuleExecuteResult var2);

    public void setBizDataUserDefineClassIsEnabled(ApiDto var1);

    public void setBillPagerUserDefineClassIsEnabled(Pager var1, BillDataDto var2);

    public void setBillDetailUserDefineClassIsEnabled(Map var1, String var2);

    public void setBillDetailStopstatus(Map var1, String var2);

    public void setBillListUserDefineClassIsEnabled(List<Map> var1, ApiDto var2);

    public void handleBillDetailBool(Map var1, String var2);

    public void setBillPagerNameForSave(BillDataDto var1, RuleExecuteResult var2);

    public void setBillPagerIdForSave(BillDataDto var1, RuleExecuteResult var2);
}

