/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.cmp.settlement.SettlementAggVO
 *  nc.vo.cmp.settlement.SettlementBodyVO
 *  nc.vo.fts.innertransfer.AggInnerTransferVO
 *  nc.vo.fts.innertransfer.InnerTransferBVO
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nccloud.commons.lang.ArrayUtils
 */
package nc.bs.arap.util;

import java.util.HashMap;
import java.util.Map;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.cmp.settlement.SettlementAggVO;
import nc.vo.cmp.settlement.SettlementBodyVO;
import nc.vo.fts.innertransfer.AggInnerTransferVO;
import nc.vo.fts.innertransfer.InnerTransferBVO;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.BusinessException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nccloud.commons.lang.ArrayUtils;

public class InnertransVOChangeUtils {
    public static Map<String, BaseItemVO> getInner2PayMap(BaseAggVO[] gathervos, AggInnerTransferVO begin, AggInnerTransferVO end, SettlementAggVO[] settleInfoVOs) throws BusinessException {
        if (ArrayUtils.isEmpty((Object[])gathervos) || ArrayUtils.isEmpty((Object[])settleInfoVOs) || end == null) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61008_0", "02006v61008-0122"));
        }
        BaseAggVO gatherVO = gathervos[0];
        SettlementAggVO settleInfoVO = settleInfoVOs[0];
        HashMap<String, BaseItemVO> pkMap = new HashMap<String, BaseItemVO>();
        for (BaseItemVO item : gatherVO.getItems()) {
            pkMap.put(item.getPrimaryKey(), item);
        }
        HashMap<String, String> relation = new HashMap<String, String>();
        for (CircularlyAccessibleValueObject item : settleInfoVO.getChildrenVO()) {
            SettlementBodyVO itemVO = (SettlementBodyVO)item;
            if (pkMap.get(itemVO.getPk_billdetail()) == null) continue;
            relation.put(itemVO.getPrimaryKey(), itemVO.getPk_billdetail());
        }
        HashMap<String, BaseItemVO> retMap = new HashMap<String, BaseItemVO>();
        if (begin == end) {
            for (InnerTransferBVO item : end.getItem()) {
                String gatherPk = (String)relation.get(item.getPk_sourcebillrowid());
                if (gatherPk == null) continue;
                retMap.put(item.getPrimaryKey(), (BaseItemVO)pkMap.get(gatherPk));
            }
        } else {
            HashMap<Integer, InnerTransferBVO> rownoMap = new HashMap<Integer, InnerTransferBVO>();
            for (InnerTransferBVO item : begin.getItem()) {
                rownoMap.put(item.getRowno(), item);
            }
            for (InnerTransferBVO item : end.getItem()) {
                InnerTransferBVO item2 = (InnerTransferBVO)rownoMap.get(item.getRowno());
                String gatherPk = (String)relation.get(item2.getPk_sourcebillrowid());
                if (gatherPk == null) continue;
                retMap.put(item.getPrimaryKey(), (BaseItemVO)pkMap.get(gatherPk));
            }
        }
        return retMap;
    }
}

