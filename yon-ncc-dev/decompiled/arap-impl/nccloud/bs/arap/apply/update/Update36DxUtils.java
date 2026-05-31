/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.paybp.PayBillDAO
 *  nc.bs.framework.common.NCLocator
 *  nc.ps.paybill.PayBillOpEnum
 *  nc.pub.cmp.apply.ApplyOpEnum
 *  nc.pubitf.cmp.apply.IApplyPubService
 *  nc.pubitf.ps.IPlanPubService
 *  nc.vo.arap.basebill.BaseAggVO
 *  nc.vo.arap.basebill.BaseBillVO
 *  nc.vo.arap.basebill.BaseItemVO
 *  nc.vo.arap.pay.AggPayBillVO
 *  nc.vo.arap.utils.ARAPModuleEnableUtil
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pub.lang.UFDouble
 *  nccloud.bs.arap.sagas.util.SagasUtils
 *  org.apache.commons.lang3.ArrayUtils
 *  org.apache.commons.lang3.StringUtils
 */
package nccloud.bs.arap.apply.update;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import nc.bs.arap.paybp.PayBillDAO;
import nc.bs.framework.common.NCLocator;
import nc.ps.paybill.PayBillOpEnum;
import nc.pub.cmp.apply.ApplyOpEnum;
import nc.pubitf.cmp.apply.IApplyPubService;
import nc.pubitf.ps.IPlanPubService;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.arap.pay.AggPayBillVO;
import nc.vo.arap.utils.ARAPModuleEnableUtil;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDouble;
import nccloud.bs.arap.sagas.util.SagasUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

public class Update36DxUtils {
    private static final String CMP36D1 = "36D1";
    private static final String CMP36D7 = "36D7";
    private static final String MONEYMAP = "moneymap";
    private static final String REDMAP = "redmap";
    private static final String ORGINMAP = "orginmap";

    public void do36Dx(Map<String, AggregatedValueObject[]> map, String eventType) throws BusinessException {
        if (SagasUtils.isCompensateStage() || !"1001".equals(eventType) && !"200604".equals(eventType) && !"200605".equals(eventType) && !"1006".equals(eventType) && !"1003".equals(eventType)) {
            return;
        }
        AggregatedValueObject[] bills = map.get("new");
        AggregatedValueObject[] oldbills = map.get("old");
        boolean isCmpEnable = ARAPModuleEnableUtil.isCMPEnable((String)((String)bills[0].getParentVO().getAttributeValue("pk_group")));
        boolean isPSEnable = ARAPModuleEnableUtil.isPSEnable((String)((String)bills[0].getParentVO().getAttributeValue("pk_group")));
        if (isCmpEnable) {
            ApplyOpEnum add = null;
            if ("1001".equals(eventType)) {
                add = ApplyOpEnum.add;
            } else if ("200604".equals(eventType)) {
                add = ApplyOpEnum.approve;
            } else if ("200605".equals(eventType)) {
                add = ApplyOpEnum.unapprove;
            } else if ("1006".equals(eventType)) {
                add = ApplyOpEnum.delete;
            } else if ("1003".equals(eventType)) {
                add = ApplyOpEnum.update;
            }
            if (add != null) {
                this.do36D1(add, bills, oldbills);
            }
        }
        if (isPSEnable) {
            PayBillOpEnum add2 = null;
            if ("1001".equals(eventType)) {
                add2 = PayBillOpEnum.add;
            } else if ("200604".equals(eventType)) {
                add2 = PayBillOpEnum.approve;
            } else if ("200605".equals(eventType)) {
                add2 = PayBillOpEnum.unapprove;
            } else if ("1006".equals(eventType)) {
                add2 = PayBillOpEnum.delete;
            } else if ("1003".equals(eventType)) {
                add2 = PayBillOpEnum.update;
            }
            if (add2 != null) {
                this.do36D7(add2, bills, oldbills);
            }
        }
    }

