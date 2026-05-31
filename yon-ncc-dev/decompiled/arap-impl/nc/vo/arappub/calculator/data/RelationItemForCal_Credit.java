/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pubapp.calculator.data.RelationItemForCal
 */
package nc.vo.arappub.calculator.data;

import nc.vo.pubapp.calculator.data.RelationItemForCal;

public class RelationItemForCal_Credit
extends RelationItemForCal {
    private static RelationItemForCal_Credit instance = new RelationItemForCal_Credit();

    public static RelationItemForCal_Credit getInstance() {
        return instance;
    }

    public RelationItemForCal_Credit() {
        this.setPk_org("pk_org");
        this.setBillDate("billdate");
        this.setNorigtaxmnyKey("money_cr");
        this.setNorigmnyKey("notax_cr");
        this.setNorigtaxKey("tax_cr");
        this.setnumKey("quantity_cr");
        this.setNtaxrateKey("taxrate");
        this.setNorigtaxnetpriceKey("taxprice");
        this.setNorignetpriceKey("price");
        this.setNtaxnetpriceKey("local_taxprice");
        this.setNnetpriceKey("local_price");
        this.setNqtunitnumKey("postquantity");
        this.setNqtorigpriceKey("postpricenotax");
        this.setNqtorigtaxpriceKey("postprice");
        this.setNtaxmnyKey("local_money_cr");
        this.setNmnyKey("local_notax_cr");
        this.setNtaxKey("local_tax_cr");
        this.setNexchangerateKey("rate");
        this.setCorigcurrencyidKey("pk_currtype");
        this.setNglobaltaxmnyKey("globalcrebit");
        this.setNglobalmnyKey("globalnotax_cre");
        this.setNglobalexchgrateKey("globalrate");
        this.setNgroupmnyKey("groupnotax_cre");
        this.setNgrouptaxmnyKey("groupcrebit");
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

