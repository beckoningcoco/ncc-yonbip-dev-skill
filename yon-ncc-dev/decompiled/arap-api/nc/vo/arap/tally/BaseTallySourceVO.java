/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.jcom.lang.StringUtil
 *  nc.vo.pub.SuperVO
 */
package nc.vo.arap.tally;

import java.util.HashMap;
import java.util.Map;
import nc.itf.arap.tally.ITallySourceData;
import nc.vo.jcom.lang.StringUtil;
import nc.vo.pub.SuperVO;

public class BaseTallySourceVO
implements ITallySourceData {
    private SuperVO headvo;
    private Map<String, SuperVO[]> childvos;
    private static String NULL = "_NULL_";

    public BaseTallySourceVO(SuperVO head, SuperVO[] childvos) {
        this.setHeadVO(head);
        this.setChildVOs(childvos);
    }

    public BaseTallySourceVO() {
    }

    @Override
    public SuperVO getHeadVO() {
        return this.headvo;
    }

    @Override
    public SuperVO[] getChildVOs(String tablecode) {
        tablecode = this.getRealTablecode(tablecode);
        return this.getMap().get(tablecode);
    }

    private String getRealTablecode(String tablecode) {
        return StringUtil.isEmptyWithTrim((String)tablecode) ? NULL : tablecode;
    }

    @Override
    public void setHeadVO(SuperVO headvo) {
        this.headvo = headvo;
    }

    @Override
    public void setChildVOs(String tablecode, SuperVO[] childvos) {
        if (childvos != null) {
            tablecode = this.getRealTablecode(tablecode);
            this.getMap().put(tablecode, childvos);
        }
    }

    private Map<String, SuperVO[]> getMap() {
        if (this.childvos == null) {
            this.childvos = new HashMap<String, SuperVO[]>();
        }
        return this.childvos;
    }

    @Override
    public void setChildVOs(SuperVO[] childvos) {
        this.setChildVOs(null, childvos);
    }

    @Override
    public SuperVO[] getChildVOs() {
        return this.getChildVOs(null);
    }
}

