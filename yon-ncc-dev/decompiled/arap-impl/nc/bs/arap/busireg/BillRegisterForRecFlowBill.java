/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.bill.ArapBillPubUtil
 *  nc.bs.arap.busireg.BillRegisterForFlowBill
 *  nc.bs.businessevent.BdUpdateEvent
 *  nc.bs.businessevent.IBusinessEvent
 *  nc.bs.businessevent.IBusinessListener
 *  nc.vo.arap.basebill.BaseAggVO
 *  nc.vo.arap.basebill.BaseBillVO
 *  nc.vo.arap.basebill.BaseItemVO
 *  nc.vo.arap.flowbill.FlowBillDataVO
 *  nc.vo.arap.pub.BillEnumCollection$BillCooperate
 *  nc.vo.arap.receivable.AggReceivableBillVO
 *  nc.vo.arap.receivable.ReceivableBillItemVO
 *  nc.vo.arap.utils.ArrayUtil
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFDouble
 */
package nc.bs.arap.busireg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import nc.bs.arap.bill.ArapBillPubUtil;
import nc.bs.arap.busireg.BillRegisterForFlowBill;
import nc.bs.businessevent.BdUpdateEvent;
import nc.bs.businessevent.IBusinessEvent;
import nc.bs.businessevent.IBusinessListener;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.arap.flowbill.FlowBillDataVO;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.arap.receivable.AggReceivableBillVO;
import nc.vo.arap.receivable.ReceivableBillItemVO;
import nc.vo.arap.utils.ArrayUtil;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDouble;

