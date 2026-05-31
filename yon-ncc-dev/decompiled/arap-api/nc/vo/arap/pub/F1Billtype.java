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
import nc.itf.arap.payable.IArapPayableBillQueryService;
import nc.itf.arap.payable.IArapPayableBillService;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.arap.payable.AggPayableBillVO;
import nc.vo.arap.payable.PayableBillItemVO;
import nc.vo.arap.payable.PayableBillVO;
import nc.vo.arap.pub.ArapBillTypeInfo;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.ml.NCLangRes4VoTransl;

public class F1Billtype
extends ArapBillTypeInfo {
    public String getCode() {
        return "F1";
    }

    public String getName() {
        return NCLangRes4VoTransl.getNCLangRes().getStrByID("2008pay_0", "02008pay-0023");
    }

    public String getTableNameBill() {
        return "ap_payablebill";
    }

    public Class<? extends BaseAggVO> getAggvoClass() {
        return AggPayableBillVO.class;
    }

    public Class<? extends BaseBillVO> getBillvoClass() {
        return PayableBillVO.class;
    }

    public Class<? extends BaseItemVO> getItemvoClass() {
        return PayableBillItemVO.class;
    }

    public Class<? extends IArapBillQueryBaseService> getBillQueryService() {
        return IArapPayableBillQueryService.class;
    }

    public Class<? extends IArapBillBaseService> getBillService() {
        return IArapPayableBillService.class;
    }

    public String getNodeCode_Input() {
        return "20080PBR";
    }

    public String getNodeCode_Manage() {
        return "20080PBM";
    }

    public BillEnumCollection.Direction getDirection() {
        return BillEnumCollection.Direction.CREDIT;
    }
}

