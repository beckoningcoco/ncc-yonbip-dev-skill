/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  org.imeta.orm.base.BizObject
 */
package com.yonyoucloud.upc.service.bill;

import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.service.bill.BillFieldUpdateInfoDTO;
import java.util.ArrayList;
import java.util.List;
import org.imeta.orm.base.BizObject;

public class BillBusinessHandleDTO {
    private String billnum;
    private BizObject data;
    private BizObject dataInDB;
    private Integer importMode;
    private BillContext billContext;
    private List<BillFieldUpdateInfoDTO> updateFieldList = new ArrayList<BillFieldUpdateInfoDTO>();

    public BillBusinessHandleDTO() {
    }

    public BillBusinessHandleDTO(BizObject data, BizObject dataInDB) {
        this.data = data;
        this.dataInDB = dataInDB;
    }

    public BillBusinessHandleDTO(String billnum, BizObject data, BizObject dataInDB) {
        this.billnum = billnum;
        this.data = data;
        this.dataInDB = dataInDB;
    }

    public BillBusinessHandleDTO setData(BizObject data) {
        this.data = data;
        return this;
    }

    public BillBusinessHandleDTO setImportMode(Integer importMode) {
        this.importMode = importMode;
        return this;
    }

    public BillBusinessHandleDTO setBillContext(BillContext billContext) {
        this.billContext = billContext;
        return this;
    }

    public BillBusinessHandleDTO setUpdateFieldList(List<BillFieldUpdateInfoDTO> updateFieldList) {
        this.updateFieldList = updateFieldList;
        return this;
    }

    public BillBusinessHandleDTO setDataInDB(BizObject dataInDB) {
        this.dataInDB = dataInDB;
        return this;
    }

    public void setBillnum(String billnum) {
        this.billnum = billnum;
    }

    public String getBillnum() {
        return this.billnum;
    }

    public BizObject getData() {
        return this.data;
    }

    public BizObject getDataInDB() {
        return this.dataInDB;
    }

    public Integer getImportMode() {
        return this.importMode;
    }

    public BillContext getBillContext() {
        return this.billContext;
    }

    public List<BillFieldUpdateInfoDTO> getUpdateFieldList() {
        return this.updateFieldList;
    }
}

