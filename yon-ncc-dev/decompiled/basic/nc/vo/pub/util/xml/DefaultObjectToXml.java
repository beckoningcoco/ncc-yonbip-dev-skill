/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.pub.util.xml;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.StringTokenizer;
import nc.vo.jcom.xml.XMLUtil;
import nc.vo.pub.util.xml.Util;
import nc.vo.pub.util.xml.XMLProperty;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class DefaultObjectToXml {
    public static final String DOC_TYPE = "(Java lang)Middleware depoly parameter";

    private void appendChild(Document doc, Node parent, Node child) {
        if (parent == null) {
            doc.appendChild(child);
        } else {
            parent.appendChild(child);
        }
    }

    public static Document getDocument(Object o) throws Exception {
        Document doc = XMLUtil.newDocument();
        String tName = o.getClass().getName();
        String name = tName.substring(tName.lastIndexOf(".") + 1);
        Element nod = doc.createElement(name);
        Node root = new DefaultObjectToXml().getDocument(doc, nod, o, 0, o.getClass(), null);
        doc.appendChild(root);
        return doc;
    }

    public static Document getDocument(String methodName, Object[] paramterObject) throws Exception {
        Document doc = XMLUtil.newDocument();
        for (int i = 0; i < paramterObject.length; ++i) {
            Element nod = doc.createElement(methodName);
            Node root = new DefaultObjectToXml().getDocument(doc, nod, paramterObject[i], 0, paramterObject[i].getClass(), null);
            doc.appendChild(root);
        }
        return doc;
    }

    public Node getDocument(Document doc, Element nod, Object o, int deepSet, Class defaultClass, String arrayName) throws Exception {
        int deep = deepSet + 1;
        if (deep > 100) {
            throw new Exception("Nesting depth is too deep, there may be designated object circulation problem!");
        }
        if (o == null) {
            if (!defaultClass.isArray()) {
                nod.setAttribute("value", "null");
            } else {
                nod.setAttribute("arrayValue", "null");
            }
            return nod;
        }
        if (Util.isPrimitive(o.getClass())) {
            if (o.getClass() != defaultClass) {
                nod.setAttribute("ClassType", o.getClass().getName());
            }
            if (o.getClass() == Class.class) {
                nod.appendChild(doc.createTextNode(((Class)o).getName()));
            } else {
                nod.appendChild(doc.createTextNode("" + o));
            }
            return nod;
        }
        if (o.getClass().isArray()) {
            Class<?> cArrayClass = o.getClass();
            if (cArrayClass != defaultClass) {
                nod.setAttribute("ClassType", cArrayClass.getName());
            }
            int length = Array.getLength(o);
            Class itemType = Util.getArrayItemClass(cArrayClass);
            for (int j = 0; j < length; ++j) {
                Object arrayItem = Array.get(o, j);
                if (arrayName == null) {
                    arrayName = "NODE";
                }
                String localArrayName = arrayName;
                Element arrayList = doc.createElement(localArrayName);
                this.getDocument(doc, arrayList, arrayItem, deep, itemType, localArrayName);
                this.appendChild(doc, nod, arrayList);
            }
        } else {
            if (defaultClass != o.getClass() && nod != null) {
                if (o.getClass() == Class.class) {
                    nod.setAttribute("ClassType", ((Class)o).getName());
                } else {
                    nod.setAttribute("ClassType", o.getClass().getName());
                }
            }
            XMLProperty[] xmlPa = Util.listAllProperty(o.getClass());
            for (int i = 0; i < xmlPa.length; ++i) {
                String name = xmlPa[i].getName();
                Element child = doc.createElement(name);
                Object oc = xmlPa[i].getValue(o);
                if (oc != null && oc.getClass() != xmlPa[i].getType() && !Util.isPrimitive(oc.getClass())) {
                    child.setAttribute("ClassType", xmlPa[i].getType().getName());
                }
                if (oc != null && Util.isPrimitive(oc.getClass())) {
                    child.appendChild(doc.createTextNode("" + oc));
                    this.appendChild(doc, nod, child);
                    continue;
                }
                if (oc != null && oc.getClass().isArray()) {
                    this.getDocument(doc, nod, oc, deep, xmlPa[i].getType(), xmlPa[i].getName());
                    continue;
                }
                this.getDocument(doc, child, oc, deep, xmlPa[i].getType(), null);
                this.appendChild(doc, nod, child);
            }
        }
        return nod;
    }

    public static void saveAsXmlFile(String fileName, Object o, Class defaultClass) throws Exception {
        Document doc = DefaultObjectToXml.getDocument(o);
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
        XMLUtil.printDOMTree(dataOutStream, doc, 0);
        dataOutStream.close();
        fileOutStream.close();
    }
}

