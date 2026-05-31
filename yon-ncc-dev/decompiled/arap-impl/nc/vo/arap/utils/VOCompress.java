/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.logging.Log
 *  nc.bs.logging.Logger
 *  nc.itf.cmp.busi.ISettleinfoCarrier
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pub.lang.UFDateTime
 *  nc.vo.pub.lang.UFDouble
 *  nc.vo.pub.lang.UFTime
 *  nc.vo.pub.rs.MemoryResultSet
 *  org.apache.commons.lang3.ArrayUtils
 */
package nc.vo.arap.utils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import nc.bs.logging.Log;
import nc.bs.logging.Logger;
import nc.itf.cmp.busi.ISettleinfoCarrier;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pub.lang.UFTime;
import nc.vo.pub.rs.MemoryResultSet;
import org.apache.commons.lang3.ArrayUtils;

public class VOCompress {
    private VOCompress() {
    }

    public static boolean isDebug() {
        return Logger.isDebugEnabled();
    }

    public static int getObjectOnNetSize(Object obj) {
        try {
            ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
            ObjectOutputStream objectoutputstream = new ObjectOutputStream(bytearrayoutputstream);
            objectoutputstream.writeObject(obj);
            Logger.error((Object)("\u5bf9\u8c61\uff1a" + obj.getClass().toString() + "[" + bytearrayoutputstream.size() + "]byte"));
            return bytearrayoutputstream.size();
        }
        catch (IOException e) {
            Log.getInstance((String)"arapExceptionLog").error((Object)e);
            return 0;
        }
    }

    private static void objectReference(Object o, HashMap<String, Object> m) {
        if (o == null) {
            return;
        }
        if (o instanceof MemoryResultSet[]) {
            Object[] t = (MemoryResultSet[])o;
            if (ArrayUtils.isEmpty((Object[])t)) {
                int j = t.length;
                for (int i = 0; i < j; ++i) {
                    if (t[i] == null) continue;
                    VOCompress.objectReference(t[i].getResultArrayList(), m);
                }
            }
        } else if (o instanceof CircularlyAccessibleValueObject[]) {
            Object[] t = (CircularlyAccessibleValueObject[])o;
            if (ArrayUtils.isEmpty((Object[])t)) {
                int j = t.length;
                for (int i = 0; i < j; ++i) {
                    VOCompress.objectReference1((CircularlyAccessibleValueObject)t[i], m);
                }
            }
        } else if (o instanceof CircularlyAccessibleValueObject) {
            VOCompress.objectReference1((CircularlyAccessibleValueObject)o, m);
        } else if (o instanceof AggregatedValueObject) {
            VOCompress.objectReference1((AggregatedValueObject)o, m);
        } else if (o instanceof AggregatedValueObject[]) {
            Object[] t = (AggregatedValueObject[])o;
            if (ArrayUtils.isEmpty((Object[])t)) {
                int j = t.length;
                for (int i = 0; i < j; ++i) {
                    VOCompress.objectReference1((AggregatedValueObject)t[i], m);
                }
            }
        } else if (o instanceof List) {
            List list = (List)o;
            VOCompress.objectReference1(list, m);
        } else if (o instanceof Object[]) {
            VOCompress.objectReference1((Object[])o, m);
        } else if (o instanceof Object[][]) {
            VOCompress.objectReference1((Object[][])o, m);
        } else if (o instanceof Vector) {
            VOCompress.objectReference1((Vector)o, m);
        } else if (o instanceof Hashtable) {
            VOCompress.objectReference1((Hashtable)o, m);
        } else if (o instanceof Map) {
            VOCompress.objectReference1((Map)o, m);
        }
    }

    private static void objectReference1(AggregatedValueObject o, HashMap<String, Object> m) {
        AggregatedValueObject t = o;
        VOCompress.objectReference1(t.getParentVO(), m);
        CircularlyAccessibleValueObject[] b = t.getChildrenVO();
        VOCompress.objectReference(b, m);
        if (o.getClass().isAssignableFrom(ISettleinfoCarrier.class)) {
            VOCompress.objectReference(((ISettleinfoCarrier)o).getSettlementInfo(), m);
        }
    }

    private static void objectReference1(List<Object> o, HashMap<String, Object> m) {
        if (o == null) {
            return;
        }
        if (o.size() <= 0) {
            return;
        }
        String skey = null;
        Object value = null;
        Object ovalue = null;
        int loop = o.size();
        for (int i = 0; i < loop; ++i) {
            ovalue = o.get(i);
            if (ovalue == null) continue;
            skey = VOCompress.objectCoding(ovalue);
            if (skey.equals("##")) {
                value = null;
                continue;
            }
            if (skey.equals("??")) {
                VOCompress.objectReference(ovalue, m);
                continue;
            }
            value = m.get(skey);
            if (value != null) {
                o.set(i, value);
                continue;
            }
            m.put(skey, ovalue);
        }
    }

    private static void objectReference1(Object[] o, HashMap<String, Object> m) {
        if (o == null) {
            return;
        }
        if (o.length <= 0) {
            return;
        }
        String skey = null;
        Object value = null;
        Object ovalue2 = null;
        for (Object ovalue2 : o) {
            if (ovalue2 == null) continue;
            skey = VOCompress.objectCoding(ovalue2);
            if (skey.equals("##")) {
                value = null;
                continue;
            }
            if (skey.equals("??")) {
                VOCompress.objectReference(ovalue2, m);
                continue;
            }
            value = m.get(skey);
            if (value != null) {
                o[i] = value;
                continue;
            }
            m.put(skey, ovalue2);
        }
    }

