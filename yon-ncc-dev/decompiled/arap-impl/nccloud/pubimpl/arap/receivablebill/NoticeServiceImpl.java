/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.itf.arap.reminder.IArapNoticeService
 *  nc.md.data.access.NCObject
 *  nc.md.persist.framework.IMDPersistenceQueryService
 *  nc.md.persist.framework.IMDPersistenceService
 *  nc.vo.arap.reminder.AggArapNoticeVO
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.BusinessException
 *  nc.vo.pubapp.pattern.exception.ExceptionUtils
 *  nccloud.pubitf.arap.receivablebill.INoticeService
 */
package nccloud.pubimpl.arap.receivablebill;

import nc.bs.framework.common.NCLocator;
import nc.itf.arap.reminder.IArapNoticeService;
import nc.md.data.access.NCObject;
import nc.md.persist.framework.IMDPersistenceQueryService;
import nc.md.persist.framework.IMDPersistenceService;
import nc.vo.arap.reminder.AggArapNoticeVO;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nccloud.pubitf.arap.receivablebill.INoticeService;

public class NoticeServiceImpl
implements INoticeService {
    public AggArapNoticeVO insert(AggArapNoticeVO aggVo) throws BusinessException {
        aggVo.getParentVO().setStatus(2);
        IMDPersistenceService service1 = (IMDPersistenceService)NCLocator.getInstance().lookup(IMDPersistenceService.class);
        String pk = service1.saveBill((Object)aggVo);
        IMDPersistenceQueryService service2 = (IMDPersistenceQueryService)NCLocator.getInstance().lookup(IMDPersistenceQueryService.class);
        AggArapNoticeVO noticeVo = (AggArapNoticeVO)service2.queryBillOfVOByPK(AggArapNoticeVO.class, pk, false);
        return noticeVo;
    }

    public AggArapNoticeVO update(AggArapNoticeVO aggVo) throws BusinessException {
        aggVo.getParentVO().setStatus(1);
        IMDPersistenceService service2 = (IMDPersistenceService)NCLocator.getInstance().lookup(IMDPersistenceService.class);
        service2.saveBillWithRealDelete((Object)aggVo);
        aggVo.getParentVO().setPrimaryKey(aggVo.getParentVO().getPrimaryKey());
        return aggVo;
    }

    public void delete(String ... pk) throws BusinessException {
        IArapNoticeService queryService = (IArapNoticeService)NCLocator.getInstance().lookup(IArapNoticeService.class);
        AggArapNoticeVO[] aggvos = queryService.findBillByPrimaryKey(pk);
        if (aggvos.length == 1 && aggvos[0] == null || aggvos.length == 0) {
            ExceptionUtils.wrappBusinessException((String)NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0767"));
        }
        IMDPersistenceService deleteService = (IMDPersistenceService)NCLocator.getInstance().lookup(IMDPersistenceService.class);
        NCObject[] aggs = new NCObject[aggvos.length];
        int index = 0;
        for (AggArapNoticeVO o : aggvos) {
            aggs[index++] = NCObject.newInstance((Object)o);
        }
        deleteService.deleteBillFromDB(aggs);
    }
}

