/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.bill.CalcMoneyUtil
 *  nc.bs.dao.BaseDAO
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.pf.pub.PfDataCache
 *  nc.pubitf.accperiod.AccountCalendar
 *  nc.pubitf.arap.bill.IArapBillPubQueryService
 *  nc.pubitf.bd.accessor.GeneralAccessorFactory
 *  nc.pubitf.uapbd.CurrencyRateUtil
 *  nc.pubitf.uapbd.CurrencyRateUtilHelper
 *  nc.vo.arap.basebill.BaseAggVO
 *  nc.vo.arap.basebill.BaseBillVO
 *  nc.vo.arap.payable.AggPayableBillVO
 *  nc.vo.arap.payable.PayableBillItemVO
 *  nc.vo.arap.payable.PayableBillVO
 *  nc.vo.arap.pub.BillEnumCollection$BillSatus
 *  nc.vo.arap.pub.BillEnumCollection$Direction
 *  nc.vo.arap.pub.BillEnumCollection$FromSystem
 *  nc.vo.arap.pub.BillEnumCollection$InureSign
 *  nc.vo.arap.pub.BillEnumCollection$RowType
 *  nc.vo.arap.utils.ArrayUtil
 *  nc.vo.bd.accessor.IBDData
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.org.OrgVO
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pub.lang.UFDateTime
 *  nc.vo.pub.lang.UFDouble
 *  nc.vo.pub.workflownote.WorkflownoteVO
 *  nc.vo.pubapp.pflow.PfUserObject
 *  nc.vo.pubapp.util.NCPfServiceUtils
 *  nccloud.pubitf.arap.openapi.IPayableBillOpenService
 */
package nccloud.pubimpl.arap.openapi;

import nc.bs.arap.bill.CalcMoneyUtil;
import nc.bs.dao.BaseDAO;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.framework.common.NCLocator;
import nc.bs.pf.pub.PfDataCache;
import nc.pubitf.accperiod.AccountCalendar;
import nc.pubitf.arap.bill.IArapBillPubQueryService;
import nc.pubitf.bd.accessor.GeneralAccessorFactory;
import nc.pubitf.uapbd.CurrencyRateUtil;
import nc.pubitf.uapbd.CurrencyRateUtilHelper;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.payable.AggPayableBillVO;
import nc.vo.arap.payable.PayableBillItemVO;
import nc.vo.arap.payable.PayableBillVO;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.arap.utils.ArrayUtil;
import nc.vo.bd.accessor.IBDData;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.org.OrgVO;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pub.workflownote.WorkflownoteVO;
import nc.vo.pubapp.pflow.PfUserObject;
import nc.vo.pubapp.util.NCPfServiceUtils;
import nccloud.pubimpl.arap.openapi.ArapBillConvert;
import nccloud.pubimpl.arap.openapi.BillOpenServiceImpl;
import nccloud.pubitf.arap.openapi.IPayableBillOpenService;

