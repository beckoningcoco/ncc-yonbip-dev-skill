/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.pub.smart.metadata.Field
 *  nc.pub.smart.metadata.MetaData
 */
package nc.vo.arap.comreport;

import java.util.HashMap;
import nc.pub.smart.metadata.Field;
import nc.pub.smart.metadata.MetaData;

public class RTMetaDataUtil {
    public static void reSetMetaData(MetaData metadata, String[] fldNames, int[] datatypes) {
        Field[] fields;
        HashMap<String, Integer> columnTypes = new HashMap<String, Integer>();
        for (int i = 0; i < fldNames.length; ++i) {
            columnTypes.put(fldNames[i].toLowerCase(), datatypes[i]);
        }
        for (Field field : fields = metadata.getFields()) {
            Integer sqlType;
            if (field == null || field.getFldname() == null || (sqlType = (Integer)columnTypes.get(field.getFldname().toLowerCase())) == null) continue;
            field.setDbColumnType(sqlType.intValue());
        }
    }
}

