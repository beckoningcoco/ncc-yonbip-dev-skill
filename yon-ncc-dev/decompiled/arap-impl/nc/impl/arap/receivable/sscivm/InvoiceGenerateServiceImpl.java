/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSONObject
 *  nc.bs.arap.util.SqlUtils
 *  nc.bs.dao.BaseDAO
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.logging.Logger
 *  nc.bs.uap.lock.PKLock
 *  nc.bs.uif2.LockFailedException
 *  nc.itf.arap.receivable.sscivm.IInvoiceGenerateService
 *  nc.itf.uap.pf.IPfExchangeService
 *  nc.vo.arap.basebill.BaseAggVO
 *  nc.vo.arap.basebill.BaseBillVO
 *  nc.vo.arap.payable.PayableBillItemVO
 *  nc.vo.arap.payable.PayableBillVO
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.billtype.BilltypeVO
 *  nc.vo.sscivm.ivmpub.InvoiceTypeEnum
 *  nc.vo.util.BDVersionValidationUtil
 *  nc.web.arap.foroutsystem.info.SendInvoiceInfo
 *  nccloud.bs.arap.sagas.util.SagasUtils
 *  nccloud.bs.arap.util.Collections
 *  nccloud.itf.arap.sagas.compensate.invoice.IInvoiceGenerateCompensateService
 *  nccloud.itf.sscivm.business.service.ExchangeToIvTeamExtService
 *  nccloud.itf.sscivm.ivsale.service.ExchangeToIvAppService
 *  nccloud.pubitf.arap.arappub.IArapCommonUtilService
 *  org.apache.commons.lang3.ArrayUtils
 */
package nc.impl.arap.receivable.sscivm;

import com.alibaba.fastjson.JSONObject;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import nc.bs.arap.util.SqlUtils;
import nc.bs.dao.BaseDAO;
import nc.bs.framework.common.NCLocator;
import nc.bs.logging.Logger;
import nc.bs.uap.lock.PKLock;
import nc.bs.uif2.LockFailedException;
import nc.itf.arap.receivable.sscivm.IInvoiceGenerateService;
import nc.itf.uap.pf.IPfExchangeService;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.payable.PayableBillItemVO;
import nc.vo.arap.payable.PayableBillVO;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.SuperVO;
import nc.vo.pub.billtype.BilltypeVO;
import nc.vo.sscivm.ivmpub.InvoiceTypeEnum;
import nc.vo.util.BDVersionValidationUtil;
import nc.web.arap.foroutsystem.info.SendInvoiceInfo;
import nccloud.bs.arap.sagas.util.SagasUtils;
import nccloud.bs.arap.util.Collections;
import nccloud.itf.arap.sagas.compensate.invoice.IInvoiceGenerateCompensateService;
import nccloud.itf.sscivm.business.service.ExchangeToIvTeamExtService;
import nccloud.itf.sscivm.ivsale.service.ExchangeToIvAppService;
import nccloud.pubitf.arap.arappub.IArapCommonUtilService;
import org.apache.commons.lang3.ArrayUtils;

