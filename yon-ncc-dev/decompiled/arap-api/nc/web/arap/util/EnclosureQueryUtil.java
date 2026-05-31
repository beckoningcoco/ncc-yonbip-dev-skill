/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.framework.common.NCLocator
 *  nc.itf.obm.ebank.IObmEbankNccYhhdService
 *  nc.vo.obm.cjzfdzhd.YhhdVO
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.filesystem.NCFileVO
 *  nccloud.pubitf.platform.attachment.IAttachmentService
 *  nccloud.pubitf.platform.attachment.IFileStorageConst
 *  nccloud.pubitf.platform.attachment.WebFileParaVO
 *  uap.pub.fs.client.FileStorageClient
 */
package nc.web.arap.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.framework.common.NCLocator;
import nc.itf.obm.ebank.IObmEbankNccYhhdService;
import nc.vo.obm.cjzfdzhd.YhhdVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.filesystem.NCFileVO;
import nccloud.pubitf.platform.attachment.IAttachmentService;
import nccloud.pubitf.platform.attachment.IFileStorageConst;
import nccloud.pubitf.platform.attachment.WebFileParaVO;
import uap.pub.fs.client.FileStorageClient;

public class EnclosureQueryUtil {
    public static List<WebFileParaVO> yhhdEnclosureQuery(String[] transerials) throws BusinessException {
        IObmEbankNccYhhdService obmEbankNccYhhdService = (IObmEbankNccYhhdService)NCLocator.getInstance().lookup(IObmEbankNccYhhdService.class);
        IAttachmentService ncservice = (IAttachmentService)NCLocator.getInstance().lookup(IAttachmentService.class);
        InvocationInfoProxy.getInstance().getGroupId();
        String userid = InvocationInfoProxy.getInstance().getUserId();
        ArrayList<WebFileParaVO> webFileParaVOList = new ArrayList<WebFileParaVO>();
        YhhdVO[] yhhdvos = null;
        yhhdvos = obmEbankNccYhhdService.queryEbankYhhdByBankSeqNos(transerials);
        String[] pkyhhds = new String[yhhdvos.length];
        for (int i = 0; i < yhhdvos.length; ++i) {
            pkyhhds[i] = yhhdvos[i].getPk_yhhd();
            NCFileVO[] ncfiles = ncservice.queryNCFilesByNodePath(yhhdvos[i].getPk_yhhd(), userid);
            WebFileParaVO[] ret = EnclosureQueryUtil.convert(ncfiles, yhhdvos[i].getPk_yhhd(), IFileStorageConst.Bucket);
            webFileParaVOList.addAll(Arrays.asList(ret));
        }
        return webFileParaVOList;
    }

    public static WebFileParaVO[] billEnclosureQuery(String fullPath, String billid) {
        IAttachmentService ncservice = (IAttachmentService)NCLocator.getInstance().lookup(IAttachmentService.class);
        String userid = InvocationInfoProxy.getInstance().getUserId();
        NCFileVO[] ncfiles = ncservice.queryNCFilesByNodePath(fullPath, userid);
        WebFileParaVO[] webFileParaVOs = EnclosureQueryUtil.convert(ncfiles, billid, IFileStorageConst.Bucket);
        return webFileParaVOs;
    }

    public static WebFileParaVO[] convert(NCFileVO[] files, String billID, String newBucket) {
        ArrayList<WebFileParaVO> list = new ArrayList<WebFileParaVO>();
        String clientIP = InvocationInfoProxy.getInstance().getClientHost();
        for (NCFileVO file : files) {
            if (file.isFolder()) continue;
            WebFileParaVO paras = new WebFileParaVO();
            paras.setBillId(billID);
            paras.setPk(file.getPk());
            paras.setFullPath(file.getFullPath());
            paras.setIsdoc(file.getIsdoc());
            paras.setName(file.getName());
            paras.setPk_doc(file.getPk_doc());
            paras.setCreater(file.getCreator());
            paras.setFileSize(file.getFileLen());
            paras.setFiletype(file.getFiletype());
            if ("image".equalsIgnoreCase(file.getFiletype()) && "z".equalsIgnoreCase(file.getIsdoc()) || "doc|docx|xls|xlsx|ppt|pptx|pdf|txt|ofd|PDF".indexOf(file.getName().substring(file.getName().lastIndexOf(".") + 1, file.getName().length())) >= 0) {
                String url = FileStorageClient.getInstance().getPreUrl(newBucket, file.getPk_doc(), clientIP, "versionno=0");
                String suffix = file.getFullPath().substring(file.getFullPath().lastIndexOf(".") + 1);
                paras.setPreviewUrl(url);
                paras.setSuffix(suffix);
            }
            list.add(paras);
        }
        return list.toArray(new WebFileParaVO[0]);
    }
}

