/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.util.BillEuroUtils
 *  nc.bs.dao.BaseDAO
 *  nc.bs.dao.DAOException
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.logging.Logger
 *  nc.bs.pf.pub.PfDataCache
 *  nc.bs.sec.esapi.NCESAPI
 *  nc.jdbc.framework.processor.ColumnProcessor
 *  nc.jdbc.framework.processor.ResultSetProcessor
 *  nc.md.model.MetaDataException
 *  nc.md.persist.framework.MDPersistenceService
 *  nc.pubitf.arap.pub.ICurrentVersionService
 *  nc.pubitf.bd.accessor.GeneralAccessorFactory
 *  nc.pubitf.org.IAccountingBookPubService
 *  nc.pubitf.uapbd.IAccountPubService
 *  nc.pubitf.uapbd.TaxcodeUtil
 *  nc.pubitf.uapbd.taxcode.TaxrateQueryVO
 *  nc.util.fi.pub.SqlUtils
 *  nc.vo.arap.basebill.BaseAggVO
 *  nc.vo.arap.basebill.BaseBillVO
 *  nc.vo.arap.basebill.BaseItemVO
 *  nc.vo.arap.pub.BillEnumCollection$ApproveStatus
 *  nc.vo.arap.pub.BillEnumCollection$BillSatus
 *  nc.vo.arap.pub.BillEnumCollection$FromSystem
 *  nc.vo.arap.pub.BillEnumCollection$InureSign
 *  nc.vo.arap.pub.BillEnumCollection$ObjType
 *  nc.vo.arap.utils.StringUtil
 *  nc.vo.bd.accessor.IBDData
 *  nc.vo.bd.accessor.account.AccountDataAccessor
 *  nc.vo.bd.accessor.bankaccsub.BankaccsubBDDataVO
 *  nc.vo.bd.accessor.bankaccsub.IBankaccsubAccessor
 *  nc.vo.bd.account.AccountVO
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.org.AccountingBookVO
 *  nc.vo.org.OrgVO
 *  nc.vo.pf.pub.BusitypeVO
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.BusinessRuntimeException
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pub.lang.UFDateTime
 *  nc.vo.pub.lang.UFDouble
 *  nccloud.commons.lang.ArrayUtils
 *  nccloud.commons.lang.StringUtils
 */
package nccloud.pubimpl.arap.openapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import nc.bs.arap.util.BillEuroUtils;
import nc.bs.dao.BaseDAO;
import nc.bs.dao.DAOException;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.framework.common.NCLocator;
import nc.bs.logging.Logger;
import nc.bs.pf.pub.PfDataCache;
import nc.bs.sec.esapi.NCESAPI;
import nc.jdbc.framework.processor.ColumnProcessor;
import nc.jdbc.framework.processor.ResultSetProcessor;
import nc.md.model.MetaDataException;
import nc.md.persist.framework.MDPersistenceService;
import nc.pubitf.arap.pub.ICurrentVersionService;
import nc.pubitf.bd.accessor.GeneralAccessorFactory;
import nc.pubitf.org.IAccountingBookPubService;
import nc.pubitf.uapbd.IAccountPubService;
import nc.pubitf.uapbd.TaxcodeUtil;
import nc.pubitf.uapbd.taxcode.TaxrateQueryVO;
import nc.util.fi.pub.SqlUtils;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.arap.utils.StringUtil;
import nc.vo.bd.accessor.IBDData;
import nc.vo.bd.accessor.account.AccountDataAccessor;
import nc.vo.bd.accessor.bankaccsub.BankaccsubBDDataVO;
import nc.vo.bd.accessor.bankaccsub.IBankaccsubAccessor;
import nc.vo.bd.account.AccountVO;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.org.AccountingBookVO;
import nc.vo.org.OrgVO;
import nc.vo.pf.pub.BusitypeVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.BusinessRuntimeException;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.lang.UFDouble;
import nccloud.commons.lang.ArrayUtils;
import nccloud.commons.lang.StringUtils;

public class ArapBillConvert {
    public static List<String> list = Arrays.asList("pk_org", "pk_org_v", "pk_fiorg", "pk_fiorg_v", "sett_org_v", "pu_org_v", "so_org_v", "pk_group", "pk_billtype", "pk_tradetype", "pk_tradetypeid", "billclass", "billdate", "busidate", "syscode", "src_syscode", "pk_currtype");

    public void convertVO(SuperVO vo) {
        String[] attrnames = vo.getAttributeNames();
        Object pk_currtype = vo.getAttributeValue("pk_currtype");
        if (pk_currtype != null) {
            vo.setAttributeValue("pk_currtype", this.tranlate(vo, "pk_currtype", pk_currtype));
        }
        for (String attr : attrnames) {
            Object value = vo.getAttributeValue(attr);
            if (list.contains(attr) || value == null) continue;
            value = this.tranlate(vo, attr, value);
            vo.setAttributeValue(attr, value);
        }
    }

    public void setBillCommonValue(BaseAggVO aggvo) throws BusinessException {
        BaseItemVO[] itemVOs;
        String so_org_v;
        String pu_org_v;
        String pk_pcorg_v;
        String so_deptid_v;
        String pu_deptid_v;
        BaseBillVO headvo = aggvo.getHeadVO();
        Integer src_syscode = headvo.getSrc_syscode();
        if (src_syscode == null) {
            headvo.setSrc_syscode(BillEnumCollection.FromSystem.WBJHPT.VALUE);
        }
        headvo.setPk_group(InvocationInfoProxy.getInstance().getGroupId());
        headvo.setCreator(InvocationInfoProxy.getInstance().getUserId());
        headvo.setCreationtime(new UFDateTime(System.currentTimeMillis()));
        headvo.setEffectstatus(BillEnumCollection.InureSign.NOINURE.VALUE);
        headvo.setBillstatus(BillEnumCollection.BillSatus.SAVE.VALUE);
        headvo.setApprovestatus(BillEnumCollection.ApproveStatus.NOSTATE.VALUE);
        headvo.setAttributeValue("saga_frozen", (Object)0);
        if (headvo.getIsinit() == null) {
            headvo.setIsinit(UFBoolean.FALSE);
        }
        String pk_billtypeid = PfDataCache.getBillType((String)headvo.getPk_tradetype()).getPk_billtypeid();
        headvo.setPk_tradetypeid(pk_billtypeid);
        String pk_org_v = headvo.getPk_org_v();
        ICurrentVersionService service = (ICurrentVersionService)NCLocator.getInstance().lookup(ICurrentVersionService.class);
        if (StringUtils.isEmpty((CharSequence)pk_org_v)) {
            pk_org_v = service.queryOrgPkVidByPKAndDate(headvo.getPk_org(), headvo.getBilldate());
            headvo.setPk_org_v(pk_org_v);
        }
        headvo.setPk_fiorg(headvo.getPk_org());
        headvo.setPk_fiorg_v(pk_org_v);
        String sett_org = headvo.getSett_org();
        if (StringUtils.isEmpty((CharSequence)sett_org) || headvo.getPk_org().equals(sett_org)) {
            headvo.setSett_org(headvo.getPk_org());
            headvo.setSett_org_v(pk_org_v);
        } else {
            String sett_org_v = service.queryOrgPkVidByPKAndDate(sett_org, headvo.getBilldate());
            headvo.setSett_org_v(sett_org_v);
        }
        String pk_billtype = headvo.getPk_billtype();
        String country = BillEuroUtils.getCountry((String)headvo.getSett_org());
        if ("F0".equals(pk_billtype) || "F2".equals(pk_billtype)) {
            headvo.setSendcountryid(country);
            headvo.setTaxcountryid(country);
        } else if ("F1".equals(pk_billtype) || "F3".equals(pk_billtype)) {
            headvo.setRececountryid(country);
            headvo.setTaxcountryid(country);
        }
        String pk_deptid_v = headvo.getPk_deptid_v();
        if (StringUtils.isEmpty((CharSequence)pk_deptid_v) && !StringUtils.isEmpty((CharSequence)headvo.getPk_deptid())) {
            pk_deptid_v = service.queryDeptPkVidByPKAndDate(headvo.getPk_deptid(), headvo.getBilldate());
            headvo.setPk_deptid_v(pk_deptid_v);
        }
        if (StringUtils.isEmpty((CharSequence)(pu_deptid_v = headvo.getPu_deptid_v())) && !StringUtils.isEmpty((CharSequence)headvo.getPu_deptid())) {
            pu_deptid_v = service.queryDeptPkVidByPKAndDate(headvo.getPu_deptid(), headvo.getBilldate());
            headvo.setPu_deptid_v(pu_deptid_v);
        }
        if (StringUtils.isEmpty((CharSequence)(so_deptid_v = headvo.getSo_deptid_v())) && !StringUtils.isEmpty((CharSequence)headvo.getSo_deptid())) {
            so_deptid_v = service.queryDeptPkVidByPKAndDate(headvo.getSo_deptid(), headvo.getBilldate());
            headvo.setSo_deptid_v(so_deptid_v);
        }
        if (StringUtils.isEmpty((CharSequence)(pk_pcorg_v = headvo.getPk_pcorg_v())) && !StringUtils.isEmpty((CharSequence)headvo.getPk_pcorg())) {
            pk_pcorg_v = service.queryOrgPkVidByPKAndDate(headvo.getPk_pcorg(), headvo.getBilldate());
            headvo.setPk_pcorg_v(pk_pcorg_v);
        }
        if (StringUtils.isEmpty((CharSequence)(pu_org_v = headvo.getPu_org_v())) && !StringUtils.isEmpty((CharSequence)headvo.getPu_org())) {
            pu_org_v = service.queryOrgPkVidByPKAndDate(headvo.getPu_org(), headvo.getBilldate());
            headvo.setPu_org_v(pu_org_v);
        }
        if (StringUtils.isEmpty((CharSequence)(so_org_v = headvo.getSo_org_v())) && !StringUtils.isEmpty((CharSequence)headvo.getSo_org())) {
            so_org_v = service.queryOrgPkVidByPKAndDate(headvo.getSo_org(), headvo.getBilldate());
            headvo.setSo_org_v(so_org_v);
        }
        if ((itemVOs = aggvo.getItems()) == null || itemVOs.length < 1) {
            return;
        }
        for (BaseItemVO itemvo : itemVOs) {
            itemvo.setPk_group(headvo.getPk_group());
            itemvo.setPk_org(headvo.getPk_org());
            itemvo.setPk_org_v(headvo.getPk_org_v());
            itemvo.setPk_fiorg(headvo.getPk_fiorg());
            itemvo.setPk_fiorg_v(headvo.getPk_fiorg_v());
            itemvo.setSett_org(headvo.getSett_org());
            itemvo.setSett_org_v(headvo.getSett_org_v());
            itemvo.setBillclass(headvo.getBillclass());
            itemvo.setPk_billtype(headvo.getPk_billtype());
            itemvo.setPk_tradetype(headvo.getPk_tradetype());
            itemvo.setPk_tradetypeid(headvo.getPk_tradetypeid());
            itemvo.setBusidate(headvo.getBusidate());
            itemvo.setBilldate(headvo.getBilldate());
        }
    }

