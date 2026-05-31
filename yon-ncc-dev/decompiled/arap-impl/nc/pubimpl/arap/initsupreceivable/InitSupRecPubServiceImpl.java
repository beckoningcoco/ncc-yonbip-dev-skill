/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.bill.ArapBillBO
 *  nc.bs.arap.util.SqlUtils
 *  nc.bs.dao.BaseDAO
 *  nc.md.persist.framework.MDPersistenceService
 *  nc.pubitf.arap.initsupreceivable.IArapInitSupRecPubService
 *  nc.vo.arap.basebill.BaseAggVO
 *  nc.vo.arap.basebill.BaseBillVO
 *  nc.vo.arap.basebill.BaseItemVO
 *  nc.vo.arap.estireceivable.AggEstiReceivableBillVO
 *  nc.vo.arap.estireceivable.EstiReceivableBillItemVO
 *  nc.vo.arap.estireceivable.EstiReceivableBillVO
 *  nc.vo.arap.supreceivable.AggSupReceivableBillVO
 *  nc.vo.arap.utils.ArrayUtil
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 */
package nc.pubimpl.arap.initsupreceivable;

import java.util.Collection;
import nc.bs.arap.actions.InitSupReceivableEditBatchBSAction;
import nc.bs.arap.actions.InitSupRecivableDeleteBatchBSAction;
import nc.bs.arap.bill.ArapBillBO;
import nc.bs.arap.util.SqlUtils;
import nc.bs.dao.BaseDAO;
import nc.md.persist.framework.MDPersistenceService;
import nc.pubitf.arap.initsupreceivable.IArapInitSupRecPubService;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.arap.estireceivable.AggEstiReceivableBillVO;
import nc.vo.arap.estireceivable.EstiReceivableBillItemVO;
import nc.vo.arap.estireceivable.EstiReceivableBillVO;
import nc.vo.arap.supreceivable.AggSupReceivableBillVO;
import nc.vo.arap.utils.ArrayUtil;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;

public class InitSupRecPubServiceImpl
implements IArapInitSupRecPubService {
    private ArapBillBO billBO = null;
    private InitSupReceivableEditBatchBSAction updateAction = null;
    private InitSupRecivableDeleteBatchBSAction deleteAction = null;

    private InitSupReceivableEditBatchBSAction getUpdateBSAction() {
        if (null == this.updateAction) {
            this.updateAction = new InitSupReceivableEditBatchBSAction();
        }
        return this.updateAction;
    }

    private InitSupRecivableDeleteBatchBSAction getDeleteBSAction() {
        if (null == this.deleteAction) {
            this.deleteAction = new InitSupRecivableDeleteBatchBSAction();
        }
        return this.deleteAction;
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
        return bills;
    }

    public AggSupReceivableBillVO update(AggSupReceivableBillVO bill) throws BusinessException {
        return (AggSupReceivableBillVO)ArrayUtil.getFirstInArrays((Object[])this.update(new AggSupReceivableBillVO[]{bill}));
    }

    public AggSupReceivableBillVO[] update(AggSupReceivableBillVO[] bills) throws BusinessException {
        return (AggSupReceivableBillVO[])ArrayUtil.convertSupers2Subs((Object[])this.getUpdateBSAction().updateVOs((AggregatedValueObject[])bills), AggSupReceivableBillVO.class);
    }

    public void delete(AggregatedValueObject[] bills) throws BusinessException {
        this.getDeleteBSAction().deleteVOs(bills);
    }

    private ArapBillBO getBillBO() {
        if (null == this.billBO) {
            this.billBO = new ArapBillBO();
        }
        return this.billBO;
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
}

