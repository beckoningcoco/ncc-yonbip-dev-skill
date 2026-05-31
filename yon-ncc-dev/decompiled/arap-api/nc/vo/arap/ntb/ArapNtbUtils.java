/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.pf.pub.PfDataCache
 *  nc.md.persist.framework.MDPersistenceService
 *  nc.vo.bd.account.AccAsoaVO
 *  nc.vo.fi.pub.SqlUtils
 *  nc.vo.jcom.lang.StringUtil
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.billtype.BilltypeVO
 *  nc.vo.tb.obj.NtbParamVO
 *  nccloud.commons.lang.ArrayUtils
 *  nccloud.commons.lang.StringUtils
 */
package nc.vo.arap.ntb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.pf.pub.PfDataCache;
import nc.md.persist.framework.MDPersistenceService;
import nc.vo.arap.ntb.ArapQueryVO;
import nc.vo.arap.pub.ArapConstant;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.bd.account.AccAsoaVO;
import nc.vo.fi.pub.SqlUtils;
import nc.vo.jcom.lang.StringUtil;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.BusinessException;
import nc.vo.pub.billtype.BilltypeVO;
import nc.vo.tb.obj.NtbParamVO;
import nccloud.commons.lang.ArrayUtils;
import nccloud.commons.lang.StringUtils;

public class ArapNtbUtils {
    public static ArapQueryVO analyseParam(NtbParamVO ntbParamVO) throws BusinessException {
        return ArapNtbUtils.analyseParam(ntbParamVO, null, null);
    }

