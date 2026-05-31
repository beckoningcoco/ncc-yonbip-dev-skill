/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.itf.mapub.dutyvouchertype.IDutyVoucherTypeQueryService
 *  nc.pubitf.bd.accessor.GeneralAccessorFactory
 *  nc.pubitf.fip.service.IFipBillQueryService
 *  nc.vo.bd.accessor.IBDData
 *  nc.vo.bd.vouchertype.VoucherTypeVO
 *  nc.vo.fip.external.FipExtendAggVO
 *  nc.vo.fip.service.FipRelationInfoVO
 *  nc.vo.fipub.report.PubCommonReportMethod
 *  nc.vo.fipub.report.QryObj
 *  nc.vo.fipub.report.ReportInitializeVO
 *  nc.vo.fipub.report.ReportQueryCondVO
 *  nc.vo.fipub.utils.SqlBuilder
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pub.lang.UFDouble
 *  nc.vo.pub.rs.MemoryResultSetMetaData
 *  nccloud.commons.lang.ArrayUtils
 *  nccloud.commons.lang.StringUtils
 */
package nc.vo.arap.comreport;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import nc.bs.framework.common.NCLocator;
import nc.itf.mapub.dutyvouchertype.IDutyVoucherTypeQueryService;
import nc.pubitf.bd.accessor.GeneralAccessorFactory;
import nc.pubitf.fip.service.IFipBillQueryService;
import nc.utils.arap.ArapReportResource;
import nc.vo.arap.comreport.ArapTempVoucherVO;
import nc.vo.arap.pub.UFDoubleTool;
import nc.vo.bd.accessor.IBDData;
import nc.vo.bd.vouchertype.VoucherTypeVO;
import nc.vo.fip.external.FipExtendAggVO;
import nc.vo.fip.service.FipRelationInfoVO;
import nc.vo.fipub.report.PubCommonReportMethod;
import nc.vo.fipub.report.QryObj;
import nc.vo.fipub.report.ReportInitializeVO;
import nc.vo.fipub.report.ReportQueryCondVO;
import nc.vo.fipub.utils.SqlBuilder;
import nc.vo.pub.BusinessException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pub.rs.MemoryResultSetMetaData;
import nccloud.commons.lang.ArrayUtils;
import nccloud.commons.lang.StringUtils;

public class ArapDetailCalculator {
    public final String MDID_RESA_VOUCHERTYPE = "9d51c1f7-e9c9-4a25-801a-63eff11926fb";
    public static final String ALL = "all";
    public static final String QUA = "_qua";
    public static final String ORI = "_ori";
    public static final String LOC = "_loc";
    public static final String GR = "gr_";
    public static final String GL = "gl_";
    protected MemoryResultSetMetaData metaData = null;
    private ReportQueryCondVO queryCondVO = null;
    protected int rnIdx = 0;
    protected int voucherIdx = 0;
    protected int pk_groupIdx = 0;
    protected int pk_orgIdx = 0;
    protected int pk_billIdx = 0;
    protected int pk_tradetypeIdx = 0;
    protected int orgIdx = 0;
    protected int briefIdx = 0;
    protected int dealnumIdx = 0;
    private int debt_qua_idx = 0;
    private int debt_ori_idx = 0;
    private int debt_loc_idx = 0;
    private int gr_debt_loc_idx = 0;
    private int gl_debt_loc_idx = 0;
    private int credit_qua_idx = 0;
    private int credit_ori_idx = 0;
    private int credit_loc_idx = 0;
    private int gr_credit_loc_idx = 0;
    private int gl_credit_loc_idx = 0;
    private int bal_qua_idx = 0;
    private int bal_ori_idx = 0;
    private int bal_loc_idx = 0;
    private int gr_bal_loc_idx = 0;
    private int gl_bal_loc_idx = 0;
    private double direct = 0.0;
    private List<StatisticDimension> dimenList = new ArrayList<StatisticDimension>();

