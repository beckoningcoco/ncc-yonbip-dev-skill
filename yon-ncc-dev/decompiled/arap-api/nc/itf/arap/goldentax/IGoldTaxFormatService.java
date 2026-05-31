/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.BusinessException
 */
package nc.itf.arap.goldentax;

import java.util.Map;
import nc.vo.arap.goldentax.GoldTaxFormatVO;
import nc.vo.pub.BusinessException;

public interface IGoldTaxFormatService {
    public Map<String, Object> getARAPParas(String var1, String[] var2) throws BusinessException;

    public GoldTaxFormatVO[] queryGoldTaxFormat(String var1) throws BusinessException;

    public void saveGoldTaxFormat(String var1, GoldTaxFormatVO[] var2) throws BusinessException;
}

