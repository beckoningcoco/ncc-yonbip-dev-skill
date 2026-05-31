/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.IVOMeta
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pub.lang.UFDateTime
 *  nc.vo.pub.lang.UFDouble
 *  nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory
 */
package nc.vo.arap.tally;

import nc.vo.pub.IVOMeta;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory;

public class TallyAgrVO
extends SuperVO {
    private static final long serialVersionUID = 1L;
    private String pk_tally;
    private String pk_tally_agr;
    private String pk_group;
    private String pk_org;
    private String pk_org_v;
    private UFDate tallydate;
    private UFDate expiredate;
    private UFDate inner_effect_date;
    private String pk_bill;
    private String pk_item;
    private String pk_termitem;
    private String pk_dealnum;
    private String pk_busidata;
    private UFDouble quantity_de;
    private UFDouble money_de;
    private UFDouble local_money_de;
    private UFDouble grouplocal_money_de;
    private UFDouble globallocal_money_de;
    private UFDouble quantity_cr;
    private UFDouble money_cr;
    private UFDouble local_money_cr;
    private UFDouble grouplocal_money_cr;
    private UFDouble globallocal_money_cr;
    private UFDouble deal_quantity;
    private UFDouble deal_money;
    private UFDouble deal_local_money;
    private UFDouble deal_grouplocal_money;
    private UFDouble deal_globallocal_money;
    private Integer dr = 0;
    private UFDateTime ts;
    public static final String PK_TALLY = "pk_tally";
    public static final String PK_TALLY_AGR = "pk_tally_agr";
    public static final String PK_GROUP = "pk_group";
    public static final String PK_ORG = "pk_org";
    public static final String PK_ORG_V = "pk_org_v";
    public static final String TALLYDATE = "tallydate";
    public static final String EXPIREDATE = "expiredate";
    public static final String INNER_EFFECT_DATE = "inner_effect_date";
    public static final String PK_BILL = "pk_bill";
    public static final String PK_ITEM = "pk_item";
    public static final String PK_TERMITEM = "pk_termitem";
    public static final String PK_DEALNUM = "pk_dealnum";
    public static final String PK_BUSIDATA = "pk_busidata";
    public static final String QUANTITY_DE = "quantity_de";
    public static final String MONEY_DE = "money_de";
    public static final String LOCAL_MONEY_DE = "local_money_de";
    public static final String GROUPLOCAL_MONEY_DE = "grouplocal_money_de";
    public static final String GLOBALLOCAL_MONEY_DE = "globallocal_money_de";
    public static final String QUANTITY_CR = "quantity_cr";
    public static final String MONEY_CR = "money_cr";
    public static final String LOCAL_MONEY_CR = "local_money_cr";
    public static final String GROUPLOCAL_MONEY_CR = "grouplocal_money_cr";
    public static final String GLOBALLOCAL_MONEY_CR = "globallocal_money_cr";
    public static final String DEAL_QUANTITY = "deal_quantity";
    public static final String DEAL_MONEY = "deal_money";
    public static final String DEAL_LOCAL_MONEY = "deal_local_money";
    public static final String DEAL_GROUPLOCAL_MONEY = "deal_grouplocal_money";
    public static final String DEAL_GLOBALLOCAL_MONEY = "deal_globallocal_money";

    public String getPk_tally() {
        return this.pk_tally;
    }

    public void setPk_tally(String newPk_tally) {
        this.pk_tally = newPk_tally;
    }

    public String getPk_tally_agr() {
        return this.pk_tally_agr;
    }

    public void setPk_tally_agr(String newPk_tally_agr) {
        this.pk_tally_agr = newPk_tally_agr;
    }

    public String getPk_group() {
        return this.pk_group;
    }

    public void setPk_group(String newPk_group) {
        this.pk_group = newPk_group;
    }

    public String getPk_org() {
        return this.pk_org;
    }

    public void setPk_org(String newPk_org) {
        this.pk_org = newPk_org;
    }

    public String getPk_org_v() {
        return this.pk_org_v;
    }

    public void setPk_org_v(String newPk_org_v) {
        this.pk_org_v = newPk_org_v;
    }

    public UFDate getTallydate() {
        return this.tallydate;
    }

    public void setTallydate(UFDate newTallydate) {
        this.tallydate = newTallydate;
    }

    public UFDate getExpiredate() {
        return this.expiredate;
    }

    public void setExpiredate(UFDate newExpiredate) {
        this.expiredate = newExpiredate;
    }

    public UFDate getInner_effect_date() {
        return this.inner_effect_date;
    }

    public void setInner_effect_date(UFDate newInner_effect_date) {
        this.inner_effect_date = newInner_effect_date;
    }

    public String getPk_bill() {
        return this.pk_bill;
    }

    public void setPk_bill(String newPk_bill) {
        this.pk_bill = newPk_bill;
    }

    public String getPk_item() {
        return this.pk_item;
    }

    public void setPk_item(String newPk_item) {
        this.pk_item = newPk_item;
    }

    public String getPk_termitem() {
        return this.pk_termitem;
    }

    public void setPk_termitem(String newPk_termitem) {
        this.pk_termitem = newPk_termitem;
    }

    public String getPk_dealnum() {
        return this.pk_dealnum;
    }

    public void setPk_dealnum(String newPk_dealnum) {
        this.pk_dealnum = newPk_dealnum;
    }

    public String getPk_busidata() {
        return this.pk_busidata;
    }

    public void setPk_busidata(String pkBusidata) {
        this.pk_busidata = pkBusidata;
    }

    public UFDouble getQuantity_de() {
        return this.quantity_de;
    }

    public void setQuantity_de(UFDouble newQuantity_de) {
        this.quantity_de = newQuantity_de;
    }

    public UFDouble getMoney_de() {
        return this.money_de;
    }

    public void setMoney_de(UFDouble newMoney_de) {
        this.money_de = newMoney_de;
    }

    public UFDouble getLocal_money_de() {
        return this.local_money_de;
    }

    public void setLocal_money_de(UFDouble newLocal_money_de) {
        this.local_money_de = newLocal_money_de;
    }

    public UFDouble getGrouplocal_money_de() {
        return this.grouplocal_money_de;
    }

    public void setGrouplocal_money_de(UFDouble newGrouplocal_money_de) {
        this.grouplocal_money_de = newGrouplocal_money_de;
    }

    public UFDouble getGloballocal_money_de() {
        return this.globallocal_money_de;
    }

    public void setGloballocal_money_de(UFDouble newGloballocal_money_de) {
        this.globallocal_money_de = newGloballocal_money_de;
    }

    public UFDouble getQuantity_cr() {
        return this.quantity_cr;
    }

    public void setQuantity_cr(UFDouble newQuantity_cr) {
        this.quantity_cr = newQuantity_cr;
    }

    public UFDouble getMoney_cr() {
        return this.money_cr;
    }

    public void setMoney_cr(UFDouble newMoney_cr) {
        this.money_cr = newMoney_cr;
    }

    public UFDouble getLocal_money_cr() {
        return this.local_money_cr;
    }

    public void setLocal_money_cr(UFDouble newLocal_money_cr) {
        this.local_money_cr = newLocal_money_cr;
    }

    public UFDouble getGrouplocal_money_cr() {
        return this.grouplocal_money_cr;
    }

    public void setGrouplocal_money_cr(UFDouble newGrouplocal_money_cr) {
        this.grouplocal_money_cr = newGrouplocal_money_cr;
    }

    public UFDouble getGloballocal_money_cr() {
        return this.globallocal_money_cr;
    }

    public void setGloballocal_money_cr(UFDouble newGloballocal_money_cr) {
        this.globallocal_money_cr = newGloballocal_money_cr;
    }

    public UFDouble getDeal_quantity() {
        return this.deal_quantity;
    }

    public void setDeal_quantity(UFDouble dealQuantity) {
        this.deal_quantity = dealQuantity;
    }

    public UFDouble getDeal_money() {
        return this.deal_money;
    }

    public void setDeal_money(UFDouble dealMoney) {
        this.deal_money = dealMoney;
    }

    public UFDouble getDeal_local_money() {
        return this.deal_local_money;
    }

    public void setDeal_local_money(UFDouble dealLocalMoney) {
        this.deal_local_money = dealLocalMoney;
    }

    public UFDouble getDeal_grouplocal_money() {
        return this.deal_grouplocal_money;
    }

    public void setDeal_grouplocal_money(UFDouble dealGrouplocalMoney) {
        this.deal_grouplocal_money = dealGrouplocalMoney;
    }

    public UFDouble getDeal_globallocal_money() {
        return this.deal_globallocal_money;
    }

    public void setDeal_globallocal_money(UFDouble dealGloballocalMoney) {
        this.deal_globallocal_money = dealGloballocalMoney;
    }

    public Integer getDr() {
        return this.dr;
    }

    public void setDr(Integer newDr) {
        this.dr = newDr;
    }

    public UFDateTime getTs() {
        return this.ts;
    }

    public void setTs(UFDateTime newTs) {
        this.ts = newTs;
    }

    public String getParentPKFieldName() {
        return PK_TALLY;
    }

    public String getPKFieldName() {
        return PK_TALLY_AGR;
    }

    public String getTableName() {
        return "arap_tally_agr";
    }

    public static String getDefaultTableName() {
        return "arap_tally_agr";
    }

    public IVOMeta getMetaData() {
        return VOMetaFactory.getInstance().getVOMeta("arap.arap_tally_agr");
    }
}

