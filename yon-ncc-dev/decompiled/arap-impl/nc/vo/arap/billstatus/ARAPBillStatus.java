/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.arap.billstatus;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import nc.vo.arap.BusiStatus;

public enum ARAPBillStatus {
    TEMPSAVE(-99){

        @Override
        public BusiStatus getBusiStatus() {
            return BusiStatus.TEMPEORARY;
        }
    }
    ,
    UNCOMFIRM(9){

        @Override
        public BusiStatus getBusiStatus() {
            return BusiStatus.UNCOMFIRM;
        }
    }
    ,
    SAVE(-1){

        @Override
        public BusiStatus getBusiStatus() {
            return BusiStatus.SAVE;
        }
    }
    ,
    AUDIT(1){

        @Override
        public BusiStatus getBusiStatus() {
            return BusiStatus.AUDIT;
        }
    }
    ,
    SIGN(8){

        @Override
        public BusiStatus getBusiStatus() {
            return BusiStatus.SIGN;
        }
    }
    ,
    AUDITFAIL(0){

        @Override
        public BusiStatus getBusiStatus() {
            return BusiStatus.AUDITHANDLFAIL;
        }
    }
    ,
    AUDITING(2){

        @Override
        public BusiStatus getBusiStatus() {
            return BusiStatus.AUDITHANDLING;
        }
    }
    ,
    CLOSE(10){

        @Override
        public BusiStatus getBusiStatus() {
            return null;
        }
    }
    ,
    UNSAVE(11){

        @Override
        public BusiStatus getBusiStatus() {
            return null;
        }
    }
    ,
    DELETE(19){

        @Override
        public BusiStatus getBusiStatus() {
            return BusiStatus.DELETED;
        }
    };

    public final Integer VALUE;
    public static Map<Integer, ARAPBillStatus> MAPPING_MAP;

    private ARAPBillStatus(int value) {
        this.VALUE = value;
    }

    public abstract BusiStatus getBusiStatus();

    static {
        MAPPING_MAP = new HashMap<Integer, ARAPBillStatus>();
        MAPPING_MAP.put(ARAPBillStatus.TEMPSAVE.VALUE, TEMPSAVE);
        MAPPING_MAP.put(ARAPBillStatus.SAVE.VALUE, SAVE);
        MAPPING_MAP.put(ARAPBillStatus.SIGN.VALUE, SIGN);
        MAPPING_MAP.put(ARAPBillStatus.AUDIT.VALUE, AUDIT);
        MAPPING_MAP.put(ARAPBillStatus.AUDITFAIL.VALUE, AUDITFAIL);
        MAPPING_MAP.put(ARAPBillStatus.UNCOMFIRM.VALUE, UNCOMFIRM);
        MAPPING_MAP.put(ARAPBillStatus.DELETE.VALUE, DELETE);
        Collections.unmodifiableMap(MAPPING_MAP);
    }
}

