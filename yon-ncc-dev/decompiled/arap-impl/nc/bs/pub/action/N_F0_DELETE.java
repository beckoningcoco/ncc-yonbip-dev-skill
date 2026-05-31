/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.vo.arap.pub.ArapConstant
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.compiler.PfParameterVO
 *  nccloud.pubitf.arap.arappub.IArapBillPubUtilService
 */
package nc.bs.pub.action;

import java.util.Hashtable;
import nc.bs.framework.common.NCLocator;
import nc.bs.pub.action.N_F0_ACTION;
import nc.vo.arap.pub.ArapConstant;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.pub.BusinessException;
import nc.vo.pub.compiler.PfParameterVO;
import nccloud.pubitf.arap.arappub.IArapBillPubUtilService;

public class N_F0_DELETE
extends N_F0_ACTION {
    private Hashtable<String, Object> m_keyHas = null;

    public Object runComClass(PfParameterVO paraVo) throws BusinessException {
        try {
            if (paraVo.m_preValueVos == null) {
                return null;
            }
            Object obj = null;
            this.m_tmpVo = paraVo;
            String actionCode = ArapConstant.DELETE;
            ((IArapBillPubUtilService)NCLocator.getInstance().lookup(IArapBillPubUtilService.class)).interceptorVaildator(paraVo.m_preValueVos, actionCode);
            this.setParameter("context", paraVo.m_preValueVos);
            obj = this.runClass("nc.bs.arap.actions.ReceivableDeleteBatchBSAction", "deleteVOs", "&context:nc.vo.pub.AggregatedValueObject[]", paraVo, this.m_keyHas);
            this.doCreditCheck();
            return obj;
        }
        catch (Exception ex) {
            throw ExceptionHandler.handleException(((Object)((Object)this)).getClass(), (Exception)ex);
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