    public ArapDetailCalculator(MemoryResultSetMetaData metaData, ReportQueryCondVO queryCondVO) throws SQLException {
        this.metaData = metaData;
        this.queryCondVO = queryCondVO;
        if (queryCondVO.getRepInitContext() != null) {
            this.direct = "rec".equals(((ReportInitializeVO)queryCondVO.getRepInitContext().getParentVO()).getRec_pay_direct()) ? 1.0 : -1.0;
        }
        this.initIndex();
    }

    protected void initIndex() throws SQLException {
        this.rnIdx = this.metaData.getNameIndex("rn");
        this.voucherIdx = this.metaData.getNameIndex("voucherid");
        this.pk_groupIdx = this.metaData.getNameIndex("pk_group");
        this.pk_orgIdx = this.metaData.getNameIndex("pk_org");
        this.pk_billIdx = this.metaData.getNameIndex("pk_bill");
        this.pk_tradetypeIdx = this.metaData.getNameIndex("pk_tradetype");
        this.orgIdx = this.metaData.getNameIndex("org");
        this.briefIdx = this.metaData.getNameIndex("brief");
        this.dealnumIdx = this.metaData.getNameIndex("pk_dealnum");
        this.debt_qua_idx = this.metaData.getNameIndex("debt_qua");
        this.debt_ori_idx = this.metaData.getNameIndex("debt_ori");
        this.debt_loc_idx = this.metaData.getNameIndex("debt_loc");
        this.gr_debt_loc_idx = this.metaData.getNameIndex("gr_debt_loc");
        this.gl_debt_loc_idx = this.metaData.getNameIndex("gl_debt_loc");
        this.credit_qua_idx = this.metaData.getNameIndex("credit_qua");
        this.credit_ori_idx = this.metaData.getNameIndex("credit_ori");
        this.credit_loc_idx = this.metaData.getNameIndex("credit_loc");
        this.gr_credit_loc_idx = this.metaData.getNameIndex("gr_credit_loc");
        this.gl_credit_loc_idx = this.metaData.getNameIndex("gl_credit_loc");
        this.bal_qua_idx = this.metaData.getNameIndex("bal_qua");
        this.bal_ori_idx = this.metaData.getNameIndex("bal_ori");
        this.bal_loc_idx = this.metaData.getNameIndex("bal_loc");
        this.gr_bal_loc_idx = this.metaData.getNameIndex("gr_bal_loc");
        this.gl_bal_loc_idx = this.metaData.getNameIndex("gl_bal_loc");
        StatisticDimension d = null;
        d = new StatisticDimension();
        d.pk_ind = this.metaData.getNameIndex("pk_org");
        d.code_ind = this.metaData.getNameIndex("code_org");
        d.name_ind = this.orgIdx;
        this.dimenList.add(d);
        for (int i = 0; i < this.queryCondVO.getQryObjs().size(); ++i) {
            d = new StatisticDimension();
            d.pk_ind = this.metaData.getNameIndex("qryobj" + i + "pk");
            d.code_ind = this.metaData.getNameIndex("qryobj" + i + "code");
            d.name_ind = this.metaData.getNameIndex("qryobj" + i);
            this.dimenList.add(d);
        }
        d = new StatisticDimension();
        d.pk_ind = this.metaData.getNameIndex("pk_currtype");
        d.name_ind = this.metaData.getNameIndex("currtype");
        this.dimenList.add(d);
    }

    public Object[][] computeVoucher(Object[][] datas) throws BusinessException {
        Object[] relationInfoVOs = this.getFipRelationInfoVO(datas);
        if (ArrayUtils.isEmpty((Object[])relationInfoVOs)) {
            return datas;
        }
        List desBills = ((IFipBillQueryService)NCLocator.getInstance().lookup(IFipBillQueryService.class)).queryDesBillBySrc4WFW((FipRelationInfoVO[])relationInfoVOs, null);
        if (desBills == null || desBills.size() == 0) {
            return datas;
        }
        this.setVoucher(datas, this.recombine(desBills));
        return datas;
    }

