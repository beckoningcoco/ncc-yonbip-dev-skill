/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.businessevent.BdUpdateEvent
 *  nc.bs.businessevent.BusinessEvent
 *  nc.bs.businessevent.IBusinessEvent
 *  nc.bs.businessevent.IBusinessListener
 *  nc.vo.arap.basebill.BaseAggVO
 *  nc.vo.arap.basebill.BaseBillVO
 *  nc.vo.arap.utils.ArrayUtil
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFBoolean
 *  nccloud.commons.lang.ArrayUtils
 */
package nc.bs.arap.busireg;

import nc.bs.arap.busireg.BConferUtils;
import nc.bs.businessevent.BdUpdateEvent;
import nc.bs.businessevent.BusinessEvent;
import nc.bs.businessevent.IBusinessEvent;
import nc.bs.businessevent.IBusinessListener;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.utils.ArrayUtil;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFBoolean;
import nccloud.commons.lang.ArrayUtils;

public class BillConferListener
implements IBusinessListener {
    public void doAction(IBusinessEvent event) throws BusinessException {
        Object[] bills = this.getBills(event);
        if (ArrayUtils.isEmpty((Object[])bills)) {
            return;
        }
        if (bills.length == 1) {
            this.doBusiness(event, (BaseAggVO)bills[0]);
        } else {
            for (int i = 0; i < bills.length; ++i) {
                this.doBusiness(event, (BaseAggVO)bills[i]);
            }
        }
    }

    private void doBusiness(IBusinessEvent event, BaseAggVO bill) throws BusinessException {
        BaseBillVO headvo = (BaseBillVO)bill.getParentVO();
        if (headvo.getIsinit() != null && headvo.getIsinit().booleanValue()) {
            return;
        }
        UFBoolean isrefund = (UFBoolean)bill.getParentVO().getAttributeValue("isrefund");
        if (isrefund != null && isrefund.booleanValue()) {
            return;
        }
        if ("1002".equals(event.getEventType())) {
            if (BConferUtils.canSave(bill, false)) {
                new BConferUtils().save(bill);
            }
        } else if ("1004".equals(event.getEventType())) {
            if (BConferUtils.canSave(bill, true)) {
                new BConferUtils().reGeneratBConfer(new BaseAggVO[]{bill});
            }
        } else if ("1006".equals(event.getEventType())) {
            if (BConferUtils.canSave(bill, true)) {
                new BConferUtils().deleteBillConfer(bill);
            }
        } else if ("200604".equals(event.getEventType()) || "1020".equals(event.getEventType())) {
            if (BConferUtils.canEffect(bill, false)) {
                new BConferUtils().save(bill);
            }
        } else if (("200606".equals(event.getEventType()) || "1022".equals(event.getEventType())) && BConferUtils.canEffect(bill, true)) {
            new BConferUtils().deleteBillConfer(bill);
        }
    }

    private BaseAggVO[] getBills(IBusinessEvent event) {
        Object value = null;
        if (event instanceof BusinessEvent) {
            value = ((BusinessEvent)event).getObject();
        } else if (event instanceof BdUpdateEvent) {
            value = ((BdUpdateEvent)event).getNewObject();
        }
        BaseAggVO[] bills = null;
        if (null != value) {
            Object[] objs;
            bills = value.getClass().isArray() ? ((objs = (Object[])value) instanceof BaseAggVO[] ? (BaseAggVO[])objs : (BaseAggVO[])ArrayUtil.convertSupers2Subs((Object[])((AggregatedValueObject[])objs), BaseAggVO.class)) : new BaseAggVO[]{(BaseAggVO)value};
        }
        return bills;
    }
}

