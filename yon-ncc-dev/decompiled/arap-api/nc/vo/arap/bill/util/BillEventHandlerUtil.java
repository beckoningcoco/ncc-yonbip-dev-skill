/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.itf.bd.fundplan.IFundPlanQryService
 *  nc.itf.bd.psn.psndoc.IPsndocQueryService
 *  nc.itf.bd.recpaytype.IRecpaytypeQueryService
 *  nc.itf.scmpub.reference.uap.bd.material.MaterialPubService
 *  nc.md.persist.framework.MDPersistenceService
 *  nc.pubitf.rbac.IUserPubService
 *  nc.pubitf.uapbd.IBankaccPubQueryService
 *  nc.pubitf.uapbd.IBankaccPubService
 *  nc.pubitf.uapbd.ICustomerPubService
 *  nc.pubitf.uapbd.INotetypePubService
 *  nc.pubitf.uapbd.IPsndocPubService
 *  nc.pubitf.uapbd.ISupplierPubService
 *  nc.vo.bd.bankaccount.BankAccSubVO
 *  nc.vo.bd.cust.CustomerVO
 *  nc.vo.bd.fundplan.FundPlanVO
 *  nc.vo.bd.material.MaterialVO
 *  nc.vo.bd.notetype.NotetypeVO
 *  nc.vo.bd.psn.PsndocVO
 *  nc.vo.bd.psn.PsnjobVO
 *  nc.vo.bd.supplier.SupplierVO
 *  nc.vo.fibd.RecpaytypeVO
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.fipub.utils.SqlBuilder
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFBoolean
 *  nccloud.commons.lang.StringUtils
 *  org.apache.commons.lang3.ArrayUtils
 */
package nc.vo.arap.bill.util;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import nc.bs.arap.util.SqlUtils;
import nc.bs.framework.common.NCLocator;
import nc.itf.arap.pub.IArapBillService;
import nc.itf.bd.fundplan.IFundPlanQryService;
import nc.itf.bd.psn.psndoc.IPsndocQueryService;
import nc.itf.bd.recpaytype.IRecpaytypeQueryService;
import nc.itf.scmpub.reference.uap.bd.material.MaterialPubService;
import nc.md.persist.framework.MDPersistenceService;
import nc.pubitf.rbac.IUserPubService;
import nc.pubitf.uapbd.IBankaccPubQueryService;
import nc.pubitf.uapbd.IBankaccPubService;
import nc.pubitf.uapbd.ICustomerPubService;
import nc.pubitf.uapbd.INotetypePubService;
import nc.pubitf.uapbd.IPsndocPubService;
import nc.pubitf.uapbd.ISupplierPubService;
import nc.vo.bd.bankaccount.BankAccSubVO;
import nc.vo.bd.cust.CustomerVO;
import nc.vo.bd.fundplan.FundPlanVO;
import nc.vo.bd.material.MaterialVO;
import nc.vo.bd.notetype.NotetypeVO;
import nc.vo.bd.psn.PsndocVO;
import nc.vo.bd.psn.PsnjobVO;
import nc.vo.bd.supplier.SupplierVO;
import nc.vo.fibd.RecpaytypeVO;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.fipub.utils.SqlBuilder;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFBoolean;
import nccloud.commons.lang.StringUtils;
import org.apache.commons.lang3.ArrayUtils;

