/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.lang.UFDouble
 *  nc.vo.pubapp.pattern.pub.MathTool
 *  nccloud.commons.lang.ArrayUtils
 */
package nc.bs.arap.bill;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import nc.vo.arap.basebill.PeriodpaymentParaVO;
import nc.vo.arap.basebill.PeriodpaymentReturnVO;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.pub.MathTool;
import nccloud.commons.lang.ArrayUtils;

public class ArapCreditUtil {
    public static PeriodpaymentParaVO canCombine(PeriodpaymentParaVO[] paras, boolean isAll) {
        if (ArrayUtils.isEmpty((Object[])paras)) {
            return null;
        }
        ArrayList<String> combineList = new ArrayList<String>();
        HashSet<String> channeltypeS = new HashSet<String>();
        HashSet<String> settorgS = new HashSet<String>();
        HashSet<String> prodlineS = new HashSet<String>();
        HashSet<String> vtrancodeS = new HashSet<String>();
        HashSet<String> ordercusdocS = new HashSet<String>();
        int channeltypeC = paras[0].getChanneltype() == null ? 0 : paras[0].getChanneltype().length;
        int settorgC = paras[0].getSettorg() == null ? 0 : paras[0].getSettorg().length;
        int prodlineC = paras[0].getProdline() == null ? 0 : paras[0].getProdline().length;
        int vtrancodeC = paras[0].getVtrancode() == null ? 0 : paras[0].getVtrancode().length;
        int ordercusdocC = paras[0].getOrdercusdoc() == null ? 0 : paras[0].getOrdercusdoc().length;
        for (PeriodpaymentParaVO para : paras) {
            String[] ordercusdoc;
            String[] channeltype = para.getChanneltype();
            String[] settorg = para.getSettorg();
            String[] prodline = para.getProdline();
            String[] vtrancode = para.getVtrancode();
            if (para.getCustomertype() == 1) {
                ordercusdoc = new String[]{para.getCustomer()};
                if (ordercusdoc != null != (paras[0].getCustomer() != null)) {
                    return null;
                }
                if (ordercusdoc != null) {
                    ordercusdocS.addAll(Arrays.asList(ordercusdoc));
                } else if (!isAll) {
                    ordercusdocS.add("~");
                }
            } else {
                ordercusdoc = para.getOrdercusdoc();
                if (ordercusdoc != null != (paras[0].getOrdercusdoc() != null)) {
                    return null;
                }
                if (ordercusdoc != null) {
                    ordercusdocS.addAll(Arrays.asList(ordercusdoc));
                } else if (!isAll) {
                    ordercusdocS.add("~");
                }
            }
            if (channeltype != null != (paras[0].getChanneltype() != null)) {
                return null;
            }
            if (settorg != null != (paras[0].getSettorg() != null)) {
                return null;
            }
            if (prodline != null != (paras[0].getProdline() != null)) {
                return null;
            }
            if (vtrancode != null != (paras[0].getVtrancode() != null)) {
                return null;
            }
            if (channeltype != null) {
                channeltypeS.addAll(Arrays.asList(channeltype));
            }
            if (settorg != null) {
                settorgS.addAll(Arrays.asList(settorg));
            } else if (!isAll) {
                settorgS.add("~");
            }
            if (prodline != null) {
                prodlineS.addAll(Arrays.asList(prodline));
            }
            if (vtrancode == null) continue;
            vtrancodeS.addAll(Arrays.asList(vtrancode));
        }
        int count = 0;
        PeriodpaymentParaVO combine = (PeriodpaymentParaVO)paras[0].clone();
        if (channeltypeS.size() > channeltypeC) {
            combineList.add("channeltype");
            combine.setChanneltype(channeltypeS.toArray(new String[0]));
            ++count;
        }
        if (settorgS.size() > settorgC) {
            combineList.add("settorg");
            combine.setSettorg(settorgS.toArray(new String[0]));
            ++count;
        }
        if (prodlineS.size() > prodlineC) {
            combineList.add("prodline");
            combine.setProdline(prodlineS.toArray(new String[0]));
            ++count;
        }
        if (vtrancodeS.size() > vtrancodeC) {
            combineList.add("vtrancode");
            combine.setVtrancode(vtrancodeS.toArray(new String[0]));
            ++count;
        }
        if (ordercusdocS.size() > ordercusdocC) {
            combineList.add("ordercusdoc");
            combine.setOrdercusdoc(ordercusdocS.toArray(new String[0]));
            ++count;
        }
        if (count <= 4) {
            combine.setCombineKey(combineList);
            return combine;
        }
        return null;
    }

    public static PeriodpaymentReturnVO[] dealResult(PeriodpaymentReturnVO[] resultValue, PeriodpaymentParaVO combine, PeriodpaymentParaVO para) {
        Map<String, PeriodpaymentReturnVO> map = Collections.synchronizedMap(new IdentityHashMap());
        for (PeriodpaymentReturnVO result : resultValue) {
            if (ArapCreditUtil.isNotMatch(combine.getCombineKey(), result, para)) continue;
            String pk_currtype = result.getCurrtype();
            if (map.containsKey(pk_currtype)) {
                PeriodpaymentReturnVO vo = (PeriodpaymentReturnVO)map.get(pk_currtype);
                vo.setMoney(MathTool.add((UFDouble)vo.getMoney(), (UFDouble)result.getMoney()));
                vo.setDate(vo.getDate().before(result.getDate()) ? vo.getDate() : result.getDate());
                map.put(pk_currtype, vo);
                continue;
            }
            map.put(pk_currtype, result);
        }
        return map.values().toArray(new PeriodpaymentReturnVO[0]);
    }

    private static boolean isNotMatch(List<String> combineKeys, PeriodpaymentReturnVO result, PeriodpaymentParaVO para) {
        int i = -1;
        for (String combineK : combineKeys) {
            String[] keys;
            ++i;
            if (para.getAttributeValue(combineK) == null) {
                if (result.getCombineValue(i) == null || result.getCombineValue(i).equals("~")) continue;
                return true;
            }
            boolean match = false;
            for (String key : keys = (String[])para.getAttributeValue(combineK)) {
                if (!key.equals(result.getCombineValue(i))) continue;
                match = true;
                break;
            }
            if (match) continue;
            return true;
        }
        return false;
    }
}

