/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.actions.BillDeleteBatchBSAction
 *  nc.bs.arap.bill.ArapBillCalUtil
 *  nc.bs.arap.bill.ArapBillPubUtil
 *  nc.bs.arap.util.ArapBillVOUtils
 *  nc.bs.arap.util.BillMoneyVUtils
 *  nc.bs.arap.util.SqlUtils
 *  nc.bs.bd.util.DBAUtil
 *  nc.bs.dao.BaseDAO
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.pf.pub.PfDataCache
 *  nc.bs.pub.pf.PfUtilTools
 *  nc.impl.pubapp.pattern.data.bill.BillOperator
 *  nc.itf.arap.bill.IArapBillQueryBaseService
 *  nc.itf.arap.billconfer.IBConferMapQryService
 *  nc.itf.arap.billconfer.IBConferMapService
 *  nc.itf.arap.billconfer.IBillConferQueryService
 *  nc.itf.fi.pub.Currency
 *  nc.itf.fi.pub.SysInit
 *  nc.itf.imag.lightbus.IImagPubService
 *  nc.pubitf.arap.bill.IArapBillPubQueryService
 *  nc.pubitf.org.IOrgUnitPubService
 *  nc.pubitf.para.SysInitQuery
 *  nc.vo.arap.basebill.BaseAggVO
 *  nc.vo.arap.basebill.BaseBillVO
 *  nc.vo.arap.basebill.BaseItemVO
 *  nc.vo.arap.billconfer.BCMiddleVO
 *  nc.vo.arap.billconfer.BCParamVO
 *  nc.vo.arap.billconfer.BcMapVO
 *  nc.vo.arap.pub.ArapBillTypeInfo
 *  nc.vo.arap.pub.BillEnumCollection$BillCooperate
 *  nc.vo.arap.pub.BillEnumCollection$BillSatus
 *  nc.vo.arap.pub.BillEnumCollection$FromSystem
 *  nc.vo.arap.pub.BillEnumCollection$ObjType
 *  nc.vo.arap.pub.IArapBilltypeInfo
 *  nc.vo.arap.pub.RateTypeInfoVO
 *  nc.vo.arap.sysinit.SysinitConst
 *  nc.vo.arap.utils.ARAPModuleEnableUtil
 *  nc.vo.arap.utils.StringUtil
 *  nc.vo.bd.rate.util.RateReturnObject
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BeanHelper
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.BusinessRuntimeException
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.billtype.BilltypeVO
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pub.lang.UFDouble
 *  nc.vo.pub.lang.UFLiteralDate
 *  nc.vo.pubapp.pattern.exception.CarrierRuntimeException
 *  nc.vo.pubapp.pattern.model.entity.bill.IBill
 *  nccloud.commons.lang.ArrayUtils
 *  nccloud.commons.lang.StringUtils
 *  nccloud.pubitf.arap.arappub.IArapRatePubService
 *  org.apache.commons.collections4.CollectionUtils
 */
package nc.bs.arap.busireg;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import nc.bs.arap.actions.BillDeleteBatchBSAction;
import nc.bs.arap.bill.ArapBillCalUtil;
import nc.bs.arap.bill.ArapBillPubUtil;
import nc.bs.arap.util.ArapBillVOUtils;
import nc.bs.arap.util.BillMoneyVUtils;
import nc.bs.arap.util.SqlUtils;
import nc.bs.bd.util.DBAUtil;
import nc.bs.dao.BaseDAO;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.framework.common.NCLocator;
import nc.bs.pf.pub.PfDataCache;
import nc.bs.pub.pf.PfUtilTools;
import nc.impl.pubapp.pattern.data.bill.BillOperator;
import nc.itf.arap.bill.IArapBillQueryBaseService;
import nc.itf.arap.billconfer.IBConferMapQryService;
import nc.itf.arap.billconfer.IBConferMapService;
import nc.itf.arap.billconfer.IBillConferQueryService;
import nc.itf.fi.pub.Currency;
import nc.itf.fi.pub.SysInit;
import nc.itf.imag.lightbus.IImagPubService;
import nc.pubitf.arap.bill.IArapBillPubQueryService;
import nc.pubitf.org.IOrgUnitPubService;
import nc.pubitf.para.SysInitQuery;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.arap.billconfer.BCMiddleVO;
import nc.vo.arap.billconfer.BCParamVO;
import nc.vo.arap.billconfer.BcMapVO;
import nc.vo.arap.pub.ArapBillTypeInfo;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.arap.pub.IArapBilltypeInfo;
import nc.vo.arap.pub.RateTypeInfoVO;
import nc.vo.arap.sysinit.SysinitConst;
import nc.vo.arap.utils.ARAPModuleEnableUtil;
import nc.vo.arap.utils.StringUtil;
import nc.vo.bd.rate.util.RateReturnObject;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BeanHelper;
import nc.vo.pub.BusinessException;
import nc.vo.pub.BusinessRuntimeException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.billtype.BilltypeVO;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pub.lang.UFLiteralDate;
import nc.vo.pubapp.pattern.exception.CarrierRuntimeException;
import nc.vo.pubapp.pattern.model.entity.bill.IBill;
import nccloud.commons.lang.ArrayUtils;
import nccloud.commons.lang.StringUtils;
import nccloud.pubitf.arap.arappub.IArapRatePubService;
import org.apache.commons.collections4.CollectionUtils;

public final class BConferUtils {
    private static final String ARAPCONFERNUMFLAG = "ARAP_";

    private static String getCoordContent(BaseBillVO headVO) throws BusinessException {
        return SysInitQuery.getParaString((String)headVO.getPk_org(), (String)(headVO.getSyscode().intValue() == BillEnumCollection.FromSystem.AR.VALUE.intValue() ? "AR16" : "AP16"));
    }

    public static boolean canSave(BaseAggVO bill, boolean isdelete) throws BusinessException {
        BaseBillVO headVO = (BaseBillVO)bill.getParentVO();
        boolean equals = "2".equals(BConferUtils.getCoordContent(headVO));
        equals = BConferUtils.isAlsoGenrat(bill, equals, isdelete);
        return equals;
    }

