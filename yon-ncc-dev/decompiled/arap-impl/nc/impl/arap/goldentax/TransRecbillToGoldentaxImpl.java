/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.pub.pf.PfUtilTools
 *  nc.itf.arap.goldentax.ITransRecbillToGoldentax
 *  nc.itf.arap.receivable.IArapReceivableBillQueryService
 *  nc.md.persist.framework.MDPersistenceService
 *  nc.pubitf.uapbd.ICustomerPubService
 *  nc.vo.arap.goldentax.AggGoldTaxHeadVO
 *  nc.vo.arap.goldentax.GoldTaxHeadVO
 *  nc.vo.arap.receivable.AggReceivableBillVO
 *  nc.vo.arap.receivable.ReceivableBillItemVO
 *  nc.vo.arap.receivable.ReceivableBillVO
 *  nc.vo.bd.bankaccount.BankAccSubVO
 *  nc.vo.bd.cust.CustomerVO
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pubapp.pattern.exception.ExceptionUtils
 *  nccloud.commons.lang.ArrayUtils
 */
package nc.impl.arap.goldentax;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import nc.bs.framework.common.NCLocator;
import nc.bs.pub.pf.PfUtilTools;
import nc.itf.arap.goldentax.ITransRecbillToGoldentax;
import nc.itf.arap.receivable.IArapReceivableBillQueryService;
import nc.md.persist.framework.MDPersistenceService;
import nc.pubitf.uapbd.ICustomerPubService;
import nc.vo.arap.goldentax.AggGoldTaxHeadVO;
import nc.vo.arap.goldentax.GoldTaxHeadVO;
import nc.vo.arap.receivable.AggReceivableBillVO;
import nc.vo.arap.receivable.ReceivableBillItemVO;
import nc.vo.arap.receivable.ReceivableBillVO;
import nc.vo.bd.bankaccount.BankAccSubVO;
import nc.vo.bd.cust.CustomerVO;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nccloud.commons.lang.ArrayUtils;

