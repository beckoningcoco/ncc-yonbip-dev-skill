/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.ISuperVO
 *  nc.vo.pub.SuperVO
 *  nc.vo.pubapp.pattern.model.entity.bill.AbstractBill
 *  nc.vo.pubapp.pattern.model.entity.bill.IBill
 *  nc.vo.pubapp.pattern.model.entity.view.AbstractDataView
 *  nc.vo.pubapp.pattern.pub.Constructor
 *  nccloud.commons.lang.ArrayUtils
 */
package nc.bs.arap.bill;

import nc.bs.arap.bill.CombineBill;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.ISuperVO;
import nc.vo.pub.SuperVO;
import nc.vo.pubapp.pattern.model.entity.bill.AbstractBill;
import nc.vo.pubapp.pattern.model.entity.bill.IBill;
import nc.vo.pubapp.pattern.model.entity.view.AbstractDataView;
import nc.vo.pubapp.pattern.pub.Constructor;
import nccloud.commons.lang.ArrayUtils;

public class ArapBillCombineUtil<E extends AbstractBill> {
    private Class<E> aggClass;
    private Class<SuperVO> headerClass;
    private Class<SuperVO> itemClass;

    public ArapBillCombineUtil(Class<?> aggClass, Class<?> headerClass, Class<?> itemClass) {
        this.aggClass = aggClass;
        this.headerClass = headerClass;
        this.itemClass = itemClass;
    }

    public E[] combineViewToAgg(AbstractDataView[] viewVOArray, String pkName) {
        if (ArrayUtils.isEmpty((Object[])viewVOArray)) {
            return null;
        }
        AbstractBill[] tempAggVO = (AbstractBill[])Constructor.construct(this.aggClass, (int)viewVOArray.length);
        int len = viewVOArray.length;
        for (int i = 0; i < len; ++i) {
            tempAggVO[i] = this.changeToBill(viewVOArray[i]);
        }
        CombineBill combine = new CombineBill();
        combine.appendKey(pkName);
        AbstractBill[] bills = (AbstractBill[])combine.combine((IBill[])tempAggVO);
        return bills;
    }

    private E changeToBill(AbstractDataView viewVO) {
        AbstractBill bill = (AbstractBill)Constructor.construct(this.aggClass);
        bill.setParent(viewVO.getVO(this.headerClass));
        ISuperVO[] items = (ISuperVO[])Constructor.declareArray(this.itemClass, (int)1);
        items[0] = viewVO.getVO(this.itemClass);
        bill.setChildrenVO((CircularlyAccessibleValueObject[])items);
        return (E)bill;
    }
}

