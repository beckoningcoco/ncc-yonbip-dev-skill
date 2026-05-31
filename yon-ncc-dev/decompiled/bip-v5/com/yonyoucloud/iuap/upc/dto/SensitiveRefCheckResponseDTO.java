/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 */
package com.yonyoucloud.iuap.upc.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import java.io.Serializable;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class SensitiveRefCheckResponseDTO
implements Serializable {
    private Number code;
    private String message;
    private String desc;

    public SensitiveRefCheckResponseDTO() {
    }

    public SensitiveRefCheckResponseDTO(Number code, String message, String desc) {
        this.code = code;
        this.message = message;
        this.desc = desc;
    }

    public static SensitiveRefCheckResponseDTO error(String message) {
        return new SensitiveRefCheckResponseDTO(999, message, null);
    }

    public static SensitiveRefCheckResponseDTO error(String message, String desc) {
        return new SensitiveRefCheckResponseDTO(999, message, desc);
    }

    public static SensitiveRefCheckResponseDTO success() {
        return new SensitiveRefCheckResponseDTO(200, InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040802E7", (String)"\u6821\u9a8c\u901a\u8fc7"), null);
    }

    public Number getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setCode(Number code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof SensitiveRefCheckResponseDTO)) {
            return false;
        }
        SensitiveRefCheckResponseDTO other = (SensitiveRefCheckResponseDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Number this$code = this.getCode();
        Number other$code = other.getCode();
        if (this$code == null ? other$code != null : !this$code.equals(other$code)) {
            return false;
        }
        String this$message = this.getMessage();
        String other$message = other.getMessage();
        if (this$message == null ? other$message != null : !this$message.equals(other$message)) {
            return false;
        }
        String this$desc = this.getDesc();
        String other$desc = other.getDesc();
        return !(this$desc == null ? other$desc != null : !this$desc.equals(other$desc));
    }

    protected boolean canEqual(Object other) {
        return other instanceof SensitiveRefCheckResponseDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Number $code = this.getCode();
        result = result * 59 + ($code == null ? 43 : $code.hashCode());
        String $message = this.getMessage();
        result = result * 59 + ($message == null ? 43 : $message.hashCode());
        String $desc = this.getDesc();
        result = result * 59 + ($desc == null ? 43 : $desc.hashCode());
        return result;
    }

    public String toString() {
        return "SensitiveRefCheckResponseDTO(code=" + this.getCode() + ", message=" + this.getMessage() + ", desc=" + this.getDesc() + ")";
    }
}

