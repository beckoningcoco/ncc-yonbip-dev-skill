/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.logging.Logger
 *  nc.pubitf.uapbd.ICustomerPubService
 *  nc.pubitf.uapbd.ISupplierPubService
 *  nc.vo.bd.cust.CustomerVO
 *  nc.vo.bd.supplier.SupplierVO
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pub.lang.UFDouble
 *  nccloud.commons.lang.ArrayUtils
 */
package nc.vo.arap.bill.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import nc.bs.arap.util.ArapMaterialUtils;
import nc.bs.framework.common.NCLocator;
import nc.bs.logging.Logger;
import nc.pubitf.arap.termitem.IArapTermItemPubQueryService;
import nc.pubitf.uapbd.ICustomerPubService;
import nc.pubitf.uapbd.ISupplierPubService;
import nc.vo.arap.agiotage.ArapBusiDataVO;
import nc.vo.arap.termitem.TermVO;
import nc.vo.bd.cust.CustomerVO;
import nc.vo.bd.supplier.SupplierVO;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDouble;
import nccloud.commons.lang.ArrayUtils;

public class ArapVOTransformUtil {
    private static String[] itemKeys = new String[]{"customer", "supplier", "pk_deptid", "pk_deptid_v", "pk_psndoc", "invoiceno"};

    public List<ArapBusiDataVO> transform(AggregatedValueObject[] vos) throws BusinessException {
        ArrayList<ArapBusiDataVO> busiDataVOList = new ArrayList<ArapBusiDataVO>();
        ArrayList<String> billPKList = new ArrayList<String>();
        for (AggregatedValueObject aggvo : vos) {
            billPKList.add(aggvo.getParentVO().getPrimaryKey());
        }
        TermVO[] termVOs = ((IArapTermItemPubQueryService)NCLocator.getInstance().lookup(IArapTermItemPubQueryService.class)).queryTermVOByBillParentPK(billPKList.toArray(new String[0]));
        Map<String, List<TermVO>> termVOMap = this.getTermVOByItemPK(termVOs);
        for (AggregatedValueObject vo : vos) {
            SuperVO[] items;
            for (SuperVO item : items = (SuperVO[])vo.getChildrenVO()) {
                List<ArapBusiDataVO> busidataList = this.transform(item, (SuperVO)vo.getParentVO(), termVOMap);
                busiDataVOList.addAll(busidataList);
            }
        }
        if (busiDataVOList.size() > 0) {
            ArapMaterialUtils.translateMaterial2NonVersion((CircularlyAccessibleValueObject[])busiDataVOList.toArray(new ArapBusiDataVO[busiDataVOList.size()]), "material", "material_v");
            this.setAreaPKForBusiData(busiDataVOList);
        }
        return busiDataVOList;
    }

    private void setAreaPKForBusiData(List<ArapBusiDataVO> busiDataList) {
        if (busiDataList.get(0).getObjtype() == 0) {
            String[] custPKS = this.getCustOrSuppPKS(busiDataList, true);
            try {
                Object[] customerVOs = ((ICustomerPubService)NCLocator.getInstance().lookup(ICustomerPubService.class)).getCustomerVO(custPKS, new String[]{"pk_areacl", "pk_customer"});
                HashMap<String, Object> custMap = new HashMap<String, Object>();
                if (!ArrayUtils.isEmpty((Object[])customerVOs)) {
                    for (Object cust : customerVOs) {
                        if (cust == null) continue;
                        custMap.put(cust.getPk_customer(), cust);
                    }
                }
                for (ArapBusiDataVO data : busiDataList) {
                    if (custMap.get(data.getCustomer()) == null) continue;
                    data.setPk_areacl(((CustomerVO)custMap.get(data.getCustomer())).getPk_areacl());
                }
            }
            catch (BusinessException e) {
                Logger.error((Object)e.getMessage(), (Throwable)e);
            }
        } else if (busiDataList.get(0).getObjtype() == 1) {
            String[] suppPKS = this.getCustOrSuppPKS(busiDataList, false);
            try {
                Object[] supplierVOs = ((ISupplierPubService)NCLocator.getInstance().lookup(ISupplierPubService.class)).getSupplierVO(suppPKS, new String[]{"pk_areacl", "pk_supplier"});
                HashMap<String, Object> suppMap = new HashMap<String, Object>();
                if (!ArrayUtils.isEmpty((Object[])supplierVOs)) {
                    for (Object cust : supplierVOs) {
                        if (cust == null) continue;
                        suppMap.put(cust.getPk_supplier(), cust);
                    }
                }
                for (ArapBusiDataVO data : busiDataList) {
                    if (suppMap.get(data.getSupplier()) == null) continue;
                    data.setPk_areacl(((SupplierVO)suppMap.get(data.getSupplier())).getPk_areacl());
                }
            }
            catch (BusinessException e) {
                Logger.error((Object)e.getMessage(), (Throwable)e);
            }
        }
    }

