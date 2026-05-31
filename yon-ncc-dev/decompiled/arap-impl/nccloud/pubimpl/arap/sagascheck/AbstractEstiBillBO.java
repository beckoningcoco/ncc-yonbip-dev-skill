/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.bill.ArapBillCalUtil
 *  nc.bs.arap.bill.ArapBillDAO
 *  nc.bs.arap.bill.ArapBillPubUtil
 *  nc.bs.arap.estipayablebp.EstiPayableDAO
 *  nc.bs.arap.estirecbp.EstiRecDAO
 *  nc.bs.arap.util.SqlUtils
 *  nc.bs.dao.BaseDAO
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.framework.common.NCLocator
 *  nc.itf.arap.initbill.IInitBillCloseService
 *  nc.jdbc.framework.processor.ResultSetProcessor
 *  nc.md.model.MetaDataException
 *  nc.md.persist.framework.MDPersistenceService
 *  nc.pubitf.arap.estipayable.IArapEstService
 *  nc.pubitf.arap.estipayable.IArapEstiPayableBillPubService
 *  nc.pubitf.arap.receivable.IArapEstiReceivableBillPubService
 *  nc.vo.arap.basebill.BaseAggVO
 *  nc.vo.arap.basebill.BaseBillVO
 *  nc.vo.arap.basebill.BaseItemVO
 *  nc.vo.arap.cache.FiPubDataCache
 *  nc.vo.arap.djlx.DjLXVO
 *  nc.vo.arap.estipayable.AggEstiPayableBillVO
 *  nc.vo.arap.estipayable.EstiPayableBillVO
 *  nc.vo.arap.estireceivable.AggEstiReceivableBillVO
 *  nc.vo.arap.estireceivable.EstiReceivableBillVO
 *  nc.vo.arap.pub.ArapConstant
 *  nc.vo.arap.pub.BillEnumCollection$ApproveStatus
 *  nc.vo.arap.pub.BillEnumCollection$BillSatus
 *  nc.vo.arap.pub.BillEnumCollection$EstiType
 *  nc.vo.arap.pub.BillEnumCollection$InureSign
 *  nc.vo.arap.pub.BillEnumCollection$TaxType
 *  nc.vo.arap.verify.AdjuestVO
 *  nc.vo.arap.verify.EstParamVO
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.BusinessRuntimeException
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pub.lang.UFDouble
 *  nc.vo.pubapp.pattern.pub.MapList
 *  nccloud.bs.arap.util.FipMessageUtils
 *  nccloud.commons.lang.StringUtils
 *  org.apache.commons.lang3.ArrayUtils
 */
package nccloud.pubimpl.arap.sagascheck;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import nc.bs.arap.bill.ArapBillCalUtil;
import nc.bs.arap.bill.ArapBillDAO;
import nc.bs.arap.bill.ArapBillPubUtil;
import nc.bs.arap.estipayablebp.EstiPayableDAO;
import nc.bs.arap.estirecbp.EstiRecDAO;
import nc.bs.arap.util.SqlUtils;
import nc.bs.dao.BaseDAO;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.framework.common.NCLocator;
import nc.itf.arap.initbill.IInitBillCloseService;
import nc.jdbc.framework.processor.ResultSetProcessor;
import nc.md.model.MetaDataException;
import nc.md.persist.framework.MDPersistenceService;
import nc.pubitf.arap.estipayable.IArapEstService;
import nc.pubitf.arap.estipayable.IArapEstiPayableBillPubService;
import nc.pubitf.arap.receivable.IArapEstiReceivableBillPubService;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.arap.cache.FiPubDataCache;
import nc.vo.arap.djlx.DjLXVO;
import nc.vo.arap.estipayable.AggEstiPayableBillVO;
import nc.vo.arap.estipayable.EstiPayableBillVO;
import nc.vo.arap.estireceivable.AggEstiReceivableBillVO;
import nc.vo.arap.estireceivable.EstiReceivableBillVO;
import nc.vo.arap.pub.ArapConstant;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.arap.verify.AdjuestVO;
import nc.vo.arap.verify.EstParamVO;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.BusinessRuntimeException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.pub.MapList;
import nccloud.bs.arap.util.FipMessageUtils;
import nccloud.commons.lang.StringUtils;
import org.apache.commons.lang3.ArrayUtils;