public class BillRegisterForRecFlowBill<T extends BaseAggVO>
extends BillRegisterForFlowBill
implements IBusinessListener {
    public void doAction(IBusinessEvent event) throws BusinessException {
        BaseAggVO[] vos = (BaseAggVO[])this.dealUserObj(event.getUserObject());
        if (null == vos || vos.length == 0) {
            return;
        }
        if (vos[0].getHeadVO().getCoordflag() != null && vos[0].getHeadVO().getCoordflag().intValue() == BillEnumCollection.BillCooperate.SURE.VALUE.intValue()) {
            return;
        }
        if (null == super.getEventType()) {
            this.setEventType(event.getEventType());
        }
        List<FlowBillDataVO> flows = null;
        if ("1002".equals(event.getEventType())) {
            flows = this.doAfterInsert(event);
        } else if ("1004".equals(event.getEventType())) {
            flows = this.doAfterUpdate(event);
        } else if ("1005".equals(event.getEventType()) || "1006".equals(event.getEventType())) {
            flows = this.doAfterDelete(event);
        }
        if (!ArrayUtil.isArrayIsNull((Object[])new Object[]{flows})) {
            this.doWriteBack(flows);
        }
    }

    private List<FlowBillDataVO> doAfterInsert(IBusinessEvent event) {
        AggReceivableBillVO[] vos = (AggReceivableBillVO[])this.dealUserObj(event.getUserObject());
        ArrayList<FlowBillDataVO> flows = new ArrayList<FlowBillDataVO>();
        for (AggReceivableBillVO vo : vos) {
            for (ReceivableBillItemVO item : vo.getBodyVOs()) {
                if (null == item.getTop_billtype() || !this.isArapFlowBusi((BaseBillVO)vo.getHeadVO(), (BaseItemVO)item)) continue;
                FlowBillDataVO flow = new FlowBillDataVO();
                flow.setBilltype(item.getTop_billtype());
                flow.setPk_bill(item.getTop_billid());
                flow.setPk_billitem(item.getTop_itemid());
                if (ArapBillPubUtil.isRedBill((AggregatedValueObject)vo)) {
                    flow.setMnychanged(item.getMoney_de().multiply(BillRegisterForFlowBill.ONE_DOWN_ZERO));
                } else {
                    flow.setMnychanged(item.getSettlemoney());
                }
                flows.add(flow);
            }
        }
        return flows;
    }

    private List<FlowBillDataVO> doAfterUpdate(IBusinessEvent event) {
        BdUpdateEvent e = (BdUpdateEvent)event;
        AggReceivableBillVO oldvo = (AggReceivableBillVO)((AggregatedValueObject[])e.getOldObject())[0];
        AggReceivableBillVO newvo = (AggReceivableBillVO)((AggregatedValueObject[])e.getNewObject())[0];
        HashMap<String, ReceivableBillItemVO> oldmap = new HashMap<String, ReceivableBillItemVO>();
        for (ReceivableBillItemVO item : oldvo.getBodyVOs()) {
            if (null == item.getTop_billtype() || !this.isArapFlowBusi((BaseBillVO)oldvo.getHeadVO(), (BaseItemVO)item)) continue;
            oldmap.put(item.getPk_recitem(), item);
        }
        HashMap<String, ReceivableBillItemVO> newmap = new HashMap<String, ReceivableBillItemVO>();
        for (ReceivableBillItemVO item : newvo.getBodyVOs()) {
            if (null == item.getTop_billtype() || !this.isArapFlowBusi((BaseBillVO)newvo.getHeadVO(), (BaseItemVO)item)) continue;
            newmap.put(item.getPk_recitem(), item);
        }
        ArrayList<FlowBillDataVO> flows = new ArrayList<FlowBillDataVO>();
        for (Map.Entry entry : newmap.entrySet()) {
            ReceivableBillItemVO item;
            item = (ReceivableBillItemVO)entry.getValue();
            FlowBillDataVO flow = new FlowBillDataVO();
            flow.setBilltype(item.getTop_billtype());
            flow.setPk_bill(item.getTop_billid());
            flow.setPk_billitem(item.getTop_itemid());
            if (ArapBillPubUtil.isRedBill((AggregatedValueObject)newvo)) {
                UFDouble newchgmny;
                UFDouble uFDouble = newchgmny = ((ReceivableBillItemVO)newmap.get(item.getPk_recitem())).getMoney_de() == null ? new UFDouble(0) : ((ReceivableBillItemVO)newmap.get(item.getPk_recitem())).getMoney_de();
                if (null != oldmap.get(item.getPk_recitem())) {
                    UFDouble oldchgmny = ((ReceivableBillItemVO)oldmap.get(item.getPk_recitem())).getMoney_de() == null ? new UFDouble(0) : ((ReceivableBillItemVO)oldmap.get(item.getPk_recitem())).getMoney_de();
                    flow.setMnychanged(oldchgmny.sub(newchgmny));
                } else {
                    flow.setMnychanged(item.getSettlemoney());
                }
            } else {
                UFDouble newmny;
                UFDouble uFDouble = newmny = ((ReceivableBillItemVO)newmap.get(item.getPk_recitem())).getSettlemoney() == null ? new UFDouble(0) : ((ReceivableBillItemVO)newmap.get(item.getPk_recitem())).getSettlemoney();
                if (null != oldmap.get(item.getPk_recitem())) {
                    UFDouble oldMny = ((ReceivableBillItemVO)oldmap.get(item.getPk_recitem())).getSettlemoney() == null ? new UFDouble(0) : ((ReceivableBillItemVO)oldmap.get(item.getPk_recitem())).getSettlemoney();
                    flow.setMnychanged(newmny.sub(oldMny));
                } else {
                    flow.setMnychanged(newmny);
                }
            }
            flows.add(flow);
        }
        return flows;
    }

    private List<FlowBillDataVO> doAfterDelete(IBusinessEvent event) {
        BaseAggVO[] vos = (BaseAggVO[])this.dealUserObj(event.getUserObject());
        ArrayList<FlowBillDataVO> flows = new ArrayList<FlowBillDataVO>();
        for (BaseAggVO vo : vos) {
            for (ReceivableBillItemVO item : ((AggReceivableBillVO)vo).getBodyVOs()) {
                if (null == item.getTop_billtype() || !this.isArapFlowBusi(vo.getHeadVO(), (BaseItemVO)item)) continue;
                FlowBillDataVO flow = new FlowBillDataVO();
                flow.setBilltype(item.getTop_billtype());
                flow.setPk_bill(item.getTop_billid());
                flow.setPk_billitem(item.getTop_itemid());
                if (ArapBillPubUtil.isRedBill((AggregatedValueObject)vo)) {
                    flow.setMnychanged(item.getMoney_de());
                } else {
                    flow.setMnychanged(item.getSettlemoney().multiply(BillRegisterForFlowBill.ONE_DOWN_ZERO));
                }
                flows.add(flow);
            }
        }
        return flows;
    }
}

