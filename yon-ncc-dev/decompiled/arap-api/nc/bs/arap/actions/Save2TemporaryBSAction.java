/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.dao.BaseDAO
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.framework.common.NCLocator
 *  nc.itf.uap.pf.IWorkflowMachine
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.SuperVO
 */
package nc.bs.arap.actions;

import nc.bs.arap.billact.DeleteBatchBSAction;
import nc.bs.arap.billact.IValidatorFactory;
import nc.bs.dao.BaseDAO;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.framework.common.NCLocator;
import nc.itf.uap.pf.IWorkflowMachine;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.SuperVO;

public class Save2TemporaryBSAction
extends DeleteBatchBSAction {
    @Override
    protected void doAfterDelete(AggregatedValueObject[] bill) throws BusinessException {
    }

    @Override
    protected void doBeforeDelete(AggregatedValueObject[] bill) throws BusinessException {
    }

    @Override
    protected void setBillStatus(AggregatedValueObject[] bill) throws BusinessException {
    }

    @Override
    protected void doDelete(AggregatedValueObject[] bill) throws BusinessException {
        SuperVO parent = (SuperVO)bill[0].getParentVO();
        new BaseDAO().updateVO(parent);
        ((IWorkflowMachine)NCLocator.getInstance().lookup(IWorkflowMachine.class)).deleteCheckFlow((String)parent.getAttributeValue("pk_tradetype"), parent.getPrimaryKey(), bill[0], InvocationInfoProxy.getInstance().getUserId());
    }

    @Override
    protected IValidatorFactory getValidatorFactory() {
        return null;
    }
}

