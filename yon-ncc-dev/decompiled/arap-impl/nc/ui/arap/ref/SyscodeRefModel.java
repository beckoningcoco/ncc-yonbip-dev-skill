/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.ui.bd.ref.AbstractRefModel
 *  nc.vo.bd.ref.RefVO_mlang
 *  nc.vo.ml.NCLangRes4VoTransl
 */
package nc.ui.arap.ref;

import nc.ui.bd.ref.AbstractRefModel;
import nc.vo.bd.ref.RefVO_mlang;
import nc.vo.ml.NCLangRes4VoTransl;

public class SyscodeRefModel
extends AbstractRefModel {
    private RefVO_mlang[] mlang = null;

    public int getDefaultFieldCount() {
        return 2;
    }

    public String[] getFieldCode() {
        return new String[]{"pk_syscode", "djdl", "resid"};
    }

    public String[] getFieldName() {
        return new String[]{NCLangRes4VoTransl.getNCLangRes().getStrByID("common", "UC000-0002767"), NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0184")};
    }

    public String getPkFieldCode() {
        return "sysid_string";
    }

    public String getRefTitle() {
        return NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0185");
    }

    public String getTableName() {
        return "cmp_syscode";
    }

    public String getwhere() {
        return null;
    }

    public String[] getHiddenFieldCode() {
        return new String[]{"sysid_string"};
    }

    protected RefVO_mlang[] getRefVO_mlang() {
        if (this.mlang == null) {
            this.mlang = new RefVO_mlang[1];
            this.mlang[0] = new RefVO_mlang();
            this.mlang[0].setDirName("arapinit");
            this.mlang[0].setFieldName("djdl");
            this.mlang[0].setResIDFieldNames(new String[]{"resid"});
        }
        return this.mlang;
    }
}

