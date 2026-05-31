/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.itf.arap.reminder.IArapNoticeService
 *  nc.ui.querytemplate.querytree.IQueryScheme
 *  nc.vo.arap.reminder.AggArapNoticeVO
 *  nc.vo.arap.reminder.ArapNoticeVO
 *  nc.vo.pub.BusinessException
 *  nc.vo.pubapp.pagination.PaginationQueryVO
 *  nccloud.pubitf.arap.receivablebill.IQueryNoticeService
 */
package nccloud.pubimpl.arap.receivablebill;

import java.util.ArrayList;
import java.util.Map;
import nc.bs.framework.common.NCLocator;
import nc.itf.arap.reminder.IArapNoticeService;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.arap.reminder.AggArapNoticeVO;
import nc.vo.arap.reminder.ArapNoticeVO;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pagination.PaginationQueryVO;
import nccloud.pubitf.arap.receivablebill.IQueryNoticeService;

public class QueryNoticeServiceImpl
implements IQueryNoticeService {
    public ArapNoticeVO[] getHeadVos(IQueryScheme scheme) throws BusinessException {
        if (scheme == null) {
            IArapNoticeService service = (IArapNoticeService)NCLocator.getInstance().lookup(IArapNoticeService.class);
            PaginationQueryVO paginationQueryVO = service.queryPaginationQueryVO(null, Integer.valueOf(100));
            Map billmap = paginationQueryVO.getBillmap();
            ArrayList<ArapNoticeVO> list = new ArrayList<ArapNoticeVO>();
            for (Map.Entry entry : billmap.entrySet()) {
                AggArapNoticeVO aggvo = (AggArapNoticeVO)entry.getValue();
                list.add(aggvo.getHeadVO());
            }
            return list.toArray(new ArapNoticeVO[list.size()]);
        }
        IArapNoticeService service = (IArapNoticeService)NCLocator.getInstance().lookup(IArapNoticeService.class);
        AggArapNoticeVO[] vos = service.queryByScheme(scheme);
        ArrayList<ArapNoticeVO> list = new ArrayList<ArapNoticeVO>();
        for (AggArapNoticeVO aggvo : vos) {
            list.add(aggvo.getHeadVO());
        }
        return list.toArray(new ArapNoticeVO[list.size()]);
    }

    public AggArapNoticeVO getaggvos(String pk) throws BusinessException {
        return null;
    }

    public AggArapNoticeVO[] getBillByPks(String[] pks) throws BusinessException {
        IArapNoticeService service = (IArapNoticeService)NCLocator.getInstance().lookup(IArapNoticeService.class);
        AggArapNoticeVO[] aggArapNoticeVOs = service.findBillByPrimaryKey(pks);
        return aggArapNoticeVOs;
    }
}

