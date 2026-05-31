/*
 * Decompiled with CFR 0.152.
 */
package nc.ui.pub.util;

import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;

public class NCTreeModel
extends DefaultTreeModel {
    public NCTreeModel(TreeNode root) {
        super(root);
    }

    public NCTreeModel(TreeNode root, boolean asksAllowsChildren) {
        super(root, asksAllowsChildren);
    }
}

