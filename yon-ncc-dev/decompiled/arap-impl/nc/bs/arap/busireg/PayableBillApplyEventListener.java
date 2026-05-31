/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.busireg.PsApplyListener
 *  nc.bs.businessevent.BdUpdateEvent
 *  nc.bs.businessevent.BusinessEvent
 *  nc.bs.businessevent.IBusinessEvent
 *  nc.bs.businessevent.IBusinessListener
 *  nc.vo.arap.flowbill.FlowBillDataVO
 *  nc.vo.cmp.apply.AggApplyVO
 *  nc.vo.cmp.apply.ApplyBVO
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFDouble
 */
package nc.bs.arap.busireg;

import java.util.ArrayList;
import java.util.List;
import nc.bs.arap.busireg.ArapBillForApplyListener;
import nc.bs.arap.busireg.BillRegisterForFlowBill;
import nc.bs.arap.busireg.PsApplyListener;
import nc.bs.businessevent.BdUpdateEvent;
import nc.bs.businessevent.BusinessEvent;
import nc.bs.businessevent.IBusinessEvent;
import nc.bs.businessevent.IBusinessListener;
import nc.vo.arap.flowbill.FlowBillDataVO;
import nc.vo.cmp.apply.AggApplyVO;
import nc.vo.cmp.apply.ApplyBVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDouble;

public class PayableBillApplyEventListener
implements IBusinessListener {
    public void doAction(IBusinessEvent event) throws BusinessException {
        if (event.getEventType().equals("1002")) {
            new PsApplyListener().doAction(event);
        }
        ArapBillForApplyListener busilistener = new ArapBillForApplyListener();
        busilistener.doAction(event);
    }

    public void doUpdateVOList(IBusinessEvent event) throws BusinessException {
        AggApplyVO[] oldApplyArr = null;
        AggApplyVO[] newApplyArr = null;
        if (event instanceof BdUpdateEvent) {
            BdUpdateEvent ev = (BdUpdateEvent)event;
            oldApplyArr = (AggApplyVO[])ev.getOldObject();
            newApplyArr = (AggApplyVO[])ev.getNewObject();
        } else if (event instanceof BusinessEvent) {
            newApplyArr = (AggApplyVO[])((BusinessEvent)event).getObject();
        }
        ArrayList<FlowBillDataVO> flowUpdateData = new ArrayList<FlowBillDataVO>();
        if (event.getEventType().equals("1006")) {
            flowUpdateData.addAll(this.getFlowUpdateData(newApplyArr, false));
        } else {
            flowUpdateData.addAll(this.getFlowUpdateData(newApplyArr, true));
        }
        flowUpdateData.addAll(this.getFlowUpdateData(oldApplyArr, false));
        new BillRegisterForFlowBill().doWriteBack(flowUpdateData);
    }

    private List<FlowBillDataVO> getFlowUpdateData(AggApplyVO[] oldApplyArr, boolean back) {
        ArrayList<FlowBillDataVO> list = new ArrayList<FlowBillDataVO>();
        if (oldApplyArr != null) {
            for (AggApplyVO agg : oldApplyArr) {
                ApplyBVO[] childrenVO;
                for (ApplyBVO bvo : childrenVO = (ApplyBVO[])agg.getChildrenVO()) {
                    if (bvo.getSrcbilltypecode() == null || !bvo.getSrcbilltypecode().equals("F1")) continue;
                    UFDouble applymny = bvo.getApplymny();
                    String pk_payterm_b = bvo.getPk_payterm_b();
                    String pk_srcbillrowid = bvo.getPk_srcbillrowid();
                    String pk_srcbillid = bvo.getPk_srcbill();
                    FlowBillDataVO flowvo = new FlowBillDataVO();
                    flowvo.setBilltype("F1");
                    flowvo.setMnychanged(back ? applymny : applymny.multiply(-1.0));
                    flowvo.setPk_termitem(pk_payterm_b);
                    flowvo.setPk_billitem(pk_srcbillrowid);
                    flowvo.setPk_bill(pk_srcbillid);
                    list.add(flowvo);
                }
            }
        }
        return list;
    }
}

