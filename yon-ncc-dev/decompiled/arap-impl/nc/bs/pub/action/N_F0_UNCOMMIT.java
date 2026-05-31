/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.validator.BillStatusUNValidator
 *  nc.bs.pub.compiler.AbstractCompiler2
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.compiler.PfParameterVO
 */
package nc.bs.pub.action;

import java.util.Hashtable;
import nc.bs.arap.validator.BillStatusUNValidator;
import nc.bs.pub.compiler.AbstractCompiler2;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.pub.BusinessException;
import nc.vo.pub.compiler.PfParameterVO;

public class N_F0_UNCOMMIT
extends AbstractCompiler2 {
    protected Hashtable<String, Object> m_keyHas = null;

    public Object runComClass(PfParameterVO pfparametervo) throws BusinessException {
        try {
            new BillStatusUNValidator().validateUNCommitStatus(pfparametervo);
            this.procRecallFlow(pfparametervo);
            this.m_tmpVo = pfparametervo;
            this.setParameter("context", pfparametervo.m_preValueVos);
            Object obj = this.runClass("nc.bs.arap.actions.BillUnCommitBatchBSAction", "updateVOs", "&context:nc.vo.pub.AggregatedValueObject[]", pfparametervo, this.m_keyHas);
            return obj;
        }
        catch (Exception exception) {
            throw ExceptionHandler.handleException(((Object)((Object)this)).getClass(), (Exception)exception);
        }
    }

    protected void setParameter(String key, Object val) {
        if (this.m_keyHas == null) {
            this.m_keyHas = new Hashtable();
        }
        if (val != null) {
            this.m_keyHas.put(key, val);
        }
    }
}

