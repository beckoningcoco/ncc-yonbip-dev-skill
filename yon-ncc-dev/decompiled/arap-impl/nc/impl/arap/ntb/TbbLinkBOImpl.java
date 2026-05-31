/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.util.ArapBillType2TableMapping
 *  nc.bs.arap.util.SqlUtils
 *  nc.bs.dao.BaseDAO
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.pf.pub.PfDataCache
 *  nc.itf.arap.ntb.ITbbLinkBO
 *  nc.jdbc.framework.processor.BeanListProcessor
 *  nc.jdbc.framework.processor.ResultSetProcessor
 *  nc.md.persist.framework.IMDPersistenceQueryService
 *  nc.pubitf.fip.service.IFipBillQueryService
 *  nc.uif.pub.exception.UifException
 *  nc.vo.arap.basebill.BaseBillVO
 *  nc.vo.arap.basebill.BaseItemVO
 *  nc.vo.arap.gathering.GatheringBillItemVO
 *  nc.vo.arap.gathering.GatheringBillVO
 *  nc.vo.arap.global.ArapCommonTool
 *  nc.vo.arap.ntb.ArapNtbUtils
 *  nc.vo.arap.ntb.ArapQueryVO
 *  nc.vo.arap.pay.PayBillItemVO
 *  nc.vo.arap.pay.PayBillVO
 *  nc.vo.arap.payable.PayableBillItemVO
 *  nc.vo.arap.payable.PayableBillVO
 *  nc.vo.arap.pub.ArapBillTypeInfo
 *  nc.vo.arap.pub.ArapConstant
 *  nc.vo.arap.pub.IArapBilltypeInfo
 *  nc.vo.arap.receivable.ReceivableBillItemVO
 *  nc.vo.arap.receivable.ReceivableBillVO
 *  nc.vo.arap.tally.DetailLinkQueryVO
 *  nc.vo.arap.utils.StringUtil
 *  nc.vo.bd.account.AccAsoaVO
 *  nc.vo.bd.cust.CustomerVO
 *  nc.vo.bd.inoutbusiclass.InoutBusiClassVO
 *  nc.vo.bd.material.MaterialVO
 *  nc.vo.bd.psn.PsndocVO
 *  nc.vo.bd.supplier.SupplierVO
 *  nc.vo.fip.service.FipRelationInfoVO
 *  nc.vo.fipub.report.PubCommonReportMethod
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.org.DeptVO
 *  nc.vo.org.FinanceOrgVO
 *  nc.vo.pmpub.project.ProjectHeadVO
 *  nc.vo.profitcenter.ProfitCenterVO
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.lang.UFDouble
 *  nc.vo.pubapp.pattern.pub.MapSet
 *  nc.vo.resa.costcenter.CostCenterVO
 *  nc.vo.tb.obj.NtbParamVO
 *  nccloud.commons.lang.StringUtils
 */
package nc.impl.arap.ntb;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import nc.bs.arap.util.ArapBillType2TableMapping;
import nc.bs.arap.util.SqlUtils;
import nc.bs.dao.BaseDAO;
import nc.bs.framework.common.NCLocator;
import nc.bs.pf.pub.PfDataCache;
import nc.itf.arap.ntb.ITbbLinkBO;
import nc.jdbc.framework.processor.BeanListProcessor;
import nc.jdbc.framework.processor.ResultSetProcessor;
import nc.md.persist.framework.IMDPersistenceQueryService;
import nc.pubitf.fip.service.IFipBillQueryService;
import nc.uif.pub.exception.UifException;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.arap.gathering.GatheringBillItemVO;
import nc.vo.arap.gathering.GatheringBillVO;
import nc.vo.arap.global.ArapCommonTool;
import nc.vo.arap.ntb.ArapNtbUtils;
import nc.vo.arap.ntb.ArapQueryVO;
import nc.vo.arap.pay.PayBillItemVO;
import nc.vo.arap.pay.PayBillVO;
import nc.vo.arap.payable.PayableBillItemVO;
import nc.vo.arap.payable.PayableBillVO;
import nc.vo.arap.pub.ArapBillTypeInfo;
import nc.vo.arap.pub.ArapConstant;
import nc.vo.arap.pub.IArapBilltypeInfo;
import nc.vo.arap.receivable.ReceivableBillItemVO;
import nc.vo.arap.receivable.ReceivableBillVO;
import nc.vo.arap.tally.DetailLinkQueryVO;
import nc.vo.arap.utils.StringUtil;
import nc.vo.bd.account.AccAsoaVO;
import nc.vo.bd.cust.CustomerVO;
import nc.vo.bd.inoutbusiclass.InoutBusiClassVO;
import nc.vo.bd.material.MaterialVO;
import nc.vo.bd.psn.PsndocVO;
import nc.vo.bd.supplier.SupplierVO;
import nc.vo.fip.service.FipRelationInfoVO;
import nc.vo.fipub.report.PubCommonReportMethod;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.org.DeptVO;
import nc.vo.org.FinanceOrgVO;
import nc.vo.pmpub.project.ProjectHeadVO;
import nc.vo.profitcenter.ProfitCenterVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.pub.MapSet;
import nc.vo.resa.costcenter.CostCenterVO;
import nc.vo.tb.obj.NtbParamVO;
import nccloud.commons.lang.StringUtils;

