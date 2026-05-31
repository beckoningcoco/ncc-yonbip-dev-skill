/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.trade.pub.IExAggVO
 */
package nc.vo.arap.tally;

import java.util.List;
import java.util.Map;
import nc.vo.arap.tally.BalanceVO;
import nc.vo.pub.lang.UFDate;
import nc.vo.trade.pub.IExAggVO;

public class SuperTallyVO {
    private List<IExAggVO> IExAggVOList = null;
    private List<BalanceVO> balanceVOList = null;
    private Map<UFDate, List<String>> veriFinishedDateMap = null;

    public List<IExAggVO> getIExAggVOList() {
        return this.IExAggVOList;
    }

    public void setIExAggVOList(List<IExAggVO> iExAggVOList) {
        this.IExAggVOList = iExAggVOList;
    }

    public List<BalanceVO> getBalanceVOList() {
        return this.balanceVOList;
    }

    public void setBalanceVOList(List<BalanceVO> balanceVOList) {
        this.balanceVOList = balanceVOList;
    }

    public Map<UFDate, List<String>> getVeriFinishedDateMap() {
        return this.veriFinishedDateMap;
    }

    public void setVeriFinishedDateMap(Map<UFDate, List<String>> veriFinishedDateMap) {
        this.veriFinishedDateMap = veriFinishedDateMap;
    }
}

