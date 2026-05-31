/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.pf.pub.PfDataCache
 *  nc.itf.fi.pub.Currency
 *  nc.pubitf.arap.pub.IArapCheckBillDealService
 *  nc.pubitf.arap.tally.IArapQueryTallySerivce
 *  nc.vo.arap.global.ArapCommonTool
 *  nc.vo.arap.linkdeal.LinkDealVO
 *  nc.vo.arap.tally.BusiTypeEnum
 *  nc.vo.arap.tally.TallyVO
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pub.lang.UFDouble
 *  nccloud.commons.lang.ArrayUtils
 *  nccloud.commons.lang.StringUtils
 *  nccloud.pubitf.arap.arappub.IBillDealLinkQueryService
 *  org.apache.commons.collections4.MapUtils
 */
package nccloud.pubimpl.arap.arappub;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import nc.bs.framework.common.NCLocator;
import nc.bs.pf.pub.PfDataCache;
import nc.itf.fi.pub.Currency;
import nc.pubitf.arap.pub.IArapCheckBillDealService;
import nc.pubitf.arap.tally.IArapQueryTallySerivce;
import nc.vo.arap.global.ArapCommonTool;
import nc.vo.arap.linkdeal.LinkDealVO;
import nc.vo.arap.tally.BusiTypeEnum;
import nc.vo.arap.tally.TallyVO;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDouble;
import nccloud.commons.lang.ArrayUtils;
import nccloud.commons.lang.StringUtils;
import nccloud.pubitf.arap.arappub.IBillDealLinkQueryService;
import org.apache.commons.collections4.MapUtils;

