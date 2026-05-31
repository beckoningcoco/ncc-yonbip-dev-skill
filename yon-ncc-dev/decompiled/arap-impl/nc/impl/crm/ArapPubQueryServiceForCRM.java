/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.bill.ArapBillPubUtil
 *  nc.bs.arap.bill.ArapGeneralDAO
 *  nc.bs.arap.util.SqlUtils
 *  nc.bs.pub.formulaparse.FormulaParse
 *  nc.itf.crm.IArapPubQueryServiceForCRM
 *  nc.jdbc.framework.processor.BeanListProcessor
 *  nc.jdbc.framework.processor.ResultSetProcessor
 *  nc.pubitf.bd.accessor.GeneralAccessorFactory
 *  nc.ui.dbcache.DBCacheQueryFacade
 *  nc.vo.arap.basebill.BaseAggVO
 *  nc.vo.arap.basebill.BaseBillVO
 *  nc.vo.arap.basebill.BaseItemVO
 *  nc.vo.arap.gathering.AggGatheringBillVO
 *  nc.vo.arap.pay.AggPayBillVO
 *  nc.vo.arap.pay.ec.PayForECParamVO$MutilLang
 *  nc.vo.arap.utils.StringUtil
 *  nc.vo.bd.accessor.IBDData
 *  nc.vo.bd.bankaccount.BankAccSubVO
 *  nc.vo.bd.bankaccount.BankAccbasVO
 *  nc.vo.crm.CrmArapBillBodyVO
 *  nc.vo.crm.CrmArapBillVO
 *  nc.vo.crm.CrmArapVO
 *  nc.vo.crm.CrmConditionVO
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.formulaset.FormulaParseFather
 *  nc.vo.pub.lang.MultiLangText
 *  nccloud.commons.lang.StringUtils
 */
package nc.impl.crm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import nc.bs.arap.bill.ArapBillPubUtil;
import nc.bs.arap.bill.ArapGeneralDAO;
import nc.bs.arap.util.SqlUtils;
import nc.bs.pub.formulaparse.FormulaParse;
import nc.itf.crm.IArapPubQueryServiceForCRM;
import nc.jdbc.framework.processor.BeanListProcessor;
import nc.jdbc.framework.processor.ResultSetProcessor;
import nc.pubitf.bd.accessor.GeneralAccessorFactory;
import nc.ui.dbcache.DBCacheQueryFacade;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.arap.gathering.AggGatheringBillVO;
import nc.vo.arap.pay.AggPayBillVO;
import nc.vo.arap.pay.ec.PayForECParamVO;
import nc.vo.arap.utils.StringUtil;
import nc.vo.bd.accessor.IBDData;
import nc.vo.bd.bankaccount.BankAccSubVO;
import nc.vo.bd.bankaccount.BankAccbasVO;
import nc.vo.crm.CrmArapBillBodyVO;
import nc.vo.crm.CrmArapBillVO;
import nc.vo.crm.CrmArapVO;
import nc.vo.crm.CrmConditionVO;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.formulaset.FormulaParseFather;
import nc.vo.pub.lang.MultiLangText;
import nccloud.commons.lang.StringUtils;

