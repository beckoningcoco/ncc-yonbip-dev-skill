/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.agiotage.AgiotageBO
 *  nc.bs.arap.agiotage.IBusiDataService
 *  nc.bs.arap.util.SqlUtils
 *  nc.bs.dao.BaseDAO
 *  nc.bs.dao.DAOException
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.logging.Logger
 *  nc.impl.arap.agiotage.BusiDataServiceImp
 *  nc.itf.arap.prv.IAgiotagePrivate
 *  nc.jdbc.framework.processor.ArrayListProcessor
 *  nc.jdbc.framework.processor.ResultSetProcessor
 *  nc.md.model.MetaDataException
 *  nc.md.persist.framework.MDPersistenceService
 *  nc.pubitf.arap.tally.ITallyService
 *  nc.vo.arap.agiotage.AggAgiotageVO
 *  nc.vo.arap.agiotage.AgiotageChildVO
 *  nc.vo.arap.agiotage.AgiotageMainVO
 *  nc.vo.arap.agiotage.AgiotageVO
 *  nc.vo.arap.agiotage.RemoteTransferVO
 *  nc.vo.arap.tally.BaseTallySourceVO
 *  nc.vo.arap.tally.BusiTypeEnum
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.SuperVO
 *  nccloud.commons.lang.ArrayUtils
 *  nccloud.pubitf.arap.openapi.IReceiveableAgiotageOpenService
 */
package nccloud.pubimpl.arap.openapi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import nc.bs.arap.agiotage.AgiotageBO;
import nc.bs.arap.agiotage.IBusiDataService;
import nc.bs.arap.util.SqlUtils;
import nc.bs.dao.BaseDAO;
import nc.bs.dao.DAOException;
import nc.bs.framework.common.NCLocator;
import nc.bs.logging.Logger;
import nc.impl.arap.agiotage.BusiDataServiceImp;
import nc.itf.arap.prv.IAgiotagePrivate;
import nc.jdbc.framework.processor.ArrayListProcessor;
import nc.jdbc.framework.processor.ResultSetProcessor;
import nc.md.model.MetaDataException;
import nc.md.persist.framework.MDPersistenceService;
import nc.pubitf.arap.tally.ITallyService;
import nc.vo.arap.agiotage.AggAgiotageVO;
import nc.vo.arap.agiotage.AgiotageChildVO;
import nc.vo.arap.agiotage.AgiotageMainVO;
import nc.vo.arap.agiotage.AgiotageVO;
import nc.vo.arap.agiotage.RemoteTransferVO;
import nc.vo.arap.tally.BaseTallySourceVO;
import nc.vo.arap.tally.BusiTypeEnum;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.SuperVO;
import nccloud.commons.lang.ArrayUtils;
import nccloud.pubitf.arap.openapi.IReceiveableAgiotageOpenService;

