/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.logging.Logger
 *  nc.vo.arap.pub.ArapConstant
 *  nc.vo.arap.pub.BillEnumCollection$ApproveStatus
 *  nc.vo.arap.receivable.AggReceivableBillVO
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.compiler.PfParameterVO
 *  nccloud.bs.arap.util.commit.ArapCommitUtil
 *  nccloud.pubitf.arap.arappub.IArapBillPubUtilService
 *  org.apache.commons.lang3.ArrayUtils
 */
package nc.bs.pub.action;

import java.util.Hashtable;
import nc.bs.arap.receiveablebp.RecBillBO;
import nc.bs.framework.common.NCLocator;
import nc.bs.logging.Logger;
import nc.bs.pub.action.N_F0_ACTION;
import nc.vo.arap.pub.ArapConstant;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.arap.receivable.AggReceivableBillVO;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.compiler.PfParameterVO;
import nccloud.bs.arap.util.commit.ArapCommitUtil;
import nccloud.pubitf.arap.arappub.IArapBillPubUtilService;
import org.apache.commons.lang3.ArrayUtils;

public class N_F0_SAVE
extends N_F0_ACTION {
    private Hashtable<String, Object> m_keyHas = null;

    public String getCodeRemark() {
        return " arap action script not allowed to modify ,all rights reserved!";
    }

    public Object runComClass(PfParameterVO pfparametervo) throws BusinessException {
        try {
            this.m_tmpVo = pfparametervo;
            Object obj = null;
            this.setParameter("context", pfparametervo.m_preValueVos);
            if (pfparametervo.isCloudEntry) {
                String actionCode = ArapConstant.SAVE;
                ((IArapBillPubUtilService)NCLocator.getInstance().lookup(IArapBillPubUtilService.class)).interceptorVaildator(pfparametervo.m_preValueVos, actionCode);
            }
            this.delPushBill(pfparametervo);
            String primaryKey = pfparametervo.m_preValueVos[0].getParentVO().getPrimaryKey();
            if (this.hasBill(primaryKey)) {
                obj = this.runClass("nc.bs.arap.actions.ReceivableBillEditBatchBSAction", "updateVOs", "&context:nc.vo.pub.AggregatedValueObject[]", pfparametervo, this.m_keyHas);
            } else {
                pfparametervo = this.approveStatusChange(pfparametervo);
                obj = this.runClass("nc.bs.arap.actions.ReceivableBillSaveBatchBSAction", "insertVOs", "&context:nc.vo.pub.AggregatedValueObject[]", pfparametervo, this.m_keyHas);
            }
            this.doCreditCheck();
            obj = new ArapCommitUtil().autoCommit(obj);
            return obj;
        }
        catch (Exception exception) {
            throw ExceptionHandler.handleException(((Object)((Object)this)).getClass(), (Exception)exception);
        }
    }

    private boolean hasBill(String primaryKey) throws BusinessException {
        boolean hasBill = false;
        if (primaryKey != null) {
            AggReceivableBillVO[] bvos = null;
            try {
                RecBillBO payableBO = new RecBillBO();
                bvos = payableBO.findBillByPrimaryKey(new String[]{primaryKey});
            }
            catch (Exception e) {
                Logger.error((Object)e.getMessage(), (Throwable)e);
            }
            if (bvos != null && bvos.length != 0 && bvos[0] != null) {
                hasBill = true;
            }
        }
        return hasBill;
    }

    private void setParameter(String s, Object obj) {
        if (this.m_keyHas == null) {
            this.m_keyHas = new Hashtable();
        }
        if (obj != null) {
            this.m_keyHas.put(s, obj);
        }
    }

    private PfParameterVO approveStatusChange(PfParameterVO paraVo) {
        for (AggregatedValueObject vo : paraVo.m_preValueVos) {
            vo.getParentVO().setAttributeValue("approvestatus", (Object)BillEnumCollection.ApproveStatus.NOSTATE.VALUE);
        }
        return paraVo;
    }

    private void delPushBill(PfParameterVO pfparametervo) {
        Object[] childrenVO;
        AggregatedValueObject aggvo;
        if (pfparametervo == null) {
            return;
        }
        AggregatedValueObject aggregatedValueObject = aggvo = pfparametervo.m_preValueVo == null ? pfparametervo.m_preValueVos[0] : pfparametervo.m_preValueVo;
        if (aggvo == null) {
            return;
        }
        Object vailPush = aggvo.getParentVO().getAttributeValue("isPullBill");
        if ((vailPush == null || !"isPullBill".equals(vailPush)) && ArrayUtils.isNotEmpty((Object[])(childrenVO = aggvo.getChildrenVO()))) {
            for (Object vo : childrenVO) {
                vo.setAttributeValue("top_changeitemts", null);
            }
        }
    }
}

