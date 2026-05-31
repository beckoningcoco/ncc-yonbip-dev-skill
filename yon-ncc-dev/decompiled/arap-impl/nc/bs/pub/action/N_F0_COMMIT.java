/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.framework.common.NCLocator
 *  nc.itf.imag.lightbus.IImagPubService
 *  nc.pubitf.credit.creditcheck.IAuditFlowFuncFlag
 *  nc.vo.arap.receivable.ReceivableBillVO
 *  nc.vo.arap.utils.ARAPModuleEnableUtil
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.compiler.PfParameterVO
 */
package nc.bs.pub.action;

import java.util.Hashtable;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.framework.common.NCLocator;
import nc.bs.pub.action.N_F0_ACTION;
import nc.itf.imag.lightbus.IImagPubService;
import nc.pubitf.credit.creditcheck.IAuditFlowFuncFlag;
import nc.vo.arap.receivable.ReceivableBillVO;
import nc.vo.arap.utils.ARAPModuleEnableUtil;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.compiler.PfParameterVO;

public class N_F0_COMMIT
extends N_F0_ACTION {
    protected Hashtable<String, Object> m_keyHas = null;

    public String getCodeRemark() {
        return " arap action script not allowed to modify ,all rights reserved!";
    }

    public Object runComClass(PfParameterVO pfparametervo) throws BusinessException {
        try {
            this.m_tmpVo = pfparametervo;
            this.setParameter("context", pfparametervo.m_preValueVos);
            AggregatedValueObject aggVO = pfparametervo.m_preValueVo;
            if (ARAPModuleEnableUtil.isCREDITEnable((String)InvocationInfoProxy.getInstance().getGroupId())) {
                ((IAuditFlowFuncFlag)NCLocator.getInstance().lookup(IAuditFlowFuncFlag.class)).setAuditFlowFuncFlag();
            }
            ReceivableBillVO parentVO = (ReceivableBillVO)aggVO.getParentVO();
            if (ARAPModuleEnableUtil.isImagEnabled((String)InvocationInfoProxy.getInstance().getGroupId())) {
                ((IImagPubService)NCLocator.getInstance().lookup(IImagPubService.class)).commitCheckWithImage(parentVO.getPk_tradetype(), parentVO.getPrimaryKey(), parentVO.getPk_org());
            }
            Object obj = this.runClass("nc.bs.arap.actions.BillCommitBatchBSAction", "updateVOs", "&context:nc.vo.pub.AggregatedValueObject[]", pfparametervo, this.m_keyHas);
            return obj;
        }
        catch (Exception exception) {
            throw ExceptionHandler.handleException(((Object)((Object)this)).getClass(), (Exception)exception);
        }
    }

    private void setParameter(String s, Object obj) {
        if (this.m_keyHas == null) {
            this.m_keyHas = new Hashtable();
        }
        if (obj != null) {
            this.m_keyHas.put(s, obj);
        }
    }
}

