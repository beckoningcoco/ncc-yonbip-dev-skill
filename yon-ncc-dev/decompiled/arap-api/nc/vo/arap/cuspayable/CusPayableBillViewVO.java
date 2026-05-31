/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.ISuperVO
 *  nc.vo.pubapp.pattern.model.entity.view.AbstractDataView
 *  nc.vo.pubapp.pattern.model.meta.entity.view.DataViewMetaFactory
 *  nc.vo.pubapp.pattern.model.meta.entity.view.IDataViewMeta
 */
package nc.vo.arap.cuspayable;

import nc.vo.arap.cuspayable.AggCusPayableBillVO;
import nc.vo.arap.cuspayable.CusPayableBillItemVO;
import nc.vo.arap.cuspayable.CusPayableBillVO;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.ISuperVO;
import nc.vo.pubapp.pattern.model.entity.view.AbstractDataView;
import nc.vo.pubapp.pattern.model.meta.entity.view.DataViewMetaFactory;
import nc.vo.pubapp.pattern.model.meta.entity.view.IDataViewMeta;

public class CusPayableBillViewVO
extends AbstractDataView {
    private static final long serialVersionUID = 1L;

    public IDataViewMeta getMetaData() {
        return DataViewMetaFactory.getInstance().getBillViewMeta(AggCusPayableBillVO.class);
    }

    public CusPayableBillVO getHead() {
        return (CusPayableBillVO)this.getVO(CusPayableBillVO.class);
    }

    public void setHead(CusPayableBillVO head) {
        this.setVO((ISuperVO)head);
    }

    public CusPayableBillItemVO getBody() {
        return (CusPayableBillItemVO)this.getVO(CusPayableBillItemVO.class);
    }

    public void setBody(CusPayableBillItemVO body) {
        this.setVO((ISuperVO)body);
    }

    public AggCusPayableBillVO changeToAggGatheringBillVO() {
        AggCusPayableBillVO vo = new AggCusPayableBillVO();
        vo.setParent((ISuperVO)this.getHead());
        CusPayableBillItemVO[] bodys = new CusPayableBillItemVO[]{this.getBody()};
        vo.setChildrenVO((CircularlyAccessibleValueObject[])bodys);
        return vo;
    }
}

