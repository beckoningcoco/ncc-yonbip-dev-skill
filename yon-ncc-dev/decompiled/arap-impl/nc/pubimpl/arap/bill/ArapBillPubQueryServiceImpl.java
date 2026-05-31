/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bd.accperiod.AccperiodmonthAccessor
 *  nc.bs.arap.bill.ArapBillCalUtil
 *  nc.bs.arap.bill.ArapBillDAO
 *  nc.bs.arap.bill.ArapBillPubUtil
 *  nc.bs.arap.util.ArapBillType2TableMapping
 *  nc.bs.arap.util.SqlUtils
 *  nc.bs.dao.BaseDAO
 *  nc.bs.dao.DAOException
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.sec.esapi.NCESAPI
 *  nc.itf.fi.org.IOrgVersionQueryService
 *  nc.itf.fi.pub.Currency
 *  nc.itf.fipub.service.IArapEJBService
 *  nc.itf.uap.IUAPQueryBS
 *  nc.itf.uap.pf.IPFConfig
 *  nc.jdbc.framework.processor.ArrayListProcessor
 *  nc.jdbc.framework.processor.ResultSetProcessor
 *  nc.md.persist.framework.MDPersistenceService
 *  nc.pubitf.arap.bill.IArapBillPubQueryService
 *  nc.pubitf.org.IOrgUnitPubService
 *  nc.util.fi.pub.SqlUtils
 *  nc.vo.arap.basebill.BaseAggVO
 *  nc.vo.arap.basebill.BaseBillVO
 *  nc.vo.arap.basebill.BaseItemVO
 *  nc.vo.arap.bill.util.ArapH2BMapping
 *  nc.vo.arap.bill.util.BillEventHandlerUtil
 *  nc.vo.arap.cache.FiPubDataCache
 *  nc.vo.arap.djlx.DjLXVO
 *  nc.vo.arap.pub.ArapBillTypeInfo
 *  nc.vo.arap.pub.BillEnumCollection$FromSystem
 *  nc.vo.arap.pub.IArapBilltypeInfo
 *  nc.vo.arap.service.ServiceVO
 *  nc.vo.arap.utils.StringUtil
 *  nc.vo.bd.period2.AccperiodmonthVO
 *  nc.vo.fi.pub.SqlUtils
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.org.util.OrgPubUtil
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.BusinessRuntimeException
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pub.lang.UFDouble
 *  nc.vo.pubapp.pattern.exception.ExceptionUtils
 *  nc.vo.pubapp.pattern.model.entity.bill.IBill
 *  nc.vo.pubapp.pattern.pub.MapList
 *  nc.vo.vorg.DeptVersionVO
 *  nc.vo.vorg.OrgVersionVO
 *  nccloud.commons.lang.ArrayUtils
 *  nccloud.commons.lang.StringUtils
 *  org.apache.commons.collections4.CollectionUtils
 */
package nc.pubimpl.arap.bill;

import java.lang.reflect.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import nc.bd.accperiod.AccperiodmonthAccessor;
import nc.bs.arap.bill.ArapBillCalUtil;
import nc.bs.arap.bill.ArapBillDAO;
import nc.bs.arap.bill.ArapBillPubUtil;
import nc.bs.arap.util.ArapBillType2TableMapping;
import nc.bs.arap.util.SqlUtils;
import nc.bs.dao.BaseDAO;
import nc.bs.dao.DAOException;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.framework.common.NCLocator;
import nc.bs.sec.esapi.NCESAPI;
import nc.itf.fi.org.IOrgVersionQueryService;
import nc.itf.fi.pub.Currency;
import nc.itf.fipub.service.IArapEJBService;
import nc.itf.uap.IUAPQueryBS;
import nc.itf.uap.pf.IPFConfig;
import nc.jdbc.framework.processor.ArrayListProcessor;
import nc.jdbc.framework.processor.ResultSetProcessor;
import nc.md.persist.framework.MDPersistenceService;
import nc.pubitf.arap.bill.IArapBillPubQueryService;
import nc.pubitf.org.IOrgUnitPubService;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.arap.bill.util.ArapH2BMapping;
import nc.vo.arap.bill.util.BillEventHandlerUtil;
import nc.vo.arap.cache.FiPubDataCache;
import nc.vo.arap.djlx.DjLXVO;
import nc.vo.arap.pub.ArapBillTypeInfo;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.arap.pub.IArapBilltypeInfo;
import nc.vo.arap.service.ServiceVO;
import nc.vo.arap.utils.StringUtil;
import nc.vo.bd.period2.AccperiodmonthVO;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.org.util.OrgPubUtil;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.BusinessRuntimeException;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.vo.pubapp.pattern.model.entity.bill.IBill;
import nc.vo.pubapp.pattern.pub.MapList;
import nc.vo.vorg.DeptVersionVO;
import nc.vo.vorg.OrgVersionVO;
import nccloud.commons.lang.ArrayUtils;
import nccloud.commons.lang.StringUtils;
import org.apache.commons.collections4.CollectionUtils;

