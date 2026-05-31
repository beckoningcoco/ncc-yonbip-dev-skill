/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.linkquery.utils.DetailLinkQueryVOConverter
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.logging.Logger
 *  nc.itf.arap.ntb.ITbbLinkBO
 *  nc.itf.arap.report.IDetailBO
 *  nc.itf.gl.pub.ILinkQueryParamTransfer
 *  nc.pub.smart.context.SmartContext
 *  nc.pub.smart.data.DataSet
 *  nc.vo.arap.pub.ArapConstant
 *  nc.vo.arap.tally.DetailLinkQueryVO
 *  nc.vo.arap.utils.GlBRParamVOConverter
 *  nc.vo.arap.utils.NtbParamVOConverter
 *  nc.vo.fipub.report.ReportInitializeItemVO
 *  nc.vo.fipub.report.ReportInitializeVO
 *  nc.vo.fipub.report.ReportQueryCondVO
 *  nc.vo.gl.busirecon.query.BridgeQueryVO
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.tb.obj.NtbParamVO
 *  nccloud.commons.lang.StringUtils
 *  nccloud.pubitf.arap.arappub.IDetailQueryService
 *  org.apache.commons.collections4.CollectionUtils
 *  org.apache.commons.lang3.ArrayUtils
 */
package nccloud.pubimpl.arap.arappub;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import nc.bs.arap.linkquery.utils.DetailLinkQueryVOConverter;
import nc.bs.framework.common.NCLocator;
import nc.bs.logging.Logger;
import nc.itf.arap.ntb.ITbbLinkBO;
import nc.itf.arap.report.IDetailBO;
import nc.itf.gl.pub.ILinkQueryParamTransfer;
import nc.pub.smart.context.SmartContext;
import nc.pub.smart.data.DataSet;
import nc.vo.arap.pub.ArapConstant;
import nc.vo.arap.tally.DetailLinkQueryVO;
import nc.vo.arap.utils.GlBRParamVOConverter;
import nc.vo.arap.utils.NtbParamVOConverter;
import nc.vo.fipub.report.ReportInitializeItemVO;
import nc.vo.fipub.report.ReportInitializeVO;
import nc.vo.fipub.report.ReportQueryCondVO;
import nc.vo.gl.busirecon.query.BridgeQueryVO;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.tb.obj.NtbParamVO;
import nccloud.commons.lang.StringUtils;
import nccloud.pubitf.arap.arappub.IDetailQueryService;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.ArrayUtils;