public class ArapPubQueryServiceForCRM
implements IArapPubQueryServiceForCRM {
    private static final String EMPTY_STRING = "";
    private FormulaParseFather paser = null;

    public CrmArapVO[] queryCustomerAccountInfo(CrmConditionVO crmConditionVO) throws BusinessException {
        HashMap<String, CrmArapVO> mapInit = new HashMap<String, CrmArapVO>();
        HashMap<String, CrmArapVO> map = new HashMap<String, CrmArapVO>();
        StringBuffer sql = new StringBuffer(" select pk_org,");
        sql.append(" sum(case when prepay ='Y' then local_money_cr-local_money_de else 0.0 end) pre_init,0.0 pre_money,0.0 pre_bal,");
        sql.append(" sum(case when prepay ='N'and billclass ='sk' then local_money_cr-local_money_de else 0.0 end) gathering_init, 0.0 gathering_money,0.0 gathering_bal,");
        sql.append(" sum(case when prepay ='N'and billclass ='ys' then local_money_de-local_money_cr else 0.0 end) rec_init,0.0 rec_money,0.0 rec_bal");
        sql.append(" from arap_tally where billclass in('ys','sk') ");
        sql.append(" and customer ='" + crmConditionVO.getCustomer() + "' and ");
        sql.append(SqlUtils.getInStr((String)"pk_org", (String[])crmConditionVO.getPk_org()));
        sql.append(" and billdate <='" + crmConditionVO.getStartDate() + "' ");
        sql.append(" group by pk_org ");
        List ret = (List)DBCacheQueryFacade.runQuery((String)sql.toString(), (ResultSetProcessor)new BeanListProcessor(CrmArapVO.class));
        if (ret != null) {
            for (CrmArapVO vo : ret) {
                mapInit.put(vo.getPk_org(), vo);
            }
        }
        StringBuffer sql1 = new StringBuffer(" select pk_org,");
        sql1.append(" 0.0 pre_init,sum(case when prepay ='Y' then local_money_cr-local_money_de else 0.0 end)  pre_money,0.0 pre_bal,");
        sql1.append(" 0.0 gathering_init, sum(case when prepay ='N'and billclass ='sk' then local_money_cr-local_money_de else 0.0 end) gathering_money,0.0 gathering_bal,");
        sql1.append(" 0.0 rec_init,sum(case when prepay ='N'and billclass ='ys' then local_money_de-local_money_cr else 0.0 end) rec_money,0.0 rec_bal");
        sql1.append(" from arap_tally where billclass in('ys','sk') ");
        sql1.append(" and customer ='" + crmConditionVO.getCustomer() + "' and ");
        sql1.append(SqlUtils.getInStr((String)"pk_org", (String[])crmConditionVO.getPk_org()));
        sql1.append(" and (billdate >='" + crmConditionVO.getStartDate() + "' and billdate <='" + crmConditionVO.getEndDate() + "' ) ");
        sql1.append(" group by pk_org ");
        List ret2 = (List)DBCacheQueryFacade.runQuery((String)sql1.toString(), (ResultSetProcessor)new BeanListProcessor(CrmArapVO.class));
        if (ret2 != null) {
            for (CrmArapVO vo : ret2) {
                map.put(vo.getPk_org(), vo);
            }
        }
        ArrayList<CrmArapVO> result = new ArrayList<CrmArapVO>();
        for (String pk_org : crmConditionVO.getPk_org()) {
            CrmArapVO vo = new CrmArapVO();
            if (mapInit.get(pk_org) != null) {
                vo.setPre_init(((CrmArapVO)mapInit.get(pk_org)).getPre_init());
                vo.setGathering_init(((CrmArapVO)mapInit.get(pk_org)).getGathering_init());
                vo.setRec_init(((CrmArapVO)mapInit.get(pk_org)).getRec_init());
            }
            if (map.get(pk_org) != null) {
                vo.setPre_money(((CrmArapVO)map.get(pk_org)).getPre_money());
                vo.setGathering_money(((CrmArapVO)map.get(pk_org)).getGathering_money());
                vo.setRec_money(((CrmArapVO)map.get(pk_org)).getRec_money());
                vo.setPre_bal(vo.getPre_init().add(vo.getPre_money()));
                vo.setGathering_bal(vo.getGathering_init().add(vo.getGathering_money()));
                vo.setRec_bal(vo.getRec_init().add(vo.getRec_money()));
            }
            vo.setPk_org_pk(pk_org);
            vo.setPk_org(this.getMultiText("985be8a4-3a36-4778-8afe-2d8ed3902659", pk_org, "NAME" + ArapBillPubUtil.getMultiLangIndex()));
            result.add(vo);
        }
        return result.toArray(new CrmArapVO[0]);
    }

    public CrmArapVO[] queryGatheringBillInfo(CrmConditionVO crmConditionVO) throws BusinessException {
        StringBuffer sql = new StringBuffer(" select ");
        sql.append(" pk_org,pk_org pk_org_pk,pk_currtype,pk_gatherbill pk_bill,billno,billdate,objtype,customer,pk_deptid,pk_psndoc,money_cr money,local_money_cr local_money, groupcrebit grouplocal,globalcrebit globallocal,pk_balatype,recaccount");
        sql.append(" from");
        sql.append(" ar_gatheritem where 1=1 ");
        sql.append(" and customer ='" + crmConditionVO.getCustomer() + "' and ");
        sql.append(SqlUtils.getInStr((String)"pk_org", (String[])crmConditionVO.getPk_org()));
        sql.append(" and (billdate >='" + crmConditionVO.getStartDate() + "' and billdate <='" + crmConditionVO.getEndDate() + "' ) ");
        List ret1 = (List)DBCacheQueryFacade.runQuery((String)sql.toString(), (ResultSetProcessor)new BeanListProcessor(CrmArapVO.class));
        if (ret1 == null) {
            return null;
        }
        if (ret1.size() <= 0) {
            return null;
        }
        if (ret1.size() >= crmConditionVO.getStartNum() && ret1.size() <= crmConditionVO.getEndNum()) {
            return this.translateDocsMultLang(ret1.subList(crmConditionVO.getStartNum(), ret1.size()).toArray(new CrmArapVO[0]), true);
        }
        if (ret1.size() >= crmConditionVO.getEndNum()) {
            return this.translateDocsMultLang(ret1.subList(crmConditionVO.getStartNum(), crmConditionVO.getEndNum()).toArray(new CrmArapVO[0]), true);
        }
        return null;
    }

    public CrmArapVO[] queryPayBillInfo(CrmConditionVO crmConditionVO) throws BusinessException {
        StringBuffer sql = new StringBuffer(" select ");
        sql.append(" pk_org,pk_org pk_org_pk,pk_currtype,pk_paybill pk_bill, billno,billdate,objtype,supplier customer,pk_deptid,pk_psndoc,money_de money,local_money_de local_money, groupdebit grouplocal,globaldebit globallocal,pk_balatype,payaccount");
        sql.append(" from");
        sql.append(" AP_PAYITEM where 1=1 ");
        sql.append(" and supplier ='" + crmConditionVO.getCustomer() + "' and ");
        sql.append(SqlUtils.getInStr((String)"pk_org", (String[])crmConditionVO.getPk_org()));
        sql.append(" and (billdate >='" + crmConditionVO.getStartDate() + "' and billdate <='" + crmConditionVO.getEndDate() + "' ) ");
        List ret1 = (List)DBCacheQueryFacade.runQuery((String)sql.toString(), (ResultSetProcessor)new BeanListProcessor(CrmArapVO.class));
        if (ret1 == null) {
            return null;
        }
        if (ret1.size() <= 0) {
            return null;
        }
        if (ret1.size() >= crmConditionVO.getStartNum() && ret1.size() <= crmConditionVO.getEndNum()) {
            return this.translateDocsMultLang(ret1.subList(crmConditionVO.getStartNum(), ret1.size()).toArray(new CrmArapVO[0]), false);
        }
        if (ret1.size() >= crmConditionVO.getEndNum()) {
            return this.translateDocsMultLang(ret1.subList(crmConditionVO.getStartNum(), crmConditionVO.getEndNum()).toArray(new CrmArapVO[0]), false);
        }
        return null;
    }

    public CrmArapBillVO findGatheringBillByPrimaryKey(String keys) throws BusinessException {
        AggGatheringBillVO[] vo = (AggGatheringBillVO[])ArapGeneralDAO.getInstance().query(AggGatheringBillVO.class, new String[]{keys});
        if (vo == null) {
            return null;
        }
        ArapBillPubUtil.refreshChildVO2HeadVO((AggregatedValueObject[])vo);
        List<CrmArapBillVO> list = this.translateDocsMultLang((BaseAggVO[])vo, true);
        if (list.size() > 0) {
            return list.get(0);
        }
        return null;
    }

    public CrmArapBillVO findPayBillByPrimaryKey(String keys) throws BusinessException {
        AggPayBillVO[] vo = (AggPayBillVO[])ArapGeneralDAO.getInstance().query(AggPayBillVO.class, new String[]{keys});
        if (vo == null) {
            return null;
        }
        ArapBillPubUtil.refreshChildVO2HeadVO((AggregatedValueObject[])vo);
        List<CrmArapBillVO> list = this.translateDocsMultLang((BaseAggVO[])vo, false);
        if (list.size() > 0) {
            return list.get(0);
        }
        return null;
    }

    private List<CrmArapBillVO> translateDocsMultLang(BaseAggVO[] vos, boolean isYS) {
        ArrayList<CrmArapBillVO> list = new ArrayList<CrmArapBillVO>();
        if (vos != null && vos.length > 0) {
            for (BaseAggVO vo : vos) {
                BaseBillVO bill = vo.getHeadVO();
                CrmArapBillVO crmBillVO = new CrmArapBillVO();
                this.translateDocsMultLangHead(bill, crmBillVO);
                ArrayList<CrmArapBillBodyVO> bList = new ArrayList<CrmArapBillBodyVO>();
                this.translateDocsMultLangBody(vo.getItems(), bList, isYS);
                crmBillVO.setCrmArapBillBodyVO(bList.toArray(new CrmArapBillBodyVO[0]));
                list.add(crmBillVO);
            }
        }
        return list;
    }

    public void translateDocsMultLangHead(BaseBillVO bill, CrmArapBillVO crmBillVO) {
        String mulitLang = "NAME" + ArapBillPubUtil.getMultiLangIndex();
        crmBillVO.setPk_org_pk(bill.getPk_org());
        crmBillVO.setPk_currtype_pk(bill.getPk_currtype());
        crmBillVO.setIsinit(bill.getIsinit());
        crmBillVO.setPk_org(this.getMultiText("985be8a4-3a36-4778-8afe-2d8ed3902659", bill.getPk_org(), mulitLang));
        crmBillVO.setBillno(bill.getBillno());
        crmBillVO.setBilldate(bill.getBilldate());
        crmBillVO.setObjtype(this.getMultLangObjetype(bill.getObjtype() + EMPTY_STRING));
        crmBillVO.setCustomer(this.getMultiText("e4f48eaf-5567-4383-a370-a59cb3e8a451", bill.getCustomer(), mulitLang));
        crmBillVO.setSupplier(this.getMultiText("720dcc7c-ff19-48f4-b9c5-b90906682f45", bill.getSupplier(), mulitLang));
        crmBillVO.setPk_deptid(this.getMultiText("b26fa3cb-4087-4027-a3b6-c83ab2a086a9", bill.getPk_deptid(), mulitLang));
        crmBillVO.setPk_psndoc(this.getMultiText("40d39c26-a2b6-4f16-a018-45664cac1a1f", bill.getPk_psndoc(), mulitLang));
        crmBillVO.setPk_deptid_v(this.getMultiText("66ed0cf6-e260-4f39-8fbb-172260efd677", bill.getPk_deptid_v(), mulitLang));
        crmBillVO.setPk_currtype(this.getMultiText("b498bc9a-e5fd-4613-8da8-bdae2a05704a", bill.getPk_currtype(), mulitLang));
        crmBillVO.setMoney(bill.getMoney());
        crmBillVO.setLocal_money(bill.getLocal_money());
        crmBillVO.setIsreded(bill.getIsreded());
        crmBillVO.setPk_balatype(this.getMultiText("7016ec17-4116-4b3c-abf1-37e3b5d815ef", bill.getPk_balatype(), mulitLang));
        crmBillVO.setSo_org(this.getMultiText("945f38b6-48ec-43e6-bb09-77ec89a3728f", bill.getSo_org(), mulitLang));
        crmBillVO.setSo_deptid(this.getMultiText("b26fa3cb-4087-4027-a3b6-c83ab2a086a9", bill.getSo_deptid(), mulitLang));
        crmBillVO.setSo_psndoc(this.getMultiText("40d39c26-a2b6-4f16-a018-45664cac1a1f", bill.getSo_psndoc(), mulitLang));
        crmBillVO.setSettleflag(this.getMultLangSettleflag(bill.getSettleflag() + EMPTY_STRING));
        crmBillVO.setInvoiceno(bill.getAttributeValue("invoiceno") == null ? EMPTY_STRING : (String)bill.getAttributeValue("invoiceno"));
        crmBillVO.setSo_org_v(this.getMultiText("df1a50ce-e9d9-418f-b1e8-c406aa067a5c", bill.getSo_org_v(), mulitLang));
        crmBillVO.setEffectstatus(this.getMultLangEffectstatus(bill.getEffectstatus() + EMPTY_STRING));
        crmBillVO.setGloballocal(bill.getGloballocal());
        crmBillVO.setGrouplocal(bill.getGrouplocal());
        crmBillVO.setPu_org(this.getMultiText("5d69ee35-57d0-4f7b-b454-deff4fc73689", bill.getSo_org(), mulitLang));
        crmBillVO.setPu_org_v(this.getMultiText("eda9f476-357f-4ff7-ac09-6766bc29de29", bill.getSo_org(), mulitLang));
        crmBillVO.setPu_deptid(this.getMultiText("b26fa3cb-4087-4027-a3b6-c83ab2a086a9", bill.getPu_deptid(), mulitLang));
        crmBillVO.setPu_psndoc(this.getMultiText("40d39c26-a2b6-4f16-a018-45664cac1a1f", bill.getPu_psndoc(), mulitLang));
    }

    public void translateDocsMultLangBody(BaseItemVO[] items, List<CrmArapBillBodyVO> bList, boolean isYS) {
        String mulitLang = "NAME" + ArapBillPubUtil.getMultiLangIndex();
        for (BaseItemVO bill : items) {
            CrmArapBillBodyVO vo = new CrmArapBillBodyVO();
            vo.setPk_org_pk(bill.getPk_org());
            vo.setPk_currtype_pk(bill.getPk_currtype());
            vo.setContractno(bill.getContractno());
            vo.setInvoiceno(bill.getInvoiceno());
            vo.setPurchaseorder(bill.getPurchaseorder());
            vo.setPk_org(this.getMultiText("985be8a4-3a36-4778-8afe-2d8ed3902659", bill.getPk_org(), mulitLang));
            vo.setObjtype(this.getMultLangObjetype(bill.getObjtype() + EMPTY_STRING));
            vo.setCustomer(this.getMultiText("e4f48eaf-5567-4383-a370-a59cb3e8a451", bill.getCustomer(), mulitLang));
            vo.setSupplier(this.getMultiText("720dcc7c-ff19-48f4-b9c5-b90906682f45", bill.getSupplier(), mulitLang));
            vo.setPk_deptid(this.getMultiText("b26fa3cb-4087-4027-a3b6-c83ab2a086a9", bill.getPk_deptid(), mulitLang));
            vo.setPk_psndoc(this.getMultiText("40d39c26-a2b6-4f16-a018-45664cac1a1f", bill.getPk_psndoc(), mulitLang));
            vo.setPrepay(this.getMultLangPrepay(bill.getPrepay() + EMPTY_STRING, isYS));
            vo.setPk_currtype(this.getMultiText("b498bc9a-e5fd-4613-8da8-bdae2a05704a", bill.getPk_currtype(), mulitLang));
            vo.setSo_org(this.getMultiText("945f38b6-48ec-43e6-bb09-77ec89a3728f", bill.getSo_org(), mulitLang));
            vo.setRate(bill.getRate());
            vo.setMoney_cr(bill.getMoney_cr());
            vo.setLocal_money_cr(bill.getLocal_money_cr());
            vo.setSo_ordertype(this.getBillTypeByPk(bill.getSo_ordertype(), mulitLang));
            vo.setSo_transtype(this.getMultiText("6d90c539-bdcd-4eb1-a4f0-855f328fecb1", bill.getSo_transtype(), mulitLang));
            vo.setSo_deptid(this.getMultiText("b26fa3cb-4087-4027-a3b6-c83ab2a086a9", bill.getSo_deptid(), mulitLang));
            vo.setSo_psndoc(this.getMultiText("40d39c26-a2b6-4f16-a018-45664cac1a1f", bill.getSo_psndoc(), mulitLang));
            vo.setPk_balatype(this.getMultiText("7016ec17-4116-4b3c-abf1-37e3b5d815ef", bill.getPk_balatype(), mulitLang));
            vo.setChecktype(this.getMultiText("74c98540-4879-4584-a4c9-0f8b6e20b96a", bill.getChecktype(), mulitLang));
            vo.setCheckno(bill.getCheckno());
            vo.setRecaccount(this.getBankNameByPk(bill.getRecaccount(), mulitLang));
            vo.setPayaccount(this.getBankNameByPk(bill.getPayaccount(), mulitLang));
            if (isYS) {
                vo.setOrdercubasdoc(this.getMultiText("e4f48eaf-5567-4383-a370-a59cb3e8a451", bill.getOrdercubasdoc(), mulitLang));
            } else {
                vo.setOrdercubasdoc(this.getMultiText("720dcc7c-ff19-48f4-b9c5-b90906682f45", bill.getOrdercubasdoc(), mulitLang));
            }
            vo.setMoney_bal(bill.getMoney_bal());
            vo.setGrouprate(bill.getGrouprate());
            vo.setGlobalrate(vo.getGlobalrate());
            vo.setGroupcrebit(bill.getGroupcrebit());
            vo.setGroupdebit(bill.getGroupdebit());
            vo.setGroupbalance(bill.getGroupbalance());
            vo.setGlobalcrebit(bill.getGlobalcrebit());
            vo.setGlobaldebit(bill.getGlobaldebit());
            vo.setGlobalbalance(bill.getGlobalbalance());
            vo.setLocal_price(bill.getLocal_price());
            vo.setMoney_de(bill.getMoney_de());
            vo.setLocal_money_de(bill.getLocal_money_de());
            vo.setProject(this.getMultiText("69673c89-bcd2-44d0-aeb0-2ad08882b016", bill.getProject(), mulitLang));
            vo.setPu_org(this.getMultiText("5d69ee35-57d0-4f7b-b454-deff4fc73689", bill.getSo_org(), mulitLang));
            vo.setPu_deptid(this.getMultiText("b26fa3cb-4087-4027-a3b6-c83ab2a086a9", bill.getPu_deptid(), mulitLang));
            vo.setPu_psndoc(this.getMultiText("40d39c26-a2b6-4f16-a018-45664cac1a1f", bill.getPu_psndoc(), mulitLang));
            vo.setProductline(this.getMultiText("029c4c8f-39bb-4208-acc0-c3f66632f328", bill.getProductline(), mulitLang));
            vo.setCashaccount(this.getMultiText("d5d5b39d-2c93-4686-be49-e08a0a5f5afd", bill.getCashaccount(), mulitLang));
            bList.add(vo);
        }
    }

    public CrmArapVO[] translateDocsMultLang(CrmArapVO[] list, boolean isJS) {
        for (CrmArapVO vo : list) {
            vo.setObjtype(this.getMultLangObjetype(vo.getObjtype()));
            this.getDocsMultLang(vo, "NAME" + ArapBillPubUtil.getMultiLangIndex(), isJS);
        }
        return list;
    }

    public String getMultLangObjetype(String objtype) {
        if ("0".equals(objtype)) {
            objtype = NCLangRes4VoTransl.getNCLangRes().getStrByID("common", "2UC000-000283");
        } else if ("1".equals(objtype)) {
            objtype = NCLangRes4VoTransl.getNCLangRes().getStrByID("common", "2UC000-000089");
        } else if ("2".equals(objtype)) {
            objtype = NCLangRes4VoTransl.getNCLangRes().getStrByID("common", "2UC000-000972");
        } else if ("3".equals(objtype)) {
            objtype = NCLangRes4VoTransl.getNCLangRes().getStrByID("common", "2UC000-000013");
        }
        return objtype;
    }

    public String getMultLangSettleflag(String settleflag) {
        if ("0".equals(settleflag)) {
            settleflag = NCLangRes4VoTransl.getNCLangRes().getStrByID("payablebill", "2payable-000050");
        } else if ("1".equals(settleflag)) {
            settleflag = NCLangRes4VoTransl.getNCLangRes().getStrByID("payablebill", "2payable-000002");
        } else if ("-1".equals(settleflag)) {
            settleflag = NCLangRes4VoTransl.getNCLangRes().getStrByID("payablebill", "2payable-000005");
        } else if ("2".equals(settleflag)) {
            settleflag = NCLangRes4VoTransl.getNCLangRes().getStrByID("payablebill", "2payable-000110");
        } else if ("11".equals(settleflag)) {
            settleflag = NCLangRes4VoTransl.getNCLangRes().getStrByID("payablebill", "2payable-000069");
        }
        return settleflag;
    }

    public String getMultLangEffectstatus(String effectstatus) {
        if ("0".equals(effectstatus)) {
            effectstatus = NCLangRes4VoTransl.getNCLangRes().getStrByID("payablebill", "2payable-000004");
        } else if ("10".equals(effectstatus)) {
            effectstatus = NCLangRes4VoTransl.getNCLangRes().getStrByID("payablebill", "2payable-000081");
        }
        return effectstatus;
    }

    public String getMultLangPrepay(String prepay, boolean isYS) {
        if (isYS) {
            if ("0".equals(prepay)) {
                prepay = NCLangRes4VoTransl.getNCLangRes().getStrByID("gatherbill", "2gather-000054");
            } else if ("1".equals(prepay)) {
                prepay = NCLangRes4VoTransl.getNCLangRes().getStrByID("gatherbill", "2gather-000048");
            }
        } else if ("0".equals(prepay)) {
            prepay = NCLangRes4VoTransl.getNCLangRes().getStrByID("paybill", "2paybill-000035");
        } else if ("1".equals(prepay)) {
            prepay = NCLangRes4VoTransl.getNCLangRes().getStrByID("paybill", "2paybill-000040");
        }
        return prepay;
    }

    public static boolean isNotEmpty(String str) {
        return str != null && !str.equals("~") && str.length() > 0;
    }

    public void getDocsMultLang(CrmArapVO obj, String mulitLang, boolean isJS) {
        if (ArapPubQueryServiceForCRM.isNotEmpty(obj.getPk_org())) {
            obj.setPk_org(this.getMultiText("985be8a4-3a36-4778-8afe-2d8ed3902659", obj.getPk_org(), mulitLang));
        }
        if (ArapPubQueryServiceForCRM.isNotEmpty(obj.getCustomer())) {
            if (isJS) {
                obj.setCustomer(this.getMultiText("e4f48eaf-5567-4383-a370-a59cb3e8a451", obj.getCustomer(), mulitLang));
            } else {
                obj.setCustomer(this.getMultiText("720dcc7c-ff19-48f4-b9c5-b90906682f45", obj.getCustomer(), mulitLang));
            }
        }
        if (ArapPubQueryServiceForCRM.isNotEmpty(obj.getPk_deptid())) {
            obj.setPk_deptid(this.getMultiText("b26fa3cb-4087-4027-a3b6-c83ab2a086a9", obj.getPk_deptid(), mulitLang));
        }
        if (ArapPubQueryServiceForCRM.isNotEmpty(obj.getPk_psndoc())) {
            obj.setPk_psndoc(this.getMultiText("40d39c26-a2b6-4f16-a018-45664cac1a1f", obj.getPk_psndoc(), mulitLang));
        }
        if (ArapPubQueryServiceForCRM.isNotEmpty(obj.getPk_balatype())) {
            obj.setPk_balatype(this.getMultiText("7016ec17-4116-4b3c-abf1-37e3b5d815ef", obj.getPk_balatype(), mulitLang));
        }
        if (ArapPubQueryServiceForCRM.isNotEmpty(obj.getRecaccount())) {
            obj.setRecaccount(this.getBankNameByPk(obj.getRecaccount(), mulitLang));
        }
        if (ArapPubQueryServiceForCRM.isNotEmpty(obj.getPayaccount())) {
            obj.setPayaccount(this.getBankNameByPk(obj.getPayaccount(), mulitLang));
        }
    }

    private String getMultiText(String classTypeID, String docPK, String mulitname) {
        if (StringUtil.isEmpty((String)docPK)) {
            return EMPTY_STRING;
        }
        IBDData accessor = GeneralAccessorFactory.getAccessor((String)classTypeID).getDocByPk(docPK);
        String text = EMPTY_STRING;
        if (accessor == null) {
            return text;
        }
        MultiLangText multi = accessor.getName();
        if (PayForECParamVO.MutilLang.NAME.name().equals(mulitname)) {
            text = multi.getText();
        } else if (PayForECParamVO.MutilLang.NAME2.name().equals(mulitname)) {
            text = multi.getText2();
        } else if (PayForECParamVO.MutilLang.NAME3.name().equals(mulitname)) {
            text = multi.getText3();
        } else if (PayForECParamVO.MutilLang.NAME4.name().equals(mulitname)) {
            text = multi.getText4();
        } else if (PayForECParamVO.MutilLang.NAME5.name().equals(mulitname)) {
            text = multi.getText5();
        } else if (PayForECParamVO.MutilLang.NAME6.name().equals(mulitname)) {
            text = multi.getText6();
        }
        if (text == null) {
            text = multi.getText();
        }
        return text;
    }

    private FormulaParseFather getPaser() {
        if (this.paser == null) {
            this.paser = new FormulaParse();
        }
        return this.paser;
    }

    private String getBankNameByPk(String pkRecbankacc, String mulitname) {
        String filterval = pkRecbankacc;
        if (StringUtils.isEmpty((CharSequence)filterval)) {
            return EMPTY_STRING;
        }
        String table = BankAccSubVO.getDefaultTableName();
        String qryfield = "pk_bankaccbas";
        String filterfield = "pk_bankaccsub";
        filterval = this.execFormula(table, qryfield, filterfield, filterval);
        table = BankAccbasVO.getDefaultTableName();
        qryfield = mulitname;
        filterfield = "pk_bankaccbas";
        filterval = this.execFormula(table, qryfield, filterfield, filterval);
        return this.getPaser().getValue();
    }

    private String getBillTypeByPk(String pk, String mulitname) {
        String filterval = pk;
        if (StringUtils.isEmpty((CharSequence)filterval)) {
            return EMPTY_STRING;
        }
        String table = "bd_billtype";
        String qryfield = "BILLTYPENAME" + ArapBillPubUtil.getMultiLangIndex();
        String filterfield = "pk_billtypeid";
        filterval = this.execFormula(table, qryfield, filterfield, filterval);
        return this.getPaser().getValue();
    }

    private String execFormula(String table, String select, String where, String value, String defaultVal) {
        if (StringUtils.isEmpty((CharSequence)value)) {
            return EMPTY_STRING;
        }
        this.getPaser().setExpress("getColValue(" + table + "," + select + "," + where + ",value)");
        this.getPaser().addVariable("value", (Object)value);
        String value2 = this.getPaser().getValue();
        return StringUtils.isEmpty((CharSequence)value2) ? defaultVal : value2;
    }

    private String execFormula(String table, String select, String where, String value) {
        return this.execFormula(table, select, where, value, "~");
    }
}

