/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.arap.agiotage.AgiotageBzVO
 *  nc.vo.arap.agiotage.AgiotageMainVO
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.lang.UFDate
 *  nccloud.dto.arap.arappub.info.CommonInfo
 */
package nccloud.itf.arap.pub;

import nc.vo.arap.agiotage.AgiotageBzVO;
import nc.vo.arap.agiotage.AgiotageMainVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFDate;
import nccloud.dto.arap.arappub.info.CommonInfo;

public interface IArapCheckFrozenService {
    public int findFrozenBills(String var1, String var2, String[] var3) throws BusinessException;

    public SuperVO[] findFrozenLossAndRecByDate(String var1, UFDate var2, UFDate var3) throws BusinessException;

    public boolean checkFrozenForCloseAccount(String var1, String var2, String var3, String var4) throws BusinessException;

    public boolean checkFrozenForAgiotage(String var1, String var2, String var3, AgiotageBzVO[] var4) throws BusinessException;

    public CommonInfo[] checkFrozenBadDebtsBills(CommonInfo[] var1) throws BusinessException;

    public String[] filterMainTableFrozen(String[] var1) throws BusinessException;

    public boolean checkFrozenForCancelAgiotage(String var1, AgiotageMainVO[] var2) throws BusinessException;
}

