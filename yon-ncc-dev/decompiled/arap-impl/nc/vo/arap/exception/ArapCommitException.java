/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.itf.pubapp.pub.exception.IResumeException
 *  nc.vo.pub.BusinessException
 */
package nc.vo.arap.exception;

import java.util.Map;
import nc.itf.pubapp.pub.exception.IResumeException;
import nc.vo.pub.BusinessException;

public class ArapCommitException
extends BusinessException
implements IResumeException {
    private static final long serialVersionUID = 1L;
    private Map<String, Object> assignmessage;

    public Map<String, Object> getAssignmessage() {
        return this.assignmessage;
    }

    public void setAssignmessage(Map<String, Object> assignmessage) {
        this.assignmessage = assignmessage;
    }

    public ArapCommitException(Map<String, Object> getAssignmessage) {
        this.assignmessage = getAssignmessage;
    }

    public String getBusiExceptionType() {
        return null;
    }
}