    protected FipRelationInfoVO[] getFipRelationInfoVO(Object[][] datas) {
        ArrayList<FipRelationInfoVO> relationInfoVOs = new ArrayList<FipRelationInfoVO>();
        Object pk_billObj = null;
        Object dealnumObj = null;
        FipRelationInfoVO relationInfoVO = null;
        for (Object[] rowData : datas) {
            pk_billObj = rowData[this.pk_billIdx];
            dealnumObj = rowData[this.dealnumIdx];
            if (!"~".equals(dealnumObj) && !StringUtils.isEmpty((CharSequence)((String)dealnumObj)) || !StringUtils.isNotEmpty((CharSequence)((String)pk_billObj))) continue;
            relationInfoVO = new FipRelationInfoVO();
            relationInfoVO.setPk_group(rowData[this.pk_groupIdx].toString());
            relationInfoVO.setPk_org(rowData[this.pk_orgIdx].toString());
            relationInfoVO.setRelationID(pk_billObj.toString());
            relationInfoVO.setPk_billtype(rowData[this.pk_tradetypeIdx].toString());
            relationInfoVOs.add(relationInfoVO);
        }
        return relationInfoVOs.toArray(new FipRelationInfoVO[0]);
    }

    protected Map<String, String> recombine(List<Map<String, Object>> desBills) throws BusinessException {
        ArapTempVoucherVO tempVO = null;
        HashSet<String> resaVoucherTypeSet = new HashSet<String>();
        HashSet<String> glVoucherTypeSet = new HashSet<String>();
        ArrayList<ArapTempVoucherVO> tempVOList = new ArrayList<ArapTempVoucherVO>();
        for (Map<String, Object> desBill : desBills) {
            tempVO = new ArapTempVoucherVO();
            Object pk_vouchertype = desBill.get("pk_vouchertype");
            if (pk_vouchertype == null) continue;
            tempVO.setPk_vouchertype((String)pk_vouchertype);
            tempVO.setVoucherid(desBill.get("no") == null ? "" : desBill.get("no").toString());
            tempVO.setRelationID((String)desBill.get("relationId"));
            String string = (String)desBill.get("des_relationid");
            tempVO.setPk_voucher(string);
            String des_billtype = (String)desBill.get("des_billtype");
            if ("NRESA03".equals(des_billtype) || "RA00".equals(des_billtype)) {
                resaVoucherTypeSet.add((String)pk_vouchertype);
            } else {
                if (!"C0".equals(des_billtype)) continue;
                glVoucherTypeSet.add((String)pk_vouchertype);
            }
            tempVOList.add(tempVO);
        }
        HashMap<String, String> voucherTypeMap = new HashMap<String, String>();
        if (glVoucherTypeSet.size() > 0) {
            VoucherTypeVO[] glVoucherTypeVOs;
            String nameFld = "name" + PubCommonReportMethod.getMultiLangIndex();
            VoucherTypeVO[] voucherTypeVOArray = glVoucherTypeVOs = PubCommonReportMethod.queryVoucherTypeByPKs((String[])glVoucherTypeSet.toArray(new String[0]));
            int n = voucherTypeVOArray.length;
            for (int i = 0; i < n; ++i) {
                VoucherTypeVO voucherTypeVO = voucherTypeVOArray[i];
                voucherTypeMap.put(voucherTypeVO.getPk_vouchertype(), (String)voucherTypeVO.getAttributeValue(nameFld) == null ? (String)voucherTypeVO.getAttributeValue("name") : (String)voucherTypeVO.getAttributeValue(nameFld));
            }
        }
        if (resaVoucherTypeSet.size() > 0) {
            SqlBuilder sql = new SqlBuilder();
            sql.append("pk_vouchertype", resaVoucherTypeSet.toArray(new String[0]));
            Object[] voucherTypes = ((IDutyVoucherTypeQueryService)NCLocator.getInstance().lookup(IDutyVoucherTypeQueryService.class)).listVoucherType(sql.toString());
            if (ArrayUtils.isNotEmpty((Object[])voucherTypes)) {
                for (Object object : voucherTypes) {
                    voucherTypeMap.put(object.getPrimaryKey(), object.getName());
                }
            }
        }
        String voucherNo = null;
        String[] relationIDs = null;
        HashMap<String, String> hashMap = new HashMap<String, String>();
        for (ArapTempVoucherVO voucherVO : tempVOList) {
            voucherVO.setVouchertypename((String)voucherTypeMap.get(voucherVO.getPk_vouchertype()));
            if (!StringUtils.isNotEmpty((CharSequence)voucherVO.getVoucherid())) continue;
            for (String relationID : relationIDs = voucherVO.getRelationID().split(",")) {
                voucherNo = (voucherVO.getVouchertypename() == null ? " " : voucherVO.getVouchertypename() + ":") + voucherVO.getVoucherid();
                if (hashMap.get(relationID) == null) {
                    hashMap.put(relationID, voucherNo);
                    continue;
                }
                hashMap.put(relationID, (String)hashMap.get(relationID) + ", " + voucherNo);
            }
        }
        return hashMap;
    }

