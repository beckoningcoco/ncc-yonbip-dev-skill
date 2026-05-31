/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.logging.Logger
 */
package nc.ui.pub.util;

import nc.bs.logging.Logger;
import nc.ui.pub.util.NCTreeModel;
import nc.ui.pub.util.NCTreeNode;

public class NCTreeCreateTool {
    private static void createSubTree(NCTreeNode[] treenods, NCTreeNode parentnode, NCTreeModel treemodel) {
        for (int i = 0; i < treenods.length; ++i) {
            if (treenods[i].getParentCode() == null || !treenods[i].getParentCode().equals(parentnode.getNodeCode())) continue;
            try {
                treemodel.insertNodeInto(treenods[i], parentnode, parentnode.getChildCount());
                NCTreeCreateTool.createSubTree(treenods, treenods[i], treemodel);
                continue;
            }
            catch (Exception ex) {
                Logger.error((Object)("1\u6dfb\u52a0\u6811\u8282\u70b9\u5931\u8d25:" + treenods[i].getNodeCode() + "_,_" + treenods[i].getNodeName()), (Throwable)ex);
            }
        }
    }

    public static void createSubTreeByID(NCTreeNode[] treenods, NCTreeNode parentnode, NCTreeModel treemodel) {
        for (int i = 0; i < treenods.length; ++i) {
            if (treenods[i].getParentCode() == null || !treenods[i].getParentCode().equals(parentnode.getId())) continue;
            treemodel.insertNodeInto(treenods[i], parentnode, parentnode.getChildCount());
            NCTreeCreateTool.createSubTreeByID(treenods, treenods[i], treemodel);
        }
    }

    public static NCTreeModel createTree(NCTreeNode[] treenods, String root) {
        NCTreeNode rootnode = new NCTreeNode(root);
        rootnode.setNodeCode(root);
        NCTreeModel treemodel = new NCTreeModel(rootnode);
        for (int i = 0; i < treenods.length; ++i) {
            if (treenods[i].getParentCode() != null) continue;
            try {
                treemodel.insertNodeInto(treenods[i], rootnode, rootnode.getChildCount());
                NCTreeCreateTool.createSubTree(treenods, treenods[i], treemodel);
                continue;
            }
            catch (Exception ex) {
                Logger.error((Object)("0\u6dfb\u52a0\u6811\u8282\u70b9\u5931\u8d25:" + treenods[i].getNodeCode() + "_,_" + treenods[i].getNodeName()), (Throwable)ex);
            }
        }
        return treemodel;
    }

    public static NCTreeModel createTreeByID(NCTreeNode[] treenods, String root) {
        NCTreeNode rootnode = new NCTreeNode(root);
        rootnode.setNodeCode(root);
        NCTreeModel treemodel = new NCTreeModel(rootnode);
        for (int i = 0; i < treenods.length; ++i) {
            if (treenods[i].getParentCode() != null) continue;
            treemodel.insertNodeInto(treenods[i], rootnode, rootnode.getChildCount());
            NCTreeCreateTool.createSubTreeByID(treenods, treenods[i], treemodel);
        }
        return treemodel;
    }

    public static NCTreeModel createTreeByID_expend(NCTreeNode[] treenods, String root) {
        NCTreeNode rootnode = new NCTreeNode(root);
        rootnode.setNodeCode(root);
        NCTreeModel treemodel = new NCTreeModel(rootnode, true);
        for (int i = 0; i < treenods.length; ++i) {
            if (treenods[i].getParentCode() != null) continue;
            treemodel.insertNodeInto(treenods[i], rootnode, rootnode.getChildCount());
            NCTreeCreateTool.createSubTreeByID(treenods, treenods[i], treemodel);
        }
        return treemodel;
    }
}

