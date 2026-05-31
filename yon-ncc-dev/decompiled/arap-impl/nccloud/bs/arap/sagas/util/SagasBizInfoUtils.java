/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.cloud.ncc.plugin.entity.OperationInfo
 *  com.yonyou.cloud.ncc.plugin.entity.SagasBizInfo
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.framework.common.NCLocator
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.lang.UFDate
 *  nccloud.putitf.riart.billtype.IBillRelatedAppService
 *  org.apache.commons.lang3.ArrayUtils
 */
package nccloud.bs.arap.sagas.util;

import com.yonyou.cloud.ncc.plugin.entity.OperationInfo;
import com.yonyou.cloud.ncc.plugin.entity.SagasBizInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import nc.bs.arap.bill.ArapBillDAO;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.framework.common.NCLocator;
import nc.vo.arap.agiotage.ArapBusiDataVO;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFDate;
import nccloud.bs.arap.sagas.util.SagasConstans;
import nccloud.bs.arap.sagas.util.SagasUtils;
import nccloud.putitf.riart.billtype.IBillRelatedAppService;
import org.apache.commons.lang3.ArrayUtils;

public class SagasBizInfoUtils
extends SagasConstans {
    public static final String APPCODE = "appcode";
    public static final String PAGECODE = "pageCode";
    public static final String BUTTONCODE = "buttonCode";
    public static final String PROUCTCODE = "2006pub_0";
    private static Map<String, String> operationResIdMap = null;
    private static IBillRelatedAppService billRelatedAppService = null;

    static SagasBizInfo[] getSagasBizInfo(String operation, AggregatedValueObject ... bills) throws BusinessException {
        SuperVO[] vos = new SuperVO[bills.length];
        HashMap<String, String> billNos = new HashMap<String, String>();
        ArrayList<String> businessPks = new ArrayList<String>();
        for (int i = 0; i < bills.length; ++i) {
            vos[i] = (SuperVO)bills[i].getParentVO();
            billNos.put(vos[i].getPrimaryKey(), (String)vos[i].getAttributeValue("billno"));
            businessPks.add(vos[i].getPrimaryKey());
        }
        ArrayList<SagasBizInfo> infoList = new ArrayList<SagasBizInfo>();
        SagasBizInfo bizinfo = new SagasBizInfo();
        SuperVO parenVO = (SuperVO)bills[0].getParentVO();
        String pk_billType = (String)parenVO.getAttributeValue("pk_billtype");
        String pk_tradeType = (String)parenVO.getAttributeValue("pk_tradetype");
        bizinfo.setTradeType(pk_tradeType);
        bizinfo.setBillType(pk_billType);
        bizinfo.setBillNos(billNos);
        bizinfo.setBusinessPks(businessPks);
        bizinfo.setOperation(SagasBizInfoUtils.getOperationInfo(operation, pk_billType));
        bizinfo.setTableName(parenVO.getTableName());
        bizinfo.setPkFieldName(parenVO.getPKFieldName());
        bizinfo.setOperator(InvocationInfoProxy.getInstance().getUserId());
        bizinfo.setBusinessDate(new UFDate(InvocationInfoProxy.getInstance().getBizDateTime()).toLocalString());
        bizinfo.setCompensable(SagasBizInfoUtils.isCompensable(operation, bills[0]));
        bizinfo.setNeedmerge(SagasBizInfoUtils.isNeedmerge(operation, pk_billType));
        bizinfo.setHyperlink(SagasBizInfoUtils.isHyperLink(operation, pk_billType));
        infoList.add(bizinfo);
        return infoList.toArray(new SagasBizInfo[infoList.size()]);
    }

    static SagasBizInfo[] getSagasBizInfo(String operation, BaseBillVO[] headVOs, boolean isNeedCompensate) throws BusinessException {
        HashMap<String, String> billNos = new HashMap<String, String>();
        ArrayList<String> businessPks = new ArrayList<String>();
        for (int i = 0; i < headVOs.length; ++i) {
            billNos.put(headVOs[i].getPrimaryKey(), headVOs[i].getBillno());
            businessPks.add(headVOs[i].getPrimaryKey());
        }
        ArrayList<SagasBizInfo> infoList = new ArrayList<SagasBizInfo>();
        SagasBizInfo bizinfo = new SagasBizInfo();
        String pk_billType = (String)headVOs[0].getAttributeValue("pk_billtype");
        String pk_tradeType = (String)headVOs[0].getAttributeValue("pk_tradetype");
        bizinfo.setTradeType(pk_tradeType);
        bizinfo.setBillType(pk_billType);
        bizinfo.setBillNos(billNos);
        bizinfo.setBusinessPks(businessPks);
        bizinfo.setOperation(SagasBizInfoUtils.getOperationInfo(operation, pk_billType));
        bizinfo.setTableName(headVOs[0].getTableName());
        bizinfo.setPkFieldName(headVOs[0].getPKFieldName());
        bizinfo.setOperator(InvocationInfoProxy.getInstance().getUserId());
        bizinfo.setBusinessDate(new UFDate(InvocationInfoProxy.getInstance().getBizDateTime()).toLocalString());
        bizinfo.setCompensable(isNeedCompensate ? CompensateStatus.ABLE.VALUE : CompensateStatus.UNABLE.VALUE);
        bizinfo.setNeedmerge(SagasBizInfoUtils.isNeedmerge(operation, pk_billType));
        bizinfo.setHyperlink(SagasBizInfoUtils.isHyperLink(operation, pk_billType));
        infoList.add(bizinfo);
        return infoList.toArray(new SagasBizInfo[infoList.size()]);
    }

    static SagasBizInfo[] getSagasBizInfo(String operation, String pk_billtype, SuperVO[] bills) throws BusinessException {
        HashMap<String, String> billNos = new HashMap<String, String>();
        ArrayList<String> businessPks = new ArrayList<String>();
        for (int i = 0; i < bills.length; ++i) {
            billNos.put(bills[i].getPrimaryKey(), (String)bills[i].getAttributeValue("billno"));
            businessPks.add(bills[i].getPrimaryKey());
        }
        ArrayList<SagasBizInfo> infoList = new ArrayList<SagasBizInfo>();
        SagasBizInfo bizinfo = new SagasBizInfo();
        bizinfo.setBillType(pk_billtype);
        bizinfo.setBillNos(billNos);
        bizinfo.setBusinessPks(businessPks);
        bizinfo.setOperation(SagasBizInfoUtils.getOperationInfo(operation, pk_billtype));
        bizinfo.setTableName(bills[0].getTableName());
        bizinfo.setPkFieldName(bills[0].getPKFieldName());
        bizinfo.setOperator(InvocationInfoProxy.getInstance().getUserId());
        bizinfo.setBusinessDate(new UFDate(InvocationInfoProxy.getInstance().getBizDateTime()).toLocalString());
        bizinfo.setNeedmerge(SagasBizInfoUtils.isNeedmerge(operation, pk_billtype));
        bizinfo.setHyperlink(SagasBizInfoUtils.isHyperLink(operation, pk_billtype));
        infoList.add(bizinfo);
        return infoList.toArray(new SagasBizInfo[infoList.size()]);
    }

    static SagasBizInfo[] getSagasBizInfo(String operation, SuperVO[] bills, String billNoField, String pk_billtype) throws BusinessException {
        HashMap<String, String> billNos = new HashMap<String, String>();
        ArrayList<String> businessPks = new ArrayList<String>();
        for (int i = 0; i < bills.length; ++i) {
            billNos.put(bills[i].getPrimaryKey(), (String)bills[i].getAttributeValue(billNoField));
            businessPks.add(bills[i].getPrimaryKey());
        }
        ArrayList<SagasBizInfo> infoList = new ArrayList<SagasBizInfo>();
        SagasBizInfo bizinfo = new SagasBizInfo();
        bizinfo.setBillType(pk_billtype);
        bizinfo.setBillNos(billNos);
        bizinfo.setBusinessPks(businessPks);
        bizinfo.setOperation(SagasBizInfoUtils.getOperationInfo(operation, pk_billtype));
        bizinfo.setTableName(bills[0].getTableName());
        bizinfo.setPkFieldName(bills[0].getPKFieldName());
        bizinfo.setOperator(InvocationInfoProxy.getInstance().getUserId());
        bizinfo.setBusinessDate(new UFDate(InvocationInfoProxy.getInstance().getBizDateTime()).toLocalString());
        bizinfo.setNeedmerge(SagasBizInfoUtils.isNeedmerge(operation, pk_billtype));
        bizinfo.setHyperlink(SagasBizInfoUtils.isHyperLink(operation, pk_billtype));
        infoList.add(bizinfo);
        return infoList.toArray(new SagasBizInfo[infoList.size()]);
    }

    static SagasBizInfo[] getBusidataSagasBizInfo(String operation, AggregatedValueObject ... bills) throws BusinessException {
        String[] keys = new String[bills.length];
        for (int i = 0; i < bills.length; ++i) {
            keys[i] = bills[i].getParentVO().getPrimaryKey();
        }
        String[] queryFields = new String[]{"pk_busidata", "billno", "pk_billtype", "pk_bill"};
        ArapBusiDataVO[] busidataVOs = new ArapBillDAO().queryBusiDataByBillKeys(keys, queryFields);
        if (ArrayUtils.isEmpty((Object[])busidataVOs)) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID(PROUCTCODE, "02006pub-1229"));
        }
        HashMap<String, String> billNos = new HashMap<String, String>();
        ArrayList<String> businessPks = new ArrayList<String>();
        for (ArapBusiDataVO busidataVO : busidataVOs) {
            billNos.put(busidataVO.getPk_busidata(), busidataVO.getBillno());
            businessPks.add(busidataVO.getPk_busidata());
        }
        String pk_billtype = busidataVOs[0].getPk_billtype();
        ArrayList<SagasBizInfo> infoList = new ArrayList<SagasBizInfo>();
        SagasBizInfo bizinfo = new SagasBizInfo();
        bizinfo.setBillType(pk_billtype);
        bizinfo.setBillNos(billNos);
        bizinfo.setBusinessPks(businessPks);
        bizinfo.setOperation(SagasBizInfoUtils.getOperationInfo(operation, pk_billtype));
        bizinfo.setTableName(busidataVOs[0].getTableName());
        bizinfo.setPkFieldName(busidataVOs[0].getPKFieldName());
        bizinfo.setOperator(InvocationInfoProxy.getInstance().getUserId());
        bizinfo.setBusinessDate(new UFDate(InvocationInfoProxy.getInstance().getBizDateTime()).toLocalString());
        bizinfo.setCompensable(CompensateStatus.UNABLE.VALUE);
        bizinfo.setNeedmerge(MergeStatus.UNNEED.VALUE);
        bizinfo.setHyperlink(HyperLinkStatus.UNABLE.VALUE);
        infoList.add(bizinfo);
        return infoList.toArray(new SagasBizInfo[infoList.size()]);
    }

    private static OperationInfo getOperationInfo(String operation, String billtype) throws BusinessException {
        OperationInfo operationInfo = new OperationInfo();
        String appCode = InvocationInfoProxy.getInstance().getProperty(APPCODE);
        String pageCode = InvocationInfoProxy.getInstance().getProperty(PAGECODE);
        String buttonCode = InvocationInfoProxy.getInstance().getProperty(BUTTONCODE);
        if (buttonCode != null && appCode != null && SagasBizInfoUtils.getBillRelatedAppService().isAppcodeBelongToBilltype(appCode, billtype)) {
            operationInfo.setAppCode(appCode);
            operationInfo.setPageCode(pageCode);
            operationInfo.setButtonCode(buttonCode);
        } else {
            String resId = SagasBizInfoUtils.getOperationResid(operation);
            operationInfo.setProductCode(PROUCTCODE);
            operationInfo.setResId(resId);
        }
        return operationInfo;
    }

    private static String getOperationResid(String operation) {
        if (null == operationResIdMap) {
            operationResIdMap = new HashMap<String, String>();
            operationResIdMap.put("save", "02006pub-1040");
            operationResIdMap.put("update", "02006pub-1040");
            operationResIdMap.put("delete", "02006pub-1041");
            operationResIdMap.put("commit", "02006pub-1042");
            operationResIdMap.put("uncommit", "02006pub-1043");
            operationResIdMap.put("approve", "02006pub-1044");
            operationResIdMap.put("unapprove", "02006pub-1045");
            operationResIdMap.put("sign", "02006pub-1046");
            operationResIdMap.put("unsign", "02006pub-1047");
            operationResIdMap.put("effect", "02006pub-1048");
            operationResIdMap.put("modifyeffect", "02006pub-1048");
            operationResIdMap.put("uneffect", "02006pub-1049");
            operationResIdMap.put("verify", "02006pub-1050");
            operationResIdMap.put("unverify", "02006pub-1051");
            operationResIdMap.put("agiotage", "02006pub-1052");
            operationResIdMap.put("unagiotage", "02006pub-1053");
            operationResIdMap.put("invoice", "02006pub-1054");
            operationResIdMap.put("sendfip", "02006pub-1055");
            operationResIdMap.put("debttransfer", "02006pub-1056");
            operationResIdMap.put("undebttransfer", "02006pub-1057");
            operationResIdMap.put("refund", "02006pub-1058");
            operationResIdMap.put("cancelrefund", "02006pub-1059");
            operationResIdMap.put("going", "02006pub-1060");
        }
        return operationResIdMap.get(operation);
    }

    private static IBillRelatedAppService getBillRelatedAppService() {
        if (billRelatedAppService == null) {
            billRelatedAppService = (IBillRelatedAppService)NCLocator.getInstance().lookup(IBillRelatedAppService.class);
        }
        return billRelatedAppService;
    }

    private static String isCompensable(String operation, AggregatedValueObject bill) {
        return SagasUtils.compensateValiate(operation, bill) ? CompensateStatus.ABLE.VALUE : CompensateStatus.UNABLE.VALUE;
    }

    private static String isNeedmerge(String operation, String pk_billType) {
        return "other".equals(operation) ? MergeStatus.UNNEED.VALUE : MergeStatus.NEED.VALUE;
    }

    private static String isHyperLink(String operation, String pk_billType) {
        if ("verify".equals(operation) || "unverify".equals(operation)) {
            return HyperLinkStatus.UNABLE.VALUE;
        }
        return HyperLinkStatus.ABLE.VALUE;
    }

    static enum HyperLinkStatus {
        UNABLE(0),
        ABLE(1);

        public final String VALUE;

        private HyperLinkStatus(int value) {
            this.VALUE = value + "";
        }
    }

    static enum MergeStatus {
        UNNEED(0),
        NEED(1);

        public final String VALUE;

        private MergeStatus(int value) {
            this.VALUE = value + "";
        }
    }

    static enum CompensateStatus {
        UNABLE(0),
        ABLE(1),
        AUTO(2);

        public final String VALUE;

        private CompensateStatus(int value) {
            this.VALUE = value + "";
        }
    }
}