    protected Map<String, String> recombine(FipExtendAggVO[] fipExtendAggVOs) throws BusinessException {
        ArapTempVoucherVO tempVO = null;
        HashSet<String> resaVoucherTypeSet = new HashSet<String>();
        HashSet<String> glVoucherTypeSet = new HashSet<String>();
        ArrayList<ArapTempVoucherVO> tempVOList = new ArrayList<ArapTempVoucherVO>();
        for (FipExtendAggVO fipExtendAggVO : fipExtendAggVOs) {
            if (!(fipExtendAggVO.getBillVO() instanceof CircularlyAccessibleValueObject)) continue;
            tempVO = new ArapTempVoucherVO();
            CircularlyAccessibleValueObject voucherVO = (CircularlyAccessibleValueObject)fipExtendAggVO.getBillVO();
            if ((String)voucherVO.getAttributeValue("vouchertype") != null && ((String)voucherVO.getAttributeValue("vouchertype")).length() != 20) {
                voucherVO.setAttributeValue("vouchertype", null);
            }
            if ((String)voucherVO.getAttributeValue("pk_vouchertype") != null && ((String)voucherVO.getAttributeValue("pk_vouchertype")).length() != 20) {
                voucherVO.setAttributeValue("pk_vouchertype", null);
            }
            if (Arrays.asList(voucherVO.getAttributeNames()).contains("vouchertype")) {
                tempVO.setPk_vouchertype((String)voucherVO.getAttributeValue("vouchertype"));
                if (StringUtils.isEmpty((CharSequence)tempVO.getPk_vouchertype())) continue;
                tempVO.setPk_voucher((String)voucherVO.getAttributeValue("pk_voucher"));
                tempVO.setVoucherid((String)voucherVO.getAttributeValue("voucherno"));
                tempVO.setRelationID(fipExtendAggVO.getRelationID());
                resaVoucherTypeSet.add(tempVO.getPk_vouchertype());
            } else {
                if (!Arrays.asList(voucherVO.getAttributeNames()).contains("pk_vouchertype")) continue;
                tempVO.setPk_vouchertype((String)voucherVO.getAttributeValue("pk_vouchertype"));
                if (StringUtils.isEmpty((CharSequence)tempVO.getPk_vouchertype())) continue;
                tempVO.setPk_voucher((String)voucherVO.getAttributeValue("pk_voucher"));
                Integer voucherid = (Integer)voucherVO.getAttributeValue("num");
                tempVO.setVoucherid(voucherid == null ? null : voucherid.toString());
                tempVO.setRelationID(fipExtendAggVO.getRelationID());
                glVoucherTypeSet.add(tempVO.getPk_vouchertype());
            }
            tempVOList.add(tempVO);
        }
        HashMap<String, String> voucherTypeMap = new HashMap<String, String>();
        if (glVoucherTypeSet.size() > 0) {
            VoucherTypeVO[] glVoucherTypeVOs;
            String nameFld = "name" + PubCommonReportMethod.getMultiLangIndex();
            for (VoucherTypeVO vo : glVoucherTypeVOs = PubCommonReportMethod.queryVoucherTypeByPKs((String[])glVoucherTypeSet.toArray(new String[0]))) {
                voucherTypeMap.put(vo.getPk_vouchertype(), (String)vo.getAttributeValue(nameFld) == null ? (String)vo.getAttributeValue("name") : (String)vo.getAttributeValue(nameFld));
            }
        }
        if (resaVoucherTypeSet.size() > 0) {
            IBDData[] resaVoucherTypes;
            for (IBDData voucherType : resaVoucherTypes = GeneralAccessorFactory.getAccessor((String)"9d51c1f7-e9c9-4a25-801a-63eff11926fb").getDocbyPks(resaVoucherTypeSet.toArray(new String[0]))) {
                voucherTypeMap.put(voucherType.getPk(), voucherType.getName().getText(voucherType.getName().getCurrLangIndex()));
            }
        }
        String voucherNo = null;
        String[] relationIDs = null;
        HashMap<String, String> hashMap = new HashMap<String, String>();
        for (ArapTempVoucherVO voucherVO : tempVOList) {
            voucherVO.setVouchertypename((String)voucherTypeMap.get(voucherVO.getPk_vouchertype()));
            if (!StringUtils.isNotEmpty((CharSequence)voucherVO.getVoucherid())) continue;
            for (String relationID : relationIDs = voucherVO.getRelationID().split(",")) {
                voucherNo = voucherVO.getVouchertypename() + ":" + voucherVO.getVoucherid();
                if (hashMap.get(relationID) == null) {
                    hashMap.put(relationID, voucherNo);
                    continue;
                }
                hashMap.put(relationID, (String)hashMap.get(relationID) + ", " + voucherNo);
            }
        }
        return hashMap;
    }

