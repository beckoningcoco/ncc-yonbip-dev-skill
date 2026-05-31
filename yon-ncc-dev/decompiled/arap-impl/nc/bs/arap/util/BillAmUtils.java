/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.logging.Logger
 *  nc.itf.fa.service.IFacardToFI
 *  nc.vo.arap.basebill.BaseAggVO
 *  nc.vo.arap.basebill.BaseItemVO
 *  nc.vo.arap.pub.BillEnumCollection$Direction
 *  nc.vo.arap.utils.ARAPModuleEnableUtil
 *  nc.vo.fa.assetcard.ExpenseVO
 *  nc.vo.fa.assetcard.RentVO
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nccloud.commons.lang.ArrayUtils
 *  nccloud.commons.lang.StringUtils
 */
package nc.bs.arap.util;

import java.util.ArrayList;
import nc.bs.framework.common.NCLocator;
import nc.bs.logging.Logger;
import nc.itf.fa.service.IFacardToFI;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.arap.utils.ARAPModuleEnableUtil;
import nc.vo.fa.assetcard.ExpenseVO;
import nc.vo.fa.assetcard.RentVO;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nccloud.commons.lang.ArrayUtils;
import nccloud.commons.lang.StringUtils;

public class BillAmUtils {
    boolean isAMEnable = false;

    public BillAmUtils(String pk_group) {
        if (StringUtils.isNotEmpty((CharSequence)pk_group)) {
            this.isAMEnable = ARAPModuleEnableUtil.isFAEnable((String)pk_group);
        }
    }

    private RentVO[] convertBillVOToRentVO(AggregatedValueObject[] billVOS) {
        ArrayList<RentVO> vos = new ArrayList<RentVO>();
        Logger.debug((Object)"\u6ca1\u6709\u4ece\u79df\u91d1\u4e2d\u627e\u5230\u76f8\u5e94\u7684\u6570\u636e");
        for (AggregatedValueObject bill : billVOS) {
            for (BaseItemVO item : ((BaseAggVO)bill).getItems()) {
                if (!StringUtils.isNotEmpty((CharSequence)item.getFacard())) continue;
                RentVO rentvo = new RentVO();
                rentvo.setPk_card(item.getFacard());
                Logger.debug((Object)("\u8d44\u4ea7\u5361\u7247\u53f7\uff1a" + item.getFacard()));
                rentvo.setPk_bill(item.getParentPK());
                Logger.debug((Object)("\u6536\u6b3e\u5355\u8868\u5934\u4e3b\u952e\uff1a" + item.getPrimaryKey()));
                rentvo.setPk_bill_b(item.getPrimaryKey());
                Logger.debug((Object)("\u6536\u6b3e\u5355\u8868\u4f53\u4e3b\u952e\uff1a" + item.getPrimaryKey()));
                rentvo.setFact_date(item.getBilldate());
                Logger.debug((Object)("\u5b9e\u9645\u65e5\u671f\uff1a" + item.getBilldate()));
                if (BillEnumCollection.Direction.DEBIT.VALUE.equals(item.getDirection())) {
                    rentvo.setFact_rent(item.getLocal_money_de());
                } else {
                    rentvo.setFact_rent(item.getLocal_money_cr());
                }
                rentvo.setStatus(2);
                Logger.debug((Object)("\u5b9e\u9645\u79df\u91d1--\u672c\u5e01\uff1a" + item.getLocal_money_cr()));
                vos.add(rentvo);
            }
        }
        return vos.toArray(new RentVO[0]);
    }

    private ExpenseVO[] convertBillVOToExpenseVO(AggregatedValueObject[] billVOS) {
        ArrayList<ExpenseVO> vos = new ArrayList<ExpenseVO>();
        Logger.debug((Object)"\u6ca1\u6709\u4ece\u79df\u91d1\u4e2d\u627e\u5230\u76f8\u5e94\u7684\u6570\u636e");
        for (AggregatedValueObject bill : billVOS) {
            for (BaseItemVO item : ((BaseAggVO)bill).getItems()) {
                if (!StringUtils.isNotEmpty((CharSequence)item.getFacard())) continue;
                ExpenseVO expensevo = new ExpenseVO();
                expensevo.setAttributeValue("pk_card", (Object)item.getFacard());
                expensevo.setAttributeValue("pk_bill", (Object)item.getParentPK());
                expensevo.setAttributeValue("pk_bill_b", (Object)item.getPrimaryKey());
                expensevo.setAttributeValue("occur_date", (Object)item.getBilldate());
                expensevo.setAttributeValue("pk_costsubj", (Object)item.getPk_subjcode());
                if (BillEnumCollection.Direction.DEBIT.VALUE.equals(item.getDirection())) {
                    expensevo.setAttributeValue("money", (Object)item.getLocal_money_de());
                } else {
                    expensevo.setAttributeValue("money", (Object)item.getLocal_money_cr());
                }
                expensevo.setAttributeValue("remark", (Object)item.getScomment());
                expensevo.setStatus(2);
                expensevo.setRemark(item.getScomment());
                vos.add(expensevo);
            }
        }
        return vos.toArray(new ExpenseVO[0]);
    }

    public void saveRent(AggregatedValueObject[] billVOS) throws BusinessException {
        if (this.isAMEnable) {
            Object[] renvos = this.convertBillVOToRentVO(billVOS);
            if (ArrayUtils.isEmpty((Object[])renvos)) {
                return;
            }
            ((IFacardToFI)NCLocator.getInstance().lookup(IFacardToFI.class)).saveRent((RentVO[])renvos);
        }
    }

    public void saveExpense(AggregatedValueObject[] billVOS) throws BusinessException {
        if (this.isAMEnable) {
            Object[] renvos = this.convertBillVOToExpenseVO(billVOS);
            if (ArrayUtils.isEmpty((Object[])renvos)) {
                return;
            }
            ((IFacardToFI)NCLocator.getInstance().lookup(IFacardToFI.class)).saveExpense((ExpenseVO[])renvos);
        }
    }

    public void deleteRent(AggregatedValueObject[] billVOS) throws BusinessException {
        if (this.isAMEnable) {
            Object[] array = this.getParentPks(billVOS);
            if (ArrayUtils.isEmpty((Object[])array)) {
                return;
            }
            ((IFacardToFI)NCLocator.getInstance().lookup(IFacardToFI.class)).deleteRent((String[])array);
        }
    }

    public void deleteExpense(AggregatedValueObject[] billVOS) throws BusinessException {
        if (this.isAMEnable) {
            Object[] array = this.getParentPks(billVOS);
            if (ArrayUtils.isEmpty((Object[])array)) {
                return;
            }
            ((IFacardToFI)NCLocator.getInstance().lookup(IFacardToFI.class)).deleteExpense((String[])array);
        }
    }

    private String[] getParentPks(AggregatedValueObject[] billVOS) throws BusinessException {
        ArrayList<String> pk_bills = new ArrayList<String>();
        for (AggregatedValueObject bill : billVOS) {
            for (BaseItemVO detailVO : ((BaseAggVO)bill).getItems()) {
                if (!StringUtils.isNotEmpty((CharSequence)detailVO.getFacard())) continue;
                pk_bills.add(bill.getParentVO().getPrimaryKey());
            }
        }
        return pk_bills.toArray(new String[0]);
    }
}