public class ReceiveableAgiotageOpenServiceImpl
implements IReceiveableAgiotageOpenService {
    public Map<String, String> CalculateAgiotage(AgiotageVO vo) throws BusinessException {
        RemoteTransferVO tranfervo = ((IAgiotagePrivate)NCLocator.getInstance().lookup(IAgiotagePrivate.class)).onCalculate(vo);
        Hashtable mainvo = tranfervo.getAgMainHash();
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("pk_org", vo.getPk_org());
        return map;
    }

    public Map<String, String> QueryAgiotageDetail(Map<String, String> conditionMap) throws BusinessException {
        return null;
    }

    public Map<String, String> QueryAgiotageSummary(Map<String, String> map) throws BusinessException {
        return null;
    }

    public void cancelAgiotage(String dealnoStr) throws MetaDataException, BusinessException, DAOException {
        ArrayList<String> agmPKList = new ArrayList<String>();
        ArrayList<AgiotageChildVO> detailvoList = new ArrayList<AgiotageChildVO>();
        ArrayList<AggAgiotageVO> aggVOList = new ArrayList<AggAgiotageVO>();
        ArrayList<BaseTallySourceVO> tallylist = new ArrayList<BaseTallySourceVO>();
        Object[] ncObjects = MDPersistenceService.lookupPersistenceQueryService().queryBillOfNCObjectByCond(AggAgiotageVO.class, dealnoStr, false);
        if (!ArrayUtils.isEmpty((Object[])ncObjects)) {
            for (Object ob : ncObjects) {
                AggAgiotageVO aggVo = (AggAgiotageVO)ob.getContainmentObject();
                String primaryKey = aggVo.getParentVO().getPrimaryKey();
                agmPKList.add(primaryKey);
                AgiotageChildVO[] childVOs = (AgiotageChildVO[])aggVo.getChildrenVO();
                if (childVOs == null) {
                    Logger.debug((Object)("\u5206\u5f55\u4e3a\u7a7a\uff0c\u4e3b\u952e\u4e3a" + primaryKey));
                    Collection result = new BaseDAO().retrieveByClause(AgiotageChildVO.class, "pk_agiotage='" + primaryKey + "'");
                    if (result != null && result.size() > 0) {
                        childVOs = result.toArray(new AgiotageChildVO[result.size()]);
                        aggVo.setChildrenVO((CircularlyAccessibleValueObject[])childVOs);
                    }
                }
                if (childVOs == null) {
                    Logger.debug((Object)("\u67e5\u4e0d\u51fa\u6765\uff0c\u5206\u5f55\u4e3a\u7a7a\uff0c\u4e3b\u952e\u4e3a" + primaryKey));
                }
                for (AgiotageChildVO childvo : childVOs) {
                    AgiotageChildVO tempvo = (AgiotageChildVO)childvo.clone();
                    tempvo.setGlobal_money_bal(childvo.getGlobal_money_bal().multiply(-1.0));
                    tempvo.setGroup_money_bal(childvo.getGroup_money_bal().multiply(-1.0));
                    tempvo.setGlobal_money_de(childvo.getGlobal_money_de().multiply(-1.0));
                    tempvo.setGlobal_money_cr(childvo.getGlobal_money_cr().multiply(-1.0));
                    tempvo.setGroup_money_cr(childvo.getGroup_money_cr().multiply(-1.0));
                    tempvo.setGroup_money_de(childvo.getGroup_money_de().multiply(-1.0));
                    tempvo.setLocal_money_bal(childvo.getLocal_money_bal().multiply(-1.0));
                    tempvo.setLocal_money_de(childvo.getLocal_money_de().multiply(-1.0));
                    tempvo.setLocal_money_cr(childvo.getLocal_money_cr().multiply(-1.0));
                    tempvo.setMoney_bal(childvo.getMoney_bal().multiply(-1.0));
                    detailvoList.add(tempvo);
                }
                tallylist.add(new BaseTallySourceVO((SuperVO)aggVo.getParentVO(), (SuperVO[])aggVo.getChildrenVO()));
                aggVOList.add(aggVo);
            }
        }
        String sqlByParentpk = SqlUtils.getInStr((String)"pk_agiotage", (String[])agmPKList.toArray(new String[0]));
        AggAgiotageVO[] aggArr = new AggAgiotageVO[aggVOList.size()];
        aggVOList.toArray(aggArr);
        BusiDataServiceImp.setDealDataLock((AggregatedValueObject[])aggArr);
        BusiDataServiceImp.checkBillsTs((AggregatedValueObject[])aggArr);
        new BaseDAO().deleteByClause(AgiotageChildVO.class, sqlByParentpk);
        new BaseDAO().deleteByClause(AgiotageMainVO.class, dealnoStr);
        ((IBusiDataService)NCLocator.getInstance().lookup(IBusiDataService.class)).cancelAgiotageData(detailvoList);
        ((ITallyService)NCLocator.getInstance().lookup(ITallyService.class)).agiotageTally(BusiTypeEnum.CANCEL_AGIO, tallylist);
        new AgiotageBO().sendMessageToFip(aggVOList, 1);
    }

    public String queryBzmcByBzpk(String bzpk) throws DAOException {
        BaseDAO baseDao = new BaseDAO();
        String bzmc = (String)baseDao.executeQuery("select name from bd_currtype where pk_currtype= '" + bzpk + "'", (ResultSetProcessor)new ArrayListProcessor());
        return bzmc;
    }
}

