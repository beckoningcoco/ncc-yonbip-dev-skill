/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.logging.Logger
 *  nc.impl.pubapp.pattern.data.vo.VOQuery
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.SuperVO
 *  nc.vo.pubapp.pattern.pub.MapList
 */
package nc.bs.arap.util;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import nc.bs.arap.util.SqlUtils;
import nc.bs.logging.Logger;
import nc.impl.pubapp.pattern.data.vo.VOQuery;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.arap.basebill.IArapItemFieldVO;
import nc.vo.arap.pub.ArapBillTypeInfo;
import nc.vo.arap.pub.IArapBilltypeInfo;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.SuperVO;
import nc.vo.pubapp.pattern.pub.MapList;

public class BillRetiveInfoUtils {
    public void retryInfos(AggregatedValueObject[] bills) throws BusinessException {
        HashMap<String, AggregatedValueObject> map = new HashMap<String, AggregatedValueObject>();
        for (AggregatedValueObject bill : bills) {
            map.put(bill.getParentVO().getPrimaryKey(), bill);
        }
        BaseBillVO[] newVOs = BillRetiveInfoUtils.query(bills, map.keySet().toArray(new String[0]));
        Map<String, BaseItemVO> itemMap = BillRetiveInfoUtils.query2(bills, map.keySet().toArray(new String[0]));
        for (BaseBillVO vo : newVOs) {
            BaseAggVO bill = (BaseAggVO)((Object)map.get(vo.getPrimaryKey()));
            bill.getHeadVO().setBillstatus(vo.getBillstatus());
            bill.getHeadVO().setSignuser(vo.getSignuser());
            bill.getHeadVO().setSigndate(vo.getSigndate());
            bill.getHeadVO().setEffectdate(vo.getEffectdate());
            bill.getHeadVO().setEffectstatus(vo.getEffectstatus());
            bill.getHeadVO().setEffectuser(vo.getEffectuser());
            bill.getHeadVO().setTs(vo.getTs());
            bill.getHeadVO().setDr(vo.getDr());
            for (BaseItemVO item : bill.getItems()) {
                item.setTs(vo.getTs());
                BaseItemVO newItemVO = itemMap.get(item.getPrimaryKey());
                item.setDr(newItemVO.getDr());
                item.setMoney_bal(newItemVO.getMoney_bal());
                item.setLocal_money_bal(newItemVO.getLocal_money_bal());
                item.setQuantity_bal(newItemVO.getQuantity_bal());
                item.setOccupationmny(newItemVO.getOccupationmny());
                item.setGroupbalance(newItemVO.getGroupbalance());
                item.setGlobalbalance(newItemVO.getGlobalbalance());
                item.setConfernum(newItemVO.getConfernum());
            }
        }
    }

    public static void cleanInfoForCleanVOsApprove(AggregatedValueObject[] aggs) throws BusinessException {
        for (AggregatedValueObject vo : aggs) {
            BaseAggVO bill = (BaseAggVO)vo;
            if (!bill.isNeedFixInfo() || bill.getLoadRelationItemValue() == null || !bill.getLoadRelationItemValue().booleanValue()) continue;
            BaseBillVO headVO = bill.getHeadVO();
            BaseItemVO[] items = bill.getItems();
            List<String> loadRelationItems = bill.getLoadRelationItems();
            for (String field : headVO.getAttributeNames()) {
                if (loadRelationItems.contains(field) || field.equals(headVO.getPKFieldName())) continue;
                headVO.setAttributeValue(field, null);
            }
            for (BaseItemVO body : items) {
                for (String field : body.getAttributeNames()) {
                    if (loadRelationItems.contains(field) || field.equals(body.getPKFieldName())) continue;
                    body.setAttributeValue(field, null);
                }
            }
        }
    }

