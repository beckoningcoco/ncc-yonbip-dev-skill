/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.annotation.AggVoInfo
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.SuperVO
 *  nc.vo.trade.pub.HYBillVO
 *  nc.vo.trade.pub.IExAggVO
 */
package nc.vo.arap.tally;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import nc.vo.annotation.AggVoInfo;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.SuperVO;
import nc.vo.trade.pub.HYBillVO;
import nc.vo.trade.pub.IExAggVO;

@AggVoInfo(parentVO="nc.vo.arap.tally.TallyVO")
public class AggTallyVO
extends HYBillVO
implements IExAggVO {
    private static final long serialVersionUID = 1L;
    private HashMap<Object, Object> hmChildVOs = new HashMap();

    public String[] getTableCodes() {
        return new String[]{"agreements", "allinfo"};
    }

    public String[] getTableNames() {
        return new String[]{NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61008_0", "02006v61008-0297"), NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61008_0", "02006v61008-0298")};
    }

    public CircularlyAccessibleValueObject[] getAllChildrenVO() {
        ArrayList<CircularlyAccessibleValueObject> al = new ArrayList<CircularlyAccessibleValueObject>();
        for (int i = 0; i < this.getTableCodes().length; ++i) {
            CircularlyAccessibleValueObject[] cvos = this.getTableVO(this.getTableCodes()[i]);
            if (cvos == null) continue;
            al.addAll(Arrays.asList(cvos));
        }
        return al.toArray(new SuperVO[0]);
    }

    public CircularlyAccessibleValueObject[] getTableVO(String tableCode) {
        return (CircularlyAccessibleValueObject[])this.hmChildVOs.get(tableCode);
    }

    public void setParentId(SuperVO item, String id) {
    }

    public void setTableVO(String tableCode, CircularlyAccessibleValueObject[] vos) {
        this.hmChildVOs.put(tableCode, vos);
    }

    public String getDefaultTableCode() {
        return this.getTableCodes()[0];
    }

    public SuperVO[] getChildVOsByParentId(String tableCode, String parentId) {
        return null;
    }

    public HashMap<Object, Object> getHmEditingVOs() throws Exception {
        return null;
    }

    public String getParentId(SuperVO item) {
        return null;
    }
}

