/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.bill.ArapBillPubUtil
 *  nc.bs.framework.common.NCLocator
 *  nc.itf.arap.prv.IArapBillConfirmService
 *  nc.pubitf.arap.bill.IArapBillPubService
 *  nc.vo.arap.basebill.BaseAggVO
 *  nc.vo.arap.basebill.BaseBillVO
 *  nc.vo.arap.pub.BillEnumCollection$ApproveStatus
 *  nc.vo.arap.utils.ArrayUtil
 *  nc.vo.fipub.annotation.Business
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFBoolean
 *  nccloud.pubitf.arap.verificationsheet.IBillVerifyQueryService
 */
package nc.impl.arap.prv;

import nc.bs.arap.bill.ArapBillPubUtil;
import nc.bs.framework.common.NCLocator;
import nc.itf.arap.prv.IArapBillConfirmService;
import nc.pubitf.arap.bill.IArapBillPubService;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.arap.utils.ArrayUtil;
import nc.vo.fipub.annotation.Business;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFBoolean;
import nccloud.pubitf.arap.verificationsheet.IBillVerifyQueryService;

public class ArapBillConfirmServiceImpl
implements IArapBillConfirmService {
    @Business(business="\u57fa\u7840\u5355\u636e", subBusiness="\u534f\u540c\u786e\u8ba4", description="\u4f20\u9012\u5355\u636e\u4fe1\u606f\uff0c\u8fdb\u884c\u534f\u540c\u786e\u8ba4", type="\u666e\u901a\u4e1a\u52a1")
    public AggregatedValueObject updateConfirmInfo(BaseAggVO bill) throws BusinessException {
        AggregatedValueObject res = ((IArapBillPubService)NCLocator.getInstance().lookup(IArapBillPubService.class)).update(bill);
        return res;
    }

    @Business(business="\u57fa\u7840\u5355\u636e", subBusiness="\u534f\u540c\u786e\u8ba4", description="\u4f20\u9012\u5355\u636e\u4fe1\u606f\uff0c\u53d6\u6d88\u534f\u540c\u786e\u8ba4", type="\u666e\u901a\u4e1a\u52a1")
    public AggregatedValueObject updateCancelConfirmInfo(BaseAggVO bill) throws BusinessException {
        UFBoolean flag = ((IBillVerifyQueryService)NCLocator.getInstance().lookup(IBillVerifyQueryService.class)).isLinkedBill(bill.getPrimaryKey());
        if (flag.booleanValue()) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0134"));
        }
        BaseBillVO head = (BaseBillVO)bill.getParent();
        if (head.getApprovestatus().intValue() != BillEnumCollection.ApproveStatus.NOSTATE.VALUE.intValue()) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0135"));
        }
        ArapBillPubUtil.getBillCodeUtil((AggregatedValueObject[])new AggregatedValueObject[]{bill}).returnBillCode(new AggregatedValueObject[]{bill});
        head.setBillno(null);
        AggregatedValueObject res = (AggregatedValueObject)ArrayUtil.getFirstInArrays((Object[])((IArapBillPubService)NCLocator.getInstance().lookup(IArapBillPubService.class)).update(new BaseAggVO[]{bill}));
        return res;
    }
}

