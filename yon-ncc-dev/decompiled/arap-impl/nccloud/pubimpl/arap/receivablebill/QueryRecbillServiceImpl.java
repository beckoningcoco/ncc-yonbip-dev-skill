/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.bill.ArapBillPubUtil
 *  nc.bs.arap.util.SqlUtils
 *  nc.bs.framework.common.NCLocator
 *  nc.impl.pubapp.pattern.data.bill.BillQuery
 *  nc.itf.arap.receivable.IArapReceivableBillQueryService
 *  nc.vo.arap.basebill.BaseAggVO
 *  nc.vo.arap.receivable.AggReceivableBillVO
 *  nc.vo.arap.receivable.ReceivableBillItemVO
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pub.lang.UFDouble
 *  nc.vo.pubapp.pagination.PaginationQueryVO
 *  nccloud.commons.lang.ArrayUtils
 *  nccloud.pubimpl.arap.arappub.QueryBillServiceImpl
 *  nccloud.pubitf.arap.arappub.IQueryBillService
 *  nccloud.pubitf.arap.receivablebill.IQueryRecbillService
 */
package nccloud.pubimpl.arap.receivablebill;

import java.util.Arrays;
import java.util.List;
import nc.bs.arap.bill.ArapBillPubUtil;
import nc.bs.arap.util.SqlUtils;
import nc.bs.framework.common.NCLocator;
import nc.impl.pubapp.pattern.data.bill.BillQuery;
import nc.itf.arap.receivable.IArapReceivableBillQueryService;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.receivable.AggReceivableBillVO;
import nc.vo.arap.receivable.ReceivableBillItemVO;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pagination.PaginationQueryVO;
import nccloud.commons.lang.ArrayUtils;
import nccloud.pubimpl.arap.arappub.QueryBillServiceImpl;
import nccloud.pubitf.arap.arappub.IQueryBillService;
import nccloud.pubitf.arap.receivablebill.IQueryRecbillService;

public class QueryRecbillServiceImpl
extends QueryBillServiceImpl
implements IQueryRecbillService {
    public PaginationQueryVO queryPaginationQueryVO(String condition, Integer billcount) throws BusinessException {
        IArapReceivableBillQueryService service = (IArapReceivableBillQueryService)NCLocator.getInstance().lookup(IArapReceivableBillQueryService.class);
        return service.queryPaginationQueryVO(condition, billcount);
    }

    public BaseAggVO[] findBillByPrimaryKey(String[] pks) throws BusinessException {
        IArapReceivableBillQueryService service = (IArapReceivableBillQueryService)NCLocator.getInstance().lookup(IArapReceivableBillQueryService.class);
        return service.findBillByPrimaryKey(pks);
    }

    public AggReceivableBillVO getaggvos(String ... pk) throws BusinessException {
        BillQuery query = new BillQuery(AggReceivableBillVO.class);
        AggReceivableBillVO[] aggvo = (AggReceivableBillVO[])query.query(pk);
        return aggvo[0];
    }

    public IQueryBillService getQueryService() {
        IQueryRecbillService queryService = (IQueryRecbillService)NCLocator.getInstance().lookup(IQueryRecbillService.class);
        return queryService;
    }

    public AggReceivableBillVO[] getAggvosByBodyPks(String[] pks) throws BusinessException {
        List<String> pklist = Arrays.asList(pks);
        IArapReceivableBillQueryService service = (IArapReceivableBillQueryService)NCLocator.getInstance().lookup(IArapReceivableBillQueryService.class);
        String whereSql = " ar_recbill.pk_recbill in (select ar_recitem.pk_recbill from ar_recitem ar_recitem where " + SqlUtils.getInStr((String)"ar_recitem.pk_recitem", (String[])pks) + " )";
        Object[] aggVOs = service.queryVOsByWhere(whereSql);
        for (int i = 0; i < aggVOs.length; ++i) {
            Object[] items = (ReceivableBillItemVO[])aggVOs[i].getChildrenVO();
            for (int j = 0; j < items.length; ++j) {
                String pk_recitem = items[j].getPk_recitem();
                UFBoolean pausetransact = items[j].getPausetransact();
                UFDouble money_bal = items[j].getMoney_bal();
                UFDouble occupationmny = items[j].getOccupationmny();
                if (pklist.contains(pk_recitem) && !pausetransact.booleanValue() && !money_bal.equals((Object)UFDouble.ZERO_DBL) && !occupationmny.equals((Object)UFDouble.ZERO_DBL)) continue;
                items = (ReceivableBillItemVO[])ArrayUtils.remove((Object[])items, (int)j);
                --j;
            }
            if (items.length == 0) {
                aggVOs = (AggReceivableBillVO[])ArrayUtils.remove((Object[])aggVOs, (int)i);
                --i;
                continue;
            }
            aggVOs[i].setChildrenVO((CircularlyAccessibleValueObject[])items);
            ArapBillPubUtil.processMoney((AggregatedValueObject)aggVOs[i]);
        }
        ArapBillPubUtil.refreshChildVO2HeadVO((AggregatedValueObject[])aggVOs);
        return aggVOs;
    }
}

