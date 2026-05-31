/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.BusinessException
 */
package nc.pubitf.arap.djlx;

import java.util.ArrayList;
import java.util.Hashtable;
import nc.vo.arap.bdcontrastinfo.BdcontrastinfoVO;
import nc.vo.arap.djlx.BillTypeVO;
import nc.vo.arap.djlx.DjLXVO;
import nc.vo.pub.BusinessException;

public interface IBillTypePublic {
    public DjLXVO[] queryAllBillTypeByGroup(String var1) throws BusinessException;

    public void deleteBillType(BillTypeVO var1) throws BusinessException;

    public BillTypeVO insertBillType(BillTypeVO var1) throws BusinessException;

    public DjLXVO getDjlxvoByDjlxbm(String var1, String var2) throws BusinessException;

    public Hashtable<String, String> getDjlxbmbyBillPks(String var1, ArrayList var2, Hashtable<String, String> var3) throws BusinessException;

    public BdcontrastinfoVO[] queryAllBdcontrastinfoVO(String var1) throws BusinessException;

    public DjLXVO[] getBillTypesByWhere(String var1) throws BusinessException;

    public DjLXVO[] getBillSsCtlTypes(String var1) throws BusinessException;

    public BillTypeVO updateBillType(BillTypeVO var1) throws BusinessException;

    public BillTypeVO[] queryBillType(String var1) throws BusinessException;

    public BillTypeVO[] queryBillTypeByBillTypeCode(String var1, String var2) throws BusinessException;

    public DjLXVO[] queryBillTypeByBillTypeCode(String[] var1, String var2) throws BusinessException;

    public void copySystemplete(String var1, String var2) throws BusinessException;
}

