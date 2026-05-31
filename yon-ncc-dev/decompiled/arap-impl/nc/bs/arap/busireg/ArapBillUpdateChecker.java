/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.dao.DAOException
 *  nc.bs.pf.pub.PfDataCache
 *  nc.vo.arap.pay.PayBillVO
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pub.lang.UFDouble
 */
package nc.bs.arap.busireg;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import nc.bs.arap.bill.ArapBillDAO;
import nc.bs.arap.busireg.BillUpdateChecker;
import nc.bs.arap.util.ArapVOUtils;
import nc.bs.dao.DAOException;
import nc.bs.pf.pub.PfDataCache;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.arap.pay.PayBillVO;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.arap.utils.StringUtil;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDouble;

public class ArapBillUpdateChecker
implements BillUpdateChecker {
    final List<String> jckBillTypes = Arrays.asList("5801", "5818");
    final String STUFF_SETTLE_BILL = "4D39";
    final String EXPENSES_SETTLE_BILL = "4D83";
    final String PLAN_MONEY_BILL = "4D48";
    final String PROJECT_SETTLE_BILL = "4D50";
    final String SELL_CONTRACT_BILL = "4D60";
    final String GATHERING_PLAN_BILL = "4D62";
    final String PREPAY_BILL = "4D46";
    final String CONTRACT_BILL = "4D65";
    final String VISACONFIRM_BILL = "4D33";
    final String DEDUCTIONS_BILL = "4D86";
    final String REGISTRATION_BILL = "4D53";
    final String SELL_EXPENSES_BILL = "35";
    final List<String> immutableRows = Arrays.asList("5790", "5760", "5820", "6090", "5818", "4A2F", "4A3F", "4BL0", "4BL3", "4A3H", "4A77", "4A87", "21", "2201", "36J3", "4D46", "264X", "35", "4D39", "4D83", "4D48", "4D50", "4D60", "4D62", "4D46");
    final List<String> addAllowDelNotAllowRows = Arrays.asList("F0", "F1", "F2", "F3");
    final List<String> delAllowAddNotAllowRows = Arrays.asList("36D1");
    final List<String> firstEditableFields = Arrays.asList("36D1");
    final List<String> secondEditableFields = Arrays.asList("264X", "264x");

    @Override
    public boolean isMatch(BaseAggVO vo) {
        return true;
    }

    @Override
    public boolean canUpdateBillWithoutCtrl(BaseAggVO vo) {
        BaseItemVO[] vosNew = (BaseItemVO[])vo.getChildrenVO();
        String top_billtype = vosNew[0].getTop_billtype();
        return "5720".equals(top_billtype) || "4B36".equals(top_billtype);
    }

    @Override
    public String canAddLine(String top_billtype, List<BaseItemVO> addlines) {
        if (top_billtype != null && this.immutableRows.contains(top_billtype)) {
            return NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0316_0", "02006arappub0316-0027", null, new String[]{PfDataCache.getBillType((String)top_billtype).getBilltypenameOfCurrLang()});
        }
        return null;
    }

    @Override
    public String canDeleteLine(String top_billtype, List<BaseItemVO> deletelines) {
        boolean flag = true;
        if (top_billtype != null) {
            if (this.immutableRows.contains(top_billtype)) {
                flag = false;
            } else if (this.addAllowDelNotAllowRows.contains(top_billtype)) {
                for (BaseItemVO baseItemVO : deletelines) {
                    if (StringUtil.isEmpty(baseItemVO.getTop_itemid())) continue;
                    flag = false;
                    break;
                }
            }
        }
        if (!flag) {
            return NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0316_0", "02006arappub0316-0026", null, new String[]{PfDataCache.getBillType((String)top_billtype).getBilltypenameOfCurrLang()});
        }
        return null;
    }

    @Override
    public String canUpdateBodyFieldValue(Map<String, Map<String, Object[]>> fieldvalue, BaseAggVO aggvo, BaseAggVO oldaggvo) {
        BaseBillVO billvo = (BaseBillVO)aggvo.getParentVO();
        BaseItemVO[] vosNew = (BaseItemVO[])aggvo.getChildrenVO();
        boolean otherSystemPushBill = ArapVOUtils.isOtherSystemPushBill(billvo, vosNew[0].getTop_billtype());
        UFBoolean sddreversalflag = UFBoolean.FALSE;
        if (billvo instanceof PayBillVO && null == (sddreversalflag = ((PayBillVO)billvo).getSddreversalflag())) {
            sddreversalflag = UFBoolean.FALSE;
        }
        if (!otherSystemPushBill && !sddreversalflag.booleanValue()) {
            return null;
        }
        String errmsg = null;
        for (BaseItemVO vo : vosNew) {
            Object[] values;
            Map<String, Object[]> valuechangeMap = fieldvalue.get(vo.getPrimaryKey());
            if (vo.getPrimaryKey() == null || valuechangeMap == null || valuechangeMap.isEmpty()) continue;
            String topBilltype = vo.getTop_billtype();
            if (this.firstEditableFields.contains(topBilltype)) break;
            String[] s1 = new String[]{"objtype", "pk_currtype", "money_de", "money_cr", "groupdebit", "groupcrebit", "groupnotax_cre", "groupnotax_de", "payaccount", "recaccount", "matcustcode"};
            String[] s2 = new String[]{NCLangRes4VoTransl.getNCLangRes().getStrByID("common", "UC000-0001935"), NCLangRes4VoTransl.getNCLangRes().getStrByID("common", "UC000-0001755"), NCLangRes4VoTransl.getNCLangRes().getStrByID("common", "UC000-0004112"), NCLangRes4VoTransl.getNCLangRes().getStrByID("common", "UC000-0004112"), NCLangRes4VoTransl.getNCLangRes().getStrByID("common", "UC000-0004112"), NCLangRes4VoTransl.getNCLangRes().getStrByID("common", "UC000-0004112"), NCLangRes4VoTransl.getNCLangRes().getStrByID("common", "UC000-0004112"), NCLangRes4VoTransl.getNCLangRes().getStrByID("common", "UC000-0004112"), NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61008_0", "02006v61008-0301"), NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61008_0", "02006v61008-0302"), NCLangRes4VoTransl.getNCLangRes().getStrByID("receivablebill", "2receive-000119")};
            List<String> list = Arrays.asList("money_de", "money_cr", "groupdebit", "groupcrebit", "groupnotax_cre", "groupnotax_de");
            int t = -1;
            for (String s : s1) {
                ++t;
                Object[] objectArray = valuechangeMap.get(s);
                if (objectArray == null) continue;
                Object newvalue = objectArray[0];
                Object oldvalue = objectArray[1];
                if ((s.equals("payaccount") || s.equals("recaccount")) && (oldvalue == null || oldvalue.toString().length() != 20) || list.contains(s) && "FCT1".equals(topBilltype) || "FCT2".equals(topBilltype) || s.equals("matcustcode") && "434C".equals(topBilltype) && "23E0".equals(vo.getPk_billtype()) || oldvalue == null && newvalue != null || vo.getAttributeValue(s) instanceof UFDouble && (vo.getCommpaytype() != null && (BillEnumCollection.CommissionPayType.REFUSECOMMPAY.VALUE.equals(vo.getCommpaytype()) || BillEnumCollection.CommissionPayType.COMMPAYPARTLY.VALUE.equals(vo.getCommpaytype())) || this.jckBillTypes.contains(topBilltype))) continue;
                errmsg = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0432", null, new String[]{s2[t]});
                break;
            }
            if (!StringUtil.isEmpty(errmsg) || this.secondEditableFields.contains(topBilltype)) break;
            String[] s3 = new String[]{"customer", "supplier", "pk_deptid", "pk_psndoc"};
            String[] s4 = new String[]{NCLangRes4VoTransl.getNCLangRes().getStrByID("common", "UC000-0001589"), NCLangRes4VoTransl.getNCLangRes().getStrByID("common", "UC000-0000275"), NCLangRes4VoTransl.getNCLangRes().getStrByID("common", "UC000-0004064"), NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0340")};
            int[] s5 = new int[]{BillEnumCollection.ObjType.CUSTOMER.VALUE, BillEnumCollection.ObjType.SUPPLIER.VALUE, BillEnumCollection.ObjType.DEP.VALUE, BillEnumCollection.ObjType.PERSON.VALUE};
            int m = -1;
            for (int s : s5) {
                Object oldvalue;
                if (vo.getObjtype() != s || (values = valuechangeMap.get(s3[++m])) == null || (oldvalue = values[1]) == null || oldvalue.toString().length() != 20) continue;
                errmsg = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0432", null, new String[]{s4[m]});
                break;
            }
            if (!StringUtil.isEmpty(errmsg)) break;
            List<String> list2 = Arrays.asList("4D39", "4D83", "4D48", "4D50", "4D60", "4D62", "4D46", "4D65", "4D33", "4D86", "4D53");
            List<String> ctrlCONTRACTNO = Arrays.asList("4D39", "4D62", "4D48", "4D50");
            List<String> ctrlMATERIAL = Arrays.asList("4D50", "4D48", "4D83", "4D53", "4D65", "4D33", "4D86");
            List<String> ctrlPROJECT_TASK = Arrays.asList("4D83", "4D46", "4D48", "4D50", "4D39");
            if (list2.contains(topBilltype)) {
                String scommentLang;
                values = valuechangeMap.get("project");
                if (values != null) {
                    String projectLang = NCLangRes4VoTransl.getNCLangRes().getStrByID("common", "2UC000-001021");
                    errmsg = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0432", null, new String[]{projectLang});
                    break;
                }
                values = valuechangeMap.get("CBS");
                if (values != null) {
                    errmsg = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0432", null, new String[]{"CBS"});
                    break;
                }
                if (ctrlCONTRACTNO.contains(topBilltype) && (values = valuechangeMap.get("contractno")) != null) {
                    String contractnoLang = NCLangRes4VoTransl.getNCLangRes().getStrByID("common", "2UC000-000234");
                    errmsg = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0432", null, new String[]{contractnoLang});
                    break;
                }
                if (ctrlMATERIAL.contains(topBilltype) && (values = valuechangeMap.get("material")) != null) {
                    String materialLang = NCLangRes4VoTransl.getNCLangRes().getStrByID("common", "2UC000-000594");
                    errmsg = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0432", null, new String[]{materialLang});
                    break;
                }
                if (ctrlPROJECT_TASK.contains(topBilltype) && (values = valuechangeMap.get("project_task")) != null) {
                    String project_taskLang = NCLangRes4VoTransl.getNCLangRes().getStrByID("common", "2UC000-001023");
                    errmsg = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0432", null, new String[]{project_taskLang});
                    break;
                }
                if ("4D50".equals(topBilltype)) {
                    values = valuechangeMap.get("pk_payterm");
                    if (values != null) {
                        String pk_paytermLang = NCLangRes4VoTransl.getNCLangRes().getStrByID("common", "2UC000-000055");
                        errmsg = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0432", null, new String[]{pk_paytermLang});
                        break;
                    }
                    values = valuechangeMap.get("busidate");
                    if (values != null) {
                        String busidateLang = NCLangRes4VoTransl.getNCLangRes().getStrByID("common", "2UC000-000946");
                        errmsg = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0432", null, new String[]{busidateLang});
                        break;
                    }
                }
                if ("4D46".equals(topBilltype) && (values = valuechangeMap.get("prepay")) != null) {
                    scommentLang = NCLangRes4VoTransl.getNCLangRes().getStrByID("paybill", "2paybill-000011");
                    errmsg = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0432", null, new String[]{scommentLang});
                    break;
                }
                if ("4D60".equals(topBilltype) && (values = valuechangeMap.get("scomment")) != null) {
                    scommentLang = NCLangRes4VoTransl.getNCLangRes().getStrByID("common", "2UC000-000426");
                    errmsg = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0432", null, new String[]{scommentLang});
                    break;
                }
            }
            if (!sddreversalflag.booleanValue()) continue;
            String[] s6 = new String[]{"rate", "grouprate", "globalrate", "local_money_de", "groupdebit", "globaldebit", "sett_org", "pk_org", "pk_balatype", "invoiceno"};
            String[] s7 = new String[]{NCLangRes4VoTransl.getNCLangRes().getStrByID("common", "2UC000-000699"), NCLangRes4VoTransl.getNCLangRes().getStrByID("common", "2UC000-001016"), NCLangRes4VoTransl.getNCLangRes().getStrByID("common", "2UC000-000119"), NCLangRes4VoTransl.getNCLangRes().getStrByID("paybill", "2paybill-000013"), NCLangRes4VoTransl.getNCLangRes().getStrByID("paybill", "2paybill-000007"), NCLangRes4VoTransl.getNCLangRes().getStrByID("paybill", "2paybill-000005"), NCLangRes4VoTransl.getNCLangRes().getStrByID("common", "2UC000-000715"), NCLangRes4VoTransl.getNCLangRes().getStrByID("paybill", "2paybill-000028"), NCLangRes4VoTransl.getNCLangRes().getStrByID("common", "2UC000-000712"), NCLangRes4VoTransl.getNCLangRes().getStrByID("common", "2UC000-000220")};
            int n = -1;
            for (String s : s6) {
                ++n;
                Object[] values3 = valuechangeMap.get(s);
                if (values3 == null) continue;
                errmsg = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0432", null, new String[]{s7[n]});
                break;
            }
            if (!StringUtil.isEmpty(errmsg)) break;
        }
        return errmsg;
    }

    @Override
    public String canUpdateHeadFieldValue(Map<String, Object[]> fieldvalue, BaseAggVO vo, BaseAggVO oldvo) {
        BaseBillVO billvo = (BaseBillVO)vo.getParentVO();
        BaseItemVO[] vosNew = (BaseItemVO[])vo.getChildrenVO();
        boolean otherSystemPushBill = ArapVOUtils.isOtherSystemPushBill(billvo, vosNew[0].getTop_billtype());
        boolean isRedbill = ArapVOUtils.isArapRedBill(billvo, vosNew[0].getTop_billtype());
        String errmsg = null;
        if (isRedbill) {
            String billtype = vo.getHeadVO().getPk_billtype();
            String topitsm = (String)vo.getChildrenVO()[0].getAttributeValue("top_itemid");
            String[] pks = new String[]{topitsm};
            Map<Object, Object> billFieldBypk = new HashMap();
            try {
                billFieldBypk = new ArapBillDAO().getBillFieldBypk(pks, billtype, Arrays.asList("pk_currtype"), null);
            }
            catch (SQLException | DAOException e) {
                errmsg = e.getMessage();
            }
            String topcurr = (String)((List)billFieldBypk.get(topitsm)).get(0);
            String pk_curr = (String)vo.getChildrenVO()[0].getAttributeValue("pk_currtype");
            if (!StringUtil.isEmptyWithTrim(topcurr) && !topcurr.equals(pk_curr)) {
                String currtype = NCLangRes4VoTransl.getNCLangRes().getStrByID("common", "UC000-0001755");
                errmsg = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1330", null, new String[]{currtype});
            }
        }
        UFBoolean sddreversalflag = UFBoolean.FALSE;
        if (billvo instanceof PayBillVO && null == (sddreversalflag = ((PayBillVO)billvo).getSddreversalflag())) {
            sddreversalflag = UFBoolean.FALSE;
        }
        if (!otherSystemPushBill && !sddreversalflag.booleanValue()) {
            return null;
        }
        if (sddreversalflag.booleanValue()) {
            String[] s1 = new String[]{"expectdealdate"};
            String[] s2 = new String[]{NCLangRes4VoTransl.getNCLangRes().getStrByID("paybill", "2paybill-000108")};
            int n = -1;
            for (String s : s1) {
                ++n;
                Object[] values = fieldvalue.get(s);
                if (values == null) continue;
                errmsg = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0432", null, new String[]{s2[n]});
                break;
            }
        }
        return errmsg;
    }

    @Override
    public boolean excuteDefaultCheck() {
        return false;
    }
}

