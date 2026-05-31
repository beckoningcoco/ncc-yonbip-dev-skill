/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.itf.arap.bill.IArapBillBaseService
 *  nc.itf.arap.bill.IArapBillQueryBaseService
 *  nc.vo.arap.basebill.BaseAggVO
 *  nc.vo.arap.basebill.BaseBillVO
 *  nc.vo.arap.basebill.BaseItemVO
 *  nc.vo.arap.pub.ArapBillTypeInfo
 *  nc.vo.arap.pub.BillEnumCollection$Direction
 *  nc.vo.ml.NCLangRes4VoTransl
 */
package nc.vo.arap.pub;

import nc.itf.arap.bill.IArapBillBaseService;
import nc.itf.arap.bill.IArapBillQueryBaseService;
import nc.itf.arap.cuspayable.IArapCusPayableBillQueryService;
import nc.itf.arap.cuspayable.IArapCusPayableBillService;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.arap.cuspayable.AggCusPayableBillVO;
import nc.vo.arap.cuspayable.CusPayableBillItemVO;
import nc.vo.arap.cuspayable.CusPayableBillVO;
import nc.vo.arap.pub.ArapBillTypeInfo;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.ml.NCLangRes4VoTransl;

public class F123Billtype
extends ArapBillTypeInfo {
    public String getCode() {
        return "23F1";
    }

    public String getName() {
        return NCLangRes4VoTransl.getNCLangRes().getStrByID("2008pay_0", "02008pay-0022");
    }

    public String getTableNameBill() {
        return "ap_cuspayablebill";
    }

    public Class<? extends BaseAggVO> getAggvoClass() {
        return AggCusPayableBillVO.class;
    }

    public Class<? extends BaseBillVO> getBillvoClass() {
        return CusPayableBillVO.class;
    }

    public Class<? extends BaseItemVO> getItemvoClass() {
        return CusPayableBillItemVO.class;
    }

    public Class<? extends IArapBillQueryBaseService> getBillQueryService() {
        return IArapCusPayableBillQueryService.class;
    }

    public Class<? extends IArapBillBaseService> getBillService() {
        return IArapCusPayableBillService.class;
    }

    public String getNodeCode_Input() {
        return null;
    }

    public String getNodeCode_Manage() {
        return null;
    }

    public BillEnumCollection.Direction getDirection() {
        return BillEnumCollection.Direction.CREDIT;
    }
}

