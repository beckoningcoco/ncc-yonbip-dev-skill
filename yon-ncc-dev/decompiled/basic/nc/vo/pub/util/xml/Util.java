/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.logging.Logger
 *  nc.vo.logging.Debug
 */
package nc.vo.pub.util.xml;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Vector;
import nc.bs.logging.Logger;
import nc.vo.jcom.xml.XMLUtil;
import nc.vo.logging.Debug;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.util.a0.BigDecimalExchang;
import nc.vo.pub.util.a0.BoolExchang;
import nc.vo.pub.util.a0.BooleanExchang;
import nc.vo.pub.util.a0.Char0Exchang;
import nc.vo.pub.util.a0.CharacterExchang;
import nc.vo.pub.util.a0.ClassTypeExchang;
import nc.vo.pub.util.a0.DoubleExchang;
import nc.vo.pub.util.a0.Float0Exchang;
import nc.vo.pub.util.a0.IntExchang;
import nc.vo.pub.util.a0.IntegerExchang;
import nc.vo.pub.util.a0.Long0Exchang;
import nc.vo.pub.util.a0.Short0Exchang;
import nc.vo.pub.util.a0.ShortExchang;
import nc.vo.pub.util.a0.StringExchang;
import nc.vo.pub.util.a0.UFBooleanExchang;
import nc.vo.pub.util.a0.UFDateExchang;
import nc.vo.pub.util.a0.UFDoubleExchang;
import nc.vo.pub.util.a0.UFTimeExchang;
import nc.vo.pub.util.xml.IPrimitiveTypeExchang;
import nc.vo.pub.util.xml.UtilAssistant;
import nc.vo.pub.util.xml.XMLField;
import nc.vo.pub.util.xml.XMLMethodProperpty;
import nc.vo.pub.util.xml.XMLProperty;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;

public class Util {
    private static Hashtable htClasdDeal = new Hashtable();
    private static Hashtable htClassPropertis = new Hashtable();
    private static Hashtable htClassPrivatePropertis = new Hashtable();
    private static IPrimitiveTypeExchang[] pte = new IPrimitiveTypeExchang[]{new BigDecimalExchang(), new BooleanExchang(), new BoolExchang(), new CharacterExchang(), new DoubleExchang(), new Float0Exchang(), new IntegerExchang(), new IntExchang(), new Long0Exchang(), new ShortExchang(), new Short0Exchang(), new UFBooleanExchang(), new UFDateExchang(), new UFDoubleExchang(), new UFTimeExchang(), new StringExchang(), new Char0Exchang(), new ClassTypeExchang()};

    public static void fillValue(final Field f, final Object o, final String str) throws Exception {
        AccessController.doPrivileged(new PrivilegedAction(){

            public Object run() {
                try {
                    IPrimitiveTypeExchang ipte = (IPrimitiveTypeExchang)htClasdDeal.get(f.getType());
                    if (ipte != null) {
                        ipte.fillFieldValue(f, o, str);
                    }
                }
                catch (Throwable throwable) {
                    // empty catch block
                }
                return null;
            }
        });
    }

    public static Class getArrayItemClass(Class arrayClass) throws Exception {
        if (arrayClass == null) {
            return null;
        }
        String className = arrayClass.getName();
        int key = className.indexOf("[L");
        if (key >= 0) {
            int lastLoc = className.indexOf(";");
            String classPureName = className.substring(key + 2, lastLoc);
            Class<?> pureClass = Class.forName(classPureName);
            if (key == 0) {
                return pureClass;
            }
            int[] arrayList = new int[key];
            for (int i = 0; i < arrayList.length; ++i) {
                arrayList[i] = 1;
            }
            return Array.newInstance(pureClass, arrayList).getClass();
        }
        String[] id = new String[]{"[B", "[C", "[I", "[J"};
        Class[] type = new Class[]{Byte.TYPE, Character.TYPE, Integer.TYPE, Long.TYPE};
        for (int i = 0; i < id.length; ++i) {
            key = className.indexOf(id[i]);
            if (key < 0) continue;
            Class pureClass = type[i];
            if (key == 0) {
                return pureClass;
            }
            int[] arrayList = new int[key];
            for (int j = 0; j < arrayList.length; ++j) {
                arrayList[j] = 1;
            }
            return Array.newInstance(pureClass, arrayList).getClass();
        }
        return Class.forName(className);
    }