    private String[] getCustOrSuppPKS(List<ArapBusiDataVO> vos, boolean iscust) {
        HashSet<String> pkS = new HashSet<String>();
        for (ArapBusiDataVO vo : vos) {
            if (iscust) {
                pkS.add(vo.getCustomer());
                continue;
            }
            pkS.add(vo.getSupplier());
        }
        String[] pkArr = pkS.toArray(new String[0]);
        return pkArr;
    }

    private Map<String, List<TermVO>> getTermVOByItemPK(TermVO[] termVOs) {
        HashMap<String, List<TermVO>> termMap = new HashMap<String, List<TermVO>>();
        for (TermVO vo : termVOs) {
            if (termMap.containsKey(vo.getPk_item())) {
                ((List)termMap.get(vo.getPk_item())).add(vo);
                continue;
            }
            ArrayList<TermVO> temp = new ArrayList<TermVO>();
            temp.add(vo);
            termMap.put(vo.getPk_item(), temp);
        }
        return termMap;
    }

    private List<ArapBusiDataVO> transform(SuperVO item, SuperVO head, Map<String, List<TermVO>> termVOMap) throws BusinessException {
        String[] attrs;
        ArapBusiDataVO retvo = new ArapBusiDataVO();
        for (String attr : attrs = retvo.getAttributeNames()) {
            Object attributeValue = item.getAttributeValue(attr);
            if (attributeValue == null && !Arrays.asList(itemKeys).contains(attr)) {
                attributeValue = head.getAttributeValue(attr);
            }
            retvo.setAttributeValue(attr, attributeValue);
            if (attr.equals("pk_costsubj")) {
                retvo.setAttributeValue("pk_costsubj", item.getAttributeValue("pk_subjcode"));
            }
            if (attr.equals("price")) {
                retvo.setAttributeValue("price", item.getAttributeValue("taxprice"));
            }
            if (attr.equals("pk_pcorg")) {
                retvo.setAttributeValue("pk_pcorg", item.getAttributeValue("pk_pcorg"));
            }
            if (attributeValue == null && (attr.equals("global_money_bal") || attr.equals("group_money_bal") || attr.equals("global_money_de") || attr.equals("global_money_cr") || attr.equals("group_money_de") || attr.equals("group_money_cr"))) {
                retvo.setAttributeValue(attr, UFDouble.ZERO_DBL);
            }
            if (!attr.equals("saga_status") && !attr.equals("saga_frozen")) continue;
            retvo.setAttributeValue(attr, 0);
        }
        retvo.setPk_bill(head.getPrimaryKey());
        retvo.setPk_item(item.getPrimaryKey());
        retvo.setSum_headmoney((UFDouble)head.getAttributeValue("money"));
        String billcalss = (String)item.getAttributeValue("billclass");
        if (billcalss.equals("ys") || billcalss.equals("fk")) {
            retvo.setSum_itemmoney((UFDouble)item.getAttributeValue("money_de"));
        } else {
            retvo.setSum_itemmoney((UFDouble)item.getAttributeValue("money_cr"));
        }
        retvo.setBillstatus(1);
        retvo.setHeadsubjcode((String)head.getAttributeValue("subjcode"));
        retvo.setPk_busitype((String)head.getAttributeValue("pk_busitype"));
        retvo.setOperator((String)head.getAttributeValue("billmaker"));
        retvo.setBillno((String)head.getAttributeValue("billno"));
        retvo.setEstflag(head.getAttributeValue("estflag") == null ? Integer.valueOf(0) : (Integer)head.getAttributeValue("estflag"));
        if (retvo.getPausetransact() == null) {
            retvo.setPausetransact(UFBoolean.FALSE);
        }
        if (retvo.getDr() == null) {
            retvo.setDr(0);
        }
        retvo.setIsinit((UFBoolean)head.getAttributeValue("isinit"));
        List<ArapBusiDataVO> busiDataList = this.queryTermVOByBillParentPK(retvo, termVOMap);
        return busiDataList;
    }

