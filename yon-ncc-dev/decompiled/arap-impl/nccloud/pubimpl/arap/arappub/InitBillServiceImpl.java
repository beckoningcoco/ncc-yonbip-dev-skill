/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.itf.arap.bill.IArapBillBaseService
 *  nc.itf.arap.bill.IArapBillService
 *  nc.itf.arap.initgatheringbill.IArapInitGatheringService
 *  nc.itf.arap.initpayablebill.IArapInitPayableService
 *  nc.itf.arap.initpaybill.IArapInitPaybillService
 *  nc.itf.arap.initreceivable.IArapInitRecService
 *  nc.vo.arap.basebill.BaseAggVO
 *  nc.vo.arap.basebill.BaseItemVO
 *  nc.vo.arap.pub.ArapConstant
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pub.lang.UFDateTime
 *  nccloud.dto.arap.arappub.info.CommonInfo
 *  nccloud.pubitf.arap.arappub.IArapBillPubUtilService
 *  nccloud.pubitf.arap.arappub.IBillRequiresNewDeleteService
 *  nccloud.pubitf.arap.arappub.IInitBillService
 *  org.apache.commons.lang3.ArrayUtils
 */
package nccloud.pubimpl.arap.arappub;

import java.util.ArrayList;
import java.util.HashMap;
import nc.bs.framework.common.NCLocator;
import nc.itf.arap.bill.IArapBillBaseService;
import nc.itf.arap.bill.IArapBillService;
import nc.itf.arap.initgatheringbill.IArapInitGatheringService;
import nc.itf.arap.initpayablebill.IArapInitPayableService;
import nc.itf.arap.initpaybill.IArapInitPaybillService;
import nc.itf.arap.initreceivable.IArapInitRecService;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.arap.pub.ArapConstant;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDateTime;
import nccloud.dto.arap.arappub.info.CommonInfo;
import nccloud.pubitf.arap.arappub.IArapBillPubUtilService;
import nccloud.pubitf.arap.arappub.IBillRequiresNewDeleteService;
import nccloud.pubitf.arap.arappub.IInitBillService;
import org.apache.commons.lang3.ArrayUtils;

