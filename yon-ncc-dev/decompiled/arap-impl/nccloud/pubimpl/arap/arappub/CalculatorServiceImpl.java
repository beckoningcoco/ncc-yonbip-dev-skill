/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pubapp.calculator.Calculator
 *  nc.vo.pubapp.calculator.Condition
 *  nccloud.pubitf.arap.arappub.ICalculatorService
 */
package nccloud.pubimpl.arap.arappub;

import nc.vo.pubapp.calculator.Calculator;
import nc.vo.pubapp.calculator.Condition;
import nccloud.pubitf.arap.arappub.ICalculatorService;

public class CalculatorServiceImpl
implements ICalculatorService {
    public void calculate(Calculator tool, Condition cond, String key) {
        tool.calculate(cond, key);
    }
}

