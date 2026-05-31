/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.framework.exception.ComponentException
 *  nc.bs.logging.Logger
 *  nc.pubitf.uapbd.IMaterialPubService
 *  nc.pubitf.uapbd.MeasdocUtil
 *  nc.pubitf.uapbd.PriceAccuracyUtil
 *  nc.pubitf.uapbd.PriceAccuracyValuePair
 *  nc.vo.arap.debttransfer.DebtTransferVO
 *  nc.vo.arap.verify.VerifyDetailVO
 *  nc.vo.arap.verify.VerifyMainVO
 *  nc.vo.bd.currtype.CurrtypeVO
 *  nc.vo.bd.material.MaterialVO
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFDouble
 *  nc.vo.pubapp.pattern.exception.ExceptionUtils
 *  nccloud.commons.lang.StringUtils
 *  nccloud.pubitf.arap.arappub.IArapBillPubUtilService
 */
package nc.web.arap.util;

import java.util.HashMap;
import java.util.Map;
import nc.bs.framework.common.NCLocator;
import nc.bs.framework.exception.ComponentException;
import nc.bs.logging.Logger;
import nc.pubitf.uapbd.IMaterialPubService;
import nc.pubitf.uapbd.MeasdocUtil;
import nc.pubitf.uapbd.PriceAccuracyUtil;
import nc.pubitf.uapbd.PriceAccuracyValuePair;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.arap.debttransfer.DebtTransferVO;
import nc.vo.arap.utils.StringUtil;
import nc.vo.arap.verify.VerifyDetailVO;
import nc.vo.arap.verify.VerifyMainVO;
import nc.vo.bd.currtype.CurrtypeVO;
import nc.vo.bd.material.MaterialVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nccloud.commons.lang.StringUtils;
import nccloud.pubitf.arap.arappub.IArapBillPubUtilService;

