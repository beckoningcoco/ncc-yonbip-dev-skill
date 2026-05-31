/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.logging.Logger
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.BusinessRuntimeException
 */
package nc.vo.arap.pub;

import java.util.HashMap;
import java.util.Map;
import nc.bs.logging.Logger;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.arap.pub.IArapBilltypeInfo;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.BusinessRuntimeException;

public abstract class ArapBillTypeInfo
implements IArapBilltypeInfo {
    private static final String BILLTYPEPAC = "nc.vo.arap.pub.";
    static Map<String, IArapBilltypeInfo> billtypeMap = new HashMap<String, IArapBilltypeInfo>();
    static Map<String, String> billtypeClassMap = new HashMap<String, String>();

    public static IArapBilltypeInfo getInstance(Object param) {
        String pk_billtypeStr = null;
        if (param instanceof String) {
            pk_billtypeStr = (String)param;
        } else if (param instanceof BaseBillVO) {
            pk_billtypeStr = ((BaseBillVO)param).getPk_billtype();
        } else if (param instanceof BaseAggVO) {
            pk_billtypeStr = ((BaseAggVO)((Object)param)).getHeadVO().getPk_billtype();
        }
        if (pk_billtypeStr == null) {
            throw new BusinessRuntimeException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0550"));
        }
        if (billtypeMap.get(pk_billtypeStr) != null) {
            return billtypeMap.get(pk_billtypeStr);
        }
        IArapBilltypeInfo info = null;
        String className = billtypeClassMap.get(pk_billtypeStr);
        try {
            info = (IArapBilltypeInfo)Class.forName(className).newInstance();
        }
        catch (Exception e) {
            Logger.error((Object)e.getMessage());
        }
        if (info != null) {
            billtypeMap.put(pk_billtypeStr, info);
            return info;
        }
        throw new BusinessRuntimeException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0551") + pk_billtypeStr.toString());
    }

    @Override
    public String getParentBilltype() {
        return null;
    }

    @Override
    public boolean isBillType() {
        return !this.isTransType();
    }

    @Override
    public boolean isTransType() {
        return false;
    }

    @Override
    public String getTableNameItem() {
        String tabname = this.getTableNameBill();
        tabname = tabname.replaceAll("bill", "item");
        return tabname;
    }

    @Override
    public String getTablePrimaryKeyBill() {
        String tabname = this.getTableNameBill();
        return this.getPkField(tabname);
    }

    @Override
    public String getTablePrimaryKeyItem() {
        String tabname = this.getTableNameItem();
        return this.getPkField(tabname);
    }

    private String getPkField(String tableNameItem) {
        String prefix = "ar_";
        String prefix2 = "ap_";
        String prefixPk = "pk_";
        if (tableNameItem.startsWith(prefix)) {
            tableNameItem = tableNameItem.replaceAll(prefix, prefixPk);
        }
        if (tableNameItem.startsWith(prefix2)) {
            tableNameItem = tableNameItem.replaceAll(prefix2, prefixPk);
        }
        return tableNameItem;
    }

    @Override
    public String getDefaultMoneyField() {
        if (this.getDirection().equals((Object)BillEnumCollection.Direction.CREDIT)) {
            return "money_cr";
        }
        return "money_de";
    }

    @Override
    public String getDefaultLocalMoneyField() {
        if (this.getDirection().equals((Object)BillEnumCollection.Direction.CREDIT)) {
            return "local_money_cr";
        }
        return "local_money_de";
    }

    @Override
    public String getDefaultTransType() {
        if (this.isTransType()) {
            return this.getCode();
        }
        String code = this.getCode();
        code = code.replace('F', 'D');
        code = code.replace('E', 'C');
        return code;
    }

    static {
        billtypeClassMap.put("F0", "nc.vo.arap.pub.F0Billtype");
        billtypeClassMap.put("F1", "nc.vo.arap.pub.F1Billtype");
        billtypeClassMap.put("F2", "nc.vo.arap.pub.F2Billtype");
        billtypeClassMap.put("F3", "nc.vo.arap.pub.F3Billtype");
        billtypeClassMap.put("23F0", "nc.vo.arap.pub.F023Billtype");
        billtypeClassMap.put("23F1", "nc.vo.arap.pub.F123Billtype");
        billtypeClassMap.put("23F2", "nc.vo.arap.pub.F223Billtype");
        billtypeClassMap.put("23F3", "nc.vo.arap.pub.F323Billtype");
        billtypeClassMap.put("23E0", "nc.vo.arap.pub.E0Billtype");
        billtypeClassMap.put("23E1", "nc.vo.arap.pub.E1Billtype");
    }
}

