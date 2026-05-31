/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.billact.BillBaseBSAction
 *  nc.bs.arap.billact.IValidatorFactory
 *  nc.bs.dao.BaseDAO
 *  nc.bs.framework.common.NCLocator
 *  nc.cmp.utils.CmpInterfaceProxy
 *  nc.itf.arap.bill.IArapBillQueryBaseService
 *  nc.itf.arap.outer.IPayBillCancelCommissionPay
 *  nc.vo.arap.basebill.BaseAggVO
 *  nc.vo.arap.basebill.BaseBillVO
 *  nc.vo.arap.basebill.BaseItemVO
 *  nc.vo.arap.pub.ArapBillTypeInfo
 *  nc.vo.arap.pub.BillEnumCollection$CommissionPayStatus
 *  nc.vo.arap.utils.ARAPModuleEnableUtil
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.SuperVO
 */
package nc.impl.arap.outer;

import java.util.ArrayList;
import nc.bs.arap.billact.BillBaseBSAction;
import nc.bs.arap.billact.IValidatorFactory;
import nc.bs.dao.BaseDAO;
import nc.bs.framework.common.NCLocator;
import nc.cmp.utils.CmpInterfaceProxy;
import nc.itf.arap.bill.IArapBillQueryBaseService;
import nc.itf.arap.outer.IPayBillCancelCommissionPay;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.arap.pub.ArapBillTypeInfo;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.arap.utils.ARAPModuleEnableUtil;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.SuperVO;

public class PayBillCancelCommissionPayImpl
extends BillBaseBSAction
implements IPayBillCancelCommissionPay {
    public BaseAggVO[] cancelCommissionPay(BaseAggVO[] billAggVOs) throws BusinessException {
        if (billAggVOs == null) {
            return billAggVOs;
        }
        this.dynamicLock((AggregatedValueObject[])billAggVOs);
        this.checkBillsTs((AggregatedValueObject[])billAggVOs);
        ArrayList<BaseBillVO> headList = new ArrayList<BaseBillVO>();
        ArrayList<BaseItemVO> bodyList = new ArrayList<BaseItemVO>();
        ArrayList<String> headPKList = new ArrayList<String>();
        int length = billAggVOs.length;
        for (int i = 0; i < length; ++i) {
            BaseItemVO[] bodys;
            BaseBillVO head = billAggVOs[i].getHeadVO();
            headList.add(head);
            headPKList.add(head.getPrimaryKey());
            for (BaseItemVO billDetailVO : bodys = billAggVOs[i].getItems()) {
                billDetailVO.setPayman(null);
                billDetailVO.setCommpaytype(null);
                billDetailVO.setCommpaystatus(BillEnumCollection.CommissionPayStatus.UNCOMMISSIONPAY.VALUE);
                billDetailVO.setMoney_de(billDetailVO.getAgentreceiveprimal());
                billDetailVO.setMoney_bal(billDetailVO.getAgentreceiveprimal());
                billDetailVO.setNotax_de(billDetailVO.getAgentreceiveprimal());
                billDetailVO.setLocal_money_de(billDetailVO.getAgentreceivelocal());
                billDetailVO.setLocal_money_bal(billDetailVO.getAgentreceivelocal());
                billDetailVO.setNotax_de(billDetailVO.getAgentreceiveprimal());
                billDetailVO.setGroupdebit(billDetailVO.getGroupagentreceivelocal());
                billDetailVO.setGroupbalance(billDetailVO.getGroupagentreceivelocal());
                billDetailVO.setGlobaldebit(billDetailVO.getGlobalagentreceivelocal());
                billDetailVO.setGlobalbalance(billDetailVO.getGlobalagentreceivelocal());
                billDetailVO.setGroupnotax_de(billDetailVO.getGroupagentreceivelocal());
                billDetailVO.setGlobalnotax_de(billDetailVO.getGlobalagentreceivelocal());
                billDetailVO.setLocal_notax_de(billDetailVO.getAgentreceivelocal());
                billDetailVO.setOccupationmny(billDetailVO.getAgentreceiveprimal());
                billDetailVO.setStatus(1);
                bodyList.add(billDetailVO);
            }
        }
        String[] itemFields = new String[]{"commpayer", "commpaystatus", "commpaytype", "refuse_reason", "money_de", "money_bal", "local_money_de", "local_money_bal", "groupdebit", "globaldebit", "globalbalance", "groupbalance", "occupationmny", "groupnotax_de", "globalnotax_de", "local_notax_de", "notax_de"};
        if (!ARAPModuleEnableUtil.isCMPEnable((String)((String)billAggVOs[0].getParentVO().getAttributeValue("pk_group")))) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0339"));
        }
        CmpInterfaceProxy.INSTANCE.getSettlementCancelCommisonPay().CancelCommisonPay(headPKList.toArray(new String[0]));
        BaseDAO basedao = new BaseDAO();
        basedao.updateVOArray(headList.toArray(new SuperVO[0]), new String[]{"billstatus"});
        basedao.updateVOArray(bodyList.toArray(new SuperVO[0]), itemFields);
        BaseAggVO[] rtnBillAggVOs = ((IArapBillQueryBaseService)NCLocator.getInstance().lookup(ArapBillTypeInfo.getInstance((Object)"F3").getBillQueryService())).findBillByPrimaryKey(headPKList.toArray(new String[0]));
        return rtnBillAggVOs;
    }

    protected IValidatorFactory getValidatorFactory() {
        return null;
    }
}

