/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.logging.Logger
 */
package nc.vo.pub.util.xml;

import java.lang.reflect.Array;
import java.util.Vector;
import nc.bs.logging.Logger;
import nc.vo.jcom.xml.XMLUtil;
import nc.vo.pub.util.xml.Util;
import nc.vo.pub.util.xml.XMLProperty;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DefaultXmlToObject {
    private boolean m_AllowNoField = false;

    public static Object getJavaObjectFromDocument(Document doc, boolean allowNoField, Class c) throws Exception {
        DefaultXmlToObject xto = new DefaultXmlToObject();
        xto.setAllowNoField(allowNoField);
        Element node = doc.getDocumentElement();
        Object oe = xto.revertDocument(node, c, null);
        return oe;
    }

    public static Object getJavaObjectFromFile(String fileName, boolean allowNoField, Class c) throws Exception {
        Document doc = XMLUtil.getDocumentBuilder().parse(fileName);
        DefaultXmlToObject xto = new DefaultXmlToObject();
        xto.setAllowNoField(allowNoField);
        Element node = doc.getDocumentElement();
        Object oe = xto.revertDocument(node, c, null);
        return oe;
    }

    public static Object getJavaObjectFromNode(Node node, boolean allowNoField, Class c) throws Exception {
        DefaultXmlToObject xto = new DefaultXmlToObject();
        xto.setAllowNoField(allowNoField);
        String name = Util.getClassName(c);
        Object oe = xto.revertDocument(node, c, name);
        return oe;
    }

    public boolean isAllowNoField() {
        return this.m_AllowNoField;
    }

    private boolean isNullNode(Node cNode) {
        Node valueNode = cNode.getAttributes().getNamedItem("value");
        if (valueNode == null) {
            return false;
        }
        return valueNode.getNodeValue().equals("null");
    }

    private boolean isNullNodeArray(Node cNode) {
        Node valueNode = cNode.getAttributes().getNamedItem("arrayValue");
        if (valueNode == null) {
            return false;
        }
        return valueNode.getNodeValue().equals("null");
    }

    private Object revertArray(Node cNode, Class defautClass, String nodeName) throws Exception {
        String arrayName = defautClass.getName();
        Class arrayItemClass = Util.getArrayItemClass(arrayName);
        NodeList nl = cNode.getChildNodes();
        Vector<Node> vNl = new Vector<Node>();
        for (int i = 0; i < nl.getLength(); ++i) {
            if (!nl.item(i).getNodeName().equals(nodeName)) continue;
            vNl.addElement(nl.item(i));
        }
        if (vNl.size() == 1 && this.isNullNodeArray((Node)vNl.elementAt(0))) {
            return null;
        }
        Object o = Array.newInstance(arrayItemClass, vNl.size());
        if (Util.isPrimitive(arrayItemClass)) {
            for (int i = 0; i < vNl.size(); ++i) {
                Node item = (Node)vNl.elementAt(i);
                String str = item.getChildNodes().item(0).getNodeValue().trim();
                Util.setArrayPrimitiveValue(o, arrayItemClass, i, str);
            }
        } else {
            for (int i = 0; i < vNl.size(); ++i) {
                Node item = (Node)vNl.elementAt(i);
                Array.set(o, i, this.revertDocument(item, arrayItemClass, nodeName));
            }
        }
        return o;
    }

    public Object revertDocument(Node item, Class defaultClass, String nodeName) throws Exception {
        if (this.isNullNode(item)) {
            return null;
        }
        boolean bChildClass = true;
        String className = ((Element)item).getAttribute("ClassType");
        if (className == null || className.length() == 0) {
            bChildClass = false;
            className = defaultClass.getName();
        }
        if (Util.isArrayClass(className)) {
            Class<?> classType = defaultClass;
            if (bChildClass) {
                classType = defaultClass.getClassLoader().loadClass(className);
            }
            return this.revertArray(item, classType, nodeName);
        }
        Class<?> classType = defaultClass;
        if (bChildClass) {
            classType = defaultClass.getClassLoader().loadClass(className);
        }
        if (Util.isPrimitive(classType)) {
            Node nl;
            NodeList nlc = item.getChildNodes();
            if (nlc.getLength() > 0 && (nl = nlc.item(0)) != null) {
                return Util.getObjectValueFromString(classType, nlc.item(0).getNodeValue());
            }
            return null;
        }
        if (classType == null) {
            throw new Exception("Class can't be found!Class:" + className);
        }
        Object o = classType.newInstance();
        if (Util.isPrimitive(classType)) {
            throw new Exception("Parse Error");
        }
        NodeList nl = item.getChildNodes();
        XMLProperty[] fa = Util.listAllProperty(classType);
        for (int i = 0; i < fa.length; ++i) {
            Node cNode = null;
            for (int j = 0; j < nl.getLength(); ++j) {
                if (!fa[i].getName().equalsIgnoreCase(nl.item(j).getNodeName())) continue;
                cNode = nl.item(j);
                break;
            }
            if (cNode == null && Util.isPrimitive(fa[i].getType())) {
                Node nn = item.getAttributes().getNamedItem(fa[i].getName());
                if (nn == null) continue;
                try {
                    fa[i].fillPrimitiveValue(o, nn.getNodeValue());
                }
                catch (Exception e) {
                    Logger.error((Object)e.getMessage(), (Throwable)e);
                }
                continue;
            }
            if (cNode == null && !fa[i].getType().isArray()) {
                if (this.isAllowNoField()) continue;
                throw new Exception("Lack of the description of : " + fa[i].getName());
            }
            if (fa[i].getType().isArray()) {
                Object oa = this.revertArray(item, fa[i].getType(), fa[i].getName());
                fa[i].fillValue(o, oa);
                continue;
            }
            if (Util.isPrimitive(fa[i].getType())) {
                Node n;
                NodeList nlc = cNode.getChildNodes();
                boolean bSetted = false;
                if (cNode.getAttributes() != null && (n = cNode.getAttributes().getNamedItem("value")) != null && "null".equals(n.getNodeValue())) {
                    fa[i].fillValue(o, null);
                    bSetted = true;
                }
                if (bSetted) continue;
                if (nlc.item(0) == null) {
                    fa[i].fillPrimitiveValue(o, "");
                    continue;
                }
                try {
                    fa[i].fillPrimitiveValue(o, nlc.item(0).getNodeValue());
                }
                catch (Exception e) {
                    Logger.error((Object)e.getMessage(), (Throwable)e);
                }
                continue;
            }
            Object os = this.revertDocument(cNode, fa[i].getType(), nodeName);
            fa[i].fillValue(o, os);
        }
        return o;
    }

    public void setAllowNoField(boolean newAllowNoField) {
        this.m_AllowNoField = newAllowNoField;
    }
}

