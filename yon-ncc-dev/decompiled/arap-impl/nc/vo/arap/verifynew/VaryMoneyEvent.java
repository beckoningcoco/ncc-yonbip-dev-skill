/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.arap.verifynew;

import java.awt.Event;
import nc.vo.arap.verify.VaryMoneyVerifyVO;

public class VaryMoneyEvent
extends Event {
    private static final long serialVersionUID = 1L;
    public VaryMoneyVerifyVO m_voVary;

    public VaryMoneyEvent(Object target, int id, Object arg) {
        super(target, id, arg);
    }

    public VaryMoneyEvent(Object target, long when, int id, int x, int y, int key, int modifiers) {
        super(target, when, id, x, y, key, modifiers);
    }

    public VaryMoneyEvent(Object target, long when, int id, int x, int y, int key, int modifiers, Object arg) {
        super(target, when, id, x, y, key, modifiers, arg);
    }

    public VaryMoneyVerifyVO getVO() {
        return this.m_voVary;
    }

    public void setVO(VaryMoneyVerifyVO vo) {
        this.m_voVary = vo;
    }
}

