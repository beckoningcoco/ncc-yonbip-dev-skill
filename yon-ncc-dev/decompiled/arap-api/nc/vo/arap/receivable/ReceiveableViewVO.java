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
package nc.vo.arap.receivable;

import nc.vo.arap.receivable.AggReceivableBillVO;
import nc.vo.arap.receivable.ReceivableBillItemVO;
import nc.vo.arap.receivable.ReceivableBillVO;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.ISuperVO;
import nc.vo.pubapp.pattern.model.entity.view.AbstractDataView;
import nc.vo.pubapp.pattern.model.meta.entity.view.DataViewMetaFactory;
import nc.vo.pubapp.pattern.model.meta.entity.view.IDataViewMeta;

public class ReceiveableViewVO
extends AbstractDataView {
    private static final long serialVersionUID = 1L;

    public IDataViewMeta getMetaData() {
        return DataViewMetaFactory.getInstance().getBillViewMeta(AggReceivableBillVO.class);
    }

    public ReceivableBillVO getHead() {
        return (ReceivableBillVO)this.getVO(ReceivableBillVO.class);
    }

    public void setHead(ReceivableBillVO head) {
        this.setVO((ISuperVO)head);
    }

    public ReceivableBillItemVO getBody() {
        return (ReceivableBillItemVO)this.getVO(ReceivableBillItemVO.class);
    }

    public void setBody(ReceivableBillItemVO body) {
        this.setVO((ISuperVO)body);
    }

    public AggReceivableBillVO changeToAggReceivableBillVO() {
        AggReceivableBillVO vo = new AggReceivableBillVO();
        vo.setParent((ISuperVO)this.getHead());
        ReceivableBillItemVO[] bodys = new ReceivableBillItemVO[]{this.getBody()};
        vo.setChildrenVO((CircularlyAccessibleValueObject[])bodys);
        return vo;
    }
}

