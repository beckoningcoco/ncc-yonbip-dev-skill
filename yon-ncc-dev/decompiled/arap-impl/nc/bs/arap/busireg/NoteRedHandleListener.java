/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.businessevent.BusinessEvent
 *  nc.bs.businessevent.BusinessEvent$BusinessUserObj
 *  nc.bs.businessevent.IBusinessEvent
 *  nc.bs.businessevent.IBusinessListener
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.pf.pub.PfDataCache
 *  nc.itf.arap.gathering.IArapGatheringBillService
 *  nc.itf.arap.pay.IArapPayBillService
 *  nc.vo.fbm.preturn.ReverseInfoVO
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.billtype.BilltypeVO
 */
package nc.bs.arap.busireg;

import java.util.ArrayList;
import java.util.List;
import nc.bs.businessevent.BusinessEvent;
import nc.bs.businessevent.IBusinessEvent;
import nc.bs.businessevent.IBusinessListener;
import nc.bs.framework.common.NCLocator;
import nc.bs.pf.pub.PfDataCache;
import nc.itf.arap.gathering.IArapGatheringBillService;
import nc.itf.arap.pay.IArapPayBillService;
import nc.vo.fbm.preturn.ReverseInfoVO;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.BusinessException;
import nc.vo.pub.billtype.BilltypeVO;

public class NoteRedHandleListener
implements IBusinessListener {
    public void doAction(IBusinessEvent event) throws BusinessException {
        BusinessEvent e = (BusinessEvent)event;
        if (null == e.getUserObject()) {
            return;
        }
        List list = (List)((BusinessEvent.BusinessUserObj)e.getUserObject()).getUserObj();
        ArrayList<ReverseInfoVO> listF2 = new ArrayList<ReverseInfoVO>();
        ArrayList<ReverseInfoVO> listF3 = new ArrayList<ReverseInfoVO>();
        for (int i = 0; i < list.size(); ++i) {
            ReverseInfoVO reverseInfoVO = (ReverseInfoVO)list.get(i);
            BilltypeVO billtypeVO = PfDataCache.getBillType((String)reverseInfoVO.getBill_type());
            String billtype = billtypeVO.getParentbilltype();
            if (!"ARAP".equalsIgnoreCase(reverseInfoVO.getUsesystem())) continue;
            if ("F2".equalsIgnoreCase(billtype)) {
                listF2.add(reverseInfoVO);
                continue;
            }
            if ("F3".equalsIgnoreCase(billtype)) {
                listF3.add(reverseInfoVO);
                continue;
            }
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61008_0", "02006v61008-0255") + reverseInfoVO.getBill_type());
        }
        if (listF2.size() > 0) {
            this.redHandleF2Bills(listF2);
        }
        if (listF3.size() > 0) {
            this.redHandleF3Bills(listF3);
        }
    }

    protected ReverseInfoVO[] dealUserObj(Object obj) {
        ReverseInfoVO[] retvos = null;
        return retvos;
    }

    private void redHandleF2Bills(List<ReverseInfoVO> list) throws BusinessException {
        IArapGatheringBillService service = (IArapGatheringBillService)NCLocator.getInstance().lookup(IArapGatheringBillService.class);
        service.noteRedHandleSaveAndSign(list);
    }

    private void redHandleF3Bills(List<ReverseInfoVO> list) throws BusinessException {
        IArapPayBillService sercie = (IArapPayBillService)NCLocator.getInstance().lookup(IArapPayBillService.class);
        sercie.noteRedHandleSaveAndSign(list);
    }
}

