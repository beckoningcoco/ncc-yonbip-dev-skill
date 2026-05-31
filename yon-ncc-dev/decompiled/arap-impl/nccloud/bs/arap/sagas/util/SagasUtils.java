/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.cloud.ncc.NCCEnv
 *  com.yonyou.cloud.ncc.NCCSagas
 *  com.yonyou.cloud.ncc.exception.NCCSagasException
 *  com.yonyou.cloud.ncc.irf.INCCSagasCompensateCall
 *  com.yonyou.cloud.ncc.irf.INCCSagasConfirmCall
 *  com.yonyou.cloud.ncc.plugin.entity.SagasBizInfo
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.logging.Log
 *  nc.impl.pubapp.env.BSContext
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.SuperVO
 *  org.apache.commons.lang3.ArrayUtils
 */
package nccloud.bs.arap.sagas.util;

import com.yonyou.cloud.ncc.NCCEnv;
import com.yonyou.cloud.ncc.NCCSagas;
import com.yonyou.cloud.ncc.exception.NCCSagasException;
import com.yonyou.cloud.ncc.irf.INCCSagasCompensateCall;
import com.yonyou.cloud.ncc.irf.INCCSagasConfirmCall;
import com.yonyou.cloud.ncc.plugin.entity.SagasBizInfo;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import nc.bs.arap.bill.ArapBillDAO;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.logging.Log;
import nc.impl.pubapp.env.BSContext;
import nc.vo.arap.agiotage.ArapBusiDataVO;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.utils.StringUtil;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.SuperVO;
import nccloud.bs.arap.sagas.compensate.utils.SagasCompensateUtils;
import nccloud.bs.arap.sagas.util.SagasBizInfoUtils;
import nccloud.bs.arap.sagas.util.SagasConstans;
import org.apache.commons.lang3.ArrayUtils;

