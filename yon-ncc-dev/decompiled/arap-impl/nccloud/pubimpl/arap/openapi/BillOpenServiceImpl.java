/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.api.arap.util.ArapAPIUtil
 *  nc.bs.arap.bill.ArapBillPubUtil
 *  nc.bs.dao.BaseDAO
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.sec.esapi.NCESAPI
 *  nc.itf.arap.initgatheringbill.IArapInitGatheringService
 *  nc.itf.arap.initpayablebill.IArapInitPayableService
 *  nc.itf.arap.initreceivable.IArapInitRecService
 *  nc.itf.arap.pub.IArapBillService
 *  nc.jdbc.framework.processor.ColumnListProcessor
 *  nc.jdbc.framework.processor.ResultSetProcessor
 *  nc.pubitf.bd.accessor.GeneralAccessorFactory
 *  nc.util.fi.pub.SqlUtils
 *  nc.vo.arap.basebill.BaseAggVO
 *  nc.vo.arap.basebill.BaseBillVO
 *  nc.vo.arap.basebill.BaseItemVO
 *  nc.vo.arap.pay.AggPayBillVO
 *  nc.vo.arap.utils.ArrayUtil
 *  nc.vo.bd.accessor.IBDData
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pub.workflownote.WorkflownoteVO
 *  nc.vo.pubapp.pflow.PfUserObject
 *  nc.vo.pubapp.util.NCPfServiceUtils
 *  nccloud.commons.lang.StringUtils
 *  nccloud.pubitf.arap.openapi.IARAPOpenAPIService
 *  nccloud.pubitf.arap.openapi.IBillOpenService
 *  nccloud.pubitf.arap.paybill.IInitPayBillService
 */
package nccloud.pubimpl.arap.openapi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import nc.api.arap.util.ArapAPIUtil;
import nc.bs.arap.bill.ArapBillPubUtil;
import nc.bs.dao.BaseDAO;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.framework.common.NCLocator;
import nc.bs.sec.esapi.NCESAPI;
import nc.itf.arap.initgatheringbill.IArapInitGatheringService;
import nc.itf.arap.initpayablebill.IArapInitPayableService;
import nc.itf.arap.initreceivable.IArapInitRecService;
import nc.itf.arap.pub.IArapBillService;
import nc.jdbc.framework.processor.ColumnListProcessor;
import nc.jdbc.framework.processor.ResultSetProcessor;
import nc.pubitf.bd.accessor.GeneralAccessorFactory;
import nc.util.fi.pub.SqlUtils;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.arap.pay.AggPayBillVO;
import nc.vo.arap.utils.ArrayUtil;
import nc.vo.bd.accessor.IBDData;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.workflownote.WorkflownoteVO;
import nc.vo.pubapp.pflow.PfUserObject;
import nc.vo.pubapp.util.NCPfServiceUtils;
import nccloud.commons.lang.StringUtils;
import nccloud.pubimpl.arap.openapi.ArapBillConvert;
import nccloud.pubitf.arap.openapi.IARAPOpenAPIService;
import nccloud.pubitf.arap.openapi.IBillOpenService;
import nccloud.pubitf.arap.paybill.IInitPayBillService;