public class BillEventHandlerUtil {
    private static final Map<String, Integer> Map = new HashMap<String, Integer>();
    private static final Map<String, Integer> attrMap = new HashMap<String, Integer>();
    private static final Map<String, String[]> psnBankacc_Map = new HashMap<String, String[]>();
    private static final Map<String, String[]> cusBankacc_Map = new HashMap<String, String[]>();
    private static final Map<String, String[]> supBankacc_Map = new HashMap<String, String[]>();
    private static final Map<String, CustomerVO> customer_Map = new HashMap<String, CustomerVO>();
    private static final Map<String, SupplierVO> supplier_Map = new HashMap<String, SupplierVO>();
    private static final Map<String, BankAccSubVO> bankAccSubVO_Map = new HashMap<String, BankAccSubVO>();
    private static Map<String, RecpaytypeVO> recPaytypeVO_Map = new HashMap<String, RecpaytypeVO>();
    private static Map<String, FundPlanVO> fundPlanVO_Map = new HashMap<String, FundPlanVO>();
    private static Map<String, String> userdoc_Map = new HashMap<String, String>();
    private static Map<String, String> deptdoc_Map = new HashMap<String, String>();
    private static INotetypePubService noteTypePubService = null;
    private static IBankaccPubService bankaccPubService = null;
    private static IPsndocPubService psndocPubService = null;
    private static IPsndocQueryService psndocQueryService = null;
    private static Map<String, String> defaultCusAcc_Map = new HashMap<String, String>();
    private static Map<String, String> defaultSupAcc_Map = new HashMap<String, String>();
    private static Map<String, MaterialVO> meterialBase_Map;
    private static final Map<String, Map<String, Object>> cuspAfterEditHandler;

    public static void setCuspAfterEditHandler(String pk_customer, String pk_org) {
        if (StringUtils.isEmpty((CharSequence)pk_customer) || StringUtils.isEmpty((CharSequence)pk_org)) {
            return;
        }
        if (null == cuspAfterEditHandler.get(pk_customer + pk_org)) {
            Map<String, Object> customerMap = null;
            try {
                customerMap = ((IArapBillService)NCLocator.getInstance().lookup(IArapBillService.class)).queryCustomerMap(pk_customer, pk_org);
            }
            catch (BusinessException e) {
                ExceptionHandler.consume((Throwable)e);
            }
            cuspAfterEditHandler.put(pk_customer + pk_org, customerMap);
        }
    }

    public static Map<String, Map<String, Object>> getCuspAfterEditHandler() {
        return cuspAfterEditHandler;
    }

    public static Integer getNoteClassByPK(String pk_noteType) {
        NotetypeVO vo;
        if (StringUtils.isEmpty((CharSequence)pk_noteType)) {
            return null;
        }
        if (null == Map.get(pk_noteType) && null != (vo = BillEventHandlerUtil.getNoteTypeVO(pk_noteType))) {
            Map.put(vo.getPk_notetype(), vo.getNoteclass());
        }
        return Map.get(pk_noteType);
    }

    private static NotetypeVO getNoteTypeVO(String pk_noteType) {
        if (StringUtils.isEmpty((CharSequence)pk_noteType)) {
            return null;
        }
        INotetypePubService noteTypePubService = BillEventHandlerUtil.getNoteTypePubService();
        NotetypeVO vo = null;
        try {
            vo = noteTypePubService.queryNotetypeVOByPk(pk_noteType);
        }
        catch (BusinessException e) {
            ExceptionHandler.consume((Throwable)e);
        }
        return vo;
    }

    public static Integer getNoteAttrByPK(String pk_noteType) {
        NotetypeVO vo;
        if (StringUtils.isEmpty((CharSequence)pk_noteType)) {
            return null;
        }
        if (null == attrMap.get(pk_noteType) && null != (vo = BillEventHandlerUtil.getNoteTypeVO(pk_noteType))) {
            attrMap.put(vo.getPk_notetype(), vo.getNoteattr());
        }
        return attrMap.get(pk_noteType);
    }

    public static String[] getPsnBankAccs(String pk_psndoc) {
        if (StringUtils.isEmpty((CharSequence)pk_psndoc)) {
            return null;
        }
        if (null == psnBankacc_Map.get(pk_psndoc)) {
            String[] psnBankaccs = null;
            try {
                psnBankaccs = BillEventHandlerUtil.getPsndocPubService().queryPsnBankaccIDByPsndocPks(pk_psndoc);
            }
            catch (BusinessException e) {
                ExceptionHandler.consume((Throwable)e);
            }
            psnBankacc_Map.put(pk_psndoc, psnBankaccs);
        }
        return psnBankacc_Map.get(pk_psndoc);
    }