public class VerifyVOScaleUtil {
    public BaseAggVO[] verifyVOScale(BaseAggVO[] bills) throws BusinessException {
        int[] currDigitAndRoundtype;
        String pkCurrtype;
        String pk_group;
        String pk_org;
        HashMap map = new HashMap();
        map.put("moneyFieldList", new HashMap());
        map.put("localMoneyFieldList", new HashMap());
        map.put("groupMoneyFieldList", new HashMap());
        map.put("globalMoneyFieldList", new HashMap());
        map.put("rateFieldList", new HashMap());
        map.put("groupRateFieldList", new HashMap());
        map.put("globalRateFieldList", new HashMap());
        map.put("quantityFieldList", new HashMap());
        map.put("priceFieldList", new HashMap());
        map.put("localPriceFieldList", new HashMap());
        HashMap<String, int[]> rateMap = new HashMap<String, int[]>();
        rateMap.put("rate", new int[]{2, 0});
        map.put("rateFieldList", rateMap);
        map.put("postunitFieldList", new HashMap());
        IArapBillPubUtilService arapBillPubUtilService = VerifyVOScaleUtil.getIArapBillPubUtilService();
        for (BaseAggVO baseAggVO : bills) {
            BaseItemVO[] items;
            int[] orgCurrDigitAndRoundtype;
            pk_org = baseAggVO.getHeadVO().getPk_org();
            pk_group = baseAggVO.getHeadVO().getPk_group();
            pkCurrtype = baseAggVO.getHeadVO().getPk_currtype();
            if (!((HashMap)map.get("moneyFieldList")).containsKey(pkCurrtype)) {
                currDigitAndRoundtype = arapBillPubUtilService.getCurrDigitAndRoundtype(pkCurrtype);
                ((HashMap)map.get("moneyFieldList")).put(pkCurrtype, currDigitAndRoundtype);
            }
            if (!((HashMap)map.get("localMoneyFieldList")).containsKey(pk_org)) {
                CurrtypeVO orgCurrtypeVO = arapBillPubUtilService.getDefaultCurrtypeByOrgID(pk_org);
                String string = orgCurrtypeVO.getPk_currtype();
                orgCurrDigitAndRoundtype = arapBillPubUtilService.getCurrDigitAndRoundtype(string);
                ((HashMap)map.get("localMoneyFieldList")).put(pk_org, orgCurrDigitAndRoundtype);
            }
            if (!((HashMap)map.get("groupMoneyFieldList")).containsKey(pk_group)) {
                CurrtypeVO groupCurrtypeVO = arapBillPubUtilService.getDefaultCurrtypeByOrgID(pk_group);
                String string = groupCurrtypeVO.getPk_currtype();
                orgCurrDigitAndRoundtype = arapBillPubUtilService.getCurrDigitAndRoundtype(string);
                ((HashMap)map.get("groupMoneyFieldList")).put(pk_group, orgCurrDigitAndRoundtype);
            }
            if (!((HashMap)map.get("globalMoneyFieldList")).containsKey("globeCurrtype")) {
                CurrtypeVO globeCurrtypeVO = arapBillPubUtilService.getGlobeDefaultCurrtype();
                String string = globeCurrtypeVO.getPk_currtype();
                int[] globeCurrDigitAndRoundtype = arapBillPubUtilService.getCurrDigitAndRoundtype(string);
                ((HashMap)map.get("globalMoneyFieldList")).put("globeCurrtype", globeCurrDigitAndRoundtype);
            }
            if (!((HashMap)map.get("rateFieldList")).containsKey(pk_org + pkCurrtype)) {
                int rateDigit = arapBillPubUtilService.getRateDigit(pk_org, pkCurrtype);
                int[] nArray = new int[]{rateDigit, 0};
                ((HashMap)map.get("rateFieldList")).put(pk_org + pkCurrtype, nArray);
            }
            if (!((HashMap)map.get("groupRateFieldList")).containsKey(pk_group + pk_org + pkCurrtype)) {
                int groupRateDigit = arapBillPubUtilService.getGroupRateDigit(pk_org, pk_group, pkCurrtype);
                int[] nArray = new int[]{groupRateDigit, 0};
                ((HashMap)map.get("groupRateFieldList")).put(pk_group + pk_org + pkCurrtype, nArray);
            }
            if (!((HashMap)map.get("globalRateFieldList")).containsKey("globalRate" + pkCurrtype)) {
                int globalRateDigit = arapBillPubUtilService.getGlobalRateDigit(pk_org, pkCurrtype);
                int[] nArray = new int[]{globalRateDigit, 0};
                ((HashMap)map.get("globalRateFieldList")).put("globalRate" + pkCurrtype, nArray);
            }
            for (BaseItemVO baseItemVO : items = baseAggVO.getItems()) {
                CurrtypeVO currtypeVO;
                if (baseItemVO.getMaterial() != null && !((HashMap)map.get("quantityFieldList")).containsKey(baseItemVO.getMaterial())) {
                    int[] materialScale = this.getUnitScaleFromSource(baseItemVO.getMaterial());
                    ((HashMap)map.get("quantityFieldList")).put(baseItemVO.getMaterial(), materialScale);
                }
                if (!((HashMap)map.get("priceFieldList")).containsKey(baseItemVO.getPk_currtype()) && (currtypeVO = arapBillPubUtilService.getCurrInfo(baseItemVO.getPk_currtype())) != null) {
                    int[] currDigitAndRoundtype2 = new int[]{currtypeVO.getUnitcurrdigit(), currtypeVO.getUnitroundtype()};
                    ((HashMap)map.get("priceFieldList")).put(baseItemVO.getPk_currtype(), currDigitAndRoundtype2);
                }
                if (!((HashMap)map.get("localPriceFieldList")).containsKey(pk_org)) {
                    int currDigitAndRoundtype3 = arapBillPubUtilService.getRateDigit(pk_org, baseItemVO.getPk_currtype());
                    ((HashMap)map.get("localPriceFieldList")).put(pk_org, new int[]{currDigitAndRoundtype3});
                }
                if (((HashMap)map.get("postunitFieldList")).containsKey(baseItemVO.getPostunit())) continue;
                int[] currDigitAndRoundtype4 = this.getPostunitFromSource(baseItemVO.getPostunit());
                ((HashMap)map.get("postunitFieldList")).put(baseItemVO.getPostunit(), currDigitAndRoundtype4);
            }
        }
        for (BaseAggVO baseAggVO : bills) {
            BaseItemVO[] items;
            UFDouble money;
            pk_org = baseAggVO.getHeadVO().getPk_org();
            pk_group = baseAggVO.getHeadVO().getPk_group();
            pkCurrtype = baseAggVO.getHeadVO().getPk_currtype();
            currDigitAndRoundtype = (int[])((HashMap)map.get("moneyFieldList")).get(pkCurrtype);
            int[] nArray = (int[])((HashMap)map.get("localMoneyFieldList")).get(pk_org);
            int[] groupCurrDigitAndRoundtype = (int[])((HashMap)map.get("groupMoneyFieldList")).get(pk_group);
            int[] globeCurrDigitAndRoundtype = (int[])((HashMap)map.get("globalMoneyFieldList")).get("globeCurrtype");
            int[] rateDigitAndRoundtype = (int[])((HashMap)map.get("rateFieldList")).get(pk_org + pkCurrtype);
            int[] groupDigitAndRoundtype = (int[])((HashMap)map.get("groupRateFieldList")).get(pk_group + pk_org + pkCurrtype);
            int[] globalRateDigitAndRoundtype = (int[])((HashMap)map.get("globalRateFieldList")).get("globalRate" + pkCurrtype);
            HashMap quantityFieldListMap = (HashMap)map.get("quantityFieldList");
            if (globeCurrDigitAndRoundtype != null && globeCurrDigitAndRoundtype.length > 1) {
                money = baseAggVO.getHeadVO().getGloballocal().setScale(globeCurrDigitAndRoundtype[0], globeCurrDigitAndRoundtype[1]);
                baseAggVO.getHeadVO().setGloballocal(money);
            }
            if (groupCurrDigitAndRoundtype != null && groupCurrDigitAndRoundtype.length > 1) {
                money = baseAggVO.getHeadVO().getMoney().setScale(groupCurrDigitAndRoundtype[0], groupCurrDigitAndRoundtype[1]);
                baseAggVO.getHeadVO().setGrouplocal(money);
            }
            if (nArray != null && nArray.length > 1) {
                UFDouble local_money = baseAggVO.getHeadVO().getLocal_money().setScale(nArray[0], nArray[1]);
                baseAggVO.getHeadVO().setLocal_money(local_money);
            }
            if (currDigitAndRoundtype != null && currDigitAndRoundtype.length > 1) {
                money = baseAggVO.getHeadVO().getMoney().setScale(currDigitAndRoundtype[0], currDigitAndRoundtype[1]);
                baseAggVO.getHeadVO().setMoney(money);
            }
            UFDouble globalRate = baseAggVO.getHeadVO().getGlobalrate().setScale(globalRateDigitAndRoundtype[0], globalRateDigitAndRoundtype[1]);
            baseAggVO.getHeadVO().setGlobalrate(globalRate);
            UFDouble groupRate = baseAggVO.getHeadVO().getGrouprate().setScale(groupDigitAndRoundtype[0], groupDigitAndRoundtype[1]);
            baseAggVO.getHeadVO().setGrouprate(groupRate);
            UFDouble rate = baseAggVO.getHeadVO().getRate().setScale(rateDigitAndRoundtype[0], rateDigitAndRoundtype[1]);
            baseAggVO.getHeadVO().setRate(rate);
            for (BaseItemVO baseItemVO : items = baseAggVO.getItems()) {
                int[] postunitDigitAndRound;
                int[] rateDigitAndRound;
                int[] localPriceDigitAndRoundtype;
                int[] priceDigitAndRoundtype;
                int[] quantityDigitAndRoundtype;
                String pkItemCurrtype = baseItemVO.getPk_currtype();
                int[] currItemDigitAndRoundtype = arapBillPubUtilService.getCurrDigitAndRoundtype(pkItemCurrtype);
                if (currItemDigitAndRoundtype != null && currItemDigitAndRoundtype.length > 1) {
                    if (baseItemVO.getMoney_bal() != null) {
                        UFDouble money_bal = baseItemVO.getMoney_bal().setScale(currItemDigitAndRoundtype[0], currItemDigitAndRoundtype[1]);
                        baseItemVO.setMoney_bal(money_bal);
                    }
                    if (baseItemVO.getMoney_de() != null) {
                        UFDouble money_de = baseItemVO.getMoney_de().setScale(currItemDigitAndRoundtype[0], currItemDigitAndRoundtype[1]);
                        baseItemVO.setMoney_de(money_de);
                    }
                    if (baseItemVO.getMoney_cr() != null) {
                        UFDouble money_cr = baseItemVO.getMoney_cr().setScale(currItemDigitAndRoundtype[0], currItemDigitAndRoundtype[1]);
                        baseItemVO.setMoney_cr(money_cr);
                    }
                    if (baseItemVO.getNotax_de() != null) {
                        UFDouble notax_de = baseItemVO.getNotax_de().setScale(currItemDigitAndRoundtype[0], currItemDigitAndRoundtype[1]);
                        baseItemVO.setNotax_de(notax_de);
                    }
                    if (baseItemVO.getNotax_cr() != null) {
                        UFDouble notax_cr = baseItemVO.getNotax_cr().setScale(currItemDigitAndRoundtype[0], currItemDigitAndRoundtype[1]);
                        baseItemVO.setNotax_cr(notax_cr);
                    }
                    if (baseItemVO.getOccupationmny() != null) {
                        UFDouble occupationmny = baseItemVO.getOccupationmny().setScale(currItemDigitAndRoundtype[0], currItemDigitAndRoundtype[1]);
                        baseItemVO.setOccupationmny(occupationmny);
                    }
                    if (baseItemVO.getSettlemoney() != null) {
                        UFDouble settlemoney = baseItemVO.getSettlemoney().setScale(currItemDigitAndRoundtype[0], currItemDigitAndRoundtype[1]);
                        baseItemVO.setSettlemoney(settlemoney);
                    }
                    if (baseItemVO.getNosubtax() != null) {
                        UFDouble nosubtax = baseItemVO.getNosubtax().setScale(currItemDigitAndRoundtype[0], currItemDigitAndRoundtype[1]);
                        baseItemVO.setSettlemoney(nosubtax);
                    }
                }
                if (nArray != null && nArray.length > 1) {
                    if (baseItemVO.getLocal_money_bal() != null) {
                        UFDouble local_money_bal = baseItemVO.getLocal_money_bal().setScale(nArray[0], nArray[1]);
                        baseItemVO.setLocal_money_bal(local_money_bal);
                    }
                    if (baseItemVO.getLocal_money_de() != null) {
                        UFDouble local_money_de = baseItemVO.getLocal_money_de().setScale(nArray[0], nArray[1]);
                        baseItemVO.setLocal_money_de(local_money_de);
                    }
                    if (baseItemVO.getLocal_money_cr() != null) {
                        UFDouble local_money_cr = baseItemVO.getLocal_money_cr().setScale(nArray[0], nArray[1]);
                        baseItemVO.setLocal_money_cr(local_money_cr);
                    }
                    if (baseItemVO.getLocal_notax_de() != null) {
                        UFDouble local_notax_de = baseItemVO.getLocal_notax_de().setScale(nArray[0], nArray[1]);
                        baseItemVO.setLocal_notax_de(local_notax_de);
                    }
                    if (baseItemVO.getLocal_notax_cr() != null) {
                        UFDouble local_notax_cr = baseItemVO.getLocal_notax_cr().setScale(nArray[0], nArray[1]);
                        baseItemVO.setLocal_notax_cr(local_notax_cr);
                    }
                    if (baseItemVO.getLocal_tax_de() != null) {
                        UFDouble local_tax_de = baseItemVO.getLocal_tax_de().setScale(nArray[0], nArray[1]);
                        baseItemVO.setLocal_tax_de(local_tax_de);
                    }
                    if (baseItemVO.getLocal_tax_cr() != null) {
                        UFDouble local_tax_cr = baseItemVO.getLocal_tax_cr().setScale(nArray[0], nArray[1]);
                        baseItemVO.setLocal_tax_cr(local_tax_cr);
                    }
                    if (baseItemVO.getCaltaxmny() != null) {
                        UFDouble caltaxmny = baseItemVO.getCaltaxmny().setScale(nArray[0], nArray[1]);
                        baseItemVO.setCaltaxmny(caltaxmny);
                    }
                }
                if (groupCurrDigitAndRoundtype != null && groupCurrDigitAndRoundtype.length > 1) {
                    if (baseItemVO.getGroupbalance() != null) {
                        UFDouble groupbalance = baseItemVO.getGroupbalance().setScale(groupCurrDigitAndRoundtype[0], groupCurrDigitAndRoundtype[1]);
                        baseItemVO.setGroupbalance(groupbalance);
                    }
                    if (baseItemVO.getGroupdebit() != null) {
                        UFDouble groupdebit = baseItemVO.getGroupdebit().setScale(groupCurrDigitAndRoundtype[0], groupCurrDigitAndRoundtype[1]);
                        baseItemVO.setGroupdebit(groupdebit);
                    }
                    if (baseItemVO.getGroupcrebit() != null) {
                        UFDouble groupcrebit = baseItemVO.getGroupcrebit().setScale(groupCurrDigitAndRoundtype[0], groupCurrDigitAndRoundtype[1]);
                        baseItemVO.setGroupcrebit(groupcrebit);
                    }
                    if (baseItemVO.getGroupnotax_de() != null) {
                        UFDouble groupnotax_de = baseItemVO.getGroupnotax_de().setScale(groupCurrDigitAndRoundtype[0], groupCurrDigitAndRoundtype[1]);
                        baseItemVO.setGroupnotax_de(groupnotax_de);
                    }
                    if (baseItemVO.getGroupnotax_cre() != null) {
                        UFDouble groupnotax_cre = baseItemVO.getGroupnotax_cre().setScale(groupCurrDigitAndRoundtype[0], groupCurrDigitAndRoundtype[1]);
                        baseItemVO.setGroupnotax_cre(groupnotax_cre);
                    }
                    if (baseItemVO.getGroupagentreceivelocal() != null) {
                        UFDouble groupagentreceivelocal = baseItemVO.getGroupagentreceivelocal().setScale(groupCurrDigitAndRoundtype[0], groupCurrDigitAndRoundtype[1]);
                        baseItemVO.setGroupagentreceivelocal(groupagentreceivelocal);
                    }
                    if (baseItemVO.getGrouptax_de() != null) {
                        UFDouble grouptax_de = baseItemVO.getGrouptax_de().setScale(groupCurrDigitAndRoundtype[0], groupCurrDigitAndRoundtype[1]);
                        baseItemVO.setGrouptax_de(grouptax_de);
                    }
                    if (baseItemVO.getGrouptax_cre() != null) {
                        UFDouble grouptax_cre = baseItemVO.getGrouptax_cre().setScale(groupCurrDigitAndRoundtype[0], groupCurrDigitAndRoundtype[1]);
                        baseItemVO.setGrouptax_cre(grouptax_cre);
                    }
                }
                if (globeCurrDigitAndRoundtype != null && globeCurrDigitAndRoundtype.length > 1) {
                    if (baseItemVO.getGlobalbalance() != null) {
                        UFDouble globalbalance = baseItemVO.getGlobalbalance().setScale(globeCurrDigitAndRoundtype[0], globeCurrDigitAndRoundtype[1]);
                        baseItemVO.setGlobalbalance(globalbalance);
                    }
                    if (baseItemVO.getGlobaldebit() != null) {
                        UFDouble globaldebit = baseItemVO.getGlobaldebit().setScale(globeCurrDigitAndRoundtype[0], globeCurrDigitAndRoundtype[1]);
                        baseItemVO.setGlobaldebit(globaldebit);
                    }
                    if (baseItemVO.getGlobalcrebit() != null) {
                        UFDouble globalcrebit = baseItemVO.getGlobalcrebit().setScale(globeCurrDigitAndRoundtype[0], globeCurrDigitAndRoundtype[1]);
                        baseItemVO.setGlobalcrebit(globalcrebit);
                    }
                    if (baseItemVO.getGlobalnotax_de() != null) {
                        UFDouble globalnotax_de = baseItemVO.getGlobalnotax_de().setScale(globeCurrDigitAndRoundtype[0], globeCurrDigitAndRoundtype[1]);
                        baseItemVO.setGlobalnotax_de(globalnotax_de);
                    }
                    if (baseItemVO.getGlobalnotax_cre() != null) {
                        UFDouble globalnotax_cre = baseItemVO.getGlobalnotax_cre().setScale(globeCurrDigitAndRoundtype[0], globeCurrDigitAndRoundtype[1]);
                        baseItemVO.setGlobalnotax_cre(globalnotax_cre);
                    }
                    if (baseItemVO.getGlobalagentreceivelocal() != null) {
                        UFDouble globalagentreceivelocal = baseItemVO.getGlobalagentreceivelocal().setScale(globeCurrDigitAndRoundtype[0], globeCurrDigitAndRoundtype[1]);
                        baseItemVO.setGlobalagentreceivelocal(globalagentreceivelocal);
                    }
                    if (baseItemVO.getGlobaltax_de() != null) {
                        UFDouble globaltax_de = baseItemVO.getGlobaltax_de().setScale(globeCurrDigitAndRoundtype[0], globeCurrDigitAndRoundtype[1]);
                        baseItemVO.setGlobaltax_de(globaltax_de);
                    }
                    if (baseItemVO.getGlobaltax_cre() != null) {
                        UFDouble globaltax_cre = baseItemVO.getGlobaltax_cre().setScale(globeCurrDigitAndRoundtype[0], globeCurrDigitAndRoundtype[1]);
                        baseItemVO.setGlobaltax_cre(globaltax_cre);
                    }
                }
                if (rateDigitAndRoundtype != null && rateDigitAndRoundtype.length > 1) {
                    if (baseItemVO.getRate() != null) {
                        UFDouble itemRate = baseItemVO.getRate().setScale(rateDigitAndRoundtype[0], rateDigitAndRoundtype[1]);
                        baseItemVO.setRate(itemRate);
                    }
                    if (baseItemVO.getGrouprate() != null) {
                        UFDouble itemGrouprate = baseItemVO.getGrouprate().setScale(groupDigitAndRoundtype[0], groupDigitAndRoundtype[1]);
                        baseItemVO.setGrouprate(itemGrouprate);
                    }
                    if (baseItemVO.getGlobalrate() != null) {
                        UFDouble itemGlobalrate = baseItemVO.getGlobalrate().setScale(globalRateDigitAndRoundtype[0], globalRateDigitAndRoundtype[1]);
                        baseItemVO.setGlobalrate(itemGlobalrate);
                    }
                }
                if ((quantityDigitAndRoundtype = (int[])quantityFieldListMap.get(baseItemVO.getMaterial())) != null && quantityDigitAndRoundtype.length > 1) {
                    if (baseItemVO.getQuantity_bal() != null && quantityDigitAndRoundtype != null && quantityDigitAndRoundtype.length > 1) {
                        UFDouble quantity_bal = baseItemVO.getQuantity_bal().setScale(quantityDigitAndRoundtype[0], quantityDigitAndRoundtype[1]);
                        baseItemVO.setQuantity_bal(quantity_bal);
                    }
                    if (baseItemVO.getQuantity_de() != null) {
                        UFDouble quantity_de = baseItemVO.getQuantity_de().setScale(quantityDigitAndRoundtype[0], quantityDigitAndRoundtype[1]);
                        baseItemVO.setQuantity_de(quantity_de);
                    }
                    if (baseItemVO.getQuantity_cr() != null && quantityDigitAndRoundtype != null) {
                        UFDouble quantity_cr = baseItemVO.getQuantity_cr().setScale(quantityDigitAndRoundtype[0], quantityDigitAndRoundtype[1]);
                        baseItemVO.setQuantity_cr(quantity_cr);
                    }
                }
                if ((priceDigitAndRoundtype = (int[])((HashMap)map.get("priceFieldList")).get(pkItemCurrtype)) != null && priceDigitAndRoundtype.length > 1) {
                    if (baseItemVO.getPrice() != null) {
                        UFDouble price = baseItemVO.getPrice().setScale(priceDigitAndRoundtype[0], priceDigitAndRoundtype[1]);
                        baseItemVO.setPrice(price);
                    }
                    if (baseItemVO.getTaxprice() != null) {
                        UFDouble taxprice = baseItemVO.getTaxprice().setScale(priceDigitAndRoundtype[0], priceDigitAndRoundtype[1]);
                        baseItemVO.setTaxprice(taxprice);
                    }
                    if (baseItemVO.getPostpricenotax() != null) {
                        UFDouble postpricenotax = baseItemVO.getPostpricenotax().setScale(priceDigitAndRoundtype[0], priceDigitAndRoundtype[1]);
                        baseItemVO.setPostpricenotax(postpricenotax);
                    }
                    if (baseItemVO.getPostprice() != null) {
                        UFDouble postprice = baseItemVO.getPostprice().setScale(priceDigitAndRoundtype[0], priceDigitAndRoundtype[1]);
                        baseItemVO.setPostprice(postprice);
                    }
                }
                if ((localPriceDigitAndRoundtype = (int[])((HashMap)map.get("localPriceFieldList")).get(pk_org)) != null && localPriceDigitAndRoundtype.length > 1) {
                    if (baseItemVO.getLocal_price() != null) {
                        UFDouble local_price = baseItemVO.getLocal_price().setScale(localPriceDigitAndRoundtype[0], localPriceDigitAndRoundtype[1]);
                        baseItemVO.setLocal_price(local_price);
                    }
                    if (baseItemVO.getLocal_taxprice() != null) {
                        UFDouble local_taxprice = baseItemVO.getLocal_taxprice().setScale(localPriceDigitAndRoundtype[0], localPriceDigitAndRoundtype[1]);
                        baseItemVO.setLocal_taxprice(local_taxprice);
                    }
                }
                if ((rateDigitAndRound = (int[])((HashMap)map.get("rateFieldList")).get("rate")) != null && rateDigitAndRound.length > 1) {
                    if (baseItemVO.getTaxrate() != null) {
                        UFDouble taxrate = baseItemVO.getTaxrate().setScale(rateDigitAndRound[0], rateDigitAndRound[1]);
                        baseItemVO.setTaxrate(taxrate);
                    }
                    if (baseItemVO.getNosubtaxrate() != null) {
                        UFDouble nosubtaxrate = baseItemVO.getNosubtaxrate().setScale(rateDigitAndRound[0], rateDigitAndRound[1]);
                        baseItemVO.setNosubtaxrate(nosubtaxrate);
                    }
                }
                if ((postunitDigitAndRound = (int[])((HashMap)map.get("postunitFieldList")).get(baseItemVO.getPostunit())) == null || postunitDigitAndRound.length <= 1 || baseItemVO.getPostquantity() == null) continue;
                UFDouble postquantity = baseItemVO.getPostquantity().setScale(postunitDigitAndRound[0], postunitDigitAndRound[1]);
                baseItemVO.setPostquantity(postquantity);
            }
        }
        return bills;
    }

