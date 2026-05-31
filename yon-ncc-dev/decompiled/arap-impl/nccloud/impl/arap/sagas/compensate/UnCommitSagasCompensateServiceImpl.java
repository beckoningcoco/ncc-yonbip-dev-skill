/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nccloud.itf.arap.sagas.compensate.action.IUnCommitSagasCompensateService
 */
package nccloud.impl.arap.sagas.compensate;

import nccloud.itf.arap.sagas.compensate.action.IUnCommitSagasCompensateService;

public class UnCommitSagasCompensateServiceImpl
implements IUnCommitSagasCompensateService {
    public String getBusiActionType() {
        return "uncommit";
    }
}

