/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.BusinessException
 */
package nc.itf.arap.param;

import nc.itf.arap.termendtransact.CloseAccountVO;
import nc.vo.arap.param.ParamVO;
import nc.vo.pub.BusinessException;

public interface IArapParamService {
    public ParamVO queryParamByParamPk(String var1) throws BusinessException;

    public ParamVO[] queryAllParamsByPk_org(String var1) throws BusinessException;

    public ParamVO[] queryParamByCode(CloseAccountVO[] var1) throws BusinessException;

    public ParamVO queryParamByCode(String var1, String var2, Integer var3) throws BusinessException;

    public ParamVO[] queryParamByCode(String[] var1, String var2, Integer var3) throws BusinessException;

    public ParamVO[] queryParamsByCode(String var1, String var2, Integer var3) throws BusinessException;

    public void updateParams(ParamVO[] var1) throws BusinessException;

    public void insertParams(ParamVO[] var1) throws BusinessException;
}