public class InvoiceGenerateServiceImpl
implements IInvoiceGenerateService {
    private final String PKPAYABLEBILL = "pk_payablebill";

    public Map<String, Object> generateInvoice(BaseAggVO[] bills, InvoiceTypeEnum invoiceType, Boolean isBatch) throws BusinessException {
        this.setbillsLock((AggregatedValueObject[])bills);
        this.checkBillsTs((AggregatedValueObject[])bills);
        SagasUtils.frozenAndAddSaga((String)"invoice", (AggregatedValueObject[])bills);
        return this.batctGenerate(bills, invoiceType, isBatch);
    }

    public Map<String, Object> batctGenerate(BaseAggVO[] bills, InvoiceTypeEnum invoiceType, Boolean isBatch) throws BusinessException {
        ArrayList<AggregatedValueObject> filterBills = new ArrayList<AggregatedValueObject>();
        IPfExchangeService pfExchangeService = (IPfExchangeService)NCLocator.getInstance().lookup(IPfExchangeService.class);
        ExchangeToIvAppService service = (ExchangeToIvAppService)NCLocator.getInstance().lookup(ExchangeToIvAppService.class);
        StringBuilder errMsg = new StringBuilder();
        int failNum = 0;
        for (BaseAggVO bill : bills) {
            try {
                String pk_tradetype = (String)bill.getParentVO().getAttributeValue("pk_tradetype");
                AggregatedValueObject[] destVOs = null;
                try {
                    destVOs = pfExchangeService.runChangeDataAryNeedClassify(pk_tradetype == null ? "F0" : pk_tradetype, "SSCIVA", (AggregatedValueObject[])new BaseAggVO[]{bill}, null, 1);
                    if (destVOs == null || destVOs.length == 0 || destVOs[0] == null || destVOs[0].getParentVO() == null) {
                        throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1103"));
                    }
                }
                catch (BusinessException e) {
                    errMsg.append(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0019"));
                    errMsg.append(String.valueOf(bill.getHeadVO().getBillno()));
                    errMsg.append(e.getMessage());
                }
                if (destVOs == null || destVOs.length == 0 || destVOs[0] == null || destVOs[0].getParentVO() == null) {
                    throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1103"));
                }
                service.validateBeforeExchange(destVOs, Integer.valueOf(invoiceType.toIntValue()));
                filterBills.addAll(Arrays.asList(destVOs));
            }
            catch (Exception e) {
                if (!isBatch.booleanValue()) {
                    throw new BusinessException((Throwable)e);
                }
                ++failNum;
                errMsg.append(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0995"));
                errMsg.append(e.getMessage());
                errMsg.append("\n");
            }
        }
        HashMap<String, Object> responseMap = new HashMap<String, Object>();
        if (filterBills.size() > 0) {
            List resultList = null;
            try {
                BaseBillVO[] billvos = this.getRelateBill(bills);
                JSONObject[] json = this.getRelateBillInfo(billvos);
                ExchangeToIvTeamExtService newservice = (ExchangeToIvTeamExtService)NCLocator.getInstance().lookup(ExchangeToIvTeamExtService.class);
                resultList = newservice.executeExchange(filterBills.toArray(new AggregatedValueObject[0]), Integer.valueOf(invoiceType.toIntValue()), json);
            }
            catch (Exception e) {
                if (!isBatch.booleanValue()) {
                    throw new BusinessException((Throwable)e);
                }
                ++failNum;
                errMsg.append(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0995"));
                errMsg.append(e.getMessage());
                errMsg.append("\n");
            }
            if (!isBatch.booleanValue() && Collections.isNotEmpty((Collection)resultList)) {
                responseMap.put("successMsg", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1009", null, new String[]{(String)resultList.get(0)}));
            }
            SagasUtils.setCompensateService(IInvoiceGenerateCompensateService.class, new HashMap());
        }
        responseMap.put("failNum", failNum);
        responseMap.put("errMsg", errMsg);
        return responseMap;
    }

    private String setbillsLock(AggregatedValueObject ... bills) throws BusinessException {
        String[] pks = new String[bills.length];
        int size = pks.length;
        for (int i = 0; i < size; ++i) {
            pks[i] = bills[i].getParentVO().getPrimaryKey();
        }
        if (!PKLock.getInstance().addBatchDynamicLock(pks)) {
            throw new LockFailedException(pks);
        }
        return null;
    }

    private void checkBillsTs(AggregatedValueObject ... bills) throws BusinessException {
        ArrayList<SuperVO> superVOs = new ArrayList<SuperVO>();
        for (AggregatedValueObject bill : bills) {
            superVOs.add((SuperVO)bill.getParentVO());
        }
        BDVersionValidationUtil.validateSuperVO((SuperVO[])superVOs.toArray(new SuperVO[0]));
    }

    private BaseBillVO[] getRelateBill(BaseAggVO[] bills) throws BusinessException {
        if (ArrayUtils.isEmpty((Object[])bills)) {
            return null;
        }
        BaseDAO dao = new BaseDAO();
        ArrayList<String> srcbillidList = new ArrayList<String>();
        ArrayList<String> pkList = new ArrayList<String>();
        for (BaseAggVO bill : bills) {
            srcbillidList.add(bill.getPrimaryKey());
        }
        String childCondition = null;
        String parentCondition = null;
        try {
            PayableBillItemVO[] itemvos;
            childCondition = SqlUtils.getInStr((String)"src_billid", (String[])srcbillidList.toArray(new String[0]), (boolean[])new boolean[]{true});
            childCondition = childCondition + " and src_billtype='F0' ";
            childCondition = childCondition + " and dr=0 ";
            List cresult = (List)dao.retrieveByClause(PayableBillItemVO.class, childCondition, "pk_payablebill");
            if (Collections.isEmpty((Collection)cresult)) {
                return null;
            }
            for (PayableBillItemVO item : itemvos = cresult.toArray(new PayableBillItemVO[0])) {
                pkList.add(item.getParentPK());
            }
            parentCondition = SqlUtils.getInStr((String)"pk_payablebill", (String[])pkList.toArray(new String[0]), (boolean[])new boolean[]{true});
            parentCondition = parentCondition + " and dr=0 ";
        }
        catch (SQLException e) {
            Logger.error((Object)(e.getMessage() + "Get relateBill  Sql For F1"));
            throw new BusinessException(e.getMessage());
        }
        List presult = (List)dao.retrieveByClause(PayableBillVO.class, parentCondition);
        return Collections.isEmpty((Collection)presult) ? null : presult.toArray(new BaseBillVO[0]);
    }

    private JSONObject[] getRelateBillInfo(BaseBillVO[] billvos) {
        if (ArrayUtils.isEmpty((Object[])billvos)) {
            return null;
        }
        ArrayList<JSONObject> infoList = new ArrayList<JSONObject>();
        BilltypeVO billTypeVO = ((IArapCommonUtilService)NCLocator.getInstance().lookup(IArapCommonUtilService.class)).getBillType("F1");
        String billTypeId = billTypeVO.getPk_billtypeid();
        for (BaseBillVO vo : billvos) {
            SendInvoiceInfo info = new SendInvoiceInfo();
            info.setSrc_pk_org(vo.getPk_org());
            info.setSrc_billid((String)vo.getAttributeValue("pk_payablebill"));
            info.setSrc_billno(vo.getBillno());
            info.setSrc_billtype(vo.getPk_billtype());
            info.setSrc_billtypeid(billTypeId != null ? billTypeId : "0000Z3000000000000F1");
            info.setSrc_spr(vo.getBillmaker());
            info.setSrc_tradetype(vo.getPk_tradetype());
            info.setSrc_tradetypeid(vo.getPk_tradetypeid());
            JSONObject json = (JSONObject)JSONObject.toJSON((Object)info);
            infoList.add(json);
        }
        JSONObject[] infos = infoList.toArray(new JSONObject[0]);
        return infos;
    }
}