    public VerifyMainVO[] verifyMainVOScale(VerifyMainVO[] bills, String[] materials) throws BusinessException {
        String pkCrCurrtype;
        String pkDeCurrtype;
        String pk_org;
        String material;
        VerifyMainVO baseAggVO;
        int i;
        HashMap map = new HashMap();
        map.put("moneyFieldList", new HashMap());
        map.put("localMoneyFieldList", new HashMap());
        map.put("quantityFieldList", new HashMap());
        IArapBillPubUtilService arapBillPubUtilService = VerifyVOScaleUtil.getIArapBillPubUtilService();
        for (i = 0; i < bills.length; ++i) {
            int[] orgCurrDigitAndRoundtype;
            String orgCurrtype;
            CurrtypeVO orgCurrtypeVO;
            baseAggVO = bills[i];
            material = materials[i];
            pk_org = baseAggVO.getPk_org();
            pkDeCurrtype = baseAggVO.getPk_currtype_de();
            if (pkDeCurrtype == null || "".equals(pkDeCurrtype)) {
                pkDeCurrtype = baseAggVO.getPk_currtype_cr();
            }
            if (!((HashMap)map.get("moneyFieldList")).containsKey(pkDeCurrtype)) {
                int[] currDigitAndRoundtype = arapBillPubUtilService.getCurrDigitAndRoundtype(pkDeCurrtype);
                ((HashMap)map.get("moneyFieldList")).put(pkDeCurrtype, currDigitAndRoundtype);
            }
            if ((pkCrCurrtype = baseAggVO.getPk_currtype_cr()) == null || "".equals(pkCrCurrtype)) {
                pkCrCurrtype = baseAggVO.getPk_currtype_de();
            }
            if (!((HashMap)map.get("moneyFieldList")).containsKey(pkCrCurrtype)) {
                int[] currDigitAndRoundtype = arapBillPubUtilService.getCurrDigitAndRoundtype(pkCrCurrtype);
                ((HashMap)map.get("moneyFieldList")).put(pkCrCurrtype, currDigitAndRoundtype);
            }
            if (!((HashMap)map.get("localMoneyFieldList")).containsKey(pk_org + pkCrCurrtype)) {
                orgCurrtypeVO = arapBillPubUtilService.getDefaultCurrtypeByOrgID(pk_org);
                orgCurrtype = orgCurrtypeVO.getPk_currtype();
                orgCurrDigitAndRoundtype = arapBillPubUtilService.getCurrDigitAndRoundtype(orgCurrtype);
                ((HashMap)map.get("localMoneyFieldList")).put(pk_org + pkCrCurrtype, orgCurrDigitAndRoundtype);
            }
            if (!((HashMap)map.get("localMoneyFieldList")).containsKey(pk_org + pkDeCurrtype)) {
                orgCurrtypeVO = arapBillPubUtilService.getDefaultCurrtypeByOrgID(pk_org);
                orgCurrtype = orgCurrtypeVO.getPk_currtype();
                orgCurrDigitAndRoundtype = arapBillPubUtilService.getCurrDigitAndRoundtype(orgCurrtype);
                ((HashMap)map.get("localMoneyFieldList")).put(pk_org + pkDeCurrtype, orgCurrDigitAndRoundtype);
            }
            if (!StringUtils.isNotBlank((CharSequence)material) || ((HashMap)map.get("quantityFieldList")).containsKey(material)) continue;
            int[] materialScale = this.getUnitScaleFromSource(material);
            ((HashMap)map.get("quantityFieldList")).put(material, materialScale);
        }
        for (i = 0; i < bills.length; ++i) {
            baseAggVO = bills[i];
            material = materials[i];
            pk_org = baseAggVO.getPk_org();
            pkDeCurrtype = baseAggVO.getPk_currtype_de();
            if (pkDeCurrtype == null || "".equals(pkDeCurrtype)) {
                pkDeCurrtype = baseAggVO.getPk_currtype_cr();
            }
            if ((pkCrCurrtype = baseAggVO.getPk_currtype_cr()) == null || "".equals(pkCrCurrtype)) {
                pkCrCurrtype = baseAggVO.getPk_currtype_de();
            }
            int[] currDeDigitAndRoundtype = (int[])((HashMap)map.get("moneyFieldList")).get(pkDeCurrtype);
            UFDouble money_de = baseAggVO.getMoney_de().setScale(currDeDigitAndRoundtype[0], currDeDigitAndRoundtype[1]);
            baseAggVO.setMoney_de(money_de);
            int[] currCrDigitAndRoundtype = (int[])((HashMap)map.get("moneyFieldList")).get(pkCrCurrtype);
            UFDouble money_cr = baseAggVO.getMoney_cr().setScale(currCrDigitAndRoundtype[0], currCrDigitAndRoundtype[1]);
            baseAggVO.setMoney_cr(money_cr);
            int[] orgDeCurrDigitAndRoundtype = (int[])((HashMap)map.get("localMoneyFieldList")).get(pk_org + pkDeCurrtype);
            UFDouble local_money_de = baseAggVO.getLocal_money_de().setScale(orgDeCurrDigitAndRoundtype[0], orgDeCurrDigitAndRoundtype[1]);
            baseAggVO.setLocal_money_de(local_money_de);
            int[] orgCrCurrDigitAndRoundtype = (int[])((HashMap)map.get("localMoneyFieldList")).get(pk_org + pkCrCurrtype);
            UFDouble local_money_cr = baseAggVO.getLocal_money_cr().setScale(orgCrCurrDigitAndRoundtype[0], orgCrCurrDigitAndRoundtype[1]);
            baseAggVO.setLocal_money_cr(local_money_cr);
            int[] quantityDigitAndRoundtype = (int[])((HashMap)map.get("quantityFieldList")).get(material);
            if (quantityDigitAndRoundtype == null) continue;
            UFDouble quantity_de = baseAggVO.getQuantity_de().setScale(quantityDigitAndRoundtype[0], quantityDigitAndRoundtype[1]);
            baseAggVO.setQuantity_de(quantity_de);
            UFDouble quantity_cr = baseAggVO.getQuantity_cr().setScale(quantityDigitAndRoundtype[0], quantityDigitAndRoundtype[1]);
            baseAggVO.setQuantity_cr(quantity_cr);
        }
        return bills;
    }

