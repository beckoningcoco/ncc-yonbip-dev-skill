/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.SuperVO
 *  nc.vo.pubapp.pattern.pub.MapList
 */
package nc.pubitf.arap.bill;

import java.util.List;
import java.util.Map;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.SuperVO;
import nc.vo.pubapp.pattern.pub.MapList;

public interface IArapBillPubQueryService {
    public BaseAggVO getDefaultVO(BaseAggVO var1, boolean var2) throws BusinessException;

    public BaseAggVO[] findBillByPrimaryKey(String[] var1, String[] var2) throws BusinessException;

    public BaseAggVO[] findBillByTopBillKeys(String var1, String[] var2) throws BusinessException;

    public MapList<String, BaseAggVO> queryDownFlowBills(List<String> var1, String var2) throws BusinessException;

    public List<SuperVO> queryDownFlowItems(List<String> var1, String var2) throws BusinessException;

    public MapList<String, BaseAggVO> queryDownFlowBillsByBid(List<String> var1, String var2) throws BusinessException;

    public Map<String, String> getClassMap(List<String> var1) throws BusinessException;

    public AggregatedValueObject[] resetFlowDocDef(AggregatedValueObject[] var1) throws BusinessException;

    public BaseBillVO[] findUnConfirmBillsByPeriod(String var1, String var2, String[] var3) throws BusinessException;

    public boolean isExistBill(String[] var1, boolean var2, boolean var3) throws BusinessException;

    public boolean isClear(String var1);

    public boolean isExistBillByPuOrderPk(String var1) throws BusinessException;

    public List<String> getPageCodeByTranstype(String var1) throws BusinessException;
}

