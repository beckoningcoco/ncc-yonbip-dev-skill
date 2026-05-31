/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.dto.ext;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;
import java.util.List;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class UPCResultList
implements Serializable {
    private Integer count;
    private Integer sucessCount;
    private Integer successCount;
    private Integer failCount;
    private List<Object> messages;
    private List<Object> infos;
    private List<Object> failInfos;
    private String level;

    public Integer getCount() {
        return this.count;
    }

    public Integer getSucessCount() {
        return this.sucessCount;
    }

    public Integer getSuccessCount() {
        return this.successCount;
    }

    public Integer getFailCount() {
        return this.failCount;
    }

    public List<Object> getMessages() {
        return this.messages;
    }

    public List<Object> getInfos() {
        return this.infos;
    }

    public List<Object> getFailInfos() {
        return this.failInfos;
    }

    public String getLevel() {
        return this.level;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public void setSucessCount(Integer sucessCount) {
        this.sucessCount = sucessCount;
    }

    public void setSuccessCount(Integer successCount) {
        this.successCount = successCount;
    }

    public void setFailCount(Integer failCount) {
        this.failCount = failCount;
    }

    public void setMessages(List<Object> messages) {
        this.messages = messages;
    }

    public void setInfos(List<Object> infos) {
        this.infos = infos;
    }

    public void setFailInfos(List<Object> failInfos) {
        this.failInfos = failInfos;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof UPCResultList)) {
            return false;
        }
        UPCResultList other = (UPCResultList)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Integer this$count = this.getCount();
        Integer other$count = other.getCount();
        if (this$count == null ? other$count != null : !((Object)this$count).equals(other$count)) {
            return false;
        }
        Integer this$sucessCount = this.getSucessCount();
        Integer other$sucessCount = other.getSucessCount();
        if (this$sucessCount == null ? other$sucessCount != null : !((Object)this$sucessCount).equals(other$sucessCount)) {
            return false;
        }
        Integer this$successCount = this.getSuccessCount();
        Integer other$successCount = other.getSuccessCount();
        if (this$successCount == null ? other$successCount != null : !((Object)this$successCount).equals(other$successCount)) {
            return false;
        }
        Integer this$failCount = this.getFailCount();
        Integer other$failCount = other.getFailCount();
        if (this$failCount == null ? other$failCount != null : !((Object)this$failCount).equals(other$failCount)) {
            return false;
        }
        List<Object> this$messages = this.getMessages();
        List<Object> other$messages = other.getMessages();
        if (this$messages == null ? other$messages != null : !((Object)this$messages).equals(other$messages)) {
            return false;
        }
        List<Object> this$infos = this.getInfos();
        List<Object> other$infos = other.getInfos();
        if (this$infos == null ? other$infos != null : !((Object)this$infos).equals(other$infos)) {
            return false;
        }
        List<Object> this$failInfos = this.getFailInfos();
        List<Object> other$failInfos = other.getFailInfos();
        if (this$failInfos == null ? other$failInfos != null : !((Object)this$failInfos).equals(other$failInfos)) {
            return false;
        }
        String this$level = this.getLevel();
        String other$level = other.getLevel();
        return !(this$level == null ? other$level != null : !this$level.equals(other$level));
    }

    protected boolean canEqual(Object other) {
        return other instanceof UPCResultList;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $count = this.getCount();
        result = result * 59 + ($count == null ? 43 : ((Object)$count).hashCode());
        Integer $sucessCount = this.getSucessCount();
        result = result * 59 + ($sucessCount == null ? 43 : ((Object)$sucessCount).hashCode());
        Integer $successCount = this.getSuccessCount();
        result = result * 59 + ($successCount == null ? 43 : ((Object)$successCount).hashCode());
        Integer $failCount = this.getFailCount();
        result = result * 59 + ($failCount == null ? 43 : ((Object)$failCount).hashCode());
        List<Object> $messages = this.getMessages();
        result = result * 59 + ($messages == null ? 43 : ((Object)$messages).hashCode());
        List<Object> $infos = this.getInfos();
        result = result * 59 + ($infos == null ? 43 : ((Object)$infos).hashCode());
        List<Object> $failInfos = this.getFailInfos();
        result = result * 59 + ($failInfos == null ? 43 : ((Object)$failInfos).hashCode());
        String $level = this.getLevel();
        result = result * 59 + ($level == null ? 43 : $level.hashCode());
        return result;
    }

    public String toString() {
        return "UPCResultList(count=" + this.getCount() + ", sucessCount=" + this.getSucessCount() + ", successCount=" + this.getSuccessCount() + ", failCount=" + this.getFailCount() + ", messages=" + this.getMessages() + ", infos=" + this.getInfos() + ", failInfos=" + this.getFailInfos() + ", level=" + this.getLevel() + ")";
    }
}

