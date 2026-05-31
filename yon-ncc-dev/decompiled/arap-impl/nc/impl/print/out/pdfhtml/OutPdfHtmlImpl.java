/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.framework.common.RuntimeEnv
 *  nc.bs.logging.Logger
 *  nc.bs.pf.pub.PfDataCache
 *  nc.bs.pub.pf.IPrintDataGetter
 *  nc.bs.pub.pf.PfUtilTools
 *  nc.itf.print.out.pdfhtml.IOutPdfHtml
 *  nc.itf.uap.print.IPrintEntry
 *  nc.ui.pub.print.IDataSource
 *  nc.vo.gl.vouchertools.XML_VoucherTranslator
 *  nc.vo.jcom.io.FileUtil
 *  nc.vo.jcom.lang.StringUtil
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.billtype.BilltypeVO
 */
package nc.impl.print.out.pdfhtml;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.framework.common.NCLocator;
import nc.bs.framework.common.RuntimeEnv;
import nc.bs.logging.Logger;
import nc.bs.pf.pub.PfDataCache;
import nc.bs.pub.pf.IPrintDataGetter;
import nc.bs.pub.pf.PfUtilTools;
import nc.itf.print.out.pdfhtml.IOutPdfHtml;
import nc.itf.uap.print.IPrintEntry;
import nc.ui.pub.print.IDataSource;
import nc.vo.gl.vouchertools.XML_VoucherTranslator;
import nc.vo.jcom.io.FileUtil;
import nc.vo.jcom.lang.StringUtil;
import nc.vo.pub.BusinessException;
import nc.vo.pub.billtype.BilltypeVO;

public class OutPdfHtmlImpl
implements IOutPdfHtml {
    private static final String NCHOME = RuntimeEnv.getInstance().getNCHome();
    private static final String UPLOAD_CONFIG = NCHOME + "/webapps/nc_web/ncupload/";

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String generateBillHtml(String billno, String billID, String billType, String templateid) throws BusinessException {
        String billHtml = null;
        String documentid = null;
        String filePath = "";
        try (ByteArrayOutputStream bos = new ByteArrayOutputStream();
             OutputStreamWriter osw = new OutputStreamWriter((OutputStream)bos, "UTF-8");){
            if (StringUtil.isEmptyWithTrim((String)templateid)) {
                String string = null;
                return string;
            }
            IDataSource ds = this.getDataSourceOf(billType, billID);
            if (ds == null) {
                String string = null;
                return string;
            }
            IPrintEntry printEntry = (IPrintEntry)NCLocator.getInstance().lookup(IPrintEntry.class.getName());
            IDataSource[] dataSources = new IDataSource[]{ds};
            printEntry.exportHtml(dataSources, templateid, (Writer)osw);
            billHtml = bos.toString();
            billHtml = "<p align=center>" + billHtml + "</p>";
            filePath = UPLOAD_CONFIG + billno + ".html";
            XML_VoucherTranslator.saveToFile((String)filePath, (StringBuffer)new StringBuffer(billHtml));
            return documentid;
        }
        catch (Exception e) {
            Logger.error((Object)(">>\u540e\u53f0\u6253\u5370\u6a21\u677f\u8f93\u51faHTML\u51fa\u9519=" + e.getMessage()), (Throwable)e);
            return documentid;
        }
        finally {
            FileUtil.delete((File)new File(filePath));
        }
    }

    private IDataSource getDataSourceOf(String billType, String billid) throws BusinessException {
        Object o;
        BilltypeVO btVO = PfDataCache.getBillType((String)billType);
        String referClzName = btVO.getReferclassname();
        IDataSource ds = null;
        if (!StringUtil.isEmptyWithTrim((String)referClzName) && (o = PfUtilTools.instantizeObject((String)billType, (String)referClzName.trim())) instanceof IPrintDataGetter) {
            String checkman = InvocationInfoProxy.getInstance().getUserId();
            try {
                ds = ((IPrintDataGetter)o).getPrintDs(billid, billType, checkman);
            }
            catch (BusinessException e) {
                Logger.error((Object)("\u83b7\u53d6\u5355\u636e\u6253\u5370\u6570\u636e\u6e90\u51fa\u9519: " + e.getMessage() + ", \u6539\u7528\u5355\u636e\u5b9e\u4f53vo\u6784\u9020\u5143\u6570\u636e\u6570\u636e\u6e90"), (Throwable)e);
            }
        }
        return ds;
    }
}

