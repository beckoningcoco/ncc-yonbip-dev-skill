/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.billact.BillBaseBSAction
 *  nc.bs.arap.billact.IValidatorFactory
 *  nc.bs.dao.BaseDAO
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.framework.common.NCLocator
 *  nc.itf.arap.bill.IArapBillQueryBaseService
 *  nc.itf.arap.outer.IGatherbillWritebackCommission
 *  nc.vo.arap.basebill.BaseAggVO
 *  nc.vo.arap.basebill.BaseBillVO
 *  nc.vo.arap.basebill.BaseItemVO
 *  nc.vo.arap.pub.ArapBillTypeInfo
 *  nc.vo.arap.pub.BillEnumCollection$CommissionPayStatus
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.SuperVO
 */
package nc.impl.arap.outer;

import java.util.ArrayList;
import nc.bs.arap.billact.BillBaseBSAction;
import nc.bs.arap.billact.IValidatorFactory;
import nc.bs.dao.BaseDAO;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.framework.common.NCLocator;
import nc.itf.arap.bill.IArapBillQueryBaseService;
import nc.itf.arap.outer.IGatherbillWritebackCommission;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.arap.pub.ArapBillTypeInfo;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.SuperVO;

public class GatherbillWritebackCommissionImpl
extends BillBaseBSAction
implements IGatherbillWritebackCommission {
    public BaseAggVO[] writebackCommission(BaseAggVO[] billAggVOs) throws BusinessException {
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
                billDetailVO.setPayman(InvocationInfoProxy.getInstance().getUserId());
                billDetailVO.setCommpaytype(null);
                billDetailVO.setCommpaystatus(BillEnumCollection.CommissionPayStatus.COMMISSIONPAYSUSSCESS.VALUE);
                billDetailVO.setLocal_money_de(billDetailVO.getLocal_money_cr());
                billDetailVO.setMoney_de(billDetailVO.getMoney_cr());
                billDetailVO.setStatus(1);
                bodyList.add(billDetailVO);
            }
        }
        BaseDAO basedao = new BaseDAO();
        basedao.updateVOArray(headList.toArray(new SuperVO[0]), new String[]{"billstatus"});
        basedao.updateVOArray(bodyList.toArray(new SuperVO[0]), new String[]{"commpayer", "commpaytype", "commpaystatus", "local_money_cr", "money_cr"});
        BaseAggVO[] rtnBillAggVOs = ((IArapBillQueryBaseService)NCLocator.getInstance().lookup(ArapBillTypeInfo.getInstance((Object)"F2").getBillQueryService())).findBillByPrimaryKey(headPKList.toArray(new String[0]));
        return rtnBillAggVOs;
    }

    protected IValidatorFactory getValidatorFactory() {
        return null;
    }
}