    public VerifyDetailVO[] verifDetailVOScale(VerifyDetailVO[] bills, String pkDeCurrtype, String pkCrCurrtype) throws BusinessException {
        String pk_org;
        String material;
        VerifyDetailVO baseAggVO;
        int i;
        int[] currDigitAndRoundtype;
        HashMap map = new HashMap();
        map.put("moneyFieldList", new HashMap());
        map.put("localMoneyFieldList", new HashMap());
        map.put("quantityFieldList", new HashMap());
        IArapBillPubUtilService arapBillPubUtilService = VerifyVOScaleUtil.getIArapBillPubUtilService();
        if (!((HashMap)map.get("moneyFieldList")).containsKey(pkDeCurrtype)) {
            currDigitAndRoundtype = arapBillPubUtilService.getCurrDigitAndRoundtype(pkDeCurrtype);
            ((HashMap)map.get("moneyFieldList")).put(pkDeCurrtype, currDigitAndRoundtype);
        }
        if (!((HashMap)map.get("moneyFieldList")).containsKey(pkCrCurrtype)) {
            currDigitAndRoundtype = arapBillPubUtilService.getCurrDigitAndRoundtype(pkCrCurrtype);
            ((HashMap)map.get("moneyFieldList")).put(pkCrCurrtype, currDigitAndRoundtype);
        }
        for (i = 0; i < bills.length; ++i) {
            baseAggVO = bills[i];
            material = baseAggVO.getMaterial();
            pk_org = baseAggVO.getPk_org();
            if (!((HashMap)map.get("localMoneyFieldList")).containsKey(pk_org)) {
                CurrtypeVO orgCurrtypeVO = arapBillPubUtilService.getDefaultCurrtypeByOrgID(pk_org);
                String orgCurrtype = orgCurrtypeVO.getPk_currtype();
                int[] orgCurrDigitAndRoundtype = arapBillPubUtilService.getCurrDigitAndRoundtype(orgCurrtype);
                ((HashMap)map.get("localMoneyFieldList")).put(pk_org, orgCurrDigitAndRoundtype);
            }
            if (!StringUtils.isNotBlank((CharSequence)material) || ((HashMap)map.get("quantityFieldList")).containsKey(material)) continue;
            int[] materialScale = this.getUnitScaleFromSource(material);
            ((HashMap)map.get("quantityFieldList")).put(material, materialScale);
        }
        for (i = 0; i < bills.length; ++i) {
            baseAggVO = bills[i];
            material = baseAggVO.getMaterial();
            pk_org = baseAggVO.getPk_org();
            int[] currDeDigitAndRoundtype = (int[])((HashMap)map.get("moneyFieldList")).get(pkDeCurrtype);
            UFDouble money_de = baseAggVO.getMoney_de().setScale(currDeDigitAndRoundtype[0], currDeDigitAndRoundtype[1]);
            baseAggVO.setMoney_de(money_de);
            int[] currCrDigitAndRoundtype = (int[])((HashMap)map.get("moneyFieldList")).get(pkCrCurrtype);
            UFDouble money_cr = baseAggVO.getMoney_cr().setScale(currCrDigitAndRoundtype[0], currCrDigitAndRoundtype[1]);
            baseAggVO.setMoney_cr(money_cr);
            int[] orgCurrDigitAndRoundtype = (int[])((HashMap)map.get("localMoneyFieldList")).get(pk_org);
            UFDouble local_money_de = baseAggVO.getLocal_money_de().setScale(orgCurrDigitAndRoundtype[0], orgCurrDigitAndRoundtype[1]);
            baseAggVO.setLocal_money_de(local_money_de);
            UFDouble local_money_cr = baseAggVO.getLocal_money_cr().setScale(orgCurrDigitAndRoundtype[0], orgCurrDigitAndRoundtype[1]);
            baseAggVO.setLocal_money_cr(local_money_cr);
            int[] quantityDigitAndRoundtype = (int[])((HashMap)map.get("quantityFieldList")).get(material);
            if (quantityDigitAndRoundtype == null) continue;
            UFDouble quantity_de = baseAggVO.getQuantity_de().setScale(quantityDigitAndRoundtype[0], quantityDigitAndRoundtype[1]);
            baseAggVO.setQuantity_de(quantity_de);
            UFDouble quantity_cr = baseAggVO.getQuantity_cr().setScale(quantityDigitAndRoundtype[0], quantityDigitAndRoundtype[1]);
            baseAggVO.setQuantity_cr(quantity_cr);
        }
        return bills;
    }