    public static String getPsndocByUserid(String userid, Object pk_org) {
        if (pk_org == null) {
            return null;
        }
        if (StringUtils.isEmpty((CharSequence)userid)) {
            return null;
        }
        String key = userid + pk_org;
        try {
            String psndoc = ((IUserPubService)NCLocator.getInstance().lookup(IUserPubService.class)).queryPsndocByUserid(userid);
            PsndocVO[] psnvos = ((IPsndocQueryService)NCLocator.getInstance().lookup(IPsndocQueryService.class)).queryPsndocByPks(new String[]{psndoc});
            if (null == userdoc_Map.get(key)) {
                if (!StringUtils.isEmpty((CharSequence)psndoc) && psnvos != null && psnvos.length != 0 && !pk_org.toString().equals(psnvos[0].getPk_org())) {
                    PsnjobVO[] psnjobs = psnvos[0].getPsnjobs();
                    if (psnjobs != null && psnjobs.length > 0) {
                        boolean contains = false;
                        for (PsnjobVO psnjob : psnjobs) {
                            if (!UFBoolean.TRUE.equals((Object)psnjob.getIsmainjob()) && !pk_org.toString().equals(psnjob.getPk_org())) continue;
                            contains = true;
                            break;
                        }
                        if (!contains) {
                            psndoc = null;
                        }
                    } else {
                        psndoc = null;
                    }
                }
                userdoc_Map.put(key, psndoc);
            }
        }
        catch (BusinessException e) {
            ExceptionHandler.consume((Throwable)e);
        }
        return userdoc_Map.get(key);
    }

    public static String getDeptDocByPsnid(String psnid) {
        if (StringUtils.isEmpty((CharSequence)psnid)) {
            return null;
        }
        if (null == deptdoc_Map.get(psnid)) {
            try {
                Map deptIDByPsndocIDMap = ((IPsndocPubService)NCLocator.getInstance().lookup(IPsndocPubService.class)).queryDeptIDByPsndocIDs(new String[]{psnid});
                if (deptIDByPsndocIDMap.get(psnid) != null && ((List)deptIDByPsndocIDMap.get(psnid)).size() > 0) {
                    deptdoc_Map.put(psnid, (String)((List)deptIDByPsndocIDMap.get(psnid)).get(0));
                }
            }
            catch (BusinessException e) {
                ExceptionHandler.consume((Throwable)e);
            }
        }
        return deptdoc_Map.get(psnid);
    }

    public static String[] getCusBankAccs(String pk_cusdoc) {
        if (StringUtils.isEmpty((CharSequence)pk_cusdoc)) {
            return null;
        }
        if (null == cusBankacc_Map.get(pk_cusdoc)) {
            String[] cusBankaccs = null;
            try {
                cusBankaccs = ((IBankaccPubQueryService)NCLocator.getInstance().lookup(IBankaccPubQueryService.class)).queryBankaccPksByCustPk(pk_cusdoc);
            }
            catch (BusinessException e) {
                ExceptionHandler.consume((Throwable)e);
            }
            cusBankacc_Map.put(pk_cusdoc, cusBankaccs);
        }
        return cusBankacc_Map.get(pk_cusdoc);
    }

    public static CustomerVO getCustomerVO(String pk_cusdoc) {
        if (StringUtils.isEmpty((CharSequence)pk_cusdoc)) {
            return null;
        }
        if (null == customer_Map.get(pk_cusdoc)) {
            try {
                CustomerVO vo = (CustomerVO)MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByPK(CustomerVO.class, pk_cusdoc, false);
                if (vo != null) {
                    customer_Map.put(vo.getPrimaryKey(), vo);
                }
            }
            catch (BusinessException e) {
                ExceptionHandler.consume((Throwable)e);
            }
        }
        return customer_Map.get(pk_cusdoc);
    }

