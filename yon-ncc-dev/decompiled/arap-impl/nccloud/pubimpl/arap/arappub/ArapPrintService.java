/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.bill.ArapBillDAO
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.logging.Logger
 *  nc.ui.pub.print.CommonAbstractDataSource
 *  nc.ui.pub.print.IDataSource
 *  nc.vo.arap.basebill.BaseBillVO
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.BusinessException
 *  nc.vo.pubapp.AppContext
 *  nccloud.base.exception.ExceptionUtils
 *  nccloud.base.reflect.NCClass
 *  nccloud.bs.arap.datasource.ArapDocPrintDatasource
 *  nccloud.dto.arap.arappub.PrintDataInfo
 *  nccloud.pubitf.platform.print.AbstractPrintService
 *  nccloud.pubitf.platform.print.IPrintInfo
 *  nccloud.pubitf.platform.print.PrintOutputMode
 *  nccloud.pubitf.platform.print.PrintTemplateWebCmd
 *  nccloud.pubitf.platform.print.vo.OutPutMode
 *  nccloud.pubitf.platform.print.vo.QueryPrintVO
 *  nccloud.vo.platform.print.LightPrintTemplateHelper
 *  org.apache.commons.collections4.CollectionUtils
 *  org.apache.commons.lang3.StringUtils
 */
package nccloud.pubimpl.arap.arappub;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import nc.bs.arap.bill.ArapBillDAO;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.logging.Logger;
import nc.ui.pub.print.CommonAbstractDataSource;
import nc.ui.pub.print.IDataSource;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.AppContext;
import nccloud.base.exception.ExceptionUtils;
import nccloud.base.reflect.NCClass;
import nccloud.bs.arap.datasource.ArapDocPrintDatasource;
import nccloud.dto.arap.arappub.PrintDataInfo;
import nccloud.pubitf.platform.print.AbstractPrintService;
import nccloud.pubitf.platform.print.IPrintInfo;
import nccloud.pubitf.platform.print.PrintOutputMode;
import nccloud.pubitf.platform.print.PrintTemplateWebCmd;
import nccloud.pubitf.platform.print.vo.OutPutMode;
import nccloud.pubitf.platform.print.vo.QueryPrintVO;
import nccloud.vo.platform.print.LightPrintTemplateHelper;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

