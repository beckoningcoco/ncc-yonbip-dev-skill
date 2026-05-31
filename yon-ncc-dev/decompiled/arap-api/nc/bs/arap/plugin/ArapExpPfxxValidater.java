/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.itf.fi.pub.Currency
 *  nc.itf.fi.pub.SysInit
 *  nc.pubitf.uapbd.CurrencyRateUtil
 *  nc.vo.bd.currinfo.CurrinfoVO
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pub.lang.UFDouble
 *  nc.vo.pubapp.pattern.exception.ExceptionUtils
 *  nc.vo.pubapp.pattern.pub.MathTool
 *  org.apache.commons.lang3.StringUtils
 */
package nc.bs.arap.plugin;

import java.util.ArrayList;
import java.util.HashMap;
import nc.bs.arap.bill.ArapBillPubUtil;
import nc.bs.arap.util.BillEuroUtils;
import nc.itf.fi.pub.Currency;
import nc.itf.fi.pub.SysInit;
import nc.pubitf.uapbd.CurrencyRateUtil;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.arap.sysinit.SysinitConst;
import nc.vo.arap.utils.StringUtil;
import nc.vo.bd.currinfo.CurrinfoVO;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.BusinessException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.vo.pubapp.pattern.pub.MathTool;
import org.apache.commons.lang3.StringUtils;

public class ArapExpPfxxValidater {
    private static final ArapExpPfxxValidater instance = new ArapExpPfxxValidater();

    public static ArapExpPfxxValidater getInstance() {
        return instance;
    }

    public void validate(BaseAggVO vo) {
        try {
            this.checkLocalRate(vo);
            this.checkTax(vo);
            this.checkBalMny(vo);
            this.checkSumMny(vo);
            this.checkGroupGlobal(vo);
            this.checkLocalRange(vo);
        }
        catch (BusinessException e) {
            ExceptionUtils.wrappException((Exception)((Object)e));
        }
    }

    private void checkGroupGlobal(BaseAggVO vo) throws BusinessException {
        BaseItemVO[] items = vo.getItems();
        BaseBillVO headVO = vo.getHeadVO();
        String pk_group = headVO.getPk_group();
        try {
            String NC002 = SysInit.getParaString((String)"GLOBLE00000000000000", (String)"NC002");
            String NC001 = SysInit.getParaString((String)pk_group, (String)"NC001");
            for (BaseItemVO item : items) {
                if (NC001.equals(SysinitConst.NC001_NOT_USED)) {
                    item.setGrouprate(null);
                    item.setGroupdebit(null);
                    item.setGroupcrebit(null);
                }
                if (!NC002.equals(SysinitConst.NC002_NOT_USED)) continue;
                item.setGlobalrate(null);
                item.setGlobaldebit(null);
                item.setGlobalcrebit(null);
            }
        }
        catch (BusinessException e) {
            ExceptionHandler.handleException((Exception)((Object)e));
        }
    }

