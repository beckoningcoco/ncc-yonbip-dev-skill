/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.BusinessException
 */
package nc.pubitf.arap.termitem;

import java.util.List;
import java.util.Map;
import nc.vo.arap.termitem.TermVO;
import nc.vo.pub.BusinessException;

public interface IArapTermItemPubQueryService {
    public TermVO[] queryTermVOByBillParentPK(String[] var1) throws BusinessException;

    @Deprecated
    public TermVO[] queryTermVOByBillParentPKForPayApply(String[] var1) throws BusinessException;

    public TermVO[] queryTermVOByBillItemPKForPayApply(String[] var1) throws BusinessException;

    public Map<String, List<TermVO>> queryTermVOMapByBillItemPKForPayApply(String[] var1) throws BusinessException;

    public TermVO[] queryTermVOByTermPK(String[] var1) throws BusinessException;

    public TermVO[] queryTermVOByBillItemPK(String[] var1) throws BusinessException;

    public TermVO[] queryTermVOByBillItemPK(String[] var1, boolean var2) throws BusinessException;

    public TermVO[] queryTermVOByTermPKAndWhere(String[] var1, String var2) throws BusinessException;
}