public class TransRecbillToGoldentaxImpl
implements ITransRecbillToGoldentax {
    public AggGoldTaxHeadVO[] executeVOChangeTogtax(String[] hids) throws BusinessException, SQLException {
        int i;
        IArapReceivableBillQueryService recQrySev = (IArapReceivableBillQueryService)NCLocator.getInstance().lookup(IArapReceivableBillQueryService.class);
        Object[] aggRecVOs = recQrySev.findBillByPrimaryKey(hids);
        ArrayList<AggReceivableBillVO> aggList = new ArrayList<AggReceivableBillVO>();
        for (int i2 = 0; i2 < aggRecVOs.length; ++i2) {
            HashMap customerMap = new HashMap();
            ReceivableBillVO headVO = aggRecVOs[i2].getHeadVO();
            ReceivableBillItemVO[] bodyVOs = aggRecVOs[i2].getBodyVOs();
            for (int j = 0; j < bodyVOs.length; ++j) {
                String customer = bodyVOs[j].getCustomer();
                if (customerMap.get(customer) == null) {
                    ArrayList<Integer> custPKList = new ArrayList<Integer>();
                    custPKList.add(j);
                    customerMap.put(customer, custPKList);
                    continue;
                }
                ((List)customerMap.get(customer)).add(j);
            }
            for (String cust : customerMap.keySet()) {
                ReceivableBillVO newheadVO = (ReceivableBillVO)headVO.clone();
                ReceivableBillItemVO[] newbodyVOs = new ReceivableBillItemVO[((List)customerMap.get(cust)).size()];
                for (int k = 0; k < ((List)customerMap.get(cust)).size(); ++k) {
                    newbodyVOs[k] = bodyVOs[(Integer)((List)customerMap.get(cust)).get(k)];
                }
                AggReceivableBillVO aggVO = new AggReceivableBillVO();
                aggVO.setParentVO((CircularlyAccessibleValueObject)newheadVO);
                aggVO.setChildrenVO((CircularlyAccessibleValueObject[])newbodyVOs);
                aggList.add(aggVO);
            }
        }
        aggRecVOs = aggList.toArray(new AggReceivableBillVO[0]);
        Object[] goldtaxvos = (AggGoldTaxHeadVO[])TransRecbillToGoldentaxImpl.executeVOChange((String)"F0", (String)"goldtax", (AggregatedValueObject[])aggRecVOs);
        if (ArrayUtils.isEmpty((Object[])aggRecVOs) || ArrayUtils.isEmpty((Object[])goldtaxvos)) {
            return null;
        }
        ICustomerPubService custSev = (ICustomerPubService)NCLocator.getInstance().lookup(ICustomerPubService.class);
        String[] pk_customers = new String[goldtaxvos.length];
        String[] custfldNames = new String[]{"name", "taxpayerid", "corpaddress", "tel1"};
        String[] pk_payaccounts = new String[goldtaxvos.length];
        String[] pk_recaccounts = new String[goldtaxvos.length];
        HashSet<String> accountSet = new HashSet<String>();
        for (int i3 = 0; i3 < aggRecVOs.length; ++i3) {
            ReceivableBillItemVO[] recbodys = (ReceivableBillItemVO[])aggRecVOs[i3].getChildrenVO();
            pk_customers[i3] = recbodys[0].getCustomer();
            pk_payaccounts[i3] = recbodys[0].getPayaccount();
            pk_recaccounts[i3] = recbodys[0].getRecaccount();
            if (pk_payaccounts[i3] != null) {
                accountSet.add(pk_payaccounts[i3]);
            }
            if (pk_recaccounts[i3] == null) continue;
            accountSet.add(pk_recaccounts[i3]);
        }
        Object[] customerVOs = custSev.getCustomerVO(pk_customers, custfldNames);
        Object[] paybankAccbasVOs = new BankAccSubVO[accountSet.size()];
        Collection result = MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByPKs(BankAccSubVO.class, accountSet.toArray(new String[0]), false);
        if (result != null && result.size() > 0) {
            paybankAccbasVOs = result.toArray(new BankAccSubVO[0]);
        }
        if (!ArrayUtils.isEmpty((Object[])customerVOs)) {
            HashMap<String, Object> custMap = new HashMap<String, Object>();
            for (i = 0; i < customerVOs.length; ++i) {
                custMap.put(customerVOs[i].getPk_customer(), customerVOs[i]);
            }
            for (i = 0; i < goldtaxvos.length; ++i) {
                GoldTaxHeadVO goldtaxHeadvo = goldtaxvos[i].getParentVO();
                goldtaxHeadvo.setCustomerid(pk_customers[i]);
                if (custMap.get(pk_customers[i]) == null) continue;
                goldtaxHeadvo.setCustomername(((CustomerVO)custMap.get(pk_customers[i])).getName());
                goldtaxHeadvo.setTaxpayerid(((CustomerVO)custMap.get(pk_customers[i])).getTaxpayerid());
                goldtaxHeadvo.setSaleaddr("");
                goldtaxHeadvo.setSalephone(((CustomerVO)custMap.get(pk_customers[i])).getTel1());
            }
        }
        if (!ArrayUtils.isEmpty((Object[])paybankAccbasVOs)) {
            HashMap<String, Object> accountMap = new HashMap<String, Object>();
            for (i = 0; i < paybankAccbasVOs.length; ++i) {
                accountMap.put(paybankAccbasVOs[i].getPk_bankaccsub(), paybankAccbasVOs[i]);
            }
            for (i = 0; i < goldtaxvos.length; ++i) {
                GoldTaxHeadVO goldtaxHeadvo = goldtaxvos[i].getParentVO();
                if (pk_payaccounts[i] != null && accountMap.get(pk_payaccounts[i]) != null) {
                    goldtaxHeadvo.setAccount(((BankAccSubVO)accountMap.get(pk_payaccounts[i])).getAccnum());
                    goldtaxHeadvo.setBankname(((BankAccSubVO)accountMap.get(pk_payaccounts[i])).getName());
                }
                if (pk_recaccounts[i] == null || accountMap.get(pk_recaccounts[i]) == null) continue;
                goldtaxHeadvo.setSellaccount(((BankAccSubVO)accountMap.get(pk_recaccounts[i])).getAccnum());
            }
        }
        return goldtaxvos;
    }

    public ReceivableBillVO[] updateWhenExportGoldTax(ReceivableBillVO[] voHeads) throws BusinessException {
        return null;
    }

    public static <T extends AggregatedValueObject> T[] executeVOChange(String sourceType, String desType, AggregatedValueObject[] sourceVos) {
        try {
            return PfUtilTools.runChangeDataAry((String)sourceType, (String)desType, (AggregatedValueObject[])sourceVos);
        }
        catch (Exception e) {
            ExceptionUtils.wrappException((Exception)e);
            return null;
        }
    }
}

