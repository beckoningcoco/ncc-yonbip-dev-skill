/*
 * Decompiled with CFR 0.152.
 */
package nc.itf.uap.pa;

import java.util.Map;
import nc.vo.pub.pa.AlertregistryVO;

public interface IPreAlertExecutorService {
    public void execute(AlertregistryVO var1, byte[] var2, Map<String, String> var3);
}

