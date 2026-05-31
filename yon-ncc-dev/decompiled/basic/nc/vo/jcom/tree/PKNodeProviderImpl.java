/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.jcom.tree;

import javax.swing.tree.DefaultMutableTreeNode;
import nc.vo.jcom.tree.INodeProvider;
import nc.vo.jcom.tree.IPKNodeProvider;

class PKNodeProviderImpl
implements INodeProvider {
    private IPKNodeProvider pkNodeProvider = null;

    public PKNodeProviderImpl(IPKNodeProvider pkNodeProviderImpl) {
        this.pkNodeProvider = pkNodeProviderImpl;
    }

    @Override
    public DefaultMutableTreeNode getTreeNode(Object userObj) {
        return this.pkNodeProvider.createTreeNode(userObj);
    }

    @Override
    public Object getHandle(Object userObj) {
        return this.pkNodeProvider.getNodeId(userObj);
    }

    @Override
    public Object getParentHandle(Object userObj) {
        return this.pkNodeProvider.getParentNodeId(userObj);
    }

    @Override
    public DefaultMutableTreeNode getOtherTreeNode() {
        return this.pkNodeProvider.getOtherTreeNode();
    }
}