    public static boolean canDelete(BaseBillVO headVO) throws BusinessException {
        boolean coordflag = headVO.getCoordflag() != null ? headVO.getCoordflag().equals(1) : false;
        boolean billstatus = BillEnumCollection.BillSatus.SAVE.VALUE.equals(headVO.getBillstatus()) || BillEnumCollection.BillSatus.TEMPEORARY.VALUE.equals(headVO.getBillstatus()) || BillEnumCollection.BillSatus.UNCOMFIRM.VALUE.equals(headVO.getBillstatus());
        return coordflag && billstatus;
    }

    private static boolean isAlsoGenrat(BaseAggVO bill, boolean equals, boolean isdelete) throws BusinessException {
        BaseItemVO[] items = bill.getItems();
        if (isdelete) {
            BaseBillVO headVO = (BaseBillVO)bill.getParentVO();
            return equals && (null == headVO.getCoordflag() || headVO.getCoordflag().intValue() == BillEnumCollection.BillCooperate.NOSUER.VALUE.intValue());
        }
        return equals && items != null && items.length != 0 && StringUtil.isEmpty((String)items[0].getConfernum());
    }

    public static boolean canEffect(BaseAggVO bill, boolean isdelete) throws BusinessException {
        BaseBillVO headVO = (BaseBillVO)bill.getParentVO();
        boolean equals = "3".equals(BConferUtils.getCoordContent(headVO));
        equals = BConferUtils.isAlsoGenrat(bill, equals, isdelete);
        return equals;
    }

    private static boolean isAlsoGenrat(BaseBillVO headVO) throws BusinessException {
        return false;
    }

    public static boolean isCoorBill(BaseBillVO headVO) {
        return headVO.getSrc_syscode().intValue() == BillEnumCollection.FromSystem.XTDJ.VALUE.intValue();
    }

    public static boolean canRedoCoord(BaseBillVO headVO) throws BusinessException {
        return SysInitQuery.getParaBoolean((String)headVO.getPk_org(), (String)(headVO.getSyscode().intValue() == BillEnumCollection.FromSystem.AR.VALUE.intValue() ? "AR16" : "AP16")).booleanValue();
    }

    public static String[] getCusSups(BaseAggVO[] bills) {
        ArrayList<String> cusSup = new ArrayList<String>();
        for (BaseAggVO bill : bills) {
            BaseBillVO headVO = bill.getHeadVO();
            if (BillEnumCollection.ObjType.CUSTOMER.VALUE == headVO.getObjtype()) {
                cusSup.add(headVO.getCustomer());
                continue;
            }
            if (BillEnumCollection.ObjType.SUPPLIER.VALUE != headVO.getObjtype()) continue;
            cusSup.add(headVO.getSupplier());
        }
        return cusSup.toArray(new String[0]);
    }

    public void save(BaseAggVO srcbill) throws BusinessException {
        this.save(srcbill, false, null);
    }

    public void save(BaseAggVO srcbill, boolean isupdate, Map<String, Map<Integer, String>> parm) throws BusinessException {
        if (srcbill == null || srcbill.getHeadVO() == null || ArrayUtils.isEmpty((Object[])srcbill.getItems())) {
            return;
        }
        if (BConferUtils.isCoorBill(srcbill.getHeadVO()) && !BConferUtils.isAlsoGenrat(srcbill.getHeadVO())) {
            return;
        }
        if (this.isExsistBillType(srcbill)) {
            return;
        }
        if (this.hasConferNum(srcbill, isupdate)) {
            return;
        }
        if (this.isFromOtherSystem(srcbill)) {
            return;
        }
        IBillConferQueryService qryservice = (IBillConferQueryService)NCLocator.getInstance().lookup(IBillConferQueryService.class);
        Object[] confers = qryservice.queryVOByBothTrade(srcbill.getHeadVO().getPk_tradetype(), srcbill.getHeadVO().getPk_group());
        if (ArrayUtils.isEmpty((Object[])confers)) {
            return;
        }
        BaseAggVO conferBill = this.getConferVO(srcbill);
        if (conferBill == null) {
            return;
        }
        Object[] destVOs = this.generateItemVO(conferBill, conferBill.getItems());
        ArapBillVOUtils.setDefaultSagaFrozen((AggregatedValueObject[])destVOs);
        if (ArrayUtils.isEmpty((Object[])destVOs)) {
            return;
        }
        if (BConferUtils.isCoorBill(srcbill.getHeadVO())) {
            BaseItemVO[] items = srcbill.getItems();
            String topBillid = items[0].getTop_billid();
            String topBilltype = items[0].getTop_billtype();
            BaseAggVO[] vos = ((IArapBillQueryBaseService)NCLocator.getInstance().lookup(ArapBillTypeInfo.getInstance((Object)topBilltype).getBillQueryService())).findBillByPrimaryKey(new String[]{topBillid});
            if (vos != null && vos.length != 0 && vos[0].getHeadVO().getPk_org().equals(destVOs[0].getHeadVO().getPk_org())) {
                return;
            }
        }
        this.befInstVal((AggregatedValueObject[])destVOs);
        if (isupdate) {
            this.consistencyPks((BaseAggVO[])destVOs, isupdate, parm);
        }
        this.consistencyBills((BaseAggVO[])destVOs, srcbill);
        this.save((AggregatedValueObject[])destVOs);
        this.saveBcMap((AggregatedValueObject[])destVOs, srcbill.getHeadVO().getPk_billtype(), srcbill.getHeadVO().getPrimaryKey());
    }

    private void consistencyPks(BaseAggVO[] destVOs, boolean isEditSave, Map<String, Map<Integer, String>> parm) throws BusinessException {
        if (parm.isEmpty()) {
            return;
        }
        ArrayList<String> list = new ArrayList<String>();
        Map<Object, Object> map = new HashMap();
        for (Map.Entry<String, Map<Integer, String>> p : parm.entrySet()) {
            list.add(p.getKey());
            map = p.getValue();
        }
        destVOs[0].getParentVO().setPrimaryKey((String)list.get(0));
        for (BaseItemVO items : destVOs[0].getItems()) {
            items.setPrimaryKey((String)list.get(0));
            if (map.get(items.getRowno()) == null) continue;
            items.setPrimaryKey((String)map.get(items.getRowno()));
        }
    }

