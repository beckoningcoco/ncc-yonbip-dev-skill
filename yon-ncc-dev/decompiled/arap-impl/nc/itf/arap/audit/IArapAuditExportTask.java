/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFDate
 */
package nc.itf.arap.audit;

import java.sql.SQLException;
import java.util.List;
import nc.vo.arap.audit.APDetailVO;
import nc.vo.arap.audit.ARDetailVO;
import nc.vo.arap.audit.BillTypeVO;
import nc.vo.arap.audit.TradeTypeVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDate;

public interface IArapAuditExportTask {
    public List<BillTypeVO> getBilltypeVOs() throws SQLException, BusinessException;

    public List<TradeTypeVO> getTradetypeVOs() throws SQLException, BusinessException;

    public List<ARDetailVO> getArDetailVOs(String var1, UFDate var2, UFDate var3, boolean var4, List<String> var5) throws Exception;

    public List<APDetailVO> getApDetailVOs(String var1, UFDate var2, UFDate var3, boolean var4, List<String> var5) throws Exception;

    public List<Object> getArDetailSubjs(String var1, UFDate var2, UFDate var3, boolean var4, List<String> var5) throws Exception;

    public List<Object> getApDetailSubjs(String var1, UFDate var2, UFDate var3, boolean var4, List<String> var5) throws Exception;
}