    public DebtTransferVO[] verifyDebtTransferVOScale(DebtTransferVO[] bills) throws BusinessException {
        String pkCurrtype;
        String pk_org;
        HashMap map = new HashMap();
        map.put("moneyFieldList", new HashMap());
        map.put("localMoneyFieldList", new HashMap());
        map.put("rateFieldList", new HashMap());
        HashMap<String, int[]> rateMap = new HashMap<String, int[]>();
        rateMap.put("rate", new int[]{2, 0});
        map.put("rateFieldList", rateMap);
        HashMap<String, int[]> quantityMap = new HashMap<String, int[]>();
        quantityMap.put("quantity", new int[]{2, 0});
        map.put("quantityFieldList", quantityMap);
        IArapBillPubUtilService arapBillPubUtilService = VerifyVOScaleUtil.getIArapBillPubUtilService();
        for (DebtTransferVO baseAggVO : bills) {
            pk_org = baseAggVO.getPk_org();
            pkCurrtype = baseAggVO.getPk_currtype();
            if (!((HashMap)map.get("moneyFieldList")).containsKey(pkCurrtype)) {
                int[] currDigitAndRoundtype = arapBillPubUtilService.getCurrDigitAndRoundtype(pkCurrtype);
                ((HashMap)map.get("moneyFieldList")).put(pkCurrtype, currDigitAndRoundtype);
            }
            if (!((HashMap)map.get("localMoneyFieldList")).containsKey(pk_org)) {
                CurrtypeVO orgCurrtypeVO = arapBillPubUtilService.getDefaultCurrtypeByOrgID(pk_org);
                String orgCurrtype = orgCurrtypeVO.getPk_currtype();
                int[] orgCurrDigitAndRoundtype = arapBillPubUtilService.getCurrDigitAndRoundtype(orgCurrtype);
                ((HashMap)map.get("localMoneyFieldList")).put(pk_org, orgCurrDigitAndRoundtype);
            }
            if (((HashMap)map.get("rateFieldList")).containsKey(pk_org + pkCurrtype)) continue;
            int rateDigit = arapBillPubUtilService.getRateDigit(pk_org, pkCurrtype);
            int[] rate = new int[]{rateDigit, 0};
            ((HashMap)map.get("rateFieldList")).put(pk_org + pkCurrtype, rate);
        }
        for (DebtTransferVO baseAggVO : bills) {
            pk_org = baseAggVO.getPk_org();
            pkCurrtype = baseAggVO.getPk_currtype();
            int[] currDigitAndRoundtype = (int[])((HashMap)map.get("moneyFieldList")).get(pkCurrtype);
            int[] orgCurrDigitAndRoundtype = (int[])((HashMap)map.get("localMoneyFieldList")).get(pk_org);
            int[] rateDigitAndRoundtype = (int[])((HashMap)map.get("rateFieldList")).get(pk_org + pkCurrtype);
            HashMap quantityFieldListMap = (HashMap)map.get("quantityFieldList");
            int[] quantityDigitAndRoundtype = (int[])quantityFieldListMap.get("quantityFieldList");
            if (currDigitAndRoundtype != null && currDigitAndRoundtype.length > 1) {
                if (baseAggVO.getMoney() != null) {
                    UFDouble money = baseAggVO.getMoney().setScale(currDigitAndRoundtype[0], currDigitAndRoundtype[1]);
                    baseAggVO.setMoney(money);
                }
                if (baseAggVO.getSum_money() != null) {
                    UFDouble sum_money = baseAggVO.getSum_money().setScale(currDigitAndRoundtype[0], currDigitAndRoundtype[1]);
                    baseAggVO.setSum_money(sum_money);
                }
            }
            if (orgCurrDigitAndRoundtype != null && orgCurrDigitAndRoundtype.length > 1) {
                if (baseAggVO.getLocal_money() != null) {
                    UFDouble local_money = baseAggVO.getLocal_money().setScale(orgCurrDigitAndRoundtype[0], orgCurrDigitAndRoundtype[1]);
                    baseAggVO.setLocal_money(local_money);
                }
                if (baseAggVO.getSum_local_money() != null) {
                    UFDouble sum_local_money = baseAggVO.getSum_local_money().setScale(orgCurrDigitAndRoundtype[0], orgCurrDigitAndRoundtype[1]);
                    baseAggVO.setSum_local_money(sum_local_money);
                }
            }
            if (quantityDigitAndRoundtype != null && quantityDigitAndRoundtype.length > 1) {
                UFDouble quantity = baseAggVO.getQuantity().setScale(quantityDigitAndRoundtype[0], quantityDigitAndRoundtype[1]);
                baseAggVO.setQuantity(quantity);
            }
            if (rateDigitAndRoundtype == null || rateDigitAndRoundtype.length <= 1 || baseAggVO.getRate() == null) continue;
            UFDouble rate = baseAggVO.getRate().setScale(rateDigitAndRoundtype[0], rateDigitAndRoundtype[1]);
            baseAggVO.setRate(rate);
        }
        return bills;
    }