    private void consistencyBills(BaseAggVO[] destVOs, BaseAggVO srcbill) throws BusinessException {
        String srcpkcurrtype = (String)srcbill.getParentVO().getAttributeValue("pk_currtype");
        Map<String, Map<String, RateReturnObject>> cuSpMap = this.getCuspValue(destVOs);
        for (BaseAggVO vo : destVOs) {
            Map<String, RateReturnObject> rateVOByCuSp;
            String destorg = vo.getHeadVO().getPk_org();
            UFDate date = vo.getHeadVO().getBilldate();
            String billtype = vo.getHeadVO().getPk_billtype();
            String pkgroup = (String)vo.getParentVO().getAttributeValue("pk_group");
            String destpkcurrtype = Currency.getOrgLocalCurrPK((String)destorg);
            Map<String, RateReturnObject> map = rateVOByCuSp = cuSpMap == null || cuSpMap != null && cuSpMap.size() == 0 ? null : cuSpMap.get(destorg + srcpkcurrtype);
            if (destpkcurrtype != null && !destpkcurrtype.equals(srcpkcurrtype)) {
                ArrayList<String> pk_currtypes = new ArrayList<String>();
                CircularlyAccessibleValueObject[] circularlyAccessibleValueObjectArray = srcbill.getChildrenVO();
                int n = circularlyAccessibleValueObjectArray.length;
                for (int i = 0; i < n; ++i) {
                    CircularlyAccessibleValueObject chilvo = circularlyAccessibleValueObjectArray[i];
                    pk_currtypes.add((String)chilvo.getAttributeValue("pk_currtype"));
                }
                Map rate = ArapBillCalUtil.getRate((String[])pk_currtypes.toArray(new String[0]), (String)destorg, (String)pkgroup, (UFDate)date, (String)billtype);
                this.adapterBillByRate(vo, rate, rateVOByCuSp);
            }
            vo.getParentVO().setAttributeValue("pk_pcorg", null);
            vo.getParentVO().setAttributeValue("pk_pcorg_v", null);
            vo.getParentVO().setAttributeValue("checkelement", null);
            vo.getParentVO().setAttributeValue("pk_psndoc", null);
            vo.getParentVO().setAttributeValue("pk_deptid_v", null);
            for (CircularlyAccessibleValueObject childvo : vo.getChildrenVO()) {
                childvo.setAttributeValue("pk_pcorg", null);
                childvo.setAttributeValue("pk_pcorg_v", null);
                childvo.setAttributeValue("checkelement", null);
            }
        }
    }

    private void adapterBillByRate(BaseAggVO vo, Map<String, UFDouble[]> rates, Map<String, RateReturnObject> rateVOByCuSp) throws BusinessException {
        String pk_group = vo.getHeadVO().getPk_group();
        String org = vo.getHeadVO().getPk_org();
        for (BaseItemVO chil : vo.getItems()) {
            UFDouble[] rate = rates.get(chil.getPk_currtype());
            org = chil.getPk_org();
            if (rate == null) continue;
            if ((rateVOByCuSp != null || rate[0] == null) && rateVOByCuSp != null) {
                RateReturnObject retObj = rateVOByCuSp.get(org + chil.getPk_ratetype());
                String pk_rateType = retObj == null ? null : retObj.getPk_ratetype();
                UFLiteralDate ratedate = retObj == null ? null : retObj.getDate();
                rate[0] = retObj == null ? rate[0] : retObj.getRate();
                chil.setPk_ratetype(pk_rateType);
                chil.setRatedate(ratedate);
            }
            chil.setRate(rate[0]);
            List<String> rateisZero = this.rateisZero(rate, pk_group);
            if (CollectionUtils.isNotEmpty(rateisZero)) {
                throw new BusinessException(String.join((CharSequence)",", rateisZero));
            }
            chil.setGrouprate(rate[1]);
            chil.setGlobalrate(rate[2]);
        }
        if (rateVOByCuSp != null) {
            RateReturnObject key = rateVOByCuSp.get(vo.getItems()[0].getPk_org() + vo.getItems()[0].getPk_ratetype());
            vo.getHeadVO().setPk_ratetype(key == null ? null : key.getPk_ratetype());
            vo.getHeadVO().setRatedate(key == null ? null : key.getDate());
            vo.getHeadVO().setRate(key == null ? UFDouble.ZERO_DBL : key.getRate());
        }
        ArapBillPubUtil.processMoney((AggregatedValueObject)vo);
    }

    private Map<String, Map<String, RateReturnObject>> getCuspValue(BaseAggVO[] destVOs) throws BusinessException {
        UFDate date = destVOs[0].getHeadVO().getBilldate();
        String pk_billtype = destVOs[0].getHeadVO().getPk_billtype();
        String pk_org = destVOs[0].getHeadVO().getPk_org();
        ArrayList<RateTypeInfoVO> rateList = new ArrayList<RateTypeInfoVO>();
        for (BaseAggVO vo : destVOs) {
            for (BaseItemVO chil : vo.getItems()) {
                Integer object = chil.getObjtype();
                String key = null;
                String value = null;
                if (object == 0) {
                    key = "customer";
                    value = chil.getCustomer();
                } else {
                    if (object != 1) continue;
                    key = "supplier";
                    value = chil.getSupplier();
                }
                RateTypeInfoVO ratevo = new RateTypeInfoVO();
                ratevo.setPk_org(pk_org);
                ratevo.setSrc_pk_currtype(chil.getPk_currtype());
                ratevo.setPk_billtype(pk_billtype);
                ratevo.setBilldate(date);
                ratevo.setCustomer(value);
                ratevo.setSupplier(value);
                ratevo.setPk_rateType(chil.getPk_ratetype());
                ratevo.setEditKey(key);
                ratevo.setItemPk(pk_org + chil.getPk_ratetype());
                ratevo.setBillPk(pk_org + chil.getPk_currtype());
                rateList.add(ratevo);
            }
        }
        Map rateVOByCuSpsMap = ((IArapRatePubService)NCLocator.getInstance().lookup(IArapRatePubService.class)).getRateVOByCuSps(rateList);
        return rateVOByCuSpsMap;
    }

