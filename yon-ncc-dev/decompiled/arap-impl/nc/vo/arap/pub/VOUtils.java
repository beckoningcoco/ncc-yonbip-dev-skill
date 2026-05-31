/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.jcom.lang.StringUtil
 *  nc.vo.ml.MultiLangUtil
 *  nc.vo.pub.SuperVO
 */
package nc.vo.arap.pub;

import nc.vo.jcom.lang.StringUtil;
import nc.vo.ml.MultiLangUtil;
import nc.vo.pub.SuperVO;

public class VOUtils {
    public String getMultiName(SuperVO supervo, String multiFieldName) {
        String suffix = MultiLangUtil.getCurrentLangSeqSuffix();
        String name = (String)supervo.getAttributeValue(multiFieldName + suffix);
        if (StringUtil.isEmptyWithTrim((String)name)) {
            if (supervo.getAttributeValue(multiFieldName) != null) {
                return (String)supervo.getAttributeValue(multiFieldName);
            }
            if (supervo.getAttributeValue(multiFieldName + 2) != null) {
                return (String)supervo.getAttributeValue(multiFieldName + 2);
            }
            if (supervo.getAttributeValue(multiFieldName + 3) != null) {
                return (String)supervo.getAttributeValue(multiFieldName + 3);
            }
            if (supervo.getAttributeValue(multiFieldName + 4) != null) {
                return (String)supervo.getAttributeValue(multiFieldName + 4);
            }
            if (supervo.getAttributeValue(multiFieldName + 5) != null) {
                return (String)supervo.getAttributeValue(multiFieldName + 5);
            }
            if (supervo.getAttributeValue(multiFieldName + 6) != null) {
                return (String)supervo.getAttributeValue(multiFieldName + 6);
            }
        }
        return name;
    }
}

