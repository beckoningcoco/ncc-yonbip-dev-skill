/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.uif2.validation.Validator
 */
package nc.bs.arap.billact;

import java.util.List;
import nc.bs.uif2.validation.Validator;

public interface IValidatorFactory {
    public List<Validator> build(int[] var1);
}

