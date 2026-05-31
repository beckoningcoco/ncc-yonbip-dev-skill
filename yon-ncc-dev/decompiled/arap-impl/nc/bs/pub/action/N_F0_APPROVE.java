/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.framework.common.NCLocator
 *  nc.itf.uap.pf.IWorkflowDefine
 *  nc.pubitf.credit.creditcheck.IAuditFlowFuncFlag
 *  nc.vo.arap.basebill.BaseBillVO
 *  nc.vo.arap.pub.ArapConstant
 *  nc.vo.arap.pub.BillEnumCollection$ApproveStatus
 *  nc.vo.arap.pub.BillEnumCollection$BillSatus
 *  nc.vo.arap.utils.ARAPModuleEnableUtil
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.compiler.PfParameterVO
 *  nccloud.pubitf.arap.arappub.IArapBillPubUtilService
 */
package nc.bs.pub.action;

import java.util.ArrayList;
import java.util.Hashtable;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.framework.common.NCLocator;
import nc.bs.pub.action.N_F0_ACTION;
import nc.itf.uap.pf.IWorkflowDefine;
import nc.pubitf.credit.creditcheck.IAuditFlowFuncFlag;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.pub.ArapConstant;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.arap.utils.ARAPModuleEnableUtil;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.compiler.PfParameterVO;
import nccloud.pubitf.arap.arappub.IArapBillPubUtilService;

public class N_F0_APPROVE
extends N_F0_ACTION {
    protected Hashtable<String, Object> m_keyHas = null;

    public Object runComClass(PfParameterVO paraVo) throws BusinessException {
        try {
            BaseBillVO headVO;
            if (paraVo.m_preValueVos == null) {
                return null;
            }
            Object obj = null;
            this.m_tmpVo = paraVo;
            this.procFlowBacth(paraVo);
            if (paraVo.isCloudEntry) {
                String actionCode = ArapConstant.APPROVE;
                ((IArapBillPubUtilService)NCLocator.getInstance().lookup(IArapBillPubUtilService.class)).filterAggObjByOperPower(paraVo.m_preValueVos, actionCode);
            }
            if (ARAPModuleEnableUtil.isCREDITEnable((String)InvocationInfoProxy.getInstance().getGroupId())) {
                ((IAuditFlowFuncFlag)NCLocator.getInstance().lookup(IAuditFlowFuncFlag.class)).setAuditFlowFuncFlag();
            }
            ArrayList<AggregatedValueObject> list = new ArrayList<AggregatedValueObject>();
            if (paraVo.m_workFlow == null) {
                for (AggregatedValueObject aggvo : paraVo.m_preValueVos) {
                    headVO = (BaseBillVO)aggvo.getParentVO();
                    headVO.setBillstatus(BillEnumCollection.BillSatus.AUDIT.VALUE);
                    list.add(aggvo);
                }
            } else {
                IWorkflowDefine lookup = (IWorkflowDefine)NCLocator.getInstance().lookup(IWorkflowDefine.class);
                AggregatedValueObject[] aggregatedValueObjectArray = paraVo.m_preValueVos;
                int n = aggregatedValueObjectArray.length;
                for (int aggvo = 0; aggvo < n; ++aggvo) {
                    AggregatedValueObject aggvo2 = aggregatedValueObjectArray[aggvo];
                    headVO = (BaseBillVO)aggvo2.getParentVO();
                    boolean isFinishedInstance = lookup.isFinishedInstance(null, headVO.getPrimaryKey(), headVO.getPk_tradetype());
                    if (!isFinishedInstance || headVO.getApprovestatus().intValue() != BillEnumCollection.ApproveStatus.PASSING.VALUE.intValue()) continue;
                    headVO.setBillstatus(BillEnumCollection.BillSatus.AUDIT.VALUE);
                    list.add(aggvo2);
                }
            }
            if (list.size() > 0) {
                this.setParameter("context", list.toArray(new AggregatedValueObject[0]));
                obj = this.runClass("nc.bs.arap.actions.ReceivableBillApproveBatchBSAction", "approveVOs", "&context:nc.vo.pub.AggregatedValueObject[]", paraVo, this.m_keyHas);
                this.doCreditCheck();
                if (obj instanceof AggregatedValueObject[]) {
                    AggregatedValueObject[] vos;
                    for (AggregatedValueObject vo : vos = (AggregatedValueObject[])obj) {
                        if (!vo.getParentVO().getAttributeValue("pk_billtype").equals(vo.getChildrenVO()[0].getAttributeValue("top_billtype"))) continue;
                        vo.getParentVO().setAttributeValue("driveaction", (Object)"N");
                    }
                    if (vos.length == 1) {
                        return vos[0];
                    }
                    return vos;
                }
                return obj;
            }
            for (AggregatedValueObject vo : paraVo.m_preValueVos) {
                vo.getParentVO().setAttributeValue("driveaction", (Object)"N");
            }
            paraVo.m_preValueVo.getParentVO().setAttributeValue("driveaction", (Object)"N");
            if (paraVo.m_preValueVos.length == 1) {
                return paraVo.m_preValueVo;
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