    public int[] getUnitScaleFromSource(String pk_material) {
        HashMap<String, Integer> materialDecMap = new HashMap<String, Integer>();
        try {
            Integer[] num;
            if ("~".equals(pk_material) || null == pk_material) {
                return new int[]{8, 0};
            }
            if (null != materialDecMap.get(pk_material)) {
                return new int[]{(Integer)materialDecMap.get(pk_material), 0};
            }
            String pkMeasdoc = "";
            Map vo = ((IMaterialPubService)NCLocator.getInstance().lookup(IMaterialPubService.class)).queryMaterialBaseInfoByPks(new String[]{pk_material.toString()}, new String[]{"pk_measdoc"});
            pkMeasdoc = ((MaterialVO)vo.get(pk_material.toString())).getPk_measdoc();
            if (pkMeasdoc != null) {
                num = MeasdocUtil.getInstance().getPrecisionByPks(new String[]{pkMeasdoc});
            } else {
                String[] parma = new String[]{pk_material};
                num = MeasdocUtil.getInstance().getPrecisionByPks(parma);
            }
            if (!StringUtil.isEmptyArry(num)) {
                materialDecMap.put(pk_material, num[0]);
                return new int[]{num[0], 0};
            }
        }
        catch (Exception e) {
            Logger.debug((Object)e.getMessage());
        }
        return new int[]{0, 0};
    }

