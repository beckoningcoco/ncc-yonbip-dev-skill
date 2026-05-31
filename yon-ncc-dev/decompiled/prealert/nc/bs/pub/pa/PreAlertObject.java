/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nccloud.commons.collections.CollectionUtils
 */
package nc.bs.pub.pa;

import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import nc.bs.pub.pa.IBusiCalculater;
import nc.bs.pub.pa.PreAlertReturnType;
import nccloud.commons.collections.CollectionUtils;

public class PreAlertObject
implements Serializable {
    private static final long serialVersionUID = -1932202179803815728L;
    @Deprecated
    private String msgTitle;
    private PreAlertReturnType returnType;
    private Object returnObj;
    private Object busiObj;
    private IBusiCalculater busiCalculater;
    private Map<String, Set<String>> codeUserPkSetMap = new HashMap<String, Set<String>>();

    public IBusiCalculater getBusiCalculater() {
        return this.busiCalculater;
    }

    public void setBusiCalculater(IBusiCalculater busiCalculater) {
        this.busiCalculater = busiCalculater;
    }

    public PreAlertReturnType getReturnType() {
        return this.returnType;
    }

    public void setReturnType(PreAlertReturnType returnType) {
        this.returnType = returnType;
    }

    public Object getReturnObj() {
        return this.returnObj;
    }

    public Object getBusiObj() {
        return this.busiObj;
    }

    public void setBusiObj(Object busiObj) {
        this.busiObj = busiObj;
    }

    public void setReturnObj(Object returnObj) {
        this.returnObj = returnObj;
    }

    @Deprecated
    public String getMsgTitle() {
        return this.msgTitle;
    }

    @Deprecated
    public void setMsgTitle(String title) {
        this.msgTitle = title;
    }

    public void addUserPks(String code, Set<String> userPkSet) {
        if (CollectionUtils.isEmpty(userPkSet)) {
            return;
        }
        this.codeUserPkSetMap.put(code, userPkSet);
    }

    public Set<String> getUserPkSetByCode(String code) {
        if (this.codeUserPkSetMap.isEmpty() || code == null) {
            return new HashSet<String>();
        }
        Set<String> set = this.codeUserPkSetMap.get(code);
        if (!CollectionUtils.isEmpty(set)) {
            return set;
        }
        return new HashSet<String>();
    }
}
