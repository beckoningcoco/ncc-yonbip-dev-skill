/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.pubitf.bd.accessor.GeneralAccessorFactory
 *  nc.util.fi.pub.SqlUtils
 *  nc.vo.arap.pub.BillEnumCollection$ApproveStatus
 *  nc.vo.arap.pub.BillEnumCollection$BillSatus
 *  nc.vo.bd.accessor.IBDData
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.BusinessRuntimeException
 *  nc.vo.pub.SuperVO
 *  nccloud.commons.lang.StringUtils
 */
package nccloud.pubimpl.arap.openapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.pubitf.bd.accessor.GeneralAccessorFactory;
import nc.util.fi.pub.SqlUtils;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.bd.accessor.IBDData;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.BusinessException;
import nc.vo.pub.BusinessRuntimeException;
import nc.vo.pub.SuperVO;
import nccloud.commons.lang.StringUtils;

public class ArapBDConvert {
    public void convertVO(SuperVO vo) {
        String[] attrnames;
        for (String attr : attrnames = vo.getAttributeNames()) {
            if ("pk_org".equals(attr) || "pk_group".equals(attr)) continue;
            Object value = vo.getAttributeValue(attr);
            value = this.tranlate(vo, attr, value);
            vo.setAttributeValue(attr, value);
        }
    }

