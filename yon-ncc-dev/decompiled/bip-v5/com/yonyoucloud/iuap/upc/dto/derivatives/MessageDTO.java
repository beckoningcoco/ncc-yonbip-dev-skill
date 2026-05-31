/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.dto.derivatives;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyoucloud.iuap.upc.dto.common.CoredocBaseDTO;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class MessageDTO
extends CoredocBaseDTO
implements Serializable {
    private Long id;
    private String code;
    private String name;
    private String message;
    private Integer count;
    private Integer successCount;
    private Integer failCount;
    private List<Map<String, Object>> successInfos;
    private List<Map<String, Object>> failInfos;

    public Long getId() {
        return this.id;
    }

    public String getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }

    public String getMessage() {
        return this.message;
    }

    public Integer getCount() {
        return this.count;
    }

    public Integer getSuccessCount() {
        return this.successCount;
    }

    public Integer getFailCount() {
        return this.failCount;
    }

    public List<Map<String, Object>> getSuccessInfos() {
        return this.successInfos;
    }

    public List<Map<String, Object>> getFailInfos() {
        return this.failInfos;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public void setSuccessCount(Integer successCount) {
        this.successCount = successCount;
    }

    public void setFailCount(Integer failCount) {
        this.failCount = failCount;
    }

    public void setSuccessInfos(List<Map<String, Object>> successInfos) {
        this.successInfos = successInfos;
    }

    public void setFailInfos(List<Map<String, Object>> failInfos) {
        this.failInfos = failInfos;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MessageDTO)) {
            return false;
        }
        MessageDTO other = (MessageDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        Integer this$count = this.getCount();
        Integer other$count = other.getCount();
        if (this$count == null ? other$count != null : !((Object)this$count).equals(other$count)) {
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
        String this$code = this.getCode();
        String other$code = other.getCode();
        if (this$code == null ? other$code != null : !this$code.equals(other$code)) {
            return false;
        }
        String this$name = this.getName();
        String other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) {
            return false;
        }
        String this$message = this.getMessage();
        String other$message = other.getMessage();
        if (this$message == null ? other$message != null : !this$message.equals(other$message)) {
            return false;
        }
        List<Map<String, Object>> this$successInfos = this.getSuccessInfos();
        List<Map<String, Object>> other$successInfos = other.getSuccessInfos();
        if (this$successInfos == null ? other$successInfos != null : !((Object)this$successInfos).equals(other$successInfos)) {
            return false;
        }
        List<Map<String, Object>> this$failInfos = this.getFailInfos();
        List<Map<String, Object>> other$failInfos = other.getFailInfos();
        return !(this$failInfos == null ? other$failInfos != null : !((Object)this$failInfos).equals(other$failInfos));
    }

    @Override
    protected boolean canEqual(Object other) {
        return other instanceof MessageDTO;
    }

    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Integer $count = this.getCount();
        result = result * 59 + ($count == null ? 43 : ((Object)$count).hashCode());
        Integer $successCount = this.getSuccessCount();
        result = result * 59 + ($successCount == null ? 43 : ((Object)$successCount).hashCode());
        Integer $failCount = this.getFailCount();
        result = result * 59 + ($failCount == null ? 43 : ((Object)$failCount).hashCode());
        String $code = this.getCode();
        result = result * 59 + ($code == null ? 43 : $code.hashCode());
        String $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        String $message = this.getMessage();
        result = result * 59 + ($message == null ? 43 : $message.hashCode());
        List<Map<String, Object>> $successInfos = this.getSuccessInfos();
        result = result * 59 + ($successInfos == null ? 43 : ((Object)$successInfos).hashCode());
        List<Map<String, Object>> $failInfos = this.getFailInfos();
        result = result * 59 + ($failInfos == null ? 43 : ((Object)$failInfos).hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "MessageDTO(id=" + this.getId() + ", code=" + this.getCode() + ", name=" + this.getName() + ", message=" + this.getMessage() + ", count=" + this.getCount() + ", successCount=" + this.getSuccessCount() + ", failCount=" + this.getFailCount() + ", successInfos=" + this.getSuccessInfos() + ", failInfos=" + this.getFailInfos() + ")";
    }
}

