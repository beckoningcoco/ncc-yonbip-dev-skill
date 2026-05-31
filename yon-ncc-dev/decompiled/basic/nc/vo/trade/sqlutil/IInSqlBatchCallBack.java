/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.trade.sqlutil;

import java.sql.SQLException;
import nc.vo.pub.BusinessException;

public interface IInSqlBatchCallBack {
    public Object doWithInSql(String var1) throws BusinessException, SQLException;
}

