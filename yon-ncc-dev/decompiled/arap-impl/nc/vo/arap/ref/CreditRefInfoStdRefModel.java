/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.ui.bd.ref.AbstractRefModel
 *  nc.vo.ml.NCLangRes4VoTransl
 */
package nc.vo.arap.ref;

import java.util.Vector;
import nc.ui.arap.ref.CreditRefInfoStdRefConstant;
import nc.ui.bd.ref.AbstractRefModel;
import nc.vo.ml.NCLangRes4VoTransl;

public class CreditRefInfoStdRefModel
extends AbstractRefModel {
    public String[] getFieldCode() {
        return new String[]{"name", "field"};
    }

    public String[] getFieldName() {
        return new String[]{NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub0322_0", "02006pub0322-0026"), NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub0322_0", "02006pub0322-0027")};
    }

    public String getRefNodeName() {
        return NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0660");
    }

    public String getPkFieldCode() {
        return "name";
    }

    public String getRefTitle() {
        return NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0660");
    }

    public Vector getData() {
        Vector v = new Vector();
        int i = 0;
        for (String r : CreditRefInfoStdRefConstant.NAMES) {
            Vector<String> vr = new Vector<String>();
            vr.add(r);
            vr.add(CreditRefInfoStdRefConstant.FIELDS[i]);
            v.add(vr);
            ++i;
        }
        return v;
    }
}