public class DetailQueryServiceImpl
implements IDetailQueryService {
    public HashMap<String, Object> glQueryVo(Map<String, Object> params) {
        ReportQueryCondVO queryCondVO = new ReportQueryCondVO();
        DataSet datas = new DataSet();
        List detailVo = new ArrayList();
        try {
            Class<?> clazz = Class.forName(params.get("class").toString());
            ILinkQueryParamTransfer transfer = (ILinkQueryParamTransfer)clazz.newInstance();
            BridgeQueryVO initParam = (BridgeQueryVO)transfer.transLinkQueryParam(params);
            SmartContext context = new SmartContext();
            queryCondVO = new GlBRParamVOConverter().glParamVOConvert(initParam);
            datas = ((IDetailBO)NCLocator.getInstance().lookup(IDetailBO.class)).query(queryCondVO, context);
            detailVo = DetailLinkQueryVOConverter.convert((ReportQueryCondVO)queryCondVO, (DataSet)datas);
        }
        catch (InstantiationException e) {
            Logger.error((Object)"\u8054\u67e5\u660e\u7ec6\u9519\u8bef");
            Logger.error((Object)e);
        }
        catch (IllegalAccessException e) {
            Logger.error((Object)"\u8054\u67e5\u660e\u7ec6\u9519\u8bef");
            Logger.error((Object)e);
        }
        catch (ClassNotFoundException e) {
            Logger.error((Object)"\u8054\u67e5\u660e\u7ec6\u9519\u8bef");
            Logger.error((Object)e);
        }
        catch (BusinessException e) {
            Logger.error((Object)"\u8054\u67e5\u660e\u7ec6\u9519\u8bef");
            Logger.error((Object)((Object)e));
        }
        HashMap<String, Object> map = new HashMap<String, Object>();
        this.adjustDetailColumns(queryCondVO, datas, map);
        map.put("tableData", detailVo);
        return map;
    }

    public HashMap<String, Object> ntbQueryVo(NtbParamVO ntbParamVO) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        ArapConstant constant = new ArapConstant();
        if (constant.ARAP_NTB_BILLTYPE_KEY_BALANCE.equals(ntbParamVO.getBill_type())) {
            ReportQueryCondVO queryCondVO = null;
            DataSet datas = null;
            List detailVo = new ArrayList();
            try {
                queryCondVO = NtbParamVOConverter.convertNtbParam2ReportQueryCondVO((NtbParamVO)ntbParamVO);
                ((ReportInitializeVO)queryCondVO.getRepInitContext().getParentVO()).setReporttype("detail");
                SmartContext context = new SmartContext();
                datas = ((IDetailBO)NCLocator.getInstance().lookup(IDetailBO.class)).query(queryCondVO, context);
                detailVo = DetailLinkQueryVOConverter.convert((ReportQueryCondVO)queryCondVO, (DataSet)datas);
            }
            catch (BusinessException e) {
                Logger.error((Object)"\u8054\u67e5\u660e\u7ec6\u9519\u8bef");
                Logger.error((Object)((Object)e));
            }
            this.adjustDetailColumns(queryCondVO, datas, map);
            map.put("tableData", detailVo);
        } else {
            List detailVo = new ArrayList();
            try {
                detailVo = ((ITbbLinkBO)NCLocator.getInstance().lookup(ITbbLinkBO.class)).getLinkDatas(ntbParamVO);
            }
            catch (BusinessException e) {
                Logger.error((Object)"\u8054\u67e5\u660e\u7ec6\u9519\u8bef");
                Logger.error((Object)((Object)e));
            }
            if (CollectionUtils.isNotEmpty(detailVo) && ((DetailLinkQueryVO)detailVo.get(0)).getCode_org() != null && ((DetailLinkQueryVO)detailVo.get(0)).getOrg() != null) {
                ArrayList<String> strs = new ArrayList<String>();
                for (String s : ntbParamVO.getBusiAttrs()) {
                    if (ArapConstant.ARAP_ORG.equals(s)) continue;
                    strs.add(s);
                }
                ntbParamVO.setBusiAttrs(strs.toArray(new String[0]));
            }
            this.adjustBillColumns(ntbParamVO, map);
            map.put("tableData", detailVo);
        }
        return map;
    }

    private void adjustBillColumns(NtbParamVO ntbParamVO, HashMap<String, Object> map) {
        ArrayList<String> hiddenColList = new ArrayList<String>();
        hiddenColList.add("qryobj0");
        hiddenColList.add("qryobj1");
        hiddenColList.add("qryobj2");
        hiddenColList.add("qryobj3");
        hiddenColList.add("qryobj4");
        hiddenColList.add("tallydate");
        hiddenColList.add("confirmdate");
        hiddenColList.add("bal_qua");
        hiddenColList.add("bal_ori");
        hiddenColList.add("bal_loc");
        hiddenColList.add("gr_bal_loc");
        hiddenColList.add("gl_bal_loc");
        map.put("hiddenList", hiddenColList);
        String[] busiAttrs = ntbParamVO.getBusiAttrs();
        if (busiAttrs != null) {
            HashMap<String, String> changeMap = new HashMap<String, String>();
            int i = 0;
            for (String str : busiAttrs) {
                String itemName = null;
                if (ArapConstant.ARAP_CUSTOMER.equals(str)) {
                    itemName = NCLangRes4VoTransl.getNCLangRes().getStrByID("common", "UC000-0001589");
                } else if (ArapConstant.ARAP_SUPPLIER.equals(str)) {
                    itemName = NCLangRes4VoTransl.getNCLangRes().getStrByID("common", "UC000-0000275");
                } else if (ArapConstant.ARAP_DEPT.equals(str)) {
                    itemName = NCLangRes4VoTransl.getNCLangRes().getStrByID("common", "UC000-0004064");
                } else if (ArapConstant.ARAP_PSNDOC.equals(str)) {
                    itemName = NCLangRes4VoTransl.getNCLangRes().getStrByID("common", "UC000-v53-0001759");
                } else if (ArapConstant.ARAP_PK_SUBJCODE.equals(str)) {
                    itemName = NCLangRes4VoTransl.getNCLangRes().getStrByID("common", "UC000-0002217");
                } else if (ArapConstant.ARAP_MATERIAL.equals(str)) {
                    itemName = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0594");
                } else if (ArapConstant.ARAP_SUBJCODE.equals(str)) {
                    itemName = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0596");
                } else if (!ArapConstant.ARAP_PRODUCTLINE.equals(str)) {
                    if (ArapConstant.ARAP_COSTCENTER.equals(str)) {
                        itemName = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0316_0", "02006arappub0316-0038");
                    } else if (ArapConstant.ARAP_PK_PROJECT.equals(str)) {
                        itemName = NCLangRes4VoTransl.getNCLangRes().getStrByID("common", "UC000-0004165");
                    } else if (ArapConstant.ARAP_PK_PCORG.equals(str)) {
                        itemName = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0595");
                    } else if (!ArapConstant.ARAP_PK_BUSITYPE.equals(str)) {
                        if (ArapConstant.ARAP_ORDERCUBASDOC.equals(str)) {
                            itemName = NCLangRes4VoTransl.getNCLangRes().getStrByID("common", "UC000-0003541");
                        } else if (ArapConstant.ARAP_BANKROLLPROJET.equals(str)) {
                            // empty if block
                        }
                    }
                }
                if (StringUtils.isEmpty((CharSequence)itemName) || i >= 5) continue;
                changeMap.put("qryobj" + i, itemName);
                hiddenColList.remove("qryobj" + i);
                ++i;
            }
            map.put("changeList", changeMap);
        }
    }

    private void adjustDetailColumns(ReportQueryCondVO qryCondVO, DataSet datas, HashMap<String, Object> map) {
        ArrayList<String> hiddenColList = new ArrayList<String>();
        hiddenColList.add("qryobj0");
        hiddenColList.add("qryobj1");
        hiddenColList.add("qryobj2");
        hiddenColList.add("qryobj3");
        hiddenColList.add("qryobj4");
        hiddenColList.add("billdate");
        hiddenColList.add("confirmdate");
        hiddenColList.add("effectdate");
        hiddenColList.add("voucherid");
        int qryObjCount = qryCondVO == null || datas == null || datas.getDatas().length == 0 ? 0 : qryCondVO.getQryObjs().size();
        for (int i = 0; i < qryObjCount; ++i) {
            hiddenColList.remove("qryobj" + i);
        }
        UFBoolean isshowvoucher = null;
        isshowvoucher = qryCondVO == null || qryCondVO.getRepInitContext() == null || qryCondVO.getRepInitContext().getParentVO() == null ? UFBoolean.FALSE : ((ReportInitializeVO)qryCondVO.getRepInitContext().getParentVO()).getIsshowvoucher();
        if (qryObjCount > 0 && isshowvoucher != null && isshowvoucher.booleanValue()) {
            hiddenColList.remove("voucherid");
        }
        map.put("hiddenList", hiddenColList);
        if (qryCondVO != null) {
            Object[] bodyVOs = (ReportInitializeItemVO[])qryCondVO.getRepInitContext().getChildrenVO();
            if (ArrayUtils.isEmpty((Object[])bodyVOs)) {
                return;
            }
            HashMap<String, String> changeMap = new HashMap<String, String>();
            for (int i = 0; i < qryObjCount; ++i) {
                if (i == bodyVOs.length) continue;
                changeMap.put("qryobj" + i, NCLangRes4VoTransl.getNCLangRes().getStrByID("arap", bodyVOs[i].getResid()));
                hiddenColList.remove("qryobj" + i);
            }
            map.put("changeList", changeMap);
        }
    }
}

