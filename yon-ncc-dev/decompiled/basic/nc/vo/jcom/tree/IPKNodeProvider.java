/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.jcom.tree;

import javax.swing.tree.DefaultMutableTreeNode;

public interface IPKNodeProvider {
    public DefaultMutableTreeNode createTreeNode(Object var1);

    public Object getNodeId(Object var1);

    public Object getParentNodeId(Object var1);

    public DefaultMutableTreeNode getOtherTreeNode();
}

