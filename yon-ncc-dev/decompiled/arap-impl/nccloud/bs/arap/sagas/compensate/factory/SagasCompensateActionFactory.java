/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.BusinessException
 */
package nccloud.bs.arap.sagas.compensate.factory;

import java.util.HashMap;
import java.util.Map;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.BusinessException;

public class SagasCompensateActionFactory {
    private static Map<String, Map<String, String>> actionClassNameMap = new HashMap<String, Map<String, String>>();

    public String getSagasCompensateAction(String operation, String pk_billtype) throws BusinessException {
        if (operation == null || pk_billtype == null) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1094"));
        }
        String actionClassName = this.getCacheAction(operation, pk_billtype);
        if (actionClassName == null) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1094"));
        }
        return actionClassName;
    }

    private String getCacheAction(String operation, String pk_billtype) throws BusinessException {
        Map<String, String> classNameMap = actionClassNameMap.get(operation);
        if (classNameMap == null) {
            classNameMap = this.lazyLoadClassNameMap(operation, pk_billtype);
        }
        return classNameMap.get(pk_billtype);
    }

    private Map<String, String> lazyLoadClassNameMap(String operation, String pk_billtype) throws BusinessException {
        HashMap<String, String> classNameMap = new HashMap<String, String>();
        switch (operation) {
            case "save": {
                classNameMap.put("F0", "nccloud.bs.arap.sagas.compensate.actions.receivable.ReceivableDeleteSagasCompensateAction");
                classNameMap.put("F1", "nccloud.bs.arap.sagas.compensate.actions.payable.PayablebillDeleteSagasCompensateAction");
                classNameMap.put("F2", "nccloud.bs.arap.sagas.compensate.actions.gathering.GatheringbillDeleteSagasCompensateAction");
                classNameMap.put("F3", "nccloud.bs.arap.sagas.compensate.actions.pay.PaybillDeleteSagasCompensateAction");
                classNameMap.put("23E0", "nccloud.bs.arap.sagas.compensate.actions.estireceivable.EstiReceivableDeleteSagasCompensateAction");
                classNameMap.put("23E1", "nccloud.bs.arap.sagas.compensate.actions.estipayable.EstiPayableDeleteSagasCompensateAction");
                break;
            }
            case "delete": {
                classNameMap.put("F0", "nccloud.bs.arap.sagas.compensate.actions.receivable.ReceivableInsertSagasCompensateAction");
                classNameMap.put("F1", "nccloud.bs.arap.sagas.compensate.actions.payable.PayablebillInsertSagasCompensateAction");
                classNameMap.put("F2", "nccloud.bs.arap.sagas.compensate.actions.gathering.GatheringbillInsertSagasCompensateAction");
                classNameMap.put("F3", "nccloud.bs.arap.sagas.compensate.actions.pay.PaybillInsertSagasCompensateAction");
                classNameMap.put("23E0", "nccloud.bs.arap.sagas.compensate.actions.estireceivable.EstiReceivableInsertSagasCompensateAction");
                classNameMap.put("23E1", "nccloud.bs.arap.sagas.compensate.actions.estipayable.EstiPayableInsertSagasCompensateAction");
                break;
            }
            case "update": {
                classNameMap.put("F0", "nccloud.bs.arap.sagas.compensate.actions.receivable.ReceivableUpdateSagasCompensateAction");
                classNameMap.put("F1", "nccloud.bs.arap.sagas.compensate.actions.payable.PayablebillUpdateSagasCompensateAction");
                classNameMap.put("F2", "nccloud.bs.arap.sagas.compensate.actions.gathering.GatheringbillUpdateSagasCompensateAction");
                classNameMap.put("F3", "nccloud.bs.arap.sagas.compensate.actions.pay.PaybillUpdateSagasCompensateAction");
                classNameMap.put("23E0", "nccloud.bs.arap.sagas.compensate.actions.estireceivable.EstiReceivableUpdateSagasCompensateAction");
                classNameMap.put("23E1", "nccloud.bs.arap.sagas.compensate.actions.estipayable.EstiPayableUpdateSagasCompensateAction");
                break;
            }
            case "commit": {
                String unCommitAction = "nccloud.bs.arap.sagas.compensate.billact.UnCommitSagasCompensateAction";
                classNameMap.put("F0", unCommitAction);
                classNameMap.put("F1", unCommitAction);
                classNameMap.put("F2", unCommitAction);
                classNameMap.put("F3", unCommitAction);
                classNameMap.put("23E0", unCommitAction);
                classNameMap.put("23E1", unCommitAction);
                break;
            }
            case "uncommit": {
                String commitAction = "nccloud.bs.arap.sagas.compensate.billact.CommitSagasCompensateAction";
                classNameMap.put("F0", commitAction);
                classNameMap.put("F1", commitAction);
                classNameMap.put("F2", commitAction);
                classNameMap.put("F3", commitAction);
                classNameMap.put("23E0", commitAction);
                classNameMap.put("23E1", commitAction);
                break;
            }
            case "approve": {
                classNameMap.put("F0", "nccloud.bs.arap.sagas.compensate.actions.receivable.ReceivableUnApproveSagasCompensateAction");
                classNameMap.put("F1", "nccloud.bs.arap.sagas.compensate.actions.payable.PayablebillUnApproveSagasCompensateAction");
                classNameMap.put("F2", "nccloud.bs.arap.sagas.compensate.actions.gathering.GatheringbillUnApproveSagasCompensateAction");
                classNameMap.put("F3", "nccloud.bs.arap.sagas.compensate.actions.pay.PaybillUnApproveSagasCompensateAction");
                classNameMap.put("23E0", "nccloud.bs.arap.sagas.compensate.actions.estireceivable.EstiReceivableUnApproveSagasCompensateAction");
                classNameMap.put("23E1", "nccloud.bs.arap.sagas.compensate.actions.estipayable.EstiPayableUnApproveSagasCompensateAction");
                break;
            }
            case "unapprove": {
                classNameMap.put("F0", "nccloud.bs.arap.sagas.compensate.actions.receivable.ReceivableApproveSagasCompensateAction");
                classNameMap.put("F1", "nccloud.bs.arap.sagas.compensate.actions.payable.PayablebillApproveSagasCompensateAction");
                classNameMap.put("F2", "nccloud.bs.arap.sagas.compensate.actions.gathering.GatheringbillApproveSagasCompensateAction");
                classNameMap.put("F3", "nccloud.bs.arap.sagas.compensate.actions.pay.PaybillApproveSagasCompensateAction");
                classNameMap.put("23E0", "nccloud.bs.arap.sagas.compensate.actions.estireceivable.EstiReceivableApproveSagasCompensateAction");
                classNameMap.put("23E1", "nccloud.bs.arap.sagas.compensate.actions.estipayable.EstiPayableApproveSagasCompensateAction");
                break;
            }
            case "sign": {
                String unSignAction = "nccloud.bs.arap.sagas.compensate.billact.UnSignSagasCompensateAction";
                classNameMap.put("F0", unSignAction);
                classNameMap.put("F1", unSignAction);
                classNameMap.put("F2", unSignAction);
                classNameMap.put("F3", unSignAction);
                classNameMap.put("23E0", unSignAction);
                classNameMap.put("23E1", unSignAction);
                break;
            }
            case "unsign": {
                String signAction = "nccloud.bs.arap.sagas.compensate.billact.SignSagasCompensateAction";
                classNameMap.put("F0", signAction);
                classNameMap.put("F1", signAction);
                classNameMap.put("F2", signAction);
                classNameMap.put("F3", signAction);
                classNameMap.put("23E0", signAction);
                classNameMap.put("23E1", signAction);
                break;
            }
            case "effect": {
                String unEffectAction = "nccloud.bs.arap.sagas.compensate.billact.UnEffectSagasCompensateAction";
                classNameMap.put("F0", unEffectAction);
                classNameMap.put("F1", unEffectAction);
                classNameMap.put("F2", unEffectAction);
                classNameMap.put("F3", unEffectAction);
                classNameMap.put("23E0", unEffectAction);
                classNameMap.put("23E1", unEffectAction);
                break;
            }
            case "uneffect": {
                String effectAction = "nccloud.bs.arap.sagas.compensate.billact.EffectSagasCompensateAction";
                classNameMap.put("F0", effectAction);
                classNameMap.put("F1", effectAction);
                classNameMap.put("F2", effectAction);
                classNameMap.put("F3", effectAction);
                classNameMap.put("23E0", effectAction);
                classNameMap.put("23E1", effectAction);
                break;
            }
            default: {
                throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1094"));
            }
        }
        actionClassNameMap.put(operation, classNameMap);
        return classNameMap;
    }
}

