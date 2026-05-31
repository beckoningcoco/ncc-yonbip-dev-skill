/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.logging.Logger
 *  nc.vo.pub.SuperVO
 */
package nc.vo.arap.goldentax;

import java.util.ArrayList;
import nc.bs.framework.common.NCLocator;
import nc.bs.logging.Logger;
import nc.itf.arap.goldentax.IGoldTaxFormatService;
import nc.vo.arap.goldentax.GoldTaxFormat;
import nc.vo.arap.goldentax.GoldTaxFormatVO;
import nc.vo.arap.goldentax.GoldTaxHeadVO;
import nc.vo.pub.SuperVO;

public class GoldVoExportStringTransfer {
    private GoldTaxFormat goldTaxFormat;
    private String pk_org;

    public GoldVoExportStringTransfer(String pk_org) {
        this.pk_org = pk_org;
        this.initFormatVO();
    }

    private static String getString(Object o) {
        return null == o ? " " : o.toString();
    }

    public String[] getBodyString(SuperVO bodyVO) {
        ArrayList<String> stringList = new ArrayList<String>();
        for (GoldTaxFormatVO formatVO : this.goldTaxFormat.getBodySelectedVOs()) {
            String attributeName = formatVO.getCode();
            String stringSnippet = GoldVoExportStringTransfer.getString(bodyVO.getAttributeValue(attributeName));
            stringList.add(stringSnippet);
        }
        return stringList.toArray(new String[stringList.size()]);
    }

    public String[] getHeadString(SuperVO headVO) {
        ArrayList<String> stringList = new ArrayList<String>();
        stringList.add(((GoldTaxHeadVO)headVO).getCode());
        for (GoldTaxFormatVO formatVO : this.goldTaxFormat.getHeadSelectedVOs()) {
            String attributeName = formatVO.getCode();
            if ("saleaddrphone".equals(attributeName)) {
                String saleaddr = GoldVoExportStringTransfer.getString(headVO.getAttributeValue("saleaddr"));
                String salephone = GoldVoExportStringTransfer.getString(headVO.getAttributeValue("salephone"));
                stringList.add(saleaddr + salephone);
                continue;
            }
            String stringSnippet = GoldVoExportStringTransfer.getString(headVO.getAttributeValue(attributeName));
            stringList.add(stringSnippet);
        }
        return stringList.toArray(new String[stringList.size()]);
    }

    public GoldTaxHeadVO getHeadVO(String[] content) {
        GoldTaxHeadVO headVO = new GoldTaxHeadVO();
        headVO.setCode(content[0]);
        headVO.setTaxbillno(content[content.length - 1]);
        return headVO;
    }

    private void initFormatVO() {
        IGoldTaxFormatService goldTaxFormatService = (IGoldTaxFormatService)NCLocator.getInstance().lookup(IGoldTaxFormatService.class);
        try {
            GoldTaxFormatVO[] formatVos = goldTaxFormatService.queryGoldTaxFormat(this.pk_org);
            this.goldTaxFormat = formatVos == null || formatVos.length == 0 ? new GoldTaxFormat() : new GoldTaxFormat(formatVos);
        }
        catch (Exception e) {
            Logger.error((Object)e);
        }
    }
}

