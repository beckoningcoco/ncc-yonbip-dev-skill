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
package nc.vo.arap.supreceivable;

import nc.vo.arap.supreceivable.AggSupReceivableBillVO;
import nc.vo.arap.supreceivable.SupReceivableBillItemVO;
import nc.vo.arap.supreceivable.SupReceivableBillVO;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.ISuperVO;
import nc.vo.pubapp.pattern.model.entity.view.AbstractDataView;
import nc.vo.pubapp.pattern.model.meta.entity.view.DataViewMetaFactory;
import nc.vo.pubapp.pattern.model.meta.entity.view.IDataViewMeta;

public class SupReceivableBillViewVO
extends AbstractDataView {
    private static final long serialVersionUID = 1L;

    public IDataViewMeta getMetaData() {
        return DataViewMetaFactory.getInstance().getBillViewMeta(AggSupReceivableBillVO.class);
    }

    public SupReceivableBillVO getHead() {
        return (SupReceivableBillVO)this.getVO(SupReceivableBillVO.class);
    }

    public void setHead(SupReceivableBillVO head) {
        this.setVO((ISuperVO)head);
    }

    public SupReceivableBillItemVO getBody() {
        return (SupReceivableBillItemVO)this.getVO(SupReceivableBillItemVO.class);
    }

    public void setBody(SupReceivableBillItemVO body) {
        this.setVO((ISuperVO)body);
    }

    public AggSupReceivableBillVO changeToAggGatheringBillVO() {
        AggSupReceivableBillVO vo = new AggSupReceivableBillVO();
        vo.setParent((ISuperVO)this.getHead());
        SupReceivableBillItemVO[] bodys = new SupReceivableBillItemVO[]{this.getBody()};
        vo.setChildrenVO((CircularlyAccessibleValueObject[])bodys);
        return vo;
    }
}

