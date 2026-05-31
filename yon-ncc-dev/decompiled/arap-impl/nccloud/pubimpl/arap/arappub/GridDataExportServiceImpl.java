/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.pub.BusinessException
 *  nc.vo.pubapp.pattern.exception.ExceptionUtils
 *  nccloud.dto.arap.arappub.ExcelExportUtils
 *  nccloud.pubitf.arap.arappub.IGridDataExportService
 *  nccloud.vo.excel.pub.ExcelConstants
 *  org.apache.poi.hssf.usermodel.HSSFWorkbook
 */
package nccloud.pubimpl.arap.arappub;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nccloud.dto.arap.arappub.ExcelExportUtils;
import nccloud.pubitf.arap.arappub.IGridDataExportService;
import nccloud.vo.excel.pub.ExcelConstants;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class GridDataExportServiceImpl
implements IGridDataExportService {
    public File exportGridData(String[] title, Object[][] data) throws BusinessException {
        File excelfile = this.getTempFile("arap_");
        ExcelExportUtils creatExcel = new ExcelExportUtils();
        creatExcel.setData(data);
        creatExcel.setColNames(title);
        try (FileOutputStream os = new FileOutputStream(excelfile);){
            HSSFWorkbook wb = creatExcel.exportExcelFile();
            wb.write((OutputStream)os);
        }
        catch (Exception e) {
            ExceptionUtils.wrappException((Exception)e);
        }
        return excelfile;
    }

    private File getTempFile(String fileName) {
        String clientAddress = fileName;
        String suffix = ".xls";
        File worktempDir = new File(ExcelConstants.EXCEL_EXPORT_TEMP_PATHS);
        if (!worktempDir.exists()) {
            worktempDir.mkdirs();
        }
        File tmpFile = null;
        try {
            tmpFile = File.createTempFile(clientAddress, suffix, worktempDir);
            tmpFile.setExecutable(false);
            tmpFile.setReadable(true);
            tmpFile.setWritable(true);
        }
        catch (IOException e) {
            ExceptionHandler.consume((Throwable)e);
        }
        return tmpFile;
    }
}