    private void checkLocalRange(BaseAggVO vo) throws BusinessException {
        BaseItemVO[] items = vo.getItems();
        BaseBillVO headVO = vo.getHeadVO();
        for (BaseItemVO item : items) {
            String currType = item.getPk_currtype();
            String pk_org = headVO.getPk_org();
            String destCurrType = null;
            try {
                destCurrType = Currency.getLocalCurrPK((String)pk_org);
            }
            catch (BusinessException e2) {
                ExceptionUtils.wrappException((Exception)((Object)e2));
            }
            if (currType.equals(destCurrType)) continue;
            try {
                CurrencyRateUtil rateUtil;
                String pk_ratetype = item.getPk_ratetype();
                CurrencyRateUtil currencyRateUtil = rateUtil = StringUtil.isEmptyWithTrim(pk_ratetype) ? CurrencyRateUtil.getInstanceByOrg((String)pk_org) : CurrencyRateUtil.getInstanceByRateType((String)pk_ratetype);
                if (null == rateUtil) {
                    String schemePK = CurrencyRateUtil.getDefaultExchangeSchemePk();
                    rateUtil = CurrencyRateUtil.getInstanceByExrateScheme((String)schemePK);
                }
                UFDouble outrate = item.getRate();
                CurrinfoVO currinfo = rateUtil.getCurrinfoVO(currType, destCurrType);
                if (null == currinfo) {
                    return;
                }
                UFDouble money = UFDouble.ZERO_DBL;
                UFDouble localMoney = UFDouble.ZERO_DBL;
                if (headVO.getBillclass().equals("ys") || headVO.getBillclass().equals("fk") || headVO.getBillclass().equals("zs")) {
                    money = item.getMoney_de();
                    localMoney = item.getLocal_money_de();
                } else {
                    money = item.getMoney_cr();
                    localMoney = item.getLocal_money_cr();
                }
                if (null == money) {
                    return;
                }
                UFDouble amountByOpp = UFDouble.ZERO_DBL;
                amountByOpp = StringUtil.isEmptyWithTrim(pk_ratetype) ? Currency.getAmountByOpp((String)pk_org, (String)currType, (String)destCurrType, (UFDouble)money, (UFDouble)outrate, (UFDate)headVO.getBilldate()) : rateUtil.getAmountByOpp(currType, destCurrType, money, outrate, headVO.getBilldate());
                if (amountByOpp.sub(localMoney).abs().compareTo((Object)currinfo.getMaxconverr()) <= 0) continue;
                throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub0322_0", "02006pub0322-0024"));
            }
            catch (Exception e) {
                ExceptionHandler.handleException((Exception)e);
            }
        }
    }

    private void checkSumMny(BaseAggVO vo) throws BusinessException {
        if (vo.getHeadVO().getBillclass().equals("ys") || vo.getHeadVO().getBillclass().equals("fk") || vo.getHeadVO().getBillclass().equals("zs")) {
            UFDouble money = ArapBillPubUtil.sumB("money_de", (CircularlyAccessibleValueObject[])vo.getItems());
            UFDouble sum = vo.getHeadVO().getMoney();
            if (sum.compareTo((Object)(money = this.getSameAccuracy(money, vo))) != 0) {
                throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0316_0", "02006arappub0316-0018"));
            }
            UFDouble local_money = ArapBillPubUtil.sumB("local_money_de", (CircularlyAccessibleValueObject[])vo.getItems());
            vo.getHeadVO().setLocal_money(local_money);
            UFDouble group_money = ArapBillPubUtil.sumB("groupdebit", (CircularlyAccessibleValueObject[])vo.getItems());
            vo.getHeadVO().setGrouplocal(group_money);
            UFDouble global_money = ArapBillPubUtil.sumB("globaldebit", (CircularlyAccessibleValueObject[])vo.getItems());
            vo.getHeadVO().setGloballocal(global_money);
        } else {
            UFDouble money = ArapBillPubUtil.sumB("money_cr", (CircularlyAccessibleValueObject[])vo.getItems());
            UFDouble sum = vo.getHeadVO().getMoney();
            if (sum.compareTo((Object)(money = this.getSameAccuracy(money, vo))) != 0) {
                throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0316_0", "02006arappub0316-0018"));
            }
            UFDouble local_money = ArapBillPubUtil.sumB("local_money_cr", (CircularlyAccessibleValueObject[])vo.getItems());
            vo.getHeadVO().setLocal_money(local_money);
            UFDouble group_money = ArapBillPubUtil.sumB("groupcrebit", (CircularlyAccessibleValueObject[])vo.getItems());
            vo.getHeadVO().setGrouplocal(group_money);
            UFDouble global_money = ArapBillPubUtil.sumB("globalcrebit", (CircularlyAccessibleValueObject[])vo.getItems());
            vo.getHeadVO().setGloballocal(global_money);
        }
    }