public class BillDealLinkQueryServiceImpl
implements IBillDealLinkQueryService {
    public Object[][] billDealLinkQuery(AggregatedValueObject aggVO) throws BusinessException {
        Map<String, List<TallyVO>> tallyVOByBillPK = this.getTallyVOByBillPK(aggVO.getParentVO().getPrimaryKey());
        List<LinkDealVO> setTolinkDealVO = this.setTolinkDealVO(aggVO);
        Map preVerify = ((IArapCheckBillDealService)NCLocator.getInstance().lookup(IArapCheckBillDealService.class)).getArapBillPreVerify(aggVO);
        if (MapUtils.isEmpty(tallyVOByBillPK) && MapUtils.isEmpty((Map)preVerify)) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0875"));
        }
        Map<String, String[]> dy_BillMap = this.getTallyVOByPKBill_dy(tallyVOByBillPK);
        Object[][] convertVOSToObject = this.ConvertVOSToObject(setTolinkDealVO.toArray(new LinkDealVO[0]), tallyVOByBillPK, preVerify, dy_BillMap);
        return convertVOSToObject;
    }

    public Object[][] ConvertVOSToObject(LinkDealVO[] dealVOS, Map<String, List<TallyVO>> tallyMap, Map<String, List<LinkDealVO>> preVerify, Map<String, String[]> dy_BillMap) throws BusinessException {
        int high = dealVOS.length;
        int width = 15;
        int count = this.setRowCount(dealVOS, tallyMap, preVerify);
        if (count < dealVOS.length) {
            count = dealVOS.length;
        }
        Object[][] obj = new Object[count][width];
        int num = 0;
        int n = 0;
        for (int i = 0; i < high; ++i) {
            List<LinkDealVO> preDealVOs;
            obj[n][0] = ++num;
            obj[n][1] = dealVOS[i].getMoney();
            obj[n][2] = dealVOS[i].getLocal_money();
            obj[n][3] = dealVOS[i].getMoney_bal();
            obj[n][4] = dealVOS[i].getLocal_money_bal();
            String pk_item = dealVOS[i].getPk_item();
            List<TallyVO> tallList = tallyMap.get(pk_item);
            if (tallList != null && tallList.size() > 0) {
                for (int j = 0; j < tallList.size(); ++j) {
                    TallyVO vo = tallList.get(j);
                    LinkDealVO toDealVO = this.converTallyToDealVO(vo);
                    if (toDealVO == null) continue;
                    obj[n][5] = vo.getBrief();
                    obj[n][6] = vo.getTallydate().toLocalString() == null ? null : vo.getTallydate().toLocalString().substring(0, 10);
                    obj[n][7] = toDealVO.getMoney_de().compareTo((Object)UFDouble.ZERO_DBL) == 0 ? null : toDealVO.getMoney_de();
                    obj[n][8] = toDealVO.getLocal_money_de().compareTo((Object)UFDouble.ZERO_DBL) == 0 ? null : toDealVO.getLocal_money_de();
                    obj[n][9] = toDealVO.getMoney_cr().compareTo((Object)UFDouble.ZERO_DBL) == 0 ? null : toDealVO.getMoney_cr();
                    obj[n][10] = toDealVO.getLocal_money_cr().compareTo((Object)UFDouble.ZERO_DBL) == 0 ? null : toDealVO.getLocal_money_cr();
                    String[] billno_type = null;
                    billno_type = vo.getPk_corbill() == null ? dy_BillMap.get(vo.getPk_bill()) : dy_BillMap.get(vo.getPk_corbill());
                    obj[n][11] = billno_type == null ? null : billno_type[1];
                    obj[n][12] = billno_type == null ? null : billno_type[0];
                    obj[n][13] = billno_type == null ? null : billno_type[2];
                    obj[n][14] = billno_type == null ? null : billno_type[3];
                    ++n;
                }
            }
            if (!MapUtils.isEmpty(preVerify) && (preDealVOs = preVerify.get(pk_item)) != null && preDealVOs.size() > 0) {
                for (LinkDealVO preDealVO : preDealVOs) {
                    if (preDealVO == null) continue;
                    obj[n][5] = preDealVO.getScomment();
                    obj[n][6] = preDealVO.getBusidate() == null ? null : String.valueOf(preDealVO.getBusidate()).substring(0, 10);
                    obj[n][7] = preDealVO.getMoney_de();
                    obj[n][8] = preDealVO.getLocal_money_de();
                    obj[n][9] = preDealVO.getMoney_cr();
                    obj[n][10] = preDealVO.getLocal_money_cr();
                    obj[n][11] = PfDataCache.getBillType((String)preDealVO.getBilltype_dy()).getBilltypenameOfCurrLang();
                    obj[n][12] = preDealVO.getBillno_dy();
                    obj[n][13] = preDealVO.getPk_bill_dy();
                    obj[n][14] = preDealVO.getBilltype_dy();
                    ++n;
                }
            }
            if (tallList != null && tallList.size() > 0 || preVerify.get(pk_item) != null) continue;
            ++n;
        }
        return obj;
    }

    private int setRowCount(LinkDealVO[] dealVOS, Map<String, List<TallyVO>> tallyMap, Map<String, List<LinkDealVO>> preVerify) {
        int count = 0;
        for (LinkDealVO vo : dealVOS) {
            List<LinkDealVO> linkDealVO;
            String pkItem = vo.getPk_item();
            List<TallyVO> tallList = tallyMap.get(pkItem);
            int tallSize = 0;
            if (tallList != null) {
                for (TallyVO tallyVO : tallList) {
                    if (ArapCommonTool.isZero((UFDouble)tallyVO.getLocal_money_de()) && ArapCommonTool.isZero((UFDouble)tallyVO.getLocal_money_cr())) continue;
                    ++tallSize;
                }
            }
            if (tallList != null && tallList.size() > 0) {
                count += tallSize;
            }
            if ((linkDealVO = preVerify.get(pkItem)) != null && linkDealVO.size() > 0) {
                count += linkDealVO.size();
            }
            if (tallList != null && tallList.size() > 0 || preVerify.get(pkItem) != null) continue;
            ++count;
        }
        return count;
    }

    private Map<String, String[]> getTallyVOByPKBill_dy(Map<String, List<TallyVO>> tallyVOByBillPK) throws BusinessException {
        ArrayList<String> pk_bill = new ArrayList<String>();
        HashMap<String, String[]> dy_BillMap = new HashMap<String, String[]>();
        for (String st : tallyVOByBillPK.keySet()) {
            List<TallyVO> list = tallyVOByBillPK.get(st);
            for (TallyVO vo : list) {
                if (vo.getPk_corbill() == null) {
                    pk_bill.add(vo.getPk_bill());
                    continue;
                }
                pk_bill.add(vo.getPk_corbill());
            }
        }
        List querBillNoByPk = ((IArapQueryTallySerivce)NCLocator.getInstance().lookup(IArapQueryTallySerivce.class)).querBillNoByPk(pk_bill);
        for (TallyVO vo1 : querBillNoByPk) {
            String billtypename;
            String[] temp = new String[]{vo1.getBillno(), billtypename = PfDataCache.getBillType((String)vo1.getPk_billtype()).getBilltypenameOfCurrLang(), vo1.getPk_bill(), vo1.getPk_billtype()};
            dy_BillMap.put(vo1.getPk_bill(), temp);
        }
        return dy_BillMap;
    }

    private Map<String, List<TallyVO>> getTallyVOByBillPK(String pk_bill) throws BusinessException {
        Object[] tallyVOs = ((IArapQueryTallySerivce)NCLocator.getInstance().lookup(IArapQueryTallySerivce.class)).queryDealTallyByBillPk(pk_bill);
        HashMap<String, List<TallyVO>> tall2Map = new HashMap<String, List<TallyVO>>();
        if (ArrayUtils.isEmpty((Object[])tallyVOs)) {
            return tall2Map;
        }
        HashMap tallMap = new HashMap();
        for (Object tallyVO : tallyVOs) {
            if ("~".equals(tallyVO.getPk_dealnum()) || !StringUtils.isNotEmpty((CharSequence)tallyVO.getPk_dealnum()) || ArapCommonTool.isZero((UFDouble)tallyVO.getLocal_money_de()) && ArapCommonTool.isZero((UFDouble)tallyVO.getLocal_money_cr())) continue;
            String pkItem = tallyVO.getPk_item();
            String flag = tallyVO.getDealflag().toString();
            String dealnum = tallyVO.getPk_dealnum();
            String corbill = tallyVO.getPk_corbill();
            String busitype = tallyVO.getBusitype() == null ? "" : tallyVO.getBusitype().toString();
            String key1 = pkItem + "-" + flag + "-" + dealnum + "-" + corbill + "-" + busitype;
            if (!tallMap.containsKey(key1)) {
                tallMap.put(key1, new ArrayList());
            }
            ((List)tallMap.get(key1)).add(tallyVO);
        }
        for (String key : tallMap.keySet()) {
            List list = (List)tallMap.get(key);
            UFDouble money_de = UFDouble.ZERO_DBL;
            UFDouble money_cr = UFDouble.ZERO_DBL;
            UFDouble local_money_de = UFDouble.ZERO_DBL;
            UFDouble local_money_cr = UFDouble.ZERO_DBL;
            int i = 0;
            for (TallyVO vo : list) {
                money_de = money_de.add(vo.getMoney_de());
                money_cr = money_cr.add(vo.getMoney_cr());
                local_money_de = local_money_de.add(vo.getLocal_money_de());
                local_money_cr = local_money_cr.add(vo.getLocal_money_cr());
                key = vo.getPk_item();
                TallyVO sumVO = (TallyVO)list.get(i);
                sumVO.setMoney_de(vo.getMoney_de());
                sumVO.setMoney_cr(vo.getMoney_cr());
                sumVO.setLocal_money_de(vo.getLocal_money_de());
                sumVO.setLocal_money_cr(vo.getLocal_money_cr());
                if (!tall2Map.containsKey(key)) {
                    tall2Map.put(key, new ArrayList());
                }
                ((List)tall2Map.get(key)).add(sumVO);
                ++i;
            }
        }
        return tall2Map;
    }

    private List<LinkDealVO> setTolinkDealVO(AggregatedValueObject aggVOs) throws BusinessException {
        CircularlyAccessibleValueObject[] childrenVO;
        ArrayList<LinkDealVO> dealList = new ArrayList<LinkDealVO>();
        for (CircularlyAccessibleValueObject vo : childrenVO = aggVOs.getChildrenVO()) {
            LinkDealVO dealVO = new LinkDealVO();
            dealVO.setBillno((String)vo.getAttributeValue("billno"));
            dealVO.setBilltype((String)vo.getAttributeValue("pk_billtype"));
            dealVO.setBusidate((UFDate)vo.getAttributeValue("billdate"));
            UFDouble money_de = (UFDouble)vo.getAttributeValue("money_de") == null ? UFDouble.ZERO_DBL : (UFDouble)vo.getAttributeValue("money_de");
            UFDouble money_cr = (UFDouble)vo.getAttributeValue("money_cr") == null ? UFDouble.ZERO_DBL : (UFDouble)vo.getAttributeValue("money_cr");
            UFDouble local_money_de = (UFDouble)vo.getAttributeValue("local_money_de") == null ? UFDouble.ZERO_DBL : (UFDouble)vo.getAttributeValue("local_money_de");
            UFDouble local_money_cr = (UFDouble)vo.getAttributeValue("local_money_cr") == null ? UFDouble.ZERO_DBL : (UFDouble)vo.getAttributeValue("local_money_cr");
            dealVO.setMoney(money_de.add(money_cr));
            dealVO.setLocal_money(local_money_de.add(local_money_cr));
            dealVO.setMoney_bal((UFDouble)vo.getAttributeValue("money_bal"));
            dealVO.setLocal_money_bal((UFDouble)vo.getAttributeValue("local_money_bal"));
            dealVO.setPk_bill(aggVOs.getParentVO().getPrimaryKey());
            dealVO.setPk_item(vo.getPrimaryKey());
            dealVO.setPk_currtype((String)vo.getAttributeValue("pk_currtype"));
            dealVO.setPk_org((String)vo.getAttributeValue("pk_org"));
            dealList.add(dealVO);
        }
        this.setDealVODig(dealList);
        return dealList;
    }

    private LinkDealVO converTallyToDealVO(TallyVO vo) throws BusinessException {
        LinkDealVO dealVO = new LinkDealVO();
        int dealflag = vo.getDealflag();
        String billclass = vo.getBillclass();
        UFDouble money_de = vo.getMoney_de();
        UFDouble money_cr = vo.getMoney_cr();
        UFDouble local_money_de = vo.getLocal_money_de();
        UFDouble local_money_cr = vo.getLocal_money_cr();
        dealVO.setScomment(vo.getBrief());
        dealVO.setPk_bill_dy(vo.getPk_corbill());
        int flag = -1;
        if (BusiTypeEnum.DIFF_VERIFY.getCode() == dealflag || BusiTypeEnum.INDIFF_VERIFY.getCode() == dealflag) {
            if ("sk".equals(billclass) || "fk".equals(billclass)) {
                dealVO.setMoney_de(money_de.multiply((double)flag));
                dealVO.setMoney_cr(money_cr.multiply((double)flag));
                dealVO.setLocal_money_de(local_money_de.multiply((double)flag));
                dealVO.setLocal_money_cr(local_money_cr.multiply((double)flag));
            } else if ("ys".equals(billclass)) {
                dealVO.setMoney_de(money_cr);
                dealVO.setMoney_cr(UFDouble.ZERO_DBL);
                dealVO.setLocal_money_de(local_money_cr);
                dealVO.setLocal_money_cr(UFDouble.ZERO_DBL);
            } else if ("yf".equals(billclass)) {
                dealVO.setMoney_de(UFDouble.ZERO_DBL);
                dealVO.setMoney_cr(money_de);
                dealVO.setLocal_money_de(UFDouble.ZERO_DBL);
                dealVO.setLocal_money_cr(local_money_de);
            }
        } else if (BusiTypeEnum.DISCOUNT.getCode() == dealflag) {
            if ("sk".equals(billclass)) {
                dealVO.setMoney_de(money_de);
                dealVO.setMoney_cr(money_cr);
                dealVO.setLocal_money_de(local_money_de);
                dealVO.setLocal_money_cr(local_money_cr);
            } else if ("ys".equals(billclass)) {
                dealVO.setMoney_de(money_cr);
                dealVO.setMoney_cr(UFDouble.ZERO_DBL);
                dealVO.setLocal_money_de(local_money_cr);
                dealVO.setLocal_money_cr(UFDouble.ZERO_DBL);
            } else if ("yf".equals(billclass)) {
                dealVO.setMoney_de(UFDouble.ZERO_DBL);
                dealVO.setMoney_cr(money_de);
                dealVO.setLocal_money_de(UFDouble.ZERO_DBL);
                dealVO.setLocal_money_cr(local_money_de);
            } else if ("fk".equals(billclass)) {
                dealVO.setMoney_cr(UFDouble.ZERO_DBL);
                dealVO.setMoney_de(money_de);
                dealVO.setLocal_money_cr(UFDouble.ZERO_DBL);
                dealVO.setLocal_money_de(local_money_de);
            }
        } else if (BusiTypeEnum.RED_BLUE_VERIFY.getCode() == dealflag) {
            dealVO.setMoney_de(money_de.multiply((double)flag));
            dealVO.setMoney_cr(money_cr.multiply((double)flag));
            dealVO.setLocal_money_de(local_money_de.multiply((double)flag));
            dealVO.setLocal_money_cr(local_money_cr.multiply((double)flag));
        } else if (BusiTypeEnum.AGIO.getCode() == dealflag) {
            if (ArapCommonTool.isZero((UFDouble)local_money_de) && ArapCommonTool.isZero((UFDouble)local_money_cr)) {
                return null;
            }
            dealVO.setMoney_de(money_de.multiply((double)flag));
            dealVO.setMoney_cr(money_cr.multiply((double)flag));
            dealVO.setLocal_money_de(local_money_de.multiply((double)flag));
            dealVO.setLocal_money_cr(local_money_cr.multiply((double)flag));
        } else if (BusiTypeEnum.DISCOUNT.getCode() == dealflag) {
            if ("ys".equals(billclass)) {
                dealVO.setMoney_de(money_cr);
                dealVO.setMoney_cr(UFDouble.ZERO_DBL);
                dealVO.setLocal_money_de(local_money_cr);
                dealVO.setLocal_money_cr(UFDouble.ZERO_DBL);
            } else if ("fk".equals(billclass)) {
                dealVO.setMoney_de(UFDouble.ZERO_DBL);
                dealVO.setMoney_cr(money_cr);
                dealVO.setLocal_money_de(UFDouble.ZERO_DBL);
                dealVO.setLocal_money_cr(local_money_de);
            }
        } else if (BusiTypeEnum.BAD_DEBT_OCCUR.getCode() == dealflag || BusiTypeEnum.UNION_DEBT.getCode() == dealflag) {
            dealVO.setMoney_de(money_de.abs());
            dealVO.setMoney_cr(money_cr.abs());
            dealVO.setLocal_money_de(local_money_de.abs());
            dealVO.setLocal_money_cr(local_money_cr.abs());
        } else if (BusiTypeEnum.BAD_DEBT_REVOKE.getCode() == dealflag) {
            dealVO.setMoney_cr(money_de.abs());
            dealVO.setMoney_de(money_cr.abs());
            dealVO.setLocal_money_cr(local_money_de.abs());
            dealVO.setLocal_money_de(local_money_cr.abs());
        } else {
            dealVO.setMoney_de(money_de);
            dealVO.setMoney_cr(money_cr);
            dealVO.setLocal_money_de(local_money_de);
            dealVO.setLocal_money_cr(local_money_cr);
        }
        this.setDealVODig(dealVO, vo);
        return dealVO;
    }

    private void setDealVODig(LinkDealVO dealVO, TallyVO vo) throws BusinessException {
        int[] currDigit = Currency.getCurrDigitAndRoundtype((String)vo.getPk_currtype());
        int[] localcurrDigit = Currency.getCurrDigitAndRoundtypeByOrg((String)vo.getPk_org());
        dealVO.setMoney_de(dealVO.getMoney_de() == null ? UFDouble.ZERO_DBL : dealVO.getMoney_de().setScale(currDigit[0], currDigit[1]));
        dealVO.setMoney_cr(dealVO.getMoney_cr() == null ? UFDouble.ZERO_DBL : dealVO.getMoney_cr().setScale(currDigit[0], currDigit[1]));
        dealVO.setLocal_money_de(dealVO.getLocal_money_de() == null ? UFDouble.ZERO_DBL : dealVO.getLocal_money_de().setScale(localcurrDigit[0], localcurrDigit[1]));
        dealVO.setLocal_money_cr(dealVO.getLocal_money_cr() == null ? UFDouble.ZERO_DBL : dealVO.getLocal_money_cr().setScale(localcurrDigit[0], localcurrDigit[1]));
    }

    private void setDealVODig(List<LinkDealVO> dealVOList) throws BusinessException {
        for (LinkDealVO dealvo : dealVOList) {
            int[] currDigit = Currency.getCurrDigitAndRoundtype((String)dealvo.getPk_currtype());
            int[] localcurrDigit = Currency.getCurrDigitAndRoundtypeByOrg((String)dealvo.getPk_org());
            dealvo.setMoney(dealvo.getMoney().setScale(currDigit[0], currDigit[1]));
            dealvo.setMoney_bal(dealvo.getMoney_bal().setScale(currDigit[0], currDigit[1]));
            dealvo.setMoney_de(dealvo.getMoney_de() == null ? null : dealvo.getMoney_de().setScale(currDigit[0], currDigit[1]));
            dealvo.setMoney_cr(dealvo.getMoney_cr() == null ? null : dealvo.getMoney_cr().setScale(currDigit[0], currDigit[1]));
            dealvo.setLocal_money(dealvo.getLocal_money() == null ? null : dealvo.getLocal_money().setScale(localcurrDigit[0], localcurrDigit[1]));
            dealvo.setLocal_money_bal(dealvo.getLocal_money_bal() == null ? null : dealvo.getLocal_money_bal().setScale(localcurrDigit[0], localcurrDigit[1]));
            dealvo.setLocal_money_de(dealvo.getLocal_money_de() == null ? null : dealvo.getLocal_money_de().setScale(localcurrDigit[0], localcurrDigit[1]));
            dealvo.setLocal_money_cr(dealvo.getLocal_money_cr() == null ? null : dealvo.getLocal_money_cr().setScale(localcurrDigit[0], localcurrDigit[1]));
        }
    }
}

