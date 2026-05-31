/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.businessevent.BusinessEvent
 *  nc.bs.businessevent.BusinessEvent$BusinessUserObj
 *  nc.bs.businessevent.IBusinessEvent
 *  nc.bs.businessevent.IBusinessListener
 *  nc.bs.framework.common.NCLocator
 *  nc.itf.arap.pub.IArapBillService
 *  nc.itf.fi.pub.SysInit
 *  nc.vo.arap.basebill.BaseAggVO
 *  nc.vo.arap.pay.PayBillItemVO
 *  nc.vo.arap.pay.PayBillVO
 *  nc.vo.arap.pub.BillEnumCollection$ApproveStatus
 *  nc.vo.arap.pub.BillEnumCollection$BillSatus
 *  nc.vo.arap.pub.BillEnumCollection$InureSign
 *  nc.vo.cmp.settlement.SettlementAggVO
 *  nc.vo.cmp.settlement.SettlementBodyVO
 *  nc.vo.cmp.settlement.SettlementHeadVO
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFDouble
 *  nccloud.pubitf.arap.arappub.ICurrencyService
 *  org.apache.commons.lang3.ArrayUtils
 */
package nc.bs.arap.busireg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import nc.bs.businessevent.BusinessEvent;
import nc.bs.businessevent.IBusinessEvent;
import nc.bs.businessevent.IBusinessListener;
import nc.bs.framework.common.NCLocator;
import nc.itf.arap.pub.IArapBillService;
import nc.itf.fi.pub.SysInit;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.pay.PayBillItemVO;
import nc.vo.arap.pay.PayBillVO;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.cmp.settlement.SettlementAggVO;
import nc.vo.cmp.settlement.SettlementBodyVO;
import nc.vo.cmp.settlement.SettlementHeadVO;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDouble;
import nccloud.pubitf.arap.arappub.ICurrencyService;
import org.apache.commons.lang3.ArrayUtils;

