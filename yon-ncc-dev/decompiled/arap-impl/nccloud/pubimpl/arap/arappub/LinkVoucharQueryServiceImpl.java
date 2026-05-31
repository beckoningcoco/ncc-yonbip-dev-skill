/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ufida.iufo.table.drill.SimpleRowDataParam
 *  com.ufida.report.anareport.base.FreeReportDrillParam
 *  nc.bs.framework.common.NCLocator
 *  nc.itf.fipub.report.IReportQueryDlg
 *  nc.pub.report.util.ReportDrillBillUtil
 *  nc.pub.smart.data.IRowData
 *  nc.pubitf.fip.service.IFipBillQueryService
 *  nc.vo.arap.basebill.BaseAggVO
 *  nc.vo.arap.basebill.BaseBillVO
 *  nc.vo.fip.service.FipRelationInfoVO
 *  nc.vo.fipub.report.AggReportInitializeVO
 *  nc.vo.fipub.report.ReportInitializeVO
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.BusinessException
 *  nccloud.commons.lang.StringUtils
 *  nccloud.dto.baseapp.querytree.dataformat.QueryTreeFormatVO
 *  nccloud.pubitf.arap.arappub.IArapCommonUtilService
 *  nccloud.pubitf.arap.arappub.ILinkVoucharQueryService
 */
package nccloud.pubimpl.arap.arappub;

import com.ufida.iufo.table.drill.SimpleRowDataParam;
import com.ufida.report.anareport.base.FreeReportDrillParam;
import java.util.HashMap;
import java.util.Map;
import nc.bs.framework.common.NCLocator;
import nc.itf.fipub.report.IReportQueryDlg;
import nc.pub.report.util.ReportDrillBillUtil;
import nc.pub.smart.data.IRowData;
import nc.pubitf.fip.service.IFipBillQueryService;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.fip.service.FipRelationInfoVO;
import nc.vo.fipub.report.AggReportInitializeVO;
import nc.vo.fipub.report.ReportInitializeVO;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.BusinessException;
import nccloud.commons.lang.StringUtils;
import nccloud.dto.baseapp.querytree.dataformat.QueryTreeFormatVO;
import nccloud.pubitf.arap.arappub.IArapCommonUtilService;
import nccloud.pubitf.arap.arappub.ILinkVoucharQueryService;

public class LinkVoucharQueryServiceImpl
implements ILinkVoucharQueryService {
    public Map<String, Object> getUrlByConditions(QueryTreeFormatVO conditionTree, Map serializedObjMap, String funcode) throws BusinessException {
        String opents = (String)serializedObjMap.get("opents");
        ReportDrillBillUtil utils = new ReportDrillBillUtil();
        FreeReportDrillParam drillParam = utils.drillBill(serializedObjMap, conditionTree, serializedObjMap, opents);
        SimpleRowDataParam[] rowDatas = drillParam.getTraceDatas();
        IRowData rowData = rowDatas[0].getRowData();
        String pk_bill = (String)rowData.getData("pk_bill");
        AggReportInitializeVO repInitVO = ((IReportQueryDlg)NCLocator.getInstance().lookup(IReportQueryDlg.class)).getAllQueryObj(funcode, true);
        String pk_billtype = "";
        String reportType = "";
        if (repInitVO != null) {
            ReportInitializeVO headVO = (ReportInitializeVO)repInitVO.getParentVO();
            reportType = headVO.getReporttype();
        }
        BaseAggVO[] aggVo = null;
        if ("aralarm".equals(reportType) || "apalarm".equals(reportType) || "yszlfxmx".equals(reportType) || "yfzlfxmx".equals(reportType)) {
            pk_billtype = (String)rowData.getData("pk_billtype");
            if (StringUtils.isEmpty((CharSequence)pk_bill) || StringUtils.isEmpty((CharSequence)pk_billtype)) {
                throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0885"));
            }
            aggVo = ((IArapCommonUtilService)NCLocator.getInstance().lookup(IArapCommonUtilService.class)).queryBillHead(new String[]{pk_bill}, pk_billtype);
            if (aggVo != null && aggVo.length > 0 && aggVo[0].getParentVO() != null) {
                pk_billtype = ((BaseBillVO)aggVo[0].getParentVO()).getPk_tradetype();
            }
        } else {
            pk_billtype = (String)rowData.getData("pk_tradetype");
            if (StringUtils.isEmpty((CharSequence)pk_bill) || StringUtils.isEmpty((CharSequence)pk_billtype)) {
                throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0885"));
            }
            aggVo = ((IArapCommonUtilService)NCLocator.getInstance().lookup(IArapCommonUtilService.class)).queryBillHead(new String[]{pk_bill}, pk_billtype);
        }
        if (aggVo == null || aggVo.length == 0 || aggVo[0] == null || aggVo[0].getHeadVO().getPk_billtype() == null) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0765"));
        }
        HashMap<String, Object> map = new HashMap();
        try {
            FipRelationInfoVO srcinfovo = new FipRelationInfoVO();
            srcinfovo.setPk_group(aggVo[0].getHeadVO().getPk_group());
            srcinfovo.setPk_org(aggVo[0].getHeadVO().getPk_org());
            srcinfovo.setRelationID(aggVo[0].getHeadVO().getPrimaryKey());
            srcinfovo.setPk_billtype(aggVo[0].getHeadVO().getPk_tradetype());
            map = ((IFipBillQueryService)NCLocator.getInstance().lookup(IFipBillQueryService.class)).queryDesAppInfoBySrc(new FipRelationInfoVO[]{srcinfovo});
        }
        catch (BusinessException e) {
            throw new BusinessException(e.getMessage());
        }
        return map;
    }
}

