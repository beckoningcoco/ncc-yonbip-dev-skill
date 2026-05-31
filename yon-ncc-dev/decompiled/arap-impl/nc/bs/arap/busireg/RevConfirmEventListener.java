/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.businessevent.BdUpdateEvent
 *  nc.bs.businessevent.BusinessEvent
 *  nc.bs.businessevent.IBusinessEvent
 *  nc.bs.businessevent.IBusinessListener
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.framework.common.NCLocator
 *  nc.itf.uap.pf.IPfExchangeService
 *  nc.pubitf.org.cache.IBasicOrgUnitPubService_C
 *  nc.pubitf.rm.IRevConfirmPubService
 *  nc.pubitf.rm.IRevenueContractService
 *  nc.vo.arap.basebill.BaseAggVO
 *  nc.vo.arap.utils.ARAPModuleEnableUtil
 *  nc.vo.arap.utils.ArrayUtil
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.rm.revconfirm.AggRevConfirmVO
 *  org.apache.commons.collections4.CollectionUtils
 *  org.apache.commons.lang3.ArrayUtils
 *  org.apache.commons.lang3.StringUtils
 */
package nc.bs.arap.busireg;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import nc.bs.businessevent.BdUpdateEvent;
import nc.bs.businessevent.BusinessEvent;
import nc.bs.businessevent.IBusinessEvent;
import nc.bs.businessevent.IBusinessListener;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.framework.common.NCLocator;
import nc.itf.uap.pf.IPfExchangeService;
import nc.pubitf.org.cache.IBasicOrgUnitPubService_C;
import nc.pubitf.rm.IRevConfirmPubService;
import nc.pubitf.rm.IRevenueContractService;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.utils.ARAPModuleEnableUtil;
import nc.vo.arap.utils.ArrayUtil;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.rm.revconfirm.AggRevConfirmVO;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

public class RevConfirmEventListener
implements IBusinessListener {
    public void doAction(IBusinessEvent event) throws BusinessException {
        if (event == null) {
            return;
        }
        String eventType = event.getEventType();
        Object[] obills = this.getBills(event);
        if (ArrayUtils.isEmpty((Object[])obills)) {
            return;
        }
        RevConfirmEventListener.sendBillMessageToRevConFirm((AggregatedValueObject[])obills, eventType);
    }

    public static void sendBillMessageToRevConFirm(AggregatedValueObject[] bills, String eventType) throws BusinessException {
        ArrayList<AggregatedValueObject> voList = new ArrayList<AggregatedValueObject>();
        ArrayList<String> srcPk = new ArrayList<String>();
        if (RevConfirmEventListener.isEnable(bills[0])) {
            for (AggregatedValueObject vo : bills) {
                String billtype = (String)vo.getParentVO().getAttributeValue("pk_billtype");
                String srcBillType = (String)vo.getChildrenVO()[0].getAttributeValue("src_billtype");
                if (!"F0".equals(billtype) || !"FCT2".equals(srcBillType)) continue;
                voList.add(vo);
                srcPk.add((String)vo.getChildrenVO()[0].getAttributeValue("src_billid"));
            }
        }
        if (CollectionUtils.isEmpty(voList)) {
            return;
        }
        AggregatedValueObject[] vos = null;
        if (RevConfirmEventListener.isPushRM(srcPk, (String)bills[0].getParentVO().getAttributeValue("sett_org"))) {
            IPfExchangeService service = (IPfExchangeService)NCLocator.getInstance().lookup(IPfExchangeService.class);
            vos = service.runChangeDataAry("F0", "RMCF", voList.toArray(new AggregatedValueObject[0]), null);
        }
        if ("200604".equals(eventType) && ArrayUtils.isNotEmpty(vos)) {
            Object[] vosRev;
            Map map = RevConfirmEventListener.getService().revConfirmSaveBeforSagasCheck((AggRevConfirmVO[])vos);
            Object[] objectArray = vosRev = map == null ? null : (AggRevConfirmVO[])map.get("confirm");
            if (ArrayUtils.isEmpty((Object[])vosRev)) {
                return;
            }
            RevConfirmEventListener.getService().revConfirmSave((AggRevConfirmVO[])vosRev);
        } else if ("200606".equals(eventType) && ArrayUtils.isNotEmpty(vos)) {
            ArrayList<String> pks = new ArrayList<String>();
            for (int i = 0; i < voList.size(); ++i) {
                pks.add(((AggregatedValueObject)voList.get(i)).getParentVO().getPrimaryKey());
            }
            RevConfirmEventListener.getService().revConfirmDeleteBeforSagasCheck(pks.toArray(new String[0]));
            RevConfirmEventListener.getService().revConfirmDelete(pks.toArray(new String[0]));
        }
    }

    private static IRevConfirmPubService getService() {
        return (IRevConfirmPubService)NCLocator.getInstance().lookup(IRevConfirmPubService.class);
    }

    private static boolean isEnable(AggregatedValueObject vo) {
        String pk_group;
        String string = pk_group = InvocationInfoProxy.getInstance().getGroupId() == null ? (String)vo.getParentVO().getAttributeValue("pk_group") : InvocationInfoProxy.getInstance().getGroupId();
        return ARAPModuleEnableUtil.isRevEnabled((String)pk_group);
    }

    private static boolean isPushRM(List<String> srcPk, String sett_org) throws BusinessException {
        String pk_org = sett_org;
        IBasicOrgUnitPubService_C units = (IBasicOrgUnitPubService_C)NCLocator.getInstance().lookup(IBasicOrgUnitPubService_C.class);
        String unit = units.getOrgModulePeriodByOrgIDAndModuleID(pk_org, "2007");
        if (StringUtils.isBlank((CharSequence)unit)) {
            return false;
        }
        if (CollectionUtils.isEmpty(srcPk)) {
            return false;
        }
        Collection aggVos = ((IRevenueContractService)NCLocator.getInstance().lookup(IRevenueContractService.class)).queryLastRMVOForFCT(srcPk.toArray(new String[srcPk.size()]));
        return !CollectionUtils.isEmpty((Collection)aggVos);
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