public class CmpNetPayCheckListener
implements IBusinessListener {
    public void doAction(IBusinessEvent event) throws BusinessException {
        BusinessEvent cmpEvent = (BusinessEvent)event;
        Object obj = ((BusinessEvent.BusinessUserObj)cmpEvent.getUserObject()).getUserObj();
        if (obj == null) {
            return;
        }
        SettlementAggVO[] settAggVos = null;
        if (obj.getClass().isArray()) {
            Object[] objvalue = (Object[])obj;
            settAggVos = new SettlementAggVO[objvalue.length];
            System.arraycopy(objvalue, 0, settAggVos, 0, objvalue.length);
        } else {
            settAggVos = new SettlementAggVO[]{(SettlementAggVO)obj};
        }
        Object[] aggvos = null;
        String[] pkList = new String[settAggVos.length];
        for (int cm = 0; cm < settAggVos.length; ++cm) {
            SettlementHeadVO settleheadvo = (SettlementHeadVO)settAggVos[cm].getParentVO();
            String pk_busibill = (String)settleheadvo.getAttributeValue("pk_busibill");
            if (pk_busibill == null) continue;
            pkList[cm] = pk_busibill;
        }
        aggvos = this.getService().queryArapBillByPKs(pkList, "F3");
        if (ArrayUtils.isEmpty((Object[])aggvos)) {
            return;
        }
        ArrayList<Object> aggList = new ArrayList<Object>();
        for (String pk : pkList) {
            for (Object aggvo : aggvos) {
                if (!aggvo.getPrimaryKey().equals(pk)) continue;
                aggList.add(aggvo);
            }
        }
        this.checkBillInfo(aggList.toArray(new BaseAggVO[0]), settAggVos);
    }

    private void checkBillInfo(BaseAggVO[] aggvos, SettlementAggVO[] settAggvos) throws BusinessException {
        for (int i = 0; i < aggvos.length; ++i) {
            String paraString = SysInit.getParaString((String)aggvos[i].getHeadVO().getPk_org(), (String)"CMP37");
            String SignaturesSuccess = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0866");
            if (!BillEnumCollection.BillSatus.SIGN.VALUE.equals(aggvos[i].getParentVO().getAttributeValue("billstatus")) || !BillEnumCollection.ApproveStatus.PASSING.VALUE.equals(aggvos[i].getParentVO().getAttributeValue("approvestatus")) || SignaturesSuccess.equals(paraString) && !BillEnumCollection.InureSign.OKINURE.VALUE.equals(aggvos[i].getParentVO().getAttributeValue("effectstatus"))) {
                throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1316"));
            }
            Object[] settlebodyvos = (SettlementBodyVO[])settAggvos[i].getChildrenVO();
            PayBillItemVO[] itemvos = (PayBillItemVO[])aggvos[i].getChildrenVO();
            if (ArrayUtils.isEmpty((Object[])settlebodyvos)) {
                throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1332"));
            }
            HashMap<String, String> paymap = new HashMap<String, String>();
            HashMap<String, Set> setmap = new HashMap<String, Set>();
            HashMap<String, UFDouble> pkPayMap = new HashMap<String, UFDouble>();
            HashMap<String, UFDouble> pkPayLocalMap = new HashMap<String, UFDouble>();
            HashMap<String, List> pkSetMap = new HashMap<String, List>();
            HashMap<String, List> pkSetLocalMap = new HashMap<String, List>();
            HashSet<String> pkList = new HashSet<String>();
            for (PayBillItemVO payBillItemVO : itemvos) {
                paymap.put(payBillItemVO.getPk_payitem(), payBillItemVO.getRecaccount());
                pkPayMap.put(payBillItemVO.getPk_payitem(), payBillItemVO.getMoney_de());
                pkPayLocalMap.put(payBillItemVO.getPk_payitem(), payBillItemVO.getLocal_money_de());
                pkList.add(payBillItemVO.getPk_payitem());
            }
            for (Object object : settlebodyvos) {
                HashSet<String> pkaccount = new HashSet<String>();
                ArrayList<UFDouble> mnyList = new ArrayList<UFDouble>();
                ArrayList<UFDouble> localMnyList = new ArrayList<UFDouble>();
                pkaccount.add(object.getPk_oppaccount());
                mnyList.add(object.getPay());
                localMnyList.add(object.getPaylocal());
                if (!setmap.containsKey(object.getPk_billdetail())) {
                    setmap.put(object.getPk_billdetail(), pkaccount);
                    pkSetMap.put(object.getPk_billdetail(), mnyList);
                    pkSetLocalMap.put(object.getPk_billdetail(), localMnyList);
                    continue;
                }
                Set pkaccount2 = (Set)setmap.get(object.getPk_billdetail());
                pkaccount2.add(object.getPk_oppaccount());
                setmap.replace(object.getPk_billdetail(), pkaccount2);
                List mnyList2 = (List)pkSetMap.get(object.getPk_billdetail());
                mnyList2.add(object.getPay());
                pkSetMap.replace(object.getPk_billdetail(), mnyList2);
                List localMnyList2 = (List)pkSetLocalMap.get(object.getPk_billdetail());
                localMnyList2.add(object.getPaylocal());
                pkSetLocalMap.replace(object.getPk_billdetail(), localMnyList2);
            }
            SettlementHeadVO settlementHeadVO = (SettlementHeadVO)settAggvos[i].getParentVO();
            PayBillVO payheadvo = (PayBillVO)aggvos[i].getParentVO();
            UFDouble pay = payheadvo.getMoney();
            UFDouble uFDouble = payheadvo.getLocal_money();
            UFDouble money_de = settlementHeadVO.getPrimal();
            UFDouble local_money_de = settlementHeadVO.getOrglocal();
            if (pay.compareTo((Object)money_de) != 0) {
                throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1317"));
            }
            String localCurr = ((ICurrencyService)NCLocator.getInstance().lookup(ICurrencyService.class)).getOrgLocalCurrPK((String)aggvos[i].getParentVO().getAttributeValue("pk_org"));
            String currType = (String)aggvos[i].getParentVO().getAttributeValue("pk_currtype");
            if (currType.equals(localCurr) && uFDouble.compareTo((Object)local_money_de) != 0) {
                throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1318"));
            }
            for (String pk : pkList) {
                String recaccount = (String)paymap.get(pk);
                Set pk_oppaccount = (Set)setmap.get(pk);
                List setmnyL = (List)pkSetMap.get(pk);
                List setLocalMnyL = (List)pkSetLocalMap.get(pk);
                UFDouble tolSetMny = UFDouble.ZERO_DBL;
                UFDouble tolSetlocalMny = UFDouble.ZERO_DBL;
                if (setmnyL != null && setmnyL.size() > 0 && setLocalMnyL != null && setLocalMnyL.size() > 0) {
                    for (UFDouble setmny : setmnyL) {
                        tolSetMny = tolSetMny.add(setmny);
                    }
                    for (UFDouble setlocalMny : setLocalMnyL) {
                        tolSetlocalMny = tolSetlocalMny.add(setlocalMny);
                    }
                }
                if (pk_oppaccount.size() != 1 || pk_oppaccount.size() == 1 && (recaccount == null && pk_oppaccount.toArray(new String[0])[0] != null || recaccount != null && !recaccount.equals(pk_oppaccount.toArray(new String[0])[0]))) {
                    throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1319"));
                }
                UFDouble paymny = (UFDouble)pkPayMap.get(pk);
                UFDouble payLocalMny = (UFDouble)pkPayLocalMap.get(pk);
                if (UFDouble.ZERO_DBL.compareTo((Object)tolSetMny) == 0 || paymny.compareTo((Object)tolSetMny) != 0) {
                    throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1317"));
                }
                if (!currType.equals(localCurr) || UFDouble.ZERO_DBL.compareTo((Object)tolSetlocalMny) != 0 && payLocalMny.compareTo((Object)tolSetlocalMny) == 0) continue;
                throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1318"));
            }
        }
    }

    private IArapBillService getService() {
        return (IArapBillService)NCLocator.getInstance().lookup(IArapBillService.class);
    }
}

