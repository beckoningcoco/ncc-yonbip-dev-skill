/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.pubitf.arap.supreceivable.IArapSupReceivableBillPubService
 *  nc.vo.arap.supreceivable.AggSupReceivableBillVO
 *  nc.vo.arap.utils.ArrayUtil
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 */
package nc.pubimpl.arap.supreceivable;

import nc.bs.arap.actions.SupReceivableApproveBatchBSAction;
import nc.bs.arap.actions.SupReceivableDeleteBatchBSAction;
import nc.bs.arap.actions.SupReceivableEditBatchBSAction;
import nc.bs.arap.actions.SupReceivableSaveBatchBSAction;
import nc.pubitf.arap.supreceivable.IArapSupReceivableBillPubService;
import nc.vo.arap.supreceivable.AggSupReceivableBillVO;
import nc.vo.arap.utils.ArrayUtil;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;

public class SupReceivableBillPubServiceImpl
implements IArapSupReceivableBillPubService {
    private SupReceivableSaveBatchBSAction saveAction = null;
    private SupReceivableEditBatchBSAction updateAction = null;
    private SupReceivableDeleteBatchBSAction deleteAction = null;
    private SupReceivableApproveBatchBSAction approveAction = null;

    private SupReceivableSaveBatchBSAction getSaveBSAction() {
        if (null == this.saveAction) {
            this.saveAction = new SupReceivableSaveBatchBSAction();
        }
        return this.saveAction;
    }

    private SupReceivableEditBatchBSAction getUpdateBSAction() {
        if (null == this.updateAction) {
            this.updateAction = new SupReceivableEditBatchBSAction();
        }
        return this.updateAction;
    }

    private SupReceivableDeleteBatchBSAction getDeleteBSAction() {
        if (null == this.deleteAction) {
            this.deleteAction = new SupReceivableDeleteBatchBSAction();
        }
        return this.deleteAction;
    }

    private SupReceivableApproveBatchBSAction getApproveBSAction() {
        if (null == this.approveAction) {
            this.approveAction = new SupReceivableApproveBatchBSAction();
        }
        return this.approveAction;
    }

    public void delete(AggSupReceivableBillVO bill) throws BusinessException {
        this.delete(new AggSupReceivableBillVO[]{bill});
    }

    public void delete(AggSupReceivableBillVO[] bills) throws BusinessException {
        this.getDeleteBSAction().deleteVOs((AggregatedValueObject[])bills);
    }

    public AggSupReceivableBillVO save(AggSupReceivableBillVO bill) throws BusinessException {
        return (AggSupReceivableBillVO)ArrayUtil.getFirstInArrays((Object[])this.save(new AggSupReceivableBillVO[]{bill}));
    }

    public AggSupReceivableBillVO[] save(AggSupReceivableBillVO[] bills) throws BusinessException {
        return (AggSupReceivableBillVO[])ArrayUtil.convertSupers2Subs((Object[])this.getSaveBSAction().insertVOs((AggregatedValueObject[])bills), AggSupReceivableBillVO.class);
    }

    public AggSupReceivableBillVO update(AggSupReceivableBillVO bill) throws BusinessException {
        return (AggSupReceivableBillVO)ArrayUtil.getFirstInArrays((Object[])this.update(new AggSupReceivableBillVO[]{bill}));
    }

    public AggSupReceivableBillVO[] update(AggSupReceivableBillVO[] bills) throws BusinessException {
        return (AggSupReceivableBillVO[])ArrayUtil.convertSupers2Subs((Object[])this.getUpdateBSAction().updateVOs((AggregatedValueObject[])bills), AggSupReceivableBillVO.class);
    }

    public AggSupReceivableBillVO[] approve(AggSupReceivableBillVO[] bills) throws BusinessException {
        return (AggSupReceivableBillVO[])ArrayUtil.convertSupers2Subs((Object[])this.getApproveBSAction().approveVOs((AggregatedValueObject[])bills), AggSupReceivableBillVO.class);
    }

    public AggSupReceivableBillVO approve(AggSupReceivableBillVO bill) throws BusinessException {
        return (AggSupReceivableBillVO)ArrayUtil.getFirstInArrays((Object[])this.approve(new AggSupReceivableBillVO[]{bill}));
    }
}

