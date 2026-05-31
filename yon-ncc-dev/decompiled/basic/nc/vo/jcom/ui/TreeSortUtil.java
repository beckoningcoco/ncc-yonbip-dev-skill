/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.jcom.ui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class TreeSortUtil {
    public static <T> void sort(DefaultTreeModel treeModel, Comparator<T> nodeUserobjComparator) {
        if (treeModel == null) {
            return;
        }
        DefaultMutableTreeNode root = (DefaultMutableTreeNode)treeModel.getRoot();
        TreeSortUtil.sort(root, nodeUserobjComparator);
    }

    public static <T> void sort(DefaultMutableTreeNode treeNode, Comparator<T> nodeUserobjComparator) {
        if (treeNode == null) {
            return;
        }
        int count = treeNode.getChildCount();
        ArrayList<DefaultMutableTreeNode> childList = new ArrayList<DefaultMutableTreeNode>();
        for (int i = 0; i < count; ++i) {
            DefaultMutableTreeNode childTreeNode = (DefaultMutableTreeNode)treeNode.getChildAt(i);
            TreeSortUtil.sort(childTreeNode, nodeUserobjComparator);
            childList.add(childTreeNode);
        }
        TreeNodeComparator<T> comparator = new TreeNodeComparator<T>(nodeUserobjComparator);
        Collections.sort(childList, comparator);
        for (DefaultMutableTreeNode childTreeNode : childList) {
            treeNode.add(childTreeNode);
        }
    }

    private static class TreeNodeComparator<T>
    implements Comparator<DefaultMutableTreeNode> {
        private Comparator<T> c = null;

        public TreeNodeComparator(Comparator<T> c) {
            this.c = c;
        }

        @Override
        public int compare(DefaultMutableTreeNode o1, DefaultMutableTreeNode o2) {
            if (this.c == null) {
                return 0;
            }
            Object obj1 = o1.getUserObject();
            Object obj2 = o2.getUserObject();
            return this.c.compare(obj1, obj2);
        }
    }
}

