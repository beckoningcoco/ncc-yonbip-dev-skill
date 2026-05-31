/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.vo.am.constant.CurrencyConst
 *  nc.vo.arap.basebill.BaseBillVO
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pf.change.ChangeVOAdjustContext
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pub.lang.UFDouble
 */
package nc.vo.arap.payable.vochange;

import java.util.ArrayList;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.vo.am.constant.CurrencyConst;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.payable.PayableBillItemVO;
import nc.vo.arap.payable.vochange.Arap2AmF1VOChange;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pf.change.ChangeVOAdjustContext;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDouble;

public class ArapLeaseInTOF1VOChange
extends Arap2AmF1VOChange {
    String src_billtype = null;

    public AggregatedValueObject[] batchAdjustAfterChange(AggregatedValueObject[] srcVOs, AggregatedValueObject[] destVOs, ChangeVOAdjustContext adjustContext) throws BusinessException {
        if (srcVOs != null && destVOs != null) {
            this.src_billtype = (String)((SuperVO)srcVOs[0].getParentVO()).getAttributeValue("bill_type");
            for (int i = 0; i < destVOs.length; ++i) {
                SuperVO headVO = (SuperVO)destVOs[i].getParentVO();
                headVO.setAttributeValue("pk_currtype", (Object)((String)((SuperVO)srcVOs[i].getParentVO()).getAttributeValue("pk_currency_origin")));
                ((BaseBillVO)destVOs[i].getParentVO()).setBillstatus(Integer.valueOf(-1));
                ArrayList<PayableBillItemVO> bodyList = new ArrayList<PayableBillItemVO>();
                PayableBillItemVO bodyVO1 = this.createPayableBillItemVO(srcVOs[i], destVOs[i], "pk_currency_origin", "foregift");
                PayableBillItemVO bodyVO2 = this.createPayableBillItemVO(srcVOs[i], destVOs[i], "pk_currency_origin", "deposit");
                PayableBillItemVO bodyVO3 = this.createPayableBillItemVO(srcVOs[i], destVOs[i], "pk_currency_earnest", "earnest");
                if (bodyVO1 != null) {
                    bodyList.add(bodyVO1);
                }
                if (bodyVO2 != null) {
                    bodyList.add(bodyVO2);
                }
                if (bodyVO3 != null) {
                    bodyList.add(bodyVO3);
                }
                if (bodyList == null || bodyList.size() == 0) {
                    return null;
                }
                destVOs[i].setChildrenVO((CircularlyAccessibleValueObject[])bodyList.toArray(new PayableBillItemVO[0]));
            }
        }
        return super.batchAdjustAfterChange(srcVOs, destVOs, adjustContext);
    }

    private PayableBillItemVO createPayableBillItemVO(AggregatedValueObject srcVO, AggregatedValueObject destVO, String pk_currency_field, String money_field) {
        PayableBillItemVO bodyVO = new PayableBillItemVO();
        bodyVO.setStatus(2);
        SuperVO srcHeadVO = (SuperVO)srcVO.getParentVO();
        UFDouble local_money = (UFDouble)srcHeadVO.getAttributeValue(CurrencyConst.getOrgLocalField((String)money_field));
        if (local_money == null || local_money.compareTo((Object)UFDouble.ZERO_DBL) == 0) {
            return null;
        }
        bodyVO.setPk_group((String)srcHeadVO.getAttributeValue("pk_group"));
        bodyVO.setPk_org((String)srcHeadVO.getAttributeValue("pk_fiorg_in"));
        bodyVO.setPk_org_v((String)srcHeadVO.getAttributeValue("pk_fiorg_in_v"));
        bodyVO.setDirection(1);
        bodyVO.setTop_billid(srcHeadVO.getPrimaryKey());
        bodyVO.setSrc_billid(srcHeadVO.getPrimaryKey());
        bodyVO.setSrc_billtype((String)srcHeadVO.getAttributeValue("bill_type"));
        bodyVO.setTop_billtype((String)srcHeadVO.getAttributeValue("bill_type"));
        bodyVO.setPk_fiorg((String)srcHeadVO.getAttributeValue("pk_fiorg_in"));
        bodyVO.setPk_fiorg_v((String)srcHeadVO.getAttributeValue("pk_fiorg_in_v"));
        bodyVO.setPk_pcorg((String)srcHeadVO.getAttributeValue("pk_raorg_in"));
        bodyVO.setPk_pcorg_v((String)srcHeadVO.getAttributeValue("pk_raorg_in_v"));
        bodyVO.setSupplier((String)srcHeadVO.getAttributeValue("pk_supplier"));
        bodyVO.setCustomer((String)srcHeadVO.getAttributeValue("pk_customer"));
        bodyVO.setAssetpactno((String)srcHeadVO.getAttributeValue("contract_code"));
        bodyVO.setObjtype(1);
        bodyVO.setPk_currtype((String)srcHeadVO.getAttributeValue(pk_currency_field));
        UFDouble origin_money = (UFDouble)srcHeadVO.getAttributeValue(money_field);
        bodyVO.setMoney_cr(origin_money);
        bodyVO.setMoney_bal(origin_money);
        UFDouble local_money_group = (UFDouble)srcHeadVO.getAttributeValue(money_field + "_group");
        UFDouble local_money_global = (UFDouble)srcHeadVO.getAttributeValue(money_field + "_global");
        bodyVO.setLocal_money_cr(local_money);
        bodyVO.setGroupcrebit(local_money_group);
        bodyVO.setGlobalcrebit(local_money_global);
        bodyVO.setLocal_money_bal(local_money);
        bodyVO.setGroupbalance(local_money_group);
        bodyVO.setGlobalbalance(local_money_global);
        if ("earnest".equals(money_field)) {
            bodyVO.setRate((UFDouble)srcHeadVO.getAttributeValue("earnest_rate"));
        } else {
            bodyVO.setRate((UFDouble)srcHeadVO.getAttributeValue("origin_rate"));
        }
        bodyVO.setPk_group((String)srcHeadVO.getAttributeValue("pk_group"));
        bodyVO.setDirection(-1);
        bodyVO.setPk_billtype("F1");
        bodyVO.setPk_tradetype("D1");
        bodyVO.setBillclass("yf");
        bodyVO.setBilldate(new UFDate(InvocationInfoProxy.getInstance().getBizDateTime()));
        if ("foregift".equals(money_field)) {
            bodyVO.setScomment(NCLangRes4VoTransl.getNCLangRes().getStrByID("common", "UC000-0002140"));
        } else if ("deposit".equals(money_field)) {
            bodyVO.setScomment(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006rec_0", "02006rec-0049"));
        } else if ("earnest".equals(money_field)) {
            bodyVO.setScomment(NCLangRes4VoTransl.getNCLangRes().getStrByID("common", "UC000-0003584"));
        }
        bodyVO.setConfernum((String)srcVO.getParentVO().getAttributeValue("bill_code"));
        return bodyVO;
    }

    @Override
    protected boolean isProcessMny() {
        return "4A28".equals(this.src_billtype);
    }
}

