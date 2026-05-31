/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.sec.esapi.NCESAPI
 *  nc.pubitf.bd.accessor.GeneralAccessorFactory
 *  nc.util.fi.pub.SqlUtils
 *  nc.vo.bd.accessor.IBDData
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.SuperVO
 *  nccloud.commons.lang.StringUtils
 */
package nccloud.pubimpl.arap.openapi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.sec.esapi.NCESAPI;
import nc.pubitf.bd.accessor.GeneralAccessorFactory;
import nc.util.fi.pub.SqlUtils;
import nc.vo.bd.accessor.IBDData;
import nc.vo.pub.BusinessException;
import nc.vo.pub.SuperVO;
import nccloud.commons.lang.StringUtils;

public class ArapVerifyConvert {
    public String getConditionSql(Map<String, String> map, String tablename) throws BusinessException {
        String isinitStr;
        String nameStr;
        String nodeStr;
        IBDData data;
        StringBuffer condition = new StringBuffer();
        String pk_group = InvocationInfoProxy.getInstance().getGroupId();
        String orgCodes = map.get("pk_org");
        ArrayList<String> orgs = new ArrayList<String>();
        if (!StringUtils.isEmpty((CharSequence)orgCodes)) {
            String[] pk_orgs = orgCodes.split(",");
            IBDData[] datas = GeneralAccessorFactory.getAccessor((String)"2cfe13c5-9757-4ae8-9327-f5c2d34bcb46").getDocByCodes(pk_group, pk_orgs);
            if (datas != null && datas.length > 0) {
                for (IBDData data2 : datas) {
                    orgs.add(data2.getPk());
                }
                condition.append(SqlUtils.getInStr((String)(tablename + "." + "pk_org"), orgs));
            }
        } else {
            return "1=2";
        }
        String userStr = NCESAPI.sqlEncode((String)map.get("pk_user"));
        if (!StringUtils.isEmpty((CharSequence)userStr) && (data = GeneralAccessorFactory.getAccessor((String)"f6f9a473-56c0-432f-8bc7-fbf8fde54fee").getDocByCode((String)orgs.get(0), userStr)) != null) {
            condition.append(" and ").append(tablename + "." + "pk_user" + "='" + data.getPk() + "'");
        }
        if (!StringUtils.isEmpty((CharSequence)(nodeStr = map.get("node_code")))) {
            condition.append(" and ").append(tablename + "." + "node_code" + "='" + nodeStr + "'");
        }
        if (!StringUtils.isEmpty((CharSequence)(nameStr = map.get("name")))) {
            condition.append(" and ").append(tablename + "." + "name" + " like '%" + nameStr + "%'");
        }
        if (!StringUtils.isEmpty((CharSequence)(isinitStr = map.get("isInit")))) {
            condition.append(" and ").append(tablename + "." + "isInit" + "='" + isinitStr + "'");
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
        if ("pu_org".equals(key)) {
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
        return null;
    }
}

