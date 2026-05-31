/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.itf.it.m5801.IM5801MaintainApp
 *  nc.pubitf.pu.m21.pub.IOrderPubQuery
 *  nc.vo.it.m5801.entity.ContractHVO
 *  nc.vo.it.m5801.entity.ContractVO
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pf.change.ChangeVOAdjustContext
 *  nc.vo.pu.m21.entity.OrderItemVO
 *  nc.vo.pu.m21.entity.OrderVO
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.CircularlyAccessibleValueObject
 */
package nc.vo.arap.payable.vochange;

import java.util.HashMap;
import java.util.HashSet;
import nc.bs.framework.common.NCLocator;
import nc.itf.it.m5801.IM5801MaintainApp;
import nc.pubitf.pu.m21.pub.IOrderPubQuery;
import nc.vo.arap.payable.vochange.ArapF1VOChange;
import nc.vo.it.m5801.entity.ContractHVO;
import nc.vo.it.m5801.entity.ContractVO;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pf.change.ChangeVOAdjustContext;
import nc.vo.pu.m21.entity.OrderItemVO;
import nc.vo.pu.m21.entity.OrderVO;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.CircularlyAccessibleValueObject;

public class Arap4201ToF1VOChange
extends ArapF1VOChange {
    public AggregatedValueObject[] adjustAfterChange2(AggregatedValueObject[] destVOs) throws BusinessException {
        String src_billtype;
        HashMap<String, String> map;
        HashSet<String> corderbids = new HashSet<String>();
        HashSet<String> ccontractbids = new HashSet<String>();
        for (AggregatedValueObject destVO : destVOs) {
            for (CircularlyAccessibleValueObject item : destVO.getChildrenVO()) {
                String src_billtype2 = (String)item.getAttributeValue("src_billtype");
                String string = (String)item.getAttributeValue("src_itemid");
                String hid = (String)item.getAttributeValue("src_billid");
                if (null == src_billtype2 || null == string) continue;
                if (src_billtype2.equals("21")) {
                    corderbids.add(string);
                }
                if (!src_billtype2.equals("5801")) continue;
                ccontractbids.add(hid);
            }
        }
        if (corderbids.size() > 0) {
            OrderVO[] rs;
            map = new HashMap<String, String>();
            for (OrderVO orderVO : rs = ((IOrderPubQuery)NCLocator.getInstance().lookup(IOrderPubQuery.class)).queryOrderVOByBids(corderbids.toArray(new String[0]))) {
                for (OrderItemVO orderItemVO : orderVO.getBVO()) {
                    map.put(orderItemVO.getPk_order_b(), orderVO.getHVO().getPk_payterm());
                }
            }
            for (OrderVO orderVO : destVOs) {
                for (CircularlyAccessibleValueObject circularlyAccessibleValueObject : orderVO.getChildrenVO()) {
                    src_billtype = (String)circularlyAccessibleValueObject.getAttributeValue("src_billtype");
                    String corderbid = (String)circularlyAccessibleValueObject.getAttributeValue("src_itemid");
                    if (null == src_billtype || !src_billtype.equals("21") || null == corderbid) continue;
                    circularlyAccessibleValueObject.setAttributeValue("pk_payterm", map.get(corderbid));
                }
            }
        }
        if (ccontractbids.size() > 0) {
            ContractVO[] vos;
            map = new HashMap();
            for (ContractVO contractVO : vos = ((IM5801MaintainApp)NCLocator.getInstance().lookup(IM5801MaintainApp.class)).queryContract(ccontractbids.toArray(new String[0]))) {
                ContractHVO hvo = contractVO.getParentVO();
                map.put(hvo.getPk_contract(), hvo.getCpaytermid());
            }
            for (ContractVO contractVO : destVOs) {
                for (CircularlyAccessibleValueObject circularlyAccessibleValueObject : contractVO.getChildrenVO()) {
                    src_billtype = (String)circularlyAccessibleValueObject.getAttributeValue("src_billtype");
                    String ccontractbid = (String)circularlyAccessibleValueObject.getAttributeValue("src_billid");
                    if (null == src_billtype || !src_billtype.equals("5801") || null == ccontractbid) continue;
                    circularlyAccessibleValueObject.setAttributeValue("pk_payterm", map.get(ccontractbid));
                }
            }
        }
        return destVOs;
    }

    public AggregatedValueObject[] batchAdjustAfterChange(AggregatedValueObject[] srcVOs, AggregatedValueObject[] destVOs, ChangeVOAdjustContext adjustContext) throws BusinessException {
        if (destVOs == null) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0563"));
        }
        destVOs = this.adjustAfterChange2(destVOs);
        return super.batchAdjustAfterChange(srcVOs, destVOs, adjustContext);
    }
}

