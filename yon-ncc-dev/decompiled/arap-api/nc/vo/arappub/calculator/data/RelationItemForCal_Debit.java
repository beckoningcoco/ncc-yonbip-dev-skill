/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pubapp.calculator.data.RelationItemForCal
 */
package nc.vo.arappub.calculator.data;

import nc.vo.pubapp.calculator.data.RelationItemForCal;

public class RelationItemForCal_Debit
extends RelationItemForCal {
    private static RelationItemForCal_Debit instance = new RelationItemForCal_Debit();

    public static RelationItemForCal_Debit getInstance() {
        return instance;
    }

    public RelationItemForCal_Debit() {
        this.setPk_org("pk_org");
        this.setBillDate("billdate");
        this.setNorigtaxmnyKey("money_de");
        this.setNorigmnyKey("notax_de");
        this.setNorigtaxKey("tax_de");
        this.setnumKey("quantity_de");
        this.setNtaxrateKey("taxrate");
        this.setNorigtaxnetpriceKey("taxprice");
        this.setNorignetpriceKey("price");
        this.setNtaxnetpriceKey("local_taxprice");
        this.setNnetpriceKey("local_price");
        this.setNqtunitnumKey("postquantity");
        this.setNqtorigpriceKey("postpricenotax");
        this.setNqtorigtaxpriceKey("postprice");
        this.setNtaxmnyKey("local_money_de");
        this.setNmnyKey("local_notax_de");
        this.setNtaxKey("local_tax_de");
        this.setNexchangerateKey("rate");
        this.setCorigcurrencyidKey("pk_currtype");
        this.setNglobalmnyKey("globalnotax_de");
        this.setNglobaltaxmnyKey("globaldebit");
        this.setNglobalexchgrateKey("globalrate");
        this.setNgroupmnyKey("groupnotax_de");
        this.setNgrouptaxmnyKey("groupdebit");
        this.setNgroupexchgrateKey("grouprate");
        this.setPk_group("pk_group");
        this.setFtaxtypeflagKey("taxtype");
        this.setNcaltaxmnyKey("caltaxmny");
        this.setNdeductibletaxKey("nosubtax");
        this.setNdeductibleTaxrateKey("nosubtaxrate");
        this.setCunitidKey("pk_group");
        this.setCratetypeKey("pk_ratetype");
    }
}