    public int[] getPostunitFromSource(String postunit) {
        try {
            Integer[] num = MeasdocUtil.getInstance().getPrecisionByPks(new String[]{postunit});
            if (num != null && num.length > 0 && num[0] != null) {
                return new int[]{num[0], 0};
            }
            return new int[]{0, 0};
        }
        catch (BusinessException e) {
            Logger.error((Object)e.getMessage());
            return new int[]{0, 0};
        }
    }

    public int getPriceScalFromSource(Object pkValue) {
        PriceAccuracyValuePair priceAccuracyValuePair = this.getPriceDigitAndRoundTypeValuePair(pkValue);
        if (null != priceAccuracyValuePair) {
            return priceAccuracyValuePair.getPriceAccuracy();
        }
        return -1;
    }

    public PriceAccuracyValuePair getPriceDigitAndRoundTypeValuePair(Object pkValue) {
        PriceAccuracyValuePair priceAccuracyValuePair = null;
        try {
            if (pkValue != null) {
                priceAccuracyValuePair = PriceAccuracyUtil.getInstance().getPriceAccuracyValuePair((String)pkValue);
                return priceAccuracyValuePair;
            }
        }
        catch (BusinessException e) {
            ExceptionUtils.wrappException((Exception)((Object)e));
        }
        return priceAccuracyValuePair;
    }

    protected static IArapBillPubUtilService getIArapBillPubUtilService() throws ComponentException {
        return (IArapBillPubUtilService)NCLocator.getInstance().lookup(IArapBillPubUtilService.class);
    }
}

