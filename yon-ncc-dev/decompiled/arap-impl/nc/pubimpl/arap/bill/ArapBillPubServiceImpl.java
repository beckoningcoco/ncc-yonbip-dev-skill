/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.actions.BillTempSaveBatchAction
 *  nc.bs.arap.bill.ArapBillDAO
 *  nc.bs.arap.bill.ArapBillPubUtil
 *  nc.bs.arap.util.ArapBillType2TableMapping
 *  nc.bs.arap.util.SqlUtils
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.pf.pub.PfDataCache
 *  nc.itf.arap.bill.IArapBillQueryBaseService
 *  nc.itf.fipub.service.IArapEJBService
 *  nc.itf.uap.IUAPQueryBS
 *  nc.itf.uap.pf.IPFMetaModel
 *  nc.itf.uap.pf.IWorkflowDefine
 *  nc.md.persist.framework.MDPersistenceService
 *  nc.pubitf.arap.bill.IArapBillPubService
 *  nc.util.fi.pub.SqlUtils
 *  nc.vo.arap.basebill.BaseAggVO
 *  nc.vo.arap.basebill.BaseItemVO
 *  nc.vo.arap.bill.util.BillEventHandlerUtil
 *  nc.vo.arap.cache.FiPubDataCache
 *  nc.vo.arap.djlx.DjLXVO
 *  nc.vo.arap.payable.AggPayableBillVO
 *  nc.vo.arap.pf.PFCheckVO
 *  nc.vo.arap.pub.ArapBillTypeInfo
 *  nc.vo.arap.receivable.AggReceivableBillVO
 *  nc.vo.arap.service.ServiceVO
 *  nc.vo.arap.termitem.TermVO
 *  nc.vo.arap.utils.ArrayUtil
 *  nc.vo.fipub.billcode.FinanceBillCodeUtils
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.org.util.OrgPubUtil
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pub.lang.UFDouble
 *  nc.vo.pub.pfflow04.MessagedriveVO
 *  nc.vo.pubapp.pattern.model.entity.bill.IBill
 *  nc.vo.vorg.DeptVersionVO
 *  nccloud.commons.lang.ArrayUtils
 *  nccloud.commons.lang.StringUtils
 *  nccloud.putitf.riart.billtype.IBilltypeService
 *  org.apache.commons.collections4.CollectionUtils
 */
package nc.pubimpl.arap.bill;

import java.lang.reflect.Array;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import nc.bs.arap.actions.BillTempSaveBatchAction;
import nc.bs.arap.bill.ArapBillDAO;
import nc.bs.arap.bill.ArapBillPubUtil;
import nc.bs.arap.util.ArapBillType2TableMapping;
import nc.bs.arap.util.SqlUtils;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.framework.common.NCLocator;
import nc.bs.pf.pub.PfDataCache;
import nc.itf.arap.bill.IArapBillQueryBaseService;
import nc.itf.fipub.service.IArapEJBService;
import nc.itf.uap.IUAPQueryBS;
import nc.itf.uap.pf.IPFMetaModel;
import nc.itf.uap.pf.IWorkflowDefine;
import nc.md.persist.framework.MDPersistenceService;
import nc.pubitf.arap.bill.IArapBillPubService;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.arap.bill.util.BillEventHandlerUtil;
import nc.vo.arap.cache.FiPubDataCache;
import nc.vo.arap.djlx.DjLXVO;
import nc.vo.arap.payable.AggPayableBillVO;
import nc.vo.arap.pf.PFCheckVO;
import nc.vo.arap.pub.ArapBillTypeInfo;
import nc.vo.arap.receivable.AggReceivableBillVO;
import nc.vo.arap.service.ServiceVO;
import nc.vo.arap.termitem.TermVO;
import nc.vo.arap.utils.ArrayUtil;
import nc.vo.fipub.billcode.FinanceBillCodeUtils;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.org.util.OrgPubUtil;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pub.pfflow04.MessagedriveVO;
import nc.vo.pubapp.pattern.model.entity.bill.IBill;
import nc.vo.vorg.DeptVersionVO;
import nccloud.commons.lang.ArrayUtils;
import nccloud.commons.lang.StringUtils;
import nccloud.putitf.riart.billtype.IBilltypeService;
import org.apache.commons.collections4.CollectionUtils;

