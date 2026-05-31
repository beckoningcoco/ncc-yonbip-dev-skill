/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arcp.pub.util.ArcpDigestUtils
 *  nc.bs.arcp.pub.util.ArcpFieldCodeUtil
 *  nc.bs.arcp.pub.util.UploadClientUtil
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.logging.Logger
 *  nc.pub.arcp.consts.ArcpCollectConst
 *  nc.ui.pub.print.IDataSource
 *  nc.ui.pub.print.PdfOutputSetting
 *  nc.vo.arcp.archive.collect.ArcpFileServerVO
 *  nc.vo.arcp.archive.unitsetting.ArchiveUnitBillVO
 *  nc.vo.arcp.arcplog.ArcpLogVO
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.SuperVO
 *  nccloud.itf.arcp.pub.IArcpPrintEntry
 */
package nc.bs.arap.print;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import nc.bs.arap.arcp.util.ArapArcpPubUtil;
import nc.bs.arap.translate.ArapTranslateUtil;
import nc.bs.arcp.pub.util.ArcpDigestUtils;
import nc.bs.arcp.pub.util.ArcpFieldCodeUtil;
import nc.bs.arcp.pub.util.UploadClientUtil;
import nc.bs.framework.common.NCLocator;
import nc.bs.logging.Logger;
import nc.pub.arcp.consts.ArcpCollectConst;
import nc.ui.pub.print.IDataSource;
import nc.ui.pub.print.PdfOutputSetting;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arcp.archive.collect.ArcpFileServerVO;
import nc.vo.arcp.archive.unitsetting.ArchiveUnitBillVO;
import nc.vo.arcp.arcplog.ArcpLogVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.SuperVO;
import nccloud.itf.arcp.pub.IArcpPrintEntry;

public class ArapPDFUtil {
    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static Map<String, String> printArapBillToPDF(BaseAggVO aggvo, ArchiveUnitBillVO aubVO, ArcpLogVO logvo) throws BusinessException {
        IDataSource ids = ArapArcpPubUtil.getPrintDs(aggvo.getPrimaryKey(), (String)aggvo.getParentVO().getAttributeValue("pk_billtype"), null);
        IArcpPrintEntry pe = (IArcpPrintEntry)NCLocator.getInstance().lookup(IArcpPrintEntry.class);
        String taskid = logvo.getJobid();
        HashMap<String, String> pathMap = new HashMap<String, String>();
        PdfOutputSetting possetting = new PdfOutputSetting();
        String realFileName = ArapPDFUtil.getFileName(aggvo, aubVO, taskid, (String)aggvo.getParentVO().getAttributeValue("pk_tradetype"));
        String fileName = ArcpFieldCodeUtil.getMD5FileName((String)realFileName);
        String abFilePath = ArapPDFUtil.getAbsoluteFilePath(taskid) + fileName;
        String filePath = ArapPDFUtil.getFilepPath(taskid) + fileName;
        pathMap.put("filepath", filePath);
        pathMap.put("srcFileName", realFileName);
        String dir = ArapPDFUtil.getAbsoluteFilePath(taskid);
        File fdir = new File(dir);
        if (!fdir.exists()) {
            fdir.mkdirs();
        }
        ByteArrayOutputStream outs = new ByteArrayOutputStream();
        try {
            possetting.setExportDestPath(abFilePath);
            possetting.setOutputStreamFlag(false);
            possetting.setOutputStream((OutputStream)outs);
            pe.exportPdf4Print(ids, aubVO.getPk_printtemplate(), possetting);
        }
        finally {
            try {
                if (outs != null) {
                    outs.close();
                }
            }
            catch (IOException e) {
                Logger.error((Object)e.getMessage(), (Throwable)e);
            }
        }
        UploadClientUtil.upLoad((String)filePath, (String)abFilePath, (ArcpFileServerVO)((ArcpFileServerVO)logvo.getFileServer()));
        File file = new File(abFilePath);
        pathMap.put("checksum", ArcpDigestUtils.getMD5Three((String)abFilePath));
        if (file.exists()) {
            file.delete();
        }
        return pathMap;
    }

    public static String getAbsoluteFilePath(String taskid) {
        return ArcpCollectConst.BASE_LOCAL_PATH + ArapPDFUtil.getFilepPath(taskid);
    }

    public static String getFilepPath(String taskid) {
        return "bill/" + taskid + "/" + "pdf" + "/";
    }

    public static String getFileName(BaseAggVO aggvo, ArchiveUnitBillVO aubVO, String taskid, String tradeTypeCode) {
        return ArcpFieldCodeUtil.getFileName(ArapTranslateUtil.getFildValue(aggvo, tradeTypeCode), (SuperVO)aubVO) + ".pdf";
    }
}

