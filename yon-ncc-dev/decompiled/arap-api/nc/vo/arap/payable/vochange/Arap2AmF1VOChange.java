/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.framework.common.NCLocator
 *  nc.itf.uap.pf.IPFConfig
 *  nc.vo.arap.basebill.BaseBillVO
 *  nc.vo.arap.basebill.BaseItemVO
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.BusinessRuntimeException
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pub.lang.UFDateTime
 *  nc.vo.pub.lang.UFDouble
 *  nc.vo.pubapp.pattern.pub.MathTool
 *  nccloud.commons.lang.StringUtils
 */
package nc.vo.arap.payable.vochange;

import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.framework.common.NCLocator;
import nc.itf.uap.pf.IPFConfig;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.arap.payable.vochange.ArapF1VOChange;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.BusinessRuntimeException;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.pub.MathTool;
import nccloud.commons.lang.StringUtils;

public class Arap2AmF1VOChange
extends ArapF1VOChange {
    protected boolean isProcessMny() {
        return false;
    }

    protected boolean isFillRate() {
        return true;
    }

    protected void setDefaultValues(AggregatedValueObject vo) {
        BaseBillVO head = (BaseBillVO)vo.getParentVO();
        BaseItemVO[] children = (BaseItemVO[])vo.getChildrenVO();
        if (head.getCreator() == null) {
            head.setCreator(InvocationInfoProxy.getInstance().getUserId());
        }
        if (head.getBillmaker() == null) {
            head.setBillmaker(InvocationInfoProxy.getInstance().getUserId());
        }
        if (head.getCreationtime() == null) {
            head.setCreationtime(new UFDateTime());
        }
        String pk_billtype = head.getPk_billtype();
        String top_billtype = (String)children[0].getAttributeValue("top_billtype");
        for (BaseItemVO item : children) {
            if (item.getBusidate() == null) {
                item.setBusidate(new UFDate(InvocationInfoProxy.getInstance().getBizDateTime()));
            }
            if (!"F1".equals(pk_billtype) || !"4A24".equals(top_billtype)) {
                item.setNotax_cr(item.getMoney_cr());
            }
            item.setLocal_notax_cr(MathTool.sub((UFDouble)item.getLocal_money_cr(), (UFDouble)item.getLocal_tax_cr()));
            item.setGroupnotax_cre(MathTool.sub((UFDouble)item.getGroupcrebit(), (UFDouble)item.getGrouptax_cre()));
            item.setGlobalnotax_cre(MathTool.sub((UFDouble)item.getGlobalcrebit(), (UFDouble)item.getGlobaltax_cre()));
        }
        try {
            IPFConfig ipf = (IPFConfig)NCLocator.getInstance().lookup(IPFConfig.class);
            if (!StringUtils.isEmpty((CharSequence)head.getPk_billtype()) && !StringUtils.isEmpty((CharSequence)head.getPk_tradetype())) {
                String pk_busitype = ipf.retBusitypeCanStart(head.getPk_billtype(), head.getPk_tradetype(), head.getPk_org(), head.getCreator());
                if (pk_busitype == null) {
                    throw new BusinessException("busitype is null");
                }
                head.setPk_busitype(pk_busitype);
            }
        }
        catch (Exception e) {
            String msg = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0127") + head.getPk_tradetype() + NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0239") + head.getPk_tradetype() + NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0240");
            throw new BusinessRuntimeException(msg);
        }
    }
}