public abstract class AbstractEstiBillBO {
    private static final String TOP_SETTLEITEMID = "top_settleitemid";

    public AggregatedValueObject[] queryEstiBillByBatchNo(String[] clbhs) throws BusinessException {
        EstParamVO para = new EstParamVO();
        this.checkParameterForUnEstVerify(clbhs);
        BaseItemVO[] itemvos = this.getService(para).getByDealnos(clbhs);
        if (null == itemvos || itemvos.length == 0) {
            return null;
        }
        HashSet<String> billKeySet = new HashSet<String>();
        for (BaseItemVO item : itemvos) {
            billKeySet.add(item.getParentPK());
        }
        String billType = this.isReceive() ? "23E0" : "23E1";
        AggregatedValueObject[] bills = new ArapBillDAO().queryBillByPrimaryKeys(billKeySet.toArray(new String[0]), billType);
        return bills;
    }

    public AggregatedValueObject[] queryEstiBillBySrcPKAndOrg(Map<String, String> srcid_Org) throws BusinessException {
        if (srcid_Org == null || srcid_Org.size() == 0) {
            return null;
        }
        Iterator<String> it = srcid_Org.keySet().iterator();
        HashMap org_srcids = new HashMap();
        while (it.hasNext()) {
            String ddhh = it.next();
            String orgs = srcid_Org.get(ddhh);
            if (!org_srcids.containsKey(orgs)) {
                org_srcids.put(orgs, new ArrayList());
            }
            ((List)org_srcids.get(orgs)).add(ddhh);
        }
        ArrayList<AggEstiReceivableBillVO> result = new ArrayList<AggEstiReceivableBillVO>();
        EstiRecDAO dao = this.isReceive() ? new EstiRecDAO() : new EstiPayableDAO();
        for (String pk_org : org_srcids.keySet()) {
            String[] ddhhs = ((List)org_srcids.get(pk_org)).toArray(new String[0]);
            Object[] bills = null;
            try {
                bills = this.isReceive() ? dao.queryBillsBySourceRowIDs(ddhhs, pk_org) : ((EstiPayableDAO)dao).queryBillsBySourceRowIDs(ddhhs, pk_org);
                if (bills == null) continue;
                result.addAll(Arrays.asList(bills));
            }
            catch (Exception e) {
                throw ExceptionHandler.handleException(this.getClass(), (Exception)e);
            }
        }
        return result.toArray(new AggregatedValueObject[0]);
    }

    public BaseAggVO[] constructEstiBill(AdjuestVO[] vos) throws BusinessException {
        EstParamVO para = new EstParamVO();
        this.checkParameterForEstVerify(vos);
        Map<BaseItemVO[], AdjuestVO[]> itemvosMap = this.createBatch(vos, para);
        if (itemvosMap.size() == 0) {
            return null;
        }
        ArrayList result = new ArrayList();
        ArrayList<String> parentPKs = new ArrayList<String>();
        for (BaseItemVO[] key : itemvosMap.keySet()) {
            parentPKs.add(key[0].getParentPK());
        }
        Map<String, BaseBillVO> billVOMap = this.getBaseBillVOsByIds(parentPKs);
        ArrayList<String> topItemIdList = new ArrayList<String>();
        for (BaseItemVO[] key : itemvosMap.keySet()) {
            for (BaseItemVO item : key) {
                topItemIdList.add(item.getPrimaryKey());
            }
        }
        if (topItemIdList == null || topItemIdList.size() == 0) {
            return null;
        }
        Map<String, UFDouble[]> notaxBalMap = this.queryNotaxBal(topItemIdList);
        for (BaseItemVO[] key : itemvosMap.keySet()) {
            List<Object> doAdjuest = this.doAdjuest(itemvosMap.get(key), para, key, billVOMap, notaxBalMap);
            result.addAll((List)doAdjuest.get(1));
        }
        return result.toArray(new BaseAggVO[0]);
    }

