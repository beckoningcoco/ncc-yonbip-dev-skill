/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.pubitf.arap.estipayable.IArapEstiPayableBillPubServiceForSCM
 *  nc.pubitf.arap.payable.IArapPayableBillPubService
 *  nc.pubitf.arap.pub.IEstServiceForSO
 *  nc.pubitf.arap.pub.IEstServiceForTO_PAY
 *  nc.pubitf.arap.pub.IEstServiceForTO_RECEIVE
 *  nc.pubitf.arap.receivable.IArapEstiReceivableBillPubServiceForSCM
 *  nc.pubitf.arap.receivable.IArapReceivableBillPubService
 *  nc.vo.arap.estipayable.AggEstiPayableBillVO
 *  nc.vo.arap.estireceivable.AggEstiReceivableBillVO
 *  nc.vo.arap.payable.AggPayableBillVO
 *  nc.vo.arap.receivable.AggReceivableBillVO
 *  nc.vo.arap.verify.AdjuestVO
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.BusinessException
 *  nccloud.pubitf.arap.pub.IArapBillPubServiceAdapterForSCM
 */
package nccloud.pubimpl.arap.arappub;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import nc.bs.framework.common.NCLocator;
import nc.pubitf.arap.estipayable.IArapEstiPayableBillPubServiceForSCM;
import nc.pubitf.arap.payable.IArapPayableBillPubService;
import nc.pubitf.arap.pub.IEstServiceForSO;
import nc.pubitf.arap.pub.IEstServiceForTO_PAY;
import nc.pubitf.arap.pub.IEstServiceForTO_RECEIVE;
import nc.pubitf.arap.receivable.IArapEstiReceivableBillPubServiceForSCM;
import nc.pubitf.arap.receivable.IArapReceivableBillPubService;
import nc.vo.arap.estipayable.AggEstiPayableBillVO;
import nc.vo.arap.estireceivable.AggEstiReceivableBillVO;
import nc.vo.arap.payable.AggPayableBillVO;
import nc.vo.arap.receivable.AggReceivableBillVO;
import nc.vo.arap.verify.AdjuestVO;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.BusinessException;
import nccloud.pubitf.arap.pub.IArapBillPubServiceAdapterForSCM;

