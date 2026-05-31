/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.bill.ArapBillDAO
 *  nc.bs.arap.billact.BusiUpdateBSAction
 *  nc.bs.arap.billact.IValidatorFactory
 *  nc.bs.arap.validator.ValidatorFactory
 *  nc.bs.dao.BaseDAO
 *  nc.vo.arap.basebill.BaseAggVO
 *  nc.vo.arap.basebill.BaseBillVO
 *  nc.vo.arap.basebill.BaseItemVO
 *  nc.vo.arap.pub.BillEnumCollection$PayStatus
 *  nc.vo.arap.pub.BillEnumCollection$SettlementState
 *  nc.vo.arap.pub.BillEnumCollection$SettlementType
 *  nc.vo.cmp.BusiInfo
 *  nc.vo.cmp.CMPExecStatus
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.lang.UFDate
 */
package nc.bs.arap.actions;

import nc.bs.arap.bill.ArapBillDAO;
import nc.bs.arap.billact.BusiUpdateBSAction;
import nc.bs.arap.billact.IValidatorFactory;
import nc.bs.arap.validator.ValidatorFactory;
import nc.bs.dao.BaseDAO;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.cmp.BusiInfo;
import nc.vo.cmp.CMPExecStatus;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFDate;

public class CommPayAndGatherBSAction
extends BusiUpdateBSAction {
    private ArapBillDAO dao;
    private BaseDAO baseDao;
    private BusiInfo busiInfo;
    private CMPExecStatus statues;

    public CommPayAndGatherBSAction() {
        this.validatorCode.add(30);
        this.validatorCode.add(34);
        this.dao = null;
        this.baseDao = null;
        this.busiInfo = null;
        this.statues = null;
    }

    protected void doAfterUpdate(AggregatedValueObject bill) throws BusinessException {
    }

    protected void doBeforeUpdate(AggregatedValueObject bill) throws BusinessException {
        BaseBillVO parent = (BaseBillVO)bill.getParentVO();
        if ("fk".equals(parent.getBillclass())) {
            if (CMPExecStatus.ReciveFail.equals((Object)this.statues) || CMPExecStatus.ReciveFinish.equals((Object)this.statues) || CMPExecStatus.Reciving.equals((Object)this.statues)) {
                throw ExceptionHandler.createException((String)(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0293") + this.statues));
            }
        } else if ("sk".equals(parent.getBillclass()) && (CMPExecStatus.Paying.equals((Object)this.statues) || CMPExecStatus.PayFinish.equals((Object)this.statues) || CMPExecStatus.PayFail.equals((Object)this.statues))) {
            throw ExceptionHandler.createException((String)(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0294") + this.statues));
        }
    }

    protected void checkBillsTs(AggregatedValueObject ... bills) throws BusinessException {
    }

    public AggregatedValueObject updateVO(AggregatedValueObject pbill) throws BusinessException {
        AggregatedValueObject updateVO = super.updateVO(pbill);
        return updateVO;
    }

    protected AggregatedValueObject doBusiness(AggregatedValueObject bill) throws BusinessException {
        BaseBillVO parent = (BaseBillVO)bill.getParentVO();
        BaseItemVO[] children = (BaseItemVO[])bill.getChildrenVO();
        if (CMPExecStatus.Paying.equals((Object)this.statues)) {
            this.paying(parent, children);
        } else if (CMPExecStatus.PayFinish.equals((Object)this.statues)) {
            this.payFinish(parent, children);
        } else if (CMPExecStatus.PayFail.equals((Object)this.statues)) {
            this.payFail(parent, children);
        } else if (CMPExecStatus.UNPayed.equals((Object)this.statues)) {
            this.unPayed(parent, children);
        } else if (CMPExecStatus.ReciveFail.equals((Object)this.statues)) {
            this.reciveFail(parent, children);
        } else if (CMPExecStatus.UnRecive.equals((Object)this.statues)) {
            this.unRecive(parent, children);
        } else if (CMPExecStatus.ReciveFinish.equals((Object)this.statues)) {
            this.reciveFinish(parent, children);
        } else if (CMPExecStatus.Reciving.equals((Object)this.statues)) {
            this.reciving(parent, children);
        }
        bill.setParentVO((CircularlyAccessibleValueObject)parent);
        bill.setChildrenVO((CircularlyAccessibleValueObject[])children);
        return bill;
    }

    protected IValidatorFactory getValidatorFactory() {
        ValidatorFactory factory = new ValidatorFactory();
        return factory;
    }

    public void initBillInfo(BusiInfo busiInfo, CMPExecStatus statues) throws BusinessException {
        BaseAggVO vo = (BaseAggVO)busiInfo.getRawBill();
        if (null == vo) {
            vo = this.getBillDao().queryBillByPrimaryKey(busiInfo.getPk_bill(), busiInfo.getBill_type());
        }
        this.statues = statues;
        this.busiInfo = busiInfo;
    }

    private void reciveFail(BaseBillVO parent, BaseItemVO[] children) throws BusinessException {
        parent.setSettleflag(BillEnumCollection.SettlementState.TRANSFAIL.VALUE);
        parent.setPaydate(this.busiInfo.getOperatorDate());
        parent.setPayman(this.busiInfo.getOperator());
        this.updateBillParentInfo(parent, new String[]{"settleflag", "paydate", "payman"}, null);
        for (BaseItemVO item : children) {
            item.setPaydate(this.busiInfo.getOperatorDate());
            item.setPayman(this.busiInfo.getOperator());
            item.setPayflag(BillEnumCollection.PayStatus.RECIVEFAIL.VALUE);
        }
        this.updateBillChildrenInfo(children, new String[]{"payman", "paydate", "payflag"});
    }

    public void unRecive(BaseBillVO parent, BaseItemVO[] children) throws BusinessException {
        parent.setSettleflag(BillEnumCollection.SettlementState.DEFAULT.VALUE);
        parent.setPaydate(null);
        parent.setPayman(null);
        this.updateBillParentInfo(parent, new String[]{"settleflag", "paydate", "payman"}, null);
        for (BaseItemVO item : children) {
            item.setPaydate(null);
            item.setPayman(null);
            item.setPayflag(BillEnumCollection.PayStatus.UNRECIVE.VALUE);
        }
        this.updateBillChildrenInfo(children, new String[]{"payman", "paydate", "payflag"});
    }

    private void reciveFinish(BaseBillVO parent, BaseItemVO[] children) throws BusinessException {
        parent.setSettleflag(BillEnumCollection.SettlementState.TRANSSUCCED.VALUE);
        parent.setSettletype(BillEnumCollection.SettlementType.SETTLECENTER.VALUE);
        parent.setPaydate(this.busiInfo.getOperatorDate());
        parent.setPayman(this.busiInfo.getOperator());
        this.updateBillParentInfo(parent, new String[]{"settleflag", "settletype", "paydate", "payman"}, null);
        for (BaseItemVO item : children) {
            item.setPaydate(this.busiInfo.getOperatorDate());
            item.setPayman(this.busiInfo.getOperator());
            item.setPayflag(BillEnumCollection.PayStatus.RECIVEFINISH.VALUE);
        }
        this.updateBillChildrenInfo(children, new String[]{"paydate", "payman", "payflag"});
    }

    public void reciveFinish(BaseBillVO parent, BaseItemVO[] children, UFDate operateDate, String operator) throws BusinessException {
        parent.setSettleflag(BillEnumCollection.SettlementState.TRANSSUCCED.VALUE);
        parent.setSettletype(BillEnumCollection.SettlementType.SETTLECENTER.VALUE);
        parent.setPaydate(operateDate);
        parent.setPayman(operator);
        this.updateBillParentInfo(parent, new String[]{"settleflag", "settletype", "paydate", "payman"}, null);
        for (BaseItemVO item : children) {
            item.setPaydate(operateDate);
            item.setPayman(operator);
            item.setPayflag(BillEnumCollection.PayStatus.RECIVEFINISH.VALUE);
        }
        this.updateBillChildrenInfo(children, new String[]{"paydate", "payman", "payflag"});
    }

    private void reciving(BaseBillVO parent, BaseItemVO[] children) throws BusinessException {
        parent.setSettleflag(BillEnumCollection.SettlementState.TRANSING.VALUE);
        parent.setSettletype(BillEnumCollection.SettlementType.SETTLECENTER.VALUE);
        this.updateBillParentInfo(parent, new String[]{"settleflag", "settletype"}, null);
        for (BaseItemVO item : children) {
            item.setStatus(1);
            item.setPayflag(BillEnumCollection.PayStatus.RECIVING.VALUE);
            this.updateBillChildrenInfo(children, new String[]{"payflag"});
        }
    }

    private void paying(BaseBillVO parent, BaseItemVO[] children) throws BusinessException {
        parent.setSettletype(BillEnumCollection.SettlementType.SETTLECENTER.VALUE);
        parent.setSettleflag(BillEnumCollection.SettlementState.TRANSING.VALUE);
        this.updateBillParentInfo(parent, new String[]{"settleflag", "settletype"}, null);
        for (BaseItemVO item : children) {
            item.setPayflag(BillEnumCollection.PayStatus.PAYING.VALUE);
        }
        this.updateBillChildrenInfo(children, new String[]{"payflag"});
    }

    private void payFinish(BaseBillVO parent, BaseItemVO[] children) throws BusinessException {
        parent.setSettleflag(BillEnumCollection.SettlementState.TRANSSUCCED.VALUE);
        parent.setPaydate(this.busiInfo.getOperatorDate());
        parent.setPayman(this.busiInfo.getOperator());
        this.updateBillParentInfo(parent, new String[]{"settleflag", "paydate", "payman"}, null);
        for (BaseItemVO item : children) {
            item.setPaydate(this.busiInfo.getOperatorDate());
            item.setPayman(this.busiInfo.getOperator());
            item.setPayflag(BillEnumCollection.PayStatus.PAYFINISH.VALUE);
        }
        this.updateBillChildrenInfo(children, new String[]{"paydate", "payman", "payflag"});
    }

    public void payFinish(BaseBillVO parent, BaseItemVO[] children, UFDate operateDate, String operator) throws BusinessException {
        parent.setSettleflag(BillEnumCollection.SettlementState.TRANSSUCCED.VALUE);
        parent.setPaydate(operateDate);
        parent.setPayman(operator);
        this.updateBillParentInfo(parent, new String[]{"settleflag", "paydate", "payman"}, null);
        for (BaseItemVO item : children) {
            item.setPaydate(operateDate);
            item.setPayman(operator);
            item.setPayflag(BillEnumCollection.PayStatus.PAYFINISH.VALUE);
        }
        this.updateBillChildrenInfo(children, new String[]{"paydate", "payman", "payflag"});
    }

    private void payFail(BaseBillVO parent, BaseItemVO[] children) throws BusinessException {
        parent.setSettleflag(BillEnumCollection.SettlementState.TRANSFAIL.VALUE);
        parent.setPaydate(null);
        parent.setPayman(null);
        this.updateBillParentInfo(parent, new String[]{"settleflag", "paydate", "payman"}, null);
        for (BaseItemVO item : children) {
            item.setPaydate(null);
            item.setPayman(null);
            item.setPayflag(BillEnumCollection.PayStatus.PAYFAIL.VALUE);
        }
        this.updateBillChildrenInfo(children, new String[]{"paydate", "payman", "payflag"});
    }

    public void unPayed(BaseBillVO parent, BaseItemVO[] children) throws BusinessException {
        parent.setSettleflag(BillEnumCollection.SettlementState.DEFAULT.VALUE);
        parent.setPaydate(null);
        parent.setPayman(null);
        this.updateBillParentInfo(parent, new String[]{"settleflag", "paydate", "payman"}, null);
        for (BaseItemVO item : children) {
            item.setPaydate(null);
            item.setPayman(null);
            item.setPayflag(BillEnumCollection.PayStatus.UNPAYED.VALUE);
        }
        this.updateBillChildrenInfo(children, new String[]{"paydate", "payman", "payflag"});
    }

    private void updateBillParentInfo(BaseBillVO parent, String[] fieldNames, String whereClause) throws BusinessException {
        if (null == parent) {
            return;
        }
        this.getBaseDao().updateVOArray((SuperVO[])new BaseBillVO[]{parent}, fieldNames, whereClause, null);
    }

    private void updateBillChildrenInfo(BaseItemVO[] childrens, String[] fieldNames) throws BusinessException {
        if (null == childrens || childrens.length < 1) {
            return;
        }
        this.getBaseDao().updateVOArray((SuperVO[])childrens, fieldNames, null, null);
    }

    private ArapBillDAO getBillDao() {
        if (null == this.dao) {
            this.dao = new ArapBillDAO();
        }
        return this.dao;
    }

    private BaseDAO getBaseDao() {
        if (null == this.baseDao) {
            this.baseDao = new BaseDAO();
        }
        return this.baseDao;
    }
}

