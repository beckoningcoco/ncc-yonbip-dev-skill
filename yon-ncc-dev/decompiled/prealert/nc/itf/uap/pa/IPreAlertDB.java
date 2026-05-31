/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFBoolean
 */
package nc.itf.uap.pa;

import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.pa.AlertmessageVO;
import nc.vo.pub.pa.AlertregistryVO;
import nc.vo.pub.pa.AlerttypeVO;

public interface IPreAlertDB {
    public void insertTaskLog_RequiresNew(AlertregistryVO var1, long var2, boolean var4, String var5) throws BusinessException;

    public String[] insertAlertType(AlerttypeVO[] var1) throws BusinessException;

    public int updateAlertType(AlerttypeVO[] var1) throws BusinessException;

    public void deleteAlertTypeByPk(String[] var1) throws BusinessException;

    public String[] insertMessages(AlertmessageVO[] var1) throws BusinessException;

    public AlertmessageVO[] insertMessagesReturnVO(AlertmessageVO[] var1, String var2) throws BusinessException;

    public void deleteMessages(String[] var1) throws BusinessException;

    public void updateMessageState(String[] var1, UFBoolean var2, String var3) throws BusinessException;
}

