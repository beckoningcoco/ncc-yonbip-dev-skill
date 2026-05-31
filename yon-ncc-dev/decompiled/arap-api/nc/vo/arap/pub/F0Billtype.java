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
import nc.itf.arap.receivable.IArapReceivableBillQueryService;
import nc.itf.arap.receivable.IArapReceivableBillService;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.arap.pub.ArapBillTypeInfo;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.arap.receivable.AggReceivableBillVO;
import nc.vo.arap.receivable.ReceivableBillItemVO;
import nc.vo.arap.receivable.ReceivableBillVO;
import nc.vo.ml.NCLangRes4VoTransl;

public class F0Billtype
extends ArapBillTypeInfo {
    public String getCode() {
        return "F0";
    }

    public String getName() {
        return NCLangRes4VoTransl.getNCLangRes().getStrByID("2006rec_0", "02006rec-0048");
    }

    public String getTableNameBill() {
        return "ar_recbill";
    }

    public Class<? extends BaseAggVO> getAggvoClass() {
        return AggReceivableBillVO.class;
    }

    public Class<? extends BaseBillVO> getBillvoClass() {
        return ReceivableBillVO.class;
    }

    public Class<? extends BaseItemVO> getItemvoClass() {
        return ReceivableBillItemVO.class;
    }

    public Class<? extends IArapBillBaseService> getBillService() {
        return IArapReceivableBillService.class;
    }

    public Class<? extends IArapBillQueryBaseService> getBillQueryService() {
        return IArapReceivableBillQueryService.class;
    }

    public String getNodeCode_Input() {
        return "20060RBR";
    }

    public String getNodeCode_Manage() {
        return "20060RBM";
    }

    public BillEnumCollection.Direction getDirection() {
        return BillEnumCollection.Direction.DEBIT;
    }
}

