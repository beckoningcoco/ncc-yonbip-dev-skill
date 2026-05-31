/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.bill.ArapBillPubUtil
 *  nc.bs.businessevent.BdUpdateEvent
 *  nc.bs.businessevent.BusinessEvent
 *  nc.bs.businessevent.IBusinessEvent
 *  nc.bs.businessevent.IBusinessListener
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.logging.Logger
 *  nc.bs.sscrp.rpbill.util.RPBillConvertUtil
 *  nc.itf.sscivm.service.IIVMInvoiceInterfaceService
 *  nc.pubitf.para.SysInitQuery
 *  nc.vo.arap.basebill.BaseAggVO
 *  nc.vo.arap.utils.ARAPModuleEnableUtil
 *  nc.vo.arap.utils.ArrayUtil
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.sscrp.rpbill.AggRPBillVO
 *  nccloud.bs.arap.sagas.util.SagasUtils
 *  nccloud.commons.lang.ArrayUtils
 *  nccloud.itf.sscivm.ivsale.service.BusiBillCancelNotifyService
 *  nccloud.pubitf.sscrp.rpbill.IRPBillSyncService
 */
package nc.bs.arap.busireg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import nc.bs.arap.bill.ArapBillPubUtil;
import nc.bs.businessevent.BdUpdateEvent;
import nc.bs.businessevent.BusinessEvent;
import nc.bs.businessevent.IBusinessEvent;
import nc.bs.businessevent.IBusinessListener;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.framework.common.NCLocator;
import nc.bs.logging.Logger;
import nc.bs.sscrp.rpbill.util.RPBillConvertUtil;
import nc.itf.sscivm.service.IIVMInvoiceInterfaceService;
import nc.pubitf.para.SysInitQuery;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.utils.ARAPModuleEnableUtil;
import nc.vo.arap.utils.ArrayUtil;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.sscrp.rpbill.AggRPBillVO;
import nccloud.bs.arap.sagas.util.SagasUtils;
import nccloud.commons.lang.ArrayUtils;
import nccloud.itf.sscivm.ivsale.service.BusiBillCancelNotifyService;
import nccloud.pubitf.sscrp.rpbill.IRPBillSyncService;

