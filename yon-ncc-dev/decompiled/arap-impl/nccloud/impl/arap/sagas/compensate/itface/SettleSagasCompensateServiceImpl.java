/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.arap.basebill.BaseAggVO
 *  nc.vo.cmp.BusiInfo
 *  nc.vo.cmp.CMPExecStatus
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFDate
 *  nccloud.itf.arap.sagas.compensate.itface.ISettleSagasCompensateService
 */
package nccloud.impl.arap.sagas.compensate.itface;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import nc.bs.arap.actions.CommPayAndGatherBSAction;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.cmp.BusiInfo;
import nc.vo.cmp.CMPExecStatus;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDate;
import nccloud.itf.arap.sagas.compensate.itface.ISettleSagasCompensateService;

public class SettleSagasCompensateServiceImpl
implements ISettleSagasCompensateService {
    public static final String SAGAS_BILLDATA = "SAGAS_BILLDATA";
    public static final String SAGAS_SETTLE_STATUS = "SAGAS_SETTLE_STATUS";
    public static final String SAGAS_OPERATOR = "SAGAS_OPERATOR";
    public static final String SAGAS_OPERATTIME = "SAGAS_OPERATTIME";

    public void doCompensate(Map<String, Serializable> map) throws BusinessException {
        HashMap hashMap = (HashMap)map.get("SAGAS_CALL_DATA");
        BaseAggVO[] vos = (BaseAggVO[])hashMap.get(SAGAS_BILLDATA);
        String operator = (String)hashMap.get(SAGAS_OPERATOR);
        UFDate operatetime = (UFDate)hashMap.get(SAGAS_OPERATTIME);
        CMPExecStatus oriStatus = (CMPExecStatus)hashMap.get(SAGAS_SETTLE_STATUS);
        CMPExecStatus status = this.changeStatus(oriStatus);
        BusiInfo businfo = this.getbusiInfo(vos[0]);
        businfo.setOperator(operator);
        businfo.setOperatorDate(operatetime);
        CommPayAndGatherBSAction bsAction = new CommPayAndGatherBSAction();
        bsAction.initBillInfo(businfo, status);
        bsAction.updateVO((AggregatedValueObject)vos[0]);
    }

    private BusiInfo getbusiInfo(BaseAggVO vo) {
        BusiInfo info = new BusiInfo();
        info.setRawBill((Object)vo);
        return info;
    }

    private CMPExecStatus changeStatus(CMPExecStatus oriStatus) {
        CMPExecStatus retStatus = null;
        switch (oriStatus) {
            case UNPayed: {
                retStatus = CMPExecStatus.PayFinish;
                break;
            }
            case Paying: {
                retStatus = CMPExecStatus.UNPayed;
                break;
            }
            case PayFinish: {
                retStatus = CMPExecStatus.UNPayed;
                break;
            }
            case PayFail: {
                retStatus = CMPExecStatus.UNPayed;
                break;
            }
            case SomePayFinish: {
                retStatus = CMPExecStatus.UNPayed;
                break;
            }
            case UnRecive: {
                retStatus = CMPExecStatus.ReciveFinish;
                break;
            }
            case Reciving: {
                retStatus = CMPExecStatus.UnRecive;
                break;
            }
            case ReciveFinish: {
                retStatus = CMPExecStatus.UnRecive;
                break;
            }
            case ReciveFail: {
                retStatus = CMPExecStatus.UnRecive;
                break;
            }
        }
        return retStatus;
    }
}

