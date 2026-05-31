/*
 * Decompiled with CFR 0.152.
 */
package uap.vo.prealert.engine.receiver;

import uap.vo.prealert.engine.receiver.PersonType;
import uap.vo.prealert.engine.receiver.PostType;
import uap.vo.prealert.engine.receiver.ReceiverType;
import uap.vo.prealert.engine.receiver.ResponsibilityType;
import uap.vo.prealert.engine.receiver.RoleGroupType;
import uap.vo.prealert.engine.receiver.RoleType;
import uap.vo.prealert.engine.receiver.SelfDefType;
import uap.vo.prealert.engine.receiver.UserGroupType;
import uap.vo.prealert.engine.receiver.UserType;

public interface NCReceiverTypeEnum {
    public static final ReceiverType User = new UserType();
    public static final ReceiverType Role = new RoleType();
    public static final ReceiverType UserGroup = new UserGroupType();
    public static final ReceiverType RoleGroup = new RoleGroupType();
    public static final ReceiverType Person = new PersonType();
    public static final ReceiverType Responsibility = new ResponsibilityType();
    public static final ReceiverType Post = new PostType();
    public static final ReceiverType SelfDef = new SelfDefType();
    public static final ReceiverType[] ENUM = new ReceiverType[]{User, Role, UserGroup, RoleGroup, Person, Responsibility, Post, SelfDef};
}

