/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.common.model.ResultList
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 */
package com.yonyoucloud.iuap.upc.api.service;

import com.yonyou.ucf.mdd.common.model.ResultList;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import java.io.InputStream;

public interface IUPCProductExcelService {
    public ResultList importProAlbumAndDesc(InputStream var1, String var2, BillDataDto var3) throws Exception;
}