    public Object[] get36D1Moneymap(ApplyOpEnum add, AggregatedValueObject[] bills, AggregatedValueObject[] oldbills) throws BusinessException {
        ArrayList<String> F3itemsList = new ArrayList<String>();
        HashMap<String, UFDouble> moneyMap = new HashMap<String, UFDouble>();
        HashMap<String, UFDouble> redMap = new HashMap<String, UFDouble>();
        HashMap<String, UFDouble> orginMap = new HashMap<String, UFDouble>();
        this.getMoneyMap(bills, F3itemsList, moneyMap, redMap, CMP36D1, add, null);
        try {
            AggPayBillVO[] vos = new PayBillDAO().queryBillsBySourceRowIDs(F3itemsList.toArray(new String[0]), (String)bills[0].getParentVO().getAttributeValue("pk_org"));
            this.getMoneyMap((AggregatedValueObject[])vos, F3itemsList, moneyMap, redMap, CMP36D1, add, null);
            this.getMoneyMap(bills, oldbills, orginMap, CMP36D1, add, null);
        }
        catch (Exception e) {
            ExceptionHandler.handleException((Exception)e);
        }
        Object[] objs = new Object[]{moneyMap, redMap, orginMap};
        return objs;
    }

    public void do36D1(ApplyOpEnum add, AggregatedValueObject[] bills, AggregatedValueObject[] oldbills) throws BusinessException {
        Object[] objs = this.get36D1Moneymap(add, bills, oldbills);
        Map moneyMap = (Map)objs[0];
        Map redMap = (Map)objs[1];
        Map orginMap = (Map)objs[2];
        if (add.equals((Object)ApplyOpEnum.update) || add.equals((Object)ApplyOpEnum.settle) || add.equals((Object)ApplyOpEnum.unsettle)) {
            if (orginMap.size() != 0) {
                ((IApplyPubService)NCLocator.getInstance().lookup(IApplyPubService.class)).updateApplyMoney(orginMap, add);
            }
        } else if (moneyMap.size() != 0) {
            if (redMap.size() > 0) {
                if (add.equals((Object)ApplyOpEnum.add)) {
                    add = ApplyOpEnum.REDBACK;
                }
                ((IApplyPubService)NCLocator.getInstance().lookup(IApplyPubService.class)).updateApplyMoney(moneyMap, add);
            } else {
                ((IApplyPubService)NCLocator.getInstance().lookup(IApplyPubService.class)).updateApplyMoney(moneyMap, add);
            }
        }
    }

    private void getMoneyMap(AggregatedValueObject[] bills, AggregatedValueObject[] oldbills, Map<String, UFDouble> orginMap, String pk_billtype, ApplyOpEnum app, PayBillOpEnum ppp) throws Exception {
        boolean isRedBack;
        if (ArrayUtils.isEmpty((Object[])bills) || ArrayUtils.isEmpty((Object[])oldbills)) {
            return;
        }
        AggPayBillVO[] newvos = null;
        boolean bl = isRedBack = "F3".equals(bills[0].getChildrenVO()[0].getAttributeValue("top_billtype"));
        if (isRedBack) {
            newvos = this.getSrcBlueVOs(bills);
        }
        Map<String, UFDouble> newMap = this.getMap(bills, (AggregatedValueObject[])newvos, pk_billtype, app, ppp);
        Map<String, UFDouble> oldMap = this.getMap(oldbills, (AggregatedValueObject[])newvos, pk_billtype, app, ppp);
        if (newMap.size() != oldMap.size()) {
            for (Map.Entry<String, UFDouble> entry : oldMap.entrySet()) {
                UFDouble retMoney = newMap.get(entry.getKey());
                if (retMoney != null) continue;
                newMap.put(entry.getKey(), UFDouble.ZERO_DBL);
            }
        }
        for (Map.Entry<String, UFDouble> set : newMap.entrySet()) {
            for (Map.Entry<String, UFDouble> set2 : oldMap.entrySet()) {
                if (!set.getKey().equals(set2.getKey())) continue;
                UFDouble newvalue = set.getValue();
                UFDouble oldvalue = set2.getValue();
                orginMap.put(set.getKey(), newvalue.sub(oldvalue));
            }
        }
    }