    public static void fixInfoForCleanVOsApprove(AggregatedValueObject[] bills) throws BusinessException {
        BaseBillVO[] newVOs;
        HashMap<String, AggregatedValueObject> keyMap = new HashMap<String, AggregatedValueObject>();
        HashMap<String, BaseBillVO> mapQuery = new HashMap<String, BaseBillVO>();
        for (AggregatedValueObject bill : bills) {
            if (!((BaseAggVO)bill).isNeedFixInfo()) {
                return;
            }
            keyMap.put(bill.getParentVO().getPrimaryKey(), bill);
        }
        IArapBilltypeInfo info = ArapBillTypeInfo.getInstance((Object)((BaseAggVO)bills[0]));
        String tablePrimaryKeyBill = info.getTablePrimaryKeyBill();
        String tablePrimaryKeyItem = info.getTablePrimaryKeyItem();
        Class<BaseItemVO> itemvoClass = info.getItemvoClass();
        for (BaseBillVO newvo : newVOs = BillRetiveInfoUtils.query(bills, keyMap.keySet().toArray(new String[0]), tablePrimaryKeyBill, null)) {
            mapQuery.put(newvo.getPrimaryKey(), newvo);
        }
        Map<String, BaseItemVO> itemMap = BillRetiveInfoUtils.query2(bills, keyMap.keySet().toArray(new String[0]), tablePrimaryKeyItem, tablePrimaryKeyBill, itemvoClass, null);
        MapList itemMaps = new MapList();
        for (BaseItemVO item : itemMap.values()) {
            itemMaps.put((Object)item.getParentPK(), (Object)item);
        }
        for (AggregatedValueObject bill : bills) {
            String primaryKey = bill.getParentVO().getPrimaryKey();
            BaseBillVO baseBillVO = (BaseBillVO)mapQuery.get(primaryKey);
            baseBillVO.setApprover(((BaseAggVO)((Object)keyMap.get(primaryKey))).getHeadVO().getApprover());
            baseBillVO.setApprovedate(((BaseAggVO)((Object)keyMap.get(primaryKey))).getHeadVO().getApprovedate());
            baseBillVO.setApprovestatus(((BaseAggVO)((Object)keyMap.get(primaryKey))).getHeadVO().getApprovestatus());
            baseBillVO.setAuthAccount(((BaseAggVO)((Object)keyMap.get(primaryKey))).getHeadVO().isAuthAccount());
            bill.setParentVO((CircularlyAccessibleValueObject)baseBillVO);
            bill.setChildrenVO((CircularlyAccessibleValueObject[])itemMaps.get((Object)primaryKey).toArray(new BaseItemVO[0]));
        }
    }

    private static BaseBillVO[] query(AggregatedValueObject[] bills, String[] pks) {
        String pkFieldName = ((SuperVO)bills[0].getParentVO()).getPKFieldName();
        String[] fields = new String[]{pkFieldName, "billstatus", "signuser", "effectdate", "effectstatus", "effectuser", "signdate", "ts"};
        return BillRetiveInfoUtils.query(bills, pks, pkFieldName, fields);
    }

    private static Map<String, BaseItemVO> query2(AggregatedValueObject[] bills, String[] pks) {
        Class<BaseItemVO> class1 = null;
        String pkFieldName = null;
        String parentPKFieldName = null;
        if (bills[0].getChildrenVO().length == 0) {
            class1 = bills[0].getChildrenVO().getClass().getComponentType();
            try {
                BaseItemVO baseItemVO = (BaseItemVO)class1.newInstance();
                pkFieldName = baseItemVO.getPKFieldName();
                parentPKFieldName = baseItemVO.getParentPKFieldName();
            }
            catch (Exception e) {
                Logger.error((Object)e.getMessage(), (Throwable)e);
            }
        } else {
            class1 = bills[0].getChildrenVO()[0].getClass();
            pkFieldName = ((SuperVO)bills[0].getChildrenVO()[0]).getPKFieldName();
            parentPKFieldName = ((IArapItemFieldVO)bills[0].getChildrenVO()[0]).getParentPKFieldName();
        }
        String[] fields = new String[]{pkFieldName, parentPKFieldName, "money_bal", "quantity_bal", "local_money_bal", "groupbalance", "globalbalance", "occupationmny", "confernum", "ts"};
        return BillRetiveInfoUtils.query2(bills, pks, pkFieldName, parentPKFieldName, class1, fields);
    }

    private static BaseBillVO[] query(AggregatedValueObject[] bills, String[] pks, String pkFieldName, String[] fields) {
        VOQuery qry;
        try {
            qry = fields != null ? new VOQuery(bills[0].getParentVO().getClass(), fields) : new VOQuery(bills[0].getParentVO().getClass());
        }
        catch (Exception e) {
            fields = new String[]{pkFieldName, "billstatus", "effectdate", "effectstatus", "effectuser", "ts"};
            qry = new VOQuery(bills[0].getParentVO().getClass(), fields);
        }
        BaseBillVO[] newVOs = (BaseBillVO[])qry.query(pks);
        return newVOs;
    }

    private static Map<String, BaseItemVO> query2(AggregatedValueObject[] bills, String[] pks, String pkFieldName, String parentPKFieldName, Class<BaseItemVO> class1, String[] fields) {
        VOQuery qry;
        try {
            qry = fields != null ? new VOQuery(class1, fields) : new VOQuery(class1);
        }
        catch (Exception e1) {
            fields = new String[]{pkFieldName, parentPKFieldName, "money_bal", "quantity_bal", "local_money_bal", "groupbalance", "globalbalance", "ts"};
            qry = new VOQuery(class1, fields);
        }
        HashMap<String, BaseItemVO> map = new HashMap<String, BaseItemVO>();
        try {
            BaseItemVO[] itemVOs;
            for (BaseItemVO vo : itemVOs = (BaseItemVO[])qry.query(" and " + SqlUtils.getInStr(parentPKFieldName, pks, true), null)) {
                map.put(vo.getPrimaryKey(), vo);
            }
        }
        catch (SQLException e) {
            ExceptionHandler.handleRuntimeException((Exception)e);
        }
        return map;
    }
}