    public static ArapQueryVO analyseParam(NtbParamVO ntbParamVO, String fieldcode, Set<String> pkvalues) throws BusinessException {
        ArapQueryVO queryVO = new ArapQueryVO();
        if (ntbParamVO.getTypeDim() == null || ntbParamVO.getTypeDim().length == 0) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0365"));
        }
        String pk_group = InvocationInfoProxy.getInstance().getGroupId();
        String[] busiAttrs = ntbParamVO.getBusiAttrs();
        queryVO.setPk_group(pk_group);
        queryVO.setPk_org(new String[]{ntbParamVO.getPk_Org()});
        queryVO.setPk_currency(ntbParamVO.getPk_currency());
        queryVO.setCurr_type(ntbParamVO.getCurr_type());
        queryVO.setBegdate(ntbParamVO.getBegDate());
        queryVO.setEnddate(ntbParamVO.getEndDate());
        String[] billtypes = ntbParamVO.getBill_type().split("#");
        BilltypeVO billTypeInfo = PfDataCache.getBillTypeInfo((String)pk_group, (String)billtypes[0]);
        String billType = billTypeInfo.getParentbilltype();
        queryVO.setBill_code(billType);
        queryVO.setPk_tradetypes(billtypes);
        queryVO.setIncludeInit(ntbParamVO.isIncludeInit());
        queryVO.setDatetype(ntbParamVO.getDateType());
        queryVO.setOrgatt_fld(ntbParamVO.getOrg_Attr());
        queryVO.setMoneyattr_fld(ntbParamVO.getData_attrExt());
        String[] pkDims = ntbParamVO.getPkDim();
        for (int i = 0; i < busiAttrs.length; ++i) {
            List<String> condList;
            String fieldName = null;
            String batchfieldName = null;
            if (busiAttrs[i].startsWith("arap_b_")) {
                fieldName = busiAttrs[i].substring(7);
                batchfieldName = StringUtil.isEmpty((String)fieldcode) ? null : fieldcode.substring(7);
                condList = queryVO.getQueryCondMap().get(fieldName);
                if (condList == null) {
                    condList = new ArrayList<String>();
                    queryVO.getQueryCondMap().put(fieldName, condList);
                }
                if ("subjcode".equalsIgnoreCase(fieldName)) {
                    if ("subjcode".equalsIgnoreCase(batchfieldName)) {
                        condList.addAll(ArapNtbUtils.getAccAsoaVO(ntbParamVO, pkvalues.toArray(new String[0])));
                    }
                    if (ntbParamVO.getLowerArrays().get(busiAttrs[i]) != null && ((String[])ntbParamVO.getLowerArrays().get(busiAttrs[i])).length != 0) {
                        condList.addAll(ArapNtbUtils.getAccAsoaVO(ntbParamVO, (String[])ntbParamVO.getLowerArrays().get(busiAttrs[i])));
                    } else {
                        condList.addAll(ArapNtbUtils.getAccAsoaVO(ntbParamVO, new String[]{pkDims[i]}));
                    }
                } else {
                    if (batchfieldName != null && batchfieldName.equalsIgnoreCase(fieldName)) {
                        condList.addAll(pkvalues);
                    }
                    if (ntbParamVO.getLowerArrays().get(busiAttrs[i]) != null && ((String[])ntbParamVO.getLowerArrays().get(busiAttrs[i])).length != 0) {
                        condList.addAll(Arrays.asList((Object[])ntbParamVO.getLowerArrays().get(busiAttrs[i])));
                    } else {
                        condList.add(pkDims[i]);
                    }
                }
                if (!"pk_org".equals(fieldName) || !ntbParamVO.getIncludelower()[i]) continue;
                if (!condList.contains(ntbParamVO.getPk_Org())) {
                    condList.addAll(Arrays.asList(ntbParamVO.getPk_Org()));
                }
                queryVO.setPk_org(condList.toArray(new String[0]));
                continue;
            }
            if (!busiAttrs[i].startsWith("arap_h_")) continue;
            fieldName = busiAttrs[i].substring(7);
            batchfieldName = StringUtil.isEmpty((String)fieldcode) ? null : fieldcode.substring(7);
            condList = queryVO.getQueryHeadCondMap().get(fieldName);
            if (condList == null) {
                condList = new ArrayList<String>();
                queryVO.getQueryHeadCondMap().put(fieldName, condList);
            }
            if ("subjcode".equalsIgnoreCase(fieldName)) {
                if ("subjcode".equalsIgnoreCase(batchfieldName)) {
                    condList.addAll(ArapNtbUtils.getAccAsoaVO(ntbParamVO, pkvalues.toArray(new String[0])));
                }
                if (ntbParamVO.getLowerArrays().get(busiAttrs[i]) != null && ((String[])ntbParamVO.getLowerArrays().get(busiAttrs[i])).length != 0) {
                    condList.addAll(ArapNtbUtils.getAccAsoaVO(ntbParamVO, (String[])ntbParamVO.getLowerArrays().get(busiAttrs[i])));
                } else {
                    condList.addAll(ArapNtbUtils.getAccAsoaVO(ntbParamVO, new String[]{pkDims[i]}));
                }
            } else {
                if (batchfieldName != null && batchfieldName.equalsIgnoreCase(fieldName)) {
                    condList.addAll(pkvalues);
                }
                if (ntbParamVO.getLowerArrays().get(busiAttrs[i]) != null && ((String[])ntbParamVO.getLowerArrays().get(busiAttrs[i])).length != 0) {
                    condList.addAll(Arrays.asList((Object[])ntbParamVO.getLowerArrays().get(busiAttrs[i])));
                } else {
                    condList.add(pkDims[i]);
                }
            }
            if (!"pk_org".equals(fieldName) || !ntbParamVO.getIncludelower()[i]) continue;
            if (!condList.contains(ntbParamVO.getPk_Org())) {
                condList.addAll(Arrays.asList(ntbParamVO.getPk_Org()));
            }
            queryVO.setPk_org(condList.toArray(new String[0]));
        }
        return queryVO;
    }

    private static List<String> getAccAsoaVO(NtbParamVO ntbParamVO, String[] pk_account) throws BusinessException {
        String whereSql = SqlUtils.getInStr((String)"pk_accasoa", (String[])pk_account, (boolean)true);
        Collection accAsoaVOs = MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByCond(AccAsoaVO.class, whereSql, false);
        ArrayList<String> pks = new ArrayList<String>();
        for (AccAsoaVO asoavo : accAsoaVOs) {
            pks.add(asoavo.getPk_accasoa());
        }
        return pks;
    }

    public static String createWherePart(ArapQueryVO vo) throws BusinessException {
        return ArapNtbUtils.createWherePart(vo, null);
    }

    public static String createWherePart(ArapQueryVO vo, String fieldcode) throws BusinessException {
        StringBuffer sb = new StringBuffer();
        sb.append(" dr = 0 and  exists (").append(ArapNtbUtils.createInSql(vo)).append(")");
        String[] strs = ArapNtbUtils.getBodyTable(vo.getBill_code());
        sb.append(" and not exists (select 1 from arap_tally tally where tally.pk_item=fib.").append(strs[1]).append(" and tally.busitype = 411) ");
        if (!StringUtils.isEmpty((CharSequence)vo.getPk_currency())) {
            sb.append(" and ").append("pk_currtype = '" + vo.getPk_currency() + "'");
        }
        for (Map.Entry<String, List<String>> entry : vo.getQueryCondMap().entrySet()) {
            sb.append(" and ").append(SqlUtils.getInStr((String)entry.getKey(), (String[])entry.getValue().toArray(new String[0]), (boolean)true));
        }
        sb.append(" and ").append(SqlUtils.getInStr((String)"pk_tradetype", (String[])vo.getPk_tradetypes(), (boolean)true));
        return sb.toString();
    }

    private static String createInSql(ArapQueryVO vo) throws BusinessException {
        StringBuffer sb = new StringBuffer();
        sb.append(ArapNtbUtils.createSelectFrom2(vo.getBill_code()));
        ArapNtbUtils.getHeadWhereSql(vo, sb);
        return sb.toString();
    }

    public static void getHeadWhereSql(ArapQueryVO vo, StringBuffer sb) throws BusinessException {
        ArapConstant constant = new ArapConstant();
        if (constant.ARAP_NTB_BILLDATE_KEY.equals(vo.getDatetype())) {
            sb.append(" and (fih.billdate >= '").append(vo.getBegdate()).append("' and fih.billdate <= '").append(vo.getEnddate()).append("')");
        } else if (constant.ARAP_NTB_APPRDATE_KEY.equals(vo.getDatetype())) {
            sb.append(" and (fih.approvedate >= '").append(vo.getBegdate()).append("' and fih.approvedate <= '").append(vo.getEnddate()).append("')");
        } else if (constant.ARAP_NTB_EFFDATE_KEY.equals(vo.getDatetype())) {
            sb.append(" and (fih.effectdate >= '").append(vo.getBegdate()).append("' and fih.effectdate <= '").append(vo.getEnddate()).append("')");
        }
        if (!vo.isIncludeInit()) {
            sb.append(" and fih.isinit = 'N'");
        }
        if (ArapQueryVO.BILLSTATUS_ALL.equals(vo.getBillstatus())) {
            sb.append(" and fih.effectstatus in ('" + BillEnumCollection.InureSign.OKINURE.VALUE + "','" + BillEnumCollection.InureSign.NOINURE.VALUE + "')");
        } else if (ArapQueryVO.BILLSTATUS_SAVE.equals(vo.getBillstatus())) {
            sb.append(" and fih.billstatus in (-1,1,8) and fih.effectstatus = '" + BillEnumCollection.InureSign.NOINURE.VALUE + "'");
        } else if (ArapQueryVO.BILLSTATUS_EFFECT.equals(vo.getBillstatus())) {
            sb.append(" and fih.effectstatus = '" + BillEnumCollection.InureSign.OKINURE.VALUE + "'");
        }
        sb.append(" and ").append(SqlUtils.getInStr((String)"fih.pk_tradetype", (String[])vo.getPk_tradetypes(), (boolean)true));
        for (Map.Entry<String, List<String>> entry : vo.getQueryHeadCondMap().entrySet()) {
            sb.append(" and ").append(SqlUtils.getInStr((String)("fih." + entry.getKey()), (String[])entry.getValue().toArray(new String[0]), (boolean)true));
        }
        if (!ArrayUtils.isEmpty((Object[])vo.getPk_org())) {
            Map<String, List<String>> queryCondMap = vo.getQueryCondMap();
            if (!StringUtil.isEmptyWithTrim((String)vo.getOrgatt_fld()) && vo.getOrgatt_fld().contains("pk_org")) {
                String key = "pk_org";
                List<String> list = queryCondMap.get(key);
                sb.append(" and ").append(SqlUtils.getInStr((String)("fih." + key), (String[])list.toArray(new String[list.size()]), (boolean)true));
            }
        }
    }

    private static String createSelectFrom2(String billCode) {
        String[] objs = ArapNtbUtils.getTable(billCode);
        return "select 1 from " + objs[0] + " fih where fih." + objs[1] + "=fib." + objs[1] + " and dr =0";
    }

    public static String[] getTable(String billCode) {
        String[] objs = new String[2];
        if ("F0".equals(billCode)) {
            objs[0] = "ar_recbill";
            objs[1] = "PK_RECBILL";
        } else if ("23F0".equals(billCode)) {
            objs[0] = "ar_suprecbill";
            objs[1] = "PK_SUPRECBILL";
        } else if ("F1".equals(billCode)) {
            objs[0] = "ap_payablebill";
            objs[1] = "PK_PAYABLEBILL";
        } else if ("23F1".equals(billCode)) {
            objs[0] = "ap_cuspayablebill";
            objs[1] = "PK_CUSPAYABLEBILL";
        } else if ("F2".equals(billCode)) {
            objs[0] = "ar_gatherbill";
            objs[1] = "PK_GATHERBILL";
        } else if ("23F2".equals(billCode)) {
            objs[0] = "ar_supgatherbill";
            objs[1] = "PK_SUPGATHERBILL";
        } else if ("F3".equals(billCode)) {
            objs[0] = "ap_paybill";
            objs[1] = "PK_PAYBILL";
        } else if ("23F3".equals(billCode)) {
            objs[0] = "ap_cuspaybill";
            objs[1] = "PK_CUSPAYBILL";
        }
        return objs;
    }

    public static String[] getBodyTable(String billCode) {
        String[] objs = new String[2];
        if ("F0".equals(billCode)) {
            objs[0] = "ar_recitem";
            objs[1] = "PK_RECITEM";
        } else if ("F1".equals(billCode)) {
            objs[0] = "ap_payableitem";
            objs[1] = "PK_PAYABLEITEM";
        } else if ("F2".equals(billCode)) {
            objs[0] = "ar_gatheritem";
            objs[1] = "PK_GATHERITEM";
        } else if ("F3".equals(billCode)) {
            objs[0] = "ap_payitem";
            objs[1] = "PK_PAYITEM";
        }
        return objs;
    }
}