    private void checkBalMny(BaseAggVO vo) {
        for (BaseItemVO item : vo.getItems()) {
            if (vo.getHeadVO().getBillclass().equals("ys") || vo.getHeadVO().getBillclass().equals("fk") || vo.getHeadVO().getBillclass().equals("zs")) {
                item.setMoney_bal(item.getMoney_de());
                item.setLocal_money_bal(item.getLocal_money_de());
                item.setGroupbalance(item.getGroupdebit());
                item.setGlobalbalance(item.getGlobaldebit());
                item.setOccupationmny(item.getMoney_bal());
                continue;
            }
            item.setMoney_bal(item.getMoney_cr());
            item.setLocal_money_bal(item.getLocal_money_cr());
            item.setGroupbalance(item.getGroupcrebit());
            item.setGlobalbalance(item.getGlobalcrebit());
            item.setOccupationmny(item.getMoney_bal());
        }
    }

    private void checkTax(BaseAggVO vo) throws BusinessException {
        String taxcodeid = null;
        UFDouble taxrate = UFDouble.ZERO_DBL;
        HashMap<UFDouble, String> map = new HashMap<UFDouble, String>();
        ArrayList<String> taxcode = new ArrayList<String>();
        for (BaseItemVO item : vo.getItems()) {
            String billclass = vo.getHeadVO().getBillclass();
            if ("ys".equals(billclass) || "yf".equals(billclass) || "zs".equals(billclass) || "zf".equals(billclass)) {
                if (null == item.getBuysellflag()) {
                    String taxcountryid = vo.getHeadVO().getTaxcountryid();
                    String billtype = vo.getHeadVO().getPk_billtype();
                    String recorSendCountryid = null;
                    recorSendCountryid = "F0".equals(billtype) || "F2".equals(billtype) || "23E0".equals(billtype) ? item.getRececountryid() : item.getSendcountryid();
                    Integer buySellType = BillEuroUtils.getSellType(taxcountryid, recorSendCountryid);
                    if (buySellType == null) {
                        throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0316_0", "02006arappub0316-0059"));
                    }
                    item.setBuysellflag(buySellType);
                }
                if (BillEnumCollection.BuySellType.IN_SELL.VALUE.intValue() != item.getBuysellflag().intValue() && BillEnumCollection.BuySellType.IN_BUY.VALUE.intValue() != item.getBuysellflag().intValue() && BillEnumCollection.BuySellType.OUT_SELL.VALUE.intValue() != item.getBuysellflag().intValue() && BillEnumCollection.BuySellType.OUT_BUY.VALUE.intValue() != item.getBuysellflag().intValue() && BillEnumCollection.BuySellType.DEFAULT_TYPE.VALUE.intValue() != item.getBuysellflag().intValue()) {
                    throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0316_0", "02006arappub0316-0059"));
                }
                if (BillEnumCollection.BuySellType.OUT_SELL.VALUE.intValue() == item.getBuysellflag().intValue() || BillEnumCollection.BuySellType.OUT_BUY.VALUE.intValue() == item.getBuysellflag().intValue()) {
                    this.checkTaxByOut(item);
                } else {
                    this.checkTaxByIn(item);
                }
            }
            taxcodeid = item.getTaxcodeid();
            taxrate = item.getTaxrate();
            map.put(taxrate, taxcodeid);
            if (!StringUtils.isNotEmpty((CharSequence)taxcodeid)) continue;
            taxcode.add(taxcodeid);
        }
    }