public class ArapBillPubServiceAdapterForSCMImpl
implements IArapBillPubServiceAdapterForSCM {
    public Map<String, List<Object>> combinSaveForTO(Map<String, List<Object>> param) throws BusinessException {
        AggReceivableBillVO[] results;
        AdjuestVO[] adjustVOs;
        IEstServiceForTO_RECEIVE service;
        HashMap<String, List<Object>> resultMap = new HashMap<String, List<Object>>();
        if (param == null || param.size() == 0) {
            return resultMap;
        }
        List<Object> paramDetailList = null;
        ArrayList<Object> resultList = null;
        paramDetailList = param.get("23E0_NORMAL");
        if (paramDetailList != null) {
            AggEstiReceivableBillVO[] vos = null;
            resultList = new ArrayList<Object>();
            IArapEstiReceivableBillPubServiceForSCM service2 = (IArapEstiReceivableBillPubServiceForSCM)NCLocator.getInstance().lookup(IArapEstiReceivableBillPubServiceForSCM.class);
            for (Object obj : paramDetailList) {
                vos = (AggEstiReceivableBillVO[])ArapBillPubServiceAdapterForSCMImpl.getParam(obj, AggEstiReceivableBillVO[].class);
                AggEstiReceivableBillVO[] results2 = service2.saveEffectBill(vos);
                resultList.add(results2);
            }
            resultMap.put("23E0_NORMAL", resultList);
        }
        if ((paramDetailList = param.get("23E0_VERIFY")) != null) {
            resultList = new ArrayList();
            service = (IEstServiceForTO_RECEIVE)NCLocator.getInstance().lookup(IEstServiceForTO_RECEIVE.class);
            for (Object obj : paramDetailList) {
                adjustVOs = (AdjuestVO[])ArapBillPubServiceAdapterForSCMImpl.getParam(obj, AdjuestVO[].class);
                service.estVerify(adjustVOs);
                resultList.add("success");
            }
            resultMap.put("23E0_VERIFY", resultList);
        }
        if ((paramDetailList = param.get("F0_NORMAL")) != null) {
            resultList = new ArrayList();
            service = (IArapReceivableBillPubService)NCLocator.getInstance().lookup(IArapReceivableBillPubService.class);
            for (Object obj : paramDetailList) {
                results = service.save((AggReceivableBillVO[])ArapBillPubServiceAdapterForSCMImpl.getParam(obj, AggReceivableBillVO[].class));
                resultList.add(results);
            }
            resultMap.put("F0_NORMAL", resultList);
        }
        if ((paramDetailList = param.get("23E1_NORMAL")) != null) {
            resultList = new ArrayList();
            service = (IArapEstiPayableBillPubServiceForSCM)NCLocator.getInstance().lookup(IArapEstiPayableBillPubServiceForSCM.class);
            for (Object obj : paramDetailList) {
                results = service.saveEffectBill((AggEstiPayableBillVO[])ArapBillPubServiceAdapterForSCMImpl.getParam(obj, AggEstiPayableBillVO[].class));
                resultList.add(results);
            }
            resultMap.put("23E1_NORMAL", resultList);
        }
        if ((paramDetailList = param.get("23E1_VERIFY")) != null) {
            resultList = new ArrayList();
            service = (IEstServiceForTO_PAY)NCLocator.getInstance().lookup(IEstServiceForTO_PAY.class);
            for (Object obj : paramDetailList) {
                adjustVOs = (AdjuestVO[])ArapBillPubServiceAdapterForSCMImpl.getParam(obj, AdjuestVO[].class);
                service.estVerify(adjustVOs);
                resultList.add("success");
            }
            resultMap.put("23E1_VERIFY", resultList);
        }
        if ((paramDetailList = param.get("F1_NORMAL")) != null) {
            resultList = new ArrayList();
            service = (IArapPayableBillPubService)NCLocator.getInstance().lookup(IArapPayableBillPubService.class);
            for (Object obj : paramDetailList) {
                results = service.save((AggPayableBillVO[])ArapBillPubServiceAdapterForSCMImpl.getParam(obj, AggPayableBillVO[].class));
                resultList.add(results);
            }
            resultMap.put("F1_NORMAL", resultList);
        }
        return resultMap;
    }

    public void combinUnSaveForTO(Map<String, Object> param) throws BusinessException {
        if (param == null || param.size() == 0) {
            return;
        }
        Object paramDetail = null;
        paramDetail = param.get("23E1_VERIFY");
        if (paramDetail != null) {
            ((IEstServiceForTO_PAY)NCLocator.getInstance().lookup(IEstServiceForTO_PAY.class)).unEstVerify((String[])ArapBillPubServiceAdapterForSCMImpl.getParam(paramDetail, String[].class));
        }
        if ((paramDetail = param.get("23E1_NORMAL")) != null) {
            ((IArapEstiPayableBillPubServiceForSCM)NCLocator.getInstance().lookup(IArapEstiPayableBillPubServiceForSCM.class)).deleteBillBySourceitemPK((String[])ArapBillPubServiceAdapterForSCMImpl.getParam(paramDetail, String[].class));
        }
        if ((paramDetail = param.get("F1_NORMAL")) != null) {
            ((IArapPayableBillPubService)NCLocator.getInstance().lookup(IArapPayableBillPubService.class)).deleteBillBySourcePK((String[])ArapBillPubServiceAdapterForSCMImpl.getParam(paramDetail, String[].class));
        }
        if ((paramDetail = param.get("23E0_VERIFY")) != null) {
            ((IEstServiceForTO_RECEIVE)NCLocator.getInstance().lookup(IEstServiceForTO_RECEIVE.class)).unEstVerify((String[])ArapBillPubServiceAdapterForSCMImpl.getParam(paramDetail, String[].class));
        }
        if ((paramDetail = param.get("23E0_NORMAL")) != null) {
            ((IArapEstiReceivableBillPubServiceForSCM)NCLocator.getInstance().lookup(IArapEstiReceivableBillPubServiceForSCM.class)).deleteBillBySourceitemPK((String[])ArapBillPubServiceAdapterForSCMImpl.getParam(paramDetail, String[].class));
        }
        if ((paramDetail = param.get("F0_NORMAL")) != null) {
            ((IArapReceivableBillPubService)NCLocator.getInstance().lookup(IArapReceivableBillPubService.class)).deleteBillBySourcePK((String[])ArapBillPubServiceAdapterForSCMImpl.getParam(paramDetail, String[].class));
        }
        if ((paramDetail = param.get("F0_NORMAL_DETAIL")) != null) {
            ((IArapReceivableBillPubService)NCLocator.getInstance().lookup(IArapReceivableBillPubService.class)).deleteBillBySourceitemPK((String[])ArapBillPubServiceAdapterForSCMImpl.getParam(paramDetail, String[].class));
        }
    }

    public Map<String, Object[]> combinSaveForSO(Map<String, Object> param) throws BusinessException {
        AggReceivableBillVO[] results;
        HashMap<String, Object[]> resultMap = new HashMap<String, Object[]>();
        if (param == null || param.size() == 0) {
            return resultMap;
        }
        Object paramDetail = null;
        paramDetail = param.get("F0_NORMAL");
        if (paramDetail != null) {
            results = ((IArapReceivableBillPubService)NCLocator.getInstance().lookup(IArapReceivableBillPubService.class)).save((AggReceivableBillVO[])ArapBillPubServiceAdapterForSCMImpl.getParam(paramDetail, AggReceivableBillVO[].class));
            resultMap.put("F0_NORMAL", results);
        }
        if ((paramDetail = param.get("F1_NORMAL")) != null) {
            results = ((IArapPayableBillPubService)NCLocator.getInstance().lookup(IArapPayableBillPubService.class)).save((AggPayableBillVO[])ArapBillPubServiceAdapterForSCMImpl.getParam(paramDetail, AggPayableBillVO[].class));
            resultMap.put("F1_NORMAL", results);
        }
        if ((paramDetail = param.get("23E0_NORMAL")) != null) {
            results = ((IArapEstiReceivableBillPubServiceForSCM)NCLocator.getInstance().lookup(IArapEstiReceivableBillPubServiceForSCM.class)).saveEffectBill((AggEstiReceivableBillVO[])ArapBillPubServiceAdapterForSCMImpl.getParam(paramDetail, AggEstiReceivableBillVO[].class));
            resultMap.put("23E0_NORMAL", results);
        }
        if ((paramDetail = param.get("23E0_VERIFY")) != null) {
            AdjuestVO[] paramArray = (AdjuestVO[])ArapBillPubServiceAdapterForSCMImpl.getParam(paramDetail, AdjuestVO[].class);
            ((IEstServiceForSO)NCLocator.getInstance().lookup(IEstServiceForSO.class)).estVerify(paramArray);
            Object[] results2 = new String[paramArray.length];
            Arrays.fill(results2, "success");
            resultMap.put("23E0_VERIFY", results2);
        }
        return resultMap;
    }

    public void combinUnSaveForSO(Map<String, Object> param) throws BusinessException {
        Object paramDetail = null;
        paramDetail = param.get("23E0_VERIFY");
        if (paramDetail != null) {
            ((IEstServiceForSO)NCLocator.getInstance().lookup(IEstServiceForSO.class)).unEstVerify((String[])ArapBillPubServiceAdapterForSCMImpl.getParam(paramDetail, String[].class));
        }
        if ((paramDetail = param.get("23E0_NORMAL")) != null) {
            if (paramDetail instanceof Map) {
                ((IArapEstiReceivableBillPubServiceForSCM)NCLocator.getInstance().lookup(IArapEstiReceivableBillPubServiceForSCM.class)).deleteEffectBill((Map)paramDetail);
            } else {
                throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1081"));
            }
        }
        if ((paramDetail = param.get("F0_NORMAL_DETAIL")) != null) {
            ((IArapReceivableBillPubService)NCLocator.getInstance().lookup(IArapReceivableBillPubService.class)).deleteBillBySourceitemPK((String[])ArapBillPubServiceAdapterForSCMImpl.getParam(paramDetail, String[].class));
        }
        if ((paramDetail = param.get("F0_NORMAL")) != null) {
            ((IArapReceivableBillPubService)NCLocator.getInstance().lookup(IArapReceivableBillPubService.class)).deleteBillBySourcePK((String[])ArapBillPubServiceAdapterForSCMImpl.getParam(paramDetail, String[].class));
        }
        if ((paramDetail = param.get("F1_NORMAL")) != null) {
            ((IArapPayableBillPubService)NCLocator.getInstance().lookup(IArapPayableBillPubService.class)).deleteBillBySourcePK((String[])ArapBillPubServiceAdapterForSCMImpl.getParam(paramDetail, String[].class));
        }
    }

    private static <T> T[] getParam(Object param, Class<T[]> clazz) throws BusinessException {
        if (clazz.isInstance(param)) {
            return (Object[])param;
        }
        if (clazz.getComponentType().isInstance(param)) {
            Object array = Array.newInstance(clazz.getComponentType(), 1);
            Array.set(array, 0, param);
            return (Object[])array;
        }
        throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1081"));
    }
}

