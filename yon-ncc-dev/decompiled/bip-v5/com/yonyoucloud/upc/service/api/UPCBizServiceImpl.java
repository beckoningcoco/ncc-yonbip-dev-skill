/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.context.InvocationInfoProxy
 *  com.yonyou.ucf.mdd.common.model.Pager
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.common.ResultList
 *  com.yonyoucloud.upc.utils.CoreDocJsonResult
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.beans.factory.annotation.Qualifier
 *  org.springframework.stereotype.Service
 */
package com.yonyoucloud.upc.service.api;

import com.yonyou.iuap.context.InvocationInfoProxy;
import com.yonyou.ucf.mdd.common.model.Pager;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.common.ResultList;
import com.yonyoucloud.iuap.upc.api.service.IUPCBillService;
import com.yonyoucloud.iuap.upc.api.service.IUPCProductQueryService;
import com.yonyoucloud.upc.pubItf.IUPCBizService;
import com.yonyoucloud.upc.service.UnitService;
import com.yonyoucloud.upc.utils.CoreDocJsonResult;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service(value="upc.upcBizServiceImpl")
public class UPCBizServiceImpl
implements IUPCBizService {
    @Autowired
    private IUPCProductQueryService upcProductQueryService;
    @Autowired
    @Qualifier(value="pc.billApiService")
    private IUPCBillService upcBillService;
    @Autowired
    private UnitService unitService;

    @Override
    public List<Map> getAssistUnitRateByOrg(List<Map> products) throws Exception {
        return this.upcProductQueryService.getAssistUnitRateByOrg(products);
    }

    @Override
    public List<Map> getProductApplyRange(List<Long> products) throws Exception {
        return this.upcProductQueryService.getProductApplyRange(products);
    }

    @Override
    public List<Map> getSpecFrees(List<Long> products) throws Exception {
        return this.upcProductQueryService.getSpecFrees(products);
    }

    @Override
    public List<Map> getBizData(BillDataDto dto) throws Exception {
        return this.upcBillService.getBizData(dto);
    }

    @Override
    public Pager getBizDataPage(BillDataDto dto) throws Exception {
        return this.upcBillService.getBizDataPage(dto);
    }

    @Override
    public Map getBizObject(BillDataDto dto) throws Exception {
        return this.upcBillService.getBizObject(dto);
    }

    @Override
    public Map getBizObject(String fullName, Long id) throws Exception {
        return this.upcBillService.getBizObject(fullName, id);
    }

    public ResultList batchSave(BillDataDto dto) throws Exception {
        return this.upcBillService.batchSave(dto);
    }

    @Override
    public Object getSystemOption(Object tenantId, String optionKey) throws Exception {
        return this.upcProductQueryService.getSystemOption(tenantId, optionKey);
    }

    public ResultList saveUnit(BillDataDto dto) throws Exception {
        InvocationInfoProxy.setExtendAttribute((String)"locale", (Object)"zh_CN");
        return this.unitService.saveUnits(dto);
    }

    public CoreDocJsonResult excuteUpdateOne(Map<String, Object> data, String action, String billNum) throws Exception {
        BillDataDto dto = new BillDataDto();
        dto.setBillnum(billNum);
        dto.setAction(action);
        dto.setData(data);
        try {
            this.upcBillService.executeUpdate(action, dto);
        }
        catch (Exception e) {
            return CoreDocJsonResult.error((Long)999L, (String)e.getMessage());
        }
        return CoreDocJsonResult.success(null);
    }
}

