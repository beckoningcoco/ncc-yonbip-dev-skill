/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.logging.Logger
 */
package nc.vo.jcom.xml;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import nc.bs.logging.Logger;
import nc.vo.jcom.lang.StringUtil;
import org.w3c.dom.Attr;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import org.xml.sax.SAXException;

public class XMLUtil {
    private XMLUtil() {
    }

    public static void printDOMTree(PrintWriter pw, Node node, int deepSet) {
        XmlPrinter.printDOMTree(pw, node, deepSet);
    }

    public static void writeXMLFormatString(StringBuffer fileBuffer, Node node, int depth) {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        OutputStreamWriter writer = new OutputStreamWriter(out);
        XMLUtil.printDOMTree(writer, node, depth, "UTF-8");
        try {
            ((Writer)writer).close();
        }
        catch (IOException e) {
            Logger.error((Object)e.getMessage(), (Throwable)e);
        }
        fileBuffer.append(((Object)out).toString());
    }

    public static DocumentBuilder getDocumentBuilder() {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.setValidating(false);
        dbf.setNamespaceAware(true);
        try {
            return dbf.newDocumentBuilder();
        }
        catch (ParserConfigurationException e) {
            throw new RuntimeException("Failed to construct XML Parser!");
        }
    }

    public static Document getNewDocument() {
        return XMLUtil.getDocumentBuilder().newDocument();
    }

    public static Node getChildNodeOf(Node node, String tagName) {
        for (Node temp = node.getFirstChild(); temp != null; temp = temp.getNextSibling()) {
            if (temp.getNodeType() != 1 || !tagName.equals(temp.getNodeName())) continue;
            return temp;
        }
        return null;
    }

    public static String getChildNodeValueOf(Node node, String tagName) {
        if (tagName.equals(node.getNodeName())) {
            return XMLUtil.getValueOf(node);
        }
        for (Node temp = node.getFirstChild(); temp != null; temp = temp.getNextSibling()) {
            if (temp.getNodeType() != 1 || !tagName.equals(temp.getNodeName())) continue;
            return XMLUtil.getValueOf(temp);
        }
        return null;
    }

    public static final String getValueOf(Node node) {
        if (node == null) {
            return null;
        }
        if (node instanceof Text) {
            return node.getNodeValue().trim();
        }
        if (node instanceof Element) {
            ((Element)node).normalize();
            Node temp = node.getFirstChild();
            if (temp != null && temp instanceof Text) {
                return temp.getNodeValue().trim();
            }
            return "";
        }
        return node.getNodeValue().trim();
    }

    public static final String getAtrributeValueOf(Node node, String attribute) {
        Node _node = node.getAttributes().getNamedItem(attribute);
        return XMLUtil.getValueOf(_node);
    }

    public static Iterator getElementsByTagName(Element element, String tag) {
        ArrayList<Element> children = new ArrayList<Element>();
        if (element != null && tag != null) {
            NodeList nodes = element.getElementsByTagName(tag);
            for (int i = 0; i < nodes.getLength(); ++i) {
                Node child = nodes.item(i);
                children.add((Element)child);
            }
        }
        return children.iterator();
    }

