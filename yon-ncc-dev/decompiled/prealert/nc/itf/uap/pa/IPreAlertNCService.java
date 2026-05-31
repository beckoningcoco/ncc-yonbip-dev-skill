/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.BusinessException
 */
package nc.itf.uap.pa;

import java.util.List;
import nc.bs.pub.pa.PreAlertContext;
import nc.bs.pub.pa.PreAlertObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.pa.AlertmessageVO;
import nc.vo.pub.pa.AlertregistryVO;
import nc.vo.pub.pa.AlerttypeVO;
import nc.vo.pub.pa.customquery.IAlertQueryDef;

public interface IPreAlertNCService {
    public PreAlertObject executeSimpleAlertQuery(AlertregistryVO var1, PreAlertContext var2) throws BusinessException;

    public PreAlertObject executeComplexAlertQuery(AlertregistryVO var1, PreAlertContext var2) throws BusinessException;

    public String getIndustryCodeOfGroup(String var1) throws BusinessException;

    public IAlertQueryDef queryAlertQueryDefVOByPk(String var1) throws BusinessException;

    public void registerAppAsset(AlerttypeVO var1) throws BusinessException;

    public void deregisterAppAsset(AlerttypeVO var1) throws BusinessException;

    public String[] queryAssignedRoles(String var1, String var2) throws BusinessException;

    public List<AlertmessageVO> getAlertMsgs(String var1) throws BusinessException;
}

