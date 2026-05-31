/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.arap.agiotage.AgiotageMainVO
 *  nc.vo.arap.agiotage.DefaultBusiDataAdapter
 *  nc.vo.pub.BusinessException
 */
package nc.itf.arap.tally;

import java.util.List;
import nc.itf.arap.tally.ITallySourceData;
import nc.vo.arap.agiotage.AgiotageMainVO;
import nc.vo.arap.agiotage.DefaultBusiDataAdapter;
import nc.vo.arap.tally.BusiTypeEnum;
import nc.vo.arap.tally.SuperTallyVO;
import nc.vo.pub.BusinessException;

public interface ITranslator {
    public void isIncludeTally(boolean var1);

    public SuperTallyVO transfer2SuperTallyVO(BusiTypeEnum var1, List<ITallySourceData> var2) throws BusinessException;

    public SuperTallyVO transfer2SuperTallyVO(BusiTypeEnum var1, List<DefaultBusiDataAdapter> var2, AgiotageMainVO var3) throws BusinessException;
}

