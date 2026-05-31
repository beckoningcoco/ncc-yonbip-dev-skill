/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pub.lang.UFDouble
 *  nc.vo.pubapp.calculator.data.IDataSetForCal
 *  nc.vo.pubapp.calculator.data.IRelationForItems
 */
package nc.vo.arap.cal;

import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.calculator.data.IDataSetForCal;
import nc.vo.pubapp.calculator.data.IRelationForItems;

public class DataSetForCal
implements IDataSetForCal {
    private IRelationForItems item;
    private CircularlyAccessibleValueObject data = null;

    public DataSetForCal(CircularlyAccessibleValueObject vo, IRelationForItems item) {
        this.data = vo;
        this.item = item;
    }

    public DataSetForCal(CircularlyAccessibleValueObject vo) {
        this.data = vo;
    }

    public Object getAttributeValue(String key) {
        return this.data.getAttributeValue(key);
    }

    public UFDate getBillDate() {
        return (UFDate)this.data.getAttributeValue(this.item.getBillDate());
    }

    public String getCastunitid() {
        return (String)this.data.getAttributeValue(this.item.getCastunitidKey());
    }

    public String getCcurrencyid() {
        return (String)this.data.getAttributeValue(this.item.getCcurrencyidKey());
    }

    public String getCorigcurrencyid() {
        return (String)this.data.getAttributeValue(this.item.getCorigcurrencyidKey());
    }

    public String getCqtcurrencyid() {
        return (String)this.data.getAttributeValue(this.item.getCqtcurrencyidKey());
    }

    public String getCqtunitid() {
        return (String)this.data.getAttributeValue(this.item.getCqtunitidKey());
    }

    public String getCunitid() {
        return (String)this.data.getAttributeValue(this.item.getCunitidKey());
    }

    public int getFtaxtypeflag() {
        if (this.data.getAttributeValue(this.item.getFtaxtypeflagKey()) != null) {
            return (Integer)this.data.getAttributeValue(this.item.getFtaxtypeflagKey());
        }
        return 0;
    }

    public UFDouble getNaskqtorigprice() {
        return (UFDouble)this.data.getAttributeValue(this.item.getNaskqtorigpriceKey());
    }

    public UFDouble getNaskqtorigtaxprc() {
        return (UFDouble)this.data.getAttributeValue(this.item.getNaskqtorigtaxprcKey());
    }

    public UFDouble getNaskqtprice() {
        return (UFDouble)this.data.getAttributeValue(this.item.getNaskqtpriceKey());
    }

    public UFDouble getNaskqttaxprice() {
        return (UFDouble)this.data.getAttributeValue(this.item.getNaskqttaxpriceKey());
    }

    public UFDouble getNassistnum() {
        return (UFDouble)this.data.getAttributeValue(this.item.getNassistnumKey());
    }

    public UFDouble getNcostmny() {
        return (UFDouble)this.data.getAttributeValue(this.item.getNcostmnyKey());
    }

    public UFDouble getNcostprice() {
        return (UFDouble)this.data.getAttributeValue(this.item.getNcostpriceKey());
    }

    public UFDouble getNdiscount() {
        return (UFDouble)this.data.getAttributeValue(this.item.getNdiscountKey());
    }

    public UFDouble getNdiscountrate() {
        return (UFDouble)this.data.getAttributeValue(this.item.getNdiscountrateKey());
    }

    public UFDouble getNexchangerate() {
        return (UFDouble)this.data.getAttributeValue(this.item.getNexchangerateKey());
    }

    public UFDouble getNglobalexchgrate() {
        return (UFDouble)this.data.getAttributeValue(this.item.getNglobalexchgrateKey());
    }

    public UFDouble getNglobalmny() {
        return (UFDouble)this.data.getAttributeValue(this.item.getNglobalmnyKey());
    }

    public UFDouble getNglobaltaxmny() {
        return (UFDouble)this.data.getAttributeValue(this.item.getNglobaltaxmnyKey());
    }

    public UFDouble getNgroupexchgrate() {
        return (UFDouble)this.data.getAttributeValue(this.item.getNgroupexchgrateKey());
    }

    public UFDouble getNgroupmny() {
        return (UFDouble)this.data.getAttributeValue(this.item.getNgroupmnyKey());
    }

    public UFDouble getNgrouptaxmny() {
        return (UFDouble)this.data.getAttributeValue(this.item.getNgrouptaxmnyKey());
    }

    public UFDouble getNitemdiscountrate() {
        return (UFDouble)this.data.getAttributeValue(this.item.getNitemdiscountrateKey());
    }

    public UFDouble getNmny() {
        return (UFDouble)this.data.getAttributeValue(this.item.getNmnyKey());
    }

    public UFDouble getNnetprice() {
        return null;
    }

    public UFDouble getNnum() {
        return (UFDouble)this.data.getAttributeValue("quantity_de");
    }

    public UFDouble getNorigdiscount() {
        return null;
    }

    public UFDouble getNorigmny() {
        return (UFDouble)this.data.getAttributeValue("notax_de");
    }

    public UFDouble getNorignetprice() {
        return null;
    }

    public UFDouble getNorigprice() {
        return (UFDouble)this.data.getAttributeValue(this.item.getNorigpriceKey());
    }

    public UFDouble getNorigtaxmny() {
        return (UFDouble)this.data.getAttributeValue(this.item.getNorigtaxmnyKey());
    }

    public UFDouble getNorigtaxnetprice() {
        return (UFDouble)this.data.getAttributeValue(this.item.getNorigtaxnetpriceKey());
    }

    public UFDouble getNorigtaxprice() {
        return (UFDouble)this.data.getAttributeValue(this.item.getNorigtaxpriceKey());
    }

    public UFDouble getNprice() {
        return (UFDouble)this.data.getAttributeValue(this.item.getNpriceKey());
    }

    public UFDouble getNqtnetprice() {
        return (UFDouble)this.data.getAttributeValue(this.item.getNqtnetpriceKey());
    }

    public UFDouble getNqtorignetprice() {
        return (UFDouble)this.data.getAttributeValue(this.item.getNqtorignetpriceKey());
    }

    public UFDouble getNqtorigprice() {
        return (UFDouble)this.data.getAttributeValue(this.item.getNqtorigpriceKey());
    }

    public UFDouble getNqtorigtaxnetprc() {
        return (UFDouble)this.data.getAttributeValue(this.item.getNqtorigtaxnetprcKey());
    }

    public UFDouble getNqtorigtaxprice() {
        return (UFDouble)this.data.getAttributeValue(this.item.getNqtorigtaxpriceKey());
    }

    public UFDouble getNqtprice() {
        return (UFDouble)this.data.getAttributeValue(this.item.getNqtpriceKey());
    }

    public UFDouble getNqttaxnetprice() {
        return (UFDouble)this.data.getAttributeValue(this.item.getNqttaxnetpriceKey());
    }

    public UFDouble getNqttaxprice() {
        return (UFDouble)this.data.getAttributeValue(this.item.getNqttaxpriceKey());
    }

    public UFDouble getNqtunitnum() {
        return (UFDouble)this.data.getAttributeValue(this.item.getNqtunitnumKey());
    }

    public UFDouble getNtax() {
        return (UFDouble)this.data.getAttributeValue(this.item.getNtaxKey());
    }

    public UFDouble getNtaxmny() {
        return (UFDouble)this.data.getAttributeValue(this.item.getNtaxmnyKey());
    }

    public UFDouble getNtaxnetprice() {
        return (UFDouble)this.data.getAttributeValue(this.item.getNtaxnetpriceKey());
    }

    public UFDouble getNtaxprice() {
        return (UFDouble)this.data.getAttributeValue(this.item.getNtaxpriceKey());
    }

    public UFDouble getNtaxrate() {
        return (UFDouble)this.data.getAttributeValue(this.item.getNtaxrateKey());
    }

    public UFDouble getNtotalnum() {
        return (UFDouble)this.data.getAttributeValue(this.item.getNtotalnumKey());
    }

    public UFDouble getNtotalorigmny() {
        return (UFDouble)this.data.getAttributeValue(this.item.getNtotalorigmnyKey());
    }

    public UFDouble getNtotalorigtaxmny() {
        return (UFDouble)this.data.getAttributeValue(this.item.getNtotalorigtaxmnyKey());
    }

    public UFDouble getQualifiedNum() {
        return (UFDouble)this.data.getAttributeValue(this.item.getQualifiedNumKey());
    }

    public IRelationForItems getRelationForItem() {
        return this.item;
    }

    public UFDouble getUnQualifiedNum() {
        return (UFDouble)this.data.getAttributeValue(this.item.getUnQualifiedNumKey());
    }

    public boolean hasItemKey(String key) {
        for (int i = 0; i < this.data.getAttributeNames().length; ++i) {
            if (!this.data.getAttributeNames()[i].equals(key)) continue;
            return true;
        }
        return false;
    }

    public void setBillDate(UFDate date) {
        this.data.setAttributeValue(this.item.getBillDate(), (Object)date);
    }

    public void setCastunitid(String value) {
        this.data.setAttributeValue(this.item.getCastunitidKey(), (Object)value);
    }

    public void setCcurrencyid(String value) {
        this.data.setAttributeValue(this.item.getCcurrencyidKey(), (Object)value);
    }

    public void setCorigcurrencyid(String value) {
        this.data.setAttributeValue(this.item.getCorigcurrencyidKey(), (Object)value);
    }

    public void setCqtcurrencyid(String value) {
        this.data.setAttributeValue(this.item.getCqtcurrencyidKey(), (Object)value);
    }

    public void setCqtunitid(String value) {
        this.data.setAttributeValue(this.item.getCqtunitidKey(), (Object)value);
    }

    public void setCunitid(String value) {
        this.data.setAttributeValue(this.item.getCunitidKey(), (Object)value);
    }

    public void setFtaxtypeflag(int value) {
        this.data.setAttributeValue(this.item.getFtaxtypeflagKey(), (Object)value);
    }

    public void setNaskqtorigprice(UFDouble value) {
        this.data.setAttributeValue(this.item.getNaskqtorigpriceKey(), (Object)value);
    }

    public void setNaskqtorigtaxprc(UFDouble value) {
        this.data.setAttributeValue(this.item.getNaskqtorigtaxprcKey(), (Object)value);
    }

    public void setNaskqtprice(UFDouble value) {
        this.data.setAttributeValue(this.item.getNaskqtpriceKey(), (Object)value);
    }

    public void setNaskqttaxprice(UFDouble value) {
        this.data.setAttributeValue(this.item.getNaskqttaxpriceKey(), (Object)value);
    }

    public void setNassistnum(UFDouble value) {
        this.data.setAttributeValue(this.item.getNassistnumKey(), (Object)value);
    }

    public void setNcostprice(UFDouble value) {
        this.data.setAttributeValue(this.item.getNcostpriceKey(), (Object)value);
    }

    public void setNdiscount(UFDouble value) {
        this.data.setAttributeValue(this.item.getNdiscountKey(), (Object)value);
    }

    public void setNdiscountrate(UFDouble value) {
        this.data.setAttributeValue(this.item.getNdiscountrateKey(), (Object)value);
    }

    public void setNexchangerate(UFDouble value) {
        this.data.setAttributeValue(this.item.getNexchangerateKey(), (Object)value);
    }

    public void setNglobalexchgrate(UFDouble value) {
        this.data.setAttributeValue(this.item.getNglobalexchgrateKey(), (Object)value);
    }

    public void setNglobalmny(UFDouble value) {
        this.data.setAttributeValue(this.item.getNglobalmnyKey(), (Object)value);
    }

    public void setNglobaltaxmny(UFDouble value) {
        this.data.setAttributeValue(this.item.getNglobaltaxmnyKey(), (Object)value);
    }

    public void setNgroupexchgrate(UFDouble value) {
        this.data.setAttributeValue(this.item.getNgroupexchgrateKey(), (Object)value);
    }

    public void setNgroupmny(UFDouble value) {
        this.data.setAttributeValue(this.item.getNgroupmnyKey(), (Object)value);
    }

    public void setNgrouptaxmny(UFDouble value) {
        this.data.setAttributeValue(this.item.getNgrouptaxmnyKey(), (Object)value);
    }

    public void setNitemdiscountrate(UFDouble value) {
        this.data.setAttributeValue(this.item.getNitemdiscountrateKey(), (Object)value);
    }

    public void setNmny(UFDouble value) {
        this.data.setAttributeValue(this.item.getNmnyKey(), (Object)value);
    }

    public void setNnetprice(UFDouble value) {
        this.data.setAttributeValue(this.item.getNnetpriceKey(), (Object)value);
    }

    public void setNnum(UFDouble value) {
        this.data.setAttributeValue(this.item.getNnumKey(), (Object)value);
    }

    public void setNorigdiscount(UFDouble value) {
        this.data.setAttributeValue(this.item.getNorigdiscountKey(), (Object)value);
    }

    public void setNorigmny(UFDouble value) {
        this.data.setAttributeValue(this.item.getNorigmnyKey(), (Object)value);
    }

    public void setNorignetprice(UFDouble value) {
        this.data.setAttributeValue(this.item.getNorignetpriceKey(), (Object)value);
    }

    public void setNorigprice(UFDouble value) {
        this.data.setAttributeValue(this.item.getNorigpriceKey(), (Object)value);
    }

    public void setNorigtaxmny(UFDouble value) {
        this.data.setAttributeValue(this.item.getNorigtaxmnyKey(), (Object)value);
    }

    public void setNorigtaxnetprice(UFDouble value) {
        this.data.setAttributeValue(this.item.getNorigtaxnetpriceKey(), (Object)value);
    }

    public void setNorigtaxprice(UFDouble value) {
        this.data.setAttributeValue(this.item.getNorigtaxpriceKey(), (Object)value);
    }

    public void setNprice(UFDouble value) {
        this.data.setAttributeValue(this.item.getNpriceKey(), (Object)value);
    }

    public void setNqtnetprice(UFDouble value) {
        this.data.setAttributeValue(this.item.getNqtnetpriceKey(), (Object)value);
    }

    public void setNqtorignetprice(UFDouble value) {
        this.data.setAttributeValue(this.item.getNqtorignetpriceKey(), (Object)value);
    }

    public void setNqtorigprice(UFDouble value) {
        this.data.setAttributeValue(this.item.getNqtorigpriceKey(), (Object)value);
    }

    public void setNqtorigtaxnetprc(UFDouble value) {
        this.data.setAttributeValue(this.item.getNqtorigtaxnetprcKey(), (Object)value);
    }

    public void setNqtorigtaxprice(Object value) {
        this.data.setAttributeValue(this.item.getNqtorigtaxpriceKey(), value);
    }

    public void setNqtprice(UFDouble value) {
        this.data.setAttributeValue(this.item.getNqtpriceKey(), (Object)value);
    }

    public void setNqttaxnetprice(UFDouble value) {
        this.data.setAttributeValue(this.item.getNqttaxnetpriceKey(), (Object)value);
    }

    public void setNqttaxprice(UFDouble value) {
        this.data.setAttributeValue(this.item.getNqttaxpriceKey(), (Object)value);
    }

    public void setNqtunitnum(UFDouble value) {
        this.data.setAttributeValue(this.item.getNqtunitnumKey(), (Object)value);
    }

    public void setNtax(UFDouble value) {
        this.data.setAttributeValue(this.item.getNtaxKey(), (Object)value);
    }

    public void setNtaxmny(UFDouble value) {
        this.data.setAttributeValue(this.item.getNtaxmnyKey(), (Object)value);
    }

    public void setNtaxnetprice(UFDouble value) {
        this.data.setAttributeValue(this.item.getNtaxnetpriceKey(), (Object)value);
    }

    public void setNtaxprice(UFDouble value) {
        this.data.setAttributeValue(this.item.getNtaxpriceKey(), (Object)value);
    }

    public void setNtaxrate(UFDouble value) {
        this.data.setAttributeValue(this.item.getNtaxrateKey(), (Object)value);
    }

    public void setNtotalnum(UFDouble value) {
        this.data.setAttributeValue(this.item.getNtotalnumKey(), (Object)value);
    }

    public void setNtotalorigmny(UFDouble value) {
        this.data.setAttributeValue(this.item.getNtotalorigmnyKey(), (Object)value);
    }

    public void setNtotalorigtaxmny(UFDouble value) {
        this.data.setAttributeValue(this.item.getNtotalorigtaxmnyKey(), (Object)value);
    }

    public void setQualifiedNum(UFDouble value) {
        this.data.setAttributeValue(this.item.getQualifiedNumKey(), (Object)value);
    }

    public void setUnQualifiedNum(UFDouble value) {
        this.data.setAttributeValue(this.item.getUnQualifiedNumKey(), (Object)value);
    }

    public String getPk_group() {
        return (String)this.data.getAttributeValue("pk_group");
    }

    public String getPk_org() {
        return (String)this.data.getAttributeValue("pk_org");
    }

    public void setPk_group(String value) {
        this.data.setAttributeValue(this.item.getPk_group(), (Object)value);
    }

    public void setPk_org(String key) {
        this.data.setAttributeValue(this.item.getPk_org(), (Object)key);
    }

    public void setNchangerate(String value) {
        this.data.setAttributeValue(this.item.getNchangerateKey(), (Object)value);
    }

    public void setNqtunitrate(String value) {
        this.data.setAttributeValue(this.item.getNqtunitrateKey(), (Object)value);
    }

    public String getNchangerate() {
        return null;
    }

    public String getNqtunitrate() {
        return null;
    }

    public void setNcostmny(UFDouble value) {
        this.data.setAttributeValue(this.item.getNcostmnyKey(), (Object)value);
    }

    public void setNorigtax(UFDouble value) {
    }

    public UFDouble getNorigtax() {
        return null;
    }

    public UFDouble getNcaltaxmny() {
        return (UFDouble)this.data.getAttributeValue(this.item.getNcaltaxmnyKey());
    }

    public UFDouble getNdeductibleTaxrate() {
        return (UFDouble)this.data.getAttributeValue(this.item.getNdeductibleTaxrateKey());
    }

    public UFDouble getNdeductibletax() {
        return (UFDouble)this.data.getAttributeValue(this.item.getNdeductibletaxKey());
    }

    public void setNcaltaxmny(UFDouble value) {
        this.data.setAttributeValue(this.item.getNcaltaxmnyKey(), (Object)value);
    }

    public void setNdeductibleTaxrate(UFDouble value) {
        this.data.setAttributeValue(this.item.getNdeductibleTaxrateKey(), (Object)value);
    }

    public void setNdeductibletax(UFDouble value) {
        this.data.setAttributeValue(this.item.getNdeductibletaxKey(), (Object)value);
    }

    public String getCratetype() {
        return (String)this.data.getAttributeValue("pk_ratetype");
    }

    public void setCratetype(String key) {
        this.data.setAttributeValue("pk_ratetype", (Object)key);
    }
}

