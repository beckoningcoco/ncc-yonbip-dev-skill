/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.bill.ArapBillPubUtil
 *  nc.bs.arap.bill.CalcMoneyUtil
 *  nc.bs.arap.plugin.ArapExpPfxxValidater
 *  nc.bs.arap.util.ArapVOUtils
 *  nc.bs.arap.util.BillMoneyVUtils
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.logging.Logger
 *  nc.bs.pf.pub.PfDataCache
 *  nc.itf.uap.pf.IPFConfig
 *  nc.pubitf.accperiod.AccountCalendar
 *  nc.vo.arap.basebill.BaseAggVO
 *  nc.vo.arap.basebill.BaseBillVO
 *  nc.vo.arap.basebill.BaseItemVO
 *  nc.vo.arap.pub.BillEnumCollection$BillSatus
 *  nc.vo.arap.pub.BillEnumCollection$Direction
 *  nc.vo.arap.pub.BillEnumCollection$FromSystem
 *  nc.vo.arap.pub.BillEnumCollection$InureSign
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pub.lang.UFDateTime
 *  nccloud.bs.excel.plugin.AbstractImportProcess
 *  nccloud.commons.lang.StringUtils
 *  nccloud.pubitf.arap.arappub.IImportBillService
 */
package nccloud.pubimpl.arap.arappub;

import nc.bs.arap.bill.ArapBillPubUtil;
import nc.bs.arap.bill.CalcMoneyUtil;
import nc.bs.arap.plugin.ArapExpPfxxValidater;
import nc.bs.arap.util.ArapVOUtils;
import nc.bs.arap.util.BillMoneyVUtils;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.framework.common.NCLocator;
import nc.bs.logging.Logger;
import nc.bs.pf.pub.PfDataCache;
import nc.itf.uap.pf.IPFConfig;
import nc.pubitf.accperiod.AccountCalendar;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;
import nccloud.bs.excel.plugin.AbstractImportProcess;
import nccloud.commons.lang.StringUtils;
import nccloud.pubitf.arap.arappub.IImportBillService;

