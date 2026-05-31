/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.actions.BillEffectBatchBSAction
 *  nc.bs.arap.bill.ArapBillDAO
 *  nc.bs.dao.BaseDAO
 *  nc.bs.logging.Log
 *  nc.bs.pf.pub.PfDataCache
 *  nc.pub.cmp.apply.ApplyOpEnum
 *  nc.vo.arap.basebill.ArapVOFactory
 *  nc.vo.arap.basebill.BaseAggVO
 *  nc.vo.arap.basebill.BaseBillVO
 *  nc.vo.arap.basebill.BaseItemVO
 *  nc.vo.arap.pub.BillEnumCollection$InureSign
 *  nc.vo.arap.pub.BillEnumCollection$PayStatus
 *  nc.vo.arap.pub.BillEnumCollection$SettlementState
 *  nc.vo.arap.pub.BillEnumCollection$SettlementType
 *  nc.vo.cmp.CMPExecStatus
 *  nc.vo.cmp.NetPayExecInfo
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.BusinessRuntimeException
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.billtype.BilltypeVO
 */
package nc.bs.arap.actions;

import java.util.ArrayList;
import java.util.Map;
import nc.bs.arap.actions.BillEffectBatchBSAction;
import nc.bs.arap.bill.ArapBillDAO;
import nc.bs.dao.BaseDAO;
import nc.bs.logging.Log;
import nc.bs.pf.pub.PfDataCache;
import nc.pub.cmp.apply.ApplyOpEnum;
import nc.vo.arap.basebill.ArapVOFactory;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.cmp.CMPExecStatus;
import nc.vo.cmp.NetPayExecInfo;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.BusinessRuntimeException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.SuperVO;
import nc.vo.pub.billtype.BilltypeVO;
import nccloud.bs.arap.apply.update.Update36DxUtils;

public class NetPayBSAction {
    private NetPayExecInfo payInfo = null;
    private BaseDAO baseDao = null;

    protected AggregatedValueObject doBusiness(AggregatedValueObject bill) throws BusinessException {
        if (null == bill) {
            return null;
        }
        BaseBillVO parent = (BaseBillVO)bill.getParentVO();
        BaseItemVO[] children = (BaseItemVO[])bill.getChildrenVO();
        this.updateBillParentInfo(parent, new String[]{"settletype", "settleflag", "payman", "paydate"});
        this.updateBillChildrenInfo(children, new String[]{"payflag", "payman", "paydate", "transerial"});
        return bill;
    }

    private BaseBillVO getParentInstance() {
        BaseBillVO parent = ArapVOFactory.getParentVOInstance((String)this.payInfo.getBilltype());
        parent.setSettletype(Integer.valueOf(5));
        parent.setPrimaryKey(this.payInfo.getBillid());
        parent.setPaydate(this.payInfo.getOperateDate());
        parent.setPayman(this.payInfo.getOperator());
        parent.setSettlenum(this.payInfo.getSettleno());
        Map map = this.payInfo.getExecStatusMap();
        int settleState = BillEnumCollection.SettlementState.DEFAULT.VALUE;
        CMPExecStatus cestatus = (CMPExecStatus)map.get(parent.getPrimaryKey());
        if (CMPExecStatus.PayFail.equals((Object)cestatus)) {
            settleState = BillEnumCollection.SettlementState.TRANSFAIL.VALUE;
        } else if (CMPExecStatus.SomePayFinish.equals((Object)cestatus)) {
            settleState = BillEnumCollection.SettlementState.SOMEPAYFINISH.VALUE;
        } else if (CMPExecStatus.Paying.equals((Object)cestatus)) {
            settleState = BillEnumCollection.SettlementState.TRANSING.VALUE;
        } else if (CMPExecStatus.UNPayed.equals((Object)cestatus)) {
            settleState = BillEnumCollection.SettlementState.DEFAULT.VALUE;
        } else if (CMPExecStatus.PayFinish.equals((Object)cestatus)) {
            settleState = BillEnumCollection.SettlementState.TRANSSUCCED.VALUE;
        } else if (CMPExecStatus.Reciving.equals((Object)cestatus)) {
            settleState = BillEnumCollection.SettlementState.TRANSING.VALUE;
        } else if (CMPExecStatus.ReciveFinish.equals((Object)cestatus)) {
            settleState = BillEnumCollection.SettlementState.TRANSSUCCED.VALUE;
        } else {
            throw new BusinessRuntimeException(NCLangRes4VoTransl.getNCLangRes().getStrByID("20062006v61013_0", "020062006v61013-0003") + cestatus);
        }
        parent.setSettleflag(Integer.valueOf(settleState));
        parent.setSettletype(BillEnumCollection.SettlementType.NETBANK.VALUE);
        return parent;
    }

