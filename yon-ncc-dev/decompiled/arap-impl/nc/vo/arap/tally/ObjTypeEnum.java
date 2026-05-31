/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.ml.NCLangRes4VoTransl
 */
package nc.vo.arap.tally;

import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.ml.NCLangRes4VoTransl;

public enum ObjTypeEnum {
    CUSTOMER(BillEnumCollection.ObjType.CUSTOMER.VALUE, "common", "UC000-0001589"),
    SUPPLIER(BillEnumCollection.ObjType.SUPPLIER.VALUE, "common", "UC000-0000275"),
    DEPT(BillEnumCollection.ObjType.DEP.VALUE, "common", "UC000-0004064"),
    PERSON(BillEnumCollection.ObjType.PERSON.VALUE, "2006pub_0", "02006pub-0340");

    private final int code;
    private final String productCode;
    private final String nameResid;

    private ObjTypeEnum(int code, String productCode, String nameResid) {
        this.code = code;
        this.productCode = productCode;
        this.nameResid = nameResid;
    }

    public int getCode() {
        return this.code;
    }

    public String getName() {
        return NCLangRes4VoTransl.getNCLangRes().getStrByID(this.productCode, this.nameResid);
    }
}