    private static void objectReference1(Object[][] o, HashMap<String, Object> m) {
        if (o == null) {
            return;
        }
        if (o.length <= 0) {
            return;
        }
        String skey = null;
        Object value = null;
        Object ovalue = null;
        int jloop = o.length;
        for (int j = 0; j < jloop; ++j) {
            int loop = o[j].length;
            for (int i = 0; i < loop; ++i) {
                ovalue = o[j][i];
                if (ovalue == null) continue;
                skey = VOCompress.objectCoding(ovalue);
                if (skey.equals("##")) {
                    value = null;
                    continue;
                }
                if (skey.equals("??")) {
                    VOCompress.objectReference(ovalue, m);
                    continue;
                }
                value = m.get(skey);
                if (value != null) {
                    o[j][i] = value;
                    continue;
                }
                m.put(skey, ovalue);
            }
        }
    }

    private static void objectReference1(Hashtable<Object, Object> o, HashMap<String, Object> m) {
        if (o == null) {
            return;
        }
        Object[] keys = o.keySet().toArray();
        if (keys == null) {
            return;
        }
        String skey = null;
        Object value = null;
        Object ovalue = null;
        int loop = keys.length;
        for (int i = 0; i < loop; ++i) {
            ovalue = o.get(keys[i]);
            if (ovalue == null) continue;
            skey = VOCompress.objectCoding(ovalue);
            if (skey.equals("##")) {
                value = null;
                continue;
            }
            if (skey.equals("??")) {
                VOCompress.objectReference(ovalue, m);
                continue;
            }
            value = m.get(skey);
            if (value != null) {
                o.remove(keys[i]);
                o.put(keys[i], value);
                continue;
            }
            m.put(skey, ovalue);
        }
    }

    private static void objectReference1(Map<Object, Object> o, HashMap<String, Object> m) {
        if (o == null) {
            return;
        }
        Object[] keys = o.keySet().toArray();
        if (keys == null) {
            return;
        }
        String skey = null;
        Object value = null;
        Object ovalue = null;
        int loop = keys.length;
        for (int i = 0; i < loop; ++i) {
            ovalue = o.get(keys[i]);
            if (ovalue == null) continue;
            skey = VOCompress.objectCoding(ovalue);
            if (skey.equals("##")) {
                value = null;
                continue;
            }
            if (skey.equals("??")) {
                VOCompress.objectReference(ovalue, m);
                continue;
            }
            value = m.get(skey);
            if (value != null) {
                o.remove(keys[i]);
                o.put(keys[i], value);
                continue;
            }
            m.put(skey, ovalue);
        }
    }

    private static void objectReference1(CircularlyAccessibleValueObject o, HashMap<String, Object> m) {
        if (o == null) {
            return;
        }
        String[] keys = o.getAttributeNames();
        if (keys == null) {
            return;
        }
        String skey = null;
        Object value = null;
        Object ovalue = null;
        int loop = keys.length;
        for (int i = 0; i < loop; ++i) {
            ovalue = o.getAttributeValue(keys[i]);
            if (ovalue == null) continue;
            skey = VOCompress.objectCoding(ovalue);
            if (skey.equals("##")) {
                value = null;
                o.setAttributeValue(keys[i], value);
                continue;
            }
            if (skey.equals("??")) {
                VOCompress.objectReference(ovalue, m);
                continue;
            }
            value = m.get(skey);
            if (value != null) {
                o.setAttributeValue(keys[i], value);
                continue;
            }
            m.put(skey, ovalue);
        }
    }

    private static String objectCoding(Object ovalue) {
        if (ovalue == null) {
            return "##";
        }
        String skey = null;
        skey = ovalue.getClass() == String.class ? (((String)ovalue).trim().toString().length() <= 0 ? "##" : "0" + ovalue.toString()) : (ovalue.getClass() == UFDouble.class ? "1" + ovalue.toString() : (ovalue.getClass() == UFDate.class ? "2" + ovalue.toString() : (ovalue.getClass() == UFDateTime.class ? "3" + ovalue.toString() : (ovalue.getClass() == UFBoolean.class ? "4" + ovalue.toString() : (ovalue.getClass() == UFTime.class ? "5" + ovalue.toString() : (ovalue.getClass() == Integer.class ? "6" + ovalue.toString() : (ovalue.getClass() == Double.class ? "7" + ovalue.toString() : (ovalue.getClass() == Long.class ? "8" + ovalue.toString() : (ovalue.getClass() == Byte.class ? "9" + ovalue.toString() : (ovalue.getClass() == Short.class ? "A" + ovalue.toString() : (ovalue.getClass() == Float.class ? "B" + ovalue.toString() : (ovalue.getClass() == Character.class ? "C" + ovalue.toString() : (ovalue.getClass() == Boolean.class ? "D" + ovalue.toString() : (ovalue.getClass() == BigDecimal.class ? "E" + ovalue.toString() : (ovalue.getClass() == BigInteger.class ? "F" + ovalue.toString() : "??")))))))))))))));
        return skey;
    }
}