    private List<ArapBusiDataVO> queryTermVOByBillParentPK(ArapBusiDataVO busidataVO, Map<String, List<TermVO>> termVOMap) throws BusinessException {
        List<TermVO> termlist = termVOMap.get(busidataVO.getPk_item());
        ArrayList<ArapBusiDataVO> busiDataList = new ArrayList<ArapBusiDataVO>();
        if (termlist != null && termlist.size() > 0) {
            for (TermVO termVO : termlist) {
                ArapBusiDataVO copyVO = (ArapBusiDataVO)((Object)busidataVO.clone());
                copyVO.setExpiredate(termVO.getExpiredate());
                copyVO.setInnerctldeferdays(termVO.getInnerctldeferdays());
                copyVO.setInsurance(termVO.getInsurance());
                copyVO.setPk_termitem(termVO.getPk_termitem());
                copyVO.setMoney_de(termVO.getMoney_de() == null ? UFDouble.ZERO_DBL : termVO.getMoney_de());
                copyVO.setLocal_money_de(termVO.getLocal_money_de() == null ? UFDouble.ZERO_DBL : termVO.getLocal_money_de());
                copyVO.setMoney_cr(termVO.getMoney_cr() == null ? UFDouble.ZERO_DBL : termVO.getMoney_cr());
                copyVO.setLocal_money_cr(termVO.getLocal_money_cr() == null ? UFDouble.ZERO_DBL : termVO.getLocal_money_cr());
                copyVO.setMoney_bal(termVO.getMoney_bal() == null ? UFDouble.ZERO_DBL : termVO.getMoney_bal());
                copyVO.setLocal_money_bal(termVO.getLocal_money_bal() == null ? UFDouble.ZERO_DBL : termVO.getLocal_money_bal());
                copyVO.setGroup_money_de(termVO.getGroupdebit() == null ? UFDouble.ZERO_DBL : termVO.getGroupdebit());
                copyVO.setGroup_money_cr(termVO.getGroupcredit() == null ? UFDouble.ZERO_DBL : termVO.getGroupcredit());
                copyVO.setGroup_money_bal(termVO.getGroupbalance() == null ? UFDouble.ZERO_DBL : termVO.getGroupbalance());
                copyVO.setGlobal_money_de(termVO.getGlobaldebit() == null ? UFDouble.ZERO_DBL : termVO.getGlobaldebit());
                copyVO.setGlobal_money_cr(termVO.getGlobalcredit() == null ? UFDouble.ZERO_DBL : termVO.getGlobalcredit());
                copyVO.setGlobal_money_bal(termVO.getGlobalbalance() == null ? UFDouble.ZERO_DBL : termVO.getGlobalbalance());
                copyVO.setQuantity_de(termVO.getQuantity_de() == null ? UFDouble.ZERO_DBL : termVO.getQuantity_de());
                copyVO.setQuantity_cr(termVO.getQuantity_cr() == null ? UFDouble.ZERO_DBL : termVO.getQuantity_cr());
                copyVO.setQuantity_bal(termVO.getQuantity_bal() == null ? UFDouble.ZERO_DBL : termVO.getQuantity_bal());
                copyVO.setOccupationmny(termVO.getOccupationmny());
                copyVO.setIstransin(UFBoolean.valueOf((boolean)false));
                copyVO.setPrepay(termVO.getPrepay() != null && termVO.getPrepay().booleanValue() ? 1 : 0);
                busiDataList.add(copyVO);
            }
        }
        return busiDataList;
    }
}

