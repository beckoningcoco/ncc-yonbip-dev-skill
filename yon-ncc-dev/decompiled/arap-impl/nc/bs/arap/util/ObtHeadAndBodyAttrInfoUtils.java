/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.arap.goldentax.GoldTaxFormatVO
 *  nc.vo.ml.NCLangRes4VoTransl
 */
package nc.bs.arap.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import nc.vo.arap.goldentax.GoldTaxFormatVO;
import nc.vo.ml.NCLangRes4VoTransl;

public class ObtHeadAndBodyAttrInfoUtils {
    private List<String> allheadattrs = new ArrayList<String>();
    private List<String> allbodyattrs = new ArrayList<String>();

    public Map<String, Object> getLanMap() {
        HashMap<String, Object> map = new HashMap<String, Object>();
        HashMap<String, String> headmap = new HashMap<String, String>();
        HashMap<String, String> bodymap = new HashMap<String, String>();
        headmap.put("bodynum", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax087"));
        this.allheadattrs.add("bodynum");
        headmap.put("customername", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax047"));
        this.allheadattrs.add("customername");
        headmap.put("saleaddrphone", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax025"));
        this.allheadattrs.add("saleaddrphone");
        headmap.put("account", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax077"));
        this.allheadattrs.add("account");
        headmap.put("bankname", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax065"));
        this.allheadattrs.add("bankname");
        headmap.put("memo", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax059"));
        this.allheadattrs.add("memo");
        headmap.put("checker", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax084"));
        this.allheadattrs.add("checker");
        headmap.put("payee", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax048"));
        this.allheadattrs.add("payee");
        headmap.put("rowinvname", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax049"));
        this.allheadattrs.add("rowinvname");
        headmap.put("billdate", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax033"));
        this.allheadattrs.add("billdate");
        headmap.put("sellaccount", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax050"));
        this.allheadattrs.add("sellaccount");
        headmap.put("taxbillno", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax066"));
        this.allheadattrs.add("taxbillno");
        headmap.put("vdef1", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax078"));
        this.allheadattrs.add("vdef1");
        headmap.put("vdef2", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax034"));
        this.allheadattrs.add("vdef2");
        headmap.put("vdef3", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax039"));
        this.allheadattrs.add("vdef3");
        headmap.put("vdef4", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax040"));
        this.allheadattrs.add("vdef4");
        headmap.put("vdef5", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax079"));
        this.allheadattrs.add("vdef5");
        headmap.put("vdef6", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax070"));
        this.allheadattrs.add("vdef6");
        headmap.put("vdef7", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax067"));
        this.allheadattrs.add("vdef7");
        headmap.put("vdef8", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax068"));
        this.allheadattrs.add("vdef8");
        headmap.put("vdef9", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax051"));
        this.allheadattrs.add("vdef9");
        headmap.put("vdef10", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax071"));
        this.allheadattrs.add("vdef10");
        headmap.put("vdef11", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax080"));
        this.allheadattrs.add("vdef11");
        headmap.put("vdef12", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax052"));
        this.allheadattrs.add("vdef12");
        headmap.put("vdef13", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax072"));
        this.allheadattrs.add("vdef13");
        headmap.put("vdef14", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax061"));
        this.allheadattrs.add("vdef14");
        headmap.put("vdef15", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax073"));
        this.allheadattrs.add("vdef15");
        headmap.put("vdef16", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax081"));
        this.allheadattrs.add("vdef16");
        headmap.put("vdef17", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax062"));
        this.allheadattrs.add("vdef17");
        headmap.put("vdef18", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax085"));
        this.allheadattrs.add("vdef18");
        headmap.put("vdef19", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax053"));
        this.allheadattrs.add("vdef19");
        headmap.put("vdef20", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax086"));
        this.allheadattrs.add("vdef20");
        bodymap.put("invname", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax089"));
        this.allbodyattrs.add("invname");
        bodymap.put("quoteunitname", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax063"));
        this.allbodyattrs.add("quoteunitname");
        bodymap.put("invspec", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax055"));
        this.allbodyattrs.add("invspec");
        bodymap.put("quentity", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax082"));
        this.allbodyattrs.add("quentity");
        bodymap.put("taxrate", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax043"));
        this.allbodyattrs.add("taxrate");
        bodymap.put("taxitems", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax044"));
        this.allbodyattrs.add("taxitems");
        bodymap.put("discountmny", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax057"));
        this.allbodyattrs.add("discountmny");
        bodymap.put("taxmny", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax036"));
        this.allbodyattrs.add("taxmny");
        bodymap.put("discounttaxmny", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax058"));
        this.allbodyattrs.add("discounttaxmny");
        bodymap.put("discountrate", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax037"));
        this.allbodyattrs.add("discountrate");
        bodymap.put("pricemode", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax064"));
        this.allbodyattrs.add("pricemode");
        bodymap.put("invclassname", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax045"));
        this.allbodyattrs.add("invclassname");
        bodymap.put("notaxmny", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax035"));
        this.allbodyattrs.add("notaxmny");
        bodymap.put("notaxprice", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax054"));
        this.allbodyattrs.add("notaxprice");
        bodymap.put("vdef1", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax078"));
        this.allbodyattrs.add("vdef1");
        bodymap.put("vdef2", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax034"));
        this.allbodyattrs.add("vdef2");
        bodymap.put("vdef3", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax039"));
        this.allbodyattrs.add("vdef3");
        bodymap.put("vdef4", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax040"));
        this.allbodyattrs.add("vdef4");
        bodymap.put("vdef5", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax079"));
        this.allbodyattrs.add("vdef5");
        bodymap.put("vdef6", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax070"));
        this.allbodyattrs.add("vdef6");
        bodymap.put("vdef7", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax067"));
        this.allbodyattrs.add("vdef7");
        bodymap.put("vdef8", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax068"));
        this.allbodyattrs.add("vdef8");
        bodymap.put("vdef9", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax051"));
        this.allbodyattrs.add("vdef9");
        bodymap.put("vdef10", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax071"));
        this.allbodyattrs.add("vdef10");
        bodymap.put("vdef11", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax080"));
        this.allbodyattrs.add("vdef11");
        bodymap.put("vdef12", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax052"));
        this.allbodyattrs.add("vdef12");
        bodymap.put("vdef13", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax072"));
        this.allbodyattrs.add("vdef13");
        bodymap.put("vdef14", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax061"));
        this.allbodyattrs.add("vdef14");
        bodymap.put("vdef15", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax073"));
        this.allbodyattrs.add("vdef15");
        bodymap.put("vdef16", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax081"));
        this.allbodyattrs.add("vdef16");
        bodymap.put("vdef17", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax062"));
        this.allbodyattrs.add("vdef17");
        bodymap.put("vdef18", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax085"));
        this.allbodyattrs.add("vdef18");
        bodymap.put("vdef19", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax053"));
        this.allbodyattrs.add("vdef19");
        bodymap.put("vdef20", NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax086"));
        this.allbodyattrs.add("vdef20");
        map.put("headLang", headmap);
        map.put("bodyLang", bodymap);
        return map;
    }

    public List<String> getAllheadattrs() {
        return this.allheadattrs;
    }

    public Map<String, List<GoldTaxFormatVO>> getUnSelHeadAndBody(List<String> allheads, List<String> allbodys, Set<String> headSels, Set<String> bodySels, Map<String, String> headLangMap, Map<String, String> bodyLangMap, String pk_org) {
        HashMap<String, List<GoldTaxFormatVO>> map = new HashMap<String, List<GoldTaxFormatVO>>();
        ArrayList<GoldTaxFormatVO> unselhead = new ArrayList<GoldTaxFormatVO>();
        ArrayList<GoldTaxFormatVO> unselBody = new ArrayList<GoldTaxFormatVO>();
        int headFlg = 1;
        for (int i = 0; i < allheads.size(); ++i) {
            if (headSels.contains(allheads.get(i))) continue;
            GoldTaxFormatVO headUnSelVO = new GoldTaxFormatVO();
            headUnSelVO.setPk_org(pk_org);
            headUnSelVO.setIsSelected(false);
            headUnSelVO.setCode(allheads.get(i));
            headUnSelVO.setShowOrder(Integer.valueOf(headFlg));
            headUnSelVO.setIsHead(true);
            headUnSelVO.setName(headLangMap.get(allheads.get(i)));
            ++headFlg;
            unselhead.add(headUnSelVO);
        }
        int bodyFlg = 1;
        for (int i = 0; i < allbodys.size(); ++i) {
            if (bodySels.contains(allbodys.get(i))) continue;
            GoldTaxFormatVO bodyUnSelVO = new GoldTaxFormatVO();
            bodyUnSelVO.setPk_org(pk_org);
            bodyUnSelVO.setIsSelected(false);
            bodyUnSelVO.setCode(allbodys.get(i));
            bodyUnSelVO.setShowOrder(Integer.valueOf(bodyFlg));
            bodyUnSelVO.setIsHead(false);
            bodyUnSelVO.setName(bodyLangMap.get(allbodys.get(i)));
            ++bodyFlg;
            unselBody.add(bodyUnSelVO);
        }
        map.put("unselhead", unselhead);
        map.put("unselbdoy", unselBody);
        return map;
    }

    public void setAllheadattrs(List<String> allheadattrs) {
        this.allheadattrs = allheadattrs;
    }

    public List<String> getAllbodyattrs() {
        return this.allbodyattrs;
    }

    public void setAllbodyattrs(List<String> allbodyattrs) {
        this.allbodyattrs = allbodyattrs;
    }
}

