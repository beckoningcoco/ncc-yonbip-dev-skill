/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.jcom.tree;

import javax.swing.tree.DefaultMutableTreeNode;

public interface INodeProvider {
    public DefaultMutableTreeNode getTreeNode(Object var1);

    public Object getHandle(Object var1);

    public Object getParentHandle(Object var1);

    public DefaultMutableTreeNode getOtherTreeNode();
}