    protected void checkParameterForEstVerify(AdjuestVO[] vos) throws BusinessException {
        if (vos == null || vos.length == 0) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006ver_0", "02006ver-0276"));
        }
        for (AdjuestVO vo : vos) {
            if (vo != null && vo.getEst_top_itemid() != null && vo.getTop_itemid() != null && vo.getClbh() != null && vo.getQuantity() != null) continue;
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006ver_0", "02006ver-0276"));
        }
    }

    protected void checkParameterForUnEstVerify(String[] clbhs) throws BusinessException {
        if (clbhs == null || clbhs.length == 0) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006ver_0", "02006ver-0276"));
        }
    }

    private Map<String, BaseBillVO> getBaseBillVOsByIds(List<String> parentPKs) throws BusinessException {
        Class cls = this.isReceive() ? EstiReceivableBillVO.class : EstiPayableBillVO.class;
        Collection bills = MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByPKs(cls, parentPKs.toArray(new String[0]), false);
        HashMap<String, BaseBillVO> billVOMap = new HashMap<String, BaseBillVO>();
        if (bills != null) {
            for (BaseBillVO bill : bills) {
                billVOMap.put(bill.getPrimaryKey(), bill);
            }
        }
        return billVOMap;
    }

    private List<Object> doAdjuest(AdjuestVO[] vos, EstParamVO para, BaseItemVO[] itemvos, Map<String, BaseBillVO> billVOMap, Map<String, UFDouble[]> notaxBalMap) throws BusinessException, MetaDataException {
        BaseAggVO[] baseAggVOArray;
        BaseItemVO[] newitemvos = this.getVerifyItemvos(itemvos, vos, para, notaxBalMap);
        BaseBillVO headvo = billVOMap.get(itemvos[0].getParentPK());
        for (BaseItemVO baseItemVO : newitemvos) {
            baseItemVO.setPrimaryKey(baseItemVO.getTop_itemid());
            baseItemVO.setParentPK(baseItemVO.getTop_billid());
        }
        ArapBillCalUtil.processItemScale((BaseItemVO[])newitemvos);
        ArrayList<Object> re = new ArrayList<Object>();
        ArrayList<BaseAggVO> re2 = new ArrayList<BaseAggVO>();
        ArrayList<BaseItemVO> re1 = new ArrayList<BaseItemVO>();
        for (BaseItemVO item : newitemvos) {
            re1.add((BaseItemVO)item.clone());
        }
        for (BaseItemVO item : newitemvos) {
            for (String field : item.getMoneyFields(this.isReceive() ? "zs" : "zf")) {
                UFDouble attributeValueM = null;
                Object attr = item.getAttributeValue(field);
                attributeValueM = attr == null ? UFDouble.ZERO_DBL : (attr instanceof UFDouble ? (UFDouble)attr : new UFDouble(attr.toString()));
                item.setAttributeValue(field, (Object)attributeValueM.multiply(-1.0));
            }
            for (String field : BaseItemVO.getMoneyFieldsBal((boolean)this.isReceive())) {
                item.setAttributeValue(field, (Object)UFDouble.ZERO_DBL);
            }
            Object attributeValue = item.getAttributeValue("taxtype");
            UFDouble value = null;
            if (item.getAttributeValue("caltaxmny") != null && ((UFDouble)item.getAttributeValue("caltaxmny")).compareTo((Object)UFDouble.ZERO_DBL) != 0) continue;
            if (attributeValue != null && BillEnumCollection.TaxType.TAXIN.VALUE.intValue() == ((Integer)attributeValue).intValue()) {
                value = (UFDouble)item.getAttributeValue(this.isReceive() ? "local_money_de" : "local_money_cr");
                item.setAttributeValue("caltaxmny", (Object)value);
                continue;
            }
            value = (UFDouble)item.getAttributeValue(this.isReceive() ? "local_notax_de" : "local_notax_cr");
            item.setAttributeValue("caltaxmny", (Object)value);
        }
        for (BaseItemVO item : newitemvos) {
            item.setPrimaryKey(null);
            item.setParentPK(null);
            item.setScomment(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61008_0", "02006v61008-0299"));
        }
        for (BaseAggVO g : baseAggVOArray = this.generateBill(newitemvos, para, headvo)) {
            re2.add(g);
        }
        re.add(re1);
        re.add(re2);
        return re;
    }

    private Map<BaseItemVO[], AdjuestVO[]> createBatch(AdjuestVO[] vos, EstParamVO para) throws BusinessException {
        HashMap<BaseItemVO[], AdjuestVO[]> result_map = new HashMap<BaseItemVO[], AdjuestVO[]>();
        ArrayList<String> itemids = new ArrayList<String>();
        for (AdjuestVO vo : vos) {
            itemids.add(vo.getEst_top_itemid());
        }
        BaseItemVO[] itemvos = this.getService(para).getEstBillByTopItemids(itemids.toArray(new String[0]));
        MapList mapList = new MapList();
        for (BaseItemVO item : itemvos) {
            mapList.put((Object)item.getParentPK(), (Object)item);
        }
        for (List itemvalues : mapList.toMap().values()) {
            ArrayList<String> pks = new ArrayList<String>();
            for (BaseItemVO item : itemvalues) {
                pks.add(item.getTop_itemid());
            }
            ArrayList<AdjuestVO> adjuestvalues = new ArrayList<AdjuestVO>();
            for (AdjuestVO vo : vos) {
                if (!pks.contains(vo.getEst_top_itemid())) continue;
                adjuestvalues.add(vo);
            }
            result_map.put(itemvalues.toArray(new BaseItemVO[0]), adjuestvalues.toArray(new AdjuestVO[0]));
        }
        this.doDataCheck(result_map);
        return result_map;
    }

    private void doDataCheck(Map<BaseItemVO[], AdjuestVO[]> resultMap) throws BusinessException {
        for (BaseItemVO[] key : resultMap.keySet()) {
            AdjuestVO[] adjuestVOs = resultMap.get(key);
            for (BaseItemVO vo : key) {
                AdjuestVO adjvo;
                int n;
                UFDouble quantity_bal = vo.getQuantity_bal();
                UFDouble quantity_sum = this.isReceive() ? vo.getQuantity_de() : vo.getQuantity_cr();
                UFDouble quantity_deal = UFDouble.ZERO_DBL;
                if (quantity_sum == null) {
                    quantity_sum = UFDouble.ZERO_DBL;
                }
                if (quantity_bal == null) {
                    quantity_bal = UFDouble.ZERO_DBL;
                }
                for (AdjuestVO adjvo2 : adjuestVOs) {
                    if (!adjvo2.getEst_top_itemid().equals(vo.getTop_itemid())) continue;
                    quantity_deal = quantity_deal.add(adjvo2.getQuantity());
                }
                UFDouble result = quantity_bal.sub(quantity_deal);
                if (quantity_bal.compareTo((Object)UFDouble.ZERO_DBL) == 0 && quantity_deal.multiply(quantity_sum).compareTo((Object)UFDouble.ZERO_DBL) > 0) {
                    throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006ver_0", "02006ver-0278"));
                }
                if (result.multiply(quantity_sum).compareTo((Object)UFDouble.ZERO_DBL) < 0) {
                    UFDouble sub = quantity_deal.sub(quantity_bal);
                    AdjuestVO[] adjuestVOArray = adjuestVOs;
                    int n2 = adjuestVOArray.length;
                    for (n = 0; n < n2; ++n) {
                        adjvo = adjuestVOArray[n];
                        if (!adjvo.getEst_top_itemid().equals(vo.getTop_itemid())) continue;
                        if (adjvo.getQuantity().abs().compareTo((Object)sub.abs()) < 0) {
                            sub = sub.sub(adjvo.getQuantity());
                            adjvo.setQuantity(null);
                            continue;
                        }
                        if (adjvo.getQuantity().abs().compareTo((Object)sub.abs()) == 0) {
                            adjvo.setQuantity(null);
                        } else {
                            if (adjvo.getQuantity().abs().compareTo((Object)sub.abs()) <= 0) continue;
                            adjvo.setQuantity(adjvo.getQuantity().sub(sub));
                        }
                        break;
                    }
                } else if (result.abs().compareTo((Object)quantity_sum.abs()) > 0) {
                    UFDouble sub = quantity_deal.sub(quantity_bal.sub(quantity_sum));
                    AdjuestVO[] adjuestVOArray = adjuestVOs;
                    int n3 = adjuestVOArray.length;
                    for (n = 0; n < n3; ++n) {
                        adjvo = adjuestVOArray[n];
                        if (!adjvo.getEst_top_itemid().equals(vo.getTop_itemid())) continue;
                        if (adjvo.getQuantity().abs().compareTo((Object)sub.abs()) < 0) {
                            sub = sub.sub(adjvo.getQuantity());
                            adjvo.setQuantity(null);
                            continue;
                        }
                        if (adjvo.getQuantity().abs().compareTo((Object)sub.abs()) == 0) {
                            adjvo.setQuantity(null);
                        } else {
                            if (adjvo.getQuantity().abs().compareTo((Object)sub.abs()) <= 0) continue;
                            adjvo.setQuantity(adjvo.getQuantity().sub(sub));
                        }
                        break;
                    }
                }
                if (!vo.getBilldate().afterDate(new UFDate(InvocationInfoProxy.getInstance().getBizDateTime()))) continue;
                throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006ver_0", "02006ver-0352"));
            }
        }
    }

    private BaseAggVO[] generateBill(BaseItemVO[] newitemvos, EstParamVO para, BaseBillVO header) throws BusinessException {
        ArrayList<BaseAggVO> list = new ArrayList<BaseAggVO>();
        header.setEffectstatus(BillEnumCollection.InureSign.NOINURE.VALUE);
        header.setBillstatus(BillEnumCollection.BillSatus.SAVE.VALUE);
        header.setEffectuser(null);
        header.setEffectdate(null);
        header.setApprover(null);
        header.setApprovedate(null);
        header.setIsinit(UFBoolean.FALSE);
        BaseAggVO newBaseAggvo = this.createBill(newitemvos, para, header);
        ArapBillCalUtil.processBillScale((AggregatedValueObject)newBaseAggvo);
        list.add(newBaseAggvo);
        return list.toArray(new BaseAggVO[0]);
    }

    private BaseAggVO createBill(BaseItemVO[] newitemvos, EstParamVO para, BaseBillVO headvo) throws BusinessException {
        BaseAggVO newBaseAggvo = this.getNewBaseAggvo(this.isReceive());
        newBaseAggvo.setChildrenVO((CircularlyAccessibleValueObject[])newitemvos);
        BaseBillVO headvonew = (BaseBillVO)headvo.clone();
        headvonew.setAttributeValue("estflag", (Object)BillEnumCollection.EstiType.NOTEST.VALUE);
        newBaseAggvo.setParentVO((CircularlyAccessibleValueObject)headvonew);
        this.resetBillVO(newBaseAggvo, para);
        return newBaseAggvo;
    }

    private void resetBillVO(BaseAggVO newBaseAggvo, EstParamVO para) {
        BaseBillVO head = (BaseBillVO)newBaseAggvo.getParentVO();
        ArapBillPubUtil.processMoneyOnlySum((AggregatedValueObject)newBaseAggvo);
        head.resetDefaultValue(para.getOperator(), para.getOpertime());
    }

    private BaseAggVO getNewBaseAggvo(boolean isreceive) {
        if (isreceive) {
            return new AggEstiReceivableBillVO();
        }
        return new AggEstiPayableBillVO();
    }

    private BaseItemVO[] getVerifyItemvos(BaseItemVO[] itemvos, AdjuestVO[] vos, EstParamVO para, Map<String, UFDouble[]> notaxBalMap) throws BusinessException {
        HashMap<String, BaseItemVO> map = new HashMap<String, BaseItemVO>();
        HashMap<String, UFDouble> balMap = new HashMap<String, UFDouble>();
        for (BaseItemVO item : itemvos) {
            map.put(item.getTop_itemid(), item);
            balMap.put(item.getTop_itemid(), item.getQuantity_bal());
        }
        ArrayList<BaseItemVO> listItems = new ArrayList<BaseItemVO>();
        for (AdjuestVO vo : vos) {
            BaseItemVO item = (BaseItemVO)map.get(vo.getEst_top_itemid());
            if (item == null) {
                throw new BusinessRuntimeException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006ver_0", "02006ver-0279"));
            }
            if (vo.getQuantity() == null) continue;
            BaseItemVO newitem = (BaseItemVO)item.clone();
            newitem.setQuantity_bal((UFDouble)balMap.get(vo.getEst_top_itemid()));
            newitem.setTop_billid(item.getParentPK());
            newitem.setTop_itemid(item.getPrimaryKey());
            newitem.setTop_billtype(item.getPk_billtype());
            newitem.setTop_tradetype(item.getPk_tradetype());
            newitem.setPk_org(item.getPk_org());
            newitem.setRate(item.getRate());
            newitem.setPk_currtype(item.getPk_currtype());
            newitem.setPrice(item.getPrice());
            newitem.recalculateByShl(vo.getQuantity(), notaxBalMap);
            newitem.setDealno(vo.getClbh());
            newitem.resetDefaultValue(para.getOperator(), para.getOpertime());
            newitem.setAttributeValue(TOP_SETTLEITEMID, (Object)vo.getTop_itemid());
            listItems.add(newitem);
            UFDouble bal = ((UFDouble)balMap.get(vo.getEst_top_itemid())).sub(vo.getQuantity());
            balMap.put(vo.getEst_top_itemid(), bal);
        }
        return listItems.toArray(new BaseItemVO[0]);
    }

    private Map<String, UFDouble[]> queryNotaxBal(List<String> topItemIdList) throws BusinessException {
        String orig_sql = null;
        String bal_sql = null;
        if (this.isReceive()) {
            orig_sql = "select notax_de notax, local_notax_de local_notax, local_tax_de local_tax,  groupnotax_de  groupnotax, globalnotax_de globalnotax ,caltaxmny, money_bal, local_money_de local_money_bal, groupdebit groupbalance, globaldebit globalbalance,pk_estirecitem pk from ar_estirecitem where dr = 0 and " + SqlUtils.getInStr((String)"pk_estirecitem", (String[])topItemIdList.toArray(new String[0]));
            bal_sql = "select notax_de notax, local_notax_de local_notax, local_tax_de local_tax,  groupnotax_de  groupnotax, globalnotax_de globalnotax  ,caltaxmny, money_bal, local_money_de local_money_bal, groupdebit groupbalance, globaldebit globalbalance,top_itemid pk from ar_estirecitem where dr = 0 and " + SqlUtils.getInStr((String)"top_itemid", (String[])topItemIdList.toArray(new String[0]));
        } else {
            orig_sql = "select notax_cr notax, local_notax_cr local_notax, local_tax_cr local_tax,  groupnotax_cre groupnotax, globalnotax_cre globalnotax ,caltaxmny, money_bal, local_money_cr local_money_bal, groupcrebit groupbalance, globalcrebit globalbalance, pk_estipayableitem pk from ap_estipayableitem where dr = 0 and " + SqlUtils.getInStr((String)"pk_estipayableitem", (String[])topItemIdList.toArray(new String[0]));
            bal_sql = "select notax_cr notax,local_notax_cr local_notax, local_tax_cr local_tax,  groupnotax_cre groupnotax, globalnotax_cre globalnotax ,caltaxmny, money_bal, local_money_cr local_money_bal, groupcrebit groupbalance, globalcrebit globalbalance, top_itemid pk from ap_estipayableitem where dr = 0 and " + SqlUtils.getInStr((String)"top_itemid", (String[])topItemIdList.toArray(new String[0]));
        }
        StringBuffer sqlBuffer = new StringBuffer();
        sqlBuffer.append(" select sum(notax) notax, sum(local_notax) local_notax,  sum(local_tax) local_tax,  sum(groupnotax) groupnotax,   sum(globalnotax) globalnotax, sum(caltaxmny) caltaxmny, sum(money_bal) money_bal, sum(local_money_bal) local_money_bal, sum(groupbalance) groupbalance, sum(globalbalance) globalbalance, pk from ");
        sqlBuffer.append("((").append(orig_sql).append(") union all (").append(bal_sql).append(")) tmp ");
        sqlBuffer.append(" group by pk ");
        return (Map)new BaseDAO().executeQuery(sqlBuffer.toString(), new ResultSetProcessor(){
            private static final long serialVersionUID = 1L;

            public Object handleResultSet(ResultSet rs) throws SQLException {
                HashMap<String, UFDouble[]> retMap = new HashMap<String, UFDouble[]>();
                while (rs.next()) {
                    BigDecimal notax = rs.getBigDecimal("notax");
                    BigDecimal local_notax = rs.getBigDecimal("local_notax");
                    BigDecimal local_tax = rs.getBigDecimal("local_tax");
                    BigDecimal groupnotax = rs.getBigDecimal("groupnotax");
                    BigDecimal globalnotax = rs.getBigDecimal("globalnotax");
                    BigDecimal caltaxmny = rs.getBigDecimal("caltaxmny");
                    BigDecimal money_bal = rs.getBigDecimal("money_bal");
                    BigDecimal local_money_bal = rs.getBigDecimal("local_money_bal");
                    BigDecimal groupbalance = rs.getBigDecimal("groupbalance");
                    BigDecimal globalbalance = rs.getBigDecimal("globalbalance");
                    UFDouble[] moneys = new UFDouble[]{local_tax == null ? UFDouble.ZERO_DBL : new UFDouble(local_tax), notax == null ? UFDouble.ZERO_DBL : new UFDouble(notax), local_notax == null ? UFDouble.ZERO_DBL : new UFDouble(local_notax), groupnotax == null ? UFDouble.ZERO_DBL : new UFDouble(groupnotax), globalnotax == null ? UFDouble.ZERO_DBL : new UFDouble(globalnotax), caltaxmny == null ? UFDouble.ZERO_DBL : new UFDouble(caltaxmny), money_bal == null ? UFDouble.ZERO_DBL : new UFDouble(money_bal), local_money_bal == null ? UFDouble.ZERO_DBL : new UFDouble(local_money_bal), groupbalance == null ? UFDouble.ZERO_DBL : new UFDouble(groupbalance), globalbalance == null ? UFDouble.ZERO_DBL : new UFDouble(globalbalance)};
                    retMap.put(rs.getString("pk"), moneys);
                }
                return retMap;
            }
        });
    }

    protected void fipDeleteValidate(AggregatedValueObject ... bills) throws BusinessException {
        if (ArrayUtils.isEmpty((Object[])bills)) {
            return;
        }
        ArrayList<AggregatedValueObject> approvedBillList = new ArrayList<AggregatedValueObject>();
        for (AggregatedValueObject bill : bills) {
            if (BillEnumCollection.ApproveStatus.PASSING.VALUE.intValue() != ((Integer)bill.getParentVO().getAttributeValue("approvestatus")).intValue()) continue;
            approvedBillList.add(bill);
        }
        if (approvedBillList.size() > 0) {
            FipMessageUtils.syncCheckBeforeSendMessage((boolean)false, (AggregatedValueObject[])approvedBillList.toArray(new AggregatedValueObject[0]));
        }
    }

    protected void approveBeforeValidate(AggregatedValueObject ... bills) throws BusinessException {
        if (null == bills || bills.length == 0) {
            return;
        }
        String billtype = bills[0].getParentVO().getAttributeValue("pk_billtype").toString();
        HashMap<String, UFDate> validateDate = new HashMap<String, UFDate>();
        int size = bills.length;
        for (int i = 0; i < size; ++i) {
            AggregatedValueObject vo = bills[i];
            SuperVO head = (SuperVO)vo.getParentVO();
            String pk_org = (String)head.getAttributeValue("pk_org");
            UFDate date = (UFDate)head.getAttributeValue("billdate");
            if (validateDate.containsKey(pk_org) && date.before((UFDate)validateDate.get(pk_org))) {
                validateDate.put(pk_org, date);
                continue;
            }
            if (validateDate.containsKey(pk_org)) continue;
            validateDate.put(pk_org, date);
        }
        HashMap<String, DjLXVO> map = new HashMap<String, DjLXVO>();
        for (AggregatedValueObject vo : bills) {
            UFBoolean isinit;
            SuperVO head = (SuperVO)vo.getParentVO();
            String djlxbm = (String)head.getAttributeValue("pk_tradetype");
            String pk_org = (String)head.getAttributeValue("pk_org");
            String pk_group = (String)head.getAttributeValue("pk_group");
            String prodid = "AR";
            if (head.getAttributeValue("syscode").equals(ArapConstant.INT_ONE)) {
                prodid = "AP";
            }
            if (null == (isinit = (UFBoolean)head.getAttributeValue("isinit"))) {
                isinit = UFBoolean.FALSE;
            }
            if (isinit != null && isinit.booleanValue()) {
                boolean isInitClose = prodid.equals("AR") ? ((IInitBillCloseService)NCLocator.getInstance().lookup(IInitBillCloseService.class)).isInitBillClosed(ArapConstant.ARAP_FUNCODE_RECBILL_I, pk_org) : ((IInitBillCloseService)NCLocator.getInstance().lookup(IInitBillCloseService.class)).isInitBillClosed(ArapConstant.ARAP_FUNCODE_PAYABLEBILL_I, pk_org);
                if (isInitClose) {
                    throw ExceptionHandler.createException((String)NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0077"));
                }
            } else {
                for (String pkorg : validateDate.keySet()) {
                    UFDate createDate = ArapBillPubUtil.getArapCreateDate((String)pkorg, (String)billtype);
                    if (createDate != null && !((UFDate)validateDate.get(pkorg)).before(createDate)) continue;
                    throw ExceptionHandler.createException((String)NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0316_0", "02006arappub0316-0043"));
                }
            }
            if (StringUtils.isEmpty((CharSequence)djlxbm)) {
                throw ExceptionHandler.createException((String)NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61008_0", "02006v61008-0327"));
            }
            DjLXVO djlxvo = null;
            String key = djlxbm + pk_group;
            if (map.containsKey(key)) {
                djlxvo = (DjLXVO)map.get(key);
            } else {
                djlxvo = FiPubDataCache.getBillType((String)djlxbm, (String)pk_group);
                map.put(key, djlxvo);
            }
            if (djlxvo != null) continue;
            throw ExceptionHandler.createException((String)(NCLangRes4VoTransl.getNCLangRes().getStrByID("2008est_0", "02008est-0003") + djlxbm));
        }
    }

    protected void unApproveBeforeValidate(AggregatedValueObject ... bills) throws BusinessException {
        if (bills == null || bills.length == 0) {
            return;
        }
        for (AggregatedValueObject bill : bills) {
            boolean isInitClose;
            UFBoolean isinit;
            if (bill.getParentVO().getAttributeValue("effectstatus") == null || !((Integer)bill.getParentVO().getAttributeValue("effectstatus")).equals(BillEnumCollection.InureSign.OKINURE.VALUE)) {
                throw ExceptionHandler.createException((String)NCLangRes4VoTransl.getNCLangRes().getStrByID("2008est_0", "02008est-0006"));
            }
            SuperVO head = (SuperVO)bill.getParentVO();
            String pk_org = (String)head.getAttributeValue("pk_org");
            String prodid = "AR";
            if (head.getAttributeValue("syscode").equals(ArapConstant.INT_ONE)) {
                prodid = "AP";
            }
            if (null == (isinit = (UFBoolean)head.getAttributeValue("isinit"))) {
                isinit = UFBoolean.FALSE;
            }
            if (isinit == null || !isinit.booleanValue() || !(isInitClose = prodid.equals("AR") ? ((IInitBillCloseService)NCLocator.getInstance().lookup(IInitBillCloseService.class)).isInitBillClosed(ArapConstant.ARAP_FUNCODE_RECBILL_I, pk_org) : ((IInitBillCloseService)NCLocator.getInstance().lookup(IInitBillCloseService.class)).isInitBillClosed(ArapConstant.ARAP_FUNCODE_PAYABLEBILL_I, pk_org))) continue;
            throw ExceptionHandler.createException((String)NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0077"));
        }
    }

    private IArapEstService getService(EstParamVO para) {
        if (this.isReceive()) {
            return (IArapEstService)NCLocator.getInstance().lookup(IArapEstiReceivableBillPubService.class);
        }
        return (IArapEstService)NCLocator.getInstance().lookup(IArapEstiPayableBillPubService.class);
    }

    protected abstract boolean isReceive();
}

