/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.itf.arap.report.IBalanceBO
 *  nc.itf.arap.report.IDetailBO
 *  nc.itf.gl.busirecon.IBRDealClass
 *  nc.pub.smart.context.SmartContext
 *  nc.pub.smart.data.DataRow
 *  nc.pub.smart.data.DataSet
 *  nc.vo.arap.utils.GlBRParamVOConverter
 *  nc.vo.arap.utils.GlBRParamVOConverter$ReportQueryCondVOGL
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.fipub.report.ReportQueryCondVO
 *  nc.vo.gl.busirecon.data.BusiBillVO
 *  nc.vo.gl.busirecon.data.BusiDataVO
 *  nc.vo.gl.busirecon.dealclass.BRSysRecordVO
 *  nc.vo.gl.busirecon.query.BusiReconQryVO
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.BeanHelper
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFDouble
 *  nccloud.commons.lang.ArrayUtils
 */
package nc.bs.arap.billreconn;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import nc.bs.framework.common.NCLocator;
import nc.itf.arap.report.IBalanceBO;
import nc.itf.arap.report.IDetailBO;
import nc.itf.gl.busirecon.IBRDealClass;
import nc.pub.smart.context.SmartContext;
import nc.pub.smart.data.DataRow;
import nc.pub.smart.data.DataSet;
import nc.vo.arap.utils.GlBRParamVOConverter;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.fipub.report.ReportQueryCondVO;
import nc.vo.gl.busirecon.data.BusiBillVO;
import nc.vo.gl.busirecon.data.BusiDataVO;
import nc.vo.gl.busirecon.dealclass.BRSysRecordVO;
import nc.vo.gl.busirecon.query.BusiReconQryVO;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.BeanHelper;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDouble;
import nccloud.commons.lang.ArrayUtils;

