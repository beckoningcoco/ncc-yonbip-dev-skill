/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.ml.NCLangRes4VoTransl
 */
package nc.vo.arap.goldentax;

import java.util.ArrayList;
import java.util.List;
import nc.vo.arap.goldentax.GoldTaxFormatVO;
import nc.vo.ml.NCLangRes4VoTransl;

public class GoldTaxFormat {
    private List<GoldTaxFormatVO> goldTaxBodyFormatList;
    private List<GoldTaxFormatVO> goldTaxHeadFormatList;

    public GoldTaxFormat() {
        this.initGoldTaxHeadFormatList();
        this.initGoldTaxBodyFormatList();
    }

    public GoldTaxFormat(GoldTaxFormatVO[] goldTaxFormatVOs) {
        this.setGoldTaxFormatVOs(goldTaxFormatVOs);
    }

    public GoldTaxFormatVO[] getBodySelectedVOs() {
        ArrayList<GoldTaxFormatVO> tempList = new ArrayList<GoldTaxFormatVO>();
        for (GoldTaxFormatVO vo : this.goldTaxBodyFormatList) {
            if (!vo.getIsSelected()) continue;
            tempList.add(vo);
        }
        return tempList.toArray(new GoldTaxFormatVO[0]);
    }

    public GoldTaxFormatVO[] getBodyUnSelectedVOs() {
        ArrayList<GoldTaxFormatVO> tempList = new ArrayList<GoldTaxFormatVO>();
        for (GoldTaxFormatVO vo : this.goldTaxBodyFormatList) {
            if (vo.getIsSelected()) continue;
            tempList.add(vo);
        }
        return tempList.toArray(new GoldTaxFormatVO[0]);
    }

    public GoldTaxFormatVO[] getHeadSelectedVOs() {
        ArrayList<GoldTaxFormatVO> tempList = new ArrayList<GoldTaxFormatVO>();
        for (GoldTaxFormatVO vo : this.goldTaxHeadFormatList) {
            if (!vo.getIsSelected()) continue;
            tempList.add(vo);
        }
        return tempList.toArray(new GoldTaxFormatVO[0]);
    }

    public GoldTaxFormatVO[] getHeadUnSelectedVOs() {
        ArrayList<GoldTaxFormatVO> tempList = new ArrayList<GoldTaxFormatVO>();
        for (GoldTaxFormatVO vo : this.goldTaxHeadFormatList) {
            if (vo.getIsSelected()) continue;
            tempList.add(vo);
        }
        return tempList.toArray(new GoldTaxFormatVO[0]);
    }

    public void setGoldTaxFormatVOs(GoldTaxFormatVO[] goldTaxFormatVOs) {
        this.goldTaxHeadFormatList = new ArrayList<GoldTaxFormatVO>();
        this.goldTaxBodyFormatList = new ArrayList<GoldTaxFormatVO>();
        for (GoldTaxFormatVO vo : goldTaxFormatVOs) {
            if (vo.getIsHead()) {
                this.goldTaxHeadFormatList.add(vo);
                continue;
            }
            this.goldTaxBodyFormatList.add(vo);
        }
    }

