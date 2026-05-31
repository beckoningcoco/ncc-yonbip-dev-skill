/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.jcom.tree;

import javax.swing.tree.DefaultMutableTreeNode;

public interface ICodeNodeProvider {
    public DefaultMutableTreeNode createTreeNode(Object var1);

    public Object getCodeValue(Object var1);

    public String getCodeRule();

    public String getCircularRule();

    public DefaultMutableTreeNode createDefaultTreeNodeForLoseNode(Object var1);

    public DefaultMutableTreeNode getOtherTreeNode();
}

