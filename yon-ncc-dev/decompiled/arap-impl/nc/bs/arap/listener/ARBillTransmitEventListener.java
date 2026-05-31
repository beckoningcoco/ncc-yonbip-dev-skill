/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.businessevent.BusinessEvent
 *  nc.bs.businessevent.IBusinessEvent
 *  nc.bs.businessevent.IBusinessListener
 *  nc.bs.framework.common.NCLocator
 *  nc.itf.uap.pf.IPFBusiAction
 *  nc.pubitf.arap.bill.IArapBillPubQueryService
 *  nc.vo.arap.basebill.BaseAggVO
 *  nc.vo.arap.basebill.BaseBillVO
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pubapp.pflow.PfUserObject
 */
package nc.bs.arap.listener;

import java.util.List;
import java.util.Map;
import nc.bs.businessevent.BusinessEvent;
import nc.bs.businessevent.IBusinessEvent;
import nc.bs.businessevent.IBusinessListener;
import nc.bs.framework.common.NCLocator;
import nc.itf.uap.pf.IPFBusiAction;
import nc.pubitf.arap.bill.IArapBillPubQueryService;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pflow.PfUserObject;

public class ARBillTransmitEventListener
implements IBusinessListener {
    public void doAction(IBusinessEvent event) throws BusinessException {
        Map map = (Map)((BusinessEvent)event).getObject();
        String new_user = (String)map.get("new_user");
        IArapBillPubQueryService service = (IArapBillPubQueryService)NCLocator.getInstance().lookup(IArapBillPubQueryService.class);
        IPFBusiAction busiAction = (IPFBusiAction)NCLocator.getInstance().lookup(IPFBusiAction.class);
        if (map.containsKey("F0")) {
            this.upateAggVO(map, new_user, service, busiAction, "F0");
        }
        if (map.containsKey("F2")) {
            this.upateAggVO(map, new_user, service, busiAction, "F2");
        }
    }

    protected void upateAggVO(Map<String, Object> map, String new_user, IArapBillPubQueryService service, IPFBusiAction busiAction, String billtype) throws BusinessException {
        List billids = (List)map.get(billtype);
        if (billids == null || billids.size() == 0) {
            return;
        }
        String[] pks = billids.toArray(new String[billids.size()]);
        BaseAggVO[] aggVOs = service.findBillByPrimaryKey(pks, new String[]{billtype});
        if (null != aggVOs && aggVOs.length > 0) {
            for (BaseAggVO aggVO : aggVOs) {
                BaseBillVO headVO = aggVO.getHeadVO();
                headVO.setBillmaker(new_user);
                headVO.setStatus(1);
                busiAction.processAction("SAVE", headVO.getPk_tradetype(), null, (AggregatedValueObject)aggVO, (Object)new PfUserObject[]{new PfUserObject()}, null);
            }
        }
    }
}

