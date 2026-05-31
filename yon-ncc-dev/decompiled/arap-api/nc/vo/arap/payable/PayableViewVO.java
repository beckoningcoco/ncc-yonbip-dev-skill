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
package nc.vo.arap.payable;

import nc.vo.arap.payable.AggPayableBillVO;
import nc.vo.arap.payable.PayableBillItemVO;
import nc.vo.arap.payable.PayableBillVO;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.ISuperVO;
import nc.vo.pubapp.pattern.model.entity.view.AbstractDataView;
import nc.vo.pubapp.pattern.model.meta.entity.view.DataViewMetaFactory;
import nc.vo.pubapp.pattern.model.meta.entity.view.IDataViewMeta;

public class PayableViewVO
extends AbstractDataView {
    private static final long serialVersionUID = 1L;

    public IDataViewMeta getMetaData() {
        return DataViewMetaFactory.getInstance().getBillViewMeta(AggPayableBillVO.class);
    }

    public PayableBillVO getHead() {
        return (PayableBillVO)this.getVO(PayableBillVO.class);
    }

    public void setHead(PayableBillVO head) {
        this.setVO((ISuperVO)head);
    }

    public PayableBillItemVO getBody() {
        return (PayableBillItemVO)this.getVO(PayableBillItemVO.class);
    }

    public void setBody(PayableBillItemVO body) {
        this.setVO((ISuperVO)body);
    }

    public AggPayableBillVO changeToAggReceivableBillVO() {
        AggPayableBillVO vo = new AggPayableBillVO();
        vo.setParent((ISuperVO)this.getHead());
        PayableBillItemVO[] bodys = new PayableBillItemVO[]{this.getBody()};
        vo.setChildrenVO((CircularlyAccessibleValueObject[])bodys);
        return vo;
    }
}

