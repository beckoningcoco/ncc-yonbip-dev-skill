/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.itf.fi.pub.Currency
 *  nc.pubitf.uapbd.CurrencyRateUtil
 *  nc.vo.arap.basebill.BaseAggVO
 *  nc.vo.arap.basebill.BaseItemVO
 *  nc.vo.arap.termitem.TermVO
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pub.lang.UFDouble
 *  nccloud.pubitf.arap.arappub.TremAfterEditService
 */
package nccloud.pubimpl.arap.arappub;

import nc.itf.fi.pub.Currency;
import nc.pubitf.uapbd.CurrencyRateUtil;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.arap.termitem.TermVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDouble;
import nccloud.pubitf.arap.arappub.TremAfterEditService;

public class TremAfterEditServiceImpl
implements TremAfterEditService {
    public static final UFDouble UFDOUBLE_HUNDRED = new UFDouble(100.0);

    public TermVO afterEdit(TermVO termVo, BaseItemVO itemVO, BaseAggVO aggvo, String key) throws BusinessException {
        String billclass = aggvo.getHeadVO().getBillclass();
        String jfOrDf = null;
        if (billclass.equals("yf") || billclass.equals("sk") || billclass.equals("sj") || billclass.equals("ws")) {
            jfOrDf = "DF";
        } else if (billclass.equals("ys") || billclass.equals("fk") || billclass.equals("ss") || billclass.equals("fj") || billclass.equals("wf")) {
            jfOrDf = "JF";
        }
        if (key.equals("money_de")) {
            UFDouble ybje = termVo.getMoney_de();
            if (ybje == null) {
                ybje = new UFDouble(0);
                termVo.setMoney_de(ybje);
            }
            this.getChangeTermVOByMoney(ybje, itemVO, termVo, jfOrDf);
            termVo = this.changeYe(aggvo, termVo);
        } else if (key.equals("local_money_de")) {
            String pkCurrtype = Currency.getOrgLocalCurrPK((String)itemVO.getPk_org());
            UFDouble ybje = CurrencyRateUtil.getInstanceByOrg((String)itemVO.getPk_org()).getOriginAmountByOpp(pkCurrtype, itemVO.getPk_currtype(), termVo.getLocal_money_cr(), itemVO.getRate(), itemVO.getBilldate());
            termVo.setMoney_de(ybje);
            UFDouble[] group_global = Currency.computeGroupGlobalAmount((UFDouble)ybje, (UFDouble)termVo.getLocal_money_cr(), (String)itemVO.getPk_currtype(), (UFDate)itemVO.getBilldate(), (String)itemVO.getPk_org(), (String)itemVO.getPk_group(), (UFDouble)itemVO.getGlobalrate(), (UFDouble)itemVO.getGrouprate());
            termVo.setGroupcredit(group_global[0]);
            termVo.setGlobalcredit(group_global[1]);
            termVo.setGroupbalance(group_global[0]);
            termVo.setGlobalbalance(group_global[1]);
            termVo = this.changeYe(aggvo, termVo);
        } else if (key.equals("money_cr")) {
            UFDouble ybje = termVo.getMoney_cr();
            if (null == ybje) {
                ybje = new UFDouble(0);
                termVo.setMoney_cr(ybje);
            }
            this.getChangeTermVOByMoney(ybje, itemVO, termVo, jfOrDf);
            termVo = this.changeYe(aggvo, termVo);
        } else if (key.equals("local_money_cr")) {
            String pkCurrtype = Currency.getOrgLocalCurrPK((String)itemVO.getPk_org());
            UFDouble ybje = CurrencyRateUtil.getInstanceByOrg((String)itemVO.getPk_org()).getOriginAmountByOpp(pkCurrtype, itemVO.getPk_currtype(), termVo.getLocal_money_cr(), itemVO.getRate(), itemVO.getBilldate());
            termVo.setMoney_cr(ybje);
            UFDouble[] group_global = Currency.computeGroupGlobalAmount((UFDouble)ybje, (UFDouble)termVo.getLocal_money_cr(), (String)itemVO.getPk_currtype(), (UFDate)itemVO.getBilldate(), (String)itemVO.getPk_org(), (String)itemVO.getPk_group(), (UFDouble)itemVO.getGlobalrate(), (UFDouble)itemVO.getGrouprate());
            termVo.setGroupcredit(group_global[0]);
            termVo.setGlobalcredit(group_global[1]);
            termVo.setGroupbalance(group_global[0]);
            termVo.setGlobalbalance(group_global[1]);
            termVo = this.changeYe(aggvo, termVo);
        } else if (key.equals("quantity_de") || key.equals("quantity_cr")) {
            termVo = this.changeYe(aggvo, termVo);
        } else if (key.equals("expiredate")) {
            UFDate exdate = termVo.getExpiredate();
            UFDate innerdate = termVo.getInnerctldeferdays();
            if (innerdate == null) {
                termVo.setInnerctldeferdays(exdate);
            }
        } else if ("accRate".equals(key)) {
            String accRate = termVo.getAccRate();
            UFDouble money = null;
            UFDouble ybje = null;
            double accRateDouble = Double.parseDouble(accRate);
            UFDouble ufAccRate = new UFDouble(accRateDouble);
            if ("DF".equals(jfOrDf)) {
                money = itemVO.getMoney_cr();
                ybje = money.multiply(ufAccRate).div(UFDOUBLE_HUNDRED);
                termVo.setMoney_cr(ybje);
            } else if ("JF".equals(jfOrDf)) {
                money = itemVO.getMoney_de();
                ybje = money.multiply(ufAccRate).div(UFDOUBLE_HUNDRED);
                termVo.setMoney_de(ybje);
            }
            this.getChangeTermVOByMoney(ybje, itemVO, termVo, jfOrDf);
            termVo = this.changeYe(aggvo, termVo);
        }
        return termVo;
    }

    private void getChangeTermVOByMoney(UFDouble ybje, BaseItemVO itemVO, TermVO termVo, String jfOrDf) throws BusinessException {
        UFDouble fbye = null;
        UFDouble bbye = null;
        UFDouble[] yfbs = Currency.computeYFB((String)itemVO.getPk_org(), (int)2, (String)itemVO.getPk_currtype(), (UFDouble)ybje, fbye, bbye, null, (UFDouble)itemVO.getRate(), (UFDate)itemVO.getBilldate());
        bbye = yfbs[2];
        if ("JF".equals(jfOrDf)) {
            termVo.setLocal_money_de(bbye);
        } else if ("DF".equals(jfOrDf)) {
            termVo.setLocal_money_cr(bbye);
        }
        UFDouble[] group_global = Currency.computeGroupGlobalAmount((UFDouble)ybje, (UFDouble)bbye, (String)itemVO.getPk_currtype(), (UFDate)itemVO.getBilldate(), (String)itemVO.getPk_org(), (String)itemVO.getPk_group(), (UFDouble)itemVO.getGlobalrate(), (UFDouble)itemVO.getGrouprate());
        termVo.setGroupcredit(group_global[0]);
        termVo.setGlobalcredit(group_global[1]);
        termVo.setGroupbalance(group_global[0]);
        termVo.setGlobalbalance(group_global[1]);
    }

    private TermVO changeYe(BaseAggVO aggvo, TermVO termVo) throws BusinessException {
        String strDjdl = aggvo.getHeadVO().getBillclass();
        UFDouble ybye = new UFDouble(0.0);
        UFDouble bbye = new UFDouble(0.0);
        UFDouble shlye = new UFDouble(0.0);
        String strybje = "";
        String strbbje = "";
        String strShuL = "";
        if (strDjdl.equals("yf") || strDjdl.equals("sk") || strDjdl.equals("sj") || strDjdl.equals("ws")) {
            strybje = "money_cr";
            strbbje = "local_money_cr";
            strShuL = "quantity_cr";
        } else if (strDjdl.equals("ys") || strDjdl.equals("fk") || strDjdl.equals("ss") || strDjdl.equals("fj") || strDjdl.equals("wf")) {
            strybje = "money_de";
            strbbje = "local_money_de";
            strShuL = "quantity_de";
        }
        ybye = termVo.getAttributeValue(strybje) == null ? new UFDouble(0.0) : termVo.getAttributeValue(strybje);
        bbye = (UFDouble)termVo.getAttributeValue(strbbje);
        shlye = (UFDouble)termVo.getAttributeValue(strShuL);
        termVo.setAttributeValue("money_bal", (Object)ybye);
        termVo.setAttributeValue("local_money_bal", (Object)bbye);
        termVo.setAttributeValue("quantity_bal", (Object)shlye);
        return termVo;
    }
}