public class ArapBillPubServiceImpl
implements IArapBillPubService {
    public void delete(BaseAggVO[] bills) throws BusinessException {
        this.check(bills);
        List<ServiceVO> servicevos = this.constructServiceVO(bills, "delete");
        ((IArapEJBService)NCLocator.getInstance().lookup(IArapEJBService.class)).callBatchEJBService(servicevos.toArray(new ServiceVO[0]));
    }

    public void delete(BaseAggVO bill) throws BusinessException {
        this.delete(new BaseAggVO[]{bill});
    }

    public BaseAggVO save(BaseAggVO bill) throws BusinessException {
        return (BaseAggVO)ArrayUtil.getFirstInArrays((Object[])this.save(new BaseAggVO[]{bill}));
    }

    public BaseAggVO[] save(BaseAggVO[] bills) throws BusinessException {
        this.check(bills);
        List<ServiceVO> servicevos = this.constructServiceVO(bills, "save");
        Map callBatchEJBService = ((IArapEJBService)NCLocator.getInstance().lookup(IArapEJBService.class)).callBatchEJBService(servicevos.toArray(new ServiceVO[0]));
        Set retEntry = callBatchEJBService.entrySet();
        ArrayList<BaseAggVO> retList = new ArrayList<BaseAggVO>(callBatchEJBService.size());
        for (Map.Entry entry : retEntry) {
            if (entry.getValue().getClass().isArray()) {
                BaseAggVO[] array = (BaseAggVO[])entry.getValue();
                retList.addAll(Arrays.asList(array));
                continue;
            }
            retList.addAll((Collection)entry.getValue());
        }
        return retList.toArray(new BaseAggVO[0]);
    }

    private void check(BaseAggVO[] bills) throws BusinessException {
        if (ArrayUtils.isEmpty((Object[])bills)) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0359"));
        }
        HashSet<BaseAggVO> nonempties = new HashSet<BaseAggVO>();
        for (BaseAggVO vo : bills) {
            nonempties.add(vo);
        }
        if (nonempties.size() == 0) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0359"));
        }
    }

    public AggregatedValueObject update(BaseAggVO bill) throws BusinessException {
        this.setBillCode(new AggregatedValueObject[]{bill});
        return (AggregatedValueObject)ArrayUtil.getFirstInArrays((Object[])this.update(new BaseAggVO[]{bill}));
    }

    void setBillCode(AggregatedValueObject[] bills) throws BusinessException {
        FinanceBillCodeUtils util = ArapBillPubUtil.getBillCodeUtil((AggregatedValueObject[])new AggregatedValueObject[]{bills[0]});
        ArrayList<AggregatedValueObject> lastVo = new ArrayList<AggregatedValueObject>();
        for (AggregatedValueObject bill : bills) {
            if (util.isPrecode(bill)) continue;
            lastVo.add(bill);
        }
        if (lastVo.size() > 0) {
            ArapBillPubUtil.setBillCodes((AggregatedValueObject[])lastVo.toArray(new AggregatedValueObject[lastVo.size()]));
        }
    }

    public AggregatedValueObject[] update(BaseAggVO[] bills) throws BusinessException {
        this.check(bills);
        List<ServiceVO> servicevos = this.constructServiceVO(bills, "update");
        Map callBatchEJBService = ((IArapEJBService)NCLocator.getInstance().lookup(IArapEJBService.class)).callBatchEJBService(servicevos.toArray(new ServiceVO[0]));
        Set retEntry = callBatchEJBService.entrySet();
        ArrayList<BaseAggVO> retList = new ArrayList<BaseAggVO>(callBatchEJBService.size());
        for (Map.Entry entry : retEntry) {
            if (entry.getValue().getClass().isArray()) {
                BaseAggVO[] array = (BaseAggVO[])entry.getValue();
                retList.addAll(Arrays.asList(array));
                continue;
            }
            retList.addAll((Collection)entry.getValue());
        }
        return (AggregatedValueObject[])retList.toArray(new BaseAggVO[0]);
    }

    private List<ServiceVO> constructServiceVO(BaseAggVO[] bills, String methodName) {
        HashMap<String, HashSet<BaseAggVO>> billtype2pk = new HashMap<String, HashSet<BaseAggVO>>();
        for (BaseAggVO baseAggVO : bills) {
            HashSet<BaseAggVO> set = (HashSet<BaseAggVO>)billtype2pk.get(baseAggVO.getHeadVO().getPk_billtype());
            if (null == set) {
                set = new HashSet<BaseAggVO>();
                billtype2pk.put(baseAggVO.getHeadVO().getPk_billtype(), set);
            }
            set.add(baseAggVO);
        }
        ArrayList<ServiceVO> servicevos = new ArrayList<ServiceVO>();
        for (Map.Entry entry : billtype2pk.entrySet()) {
            String billtype = (String)entry.getKey();
            ServiceVO servicevo = new ServiceVO();
            servicevo.setMethodname(methodName);
            servicevo.setClassname(ArapBillType2TableMapping.getPubServiceByBilltype((String)((String)entry.getKey())));
            BaseAggVO[] superVO = ((Set)entry.getValue()).toArray(new BaseAggVO[0]);
            Class subVoClazz = ArapBillType2TableMapping.getVOClassByBilltype((String)billtype);
            IBill[] newSuperVO = (IBill[])Array.newInstance(subVoClazz, superVO.length);
            try {
                System.arraycopy(superVO, 0, newSuperVO, 0, superVO.length);
            }
            catch (ArrayStoreException ex) {
                for (int i = 0; i < newSuperVO.length; ++i) {
                    newSuperVO[i] = superVO[i];
                }
            }
            servicevo.setParam(new Object[]{newSuperVO});
            servicevo.setParamtype(new Class[]{Array.newInstance(subVoClazz, 0).getClass()});
            servicevos.add(servicevo);
        }
        return servicevos;
    }

    public BaseAggVO approve(BaseAggVO bill) throws BusinessException {
        return (BaseAggVO)ArrayUtil.getFirstInArrays((Object[])this.approve(new BaseAggVO[]{bill}));
    }

    public BaseAggVO[] approve(BaseAggVO[] bills) throws BusinessException {
        this.check(bills);
        for (BaseAggVO bill : bills) {
            if (bill == null) continue;
            bill.getHeadVO().setForceEffect(true);
        }
        List<ServiceVO> servicevos = this.constructServiceVO(bills, "approve");
        Map callBatchEJBService = ((IArapEJBService)NCLocator.getInstance().lookup(IArapEJBService.class)).callBatchEJBService(servicevos.toArray(new ServiceVO[0]));
        Set retEntry = callBatchEJBService.entrySet();
        ArrayList<BaseAggVO> retList = new ArrayList<BaseAggVO>(callBatchEJBService.size());
        for (Map.Entry entry : retEntry) {
            if (entry.getValue().getClass().isArray()) {
                BaseAggVO[] array = (BaseAggVO[])entry.getValue();
                retList.addAll(Arrays.asList(array));
                continue;
            }
            retList.addAll((Collection)entry.getValue());
        }
        return retList.toArray(new BaseAggVO[0]);
    }

    public BaseAggVO tempSave(BaseAggVO bill) throws BusinessException {
        return (BaseAggVO)ArrayUtil.getFirstInArrays((Object[])this.tempSave(new BaseAggVO[]{bill}));
    }

    public BaseAggVO[] tempSave(BaseAggVO[] bills) throws BusinessException {
        return (BaseAggVO[])ArrayUtil.convertSupers2Subs((Object[])new BillTempSaveBatchAction().insertVOs((AggregatedValueObject[])bills), BaseAggVO.class);
    }

    private String buildCacheKey(PFCheckVO vo) {
        return vo.getPk_group() + vo.getPk_org() + vo.getPk_tradetype() + vo.getOperator() + vo.getWorkflowtype();
    }

    private String buildCacheKey2(PFCheckVO vo) {
        return vo.getPk_tradetype() + vo.getPk_busitype();
    }

    public boolean messageDrive(PFCheckVO[] checkVOs) throws BusinessException {
        HashMap<String, Boolean> cache = new HashMap<String, Boolean>();
        IWorkflowDefine wfDefine = (IWorkflowDefine)NCLocator.getInstance().lookup(IWorkflowDefine.class);
        for (PFCheckVO check : checkVOs) {
            String key = this.buildCacheKey(check);
            if (cache.get(key) == null) {
                boolean flag = wfDefine.hasValidProcessDef(check.getPk_group(), check.getPk_tradetype(), check.getPk_org(), check.getOperator(), -1, check.getWorkflowtype());
                cache.put(key, flag);
            }
            if (!((Boolean)cache.get(key)).booleanValue()) continue;
            return true;
        }
        HashMap<String, Boolean> cache2 = new HashMap<String, Boolean>();
        IPFMetaModel pfmodel = (IPFMetaModel)NCLocator.getInstance().lookup(IPFMetaModel.class);
        for (PFCheckVO check : checkVOs) {
            String key = this.buildCacheKey2(check);
            if (cache2.get(key) != null) continue;
            MessagedriveVO[] msgVOs = pfmodel.queryAllMsgdrvVOs(check.getPk_tradetype(), check.getPk_busitype(), null);
            if (msgVOs == null || msgVOs.length == 0 || msgVOs[0] == null) {
                cache2.put(key, false);
            } else {
                cache2.put(key, true);
            }
            if (!((Boolean)cache2.get(key)).booleanValue()) continue;
            return true;
        }
        return false;
    }

    public String validateFlowBillCurr(AggregatedValueObject[] bills) {
        if (bills == null || bills.length == 0 || bills[0] == null) {
            return null;
        }
        String billtype = (String)bills[0].getParentVO().getAttributeValue("pk_billtype");
        if (billtype == null) {
            return null;
        }
        HashMap<String, String> topPkMap = new HashMap<String, String>();
        HashSet<String> topBilltypes = new HashSet<String>();
        for (AggregatedValueObject bill : bills) {
            CircularlyAccessibleValueObject[] childrenVO;
            for (CircularlyAccessibleValueObject child : childrenVO = bill.getChildrenVO()) {
                String top_billtype = (String)child.getAttributeValue("top_billtype");
                String top_itemid = (String)child.getAttributeValue("top_itemid");
                String pk_curr = (String)child.getAttributeValue("pk_currtype");
                if (top_billtype == null || top_billtype.trim().length() == 0 || top_itemid == null || top_itemid.trim().length() == 0 || pk_curr == null || pk_curr.trim().length() == 0) continue;
                topBilltypes.add(top_billtype);
                if (!top_billtype.equals("F0") && !top_billtype.equals("F1") && !top_billtype.equals("F2") && !top_billtype.equals("F3")) continue;
                topPkMap.put(top_itemid, pk_curr);
            }
        }
        if (topBilltypes.size() > 1) {
            return NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0523_0", "02006arappub0523-0054");
        }
        if (topBilltypes.size() == 0) {
            return null;
        }
        if (topPkMap.size() == 0) {
            return null;
        }
        return null;
    }

    public List<String> checkCancelPrintOfficialPrintStatus(BaseAggVO data, String[] primaryKeys) throws BusinessException {
        BaseAggVO[] vos;
        ArrayList<String> nopeOfficialPrint = new ArrayList<String>();
        String offPrtUser = null;
        for (BaseAggVO vo : vos = ((IArapBillQueryBaseService)NCLocator.getInstance().lookup(ArapBillTypeInfo.getInstance((Object)data).getBillQueryService())).findBillByPrimaryKey(primaryKeys)) {
            offPrtUser = vo.getHeadVO().getOfficialprintuser();
            if (offPrtUser != null && offPrtUser.trim().length() != 0) continue;
            nopeOfficialPrint.add(vo.getHeadVO().getBillno());
        }
        return nopeOfficialPrint;
    }

    public Map<String, Map<String, String>> getDeptPsnByOrg(BaseAggVO aggVo, boolean isall) throws BusinessException {
        String pk_org = aggVo.getHeadVO().getPk_org();
        String pk_group = aggVo.getHeadVO().getPk_group();
        String tradetype = aggVo.getHeadVO().getPk_tradetype();
        UFDate billdate = aggVo.getHeadVO().getBilldate();
        String creator = aggVo.getHeadVO().getCreator();
        DjLXVO billType = FiPubDataCache.getBillType((String)tradetype, (String)pk_group);
        String psndocpk = BillEventHandlerUtil.getPsndocByUserid((String)creator, (Object)pk_org);
        if (billType != null && billType.getIschangedeptpsn() != null && billType.getIschangedeptpsn().booleanValue() && !isall) {
            if (StringUtils.isNotEmpty((CharSequence)psndocpk)) {
                String deptDocid = "";
                String deptvDocid = "";
                aggVo.getHeadVO().setPk_psndoc(psndocpk);
                String pk_dept = BillEventHandlerUtil.getPsndocPubService().queryDeptByPandocIDAndPkorg(psndocpk, pk_org);
                if (StringUtils.isEmpty((CharSequence)pk_dept)) {
                    return null;
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
                        aggVo.getHeadVO().setPk_deptid(null);
                        aggVo.getHeadVO().setPk_deptid_v(null);
                    }
                }
                if (StringUtils.isNotEmpty((CharSequence)deptDocid) || StringUtils.isNotEmpty((CharSequence)deptvDocid)) {
                    CircularlyAccessibleValueObject[] childrenVO;
                    aggVo.getHeadVO().setPk_deptid(deptDocid);
                    aggVo.getHeadVO().setPk_deptid_v(deptvDocid);
                    for (CircularlyAccessibleValueObject vo : childrenVO = aggVo.getChildrenVO()) {
                        vo.setAttributeValue("pk_deptid", (Object)deptDocid);
                        vo.setAttributeValue("pk_deptid_v", (Object)deptvDocid);
                    }
                }
            }
        } else {
            Map psnDeptMap = BillEventHandlerUtil.getPsndocPubService().queryDeptIDByPsndocIDs(new String[]{psndocpk});
            Map<String, String> deptDeptvmap = this.queryPsnDeptVidall(pk_org, billdate, ((List)psnDeptMap.get(psndocpk)).toArray(new String[0]));
            HashMap<String, Map<String, String>> retmap = new HashMap<String, Map<String, String>>();
            retmap.put(psndocpk, deptDeptvmap);
            return retmap;
        }
        return null;
    }

    private String queryPsnDeptVid(String pk_org, UFDate date, String ... pk_depts) throws BusinessException {
        if (pk_depts == null || pk_depts.length == 0) {
            return null;
        }
        String where = "pk_org = '" + pk_org + "' and " + OrgPubUtil.getVersionFilterSubSql((UFDate)date, (String)DeptVersionVO.getDefaultTableName(), (String)"pk_dept", (boolean)true, (boolean)false) + " and " + nc.util.fi.pub.SqlUtils.getInStr((String)"pk_dept", (String[])pk_depts);
        Collection retVOs = ((IUAPQueryBS)NCLocator.getInstance().lookup(IUAPQueryBS.class)).retrieveByClause(DeptVersionVO.class, where);
        return retVOs == null || retVOs.isEmpty() ? null : ((DeptVersionVO)retVOs.iterator().next()).getPk_vid();
    }

    private Map<String, String> queryPsnDeptVidall(String pk_org, UFDate date, String[] pk_depts) throws BusinessException {
        if (pk_depts == null || pk_depts.length == 0) {
            return null;
        }
        HashMap<String, String> map = new HashMap<String, String>();
        String where = "pk_org = '" + pk_org + "' and " + OrgPubUtil.getVersionFilterSubSql((UFDate)date, (String)DeptVersionVO.getDefaultTableName(), (String)"pk_dept", (boolean)true, (boolean)false) + " and " + nc.util.fi.pub.SqlUtils.getInStr((String)"pk_dept", (String[])pk_depts);
        Collection retVOs = ((IUAPQueryBS)NCLocator.getInstance().lookup(IUAPQueryBS.class)).retrieveByClause(DeptVersionVO.class, where);
        if (CollectionUtils.isEmpty((Collection)retVOs)) {
            return null;
        }
        for (DeptVersionVO vo : retVOs) {
            map.put(vo.getPk_vid(), vo.getPk_dept());
        }
        return map;
    }

    public String getBilltypenameOfCurrLang(String billtype) throws BusinessException {
        String billtypename = PfDataCache.getBillType((String)billtype).getBilltypenameOfCurrLang();
        return billtypename;
    }

    public Map<String, String[]> isFromRedBackBill(Map<String, String[]> parm) throws BusinessException {
        if (parm == null || parm != null && parm.size() == 0) {
            return null;
        }
        ArapBillDAO dao = new ArapBillDAO();
        HashMap<String, String[]> retmap = new HashMap<String, String[]>();
        for (Map.Entry<String, String[]> p : parm.entrySet()) {
            String[] billids;
            String billtype = p.getKey();
            List redBillTopbillid = dao.getRedBillTopbillid(billtype, billids = p.getValue());
            if (redBillTopbillid == null) continue;
            retmap.put(billtype, redBillTopbillid.toArray(new String[0]));
        }
        return retmap;
    }

    public String getTranstypeApp(String transtypeOrbilltype) throws BusinessException {
        IBilltypeService bs = (IBilltypeService)NCLocator.getInstance().lookup(IBilltypeService.class);
        String pk_group = InvocationInfoProxy.getInstance().getGroupId();
        if (StringUtils.isEmpty((CharSequence)pk_group)) {
            return null;
        }
        boolean isTranstype = bs.isTranstype(transtypeOrbilltype, pk_group);
        if (!isTranstype) {
            return null;
        }
        Map map = new ArapBillDAO().getTranstypeApps(transtypeOrbilltype);
        if (map == null || map != null && map.size() == 0) {
            return null;
        }
        return (String)map.get(1);
    }

    public Map<String, Map<String, String>> isWriteBackFlow(String arapBillType, String[] itempks, String writebackBilltype) throws BusinessException {
        if (StringUtils.isEmpty((CharSequence)arapBillType) || ArrayUtils.isEmpty((Object[])itempks) || StringUtils.isEmpty((CharSequence)writebackBilltype)) {
            return null;
        }
        Map map = new HashMap();
        try {
            map = new ArapBillDAO().getTopSrcbillTypeByitemPks(arapBillType, itempks);
        }
        catch (SQLException e) {
            throw new BusinessException(e.getMessage());
        }
        if (map != null && map.size() == 0) {
            return null;
        }
        Map retmap = (Map)map.get(writebackBilltype);
        return retmap != null && retmap.size() == 0 ? null : retmap;
    }

    public List<AggregatedValueObject> getChildConstrByTerm(AggregatedValueObject[] bills) throws BusinessException {
        if (ArrayUtils.isEmpty((Object[])bills)) {
            return null;
        }
        String billtype = (String)bills[0].getParentVO().getAttributeValue("pk_billtype");
        if (!Arrays.asList("F0", "F1").contains(billtype)) {
            return null;
        }
        ArrayList<String> listKeys = new ArrayList<String>();
        for (AggregatedValueObject bill : bills) {
            listKeys.add(bill.getParentVO().getPrimaryKey());
        }
        ArrayList<AggregatedValueObject> newList = new ArrayList<AggregatedValueObject>();
        try {
            Collection terms = MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByCond(TermVO.class, SqlUtils.getInStr((String)"pk_bill", (String[])listKeys.toArray(new String[0]), (boolean[])new boolean[]{true}), true);
            for (AggregatedValueObject vo : bills) {
                ArrayList<BaseItemVO> newItems = new ArrayList<BaseItemVO>();
                for (CircularlyAccessibleValueObject sitem : vo.getChildrenVO()) {
                    int i = 0;
                    for (TermVO term : terms) {
                        if (!term.getPk_item().equals(sitem.getPrimaryKey())) continue;
                        ++i;
                        BaseItemVO newItem = (BaseItemVO)sitem.clone();
                        for (String attr : term.getAttributeNames()) {
                            if (attr.equals("prepay")) {
                                newItem.setPrepay(Integer.valueOf(term.getPrepay().booleanValue() ? 1 : 0));
                                continue;
                            }
                            if (attr.equals("supplier") || attr.equals("pk_balatype")) continue;
                            newItem.setAttributeValue(attr, term.getAttributeValue(attr));
                        }
                        if (i > 1) {
                            if ("F1".equals(billtype)) {
                                newItem.setLocal_tax_cr(UFDouble.ZERO_DBL);
                                newItem.setLocal_notax_cr(UFDouble.ZERO_DBL);
                                newItem.setNotax_cr(UFDouble.ZERO_DBL);
                                newItem.setGlobalnotax_cre(UFDouble.ZERO_DBL);
                                newItem.setGlobaltax_cre(UFDouble.ZERO_DBL);
                                newItem.setGroupnotax_cre(UFDouble.ZERO_DBL);
                                newItem.setGlobaltax_cre(UFDouble.ZERO_DBL);
                                newItem.setCaltaxmny(UFDouble.ZERO_DBL);
                                newItem.setNosubtax(UFDouble.ZERO_DBL);
                            } else {
                                newItem.setLocal_tax_de(UFDouble.ZERO_DBL);
                                newItem.setLocal_notax_de(UFDouble.ZERO_DBL);
                                newItem.setNotax_de(UFDouble.ZERO_DBL);
                                newItem.setGlobalnotax_de(UFDouble.ZERO_DBL);
                                newItem.setGlobaltax_de(UFDouble.ZERO_DBL);
                                newItem.setGroupnotax_de(UFDouble.ZERO_DBL);
                                newItem.setGlobaltax_de(UFDouble.ZERO_DBL);
                                newItem.setCaltaxmny(UFDouble.ZERO_DBL);
                                newItem.setNosubtax(UFDouble.ZERO_DBL);
                            }
                        }
                        newItems.add(newItem);
                    }
                }
                AggPayableBillVO bill = "F1".equals(billtype) ? new AggPayableBillVO() : new AggReceivableBillVO();
                bill.setParentVO((CircularlyAccessibleValueObject)vo.getParentVO().clone());
                bill.setChildrenVO((CircularlyAccessibleValueObject[])newItems.toArray(new BaseItemVO[0]));
                newList.add((AggregatedValueObject)bill);
            }
        }
        catch (SQLException e) {
            throw new BusinessException(e.getMessage());
        }
        return newList;
    }
}