public class ArapBillPubQueryServiceImpl
implements IArapBillPubQueryService {
    public BaseAggVO getDefaultVO(BaseAggVO vo, boolean isDealEuroCountry) throws BusinessException {
        String psndocpk;
        DjLXVO billType;
        String settlecurr;
        if (vo == null) {
            return vo;
        }
        BaseBillVO headvo = vo.getHeadVO();
        BaseItemVO[] itemvos = vo.getItems();
        BaseItemVO item0 = itemvos == null || itemvos.length == 0 ? null : itemvos[0];
        String pk_org = headvo.getPk_org();
        String pk_group = headvo.getPk_group();
        String tradetype = headvo.getPk_tradetype();
        String pk_billtype = headvo.getPk_billtype();
        UFDate billdate = headvo.getBilldate();
        String creator = headvo.getCreator();
        ArrayList<String> head2bodyFields = new ArrayList<String>();
        if (headvo.getIsinit().booleanValue()) {
            String[] fields;
            boolean isAr = BillEnumCollection.FromSystem.AR.VALUE.equals(headvo.getSyscode());
            billdate = ArapBillPubUtil.getArapCreateDate((boolean)isAr, (String)pk_org);
            if (null == billdate) {
                throw new BusinessRuntimeException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0007"));
            }
            for (String key : fields = new String[]{"effectdate", "billdate", "busidate"}) {
                headvo.setAttributeValue(key, (Object)billdate);
                head2bodyFields.add(key);
            }
        }
        String string = settlecurr = item0 == null ? null : itemvos[0].getSettlecurr();
        if (StringUtil.isEmpty((String)settlecurr)) {
            String currType = Currency.getOrgLocalCurrPK((String)pk_org);
            headvo.setPk_currtype(currType);
            head2bodyFields.add("pk_currtype");
        }
        if ((billType = FiPubDataCache.getBillType((String)tradetype, (String)pk_group)) != null && billType.getIschangedeptpsn() != null && billType.getIschangedeptpsn().booleanValue() && StringUtils.isNotEmpty((CharSequence)(psndocpk = BillEventHandlerUtil.getPsndocByUserid((String)creator, (Object)pk_org)))) {
            if (StringUtils.isNotEmpty((CharSequence)psndocpk)) {
                headvo.setPk_psndoc(psndocpk);
                head2bodyFields.add("pk_psndoc");
            }
            String deptDocid = "";
            String deptvDocid = "";
            String pk_dept = BillEventHandlerUtil.getPsndocPubService().queryDeptByPandocIDAndPkorg(psndocpk, pk_org);
            if (StringUtils.isEmpty((CharSequence)pk_dept)) {
                headvo.setPk_psndoc(null);
            }
            if (pk_dept != null && StringUtils.isNotEmpty((CharSequence)pk_org)) {
                deptvDocid = this.queryPsnDeptVid(pk_org, billdate, pk_dept);
                if (null != deptvDocid) {
                    deptDocid = pk_dept;
                }
            } else {
                Map psniddeptid = BillEventHandlerUtil.getPsndocPubService().queryDeptIDByPsndocIDs(new String[]{psndocpk});
                if (psniddeptid != null && psniddeptid.values() != null && psniddeptid.values().size() > 0) {
                    deptvDocid = this.queryPsnDeptVid(pk_org, billdate, ((List)psniddeptid.get(psndocpk)).toArray(new String[0]));
                    if (null != deptvDocid) {
                        deptDocid = pk_dept;
                    }
                } else {
                    headvo.setPk_deptid(null);
                    headvo.setPk_deptid_v(null);
                }
            }
            if (StringUtils.isNotEmpty((CharSequence)deptDocid)) {
                headvo.setPk_deptid(deptDocid);
                head2bodyFields.add("pk_deptid");
            }
            if (StringUtils.isNotEmpty((CharSequence)deptvDocid)) {
                headvo.setPk_deptid_v(deptvDocid);
                head2bodyFields.add("pk_deptid_v");
            }
        }
        try {
            IPFConfig ipf = (IPFConfig)NCLocator.getInstance().lookup(IPFConfig.class);
            if (!StringUtils.isEmpty((CharSequence)pk_billtype) && !StringUtils.isEmpty((CharSequence)tradetype)) {
                String pk_busitype = ipf.retBusitypeCanStart(pk_billtype, tradetype, pk_org, creator);
                if (pk_busitype == null) {
                    throw new BusinessException("busitype is null");
                }
                headvo.setPk_busitype(pk_busitype);
            }
        }
        catch (Exception e) {
            String msg = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0127") + tradetype + NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0239") + tradetype + NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0240");
            throw new BusinessRuntimeException(msg);
        }
        headvo.setSett_org(pk_org);
        headvo.setPk_fiorg(pk_org);
        Map verMap = new ArapH2BMapping().getVERMap();
        HashMap<String, ArrayList<String>> orgValue2FieldMap = new HashMap<String, ArrayList<String>>();
        for (Map.Entry entry : verMap.entrySet()) {
            String oidField = (String)entry.getKey();
            String vidField = (String)entry.getValue();
            Object oidValue = headvo.getAttributeValue(oidField);
            if (oidValue == null) continue;
            ArrayList<String> list = (ArrayList<String>)orgValue2FieldMap.get(oidValue);
            if (list == null) {
                list = new ArrayList<String>();
                orgValue2FieldMap.put(oidValue.toString(), list);
            }
            list.add(vidField);
            head2bodyFields.add(oidField);
            head2bodyFields.add(vidField);
        }
        IOrgVersionQueryService orgvservice = (IOrgVersionQueryService)NCLocator.getInstance().lookup(IOrgVersionQueryService.class);
        Map orgversion = orgvservice.getOrgVersionVOsByOrgsAndDate(orgValue2FieldMap.keySet().toArray(new String[0]), billdate);
        for (Map.Entry entry : orgValue2FieldMap.entrySet()) {
            OrgVersionVO vvo = (OrgVersionVO)orgversion.get(entry.getKey());
            if (vvo == null) continue;
            String vid = vvo.getPk_vid();
            List vfields = (List)entry.getValue();
            for (String vfield : vfields) {
                headvo.setAttributeValue(vfield, (Object)vid);
            }
        }
        if (isDealEuroCountry) {
            this.dealEuroCountry(pk_org, headvo);
        }
        this.setBillRates(headvo);
        head2bodyFields.add("rate");
        head2bodyFields.add("grouprate");
        head2bodyFields.add("globalrate");
        if (item0 != null) {
            for (BaseItemVO itemvo : itemvos) {
                for (String field : head2bodyFields) {
                    itemvo.setAttributeValue(field, headvo.getAttributeValue(field));
                }
            }
        }
        return vo;
    }

    public void setBillRates(BaseBillVO headvo) {
        String pk_org = headvo.getPk_org();
        String pk_group = headvo.getPk_group();
        String pk_billtype = headvo.getPk_billtype();
        UFDate date = headvo.getBilldate();
        String pk_currtype = headvo.getPk_currtype();
        if (null == pk_currtype) {
            headvo.setRate(UFDouble.ZERO_DBL);
            headvo.setGrouprate(UFDouble.ZERO_DBL);
            headvo.setGlobalrate(UFDouble.ZERO_DBL);
        } else {
            UFDouble[] rates = ArapBillCalUtil.getRate((String)pk_currtype.toString(), (String)pk_org.toString(), (String)(pk_group == null ? InvocationInfoProxy.getInstance().getGroupId() : pk_group.toString()), (UFDate)(date == null ? new UFDate() : date), (String)pk_billtype);
            headvo.setRate(rates[0]);
            headvo.setGrouprate(rates[1]);
            headvo.setGlobalrate(rates[2]);
        }
    }

    private void dealEuroCountry(String pk_org, BaseBillVO headvo) throws BusinessException {
        Object[] orgs = ((IOrgUnitPubService)NCLocator.getInstance().lookup(IOrgUnitPubService.class)).getOrgs(new String[]{pk_org}, new String[]{"pk_org", "countryzone"});
        if (ArrayUtils.isEmpty((Object[])orgs)) {
            return;
        }
        String countryzone = orgs[0].getCountryzone();
        headvo.setRececountryid(countryzone);
        headvo.setSendcountryid(countryzone);
        headvo.setTaxcountryid(countryzone);
    }

    private String queryPsnDeptVid(String pk_org, UFDate date, String ... pk_depts) throws BusinessException {
        if (pk_depts == null || pk_depts.length == 0) {
            return null;
        }
        String where = "pk_org = '" + pk_org + "' and " + OrgPubUtil.getVersionFilterSubSql((UFDate)date, (String)DeptVersionVO.getDefaultTableName(), (String)"pk_dept", (boolean)true, (boolean)false) + " and " + nc.util.fi.pub.SqlUtils.getInStr((String)"pk_dept", (String[])pk_depts);
        Collection retVOs = ((IUAPQueryBS)NCLocator.getInstance().lookup(IUAPQueryBS.class)).retrieveByClause(DeptVersionVO.class, where);
        return retVOs == null || retVOs.isEmpty() ? null : ((DeptVersionVO)retVOs.iterator().next()).getPk_vid();
    }

    public BaseBillVO[] findUnConfirmBillsByPeriod(String pk_org, String pk_accperiod, String[] pkBilltypes) throws BusinessException {
        if (ArrayUtils.isEmpty((Object[])pkBilltypes)) {
            return new BaseBillVO[0];
        }
        AccperiodmonthVO accperiodvo = AccperiodmonthAccessor.getInstance().queryAccperiodmonthVOByPk(pk_accperiod);
        if (accperiodvo == null) {
            return new BaseBillVO[0];
        }
        UFDate begindate = accperiodvo.getBegindate();
        UFDate enddate = accperiodvo.getEnddate();
        ArrayList<ServiceVO> servicevos = new ArrayList<ServiceVO>();
        for (String pkBilltype : pkBilltypes) {
            ServiceVO servicevo = new ServiceVO();
            servicevo.setMethodname("findUnConfirmBillsByPeriod");
            servicevo.setClassname(ArapBillType2TableMapping.getPubQueryServiceByBilltype((String)pkBilltype));
            servicevo.setParam(new Object[]{pk_org, begindate, enddate});
            servicevo.setParamtype(new Class[]{String.class, UFDate.class, UFDate.class});
            servicevos.add(servicevo);
        }
        Map callBatchEJBService = ((IArapEJBService)NCLocator.getInstance().lookup(IArapEJBService.class)).callBatchEJBService(servicevos.toArray(new ServiceVO[0]));
        Set retEntry = callBatchEJBService.entrySet();
        ArrayList<BaseBillVO> retList = new ArrayList<BaseBillVO>(callBatchEJBService.size());
        for (Map.Entry entry : retEntry) {
            if (entry.getValue().getClass().isArray()) {
                BaseBillVO[] array;
                for (BaseBillVO a : array = (BaseBillVO[])entry.getValue()) {
                    Integer dr = a.getDr();
                    if (dr == null || dr != 0) continue;
                    retList.add(a);
                }
                continue;
            }
            retList.addAll((Collection)entry.getValue());
        }
        return retList.toArray(new BaseBillVO[0]);
    }

    public BaseAggVO[] findBillByTopBillKeys(String billType, String[] topKeys) throws BusinessException {
        if (billType == null || ArrayUtils.isEmpty((Object[])topKeys)) {
            return null;
        }
        IArapBilltypeInfo billTypeInfo = ArapBillTypeInfo.getInstance((Object)billType);
        return new ArapBillDAO().queryBillByTopBillKeys(topKeys, billTypeInfo);
    }

    public BaseAggVO[] findBillByPrimaryKey(String[] keys, String[] pkBilltypes) throws BusinessException {
        if (ArrayUtils.isEmpty((Object[])pkBilltypes)) {
            return null;
        }
        HashMap<String, HashSet<String>> billtype2pk = new HashMap<String, HashSet<String>>();
        if (pkBilltypes.length == 1) {
            HashSet<String> hashSet = new HashSet<String>(Arrays.asList(keys));
            billtype2pk.put(pkBilltypes[0], hashSet);
        } else {
            for (String billtype : pkBilltypes) {
                HashSet<String> set = new HashSet<String>(Arrays.asList(keys));
                billtype2pk.put(billtype, set);
            }
        }
        ArrayList<ServiceVO> arrayList = new ArrayList<ServiceVO>();
        Set entrySet = billtype2pk.entrySet();
        for (Map.Entry entry : entrySet) {
            ServiceVO servicevo = new ServiceVO();
            servicevo.setMethodname("findBillByPrimaryKey");
            servicevo.setClassname(ArapBillType2TableMapping.getPubQueryServiceByBilltype((String)((String)entry.getKey())));
            servicevo.setParam(new Object[]{((Set)entry.getValue()).toArray(new String[0])});
            servicevo.setParamtype(new Class[]{Array.newInstance(String.class, 0).getClass()});
            arrayList.add(servicevo);
        }
        Map callBatchEJBService = ((IArapEJBService)NCLocator.getInstance().lookup(IArapEJBService.class)).callBatchEJBService(arrayList.toArray(new ServiceVO[0]));
        Set retEntry = callBatchEJBService.entrySet();
        ArrayList<BaseAggVO> retList = new ArrayList<BaseAggVO>(callBatchEJBService.size());
        for (Map.Entry entry : retEntry) {
            if (entry.getValue().getClass().isArray()) {
                BaseAggVO[] array;
                for (BaseAggVO a : array = (BaseAggVO[])entry.getValue()) {
                    Integer dr = ((BaseBillVO)a.getParentVO()).getDr();
                    if (a == null || dr != null && dr != 0) continue;
                    retList.add(a);
                }
                continue;
            }
            retList.addAll((Collection)entry.getValue());
        }
        return retList.toArray(new BaseAggVO[0]);
    }

    public MapList<String, BaseAggVO> queryDownFlowBills(List<String> top_billids, String downflow_billtype) throws BusinessException {
        List<String> billtypes = Arrays.asList("F0", "F1", "F2", "F3", "23F");
        if (downflow_billtype == null || billtypes.contains(downflow_billtype)) {
            throw new IllegalArgumentException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0358"));
        }
        String pkBilltype = downflow_billtype;
        String zb = ArapBillType2TableMapping.getParentTable((String)pkBilltype);
        String zbid = ArapBillType2TableMapping.getParentTablePK((String)pkBilltype);
        String fb = ArapBillType2TableMapping.getParentTable((String)pkBilltype);
        String fbid = ArapBillType2TableMapping.getParentTable((String)pkBilltype);
        Class aggclazz = ArapBillType2TableMapping.getVOClassByBilltype((String)pkBilltype);
        MapList ret = new MapList();
        if (top_billids == null || fb == null || fbid == null || zb == null || zbid == null) {
            return ret;
        }
        String whereSql = "  where exists (select 1 from " + fb + " " + fb + " where  " + zb + "." + zbid + " = " + fb + "." + fbid + " and  " + SqlUtils.getInStr((String)(fb + "." + "top_billid"), (String[])top_billids.toArray(new String[0])) + " ) ";
        Collection dbresult = MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByCond(aggclazz, whereSql, false);
        if (dbresult == null || dbresult.size() == 0) {
            return ret;
        }
        for (IBill bill : dbresult) {
            if (!top_billids.contains(bill.getParent().getPrimaryKey())) continue;
            ret.put((Object)bill.getParent().getPrimaryKey(), (Object)((BaseAggVO)bill));
        }
        return ret;
    }

    public List<SuperVO> queryDownFlowItems(List<String> topItemids, String downflow_billtype) throws BusinessException {
        List<String> billtypes = Arrays.asList("F0", "F1", "F2", "F3");
        if (downflow_billtype == null || billtypes.contains(downflow_billtype)) {
            throw new IllegalArgumentException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0358"));
        }
        String pkBilltype = downflow_billtype;
        String zb = ArapBillType2TableMapping.getParentTable((String)pkBilltype);
        String zbid = ArapBillType2TableMapping.getParentTablePK((String)pkBilltype);
        String fb = ArapBillType2TableMapping.getParentTable((String)pkBilltype);
        String fbid = ArapBillType2TableMapping.getParentTable((String)pkBilltype);
        Class itemclazz = ArapBillType2TableMapping.getItemVOByBilltype((String)pkBilltype);
        ArrayList<SuperVO> ret = new ArrayList<SuperVO>();
        if (topItemids == null || fb == null || fbid == null || zb == null || zbid == null) {
            return ret;
        }
        String whereSql = SqlUtils.getInStr((String)(fb + "." + "top_itemid"), (String[])topItemids.toArray(new String[0]));
        Collection dbresult = MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByCond(itemclazz, whereSql, false);
        if (dbresult == null || dbresult.size() == 0) {
            return ret;
        }
        for (SuperVO superVO : dbresult) {
            ret.add(superVO);
        }
        return ret;
    }

    public MapList<String, BaseAggVO> queryDownFlowBillsByBid(List<String> topItemids, String downflowBilltype) throws BusinessException {
        MapList billMapList = new MapList();
        List<SuperVO> queryDownFlowItems = this.queryDownFlowItems(topItemids, downflowBilltype);
        if (queryDownFlowItems == null || queryDownFlowItems.size() == 0) {
            return billMapList;
        }
        HashMap<String, String> map = new HashMap<String, String>();
        for (int i = 0; i < queryDownFlowItems.size(); ++i) {
            map.put(((BaseItemVO)queryDownFlowItems.get(i)).getParentPK(), queryDownFlowItems.get(i).getPrimaryKey());
        }
        Class headitems = ArapBillType2TableMapping.getParentVOByBilltype((String)downflowBilltype);
        Collection dbresult = MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByPKs(headitems, map.keySet().toArray(new String[0]), false);
        if (dbresult == null || dbresult.size() == 0) {
            return billMapList;
        }
        return null;
    }

    public Map<String, String> getClassMap(List<String> pksList) throws BusinessException {
        final HashMap<String, String> map = new HashMap<String, String>();
        new BaseDAO().executeQuery("select defaulttablename , id from md_class where " + SqlUtils.getInStr((String)"id", (String[])pksList.toArray(new String[0])), new ResultSetProcessor(){
            private static final long serialVersionUID = -6209473782538639472L;

            public Object handleResultSet(ResultSet rs) throws SQLException {
                while (rs.next()) {
                    map.put(rs.getString("id"), rs.getString("defaulttablename"));
                }
                return map;
            }
        });
        return map;
    }

    public AggregatedValueObject[] resetFlowDocDef(AggregatedValueObject[] destVOs) throws BusinessException {
        return ArapBillPubUtil.resetDestVODoc((AggregatedValueObject[])destVOs);
    }

    public boolean isExistBill(String[] orgPKs, boolean checkAR, boolean checkAP) throws BusinessException {
        if (orgPKs == null || orgPKs.length == 0) {
            return false;
        }
        String where = orgPKs.length == 1 ? "pk_org = '" + NCESAPI.sqlEncode((String)orgPKs[0]) + "'" : nc.vo.fi.pub.SqlUtils.getInStr((String)"pk_org", (String[])orgPKs, (boolean)true);
        boolean flag = false;
        if (checkAR) {
            flag = this.queryDataExist("ar_recbill", where);
            if (flag) {
                return flag;
            }
            flag = this.queryDataExist("ar_gatherbill", where);
            if (flag) {
                return flag;
            }
            flag = this.queryDataExist("ar_estirecbill", where);
            if (flag) {
                return flag;
            }
        }
        if (checkAP) {
            flag = this.queryDataExist("ap_payablebill", where);
            if (flag) {
                return flag;
            }
            flag = this.queryDataExist("ap_paybill", where);
            if (flag) {
                return flag;
            }
            flag = this.queryDataExist("ap_estipayablebill", where);
            if (flag) {
                return flag;
            }
        }
        return flag;
    }

    private boolean queryDataExist(String tablename, String wheresql) throws BusinessException {
        BaseDAO dao = new BaseDAO();
        Boolean flag = (Boolean)dao.executeQuery("select 1 from " + tablename + " where dr = 0 and " + wheresql, new ResultSetProcessor(){
            private static final long serialVersionUID = 1L;

            public Object handleResultSet(ResultSet rs) throws SQLException {
                Boolean exist = Boolean.FALSE;
                if (rs.next()) {
                    exist = Boolean.TRUE;
                }
                return exist;
            }
        });
        return flag;
    }

    public boolean isClear(String keyValue) {
        BaseDAO dao = new BaseDAO();
        StringBuffer sql = new StringBuffer();
        sql.append(" select enablestate from bd_bankaccbas where pk_bankaccbas in(select pk_bankaccbas from bd_bankaccsub where pk_bankaccsub in('");
        sql.append(keyValue).append("'))");
        List list = null;
        try {
            list = (List)dao.executeQuery(sql.toString(), (ResultSetProcessor)new ArrayListProcessor());
        }
        catch (DAOException e) {
            ExceptionUtils.wrappException((Exception)((Object)e));
        }
        return CollectionUtils.isNotEmpty(list) && ArrayUtils.isEmpty((Object[])((Object[])list.get(0))) && ((Object[])list.get(0))[0] == null && (((Object[])list.get(0))[0].equals(1) || ((Object[])list.get(0))[0].equals(3));
    }

    public boolean isExistBillByPuOrderPk(String pk_order) throws BusinessException {
        String where = "src_billid ='" + NCESAPI.sqlEncode((String)pk_order) + "'";
        boolean flag = this.queryDataExist("ap_payableitem", where);
        if (flag) {
            return flag;
        }
        flag = this.queryDataExist("ap_payitem", where);
        if (flag) {
            return flag;
        }
        flag = this.queryDataExist("ap_estipayableitem", where);
        if (flag) {
            return flag;
        }
        return false;
    }

    public List<String> getPageCodeByTranstype(String transtype) throws BusinessException {
        if (StringUtils.isEmpty((CharSequence)transtype)) {
            return Arrays.asList(transtype);
        }
        ArapBillDAO dao = new ArapBillDAO();
        String pk_group = InvocationInfoProxy.getInstance().getGroupId();
        List transList = dao.getTranstypecodeFilterLockandDel(new String[]{transtype}, pk_group);
        if (transList.contains(transtype) || CollectionUtils.isEmpty((Collection)transList)) {
            return Arrays.asList(transtype);
        }
        return transList;
    }
}

