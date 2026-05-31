/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFDate
 */
package nc.itf.arap.bill;

import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDate;

public interface IArapBillBaseService<T extends BaseAggVO> {
    public void updatePrintFlag(String[] var1, UFDate var2) throws BusinessException;

    public String cleanPrintFlag(String[] var1) throws BusinessException;

    public void delete(T var1) throws BusinessException;

    public void delete(T[] var1) throws BusinessException;

    public T update(T var1) throws BusinessException;

    public T[] update(T[] var1) throws BusinessException;

    public T save(T var1) throws BusinessException;

    public T[] save(T[] var1) throws BusinessException;

    public T[] approve(T[] var1) throws BusinessException;

    public T[] unapprove(T[] var1) throws BusinessException;
}

