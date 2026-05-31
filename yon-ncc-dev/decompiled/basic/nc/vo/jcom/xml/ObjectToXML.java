/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.jcom.xml;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.math.BigDecimal;
import java.util.StringTokenizer;
import javax.xml.parsers.DocumentBuilderFactory;
import nc.vo.jcom.xml.XMLPrinter;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class ObjectToXML {
    public static Class[] classA = new Class[]{Boolean.class, Character.class, Integer.class, Long.class, Double.class, Float.class, String.class, BigDecimal.class, Integer.TYPE, Character.TYPE, Boolean.TYPE, Long.TYPE, Double.TYPE, Float.TYPE};
    public static final String DOC_TYPE = "(Java lang)Middleware depoly parameter";

    private void appendChild(Document doc, Node parent, Node child) {
        if (parent == null) {
            doc.appendChild(child);
        } else {
            parent.appendChild(child);
        }
    }

    private Class getArrayItemClass(Class arrayClass) throws Exception {
        if (arrayClass == null) {
            return null;
        }
        String className = arrayClass.getName();
        int key = className.indexOf("[L");
        if (key >= 0) {
            int lastLoc = className.indexOf(";");
            String classPureName = className.substring(key + 2, lastLoc);
            Class<?> pureClass = Class.forName(classPureName, false, arrayClass.getClassLoader());
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

    private Node getDocument(Document doc, Element nod, Object o, int deepSet, Class defaultClass, String arrayName, boolean addClassType) throws Exception {
        int deep = deepSet + 1;
        if (o == null) {
            if (!defaultClass.isArray()) {
                nod.setAttribute("value", "null");
            } else {
                nod.setAttribute("arrayValue", "null");
            }
            return nod;
        }
        if (this.isPrimitive(o.getClass())) {
            nod.appendChild(doc.createTextNode("" + o));
            return nod;
        }
        if (o.getClass().isArray()) {
            int length = Array.getLength(o);
            Class itemType = this.getArrayItemClass(defaultClass);
            for (int j = 0; j < length; ++j) {
                if (arrayName == null) {
                    arrayName = "NODE";
                }
                Element arrayList = doc.createElement(arrayName);
                this.getDocument(doc, arrayList, Array.get(o, j), deep, itemType, arrayName, addClassType);
                this.appendChild(doc, nod, arrayList);
            }
        } else {
            if (defaultClass != o.getClass() && nod != null && addClassType) {
                nod.setAttribute("ClassType", o.getClass().getName());
            }
            Field[] fa = o.getClass().getDeclaredFields();
            for (int i = 0; i < fa.length; ++i) {
                boolean isAccessible = fa[i].isAccessible();
                fa[i].setAccessible(true);
                if (Modifier.isFinal(fa[i].getModifiers())) continue;
                Element child = doc.createElement(fa[i].getName());
                Object oc = fa[i].get(o);
                if (oc != null && oc.getClass() != fa[i].getType() && !this.isPrimitive(oc.getClass())) {
                    child.setAttribute("ClassType", fa[i].getType().getName());
                }
                if (oc != null) {
                    if (this.isPrimitive(oc.getClass())) {
                        child.appendChild(doc.createTextNode("" + oc));
                        this.appendChild(doc, nod, child);
                    } else if (oc.getClass().isArray()) {
                        this.getDocument(doc, nod, oc, deep, fa[i].getType(), fa[i].getName(), addClassType);
                    } else {
                        this.getDocument(doc, child, oc, deep, fa[i].getType(), null, addClassType);
                        this.appendChild(doc, nod, child);
                    }
                }
                fa[i].setAccessible(isAccessible);
            }
        }
        return nod;
    }

    private boolean isPrimitive(Class cl) {
        for (int i = 0; i < classA.length; ++i) {
            if (classA[i] != cl) continue;
            return true;
        }
        return false;
    }

    public static void saveAsXmlFile(String fileName, Object o) throws Exception {
        ObjectToXML.saveAsXmlFile(fileName, o, Object.class, true);
    }

    public static void saveAsXmlFileWithoutClassType(String fileName, Object o) throws Exception {
        ObjectToXML.saveAsXmlFile(fileName, o, Object.class, false);
    }

    private static void saveAsXmlFile(String fileName, Object o, Class defaultClass, boolean addClassType) throws Exception {
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        Element nod = doc.createElement("root");
        Node root = new ObjectToXML().getDocument(doc, nod, o, 0, defaultClass, null, addClassType);
        doc.appendChild(root);
        String pathName = fileName;
        String tmpDirectory = "";
        pathName = pathName.replace('\\', '/');
        pathName = pathName.substring(0, pathName.lastIndexOf("/"));
        StringTokenizer st = new StringTokenizer(pathName, "/");
        while (st.hasMoreTokens()) {
            File f = new File(tmpDirectory = tmpDirectory + st.nextToken() + "/");
            if (f.canRead()) continue;
            f.mkdir();
        }
        FileWriter fileOutStream = new FileWriter(fileName);
        PrintWriter dataOutStream = new PrintWriter(fileOutStream);
        XMLPrinter.printDOMTree(dataOutStream, doc, 0);
        dataOutStream.close();
        fileOutStream.close();
    }
}

