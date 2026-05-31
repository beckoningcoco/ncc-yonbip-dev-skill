/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.BusinessException
 */
package nc.itf.arap.billconfer;

import java.util.List;
import java.util.Map;
import nc.vo.arap.billconfer.BCMiddleVO;
import nc.vo.arap.billconfer.BCParamVO;
import nc.vo.arap.billconfer.BillconferVO;
import nc.vo.pub.BusinessException;

public interface IBillConferQueryService {
    public BillconferVO[] findBillByPrimaryKeys(String[] var1);

    public BillconferVO[] queryVOBySrcTrade(String var1, String var2);

    public Map<String, List<BillconferVO>> queryVOBySrcTrade(String[] var1, String var2);

    public BillconferVO[] queryVOByDesTrade(String var1, String var2);

    public Map<String, List<BillconferVO>> queryVOByDesTrade(String[] var1, String var2);

    public BillconferVO[] queryVOByBothTrade(String var1, String var2);

    public Map<String, List<BillconferVO>> queryVOByBothTrade(String[] var1, String var2);

    public BCMiddleVO queryBillConfer(BCParamVO var1) throws BusinessException;
}