    public static SupplierVO getSupplierVO(String pk_cusdoc) {
        if (StringUtils.isEmpty((CharSequence)pk_cusdoc)) {
            return null;
        }
        if (null == supplier_Map.get(pk_cusdoc)) {
            try {
                SupplierVO vo = (SupplierVO)MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByPK(SupplierVO.class, pk_cusdoc, false);
                if (vo != null) {
                    supplier_Map.put(vo.getPrimaryKey(), vo);
                }
            }
            catch (BusinessException e) {
                ExceptionHandler.consume((Throwable)e);
            }
        }
        return supplier_Map.get(pk_cusdoc);
    }

    public static String[] getSupBankAccs(String pk_supdoc) {
        if (StringUtils.isEmpty((CharSequence)pk_supdoc)) {
            return null;
        }
        if (null == supBankacc_Map.get(pk_supdoc)) {
            String[] supBankAccs = null;
            try {
                supBankAccs = ((IBankaccPubQueryService)NCLocator.getInstance().lookup(IBankaccPubQueryService.class)).queryBankaccPksByCustPk(pk_supdoc);
            }
            catch (BusinessException e) {
                ExceptionHandler.consume((Throwable)e);
            }
            supBankacc_Map.put(pk_supdoc, supBankAccs);
        }
        return supBankacc_Map.get(pk_supdoc);
    }

    public static INotetypePubService getNoteTypePubService() {
        if (null == noteTypePubService) {
            noteTypePubService = (INotetypePubService)NCLocator.getInstance().lookup(INotetypePubService.class.getName());
        }
        return noteTypePubService;
    }

    public static IBankaccPubService getBankaccPubService() {
        if (null == bankaccPubService) {
            bankaccPubService = (IBankaccPubService)NCLocator.getInstance().lookup(IBankaccPubService.class.getName());
        }
        return bankaccPubService;
    }

    public static IPsndocPubService getPsndocPubService() {
        if (null == psndocPubService) {
            psndocPubService = (IPsndocPubService)NCLocator.getInstance().lookup(IPsndocPubService.class.getName());
        }
        return psndocPubService;
    }

    public static IPsndocQueryService getPsndocQueryService() {
        if (null == psndocQueryService) {
            psndocQueryService = (IPsndocQueryService)NCLocator.getInstance().lookup(IPsndocQueryService.class.getName());
        }
        return psndocQueryService;
    }

    public static String getFundplan(String pk_fundplan) {
        if (StringUtils.isEmpty((CharSequence)pk_fundplan)) {
            return null;
        }
        FundPlanVO fundPlanVO = fundPlanVO_Map.get(pk_fundplan);
        if (null == fundPlanVO) {
            try {
                fundPlanVO = ((IFundPlanQryService)NCLocator.getInstance().lookup(IFundPlanQryService.class)).queryFundPlanVOByPk(pk_fundplan);
            }
            catch (BusinessException e) {
                ExceptionHandler.consume((Throwable)e);
            }
            fundPlanVO_Map.put(pk_fundplan, fundPlanVO);
        }
        return fundPlanVO == null ? "~" : fundPlanVO.getPk_cashflow();
    }

    public static RecpaytypeVO getRecpaytype(String recpaytype) {
        if (StringUtils.isEmpty((CharSequence)recpaytype)) {
            return null;
        }
        RecpaytypeVO vo = null;
        try {
            RecpaytypeVO[] queryRecpaytype = ((IRecpaytypeQueryService)NCLocator.getInstance().lookup(IRecpaytypeQueryService.class)).queryRecpaytype("pk_recpaytype='" + recpaytype + "'");
            if (queryRecpaytype != null && queryRecpaytype.length > 0) {
                vo = queryRecpaytype[0];
            }
        }
        catch (BusinessException e) {
            ExceptionHandler.consume((Throwable)e);
        }
        return vo;
    }