public class BRDealClass
implements IBRDealClass {
    private static final String RN = "rn";
    private boolean isOpenUpBusiUnit = true;

    public BusiDataVO[] getBRSumData(BusiReconQryVO queryVO) throws BusinessException {
        try {
            this.isOpenUpBusiUnit = queryVO.isOpenUpBusiUnit();
            GlBRParamVOConverter.ReportQueryCondVOGL[] reportQryCondVOs = new GlBRParamVOConverter().glParamVOConvert(queryVO);
            ArrayList<BusiDataVO> busiDataVOs = new ArrayList<BusiDataVO>();
            IBalanceBO service = (IBalanceBO)NCLocator.getInstance().lookup(IBalanceBO.class);
            for (int i = 0; i < reportQryCondVOs.length; ++i) {
                if (null == reportQryCondVOs[i]) continue;
                ReportQueryCondVO condVO = reportQryCondVOs[i].getReportQueryCondVO();
                condVO.setQryMode("forGL");
                condVO.setAnaMode("glbrsum");
                DataSet balance = service.query(condVO, null);
                busiDataVOs.addAll(this.convertTo(balance, condVO, null, reportQryCondVOs[i], true));
            }
            return busiDataVOs.toArray(new BusiDataVO[0]);
        }
        catch (Exception e) {
            throw ExceptionHandler.handleException((Exception)e);
        }
    }

    public BusiDataVO[] getBRData(BusiReconQryVO queryVO) throws BusinessException {
        try {
            GlBRParamVOConverter.ReportQueryCondVOGL[] reportQryCondVOs = new GlBRParamVOConverter().glParamVOConvert(queryVO);
            ArrayList<BusiDataVO> busiDataVOs = new ArrayList<BusiDataVO>();
            IBalanceBO service = (IBalanceBO)NCLocator.getInstance().lookup(IBalanceBO.class);
            for (int i = 0; i < reportQryCondVOs.length; ++i) {
                if (null == reportQryCondVOs[i]) continue;
                ReportQueryCondVO condVO = reportQryCondVOs[i].getReportQueryCondVO();
                condVO.setQryMode("forGL");
                condVO.setAnaMode("glbr");
                DataSet balance = service.query(condVO, null);
                busiDataVOs.addAll(this.convertTo(balance, condVO, reportQryCondVOs[i].getBrFreeTypes(), reportQryCondVOs[i], false));
            }
            return busiDataVOs.toArray(new BusiDataVO[0]);
        }
        catch (Exception e) {
            throw ExceptionHandler.handleException((Exception)e);
        }
    }

    public BRSysRecordVO[] getShowTypes() {
        BRSysRecordVO[] showTyeps = new BRSysRecordVO[]{new BRSysRecordVO(), new BRSysRecordVO()};
        showTyeps[0].setRefModelName(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006rec_0", "02006rec-0046"));
        showTyeps[1].setRefModelName(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006rec_0", "02006rec-0047"));
        showTyeps[0].setPk_sysRecord("720dcc7c-ff19-48f4-b9c5-b90906682f45");
        showTyeps[1].setPk_sysRecord("e4f48eaf-5567-4383-a370-a59cb3e8a451");
        showTyeps[0].setDisName(NCLangRes4VoTransl.getNCLangRes().getStrByID("common", "UC000-0000275"));
        showTyeps[1].setDisName(NCLangRes4VoTransl.getNCLangRes().getStrByID("common", "UC000-0001589"));
        return showTyeps;
    }

    private List<BusiDataVO> convertTo(DataSet balance, ReportQueryCondVO condVO, String[] freetype, GlBRParamVOConverter.ReportQueryCondVOGL reportQueryCondVOGL, boolean issum) {
        if (balance.isEmpty()) {
            return new ArrayList<BusiDataVO>();
        }
        String pk_brsetting = reportQueryCondVOGL.getPk_brsetting();
        boolean isStateByori = reportQueryCondVOGL.isStateByori();
        int length = balance.getDatas()[0].length;
        ArrayList<BusiDataVO> retojbs = new ArrayList<BusiDataVO>(length);
        BusiDataVO reconnvo = null;
        if (issum) {
            boolean iscurrnvl = false;
            boolean isorgnvl = false;
            boolean isobjnvl = true;
            boolean ismutiorg = true;
            ismutiorg = condVO.getPk_orgs().length > 1;
            for (DataRow dataRow : balance) {
                isobjnvl = true;
                Object data = dataRow.getData(RN);
                if (new BigDecimal(data.toString()).compareTo(new BigDecimal(1000000)) < 0) continue;
                iscurrnvl = dataRow.getData("pk_currtype") == null;
                isorgnvl = dataRow.getData("pk_org") == null;
                for (int i = 0; i < condVO.getQryObjs().size(); ++i) {
                    if (dataRow.getData("qryobj" + i + "pk") == null) continue;
                    isobjnvl = false;
                    break;
                }
                if (isStateByori) {
                    if (this.isOpenUpBusiUnit) {
                        if (isorgnvl || iscurrnvl || !isobjnvl) continue;
                        reconnvo = this.convertTo(freetype, pk_brsetting, dataRow);
                        retojbs.add(reconnvo);
                        continue;
                    }
                    if ((ismutiorg || isorgnvl) && (!ismutiorg || !isorgnvl) || iscurrnvl || !isobjnvl) continue;
                    reconnvo = this.convertTo(freetype, pk_brsetting, dataRow);
                    reconnvo.setPk_units(null);
                    retojbs.add(reconnvo);
                    continue;
                }
                if (this.isOpenUpBusiUnit) {
                    if (isorgnvl || !iscurrnvl || !isobjnvl) continue;
                    reconnvo = this.convertTo(freetype, pk_brsetting, dataRow);
                    retojbs.add(reconnvo);
                    continue;
                }
                if ((ismutiorg || isorgnvl) && (!ismutiorg || !isorgnvl) || !iscurrnvl || !isobjnvl) continue;
                reconnvo = this.convertTo(freetype, pk_brsetting, dataRow);
                reconnvo.setPk_units(null);
                retojbs.add(reconnvo);
            }
        } else {
            for (DataRow dataRow : balance) {
                Object data = dataRow.getData(RN);
                if (new BigDecimal(data.toString()).compareTo(new BigDecimal(1000000)) >= 0) continue;
                reconnvo = this.convertTo(freetype, pk_brsetting, dataRow);
                retojbs.add(reconnvo);
            }
        }
        return retojbs;
    }

    private BusiDataVO convertTo(String[] freetype, String pk_brsetting, DataRow dataRow) {
        HashMap<String, Integer> freeMap = new HashMap<String, Integer>();
        BusiDataVO reconnvo = new BusiDataVO();
        if (!ArrayUtils.isEmpty((Object[])freetype)) {
            int incr = 0;
            for (String free : freetype) {
                if (freeMap.get(free) != null) continue;
                freeMap.put(free, incr++);
            }
            for (int i = 0; i < freetype.length && i < 10; ++i) {
                try {
                    int j = i + 1;
                    BeanHelper.setProperty((Object)reconnvo, (String)("freetype" + j), (Object)freetype[i]);
                    String field = null;
                    field = (Integer)freeMap.get(freetype[i]) != i ? "qryobj" + freeMap.get(freetype[i]) + "pk" : "qryobj" + i + "pk";
                    Object data = dataRow.getData(field);
                    BeanHelper.setProperty((Object)reconnvo, (String)("freevalue" + j), (Object)(data == null ? "~" : data));
                    continue;
                }
                catch (Exception e) {
                    ExceptionHandler.consume((Throwable)e);
                }
            }
        }
        reconnvo.setEndlocalamount(new UFDouble(dataRow.getData("bal_loc").toString()));
        reconnvo.setEndamount(new UFDouble(dataRow.getData("bal_ori").toString()));
        reconnvo.setEndquantity(new UFDouble(dataRow.getData("bal_qua").toString()));
        reconnvo.setDebitocrlocalamount(new UFDouble(dataRow.getData("debt_loc").toString()));
        reconnvo.setDebitocramount(new UFDouble(dataRow.getData("debt_ori").toString()));
        reconnvo.setDebitocrquantity(new UFDouble(dataRow.getData("debt_qua").toString()));
        reconnvo.setCreditocrlocalamount(new UFDouble(dataRow.getData("credit_loc").toString()));
        reconnvo.setCreditocramount(new UFDouble(dataRow.getData("credit_ori").toString()));
        reconnvo.setCreditocrquantity(new UFDouble(dataRow.getData("credit_qua").toString()));
        reconnvo.setInitlocalamount(new UFDouble(dataRow.getData("init_loc").toString()));
        reconnvo.setInitamount(new UFDouble(dataRow.getData("init_ori").toString()));
        reconnvo.setInitquantity(new UFDouble(dataRow.getData("init_qua").toString()));
        reconnvo.setPk_currtype(dataRow.getData("pk_currtype") == null ? null : dataRow.getData("pk_currtype").toString());
        reconnvo.setPk_units(dataRow.getData("pk_org") == null ? null : dataRow.getData("pk_org").toString());
        reconnvo.setPk_brsetting(pk_brsetting);
        return reconnvo;
    }

    public BusiBillVO[] getBrBillVO(BusiReconQryVO queryVO) throws BusinessException {
        GlBRParamVOConverter.ReportQueryCondVOGL[] reportQryCondVOs = new GlBRParamVOConverter().glParamVOConvert(queryVO);
        ArrayList<BusiBillVO> busiBillVOs = new ArrayList<BusiBillVO>();
        IDetailBO service = (IDetailBO)NCLocator.getInstance().lookup(IDetailBO.class);
        try {
            for (int i = 0; i < reportQryCondVOs.length; ++i) {
                if (null == reportQryCondVOs[i]) continue;
                ReportQueryCondVO condVO = reportQryCondVOs[i].getReportQueryCondVO();
                condVO.setQryMode("forGLDetail");
                DataSet detail = service.query(condVO, new SmartContext());
                busiBillVOs.addAll(this.convertTo2(detail, queryVO.getBrsystem()));
            }
        }
        catch (BusinessException e) {
            throw ExceptionHandler.handleException((Exception)((Object)e));
        }
        return busiBillVOs.toArray(new BusiBillVO[0]);
    }

    private List<BusiBillVO> convertTo2(DataSet detail, String brsystem) throws BusinessException {
        if (detail.isEmpty()) {
            return new ArrayList<BusiBillVO>();
        }
        ArrayList<BusiBillVO> retojbs = new ArrayList<BusiBillVO>();
        BusiBillVO reconnvo = null;
        for (DataRow dataRow : detail) {
            reconnvo = this.convertTo2(dataRow, brsystem);
            if (reconnvo == null) continue;
            retojbs.add(reconnvo);
        }
        return retojbs;
    }

    private BusiBillVO convertTo2(DataRow dataRow, String brsystem) throws BusinessException {
        String pk_bill;
        BusiBillVO busiBillVO = new BusiBillVO();
        String string = pk_bill = dataRow.getData("pk_bill") == null ? null : dataRow.getData("pk_bill").toString();
        if (pk_bill == null) {
            return null;
        }
        busiBillVO.setSrc_relationid(pk_bill);
        String pk_billreal = dataRow.getData("pk_tradetypeid") == null ? null : dataRow.getData("pk_tradetypeid").toString();
        busiBillVO.setPk_bill(pk_billreal);
        busiBillVO.setOrgName(dataRow.getData("pk_org") == null ? null : (dataRow.getData("org") == null ? dataRow.getData("code_org").toString() : dataRow.getData("org").toString()));
        String pk_billtype = (String)dataRow.getData("pk_billtype");
        busiBillVO.setBillType(pk_billtype);
        busiBillVO.setBillTypeName(dataRow.getData("billtype") == null ? pk_billtype.toString() : dataRow.getData("billtype").toString());
        busiBillVO.setBillNo(dataRow.getData("billno") == null ? null : dataRow.getData("billno").toString());
        busiBillVO.setPk_currtype(dataRow.getData("pk_currtype") == null ? null : dataRow.getData("pk_currtype").toString());
        busiBillVO.setBillDate(dataRow.getData("tallydate") == null ? null : dataRow.getData("tallydate").toString());
        busiBillVO.setSummary(dataRow.getData("brief") == null ? null : dataRow.getData("brief").toString());
        if ("AR".equals(brsystem)) {
            UFDouble quantity = new UFDouble((BigDecimal)dataRow.getData("debt_qua")).sub(new UFDouble((BigDecimal)dataRow.getData("credit_qua")));
            busiBillVO.setQuantity(quantity);
            UFDouble money_ori = new UFDouble((BigDecimal)dataRow.getData("debt_ori")).sub(new UFDouble((BigDecimal)dataRow.getData("credit_ori")));
            busiBillVO.setAmount(money_ori);
            UFDouble money_loc = new UFDouble((BigDecimal)dataRow.getData("debt_loc")).sub(new UFDouble((BigDecimal)dataRow.getData("credit_loc")));
            busiBillVO.setLocalAmount(money_loc);
        } else if ("AP".equals(brsystem)) {
            UFDouble quantity = new UFDouble((BigDecimal)dataRow.getData("credit_qua")).sub(new UFDouble((BigDecimal)dataRow.getData("debt_qua")));
            busiBillVO.setQuantity(quantity);
            UFDouble money_ori = new UFDouble((BigDecimal)dataRow.getData("credit_ori")).sub(new UFDouble((BigDecimal)dataRow.getData("debt_ori")));
            busiBillVO.setAmount(money_ori);
            UFDouble money_loc = new UFDouble((BigDecimal)dataRow.getData("credit_loc")).sub(new UFDouble((BigDecimal)dataRow.getData("debt_loc")));
            busiBillVO.setLocalAmount(money_loc);
        }
        return busiBillVO;
    }
}