public class TbbLinkBOImpl
implements ITbbLinkBO {
    BaseDAO dao = new BaseDAO();
    private IMDPersistenceQueryService service;
    private final String PRE_ORG = "org";
    private final String PRE_CUSTOMER = "customer";
    private final String PRE_SUPPLIER = "supplier";
    private final String PRE_DEPT = "dept";
    private final String PRE_PSNDOC = "psndoc";
    private final String PRE_PK_SUBJCODE = "pk_subjcode";
    private final String PRE_MATERIAL = "material";
    private final String PRE_SUBJCODE = "subjcode";
    private final String PRE_COSTCENTER = "costcenter";
    private final String PRE_PROJECT = "project";
    private final String PRE_PCORG = "pcorg";
    private final String PRE_ORDERCUBASDOC = "ordercubasdoc";

    public List<DetailLinkQueryVO> getLinkDatas(NtbParamVO ntbParamVO) throws BusinessException {
        if (ntbParamVO == null) {
            return null;
        }
        ArapQueryVO queryVO = ArapNtbUtils.analyseParam((NtbParamVO)ntbParamVO);
        this.validate(queryVO);
        if ("UFIND".equals(ntbParamVO.getMethodCode())) {
            queryVO.setBillstatus(ntbParamVO.isUnInure() ? ArapQueryVO.BILLSTATUS_ALL : ArapQueryVO.BILLSTATUS_EFFECT);
        } else {
            queryVO.setBillstatus(ArapQueryVO.BILLSTATUS_SAVE);
        }
        return this.convert(ntbParamVO, this.getData(queryVO));
    }

    private BaseItemVO[] getData(ArapQueryVO queryVO) throws BusinessException {
        BaseItemVO[] resultDatas = null;
        String cond = ArapNtbUtils.createWherePart((ArapQueryVO)queryVO);
        Collection cl = null;
        String qrysql = "";
        if ("F0".equals(queryVO.getBill_code())) {
            qrysql = "select * from ar_recitem fib where " + cond;
            cl = (Collection)this.dao.executeQuery(qrysql, (ResultSetProcessor)new BeanListProcessor(ReceivableBillItemVO.class));
        } else if ("F1".equals(queryVO.getBill_code())) {
            String payableIsrefundSql = " 1 = 1 and not exists (select 1 from ap_payablebill ta where ta.isrefund = 'Y' and fib.objtype = 0 and fib.pk_payablebill = ta.pk_payablebill) and ";
            qrysql = "select * from ap_payableitem fib where " + payableIsrefundSql + cond;
            cl = (Collection)this.dao.executeQuery(qrysql, (ResultSetProcessor)new BeanListProcessor(PayableBillItemVO.class));
        } else if ("F2".equals(queryVO.getBill_code())) {
            qrysql = "select * from ar_gatheritem fib where " + cond;
            cl = (Collection)this.dao.executeQuery(qrysql, (ResultSetProcessor)new BeanListProcessor(GatheringBillItemVO.class));
        } else if ("F3".equals(queryVO.getBill_code())) {
            String payIsrefundSql = " 1 = 1 and not exists (select 1 from ap_paybill ta where ta.isrefund = 'Y' and fib.objtype = 0 and fib.pk_paybill = ta.pk_paybill) and ";
            qrysql = "select * from ap_payitem fib where " + payIsrefundSql + cond;
            cl = (Collection)this.dao.executeQuery(qrysql, (ResultSetProcessor)new BeanListProcessor(PayBillItemVO.class));
        }
        if (cl == null || cl.size() == 0) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0364"));
        }
        resultDatas = (BaseItemVO[])ArapCommonTool.changeCollection2Array((Collection)cl, BaseItemVO.class);
        HashSet<String> pks1 = new HashSet<String>();
        HashSet<String> pks2 = new HashSet<String>();
        HashSet<String> pks3 = new HashSet<String>();
        HashSet<String> pks4 = new HashSet<String>();
        String pk = null;
        for (BaseItemVO item : resultDatas) {
            if ("F0".equals(queryVO.getBill_code())) {
                pk = ((ReceivableBillItemVO)item).getPk_recbill();
                pks1.add(pk);
                continue;
            }
            if ("F1".equals(queryVO.getBill_code())) {
                pk = ((PayableBillItemVO)item).getPk_payablebill();
                pks2.add(pk);
                continue;
            }
            if ("F2".equals(queryVO.getBill_code())) {
                pk = ((GatheringBillItemVO)item).getPk_gatherbill();
                pks3.add(pk);
                continue;
            }
            if (!"F3".equals(queryVO.getBill_code())) continue;
            pk = ((PayBillItemVO)item).getPk_paybill();
            pks4.add(pk);
        }
        HashMap<String, BaseBillVO> vos = new HashMap<String, BaseBillVO>();
        if (pks1.size() != 0) {
            IArapBilltypeInfo info = ArapBillTypeInfo.getInstance((Object)"F0");
            Collection billVOs = this.dao.retrieveByClause(ReceivableBillVO.class, SqlUtils.getInStr((String)info.getTablePrimaryKeyBill(), (String[])pks1.toArray(new String[0])));
            for (BaseBillVO svo : billVOs) {
                vos.put(svo.getPrimaryKey(), svo);
            }
        }
        if (pks2.size() != 0) {
            IArapBilltypeInfo info = ArapBillTypeInfo.getInstance((Object)"F1");
            Collection billVOs = this.dao.retrieveByClause(PayableBillVO.class, SqlUtils.getInStr((String)info.getTablePrimaryKeyBill(), (String[])pks2.toArray(new String[0])));
            for (BaseBillVO svo : billVOs) {
                vos.put(svo.getPrimaryKey(), svo);
            }
        }
        if (pks3.size() != 0) {
            IArapBilltypeInfo info = ArapBillTypeInfo.getInstance((Object)"F2");
            Collection billVOs = this.dao.retrieveByClause(GatheringBillVO.class, SqlUtils.getInStr((String)info.getTablePrimaryKeyBill(), (String[])pks3.toArray(new String[0])));
            for (BaseBillVO svo : billVOs) {
                vos.put(svo.getPrimaryKey(), svo);
            }
        }
        if (pks4.size() != 0) {
            IArapBilltypeInfo info = ArapBillTypeInfo.getInstance((Object)"F3");
            Collection billVOs = this.dao.retrieveByClause(PayBillVO.class, SqlUtils.getInStr((String)info.getTablePrimaryKeyBill(), (String[])pks4.toArray(new String[0])));
            for (BaseBillVO svo : billVOs) {
                vos.put(svo.getPrimaryKey(), svo);
            }
        }
        for (BaseItemVO item : resultDatas) {
            item.setBusidate(((BaseBillVO)vos.get(item.getAttributeValue(ArapBillTypeInfo.getInstance((Object)item.getPk_billtype()).getTablePrimaryKeyBill()))).getEffectdate());
        }
        return resultDatas;
    }

    private void validate(ArapQueryVO queryVO) throws BusinessException {
        if (StringUtils.isEmpty((CharSequence)queryVO.getBegdate())) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0366"));
        }
        if (StringUtils.isEmpty((CharSequence)queryVO.getEnddate())) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0367"));
        }
        if (StringUtils.isEmpty((CharSequence)queryVO.getBill_code())) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0368"));
        }
    }

    public List<DetailLinkQueryVO> convert(NtbParamVO ntbParamVO, BaseItemVO[] datas) throws BusinessException {
        if (datas == null || datas.length == 0) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0364"));
        }
        Map<String, Object> voHashMap = this.getVOMapInfo(datas);
        ArrayList<FipRelationInfoVO> relationInfoVOs = new ArrayList<FipRelationInfoVO>();
        ArrayList<DetailLinkQueryVO> resultVOs = new ArrayList<DetailLinkQueryVO>();
        String pkName = null;
        String codeName = null;
        String name = null;
        DetailLinkQueryVO vo = null;
        String langIdx = PubCommonReportMethod.getMultiLangIndex();
        ArapConstant constant = new ArapConstant();
        for (int i = 0; i < datas.length; ++i) {
            vo = new DetailLinkQueryVO();
            vo.setPk_group(datas[i].getPk_group());
            vo.setPk_org(datas[i].getPk_org());
            vo.setCode_org(((FinanceOrgVO)voHashMap.get("org" + datas[i].getPk_org())).getCode());
            vo.setOrg(((FinanceOrgVO)voHashMap.get("org" + datas[i].getPk_org())).getName());
            vo.setPk_billtype(datas[i].getPk_billtype());
            vo.setPk_tradetype(datas[i].getPk_tradetype());
            vo.setPk_tradetypeid(datas[i].getPk_tradetypeid());
            vo.setPk_currtype(datas[i].getPk_currtype());
            vo.setInvoiceno(datas[i].getInvoiceno());
            vo.setPk_bill(datas[i].getParentPK());
            vo.setBillno(datas[i].getBillno());
            vo.setBilldate(datas[i].getBilldate());
            vo.setEffectdate(datas[i].getBusidate());
            vo.setBrief(datas[i].getScomment());
            vo.setDebt_qua(datas[i].getQuantity_de());
            vo.setDebt_ori(datas[i].getMoney_de());
            vo.setDebt_loc(datas[i].getLocal_money_de());
            vo.setGr_debt_loc(datas[i].getGroupdebit());
            vo.setGl_debt_loc(datas[i].getGlobaldebit());
            vo.setCredit_qua(datas[i].getQuantity_cr());
            vo.setCredit_ori(datas[i].getMoney_cr());
            vo.setCredit_loc(datas[i].getLocal_money_cr());
            vo.setGr_credit_loc(datas[i].getGroupcrebit());
            vo.setGl_credit_loc(datas[i].getGlobalcrebit());
            String moneyattr_fld = ntbParamVO.getData_attrExt();
            if (!StringUtil.isEmpty((String)moneyattr_fld)) {
                if (constant.ARAP_NTB_CTL_NOTAX_KEY.equals(moneyattr_fld)) {
                    vo.setDebt_ori(datas[i].getNotax_de());
                    vo.setDebt_loc(datas[i].getLocal_notax_de());
                    vo.setGr_debt_loc(datas[i].getGroupnotax_de());
                    vo.setGl_debt_loc(datas[i].getGlobalnotax_de());
                    vo.setCredit_ori(datas[i].getNotax_cr());
                    vo.setCredit_loc(datas[i].getLocal_notax_cr());
                    vo.setGr_credit_loc(datas[i].getGroupnotax_cre());
                    vo.setGl_credit_loc(datas[i].getGlobalnotax_cre());
                } else if (constant.ARAP_NTB_CTL_TAX_KEY.equals(moneyattr_fld)) {
                    vo.setDebt_ori(UFDouble.ZERO_DBL);
                    vo.setDebt_loc(datas[i].getLocal_tax_de());
                    vo.setGr_debt_loc(datas[i].getGrouptax_de());
                    vo.setGl_debt_loc(datas[i].getGlobaltax_de());
                    vo.setCredit_ori(UFDouble.ZERO_DBL);
                    vo.setCredit_loc(datas[i].getLocal_tax_cr());
                    vo.setGr_credit_loc(datas[i].getGrouptax_cre());
                    vo.setGl_credit_loc(datas[i].getGlobaltax_cre());
                }
            }
            FipRelationInfoVO relationInfoVO = new FipRelationInfoVO();
            relationInfoVO.setPk_group(datas[i].getPk_group());
            relationInfoVO.setPk_org(datas[i].getPk_org());
            relationInfoVO.setPk_billtype(datas[i].getPk_tradetype());
            relationInfoVO.setRelationID((String)datas[i].getAttributeValue(ArapBillType2TableMapping.getParentTablePK((String)PfDataCache.getBillTypeInfo((String)relationInfoVO.getPk_billtype()).getParentbilltype()).split("\\.")[1]));
            relationInfoVOs.add(relationInfoVO);
            String[] busiAttrs = ntbParamVO.getBusiAttrs();
            SuperVO superVO = null;
            int qryObjCnt = 0;
            Object attrName = "";
            for (int j = 0; j < busiAttrs.length && qryObjCnt < 5; ++j) {
                pkName = "qryobj" + qryObjCnt + "pk";
                codeName = "qryobj" + qryObjCnt + "code";
                name = "qryobj" + qryObjCnt;
                superVO = null;
                if (ArapConstant.ARAP_CUSTOMER.equals(busiAttrs[j])) {
                    superVO = (SuperVO)voHashMap.get("customer" + datas[i].getCustomer());
                    if (superVO != null) {
                        vo.setAttributeValue(pkName, (Object)((CustomerVO)superVO).getPrimaryKey());
                        vo.setAttributeValue(codeName, (Object)((CustomerVO)superVO).getCode());
                        attrName = superVO.getAttributeValue("name" + langIdx) == null ? superVO.getAttributeValue("name") : superVO.getAttributeValue("name" + langIdx);
                        vo.setAttributeValue(name, attrName);
                    }
                } else if (ArapConstant.ARAP_SUPPLIER.equals(busiAttrs[j])) {
                    superVO = (SuperVO)voHashMap.get("supplier" + datas[i].getSupplier());
                    if (superVO != null) {
                        vo.setAttributeValue(pkName, (Object)((SupplierVO)superVO).getPrimaryKey());
                        vo.setAttributeValue(codeName, (Object)((SupplierVO)superVO).getCode());
                        attrName = superVO.getAttributeValue("name" + langIdx) == null ? superVO.getAttributeValue("name") : superVO.getAttributeValue("name" + langIdx);
                        vo.setAttributeValue(name, attrName);
                    }
                } else if (ArapConstant.ARAP_DEPT.equals(busiAttrs[j])) {
                    superVO = (SuperVO)voHashMap.get("dept" + datas[i].getPk_deptid());
                    if (superVO != null) {
                        vo.setAttributeValue(pkName, (Object)((DeptVO)superVO).getPrimaryKey());
                        vo.setAttributeValue(codeName, (Object)((DeptVO)superVO).getCode());
                        attrName = superVO.getAttributeValue("name" + langIdx) == null ? superVO.getAttributeValue("name") : superVO.getAttributeValue("name" + langIdx);
                        vo.setAttributeValue(name, attrName);
                    }
                } else if (ArapConstant.ARAP_PSNDOC.equals(busiAttrs[j])) {
                    superVO = (SuperVO)voHashMap.get("psndoc" + datas[i].getPk_psndoc());
                    if (superVO != null) {
                        vo.setAttributeValue(pkName, (Object)((PsndocVO)superVO).getPrimaryKey());
                        vo.setAttributeValue(codeName, (Object)((PsndocVO)superVO).getCode());
                        attrName = superVO.getAttributeValue("name" + langIdx) == null ? superVO.getAttributeValue("name") : superVO.getAttributeValue("name" + langIdx);
                        vo.setAttributeValue(name, attrName);
                    }
                } else if (ArapConstant.ARAP_PK_SUBJCODE.equals(busiAttrs[j])) {
                    superVO = (SuperVO)voHashMap.get("pk_subjcode" + datas[i].getPk_subjcode());
                    if (superVO != null) {
                        vo.setAttributeValue(pkName, (Object)((InoutBusiClassVO)superVO).getPrimaryKey());
                        vo.setAttributeValue(codeName, (Object)((InoutBusiClassVO)superVO).getCode());
                        attrName = superVO.getAttributeValue("name" + langIdx) == null ? superVO.getAttributeValue("name") : superVO.getAttributeValue("name" + langIdx);
                        vo.setAttributeValue(name, attrName);
                    }
                } else if (ArapConstant.ARAP_MATERIAL.equals(busiAttrs[j])) {
                    superVO = (SuperVO)voHashMap.get("material" + datas[i].getMaterial());
                    if (superVO != null) {
                        vo.setAttributeValue(pkName, (Object)((MaterialVO)superVO).getPrimaryKey());
                        vo.setAttributeValue(codeName, (Object)((MaterialVO)superVO).getCode());
                        attrName = superVO.getAttributeValue("name" + langIdx) == null ? superVO.getAttributeValue("name") : superVO.getAttributeValue("name" + langIdx);
                        vo.setAttributeValue(name, attrName);
                    }
                } else if (ArapConstant.ARAP_SUBJCODE.equals(busiAttrs[j])) {
                    superVO = (SuperVO)voHashMap.get("subjcode" + datas[i].getSubjcode());
                    if (superVO != null) {
                        vo.setAttributeValue(pkName, (Object)((AccAsoaVO)superVO).getPrimaryKey());
                        attrName = ((AccAsoaVO)superVO).getAttributeValue("dispname" + langIdx) == null ? ((AccAsoaVO)superVO).getAttributeValue("dispname") : ((AccAsoaVO)superVO).getAttributeValue("dispname" + langIdx);
                        vo.setAttributeValue(name, attrName);
                    }
                } else if (ArapConstant.ARAP_COSTCENTER.equals(busiAttrs[j])) {
                    superVO = (SuperVO)voHashMap.get("costcenter" + datas[i].getCostcenter());
                    if (superVO != null) {
                        vo.setAttributeValue(pkName, (Object)((CostCenterVO)superVO).getPrimaryKey());
                        vo.setAttributeValue(codeName, (Object)((CostCenterVO)superVO).getCccode());
                        attrName = superVO.getAttributeValue("ccname" + langIdx) == null ? superVO.getAttributeValue("ccname") : superVO.getAttributeValue("ccname" + langIdx);
                        vo.setAttributeValue(name, attrName);
                    }
                } else if (ArapConstant.ARAP_PK_PROJECT.equals(busiAttrs[j])) {
                    superVO = (SuperVO)voHashMap.get("project" + datas[i].getProject());
                    if (superVO != null) {
                        vo.setAttributeValue(pkName, (Object)((ProjectHeadVO)superVO).getPrimaryKey());
                        vo.setAttributeValue(codeName, (Object)((ProjectHeadVO)superVO).getProject_code());
                        attrName = superVO.getAttributeValue("project_name" + langIdx) == null ? superVO.getAttributeValue("project_name") : superVO.getAttributeValue("project_name" + langIdx);
                        vo.setAttributeValue(name, attrName);
                    }
                } else if (ArapConstant.ARAP_PK_PCORG.equals(busiAttrs[j])) {
                    superVO = (SuperVO)voHashMap.get("pcorg" + datas[i].getPk_pcorg());
                    if (superVO != null) {
                        vo.setAttributeValue(pkName, (Object)((ProfitCenterVO)superVO).getPrimaryKey());
                        vo.setAttributeValue(codeName, (Object)((ProfitCenterVO)superVO).getCode());
                        attrName = superVO.getAttributeValue("name" + langIdx) == null ? superVO.getAttributeValue("name") : superVO.getAttributeValue("name" + langIdx);
                        vo.setAttributeValue(name, attrName);
                    }
                } else if (!ArapConstant.ARAP_PK_BUSITYPE.equals(busiAttrs[j])) {
                    if (ArapConstant.ARAP_ORDERCUBASDOC.equals(busiAttrs[j])) {
                        superVO = (SuperVO)voHashMap.get("pcorg" + datas[i].getOrdercubasdoc());
                        if (superVO != null) {
                            vo.setAttributeValue(pkName, (Object)((CustomerVO)superVO).getPrimaryKey());
                            vo.setAttributeValue(codeName, (Object)((CustomerVO)superVO).getCode());
                            attrName = superVO.getAttributeValue("name" + langIdx) == null ? superVO.getAttributeValue("name") : superVO.getAttributeValue("name" + langIdx);
                            vo.setAttributeValue(name, attrName);
                        }
                    } else if (ArapConstant.ARAP_BANKROLLPROJET.equals(busiAttrs[j])) {
                        // empty if block
                    }
                }
                if (superVO == null) continue;
                ++qryObjCnt;
            }
            resultVOs.add(vo);
        }
        List desBills = ((IFipBillQueryService)NCLocator.getInstance().lookup(IFipBillQueryService.class)).queryDesBillBySrc4WFW(relationInfoVOs.toArray(new FipRelationInfoVO[0]), null);
        if (desBills != null && desBills.size() > 0) {
            HashMap<String, String> voucherMap = new HashMap<String, String>();
            Object voucherNo = null;
            Object relationIDs = null;
            Object voucherVO = null;
            for (Map desBill : desBills) {
                voucherNo = desBill.get("no");
                if (voucherNo == null) continue;
                String relationId = (String)desBill.get("relationId");
                if (voucherMap.get(relationId) == null) {
                    voucherMap.put(relationId, voucherNo.toString());
                    continue;
                }
                voucherMap.put(relationId, (String)voucherMap.get(relationId) + ", " + voucherNo);
            }
            for (DetailLinkQueryVO linkVO : resultVOs) {
                linkVO.setVoucherid((String)voucherMap.get(linkVO.getPk_bill()));
            }
        }
        return resultVOs;
    }

    private Map<String, Object> getVOMapInfo(BaseItemVO[] datas) throws BusinessException {
        Collection vos;
        HashMap<String, Object> voHashMap = new HashMap<String, Object>();
        if (datas == null || datas.length == 0) {
            return voHashMap;
        }
        MapSet docMapList = new MapSet();
        for (BaseItemVO item : datas) {
            if (item.getPk_org() != null) {
                docMapList.put((Object)"org", (Object)item.getPk_org());
            }
            if (item.getCustomer() != null) {
                docMapList.put((Object)"customer", (Object)item.getCustomer());
            }
            if (item.getSupplier() != null) {
                docMapList.put((Object)"supplier", (Object)item.getSupplier());
            }
            if (item.getPk_deptid() != null) {
                docMapList.put((Object)"dept", (Object)item.getPk_deptid());
            }
            if (item.getPk_psndoc() != null) {
                docMapList.put((Object)"psndoc", (Object)item.getPk_psndoc());
            }
            if (item.getPk_subjcode() != null) {
                docMapList.put((Object)"pk_subjcode", (Object)item.getPk_subjcode());
            }
            if (item.getMaterial() != null) {
                docMapList.put((Object)"material", (Object)item.getMaterial());
            }
            if (item.getSubjcode() != null) {
                docMapList.put((Object)"subjcode", (Object)item.getSubjcode());
            }
            if (item.getCostcenter() != null) {
                docMapList.put((Object)"costcenter", (Object)item.getCostcenter());
            }
            if (item.getProject() != null) {
                docMapList.put((Object)"project", (Object)item.getProject());
            }
            if (item.getPk_pcorg() != null) {
                docMapList.put((Object)"pcorg", (Object)item.getPk_pcorg());
            }
            if (item.getOrdercubasdoc() == null) continue;
            docMapList.put((Object)"ordercubasdoc", (Object)item.getOrdercubasdoc());
        }
        if (docMapList.get((Object)"org") != null && (vos = this.getService().queryBillOfVOByPKs(FinanceOrgVO.class, docMapList.get((Object)"org").toArray(new String[0]), false)) != null) {
            for (FinanceOrgVO vo : vos) {
                voHashMap.put("org" + vo.getPrimaryKey(), vo);
            }
        }
        if (docMapList.get((Object)"customer") != null && (vos = this.getService().queryBillOfVOByPKs(CustomerVO.class, docMapList.get((Object)"customer").toArray(new String[0]), false)) != null) {
            for (CustomerVO vo : vos) {
                voHashMap.put("customer" + vo.getPrimaryKey(), vo);
            }
        }
        if (docMapList.get((Object)"supplier") != null && (vos = this.getService().queryBillOfVOByPKs(SupplierVO.class, docMapList.get((Object)"supplier").toArray(new String[0]), false)) != null) {
            for (SupplierVO vo : vos) {
                voHashMap.put("supplier" + vo.getPrimaryKey(), vo);
            }
        }
        if (docMapList.get((Object)"dept") != null && (vos = this.getService().queryBillOfVOByPKs(DeptVO.class, docMapList.get((Object)"dept").toArray(new String[0]), false)) != null) {
            for (DeptVO vo : vos) {
                voHashMap.put("dept" + vo.getPrimaryKey(), vo);
            }
        }
        if (docMapList.get((Object)"psndoc") != null && (vos = this.getService().queryBillOfVOByPKs(PsndocVO.class, docMapList.get((Object)"psndoc").toArray(new String[0]), false)) != null) {
            for (PsndocVO vo : vos) {
                voHashMap.put("psndoc" + vo.getPrimaryKey(), vo);
            }
        }
        if (docMapList.get((Object)"pk_subjcode") != null && (vos = this.getService().queryBillOfVOByPKs(InoutBusiClassVO.class, docMapList.get((Object)"pk_subjcode").toArray(new String[0]), false)) != null) {
            for (InoutBusiClassVO vo : vos) {
                voHashMap.put("pk_subjcode" + vo.getPrimaryKey(), vo);
            }
        }
        if (docMapList.get((Object)"material") != null && (vos = this.getService().queryBillOfVOByPKs(MaterialVO.class, docMapList.get((Object)"material").toArray(new String[0]), false)) != null) {
            for (MaterialVO vo : vos) {
                voHashMap.put("material" + vo.getPrimaryKey(), vo);
            }
        }
        if (docMapList.get((Object)"subjcode") != null && (vos = this.getService().queryBillOfVOByPKs(AccAsoaVO.class, docMapList.get((Object)"subjcode").toArray(new String[0]), false)) != null) {
            for (AccAsoaVO vo : vos) {
                voHashMap.put("subjcode" + vo.getPrimaryKey(), vo);
            }
        }
        if (docMapList.get((Object)"costcenter") != null && (vos = this.getService().queryBillOfVOByPKs(CostCenterVO.class, docMapList.get((Object)"costcenter").toArray(new String[0]), false)) != null) {
            for (CostCenterVO vo : vos) {
                voHashMap.put("costcenter" + vo.getPrimaryKey(), vo);
            }
        }
        if (docMapList.get((Object)"project") != null && (vos = this.getService().queryBillOfVOByPKs(ProjectHeadVO.class, docMapList.get((Object)"project").toArray(new String[0]), false)) != null) {
            for (ProjectHeadVO vo : vos) {
                voHashMap.put("project" + vo.getPrimaryKey(), vo);
            }
        }
        if (docMapList.get((Object)"pcorg") != null && (vos = this.getService().queryBillOfVOByPKs(ProfitCenterVO.class, docMapList.get((Object)"pcorg").toArray(new String[0]), false)) != null) {
            for (ProfitCenterVO vo : vos) {
                voHashMap.put("pcorg" + vo.getPrimaryKey(), vo);
            }
        }
        if (docMapList.get((Object)"ordercubasdoc") != null && (vos = this.getService().queryBillOfVOByPKs(CustomerVO.class, docMapList.get((Object)"ordercubasdoc").toArray(new String[0]), false)) != null) {
            for (CustomerVO vo : vos) {
                voHashMap.put("ordercubasdoc" + vo.getPrimaryKey(), vo);
            }
        }
        return voHashMap;
    }

    private IMDPersistenceQueryService getService() throws UifException {
        if (this.service == null) {
            this.service = (IMDPersistenceQueryService)NCLocator.getInstance().lookup(IMDPersistenceQueryService.class);
        }
        return this.service;
    }
}

