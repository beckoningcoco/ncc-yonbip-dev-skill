/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.logging.Logger
 *  nc.vo.jcom.lang.StringUtil
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pub.lang.UFDouble
 *  nc.vo.pub.para.SysInitVO
 *  nc.vo.pubapp.pattern.exception.ExceptionUtils
 */
package nc.vo.arap.goldentax;

import java.io.Serializable;
import java.util.Map;
import nc.bs.framework.common.NCLocator;
import nc.bs.logging.Logger;
import nc.itf.arap.goldentax.IGoldTaxFormatService;
import nc.itf.arap.goldentax.SysParaInitQuery;
import nc.vo.jcom.lang.StringUtil;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pub.para.SysInitVO;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

public class Configuration
implements Serializable {
    public static final String CODE_INTEGERQUANTITY = "AR55";
    public static final String CODE_MAXNOTAXMNY = "AR54";
    public static final String CODE_MAXROW = "AR56";
    public static final String CODE_MERGE = "AR5101";
    public static final String CUSTOMER_DISCOUNTMODE = "goldtaxDiscountMode";
    public static final String CUSTOMER_SPLIT = "goldtaxSplit";
    private static final int MARCLASS = 2;
    private static final int MATERIAL = 1;
    private static final int MUTIBILL = 8;
    private static final int PRICE = 4;
    private static final long serialVersionUID = 7302332938284549011L;
    private DiscountMode discountMode = DiscountMode.PERCENT;
    private boolean integerQuantityOverMny;
    private UFDouble maxNoTaxMny;
    private int maxRows = -1;
    private boolean mergeMarClass;
    private boolean mergeMaterial = true;
    private boolean mergeMutiBill;
    private boolean mergePrice;
    private String pkOrg;
    private String split = "~~";

    public Configuration(String pkOrg) {
        this.pkOrg = pkOrg;
    }

    public static Configuration load(String pkOrg) {
        Integer mergeValue;
        Configuration conf = new Configuration(pkOrg);
        IGoldTaxFormatService paraQuery = (IGoldTaxFormatService)NCLocator.getInstance().lookup(IGoldTaxFormatService.class);
        Map<String, Object> scmparas = null;
        try {
            scmparas = paraQuery.getARAPParas(pkOrg, new String[]{CODE_MERGE, CODE_MAXNOTAXMNY, CODE_INTEGERQUANTITY, CODE_MAXROW, CUSTOMER_SPLIT, CUSTOMER_DISCOUNTMODE});
        }
        catch (BusinessException e1) {
            ExceptionUtils.wrappException((Exception)((Object)e1));
        }
        if (null == scmparas) {
            Logger.error((Object)"\u53c2\u6570\u52a0\u8f7d\u5931\u8d25\uff0c\u7528\u9ed8\u8ba4\u503c");
            ExceptionUtils.wrappBusinessException((String)"\u53c2\u6570\u52a0\u8f7d\u5931\u8d25\uff0c\u7528\u9ed8\u8ba4\u503c");
            return null;
        }
        try {
            mergeValue = (Integer)scmparas.get(CODE_MERGE);
            if (null == mergeValue) {
                mergeValue = 1;
            }
            conf.setMergeValue(mergeValue);
        }
        catch (Exception e) {
            Logger.error((Object)"\u53c2\u6570[AR5101]\u52a0\u8f7d\u5931\u8d25\uff0c\u7528\u9ed8\u8ba4\u503c", (Throwable)e);
        }
        try {
            UFDouble maxNoTaxMny = (UFDouble)scmparas.get(CODE_MAXNOTAXMNY);
            conf.setMaxNoTaxMny(maxNoTaxMny);
        }
        catch (Exception e) {
            Logger.error((Object)"\u53c2\u6570[AR54]\u52a0\u8f7d\u5931\u8d25\uff0c\u7528\u9ed8\u8ba4\u503c", (Throwable)e);
        }
        try {
            UFBoolean integer = (UFBoolean)scmparas.get(CODE_INTEGERQUANTITY);
            conf.setIntegerQuantityOverMny(integer.booleanValue());
        }
        catch (Exception e) {
            Logger.error((Object)"\u53c2\u6570[AR55]\u52a0\u8f7d\u5931\u8d25\uff0c\u7528\u9ed8\u8ba4\u503c", (Throwable)e);
        }
        try {
            mergeValue = (Integer)scmparas.get(CODE_MAXROW);
            if (null == mergeValue) {
                mergeValue = -1;
            }
            conf.setMaxRows(mergeValue);
        }
        catch (Exception e) {
            Logger.error((Object)"\u53c2\u6570[AR56]\u52a0\u8f7d\u5931\u8d25\uff0c\u7528\u9ed8\u8ba4\u503c", (Throwable)e);
        }
        try {
            String docString = (String)scmparas.get(CUSTOMER_SPLIT);
            if (!StringUtil.isEmpty((String)docString)) {
                conf.setSplit(docString);
            }
            docString = (String)scmparas.get(CUSTOMER_DISCOUNTMODE);
            conf.setDiscountMode(DiscountMode.get(docString));
        }
        catch (Exception e) {
            Logger.error((Object)"\u4ece\u914d\u7f6e\u6587\u4ef6\u8bfb\u53d6\u4fe1\u606f\u51fa\u9519", (Throwable)e);
        }
        return conf;
    }

    public DiscountMode getDiscountMode() {
        return this.discountMode;
    }

    public UFDouble getMaxNoTaxMny() {
        return this.maxNoTaxMny;
    }

    public int getMaxRows() {
        return this.maxRows;
    }

    public SysInitVO getMergeSysinit() {
        SysInitVO[] sysInitVO = SysParaInitQuery.querySysInit(" pk_org='" + this.pkOrg + "' and initcode='" + CODE_MERGE + "'");
        sysInitVO[0].setValue("" + this.getMergeValue());
        return sysInitVO[0];
    }

    public String getSplit() {
        return this.split;
    }

    public boolean isIntegerQuantityOverMny() {
        return this.integerQuantityOverMny;
    }

    public boolean isMergeMutiBill() {
        return this.mergeMutiBill;
    }

    public boolean isMergeNone() {
        return 0 == this.getMergeValue();
    }

    public boolean isMergePrice() {
        return this.mergePrice;
    }

    public void setDiscountMode(DiscountMode mode) {
        this.discountMode = mode;
    }

    public void setIntegerQuantityOverMny(boolean integerQuantityOverMny) {
        this.integerQuantityOverMny = integerQuantityOverMny;
    }

    public void setMaxNoTaxMny(UFDouble maxNoTaxMny) {
        this.maxNoTaxMny = maxNoTaxMny;
    }

    public void setMaxRows(int maxRows) {
        this.maxRows = maxRows;
    }

    public void setMergeMutiBill(boolean mergeMutiBill) {
        this.mergeMutiBill = mergeMutiBill;
    }

    public void setMergePrice(boolean mergePrice) {
        this.mergePrice = mergePrice;
    }

    public void setSplit(String split) {
        this.split = split;
    }

    public boolean isMergeMarClass() {
        return this.mergeMarClass;
    }

    public void setMergeMarClass(boolean mergeMarClass) {
        this.mergeMarClass = mergeMarClass;
    }

    public boolean isMergeMaterial() {
        return this.mergeMaterial;
    }

    public void setMergeMaterial(boolean mergeMaterial) {
        this.mergeMaterial = mergeMaterial;
    }

    private int getMergeValue() {
        int value = 0;
        if (this.mergeMaterial) {
            value |= 1;
        }
        if (this.mergeMarClass) {
            value |= 2;
        }
        if (this.mergePrice) {
            value |= 4;
        }
        if (this.mergeMutiBill) {
            value |= 8;
        }
        return value;
    }

    private void setMergeValue(int value) {
        this.mergeMaterial = 1 == (value & 1);
        this.mergeMarClass = 2 == (value & 2);
        this.mergePrice = 4 == (value & 4);
        this.mergeMutiBill = 8 == (value & 8);
    }

    public static enum DiscountMode {
        DECIMAL("1"),
        NONE("0"),
        PERCENT("100");

        private UFDouble base = UFDouble.ZERO_DBL;

        private DiscountMode(String m) {
            this.base = new UFDouble(m);
        }

        static DiscountMode get(String m) {
            if ("1".equals(m)) {
                return DECIMAL;
            }
            if ("100".equals(m)) {
                return PERCENT;
            }
            return NONE;
        }

        public String format(UFDouble dRate) {
            return null == dRate ? null : dRate.multiply(this.base).toString();
        }
    }
}

