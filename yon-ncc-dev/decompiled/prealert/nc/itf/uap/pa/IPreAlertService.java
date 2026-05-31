/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFDate
 */
package nc.itf.uap.pa;

import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDate;

public interface IPreAlertService {
    public String[][] getMessageAlertFileNameByEnter(String var1, String var2, String var3, UFDate var4, String var5, String var6) throws BusinessException;

    public String[] showMessageAlertFileNameByButton(String var1, UFDate var2, String var3, String var4, Object var5) throws BusinessException;

    public String[] showMessageAlertFileNameByLogin(String var1, String var2, UFDate var3, String var4) throws BusinessException;
}

