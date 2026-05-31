/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.pub;

import nc.vo.pub.ValidationException;
import nc.vo.pub.ValueObject;
import nc.vo.pub.lang.UFDateTime;

public class UpdateResultVO
extends ValueObject {
    private String[] pks = null;
    private UFDateTime ts = null;

    @Override
    public String getEntityName() {
        return null;
    }

    public String[] getPks() {
        return this.pks;
    }

    public UFDateTime getTs() {
        return this.ts;
    }

    public void setPks(String[] newPks) {
        this.pks = newPks;
    }

    public void setTs(UFDateTime newTs) {
        this.ts = newTs;
    }

    @Override
    public void validate() throws ValidationException {
    }
}

