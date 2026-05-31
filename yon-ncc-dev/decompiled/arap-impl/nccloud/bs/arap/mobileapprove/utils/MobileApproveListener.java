/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.arap.basebill.BaseAggVO
 *  nc.vo.arap.gathering.AggGatheringBillVO
 *  nc.vo.arap.pay.AggPayBillVO
 *  nc.vo.arap.payable.AggPayableBillVO
 *  nc.vo.arap.receivable.AggReceivableBillVO
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.web.arap.util.VerifyVOScaleUtil
 *  nccloud.putimpl.riawf.mobileapp.NccMobileBillDataListenerImpl
 *  nccloud.putitf.riawf.mobileapp.MobileAppShowVO
 *  org.apache.commons.lang3.ArrayUtils
 */
package nccloud.bs.arap.mobileapprove.utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.gathering.AggGatheringBillVO;
import nc.vo.arap.pay.AggPayBillVO;
import nc.vo.arap.payable.AggPayableBillVO;
import nc.vo.arap.receivable.AggReceivableBillVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.web.arap.util.VerifyVOScaleUtil;
import nccloud.putimpl.riawf.mobileapp.NccMobileBillDataListenerImpl;
import nccloud.putitf.riawf.mobileapp.MobileAppShowVO;
import org.apache.commons.lang3.ArrayUtils;

public class MobileApproveListener
extends NccMobileBillDataListenerImpl {
    protected final String BODYAREACODE = "bodys";
    protected Map<String, BaseAggVO> billtypeVOMap = new HashMap<String, BaseAggVO>();

    public MobileApproveListener() {
        this.billtypeVOMap.put("F0", (BaseAggVO)new AggReceivableBillVO());
        this.billtypeVOMap.put("F1", (BaseAggVO)new AggPayableBillVO());
        this.billtypeVOMap.put("F2", (BaseAggVO)new AggGatheringBillVO());
        this.billtypeVOMap.put("F3", (BaseAggVO)new AggPayBillVO());
    }

    public void beforeDataListener(CircularlyAccessibleValueObject headvo, HashMap<String, CircularlyAccessibleValueObject[]> bodymap) throws BusinessException {
        Object[] chilvo = bodymap.get("bodys");
        if (ArrayUtils.isEmpty((Object[])chilvo)) {
            return;
        }
        String billtype = (String)bodymap.get("bodys")[0].getAttributeValue("pk_billtype");
        BaseAggVO vo = this.billtypeVOMap.get(billtype);
        if (vo != null && (vo instanceof AggGatheringBillVO || vo instanceof AggPayableBillVO || vo instanceof AggReceivableBillVO || vo instanceof AggPayBillVO)) {
            vo.setParentVO(headvo);
            vo.setChildrenVO((CircularlyAccessibleValueObject[])chilvo);
            vo = new VerifyVOScaleUtil().verifyVOScale(new BaseAggVO[]{vo})[0];
            headvo = vo.getParentVO();
            bodymap.put("bodys", vo.getChildrenVO());
        }
    }

    public Map<String, String> getBusiMobileInfo(String billId, String billType) throws BusinessException {
        return null;
    }

    public void afterDataListener(CircularlyAccessibleValueObject headvo, HashMap<String, CircularlyAccessibleValueObject[]> bodymap, Map<String, MobileAppShowVO> head, Map<String, List<Map<String, MobileAppShowVO>>> body, String def1) throws BusinessException {
    }
}

