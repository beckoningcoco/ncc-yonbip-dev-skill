/*
 * Decompiled with CFR 0.152.
 */
package uap.vo.prealert.engine.sendmethod;

import uap.vo.prealert.engine.SendMethod;
import uap.vo.prealert.engine.sendmethod.EmailMethod;
import uap.vo.prealert.engine.sendmethod.FuncnodePopupMethod;
import uap.vo.prealert.engine.sendmethod.NCMessageMethod;
import uap.vo.prealert.engine.sendmethod.PushMethod;
import uap.vo.prealert.engine.sendmethod.SMSMethod;

public interface NCSendMethodEnum {
    public static final SendMethod MessageCenter = new NCMessageMethod();
    public static final SendMethod Email = new EmailMethod();
    public static final SendMethod SMS = new SMSMethod();
    public static final SendMethod FuncnodePopup = new FuncnodePopupMethod();
    public static final SendMethod Push = new PushMethod();
    public static final SendMethod[] ENUM = new SendMethod[]{MessageCenter, Email, SMS, FuncnodePopup, Push};
}

