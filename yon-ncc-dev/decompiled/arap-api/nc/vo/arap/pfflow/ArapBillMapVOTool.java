/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.itf.fi.pub.Currency
 *  nc.vo.pub.lang.UFBoolean
 */
package nc.vo.arap.pfflow;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import nc.bs.arap.bill.ArapBillPubUtil;
import nc.itf.fi.pub.Currency;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.arap.pfflow.ArapBillMapVO;
import nc.vo.pub.lang.UFBoolean;

public class ArapBillMapVOTool {
    public static List<ArapBillMapVO> getBySource(String pk, List<ArapBillMapVO> dyBillMap) {
        ArrayList<ArapBillMapVO> retBillMap = new ArrayList<ArapBillMapVO>();
        for (ArapBillMapVO vo : dyBillMap) {
            if (vo.getS_itemid() == null || !vo.getS_itemid().equals(pk)) continue;
            retBillMap.add(vo);
        }
        return retBillMap;
    }

    public static List<ArapBillMapVO> getByTarget(String pk, List<ArapBillMapVO> dyBillMap) {
        ArrayList<ArapBillMapVO> retBillMap = new ArrayList<ArapBillMapVO>();
        for (ArapBillMapVO vo : dyBillMap) {
            if (vo.getT_itemid() == null || !vo.getT_itemid().equals(pk)) continue;
            retBillMap.add(vo);
        }
        return retBillMap;
    }

    public static ArapBillMapVO changeVotoBillMap(BaseBillVO header, BaseItemVO sitem) {
        if (header.getSrc_syscode() != 0 && header.getSrc_syscode() != 1) {
            return null;
        }
        if (sitem.getTop_billid() == null || sitem.getTop_itemid() == null) {
            return null;
        }
        if (!ArapBillPubUtil.isFromArap(header, sitem)) {
            return null;
        }
        ArapBillMapVO vo = new ArapBillMapVO();
        vo.setDr(0);
        vo.setS_billid(sitem.getTop_billid());
        vo.setS_billtype(sitem.getTop_billtype());
        vo.setS_itemid(sitem.getTop_itemid());
        vo.setS_termid(sitem.getTop_termch());
        vo.setS_system(header.getSyscode() == null ? 0 : header.getSyscode());
        vo.setT_billtype(header.getPk_billtype());
        vo.setT_billid(header.getPrimaryKey());
        vo.setT_itemid(sitem.getPrimaryKey());
        vo.setT_billtype(header.getPk_billtype());
        vo.setYbje(sitem.getMoney_bal());
        vo.setYbye(sitem.getMoney_bal());
        vo.setOldje(sitem.getMoney_bal());
        vo.setMaptype(0);
        vo.setPk_org(header.getPk_org());
        vo.setPk_currtype(sitem.getPk_currtype());
        vo.setSettlecurr(sitem.getSettlecurr());
        vo.setSettlemoney(sitem.getSettlemoney());
        vo.setIsmanual(UFBoolean.FALSE);
        return vo;
    }

    public static Map<ArapBillMapVO, Collection<ArapBillMapVO>> combineSameSourceBillMap(Map<ArapBillMapVO, Collection<ArapBillMapVO>> billMapHash) {
        HashMap<String, ArapBillMapVO> voMap = new HashMap<String, ArapBillMapVO>();
        Set<ArapBillMapVO> vos = billMapHash.keySet();
        HashMap<ArapBillMapVO, Collection<ArapBillMapVO>> billMapHashNew = new HashMap<ArapBillMapVO, Collection<ArapBillMapVO>>();
        for (ArapBillMapVO vo : vos) {
            int[] currDigit = new int[]{2, 4};
            if (vo.getPk_currtype() != null) {
                currDigit = Currency.getCurrDigitAndRoundtype((String)vo.getPk_currtype());
            }
            String t_itemid = vo.getT_itemid();
            Collection<ArapBillMapVO> values = billMapHash.get((Object)vo);
            for (ArapBillMapVO mp : values) {
                if (mp.getYbje() != null) {
                    mp.setYbje(mp.getYbje().setScale(currDigit[0], currDigit[1]));
                }
                if (mp.getYbye() == null) continue;
                mp.setYbye(mp.getYbye().setScale(currDigit[0], currDigit[1]));
            }
            if (voMap.containsKey(t_itemid)) {
                ArapBillMapVO mapVO = (ArapBillMapVO)((Object)voMap.get(t_itemid));
                Collection<ArapBillMapVO> combinVOs = values;
                mapVO.setYbje(vo.getYbje().add(mapVO.getYbje()));
                mapVO.setYbye(vo.getYbye().add(mapVO.getYbye()));
                Collection<ArapBillMapVO> collection = billMapHashNew.get((Object)mapVO);
                collection.addAll(combinVOs);
                billMapHashNew.put(mapVO, collection);
                continue;
            }
            voMap.put(t_itemid, vo);
            billMapHashNew.put(vo, values);
        }
        return billMapHashNew;
    }

