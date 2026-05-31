/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.jcom.util;

import java.util.HashMap;
import javax.swing.tree.DefaultMutableTreeNode;
import nc.vo.jcom.util.INode;

public class TreeBuilder {
    protected DefaultMutableTreeNode constructTreeNode(INode node) {
        return new DefaultMutableTreeNode(node);
    }

    private void check(DefaultMutableTreeNode parent, DefaultMutableTreeNode child) throws Exception {
        if (parent.isNodeAncestor(child)) {
            String s = "Node " + child.getUserObject() + " whith node " + parent.getUserObject() + " to be the parent-child loop. ";
            Exception e = new Exception(s);
            throw e;
        }
    }

    protected void insertNode(DefaultMutableTreeNode parent, DefaultMutableTreeNode child) {
        parent.add(child);
    }

    public void constructTree(DefaultMutableTreeNode root, INode[] nodes) throws Exception {
        HashMap hm = this.getNodesHash(nodes);
        int count = nodes == null ? 0 : nodes.length;
        for (int i = 0; i < count; ++i) {
            DefaultMutableTreeNode node = (DefaultMutableTreeNode)hm.get(nodes[i].getID());
            Object parentID = nodes[i].getParentID();
            if (parentID == null) {
                this.check(root, node);
                this.insertNode(root, node);
                continue;
            }
            DefaultMutableTreeNode parent = (DefaultMutableTreeNode)hm.get(parentID);
            if (parent != null) {
                this.check(parent, node);
                this.insertNode(parent, node);
                continue;
            }
            String err = "Node " + nodes[i].getID() + ",whose parent node is " + parentID + ", but this parent node does not exist.";
            throw new Exception(err);
        }
    }

    private HashMap getNodesHash(INode[] nodes) {
        HashMap<Object, DefaultMutableTreeNode> hm = new HashMap<Object, DefaultMutableTreeNode>();
        int count = nodes == null ? 0 : nodes.length;
        for (int i = 0; i < count; ++i) {
            hm.put(nodes[i].getID(), this.constructTreeNode(nodes[i]));
        }
        return hm;
    }
}

