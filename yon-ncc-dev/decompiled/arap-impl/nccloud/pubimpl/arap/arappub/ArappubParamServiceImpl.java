/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.itf.arap.goldentax.IGoldTaxFormatService
 *  nc.vo.arap.goldentax.GoldTaxFormat
 *  nc.vo.arap.goldentax.GoldTaxFormatVO
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFBoolean
 *  nccloud.commons.lang.ArrayUtils
 *  nccloud.dto.arap.arappub.info.BusiParamResultDTO
 *  nccloud.pubitf.arap.arappub.IArappubParamService
 */
package nccloud.pubimpl.arap.arappub;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import nc.bs.arap.util.ObtHeadAndBodyAttrInfoUtils;
import nc.bs.framework.common.NCLocator;
import nc.itf.arap.goldentax.IGoldTaxFormatService;
import nc.vo.arap.goldentax.GoldTaxFormat;
import nc.vo.arap.goldentax.GoldTaxFormatVO;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFBoolean;
import nccloud.commons.lang.ArrayUtils;
import nccloud.dto.arap.arappub.info.BusiParamResultDTO;
import nccloud.pubitf.arap.arappub.IArappubParamService;

public class ArappubParamServiceImpl
implements IArappubParamService {
    public Object[] qryAR52(String pk_group, String paramcode) throws BusinessException {
        Object[] obj = new Object[2];
        if ("AR52".equals(paramcode)) {
            HashMap<String, List> map_head = new HashMap<String, List>();
            HashMap<String, List> map_body = new HashMap<String, List>();
            List<BusiParamResultDTO> all_head = new ArrayList<BusiParamResultDTO>();
            List<BusiParamResultDTO> all_body = new ArrayList<BusiParamResultDTO>();
            ArrayList<BusiParamResultDTO> sel_head = new ArrayList<BusiParamResultDTO>();
            ArrayList<BusiParamResultDTO> sel_body = new ArrayList<BusiParamResultDTO>();
            IGoldTaxFormatService lookup = (IGoldTaxFormatService)NCLocator.getInstance().lookup(IGoldTaxFormatService.class);
            GoldTaxFormatVO[] formatVos = lookup.queryGoldTaxFormat(pk_group);
            GoldTaxFormat goldTaxFormat = null;
            goldTaxFormat = formatVos == null || formatVos.length == 0 ? new GoldTaxFormat() : new GoldTaxFormat(formatVos);
            all_head = this.getAllHeads(all_head);
            map_head.put("allchoices", all_head);
            all_body = this.getAllBodys(all_body);
            map_body.put("allchoices", all_body);
            ArrayList list = new ArrayList();
            Collections.addAll(list, goldTaxFormat.getHeadSelectedVOs());
            Collections.addAll(list, goldTaxFormat.getBodySelectedVOs());
            Object[] headAndBodys = this.getSelectHeadAndBodys(list.toArray(new GoldTaxFormatVO[0]), sel_head, sel_body);
            map_head.put("selected", (List)headAndBodys[0]);
            map_body.put("selected", (List)headAndBodys[1]);
            obj[0] = map_head;
            obj[1] = map_body;
        }
        return obj;
    }

    public Object[] getSelectHeadAndBodys(GoldTaxFormatVO[] formatVos, List<BusiParamResultDTO> sel_head, List<BusiParamResultDTO> sel_body) {
        Object[] obj = new Object[2];
        BusiParamResultDTO[] retvo = new BusiParamResultDTO[formatVos.length];
        for (int i = 0; i < formatVos.length; ++i) {
            if (formatVos[i].getIsHead()) {
                if (!formatVos[i].getIsSelected()) continue;
                retvo[i] = new BusiParamResultDTO();
                retvo[i].setCode(formatVos[i].getCode());
                retvo[i].setName(formatVos[i].getName());
                sel_head.add(retvo[i]);
                continue;
            }
            if (!formatVos[i].getIsSelected()) continue;
            retvo[i] = new BusiParamResultDTO();
            retvo[i].setCode(formatVos[i].getCode());
            retvo[i].setName(formatVos[i].getName());
            sel_body.add(retvo[i]);
        }
        obj[0] = sel_head;
        obj[1] = sel_body;
        return obj;
    }

    public List<BusiParamResultDTO> getAllHeads(List<BusiParamResultDTO> all_head) {
        BusiParamResultDTO head_1 = new BusiParamResultDTO();
        head_1.setCode("bodynum");
        head_1.setName(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax087"));
        head_1.setIsdefault(UFBoolean.TRUE);
        BusiParamResultDTO head_2 = new BusiParamResultDTO();
        head_2.setCode("customername");
        head_2.setName(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax047"));
        head_2.setIsdefault(UFBoolean.TRUE);
        BusiParamResultDTO head_3 = new BusiParamResultDTO();
        head_3.setCode("saleaddrphone");
        head_3.setName(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax025"));
        head_3.setIsdefault(UFBoolean.TRUE);
        BusiParamResultDTO head_4 = new BusiParamResultDTO();
        head_4.setCode("account");
        head_4.setName(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax077"));
        head_4.setIsdefault(UFBoolean.TRUE);
        BusiParamResultDTO head_5 = new BusiParamResultDTO();
        head_5.setCode("bankname");
        head_5.setName(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax065"));
        head_5.setIsdefault(UFBoolean.TRUE);
        BusiParamResultDTO head_6 = new BusiParamResultDTO();
        head_6.setCode("memo");
        head_6.setName(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax059"));
        head_6.setIsdefault(UFBoolean.TRUE);
        BusiParamResultDTO head_7 = new BusiParamResultDTO();
        head_7.setCode("checker");
        head_7.setName(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax084"));
        head_7.setIsdefault(UFBoolean.TRUE);
        BusiParamResultDTO head_8 = new BusiParamResultDTO();
        head_8.setCode("payee");
        head_8.setName(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax048"));
        head_8.setIsdefault(UFBoolean.TRUE);
        BusiParamResultDTO head_9 = new BusiParamResultDTO();
        head_9.setCode("rowinvname");
        head_9.setName(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax049"));
        head_9.setIsdefault(UFBoolean.TRUE);
        BusiParamResultDTO head_10 = new BusiParamResultDTO();
        head_10.setCode("billdate");
        head_10.setName(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax033"));
        head_10.setIsdefault(UFBoolean.TRUE);
        BusiParamResultDTO head_11 = new BusiParamResultDTO();
        head_11.setCode("sellaccount");
        head_11.setName(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax050"));
        head_11.setIsdefault(UFBoolean.TRUE);
        BusiParamResultDTO head_12 = new BusiParamResultDTO();
        head_12.setCode("taxbillno");
        head_12.setName(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax066"));
        head_12.setIsdefault(UFBoolean.TRUE);
        BusiParamResultDTO head_14 = new BusiParamResultDTO();
        head_14.setCode("vdef1");
        head_14.setName(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax078"));
        head_14.setIsdefault(UFBoolean.FALSE);
        BusiParamResultDTO head_15 = new BusiParamResultDTO();
        head_15.setCode("vdef2");
        head_15.setName(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax034"));
        head_15.setIsdefault(UFBoolean.FALSE);
        BusiParamResultDTO head_16 = new BusiParamResultDTO();
        head_16.setCode("vdef3");
        head_16.setName(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax039"));
        head_16.setIsdefault(UFBoolean.FALSE);
        BusiParamResultDTO head_17 = new BusiParamResultDTO();
        head_17.setCode("vdef4");
        head_17.setName(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax040"));
        head_17.setIsdefault(UFBoolean.FALSE);
        BusiParamResultDTO head_18 = new BusiParamResultDTO();
        head_18.setCode("vdef5");
        head_18.setName(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax079"));
        head_18.setIsdefault(UFBoolean.FALSE);
        BusiParamResultDTO head_19 = new BusiParamResultDTO();
        head_19.setCode("vdef6");
        head_19.setName(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax070"));
        head_19.setIsdefault(UFBoolean.FALSE);
        BusiParamResultDTO head_20 = new BusiParamResultDTO();
        head_20.setCode("vdef7");
        head_20.setName(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax067"));
        head_20.setIsdefault(UFBoolean.FALSE);
        BusiParamResultDTO head_21 = new BusiParamResultDTO();
        head_21.setCode("vdef8");
        head_21.setName(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax068"));
        head_21.setIsdefault(UFBoolean.FALSE);
        BusiParamResultDTO head_22 = new BusiParamResultDTO();
        head_22.setCode("vdef9");
        head_22.setName(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax051"));
        head_22.setIsdefault(UFBoolean.FALSE);
        BusiParamResultDTO head_23 = new BusiParamResultDTO();
        head_23.setCode("vdef10");
        head_23.setName(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax071"));
        head_23.setIsdefault(UFBoolean.FALSE);
        BusiParamResultDTO head_24 = new BusiParamResultDTO();
        head_24.setCode("vdef11");
        head_24.setName(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax080"));
        head_24.setIsdefault(UFBoolean.FALSE);
        BusiParamResultDTO head_25 = new BusiParamResultDTO();
        head_25.setCode("vdef12");
        head_25.setName(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax052"));
        head_25.setIsdefault(UFBoolean.FALSE);
        BusiParamResultDTO head_26 = new BusiParamResultDTO();
        head_26.setCode("vdef13");
        head_26.setName(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax072"));
        head_26.setIsdefault(UFBoolean.FALSE);
        BusiParamResultDTO head_27 = new BusiParamResultDTO();
        head_27.setCode("vdef14");
        head_27.setName(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax061"));
        head_27.setIsdefault(UFBoolean.FALSE);
        BusiParamResultDTO head_28 = new BusiParamResultDTO();
        head_28.setCode("vdef15");
        head_28.setName(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax073"));
        head_28.setIsdefault(UFBoolean.FALSE);
        BusiParamResultDTO head_29 = new BusiParamResultDTO();
        head_29.setCode("vdef16");
        head_29.setName(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax081"));
        head_29.setIsdefault(UFBoolean.FALSE);
        BusiParamResultDTO head_30 = new BusiParamResultDTO();
        head_30.setCode("vdef17");
        head_30.setName(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax062"));
        head_30.setIsdefault(UFBoolean.FALSE);
        BusiParamResultDTO head_31 = new BusiParamResultDTO();
        head_31.setCode("vdef18");
        head_31.setName(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax085"));
        head_31.setIsdefault(UFBoolean.FALSE);
        BusiParamResultDTO head_32 = new BusiParamResultDTO();
        head_32.setCode("vdef19");
        head_32.setName(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax053"));
        head_32.setIsdefault(UFBoolean.FALSE);
        BusiParamResultDTO head_33 = new BusiParamResultDTO();
        head_33.setCode("vdef20");
        head_33.setName(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax086"));
        head_33.setIsdefault(UFBoolean.FALSE);
        all_head.add(head_1);
        all_head.add(head_2);
        all_head.add(head_3);
        all_head.add(head_4);
        all_head.add(head_5);
        all_head.add(head_6);
        all_head.add(head_7);
        all_head.add(head_8);
        all_head.add(head_9);
        all_head.add(head_10);
        all_head.add(head_11);
        all_head.add(head_12);
        all_head.add(head_14);
        all_head.add(head_15);
        all_head.add(head_16);
        all_head.add(head_17);
        all_head.add(head_18);
        all_head.add(head_19);
        all_head.add(head_20);
        all_head.add(head_21);
        all_head.add(head_22);
        all_head.add(head_23);
        all_head.add(head_24);
        all_head.add(head_25);
        all_head.add(head_26);
        all_head.add(head_27);
        all_head.add(head_28);
        all_head.add(head_29);
        all_head.add(head_30);
        all_head.add(head_31);
        all_head.add(head_32);
        all_head.add(head_33);
        return all_head;
    }

    public List<BusiParamResultDTO> getAllBodys(List<BusiParamResultDTO> all_body) {
        BusiParamResultDTO body_1 = new BusiParamResultDTO();
        body_1.setCode("invname");
        body_1.setName(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax089"));
        body_1.setIsdefault(UFBoolean.TRUE);
        BusiParamResultDTO body_2 = new BusiParamResultDTO();
        body_2.setCode("quoteunitname");
        body_2.setName(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax063"));
        body_2.setIsdefault(UFBoolean.TRUE);
        BusiParamResultDTO body_3 = new BusiParamResultDTO();
        body_3.setCode("invspec");
        body_3.setName(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax055"));
        body_3.setIsdefault(UFBoolean.TRUE);
        BusiParamResultDTO body_4 = new BusiParamResultDTO();
        body_4.setCode("quentity");
        body_4.setName(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax082"));
        body_4.setIsdefault(UFBoolean.TRUE);
        BusiParamResultDTO body_5 = new BusiParamResultDTO();
        body_5.setCode("taxrate");
        body_5.setName(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax043"));
        body_5.setIsdefault(UFBoolean.TRUE);
        BusiParamResultDTO body_6 = new BusiParamResultDTO();
        body_6.setCode("taxitems");
        body_6.setName(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax044"));
        body_6.setIsdefault(UFBoolean.TRUE);
        BusiParamResultDTO body_7 = new BusiParamResultDTO();
        body_7.setCode("discountmny");
        body_7.setName(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax057"));
        body_7.setIsdefault(UFBoolean.TRUE);
        BusiParamResultDTO body_8 = new BusiParamResultDTO();
        body_8.setCode("taxmny");
        body_8.setName(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax036"));
        body_8.setIsdefault(UFBoolean.TRUE);
        BusiParamResultDTO body_9 = new BusiParamResultDTO();
        body_9.setCode("discounttaxmny");
        body_9.setName(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax058"));
        body_9.setIsdefault(UFBoolean.TRUE);
        BusiParamResultDTO body_10 = new BusiParamResultDTO();
        body_10.setCode("discountrate");
        body_10.setName(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax037"));
        body_10.setIsdefault(UFBoolean.TRUE);
        BusiParamResultDTO body_11 = new BusiParamResultDTO();
        body_11.setCode("pricemode");
        body_11.setName(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax064"));
        body_11.setIsdefault(UFBoolean.TRUE);
        BusiParamResultDTO body_12 = new BusiParamResultDTO();
        body_12.setCode("invclassname");
        body_12.setName(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax045"));
        body_12.setIsdefault(UFBoolean.TRUE);
        BusiParamResultDTO body_13 = new BusiParamResultDTO();
        body_13.setCode("notaxmny");
        body_13.setName(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax035"));
        body_13.setIsdefault(UFBoolean.TRUE);
        BusiParamResultDTO body_14 = new BusiParamResultDTO();
        body_14.setCode("notaxprice");
        body_14.setName(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax054"));
        body_14.setIsdefault(UFBoolean.TRUE);
        BusiParamResultDTO body_15 = new BusiParamResultDTO();
        body_15.setCode("vdef1");
        body_15.setName(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax078"));
        body_15.setIsdefault(UFBoolean.FALSE);
        BusiParamResultDTO body_16 = new BusiParamResultDTO();
        body_16.setCode("vdef2");
        body_16.setName(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax034"));
        body_16.setIsdefault(UFBoolean.FALSE);
        BusiParamResultDTO body_17 = new BusiParamResultDTO();
        body_17.setCode("vdef3");
        body_17.setName(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax039"));
        body_17.setIsdefault(UFBoolean.FALSE);
        BusiParamResultDTO body_18 = new BusiParamResultDTO();
        body_18.setCode("vdef4");
        body_18.setName(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax040"));
        body_18.setIsdefault(UFBoolean.FALSE);
        BusiParamResultDTO body_19 = new BusiParamResultDTO();
        body_19.setCode("vdef5");
        body_19.setName(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax079"));
        body_19.setIsdefault(UFBoolean.FALSE);
        BusiParamResultDTO body_20 = new BusiParamResultDTO();
        body_20.setCode("vdef6");
        body_20.setName(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax070"));
        body_20.setIsdefault(UFBoolean.FALSE);
        BusiParamResultDTO body_21 = new BusiParamResultDTO();
        body_21.setCode("vdef7");
        body_21.setName(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax067"));
        body_21.setIsdefault(UFBoolean.FALSE);
        BusiParamResultDTO body_22 = new BusiParamResultDTO();
        body_22.setCode("vdef8");
        body_22.setName(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax068"));
        body_22.setIsdefault(UFBoolean.FALSE);
        BusiParamResultDTO body_23 = new BusiParamResultDTO();
        body_23.setCode("vdef9");
        body_23.setName(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax051"));
        body_23.setIsdefault(UFBoolean.FALSE);
        BusiParamResultDTO body_24 = new BusiParamResultDTO();
        body_24.setCode("vdef10");
        body_24.setName(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax071"));
        body_24.setIsdefault(UFBoolean.FALSE);
        BusiParamResultDTO body_25 = new BusiParamResultDTO();
        body_25.setCode("vdef11");
        body_25.setName(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax080"));
        body_25.setIsdefault(UFBoolean.FALSE);
        BusiParamResultDTO body_26 = new BusiParamResultDTO();
        body_26.setCode("vdef12");
        body_26.setName(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax052"));
        body_26.setIsdefault(UFBoolean.FALSE);
        BusiParamResultDTO body_27 = new BusiParamResultDTO();
        body_27.setCode("vdef13");
        body_27.setName(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax072"));
        body_27.setIsdefault(UFBoolean.FALSE);
        BusiParamResultDTO body_28 = new BusiParamResultDTO();
        body_28.setCode("vdef14");
        body_28.setName(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax061"));
        body_28.setIsdefault(UFBoolean.FALSE);
        BusiParamResultDTO body_29 = new BusiParamResultDTO();
        body_29.setCode("vdef15");
        body_29.setName(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax073"));
        body_29.setIsdefault(UFBoolean.FALSE);
        BusiParamResultDTO body_30 = new BusiParamResultDTO();
        body_30.setCode("vdef16");
        body_30.setName(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax081"));
        body_30.setIsdefault(UFBoolean.FALSE);
        BusiParamResultDTO body_31 = new BusiParamResultDTO();
        body_31.setCode("vdef17");
        body_31.setName(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax062"));
        body_31.setIsdefault(UFBoolean.FALSE);
        BusiParamResultDTO body_32 = new BusiParamResultDTO();
        body_32.setCode("vdef18");
        body_32.setName(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax085"));
        body_32.setIsdefault(UFBoolean.FALSE);
        BusiParamResultDTO body_33 = new BusiParamResultDTO();
        body_33.setCode("vdef19");
        body_33.setName(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax053"));
        body_33.setIsdefault(UFBoolean.FALSE);
        BusiParamResultDTO body_34 = new BusiParamResultDTO();
        body_34.setCode("vdef20");
        body_34.setName(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006goldentax", "goldentax086"));
        body_34.setIsdefault(UFBoolean.FALSE);
        all_body.add(body_1);
        all_body.add(body_2);
        all_body.add(body_3);
        all_body.add(body_4);
        all_body.add(body_5);
        all_body.add(body_6);
        all_body.add(body_7);
        all_body.add(body_8);
        all_body.add(body_9);
        all_body.add(body_10);
        all_body.add(body_11);
        all_body.add(body_12);
        all_body.add(body_13);
        all_body.add(body_14);
        all_body.add(body_15);
        all_body.add(body_16);
        all_body.add(body_17);
        all_body.add(body_18);
        all_body.add(body_19);
        all_body.add(body_20);
        all_body.add(body_21);
        all_body.add(body_22);
        all_body.add(body_23);
        all_body.add(body_24);
        all_body.add(body_25);
        all_body.add(body_26);
        all_body.add(body_27);
        all_body.add(body_28);
        all_body.add(body_29);
        all_body.add(body_30);
        all_body.add(body_31);
        all_body.add(body_32);
        all_body.add(body_33);
        all_body.add(body_34);
        return all_body;
    }

    public void saveAR52(String pk_group, String paramcode, String[] headSel, String[] bodySel) throws BusinessException {
        IGoldTaxFormatService lookup = (IGoldTaxFormatService)NCLocator.getInstance().lookup(IGoldTaxFormatService.class);
        GoldTaxFormatVO[] formatVos = lookup.queryGoldTaxFormat(pk_group);
        if (null != formatVos && formatVos.length != 0) {
            for (GoldTaxFormatVO format : formatVos) {
                String code = format.getCode();
                if (format.getIsHead()) {
                    if (ArrayUtils.contains((Object[])headSel, (Object)code)) {
                        format.setPk_org(pk_group);
                        format.setIsSelected(true);
                        continue;
                    }
                    format.setPk_org(pk_group);
                    format.setIsSelected(false);
                    continue;
                }
                if (ArrayUtils.contains((Object[])bodySel, (Object)code)) {
                    format.setPk_org(pk_group);
                    format.setIsSelected(true);
                    continue;
                }
                format.setPk_org(pk_group);
                format.setIsSelected(false);
            }
        } else {
            TreeSet<String> headAttSet = new TreeSet<String>();
            TreeSet<String> bodyAttSet = new TreeSet<String>();
            if (!ArrayUtils.isEmpty((Object[])headSel)) {
                for (String head : headSel) {
                    headAttSet.add(head);
                }
            }
            if (!ArrayUtils.isEmpty((Object[])bodySel)) {
                for (String body : bodySel) {
                    bodyAttSet.add(body);
                }
            }
            ObtHeadAndBodyAttrInfoUtils util = new ObtHeadAndBodyAttrInfoUtils();
            Map<String, Object> lanMap = util.getLanMap();
            Map headLangMap = (Map)lanMap.get("headLang");
            Map bodyLangMap = (Map)lanMap.get("bodyLang");
            List<String> allheads = util.getAllheadattrs();
            List<String> allbodys = util.getAllbodyattrs();
            ArrayList<Object> voList = new ArrayList<Object>();
            ArrayList<GoldTaxFormatVO> headSelList = new ArrayList<GoldTaxFormatVO>();
            ArrayList<GoldTaxFormatVO> bodySelList = new ArrayList<GoldTaxFormatVO>();
            Map<String, List<GoldTaxFormatVO>> unSelHeadAndBody = util.getUnSelHeadAndBody(allheads, allbodys, headAttSet, bodyAttSet, headLangMap, bodyLangMap, pk_group);
            List<GoldTaxFormatVO> headUnSelList = unSelHeadAndBody.get("unselhead");
            List<GoldTaxFormatVO> bodyUnSelList = unSelHeadAndBody.get("unselbdoy");
            if (null != headSel && headSel.length > 0) {
                for (int i = 0; i < headSel.length; ++i) {
                    GoldTaxFormatVO headFormat = new GoldTaxFormatVO();
                    headFormat.setPk_org(pk_group);
                    headFormat.setIsSelected(true);
                    headFormat.setCode(headSel[i]);
                    headFormat.setShowOrder(Integer.valueOf(i + 1));
                    headFormat.setIsHead(true);
                    headFormat.setName((String)headLangMap.get(headSel[i]));
                    headSelList.add(headFormat);
                }
            }
            if (null != bodySel && bodySel.length > 0) {
                for (int j = 0; j < bodySel.length; ++j) {
                    GoldTaxFormatVO bodyFormat = new GoldTaxFormatVO();
                    bodyFormat.setPk_org(pk_group);
                    bodyFormat.setIsSelected(true);
                    bodyFormat.setCode(bodySel[j]);
                    bodyFormat.setShowOrder(Integer.valueOf(j + 1));
                    bodyFormat.setIsHead(false);
                    bodyFormat.setName((String)bodyLangMap.get(bodySel[j]));
                    bodySelList.add(bodyFormat);
                }
            }
            voList.addAll(headUnSelList);
            voList.addAll(bodyUnSelList);
            voList.addAll(headSelList);
            voList.addAll(bodySelList);
            formatVos = voList.toArray(new GoldTaxFormatVO[0]);
        }
        lookup.saveGoldTaxFormat(pk_group, formatVos);
    }
}

