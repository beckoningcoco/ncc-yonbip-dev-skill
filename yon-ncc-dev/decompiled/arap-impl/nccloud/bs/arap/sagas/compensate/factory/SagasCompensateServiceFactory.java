/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.BusinessException
 */
package nccloud.bs.arap.sagas.compensate.factory;

import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.BusinessException;
import nccloud.itf.arap.sagas.compensate.action.IApproveSagasCompensateService;
import nccloud.itf.arap.sagas.compensate.action.IBusiActionSagasCompensateService;
import nccloud.itf.arap.sagas.compensate.action.ICommitSagasCompensateService;
import nccloud.itf.arap.sagas.compensate.action.IDeleteSagasCompensateService;
import nccloud.itf.arap.sagas.compensate.action.IEffectSagasCompensateService;
import nccloud.itf.arap.sagas.compensate.action.IInsertSagasCompensateService;
import nccloud.itf.arap.sagas.compensate.action.ISignSagasCompensateService;
import nccloud.itf.arap.sagas.compensate.action.IUnApproveSagasCompensateService;
import nccloud.itf.arap.sagas.compensate.action.IUnCommitSagasCompensateService;
import nccloud.itf.arap.sagas.compensate.action.IUnEffectSagasCompensateService;
import nccloud.itf.arap.sagas.compensate.action.IUnSignSagasCompensateService;
import nccloud.itf.arap.sagas.compensate.action.IUpdateSagasCompensateService;

public class SagasCompensateServiceFactory {
    public Class<? extends IBusiActionSagasCompensateService> getCompensateService(String operation) throws BusinessException {
        Class serviceClazz = null;
        switch (operation) {
            case "save": {
                serviceClazz = IInsertSagasCompensateService.class;
                break;
            }
            case "delete": {
                serviceClazz = IDeleteSagasCompensateService.class;
                break;
            }
            case "update": {
                serviceClazz = IUpdateSagasCompensateService.class;
                break;
            }
            case "commit": {
                serviceClazz = ICommitSagasCompensateService.class;
                break;
            }
            case "uncommit": {
                serviceClazz = IUnCommitSagasCompensateService.class;
                break;
            }
            case "sign": {
                serviceClazz = ISignSagasCompensateService.class;
                break;
            }
            case "unsign": {
                serviceClazz = IUnSignSagasCompensateService.class;
                break;
            }
            case "approve": {
                serviceClazz = IApproveSagasCompensateService.class;
                break;
            }
            case "unapprove": {
                serviceClazz = IUnApproveSagasCompensateService.class;
                break;
            }
            case "effect": {
                serviceClazz = IEffectSagasCompensateService.class;
                break;
            }
            case "uneffect": {
                serviceClazz = IUnEffectSagasCompensateService.class;
                break;
            }
            case "modifyeffect": {
                serviceClazz = null;
                break;
            }
            default: {
                throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1228"));
            }
        }
        return serviceClazz;
    }
}

