/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.cache.ARAPFormatThreadCache
 *  nc.bs.logging.Logger
 *  nc.ui.pub.print.IDataSource
 *  nc.vo.arap.prealarm.ArapPrealarmBaseVO
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.pub.BeanHelper
 *  nc.vo.pub.format.NumberFormat
 *  nc.vo.pub.format.exception.FormatException
 *  nc.vo.pub.lang.UFDouble
 */
package nc.impl.arap.prealarm;

import java.util.List;
import nc.bs.arap.cache.ARAPFormatThreadCache;
import nc.bs.logging.Logger;
import nc.ui.pub.print.IDataSource;
import nc.vo.arap.prealarm.ArapPrealarmBaseVO;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.pub.BeanHelper;
import nc.vo.pub.format.NumberFormat;
import nc.vo.pub.format.exception.FormatException;
import nc.vo.pub.lang.UFDouble;

public class ArapPrealarmDataSource
implements IDataSource {
    private static final long serialVersionUID = 7795887116527675694L;
    private List<ArapPrealarmBaseVO> datas = null;
    private Class<? extends ArapPrealarmBaseVO> clzz = null;

    public ArapPrealarmDataSource(List<ArapPrealarmBaseVO> datas, Class<? extends ArapPrealarmBaseVO> clzz) {
        this.datas = datas;
        this.clzz = clzz;
    }

    public String[] getAllDataItemExpress() {
        try {
            return BeanHelper.getInstance().getPropertiesAry((Object)this.clzz.newInstance());
        }
        catch (Exception e) {
            ExceptionHandler.consume(this.getClass(), (Throwable)e);
            return new String[0];
        }
    }

    public String[] getItemValuesByExpress(String itemExpress) {
        if (this.datas == null || this.datas.size() == 0) {
            return null;
        }
        String[] colValues = new String[this.datas.size()];
        Object propVal = null;
        for (int i = 0; i < this.datas.size(); ++i) {
            propVal = BeanHelper.getProperty((Object)this.datas.get(i), (String)itemExpress);
            if (propVal instanceof UFDouble) {
                propVal = this.formatUFDouble((UFDouble)propVal);
            }
            colValues[i] = propVal == null ? null : propVal.toString();
        }
        return colValues;
    }

    public String formatUFDouble(UFDouble value) {
        if (value == null || value.equals((Object)UFDouble.ZERO_DBL)) {
            return null;
        }
        String formatvalue = null;
        try {
            NumberFormat nf = ARAPFormatThreadCache.getInstance().getNumberFormat();
            formatvalue = nf.format((Object)value).getValue();
        }
        catch (FormatException e) {
            Logger.error((Object)e.getMessage(), (Throwable)e);
            StringBuffer r = new StringBuffer(64);
            if (value != null) {
                if (value.equals((Object)new UFDouble(0))) {
                    return null;
                }
                String str = value.toString().trim();
                if (str.length() != 0) {
                    int index = str.indexOf(46);
                    if (index >= 0) {
                        r.append(str.substring(index));
                        str = str.substring(0, index);
                    }
                    while (str.length() > 0) {
                        int step = str.length() - 3;
                        step = step < 0 ? 0 : step;
                        r.insert(0, str.substring(step));
                        str = str.substring(0, step);
                        if (step <= 0 || str.equals("-")) continue;
                        r.insert(0, ',');
                    }
                }
            }
            return r.toString();
        }
        return formatvalue;
    }

    public String[] getAllDataItemNames() {
        return null;
    }

    public String[] getDependentItemExpressByExpress(String itemExpress) {
        return null;
    }

    public String getModuleName() {
        return null;
    }

    public boolean isNumber(String itemExpress) {
        return false;
    }

    public List<ArapPrealarmBaseVO> getDatas() {
        return this.datas;
    }

    public void setDatas(List<ArapPrealarmBaseVO> datas) {
        this.datas = datas;
    }

    public Class<? extends ArapPrealarmBaseVO> getClzz() {
        return this.clzz;
    }

    public void setClzz(Class<? extends ArapPrealarmBaseVO> clzz) {
        this.clzz = clzz;
    }
}

