/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.logging.Logger
 */
package nc.vo.pub.util.xml;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.Vector;
import nc.bs.logging.Logger;
import nc.vo.jcom.xml.XMLUtil;
import nc.vo.pub.util.xml.ITypeMap;
import nc.vo.pub.util.xml.Util;
import nc.vo.pub.util.xml.XMLProperty;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public class XMLExchang {
    private boolean m_beExchangPrivateType = true;
    public boolean m_beNotOutputNullValue;
    public boolean m_beOutputNullArrayList;
    public ITypeMap m_TypeMap;
    public boolean m_beKeepLocation;
    private boolean m_AllowNoField = false;
    public boolean m_beReplaceArrayTagAsType;
    public boolean m_beOutputArrayLength;
    public boolean m_beOutputAsField = false;
    public static final String STR_ExternalAttribute = "ExternalAttribute";

    private void appendChild(Document doc, Node parent, Node child) {
        if (parent == null) {
            doc.appendChild(child);
        } else {
            parent.appendChild(child);
        }
    }

    public Document getDocument(Object o) throws Exception {
        Document doc = XMLUtil.newDocument();
        String tName = o.getClass().getName();
        String name = tName.substring(tName.lastIndexOf(".") + 1);
        Element nod = doc.createElement(name);
        Node root = this.getDocument(doc, nod, o, 0, o.getClass(), null, false);
        doc.appendChild(root);
        return doc;
    }

    public Document getDocument(String methodName, Object[] paramterObject) throws Exception {
        Document doc = XMLUtil.newDocument();
        for (int i = 0; i < paramterObject.length; ++i) {
            Element nod = doc.createElement(methodName);
            Node root = this.getDocument(doc, nod, paramterObject[i], 0, paramterObject[i].getClass(), null, false);
            doc.appendChild(root);
        }
        return doc;
    }

    public Node getDocument(Document doc, Element nod, Object o, int deepSet, Class defaultClass, String arrayName, boolean hasChangedTagForArrayItem) throws Exception {
        int deep = deepSet + 1;
        if (deep > 100) {
            throw new Exception("Nesting depth is too deep, there may be designated object circulation problem!");
        }
        if (o == null) {
            return this.setNullFlag(nod, defaultClass);
        }
        if (Util.isPrimitive(o.getClass())) {
            this.setNodeTypeAttribute(nod, defaultClass, o, hasChangedTagForArrayItem);
            if (o.getClass() == Class.class) {
                nod.appendChild(doc.createTextNode(((Class)o).getName()));
            } else {
                nod.appendChild(doc.createTextNode("" + o));
            }
            return nod;
        }
        if (o.getClass() == ArrayList.class) {
            ArrayList al = (ArrayList)o;
            if (arrayName == null) {
                arrayName = "NODE";
            }
            String localArrayName = arrayName;
            for (int i = 0; i < al.size(); ++i) {
                Object oElement = al.get(i);
                if (this.isNotOutputNullValue() && oElement == null) continue;
                Element arrayList = doc.createElement(localArrayName);
                this.getDocument(doc, arrayList, oElement, deep, Object.class, localArrayName, false);
                this.appendChild(doc, nod, arrayList);
            }
            return nod;
        }
        if (o.getClass().isArray()) {
            if (arrayName == null) {
                arrayName = "NODE";
            }
            Element nodArray = doc.createElement(arrayName);
            this.setNodeTypeAttribute(nodArray, defaultClass, o, hasChangedTagForArrayItem);
            int length = Array.getLength(o);
            if (this.isOutputNullArrayList()) {
                nodArray.setAttribute("arrayLength", "" + length);
            }
            this.appendChild(doc, nod, nodArray);
            Class itemType = Util.getArrayItemClass(o.getClass());
            boolean bJumpedNullComponent = false;
            for (int j = 0; j < length; ++j) {
                Object arrayItem = Array.get(o, j);
                if (this.isNotOutputNullValue() && arrayItem == null) {
                    bJumpedNullComponent = true;
                    continue;
                }
                String localArrayName = arrayName;
                boolean hasChangedTagForArrayItem0 = false;
                if (this.isReplaceArrayTagAsType() && this.getTypeMap() != null && arrayItem != null && this.getTypeMap().hasClassMap(arrayItem.getClass()) && !(localArrayName = this.getTypeMap().getType(arrayItem.getClass())).equals(arrayName)) {
                    hasChangedTagForArrayItem0 = true;
                }
                Element arrayElement = doc.createElement(localArrayName);
                this.getDocument(doc, arrayElement, arrayItem, deep, itemType, localArrayName, hasChangedTagForArrayItem0);
                if (arrayItem != null && arrayItem.getClass().isArray()) {
                    this.appendChild(doc, nodArray, arrayElement.getChildNodes().item(0));
                } else {
                    this.appendChild(doc, nodArray, arrayElement);
                }
                if (!bJumpedNullComponent || !this.isKeepLocation()) continue;
                arrayElement.setAttribute("arrayLoc", "" + j);
            }
        } else {
            this.setNodeTypeAttribute(nod, defaultClass, o, hasChangedTagForArrayItem);
            XMLProperty[] xmlPa = null;
            xmlPa = this.isOutputAsField() ? Util.listAllProperty(o.getClass()) : Util.listProperty(o.getClass());
            for (int i = 0; i < xmlPa.length; ++i) {
                Object oF = xmlPa[i].getValue(o);
                if (this.isNotOutputNullValue() && (oF == null || oF.getClass() == ArrayList.class && ((ArrayList)oF).size() == 0)) continue;
                if (oF instanceof Hashtable && xmlPa[i].getName().equals(STR_ExternalAttribute)) {
                    Hashtable h = (Hashtable)oF;
                    Enumeration hKeys = h.keys();
                    while (hKeys.hasMoreElements()) {
                        Object key = hKeys.nextElement();
                        nod.setAttribute(key.toString(), h.get(key).toString());
                    }
                    continue;
                }
                String name = xmlPa[i].getName();
                String strTagName = this.getTag(o.getClass(), name);
                Element child = doc.createElement(strTagName);
                if (Map.class.isAssignableFrom(xmlPa[i].getType())) {
                    Map m = (Map)oF;
                    Set set = m.keySet();
                    Object[] oa = set.toArray();
                    for (int j = 0; j < oa.length; ++j) {
                        Object ov = m.get(oa[j]);
                        child.setAttribute(oa[j].toString(), ov.toString());
                    }
                    this.appendChild(doc, nod, child);
                    continue;
                }
                this.setNodeTypeAttribute(child, xmlPa[i].getType(), oF, false);
                if (oF != null && Util.isPrimitive(oF.getClass())) {
                    if (this.isFieldSetAsAttrib(o.getClass(), name)) {
                        nod.setAttribute(strTagName, "" + oF);
                        continue;
                    }
                    child.appendChild(doc.createTextNode("" + oF));
                    this.appendChild(doc, nod, child);
                    continue;
                }
                if (oF != null && oF.getClass().isArray()) {
                    this.getDocument(doc, nod, oF, deep, xmlPa[i].getType(), strTagName, hasChangedTagForArrayItem);
                    continue;
                }
                this.getDocument(doc, child, oF, deep, xmlPa[i].getType(), null, hasChangedTagForArrayItem);
                this.appendChild(doc, nod, child);
            }
        }
        return nod;
    }

    public Object getJavaObjectFromDocument(Document doc, Class c) throws Exception {
        Element node = doc.getDocumentElement();
        Object oe = this.revertDocument(node, c, null);
        return oe;
    }

    public Object getJavaObjectFromFile(String fileName, Class c) throws Exception {
        Document doc = XMLUtil.getDocumentBuilder().parse(fileName);
        Element node = doc.getDocumentElement();
        Object oe = this.revertDocument(node, c, null);
        return oe;
    }

    public Object getJavaObjectFromNode(Node node, Class c) throws Exception {
        String name = Util.getClassName(c);
        Object oe = this.revertDocument((Element)node, c, name);
        return oe;
    }

    public ITypeMap getTypeMap() {
        return this.m_TypeMap;
    }

    public boolean isAllowNoField() {
        return this.m_AllowNoField;
    }

    public boolean isExchangPrivateType() {
        return this.m_beExchangPrivateType;
    }

    public boolean isKeepLocation() {
        return this.m_beKeepLocation;
    }

    public boolean isNotOutputNullValue() {
        return this.m_beNotOutputNullValue;
    }

    private boolean isNullNode(Node cNode) {
        Node valueNode = cNode.getAttributes().getNamedItem("value");
        if (valueNode == null) {
            return false;
        }
        return valueNode.getNodeValue().equals("null");
    }

    public boolean isOutputArrayLength() {
        return this.m_beOutputArrayLength;
    }

    public boolean isOutputNullArrayList() {
        return this.m_beOutputNullArrayList;
    }

    public boolean isReplaceArrayTagAsType() {
        return this.m_beReplaceArrayTagAsType;
    }

    private Object revertArray(Node cNode, Class defautClass, String nodeName) throws Exception {
        if (cNode == null) {
            return null;
        }
        String arrayName = defautClass.getName();
        Class arrayItemClass = Util.getArrayItemClass(arrayName);
        NodeList nl = cNode.getChildNodes();
        Node nod = cNode.getAttributes().getNamedItem("arrayLength");
        int length = 0;
        if (nod != null) {
            String strLength = nod.getNodeValue();
            length = Integer.parseInt(strLength);
        }
        Vector<Node> vNl = new Vector<Node>();
        for (int i = 0; i < nl.getLength(); ++i) {
            if (nl.item(i).getNodeType() != 1) continue;
            vNl.addElement(nl.item(i));
        }
        if (length < vNl.size()) {
            length = vNl.size();
        }
        Object o = Array.newInstance(arrayItemClass, length);
        if (Util.isPrimitive(arrayItemClass)) {
            for (int i = 0; i < vNl.size(); ++i) {
                Node item = (Node)vNl.elementAt(i);
                String str = item.getChildNodes().item(0).getNodeValue().trim();
                Util.setArrayPrimitiveValue(o, arrayItemClass, i, str);
            }
        } else {
            for (int i = 0; i < vNl.size(); ++i) {
                Node item = (Node)vNl.elementAt(i);
                Class thisItemClass = arrayItemClass;
                if (this.isReplaceArrayTagAsType() && !item.getNodeName().equals(nodeName)) {
                    thisItemClass = this.getTypeMap().getClassType(item.getNodeName());
                }
                Array.set(o, i, this.revertDocument((Element)item, thisItemClass, nodeName));
            }
        }
        return o;
    }

    public Object revertDocument(Element item, Class defaultClass, String nodeName) throws Exception {
        int i;
        Class<?> classType;
        if (this.isNullNode(item)) {
            return null;
        }
        boolean bChildClass = true;
        String className = item.getAttribute("ClassType");
        Class cThisClass = null;
        if (this.getTypeMap() != null) {
            String typeName = item.getAttribute("TypeMap_Type");
            cThisClass = this.getTypeMap().getClassType(typeName);
            if (cThisClass != null) {
                className = cThisClass.getName();
            }
        }
        if (className == null || className.length() == 0) {
            bChildClass = false;
            className = defaultClass.getName();
        }
        if (Util.isArrayClass(className)) {
            classType = defaultClass;
            if (bChildClass) {
                classType = Class.forName(className);
            }
            return this.revertArray(item, classType, nodeName);
        }
        classType = defaultClass;
        if (bChildClass) {
            classType = Class.forName(className);
        }
        if (Util.isPrimitive(classType)) {
            Node nl;
            NodeList nlc = item.getChildNodes();
            if (nlc.getLength() > 0 && (nl = nlc.item(0)) != null) {
                return Util.getObjectValueFromString(classType, nlc.item(0).getNodeValue());
            }
            return null;
        }
        Object o = classType.newInstance();
        if (Map.class.isAssignableFrom(classType)) {
            NamedNodeMap nnm = item.getAttributes();
            Map map = (Map)o;
            for (int i2 = 0; i2 < nnm.getLength(); ++i2) {
                map.put(nnm.item(i2).getNodeName(), nnm.item(i2).getNodeValue());
            }
            return o;
        }
        if (Util.isPrimitive(classType)) {
            throw new Exception("Parse Error");
        }
        NodeList nl = item.getChildNodes();
        XMLProperty[] fa = null;
        fa = this.isOutputAsField() ? Util.listAllProperty(classType) : Util.listProperty(classType);
        Hashtable<String, XMLProperty> hAllInteralAttribute = new Hashtable<String, XMLProperty>();
        for (i = 0; i < fa.length; ++i) {
            hAllInteralAttribute.put(fa[i].getName(), fa[i]);
        }
        if (hAllInteralAttribute.containsKey(STR_ExternalAttribute)) {
            NamedNodeMap nnm = item.getAttributes();
            XMLProperty xmlProperty = (XMLProperty)hAllInteralAttribute.get(STR_ExternalAttribute);
            Hashtable htExternalProperty = (Hashtable)xmlProperty.getValue(o);
            for (int i3 = 0; i3 < nnm.getLength(); ++i3) {
                Node attribute = nnm.item(i3);
                if (hAllInteralAttribute.containsKey(attribute.getNodeName())) continue;
                htExternalProperty.put(attribute.getNodeName(), attribute.getNodeValue());
            }
        }
        for (i = 0; i < fa.length; ++i) {
            Element cNode = null;
            String strFieldTagName = this.getTag(classType, fa[i].getName());
            if (Util.isPrimitive(fa[i].getType()) && item.getAttributes().getNamedItem(strFieldTagName) != null) {
                String str = item.getAttribute(strFieldTagName);
                fa[i].fillPrimitiveValue(o, str);
                continue;
            }
            for (int j = 0; j < nl.getLength(); ++j) {
                if (!strFieldTagName.equalsIgnoreCase(nl.item(j).getNodeName())) continue;
                cNode = (Element)nl.item(j);
                break;
            }
            if (cNode == null && !fa[i].getType().isArray()) {
                if (this.isAllowNoField() || fa[i].getName().equals(STR_ExternalAttribute)) continue;
                throw new Exception("Lack of the description of " + fa[i].getName());
            }
            if (fa[i].getType().isArray()) {
                Object oa = this.revertArray(cNode, fa[i].getType(), fa[i].getName());
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

    public void saveAsXmlFile(String fileName, Object o, Class defaultClass) throws Exception {
        Document doc = this.getDocument(o);
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

    public void setAllowNoField(boolean newAllowNoField) {
        this.m_AllowNoField = newAllowNoField;
    }

    public void setExchangPrivateType(boolean newExchangPrivateType) {
        this.m_beExchangPrivateType = newExchangPrivateType;
    }

    public void setKeepLocation(boolean newKeepLocation) {
        this.m_beKeepLocation = newKeepLocation;
    }

    private void setNodeTypeAttribute(Element nod, Class defaultClass, Object o, boolean changedTagForArray) {
        if (o == null) {
            return;
        }
        if (o.getClass() == defaultClass) {
            return;
        }
        if (Util.isPrimitive(defaultClass)) {
            return;
        }
        if (this.getTypeMap() != null) {
            if (!changedTagForArray) {
                nod.setAttribute("TypeMap_Type", this.getTypeMap().getType(o.getClass()));
            }
        } else if (defaultClass == Class.class) {
            nod.setAttribute("CType", ((Class)o).getName() + "");
        } else {
            nod.setAttribute("ClassType", o.getClass().getName() + "");
        }
    }

    public void setNotOutputNullValue(boolean newNotOutputNullValue) {
        this.m_beNotOutputNullValue = newNotOutputNullValue;
    }

    private Node setNullFlag(Element node, Class defaultClass) {
        if (!defaultClass.isArray()) {
            node.setAttribute("value", "null");
        } else {
            node.setAttribute("arrayValue", "null");
        }
        return node;
    }

    public void setOutputArrayLength(boolean newOutputArrayLength) {
        this.m_beOutputArrayLength = newOutputArrayLength;
    }

    public void setOutputNullArrayList(boolean newOutputNullArrayList) {
        this.m_beOutputNullArrayList = newOutputNullArrayList;
    }

    public void setReplaceArrayTagAsType(boolean newReplaceArrayTagAsType) {
        this.m_beReplaceArrayTagAsType = newReplaceArrayTagAsType;
    }

    public void setTypeMap(ITypeMap newTypeMap) {
        this.m_TypeMap = newTypeMap;
    }

    public Object getJavaObjectFromString(String xmlString, Class c) throws Exception {
        InputSource in = new InputSource(xmlString);
        Document doc = XMLUtil.getDocumentBuilder().parse(in);
        Element node = doc.getDocumentElement();
        Object oe = this.revertDocument(node, c, null);
        return oe;
    }

    private String getTag(Class c, String strFieldName) {
        if (this.getTypeMap() == null) {
            return strFieldName;
        }
        if (this.getTypeMap().getTypeTargMap(c) == null) {
            return strFieldName;
        }
        return this.getTypeMap().getTypeTargMap(c).getFieldToTag(strFieldName);
    }

    private boolean isFieldSetAsAttrib(Class c, String fieldName) {
        if (this.getTypeMap() == null) {
            return false;
        }
        if (this.getTypeMap().getTypeTargMap(c) == null) {
            return false;
        }
        return this.getTypeMap().getTypeTargMap(c).isFieldOutputAsAttribut(fieldName);
    }

    public boolean isOutputAsField() {
        return this.m_beOutputAsField;
    }

    public String saveAsXmlString(Object o, Class defaultClass) throws Exception {
        Document doc = this.getDocument(o);
        StringWriter strOutStream = new StringWriter();
        PrintWriter dataOutStream = new PrintWriter(strOutStream);
        XMLUtil.printDOMTree(dataOutStream, doc, 0);
        dataOutStream.close();
        strOutStream.close();
        return strOutStream.toString();
    }

    public void setOutputAsField(boolean newOutputAsField) {
        this.m_beOutputAsField = newOutputAsField;
    }
}