    public static Class getArrayItemClass(String className) throws Exception {
        int key = className.indexOf("[L");
        if (key >= 0) {
            int lastLoc = className.indexOf(";");
            String classPureName = className.substring(key + 2, lastLoc);
            Class<?> pureClass = Class.forName(classPureName);
            if (key == 0) {
                return pureClass;
            }
            int[] arrayList = new int[key];
            for (int i = 0; i < arrayList.length; ++i) {
                arrayList[i] = 1;
            }
            return Array.newInstance(pureClass, arrayList).getClass();
        }
        String[] id = new String[]{"[B", "[C", "[I", "[J"};
        Class[] type = new Class[]{Byte.TYPE, Character.TYPE, Integer.TYPE, Long.TYPE};
        for (int i = 0; i < id.length; ++i) {
            key = className.indexOf(id[i]);
            if (key < 0) continue;
            Class pureClass = type[i];
            if (key == 0) {
                return pureClass;
            }
            int[] arrayList = new int[key];
            for (int j = 0; j < arrayList.length; ++j) {
                arrayList[j] = 1;
            }
            return Array.newInstance(pureClass, arrayList).getClass();
        }
        return Class.forName(className);
    }

    public static String getClassName(Class c) throws Exception {
        String str = Util.getTypeName(c);
        int loc = str.lastIndexOf(".");
        if (loc > 0) {
            str = str.substring(loc + 1);
        }
        if ((loc = str.indexOf(91)) > 0) {
            str = str.substring(0, loc);
        }
        return str;
    }

    public static Document getDocument(String str) throws Exception {
        ByteArrayInputStream bis = new ByteArrayInputStream(str.getBytes());
        InputSource is = new InputSource(bis);
        Document doc = XMLUtil.getDocumentBuilder().parse(is);
        return doc;
    }

    public static Object getObjectValueFromString(Class itemType, String str) {
        IPrimitiveTypeExchang ipte = (IPrimitiveTypeExchang)htClasdDeal.get(itemType);
        if (ipte != null && str != null) {
            return ipte.getObjectValueFromString(str);
        }
        return null;
    }

