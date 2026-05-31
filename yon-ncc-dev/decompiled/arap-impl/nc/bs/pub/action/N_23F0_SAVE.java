/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.pub.compiler.AbstractCompiler2
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.compiler.PfParameterVO
 *  nccloud.commons.lang.StringUtils
 */
package nc.bs.pub.action;

import java.util.Hashtable;
import nc.bs.pub.compiler.AbstractCompiler2;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.pub.BusinessException;
import nc.vo.pub.compiler.PfParameterVO;
import nccloud.commons.lang.StringUtils;

public class N_23F0_SAVE
extends AbstractCompiler2 {
    private Hashtable<String, Object> m_keyHas;

    public Object runComClass(PfParameterVO paraVo) throws BusinessException {
        try {
            this.m_tmpVo = paraVo;
            Object obj = null;
            this.setParameter("context", paraVo.m_preValueVos);
            String primaryKey = paraVo.m_preValueVos[0].getParentVO().getPrimaryKey();
            obj = StringUtils.isNotEmpty((CharSequence)primaryKey) ? this.runClass("nc.bs.arap.actions.SupReceivableEditBatchBSAction", "updateVOs", "&context:nc.vo.pub.AggregatedValueObject[]", paraVo, this.m_keyHas) : this.runClass("nc.bs.arap.actions.SupReceivableSaveBatchBSAction", "insertVOs", "&context:nc.vo.pub.AggregatedValueObject[]", paraVo, this.m_keyHas);
            return obj;
        }
        catch (Exception exception) {
            throw ExceptionHandler.handleException(((Object)((Object)this)).getClass(), (Exception)exception);
        }
    }

    public String getCodeRemark() {
        return " arap action script not allowed to modify ,all rights reserved!";
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