    private List<String> rateisZero(UFDouble[] rate, String group) throws BusinessException {
        String NC002 = SysInit.getParaString((String)"GLOBLE00000000000000", (String)"NC002");
        String NC001 = SysInit.getParaString((String)group, (String)"NC001");
        ArrayList<String> error = new ArrayList<String>();
        if (rate[2] == null || UFDouble.ZERO_DBL.compareTo((Object)rate[2]) == 0 && !SysinitConst.NC002_NOT_USED.equals(NC002)) {
            error.add(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0153"));
        } else if (rate[1] == null || UFDouble.ZERO_DBL.compareTo((Object)rate[1]) == 0 && !SysinitConst.NC001_NOT_USED.equals(NC001)) {
            error.add(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0154"));
        } else if (rate[0] == null || UFDouble.ZERO_DBL.compareTo((Object)rate[0]) == 0) {
            error.add(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0155"));
        }
        return error;
    }

    private BaseAggVO getConferVO(BaseAggVO srcbill) {
        BaseItemVO[] items = srcbill.getItems();
        ArrayList<BaseItemVO> conferList = new ArrayList<BaseItemVO>();
        for (BaseItemVO child : items) {
            UFDouble money = (UFDouble)child.getAttributeValue("money_de");
            if (money == null || money.equals((Object)UFDouble.ZERO_DBL)) {
                money = (UFDouble)child.getAttributeValue("money_cr");
            }
            if (money == null || money.equals((Object)UFDouble.ZERO_DBL)) continue;
            conferList.add(child);
        }
        if (conferList.size() == 0) {
            return null;
        }
        BaseAggVO conferBill = (BaseAggVO)srcbill.clone();
        conferBill.setChildrenVO((CircularlyAccessibleValueObject[])conferList.toArray(new BaseItemVO[0]));
        return conferBill;
    }

    private boolean isFromOtherSystem(BaseAggVO srcbill) {
        boolean isOtherSys = false;
        if (srcbill == null || ArrayUtils.isEmpty((Object[])srcbill.getItems())) {
            return isOtherSys;
        }
        String topBilltype = srcbill.getItems()[0].getTop_billtype();
        if (StringUtils.isEmpty((CharSequence)topBilltype)) {
            return isOtherSys;
        }
        if (topBilltype.equalsIgnoreCase("36J3") || topBilltype.equalsIgnoreCase("5F") || topBilltype.startsWith("264")) {
            isOtherSys = true;
        }
        return isOtherSys;
    }

    private boolean hasConferNum(BaseAggVO srcbill, boolean isupdate) {
        for (BaseItemVO item : srcbill.getItems()) {
            if (!StringUtils.isNotEmpty((CharSequence)item.getConfernum())) continue;
            if (!item.getConfernum().startsWith(ARAPCONFERNUMFLAG)) {
                return true;
            }
            if (isupdate) continue;
            return true;
        }
        return false;
    }

    private boolean isExsistBillType(BaseAggVO srcbill) {
        BaseBillVO billvo = srcbill.getHeadVO();
        BaseItemVO[] itemvos = (BaseItemVO[])srcbill.getChildrenVO();
        Integer objtype = itemvos[0].getObjtype();
        String pk_billtype = billvo.getPk_billtype();
        if ("F0".equals(pk_billtype) && objtype == 1) {
            return true;
        }
        if ("F2".equals(pk_billtype) && objtype == 1) {
            return true;
        }
        if ("F1".equals(pk_billtype) && objtype == 0) {
            return true;
        }
        return "F3".equals(pk_billtype) && objtype == 0;
    }

    private void saveBcMap(AggregatedValueObject[] destVOs, String pk_billtype, String headPK) throws BusinessException {
        for (AggregatedValueObject destVO : destVOs) {
            BcMapVO bcMapVO = new BcMapVO();
            BaseAggVO baseAggVO = (BaseAggVO)destVO;
            bcMapVO.setSrc_billtype(pk_billtype);
            bcMapVO.setSrc_billid(headPK);
            bcMapVO.setDest_billtype(baseAggVO.getItems()[0].getPk_billtype());
            bcMapVO.setDest_billid(baseAggVO.getHeadVO().getPrimaryKey());
            bcMapVO.setReceiver(baseAggVO.getConferReceiver());
            bcMapVO.setMessage(baseAggVO.getConferMessageInfo());
            bcMapVO.setDest_org(baseAggVO.getHeadVO().getPk_org());
            ((IBConferMapService)NCLocator.getInstance().lookup(IBConferMapService.class)).insertBcMapVO(bcMapVO);
        }
    }

    private void save(AggregatedValueObject[] destVOs) throws BusinessException {
        new BillOperator().insert((IBill[])((BaseAggVO[])destVOs));
    }

    private void befInstVal(AggregatedValueObject[] destVOs) {
        for (AggregatedValueObject vo : destVOs) {
            BaseAggVO bill = (BaseAggVO)vo;
            bill.getHeadVO().setCoordflag(BillEnumCollection.BillCooperate.NOSUER.VALUE);
            bill.getHeadVO().setBillstatus(BillEnumCollection.BillSatus.UNCOMFIRM.VALUE);
            bill.getHeadVO().setSrc_syscode(BillEnumCollection.FromSystem.XTDJ.VALUE);
            UFDate billdate = bill.getHeadVO().getBilldate();
            if (billdate == null) {
                billdate = new UFDate();
                bill.getHeadVO().setBusidate(billdate);
                bill.getHeadVO().setBilldate(billdate);
            } else {
                bill.getHeadVO().setBusidate(billdate);
            }
            if (bill.getHeadVO().getBillperiod() != null && bill.getHeadVO().getBillperiod().length() == 10) {
                bill.getHeadVO().setBillperiod(bill.getHeadVO().getBillperiod().substring(5, 7));
            }
            for (BaseItemVO bvo : bill.getItems()) {
                bvo.setCoordflag(Integer.valueOf(1));
                if (billdate == null) {
                    billdate = new UFDate();
                    bvo.setBusidate(billdate);
                    bvo.setBilldate(billdate);
                } else {
                    bvo.setBusidate(billdate);
                }
                bvo.setPk_deptid(null);
                bvo.setPk_deptid_v(null);
                bvo.setPk_psndoc(null);
            }
            ArapBillPubUtil.processMoney((AggregatedValueObject)vo);
        }
    }

    /*
     * WARNING - void declaration
     */
    private BaseAggVO[] generateItemVO(BaseAggVO srcbill, BaseItemVO[] items) throws BusinessException {
        void var14_22;
        Field[] declaredFields;
        HashSet<String> customers = new HashSet<String>();
        HashSet<String> suppliers = new HashSet<String>();
        HashMap<String, String[]> accountMap = new HashMap<String, String[]>();
        HashMap<String, UFDouble> moneyMap = new HashMap<String, UFDouble>();
        IBillConferQueryService qryservice = (IBillConferQueryService)NCLocator.getInstance().lookup(IBillConferQueryService.class);
        String orgname = null;
        HashMap<String, Object> map = new HashMap<String, Object>();
        HashMap<String, String> cusupMItemPk = new HashMap<String, String>();
        for (BaseItemVO baseItemVO : items) {
            String key;
            BCParamVO paramVO = new BCParamVO();
            paramVO.setBusitype(srcbill.getHeadVO().getPk_busitype());
            paramVO.setSrcorg(baseItemVO.getPk_org());
            paramVO.setSrcTradetype(baseItemVO.getPk_tradetype());
            accountMap.put(baseItemVO.getPrimaryKey(), new String[]{baseItemVO.getPayaccount(), baseItemVO.getRecaccount()});
            moneyMap.put(baseItemVO.getPrimaryKey(), baseItemVO.getMoney_cr() == null || baseItemVO.getMoney_cr().compareTo((Object)UFDouble.ZERO_DBL) == 0 ? baseItemVO.getMoney_de() : baseItemVO.getMoney_cr());
            if (BillEnumCollection.ObjType.CUSTOMER.VALUE.equals(baseItemVO.getObjtype())) {
                paramVO.setObjType(BillEnumCollection.ObjType.SUPPLIER);
                if (!customers.contains(baseItemVO.getCustomer())) {
                    customers.add(baseItemVO.getCustomer());
                    cusupMItemPk.put(baseItemVO.getCustomer(), baseItemVO.getPrimaryKey());
                    paramVO.setSrcCustsup(baseItemVO.getCustomer());
                    map.put(baseItemVO.getPrimaryKey(), qryservice.queryBillConfer(paramVO));
                    continue;
                }
                key = (String)cusupMItemPk.get(baseItemVO.getCustomer());
                map.put(baseItemVO.getPrimaryKey(), map.get(key));
                continue;
            }
            if (!BillEnumCollection.ObjType.SUPPLIER.VALUE.equals(baseItemVO.getObjtype())) continue;
            paramVO.setObjType(BillEnumCollection.ObjType.CUSTOMER);
            if (!suppliers.contains(baseItemVO.getSupplier())) {
                suppliers.add(baseItemVO.getSupplier());
                cusupMItemPk.put(baseItemVO.getSupplier(), baseItemVO.getPrimaryKey());
                paramVO.setSrcCustsup(baseItemVO.getSupplier());
                map.put(baseItemVO.getPrimaryKey(), qryservice.queryBillConfer(paramVO));
                continue;
            }
            key = (String)cusupMItemPk.get(baseItemVO.getSupplier());
            map.put(baseItemVO.getPrimaryKey(), map.get(key));
        }
        HashMap<String, BaseAggVO> voMap = new HashMap<String, BaseAggVO>();
        HashMap<String, Object> billValMap = new HashMap<String, Object>();
        for (Field field : declaredFields = srcbill.getClass().getDeclaredFields()) {
            billValMap.put(field.getName(), BeanHelper.getProperty((Object)srcbill, (String)field.getName()));
        }
        BaseAggVO[] baseAggVOArray = new BaseAggVO[]{};
        HashSet<String> sqls = new HashSet<String>();
        if (map.size() > 0) {
            BaseAggVO[] baseAggVOArray2;
            String targetbill = map.values().toArray(new BCMiddleVO[0])[0].getTargetbill();
            BaseAggVO[] baseAggVOArray3 = new BaseAggVO[items.length];
            for (int i = 0; i < items.length; ++i) {
                String[] headClearFields;
                BCMiddleVO bcMiddleVO = (BCMiddleVO)map.get(items[i].getPrimaryKey());
                if (null == bcMiddleVO) continue;
                targetbill = bcMiddleVO.getTargetbill();
                String targetorg = bcMiddleVO.getTargetorg();
                if (StringUtils.isEmpty((CharSequence)targetbill) || StringUtils.isEmpty((CharSequence)targetorg)) continue;
                try {
                    BaseAggVO newInstance = (BaseAggVO)srcbill.getClass().newInstance();
                    newInstance.setParentVO((CircularlyAccessibleValueObject)srcbill.getParentVO().clone());
                    for (Map.Entry entry : billValMap.entrySet()) {
                        BeanHelper.setProperty((Object)newInstance, (String)((String)entry.getKey()), billValMap.get(entry.getKey()));
                    }
                    newInstance.setChildrenVO((CircularlyAccessibleValueObject[])new BaseItemVO[]{(BaseItemVO)items[i].clone()});
                    baseAggVOArray3[i] = newInstance;
                }
                catch (Exception e) {
                    ExceptionHandler.handleException((Exception)e);
                }
                for (int j = 0; j < baseAggVOArray3[i].getChildrenVO().length; ++j) {
                    CircularlyAccessibleValueObject childrenVO = baseAggVOArray3[i].getChildrenVO()[j];
                    childrenVO.setAttributeValue("occupationmny", moneyMap.get(items[i].getPrimaryKey()));
                }
                String src_tradetype = items[i].getPk_tradetype();
                baseAggVOArray3[i] = (BaseAggVO)PfUtilTools.runChangeData((String)(src_tradetype == null ? items[i].getPk_billtype() : src_tradetype), (String)targetbill, (AggregatedValueObject)baseAggVOArray3[i]);
                String pk_billtype = (String)baseAggVOArray3[i].getParentVO().getAttributeValue("pk_billtype");
                if (pk_billtype.equals("F0") || pk_billtype.equals("F2")) {
                    baseAggVOArray3[i].getParentVO().setAttributeValue("customer", (Object)bcMiddleVO.getCustsup());
                    baseAggVOArray3[i].getParentVO().setAttributeValue("ordercubasdoc", (Object)bcMiddleVO.getCustsup());
                    baseAggVOArray3[i].getParentVO().setAttributeValue("supplier", null);
                } else {
                    baseAggVOArray3[i].getParentVO().setAttributeValue("supplier", (Object)bcMiddleVO.getCustsup());
                    baseAggVOArray3[i].getParentVO().setAttributeValue("customer", null);
                }
                baseAggVOArray3[i].getParentVO().setAttributeValue("pk_org", (Object)targetorg);
                baseAggVOArray3[i].getParentVO().setAttributeValue("sett_org", (Object)targetorg);
                for (String clear : headClearFields = new String[]{"pk_busitype", "pk_org_v", "sett_org_v", "pk_pcorg", "pk_pcorg_v", "checkelement"}) {
                    baseAggVOArray3[i].getParentVO().setAttributeValue(clear, null);
                }
                String[] bodyClearFields = new String[]{"pk_deptid_v", "pk_deptid", "pk_pcorg", "checkelement", "pk_psndoc"};
                for (CircularlyAccessibleValueObject item : baseAggVOArray3[i].getChildrenVO()) {
                    item.setAttributeValue("pk_org", (Object)targetorg);
                    item.setAttributeValue("sett_org", (Object)targetorg);
                    String[] accounts = (String[])accountMap.get(item.getAttributeValue("top_itemid"));
                    if (accounts != null && accounts.length > 0) {
                        String payaccount = accounts[0] == null ? null : accounts[0];
                        String[] recaccount = accounts[1] == null ? null : accounts[1];
                        item.setAttributeValue("payaccount", (Object)payaccount);
                        item.setAttributeValue("recaccount", (Object)recaccount);
                    }
                    UFDouble money = (UFDouble)moneyMap.get(item.getAttributeValue("top_itemid"));
                    if (pk_billtype.equals("F0") || pk_billtype.equals("F3")) {
                        item.setAttributeValue("money_de", (Object)money);
                        item.setAttributeValue("money_bal", (Object)money);
                    } else {
                        item.setAttributeValue("money_cr", (Object)money);
                        item.setAttributeValue("money_bal", (Object)money);
                    }
                    if (pk_billtype.equals("F0") || pk_billtype.equals("F2")) {
                        item.setAttributeValue("customer", (Object)bcMiddleVO.getCustsup());
                        item.setAttributeValue("ordercubasdoc", (Object)bcMiddleVO.getCustsup());
                        item.setAttributeValue("supplier", null);
                    } else {
                        item.setAttributeValue("customer", null);
                        item.setAttributeValue("supplier", (Object)bcMiddleVO.getCustsup());
                    }
                    item.setAttributeValue("objtype", (Object)bcMiddleVO.getObjtype());
                    for (String clear : bodyClearFields) {
                        item.setAttributeValue(clear, null);
                    }
                    if (StringUtils.isNotEmpty((CharSequence)bcMiddleVO.getReceiver())) {
                        baseAggVOArray3[i].setConferReceiver(bcMiddleVO.getReceiver());
                    }
                    if (voMap.containsKey(targetorg)) {
                        BaseAggVO baseAggVO = (BaseAggVO)voMap.get(targetorg);
                        BaseItemVO[] childrenVO = (BaseItemVO[])baseAggVO.getChildrenVO();
                        BaseItemVO[] childrenVO2 = new BaseItemVO[childrenVO.length + 1];
                        for (int j = 0; j < childrenVO2.length; ++j) {
                            childrenVO2[j] = j == childrenVO2.length - 1 ? (BaseItemVO)item : childrenVO[j];
                        }
                        baseAggVOArray3[i].setChildrenVO((CircularlyAccessibleValueObject[])childrenVO2);
                        voMap.put(targetorg, baseAggVOArray3[i]);
                    } else {
                        voMap.put(targetorg, baseAggVOArray3[i]);
                    }
                    String billconfernum = ARAPCONFERNUMFLAG + targetorg + "_" + items[i].getBillno();
                    ((BaseItemVO)item).setConfernum(billconfernum);
                    sqls.add(this.buildConferNumSql((BaseItemVO)item, srcbill.getItems()[0], true));
                }
            }
            BaseAggVO[] baseAggVOArray4 = new BaseAggVO[voMap.values().size()];
            for (BaseAggVO sbill : baseAggVOArray2 = voMap.values().toArray(baseAggVOArray4)) {
                BillMoneyVUtils.sumBodyToHead((BaseBillVO)sbill.getHeadVO(), (BaseItemVO[])sbill.getItems());
                if (orgname == null) {
                    orgname = ((IOrgUnitPubService)NCLocator.getInstance().lookup(IOrgUnitPubService.class)).getOrgs(new String[]{srcbill.getHeadVO().getPk_org()}, new String[]{"pk_org", "name"})[0].getName();
                }
                if (!StringUtils.isNotEmpty((CharSequence)sbill.getConferReceiver())) continue;
                String scomment = ((BaseItemVO)sbill.getChildrenVO()[0]).getScomment();
                sbill.setConferMessageInfo(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0316_0", "02006arappub0316-0011", null, new String[]{orgname, sbill.getHeadVO().getMoney().setScale(4, 4).toString(), scomment}));
            }
        }
        this.conferBillBillDateValidate((BaseAggVO[])var14_22);
        ArapBillVOUtils.prepareDefaultInfo((AggregatedValueObject[])var14_22);
        if (sqls.size() > 0) {
            DBAUtil.execBatchSql((String[])sqls.toArray(new String[0]));
        }
        ArapBillPubUtil.resetDestVODoc((AggregatedValueObject[])var14_22);
        return var14_22;
    }

    private String buildConferNumSql(BaseItemVO item, BaseItemVO srcItemVO, boolean isGenaration) {
        if (StringUtils.isEmpty((CharSequence)item.getConfernum()) || StringUtils.isEmpty((CharSequence)srcItemVO.getTableName())) {
            throw new IllegalArgumentException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0316_0", "02006arappub0316-0014"));
        }
        StringBuffer sql = new StringBuffer();
        sql.append("update ").append(srcItemVO.getTableName()).append(" set ");
        sql.append("confernum");
        if (isGenaration) {
            sql.append(" = '").append(item.getConfernum()).append("' ");
        } else {
            sql.append(" = null ");
        }
        sql.append("where ").append(srcItemVO.getPKFieldName()).append(" = '");
        sql.append(item.getTop_itemid()).append("';");
        return sql.toString();
    }

    private String buildTopBillConferNumSql(BaseAggVO[] bills) throws BusinessException {
        HashSet<String> pks = new HashSet<String>();
        String topBilltype = null;
        for (BaseAggVO bill : bills) {
            for (BaseItemVO item : bill.getItems()) {
                if (!StringUtils.isNotEmpty((CharSequence)item.getConfernum()) || !StringUtils.isNotEmpty((CharSequence)item.getTop_billtype())) continue;
                topBilltype = item.getTop_billtype();
                pks.add(item.getTop_itemid());
            }
        }
        if (topBilltype == null) {
            return null;
        }
        StringBuffer sql = new StringBuffer();
        String tableName = null;
        String pkFieldName = null;
        if (StringUtils.isNotEmpty(topBilltype)) {
            BilltypeVO billType = PfDataCache.getBillType(topBilltype);
            if (billType == null || billType.getSystemcode() == null || !billType.getSystemcode().equalsIgnoreCase("arap") && !billType.getSystemcode().equalsIgnoreCase("ar") && !billType.getSystemcode().equalsIgnoreCase("ap")) {
                return null;
            }
            IArapBilltypeInfo instance = ArapBillTypeInfo.getInstance(topBilltype);
            tableName = instance == null ? null : instance.getTableNameItem();
            String string = pkFieldName = instance == null ? null : instance.getTablePrimaryKeyItem();
        }
        if (tableName == null || pkFieldName == null) {
            throw new BusinessRuntimeException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0316_0", "02006arappub0316-0015"));
        }
        sql.append("update ").append(tableName).append(" set ");
        sql.append("confernum");
        sql.append(" = null ");
        sql.append(" where ");
        sql.append(SqlUtils.getInStr((String)pkFieldName, (String[])pks.toArray(new String[0])));
        return sql.toString();
    }

    public void reGeneratBConfer(BaseAggVO[] bills) throws BusinessException {
        BcMapVO[] bcmaps = ((IBConferMapQryService)NCLocator.getInstance().lookup(IBConferMapQryService.class)).queryBCMapByIDAndBType(bills[0].getHeadVO().getPrimaryKey(), bills[0].getHeadVO().getPk_billtype());
        ArrayList<String> list = new ArrayList<String>();
        HashMap<Integer, String> originalChilPk = new HashMap<Integer, String>();
        String originalParentPk = null;
        HashMap<String, Map<Integer, String>> parm = new HashMap<String, Map<Integer, String>>();
        if (bcmaps != null) {
            for (BcMapVO bcmap : bcmaps) {
                Object[] aggvo;
                if (null == bcmap || !StringUtils.isNotEmpty((CharSequence)bcmap.getDest_billid()) || !StringUtils.isNotEmpty((CharSequence)bcmap.getDest_billtype()) || ArrayUtils.isEmpty((Object[])(aggvo = ((IArapBillPubQueryService)NCLocator.getInstance().lookup(IArapBillPubQueryService.class)).findBillByPrimaryKey(new String[]{bcmap.getDest_billid()}, new String[]{bcmap.getDest_billtype()})))) continue;
                for (Object agg : aggvo) {
                    BaseBillVO parentVO = (BaseBillVO)agg.getParentVO();
                    if (parentVO.getBillstatus().intValue() != BillEnumCollection.BillSatus.UNCOMFIRM.VALUE.intValue()) {
                        throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0120"));
                    }
                    list.add(agg.getPrimaryKey());
                }
                originalParentPk = aggvo[0].getParentVO().getPrimaryKey();
                for (BaseItemVO items : aggvo[0].getItems()) {
                    originalChilPk.put(items.getRowno(), items.getPrimaryKey());
                }
                parm.put(originalParentPk, originalChilPk);
                this.deleteOrginbills((BaseAggVO[])aggvo);
                ((IBConferMapService)NCLocator.getInstance().lookup(IBConferMapService.class)).deleteByPks(new String[]{bills[0].getHeadVO().getPrimaryKey()}, bills[0].getHeadVO().getPk_billtype());
            }
        }
        new BConferUtils().save(bills[0], true, parm);
    }

    private void deleteOrginbills(BaseAggVO[] bills) throws BusinessException {
        new BillDeleteBatchBSAction().deleteVOs((AggregatedValueObject[])bills);
        String[] keys = new String[bills.length];
        ArrayList<String> keys2 = new ArrayList<String>();
        for (int i = 0; i < bills.length; ++i) {
            keys[i] = bills[i].getHeadVO().getPrimaryKey();
            for (BaseItemVO baseitem : bills[i].getItems()) {
                keys2.add(baseitem.getPrimaryKey());
            }
        }
        BaseDAO baseDAO = new BaseDAO();
        baseDAO.deleteByPKs(bills[0].getHeadVO().getClass(), keys);
        baseDAO.deleteByPKs(bills[0].getItems()[0].getClass(), keys2.toArray(new String[0]));
    }

    public void deleteBillConfer(BaseAggVO bill) throws BusinessException {
        IBConferMapQryService bcqrys = (IBConferMapQryService)NCLocator.getInstance().lookup(IBConferMapQryService.class);
        BcMapVO[] bcmaps = bcqrys.queryBCMapByIDAndBType(bill.getHeadVO().getPrimaryKey(), bill.getHeadVO().getPk_billtype());
        if (bcmaps != null) {
            boolean isImageEnable = ARAPModuleEnableUtil.isImagEnabled((String)InvocationInfoProxy.getInstance().getGroupId());
            for (BcMapVO bcmap : bcmaps) {
                if (null == bcmap || !StringUtils.isNotEmpty((CharSequence)bcmap.getDest_billid()) || !StringUtils.isNotEmpty((CharSequence)bcmap.getDest_billtype())) continue;
                IArapBillPubQueryService qrys = (IArapBillPubQueryService)NCLocator.getInstance().lookup(IArapBillPubQueryService.class);
                Object[] aggvo = qrys.findBillByPrimaryKey(new String[]{bcmap.getDest_billid()}, new String[]{bcmap.getDest_billtype()});
                if (ArrayUtils.isNotEmpty((Object[])aggvo) && isImageEnable) {
                    ArrayList<String> billIDList = new ArrayList<String>();
                    for (Object VO : aggvo) {
                        billIDList.add(VO.getParentVO().getPrimaryKey());
                    }
                    String msg = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0152");
                    if (ARAPModuleEnableUtil.isImagEnabled((String)InvocationInfoProxy.getInstance().getGroupId())) {
                        ((IImagPubService)NCLocator.getInstance().lookup(IImagPubService.class)).deleteImageAndInvoice(billIDList.toArray(new String[billIDList.size()]), InvocationInfoProxy.getInstance().getUserId(), msg);
                    }
                }
                this.deleteBill(bill, (BaseAggVO[])aggvo);
                IBConferMapService bcms = (IBConferMapService)NCLocator.getInstance().lookup(IBConferMapService.class);
                bcms.deleteByPks(new String[]{bill.getHeadVO().getPrimaryKey()}, bill.getHeadVO().getPk_billtype());
            }
        }
    }

    public void clearBillConferNum(BaseAggVO[] bills) throws BusinessException {
        String buildTopBillConferNumSql = this.buildTopBillConferNumSql(bills);
        if (buildTopBillConferNumSql != null) {
            DBAUtil.execBatchSql((String[])new String[]{buildTopBillConferNumSql});
        }
    }

    private void deleteBill(BaseAggVO srcbill, BaseAggVO[] billconfers) throws BusinessException {
        for (BaseAggVO billconfer : billconfers) {
            if (billconfer.getHeadVO().getBillstatus().intValue() == BillEnumCollection.BillSatus.UNCOMFIRM.VALUE.intValue()) continue;
            ExceptionHandler.createAndThrowException((String)NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0120"));
        }
        if (!ArrayUtils.isEmpty((Object[])billconfers)) {
            HashSet<String> sqls = new HashSet<String>();
            for (int i = 0; i < billconfers.length; ++i) {
                for (BaseItemVO itemVO : billconfers[i].getItems()) {
                    sqls.add(this.buildConferNumSql(itemVO, srcbill.getItems()[0], false));
                }
            }
            new BillDeleteBatchBSAction().deleteVOs((AggregatedValueObject[])billconfers);
            String[] keys = new String[billconfers.length];
            ArrayList<String> keys2 = new ArrayList<String>();
            for (int i = 0; i < billconfers.length; ++i) {
                keys[i] = billconfers[i].getHeadVO().getPrimaryKey();
                for (BaseItemVO baseitem : billconfers[i].getItems()) {
                    keys2.add(baseitem.getPrimaryKey());
                }
            }
            BaseDAO baseDAO = new BaseDAO();
            baseDAO.deleteByPKs(billconfers[0].getHeadVO().getClass(), keys);
            baseDAO.deleteByPKs(billconfers[0].getItems()[0].getClass(), keys2.toArray(new String[0]));
            if (sqls.size() > 0) {
                DBAUtil.execBatchSql((String[])sqls.toArray(new String[0]));
            }
        }
    }

    private void conferBillBillDateValidate(BaseAggVO[] bills) {
        if (bills != null && bills.length > 0 && bills[0].getParentVO().getAttributeValue("pk_org") != null && !StringUtil.isEmpty((String)((String)bills[0].getParentVO().getAttributeValue("pk_org")))) {
            UFDate billDate = (UFDate)bills[0].getParentVO().getAttributeValue("billdate");
            String destOrg = (String)bills[0].getParentVO().getAttributeValue("pk_org");
            String syscode = this.getModuleCode((Integer)bills[0].getParentVO().getAttributeValue("syscode"));
            UFDate calendar = null;
            try {
                calendar = bills[0].getParentVO().getAttributeValue("isinit") != null && ((UFBoolean)bills[0].getParentVO().getAttributeValue("isinit")).booleanValue() ? ArapBillPubUtil.getArapCreateDate((boolean)syscode.equals("2006"), (String)destOrg) : ArapBillPubUtil.getOrgModuleperiodDate((boolean)syscode.equals("2006"), (String)destOrg);
            }
            catch (CarrierRuntimeException e) {
                throw new BusinessRuntimeException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0316_0", "02006arappub0316-0067"));
            }
            if (null == calendar) {
                throw new BusinessRuntimeException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0316_0", "02006arappub0316-0067"));
            }
            if (bills[0].getParentVO().getAttributeValue("isinit") != null && ((UFBoolean)bills[0].getParentVO().getAttributeValue("isinit")).booleanValue()) {
                if (billDate.ufAfter(calendar)) {
                    throw new BusinessRuntimeException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0316_0", "02006arappub0316-0068"));
                }
            } else if (!billDate.ufAfter(calendar)) {
                throw new BusinessRuntimeException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0316_0", "02006arappub0316-0069"));
            }
        }
    }

    public String getModuleCode(Integer syscode) {
        String codes = null;
        if (syscode == 0) {
            codes = "2006";
        } else if (syscode == 1) {
            codes = "2008";
        }
        return codes;
    }

    static enum ConferStatus {
        HAS_REAL_CONFER(1),
        HAS_GENERAL_CONFER(2),
        NONE_CONFER(0);

        public final Integer VALUE;

        private ConferStatus(int value) {
            this.VALUE = value;
        }
    }
}