public class PayableBillOpenServiceImpl
extends BillOpenServiceImpl
implements IPayableBillOpenService {
    @Override
    protected void setHeadInfo(BaseBillVO headvo) throws BusinessException {
        headvo.setBillclass("yf");
        headvo.setPk_billtype("F1");
        headvo.setIsinit(UFBoolean.FALSE);
        headvo.setSyscode(BillEnumCollection.FromSystem.AP.VALUE);
    }

    @Override
    protected Integer getDirection() throws BusinessException {
        return BillEnumCollection.Direction.CREDIT.VALUE;
    }

    @Override
    protected String getBilltype() throws BusinessException {
        return "F1";
    }

    public AggPayableBillVO savePayableBillForTMS(AggPayableBillVO aggvo) throws BusinessException {
        PayableBillItemVO[] bodyVOs;
        PayableBillVO headvo = aggvo.getHeadVO();
        headvo.setBillclass("yf");
        headvo.setPk_tradetype("D1");
        headvo.setPk_billtype("F1");
        headvo.setEffectstatus(BillEnumCollection.InureSign.NOINURE.VALUE);
        headvo.setIsflowbill(UFBoolean.FALSE);
        Integer src_syscode = headvo.getSrc_syscode();
        if (src_syscode == null) {
            headvo.setSrc_syscode(BillEnumCollection.FromSystem.WBJHPT.VALUE);
        }
        headvo.setSyscode(BillEnumCollection.FromSystem.AP.VALUE);
        headvo.setIsTaxRecalculation(UFBoolean.FALSE);
        headvo.setDr(Integer.valueOf(0));
        headvo.setCreationtime(new UFDateTime());
        headvo.setBillstatus(BillEnumCollection.BillSatus.SAVE.VALUE);
        AccountCalendar ac = AccountCalendar.getInstanceByPk_org((String)headvo.getPk_org());
        ac.setDate(headvo.getBilldate());
        headvo.setBillyear(ac.getYearVO().getPeriodyear());
        headvo.setBillperiod(ac.getMonthVO().getAccperiodmth());
        String pk_org = headvo.getPk_org();
        OrgVO orgVO = (OrgVO)new BaseDAO().retrieveByPK(OrgVO.class, pk_org, new String[]{"pk_group", "pk_org"});
        headvo.setPk_group(orgVO.getPk_group());
        headvo.setPk_tradetypeid(PfDataCache.getBillTypeInfo((String)headvo.getPk_group(), (String)headvo.getPk_tradetype()).getPk_billtypeid());
        String currtypeCode = headvo.getPk_currtype();
        IBDData currtype = GeneralAccessorFactory.getAccessor((String)"b498bc9a-e5fd-4613-8da8-bdae2a05704a").getDocByCode("GLOBLE00000000000000", currtypeCode);
        headvo.setPk_currtype(currtype.getPk());
        String localcurr = CurrencyRateUtilHelper.getInstance().getLocalCurrtypeByOrgID(pk_org);
        UFDouble rate = CurrencyRateUtil.getInstanceByOrg((String)pk_org).getRate(headvo.getPk_currtype(), localcurr, headvo.getBilldate());
        headvo.setRate(rate);
        headvo.setBillmaker(InvocationInfoProxy.getInstance().getUserId());
        headvo.setCreator(InvocationInfoProxy.getInstance().getUserId());
        ArapBillConvert billconvert = new ArapBillConvert();
        PayableBillItemVO[] items = aggvo.getBodyVOs();
        UFDouble money = UFDouble.ZERO_DBL;
        UFDouble localMoney = UFDouble.ZERO_DBL;
        for (PayableBillItemVO itemvo : items) {
            IBDData bdata;
            itemvo.setRowtype(BillEnumCollection.RowType.SELF_BUSSINESS.VALUE);
            itemvo.setPk_group(headvo.getPk_group());
            itemvo.setPk_org(headvo.getPk_org());
            itemvo.setBillclass(headvo.getBillclass());
            itemvo.setPk_tradetype(headvo.getPk_tradetype());
            itemvo.setPk_tradetypeid(headvo.getPk_tradetypeid());
            itemvo.setBilldate(headvo.getBilldate());
            itemvo.setBusidate(headvo.getBusidate());
            itemvo.setObjtype(headvo.getObjtype());
            itemvo.setSupplier(headvo.getSupplier());
            itemvo.setPk_currtype(headvo.getPk_currtype());
            itemvo.setSettlecurr(headvo.getPk_currtype());
            itemvo.setDirection(BillEnumCollection.Direction.CREDIT.VALUE);
            itemvo.setSrc_billtype("TMS");
            itemvo.setRate(rate);
            itemvo.setDr(Integer.valueOf(0));
            money = money.add(itemvo.getMoney_cr());
            localMoney = localMoney.add(itemvo.getLocal_money_cr());
            String taxcode = itemvo.getTaxcodeid();
            if (taxcode != null) {
                bdata = GeneralAccessorFactory.getAccessor((String)"f758785c-a056-4f65-a551-ac05c3ac09cd").getDocByCode(pk_org, taxcode);
                if (bdata == null) {
                    throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1014"));
                }
            } else {
                throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1013"));
            }
            itemvo.setTaxcodeid(bdata.getPk());
        }
        headvo.setMoney(money);
        headvo.setLocal_money(localMoney);
        new CalcMoneyUtil().processImpMoney((BaseAggVO)aggvo);
        InvocationInfoProxy.getInstance().setGroupId(headvo.getPk_group());
        AggPayableBillVO bill = aggvo;
        IArapBillPubQueryService service = (IArapBillPubQueryService)NCLocator.getInstance().lookup(IArapBillPubQueryService.class);
        aggvo = (AggPayableBillVO)service.getDefaultVO((BaseAggVO)bill, true);
        AggPayableBillVO aggbillvo = (AggPayableBillVO)ArrayUtil.getFirstInArrays((Object[])((Object[])NCPfServiceUtils.processBatch((String)"SAVE", (String)headvo.getPk_billtype(), (AggregatedValueObject[])new AggPayableBillVO[]{aggvo}, (Object[])new PfUserObject[]{new PfUserObject()}, (WorkflownoteVO)new WorkflownoteVO())));
        String billno = aggbillvo.getHeadVO().getBillno();
        for (PayableBillItemVO bodyVO : bodyVOs = aggbillvo.getBodyVOs()) {
            if (billno.length() > 20) {
                bodyVO.setSrc_billid(billno.substring(billno.length() - 20, billno.length()));
                continue;
            }
            bodyVO.setSrc_billid(billno);
        }
        new BaseDAO().updateVOArray((SuperVO[])bodyVOs);
        return aggbillvo;
    }
}