    public static Iterator getElementsByTagNames(Element element, String[] tags) {
        ArrayList<Element> children = new ArrayList<Element>();
        if (element != null && tags != null) {
            List<String> tagList = Arrays.asList(tags);
            NodeList nodes = element.getChildNodes();
            for (int i = 0; i < nodes.getLength(); ++i) {
                Node child = nodes.item(i);
                if (child.getNodeType() != 1 || !tagList.contains(((Element)child).getTagName())) continue;
                children.add((Element)child);
            }
        }
        return children.iterator();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static Document getDocument(URL url) throws Exception {
        BufferedInputStream is = null;
        try {
            is = new BufferedInputStream(url.openStream());
            Document document = XMLUtil.getDocumentBuilder().parse(is);
            return document;
        }
        finally {
            if (is != null) {
                try {
                    ((InputStream)is).close();
                }
                catch (IOException iOException) {}
            }
        }
    }

    public static Document getDocument(File file) throws Exception {
        return XMLUtil.getDocumentBuilder().parse(file);
    }

    public static Document getDocument(String file) throws Exception {
        return XMLUtil.getDocumentBuilder().parse(file);
    }

    public static void copyInto(Node src, Node dest) throws DOMException {
        Document factory = dest.getOwnerDocument();
        Node parent = null;
        Node place = src;
        while (place != null) {
            Node node = null;
            short type = place.getNodeType();
            switch (type) {
                case 4: {
                    node = factory.createCDATASection(place.getNodeValue());
                    break;
                }
                case 8: {
                    node = factory.createComment(place.getNodeValue());
                    break;
                }
                case 1: {
                    Element element = factory.createElement(place.getNodeName());
                    node = element;
                    NamedNodeMap attrs = place.getAttributes();
                    int attrCount = attrs.getLength();
                    for (int i = 0; i < attrCount; ++i) {
                        Attr attr = (Attr)attrs.item(i);
                        String attrName = attr.getNodeName();
                        String attrValue = attr.getNodeValue();
                        element.setAttribute(attrName, attrValue);
                    }
                    break;
                }
                case 5: {
                    node = factory.createEntityReference(place.getNodeName());
                    break;
                }
                case 7: {
                    node = factory.createProcessingInstruction(place.getNodeName(), place.getNodeValue());
                    break;
                }
                case 3: {
                    node = factory.createTextNode(place.getNodeValue());
                    break;
                }
                default: {
                    throw new IllegalArgumentException("can't copy node type, " + type + " (null)");
                }
            }
            dest.appendChild(node);
            if (place.hasChildNodes()) {
                parent = place;
                place = place.getFirstChild();
                dest = node;
                continue;
            }
            if (parent == null) {
                place = null;
                continue;
            }
            place = place.getNextSibling();
            while (place == null && parent != null && dest != null) {
                place = parent.getNextSibling();
                parent = parent.getParentNode();
                dest = dest.getParentNode();
            }
        }
    }

    public static Element getFirstChildElement(Node parent) {
        if (parent == null) {
            return null;
        }
        for (Node child = parent.getFirstChild(); child != null; child = child.getNextSibling()) {
            if (child.getNodeType() != 1) continue;
            return (Element)child;
        }
        return null;
    }

    public static Element getLastChildElement(Node parent) {
        if (parent == null) {
            return null;
        }
        for (Node child = parent.getLastChild(); child != null; child = child.getPreviousSibling()) {
            if (child.getNodeType() != 1) continue;
            return (Element)child;
        }
        return null;
    }

    public static Element getNextSiblingElement(Node node) {
        if (node == null) {
            return null;
        }
        for (Node sibling = node.getNextSibling(); sibling != null; sibling = sibling.getNextSibling()) {
            if (sibling.getNodeType() != 1) continue;
            return (Element)sibling;
        }
        return null;
    }

    public static Element getFirstChildElement(Node parent, String elemName) {
        if (parent == null) {
            return null;
        }
        for (Node child = parent.getFirstChild(); child != null; child = child.getNextSibling()) {
            if (child.getNodeType() != 1 || !child.getNodeName().equals(elemName)) continue;
            return (Element)child;
        }
        return null;
    }

    public static Element getLastChildElement(Node parent, String elemName) {
        if (parent == null) {
            return null;
        }
        for (Node child = parent.getLastChild(); child != null; child = child.getPreviousSibling()) {
            if (child.getNodeType() != 1 || !child.getNodeName().equals(elemName)) continue;
            return (Element)child;
        }
        return null;
    }

    public static Element getNextSiblingElement(Node node, String elemName) {
        if (node == null) {
            return null;
        }
        for (Node sibling = node.getNextSibling(); sibling != null; sibling = sibling.getNextSibling()) {
            if (sibling.getNodeType() != 1 || !sibling.getNodeName().equals(elemName)) continue;
            return (Element)sibling;
        }
        return null;
    }

    public static String getChildText(Node node) {
        if (node == null) {
            return null;
        }
        StringBuffer str = new StringBuffer();
        for (Node child = node.getFirstChild(); child != null; child = child.getNextSibling()) {
            short type = child.getNodeType();
            if (type == 3) {
                str.append(child.getNodeValue());
                continue;
            }
            if (type != 4) continue;
            str.append(XMLUtil.getChildText(child));
        }
        return str.toString();
    }

    public static String getElementText(Element ele) {
        short type;
        if (ele == null) {
            return null;
        }
        Node child = ele.getFirstChild();
        if (child != null && (type = child.getNodeType()) == 3) {
            return child.getNodeValue();
        }
        return null;
    }

    public static String getFirstChildElementText(Node node) {
        return XMLUtil.getElementText(XMLUtil.getFirstChildElement(node));
    }

    public static String getLastChildElementText(Node node) {
        return XMLUtil.getElementText(XMLUtil.getLastChildElement(node));
    }

    public static String getNextSiblingElementText(Node node) {
        return XMLUtil.getElementText(XMLUtil.getNextSiblingElement(node));
    }

    public static String getFirstChildElementText(Node node, String elemName) {
        return XMLUtil.getElementText(XMLUtil.getFirstChildElement(node, elemName));
    }

    public static String getLastChildElementText(Node node, String elemName) {
        return XMLUtil.getElementText(XMLUtil.getLastChildElement(node, elemName));
    }

    public static String getNextSiblingElementText(Node node, String elemName) {
        return XMLUtil.getElementText(XMLUtil.getNextSiblingElement(node, elemName));
    }

    public static Element createLeafElement(Document doc, String eleName, String text) {
        Element ele = doc.createElement(eleName);
        if (text != null) {
            ele.appendChild(doc.createTextNode(text));
        }
        return ele;
    }

    public static void addChildElement(Element element, String child_ele_name, String text) {
        Document doc = element.getOwnerDocument();
        Element sub_element = XMLUtil.createLeafElement(doc, child_ele_name, text);
        element.appendChild(sub_element);
    }

    public static Element getElement(Document doc, String tagName, int index) {
        NodeList rows = doc.getDocumentElement().getElementsByTagName(tagName);
        return (Element)rows.item(index);
    }

    public static Document newDocument() throws ParserConfigurationException {
        return XMLUtil.getDocumentBuilder().newDocument();
    }

    public static void printDOMTree(Writer pw, Node node, int deepSet, String encoding) {
        XmlPrinter.printDOMTree(new PrintWriter(pw), node, deepSet, encoding);
    }

    public static String getRegularString(String value) {
        if (value != null) {
            value = value.toString().trim();
            value = StringUtil.replaceAllString(value, "&lt;", "<");
            value = StringUtil.replaceAllString(value, "&gt;", ">");
            value = StringUtil.replaceAllString(value, "&quot;", "\"");
            value = StringUtil.replaceAllString(value, "&apos;", "'");
            value = StringUtil.replaceAllString(value, "&amp;", "&");
        }
        return value;
    }

    public static String getXMLString(String value) {
        if (value != null) {
            value = value.toString().trim();
            value = StringUtil.replaceAllString(value, "&", "&amp;");
            value = StringUtil.replaceAllString(value, "<", "&lt;");
            value = StringUtil.replaceAllString(value, "<", "&lt;");
            value = StringUtil.replaceAllString(value, ">", "&gt;");
            value = StringUtil.replaceAllString(value, "\"", "&quot;");
            value = StringUtil.replaceAllString(value, "'", "&apos;");
        }
        return value;
    }

    public static List<Node> getAllChildNodes(Node node) {
        if (node == null) {
            return null;
        }
        ArrayList<Node> result = new ArrayList<Node>();
        NodeList nodelist = node.getChildNodes();
        for (int i = 0; i < nodelist.getLength(); ++i) {
            List<Node> childlist;
            Node curnode = nodelist.item(i);
            short type = curnode.getNodeType();
            if (type != 3) {
                result.add(nodelist.item(i));
            }
            if ((childlist = XMLUtil.getAllChildNodes(curnode)) == null) continue;
            result.addAll(childlist);
        }
        return result;
    }

    public static Node appendChildNodes(Node destNode, Node parentNode) {
        if (destNode != null && parentNode != null) {
            destNode.setTextContent("");
            NodeList list = parentNode.getChildNodes();
            if (list != null) {
                for (int i = 0; i < list.getLength(); ++i) {
                    Node node = list.item(i);
                    if (node == null) continue;
                    XMLUtil.copyInto(node, destNode);
                }
            }
        }
        return destNode;
    }

    public static Document rebuildDocument(String xmlSnippet) throws SAXException, IOException, UnsupportedEncodingException {
        StringBuffer buffer = new StringBuffer("<?xml version=\"1.0\" encoding='UTF-8'?><root>");
        buffer.append(xmlSnippet);
        buffer.append("</root>");
        Document tmpDoc = XMLUtil.getDocumentBuilder().parse(new ByteArrayInputStream(buffer.toString().getBytes("UTF-8")));
        return tmpDoc;
    }

    public static Node removeChildren(Node parentNode) {
        NodeList list;
        if (parentNode != null && (list = parentNode.getChildNodes()) != null) {
            for (int i = 0; i < list.getLength(); ++i) {
                Node node = list.item(i);
                if (node == null) continue;
                parentNode.removeChild(node);
            }
        }
        return parentNode;
    }

    public static StringBuffer getContentsOfNode(Node parentNode) {
        NodeList list;
        StringBuffer stringBuffer = new StringBuffer();
        if (parentNode != null && (list = parentNode.getChildNodes()) != null) {
            for (int i = 0; i < list.getLength(); ++i) {
                Node node = list.item(i);
                if (node == null) continue;
                XMLUtil.writeXMLFormatString(stringBuffer, node, 0);
            }
        }
        return stringBuffer;
    }

    private static class XmlPrinter {
        private static boolean lastIsAString = false;

        private XmlPrinter() {
        }

        private static String getSpace(int space) {
            char[] ca = new char[space * 4];
            for (int i = 0; i < ca.length; i += 4) {
                ca[i] = 32;
                ca[i + 1] = 32;
                ca[i + 2] = 32;
                ca[i + 3] = 32;
            }
            return new String(ca);
        }

        public static void printDOMTree(PrintWriter pw, Node node, int deepSet) {
            XmlPrinter.printDOMTree(pw, node, deepSet, "gb2312");
        }

        public static void printDOMTree(Writer writer, Node node, int deepSet, String encoding) {
            short type = node.getNodeType();
            PrintWriter pw = null;
            if (writer instanceof OutputStreamWriter) {
                pw = new PrintWriter(writer);
            } else if (writer instanceof PrintWriter) {
                pw = (PrintWriter)writer;
            } else {
                throw new IllegalArgumentException("Illegal writer to print dom tree.");
            }
            switch (type) {
                case 9: {
                    pw.print("<?xml version=\"1.0\" encoding='" + encoding + "'?>");
                    Node preComment = ((Document)node).getDocumentElement().getPreviousSibling();
                    if (preComment != null) {
                        XmlPrinter.printDOMTree(pw, preComment, deepSet);
                    }
                    XmlPrinter.printDOMTree(pw, ((Document)node).getDocumentElement(), deepSet);
                    pw.println();
                    break;
                }
                case 1: {
                    pw.println();
                    pw.print(XmlPrinter.getSpace(deepSet) + "<");
                    pw.print(node.getNodeName());
                    NamedNodeMap attrs = node.getAttributes();
                    for (int i = 0; i < attrs.getLength(); ++i) {
                        Node attr = attrs.item(i);
                        pw.print(" " + attr.getNodeName() + "=\"" + XMLUtil.getXMLString(attr.getNodeValue()) + "\"");
                        if (null != attr.getNodeValue() && !attr.getNodeValue().equals("null")) continue;
                        lastIsAString = true;
                    }
                    pw.print(">");
                    NodeList children = node.getChildNodes();
                    if (children == null) break;
                    int len = children.getLength();
                    for (int i = 0; i < len; ++i) {
                        XmlPrinter.printDOMTree(pw, children.item(i), deepSet + 1);
                    }
                    break;
                }
                case 5: {
                    pw.print("&");
                    pw.print(node.getNodeName());
                    pw.print(";");
                    break;
                }
                case 4: {
                    pw.print(XmlPrinter.getSpace(deepSet) + "<![CDATA[");
                    pw.print(node.getNodeValue());
                    pw.print("]]>");
                    break;
                }
                case 3: {
                    String value = node.getNodeValue();
                    if (value != null) {
                        value = value.trim();
                        value = XMLUtil.getXMLString(value);
                        pw.print(value);
                    }
                    lastIsAString = !"".equals(value);
                    break;
                }
                case 7: {
                    pw.print(XmlPrinter.getSpace(deepSet) + "<?");
                    pw.print(node.getNodeName());
                    String data = node.getNodeValue();
                    pw.print("");
                    pw.print(data);
                    pw.print("?>");
                    break;
                }
                case 8: {
                    pw.println();
                    pw.print(XmlPrinter.getSpace(deepSet) + "<!--");
                    pw.print(node.getNodeValue() + "-->");
                }
            }
            if (type == 1) {
                if (!lastIsAString) {
                    pw.println();
                    pw.print(XmlPrinter.getSpace(deepSet) + "</");
                } else {
                    pw.print("</");
                }
                pw.print(node.getNodeName());
                pw.print('>');
                lastIsAString = false;
            }
        }
    }
}

