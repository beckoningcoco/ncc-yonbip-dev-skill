/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.org.closeaccbook.check.CheckResultEnum
 *  nc.vo.pub.BusinessException
 */
package nc.itf.arap.termendtransact;

import java.util.Map;
import java.util.Vector;
import nc.itf.arap.termendtransact.CloseAccountVO;
import nc.vo.org.closeaccbook.check.CheckResultEnum;
import nc.vo.pub.BusinessException;

public interface ICloseAccountService {
    public void updateCloseAccountInfo(String var1, String var2, String var3, String var4) throws Exception;

    public void updateCloseAccountInfoBatch(String var1, Map<String, String> var2) throws Exception;

    public boolean[] isAccountClosed(CloseAccountVO[] var1) throws BusinessException;

    public boolean isAccountClosed(String var1, String var2, String var3, String var4) throws BusinessException;

    public String[] getCloseAccountInfo(String var1, String var2) throws BusinessException;

    public Map<String, String[]> getCloseAccountInfoBatch(String var1, String[] var2) throws BusinessException;

    public CheckResultEnum checkCloseAccResult(String var1, String var2, boolean var3, String var4) throws BusinessException;

    public Vector<Vector<String>> CheckCloseAccValue(String var1, String var2, boolean var3, String var4) throws BusinessException;
}

