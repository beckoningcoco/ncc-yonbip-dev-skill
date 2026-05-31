/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nccloud.itf.arap.sagas.compensate.action.ICommitSagasCompensateService
 */
package nccloud.impl.arap.sagas.compensate;

import nccloud.itf.arap.sagas.compensate.action.ICommitSagasCompensateService;

public class CommitSagasCompensateServiceImpl
implements ICommitSagasCompensateService {
    public String getBusiActionType() {
        return "commit";
    }
}