    public static Map<String, RecpaytypeVO> getRecpaytype(String[] recpaytype) throws SQLException {
        if (ArrayUtils.isEmpty((Object[])recpaytype)) {
            return null;
        }
        HashMap<String, RecpaytypeVO> retMap = new HashMap<String, RecpaytypeVO>();
        try {
            SqlBuilder sqlWhere = new SqlBuilder();
            sqlWhere.append(SqlUtils.getInStr("pk_recpaytype", recpaytype, true));
            Object[] queryRecpaytype = ((IRecpaytypeQueryService)NCLocator.getInstance().lookup(IRecpaytypeQueryService.class)).queryRecpaytype(sqlWhere.toString());
            if (!ArrayUtils.isEmpty((Object[])queryRecpaytype)) {
                for (Object vo : queryRecpaytype) {
                    retMap.put(vo.getPk_recpaytype(), (RecpaytypeVO)vo);
                }
            }
        }
        catch (BusinessException e) {
            ExceptionHandler.consume((Throwable)e);
        }
        return retMap;
    }

    public static String getDefautCusBankAccs(String pk_cusdoc) {
        if (StringUtils.isEmpty((CharSequence)pk_cusdoc)) {
            return null;
        }
        if (null == defaultCusAcc_Map.get(pk_cusdoc)) {
            String cusBankaccs = null;
            try {
                cusBankaccs = ((ICustomerPubService)NCLocator.getInstance().lookup(ICustomerPubService.class)).getDefaultBankAcc(pk_cusdoc);
            }
            catch (BusinessException e) {
                ExceptionHandler.consume((Throwable)e);
            }
            if (cusBankaccs == null) {
                cusBankaccs = "";
            }
            defaultCusAcc_Map.put(pk_cusdoc, cusBankaccs);
        }
        return defaultCusAcc_Map.get(pk_cusdoc);
    }

    public static String getDefaultSupBankAccs(String pk_supplierdoc) {
        if (StringUtils.isEmpty((CharSequence)pk_supplierdoc)) {
            return null;
        }
        if (null == defaultSupAcc_Map.get(pk_supplierdoc)) {
            String cusBankaccs = null;
            try {
                cusBankaccs = ((ISupplierPubService)NCLocator.getInstance().lookup(ISupplierPubService.class)).getDefaultBankAcc(pk_supplierdoc);
            }
            catch (BusinessException e) {
                ExceptionHandler.consume((Throwable)e);
            }
            if (cusBankaccs == null) {
                cusBankaccs = "";
            }
            defaultSupAcc_Map.put(pk_supplierdoc, cusBankaccs);
        }
        return defaultSupAcc_Map.get(pk_supplierdoc);
    }

    public static String getProdlineByMaterial(String material) {
        Map mVO;
        if (StringUtils.isEmpty((CharSequence)material)) {
            return null;
        }
        if (null == meterialBase_Map.get(material) && (mVO = MaterialPubService.queryMaterialBaseInfo((String[])new String[]{material}, (String[])new String[]{"pk_prodline"})) != null && mVO.size() > 0) {
            meterialBase_Map.put(material, (MaterialVO)mVO.get(material));
        }
        return null == meterialBase_Map.get(material) ? null : meterialBase_Map.get(material).getPk_prodline();
    }

    public static String getDefaultBankSubAccCurrtypeByAccpk(String pk_bankaccsub) {
        if (StringUtils.isEmpty((CharSequence)pk_bankaccsub)) {
            return null;
        }
        if (null == bankAccSubVO_Map.get(pk_bankaccsub)) {
            try {
                Map curr_subAccMap = ((IBankaccPubQueryService)NCLocator.getInstance().lookup(IBankaccPubQueryService.class)).queryBankAccSubByPk(new String[]{"pk_bankaccsub", "pk_currtype"}, new String[]{pk_bankaccsub});
                if (null != curr_subAccMap && curr_subAccMap.size() > 0) {
                    bankAccSubVO_Map.put(pk_bankaccsub, (BankAccSubVO)curr_subAccMap.get(pk_bankaccsub));
                }
            }
            catch (BusinessException e) {
                ExceptionHandler.consume((Throwable)e);
            }
        }
        return null == bankAccSubVO_Map.get(pk_bankaccsub) ? null : bankAccSubVO_Map.get(pk_bankaccsub).getPk_currtype();
    }

    static {
        cuspAfterEditHandler = new HashMap<String, Map<String, Object>>();
    }
}