    private Object tranlate(SuperVO vo, String attr, Object value) {
        String pk_group = InvocationInfoProxy.getInstance().getGroupId();
        String pk_org = (String)vo.getAttributeValue("pk_org");
        try {
            if (this.orgDoc().contains(attr)) {
                value = this.getDocByCode(pk_org, (String)value, this.getMDID(attr));
            } else if (this.groupDoc().contains(attr)) {
                value = this.getDocByCode(pk_group, (String)value, this.getMDID(attr));
            } else if (this.globalDoc().contains(attr)) {
                value = this.getDocByCode("GLOBLE00000000000000", (String)value, this.getMDID(attr));
            }
        }
        catch (Exception e) {
            throw new BusinessRuntimeException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0963") + attr + NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0964"));
        }
        return value;
    }

    public String getConditionSql(Map<String, String> map, String tablename) throws BusinessException {
        String recreason;
        String lossreason;
        String lossmoneyStr;
        String moneyStr;
        String approvestatus;
        String billstatus;
        String billno;
        String period;
        StringBuffer condition = new StringBuffer();
        String pk_group = InvocationInfoProxy.getInstance().getGroupId();
        String orgCodes = map.get("pk_org");
        ArrayList<String> orgs = new ArrayList<String>();
        if (!StringUtils.isEmpty((CharSequence)orgCodes)) {
            String[] pk_orgs = orgCodes.split(",");
            IBDData[] datas = GeneralAccessorFactory.getAccessor((String)"2cfe13c5-9757-4ae8-9327-f5c2d34bcb46").getDocByCodes(pk_group, pk_orgs);
            if (datas != null && datas.length > 0) {
                for (IBDData data : datas) {
                    orgs.add(data.getPk());
                }
                condition.append(SqlUtils.getInStr((String)(tablename + "." + "pk_org"), orgs));
            }
        } else {
            return "1=2";
        }
        String billdateStr = map.get("billdate");
        if (!StringUtils.isEmpty((CharSequence)billdateStr)) {
            String[] billdates = billdateStr.split(",");
            if (billdates[0].length() == 10) {
                billdates[0] = billdates[0] + " 00:00:00";
            }
            condition.append(" and (" + tablename + "." + "billdate" + ">='" + billdates[0] + "' ");
            if (billdates[1].length() == 10) {
                billdates[1] = billdates[1] + " 23:59:59";
            }
            condition.append(" and " + tablename + "." + "billdate" + "<='" + billdates[1] + "')");
        }
        if (!StringUtils.isEmpty((CharSequence)(period = map.get("period")))) {
            condition.append(" and " + tablename + "." + "period" + " = '" + period + "' ");
        }
        if (!StringUtils.isEmpty((CharSequence)(billno = map.get("billno")))) {
            condition.append(" and " + tablename + "." + "billno" + " like '%" + billno + "%' ");
        }
        if (!StringUtils.isEmpty((CharSequence)(billstatus = map.get("billstatus")))) {
            condition.append(" and ").append(tablename + "." + "billstatus" + "='" + this.getBillStatusCode(billstatus) + "'");
        }
        if (!StringUtils.isEmpty((CharSequence)(approvestatus = map.get("approvestatus")))) {
            condition.append(" and ").append(tablename + "." + "approvestatus" + "='" + this.getApproveStatusCode(approvestatus) + "'");
        }
        if (!StringUtils.isEmpty((CharSequence)(moneyStr = map.get("money")))) {
            String[] money = moneyStr.split(",");
            condition.append(" and (" + tablename + "." + "money" + ">='" + money[0] + "' ");
            condition.append(" and " + tablename + "." + "money" + "<='" + money[1] + "')");
        }
        if (!StringUtils.isEmpty((CharSequence)(lossmoneyStr = map.get("lossmoney")))) {
            String[] money = lossmoneyStr.split(",");
            condition.append(" and (" + tablename + "." + "lossmoney" + ">='" + money[0] + "' ");
            condition.append(" and " + tablename + "." + "lossmoney" + "<='" + money[1] + "')");
        }
        if (!StringUtils.isEmpty((CharSequence)(lossreason = map.get("lossreason")))) {
            condition.append(" and " + tablename + "." + "lossreason" + " like '%" + lossreason + "%' ");
        }
        if (!StringUtils.isEmpty((CharSequence)(recreason = map.get("recreason")))) {
            condition.append(" and " + tablename + "." + "recreason" + " like '%" + recreason + "%' ");
        }
        for (int i = 1; i <= 30; ++i) {
            String def = map.get("def" + i);
            if (StringUtils.isEmpty((CharSequence)def)) continue;
            condition.append(" and def" + i + "='" + def + "'");
        }
        return condition.toString();
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
        }
        if ("\u5ba1\u6279\u901a\u8fc7".equals(approvestatus)) {
            status = BillEnumCollection.ApproveStatus.PASSING.VALUE;
        }
        if ("\u5ba1\u6279\u4e2d".equals(approvestatus)) {
            status = BillEnumCollection.ApproveStatus.GOINGON.VALUE;
        }
        if ("\u5df2\u63d0\u4ea4".equals(approvestatus)) {
            status = BillEnumCollection.ApproveStatus.COMMIT.VALUE;
        }
        return status == null ? null : status.toString();
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
        if ("pk_org".equals(key)) {
            return "2cfe13c5-9757-4ae8-9327-f5c2d34bcb46";
        }
        if ("pk_pcorg".equals(key)) {
            return "5461ada1-ef2a-419a-af14-656cf0641d34";
        }
        if ("creator".equals(key) || "approver".equals(key)) {
            return "f6f9a473-56c0-432f-8bc7-fbf8fde54fee";
        }
        if ("pk_currtype".equals(key)) {
            return "b498bc9a-e5fd-4613-8da8-bdae2a05704a";
        }
        return null;
    }

    public List<String> orgDoc() {
        String[] keys = new String[]{"customer", "supplier", "pk_psndoc", "pk_deptid", "billmaker", "approver", "commpayer", "officialprintuser", "material", "subjcode", "cashitem", "bankrollprojet", "payaccount", "recaccount", "freecust", "so_transtype", "productline", "ordercubasdoc", "pu_psndoc", "pu_deptid", "pk_recpaytype", "cashaccount"};
        return Arrays.asList(keys);
    }

    public List<String> groupDoc() {
        String[] keys = new String[]{"pk_org", "pk_pcorg", "pu_org", "costcenter", "sett_org", "checktype"};
        return Arrays.asList(keys);
    }

    public List<String> globalDoc() {
        String[] keys = new String[]{"pk_currtype", "pk_group"};
        return Arrays.asList(keys);
    }
}