    private AggPayBillVO[] getSrcBlueVOs(AggregatedValueObject[] bills) throws Exception {
        if (ArrayUtils.isEmpty((Object[])bills)) {
            return new AggPayBillVO[0];
        }
        HashMap<String, List> parmMap = new HashMap<String, List>();
        for (AggregatedValueObject vo : bills) {
            String topbilltype = (String)vo.getChildrenVO()[0].getAttributeValue("top_billtype");
            if (!"F3".equals(topbilltype)) continue;
            CircularlyAccessibleValueObject[] childrenVO = vo.getChildrenVO();
            ArrayList<String> pkList = new ArrayList<String>();
            String pk_org = (String)vo.getParentVO().getAttributeValue("pk_org");
            for (CircularlyAccessibleValueObject cvo : childrenVO) {
                pkList.add((String)cvo.getAttributeValue("top_itemid"));
            }
            if (parmMap.get(pk_org) == null) {
                parmMap.put(pk_org, pkList);
                continue;
            }
            List list = (List)parmMap.get(pk_org);
            list.addAll(pkList);
            parmMap.put(pk_org, list);
        }
        if (parmMap.size() > 0 && parmMap.size() > 1) {
            ArrayList<AggPayBillVO[]> voList = new ArrayList<AggPayBillVO[]>();
            for (Map.Entry parm : parmMap.entrySet()) {
                String pk_org = (String)parm.getKey();
                AggPayBillVO[] vos = new PayBillDAO().queryBillsBySourceRowIDs(((List)parm.getValue()).toArray(new String[0]), pk_org);
                voList.add(vos);
            }
            return voList.toArray(new AggPayBillVO[0]);
        }
        if (parmMap.size() > 0 && parmMap.size() == 1) {
            String pk_org = (String)bills[0].getParentVO().getAttributeValue("pk_org");
            AggPayBillVO[] vos = new PayBillDAO().queryBillsBySourceRowIDs(((List)parmMap.get(pk_org)).toArray(new String[0]), pk_org);
            return vos == null ? new AggPayBillVO[]{} : vos;
        }
        return new AggPayBillVO[0];
    }

