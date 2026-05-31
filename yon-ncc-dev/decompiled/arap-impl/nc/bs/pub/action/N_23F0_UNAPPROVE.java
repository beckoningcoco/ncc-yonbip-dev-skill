/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.pub.compiler.AbstractCompiler2
 *  nc.vo.arap.BusiStatus
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.compiler.PfParameterVO
 */
package nc.bs.pub.action;

import java.util.ArrayList;
import java.util.Hashtable;
import nc.bs.pub.compiler.AbstractCompiler2;
import nc.vo.arap.BusiStatus;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.compiler.PfParameterVO;

public class N_23F0_UNAPPROVE
extends AbstractCompiler2 {
    private Hashtable<String, Object> m_methodReturnHas = new Hashtable();
    private Hashtable<String, Object> m_keyHas = null;

    public Object runComClass(PfParameterVO paraVo) throws BusinessException {
        try {
            if (paraVo.m_preValueVos == null) {
                return null;
            }
            Object obj = null;
            this.m_tmpVo = paraVo;
            ArrayList<AggregatedValueObject> list = new ArrayList<AggregatedValueObject>();
            AggregatedValueObject[] aggregatedValueObjectArray = this.getVos();
            int n = aggregatedValueObjectArray.length;
            for (int i = 0; i < n; ++i) {
                AggregatedValueObject vo;
                paraVo.m_preValueVo = vo = aggregatedValueObjectArray[i];
                this.procUnApproveFlow(paraVo);
                Integer bill_status = (Integer)vo.getParentVO().getAttributeValue("billstatus");
                Integer effectstatus = (Integer)vo.getParentVO().getAttributeValue("effectstatus");
                if (bill_status.intValue() != BusiStatus.SAVE.getBillStatusKind() || effectstatus == 0) continue;
                list.add(vo);
            }
            if (list.size() > 0) {
                this.setParameter("context", list.toArray(new AggregatedValueObject[0]));
                obj = this.runClass("nc.bs.arap.actions.SupReciveableUnApproveBatchBSAction", "unapproveVOs", "&context:nc.vo.pub.AggregatedValueObject[]", paraVo, this.m_keyHas);
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

