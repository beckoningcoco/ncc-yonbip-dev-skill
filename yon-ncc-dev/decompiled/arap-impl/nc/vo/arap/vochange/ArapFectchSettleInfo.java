/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.cmp.utils.NetPayHelper
 *  nc.itf.cmp.busi.ISettlementInfoFetcher
 *  nc.itf.fi.pub.SysInit
 *  nc.itf.uap.IUAPQueryBS
 *  nc.jdbc.framework.processor.ArrayProcessor
 *  nc.jdbc.framework.processor.ResultSetProcessor
 *  nc.md.persist.framework.MDPersistenceService
 *  nc.pubitf.uapbd.ICustomerPubService
 *  nc.pubitf.uapbd.ISupplierPubService
 *  nc.vo.arap.basebill.BaseAggVO
 *  nc.vo.arap.basebill.BaseBillVO
 *  nc.vo.arap.basebill.BaseItemVO
 *  nc.vo.arap.pub.BillEnumCollection$FromSystem
 *  nc.vo.arap.pub.BillEnumCollection$ObjType
 *  nc.vo.arap.utils.ARAPModuleEnableUtil
 *  nc.vo.arap.utils.StringUtil
 *  nc.vo.bd.cust.CustomerVO
 *  nc.vo.bd.freecustom.FreeCustomVO
 *  nc.vo.bd.supplier.SupplierVO
 *  nc.vo.cmp.netpay.NetPayHelperVO
 *  nc.vo.cmp.settlement.SettleMetaVO
 *  nc.vo.cmp.settlement.SettlementBodyVO
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pub.lang.UFDouble
 *  nc.vo.pubapp.pattern.pub.MapList
 */
package nc.vo.arap.vochange;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import nc.bs.framework.common.NCLocator;
import nc.cmp.utils.NetPayHelper;
import nc.itf.cmp.busi.ISettlementInfoFetcher;
import nc.itf.fi.pub.SysInit;
import nc.itf.uap.IUAPQueryBS;
import nc.jdbc.framework.processor.ArrayProcessor;
import nc.jdbc.framework.processor.ResultSetProcessor;
import nc.md.persist.framework.MDPersistenceService;
import nc.pubitf.uapbd.ICustomerPubService;
import nc.pubitf.uapbd.ISupplierPubService;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.arap.utils.ARAPModuleEnableUtil;
import nc.vo.arap.utils.StringUtil;
import nc.vo.bd.cust.CustomerVO;
import nc.vo.bd.freecustom.FreeCustomVO;
import nc.vo.bd.supplier.SupplierVO;
import nc.vo.cmp.netpay.NetPayHelperVO;
import nc.vo.cmp.settlement.SettleMetaVO;
import nc.vo.cmp.settlement.SettlementBodyVO;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.pub.MapList;

