/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.ValidationException
 *  nc.vo.pub.ValueObject
 */
package nc.vo.arap.pub;

import nc.vo.arap.pub.PubConstData;
import nc.vo.arap.pub.QryCondVO;
import nc.vo.pub.ValidationException;
import nc.vo.pub.ValueObject;

public class QryCondArrayVO
extends ValueObject
implements PubConstData {
    private static final long serialVersionUID = -5363527057029510173L;
    private boolean m_bLogicAnd = true;
    private QryCondVO[] m_voItems = null;

    public String getEntityName() {
        return "QryCondArray";
    }

    public QryCondVO[] getItems() {
        return this.m_voItems;
    }

    public boolean getLogicAnd() {
        return this.m_bLogicAnd;
    }

    public boolean isLogicAnd() {
        return this.m_bLogicAnd;
    }

    public void setItems(QryCondVO[] item) {
        this.m_voItems = item;
    }

    public void setLogicAnd(boolean f) {
        this.m_bLogicAnd = f;
    }

    public void validate() throws ValidationException {
    }
}

