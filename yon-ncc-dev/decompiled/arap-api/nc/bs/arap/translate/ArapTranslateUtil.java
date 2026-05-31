/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.logging.Logger
 *  nc.md.data.access.NCObject
 *  nc.vo.jcom.lang.StringUtil
 *  nc.vo.pub.lang.UFDate
 */
package nc.bs.arap.translate;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import nc.bs.logging.Logger;
import nc.md.data.access.NCObject;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.jcom.lang.StringUtil;
import nc.vo.pub.lang.UFDate;

public class ArapTranslateUtil {
    public static Map<String, String> getFildValue(BaseAggVO aggvo, String pk_transtype) {
        HashMap<String, String> result = new HashMap<String, String>();
        NCObject vo = NCObject.newInstance((Object)aggvo.getParentVO());
        NCObject itemvo = NCObject.newInstance((Object)aggvo.getChildrenVO()[0]);
        result.put("OrgID", (String)vo.getAttributeValue("pk_org.code"));
        result.put("OrgName", vo.getAttributeValue("pk_org.name").toString());
        result.put("TypeID", (String)vo.getAttributeValue("pk_tradetype"));
        result.put("TypeName", vo.getAttributeValue("pk_tradetypeid.billtypename") == null ? "" : vo.getAttributeValue("pk_tradetypeid.billtypename").toString());
        result.put("DocDate", ArapTranslateUtil.getFormatDate((UFDate)vo.getAttributeValue("billdate")));
        result.put("CustomerID", (String)itemvo.getAttributeValue("customer.code"));
        String customerName = itemvo.getAttributeValue("customer.name") == null ? "" : itemvo.getAttributeValue("customer.name").toString();
        result.put("CustomerName", ArapTranslateUtil.removeSpecialCharacter(customerName));
        result.put("SupplierID", (String)itemvo.getAttributeValue("supplier.code"));
        String supplierName = itemvo.getAttributeValue("supplier.name") == null ? "" : itemvo.getAttributeValue("supplier.name").toString();
        result.put("SupplierName", ArapTranslateUtil.removeSpecialCharacter(supplierName));
        result.put("DepartmentID", (String)itemvo.getAttributeValue("pk_deptid.code"));
        result.put("DepartmentName", itemvo.getAttributeValue("pk_deptid.name") == null ? "" : itemvo.getAttributeValue("pk_deptid.name").toString());
        result.put("OperatorID", (String)itemvo.getAttributeValue("pk_psndoc.code"));
        result.put("OperatorName", itemvo.getAttributeValue("pk_psndoc.name") == null ? "" : itemvo.getAttributeValue("pk_psndoc.name").toString());
        result.put("CurrencyID", (String)vo.getAttributeValue("pk_currtype.code"));
        result.put("CurrencyName", vo.getAttributeValue("pk_currtype.name") == null ? "" : vo.getAttributeValue("pk_currtype.name").toString());
        result.put("ReversalFlag", vo.getAttributeValue("isreded") == null ? "N" : vo.getAttributeValue("isreded").toString());
        result.put("PaymentMethodName", vo.getAttributeValue("pk_balatype.name") == null ? "" : vo.getAttributeValue("pk_balatype.name").toString());
        result.put("DocCode", vo.getAttributeValue("billno") == null ? "" : vo.getAttributeValue("billno").toString());
        result.put("System", vo.getAttributeValue("syscode") == null ? "" : vo.getAttributeValue("syscode").toString());
        return result;
    }

    public static String removeSpecialCharacter(String content) {
        if (!StringUtil.isEmpty((String)content)) {
            if (content.indexOf("\\") != -1) {
                content = content.replace("\\", "-");
            } else if (content.indexOf("/") != -1) {
                content = content.replace("/", "-");
            }
            content = content.replaceAll("&", "");
            content = content.replaceAll("%", "");
            content = content.replaceAll(" ", "");
            content = content.replaceAll(" +", "");
            content = content.replaceAll("\\s*", "");
            content = ArapTranslateUtil.completeTrim(content);
        }
        return content;
    }

    private static String completeTrim(String content) {
        byte[] bytes = new byte[]{-62, -96};
        String UTFSpace = "";
        try {
            UTFSpace = new String(bytes, "utf-8");
            Pattern p = Pattern.compile("\t|\r|\n|" + UTFSpace);
            Matcher m = null;
            m = p.matcher(content);
            content = m.replaceAll("");
        }
        catch (UnsupportedEncodingException e) {
            Logger.error((Object)e.getMessage(), (Throwable)e);
        }
        return content;
    }

    public static String getFormatDate(UFDate date) {
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
        return format.format(date.toDate());
    }
}