    private Map<String, UFDouble> getMap(AggregatedValueObject[] aggvos, AggregatedValueObject[] srcaggvos, String pk_billtype, ApplyOpEnum app, PayBillOpEnum ppp) {
        HashMap<String, UFDouble> oldMoneyMap = new HashMap<String, UFDouble>();
        for (AggregatedValueObject destVo : aggvos) {
            BaseAggVO aggvo = (BaseAggVO)destVo;
            BaseBillVO vo = aggvo.getHeadVO();
            String billclass = vo.getBillclass();
            if (!billclass.equals("fk")) continue;
            for (int i = 0; i < aggvo.getItems().length; ++i) {
                String topBilltype = aggvo.getItems()[i].getTop_billtype();
                if ((app != null && (app.equals((Object)ApplyOpEnum.approve) || app.equals((Object)ApplyOpEnum.unapprove)) || ppp != null && (ppp.equals((Object)PayBillOpEnum.approve) || ppp.equals((Object)PayBillOpEnum.unapprove))) && aggvo.getItems()[i].getIsdiscount() == null || (app != null && (app.equals((Object)ApplyOpEnum.settle) || app.equals((Object)ApplyOpEnum.unsettle)) || ppp != null && (ppp.equals((Object)PayBillOpEnum.settle) || ppp.equals((Object)PayBillOpEnum.unsettle))) && aggvo.getItems()[i].getIsdiscount() != null && UFBoolean.TRUE.equals((Object)aggvo.getItems()[i].getIsdiscount()) || aggvo.getItems()[i].getTop_itemid() == null || !pk_billtype.equals(topBilltype) && !"F3".equals(topBilltype)) continue;
                String key = aggvo.getItems()[i].getTop_itemid();
                UFDouble money2 = aggvo.getItems()[i].getMoney_de();
                if (oldMoneyMap.containsKey(key)) {
                    UFDouble money = (UFDouble)oldMoneyMap.get(key);
                    oldMoneyMap.put(key, money.add(money2));
                    continue;
                }
                oldMoneyMap.put(key, money2);
            }
        }
        if (ArrayUtils.isNotEmpty((Object[])srcaggvos)) {
            HashMap<String, UFDouble> moneyMap = new HashMap<String, UFDouble>();
            for (AggregatedValueObject destVo : srcaggvos) {
                BaseAggVO aggvo = (BaseAggVO)destVo;
                for (int i = 0; i < aggvo.getItems().length; ++i) {
                    String top_billtype = aggvo.getItems()[i].getTop_billtype();
                    if (!CMP36D1.equals(top_billtype) && !CMP36D7.equals(top_billtype)) continue;
                    String pkfield = aggvo.getItems()[i].getPKFieldName();
                    UFDouble money = (UFDouble)oldMoneyMap.get(aggvo.getItems()[i].getAttributeValue(pkfield));
                    String key = aggvo.getItems()[i].getTop_itemid();
                    moneyMap.put(key, money);
                }
            }
            return moneyMap;
        }
        return oldMoneyMap;
    }

    public void do36D7(PayBillOpEnum add, AggregatedValueObject[] bills, AggregatedValueObject[] oldbills) throws BusinessException {
        ArrayList<String> F3itemsList = new ArrayList<String>();
        HashMap<String, UFDouble> moneyMap = new HashMap<String, UFDouble>();
        HashMap<String, UFDouble> redMap = new HashMap<String, UFDouble>();
        HashMap<String, UFDouble> orginMap = new HashMap<String, UFDouble>();
        this.getMoneyMap(bills, F3itemsList, moneyMap, redMap, CMP36D7, null, add);
        try {
            AggPayBillVO[] vos = new PayBillDAO().queryBillsBySourceRowIDs(F3itemsList.toArray(new String[0]), (String)bills[0].getParentVO().getAttributeValue("pk_org"));
            this.getMoneyMap((AggregatedValueObject[])vos, F3itemsList, moneyMap, redMap, CMP36D7, null, add);
            this.getMoneyMap(bills, oldbills, orginMap, CMP36D7, null, add);
        }
        catch (Exception e) {
            ExceptionHandler.handleException((Exception)e);
        }
        if (PayBillOpEnum.update == add || add.equals((Object)PayBillOpEnum.settle) || add.equals((Object)PayBillOpEnum.unsettle)) {
            ((IPlanPubService)NCLocator.getInstance().lookup(IPlanPubService.class)).updateApplyPlanMoney(orginMap, add);
        } else if (PayBillOpEnum.add == add && redMap.size() > 0) {
            add = PayBillOpEnum.REDBACK;
            ((IPlanPubService)NCLocator.getInstance().lookup(IPlanPubService.class)).updateApplyPlanMoney(moneyMap, add);
        } else if (moneyMap.size() != 0) {
            ((IPlanPubService)NCLocator.getInstance().lookup(IPlanPubService.class)).updateApplyPlanMoney(moneyMap, add);
        }
    }

