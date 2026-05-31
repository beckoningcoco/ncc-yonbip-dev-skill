/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.actions.EstiPayableEditBatchBSActionSP
 *  nc.bs.arap.actions.EstiReceivableEditBatchBSActionSP
 *  nc.bs.arap.util.SqlUtils
 *  nc.bs.dao.BaseDAO
 *  nc.md.persist.framework.MDPersistenceService
 *  nc.vo.arap.agiotage.ArapBusiDataVO
 *  nc.vo.arap.basebill.BaseAggVO
 *  nc.vo.arap.basebill.BaseItemVO
 *  nc.vo.arap.estipayable.AggEstiPayableBillVO
 *  nc.vo.arap.estireceivable.AggEstiReceivableBillVO
 *  nc.vo.arap.termitem.TermVO
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.lang.UFDouble
 *  nc.vo.pubapp.pattern.pub.MapList
 *  nc.vo.pubapp.pattern.pub.MathTool
 */
package nc.bs.arap.put;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import nc.bs.arap.actions.EstiPayableEditBatchBSActionSP;
import nc.bs.arap.actions.EstiReceivableEditBatchBSActionSP;
import nc.bs.arap.util.SqlUtils;
import nc.bs.dao.BaseDAO;
import nc.md.persist.framework.MDPersistenceService;
import nc.vo.arap.agiotage.ArapBusiDataVO;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.arap.estipayable.AggEstiPayableBillVO;
import nc.vo.arap.estireceivable.AggEstiReceivableBillVO;
import nc.vo.arap.termitem.TermVO;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.pub.MapList;
import nc.vo.pubapp.pattern.pub.MathTool;

public class BillTools {
    public <T extends BaseAggVO> void reduceBalByItems(BaseItemVO[] itemvos, boolean isreceive) throws BusinessException {
        if (null == itemvos || itemvos.length == 0) {
            return;
        }
        HashMap<String, BaseItemVO> termUpdateMap = new HashMap<String, BaseItemVO>();
        ArrayList<String> pks = new ArrayList<String>();
        MapList map = new MapList();
        for (BaseItemVO item : itemvos) {
            if (!pks.contains(item.getParentPK())) {
                pks.add(item.getParentPK());
            }
            map.put((Object)item.getPrimaryKey(), (Object)item);
        }
        Collection vos = null;
        vos = isreceive ? MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByPKs(AggEstiReceivableBillVO.class, pks.toArray(new String[0]), false) : MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByPKs(AggEstiPayableBillVO.class, pks.toArray(new String[0]), false);
        if (null == vos || vos.size() == 0) {
            return;
        }
        ArrayList<BaseItemVO> rets = new ArrayList<BaseItemVO>();
        for (Object object : vos) {
            AggregatedValueObject bill = (AggregatedValueObject)object;
            for (CircularlyAccessibleValueObject item : bill.getChildrenVO()) {
                if (Integer.valueOf(1).equals(item.getAttributeValue("dr"))) continue;
                rets.add((BaseItemVO)item);
            }
            bill.setChildrenVO((CircularlyAccessibleValueObject[])rets.toArray(new BaseItemVO[0]));
            rets.clear();
        }
        String[] moneyFields = BaseItemVO.getMoneyFieldsBal((boolean)isreceive);
        for (BaseAggVO vo : vos) {
            for (CircularlyAccessibleValueObject item : vo.getChildrenVO()) {
                for (String field : moneyFields) {
                    if (null == map.get((Object)item.getPrimaryKey())) continue;
                    item.setStatus(1);
                    List list = map.get((Object)item.getPrimaryKey());
                    for (BaseItemVO it : list) {
                        item.setAttributeValue(field, (Object)MathTool.sub((UFDouble)((UFDouble)item.getAttributeValue(field)), (UFDouble)((UFDouble)it.getAttributeValue(field))));
                    }
                }
                termUpdateMap.put(item.getPrimaryKey(), (BaseItemVO)item);
            }
        }
        if (isreceive) {
            new EstiReceivableEditBatchBSActionSP().updateVOs((AggregatedValueObject[])vos.toArray(new AggEstiReceivableBillVO[0]));
        } else {
            new EstiPayableEditBatchBSActionSP().updateVOs((AggregatedValueObject[])vos.toArray(new AggEstiPayableBillVO[0]));
        }
        this.updateTermBal(termUpdateMap, isreceive);
    }

