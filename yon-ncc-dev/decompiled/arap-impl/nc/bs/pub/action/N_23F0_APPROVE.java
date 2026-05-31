/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.pub.compiler.AbstractCompiler2
 *  nc.itf.uap.pf.IWorkflowDefine
 *  nc.vo.arap.basebill.BaseBillVO
 *  nc.vo.arap.pub.BillEnumCollection$BillSatus
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.compiler.PfParameterVO
 */
package nc.bs.pub.action;

import java.util.ArrayList;
import java.util.Hashtable;
import nc.bs.framework.common.NCLocator;
import nc.bs.pub.compiler.AbstractCompiler2;
import nc.itf.uap.pf.IWorkflowDefine;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.compiler.PfParameterVO;

public class N_23F0_APPROVE
extends AbstractCompiler2 {
    private Hashtable<String, Object> m_keyHas = null;

    public Object runComClass(PfParameterVO paraVo) throws BusinessException {
        try {
            if (paraVo.m_preValueVos == null) {
                return null;
            }
            Object obj = null;
            this.m_tmpVo = paraVo;
            this.procFlowBacth(paraVo);
            ArrayList<AggregatedValueObject> list = new ArrayList<AggregatedValueObject>();
            if (paraVo.m_workFlow == null) {
                for (AggregatedValueObject aggvo : paraVo.m_preValueVos) {
                    BaseBillVO headVO = (BaseBillVO)aggvo.getParentVO();
                    headVO.setBillstatus(BillEnumCollection.BillSatus.AUDIT.VALUE);
                    list.add(aggvo);
                }
            } else {
                IWorkflowDefine lookup = (IWorkflowDefine)NCLocator.getInstance().lookup(IWorkflowDefine.class);
                for (AggregatedValueObject aggvo : paraVo.m_preValueVos) {
                    BaseBillVO headVO = (BaseBillVO)aggvo.getParentVO();
                    boolean isFinishedInstance = lookup.isFinishedInstance(null, headVO.getPrimaryKey(), headVO.getPk_tradetype());
                    if (!isFinishedInstance) continue;
                    headVO.setBillstatus(BillEnumCollection.BillSatus.AUDIT.VALUE);
                    list.add(aggvo);
                }
            }
            if (list.size() > 0) {
                this.setParameter("context", list.toArray(new AggregatedValueObject[0]));
                obj = this.runClass("nc.bs.arap.actions.SupReceivableApproveBatchBSAction", "approveVOs", "&context:nc.vo.pub.AggregatedValueObject[]", paraVo, this.m_keyHas);
                return obj;
            }
            return paraVo.m_preValueVos;
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

