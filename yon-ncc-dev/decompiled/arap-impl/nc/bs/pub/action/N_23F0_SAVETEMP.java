/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.pub.compiler.AbstractCompiler2
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.compiler.PfParameterVO
 *  nc.vo.uap.pf.PFBusinessException
 */
package nc.bs.pub.action;

import java.util.Hashtable;
import nc.bs.pub.compiler.AbstractCompiler2;
import nc.vo.pub.BusinessException;
import nc.vo.pub.compiler.PfParameterVO;
import nc.vo.uap.pf.PFBusinessException;

public class N_23F0_SAVETEMP
extends AbstractCompiler2 {
    private Hashtable<String, Object> m_methodReturnHas = new Hashtable();

    public Object runComClass(PfParameterVO pfparametervo) throws BusinessException {
        try {
            this.m_tmpVo = pfparametervo;
            Object obj = null;
            obj = this.runClass("nc.bs.arap.actions.BillTempSaveBatchAction", "insertVO", "&context:nc.vo.pub.AggregatedValueObject[]", pfparametervo, null);
            return obj;
        }
        catch (Exception ex) {
            if (ex instanceof BusinessException) {
                throw (BusinessException)ex;
            }
            throw new PFBusinessException(ex.getMessage(), (Throwable)ex);
        }
    }

    public String getCodeRemark() {
        return " arap action script not allowed to modify ,all rights reserved!";
    }
}