public class ArapPrintService
extends AbstractPrintService {
    public IDataSource[] getDataSources(IPrintInfo info) {
        PrintDataInfo printinfo = (PrintDataInfo)info;
        String[] pkBills = new String[printinfo.getIds().length];
        IDataSource[] dss = null;
        if (info.getNodeKey().equals("list")) {
            List<Object> list = new ArrayList();
            try {
                dss = new IDataSource[1];
                for (int num = 0; num < printinfo.getIds().length; ++num) {
                    pkBills[num] = printinfo.getIds()[num];
                    Map<String, List<String>> map = this.getTempIds(info, pkBills);
                    list = map.get(printinfo.getNodeKey());
                }
                dss = new IDataSource[1];
                ArapDocPrintDatasource ds = new ArapDocPrintDatasource(pkBills, printinfo.getBillType(), null);
                CommonAbstractDataSource dataSource = new CommonAbstractDataSource((IDataSource)ds, list);
                dss[0] = dataSource;
            }
            catch (BusinessException e) {
                ExceptionUtils.wrapBusinessException((String)e.getMessage());
            }
        } else {
            try {
                dss = new IDataSource[printinfo.getIds().length];
                Map<String, String> pkTransType = this.getMapBilltype(printinfo.getIds(), printinfo.getBillType());
                for (int num = 0; num < printinfo.getIds().length; ++num) {
                    String[] pk = new String[]{printinfo.getIds()[num]};
                    ArapDocPrintDatasource ds = new ArapDocPrintDatasource(pk, pkTransType.get(printinfo.getIds()[num]), null);
                    Map<String, List<String>> map = this.getTempIds((IPrintInfo)printinfo, pk);
                    CommonAbstractDataSource dataSource = new CommonAbstractDataSource((IDataSource)ds, map.get(pkTransType.get(printinfo.getIds()[num])));
                    dss[num] = dataSource;
                }
            }
            catch (BusinessException e) {
                ExceptionUtils.wrapBusinessException((String)e.getMessage());
            }
        }
        return dss;
    }

    private Map<String, List<String>> getTempIds(IPrintInfo info, String[] oids) throws BusinessException {
        PrintDataInfo printinfo = (PrintDataInfo)info;
        String appcode = info.getAppcode();
        NCClass service = info.getPrintServiceClazz();
        String tempId = info.getPrintTemplateID();
        ArrayList<String> nodekeyList = new ArrayList<String>();
        Map<String, String> pkTransType = this.getMapBilltype(printinfo.getIds(), printinfo.getBillType());
        for (String pk : oids) {
            nodekeyList.add(pkTransType.get(pk));
        }
        ArrayList<PrintDataInfo> printList = new ArrayList<PrintDataInfo>();
        for (int i = 0; i < oids.length; ++i) {
            PrintDataInfo pinfo = new PrintDataInfo();
            pinfo.setNodeKey((String)nodekeyList.get(i));
            pinfo.setArapAppCode(appcode);
            pinfo.setPrintServiceClazz(service);
            pinfo.setPrintTemplateID(tempId);
            printList.add(pinfo);
        }
        Map<String, List<String>> templateIDMap = this.getTemplateID(printList.toArray(new IPrintInfo[0]));
        return templateIDMap;
    }

    private Map<String, String> getMapBilltype(String[] pks, String billtype) throws BusinessException {
        HashMap<String, String> resultMap = new HashMap<String, String>();
        ArapBillDAO dao = new ArapBillDAO();
        List vos = dao.queryParentVOByPKs(pks, billtype);
        for (BaseBillVO vo : vos) {
            resultMap.put(vo.getPrimaryKey(), vo.getPk_tradetype());
        }
        return resultMap;
    }

    public InputStream outPut(IPrintInfo info, OutPutMode mode) {
        PrintDataInfo pinfo = (PrintDataInfo)info;
        String pk_group = AppContext.getInstance().getPkGroup();
        String contextPath = pinfo.getFilename();
        IDataSource[] ds = this.getDataSources(info);
        PrintOutputMode pmode = PrintOutputMode.valueOf((String)mode.value());
        PrintTemplateWebCmd print = new PrintTemplateWebCmd(pinfo.getAppcode(), pk_group, null, pinfo.getNodeKey(), pinfo.getPrintTemplateID(), null, ds, contextPath, pmode, pinfo.getOutputSetting());
        print.execute();
        ByteArrayInputStream in = null;
        String filepath = print.getFilepath();
        try (FileInputStream ins = new FileInputStream(filepath);
             BufferedInputStream fis = new BufferedInputStream(ins);){
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] b = new byte[10240];
            while (((InputStream)fis).read(b, 0, 10240) != -1) {
                bos.write(b);
            }
            in = new ByteArrayInputStream(bos.toByteArray());
            ArapPrintService.deleteFileOrFolders(filepath);
        }
        catch (Exception ex) {
            ArapPrintService.deleteFileOrFolders(filepath);
            Logger.error((Object)ex.getMessage(), (Throwable)ex);
        }
        return in;
    }

    public static void deleteFileOrFolders(String tarFilePath) {
        if (tarFilePath.endsWith("WEB-INF")) {
            return;
        }
        File file = new File(tarFilePath);
        String parentPath = file.getParent();
        if (file.isFile() && file.exists()) {
            file.delete();
        }
        while (true) {
            File parentDir = new File(parentPath);
            parentPath = parentDir.getParent();
            File[] files = parentDir.listFiles();
            if (files != null && files.length != 0) break;
            parentDir.delete();
            ArapPrintService.deleteFileOrFolders(parentPath);
        }
    }

    private Map<String, List<String>> getTemplateID(IPrintInfo[] infos) {
        HashMap<String, List<String>> retmap = new HashMap<String, List<String>>();
        for (IPrintInfo info : infos) {
            List<String> list;
            List<Object> printTemplateIds = new ArrayList<String>();
            if (StringUtils.isEmpty((CharSequence)info.getPrintTemplateID())) {
                printTemplateIds = Arrays.asList(LightPrintTemplateHelper.getAllPrintTemplateIds((QueryPrintVO)this.createParaVO(info)));
            } else {
                printTemplateIds.add(info.getPrintTemplateID());
            }
            if (CollectionUtils.isEmpty((Collection)((Collection)retmap.get(info.getNodeKey())))) {
                list = new ArrayList();
                for (String string : printTemplateIds) {
                    list.add(string);
                }
                retmap.put(info.getNodeKey(), list);
                continue;
            }
            list = (List)retmap.get(info.getNodeKey());
            for (String string : printTemplateIds) {
                list.add(string);
            }
            retmap.put(info.getNodeKey(), list);
        }
        if (retmap == null || retmap != null && retmap.size() == 0) {
            String pk_group = InvocationInfoProxy.getInstance().getGroupId();
            String pk_user = InvocationInfoProxy.getInstance().getUserId();
            String msg = NCLangRes4VoTransl.getNCLangRes().getStrByID("1501003_0", "01501003-0134") + infos[0].getAppcode() + ";nodekey:" + infos[0].getNodeKey() + NCLangRes4VoTransl.getNCLangRes().getStrByID("1501003_0", "01501003-0135") + pk_group + NCLangRes4VoTransl.getNCLangRes().getStrByID("1501003_0", "01501003-0136") + pk_user;
            ExceptionUtils.wrapBusinessException((String)msg);
        }
        return retmap;
    }

    private QueryPrintVO createParaVO(IPrintInfo info) {
        QueryPrintVO paraVO = new QueryPrintVO();
        String pk_group = InvocationInfoProxy.getInstance().getGroupId();
        String pk_user = InvocationInfoProxy.getInstance().getUserId();
        paraVO.setAppcode(info.getAppcode());
        paraVO.setNodekey(info.getNodeKey());
        paraVO.setPk_group(pk_group);
        paraVO.setUserid(pk_user);
        return paraVO;
    }
}

