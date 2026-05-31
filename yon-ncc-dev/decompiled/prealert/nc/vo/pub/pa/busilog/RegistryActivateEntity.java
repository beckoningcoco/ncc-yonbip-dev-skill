/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.BusinessException
 */
package nc.vo.pub.pa.busilog;

import nc.vo.pub.BusinessException;
import nc.vo.pub.pa.AlertregistryVO;
import nc.vo.pub.pa.busilog.RegistryBusiLogEntity;

public class RegistryActivateEntity
extends RegistryBusiLogEntity {
    public RegistryActivateEntity(AlertregistryVO registry) {
        super(registry, "5bc0b9b9-7467-4d08-8a12-03ac7e0fcc23");
    }

    @Override
    public String buildLogmsg() throws BusinessException {
        return this.extractKeyInformation(this.getRegistry());
    }
}