    public void setBodyCommonValue(BaseAggVO aggvo) throws BusinessException {
        BaseItemVO[] itemVOs = aggvo.getItems();
        if (itemVOs == null || itemVOs.length < 1) {
            return;
        }
        BaseBillVO headvo = aggvo.getHeadVO();
        HashMap key2country = new HashMap();
        HashMap key2vat = new HashMap();
        HashMap<String, UFBoolean> key2opptaxFlag = new HashMap<String, UFBoolean>();
        HashMap<String, String> org2orgv = new HashMap<String, String>();
        HashMap<String, String> dept2deptv = new HashMap<String, String>();
        HashMap<String, Integer> key2taxtype = new HashMap<String, Integer>();
        ICurrentVersionService service = (ICurrentVersionService)NCLocator.getInstance().lookup(ICurrentVersionService.class);
        for (BaseItemVO itemvo : itemVOs) {
            Integer buySellType;
            OrgVO orgvo;
            List list;
            String sett_org;
            String taxcodeid = itemvo.getTaxcodeid();
            if (!StringUtils.isEmpty((CharSequence)taxcodeid)) {
                String key = taxcodeid + headvo.getBilldate();
                if (key2taxtype.containsKey(key)) {
                    TaxrateQueryVO vo = new TaxrateQueryVO();
                    vo.setTaxcodeid(taxcodeid);
                    vo.setBusinessDate(headvo.getBilldate());
                    try {
                        Object[] rate = TaxcodeUtil.getInstance().getTaxratesByTaxcodeIdAndDates(new TaxrateQueryVO[]{vo});
                        if (!ArrayUtils.isEmpty((Object[])rate) && rate[0] != null) {
                            key2taxtype.put(key, rate[0].getTaxtype());
                        }
                    }
                    catch (BusinessException e) {
                        ExceptionHandler.handleRuntimeException((Exception)((Object)e));
                    }
                }
                itemvo.setTaxtype((Integer)key2taxtype.get(key));
            } else {
                itemvo.setTaxtype(Integer.valueOf(1));
            }
            String pk_deptid_v = itemvo.getPk_deptid_v();
            String pk_deptid = itemvo.getPk_deptid();
            if (StringUtils.isEmpty((CharSequence)pk_deptid_v) && !StringUtils.isEmpty((CharSequence)pk_deptid)) {
                if (!dept2deptv.containsKey(pk_deptid)) {
                    pk_deptid_v = service.queryDeptPkVidByPKAndDate(pk_deptid, headvo.getBilldate());
                    dept2deptv.put(pk_deptid, pk_deptid_v);
                }
                itemvo.setPk_deptid_v((String)dept2deptv.get(pk_deptid));
            }
            String pu_deptid_v = itemvo.getPu_deptid_v();
            String pu_deptid = itemvo.getPu_deptid();
            if (StringUtils.isEmpty((CharSequence)pu_deptid_v) && !StringUtils.isEmpty((CharSequence)pu_deptid)) {
                if (!dept2deptv.containsKey(pu_deptid)) {
                    pu_deptid_v = service.queryDeptPkVidByPKAndDate(pu_deptid, headvo.getBilldate());
                    dept2deptv.put(pu_deptid, pu_deptid_v);
                }
                itemvo.setPu_deptid_v((String)dept2deptv.get(pu_deptid));
            }
            String so_deptid_v = itemvo.getSo_deptid_v();
            String so_deptid = itemvo.getSo_deptid();
            if (StringUtils.isEmpty((CharSequence)so_deptid_v) && !StringUtils.isEmpty((CharSequence)so_deptid)) {
                if (!dept2deptv.containsKey(so_deptid)) {
                    so_deptid_v = service.queryDeptPkVidByPKAndDate(so_deptid, headvo.getBilldate());
                    dept2deptv.put(so_deptid, so_deptid_v);
                }
                itemvo.setSo_deptid_v((String)dept2deptv.get(so_deptid));
            }
            String pk_pcorg_v = itemvo.getPk_pcorg_v();
            String pk_pcorg = itemvo.getPk_pcorg();
            if (StringUtils.isEmpty((CharSequence)pk_pcorg_v) && !StringUtils.isEmpty((CharSequence)pk_pcorg)) {
                if (!org2orgv.containsKey(pk_pcorg)) {
                    pk_pcorg_v = service.queryOrgPkVidByPKAndDate(pk_pcorg, itemvo.getBilldate());
                    org2orgv.put(pk_pcorg, pk_pcorg_v);
                }
                itemvo.setPk_pcorg_v((String)org2orgv.get(pk_pcorg));
            }
            String pu_org_v = itemvo.getPu_org_v();
            String pu_org = itemvo.getPu_org();
            if (StringUtils.isEmpty((CharSequence)pu_org_v) && !StringUtils.isEmpty((CharSequence)pu_org)) {
                if (!org2orgv.containsKey(pu_org)) {
                    pu_org_v = service.queryOrgPkVidByPKAndDate(pu_org, itemvo.getBilldate());
                    org2orgv.put(pu_org, pu_org_v);
                }
                itemvo.setPu_org_v((String)org2orgv.get(pu_org));
            }
            String so_org_v = itemvo.getSo_org_v();
            String so_org = itemvo.getSo_org();
            if (StringUtils.isEmpty((CharSequence)so_org_v) && !StringUtils.isEmpty((CharSequence)so_org)) {
                if (!org2orgv.containsKey(so_org)) {
                    so_org_v = service.queryOrgPkVidByPKAndDate(so_org, itemvo.getBilldate());
                    org2orgv.put(so_org, so_org_v);
                }
                itemvo.setSo_org_v((String)org2orgv.get(so_org));
            }
            String pk_billtype = headvo.getPk_billtype();
            Integer objtype = itemvo.getObjtype();
            if ("F0".equals(pk_billtype) || "F2".equals(pk_billtype)) {
                if (BillEnumCollection.ObjType.CUSTOMER.VALUE.intValue() == objtype.intValue()) {
                    String ordercubasdoc = itemvo.getOrdercubasdoc();
                    if (StringUtils.isEmpty((CharSequence)ordercubasdoc)) {
                        ordercubasdoc = itemvo.getCustomer();
                        itemvo.setOrdercubasdoc(ordercubasdoc);
                    }
                    if (!key2country.containsKey(ordercubasdoc) || !key2vat.containsKey(ordercubasdoc)) {
                        Map customerMapB = BillEuroUtils.getBodyEuroAfterEditHandler((String)ordercubasdoc);
                        key2country.put(ordercubasdoc, customerMapB.get("rececountryid"));
                        key2vat.put(ordercubasdoc, customerMapB.get("custvatcode"));
                    }
                    itemvo.setRececountryid((String)key2country.get(ordercubasdoc));
                    itemvo.setCustvatcode((String)key2vat.get(ordercubasdoc));
                } else if (BillEnumCollection.ObjType.SUPPLIER.VALUE.intValue() == objtype.intValue()) {
                    if (!key2country.containsKey(itemvo.getSupplier())) {
                        key2country.put(itemvo.getSupplier(), BillEuroUtils.getCountryByCustomerSupplier((String)itemvo.getSupplier(), (boolean)false));
                    }
                    itemvo.setRececountryid((String)key2country.get(itemvo.getSupplier()));
                } else {
                    sett_org = itemvo.getSett_org();
                    if (!key2country.containsKey(itemvo.getSupplier())) {
                        key2country.put(itemvo.getSupplier(), BillEuroUtils.getCountryByCustomerSupplier((String)itemvo.getSupplier(), (boolean)false));
                        try {
                            list = (List)MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByCondWithOrder(OrgVO.class, "pk_org = '" + sett_org + "'", false, false, null);
                            if (list != null && list.size() > 0) {
                                orgvo = (OrgVO)list.get(0);
                                key2country.put(sett_org, orgvo.getCountryzone());
                            }
                        }
                        catch (MetaDataException e) {
                            Logger.debug((Object)e.getMessage());
                        }
                    }
                    itemvo.setRececountryid((String)key2country.get(sett_org));
                }
                buySellType = BillEuroUtils.getSellType((String)headvo.getTaxcountryid(), (String)itemvo.getRececountryid());
                itemvo.setBuysellflag(buySellType);
                UFBoolean triaTradeFlags = BillEuroUtils.getTriaTradeFlag((String)headvo.getSendcountryid(), (String)headvo.getTaxcountryid(), (String)itemvo.getRececountryid());
                itemvo.setTriatradeflag(triaTradeFlags);
                continue;
            }
            if (!"F1".equals(pk_billtype) && !"F3".equals(pk_billtype)) continue;
            if (BillEnumCollection.ObjType.CUSTOMER.VALUE.intValue() == objtype.intValue()) {
                if (!key2country.containsKey(itemvo.getCustomer())) {
                    key2country.put(itemvo.getCustomer(), BillEuroUtils.getCountryByCustomerSupplier((String)itemvo.getCustomer(), (boolean)true));
                }
                itemvo.setSendcountryid((String)key2country.get(itemvo.getCustomer()));
            } else if (BillEnumCollection.ObjType.SUPPLIER.VALUE.intValue() == objtype.intValue()) {
                if (!key2country.containsKey(itemvo.getSupplier())) {
                    key2country.put(itemvo.getSupplier(), BillEuroUtils.getCountryByCustomerSupplier((String)itemvo.getSupplier(), (boolean)false));
                }
                itemvo.setSendcountryid((String)key2country.get(itemvo.getSupplier()));
                if (!key2vat.containsKey(itemvo.getSupplier())) {
                    key2vat.put(itemvo.getSupplier(), BillEuroUtils.getCusSuppVatCode((String[])new String[]{itemvo.getSendcountryid()}, (String[])new String[]{itemvo.getSupplier()}, (boolean)false)[0]);
                }
                itemvo.setVendorvatcode((String)key2vat.get(itemvo.getSupplier()));
            } else {
                sett_org = itemvo.getSett_org();
                if (!key2country.containsKey(sett_org)) {
                    key2country.put(itemvo.getSupplier(), BillEuroUtils.getCountryByCustomerSupplier((String)itemvo.getSupplier(), (boolean)false));
                    try {
                        list = (List)MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByCondWithOrder(OrgVO.class, "pk_org = '" + sett_org + "'", false, false, null);
                        if (list != null && list.size() > 0) {
                            orgvo = (OrgVO)list.get(0);
                            key2country.put(sett_org, orgvo.getCountryzone());
                        }
                    }
                    catch (MetaDataException e) {
                        Logger.debug((Object)e.getMessage());
                    }
                }
                itemvo.setSendcountryid((String)key2country.get(sett_org));
            }
            buySellType = BillEuroUtils.getBuyType((String)headvo.getTaxcountryid(), (String)itemvo.getSendcountryid());
            itemvo.setBuysellflag(buySellType);
            String key = headvo.getTaxcountryid() + itemvo.getSett_org() + buySellType;
            if (key2opptaxFlag.get(key) != null && ((UFBoolean)key2opptaxFlag.get(key)).booleanValue()) {
                UFBoolean opptaxFlag = BillEuroUtils.getOpptaxFlag((String)headvo.getTaxcountryid(), (String)itemvo.getSett_org(), (Object[])new Object[]{buySellType})[0];
                key2opptaxFlag.put(key, opptaxFlag);
            }
            itemvo.setOpptaxflag((UFBoolean)key2opptaxFlag.get(key));
        }
    }

