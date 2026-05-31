/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.arap.pub;

import nc.itf.arap.bill.IArapBillBaseService;
import nc.itf.arap.bill.IArapBillQueryBaseService;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.arap.pub.BillEnumCollection;

public interface IArapBilltypeInfo {
    public String getCode();

    public String getName();

    public boolean isTransType();

    public String getParentBilltype();

    public boolean isBillType();

    public String getDefaultTransType();

    public BillEnumCollection.Direction getDirection();

    public String getDefaultMoneyField();

    public String getDefaultLocalMoneyField();

    public String getNodeCode_Input();

    public String getNodeCode_Manage();

    public String getTableNameBill();

    public String getTableNameItem();

    public String getTablePrimaryKeyBill();

    public String getTablePrimaryKeyItem();

    public Class<? extends BaseAggVO> getAggvoClass();

    public Class<? extends BaseBillVO> getBillvoClass();

    public Class<? extends BaseItemVO> getItemvoClass();

    public Class<? extends IArapBillBaseService> getBillService();

    public Class<? extends IArapBillQueryBaseService> getBillQueryService();
}

