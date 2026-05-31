/*
 * Decompiled with CFR 0.152.
 */
package nc.bs.pub.taskcenter;

import java.io.Serializable;
import java.util.ArrayList;

public class ReportLikeWorkInfo
implements Serializable {
    private static final long serialVersionUID = -213946946259467078L;
    private String workName;
    private String workId;
    private String creator;
    private ArrayList<String> msgReceivers;
    private String info1;
    private String info2;
    private String info3;
    private String info4;
    private String info5;
    private String info6;
    private String info7;
    private String info8;
    private String info9;
    private String info10;
    private String info11;
    private String info12;

    public ArrayList<String> getMsgReceivers() {
        if (this.msgReceivers == null) {
            this.msgReceivers = new ArrayList();
        }
        return this.msgReceivers;
    }

    public String getWorkName() {
        return this.workName;
    }

    public void setWorkName(String workName) {
        this.workName = workName;
    }

    public String getWorkId() {
        return this.workId;
    }

    public void setWorkId(String workId) {
        this.workId = workId;
    }

    public String getCreator() {
        return this.creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getInfo1() {
        return this.info1;
    }

    public void setInfo1(String info1) {
        this.info1 = info1;
    }

    public String getInfo2() {
        return this.info2;
    }

    public void setInfo2(String info2) {
        this.info2 = info2;
    }

    public String getInfo3() {
        return this.info3;
    }

    public void setInfo3(String info3) {
        this.info3 = info3;
    }

    public String getInfo4() {
        return this.info4;
    }

    public void setInfo4(String info4) {
        this.info4 = info4;
    }

    public String getInfo5() {
        return this.info5;
    }

    public void setInfo5(String info5) {
        this.info5 = info5;
    }

    public String getInfo6() {
        return this.info6;
    }

    public void setInfo6(String info6) {
        this.info6 = info6;
    }

    public String getInfo7() {
        return this.info7;
    }

    public void setInfo7(String info7) {
        this.info7 = info7;
    }

    public String getInfo8() {
        return this.info8;
    }

    public void setInfo8(String info8) {
        this.info8 = info8;
    }

    public String getInfo9() {
        return this.info9;
    }

    public void setInfo9(String info9) {
        this.info9 = info9;
    }

    public String getInfo10() {
        return this.info10;
    }

    public void setInfo10(String info10) {
        this.info10 = info10;
    }

    public String getInfo11() {
        return this.info11;
    }

    public void setInfo11(String info11) {
        this.info11 = info11;
    }

    public String getInfo12() {
        return this.info12;
    }

    public void setInfo12(String info12) {
        this.info12 = info12;
    }
}

