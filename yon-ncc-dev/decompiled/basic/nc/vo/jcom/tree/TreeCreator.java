/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.logging.Logger
 */
package nc.vo.jcom.tree;

import java.util.Enumeration;
import java.util.HashMap;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import nc.bs.logging.Logger;
import nc.vo.jcom.tree.CodeNodeProviderImpl;
import nc.vo.jcom.tree.ICodeNodeProvider;
import nc.vo.jcom.tree.INodeFilter;
import nc.vo.jcom.tree.INodeProvider;
import nc.vo.jcom.tree.IPKNodeProvider;
import nc.vo.jcom.tree.ITreeNodeToHandle;
import nc.vo.jcom.tree.PKNodeProviderImpl;

public class TreeCreator {
    private Object[] userObjs = null;
    private INodeProvider nodeProvider = null;
    private INodeFilter nodeFilter = null;
    private int insertType = 0;
    private HashMap hm_handleToTreeNode = null;
    public static final int WHEN_LOSE_PARENT_IGNORE = 0;
    public static final int WHEN_LOSE_PARENT_INSERT_TO_ROOT = 1;
    public static final int WHEN_LOSE_PARENT_INSERT_TO_OTHERNODE = 2;
    public static final int WHEN_LOSE_PARENT_INSERT_TO_ANCESTOR = 3;
    public static final int WHEN_LOSE_PARENT_AUTO_FILL = 4;

    private TreeCreator(Object[] userObjs, INodeProvider nodeProvider, int insertType, INodeFilter nodeFilter) {
        this.userObjs = userObjs;
        this.nodeProvider = nodeProvider;
        this.insertType = insertType;
        this.nodeFilter = nodeFilter;
    }

    private TreeCreator(Object[] userObjs, INodeProvider nodeProvider, HashMap hm_handleToTreeNode, int insertType, INodeFilter nodeFilter) {
        this.userObjs = userObjs;
        this.nodeProvider = nodeProvider;
        this.insertType = insertType;
        this.hm_handleToTreeNode = hm_handleToTreeNode;
        this.nodeFilter = nodeFilter;
    }

    public static final DefaultTreeModel getCodeTreeModel(DefaultMutableTreeNode root, Object[] userObjs, ICodeNodeProvider codeNodeProvider, int insertType, INodeFilter nodeFilter) {
        TreeCreator.createCodeTree(root, userObjs, codeNodeProvider, insertType, nodeFilter);
        return new DefaultTreeModel(root);
    }

    public static final void createCodeTree(DefaultMutableTreeNode root, Object[] userObjs, ICodeNodeProvider codeNodeProvider, int insertType, INodeFilter nodeFilter) {
        int count = userObjs == null ? 0 : userObjs.length;
        HashMap handleToTreeNode = new HashMap();
        for (int i = 0; i < count; ++i) {
            Object key = codeNodeProvider.getCodeValue(userObjs[i]);
            DefaultMutableTreeNode value = codeNodeProvider.createTreeNode(userObjs[i]);
            TreeCreator.insertRecordToHashMap(handleToTreeNode, key, value);
        }
        CodeNodeProviderImpl nodeProvider = new CodeNodeProviderImpl(root, codeNodeProvider, handleToTreeNode, insertType);
        TreeCreator treeCreator = new TreeCreator(userObjs, nodeProvider, handleToTreeNode, insertType, nodeFilter);
        treeCreator.buildTree(root, null);
    }

    public static final DefaultTreeModel getPKTreeModel(DefaultMutableTreeNode root, Object[] userObjs, IPKNodeProvider pkNodeProvider, int insertType, INodeFilter nodeFilter) {
        TreeCreator.createPKTree(root, userObjs, pkNodeProvider, insertType, nodeFilter);
        return new DefaultTreeModel(root);
    }

    public static final void createPKTree(DefaultMutableTreeNode root, Object[] userObjs, IPKNodeProvider pkNodeProvider, int insertType, INodeFilter nodeFilter) {
        PKNodeProviderImpl nodeProvider = new PKNodeProviderImpl(pkNodeProvider);
        TreeCreator.createTree(root, userObjs, nodeProvider, insertType, nodeFilter);
    }

    public static final void createTree(DefaultMutableTreeNode root, Object[] userObjs, INodeProvider nodeProvider, INodeFilter nodeFilter) {
        TreeCreator.createTree(root, userObjs, nodeProvider, 0, nodeFilter);
    }

    public static final void createTree(DefaultMutableTreeNode root, Object[] userObjs, INodeProvider nodeProvider, int insertType, INodeFilter nodeFilter) {
        TreeCreator treeCreator = new TreeCreator(userObjs, nodeProvider, insertType, nodeFilter);
        treeCreator.buildTree(root, null);
    }

    public static final void expandTree(DefaultTreeModel treeModel, Object[] userObjs, INodeProvider nodeProvider, int insertType, INodeFilter nodeFilter) {
        TreeCreator.expandTree(treeModel, userObjs, null, nodeProvider, insertType, nodeFilter);
    }