public class ArapFectchSettleInfo
implements ISettlementInfoFetcher {
    private static List<String> fts_billtype = Arrays.asList("36J1", "36J2", "36J3", "36J5", "36JA", "36JB", "36JC", "36JD");

    /*
     * WARNING - void declaration
     */
    public SettleMetaVO[] getSettleMetaInfo(Object bill) throws BusinessException {
        BaseAggVO bean = (BaseAggVO)bill;
        BaseBillVO head = (BaseBillVO)bean.getParentVO();
        BaseItemVO[] items = (BaseItemVO[])bean.getChildrenVO();
        ArrayList<SettlementBodyVO> metasList = new ArrayList<SettlementBodyVO>();
        MapList cussup = new MapList();
        Integer objtype = Integer.MIN_VALUE;
        for (BaseItemVO baseItemVO : items) {
            objtype = baseItemVO.getObjtype();
            if (BillEnumCollection.ObjType.CUSTOMER.VALUE.equals(objtype)) {
                String customer = baseItemVO.getCustomer();
                if (StringUtil.isEmpty((String)customer)) continue;
                cussup.put((Object)objtype, (Object)customer);
                continue;
            }
            if (BillEnumCollection.ObjType.SUPPLIER.VALUE.equals(objtype)) {
                String supplier = baseItemVO.getSupplier();
                if (StringUtil.isEmpty((String)supplier)) continue;
                cussup.put((Object)objtype, (Object)supplier);
                continue;
            }
            if (!BillEnumCollection.ObjType.DEP.VALUE.equals(objtype) && !BillEnumCollection.ObjType.PERSON.VALUE.equals(objtype)) continue;
        }
        HashMap<String, CustomerVO> mapCus = new HashMap<String, CustomerVO>();
        HashMap<String, SupplierVO> mapSup = new HashMap<String, SupplierVO>();
        try {
            if (cussup.get((Object)BillEnumCollection.ObjType.CUSTOMER.VALUE) != null) {
                CustomerVO[] customerInfo = this.getCustomerInfo(cussup.get((Object)BillEnumCollection.ObjType.CUSTOMER.VALUE).toArray(new String[0]));
                if (null == customerInfo || customerInfo.length == 0 || null == customerInfo[0]) {
                    throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0523_0", "02006arappub0523-0056", null, cussup.get((Object)BillEnumCollection.ObjType.CUSTOMER.VALUE).toArray(new String[0])));
                }
                CustomerVO[] customerVOArray = customerInfo;
                int supplier = customerVOArray.length;
                for (int i = 0; i < supplier; ++i) {
                    CustomerVO customerVO = customerVOArray[i];
                    mapCus.put(customerVO.getPk_customer(), customerVO);
                }
            }
            if (cussup.get((Object)BillEnumCollection.ObjType.SUPPLIER.VALUE) != null) {
                SupplierVO[] customerInfo = this.getSupplierInfo(cussup.get((Object)BillEnumCollection.ObjType.SUPPLIER.VALUE).toArray(new String[0]));
                if (null == customerInfo || customerInfo.length == 0 || null == customerInfo[0]) {
                    throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0523_0", "02006arappub0523-0057", null, cussup.get((Object)BillEnumCollection.ObjType.SUPPLIER.VALUE).toArray(new String[0])));
                }
                for (SupplierVO supplierVO : customerInfo) {
                    if (supplierVO == null) continue;
                    mapSup.put(supplierVO.getPk_supplier(), supplierVO);
                }
            }
        }
        catch (Exception e) {
            ExceptionHandler.handleRuntimeException((Exception)e);
        }
        HashMap<String, String> bankmap = new HashMap<String, String>();
        UFBoolean uFBoolean = UFBoolean.valueOf((boolean)false);
        boolean fbmEnabled = ARAPModuleEnableUtil.isFbmEnabled(null);
        if (fbmEnabled) {
            UFBoolean uFBoolean2 = SysInit.getParaBoolean((String)head.getPk_org(), (String)"FBM2002") == null ? UFBoolean.valueOf((boolean)false) : SysInit.getParaBoolean((String)head.getPk_org(), (String)"FBM2002");
        }
        for (BaseItemVO item : items) {
            void var11_23;
            if (UFBoolean.TRUE.equals((Object)item.getIsdiscount())) continue;
            SettlementBodyVO metavo = new SettlementBodyVO();
            metavo.setPk_currtype(item.getPk_currtype());
            metavo.setPk_group(item.getPk_group());
            metavo.setPk_org(item.getPk_org());
            metavo.setPk_org_v(item.getPk_org_v());
            metavo.setBillcode(head.getBillno());
            metavo.setBilldate(head.getBilldate());
            metavo.setPk_cashaccount(item.getCashaccount());
            int direction = 0;
            if (head.getBillclass().equals("ys") || head.getBillclass().equals("sk")) {
                direction = 0;
                metavo.setPk_oppaccount(item.getPayaccount());
                metavo.setPk_account(item.getRecaccount());
                metavo.setGroupreceivelocal(item.getGroupcrebit());
                metavo.setGlobalreceivelocal(item.getGlobalcrebit());
                metavo.setSystemcode(BillEnumCollection.FromSystem.AR.name().toLowerCase());
            } else if (head.getBillclass().equals("yf") || head.getBillclass().equals("fk")) {
                direction = 1;
                metavo.setPk_oppaccount(item.getRecaccount());
                metavo.setPk_account(item.getPayaccount());
                metavo.setGrouppaylocal(item.getGroupdebit());
                metavo.setGlobalpaylocal(item.getGlobaldebit());
                metavo.setSystemcode(BillEnumCollection.FromSystem.AP.name().toLowerCase());
            }
            String pk_oppaccount = metavo.getPk_oppaccount();
            if (!StringUtil.isEmpty((String)pk_oppaccount)) {
                String bankdocname = (String)bankmap.get(pk_oppaccount);
                if (StringUtil.isEmpty((String)bankdocname)) {
                    NetPayHelperVO opphelperVO = NetPayHelper.instance.getNetPayVO(pk_oppaccount);
                    bankdocname = opphelperVO.getBankdocname();
                    bankmap.put(pk_oppaccount, bankdocname);
                }
                metavo.setOppbank(bankdocname);
            }
            metavo.setAgentreceiveprimal(item.getAgentreceiveprimal());
            metavo.setAgentreceivelocal(item.getAgentreceivelocal());
            metavo.setBusilineno(item.getRowno());
            metavo.setGrouprate(item.getGrouprate());
            metavo.setGlobalrate(item.getGlobalrate());
            metavo.setDirection(Integer.valueOf(direction));
            metavo.setLocalrate(item.getRate());
            metavo.setMemo(item.getScomment());
            metavo.setPay(this.nvl(item.getMoney_de()));
            metavo.setPaylocal(this.nvl(item.getLocal_money_de()));
            metavo.setReceive(this.nvl(item.getMoney_cr()));
            metavo.setReceivelocal(this.nvl(item.getLocal_money_cr()));
            metavo.setPk_billtype(head.getPk_tradetype());
            metavo.setPk_bill(head.getPrimaryKey());
            metavo.setPk_billdetail(item.getChildrenPK());
            metavo.setPk_rescenter(item.getPk_deptid_res());
            metavo.setPk_notetype(item.getChecktype());
            if (!var11_23.booleanValue()) {
                metavo.setNotenumber(item.getCheckno());
            } else {
                metavo.setPk_notenumber(item.getCheckno());
                metavo.setNotenumber(item.getCheckno());
            }
            metavo.setCommpaystatus(item.getCommpaystatus());
            metavo.setCommpaytype(item.getCommpaytype());
            metavo.setRefusereason(item.getRefuse_reason());
            metavo.setPk_ftsbilldetail(item.getTop_itemid());
            if (fts_billtype.contains(item.getTop_billtype())) {
                metavo.setPk_ftsbill(item.getTop_billid());
                metavo.setPk_ftsbilldetail(item.getTop_itemid());
            }
            metavo.setPk_currtype(item.getPk_currtype());
            metavo.setTradertype(item.getObjtype());
            if (item.getObjtype().equals(BillEnumCollection.ObjType.CUSTOMER.VALUE)) {
                metavo.setPk_trader(item.getCustomer());
            } else if (item.getObjtype().equals(BillEnumCollection.ObjType.SUPPLIER.VALUE)) {
                metavo.setPk_trader(item.getSupplier());
            } else if (item.getObjtype().equals(BillEnumCollection.ObjType.PERSON.VALUE)) {
                metavo.setPk_trader(item.getPk_psndoc());
            } else if (item.getObjtype().equals(BillEnumCollection.ObjType.DEP.VALUE)) {
                metavo.setPk_trader(item.getPk_deptid());
            }
            if (!StringUtil.isEmpty((String)item.getFreecust())) {
                metavo.setTradertype(Integer.valueOf(4));
                FreeCustomVO freeCustVO = null;
                try {
                    IUAPQueryBS bs;
                    Object[] result;
                    freeCustVO = (FreeCustomVO)MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByPK(FreeCustomVO.class, item.getFreecust(), false);
                    if (head.getBillclass().equals("sk")) {
                        metavo.setOppaccount(freeCustVO.getBankaccount());
                        metavo.setPk_oppaccount(null);
                    } else if (head.getBillclass().equals("fk")) {
                        metavo.setOppaccount(freeCustVO.getBankaccount());
                        metavo.setPk_oppaccount(null);
                    }
                    metavo.setOppaccname(freeCustVO.getName());
                    metavo.setPk_oppbank(freeCustVO.getBank());
                    metavo.setAccounttype(freeCustVO.getAccountproperty());
                    if (freeCustVO != null && (result = (Object[])(bs = (IUAPQueryBS)NCLocator.getInstance().lookup(IUAPQueryBS.class)).executeQuery("select name from bd_bankdoc where pk_bankdoc='" + freeCustVO.getBank() + "'", (ResultSetProcessor)new ArrayProcessor())) != null && result.length != 0 && result[0] != null) {
                        metavo.setOppbank((String)result[0]);
                    }
                }
                catch (Exception e) {
                    ExceptionHandler.consume((Throwable)e);
                }
            }
            metavo.setPk_psndoc(item.getPk_psndoc());
            metavo.setPk_costsubj(item.getPk_subjcode());
            metavo.setPk_plansubj(item.getBankrollprojet());
            metavo.setTranstype(Integer.valueOf(1));
            metavo.setPk_billbalatype(item.getPk_balatype());
            metavo.setPk_balatype(item.getPk_balatype());
            metavo.setFundsflag(Integer.valueOf(0));
            try {
                CustomerVO vo;
                if (item.getBillclass().equals("sk")) {
                    metavo.setPk_cubasdoc(item.getCustomer());
                    vo = (CustomerVO)mapCus.get(item.getCustomer());
                    if (null != vo) {
                        boolean outer = vo.getCustprop() == 0;
                        metavo.setTranstype(Integer.valueOf(outer ? 1 : 0));
                        if (!outer) {
                            metavo.setPk_innerorg(vo.getPk_financeorg());
                        }
                    }
                    metavo.setPk_busiorg(item.getSo_org());
                    metavo.setPk_busiorg_v(item.getSo_org_v());
                }
                if (item.getBillclass().equals("fk")) {
                    metavo.setPk_cubasdoc(item.getSupplier());
                    vo = (SupplierVO)mapSup.get(item.getSupplier());
                    if (null != vo) {
                        boolean outer = vo.getSupprop() == 0;
                        metavo.setTranstype(Integer.valueOf(outer ? 1 : 0));
                        if (!outer) {
                            metavo.setPk_innerorg(vo.getPk_financeorg());
                        }
                    }
                    metavo.setPk_busiorg(item.getPu_org());
                    metavo.setPk_busiorg_v(item.getPu_org_v());
                }
            }
            catch (Exception e) {
                ExceptionHandler.handleRuntimeException((Exception)e);
            }
            metavo.setPk_job(item.getProject());
            metavo.setPk_jobphase(item.getProject_task());
            metavo.setPk_cashflow(item.getCashitem());
            metavo.setPk_deptdoc(item.getPk_deptid());
            metavo.setPk_invbasdoc(item.getMaterial());
            metavo.setPk_busitype(head.getPk_busitype());
            metavo.setPayreason((String)item.getAttributeValue("payreason"));
            metavo.setBankrelated_code(item.getBankrelated_code());
            metavo.setPk_pcorg(item.getPk_pcorg());
            metavo.setPk_pcorg_v(item.getPk_pcorg_v());
            metavo.setTranserial((String)item.getAttributeValue("transerial"));
            if (head.getBillclass().equals("fk")) {
                metavo.setDirect_ecds(item.getDirect_checkno());
            }
            metavo.setOlcratetype(item.getPk_ratetype());
            metavo.setOlcratedate(item.getRatedate());
            metasList.add(metavo);
        }
        return (SettleMetaVO[])metasList.toArray(new SettlementBodyVO[0]);
    }

    private UFDouble nvl(UFDouble money) {
        if (money == null) {
            return money;
        }
        if (UFDouble.ZERO_DBL.compareTo((Object)money) == 0) {
            return null;
        }
        return money;
    }

    public CustomerVO[] getCustomerInfo(String[] pk_customer) throws BusinessException {
        if (null == pk_customer) {
            return null;
        }
        return ((ICustomerPubService)NCLocator.getInstance().lookup(ICustomerPubService.class)).getCustomerVO(pk_customer, new String[]{"custprop", "pk_org", "pk_financeorg", "pk_customer"});
    }

    public SupplierVO[] getSupplierInfo(String[] pk_customer) throws BusinessException {
        if (null == pk_customer) {
            return null;
        }
        return ((ISupplierPubService)NCLocator.getInstance().lookup(ISupplierPubService.class)).getSupplierVO(pk_customer, new String[]{"supprop", "pk_org", "pk_financeorg", "pk_supplier"});
    }
}

