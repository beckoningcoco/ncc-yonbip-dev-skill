/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.arap;

public enum BusiStatus {
    DELETED(1900),
    TEMPEORARY(-9900),
    SAVE(-100),
    AUDITHANDLING(302),
    AUDITHANDLFAIL(300),
    AUDIT(301),
    SIGN(800),
    EFFECTNEVER(500),
    EFFET(510),
    EFFECTHANDLING(505),
    HANGUP(600),
    UNCOMFIRM(900),
    CLOSING(1000);

    protected int status;

    private BusiStatus(int status) {
        this.status = status;
    }

    public int getStatus() {
        return this.status;
    }

    public int getBillStatusKind() {
        return this.status / 100;
    }

    public int getBillStatusSubKind() {
        return this.status % 100;
    }

    public static BusiStatus convertInt2Enum(int intAfterCalaulate) {
        BusiStatus val = null;
        switch (intAfterCalaulate) {
            case 4: {
                val = DELETED;
                break;
            }
            case -99: {
                val = TEMPEORARY;
                break;
            }
            case -1: {
                val = SAVE;
                break;
            }
            case 2: {
                val = AUDITHANDLING;
                break;
            }
            case 0: {
                val = AUDITHANDLFAIL;
                break;
            }
            case 1: {
                val = AUDIT;
                break;
            }
            case 8: {
                val = SIGN;
                break;
            }
            case 5: {
                val = EFFET;
                break;
            }
            case 6: {
                val = HANGUP;
                break;
            }
            case 9: {
                val = UNCOMFIRM;
                break;
            }
            case 10: {
                val = CLOSING;
                break;
            }
        }
        return val;
    }
}