    public static final void expandTree(DefaultTreeModel treeModel, Object[] userObjs, ITreeNodeToHandle treeNodeToHandle, INodeProvider nodeProvider, int insertType, INodeFilter nodeFilter) {
        int count = userObjs == null ? 0 : userObjs.length;
        HashMap handleToTreeNode = new HashMap();
        for (int i = 0; i < count; ++i) {
            Object key = nodeProvider.getHandle(userObjs[i]);
            DefaultMutableTreeNode value = nodeProvider.getTreeNode(userObjs[i]);
            TreeCreator.insertRecordToHashMap(handleToTreeNode, key, value);
        }
        DefaultMutableTreeNode root = (DefaultMutableTreeNode)treeModel.getRoot();
        Enumeration enums = root.breadthFirstEnumeration();
        while (enums.hasMoreElements()) {
            DefaultMutableTreeNode node = (DefaultMutableTreeNode)enums.nextElement();
            if (root.equals(node)) continue;
            Object key = null;
            key = treeNodeToHandle == null ? nodeProvider.getHandle(node.getUserObject()) : treeNodeToHandle.getHandleFromTreeNode(node);
            TreeCreator.insertRecordToHashMap(handleToTreeNode, key, node);
        }
        TreeCreator treeCreator = new TreeCreator(userObjs, nodeProvider, handleToTreeNode, insertType, nodeFilter);
        treeCreator.buildTree(root, treeModel);
    }

    public static final void expandTree(DefaultTreeModel treeModel, Object[] userObjs, ICodeNodeProvider codeNodeProvider, int insertType, INodeFilter nodeFilter) {
        TreeCreator.expandTree(treeModel, userObjs, null, codeNodeProvider, insertType, nodeFilter);
    }

    public static final void expandTree(DefaultTreeModel treeModel, Object[] userObjs, ITreeNodeToHandle treeNodeToHandle, ICodeNodeProvider codeNodeProvider, int insertType, INodeFilter nodeFilter) {
        int count = userObjs == null ? 0 : userObjs.length;
        HashMap handleToTreeNode = new HashMap();
        for (int i = 0; i < count; ++i) {
            Object key = codeNodeProvider.getCodeValue(userObjs[i]);
            DefaultMutableTreeNode value = codeNodeProvider.createTreeNode(userObjs[i]);
            TreeCreator.insertRecordToHashMap(handleToTreeNode, key, value);
        }
        DefaultMutableTreeNode root = (DefaultMutableTreeNode)treeModel.getRoot();
        Enumeration enums = root.breadthFirstEnumeration();
        while (enums.hasMoreElements()) {
            DefaultMutableTreeNode node = (DefaultMutableTreeNode)enums.nextElement();
            if (root.equals(node)) continue;
            Object key = null;
            key = treeNodeToHandle == null ? codeNodeProvider.getCodeValue(node.getUserObject()) : treeNodeToHandle.getHandleFromTreeNode(node);
            TreeCreator.insertRecordToHashMap(handleToTreeNode, key, node);
        }
        CodeNodeProviderImpl nodeProvider = new CodeNodeProviderImpl(root, codeNodeProvider, handleToTreeNode, insertType);
        TreeCreator treeCreator = new TreeCreator(userObjs, nodeProvider, handleToTreeNode, insertType, nodeFilter);
        treeCreator.buildTree(root, treeModel);
    }

    private HashMap getHmHandleToTreeNode() {
        if (this.hm_handleToTreeNode == null) {
            this.hm_handleToTreeNode = new HashMap();
            int count = this.userObjs == null ? 0 : this.userObjs.length;
            for (int i = 0; i < count; ++i) {
                Object key = this.nodeProvider.getHandle(this.userObjs[i]);
                DefaultMutableTreeNode value = this.nodeProvider.getTreeNode(this.userObjs[i]);
                TreeCreator.insertRecordToHashMap(this.hm_handleToTreeNode, key, value);
            }
        }
        return this.hm_handleToTreeNode;
    }

    private static void insertRecordToHashMap(HashMap hm, Object key, Object value) {
        if (hm.containsKey(key) && Logger.isDebugEnabled()) {
            Logger.debug((Object)("Repeated Warning: the user object handle repeated, this node is ignored, achievenment continue.\n The repeated user object is:" + value + " the repeated handle is:" + key));
        } else {
            hm.put(key, value);
        }
    }

    private void buildTree(DefaultMutableTreeNode root, DefaultTreeModel treeModel) {
        int count = this.userObjs == null ? 0 : this.userObjs.length;
        DefaultMutableTreeNode otherNode = null;
        for (int i = 0; i < count; ++i) {
            if (this.nodeFilter != null && this.nodeFilter.dontInsert(this.userObjs[i])) continue;
            Object handle = this.nodeProvider.getHandle(this.userObjs[i]);
            if (handle == null) {
                throw new RuntimeException("User Object " + this.userObjs[i] + ", whose handle can not be null.");
            }
            DefaultMutableTreeNode treeNode = (DefaultMutableTreeNode)this.getHmHandleToTreeNode().get(handle);
            DefaultMutableTreeNode parentNode = null;
            Object parentHandle = this.nodeProvider.getParentHandle(this.userObjs[i]);
            parentNode = parentHandle == null ? root : (DefaultMutableTreeNode)this.getHmHandleToTreeNode().get(parentHandle);
            if (parentNode == null) {
                if (this.insertType == 1) {
                    parentNode = root;
                } else if (this.insertType == 2) {
                    if (otherNode == null && (otherNode = this.nodeProvider.getOtherTreeNode()) == null) {
                        otherNode = new DefaultMutableTreeNode("other nodes");
                    }
                    parentNode = otherNode;
                } else {
                    if (this.insertType != 3) continue;
                    parentNode = root;
                }
            }
            if (treeModel == null) {
                parentNode.add(treeNode);
                continue;
            }
            treeModel.insertNodeInto(treeNode, parentNode, parentNode.getChildCount());
        }
        if (otherNode != null) {
            if (treeModel == null) {
                root.add(otherNode);
            } else {
                treeModel.insertNodeInto(otherNode, root, root.getChildCount());
            }
        }
    }
}

