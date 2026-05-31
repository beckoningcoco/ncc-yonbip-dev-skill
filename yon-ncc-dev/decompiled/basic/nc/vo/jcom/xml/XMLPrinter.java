/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.jcom.xml;

import java.io.PrintWriter;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLPrinter {
    private static boolean lastIsAString = false;

    private static String getSpace(int space) {
        char[] ca = new char[space];
        for (int i = 0; i < ca.length; ++i) {
            ca[i] = 9;
        }
        return new String(ca);
    }

    public static void printDOMTree(PrintWriter pw, Node node, int deepSet) {
        short type = node.getNodeType();
        switch (type) {
            case 9: {
                pw.print("<?xml version=\"1.0\" encoding='gb2312'?>");
                XMLPrinter.printDOMTree(pw, ((Document)node).getDocumentElement(), deepSet + 1);
                break;
            }
            case 1: {
                pw.println();
                pw.print(XMLPrinter.getSpace(deepSet) + "<");
                pw.print(node.getNodeName());
                NamedNodeMap attrs = node.getAttributes();
                for (int i = 0; i < attrs.getLength(); ++i) {
                    Node attr = attrs.item(i);
                    pw.print(" " + attr.getNodeName() + "=\"" + attr.getNodeValue() + "\"");
                    if (!attr.getNodeValue().equals("null")) continue;
                    lastIsAString = true;
                }
                pw.print(">");
                NodeList children = node.getChildNodes();
                if (children == null) break;
                int len = children.getLength();
                for (int i = 0; i < len; ++i) {
                    XMLPrinter.printDOMTree(pw, children.item(i), deepSet + 1);
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
                pw.print(XMLPrinter.getSpace(deepSet) + "<![CDATA[");
                pw.print(node.getNodeValue());
                pw.print("]]>");
                break;
            }
            case 3: {
                String value = node.getNodeValue().trim();
                pw.print(value);
                lastIsAString = !"".equals(value);
                break;
            }
            case 7: {
                pw.print(XMLPrinter.getSpace(deepSet) + "<?");
                pw.print(node.getNodeName());
                String data = node.getNodeValue();
                pw.print("");
                pw.print(data);
                pw.print("?>");
                break;
            }
            case 8: {
                pw.println();
                pw.print(XMLPrinter.getSpace(deepSet) + "<!--");
                pw.print(node.getNodeValue() + "-->");
            }
        }
        if (type == 1) {
            if (!lastIsAString) {
                pw.println();
                pw.print(XMLPrinter.getSpace(deepSet) + "</");
            } else {
                pw.print("</");
            }
            pw.print(node.getNodeName());
            pw.print('>');
            lastIsAString = false;
        }
    }
}

