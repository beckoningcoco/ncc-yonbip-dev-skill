/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.cloud.middleware.rpc.RemoteCall
 *  com.yonyou.ucf.mdd.common.model.Pager
 *  com.yonyou.ucf.mdd.common.model.ResultList
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 */
package com.yonyoucloud.upc.pubItf;

import com.yonyou.cloud.middleware.rpc.RemoteCall;
import com.yonyou.ucf.mdd.common.model.Pager;
import com.yonyou.ucf.mdd.common.model.ResultList;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import java.util.List;
import java.util.Map;

@RemoteCall(value="productcenter@c87e2267-1001-4c70-bb2a-ab41f3b81aa3")
public interface IUPCBizService {
    public List<Map> getAssistUnitRateByOrg(List<Map> var1) throws Exception;

    public List<Map> getProductApplyRange(List<Long> var1) throws Exception;

    public List<Map> getSpecFrees(List<Long> var1) throws Exception;

    public List<Map> getBizData(BillDataDto var1) throws Exception;

    public Pager getBizDataPage(BillDataDto var1) throws Exception;

    public Map getBizObject(BillDataDto var1) throws Exception;

    public Map getBizObject(String var1, Long var2) throws Exception;

    public ResultList batchSave(BillDataDto var1) throws Exception;

    public Object getSystemOption(Object var1, String var2) throws Exception;

    public ResultList saveUnit(BillDataDto var1) throws Exception;
}

