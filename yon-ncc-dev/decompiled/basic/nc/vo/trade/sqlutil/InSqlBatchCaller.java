/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.trade.sqlutil;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import nc.vo.pub.BusinessException;
import nc.vo.trade.sqlutil.IInSqlBatchCallBack;

public class InSqlBatchCaller {
    ArrayList pks = new ArrayList();
    public final int GROUP_COUNT = 500;
    int group_size = 500;

    public InSqlBatchCaller(ArrayList pks) {
        this.pks = pks;
    }

    public InSqlBatchCaller(ArrayList pks, int group_size) {
        this.pks = pks;
        this.group_size = group_size > 10 ? group_size : 500;
    }

    public InSqlBatchCaller(String[] pks) {
        if (pks != null) {
            this.pks.addAll(Arrays.asList(pks));
        }
    }

    public InSqlBatchCaller(String[] pks, int group_size) {
        if (pks != null) {
            this.pks.addAll(Arrays.asList(pks));
        }
        this.group_size = group_size > 10 ? group_size : 500;
    }

    public Object execute(IInSqlBatchCallBack callBack) throws BusinessException, SQLException {
        Object result = null;
        int n = 0;
        StringBuffer buf = null;
        for (int i = 0; i < this.pks.size(); ++i) {
            if (++n == 1) {
                buf = new StringBuffer();
                buf.append("(");
            }
            buf.append("'");
            buf.append(this.pks.get(i));
            if (n != this.group_size && i != this.pks.size() - 1) {
                buf.append("',");
                continue;
            }
            buf.append("')");
            result = callBack.doWithInSql(buf.toString());
            n = 0;
        }
        return result;
    }
}