public class InitBillServiceImpl
implements IInitBillService {
    public HashMap<String, Object> delete(BaseAggVO[] aggvos, CommonInfo[] infos) throws Exception {
        HashMap<String, UFDateTime> tsMap = new HashMap<String, UFDateTime>();
        HashMap<String, Integer> indexInfo = new HashMap<String, Integer>();
        for (CommonInfo commonInfo : infos) {
            tsMap.put(commonInfo.getPk_bill(), commonInfo.getTs());
            indexInfo.put(commonInfo.getPk_bill(), commonInfo.getIndex());
        }
        Object[] newAggvos = InitBillServiceImpl.filterSagaErrorBill(aggvos);
        if (ArrayUtils.isEmpty((Object[])newAggvos)) {
            throw new BusinessException(aggvos[0].getSagaErrorMsg());
        }
        Object[] frozenPks = InitBillServiceImpl.filterSagaErrorPk(aggvos);
        int frozenCount = frozenPks.length;
        if (!ArrayUtils.isEmpty((Object[])frozenPks)) {
            for (Object pk : frozenPks) {
                indexInfo.remove(pk);
            }
        }
        for (Object bill : newAggvos) {
            bill.getHeadVO().setTs((UFDateTime)tsMap.get(bill.getParentVO().getPrimaryKey()));
        }
        StringBuilder stringBuilder = new StringBuilder();
        ArrayList<String> successPKs = new ArrayList<String>();
        IArapBillPubUtilService iArapBillPubUtilService = (IArapBillPubUtilService)NCLocator.getInstance().lookup(IArapBillPubUtilService.class);
        IArapBillService iArapBillService = (IArapBillService)NCLocator.getInstance().lookup(IArapBillService.class);
        IBillRequiresNewDeleteService deleteService = (IBillRequiresNewDeleteService)NCLocator.getInstance().lookup(IBillRequiresNewDeleteService.class);
        IArapBillBaseService iArapBillBaseService = this.getService(newAggvos[0].getHeadVO().getPk_billtype());
        for (int i = 0; i < newAggvos.length; ++i) {
            try {
                iArapBillPubUtilService.interceptorVaildator((AggregatedValueObject[])newAggvos, ArapConstant.DELETE);
                InitBillServiceImpl.pauseTransactValidate((BaseAggVO)newAggvos[i]);
                this.dealBill((AggregatedValueObject)newAggvos[i], iArapBillService);
                deleteService.deleteInitVOS_RequiresNew(aggvos[i], iArapBillBaseService);
                successPKs.add(aggvos[i].getPrimaryKey());
                continue;
            }
            catch (Exception e) {
                stringBuilder.append(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0899", null, new String[]{newAggvos[i].getHeadVO().getBillno(), e.getMessage()}) + "\n");
            }
        }
        ArrayList successIndexs = new ArrayList();
        for (int i = 0; i < successPKs.size(); ++i) {
            successIndexs.add(indexInfo.get(successPKs.get(i)));
        }
        StringBuilder message = new StringBuilder();
        if (aggvos[0].getSagaErrorMsg() != null || frozenCount != 0) {
            stringBuilder.append(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1085") + aggvos[0].getSagaErrorMsg());
        }
        message.append(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0900", null, new String[]{String.valueOf(aggvos.length), String.valueOf(successPKs.size()), String.valueOf(aggvos.length - successPKs.size())}) + "\n");
        if (stringBuilder.length() > 0) {
            message.append(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0901") + "\n" + stringBuilder);
        }
        HashMap<String, Object> resultMap = new HashMap<String, Object>();
        if (aggvos.length == successPKs.size()) {
            resultMap.put("PopupWindowStyle", "success");
        } else if (successPKs.size() == 0) {
            resultMap.put("PopupWindowStyle", "danger");
        } else {
            resultMap.put("PopupWindowStyle", "danger");
        }
        resultMap.put("message", message);
        resultMap.put("successIndexs", successIndexs);
        resultMap.put("successPKs", successPKs);
        return resultMap;
    }

    private IArapBillBaseService getService(String billType) throws BusinessException {
        if ("F2".equals(billType)) {
            return (IArapBillBaseService)NCLocator.getInstance().lookup(IArapInitGatheringService.class);
        }
        if ("F1".equals(billType)) {
            return (IArapBillBaseService)NCLocator.getInstance().lookup(IArapInitPayableService.class);
        }
        if ("F0".equals(billType)) {
            return (IArapBillBaseService)NCLocator.getInstance().lookup(IArapInitRecService.class);
        }
        if ("F3".equals(billType)) {
            return (IArapBillBaseService)NCLocator.getInstance().lookup(IArapInitPaybillService.class);
        }
        throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0902"));
    }

    private static void pauseTransactValidate(BaseAggVO vo) throws BusinessException {
        BaseItemVO[] items;
        for (BaseItemVO item : items = vo.getItems()) {
            if (!UFBoolean.TRUE.equals((Object)item.getPausetransact())) continue;
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0784"));
        }
    }

    private void dealBill(AggregatedValueObject aggVo, IArapBillService iArapBillService) throws BusinessException {
        if (!iArapBillService.isInitBillCanEditOrDelete(new String[]{aggVo.getParentVO().getPrimaryKey()})) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0316_0", "02006arappub0316-0003"));
        }
    }

    private static String[] filterSagaErrorPk(BaseAggVO[] bills) throws BusinessException {
        if (ArrayUtils.isEmpty((Object[])bills)) {
            return null;
        }
        ArrayList<String> voList = new ArrayList<String>();
        for (BaseAggVO aggVO : bills) {
            Integer saga_status = aggVO.getHeadVO().getSaga_status();
            Integer saga_frozen = aggVO.getHeadVO().getSaga_frozen();
            if (saga_status != 1 && saga_frozen != 1 && (saga_status != null || saga_frozen != null)) continue;
            voList.add(aggVO.getParentVO().getPrimaryKey());
        }
        if (voList.size() == bills.length) {
            return null;
        }
        return voList.toArray(new String[0]);
    }

    private static BaseAggVO[] filterSagaErrorBill(BaseAggVO[] bills) {
        if (ArrayUtils.isEmpty((Object[])bills)) {
            return null;
        }
        ArrayList<BaseAggVO> voList = new ArrayList<BaseAggVO>();
        for (BaseAggVO aggVO : bills) {
            Integer saga_status = aggVO.getHeadVO().getSaga_status();
            Integer saga_frozen = aggVO.getHeadVO().getSaga_frozen();
            if (saga_status == 1 || saga_frozen == 1) continue;
            voList.add(aggVO);
        }
        if (voList.size() == bills.length) {
            return bills;
        }
        return voList.toArray(new BaseAggVO[0]);
    }
}