public class SagasUtils
extends SagasConstans {
    public static boolean isMerged = NCCEnv.isMerged();
    public static List<String> compensate_special_billtype = Arrays.asList("36S3", "36J5", "36J7", "36J3");
    public static List<String> compensate_special_operation = Arrays.asList("invoice");
    public static List<String> ARAPBILLTYPE = Arrays.asList("F0", "F1", "F2", "F3");
    public static List<String> ARAPSPECIALBILLTYPE = Arrays.asList("F2", "F3");
    static Log log = Log.getInstance((String)"sendApLog");

    public static void frozenAndAddSaga(String operation, AggregatedValueObject ... bills) throws BusinessException {
        if (ArrayUtils.isEmpty((Object[])bills) || SagasUtils.isCompensateStage()) {
            return;
        }
        if (isMerged) {
            SagasUtils.mergedConstructBizInfo();
        } else {
            NCCSagas.frozenAndAddSaga((SagasBizInfo[])SagasBizInfoUtils.getSagasBizInfo(operation, bills));
        }
    }

    public static void frozenAndAddSaga(String operation, BaseBillVO[] headVOs, boolean isNeedCompensate) throws BusinessException {
        if (ArrayUtils.isEmpty((Object[])headVOs) || SagasUtils.isCompensateStage()) {
            return;
        }
        if (isMerged) {
            SagasUtils.mergedConstructBizInfo();
        } else {
            NCCSagas.frozenAndAddSaga((SagasBizInfo[])SagasBizInfoUtils.getSagasBizInfo(operation, headVOs, isNeedCompensate));
        }
    }

    public static void frozenAndAddSaga(String operation, SuperVO[] bills, String billNoField, String pk_billtype) throws BusinessException {
        if (ArrayUtils.isEmpty((Object[])bills) || SagasUtils.isCompensateStage()) {
            return;
        }
        if (isMerged) {
            SagasUtils.mergedConstructBizInfo();
        } else if (bills instanceof ArapBusiDataVO[]) {
            SuperVO[] newbills = new ArapBillDAO().queryAllBusidataVO(bills);
            NCCSagas.frozenAndAddSaga((SagasBizInfo[])SagasBizInfoUtils.getSagasBizInfo(operation, newbills, billNoField, pk_billtype));
        } else {
            NCCSagas.frozenAndAddSaga((SagasBizInfo[])SagasBizInfoUtils.getSagasBizInfo(operation, bills, billNoField, pk_billtype));
        }
    }

    public static void frozenAndNewSaga(String operation, AggregatedValueObject[] bills) throws BusinessException {
        if (ArrayUtils.isEmpty((Object[])bills) || SagasUtils.isCompensateStage()) {
            return;
        }
        NCCSagas.frozenAndNewSaga((boolean)true, (SagasBizInfo[])SagasBizInfoUtils.getSagasBizInfo(operation, bills));
    }

    public static void frozenBusidataAndAddSaga(String operation, AggregatedValueObject ... bills) throws BusinessException {
        if (ArrayUtils.isEmpty((Object[])bills) || SagasUtils.isCompensateStage()) {
            return;
        }
        if (isMerged) {
            SagasUtils.mergedConstructBizInfo();
        } else {
            NCCSagas.frozenAndAddSaga((SagasBizInfo[])SagasBizInfoUtils.getBusidataSagasBizInfo(operation, bills));
        }
    }

    public static void setConfirmService(Class<? extends INCCSagasConfirmCall> clazz, Map<String, Serializable> attributes) {
        if (!isMerged) {
            NCCSagas.confirm(clazz, attributes);
        }
    }

    public static void setCompensateService(Class<? extends INCCSagasCompensateCall> clazz, Map<String, Serializable> attributes) {
        if (!isMerged) {
            NCCSagas.compensate(clazz, attributes);
        }
    }

    public static void setCompensateService(String operation, AggregatedValueObject[] bills) throws BusinessException {
        BSContext.getInstance().setSession("SAGA_COMPENSTATEVAILD", (Object)"SAGA_COMPENSTATEVAILD");
        if (!isMerged && SagasUtils.compensateValiate(operation, bills[0])) {
            SagasCompensateUtils.setCompensateService(operation, bills);
        }
        BSContext.getInstance().removeSession("SAGA_COMPENSTATEVAILD");
    }

    public static boolean isCompensateStage() {
        return "SAGA_COMPENSATE_STAGE".equals(SagasUtils.getBSContextSagaStage());
    }

    public static void setBSContextSagaStage(String stage) {
        if (stage == null) {
            BSContext.getInstance().removeSession("SAGA_STAGE");
        }
        BSContext.getInstance().setSession("SAGA_STAGE", (Object)stage);
    }

    public static Object getBSContextSagaStage() {
        return BSContext.getInstance().getSession("SAGA_STAGE");
    }

    static boolean compensateValiate(String operation, AggregatedValueObject bill) {
        if (bill == null) {
            return false;
        }
        boolean isNeedCompensate = false;
        String top_billtype = (String)bill.getChildrenVO()[0].getAttributeValue("top_billtype");
        String src_billtype = (String)bill.getChildrenVO()[0].getAttributeValue("src_billtype");
        String billtype = (String)bill.getChildrenVO()[0].getAttributeValue("pk_billtype");
        if (compensate_special_operation.contains(operation)) {
            isNeedCompensate = true;
        } else if (!(StringUtil.isEmptyWithTrim(top_billtype) || ARAPBILLTYPE.contains(top_billtype) || compensate_special_billtype.contains(top_billtype))) {
            isNeedCompensate = true;
        } else if (ARAPBILLTYPE.contains(top_billtype) && !StringUtil.isEmptyWithTrim(src_billtype) && !ARAPBILLTYPE.contains(src_billtype)) {
            isNeedCompensate = true;
        } else if (ARAPSPECIALBILLTYPE.contains(billtype) && "SAGACOMPENSTATEFLAG".equals(SagasUtils.getBSContextSagaStage()) && ("effect".equals(operation) || "uneffect".equals(operation))) {
            isNeedCompensate = true;
            if ("SAGA_COMPENSTATEVAILD".equals(BSContext.getInstance().getSession("SAGA_COMPENSTATEVAILD"))) {
                BSContext.getInstance().removeSession("SAGA_STAGE");
            }
        } else if (ARAPSPECIALBILLTYPE.contains(billtype) && ("sign".equals(operation) || "unsign".equals(operation)) && "SAGACOMPENSTATEFLAGFORSIGN".equals(SagasUtils.getBSContextSagaStage())) {
            isNeedCompensate = true;
            if ("SAGA_COMPENSTATEVAILD".equals(BSContext.getInstance().getSession("SAGA_COMPENSTATEVAILD"))) {
                BSContext.getInstance().removeSession("SAGA_STAGE");
            }
        }
        return isNeedCompensate;
    }

    public static void tmpDebugLog(String operationName, Long costTime) {
        if (costTime == null) {
            return;
        }
        log.error((Object)("callid= " + InvocationInfoProxy.getInstance().getCallId() + " -- " + operationName + " -- cost: " + costTime + "ms [ARAP DEBUG]"));
    }

    private static void mergedConstructBizInfo() throws NCCSagasException {
        SagasBizInfo[] bizinfos = new SagasBizInfo[]{};
        NCCSagas.frozenAndAddSaga((SagasBizInfo[])bizinfos);
    }
}