    public void updateTermBal(Map<String, BaseItemVO> termUpdateMap, boolean isreceive) {
        try {
            if (termUpdateMap == null || termUpdateMap.size() == 0) {
                return;
            }
            ArrayList<String> itempks = new ArrayList<String>();
            for (BaseItemVO vo : termUpdateMap.values()) {
                itempks.add(vo.getPrimaryKey());
            }
            BaseDAO baseDAO = new BaseDAO();
            Collection termvos = baseDAO.retrieveByClause(TermVO.class, SqlUtils.getInStr((String)"pk_item", (String[])itempks.toArray(new String[0])) + " order by pk_item,expiredate asc");
            String[] moneyFieldsBal = BaseItemVO.getMoneyFieldsBal((boolean)isreceive);
            String[] moneyFields = BaseItemVO.getMoneyFieldsForAddBal((boolean)isreceive);
            MapList tmap = new MapList();
            for (TermVO termvo : termvos) {
                tmap.put((Object)termvo.getPk_item(), (Object)termvo);
            }
            for (BaseItemVO vo : termUpdateMap.values()) {
                int i = 0;
                for (String balField : moneyFieldsBal) {
                    UFDouble moneyterm;
                    UFDouble bal = (UFDouble)vo.getAttributeValue(balField);
                    UFDouble money = (UFDouble)vo.getAttributeValue(moneyFields[i]);
                    String termMoneyField = moneyFields[i];
                    if ("groupcrebit".equals(termMoneyField)) {
                        termMoneyField = "groupcredit";
                    } else if ("globalcrebit".equals(termMoneyField)) {
                        termMoneyField = "globalcredit";
                    }
                    List list = tmap.get((Object)vo.getPrimaryKey());
                    if (list.size() == 1) {
                        for (TermVO termvo : list) {
                            termvo.setAttributeValue(balField, (Object)bal);
                        }
                    } else if (bal.compareTo((Object)UFDouble.ZERO_DBL) == 0) {
                        for (TermVO termvo : list) {
                            termvo.setAttributeValue(balField, (Object)UFDouble.ZERO_DBL);
                        }
                    } else if (money.multiply(bal).compareTo((Object)UFDouble.ZERO_DBL) < 0) {
                        for (TermVO termvo : list) {
                            termvo.setAttributeValue(balField, (Object)UFDouble.ZERO_DBL);
                        }
                        ((TermVO)list.get(0)).setAttributeValue(balField, (Object)bal);
                    } else if (money.abs().compareTo((Object)bal.abs()) < 0) {
                        for (TermVO termvo : list) {
                            moneyterm = (UFDouble)termvo.getAttributeValue(termMoneyField);
                            termvo.setAttributeValue(balField, (Object)moneyterm);
                            bal = bal.sub(moneyterm);
                        }
                        ((TermVO)list.get(0)).setAttributeValue(balField, (Object)((UFDouble)((TermVO)list.get(0)).getAttributeValue(balField)).add(bal));
                    } else {
                        for (TermVO termvo : list) {
                            moneyterm = (UFDouble)termvo.getAttributeValue(termMoneyField);
                            if (moneyterm.abs().compareTo((Object)bal.abs()) >= 0) {
                                termvo.setAttributeValue(balField, (Object)bal);
                                bal = UFDouble.ZERO_DBL;
                                continue;
                            }
                            termvo.setAttributeValue(balField, (Object)moneyterm);
                            bal = bal.sub(moneyterm);
                        }
                    }
                    ++i;
                }
            }
            baseDAO.updateVOArray((SuperVO[])termvos.toArray(new TermVO[0]), moneyFieldsBal);
            this.updateBusidataBal(itempks, termvos);
        }
        catch (Exception e) {
            ExceptionHandler.consume((Throwable)e);
        }
    }