    private void checkTaxByOut(BaseItemVO item) throws BusinessException {
        UFDouble globalmoney_de;
        UFDouble globalmoney_cr;
        UFDouble groupmoney_de;
        UFDouble groupmoney_cr;
        UFDouble localmoney_de;
        UFDouble localmoney_cr;
        UFDouble localnotax_cr = item.getLocal_notax_cr();
        UFDouble uFDouble = localmoney_cr = item.getLocal_money_cr() == null ? UFDouble.ZERO_DBL : item.getLocal_money_cr();
        if (localmoney_cr.compareTo((Object)localnotax_cr) != 0) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0316_0", "02006arappub0316-0060"));
        }
        UFDouble localnotax_de = item.getLocal_notax_de();
        UFDouble uFDouble2 = localmoney_de = item.getLocal_money_de() == null ? UFDouble.ZERO_DBL : item.getLocal_money_de();
        if (localmoney_de.compareTo((Object)localnotax_de) != 0) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0316_0", "02006arappub0316-0060"));
        }
        UFDouble groupnotax_cr = item.getGroupnotax_cre();
        UFDouble uFDouble3 = groupmoney_cr = item.getGroupcrebit() == null ? UFDouble.ZERO_DBL : item.getGroupcrebit();
        if (groupmoney_cr.compareTo((Object)groupnotax_cr) != 0) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0316_0", "02006arappub0316-0061"));
        }
        UFDouble groupnotax_de = item.getGroupnotax_de();
        UFDouble uFDouble4 = groupmoney_de = item.getGroupdebit() == null ? UFDouble.ZERO_DBL : item.getGroupdebit();
        if (groupmoney_de.compareTo((Object)groupnotax_de) != 0) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0316_0", "02006arappub0316-0061"));
        }
        UFDouble globalnotax_cr = item.getGlobalnotax_cre();
        UFDouble uFDouble5 = globalmoney_cr = item.getGlobalcrebit() == null ? UFDouble.ZERO_DBL : item.getGlobalcrebit();
        if (globalmoney_cr.compareTo((Object)globalnotax_cr) != 0) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0316_0", "02006arappub0316-0062"));
        }
        UFDouble globalnotax_de = item.getGlobalnotax_de();
        UFDouble uFDouble6 = globalmoney_de = item.getGlobaldebit() == null ? UFDouble.ZERO_DBL : item.getGlobaldebit();
        if (globalmoney_de.compareTo((Object)globalnotax_de) != 0) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0316_0", "02006arappub0316-0062"));
        }
    }

    private void checkTaxByIn(BaseItemVO item) throws BusinessException {
        UFDouble localmoney_de;
        UFDouble localmoney_cr;
        UFDouble localtax_cr = item.getLocal_tax_cr();
        UFDouble localnotax_cr = item.getLocal_notax_cr();
        UFDouble uFDouble = localmoney_cr = item.getLocal_money_cr() == null ? UFDouble.ZERO_DBL : item.getLocal_money_cr();
        if (localmoney_cr.compareTo((Object)MathTool.add((UFDouble)localtax_cr, (UFDouble)localnotax_cr)) != 0) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0316_0", "02006arappub0316-0019"));
        }
        UFDouble localtax_de = item.getLocal_tax_de();
        UFDouble localnotax_de = item.getLocal_notax_de();
        UFDouble uFDouble2 = localmoney_de = item.getLocal_money_de() == null ? UFDouble.ZERO_DBL : item.getLocal_money_de();
        if (localmoney_de.compareTo((Object)MathTool.add((UFDouble)localtax_de, (UFDouble)localnotax_de)) != 0) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0316_0", "02006arappub0316-0019"));
        }
    }

    private void checkLocalRate(BaseAggVO vo) throws BusinessException {
        for (BaseItemVO item : vo.getItems()) {
            String pk_org = item.getPk_org();
            String pk_group = item.getPk_group();
            if (null == pk_org) {
                pk_org = vo.getHeadVO().getPk_org();
            }
            String local_currtype = Currency.getLocalCurrPK((String)pk_org);
            String group_currtype = Currency.getLocalCurrPK((String)pk_group);
            String global_currtype = Currency.getLocalCurrPK((String)"GLOBLE00000000000000");
            String pk_currtype = item.getPk_currtype();
            if (null == pk_currtype) {
                throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0316_0", "02006arappub0316-0022"));
            }
            if (null == local_currtype) {
                throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0316_0", "02006arappub0316-0023"));
            }
            if (local_currtype.equals(pk_currtype)) {
                String NC002;
                String NC001;
                if (item.getLocal_money_cr().compareTo((Object)item.getMoney_cr()) != 0) {
                    throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0316_0", "02006arappub0316-0072"));
                }
                if (item.getLocal_money_de().compareTo((Object)item.getMoney_de()) != 0) {
                    throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0316_0", "02006arappub0316-0072"));
                }
                if (pk_currtype.equals(group_currtype) && !(NC001 = SysInit.getParaString((String)pk_group, (String)"NC001")).equals(SysinitConst.NC001_NOT_USED)) {
                    if (item.getLocal_money_cr().compareTo((Object)item.getGroupcrebit()) != 0) {
                        throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0316_0", "02006arappub0316-0073"));
                    }
                    if (item.getLocal_money_de().compareTo((Object)item.getGroupdebit()) != 0) {
                        throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0316_0", "02006arappub0316-0073"));
                    }
                }
                if (pk_currtype.equals(global_currtype) && !(NC002 = SysInit.getParaString((String)"GLOBLE00000000000000", (String)"NC002")).equals(SysinitConst.NC002_NOT_USED)) {
                    if (item.getLocal_money_cr().compareTo((Object)item.getGlobalcrebit()) != 0) {
                        throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0316_0", "02006arappub0316-0074"));
                    }
                    if (item.getLocal_money_de().compareTo((Object)item.getGlobaldebit()) != 0) {
                        throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0316_0", "02006arappub0316-0074"));
                    }
                }
            }
            if (local_currtype.equals(pk_currtype)) {
                if (item.getRate() == null || UFDouble.ZERO_DBL.equals((Object)item.getRate())) {
                    item.setRate(UFDouble.ONE_DBL);
                }
                if (item.getLocal_money_cr() == null || UFDouble.ZERO_DBL.equals((Object)item.getLocal_money_cr())) {
                    item.setLocal_money_cr(item.getMoney_cr());
                }
                if (item.getLocal_notax_cr() == null || UFDouble.ZERO_DBL.equals((Object)item.getLocal_notax_cr())) {
                    item.setLocal_notax_cr(item.getNotax_cr());
                }
                if (item.getLocal_money_de() == null || UFDouble.ZERO_DBL.equals((Object)item.getLocal_money_de())) {
                    item.setLocal_money_de(item.getMoney_de());
                }
                if (item.getLocal_notax_de() != null && !UFDouble.ZERO_DBL.equals((Object)item.getLocal_notax_de())) continue;
                item.setLocal_notax_de(item.getNotax_de());
                continue;
            }
            if (item.getLocal_money_cr() == null || UFDouble.ZERO_DBL.equals((Object)item.getLocal_money_cr())) {
                item.setLocal_money_cr(Currency.getAmountByOpp((String)pk_org, (String)pk_currtype, (String)local_currtype, (UFDouble)item.getMoney_cr(), (UFDouble)item.getRate(), (UFDate)vo.getHeadVO().getBilldate()));
            }
            if (item.getLocal_notax_cr() == null || UFDouble.ZERO_DBL.equals((Object)item.getLocal_notax_cr())) {
                item.setLocal_notax_cr(Currency.getAmountByOpp((String)pk_org, (String)pk_currtype, (String)local_currtype, (UFDouble)item.getNotax_cr(), (UFDouble)item.getRate(), (UFDate)vo.getHeadVO().getBilldate()));
            }
            if (item.getLocal_money_de() == null || UFDouble.ZERO_DBL.equals((Object)item.getLocal_money_de())) {
                item.setLocal_money_de(Currency.getAmountByOpp((String)pk_org, (String)pk_currtype, (String)local_currtype, (UFDouble)item.getMoney_de(), (UFDouble)item.getRate(), (UFDate)vo.getHeadVO().getBilldate()));
            }
            if (item.getLocal_notax_de() != null && !UFDouble.ZERO_DBL.equals((Object)item.getLocal_notax_de())) continue;
            item.setLocal_notax_de(Currency.getAmountByOpp((String)pk_org, (String)pk_currtype, (String)local_currtype, (UFDouble)item.getNotax_de(), (UFDouble)item.getRate(), (UFDate)vo.getHeadVO().getBilldate()));
        }
    }

    private UFDouble getSameAccuracy(UFDouble money, BaseAggVO vo) {
        return Currency.getFormaUfValue((String)((String)vo.getHeadVO().getAttributeValue("pk_currtype")), (UFDouble)money);
    }
}