    protected void setVoucher(Object[][] datas, Map<String, String> voucherMap) {
        Object pk_billObj = null;
        for (Object[] rowData : datas) {
            pk_billObj = rowData[this.pk_billIdx];
            if (StringUtils.isEmpty((CharSequence)((String)pk_billObj))) continue;
            rowData[this.voucherIdx] = voucherMap.get(pk_billObj);
        }
    }

    public Object[][] computeDateSubTotal(Object[][] datas, int dateIndex) throws SQLException {
        Object obj = this.queryCondVO.getUserObject().get("showDateTotalComb");
        if (obj == null || !((UFBoolean)obj).booleanValue()) {
            return datas;
        }
        ArrayList<Object[]> retDataList = new ArrayList<Object[]>();
        int rn = 0;
        String currDate = null;
        Object[] rowData = null;
        Object[] totalRowData = null;
        String preDate = null;
        for (int i = 0; i < datas.length; ++i) {
            rowData = datas[i];
            rn = Integer.parseInt(rowData[this.rnIdx].toString());
            String string = currDate = rowData[dateIndex] == null ? "" : rowData[dateIndex].toString();
            if (!StringUtils.isEmpty((CharSequence)currDate) && !currDate.equals(preDate) && totalRowData != null || totalRowData != null && rn >= 1000000) {
                totalRowData[this.bal_qua_idx] = datas[i - 1][this.bal_qua_idx];
                totalRowData[this.bal_ori_idx] = datas[i - 1][this.bal_ori_idx];
                totalRowData[this.bal_loc_idx] = datas[i - 1][this.bal_loc_idx];
                totalRowData[this.gr_bal_loc_idx] = datas[i - 1][this.gr_bal_loc_idx];
                totalRowData[this.gl_bal_loc_idx] = datas[i - 1][this.gl_bal_loc_idx];
                retDataList.add(totalRowData);
                if (rn < 1000000) {
                    totalRowData = this.createNewDateTotal(rowData, dateIndex);
                }
            } else if (!StringUtils.isEmpty((CharSequence)currDate) && !currDate.equals(preDate)) {
                totalRowData = this.createNewDateTotal(rowData, dateIndex);
            }
            if (rn == 0 || rn >= 1000000 || StringUtils.isEmpty((CharSequence)currDate)) {
                retDataList.add(rowData);
                totalRowData = null;
                preDate = null;
                continue;
            }
            if (StringUtils.isEmpty((CharSequence)currDate)) continue;
            totalRowData[this.debt_qua_idx] = ArapDetailCalculator.toUFDouble(totalRowData[this.debt_qua_idx]).add(ArapDetailCalculator.toUFDouble(rowData[this.debt_qua_idx]));
            totalRowData[this.debt_ori_idx] = ArapDetailCalculator.toUFDouble(totalRowData[this.debt_ori_idx]).add(ArapDetailCalculator.toUFDouble(rowData[this.debt_ori_idx]));
            totalRowData[this.debt_loc_idx] = ArapDetailCalculator.toUFDouble(totalRowData[this.debt_loc_idx]).add(ArapDetailCalculator.toUFDouble(rowData[this.debt_loc_idx]));
            totalRowData[this.gr_debt_loc_idx] = ArapDetailCalculator.toUFDouble(totalRowData[this.gr_debt_loc_idx]).add(ArapDetailCalculator.toUFDouble(rowData[this.gr_debt_loc_idx]));
            totalRowData[this.gl_debt_loc_idx] = ArapDetailCalculator.toUFDouble(totalRowData[this.gl_debt_loc_idx]).add(ArapDetailCalculator.toUFDouble(rowData[this.gl_debt_loc_idx]));
            totalRowData[this.credit_qua_idx] = ArapDetailCalculator.toUFDouble(totalRowData[this.credit_qua_idx]).add(ArapDetailCalculator.toUFDouble(rowData[this.credit_qua_idx]));
            totalRowData[this.credit_ori_idx] = ArapDetailCalculator.toUFDouble(totalRowData[this.credit_ori_idx]).add(ArapDetailCalculator.toUFDouble(rowData[this.credit_ori_idx]));
            totalRowData[this.credit_loc_idx] = ArapDetailCalculator.toUFDouble(totalRowData[this.credit_loc_idx]).add(ArapDetailCalculator.toUFDouble(rowData[this.credit_loc_idx]));
            totalRowData[this.gr_credit_loc_idx] = ArapDetailCalculator.toUFDouble(totalRowData[this.gr_credit_loc_idx]).add(ArapDetailCalculator.toUFDouble(rowData[this.gr_credit_loc_idx]));
            totalRowData[this.gl_credit_loc_idx] = ArapDetailCalculator.toUFDouble(totalRowData[this.gl_credit_loc_idx]).add(ArapDetailCalculator.toUFDouble(rowData[this.gl_credit_loc_idx]));
            retDataList.add(rowData);
            preDate = currDate;
        }
        Object[][] retDatas = new Object[retDataList.size()][];
        int i = 0;
        for (Object[] row : retDataList) {
            retDatas[i++] = row;
        }
        return retDatas;
    }

