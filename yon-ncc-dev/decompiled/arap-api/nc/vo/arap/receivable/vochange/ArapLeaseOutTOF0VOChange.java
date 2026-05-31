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
package nc.vo.arap.receivable.vochange;

import java.util.ArrayList;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.vo.am.constant.CurrencyConst;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.receivable.ReceivableBillItemVO;
import nc.vo.arap.receivable.vochange.Arap2AmF0VOChange;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pf.change.ChangeVOAdjustContext;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDouble;

public class ArapLeaseOutTOF0VOChange
extends Arap2AmF0VOChange {
    public AggregatedValueObject[] batchAdjustAfterChange(AggregatedValueObject[] srcVOs, AggregatedValueObject[] destVOs, ChangeVOAdjustContext adjustContext) throws BusinessException {
        if (srcVOs != null && destVOs != null) {
            for (int i = 0; i < destVOs.length; ++i) {
                ((BaseBillVO)destVOs[i].getParentVO()).setBillstatus(Integer.valueOf(-1));
                SuperVO headVO = (SuperVO)destVOs[i].getParentVO();
                UFDouble money = UFDouble.ZERO_DBL;
                headVO.setAttributeValue("pk_currtype", (Object)((String)((SuperVO)srcVOs[i].getParentVO()).getAttributeValue("pk_currency_origin")));
                ArrayList<ReceivableBillItemVO> bodyList = new ArrayList<ReceivableBillItemVO>();
                ReceivableBillItemVO bodyVO1 = this.createReceivableBillItemVO(srcVOs[i], destVOs[i], "pk_currency_origin", "foregift");
                ReceivableBillItemVO bodyVO2 = this.createReceivableBillItemVO(srcVOs[i], destVOs[i], "pk_currency_origin", "deposit");
                ReceivableBillItemVO bodyVO3 = this.createReceivableBillItemVO(srcVOs[i], destVOs[i], "pk_currency_earnest", "earnest");
                if (bodyVO1 != null) {
                    bodyList.add(bodyVO1);
                    money = money.add(bodyVO1.getLocal_money_de() == null ? UFDouble.ZERO_DBL : bodyVO1.getLocal_money_de());
                }
                if (bodyVO2 != null) {
                    bodyList.add(bodyVO2);
                    money = money.add(bodyVO2.getLocal_money_de() == null ? UFDouble.ZERO_DBL : bodyVO2.getLocal_money_de());
                }
                if (bodyVO3 != null) {
                    bodyList.add(bodyVO3);
                    money = money.add(bodyVO3.getLocal_money_de() == null ? UFDouble.ZERO_DBL : bodyVO3.getLocal_money_de());
                }
                if (bodyList == null || bodyList.size() == 0) {
                    return null;
                }
                headVO.setAttributeValue("money", (Object)money);
                destVOs[i].setChildrenVO((CircularlyAccessibleValueObject[])bodyList.toArray(new ReceivableBillItemVO[0]));
            }
        }
        return super.batchAdjustAfterChange(srcVOs, destVOs, adjustContext);
    }

    private ReceivableBillItemVO createReceivableBillItemVO(AggregatedValueObject srcVO, AggregatedValueObject destVO, String pk_currency_field, String money_field) {
        ReceivableBillItemVO bodyVO = new ReceivableBillItemVO();
        bodyVO.setStatus(2);
        SuperVO srcHeadVO = (SuperVO)srcVO.getParentVO();
        UFDouble local_money = (UFDouble)srcHeadVO.getAttributeValue(CurrencyConst.getOrgLocalField((String)money_field));
        if (local_money == null || local_money.compareTo((Object)UFDouble.ZERO_DBL) == 0) {
            return null;
        }
        bodyVO.setPk_group((String)srcHeadVO.getAttributeValue("pk_group"));
        bodyVO.setPk_org((String)srcHeadVO.getAttributeValue("pk_fiorg_out"));
        bodyVO.setPk_org_v((String)srcHeadVO.getAttributeValue("pk_fiorg_out_v"));
        bodyVO.setDirection(1);
        bodyVO.setTop_billid(srcHeadVO.getPrimaryKey());
        bodyVO.setSrc_billid(srcHeadVO.getPrimaryKey());
        bodyVO.setSrc_billtype((String)srcHeadVO.getAttributeValue("bill_type"));
        bodyVO.setTop_billtype((String)srcHeadVO.getAttributeValue("bill_type"));
        bodyVO.setPk_fiorg((String)srcHeadVO.getAttributeValue("pk_fiorg_out"));
        bodyVO.setPk_fiorg_v((String)srcHeadVO.getAttributeValue("pk_fiorg_out_v"));
        bodyVO.setPk_pcorg((String)srcHeadVO.getAttributeValue("pk_raorg_out"));
        bodyVO.setPk_pcorg_v((String)srcHeadVO.getAttributeValue("pk_raorg_out_v"));
        bodyVO.setSupplier((String)srcHeadVO.getAttributeValue("pk_supplier"));
        bodyVO.setCustomer((String)srcHeadVO.getAttributeValue("pk_customer"));
        bodyVO.setAssetpactno((String)srcHeadVO.getAttributeValue("contract_code"));
        bodyVO.setObjtype(0);
        bodyVO.setPk_currtype((String)srcHeadVO.getAttributeValue(pk_currency_field));
        UFDouble origin_money = (UFDouble)srcHeadVO.getAttributeValue(money_field);
        bodyVO.setMoney_de(origin_money);
        bodyVO.setMoney_bal(origin_money);
        UFDouble local_money_group = (UFDouble)srcHeadVO.getAttributeValue(money_field + "_group");
        UFDouble local_money_global = (UFDouble)srcHeadVO.getAttributeValue(money_field + "_global");
        bodyVO.setLocal_money_de(local_money);
        bodyVO.setLocal_money_bal(local_money);
        bodyVO.setGroupdebit(local_money_group);
        bodyVO.setGlobaldebit(local_money_global);
        bodyVO.setGroupbalance(local_money_group);
        bodyVO.setGlobalbalance(local_money_global);
        if ("earnest".equals(money_field)) {
            bodyVO.setRate((UFDouble)srcHeadVO.getAttributeValue("earnest_rate"));
        } else {
            bodyVO.setRate((UFDouble)srcHeadVO.getAttributeValue("origin_rate"));
        }
        bodyVO.setPk_group((String)srcHeadVO.getAttributeValue("pk_group"));
        bodyVO.setDirection(1);
        bodyVO.setPk_billtype("F0");
        bodyVO.setPk_tradetype("D0");
        bodyVO.setBillclass("ys");
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
}