public abstract class BillOpenServiceImpl
implements IBillOpenService {
    public Map<String, String> saveBill(BaseAggVO aggvo) throws BusinessException {
        IBDData bddata;
        BaseBillVO headvo = aggvo.getHeadVO();
        String billmakerCode = headvo.getBillmaker();
        String orgCode = headvo.getPk_org();
        if (!StringUtils.isEmpty((CharSequence)orgCode)) {
            bddata = GeneralAccessorFactory.getAccessor((String)"2cfe13c5-9757-4ae8-9327-f5c2d34bcb46").getDocByCode(InvocationInfoProxy.getInstance().getGroupId(), orgCode);
            if (bddata == null) {
                throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0967"));
            }
        } else {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0968"));
        }
        headvo.setPk_org(bddata.getPk());
        this.setHeadInfo(headvo);
        try {
            ArapBillConvert billconvert = new ArapBillConvert();
            billconvert.convertVO((SuperVO)headvo);
            billconvert.setBillCommonValue(aggvo);
            BaseItemVO[] items = aggvo.getItems();
            if (items != null && items.length > 0) {
                for (BaseItemVO itemvo : items) {
                    itemvo.setDirection(this.getDirection());
                    billconvert.convertVO((SuperVO)itemvo);
                }
                billconvert.setBodyCommonValue(aggvo);
            }
            ArapBillPubUtil.processMoney((AggregatedValueObject)aggvo);
            BaseAggVO aggbillvo = aggvo;
            UFBoolean isInit = aggvo.getHeadVO().getIsinit();
            if (isInit != null && isInit.booleanValue()) {
                if ("F0".equals(this.getBilltype())) {
                    aggbillvo = ((IArapInitRecService)NCLocator.getInstance().lookup(IArapInitRecService.class)).save(aggvo);
                } else if ("F1".equals(this.getBilltype())) {
                    aggbillvo = ((IArapInitPayableService)NCLocator.getInstance().lookup(IArapInitPayableService.class)).save(aggvo);
                } else if ("F2".equals(this.getBilltype())) {
                    aggbillvo = ((IArapInitGatheringService)NCLocator.getInstance().lookup(IArapInitGatheringService.class)).save(aggvo);
                } else if ("F3".equals(this.getBilltype())) {
                    aggbillvo = ((IInitPayBillService)NCLocator.getInstance().lookup(IInitPayBillService.class)).save((AggPayBillVO)aggvo);
                }
            } else {
                aggbillvo = (BaseAggVO)ArrayUtil.getFirstInArrays((Object[])((Object[])NCPfServiceUtils.processBatch((String)"SAVE", (String)headvo.getPk_tradetype(), (AggregatedValueObject[])new BaseAggVO[]{aggvo}, (Object[])new PfUserObject[]{new PfUserObject()}, (WorkflownoteVO)new WorkflownoteVO())));
            }
            HashMap<String, String> map = new HashMap<String, String>();
            map.put("pk_org", orgCode);
            map.put("billno", aggbillvo.getHeadVO().getBillno());
            map.put("billmaker", billmakerCode);
            map.put("pk_bill", aggbillvo.getPrimaryKey());
            return map;
        }
        catch (Exception e) {
            throw new BusinessException(e.getMessage());
        }
    }

    protected abstract void setHeadInfo(BaseBillVO var1) throws BusinessException;

    protected abstract Integer getDirection() throws BusinessException;

    protected abstract String getBilltype() throws BusinessException;

    public List<Map<String, Object>> queryBill(Map<String, String> conditionMap) throws BusinessException {
        if (conditionMap == null || conditionMap.size() == 0) {
            return null;
        }
        String[] tableInfo = ArapAPIUtil.getTableInfo((String)this.getBilltype());
        ArapBillConvert billconvert = new ArapBillConvert();
        String sql = "select distinct " + tableInfo[0] + "." + tableInfo[2] + " from " + tableInfo[0] + " " + tableInfo[0] + " inner join " + tableInfo[1] + " " + tableInfo[1] + " on " + tableInfo[0] + "." + tableInfo[2] + "=" + tableInfo[1] + "." + tableInfo[2] + " where " + billconvert.getBillConditionSql(conditionMap, tableInfo[0], tableInfo[1]);
        List pks = (List)new BaseDAO().executeQuery(sql, (ResultSetProcessor)new ColumnListProcessor());
        if (pks != null && pks.size() > 0) {
            BaseAggVO[] billvos = ((IArapBillService)NCLocator.getInstance().lookup(IArapBillService.class)).queryArapBillByPKs(pks.toArray(new String[0]), this.getBilltype());
            ArrayList<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
            for (BaseAggVO billvo : billvos) {
                HashMap<String, Object> map = new HashMap<String, Object>();
                BaseBillVO headVO = billvo.getHeadVO();
                Map<String, String> headMap = billconvert.convertVOToMap((SuperVO)headVO);
                map.putAll(headMap);
                BaseItemVO[] itemvos = billvo.getItems();
                ArrayList<Map<String, String>> items = new ArrayList<Map<String, String>>();
                for (BaseItemVO item : itemvos) {
                    Map<String, String> itemMap = billconvert.convertVOToMap((SuperVO)item);
                    items.add(itemMap);
                }
                map.put("items", items);
                list.add(map);
            }
            return list;
        }
        return null;
    }

    public Map<String, String> updateBill(Map<String, Object> map) throws BusinessException {
        String[] tableInfo = ArapAPIUtil.getTableInfo((String)this.getBilltype());
        String pk_bill = (String)map.get(tableInfo[2]);
        if (StringUtils.isEmpty((CharSequence)pk_bill)) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0969"));
        }
        BaseAggVO[] vos = ((IArapBillService)NCLocator.getInstance().lookup(IArapBillService.class)).queryArapBillByPKs(new String[]{pk_bill}, this.getBilltype());
        if (vos == null || vos.length < 1) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0765"));
        }
        ArapBillConvert billconvert = new ArapBillConvert();
        billconvert.updateVO((SuperVO)vos[0].getHeadVO(), map);
        HashMap<String, BaseItemVO> oldItemMap = new HashMap<String, BaseItemVO>();
        for (BaseItemVO itemVO : vos[0].getItems()) {
            oldItemMap.put((String)itemVO.getAttributeValue(tableInfo[3]), itemVO);
        }
        List itemsMap = (List)map.get("items");
        if (itemsMap != null && itemsMap.size() > 0) {
            for (Map itemMap : itemsMap) {
                String pk_item = (String)itemMap.get(tableInfo[3]);
                if (!oldItemMap.containsKey(pk_item)) continue;
                billconvert.updateVO((SuperVO)oldItemMap.get(pk_item), itemMap);
            }
        }
        ArapBillPubUtil.processMoney((AggregatedValueObject)vos[0]);
        BaseAggVO aggbillvo = (BaseAggVO)ArrayUtil.getFirstInArrays((Object[])((Object[])NCPfServiceUtils.processBatch((String)"SAVE", (String)vos[0].getHeadVO().getPk_tradetype(), (AggregatedValueObject[])new BaseAggVO[]{vos[0]}, (Object[])new PfUserObject[]{new PfUserObject()}, (WorkflownoteVO)new WorkflownoteVO())));
        HashMap<String, String> outmap = new HashMap<String, String>();
        BaseBillVO headVO = aggbillvo.getHeadVO();
        outmap.put(tableInfo[2], headVO.getPrimaryKey());
        outmap.put("billno", headVO.getBillno());
        return outmap;
    }

    public List<String> getPkBySrc(Map<String, String> map) throws BusinessException {
        String src_billidStr = map.get("src_billid");
        ArrayList<String> src_billid = new ArrayList<String>();
        if (StringUtils.isEmpty((CharSequence)src_billidStr)) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1007"));
        }
        String[] src_billids = src_billidStr.split(",");
        if (src_billids != null && src_billids.length > 0) {
            for (String string : src_billids) {
                src_billid.add(string);
            }
        }
        String src_billtypeStr = map.get("src_billtype");
        ArrayList<String> src_billtype = new ArrayList<String>();
        if (StringUtils.isEmpty((CharSequence)src_billtypeStr)) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1007"));
        }
        String[] src_billtypes = src_billtypeStr.split(",");
        if (src_billtypes != null && src_billtypes.length > 0) {
            for (String string : src_billtypes) {
                src_billtype.add(NCESAPI.sqlEncode((String)string));
            }
        }
        String[] tableInfo = ArapAPIUtil.getTableInfo((String)this.getBilltype());
        StringBuffer sb = new StringBuffer();
        sb.append("select distinct ").append(tableInfo[1]).append(".").append(tableInfo[2]).append(" from ");
        sb.append(tableInfo[1]).append(" ").append(tableInfo[1]).append(" where ");
        sb.append(SqlUtils.getInStr((String)(tableInfo[1] + "." + "src_billid"), src_billid));
        sb.append(" and " + SqlUtils.getInStr((String)(tableInfo[1] + "." + "src_billtype"), src_billtype));
        sb.append(" and isnull(" + tableInfo[1] + ".dr, 0) = 0");
        List pks = (List)new BaseDAO().executeQuery(sb.toString(), (ResultSetProcessor)new ColumnListProcessor());
        if (pks != null && pks.size() > 0) {
            return pks;
        }
        return null;
    }

    public Map<String, Object> saveAndCommitBill(BaseAggVO aggvo) throws BusinessException {
        Map<String, String> returnMap = this.saveBill(aggvo);
        String pk_bill = returnMap.get("pk_bill");
        IArapBillService service = (IArapBillService)NCLocator.getInstance().lookup(IArapBillService.class);
        BaseAggVO[] bills = service.queryArapBillByPKs(new String[]{pk_bill}, this.getBilltype());
        BaseAggVO billVO = ((IARAPOpenAPIService)NCLocator.getInstance().lookup(IARAPOpenAPIService.class)).doCommit(bills[0], this.getBilltype());
        BaseBillVO parent = billVO.getHeadVO();
        HashMap<String, Object> returnMap2 = new HashMap<String, Object>();
        returnMap2.put("pk_org", parent.getPk_org());
        returnMap2.put("billno", parent.getBillno());
        returnMap2.put("billmaker", parent.getBillmaker());
        returnMap2.put("pk_bill", pk_bill);
        return returnMap2;
    }

    public Map<String, Object> unCommitAndDelBill(String[] pk_bills) throws BusinessException {
        Object[] bills = ((IArapBillService)NCLocator.getInstance().lookup(IArapBillService.class)).queryArapBillByPKs(pk_bills, this.getBilltype());
        if (ArrayUtil.isArrayIsNull((Object[])bills)) {
            return null;
        }
        int num = 0;
        StringBuilder sb = new StringBuilder();
        IARAPOpenAPIService service = (IARAPOpenAPIService)NCLocator.getInstance().lookup(IARAPOpenAPIService.class);
        for (Object bill : bills) {
            try {
                service.doUnCommitAndDelete_RequiresNew((BaseAggVO)bill, this.getBilltype());
            }
            catch (Exception e) {
                ++num;
                sb.append(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0899", null, new String[]{(String)bill.getParentVO().getAttributeValue("billno"), e.getMessage()}) + ";");
            }
        }
        StringBuilder sb2 = new StringBuilder();
        int total = pk_bills.length;
        sb2.append(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0900", null, new String[]{String.valueOf(total), String.valueOf(total - num), String.valueOf(num)}) + sb.toString());
        HashMap<String, Object> returnMap = new HashMap<String, Object>();
        if (num == total) {
            returnMap.put("totalfail", true);
        } else {
            returnMap.put("totalfail", false);
        }
        return returnMap;
    }
}