    private void getMoneyMap(AggregatedValueObject[] bills, List<String> F3itemsList, Map<String, UFDouble> moneyMap, Map<String, UFDouble> redMap, String pk_billtype, ApplyOpEnum app, PayBillOpEnum ppp) {
        if (ArrayUtils.isEmpty((Object[])bills)) {
            return;
        }
        for (AggregatedValueObject destVo : bills) {
            BaseAggVO aggvo = (BaseAggVO)destVo;
            BaseBillVO vo = aggvo.getHeadVO();
            String billclass = vo.getBillclass();
            if (!billclass.equals("fk")) continue;
            for (BaseItemVO item : aggvo.getItems()) {
                String topBilltype = item.getTop_billtype();
                if ((app != null && (app.equals((Object)ApplyOpEnum.approve) || app.equals((Object)ApplyOpEnum.unapprove)) || ppp != null && (ppp.equals((Object)PayBillOpEnum.approve) || ppp.equals((Object)PayBillOpEnum.unapprove))) && item.getIsdiscount() == null || (app != null && (app.equals((Object)ApplyOpEnum.settle) || app.equals((Object)ApplyOpEnum.unsettle)) || ppp != null && (ppp.equals((Object)PayBillOpEnum.settle) || ppp.equals((Object)PayBillOpEnum.unsettle))) && item.getIsdiscount() != null && UFBoolean.TRUE.equals((Object)item.getIsdiscount()) || item.getTop_itemid() == null) continue;
                if (pk_billtype.equals(topBilltype)) {
                    String key = item.getTop_itemid();
                    if ((ApplyOpEnum.add.equals((Object)app) || PayBillOpEnum.add.equals((Object)ppp)) && pk_billtype != null && (pk_billtype.equals(CMP36D1) || pk_billtype.equals(CMP36D7)) && redMap != null && redMap.size() == 0) {
                        String ts;
                        String string = ts = item.getTop_changeitemts() == null ? null : item.getTop_changeitemts().toString();
                        if (!StringUtils.isEmpty((CharSequence)ts)) {
                            key = key + "###" + ts;
                        }
                    }
                    UFDouble money2 = item.getMoney_de();
                    if (redMap.containsKey(item.getPrimaryKey())) {
                        money2 = redMap.get(item.getPrimaryKey());
                    }
                    if (redMap.size() == 0 || F3itemsList.contains(item.getPrimaryKey())) {
                        if (moneyMap.containsKey(key)) {
                            UFDouble money = moneyMap.get(key);
                            moneyMap.put(key, money.add(money2));
                        } else {
                            moneyMap.put(key, money2);
                        }
                    }
                }
                if (!"F3".equals(topBilltype)) continue;
                F3itemsList.add(item.getTop_itemid());
                redMap.put(item.getTop_itemid(), item.getMoney_de());
            }
        }
    }

    public Map<String, UFDouble> get36D7Moneymap(PayBillOpEnum add, AggregatedValueObject[] bills, AggregatedValueObject[] oldbills) throws BusinessException {
        ArrayList<String> F3itemsList = new ArrayList<String>();
        HashMap<String, UFDouble> moneyMap = new HashMap<String, UFDouble>();
        HashMap<String, UFDouble> redMap = new HashMap<String, UFDouble>();
        HashMap<String, UFDouble> orginMap = new HashMap<String, UFDouble>();
        this.getMoneyMap(bills, F3itemsList, moneyMap, redMap, CMP36D7, null, add);
        try {
            AggPayBillVO[] vos = new PayBillDAO().queryBillsBySourceRowIDs(F3itemsList.toArray(new String[0]), (String)bills[0].getParentVO().getAttributeValue("pk_org"));
            this.getMoneyMap((AggregatedValueObject[])vos, F3itemsList, moneyMap, redMap, CMP36D7, null, add);
            this.getMoneyMap(bills, oldbills, orginMap, CMP36D7, null, add);
        }
        catch (Exception e) {
            ExceptionHandler.handleException((Exception)e);
        }
        if (PayBillOpEnum.update == add || add.equals((Object)PayBillOpEnum.settle) || add.equals((Object)PayBillOpEnum.unsettle)) {
            return orginMap;
        }
        if (redMap.size() > 0) {
            add = PayBillOpEnum.REDBACK;
            return redMap;
        }
        return moneyMap;
    }
}

