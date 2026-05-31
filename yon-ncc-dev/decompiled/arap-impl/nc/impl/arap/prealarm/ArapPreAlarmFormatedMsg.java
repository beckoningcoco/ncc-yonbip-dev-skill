/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.pub.pa.html.IAlertMessage
 */
package nc.impl.arap.prealarm;

import nc.bs.pub.pa.html.IAlertMessage;

public class ArapPreAlarmFormatedMsg
implements IAlertMessage {
    private static final long serialVersionUID = 1L;
    private String[] m_sFldNames;
    private float[] m_fWidths;
    private String m_sTitle;
    private String[] m_sTops;
    private String[] m_sBottoms;
    private Object[][] m_oValues;

    public String[] getBodyFields() {
        return this.m_sFldNames;
    }

    public void setBodyFields(String[] newBodyFields) {
        this.m_sFldNames = newBodyFields;
    }

    public Object[][] getBodyValue() {
        return this.m_oValues;
    }

    public void setBodyValue(Object[][] newBodyValue) {
        this.m_oValues = newBodyValue;
    }

    public float[] getBodyWidths() {
        return this.m_fWidths;
    }

    public void setBodyWidths(float[] newBodyWidths) {
        this.m_fWidths = newBodyWidths;
    }

    public String[] getBottom() {
        return this.m_sBottoms;
    }

    public void setBottom(String[] newBottom) {
        this.m_sBottoms = newBottom;
    }

    public String getTitle() {
        return this.m_sTitle;
    }

    public void setTitle(String newTitle) {
        this.m_sTitle = newTitle;
    }

    public String[] getTop() {
        return this.m_sTops;
    }

    public void setTop(String[] newTop) {
        this.m_sTops = newTop;
    }
}