    public Object[][] computeSubTotalBal(Object[][] datas) throws SQLException {
        boolean isObj = false;
        HashMap<String, UFDouble> balMap = new HashMap<String, UFDouble>();
        balMap.put("all_qua", UFDouble.ZERO_DBL);
        balMap.put("all_ori", UFDouble.ZERO_DBL);
        balMap.put("all_loc", UFDouble.ZERO_DBL);
        balMap.put("allgr_", UFDouble.ZERO_DBL);
        balMap.put("allgl_", UFDouble.ZERO_DBL);
        ArrayList<Object[]> retList = new ArrayList<Object[]>();
        boolean isAdd = false;
        int rn = 0;
        Object[] rowData = null;
        for (int i = 0; i < datas.length; ++i) {
            rowData = datas[i];
            rn = Integer.parseInt(rowData[this.rnIdx].toString());
            if (rn == 0) {
                String key = "";
                for (StatisticDimension d : this.dimenList) {
                    if (balMap.get((key = key + rowData[d.pk_ind]) + QUA) == null) {
                        balMap.put(key + QUA, UFDouble.ZERO_DBL);
                        balMap.put(key + ORI, UFDouble.ZERO_DBL);
                        balMap.put(key + LOC, UFDouble.ZERO_DBL);
                        balMap.put(key + GR, UFDouble.ZERO_DBL);
                        balMap.put(key + GL, UFDouble.ZERO_DBL);
                    }
                    balMap.put(key + QUA, ((UFDouble)balMap.get(key + QUA)).add(ArapDetailCalculator.toUFDouble(rowData[this.bal_qua_idx])));
                    balMap.put(key + ORI, ((UFDouble)balMap.get(key + ORI)).add(ArapDetailCalculator.toUFDouble(rowData[this.bal_ori_idx])));
                    balMap.put(key + LOC, ((UFDouble)balMap.get(key + LOC)).add(ArapDetailCalculator.toUFDouble(rowData[this.bal_loc_idx])));
                    balMap.put(key + GR, ((UFDouble)balMap.get(key + GR)).add(ArapDetailCalculator.toUFDouble(rowData[this.gr_bal_loc_idx])));
                    balMap.put(key + GL, ((UFDouble)balMap.get(key + GL)).add(ArapDetailCalculator.toUFDouble(rowData[this.gl_bal_loc_idx])));
                }
                balMap.put("all_qua", ((UFDouble)balMap.get("all_qua")).add(ArapDetailCalculator.toUFDouble(rowData[this.bal_qua_idx])));
                balMap.put("all_ori", ((UFDouble)balMap.get("all_ori")).add(ArapDetailCalculator.toUFDouble(rowData[this.bal_ori_idx])));
                balMap.put("all_loc", ((UFDouble)balMap.get("all_loc")).add(ArapDetailCalculator.toUFDouble(rowData[this.bal_loc_idx])));
                balMap.put("allgr_", ((UFDouble)balMap.get("allgr_")).add(ArapDetailCalculator.toUFDouble(rowData[this.gr_bal_loc_idx])));
                balMap.put("allgl_", ((UFDouble)balMap.get("allgl_")).add(ArapDetailCalculator.toUFDouble(rowData[this.gl_bal_loc_idx])));
            }
            isAdd = false;
            if (rn > 1000000) {
                int k;
                isObj = false;
                for (k = this.dimenList.size() - 1; k > 0; --k) {
                    if (rowData[this.dimenList.get((int)k).pk_ind] == null || "".equals(rowData[this.dimenList.get((int)k).pk_ind])) continue;
                    if (k != this.dimenList.size() - 1) {
                        if (null != rowData[this.dimenList.get((int)k).pk_ind] && "nvlobj".equals(rowData[this.dimenList.get((int)k).pk_ind])) {
                            rowData[this.dimenList.get((int)k).code_ind] = ArapReportResource.getNvlObjSubTotalLbl();
                            rowData[this.dimenList.get((int)k).name_ind] = ArapReportResource.getNvlObjSubTotalLbl();
                        } else {
                            rowData[this.dimenList.get((int)k).code_ind] = rowData[this.dimenList.get((int)k).code_ind] + ArapReportResource.getSubTotalLbl();
                            rowData[this.dimenList.get((int)k).name_ind] = rowData[this.dimenList.get((int)k).name_ind] + ArapReportResource.getSubTotalLbl();
                        }
                        if (k != 0 && ((QryObj)this.queryCondVO.getQryObjs().get(k - 1)).isShowSubtotal()) {
                            isAdd = true;
                        }
                    } else {
                        rowData[this.dimenList.get((int)k).name_ind] = rowData[this.dimenList.get((int)k).name_ind] + ArapReportResource.getSubTotalLbl();
                        isAdd = true;
                    }
                    this.setRowDataBal(rowData, balMap, k);
                    isObj = true;
                    break;
                }
                --k;
                while (k > 0) {
                    rowData[this.dimenList.get((int)k).code_ind] = "";
                    rowData[this.dimenList.get((int)k).name_ind] = "";
                    --k;
                }
                if (!isObj && rowData[this.dimenList.get((int)0).pk_ind] != null && !"".equals(rowData[this.dimenList.get((int)0).pk_ind])) {
                    this.setRowDataBal(rowData, balMap, 0);
                    isAdd = true;
                } else if (!isObj) {
                    rowData[this.briefIdx] = ArapReportResource.getAllTotalLbl();
                    this.setRowDataBal(rowData, balMap, -1);
                    isAdd = true;
                } else {
                    rowData[this.dimenList.get((int)0).code_ind] = "";
                    rowData[this.dimenList.get((int)0).name_ind] = "";
                }
                if ("forGLDetail".equals(this.queryCondVO.getQryMode()) || "forGL".equals(this.queryCondVO.getQryMode())) continue;
                rowData[this.bal_ori_idx] = UFDouble.ZERO_DBL;
                rowData[this.debt_ori_idx] = UFDouble.ZERO_DBL;
                rowData[this.credit_ori_idx] = UFDouble.ZERO_DBL;
            } else {
                isAdd = true;
            }
            if (!isAdd) continue;
            retList.add(rowData);
        }
        return (Object[][])retList.toArray((T[])new Object[0][0]);
    }

