/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.itf.fi.pub.SysInit
 *  nc.vo.cmp.fields.IBillFieldAdapter
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.lang.UFDouble
 *  nc.vo.pubapp.calculator.Calculator
 *  nc.vo.pubapp.calculator.Condition
 *  nc.vo.pubapp.calculator.data.IDataSetForCal
 *  nc.vo.pubapp.calculator.data.IRelationForItems
 */
package nc.vo.arap.cal;

import nc.itf.fi.pub.SysInit;
import nc.vo.arap.cal.DataSetForCal;
import nc.vo.arap.global.ArapCommonTool;
import nc.vo.arap.scale.UIScaleUtils;
import nc.vo.arap.sysinit.SysinitConst;
import nc.vo.cmp.fields.IBillFieldAdapter;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.calculator.Calculator;
import nc.vo.pubapp.calculator.Condition;
import nc.vo.pubapp.calculator.data.IDataSetForCal;
import nc.vo.pubapp.calculator.data.IRelationForItems;

public class BillMathCalculator {
    private static BillMathCalculator instance = null;

    public static synchronized BillMathCalculator getInstance() {
        if (null == instance) {
            instance = new BillMathCalculator();
        }
        return instance;
    }

    public CircularlyAccessibleValueObject calculateVO(CircularlyAccessibleValueObject vo, String strChange, Integer syscode, IRelationForItems item) throws Exception {
        DataSetForCal data = new DataSetForCal(vo, item);
        Calculator tool = new Calculator((IDataSetForCal)data, UIScaleUtils.getScaleUtils());
        Condition cond = new Condition();
        cond.setIsCalLocalCurr(true);
        cond.setIsChgPriceOrDiscount(false);
        cond.setIsFixNchangerate(false);
        cond.setIsFixNqtunitrate(false);
        cond.setIsTaxOrNet(BillMathCalculator.getProior(syscode, (String)vo.getAttributeValue("pk_org")));
        tool.calculate(cond, strChange);
        return vo;
    }

    public CircularlyAccessibleValueObject calculateVO(CircularlyAccessibleValueObject vo, String strChange, Integer syscode, IBillFieldAdapter bfa) throws Exception {
        DataSetForCal data = new DataSetForCal(vo);
        Calculator tool = new Calculator((IDataSetForCal)data, null);
        Condition cond = new Condition();
        cond.setIsCalLocalCurr(true);
        cond.setIsChgPriceOrDiscount(false);
        cond.setIsFixNchangerate(false);
        cond.setIsFixNqtunitrate(false);
        cond.setIsTaxOrNet(BillMathCalculator.getProior(syscode, (String)vo.getAttributeValue("pk_org")));
        tool.calculate(cond, strChange);
        return vo;
    }

    public CircularlyAccessibleValueObject calculateVO(CircularlyAccessibleValueObject vo, String strChange, Integer syscode, IDataSetForCal data) throws Exception {
        Calculator tool = new Calculator(data, null);
        Condition cond = new Condition();
        cond.setIsCalLocalCurr(true);
        cond.setIsChgPriceOrDiscount(false);
        cond.setIsFixNchangerate(false);
        cond.setIsFixNqtunitrate(false);
        cond.setIsTaxOrNet(BillMathCalculator.getProior(syscode, (String)vo.getAttributeValue("pk_org")));
        tool.calculate(cond, strChange);
        return vo;
    }

    public CircularlyAccessibleValueObject changeBodyByYbje(CircularlyAccessibleValueObject item, CircularlyAccessibleValueObject head, IBillFieldAdapter bfa) throws Exception {
        UFDouble jfybje = (UFDouble)item.getAttributeValue(bfa.getIBillFieldGet().getFieldName("money_de"));
        String chgkey = null;
        chgkey = ArapCommonTool.isZero(jfybje) ? bfa.getIBillFieldGet().getFieldName("money_cr") : bfa.getIBillFieldGet().getFieldName("money_de");
        try {
            return this.calculateVO(item, chgkey, (Integer)head.getAttributeValue("syscode"), bfa);
        }
        catch (Exception e) {
            throw ExceptionHandler.handleException(this.getClass(), (Exception)e);
        }
    }

    public static boolean getProior(Integer syscode, String pk_org) throws Exception {
        String initkey = null;
        if (syscode == 0) {
            initkey = "AR21";
        } else if (syscode == 1) {
            initkey = "AP21";
        } else {
            return true;
        }
        String para = "";
        if (!"".equals(initkey)) {
            para = SysInit.getParaString((String)pk_org, (String)initkey);
        }
        return SysinitConst.ARAP21_TAX.equals(para);
    }
}

