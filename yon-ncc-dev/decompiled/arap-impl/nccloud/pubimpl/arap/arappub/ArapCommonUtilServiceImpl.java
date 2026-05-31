/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.util.ArapBillType2TableMapping
 *  nc.bs.crossrule.external.CrossRuleParamContext
 *  nc.bs.crossrule.service.CrossRulePubServiceFacade
 *  nc.vo.arap.basebill.BaseAggVO
 *  nc.vo.arap.cache.FiPubDataCache
 *  nc.vo.arap.utils.ARAPModuleEnableUtil
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.billtype.BilltypeVO
 *  nc.vo.pubapp.pattern.model.entity.bill.IBill
 *  nccloud.pubitf.arap.arappub.IArapCommonUtilService
 */
package nccloud.pubimpl.arap.arappub;

import java.util.Map;
import nc.bs.arap.util.ArapBillType2TableMapping;
import nc.bs.crossrule.external.CrossRuleParamContext;
import nc.bs.crossrule.service.CrossRulePubServiceFacade;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.cache.FiPubDataCache;
import nc.vo.arap.utils.ARAPModuleEnableUtil;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.billtype.BilltypeVO;
import nc.vo.pubapp.pattern.model.entity.bill.IBill;
import nccloud.pubimpl.arap.arappub.ArapBillHeadQuery;
import nccloud.pubitf.arap.arappub.IArapCommonUtilService;

public class ArapCommonUtilServiceImpl
implements IArapCommonUtilService {
    public BilltypeVO getBillType(String billType) {
        return FiPubDataCache.getBillType((String)billType);
    }

    public String[] getFilterValue(CrossRuleParamContext context) throws BusinessException {
        return CrossRulePubServiceFacade.getInstance().getFilterValue(context);
    }

    public Map<String, Boolean> queryModuleEnableInfo(String pk_group, String ... moduleNames) throws BusinessException {
        return ARAPModuleEnableUtil.isEnableBatch((String)pk_group, (String[])moduleNames);
    }

    public boolean isModuleEnable(String pk_group, String funcode) throws BusinessException {
        return ARAPModuleEnableUtil.isEnable((String)pk_group, (String)funcode);
    }

    public BaseAggVO[] queryBillHead(String[] pks, String pk_billType) {
        ArapBillHeadQuery bo = new ArapBillHeadQuery(ArapBillType2TableMapping.getVOClassByBilltype((String)pk_billType));
        IBill[] HeadVO = bo.query(pks);
        return (BaseAggVO[])((AggregatedValueObject[])HeadVO);
    }
}

