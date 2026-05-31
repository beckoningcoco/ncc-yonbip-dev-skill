/*
 * Decompiled with CFR 0.152.
 */
package nc.ui.pub.util;

import javax.swing.tree.DefaultMutableTreeNode;
import nc.vo.pub.ValueObject;

public class NCTreeNode
extends DefaultMutableTreeNode {
    private String m_nodeCode;
    private String m_nodeName;
    private String m_parentCode;
    private String m_id;
    private ValueObject m_dataVO;

    public NCTreeNode(Object userObject) {
        super(userObject);
    }

    public NCTreeNode(Object userObject, boolean allowsChildren) {
        super(userObject, allowsChildren);
    }

    public ValueObject getDataVO() {
        return this.m_dataVO;
    }

    public String getId() {
        return this.m_id;
    }

    public String getNodeCode() {
        return this.m_nodeCode;
    }

    public String getNodeName() {
        return this.m_nodeName;
    }

    public String getParentCode() {
        return this.m_parentCode;
    }

    public void setDataVO(ValueObject dataVO) {
        this.m_dataVO = dataVO;
    }

    public void setId(String newId) {
        this.m_id = newId;
    }

    public void setNodeCode(String newNodeCode) {
        this.m_nodeCode = newNodeCode;
    }

    public void setNodeName(String newNodeName) {
        this.m_nodeName = newNodeName;
    }

    public void setParentCode(String newParentCode) {
        this.m_parentCode = newParentCode;
    }
}