    private void initGoldTaxBodyFormatList() {
        this.goldTaxBodyFormatList = new ArrayList<GoldTaxFormatVO>();
        this.goldTaxBodyFormatList.add(new GoldTaxFormatVO("invname", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax089"), true, false, 1));
        this.goldTaxBodyFormatList.add(new GoldTaxFormatVO("quoteunitname", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax063"), true, false, 2));
        this.goldTaxBodyFormatList.add(new GoldTaxFormatVO("invspec", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax055"), true, false, 3));
        this.goldTaxBodyFormatList.add(new GoldTaxFormatVO("quentity", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax082"), true, false, 4));
        this.goldTaxBodyFormatList.add(new GoldTaxFormatVO("taxrate", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax043"), true, false, 6));
        this.goldTaxBodyFormatList.add(new GoldTaxFormatVO("taxitems", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax044"), true, false, 7));
        this.goldTaxBodyFormatList.add(new GoldTaxFormatVO("discountmny", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax057"), true, false, 8));
        this.goldTaxBodyFormatList.add(new GoldTaxFormatVO("taxmny", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax036"), true, false, 9));
        this.goldTaxBodyFormatList.add(new GoldTaxFormatVO("discounttaxmny", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax058"), true, false, 10));
        this.goldTaxBodyFormatList.add(new GoldTaxFormatVO("discountrate", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax037"), true, false, 11));
        this.goldTaxBodyFormatList.add(new GoldTaxFormatVO("pricemode", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax064"), true, false, 13));
        this.goldTaxBodyFormatList.add(new GoldTaxFormatVO("invclassname", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax045"), true, false, 14));
        this.goldTaxBodyFormatList.add(new GoldTaxFormatVO("notaxmny", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax035"), true, false, 15));
        this.goldTaxBodyFormatList.add(new GoldTaxFormatVO("notaxprice", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax054"), true, false, 16));
        this.goldTaxBodyFormatList.add(new GoldTaxFormatVO("vdef1", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax078"), false, false, 1));
        this.goldTaxBodyFormatList.add(new GoldTaxFormatVO("vdef2", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax034"), false, false, 2));
        this.goldTaxBodyFormatList.add(new GoldTaxFormatVO("vdef3", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax039"), false, false, 3));
        this.goldTaxBodyFormatList.add(new GoldTaxFormatVO("vdef4", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax040"), false, false, 4));
        this.goldTaxBodyFormatList.add(new GoldTaxFormatVO("vdef5", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax079"), false, false, 5));
        this.goldTaxBodyFormatList.add(new GoldTaxFormatVO("vdef6", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax070"), false, false, 6));
        this.goldTaxBodyFormatList.add(new GoldTaxFormatVO("vdef7", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax067"), false, false, 7));
        this.goldTaxBodyFormatList.add(new GoldTaxFormatVO("vdef8", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax068"), false, false, 8));
        this.goldTaxBodyFormatList.add(new GoldTaxFormatVO("vdef9", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax051"), false, false, 9));
        this.goldTaxBodyFormatList.add(new GoldTaxFormatVO("vdef10", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax071"), false, false, 10));
        this.goldTaxBodyFormatList.add(new GoldTaxFormatVO("vdef11", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax080"), false, false, 11));
        this.goldTaxBodyFormatList.add(new GoldTaxFormatVO("vdef12", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax052"), false, false, 12));
        this.goldTaxBodyFormatList.add(new GoldTaxFormatVO("vdef13", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax072"), false, false, 13));
        this.goldTaxBodyFormatList.add(new GoldTaxFormatVO("vdef14", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax061"), false, false, 14));
        this.goldTaxBodyFormatList.add(new GoldTaxFormatVO("vdef15", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax073"), false, false, 15));
        this.goldTaxBodyFormatList.add(new GoldTaxFormatVO("vdef16", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax081"), false, false, 16));
        this.goldTaxBodyFormatList.add(new GoldTaxFormatVO("vdef17", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax062"), false, false, 17));
        this.goldTaxBodyFormatList.add(new GoldTaxFormatVO("vdef18", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax085"), false, false, 18));
        this.goldTaxBodyFormatList.add(new GoldTaxFormatVO("vdef19", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax053"), false, false, 19));
        this.goldTaxBodyFormatList.add(new GoldTaxFormatVO("vdef20", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax086"), false, false, 20));
    }

    private void initGoldTaxHeadFormatList() {
        this.goldTaxHeadFormatList = new ArrayList<GoldTaxFormatVO>();
        this.goldTaxHeadFormatList.add(new GoldTaxFormatVO("bodynum", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax087"), true, true, 1));
        this.goldTaxHeadFormatList.add(new GoldTaxFormatVO("customername", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax047"), true, true, 2));
        this.goldTaxHeadFormatList.add(new GoldTaxFormatVO("saleaddrphone", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax025"), true, true, 3));
        this.goldTaxHeadFormatList.add(new GoldTaxFormatVO("account", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax077"), true, true, 4));
        this.goldTaxHeadFormatList.add(new GoldTaxFormatVO("bankname", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax065"), true, true, 5));
        this.goldTaxHeadFormatList.add(new GoldTaxFormatVO("memo", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax059"), true, true, 6));
        this.goldTaxHeadFormatList.add(new GoldTaxFormatVO("checker", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax084"), true, true, 7));
        this.goldTaxHeadFormatList.add(new GoldTaxFormatVO("payee", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax048"), true, true, 8));
        this.goldTaxHeadFormatList.add(new GoldTaxFormatVO("rowinvname", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax049"), true, true, 9));
        this.goldTaxHeadFormatList.add(new GoldTaxFormatVO("billdate", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax033"), true, true, 10));
        this.goldTaxHeadFormatList.add(new GoldTaxFormatVO("sellaccount", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax050"), true, true, 11));
        this.goldTaxHeadFormatList.add(new GoldTaxFormatVO("taxbillno", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax066"), true, true, 12));
        this.goldTaxHeadFormatList.add(new GoldTaxFormatVO("vdef1", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax078"), false, true, 1));
        this.goldTaxHeadFormatList.add(new GoldTaxFormatVO("vdef2", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax034"), false, true, 2));
        this.goldTaxHeadFormatList.add(new GoldTaxFormatVO("vdef3", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax039"), false, true, 3));
        this.goldTaxHeadFormatList.add(new GoldTaxFormatVO("vdef4", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax040"), false, true, 4));
        this.goldTaxHeadFormatList.add(new GoldTaxFormatVO("vdef5", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax079"), false, true, 5));
        this.goldTaxHeadFormatList.add(new GoldTaxFormatVO("vdef6", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax070"), false, true, 6));
        this.goldTaxHeadFormatList.add(new GoldTaxFormatVO("vdef7", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax067"), false, true, 7));
        this.goldTaxHeadFormatList.add(new GoldTaxFormatVO("vdef8", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax068"), false, true, 8));
        this.goldTaxHeadFormatList.add(new GoldTaxFormatVO("vdef9", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax051"), false, true, 9));
        this.goldTaxHeadFormatList.add(new GoldTaxFormatVO("vdef10", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax071"), false, true, 10));
        this.goldTaxHeadFormatList.add(new GoldTaxFormatVO("vdef11", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax080"), false, true, 11));
        this.goldTaxHeadFormatList.add(new GoldTaxFormatVO("vdef12", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax052"), false, true, 12));
        this.goldTaxHeadFormatList.add(new GoldTaxFormatVO("vdef13", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax072"), false, true, 13));
        this.goldTaxHeadFormatList.add(new GoldTaxFormatVO("vdef14", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax061"), false, true, 14));
        this.goldTaxHeadFormatList.add(new GoldTaxFormatVO("vdef15", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax073"), false, true, 15));
        this.goldTaxHeadFormatList.add(new GoldTaxFormatVO("vdef16", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax081"), false, true, 16));
        this.goldTaxHeadFormatList.add(new GoldTaxFormatVO("vdef17", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax062"), false, true, 17));
        this.goldTaxHeadFormatList.add(new GoldTaxFormatVO("vdef18", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax085"), false, true, 18));
        this.goldTaxHeadFormatList.add(new GoldTaxFormatVO("vdef19", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax053"), false, true, 19));
        this.goldTaxHeadFormatList.add(new GoldTaxFormatVO("vdef20", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax086"), false, true, 20));
    }
}

