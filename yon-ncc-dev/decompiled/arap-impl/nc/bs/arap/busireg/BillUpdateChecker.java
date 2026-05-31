/*
 * Decompiled with CFR 0.152.
 */
package nc.bs.arap.busireg;

import java.util.List;
import java.util.Map;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseItemVO;

public interface BillUpdateChecker {
    public static final String BODYADDVOS = "bodyAddvos";
    public static final String BODYDELETEVOS = "bodyDeletevos";

    public boolean isMatch(BaseAggVO var1);

    public boolean canUpdateBillWithoutCtrl(BaseAggVO var1);

    public String canAddLine(String var1, List<BaseItemVO> var2);

    public String canDeleteLine(String var1, List<BaseItemVO> var2);

    public String canUpdateBodyFieldValue(Map<String, Map<String, Object[]>> var1, BaseAggVO var2, BaseAggVO var3);

    public String canUpdateHeadFieldValue(Map<String, Object[]> var1, BaseAggVO var2, BaseAggVO var3);

    public boolean excuteDefaultCheck();
}

