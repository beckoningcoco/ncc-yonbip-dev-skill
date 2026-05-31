/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.logging.Debug
 */
package nc.vo.jcom.tree;

import java.util.HashMap;
import java.util.StringTokenizer;
import javax.swing.tree.DefaultMutableTreeNode;
import nc.vo.jcom.tree.ICodeNodeProvider;
import nc.vo.jcom.tree.INodeProvider;
import nc.vo.logging.Debug;

class CodeNodeProviderImpl
implements INodeProvider {
    private ICodeNodeProvider codeNodeProvider = null;
    private DefaultMutableTreeNode root = null;
    private int[] codeSection = null;
    private int[] circleCodeSection = null;
    private int insertType = 0;
    private HashMap handleToTreeNode = null;

    public CodeNodeProviderImpl(DefaultMutableTreeNode root, ICodeNodeProvider codeNodeProviderImpl, HashMap handleToTreeNode, int insertType) {
        this.root = root;
        this.codeNodeProvider = codeNodeProviderImpl;
        this.insertType = insertType;
        this.handleToTreeNode = handleToTreeNode;
        this.codeSection = this.parseCodeRule(this.codeNodeProvider.getCodeRule());
        this.circleCodeSection = this.parseCodeRule(this.codeNodeProvider.getCircularRule());
    }

    @Override
    public DefaultMutableTreeNode getTreeNode(Object userObj) {
        return this.codeNodeProvider.createTreeNode(userObj);
    }

    @Override
    public Object getHandle(Object userObj) {
        return this.codeNodeProvider.getCodeValue(userObj);
    }

    @Override
    public DefaultMutableTreeNode getOtherTreeNode() {
        return this.codeNodeProvider.getOtherTreeNode();
    }

    @Override
    public final Object getParentHandle(Object userObj) {
        DefaultMutableTreeNode parentNode;
        Object codeValue = this.codeNodeProvider.getCodeValue(userObj);
        String parentCode = this.getParentCode(codeValue.toString());
        if (this.insertType == 3 && parentCode != null) {
            Object parentNode2 = this.handleToTreeNode.get(parentCode);
            while (parentNode2 == null && parentCode != null && parentCode.length() > 0) {
                parentCode = this.getParentCode(parentCode);
                parentNode2 = this.handleToTreeNode.get(parentCode);
            }
        } else if (this.insertType == 4 && parentCode != null && parentCode.length() > 0 && (parentNode = (DefaultMutableTreeNode)this.handleToTreeNode.get(parentCode)) == null && (parentNode = this.codeNodeProvider.createDefaultTreeNodeForLoseNode(parentCode)) != null) {
            this.handleToTreeNode.put(parentCode, parentNode);
            this.dealLoseNode(parentCode, parentNode);
        }
        return parentCode;
    }

    private void dealLoseNode(String codeValue, DefaultMutableTreeNode node) {
        String parentCode = this.getParentCode(codeValue);
        if (parentCode != null && parentCode.length() > 0) {
            DefaultMutableTreeNode parentNode = (DefaultMutableTreeNode)this.handleToTreeNode.get(parentCode);
            if (parentNode == null) {
                parentNode = this.codeNodeProvider.createDefaultTreeNodeForLoseNode(parentCode);
                if (parentNode != null) {
                    this.handleToTreeNode.put(parentCode, parentNode);
                    parentNode.add(node);
                    this.dealLoseNode(parentCode, parentNode);
                }
            } else {
                parentNode.add(node);
            }
        } else {
            this.root.add(node);
        }
    }

    private String getParentCode(String childCode) {
        int circleCodeLen;
        int codeLen;
        String parentCode = null;
        int sublength = 0;
        int length = childCode.length();
        int n = codeLen = this.codeSection == null ? 0 : this.codeSection.length;
        if (codeLen > 0) {
            for (int index = 0; length > 0 && index < codeLen; ++index) {
                if ((length -= this.codeSection[index]) <= 0) continue;
                sublength += this.codeSection[index];
            }
        }
        int n2 = circleCodeLen = this.circleCodeSection == null ? 0 : this.circleCodeSection.length;
        if (circleCodeLen > 0) {
            int index = 0;
            while (length > 0 && index < circleCodeLen) {
                if ((length -= this.circleCodeSection[index]) > 0) {
                    sublength += this.circleCodeSection[index];
                }
                index = (index + 1) % circleCodeLen;
            }
        }
        if (sublength > 0) {
            parentCode = childCode.substring(0, sublength);
        }
        return parentCode;
    }

    private int[] parseCodeRule(String codeRule) {
        if (codeRule == null) {
            return null;
        }
        StringTokenizer st = new StringTokenizer(codeRule, " ,./\\", false);
        int count = st.countTokens();
        int[] codes = new int[count];
        int index = 0;
        try {
            while (st.hasMoreTokens()) {
                codes[index++] = Integer.parseInt(st.nextToken().trim());
            }
        }
        catch (Exception e) {
            Debug.debug((Object)"ERROR, Resolve coding rules!");
            codes = null;
        }
        return codes;
    }
}

