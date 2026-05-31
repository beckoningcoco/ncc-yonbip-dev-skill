/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.pub.util.xml;

import nc.vo.pub.util.xml.CommonClassTypeTagMap;
import nc.vo.pub.util.xml.CommonTypeMap;
import nc.vo.pub.util.xml.TTVo;

public class ComponetTypeMap
extends CommonTypeMap {
    private static Object[][] oTypeMap = new Object[][]{{String.class, "String"}, {Integer.class, "INTEGER"}, {TTVo.class, "TTVO"}, {TTVo[].class, "TTVOArray"}};
    private static Object[][] oTypeToTag = new Object[][]{{"F1", "Field1"}, {"F2", "Field2"}};
    private static CommonClassTypeTagMap cct;
    private static ComponetTypeMap ctm;

    private ComponetTypeMap() {
    }

    public static ComponetTypeMap getShareInstance() {
        return ctm;
    }

    static {
        ctm = new ComponetTypeMap();
        ctm.setMapRelation(oTypeMap);
        cct = new CommonClassTypeTagMap();
        cct.setDefinClass(TTVo.class);
        cct.addFieldSetAsAttrib("F1");
        cct.setMapRelation(oTypeToTag);
        ctm.appendIClassTypeTargMap(cct);
    }
}