public class ArapImportProcessor
extends AbstractImportProcess {
    protected void processBill(Object vo) throws BusinessException {
        Object newBill = null;
        BaseAggVO bill = (BaseAggVO)vo;
        bill.getHeadVO().setPk_group(InvocationInfoProxy.getInstance().getGroupId());
        BaseBillVO head = this.setHeaderDefault(bill.getHeadVO());
        if (head.getPk_billtype() == null) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0316"));
        }
        if (!(head.getPk_billtype().equals("F0") || head.getPk_billtype().equals("F1") || head.getPk_billtype().equals("F2") || head.getPk_billtype().equals("F3"))) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0650"));
        }
        if (head.getPk_tradetype() == null) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0649"));
        }
        if (head.getPk_group() == null) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0317"));
        }
        if (head.getPk_org() == null) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0318"));
        }
        try {
            IPFConfig ipf = (IPFConfig)NCLocator.getInstance().lookup(IPFConfig.class);
            if (!StringUtils.isEmpty((CharSequence)head.getPk_billtype()) && !StringUtils.isEmpty((CharSequence)head.getPk_tradetype())) {
                String pk_busitype;
                if (head.getCreator() == null) {
                    head.setCreator(InvocationInfoProxy.getInstance().getUserId());
                }
                if ((pk_busitype = ipf.retBusitypeCanStart(head.getPk_billtype(), head.getPk_tradetype(), head.getPk_org(), head.getCreator())) == null) {
                    throw new BusinessException("busitype is null");
                }
                head.setPk_busitype(pk_busitype);
            }
        }
        catch (Exception e) {
            String msg = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0127") + head.getPk_tradetype() + NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0239") + head.getPk_tradetype() + NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0240");
            throw new BusinessException(msg);
        }
        if (head.getIsinit().booleanValue()) {
            boolean isAr = ArapBillPubUtil.isARSysBilltype((String)head.getPk_billtype());
            UFDate billdate = ArapBillPubUtil.getArapCreateDate((boolean)isAr, (String)head.getPk_org());
            if (null == billdate) {
                throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0007"));
            }
            if (head.getBilldate().after(billdate)) {
                head.setBilldate(billdate);
                for (BaseItemVO item : (BaseItemVO[])bill.getChildrenVO()) {
                    item.setBilldate(billdate);
                }
            }
        }
        this.setChildrenItem(bill);
        new CalcMoneyUtil().processImpMoney(bill);
        this.setBodyDefault(head, (BaseItemVO[])bill.getChildrenVO());
        BillMoneyVUtils.sumBodyToHead((BaseBillVO)head, (BaseItemVO[])((BaseItemVO[])bill.getChildrenVO()));
        ArapVOUtils.validateVoCopyRed((BaseAggVO)bill);
        ArapExpPfxxValidater.getInstance().validate(bill);
        ((IImportBillService)NCLocator.getInstance().lookup(IImportBillService.class)).importBill(head, bill);
    }

    private BaseBillVO setHeaderDefault(BaseBillVO header) throws BusinessException {
        Integer ZERO = 0;
        header.setBillstatus(BillEnumCollection.BillSatus.SAVE.VALUE);
        header.setEffectstatus(BillEnumCollection.InureSign.NOINURE.VALUE);
        header.setDr(ZERO);
        header.setSrc_syscode(BillEnumCollection.FromSystem.WBJHPT.VALUE);
        header.setCreationtime(new UFDateTime());
        header.setCoordflag(null);
        String userId = InvocationInfoProxy.getInstance().getUserId();
        header.setCreator(userId);
        header.setBillmaker(userId);
        header.setPk_billtype(this.getBillType());
        if (header.getPk_billtype().equals("F0")) {
            header.setBillclass("ys");
            header.setSyscode(Integer.valueOf(0));
        } else if (header.getPk_billtype().equals("F1")) {
            header.setBillclass("yf");
            header.setSyscode(Integer.valueOf(1));
        } else if (header.getPk_billtype().equals("F2")) {
            header.setBillclass("sk");
            header.setSyscode(Integer.valueOf(0));
        } else if (header.getPk_billtype().equals("F3")) {
            header.setBillclass("fk");
            header.setSyscode(Integer.valueOf(1));
        }
        try {
            AccountCalendar ac = AccountCalendar.getInstanceByPk_org((String)header.getPk_org());
            ac.setDate(header.getBilldate());
            header.setBillyear(ac.getYearVO().getPeriodyear());
            header.setBillperiod(ac.getMonthVO().getAccperiodmth());
        }
        catch (BusinessException ex) {
            Logger.error((Object)ex.getMessage());
        }
        header.setPk_tradetypeid(PfDataCache.getBillTypeInfo((String)header.getPk_group(), (String)header.getPk_tradetype()).getPk_billtypeid());
        return header;
    }

    public String getBillType() {
        return "";
    }

    void setChildrenItem(BaseAggVO bill) {
        BaseBillVO headvo = bill.getHeadVO();
        String pk_billtype = bill.getHeadVO().getPk_billtype();
        for (BaseItemVO childrenVO : bill.getItems()) {
            if ("F0".equals(pk_billtype)) {
                childrenVO.setDirection(BillEnumCollection.Direction.DEBIT.VALUE);
                childrenVO.setBillclass("ys");
                childrenVO.setPk_billtype("F0");
            } else if ("F1".equals(pk_billtype)) {
                childrenVO.setDirection(BillEnumCollection.Direction.CREDIT.VALUE);
                childrenVO.setBillclass("yf");
                childrenVO.setPk_billtype("F1");
            } else if ("F2".equals(pk_billtype)) {
                childrenVO.setDirection(BillEnumCollection.Direction.CREDIT.VALUE);
                childrenVO.setBillclass("sk");
                childrenVO.setPk_billtype("F2");
            } else if ("F3".equals(pk_billtype)) {
                childrenVO.setDirection(BillEnumCollection.Direction.DEBIT.VALUE);
                childrenVO.setBillclass("fk");
                childrenVO.setPk_billtype("F3");
            }
            childrenVO.setPk_org(headvo.getPk_org());
            childrenVO.setPk_group(headvo.getPk_group());
            childrenVO.setBilldate(headvo.getBilldate());
            if (headvo.getBusidate() == null) {
                childrenVO.setBusidate(headvo.getBilldate());
            } else {
                childrenVO.setBusidate(headvo.getBusidate());
            }
            childrenVO.setPk_tradetype(headvo.getPk_tradetype());
            childrenVO.setPk_tradetypeid(headvo.getPk_tradetypeid());
        }
    }

    void setBodyDefault(BaseBillVO head, BaseItemVO[] items) throws BusinessException {
        int len = items == null ? 0 : items.length;
        for (int i = 0; i < len; ++i) {
            this.setBodyDefault(head, items[i]);
        }
    }

    void setBodyDefault(BaseBillVO head, BaseItemVO item) throws BusinessException {
        item.setPk_org(head.getPk_org());
        item.setDr(Integer.valueOf(0));
        item.setPk_tradetypeid(PfDataCache.getBillTypeInfo((String)head.getPk_group(), (String)head.getPk_tradetype()).getPk_billtypeid());
        item.setCoordflag(null);
    }
}