    private void setRowDataBal(Object[] rowData, Map<String, UFDouble> balMap, int curr) {
        String key = "";
        if (curr == -1) {
            key = ALL;
        } else {
            for (int i = 0; i <= curr; ++i) {
                key = key + rowData[this.dimenList.get((int)i).pk_ind];
            }
        }
        rowData[this.bal_qua_idx] = UFDoubleTool.sum(ArapDetailCalculator.toUFDouble(rowData[this.debt_qua_idx]).sub(ArapDetailCalculator.toUFDouble(rowData[this.credit_qua_idx])).multiply(this.direct), balMap.get(key + QUA));
        rowData[this.bal_ori_idx] = UFDoubleTool.sum(ArapDetailCalculator.toUFDouble(rowData[this.debt_ori_idx]).sub(ArapDetailCalculator.toUFDouble(rowData[this.credit_ori_idx])).multiply(this.direct), balMap.get(key + ORI));
        rowData[this.bal_loc_idx] = UFDoubleTool.sum(ArapDetailCalculator.toUFDouble(rowData[this.debt_loc_idx]).sub(ArapDetailCalculator.toUFDouble(rowData[this.credit_loc_idx])).multiply(this.direct), balMap.get(key + LOC));
        rowData[this.gr_bal_loc_idx] = UFDoubleTool.sum(ArapDetailCalculator.toUFDouble(rowData[this.gr_debt_loc_idx]).sub(ArapDetailCalculator.toUFDouble(rowData[this.gr_credit_loc_idx])).multiply(this.direct), balMap.get(key + GR));
        rowData[this.gl_bal_loc_idx] = UFDoubleTool.sum(ArapDetailCalculator.toUFDouble(rowData[this.gl_debt_loc_idx]).sub(ArapDetailCalculator.toUFDouble(rowData[this.gl_credit_loc_idx])).multiply(this.direct), balMap.get(key + GL));
    }