public class RPBillSyncListener
implements IBusinessListener {
    public void doAction(IBusinessEvent event) throws BusinessException {
        Object[] bills = this.getBills(event);
        if (ArrayUtils.isEmpty((Object[])bills) || SagasUtils.isCompensateStage()) {
            return;
        }
        ArapBillPubUtil.refreshChildVO2HeadVO((AggregatedValueObject[])bills);
        String eventType = event.getEventType();
        if ("1002".equals(eventType) || "200602".equals(eventType)) {
            this.syncRPBill((AggregatedValueObject[])bills, RPBillConvertUtil.OPER_INSERT);
        } else if ("1004".equals(eventType) || "200608".equals(eventType)) {
            this.syncRPBill((AggregatedValueObject[])bills, RPBillConvertUtil.OPER_UPDATE);
        } else if ("1006".equals(eventType) || "200610".equals(eventType)) {
            this.syncRPBill((AggregatedValueObject[])bills, RPBillConvertUtil.OPER_DELETE);
        } else if ("200604".equals(eventType)) {
            this.syncRPBill((AggregatedValueObject[])bills, RPBillConvertUtil.OPER_FINISH);
        } else if ("200606".equals(eventType)) {
            this.syncRPBill((AggregatedValueObject[])bills, RPBillConvertUtil.OPER_UNFINISH);
        } else if ("1020".equals(eventType)) {
            this.reimburesd((AggregatedValueObject[])bills);
        } else if ("1022".equals(eventType)) {
            this.unreimburesd((AggregatedValueObject[])bills);
            this.noticeInvoice((BaseAggVO[])bills);
        } else {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61008_0", "02006v61008-0254"));
        }
    }

    private void reimburesd(AggregatedValueObject[] bills) throws BusinessException {
        Map<String, List<String>> resultMap;
        String globalMod = this.getParmGlobal();
        if ("2".equals(globalMod) && ARAPModuleEnableUtil.isSscivmEnabled((String)InvocationInfoProxy.getInstance().getGroupId()) && (resultMap = this.getresultMap(bills, "0")) != null && resultMap.size() > 0) {
            Iterator<String> iter = resultMap.keySet().iterator();
            IIVMInvoiceInterfaceService lookup = (IIVMInvoiceInterfaceService)NCLocator.getInstance().lookup(IIVMInvoiceInterfaceService.class);
            while (iter.hasNext()) {
                String pk_org = iter.next();
                List<String> billids = resultMap.get(pk_org);
                lookup.reimbursed(billids.toArray(new String[billids.size()]), pk_org);
            }
        }
    }

    private void unreimburesd(AggregatedValueObject[] bills) throws BusinessException {
        Map<String, List<String>> resultMap;
        String globalMod = this.getParmGlobal();
        if ("2".equals(globalMod) && (resultMap = this.getresultMap(bills, "1")) != null && resultMap.size() > 0) {
            Iterator<String> iter = resultMap.keySet().iterator();
            IIVMInvoiceInterfaceService lookup = (IIVMInvoiceInterfaceService)NCLocator.getInstance().lookup(IIVMInvoiceInterfaceService.class);
            while (iter.hasNext()) {
                String pk_org = iter.next();
                List<String> billids = resultMap.get(pk_org);
                lookup.unreimbursed(billids.toArray(new String[billids.size()]), pk_org);
            }
        }
    }

    private String getParmGlobal() throws BusinessException {
        String globalMod = null;
        try {
            globalMod = SysInitQuery.getParaString((String)"GLOBLE00000000000000", (String)"IV0001");
        }
        catch (BusinessException e) {
            Logger.error((Object)(e.getMessage() + "From ARAP Determine whether to enable"));
        }
        return globalMod;
    }

    private Map<String, List<String>> getresultMap(AggregatedValueObject[] bills, String status) throws BusinessException {
        HashMap<String, List<String>> resultMap = new HashMap<String, List<String>>();
        for (AggregatedValueObject bill : bills) {
            ArrayList<String> list;
            String billType = (String)bill.getParentVO().getAttributeValue("pk_billtype");
            if (!"F1".equals(billType) && !"F3".equals(billType)) continue;
            if ("0".equals(status)) {
                if (Integer.parseInt(bill.getParentVO().getAttributeValue("approvestatus").toString()) != 1) continue;
                if (resultMap.containsKey(bill.getParentVO().getAttributeValue("pk_org"))) {
                    ((List)resultMap.get(bill.getParentVO().getAttributeValue("pk_org"))).add(bill.getParentVO().getPrimaryKey());
                    continue;
                }
                list = new ArrayList();
                list.add(bill.getParentVO().getPrimaryKey());
                resultMap.put((String)bill.getParentVO().getAttributeValue("pk_org"), list);
                continue;
            }
            if (resultMap.containsKey(bill.getParentVO().getAttributeValue("pk_org"))) {
                ((List)resultMap.get(bill.getParentVO().getAttributeValue("pk_org"))).add(bill.getParentVO().getPrimaryKey());
                continue;
            }
            list = new ArrayList<String>();
            list.add(bill.getParentVO().getPrimaryKey());
            resultMap.put((String)bill.getParentVO().getAttributeValue("pk_org"), list);
        }
        return resultMap;
    }

    private void syncRPBill(AggregatedValueObject[] bills, String oper) throws BusinessException {
        if (!ARAPModuleEnableUtil.isSscrpEnabled((String)InvocationInfoProxy.getInstance().getGroupId())) {
            return;
        }
        IRPBillSyncService lookup = (IRPBillSyncService)NCLocator.getInstance().lookup(IRPBillSyncService.class);
        for (AggregatedValueObject bill : bills) {
            String pk_billtype = (String)bill.getParentVO().getAttributeValue("pk_billtype");
            UFBoolean isInit = (UFBoolean)bill.getParentVO().getAttributeValue("isinit");
            if (isInit.booleanValue() || !"F0".equals(pk_billtype) && !"F1".equals(pk_billtype) && !"F2".equals(pk_billtype) && !"F3".equals(pk_billtype)) continue;
            String pk_tradetype = (String)bill.getParentVO().getAttributeValue("pk_tradetype");
            AggRPBillVO aggRPBillVO = RPBillConvertUtil.convertBill2AggRPBillVO((String)pk_tradetype, (AggregatedValueObject)bill);
            lookup.syncRPBill(pk_tradetype, aggRPBillVO, oper);
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

    private void noticeInvoice(BaseAggVO[] bills) throws BusinessException {
        String pk_billtype = bills[0].getHeadVO().getPk_billtype();
        if (Objects.equals("F0", pk_billtype) && ARAPModuleEnableUtil.isSscivmEnabled((String)InvocationInfoProxy.getInstance().getGroupId())) {
            HashSet<String> srcBillPks = new HashSet<String>();
            for (BaseAggVO bill : bills) {
                srcBillPks.add(bill.getHeadVO().getPrimaryKey());
            }
            ((BusiBillCancelNotifyService)NCLocator.getInstance().lookup(BusiBillCancelNotifyService.class)).cancelBusiBill(srcBillPks.toArray(new String[0]));
        }
    }
}