    public static ArapBillMapVO changeVotoBillMapNew(BaseBillVO header, BaseItemVO item) {
        ArapBillMapVO vo = new ArapBillMapVO();
        vo.setDr(0);
        vo.setS_billid(item.getTop_billid());
        vo.setS_itemid(item.getTop_itemid());
        if ("Z2".equals(item.getTop_billtype())) {
            vo.setS_itemid(null);
        }
        vo.setS_system(header.getSrc_syscode());
        vo.setS_billtype(item.getTop_billtype());
        vo.setT_billid(item.getParentPK());
        vo.setT_itemid(item.getPrimaryKey());
        vo.setT_billtype(item.getPk_billtype());
        vo.setYbje(item.getOccupationmny());
        vo.setYbye(item.getOccupationmny());
        vo.setOldje(item.getOccupationmny());
        vo.setPk_currtype(item.getPk_currtype());
        vo.setContractno(item.getContractno());
        vo.setPk_org(item.getPk_org());
        return vo;
    }

    public static ArapBillMapVO changeVotoBillMapNewForSo(BaseBillVO header, BaseItemVO item) {
        ArapBillMapVO vo = new ArapBillMapVO();
        vo.setDr(0);
        vo.setS_billid(item.getSrc_billid());
        vo.setS_itemid(item.getSrc_itemid());
        vo.setS_system(header.getSrc_syscode());
        vo.setS_billtype(item.getSrc_billtype());
        vo.setT_billid(item.getParentPK());
        vo.setT_itemid(item.getPrimaryKey());
        vo.setT_billtype(item.getPk_billtype());
        if (item.getPk_billtype().equals("F2")) {
            vo.setYbje(item.getMoney_bal().sub(item.getOccupationmny()));
            vo.setYbye(item.getMoney_bal().sub(item.getOccupationmny()));
            vo.setOldje(item.getMoney_bal().sub(item.getOccupationmny()));
        } else {
            vo.setYbje(item.getOccupationmny());
            vo.setYbye(item.getOccupationmny());
            vo.setOldje(item.getOccupationmny());
        }
        vo.setPk_currtype(item.getPk_currtype());
        vo.setContractno(item.getContractno());
        vo.setPk_org(item.getPk_org());
        return vo;
    }

    public static List<ArapBillMapVO> changeVotoBillMapNewForRMCF(BaseAggVO recsrcvo, BaseItemVO[] items, Map<String, String> queryRedSrcMap) {
        ArrayList<ArapBillMapVO> retList = new ArrayList<ArapBillMapVO>();
        BaseItemVO[] childrenVO = (BaseItemVO[])recsrcvo.getChildrenVO();
        HashMap<String, BaseItemVO> map = new HashMap<String, BaseItemVO>();
        Set<String> keySet = queryRedSrcMap.keySet();
        for (BaseItemVO vo : childrenVO) {
            for (String key : keySet) {
                map.put(key, vo);
            }
        }
        for (BaseItemVO item : items) {
            ArapBillMapVO vo = new ArapBillMapVO();
            BaseItemVO children = (BaseItemVO)map.get(item.getTop_billid());
            vo.setDr(0);
            vo.setS_billid(children.getParentPK());
            vo.setS_itemid(children.getChildrenPK());
            vo.setS_billtype(children.getPk_billtype());
            vo.setT_billid(item.getParentPK());
            vo.setT_itemid(item.getPrimaryKey());
            vo.setT_billtype(item.getPk_billtype());
            vo.setYbje(item.getOccupationmny());
            vo.setYbye(item.getOccupationmny());
            vo.setOldje(item.getOccupationmny());
            vo.setPk_currtype(item.getPk_currtype());
            vo.setContractno(item.getContractno());
            vo.setPk_org(item.getPk_org());
            vo.setPk_org1(item.getPk_org());
            vo.setSettlecurr(item.getPk_currtype());
            vo.setSettlemoney(children.getOccupationmny());
            retList.add(vo);
        }
        return retList;
    }
}