    private BaseItemVO[] getChildrenInstance() {
        ArrayList<BaseItemVO> children = new ArrayList<BaseItemVO>();
        Map map = this.payInfo.getExecStatusMap();
        Map transerialMap = this.payInfo.getTranserialMap();
        for (String key : map.keySet()) {
            Log.getInstance(this.getClass()).debug((Object)(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0297") + this.payInfo.getBilltype()), this.getClass(), "getChildrenInstance");
            BaseItemVO item = ArapVOFactory.getChildrenVOInstance((String)this.payInfo.getBilltype());
            item.setPrimaryKey(key);
            item.setPayflag(BillEnumCollection.PayStatus.valueof((Integer)Integer.valueOf((int)((CMPExecStatus)map.get((Object)key)).getStatus())).VALUE);
            item.setParentPK(this.payInfo.getBillid());
            item.setPaydate(this.payInfo.getOperateDate());
            item.setPayman(this.payInfo.getOperator());
            if (transerialMap != null && transerialMap.size() > 0 && transerialMap.containsKey(key)) {
                item.setAttributeValue("transerial", transerialMap.get(key));
            }
            children.add(item);
        }
        return children.toArray(new BaseItemVO[0]);
    }

    public void doNetPay(NetPayExecInfo payInfo) throws BusinessException {
        this.payInfo = payInfo;
        BaseBillVO parent = this.getParentInstance();
        BaseItemVO[] children = this.getChildrenInstance();
        BaseAggVO vo = ArapVOFactory.getAggVOInstance((String)payInfo.getBilltype());
        vo.setParentVO((CircularlyAccessibleValueObject)parent);
        vo.setChildrenVO((CircularlyAccessibleValueObject[])children);
        this.doBusiness((AggregatedValueObject)vo);
        BilltypeVO billTypevo = PfDataCache.getBillType((String)payInfo.getBilltype());
        BaseAggVO updatedVO = new ArapBillDAO().queryBillByPrimaryKey(parent.getPrimaryKey(), billTypevo.getParentbilltype());
        BaseBillVO parentEffect = (BaseBillVO)updatedVO.getParentVO();
        BaseAggVO oldvo = (BaseAggVO)updatedVO.clone();
        Integer settleflag = parentEffect.getSettleflag();
        Integer effectstatus = parentEffect.getEffectstatus();
        if ((BillEnumCollection.SettlementState.SOMEPAYFINISH.VALUE.equals(settleflag) || BillEnumCollection.SettlementState.TRANSSUCCED.VALUE.equals(settleflag)) && !BillEnumCollection.InureSign.OKINURE.VALUE.equals(effectstatus)) {
            parentEffect.setEffectstatus(BillEnumCollection.InureSign.OKINURE.VALUE);
            parentEffect.setEffectuser(this.payInfo.getOperator());
            parentEffect.setEffectdate(this.payInfo.getOperateDate());
            new BillEffectBatchBSAction().updateVO(new AggregatedValueObject[]{updatedVO});
        }
        if (BillEnumCollection.SettlementState.TRANSSUCCED.VALUE.equals(settleflag)) {
            new Update36DxUtils().do36D1(ApplyOpEnum.settle, new AggregatedValueObject[]{updatedVO}, new AggregatedValueObject[]{oldvo});
        }
        this.generateWriteBack(payInfo);
    }

    private void generateWriteBack(NetPayExecInfo payInfo) {
        ArrayList<String> writeBackItemPKs = new ArrayList<String>();
        Map map = payInfo.getExecStatusMap();
        for (String key : map.keySet()) {
            if (!BillEnumCollection.PayStatus.valueof((Integer)Integer.valueOf((int)((CMPExecStatus)map.get((Object)key)).getStatus())).VALUE.equals(BillEnumCollection.PayStatus.SOMEPAYFINISH.VALUE)) continue;
            writeBackItemPKs.add(key);
        }
    }

    private void updateBillParentInfo(BaseBillVO parent, String[] fieldNames) throws BusinessException {
        if (null == parent) {
            return;
        }
        this.getBaseDao().updateVO((SuperVO)parent, fieldNames);
    }

    private void updateBillChildrenInfo(BaseItemVO[] childrens, String[] fieldNames) throws BusinessException {
        if (childrens != null && childrens.length > 0) {
            this.getBaseDao().updateVOArray((SuperVO[])childrens, fieldNames);
        }
    }

    private BaseDAO getBaseDao() {
        if (null == this.baseDao) {
            this.baseDao = new BaseDAO();
        }
        return this.baseDao;
    }
}

