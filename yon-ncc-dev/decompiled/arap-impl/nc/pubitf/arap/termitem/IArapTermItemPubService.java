/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.bd.income.IncomeVO
 *  nc.vo.bd.payment.PaymentVO
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFDate
 */
package nc.pubitf.arap.termitem;

import java.util.List;
import java.util.Map;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.arap.termitem.TermVO;
import nc.vo.bd.income.IncomeVO;
import nc.vo.bd.payment.PaymentVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDate;

public interface IArapTermItemPubService {
    public TermVO[] insertTermVO(TermVO[] var1) throws BusinessException;

    public BaseAggVO updateTermItem(TermVO[] var1, BaseAggVO var2) throws BusinessException;

    public void deleteTermItem(String[] var1) throws BusinessException;

    public void deleteTermVOs(TermVO[] var1) throws BusinessException;

    public Map<String, UFDate> queryAccountDate(List<BaseItemVO> var1, Map<String, IncomeVO> var2);

    public Map<String, UFDate> queryPaymentAccountDate(List<BaseItemVO> var1, Map<String, PaymentVO> var2);

    public Map<String, UFDate> queryETAccountDate(List<BaseItemVO> var1, Map<String, IncomeVO> var2);

    public Map<String, UFDate> queryITAccountDate(List<BaseItemVO> var1, Map<String, PaymentVO> var2);
}

