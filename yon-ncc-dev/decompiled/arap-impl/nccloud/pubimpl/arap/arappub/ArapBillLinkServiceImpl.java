/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ufida.report.anareport.base.FreeReportDrillParam
 *  nc.bs.arap.util.ArapBillType2TableMapping
 *  nc.bs.framework.common.NCLocator
 *  nc.pub.report.util.ReportDrillBillUtil
 *  nc.pub.smart.data.IRowData
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.platform.workbench.AppPageVO
 *  nc.vo.pub.BusinessException
 *  nccloud.commons.lang.StringUtils
 *  nccloud.dto.baseapp.querytree.dataformat.QueryTreeFormatVO
 *  nccloud.pubitf.arap.arappub.IArapBillLinkService
 *  nccloud.putitf.riart.billtype.IDefaultQueryRelatedAppInfoService
 */
package nccloud.pubimpl.arap.arappub;

import com.ufida.report.anareport.base.FreeReportDrillParam;
import java.util.HashMap;
import java.util.Map;
import nc.bs.arap.util.ArapBillType2TableMapping;
import nc.bs.framework.common.NCLocator;
import nc.pub.report.util.ReportDrillBillUtil;
import nc.pub.smart.data.IRowData;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.platform.workbench.AppPageVO;
import nc.vo.pub.BusinessException;
import nccloud.commons.lang.StringUtils;
import nccloud.dto.baseapp.querytree.dataformat.QueryTreeFormatVO;
import nccloud.pubitf.arap.arappub.IArapBillLinkService;
import nccloud.putitf.riart.billtype.IDefaultQueryRelatedAppInfoService;

public class ArapBillLinkServiceImpl
implements IArapBillLinkService {
    public Map<String, String> getUrlByConditions(QueryTreeFormatVO conditionTree, Map serializedObjMap) throws BusinessException {
        String opents = (String)serializedObjMap.get("opents");
        String pkCode = (String)serializedObjMap.get("pkCode");
        String billTypeCode = (String)serializedObjMap.get("billTypeCode");
        ReportDrillBillUtil utils = new ReportDrillBillUtil();
        FreeReportDrillParam drillParam = utils.drillBill(serializedObjMap, conditionTree, serializedObjMap, opents);
        String billID = (String)drillParam.getTraceDatas()[0].getValue(pkCode);
        String cbilltype = null;
        if (billTypeCode != null && billTypeCode.length() > 0) {
            cbilltype = (String)drillParam.getTraceDatas()[0].getValue(billTypeCode);
        }
        if (cbilltype == null || billID == null) {
            IRowData rowData = drillParam.getTraceDatas()[0].getRowData();
            String hint = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61008_0", "02006v61008-0355");
            if (rowData == null) {
                throw new BusinessException(hint);
            }
            cbilltype = (String)rowData.getData("pk_billtype");
            billID = (String)rowData.getData("pk_bill");
            if (StringUtils.isEmpty((CharSequence)billID) && !StringUtils.isEmpty((CharSequence)cbilltype)) {
                billID = (String)rowData.getData(ArapBillType2TableMapping.getParentTablePK((String)cbilltype).split("\\.")[1]);
            }
            if (StringUtils.isEmpty((CharSequence)billID) || StringUtils.isEmpty((CharSequence)cbilltype)) {
                throw new BusinessException(hint);
            }
        }
        IDefaultQueryRelatedAppInfoService service = (IDefaultQueryRelatedAppInfoService)NCLocator.getInstance().lookup(IDefaultQueryRelatedAppInfoService.class);
        Map resultMap = service.queryLinkAppInfo(cbilltype, billID);
        HashMap<String, String> result = new HashMap<String, String>();
        if (resultMap.get("appcode") == null) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0871"));
        }
        result.put("appcode", resultMap.get("appcode").toString());
        result.put("pagecode", ((AppPageVO)resultMap.get("appPageVO")).getPagecode());
        result.put("url", ((AppPageVO)resultMap.get("appPageVO")).getPageurl().replace("/nccloud/resources", ""));
        result.put("id", billID);
        return result;
    }
}

