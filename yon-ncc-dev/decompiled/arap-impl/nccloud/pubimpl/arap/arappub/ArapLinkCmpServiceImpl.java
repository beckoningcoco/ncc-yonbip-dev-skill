/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.bill.ArapBillPubUtil
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.pf.pub.PfDataCache
 *  nc.bs.pub.pf.PfUtilTools
 *  nc.itf.cmp.settlement.ISettlementQueryService
 *  nc.md.persist.framework.IMDPersistenceQueryService
 *  nc.pubitf.arap.pub.ICurrentVersionService
 *  nc.vo.arap.basebill.BaseAggVO
 *  nc.vo.arap.basebill.BaseBillVO
 *  nc.vo.arap.basebill.BaseItemVO
 *  nc.vo.cmp.settlement.SettlementAggVO
 *  nc.vo.cmp.settlement.SettlementBodyVO
 *  nc.vo.fbm.register.RegisterVO
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.billtype.BilltypeVO
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pub.lang.UFDateTime
 *  nccloud.dto.arap.arappub.info.CommonInfo
 *  nccloud.pubitf.arap.arappub.IArapLinkCmpService
 */
package nccloud.pubimpl.arap.arappub;

import java.util.Collection;
import nc.bs.arap.bill.ArapBillPubUtil;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.framework.common.NCLocator;
import nc.bs.pf.pub.PfDataCache;
import nc.bs.pub.pf.PfUtilTools;
import nc.itf.cmp.settlement.ISettlementQueryService;
import nc.md.persist.framework.IMDPersistenceQueryService;
import nc.pubitf.arap.pub.ICurrentVersionService;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.cmp.settlement.SettlementAggVO;
import nc.vo.cmp.settlement.SettlementBodyVO;
import nc.vo.fbm.register.RegisterVO;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.billtype.BilltypeVO;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;
import nccloud.dto.arap.arappub.info.CommonInfo;
import nccloud.pubitf.arap.arappub.IArapLinkCmpService;

public class ArapLinkCmpServiceImpl
implements IArapLinkCmpService {
    public BaseAggVO associateSettInfo(CommonInfo info) throws BusinessException {
        String billtype = info.getBillType();
        String billclass = null;
        if ("F2".equals(billtype)) {
            billclass = "sk";
        } else if ("F3".equals(billtype)) {
            billclass = "fk";
        }
        ISettlementQueryService query = (ISettlementQueryService)NCLocator.getInstance().lookup(ISettlementQueryService.class);
        SettlementAggVO[] vos = query.querySettlementAggVOsByPks(new String[]{info.getPk_bill()});
        BaseAggVO vo = null;
        if (vos != null && vos.length > 0) {
            String pk_user;
            SettlementAggVO settleAgg = vos[0];
            vo = (BaseAggVO)PfUtilTools.runChangeData((String)"2201", (String)billtype, (AggregatedValueObject)settleAgg);
            int j = 0;
            SettlementBodyVO[] bodyVOs = (SettlementBodyVO[])settleAgg.getChildrenVO();
            BaseItemVO[] items = vo.getItems();
            for (int i = 0; i < items.length; ++i) {
                if (bodyVOs[i].getBusilineno() == null) {
                    bodyVOs[i].setBusilineno(Integer.valueOf(j++));
                }
                items[i].setRowno(bodyVOs[i].getBusilineno());
            }
            String nodekey = info.getPageId();
            BilltypeVO billtypeVO = PfDataCache.getBillType((String)nodekey);
            BaseBillVO parentVO = vo.getHeadVO();
            String pk_org = parentVO.getPk_org();
            UFDate billdate = parentVO.getBilldate();
            String pk_org_v = ((ICurrentVersionService)NCLocator.getInstance().lookup(ICurrentVersionService.class)).queryOrgPkVidByPKAndDate(pk_org, billdate);
            parentVO.setPk_org_v(pk_org_v);
            parentVO.setPk_tradetype(nodekey);
            parentVO.setPk_tradetypeid(billtypeVO.getPk_billtypeid());
            UFDate busiDate = new UFDate(InvocationInfoProxy.getInstance().getBizDateTime());
            UFDateTime createTime = new UFDateTime(System.currentTimeMillis());
            String pk_billmaker = pk_user = InvocationInfoProxy.getInstance().getUserId();
            parentVO.setBilldate(busiDate);
            parentVO.setBusidate(busiDate);
            parentVO.setCreator(pk_user);
            parentVO.setCreationtime(createTime);
            parentVO.setBillmaker(pk_billmaker);
            parentVO.setBillclass(billclass);
            parentVO.setPk_billtype(billtype);
            parentVO.setIsfromindependent(UFBoolean.TRUE);
            for (BaseItemVO bodyVO : vo.getItems()) {
                bodyVO.setBilldate(busiDate);
                bodyVO.setBusidate(busiDate);
                bodyVO.setBillclass(billclass);
                bodyVO.setPk_tradetype(nodekey);
                bodyVO.setPk_tradetypeid(billtypeVO.getPk_billtypeid());
                bodyVO.setPk_org_v(pk_org_v);
                parentVO.setPk_billtype(billtype);
            }
            ArapBillPubUtil.refreshChildVO2HeadVO((AggregatedValueObject[])new AggregatedValueObject[]{vo});
        }
        return vo;
    }

    public RegisterVO[] getBaseInfoBatchByPks(String[] pk_registers) throws BusinessException {
        Collection result = ((IMDPersistenceQueryService)NCLocator.getInstance().lookup(IMDPersistenceQueryService.class)).queryBillOfVOByPKs(RegisterVO.class, pk_registers, false);
        if (result == null || result.isEmpty()) {
            return null;
        }
        return result.toArray(new RegisterVO[0]);
    }
}

