/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.validator.BillStatusUNValidator
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.pub.compiler.AbstractCompiler2
 *  nc.vo.arap.billstatus.ARAPBillStatus
 *  nc.vo.arap.pub.ArapConstant
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.compiler.PfParameterVO
 *  nccloud.pubitf.arap.arappub.IArapBillPubUtilService
 */
package nc.bs.pub.action;

import java.util.ArrayList;
import java.util.Hashtable;
import nc.bs.arap.validator.BillStatusUNValidator;
import nc.bs.framework.common.NCLocator;
import nc.bs.pub.compiler.AbstractCompiler2;
import nc.vo.arap.billstatus.ARAPBillStatus;
import nc.vo.arap.pub.ArapConstant;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.compiler.PfParameterVO;
import nccloud.pubitf.arap.arappub.IArapBillPubUtilService;

public class N_F0_UNAPPROVE
extends AbstractCompiler2 {
    private Hashtable<String, Object> m_methodReturnHas = new Hashtable();
    private Hashtable<String, Object> m_keyHas = null;

    public Object runComClass(PfParameterVO paraVo) throws BusinessException {
        try {
            if (paraVo.m_preValueVos == null) {
                return null;
            }
            new BillStatusUNValidator().validateUNApproveStatus(paraVo);
            String actionCode = ArapConstant.UNAPPROVE;
            ((IArapBillPubUtilService)NCLocator.getInstance().lookup(IArapBillPubUtilService.class)).interceptorVaildator(paraVo.m_preValueVos, actionCode);
            Object obj = null;
            this.m_tmpVo = paraVo;
            ArrayList<AggregatedValueObject> list = new ArrayList<AggregatedValueObject>();
            AggregatedValueObject[] aggregatedValueObjectArray = this.getVos();
            int n = aggregatedValueObjectArray.length;
            for (int i = 0; i < n; ++i) {
                AggregatedValueObject vo;
                paraVo.m_preValueVo = vo = aggregatedValueObjectArray[i];
                Integer bill_status = (Integer)vo.getParentVO().getAttributeValue("billstatus");
                boolean procUnApproveFlow = this.procUnApproveFlow(paraVo);
                if (!procUnApproveFlow || bill_status.intValue() == ARAPBillStatus.SAVE.VALUE.intValue()) continue;
                list.add(vo);
            }
            if (list.size() > 0) {
                this.setParameter("context", list.toArray(new AggregatedValueObject[0]));
                obj = this.runClass("nc.bs.arap.actions.ReceivableBillUnApproveBatchBSAction", "unapproveVOs", "&context:nc.vo.pub.AggregatedValueObject[]", paraVo, this.m_keyHas);
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

