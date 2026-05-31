/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.actions.InitDeleteBatchBSAction
 *  nc.bs.arap.put.BillTools
 *  nc.bs.arap.util.SqlUtils
 *  nc.bs.dao.BaseDAO
 *  nc.md.persist.framework.MDPersistenceService
 *  nc.pubitf.arap.initreceivable.IArapInitRecPubService
 *  nc.vo.arap.basebill.BaseAggVO
 *  nc.vo.arap.basebill.BaseBillVO
 *  nc.vo.arap.basebill.BaseItemVO
 *  nc.vo.arap.estireceivable.AggEstiReceivableBillVO
 *  nc.vo.arap.estireceivable.EstiReceivableBillItemVO
 *  nc.vo.arap.estireceivable.EstiReceivableBillVO
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 */
package nc.pubimpl.arap.initreceivable;

import java.util.Collection;
import nc.bs.arap.actions.InitDeleteBatchBSAction;
import nc.bs.arap.actions.InitReceivableDeleteBatchBSAction;
import nc.bs.arap.actions.InitReceivableEditBatchBSAction;
import nc.bs.arap.actions.InitReceivableSaveBatchBSAction;
import nc.bs.arap.put.BillTools;
import nc.bs.arap.util.SqlUtils;
import nc.bs.dao.BaseDAO;
import nc.md.persist.framework.MDPersistenceService;
import nc.pubitf.arap.initreceivable.IArapInitRecPubService;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.arap.estireceivable.AggEstiReceivableBillVO;
import nc.vo.arap.estireceivable.EstiReceivableBillItemVO;
import nc.vo.arap.estireceivable.EstiReceivableBillVO;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;

public class InitRecPubServiceImpl
implements IArapInitRecPubService {
    public void delete(AggregatedValueObject[] bills) throws BusinessException {
        this.getDeleteBSAction().deleteVOs(bills);
    }

    public AggregatedValueObject[] save(AggregatedValueObject[] bills) throws BusinessException {
        this.getSaveBSAction().insertVOs(bills);
        return bills;
    }

    public AggregatedValueObject update(AggregatedValueObject bill) throws BusinessException {
        this.getUpdateBSAction().updateVOs(new AggregatedValueObject[]{bill});
        return bill;
    }

    public void deleteByPks(String[] pks) throws BusinessException {
        Collection bills = MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByPKs(AggEstiReceivableBillVO.class, pks, false);
        this.delete((AggregatedValueObject[])bills.toArray(new BaseAggVO[0]));
    }

    public BaseItemVO[] getByDealnos(String[] dealnos) throws BusinessException {
        try {
            return new BaseDAO().retrieveByClause(EstiReceivableBillItemVO.class, SqlUtils.getInStr((String)"dealno", (String[])dealnos)).toArray(new BaseItemVO[0]);
        }
        catch (Exception e) {
            throw ExceptionHandler.handleException((Exception)e);
        }
    }

    public BaseBillVO getById(String ids) throws BusinessException {
        try {
            return (BaseBillVO)new BaseDAO().retrieveByPK(EstiReceivableBillVO.class, ids);
        }
        catch (Exception e) {
            throw ExceptionHandler.handleException((Exception)e);
        }
    }

    public BaseItemVO[] getEstBillByTopItemids(String[] itemids) throws BusinessException {
        try {
            return new BaseDAO().retrieveByClause(EstiReceivableBillItemVO.class, SqlUtils.getInStr((String)"top_itemid", (String[])itemids)).toArray(new BaseItemVO[0]);
        }
        catch (Exception e) {
            throw ExceptionHandler.handleException((Exception)e);
        }
    }

    public void reduceBalByItems(BaseItemVO[] itemvos) throws BusinessException {
        new BillTools().reduceBalByItems(itemvos, true);
    }

    private InitReceivableSaveBatchBSAction getSaveBSAction() {
        return new InitReceivableSaveBatchBSAction();
    }

    private InitReceivableEditBatchBSAction getUpdateBSAction() {
        return new InitReceivableEditBatchBSAction();
    }

    private InitDeleteBatchBSAction getDeleteBSAction() {
        return new InitReceivableDeleteBatchBSAction();
    }
}