    public static String getText(Document doc) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintWriter dataOutStream = new PrintWriter(baos);
        XMLUtil.printDOMTree(dataOutStream, doc, 0);
        dataOutStream.flush();
        return new String(baos.toByteArray());
    }

    public static String getTypeName(Class type) {
        if (type.isArray()) {
            try {
                Class<?> cl = type;
                int dimensions = 0;
                while (cl.isArray()) {
                    ++dimensions;
                    cl = cl.getComponentType();
                }
                StringBuffer sb = new StringBuffer();
                sb.append(cl.getName());
                for (int i = 0; i < dimensions; ++i) {
                    sb.append("[]");
                }
                return sb.toString();
            }
            catch (Throwable throwable) {
                // empty catch block
            }
        }
        return type.getName();
    }

    public static boolean isArrayClass(String classArrayName) throws Exception {
        return classArrayName.startsWith("[");
    }

    public static boolean isPrimitive(Class c) {
        return htClasdDeal.get(c) != null;
    }

    public static boolean isSetPropertyAsAttribClass(Class c) {
        return IPrimitiveTypeExchang.class.isAssignableFrom(c);
    }

    public static XMLProperty[] listAllProperty(Class c) {
        XMLProperty[] xmlP = (XMLProperty[])htClassPrivatePropertis.get(c);
        if (xmlP != null) {
            return xmlP;
        }
        UtilAssistant ua = new UtilAssistant();
        Field[] cFA = ua.getAllFields(c);
        int iNotWriteOut = 24;
        ArrayList<XMLField> al = new ArrayList<XMLField>();
        for (int i = 0; i < cFA.length; ++i) {
            if ((cFA[i].getModifiers() & iNotWriteOut) != 0) continue;
            al.add(new XMLField(cFA[i]));
        }
        xmlP = new XMLProperty[al.size()];
        al.toArray(xmlP);
        htClassPrivatePropertis.put(c, xmlP);
        return xmlP;
    }

    public static XMLProperty[] listProperty(Class c) {
        int i;
        XMLProperty[] xmlP = (XMLProperty[])htClassPropertis.get(c);
        if (xmlP != null) {
            return xmlP;
        }
        Hashtable<String, XMLMethodProperpty> hAllField = new Hashtable<String, XMLMethodProperpty>();
        Vector<XMLMethodProperpty> v = new Vector<XMLMethodProperpty>();
        Method[] ma = c.getMethods();
        for (int i2 = 0; i2 < ma.length; ++i2) {
            Class<?>[] cParamter;
            String name;
            if ((ma[i2].getModifiers() & 1) == 0 || (ma[i2].getModifiers() & 8) == 0 || !(name = ma[i2].getName()).startsWith("get")) continue;
            name = name.substring(3);
            if (ma[i2].getReturnType() == Void.TYPE || (cParamter = ma[i2].getParameterTypes()).length != 0) continue;
            Class[] setterParameter = new Class[]{ma[i2].getReturnType()};
            Method mt = null;
            try {
                mt = c.getMethod("set" + name, setterParameter);
            }
            catch (NoSuchMethodException nsme) {
                continue;
            }
            if (mt.getReturnType() != Void.TYPE || hAllField.get(name.toLowerCase()) != null) continue;
            XMLMethodProperpty xmlf = new XMLMethodProperpty(mt, ma[i2]);
            hAllField.put(name.toLowerCase(), xmlf);
            v.add(xmlf);
        }
        UtilAssistant ua = new UtilAssistant();
        Field[] cFA = ua.getAllFields(c);
        Vector vNew = new Vector();
        Hashtable<String, Integer> htProperty = new Hashtable<String, Integer>();
        for (int j = 0; j < v.size(); ++j) {
            XMLProperty xmlTemp = (XMLProperty)v.elementAt(j);
            htProperty.put(xmlTemp.getName(), j);
        }
        block4: for (i = 0; i < cFA.length; ++i) {
            String str = cFA[i].getName();
            char[] ca = str.toCharArray();
            for (int k = 0; k < ca.length; ++k) {
                if (!Character.isUpperCase(ca[k])) continue;
                String strPropertyName = new String(ca, k, ca.length - k);
                Integer iLoc = (Integer)htProperty.get(strPropertyName);
                if (iLoc == null) continue block4;
                if ((cFA[i].getModifiers() & 0x80) == 0) {
                    vNew.add(v.elementAt(iLoc));
                } else {
                    Debug.error((Object)("REMOVE FIELD:" + cFA[i]));
                }
                v.set(iLoc, null);
                continue block4;
            }
        }
        for (i = 0; i < v.size(); ++i) {
            if (v.elementAt(i) == null) continue;
            vNew.add(v.elementAt(i));
        }
        Object[] xmlfa = new XMLProperty[vNew.size()];
        vNew.copyInto(xmlfa);
        htClassPropertis.put(c, xmlfa);
        return xmlfa;
    }

    public static boolean matchValue(Object o, Object oTher) throws Exception {
        Object oFieldOther;
        Object oField;
        boolean bEq;
        if (o == oTher) {
            return true;
        }
        if (o == null && oTher != null) {
            return false;
        }
        if (oTher == null) {
            return false;
        }
        if (Util.isPrimitive(o.getClass())) {
            return ((IPrimitiveTypeExchang)htClasdDeal.get(o.getClass())).eqauls(o, oTher);
        }
        XMLProperty[] xmlPa = (XMLProperty[])htClassPropertis.get(o.getClass());
        if (xmlPa == null) {
            xmlPa = Util.listAllProperty(o.getClass());
            htClassPropertis.put(o.getClass(), xmlPa);
        }
        boolean bEqauls = true;
        for (int i = 0; i < xmlPa.length && (bEq = Util.matchValue(oField = xmlPa[i].getValue(o), oFieldOther = xmlPa[i].getValue(oTher))); ++i) {
        }
        return bEqauls;
    }

    public void print(Document doc) {
        PrintWriter dataOutStream = new PrintWriter(System.out);
        XMLUtil.printDOMTree(dataOutStream, doc, 0);
        dataOutStream.close();
    }

    public static void printDoc(Document doc) {
        PrintWriter dataOutStream = new PrintWriter(System.out);
        XMLUtil.printDOMTree(dataOutStream, doc, 0);
        dataOutStream.flush();
    }

    public static String replaceStringfromObject(String sp, int beginfx, String tab, Object o) {
        int beginfx2 = 0;
        if (sp.indexOf(tab, beginfx) != -1) {
            int i1_0 = sp.indexOf(tab, beginfx);
            String s1 = sp.substring(0, i1_0);
            int i1_1 = sp.indexOf(tab, i1_0 + 1);
            String value = sp.substring(i1_0 + 1, i1_1);
            String s2 = sp.substring(i1_1 + 1, sp.length());
            Field[] fds = o.getClass().getFields();
            Object vs = null;
            for (int i = 0; i < fds.length; ++i) {
                if (!fds[i].getName().equalsIgnoreCase(value)) continue;
                try {
                    vs = fds[i].get(o);
                    Debug.debug((Object)("Replaced by the attribute: " + fds[i].getName() + ", and the value is: " + vs));
                }
                catch (IllegalAccessException e) {
                    Logger.error((Object)e.getMessage(), (Throwable)e);
                }
                break;
            }
            if (vs != null && vs instanceof String) {
                sp = s1 + (String)vs + s2;
            }
            beginfx2 = i1_1 + 1;
        }
        if (sp.indexOf(tab, beginfx2) != -1) {
            sp = Util.replaceStringfromObject(sp, beginfx2, tab, o);
        }
        return sp;
    }

    public static UFDate replaceUFDatefromObject(UFDate rDate, String dateName, Object o) {
        if (rDate == null) {
            return null;
        }
        if (rDate.getYear() == 4000) {
            Field[] fs = o.getClass().getFields();
            Object vs = null;
            for (int i = 0; i < fs.length; ++i) {
                if (!fs[i].getName().equals(dateName)) continue;
                try {
                    vs = fs[i].get(o);
                    Debug.debug((Object)("Replaced by the attribute: " + fs[i].getName() + ", and the value is: " + vs));
                    break;
                }
                catch (Exception exception) {
                    // empty catch block
                }
            }
            if (vs != null && vs instanceof UFDate) {
                rDate = (UFDate)vs;
            }
        }
        return rDate;
    }

    public static void replaceValue(Object o, String tab, Object bornObj) throws Exception {
        if (o == null) {
            return;
        }
        XMLProperty[] xmlPa = (XMLProperty[])htClassPropertis.get(o.getClass());
        if (xmlPa == null) {
            xmlPa = Util.listAllProperty(o.getClass());
            htClassPropertis.put(o.getClass(), xmlPa);
        }
        for (int i = 0; i < xmlPa.length; ++i) {
            if (!Util.isPrimitive(xmlPa[i].getType())) continue;
            if (xmlPa[i].getType() == String.class) {
                String strNewValue;
                String strValue = (String)xmlPa[i].getValue(o);
                if (strValue == null || strValue.equals("") || strValue.indexOf(tab) == -1 || (strNewValue = Util.replaceStringfromObject(strValue, 0, tab, bornObj)) == null) continue;
                xmlPa[i].fillValue(o, strNewValue);
                continue;
            }
            if (xmlPa[i].getType() == UFDate.class) {
                UFDate newdate = Util.replaceUFDatefromObject((UFDate)xmlPa[i].getValue(o), xmlPa[i].getName(), bornObj);
                xmlPa[i].fillValue(o, newdate);
                continue;
            }
            Object oField = xmlPa[i].getValue(o);
            if (oField == null) continue;
            Util.replaceValue(oField, tab, bornObj);
        }
    }

    public static void replaceValue(Object o, Hashtable bl) throws Exception {
        XMLProperty[] xmlPa = (XMLProperty[])htClassPropertis.get(o.getClass());
        if (xmlPa == null) {
            xmlPa = Util.listProperty(o.getClass());
            htClassPropertis.put(o.getClass(), xmlPa);
        }
        for (int i = 0; i < xmlPa.length; ++i) {
            if (!Util.isPrimitive(xmlPa[i].getType())) continue;
            if (xmlPa[i].getType() == String.class) {
                String strNewValue;
                String strValue = (String)xmlPa[i].getValue(o);
                if (strValue == null || (strNewValue = (String)bl.get(strValue)) == null) continue;
                xmlPa[i].fillValue(o, strNewValue);
                continue;
            }
            Object oField = xmlPa[i].getValue(o);
            Util.replaceValue(oField, bl);
        }
    }

    public static void setArrayPrimitiveValue(Object o, Class itemType, int loc, String str) throws Exception {
        IPrimitiveTypeExchang ipte = (IPrimitiveTypeExchang)htClasdDeal.get(itemType);
        if (ipte != null) {
            ipte.setArrayPrimitiveValue(o, loc, str);
        }
    }

    public static Object systemCopyValue(Object oldObj) throws Exception {
        byte[] bold = new byte[]{};
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(oldObj);
        if (baos != null) {
            bold = baos.toByteArray();
        }
        oos.close();
        baos.close();
        byte[] bnew = new byte[bold.length];
        System.arraycopy(bold, 0, bnew, 0, bold.length);
        Object onew = null;
        if (bnew != null) {
            ByteArrayInputStream bais = new ByteArrayInputStream(bnew);
            ObjectInputStream ois = new ObjectInputStream(bais);
            onew = ois.readObject();
            ois.close();
            bais.close();
        }
        return onew;
    }

    static {
        for (int i = 0; i < pte.length; ++i) {
            htClasdDeal.put(pte[i].getDealType(), pte[i]);
        }
    }
}

