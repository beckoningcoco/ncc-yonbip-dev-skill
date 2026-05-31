/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.itf.tb.control.IAccessableOrgsBusiVO
 *  nc.pubitf.bd.accessor.GeneralAccessorFactory
 *  nc.pubitf.bd.accessor.IGeneralAccessor
 *  nc.vo.bd.accessor.IBDData
 *  nc.vo.pub.lang.UFDouble
 *  org.apache.commons.lang3.StringUtils
 */
package nc.vo.arap.ntb;

import java.io.Serializable;
import java.util.ArrayList;
import nc.itf.tb.control.IAccessableOrgsBusiVO;
import nc.pubitf.bd.accessor.GeneralAccessorFactory;
import nc.pubitf.bd.accessor.IGeneralAccessor;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.arap.pub.ArapConstant;
import nc.vo.bd.accessor.IBDData;
import nc.vo.pub.lang.UFDouble;
import org.apache.commons.lang3.StringUtils;

public class ArapAccessableBusiVO
implements IAccessableOrgsBusiVO,
Serializable {
    private static final long serialVersionUID = 1L;
    private BaseBillVO billVO = null;
    private BaseItemVO itemVO = null;
    private String dataType = null;
    private boolean isAdd = true;

    public boolean isAdd() {
        return this.isAdd;
    }

    public void setAdd(boolean isAdd) {
        this.isAdd = isAdd;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public ArapAccessableBusiVO(BaseBillVO billVO, BaseItemVO itemVO) {
        this.setBillVO((BaseBillVO)billVO.clone());
        this.setItemVO((BaseItemVO)itemVO.clone());
    }

    public BaseBillVO getBillVO() {
        return this.billVO;
    }

    public void setBillVO(BaseBillVO billVO) {
        this.billVO = billVO;
    }

    public BaseItemVO getItemVO() {
        return this.itemVO;
    }

    public void setItemVO(BaseItemVO itemVO) {
        this.itemVO = itemVO;
    }

    public String[] getAllUpLevels(String fieldname, String pk) throws Exception {
        String mdId = this.getMdIdByFieldName(fieldname);
        IGeneralAccessor accessor = GeneralAccessorFactory.getAccessor((String)mdId);
        if (accessor == null) {
            return new String[]{pk};
        }
        IBDData[] bdDatas = accessor.getFatherDocs("", pk, true).toArray(new IBDData[0]);
        if (bdDatas == null) {
            return new String[]{pk};
        }
        String[] pks = new String[bdDatas.length];
        for (int i = 0; i < pks.length; ++i) {
            pks[i] = bdDatas[i].getPk();
        }
        return pks;
    }

    private String getMdIdByFieldName(String fieldname) {
        String mdId = null;
        if (ArapConstant.ARAP_ORG.equals(fieldname)) {
            mdId = ArapConstant.ARAP_MDID_ORG;
        } else if (ArapConstant.ARAP_DEPT.equals(fieldname)) {
            mdId = ArapConstant.ARAP_MDID_DEPT;
        } else if (ArapConstant.ARAP_ARAPBILLTYPE.equals(fieldname)) {
            mdId = ArapConstant.ARAP_MDID_ARAPBILLTYPE;
        } else if (ArapConstant.ARAP_CUSTOMER.equals(fieldname)) {
            mdId = ArapConstant.ARAP_MDID_CUSTOMER;
        } else if (ArapConstant.ARAP_SUPPLIER.equals(fieldname)) {
            mdId = ArapConstant.ARAP_MDID_SUPPLIER;
        } else if (ArapConstant.ARAP_PK_SUBJCODE.equals(fieldname)) {
            mdId = ArapConstant.ARAP_MDID_PKSUBJCODE;
        } else if (ArapConstant.ARAP_PSNDOC.equals(fieldname)) {
            mdId = ArapConstant.ARAP_MDID_PSNDOC;
        } else if (ArapConstant.ARAP_BANKROLLPROJET.equals(fieldname)) {
            mdId = ArapConstant.ARAP_MDID_BANKROLLPROJET;
        } else if (ArapConstant.ARAP_SUBJCODE.equals(fieldname)) {
            mdId = ArapConstant.ARAP_MDID_SUBJCODE;
        } else if (ArapConstant.ARAP_MATERIAL.equals(fieldname)) {
            mdId = ArapConstant.ARAP_MDID_MATERIAL;
        } else if (ArapConstant.ARAP_PRODUCTLINE.equals(fieldname)) {
            mdId = ArapConstant.ARAP_MDID_PRODUCTLINE;
        } else if (ArapConstant.ARAP_COSTCENTER.equals(fieldname)) {
            mdId = ArapConstant.ARAP_MDID_COSTCENTER;
        }
        return mdId;
    }

    public String[] getAttributesValue(String[] arg0) {
        ArrayList<String> list = new ArrayList<String>();
        if (arg0 != null) {
            for (int n = 0; n < arg0.length; ++n) {
                list.add(this.getAttributesValue(arg0[n]));
            }
        }
        return list.toArray(new String[0]);
    }

    public String getAttributesValue(String attr) {
        if (StringUtils.isEmpty((CharSequence)attr)) {
            return null;
        }
        String col = attr.substring(7);
        Object value = null;
        int i = attr.indexOf("arap_h_");
        value = i >= 0 ? this.getBillVO().getAttributeValue(col) : this.getItemVO().getAttributeValue(col);
        return value == null ? null : value.toString();
    }

    public String getBillType() {
        return this.getBillVO().getPk_tradetype();
    }

    public String getBusiDate() {
        return this.billVO.getBilldate().toStdString();
    }

    public String getBusiSys() {
        return ArapConstant.SYS_ID;
    }

    public String getBusiType() {
        return null;
    }

    public String getCurrency() {
        return this.billVO.getPk_currtype();
    }

    public String getPKGroup() {
        return this.getBillVO().getPk_group();
    }

    public String getPKOrg() {
        return this.getBillVO().getPk_org();
    }

    public String getPkNcEntity() {
        return null;
    }

    public UFDouble[] getExeData(String direction, String obj, String extObj) {
        UFDouble globalcrebit;
        UFDouble zero = UFDouble.ZERO_DBL;
        BaseItemVO billItemVO = this.getItemVO();
        ArapConstant constant = new ArapConstant();
        UFDouble money_de = billItemVO.getMoney_de() == null ? zero : billItemVO.getMoney_de();
        UFDouble local_money_de = billItemVO.getLocal_money_de() == null ? zero : billItemVO.getLocal_money_de();
        UFDouble groupdebit = billItemVO.getGroupdebit() == null ? zero : billItemVO.getGroupdebit();
        UFDouble globaldebt = billItemVO.getGlobaldebit() == null ? zero : billItemVO.getGlobaldebit();
        UFDouble money_cr = billItemVO.getMoney_cr() == null ? zero : billItemVO.getMoney_cr();
        UFDouble local_money_cr = billItemVO.getLocal_money_cr() == null ? zero : billItemVO.getLocal_money_cr();
        UFDouble groupcrebit = billItemVO.getGroupcrebit() == null ? zero : billItemVO.getGroupcrebit();
        UFDouble uFDouble = globalcrebit = billItemVO.getGlobalcrebit() == null ? zero : billItemVO.getGlobalcrebit();
        if (constant.ARAP_NTB_CTL_TAX_KEY.equals(extObj)) {
            local_money_cr = money_cr = billItemVO.getLocal_tax_cr() == null ? zero : billItemVO.getLocal_tax_cr();
            groupcrebit = money_cr;
            globalcrebit = money_cr;
            local_money_de = money_de = billItemVO.getLocal_tax_de() == null ? zero : billItemVO.getLocal_tax_de();
            groupdebit = money_de;
            globaldebt = money_de;
        } else if (constant.ARAP_NTB_CTL_NOTAX_KEY.equals(extObj)) {
            money_cr = billItemVO.getNotax_cr() == null ? zero : billItemVO.getNotax_cr();
            local_money_cr = billItemVO.getLocal_notax_cr() == null ? zero : billItemVO.getLocal_notax_cr();
            groupcrebit = billItemVO.getGroupnotax_cre() == null ? zero : billItemVO.getGroupnotax_cre();
            globalcrebit = billItemVO.getGlobalnotax_cre() == null ? zero : billItemVO.getGlobalnotax_cre();
            money_de = billItemVO.getNotax_de() == null ? zero : billItemVO.getNotax_de();
            local_money_de = billItemVO.getLocal_notax_de() == null ? zero : billItemVO.getLocal_notax_de();
            groupdebit = billItemVO.getGroupnotax_de() == null ? zero : billItemVO.getGroupnotax_de();
            UFDouble uFDouble2 = globaldebt = billItemVO.getGlobalnotax_de() == null ? zero : billItemVO.getGlobalnotax_de();
        }
        if (this.isAdd()) {
            if ("F2".equals(this.billVO.getPk_billtype()) || "F1".equals(this.billVO.getPk_billtype())) {
                return new UFDouble[]{globalcrebit, groupcrebit, local_money_cr, money_cr};
            }
            return new UFDouble[]{globaldebt, groupdebit, local_money_de, money_de};
        }
        if ("F2".equals(this.billVO.getPk_billtype()) || "F1".equals(this.billVO.getPk_billtype())) {
            return new UFDouble[]{zero.sub(globalcrebit), zero.sub(groupcrebit), zero.sub(local_money_cr), zero.sub(money_cr)};
        }
        return new UFDouble[]{zero.sub(globaldebt), zero.sub(groupdebit), zero.sub(local_money_de), zero.sub(money_de)};
    }

    public boolean isUnInure() {
        return false;
    }

    public String[] getHasLevelFlds() {
        return null;
    }

    public String getDataType() {
        return this.dataType;
    }

    public String getDateType() {
        return null;
    }

    public String getPKOrg(String orgAtt) {
        if (ArapConstant.ARAP_PK_PCORG.equals(orgAtt)) {
            return this.getItemVO().getPk_pcorg();
        }
        if (ArapConstant.ARAP_PK_PROJECT.equals(orgAtt)) {
            return this.getItemVO().getProject();
        }
        return this.getPKOrg();
    }
}

