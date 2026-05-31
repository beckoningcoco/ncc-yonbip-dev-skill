/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.ValidationException
 *  nc.vo.pub.ValueObject
 */
package nc.vo.arap.termendtransact;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Vector;
import nc.vo.pub.ValidationException;
import nc.vo.pub.ValueObject;

public class RemoteTransferVO
extends ValueObject
implements Serializable {
    private static final long serialVersionUID = 1L;
    private Vector m_vTranData1;
    private Vector m_vTranData2;
    private Vector m_vTranData3;
    private Hashtable m_hTranData;
    private String m_sTranData1;
    private String m_sTranData2;
    private String m_sTranData3;
    private int m_iClid;
    private ValueObject m_voTranData1;
    private ValueObject m_voTranData2;
    private ArrayList m_arrList;
    private ArrayList m_LockList;
    private boolean m_bReckoningState;

    public ArrayList getArrList() {
        return this.m_arrList;
    }

    public int getClid() {
        return this.m_iClid;
    }

    public String getEntityName() {
        return null;
    }

    public Hashtable getHashTab() {
        return this.m_hTranData;
    }

    public ArrayList getLockList() {
        return this.m_LockList;
    }

    public boolean getReckoningState() {
        return this.m_bReckoningState;
    }

    public String getString1() {
        return this.m_sTranData1;
    }

    public String getString2() {
        return this.m_sTranData2;
    }

    public String getString3() {
        return this.m_sTranData3;
    }

    public Vector getTranData1() {
        return this.m_vTranData1;
    }

    public Vector getTranData2() {
        return this.m_vTranData2;
    }

    public Vector getTranData3() {
        return this.m_vTranData3;
    }

    public ValueObject getVOData1() {
        return this.m_voTranData1;
    }

    public ValueObject getVOData2() {
        return this.m_voTranData2;
    }

    public void onClear() {
        this.setArrList(null);
        this.setClid(0);
        this.setHashTab(null);
        this.setReckoningState(false);
        this.setString1(null);
        this.setString2(null);
        this.setTranData1(null);
        this.setTranData2(null);
        this.setVOData1(null);
        this.setVOData2(null);
    }

    public void setArrList(ArrayList arrlist) {
        this.m_arrList = arrlist;
    }

    public void setClid(int clid) {
        this.m_iClid = clid;
    }

    public void setHashTab(Hashtable hdata) {
        this.m_hTranData = hdata;
    }

    public void setLockList(ArrayList locklist) {
        this.m_LockList = locklist;
    }

    public void setReckoningState(boolean state) {
        this.m_bReckoningState = state;
    }

    public void setString1(String sdata) {
        this.m_sTranData1 = sdata;
    }

    public void setString2(String sdata) {
        this.m_sTranData2 = sdata;
    }

    public void setString3(String sdata) {
        this.m_sTranData3 = sdata;
    }

    public void setTranData1(Vector vdata) {
        this.m_vTranData1 = vdata;
    }

    public void setTranData2(Vector vdata) {
        this.m_vTranData2 = vdata;
    }

    public void setTranData3(Vector vdata) {
        this.m_vTranData3 = vdata;
    }

    public void setVOData1(ValueObject vo) {
        this.m_voTranData1 = vo;
    }

    public void setVOData2(ValueObject vo) {
        this.m_voTranData2 = vo;
    }

    public void validate() throws ValidationException {
    }
}

