/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pub.lang.UFDouble
 *  nccloud.commons.lang.StringUtils
 */
package nc.vo.arap.comreport;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import nc.utils.arap.ArapReportResource;
import nc.vo.arap.tally.AggRecStatementVO;
import nc.vo.arap.tally.RecStatementItemVO;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDouble;
import nccloud.commons.lang.StringUtils;

public class ArapStatementCalculator {
    private boolean showZeroNull = true;
    private static final String[] BODY_NUM_FLD = new String[]{"debt_qua", "debt_ori", "debt_loc", "gr_debt_loc", "gl_debt_loc", "credit_qua", "credit_ori", "credit_loc", "gr_credit_loc", "gl_credit_loc", "bal_qua", "bal_ori", "bal_loc", "gr_bal_loc", "gl_bal_loc"};

    public List<AggRecStatementVO> computeDateSubTotal(List<AggRecStatementVO> resultVOList) {
        String date = null;
        String preDate = null;
        RecStatementItemVO itemVO = null;
        for (AggRecStatementVO aggVo : resultVOList) {
            preDate = null;
            RecStatementItemVO[] itemVOs = (RecStatementItemVO[])aggVo.getChildrenVO();
            HashMap<String, RecStatementItemVO> dateTotalVOMap = new HashMap<String, RecStatementItemVO>();
            ArrayList<RecStatementItemVO> resultItemVOs = new ArrayList<RecStatementItemVO>();
            for (int i = 0; i < itemVOs.length; ++i) {
                if (StringUtils.isEmpty((CharSequence)itemVOs[i].getTallydate())) {
                    resultItemVOs.add(this.setBodyVONum2Null(itemVOs[i]));
                    continue;
                }
                date = new UFDate(itemVOs[i].getTallydate()).toStdString();
                if (dateTotalVOMap.get(date) == null) {
                    itemVO = new RecStatementItemVO();
                    itemVO.setTallydate(ArapReportResource.getDateSubTotalLbl());
                    itemVO.setDebt_qua(UFDouble.ZERO_DBL);
                    itemVO.setDebt_ori(UFDouble.ZERO_DBL);
                    itemVO.setDebt_loc(UFDouble.ZERO_DBL);
                    itemVO.setGr_debt_loc(UFDouble.ZERO_DBL);
                    itemVO.setGl_debt_loc(UFDouble.ZERO_DBL);
                    itemVO.setCredit_qua(UFDouble.ZERO_DBL);
                    itemVO.setCredit_ori(UFDouble.ZERO_DBL);
                    itemVO.setCredit_loc(UFDouble.ZERO_DBL);
                    itemVO.setGr_credit_loc(UFDouble.ZERO_DBL);
                    itemVO.setGl_credit_loc(UFDouble.ZERO_DBL);
                    dateTotalVOMap.put(date, itemVO);
                }
                ((RecStatementItemVO)((Object)dateTotalVOMap.get(date))).setDebt_qua(((RecStatementItemVO)((Object)dateTotalVOMap.get(date))).getDebt_qua().add(itemVOs[i].getDebt_qua()));
                ((RecStatementItemVO)((Object)dateTotalVOMap.get(date))).setDebt_ori(((RecStatementItemVO)((Object)dateTotalVOMap.get(date))).getDebt_ori().add(itemVOs[i].getDebt_ori()));
                ((RecStatementItemVO)((Object)dateTotalVOMap.get(date))).setDebt_loc(((RecStatementItemVO)((Object)dateTotalVOMap.get(date))).getDebt_loc().add(itemVOs[i].getDebt_loc()));
                ((RecStatementItemVO)((Object)dateTotalVOMap.get(date))).setGr_debt_loc(((RecStatementItemVO)((Object)dateTotalVOMap.get(date))).getGr_debt_loc().add(itemVOs[i].getGr_debt_loc()));
                ((RecStatementItemVO)((Object)dateTotalVOMap.get(date))).setGl_debt_loc(((RecStatementItemVO)((Object)dateTotalVOMap.get(date))).getGl_debt_loc().add(itemVOs[i].getGl_debt_loc()));
                ((RecStatementItemVO)((Object)dateTotalVOMap.get(date))).setCredit_qua(((RecStatementItemVO)((Object)dateTotalVOMap.get(date))).getCredit_qua().add(itemVOs[i].getCredit_qua()));
                ((RecStatementItemVO)((Object)dateTotalVOMap.get(date))).setCredit_ori(((RecStatementItemVO)((Object)dateTotalVOMap.get(date))).getCredit_ori().add(itemVOs[i].getCredit_ori()));
                ((RecStatementItemVO)((Object)dateTotalVOMap.get(date))).setCredit_loc(((RecStatementItemVO)((Object)dateTotalVOMap.get(date))).getCredit_loc().add(itemVOs[i].getCredit_loc()));
                ((RecStatementItemVO)((Object)dateTotalVOMap.get(date))).setGr_credit_loc(((RecStatementItemVO)((Object)dateTotalVOMap.get(date))).getGr_credit_loc().add(itemVOs[i].getGr_credit_loc()));
                ((RecStatementItemVO)((Object)dateTotalVOMap.get(date))).setGl_credit_loc(((RecStatementItemVO)((Object)dateTotalVOMap.get(date))).getGl_credit_loc().add(itemVOs[i].getGl_credit_loc()));
                if (preDate != null && !date.equals(preDate)) {
                    itemVO = (RecStatementItemVO)((Object)dateTotalVOMap.get(preDate));
                    itemVO.setBal_qua(itemVOs[i - 1].getBal_qua());
                    itemVO.setBal_ori(itemVOs[i - 1].getBal_ori());
                    itemVO.setBal_loc(itemVOs[i - 1].getBal_loc());
                    itemVO.setGr_bal_loc(itemVOs[i - 1].getGr_bal_loc());
                    itemVO.setGl_bal_loc(itemVOs[i - 1].getGl_bal_loc());
                    resultItemVOs.add(this.setBodyVONum2Null((RecStatementItemVO)((Object)dateTotalVOMap.get(preDate))));
                }
                resultItemVOs.add(this.setBodyVONum2Null(itemVOs[i]));
                preDate = date;
                if (i != itemVOs.length - 2) continue;
                itemVO = (RecStatementItemVO)((Object)dateTotalVOMap.get(preDate));
                itemVO.setBal_qua(itemVOs[i].getBal_qua());
                itemVO.setBal_ori(itemVOs[i].getBal_ori());
                itemVO.setBal_loc(itemVOs[i].getBal_loc());
                itemVO.setGr_bal_loc(itemVOs[i].getGr_bal_loc());
                itemVO.setGl_bal_loc(itemVOs[i].getGl_bal_loc());
                resultItemVOs.add(this.setBodyVONum2Null(itemVO));
            }
            aggVo.setChildrenVO((CircularlyAccessibleValueObject[])resultItemVOs.toArray(new RecStatementItemVO[0]));
        }
        return resultVOList;
    }

    public boolean isShowZeroNull() {
        return this.showZeroNull;
    }

    public void setShowZeroNull(boolean showZeroNull) {
        this.showZeroNull = showZeroNull;
    }

    private RecStatementItemVO setBodyVONum2Null(RecStatementItemVO bodyVO) {
        if (this.isShowZeroNull()) {
            UFDouble val = null;
            for (String body_fld : BODY_NUM_FLD) {
                val = (UFDouble)bodyVO.getAttributeValue(body_fld);
                if (ArapReportResource.getDateSubTotalLbl().equals(bodyVO.getTallydate()) || ArapReportResource.getAllTotalLbl().equals(bodyVO.getBrief()) || !UFDouble.ZERO_DBL.equals((Object)val)) continue;
                bodyVO.setAttributeValue(body_fld, null);
            }
        }
        return bodyVO;
    }
}

