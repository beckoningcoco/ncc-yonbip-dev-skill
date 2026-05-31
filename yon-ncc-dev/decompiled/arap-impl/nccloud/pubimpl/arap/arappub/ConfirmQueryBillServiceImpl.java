/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.bill.ArapBillPubUtil
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.framework.common.NCLocator
 *  nc.itf.arap.pay.IArapPayBillQueryService
 *  nc.itf.arap.payable.IArapPayableBillQueryService
 *  nc.itf.arap.receivable.IArapReceivableBillQueryService
 *  nc.pubitf.arap.gathering.IArapGatheringBillPubQueryService
 *  nc.ui.querytemplate.querytree.IQueryScheme
 *  nc.vo.arap.basebill.BaseAggVO
 *  nc.vo.arap.basebill.BaseBillVO
 *  nc.vo.arap.gathering.AggGatheringBillVO
 *  nc.vo.arap.pay.AggPayBillVO
 *  nc.vo.arap.payable.AggPayableBillVO
 *  nc.vo.arap.receivable.AggReceivableBillVO
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pubapp.pagination.PaginationQueryVO
 *  nc.vo.pubapp.query2.sql.process.QuerySchemeProcessor
 *  nccloud.dto.arap.arappub.PageQueryVO
 *  nccloud.pubitf.arap.arappub.IConfirmQueryBillService
 *  org.apache.commons.collections4.CollectionUtils
 *  org.apache.commons.lang3.ArrayUtils
 */
package nccloud.pubimpl.arap.arappub;

import java.lang.reflect.Array;
import java.util.ArrayList;
import nc.bs.arap.bill.ArapBillPubUtil;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.framework.common.NCLocator;
import nc.itf.arap.pay.IArapPayBillQueryService;
import nc.itf.arap.payable.IArapPayableBillQueryService;
import nc.itf.arap.receivable.IArapReceivableBillQueryService;
import nc.pubitf.arap.gathering.IArapGatheringBillPubQueryService;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.gathering.AggGatheringBillVO;
import nc.vo.arap.pay.AggPayBillVO;
import nc.vo.arap.payable.AggPayableBillVO;
import nc.vo.arap.receivable.AggReceivableBillVO;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pubapp.pagination.PaginationQueryVO;
import nc.vo.pubapp.query2.sql.process.QuerySchemeProcessor;
import nccloud.dto.arap.arappub.PageQueryVO;
import nccloud.pubitf.arap.arappub.IConfirmQueryBillService;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.ArrayUtils;

public abstract class ConfirmQueryBillServiceImpl
implements IConfirmQueryBillService {
    public PageQueryVO queryByQueryScheme(IQueryScheme qryScheme) throws BusinessException {
        PaginationQueryVO vo;
        String[] orgs;
        QuerySchemeProcessor qrySchemeProcessor = new QuerySchemeProcessor(qryScheme);
        qrySchemeProcessor.appendCurrentGroup();
        qrySchemeProcessor.appendFuncPermissionOrgSql();
        String cond = qryScheme.getWhereSQLOnly() + " and isnull(isrefund,'N') = 'N' ";
        cond = cond != null && cond.length() > 0 ? cond + " and isinit = 'N' and dr =0 and src_syscode=9 and pk_group='" + InvocationInfoProxy.getInstance().getGroupId() + "' " : " isinit = 'N' and dr =0 and src_syscode=9 and pk_group='" + InvocationInfoProxy.getInstance().getGroupId() + "' ";
        String[] stringArray = orgs = qrySchemeProcessor.getQueryCondition("pk_org") == null ? null : qrySchemeProcessor.getQueryCondition("pk_org").getValues();
        if (orgs == null || orgs.length == 0) {
            // empty if block
        }
        String[] pks = (vo = this.getQueryService().queryPaginationQueryVO(cond, Integer.valueOf(10000))) == null ? null : vo.getAllpks();
        BaseAggVO[] vos = null;
        CircularlyAccessibleValueObject[] headVos = null;
        if (pks != null) {
            vos = this.getQueryService().findBillByPrimaryKey(pks);
        }
        this.setFrozen(vos);
        ArrayList<BaseBillVO> list = new ArrayList<BaseBillVO>();
        if (vos != null && vos.length != 0) {
            ArapBillPubUtil.refreshChildVO2HeadVO((AggregatedValueObject[])vos);
            for (BaseAggVO aggvo : vos) {
                list.add(aggvo.getHeadVO());
            }
            headVos = list.toArray((CircularlyAccessibleValueObject[])Array.newInstance(((CircularlyAccessibleValueObject)list.get(0)).getClass(), 0));
        }
        PageQueryVO pageQueryVO = new PageQueryVO();
        pageQueryVO.setPks(pks);
        pageQueryVO.setHeadvos(headVos);
        return pageQueryVO;
    }

    public abstract IConfirmQueryBillService getQueryService();

    public void setFrozen(BaseAggVO[] vos) throws BusinessException {
        if (ArrayUtils.isEmpty((Object[])vos)) {
            return;
        }
        ArrayList<String> pks = new ArrayList<String>();
        AggReceivableBillVO[] topvos = null;
        for (BaseAggVO vo : vos) {
            if (vo == null || ArrayUtils.isEmpty((Object[])vo.getChildrenVO())) continue;
            pks.add((String)vo.getChildrenVO()[0].getAttributeValue("top_billid"));
        }
        if (CollectionUtils.isEmpty(pks)) {
            return;
        }
        if (vos instanceof AggPayableBillVO[]) {
            topvos = ((IArapReceivableBillQueryService)NCLocator.getInstance().lookup(IArapReceivableBillQueryService.class)).findBillByPrimaryKey(pks.toArray(new String[0]));
        } else if (vos instanceof AggReceivableBillVO[]) {
            topvos = ((IArapPayableBillQueryService)NCLocator.getInstance().lookup(IArapPayableBillQueryService.class)).findBillByPrimaryKey(pks.toArray(new String[0]));
        } else if (vos instanceof AggGatheringBillVO[]) {
            topvos = ((IArapPayBillQueryService)NCLocator.getInstance().lookup(IArapPayBillQueryService.class)).findBillByPrimaryKey(pks.toArray(new String[0]));
        } else if (vos instanceof AggPayBillVO[]) {
            topvos = ((IArapGatheringBillPubQueryService)NCLocator.getInstance().lookup(IArapGatheringBillPubQueryService.class)).findBillByPrimaryKey(pks.toArray(new String[0]));
        }
        if (topvos == null || topvos.length == 0) {
            return;
        }
        int index = 0;
        for (AggReceivableBillVO vo : topvos) {
            Integer sagafrozen = (Integer)vo.getParentVO().getAttributeValue("saga_frozen");
            Integer sagastatus = (Integer)vo.getParentVO().getAttributeValue("saga_status");
            if (sagafrozen != null && sagafrozen == 1) {
                vos[index].getParentVO().setAttributeValue("saga_frozen", (Object)1);
            }
            if (sagastatus != null && sagastatus == 1) {
                vos[index].getParentVO().setAttributeValue("saga_status", (Object)1);
            }
            ++index;
        }
    }
}

