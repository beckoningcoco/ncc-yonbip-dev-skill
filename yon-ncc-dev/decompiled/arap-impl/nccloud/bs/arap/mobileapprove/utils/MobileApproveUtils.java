/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.logging.Logger
 *  nc.bs.pub.pf.IMobileBillConstructListener
 *  nc.vo.arap.basebill.BaseAggVO
 *  nc.vo.arap.gathering.AggGatheringBillVO
 *  nc.vo.arap.pay.AggPayBillVO
 *  nc.vo.arap.payable.AggPayableBillVO
 *  nc.vo.arap.receivable.AggReceivableBillVO
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.bill.BillTempletVO
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pub.lang.UFDouble
 *  nc.web.arap.util.VerifyVOScaleUtil
 *  nccloud.pubitf.arap.baddebts.IBaddebtsBillQueryService
 *  nccloud.vo.arap.bdloss.AggBdLossVO
 *  nccloud.vo.arap.bdloss.BdLossChildVO
 *  nccloud.vo.arap.bdrecovery.AggBdRecoveryVO
 *  nccloud.vo.arap.bdrecovery.BdRecoveryYSVO
 */
package nccloud.bs.arap.mobileapprove.utils;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;
import nc.bs.framework.common.NCLocator;
import nc.bs.logging.Logger;
import nc.bs.pub.pf.IMobileBillConstructListener;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.gathering.AggGatheringBillVO;
import nc.vo.arap.pay.AggPayBillVO;
import nc.vo.arap.payable.AggPayableBillVO;
import nc.vo.arap.receivable.AggReceivableBillVO;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.SuperVO;
import nc.vo.pub.bill.BillTempletVO;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDouble;
import nc.web.arap.util.VerifyVOScaleUtil;
import nccloud.pubitf.arap.baddebts.IBaddebtsBillQueryService;
import nccloud.vo.arap.bdloss.AggBdLossVO;
import nccloud.vo.arap.bdloss.BdLossChildVO;
import nccloud.vo.arap.bdrecovery.AggBdRecoveryVO;
import nccloud.vo.arap.bdrecovery.BdRecoveryYSVO;

public class MobileApproveUtils
implements IMobileBillConstructListener {
    public static final String LOSSRATE = "lossrate";

    public void beforeConstruct(BillTempletVO templetVO, Object billVO) throws BusinessException {
        String pk = null;
        String billtype = null;
        if (billVO instanceof AggBdLossVO) {
            billtype = "BDL";
            AggBdLossVO bdlVO = (AggBdLossVO)billVO;
            pk = bdlVO.getParent().getPrimaryKey();
            AggBdLossVO[] aggvos = (AggBdLossVO[])((IBaddebtsBillQueryService)NCLocator.getInstance().lookup(IBaddebtsBillQueryService.class)).queryBillsByPKs(new String[]{pk}, billtype);
            this.setValueForBad(billVO, (SuperVO)aggvos[0].getParentVO(), (SuperVO[])aggvos[0].getBodyVOs());
        } else if (billVO instanceof AggBdRecoveryVO) {
            billtype = "BDR";
            AggBdRecoveryVO bdlVO = (AggBdRecoveryVO)billVO;
            pk = bdlVO.getParent().getPrimaryKey();
            AggBdRecoveryVO[] aggvos = (AggBdRecoveryVO[])((IBaddebtsBillQueryService)NCLocator.getInstance().lookup(IBaddebtsBillQueryService.class)).queryBillsByPKs(new String[]{pk}, billtype);
            this.setValueForBad(billVO, (SuperVO)aggvos[0].getParentVO(), (SuperVO[])aggvos[0].getYSBodyVOs());
        }
        this.delMoneyAccuracy(billVO);
    }

    public void afterConstruct(Map<String, List<Map<String, Object>>> billVOMap) throws BusinessException {
    }

    private void setValueForBad(Object billVO, SuperVO bill, SuperVO[] chilVO) {
        block3: {
            UFDouble golabrate;
            UFDouble grouprate;
            UFDouble rate;
            String currtype;
            block2: {
                currtype = (String)bill.getAttributeValue("pk_currtype");
                rate = null;
                grouprate = null;
                golabrate = null;
                if (!(billVO instanceof AggBdLossVO)) break block2;
                BdLossChildVO vo = (BdLossChildVO)chilVO[0];
                rate = (UFDouble)bill.getAttributeValue(LOSSRATE);
                grouprate = vo.getLossgrouprate();
                golabrate = vo.getLossglobalrate();
                AggBdLossVO bdlVO = (AggBdLossVO)billVO;
                bdlVO.getParentVO().setAttributeValue(LOSSRATE, (Object)rate);
                bdlVO.getParentVO().setAttributeValue("pk_currtype", (Object)currtype);
                for (BdLossChildVO vochil : bdlVO.getBodyVOs()) {
                    vochil.setAttributeValue("lossgrouprate", (Object)grouprate);
                    vochil.setAttributeValue("lossglobalrate", (Object)golabrate);
                }
                break block3;
            }
            if (!(billVO instanceof AggBdRecoveryVO)) break block3;
            BdRecoveryYSVO vo = (BdRecoveryYSVO)chilVO[0];
            rate = (UFDouble)bill.getAttributeValue("rate");
            grouprate = vo.getGrouprate();
            golabrate = vo.getGlobalrate();
            AggBdRecoveryVO bdrVO = (AggBdRecoveryVO)billVO;
            bdrVO.getParentVO().setAttributeValue("rate", (Object)rate);
            bdrVO.getParentVO().setAttributeValue("pk_currtype", (Object)currtype);
            for (BdRecoveryYSVO vochil : bdrVO.getYSBodyVOs()) {
                vochil.setAttributeValue("grouprate", (Object)grouprate);
                vochil.setAttributeValue("globalrate", (Object)golabrate);
            }
        }
    }

    private void delMoneyAccuracy(Object billVO) throws BusinessException {
        if (billVO instanceof AggGatheringBillVO || billVO instanceof AggPayableBillVO || billVO instanceof AggReceivableBillVO || billVO instanceof AggPayBillVO) {
            try {
                BaseAggVO data = (BaseAggVO)billVO;
                billVO = new VerifyVOScaleUtil().verifyVOScale(new BaseAggVO[]{data})[0];
            }
            catch (Exception e) {
                Logger.error((Object)("Precision handling catches exceptions\uff1a" + e.getMessage()));
            }
        }
    }

    private void delDateForMobileBill(Object billVO) throws BusinessException {
        if (billVO instanceof AggregatedValueObject) {
            AggregatedValueObject aggVO = (AggregatedValueObject)billVO;
            UFDate billDate = (UFDate)aggVO.getParentVO().getAttributeValue("billdate");
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String s = sdf.format(billDate.toDate());
            try {
                UFDate date = new UFDate(sdf.parse(s));
                aggVO.getParentVO().setAttributeValue("billdate", (Object)date);
            }
            catch (Exception e) {
                Logger.error((Object)("Date handling catches exceptions\uff1a" + e.getMessage()));
            }
        }
    }
}