    public void updateBusidataBal(List<String> itempks, Collection<TermVO> termvos) {
        String[] moneyFieldsBal = new String[]{"quantity_bal", "money_bal", "local_money_bal", "group_money_bal", "global_money_bal"};
        BaseDAO baseDAO = new BaseDAO();
        try {
            Collection busidatavos = baseDAO.retrieveByClause(ArapBusiDataVO.class, SqlUtils.getInStr((String)"pk_item", (String[])itempks.toArray(new String[0])) + " order by pk_item,expiredate asc");
            HashMap<String, TermVO> tmap = new HashMap<String, TermVO>();
            for (TermVO termvo : termvos) {
                tmap.put(termvo.getPk_termitem(), termvo);
            }
            for (ArapBusiDataVO vo : busidatavos) {
                vo.setQuantity_bal(((TermVO)tmap.get(vo.getPk_termitem())).getQuantity_bal());
                vo.setMoney_bal(((TermVO)tmap.get(vo.getPk_termitem())).getMoney_bal());
                vo.setLocal_money_bal(((TermVO)tmap.get(vo.getPk_termitem())).getLocal_money_bal());
                vo.setGroup_money_bal(((TermVO)tmap.get(vo.getPk_termitem())).getGroupbalance());
                vo.setGlobal_money_bal(((TermVO)tmap.get(vo.getPk_termitem())).getGlobalbalance());
            }
            baseDAO.updateVOArray((SuperVO[])busidatavos.toArray(new ArapBusiDataVO[0]), moneyFieldsBal);
        }
        catch (BusinessException e) {
            ExceptionHandler.consume((Throwable)e);
        }
    }

    public <T extends BaseAggVO> void addBalByItems(BaseItemVO[] itemvos, boolean isreceive) throws BusinessException {
        if (null == itemvos || itemvos.length == 0) {
            return;
        }
        HashMap<String, BaseItemVO> termUpdateMap = new HashMap<String, BaseItemVO>();
        ArrayList<String> pks = new ArrayList<String>();
        MapList map = new MapList();
        for (BaseItemVO item : itemvos) {
            if (!pks.contains(item.getTop_billid())) {
                pks.add(item.getTop_billid());
            }
            map.put((Object)item.getTop_itemid(), (Object)item);
        }
        Collection vos = null;
        vos = isreceive ? MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByPKs(AggEstiReceivableBillVO.class, pks.toArray(new String[0]), false) : MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByPKs(AggEstiPayableBillVO.class, pks.toArray(new String[0]), false);
        if (null == vos || vos.size() == 0) {
            return;
        }
        ArrayList<BaseItemVO> rets = new ArrayList<BaseItemVO>();
        for (Object object : vos) {
            AggregatedValueObject bill = (AggregatedValueObject)object;
            for (CircularlyAccessibleValueObject item : bill.getChildrenVO()) {
                if (Integer.valueOf(1).equals(item.getAttributeValue("dr"))) continue;
                rets.add((BaseItemVO)item);
            }
            bill.setChildrenVO((CircularlyAccessibleValueObject[])rets.toArray(new BaseItemVO[0]));
            rets.clear();
        }
        String[] moneyFields = BaseItemVO.getMoneyFieldsBal((boolean)isreceive);
        String[] moneyFieldsBal = BaseItemVO.getMoneyFieldsForAddBal((boolean)isreceive);
        for (BaseAggVO vo : vos) {
            for (CircularlyAccessibleValueObject item : vo.getChildrenVO()) {
                for (int i = 0; i < moneyFields.length; ++i) {
                    if (null == map.get((Object)item.getPrimaryKey())) continue;
                    item.setStatus(1);
                    List list = map.get((Object)item.getPrimaryKey());
                    for (BaseItemVO it : list) {
                        item.setAttributeValue(moneyFields[i], (Object)MathTool.sub((UFDouble)((UFDouble)item.getAttributeValue(moneyFields[i])), (UFDouble)((UFDouble)it.getAttributeValue(moneyFieldsBal[i]))));
                    }
                }
                termUpdateMap.put(item.getPrimaryKey(), (BaseItemVO)item);
            }
        }
        if (isreceive) {
            new EstiReceivableEditBatchBSActionSP().updateVOs((AggregatedValueObject[])vos.toArray(new AggEstiReceivableBillVO[0]));
        } else {
            new EstiPayableEditBatchBSActionSP().updateVOs((AggregatedValueObject[])vos.toArray(new AggEstiPayableBillVO[0]));
        }
        this.updateTermBal(termUpdateMap, isreceive);
    }
}