    private Object[] createNewDateTotal(Object[] rowData, int dateIndex) throws SQLException {
        Object[] totalRowData = new Object[this.metaData.getColumnCount()];
        totalRowData[dateIndex] = ArapReportResource.getDateSubTotalLbl();
        totalRowData[this.debt_qua_idx] = UFDouble.ZERO_DBL;
        totalRowData[this.debt_ori_idx] = UFDouble.ZERO_DBL;
        totalRowData[this.debt_loc_idx] = UFDouble.ZERO_DBL;
        totalRowData[this.gr_debt_loc_idx] = UFDouble.ZERO_DBL;
        totalRowData[this.gl_debt_loc_idx] = UFDouble.ZERO_DBL;
        totalRowData[this.credit_qua_idx] = UFDouble.ZERO_DBL;
        totalRowData[this.credit_ori_idx] = UFDouble.ZERO_DBL;
        totalRowData[this.credit_loc_idx] = UFDouble.ZERO_DBL;
        totalRowData[this.gr_credit_loc_idx] = UFDouble.ZERO_DBL;
        totalRowData[this.gl_credit_loc_idx] = UFDouble.ZERO_DBL;
        totalRowData[this.rnIdx] = 1000000;
        totalRowData[this.pk_groupIdx] = rowData[this.pk_groupIdx];
        for (StatisticDimension d : this.dimenList) {
            totalRowData[d.pk_ind] = rowData[d.pk_ind];
        }
        return totalRowData;
    }

    public static UFDouble toUFDouble(Object obj) {
        return obj == null || "".equals(obj) ? UFDouble.ZERO_DBL : new UFDouble(obj.toString());
    }

    public class StatisticDimension {
        public int pk_ind = -1;
        public int code_ind = -1;
        public int name_ind = -1;
    }
}

