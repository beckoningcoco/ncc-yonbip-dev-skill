/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.pubitf.fip.external.IBillReflectorService
 *  nc.vo.fip.external.FipExtendAggVO
 *  nc.vo.fip.service.FipRelationInfoVO
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.SuperVO
 *  nc.vo.pubapp.pattern.model.entity.bill.AbstractBill
 *  org.apache.commons.collections4.CollectionUtils
 *  org.apache.commons.lang3.ArrayUtils
 */
package nc.bs.arap.global;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import nc.bs.arap.bill.ArapBillPubUtil;
import nc.bs.framework.common.NCLocator;
import nc.pubitf.arap.bill.IArapBillPubService;
import nc.pubitf.fip.external.IBillReflectorService;
import nc.vo.arap.utils.ArrayUtil;
import nc.vo.fip.external.FipExtendAggVO;
import nc.vo.fip.service.FipRelationInfoVO;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.SuperVO;
import nc.vo.pubapp.pattern.model.entity.bill.AbstractBill;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.ArrayUtils;

public abstract class ArapBillReflectorServiceImpl
implements IBillReflectorService {
    public String SCIENCE = null;

    public Collection<FipExtendAggVO> queryBillByRelations(Collection<FipRelationInfoVO> relationvos) throws BusinessException {
        if (null == relationvos || relationvos.size() == 0) {
            return null;
        }
        ArrayList<String> list = new ArrayList<String>();
        HashMap<String, List<String>> relaidItempkMap = new HashMap<String, List<String>>();
        for (FipRelationInfoVO vo : relationvos) {
            list.add(vo.getRelationID());
            if (vo.getFreedef4() != null && vo.getFreedef4().contains("-")) {
                String[] items = vo.getFreedef4().split("-");
                relaidItempkMap.put(vo.getRelationID(), Arrays.asList(items));
                continue;
            }
            relaidItempkMap.put(vo.getRelationID(), Arrays.asList(vo.getFreedef4()));
        }
        String scene = relationvos.toArray(new FipRelationInfoVO[0])[0].getScene();
        if ("querySrc".equals(scene)) {
            this.SCIENCE = "querySrc";
        }
        AbstractBill[] bills = this.getBusiBill((String[])list.toArray(ArrayUtil.newEmptyArrays(list)));
        this.dofilterForPrepay(bills, relaidItempkMap);
        ArapBillPubUtil.refreshChildVO2HeadVO((AggregatedValueObject[])bills);
        ArrayList<FipExtendAggVO> ret = new ArrayList<FipExtendAggVO>(bills.length);
        int size = bills.length;
        for (int i = 0; i < size; ++i) {
            FipExtendAggVO vo = new FipExtendAggVO();
            vo.setBillVO((Object)bills[i]);
            vo.setRelationID(bills[i].getPrimaryKey());
            ret.add(vo);
        }
        return ret;
    }

    private void dofilterForPrepay(AbstractBill[] bills, Map<String, List<String>> relaidItempkMap) throws BusinessException {
        for (AbstractBill bill : bills) {
            String parentPk = bill.getParentVO().getPrimaryKey();
            List<String> prerecpaypklist = relaidItempkMap.get(parentPk);
            ArrayList<SuperVO> prepayList = new ArrayList<SuperVO>();
            SuperVO[] childrenVO = (SuperVO[])bill.getChildrenVO();
            if (CollectionUtils.isEmpty(prerecpaypklist)) continue;
            for (SuperVO vo : childrenVO) {
                if (!prerecpaypklist.contains(vo.getPrimaryKey())) continue;
                prepayList.add(vo);
            }
            if (!CollectionUtils.isNotEmpty(prepayList)) continue;
            bill.setChildrenVO((CircularlyAccessibleValueObject[])prepayList.toArray(new SuperVO[0]));
        }
    }

    protected abstract AbstractBill[] getBusiBill(String[] var1) throws BusinessException;

    protected List<AggregatedValueObject> getnewVOByTerm(AggregatedValueObject[] vos) throws BusinessException {
        if (ArrayUtils.isEmpty((Object[])vos)) {
            return null;
        }
        ArrayList<AggregatedValueObject> newList = new ArrayList();
        try {
            newList = ((IArapBillPubService)NCLocator.getInstance().lookup(IArapBillPubService.class)).getChildConstrByTerm(vos);
            return newList;
        }
        catch (Exception e) {
            throw new BusinessException(e.getMessage());
        }
    }
}

