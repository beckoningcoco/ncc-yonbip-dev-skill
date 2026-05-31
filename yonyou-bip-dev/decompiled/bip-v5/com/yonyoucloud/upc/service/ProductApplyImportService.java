/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.upc.utils.excel.bean.CellListOfRow
 *  com.yonyou.upc.utils.excel.util.ExcelType
 *  com.yonyou.upc.utils.excel.util.GridExcel
 *  com.yonyoucloud.upc.utils.ExcelFileUtil
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.springframework.web.multipart.MultipartFile
 */
package com.yonyoucloud.upc.service;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.upc.utils.excel.bean.CellListOfRow;
import com.yonyou.upc.utils.excel.util.ExcelType;
import com.yonyou.upc.utils.excel.util.GridExcel;
import com.yonyoucloud.upc.service.UPCBillService;
import com.yonyoucloud.upc.utils.ExcelFileUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class ProductApplyImportService {
    private static final Logger log = LoggerFactory.getLogger(ProductApplyImportService.class);
    @Autowired
    private UPCBillService upcBillService;

    public Map<String, Object> getImportData(MultipartFile file) {
        File excelFile = null;
        try {
            excelFile = this.upcBillService.getExcelFile(file);
            Map<String, Object> map = this.getDataFromExcel(excelFile);
            return map;
        }
        catch (Exception e) {
            log.error("\u8bfb\u53d6Excel\u5931\u8d25\uff1a", (Throwable)e);
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800808, new Object[]{e.getMessage()});
        }
        finally {
            if (excelFile != null) {
                excelFile.delete();
            }
        }
    }

    private Map<String, Object> getDataFromExcel(File excelFile) throws Exception {
        List titles = ExcelFileUtil.fetchExcelTitle((File)excelFile, (int)1, (int)3);
        HashMap<String, Object> dataMap = new HashMap<String, Object>();
        ArrayList dataList = new ArrayList();
        try (FileInputStream in = new FileInputStream(excelFile);){
            GridExcel.readByEventModel((InputStream)in, Map.class, (ExcelType)ExcelType.XLSX).window(1000, datas -> dataList.addAll(datas)).process(cs -> this.dealExcelData(titles, (CellListOfRow<String>)cs), 9);
        }
        catch (Exception e) {
            log.error("\u8bfb\u53d6Excel\u5931\u8d25\uff1a", (Throwable)e);
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800809);
        }
        dataMap.put("ProductApply", dataList);
        return dataMap;
    }

    private Map<String, Object> dealExcelData(List<String> titles, CellListOfRow<String> cs) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        for (int i = 0; i < cs.size(); ++i) {
            map.put(titles.get(i), cs.get(i));
        }
        return map;
    }
}

