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
import nc.itf.arap.supreceivable.IArapSupReceivableBillQueryService;
import nc.itf.arap.supreceivable.IArapSupReceivableBillService;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.arap.pub.ArapBillTypeInfo;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.arap.supreceivable.AggSupReceivableBillVO;
import nc.vo.arap.supreceivable.SupReceivableBillItemVO;
import nc.vo.arap.supreceivable.SupReceivableBillVO;
import nc.vo.ml.NCLangRes4VoTransl;

public class F023Billtype
extends ArapBillTypeInfo {
    public String getCode() {
        return "23F0";
    }

    public String getName() {
        return NCLangRes4VoTransl.getNCLangRes().getStrByID("2006rec_0", "02006rec-0050");
    }

    public String getTableNameBill() {
        return "ar_suprecbill";
    }

    public Class<? extends BaseAggVO> getAggvoClass() {
        return AggSupReceivableBillVO.class;
    }

    public Class<? extends BaseBillVO> getBillvoClass() {
        return SupReceivableBillVO.class;
    }

    public Class<? extends BaseItemVO> getItemvoClass() {
        return SupReceivableBillItemVO.class;
    }

    public Class<? extends IArapBillQueryBaseService> getBillQueryService() {
        return IArapSupReceivableBillQueryService.class;
    }

    public Class<? extends IArapBillBaseService> getBillService() {
        return IArapSupReceivableBillService.class;
    }

    public String getNodeCode_Input() {
        return null;
    }

    public String getNodeCode_Manage() {
        return null;
    }

    public BillEnumCollection.Direction getDirection() {
        return BillEnumCollection.Direction.DEBIT;
    }
}

