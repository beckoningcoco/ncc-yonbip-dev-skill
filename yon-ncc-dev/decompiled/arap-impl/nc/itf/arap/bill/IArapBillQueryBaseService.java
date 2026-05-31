/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.ui.querytemplate.querytree.IQueryScheme
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.lang.UFDate
 */
package nc.itf.arap.bill;

import java.util.Map;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFDate;

public interface IArapBillQueryBaseService<T extends BaseAggVO> {
    public T[] queryBillByPKForPageQry(String[] var1) throws BusinessException;

    public T[] findBillByPrimaryKey(String[] var1) throws BusinessException;

    public T[] findBillByTopBillKey(String[] var1) throws BusinessException;

    public T[] findBillByTopItemKey(String[] var1) throws BusinessException;

    public T[] findBillBySrcBillKey(String[] var1) throws BusinessException;

    public T[] findBillBySrcItemKey(String[] var1) throws BusinessException;

    public CircularlyAccessibleValueObject[] queryChildrenByParentPk(String var1) throws BusinessException;

    public BaseItemVO[] queryChildrenByParentPks(String[] var1) throws BusinessException;

    public SuperVO[] queryChildrenByPks(String[] var1) throws BusinessException;

    public SuperVO[] queryChildrenTopItemsByPks(String[] var1) throws BusinessException;

    public Object[] queryByQueryScheme(IQueryScheme var1) throws BusinessException;

    public Map<String, UFDate> queryBusiDate(BaseItemVO[] var1);
}