    private Object tranlate(SuperVO vo, String attr, Object value) {
        String pk_group = InvocationInfoProxy.getInstance().getGroupId();
        String pk_org = (String)vo.getAttributeValue("pk_org");
        Object tranvalue = null;
        try {
            if ("pk_recpaytype".equals(attr)) {
                tranvalue = this.getRecpaytypeByName((String)value);
            } else if ("pk_busitype".equals(attr) && !StringUtils.isEmpty((CharSequence)((String)value))) {
                Collection busiVOs = new BaseDAO().retrieveByClause(BusitypeVO.class, "busicode='" + (String)value + "'", new String[]{"pk_busitype"});
                if (busiVOs != null && busiVOs.size() > 0) {
                    tranvalue = busiVOs.toArray(new BusitypeVO[0])[0].getPk_busitype();
                }
            } else if ("supplier".equals(attr)) {
                tranvalue = this.getDocByCode(pk_org, (String)value, "720dcc7c-ff19-48f4-b9c5-b90906682f45");
                if (StringUtil.isEmpty((String)((String)tranvalue))) {
                    tranvalue = this.getDocByCode(pk_org, (String)value, "8c6510dd-3b8a-4cfc-a5c5-323d53c6006f");
                }
            } else if ("subjcode".equals(attr)) {
                AccountDataAccessor accountAccessor;
                IBDData accdata;
                if (!StringUtils.isEmpty((CharSequence)((String)value)) && (accdata = (accountAccessor = (AccountDataAccessor)GeneralAccessorFactory.getAccessor((String)"407748f1-1fe8-4f0d-880e-ae8b0960308f")).getDocByCode(pk_org, (String)value)) != null) {
                    tranvalue = accdata.getPk();
                }
            } else {
                String mdid = this.getMDID(attr);
                if ("611652ad-177f-4d3e-9ae7-ef8f96930b78".equals(mdid) || "08aca301-1a69-4257-b549-b29e992e35ea".equals(mdid)) {
                    IBankaccsubAccessor iBankaccsubAccessor;
                    BankaccsubBDDataVO bddata;
                    String pk_currtype = (String)vo.getAttributeValue("pk_currtype");
                    if (!StringUtil.isEmpty((String)pk_currtype) && (bddata = (iBankaccsubAccessor = (IBankaccsubAccessor)GeneralAccessorFactory.getAccessor((String)mdid)).getDocByAccnum((String)value, pk_currtype)) != null) {
                        tranvalue = bddata.getPk();
                    }
                } else if (this.orgDoc().contains(attr)) {
                    tranvalue = this.getDocByCode(pk_org, (String)value, mdid);
                    if (StringUtil.isEmpty((String)((String)tranvalue))) {
                        tranvalue = this.getDocByCode(pk_group, (String)value, mdid);
                    }
                    if (StringUtil.isEmpty((String)((String)tranvalue))) {
                        tranvalue = this.getDocByCode("GLOBLE00000000000000", (String)value, mdid);
                    }
                    if (StringUtil.isEmpty((String)((String)tranvalue))) {
                        tranvalue = this.getDocByName(pk_org, (String)value, mdid);
                    }
                    if (StringUtil.isEmpty((String)((String)tranvalue))) {
                        tranvalue = this.getDocByName(pk_group, (String)value, mdid);
                    }
                    if (StringUtil.isEmpty((String)((String)tranvalue))) {
                        tranvalue = this.getDocByName("GLOBLE00000000000000", (String)value, mdid);
                    }
                } else if (this.groupDoc().contains(attr)) {
                    String oldvalue = (String)value;
                    tranvalue = this.getDocByCode(pk_group, (String)value, mdid);
                    if (StringUtil.isEmpty((String)((String)tranvalue))) {
                        tranvalue = this.getDocByCode("GLOBLE00000000000000", (String)value, mdid);
                    }
                    if (StringUtil.isEmpty((String)((String)tranvalue))) {
                        tranvalue = this.getDocByName(pk_group, oldvalue, mdid);
                    }
                    if (StringUtil.isEmpty((String)((String)tranvalue))) {
                        tranvalue = this.getDocByName("GLOBLE00000000000000", (String)value, mdid);
                    }
                } else if (this.globalDoc().contains(attr)) {
                    String oldvalue = (String)value;
                    tranvalue = this.getDocByCode("GLOBLE00000000000000", (String)value, mdid);
                    if (StringUtil.isEmpty((String)((String)tranvalue))) {
                        tranvalue = this.getDocByName("GLOBLE00000000000000", oldvalue, mdid);
                    }
                }
            }
        }
        catch (Exception e) {
            throw new BusinessRuntimeException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0963") + attr + NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0964"));
        }
        return tranvalue == null ? value : tranvalue;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public String getBillConditionSql(Map<String, String> map, String tablename, String itemname) throws BusinessException {
        int i;
        String src_billtype;
        String src_billid;
        String pk_psndoc;
        String pk_deptid;
        String customer;
        String objtype;
        String money;
        IBDData data;
        String billmaker;
        String effectstatus;
        String approvestatus;
        String billstatus;
        String billno;
        String src_syscode;
        String end;
        StringBuffer condition = new StringBuffer();
        String pk_group = InvocationInfoProxy.getInstance().getGroupId();
        String orgCodes = NCESAPI.sqlEncode((String)map.get("pk_org"));
        ArrayList<String> orgs = new ArrayList<String>();
        if (StringUtils.isEmpty((CharSequence)orgCodes)) return "1=2";
        String[] pk_orgs = orgCodes.split(",");
        IBDData[] datas = GeneralAccessorFactory.getAccessor((String)"2cfe13c5-9757-4ae8-9327-f5c2d34bcb46").getDocByCodes(pk_group, pk_orgs);
        if (datas == null || datas.length <= 0) return "1=2";
        for (IBDData data2 : datas) {
            orgs.add(data2.getPk());
        }
        condition.append(SqlUtils.getInStr((String)(tablename + "." + "pk_org"), orgs));
        String billdateStr = map.get("billdate");
        String yearMonthStr = map.get("yearmonth");
        String busidateStr = map.get("busidate");
        if (!StringUtils.isEmpty((CharSequence)billdateStr)) {
            String[] billdates = billdateStr.split(",");
            if (billdates.length == 2) {
                if (billdates[0].length() == 10) {
                    billdates[0] = billdates[0] + " 00:00:00";
                }
                condition.append(" and (" + tablename + "." + "billdate" + ">='" + NCESAPI.sqlEncode((String)billdates[0]) + "' ");
                if (billdates[1].length() == 10) {
                    billdates[1] = billdates[1] + " 23:59:59";
                }
                condition.append(" and " + tablename + "." + "billdate" + "<='" + NCESAPI.sqlEncode((String)billdates[1]) + "')");
            } else if (billdates.length == 1) {
                String start = billdates[0];
                end = billdates[0];
                if (billdates[0].length() == 10) {
                    start = billdates[0] + " 00:00:00";
                    end = billdates[0] + " 23:59:59";
                }
                condition.append(" and (" + tablename + "." + "billdate" + ">='" + NCESAPI.sqlEncode((String)start) + "' ");
                condition.append(" and " + tablename + "." + "billdate" + "<='" + NCESAPI.sqlEncode((String)end) + "')");
            }
        } else if (!StringUtils.isEmpty((CharSequence)yearMonthStr)) {
            String[] yearMonths = yearMonthStr.split(",");
            String field = tablename + "." + "billyear" + "||'-'||" + tablename + "." + "billperiod";
            if (yearMonths.length == 2) {
                condition.append(" and (" + field + ">='" + NCESAPI.sqlEncode((String)yearMonths[0]) + "' and " + field + "<='" + NCESAPI.sqlEncode((String)yearMonths[1]) + "')");
            } else if (yearMonths.length == 1) {
                condition.append(" and (" + field + "='" + NCESAPI.sqlEncode((String)yearMonths[0]) + "')");
            }
        } else if (!StringUtils.isEmpty((CharSequence)busidateStr)) {
            String[] busidates = busidateStr.split(",");
            if (busidates.length == 2) {
                if (busidates[0].length() == 10) {
                    busidates[0] = busidates[0] + " 00:00:00";
                }
                condition.append(" and " + tablename + "." + "busidate" + ">='" + NCESAPI.sqlEncode((String)busidates[0]) + "' ");
                if (busidates[1].length() == 10) {
                    busidates[1] = busidates[1] + " 23:59:59";
                }
                condition.append(" and " + tablename + "." + "busidate" + "<='" + NCESAPI.sqlEncode((String)busidates[1]) + "'");
            } else if (busidates.length == 1) {
                String start = busidates[0];
                end = busidates[0];
                if (busidates[0].length() == 10) {
                    start = busidates[0] + " 00:00:00";
                    end = busidates[0] + " 23:59:59";
                }
                condition.append(" and " + tablename + "." + "busidate" + ">='" + NCESAPI.sqlEncode((String)start) + "' ");
                condition.append(" and " + tablename + "." + "busidate" + "<='" + NCESAPI.sqlEncode((String)end) + "'");
            }
        }
        String pk_tradetype = map.get("pk_tradetype");
        if (!StringUtils.isEmpty((CharSequence)pk_tradetype)) {
            condition.append(" and ").append(tablename + "." + "pk_tradetype" + "='" + NCESAPI.sqlEncode((String)pk_tradetype) + "'");
        }
        if (!StringUtils.isEmpty((CharSequence)(src_syscode = map.get("src_syscode")))) {
            String srcCode = NCESAPI.sqlEncode((String)this.getSrcCode(src_syscode));
            condition.append(" and " + SqlUtils.getInStr((String)(tablename + "." + "src_syscode"), (String[])new String[]{srcCode}));
        }
        if (!StringUtils.isEmpty((CharSequence)(billno = map.get("billno")))) {
            condition.append(" and " + tablename + "." + "billno" + " like '%" + NCESAPI.sqlEncode((String)billno) + "%' ");
        }
        if (!StringUtils.isEmpty((CharSequence)(billstatus = map.get("billstatus")))) {
            condition.append(" and ").append(tablename + "." + "billstatus" + "='" + this.getBillStatusCode(billstatus) + "'");
        }
        if (!StringUtils.isEmpty((CharSequence)(approvestatus = map.get("approvestatus")))) {
            condition.append(" and ").append(tablename + "." + "approvestatus" + "='" + this.getApproveStatusCode(approvestatus) + "'");
        }
        if (!StringUtils.isEmpty((CharSequence)(effectstatus = map.get("effectstatus")))) {
            condition.append(" and ").append(tablename + "." + "effectstatus" + "='" + this.getEffectStatusCode(effectstatus) + "'");
        }
        if (!StringUtils.isEmpty((CharSequence)(billmaker = map.get("billmaker"))) && (data = GeneralAccessorFactory.getAccessor((String)"f6f9a473-56c0-432f-8bc7-fbf8fde54fee").getDocByNameWithMainLang((String)orgs.get(0), billmaker)) != null) {
            condition.append(" and ").append(tablename + "." + "billmaker" + "='" + NCESAPI.sqlEncode((String)data.getPk()) + "'");
        }
        if (!StringUtils.isEmpty((CharSequence)(money = map.get("money")))) {
            String[] moneys = money.split(",");
            condition.append(" and (" + tablename + "." + "money" + ">='" + NCESAPI.sqlEncode((String)moneys[0]) + "' ");
            condition.append(" and " + tablename + "." + "money" + "<='" + NCESAPI.sqlEncode((String)moneys[1]) + "')");
        }
        if ("\u4f9b\u5e94\u5546".equals(objtype = map.get("objtype"))) {
            condition.append(" and " + itemname + "." + "objtype" + "=" + BillEnumCollection.ObjType.SUPPLIER.VALUE);
        } else if ("\u5ba2\u6237".equals(objtype)) {
            condition.append(" and " + itemname + "." + "objtype" + "=" + BillEnumCollection.ObjType.CUSTOMER.VALUE);
        } else if ("\u90e8\u95e8".equals(objtype)) {
            condition.append(" and " + itemname + "." + "objtype" + "=" + BillEnumCollection.ObjType.DEP.VALUE);
        } else if ("\u4e1a\u52a1\u5458".equals(objtype)) {
            condition.append(" and " + itemname + "." + "objtype" + "=" + BillEnumCollection.ObjType.PERSON.VALUE);
        }
        String supplier = map.get("supplier");
        if (!StringUtils.isEmpty((CharSequence)supplier)) {
            String[] suppliers = supplier.split(",");
            IBDData[] bddatas = GeneralAccessorFactory.getAccessor((String)"720dcc7c-ff19-48f4-b9c5-b90906682f45").getDocByNamesWithMainLang((String)orgs.get(0), suppliers);
            if (bddatas != null && bddatas.length > 0) {
                ArrayList<String> pk_suppliers = new ArrayList<String>();
                for (IBDData data3 : bddatas) {
                    pk_suppliers.add(data3.getPk());
                }
                condition.append(" and " + SqlUtils.getInStr((String)(itemname + "." + "supplier"), pk_suppliers));
            }
        }
        if (!StringUtils.isEmpty((CharSequence)(customer = map.get("customer")))) {
            String[] customers = customer.split(",");
            IBDData[] bddatas = GeneralAccessorFactory.getAccessor((String)"e4f48eaf-5567-4383-a370-a59cb3e8a451").getDocByNamesWithMainLang((String)orgs.get(0), customers);
            if (bddatas != null && bddatas.length > 0) {
                ArrayList<String> pk_customers = new ArrayList<String>();
                for (IBDData data4 : bddatas) {
                    pk_customers.add(data4.getPk());
                }
                condition.append(" and " + SqlUtils.getInStr((String)(itemname + "." + "customer"), pk_customers));
            }
        }
        if (!StringUtils.isEmpty((CharSequence)(pk_deptid = map.get("pk_deptid")))) {
            String[] deptids = pk_deptid.split(",");
            IBDData[] bddatas = GeneralAccessorFactory.getAccessor((String)"b26fa3cb-4087-4027-a3b6-c83ab2a086a9").getDocByNamesWithMainLang((String)orgs.get(0), deptids);
            if (bddatas != null && bddatas.length > 0) {
                ArrayList<String> pk_deptids = new ArrayList<String>();
                for (IBDData data5 : bddatas) {
                    pk_deptids.add(data5.getPk());
                }
                condition.append(" and " + SqlUtils.getInStr((String)(itemname + "." + "pk_deptid"), pk_deptids));
            }
        }
        if (!StringUtils.isEmpty((CharSequence)(pk_psndoc = map.get("pk_psndoc"))) && ("\u4e1a\u52a1\u5458".equals(objtype) || StringUtils.isEmpty((CharSequence)objtype))) {
            String[] psndocs = pk_psndoc.split(",");
            IBDData[] bddatas = GeneralAccessorFactory.getAccessor((String)"40d39c26-a2b6-4f16-a018-45664cac1a1f").getDocByNamesWithMainLang((String)orgs.get(0), psndocs);
            if (bddatas != null && bddatas.length > 0) {
                ArrayList<String> pk_psndocs = new ArrayList<String>();
                for (IBDData data6 : bddatas) {
                    pk_psndocs.add(data6.getPk());
                }
                condition.append(" and " + SqlUtils.getInStr((String)(itemname + "." + "pk_psndoc"), pk_psndocs));
            }
        }
        if (!StringUtils.isEmpty((CharSequence)(src_billid = map.get("src_billid")))) {
            String[] srcBillids = src_billid.split(",");
            condition.append(" and " + SqlUtils.getInStr((String)(itemname + "." + "src_billid"), (String[])srcBillids));
        }
        if (!StringUtils.isEmpty((CharSequence)(src_billtype = map.get("src_billtype")))) {
            String[] srcBilltypes = src_billtype.split(",");
            condition.append(" and " + SqlUtils.getInStr((String)(itemname + "." + "src_billtype"), (String[])srcBilltypes));
        }
        for (i = 1; i <= 80; ++i) {
            String def = map.get("def" + i);
            String DEF = def;
            if (StringUtils.isEmpty((CharSequence)DEF)) continue;
            condition.append(" and " + tablename + ".def" + i + "='" + NCESAPI.sqlEncode((String)DEF) + "'");
        }
        for (i = 1; i <= 80; ++i) {
            String def = map.get("bodydef" + i);
            String DEF = def;
            if (StringUtils.isEmpty((CharSequence)DEF)) continue;
            condition.append(" and " + itemname + ".def" + i + "='" + NCESAPI.sqlEncode((String)DEF) + "'");
        }
        condition.append(" and isnull(" + tablename + ".dr,0)=0 ");
        condition.append(" and isnull(" + itemname + ".dr,0)=0 ");
        return condition.toString();
    }

    public void translateAcc(BaseItemVO[] itemvos, String pk_org, String billdate) throws BusinessException {
        HashSet<String> subjcodes = new HashSet<String>();
        HashSet<String> checkelements = new HashSet<String>();
        for (BaseItemVO item : itemvos) {
            if (!StringUtils.isEmpty((CharSequence)item.getPk_subjcode())) {
                subjcodes.add(item.getPk_subjcode());
            }
            if (StringUtils.isEmpty((CharSequence)item.getCheckelement())) continue;
            checkelements.add(item.getCheckelement());
        }
        HashMap factorMap = new HashMap();
        if (checkelements.size() > 0) {
            // empty if block
        }
        HashMap<String, String> accMap = new HashMap<String, String>();
        if (subjcodes.size() > 0) {
            HashSet<String> orgs = new HashSet<String>();
            orgs.add(pk_org);
            Map accountings = ((IAccountingBookPubService)NCLocator.getInstance().lookup(IAccountingBookPubService.class)).queryAccountingBookVObyFinanceOrgPks(orgs);
            if (accountings != null && accountings.containsKey(pk_org)) {
                String pk_accountingbook = ((AccountingBookVO)accountings.get(pk_org)).getPk_accountingbook();
                AccountVO[] accounts = ((IAccountPubService)NCLocator.getInstance().lookup(IAccountPubService.class)).queryAccountVOsByCodes(pk_accountingbook, subjcodes.toArray(new String[0]), billdate);
                if (accounts != null) {
                    for (AccountVO accountVO : accounts) {
                        accMap.put(accountVO.getCode(), accountVO.getPk_accasoa());
                    }
                }
            }
        }
        if (factorMap != null && factorMap.size() > 0 || accMap.size() > 0) {
            for (BaseItemVO item : itemvos) {
                if (!StringUtils.isEmpty((CharSequence)item.getPk_subjcode())) {
                    item.setPk_subjcode((String)factorMap.get(item.getPk_subjcode()));
                }
                if (StringUtils.isEmpty((CharSequence)item.getCheckelement())) continue;
                item.setCheckelement((String)factorMap.get(item.getCheckelement()));
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public String getConditionSql(Map<String, String> map, String tablename, String itemname) throws BusinessException {
        int i;
        String SRC_BILLTYPE;
        String SRC_BILLID;
        String PK_PSNDOC;
        String PK_DEPTID;
        String CUSTOMER;
        String OBJTYPE;
        String MONEY;
        IBDData data;
        String BILLMAKER;
        String EFFECTSTATUS;
        String APPROVESTATUS;
        String BILLSTATUS;
        String BILLNO;
        String src_syscode;
        String pk_tradetype;
        String end;
        StringBuffer condition = new StringBuffer();
        String pk_group = InvocationInfoProxy.getInstance().getGroupId();
        String orgCodes = NCESAPI.sqlEncode((String)map.get("pk_org"));
        ArrayList<String> orgs = new ArrayList<String>();
        if (StringUtils.isEmpty((CharSequence)orgCodes)) return "1=2";
        String[] pk_orgs = orgCodes.split(",");
        Object[] datas = GeneralAccessorFactory.getAccessor((String)"2cfe13c5-9757-4ae8-9327-f5c2d34bcb46").getDocByCodes(pk_group, pk_orgs);
        if (datas != null && datas.length > 0) {
            for (Object data2 : datas) {
                orgs.add(data2.getPk());
            }
            condition.append(SqlUtils.getInStr((String)(tablename + "." + "pk_org"), orgs));
        } else if (ArrayUtils.isEmpty((Object[])datas) && StringUtils.isNotEmpty((CharSequence)orgCodes)) {
            orgs.add(orgCodes);
            condition.append(SqlUtils.getInStr((String)(tablename + "." + "pk_org"), orgs));
        } else {
            condition.append(" 1=1 ");
        }
        String billdateStr = map.get("billdate");
        String yearMonthStr = map.get("yearmonth");
        String busidateStr = map.get("busidate");
        if (!StringUtils.isEmpty((CharSequence)billdateStr)) {
            String[] billdates = billdateStr.split(",");
            if (billdates.length == 2) {
                if (billdates[0].length() == 10) {
                    billdates[0] = billdates[0] + " 00:00:00";
                }
                condition.append(" and (" + tablename + "." + "billdate" + ">='" + billdates[0] + "' ");
                if (billdates[1].length() == 10) {
                    billdates[1] = billdates[1] + " 23:59:59";
                }
                condition.append(" and " + tablename + "." + "billdate" + "<='" + billdates[1] + "')");
            } else if (billdates.length == 1) {
                String start = billdates[0];
                end = billdates[0];
                if (billdates[0].length() == 10) {
                    start = billdates[0] + " 00:00:00";
                    end = billdates[0] + " 23:59:59";
                }
                condition.append(" and (" + tablename + "." + "billdate" + ">='" + start + "' ");
                condition.append(" and " + tablename + "." + "billdate" + "<='" + end + "')");
            }
        } else if (!StringUtils.isEmpty((CharSequence)yearMonthStr)) {
            String[] yearMonths = yearMonthStr.split(",");
            String field = tablename + "." + "billyear" + "||'-'||" + tablename + "." + "billperiod";
            if (yearMonths.length == 2) {
                condition.append(" and (" + field + ">='" + yearMonths[0] + "' and " + field + "<='" + yearMonths[1] + "')");
            } else {
                if (yearMonths.length != 1) return "1=2";
                condition.append(" and (" + field + "='" + yearMonths[0] + "')");
            }
        } else {
            if (StringUtils.isEmpty((CharSequence)busidateStr)) return "1=2";
            String[] busidates = busidateStr.split(",");
            if (busidates.length == 2) {
                if (busidates[0].length() == 10) {
                    busidates[0] = busidates[0] + " 00:00:00";
                }
                condition.append(" and " + itemname + "." + "busidate" + ">='" + busidates[0] + "' ");
                if (busidates[1].length() == 10) {
                    busidates[1] = busidates[1] + " 23:59:59";
                }
                condition.append(" and " + itemname + "." + "busidate" + "<='" + busidates[1] + "'");
            } else if (busidates.length == 1) {
                String start = busidates[0];
                end = busidates[0];
                if (busidates[0].length() == 10) {
                    start = busidates[0] + " 00:00:00";
                    end = busidates[0] + " 23:59:59";
                }
                condition.append(" and " + itemname + "." + "busidate" + ">='" + start + "' ");
                condition.append(" and " + itemname + "." + "busidate" + "<='" + end + "'");
            }
        }
        String businoStr = map.get("busino");
        if (!StringUtils.isEmpty((CharSequence)businoStr)) {
            condition.append(" and " + itemname + "." + "busino" + "='" + businoStr + "'");
        }
        if (!StringUtils.isEmpty((CharSequence)(pk_tradetype = map.get("pk_tradetype")))) {
            String pk_billtypeid = PfDataCache.getBillTypeInfo((String)pk_group, (String)pk_tradetype).getPk_billtypeid();
            String PK_TRADETYPE = NCESAPI.sqlEncode((String)pk_billtypeid);
            condition.append(" and ").append(tablename + "." + "pk_tradetypeid" + "='" + PK_TRADETYPE + "'");
        }
        if (!StringUtils.isEmpty((CharSequence)(src_syscode = map.get("src_syscode")))) {
            String srcCode = NCESAPI.sqlEncode((String)this.getSrcCode(src_syscode));
            condition.append(" and " + SqlUtils.getInStr((String)(tablename + "." + "src_syscode"), (String[])new String[]{srcCode}));
        }
        if (!StringUtils.isEmpty((CharSequence)(BILLNO = NCESAPI.sqlEncode((String)map.get("billno"))))) {
            condition.append(" and " + tablename + "." + "billno" + " like '%" + BILLNO + "%' ");
        }
        if (!StringUtils.isEmpty((CharSequence)(BILLSTATUS = NCESAPI.sqlEncode((String)map.get("billstatus"))))) {
            condition.append(" and ").append(tablename + "." + "billstatus" + "='" + this.getBillStatusCode(BILLSTATUS) + "'");
        }
        if (!StringUtils.isEmpty((CharSequence)(APPROVESTATUS = NCESAPI.sqlEncode((String)map.get("approvestatus"))))) {
            condition.append(" and ").append(tablename + "." + "approvestatus" + "='" + this.getApproveStatusCode(APPROVESTATUS) + "'");
        }
        if (!StringUtils.isEmpty((CharSequence)(EFFECTSTATUS = NCESAPI.sqlEncode((String)map.get("effectstatus"))))) {
            condition.append(" and ").append(tablename + "." + "effectstatus" + "='" + this.getEffectStatusCode(EFFECTSTATUS) + "'");
        }
        if (!StringUtils.isEmpty((CharSequence)(BILLMAKER = NCESAPI.sqlEncode((String)map.get("billmaker")))) && (data = GeneralAccessorFactory.getAccessor((String)"f6f9a473-56c0-432f-8bc7-fbf8fde54fee").getDocByNameWithMainLang((String)orgs.get(0), BILLMAKER)) != null) {
            condition.append(" and ").append(tablename + "." + "billmaker" + "='" + data.getPk() + "'");
        }
        if (!StringUtils.isEmpty((CharSequence)(MONEY = NCESAPI.sqlEncode((String)map.get("money"))))) {
            String[] money = MONEY.split(",");
            condition.append(" and (" + tablename + "." + "money" + ">='" + money[0] + "' ");
            condition.append(" and " + tablename + "." + "money" + "<='" + money[1] + "')");
        }
        if ("\u4f9b\u5e94\u5546".equals(OBJTYPE = NCESAPI.sqlEncode((String)map.get("objtype")))) {
            condition.append(" and " + itemname + "." + "objtype" + "=" + BillEnumCollection.ObjType.SUPPLIER.VALUE + " and rowno=0 ");
        } else if ("\u5ba2\u6237".equals(OBJTYPE)) {
            condition.append(" and " + itemname + "." + "objtype" + "=" + BillEnumCollection.ObjType.CUSTOMER.VALUE + " and rowno=0 ");
        } else if ("\u90e8\u95e8".equals(OBJTYPE)) {
            condition.append(" and " + itemname + "." + "objtype" + "=" + BillEnumCollection.ObjType.DEP.VALUE + " and rowno=0 ");
        } else if ("\u4e1a\u52a1\u5458".equals(OBJTYPE)) {
            condition.append(" and " + itemname + "." + "objtype" + "=" + BillEnumCollection.ObjType.PERSON.VALUE + " and rowno=0 ");
        }
        String SUPPLIER = NCESAPI.sqlEncode((String)map.get("supplier"));
        if (!StringUtils.isEmpty((CharSequence)SUPPLIER)) {
            String[] suppliers = SUPPLIER.split(",");
            IBDData[] bddatas = GeneralAccessorFactory.getAccessor((String)"720dcc7c-ff19-48f4-b9c5-b90906682f45").getDocByNamesWithMainLang((String)orgs.get(0), suppliers);
            if (bddatas != null && bddatas.length > 0) {
                ArrayList<String> pk_suppliers = new ArrayList<String>();
                for (IBDData data3 : bddatas) {
                    pk_suppliers.add(data3.getPk());
                }
                condition.append(" and " + SqlUtils.getInStr((String)(itemname + "." + "supplier"), pk_suppliers));
            }
        }
        if (!StringUtils.isEmpty((CharSequence)(CUSTOMER = NCESAPI.sqlEncode((String)map.get("customer"))))) {
            String[] customers = CUSTOMER.split(",");
            IBDData[] bddatas = GeneralAccessorFactory.getAccessor((String)"e4f48eaf-5567-4383-a370-a59cb3e8a451").getDocByNamesWithMainLang((String)orgs.get(0), customers);
            if (bddatas != null && bddatas.length > 0) {
                ArrayList<String> pk_customers = new ArrayList<String>();
                for (IBDData data4 : bddatas) {
                    pk_customers.add(data4.getPk());
                }
                condition.append(" and " + SqlUtils.getInStr((String)(itemname + "." + "customer"), pk_customers));
            }
        }
        if (!StringUtils.isEmpty((CharSequence)(PK_DEPTID = NCESAPI.sqlEncode((String)map.get("pk_deptid"))))) {
            String[] deptids = PK_DEPTID.split(",");
            IBDData[] bddatas = GeneralAccessorFactory.getAccessor((String)"b26fa3cb-4087-4027-a3b6-c83ab2a086a9").getDocByNamesWithMainLang((String)orgs.get(0), deptids);
            if (bddatas != null && bddatas.length > 0) {
                ArrayList<String> pk_deptids = new ArrayList<String>();
                for (IBDData data5 : bddatas) {
                    pk_deptids.add(data5.getPk());
                }
                condition.append(" and " + SqlUtils.getInStr((String)(itemname + "." + "pk_deptid"), pk_deptids));
            }
        }
        if (!StringUtils.isEmpty((CharSequence)(PK_PSNDOC = NCESAPI.sqlEncode((String)map.get("pk_psndoc")))) && ("\u4e1a\u52a1\u5458".equals(OBJTYPE) || StringUtils.isEmpty((CharSequence)OBJTYPE))) {
            String[] psndocs = PK_PSNDOC.split(",");
            IBDData[] bddatas = GeneralAccessorFactory.getAccessor((String)"40d39c26-a2b6-4f16-a018-45664cac1a1f").getDocByNamesWithMainLang((String)orgs.get(0), psndocs);
            if (bddatas != null && bddatas.length > 0) {
                ArrayList<String> pk_psndocs = new ArrayList<String>();
                for (IBDData data6 : bddatas) {
                    pk_psndocs.add(data6.getPk());
                }
                condition.append(" and " + SqlUtils.getInStr((String)(itemname + "." + "pk_psndoc"), pk_psndocs));
            }
        }
        if (!StringUtils.isEmpty((CharSequence)(SRC_BILLID = NCESAPI.sqlEncode((String)map.get("src_billid"))))) {
            String[] srcBillids = SRC_BILLID.split(",");
            condition.append(" and " + SqlUtils.getInStr((String)(itemname + "." + "src_billid"), (String[])srcBillids));
        }
        if (!StringUtils.isEmpty((CharSequence)(SRC_BILLTYPE = NCESAPI.sqlEncode((String)map.get("src_billtype"))))) {
            String[] srcBilltypes = SRC_BILLTYPE.split(",");
            condition.append(" and " + SqlUtils.getInStr((String)(itemname + "." + "src_billtype"), (String[])srcBilltypes));
        }
        for (i = 1; i <= 80; ++i) {
            String def = map.get("def" + i);
            String DEF = NCESAPI.sqlEncode((String)def);
            if (StringUtils.isEmpty((CharSequence)DEF)) continue;
            condition.append(" and " + tablename + ".def" + i + "='" + DEF + "'");
        }
        for (i = 1; i <= 80; ++i) {
            String def = map.get("bodydef" + i);
            String DEF = NCESAPI.sqlEncode((String)def);
            if (StringUtils.isEmpty((CharSequence)DEF)) continue;
            condition.append(" and " + itemname + ".def" + i + "='" + DEF + "'");
        }
        return condition.toString();
    }

    public Object getRecpaytypeByName(String value) throws DAOException {
        StringBuffer condition = new StringBuffer();
        String select = "select distinct fi_recpaytype.pk_recpaytype ";
        String tablename = "fi_recpaytype";
        condition.append(tablename + ".name='" + value + "'");
        String where = condition.toString();
        String from = "fi_recpaytype fi_recpaytype ";
        String sql = select + " from " + from + " where " + where;
        Object pks = new BaseDAO().executeQuery(sql, (ResultSetProcessor)new ColumnProcessor());
        if (!StringUtil.isEmpty((String)((String)pks))) {
            return pks;
        }
        return null;
    }

    public Map<String, String> convertVOToMap(SuperVO vo) {
        String[] attributeNames;
        HashMap<String, String> map = new HashMap<String, String>();
        for (String attr : attributeNames = vo.getAttributeNames()) {
            if (vo.getAttributeValue(attr) == null) continue;
            if (!(vo.getAttributeValue(attr) instanceof String)) {
                map.put(attr, String.valueOf(vo.getAttributeValue(attr)));
                continue;
            }
            map.put(attr, (String)vo.getAttributeValue(attr));
        }
        this.fillNameCode(map);
        return map;
    }

    public void fillNameCode(Map<String, String> map) {
        String[] keys;
        for (String key : keys = map.keySet().toArray(new String[0])) {
            String[] codeName;
            if (this.getMDID(key) == null || StringUtils.isEmpty((CharSequence)map.get(key)) || (codeName = this.getDocNameCodeById(map.get(key), this.getMDID(key))) == null) continue;
            map.put(key + "_code", codeName[0]);
            map.put(key + "_name", codeName[1]);
        }
    }

    public void updateVO(SuperVO vo, Map<String, Object> map) throws BusinessException {
        for (String key : map.keySet()) {
            if ("items".equals(key)) continue;
            Object oldvalue = vo.getAttributeValue(key);
            String newvalue = (String)this.tranlate(vo, key, map.get(key));
            if (!StringUtils.isEmpty((CharSequence)((String)map.get(key))) && StringUtils.isEmpty((CharSequence)newvalue)) {
                throw new BusinessException("[" + key + NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0965"));
            }
            try {
                if (oldvalue instanceof UFDate) {
                    vo.setAttributeValue(key, (Object)new UFDate(newvalue));
                    continue;
                }
                if (oldvalue instanceof UFDouble) {
                    vo.setAttributeValue(key, (Object)new UFDouble(newvalue));
                    continue;
                }
                if (oldvalue instanceof UFBoolean) {
                    vo.setAttributeValue(key, (Object)UFBoolean.valueOf((String)newvalue));
                    continue;
                }
                if (oldvalue instanceof Integer) {
                    vo.setAttributeValue(key, (Object)Integer.valueOf(newvalue));
                    continue;
                }
                vo.setAttributeValue(key, (Object)newvalue);
            }
            catch (Exception e) {
                throw new BusinessException("[" + key + NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0966"));
            }
        }
    }

    private String getBillStatusCode(String billstatus) {
        Integer status = null;
        if ("\u4fdd\u5b58".equals(billstatus)) {
            status = BillEnumCollection.BillSatus.SAVE.VALUE;
        } else if ("\u6682\u5b58".equals(billstatus)) {
            status = BillEnumCollection.BillSatus.TEMPEORARY.VALUE;
        }
        if ("\u5ba1\u6279\u901a\u8fc7".equals(billstatus)) {
            status = BillEnumCollection.BillSatus.AUDIT.VALUE;
        }
        if ("\u7b7e\u5b57".equals(billstatus)) {
            status = BillEnumCollection.BillSatus.SIGN.VALUE;
        }
        if ("\u672a\u786e\u8ba4".equals(billstatus)) {
            status = BillEnumCollection.BillSatus.UNCOMFIRM.VALUE;
        }
        return status == null ? null : status.toString();
    }

    private String getApproveStatusCode(String approvestatus) {
        Integer status = null;
        if ("\u81ea\u7531".equals(approvestatus)) {
            status = BillEnumCollection.ApproveStatus.NOSTATE.VALUE;
        } else if ("\u5ba1\u6279\u4e0d\u901a\u8fc7".equals(approvestatus)) {
            status = BillEnumCollection.ApproveStatus.NOPASS.VALUE;
        } else if ("\u5ba1\u6279\u901a\u8fc7".equals(approvestatus)) {
            status = BillEnumCollection.ApproveStatus.PASSING.VALUE;
        } else if ("\u5ba1\u6279\u4e2d".equals(approvestatus)) {
            status = BillEnumCollection.ApproveStatus.GOINGON.VALUE;
        } else if ("\u5df2\u63d0\u4ea4".equals(approvestatus)) {
            status = BillEnumCollection.ApproveStatus.COMMIT.VALUE;
        }
        return status == null ? null : status.toString();
    }

    private String getEffectStatusCode(String effectstatus) {
        Integer status = null;
        if ("\u5df2\u751f\u6548".equals(effectstatus)) {
            status = BillEnumCollection.InureSign.OKINURE.VALUE;
        } else if ("\u672a\u751f\u6548".equals(effectstatus)) {
            status = BillEnumCollection.InureSign.NOINURE.VALUE;
        }
        return status == null ? null : status.toString();
    }

    private String getSrcCode(String src_syscode) {
        Integer srccode = null;
        if ("\u5e94\u6536\u7ba1\u7406".equals(src_syscode)) {
            srccode = BillEnumCollection.FromSystem.AR.VALUE;
        } else if ("\u5e94\u4ed8\u7ba1\u7406".equals(src_syscode)) {
            srccode = BillEnumCollection.FromSystem.AP.VALUE;
        } else if ("\u73b0\u91d1\u7ba1\u7406".equals(src_syscode)) {
            srccode = BillEnumCollection.FromSystem.CMP.VALUE;
        } else if ("\u9500\u552e\u7cfb\u7edf".equals(src_syscode)) {
            srccode = BillEnumCollection.FromSystem.SO.VALUE;
        } else if ("\u91c7\u8d2d\u7cfb\u7edf".equals(src_syscode)) {
            srccode = BillEnumCollection.FromSystem.PO.VALUE;
        } else if ("\u8d44\u91d1\u7ed3\u7b97".equals(src_syscode)) {
            srccode = BillEnumCollection.FromSystem.FTS.VALUE;
        } else if ("\u7f51\u4e0a\u94f6\u884c".equals(src_syscode)) {
            srccode = BillEnumCollection.FromSystem.NET.VALUE;
        } else if ("\u4ed8\u6b3e\u6392\u7a0b".equals(src_syscode)) {
            srccode = BillEnumCollection.FromSystem.PS.VALUE;
        } else if ("\u7968\u636e\u7ba1\u7406".equals(src_syscode)) {
            srccode = BillEnumCollection.FromSystem.CFBM.VALUE;
        } else if ("\u534f\u540c\u5355\u636e".equals(src_syscode)) {
            srccode = BillEnumCollection.FromSystem.XTDJ.VALUE;
        } else if ("\u4fe1\u8d37\u7cfb\u7edf".equals(src_syscode)) {
            srccode = BillEnumCollection.FromSystem.CDMA.VALUE;
        } else if ("\u9879\u76ee\u7ba1\u7406".equals(src_syscode)) {
            srccode = BillEnumCollection.FromSystem.XBGL.VALUE;
        } else if ("\u5168\u9762\u9884\u7b97".equals(src_syscode)) {
            srccode = BillEnumCollection.FromSystem.TB.VALUE;
        } else if ("\u5185\u90e8\u4ea4\u6613".equals(src_syscode)) {
            srccode = BillEnumCollection.FromSystem.TO.VALUE;
        } else if ("\u5916\u90e8\u4ea4\u6362\u5e73\u53f0".equals(src_syscode)) {
            srccode = BillEnumCollection.FromSystem.WBJHPT.VALUE;
        } else if ("\u8d44\u91d1\u8ba1\u606f".equals(src_syscode)) {
            srccode = BillEnumCollection.FromSystem.ZJJX.VALUE;
        } else if ("\u5e93\u5b58\u7ba1\u7406".equals(src_syscode)) {
            srccode = BillEnumCollection.FromSystem.IC.VALUE;
        } else if ("\u5408\u540c".equals(src_syscode)) {
            srccode = BillEnumCollection.FromSystem.CT.VALUE;
        } else if ("\u8fd0\u8f93".equals(src_syscode)) {
            srccode = BillEnumCollection.FromSystem.YS.VALUE;
        } else if ("\u8d44\u4ea7\u7ba1\u7406".equals(src_syscode)) {
            srccode = BillEnumCollection.FromSystem.AM.VALUE;
        } else if ("\u8d39\u7528\u7ba1\u7406".equals(src_syscode)) {
            srccode = BillEnumCollection.FromSystem.WSBX.VALUE;
        } else if ("\u96f6\u552e\u7cfb\u7edf".equals(src_syscode)) {
            srccode = BillEnumCollection.FromSystem.CR09.VALUE;
        } else if ("\u8fdb\u51fa\u53e3\u7cfb\u7edf".equals(src_syscode)) {
            srccode = BillEnumCollection.FromSystem.JCK.VALUE;
        } else if ("CRM".equals(src_syscode)) {
            srccode = BillEnumCollection.FromSystem.CRM.VALUE;
        } else if ("\u4fe1\u7528\u8bc1\u7ba1\u7406".equals(src_syscode)) {
            srccode = BillEnumCollection.FromSystem.XYZ.VALUE;
        }
        return srccode == null ? null : srccode.toString();
    }

    public String getDocByCode(String pk_org, String code, String mdid) {
        if (StringUtils.isEmpty((CharSequence)code)) {
            return null;
        }
        IBDData bddata = GeneralAccessorFactory.getAccessor((String)mdid).getDocByCode(pk_org, code);
        if (bddata != null) {
            return bddata.getPk();
        }
        return null;
    }

    public String getDocByName(String pk_org, String name, String mdid) {
        if (StringUtils.isEmpty((CharSequence)name)) {
            return null;
        }
        IBDData bddata = GeneralAccessorFactory.getAccessor((String)mdid).getDocByNameWithMainLang(pk_org, name);
        if (bddata != null) {
            return bddata.getPk();
        }
        return null;
    }

    public String[] getDocNameCodeById(String pk, String mdid) {
        if (StringUtils.isEmpty((CharSequence)pk)) {
            return null;
        }
        IBDData bddata = GeneralAccessorFactory.getAccessor((String)mdid).getDocByPk(pk);
        if (bddata != null) {
            return new String[]{bddata.getCode(), bddata.getName().toString()};
        }
        return null;
    }

    public String getMDID(String key) {
        if ("pk_group".equals(key)) {
            return "3b6dd171-2900-47f3-bfbe-41e4483a2a65";
        }
        if ("pk_org".equals(key) || "sett_org".equals(key)) {
            return "2cfe13c5-9757-4ae8-9327-f5c2d34bcb46";
        }
        if ("customer".equals(key)) {
            return "e4f48eaf-5567-4383-a370-a59cb3e8a451";
        }
        if ("supplier".equals(key) || "ordercubasdoc".equals(key)) {
            return "720dcc7c-ff19-48f4-b9c5-b90906682f45";
        }
        if ("pk_psndoc".equals(key) || "pu_psndoc".equals(key)) {
            return "40d39c26-a2b6-4f16-a018-45664cac1a1f";
        }
        if ("pk_deptid".equals(key) || "pu_deptid".equals(key)) {
            return "b26fa3cb-4087-4027-a3b6-c83ab2a086a9";
        }
        if ("pu_org".equals(key) || "so_org".equals(key)) {
            return "985be8a4-3a36-4778-8afe-2d8ed3902659";
        }
        if ("pk_pcorg".equals(key)) {
            return "5461ada1-ef2a-419a-af14-656cf0641d34";
        }
        if ("billmaker".equals(key) || "approver".equals(key) || "commpayer".equals(key) || "officialprintuser".equals(key)) {
            return "f6f9a473-56c0-432f-8bc7-fbf8fde54fee";
        }
        if ("material".equals(key)) {
            return "c7dc0ccd-8872-4eee-8882-160e8f49dfad";
        }
        if ("yf_pk_payterm".equals(key)) {
            return "3b240da8-8722-47ec-a557-97c63dd7aa2d";
        }
        if ("ys_pk_payterm".equals(key)) {
            return "5a96f405-3a18-4fe9-ac5b-99e81de0a5cc";
        }
        if ("pk_currtype".equals(key)) {
            return "b498bc9a-e5fd-4613-8da8-bdae2a05704a";
        }
        if ("taxcodeid".equals(key)) {
            return "f758785c-a056-4f65-a551-ac05c3ac09cd";
        }
        if ("pk_subjcode".equals(key)) {
            return "283d91a4-a8f4-4763-ac44-aae7401fa09a";
        }
        if ("cashitem".equals(key)) {
            return "08d4138b-a7b5-42fd-94bc-bb6eb7ac0fdc";
        }
        if ("bankrollprojet".equals(key)) {
            return "edc7fbfe-4111-440e-93e0-a88664969dd4";
        }
        if ("yf_payaccount".equals(key) || "ys_recaccount".equals(key)) {
            return "cd1f9a1c-eb08-493f-88ff-bcd1c134dee1";
        }
        if ("yf_recaccount".equals(key) || "ys_payaccount".equals(key)) {
            return "9e10ef4a-0be9-482b-880f-871e5b0504b7";
        }
        if ("freecust".equals(key)) {
            return "20d2ca8b-c9da-4def-a9a1-4b11b85bba54";
        }
        if ("so_transtype".equals(key)) {
            return "6d90c539-bdcd-4eb1-a4f0-855f328fecb1";
        }
        if ("costcenter".equals(key)) {
            return "de9796b5-bccd-42a1-97dd-808847bfddbd";
        }
        if ("productline".equals(key)) {
            return "029c4c8f-39bb-4208-acc0-c3f66632f328";
        }
        if ("pk_recpaytype".equals(key)) {
            return "d3d946fd-7ee3-4d72-9bd7-f9d254f9d084";
        }
        if ("checktype".equals(key)) {
            return "74c98540-4879-4584-a4c9-0f8b6e20b96a";
        }
        if ("cashaccount".equals(key)) {
            return "d5d5b39d-2c93-4686-be49-e08a0a5f5afd";
        }
        if ("payaccount".equals(key)) {
            return "cd1f9a1c-eb08-493f-88ff-bcd1c134dee1";
        }
        if ("recaccount".equals(key)) {
            return "9e10ef4a-0be9-482b-880f-871e5b0504b7";
        }
        if ("pk_balatype".equals(key)) {
            return "7016ec17-4116-4b3c-abf1-37e3b5d815ef";
        }
        if ("pk_deptid_v".equals(key)) {
            return "66ed0cf6-e260-4f39-8fbb-172260efd677";
        }
        if ("project".equals(key)) {
            return "2ee58f9b-781b-469f-b1d8-1816842515c3";
        }
        return null;
    }

    public List<String> orgDoc() {
        String[] keys = new String[]{"customer", "supplier", "pk_psndoc", "pk_deptid", "billmaker", "approver", "commpayer", "officialprintuser", "material", "subjcode", "cashitem", "bankrollprojet", "freecust", "so_transtype", "productline", "ordercubasdoc", "pu_psndoc", "pu_deptid", "pk_recpaytype", "cashaccount", "pk_subjcode", "pk_deptid_v", "project"};
        return Arrays.asList(keys);
    }

    public List<String> groupDoc() {
        String[] keys = new String[]{"sett_org", "pk_pcorg", "pu_org", "so_org", "costcenter", "checktype", "pk_balatype", "taxcodeid"};
        return Arrays.asList(keys);
    }

    public List<String> globalDoc() {
        String[] keys = new String[]{"pk_currtype", "pk_group", "taxcodeid"};
        return Arrays.asList(keys);
    }
}

