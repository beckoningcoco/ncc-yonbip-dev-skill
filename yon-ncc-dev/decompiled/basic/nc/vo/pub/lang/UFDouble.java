/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.pub.lang;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.StringTokenizer;

public class UFDouble
extends Number
implements Serializable,
Comparable {
    static final long serialVersionUID = -809396813980155342L;
    private int power = -8;
    public static final int ROUND_UP = 0;
    public static final int ROUND_DOWN = 1;
    public static final int ROUND_CEILING = 2;
    public static final int ROUND_FLOOR = 3;
    public static final int ROUND_HALF_UP = 4;
    public static final int ROUND_HALF_DOWN = 5;
    public static final int ROUND_HALF_EVEN = 6;
    public static final int ROUND_UNNECESSARY = 7;
    private static final int ARRAY_LENGTH = 5;
    private static final int EFFICIENCY_SEATE = 16;
    private static final long MAX_ONELONG_VALUE = 10000000000000000L;
    private static final long[] POWER_ARRAY = new long[18];
    public static final int ROUND_TO_ZERO_AND_HALF = 8;
    private byte si = 1;
    private long[] v = new long[5];
    public static UFDouble ONE_DBL;
    public static UFDouble ZERO_DBL;
    public static final int DEFAULT_POWER = -8;
    private boolean trimZero = false;

    public UFDouble() {
    }

    public UFDouble(double d) throws NumberFormatException {
        this(d, -8);
    }

    public UFDouble(double d, int newPower) throws NumberFormatException {
        this.setValue(d, newPower);
    }

    public UFDouble(int d) {
        this((long)d);
    }

    public UFDouble(int d, int pow) {
        this((long)d, pow);
    }

    public UFDouble(long d) {
        this(d, -8);
    }

    public UFDouble(long d, int pow) throws NumberFormatException {
        this((double)d + 0.0, pow);
    }

    public UFDouble(long[] dv, byte si, int pow) throws NumberFormatException {
        if (dv == null || dv.length != 5) {
            throw new NumberFormatException("array length must be 5");
        }
        this.v = dv;
        this.si = si;
        this.power = pow;
    }

    public UFDouble(Double d) throws NumberFormatException {
        this(d, -8);
    }

    public UFDouble(String str) throws NumberFormatException {
        this.initByString(str);
    }

    private void initByString(String str) {
        String s = "";
        int npower = -8;
        if (str == null || str.trim().length() == 0) {
            s = "0";
        } else {
            StringTokenizer token = new StringTokenizer(str, ",");
            while (token.hasMoreElements()) {
                s = s + token.nextElement().toString();
            }
            int pos = s.indexOf(101);
            int n = pos = pos < 0 ? s.indexOf(69) : pos;
            if (pos >= 0) {
                try {
                    npower = Integer.parseInt(s.substring(pos + 1));
                }
                catch (Throwable t) {
                    npower = -8;
                }
                npower = this.getEPower(s, npower, pos);
                this.setValue(Double.parseDouble(s), npower);
                return;
            }
            if (s.charAt(0) == '-') {
                this.si = (byte)-1;
                s = s.substring(1);
            } else if (s.charAt(0) == '+') {
                s = s.substring(1);
            }
        }
        int loc = s.indexOf(46);
        npower = loc >= 0 ? s.length() - (loc + 1) : 0;
        this.fromString(npower, s);
    }

    private int getEPower(String s, int ePower, int eindex) {
        int decimalIndex = s.indexOf(".");
        boolean hasDecimalDot = decimalIndex > 0;
        int revisePower = 0;
        if (hasDecimalDot) {
            int decimaDigits = eindex - decimalIndex - 1;
            revisePower = ePower > 0 ? (ePower - decimaDigits >= 0 ? 0 : ePower - decimaDigits) : ePower - decimaDigits;
        } else {
            revisePower = ePower >= 0 ? 0 : ePower;
        }
        return revisePower;
    }

    public UFDouble(String str, int newPower) throws NumberFormatException {
        String s = "";
        if (str == null || str.trim().length() == 0) {
            s = "0";
        } else {
            StringTokenizer token = new StringTokenizer(str, ",");
            while (token.hasMoreElements()) {
                s = s + token.nextElement().toString();
            }
            if (s.indexOf(101) >= 0 || s.indexOf(69) >= 0) {
                this.setValue(Double.parseDouble(s), UFDouble.getValidPower(newPower));
                return;
            }
            if (s.charAt(0) == '-') {
                this.si = (byte)-1;
                s = s.substring(1);
            } else if (s.charAt(0) == '+') {
                s = s.substring(1);
            }
        }
        this.fromString(newPower, s);
    }

    private void fromString(int newPower, String s) {
        newPower = UFDouble.getValidPower(newPower);
        int loc = s.indexOf(46);
        if (loc >= 0) {
            String s1 = s.substring(loc + 1);
            if (s1.length() > -newPower) {
                s1 = -newPower >= 16 ? s1.substring(0, 16) : s1.substring(0, 1 - newPower);
            }
            this.power = newPower;
            for (int i = s1.length(); i < 16; ++i) {
                s1 = s1 + "0";
            }
            this.v[0] = Long.parseLong(s1);
            s = s.substring(0, loc);
        } else {
            this.power = newPower;
            this.v[0] = 0L;
        }
        int len = s.length();
        int sitLoc = 1;
        while (len > 0) {
            String s1 = "";
            if (len > 16) {
                s1 = s.substring(len - 16);
                s = s.substring(0, len - 16);
            } else {
                s1 = s;
                s = "";
            }
            len = s.length();
            this.v[sitLoc++] = Long.parseLong(s1);
        }
        for (int i = sitLoc; i < this.v.length; ++i) {
            this.v[i] = 0L;
        }
        this.round(4);
    }

    public UFDouble(BigDecimal value) {
        if (value.toString().length() <= 16) {
            this.setValue(value.doubleValue(), value.scale());
        } else {
            this.initByString(value.toString());
        }
    }

    public UFDouble(UFDouble fd) {
        this.si = fd.si;
        for (int i = 0; i < this.v.length; ++i) {
            this.v[i] = fd.v[i];
        }
        this.power = fd.power;
    }

    public UFDouble add(double d1) {
        return this.add(new UFDouble(d1));
    }

    public UFDouble add(UFDouble ufd) {
        int power = Math.abs(ufd.getPower()) > Math.abs(this.getPower()) ? ufd.getPower() : this.getPower();
        return this.add(ufd, power, 4);
    }

    public UFDouble add(UFDouble ufd, int newPower) {
        return this.add(ufd, newPower, 4);
    }

    public UFDouble add(UFDouble ufd, int newPower, int roundingMode) {
        newPower = UFDouble.getValidPower(newPower);
        UFDouble fdnew = new UFDouble(this);
        fdnew.power = newPower;
        fdnew.addUp0(ufd, newPower, roundingMode);
        return fdnew;
    }

    private void addUp0(double ufd) {
        this.addUp0(new UFDouble(ufd), this.power, 4);
    }

    private void addUp0(UFDouble ufd, int newPower, int roundingMode) {
        this.toPlus();
        ufd.toPlus();
        for (int i = 0; i < this.v.length; ++i) {
            int n = i;
            this.v[n] = this.v[n] + ufd.v[i];
        }
        this.judgNegative();
        this.adjustIncluedFs();
        ufd.judgNegative();
        this.round(roundingMode);
    }

    private void adjustIncluedFs() {
        for (int i = 1; i < this.v.length; ++i) {
            if (this.v[i - 1] < 0L) {
                int n = i;
                this.v[n] = this.v[n] - 1L;
                int n2 = i - 1;
                this.v[n2] = this.v[n2] + 10000000000000000L;
                continue;
            }
            this.v[i] = this.v[i] + this.v[i - 1] / 10000000000000000L;
            this.v[i - 1] = this.v[i - 1] % 10000000000000000L;
        }
    }

    private void adjustNotIncluedFs() {
        for (int i = 1; i < this.v.length; ++i) {
            this.v[i] = this.v[i] + this.v[i - 1] / 10000000000000000L;
            this.v[i - 1] = this.v[i - 1] % 10000000000000000L;
        }
    }

    public int compareTo(Object o) {
        return this.toBigDecimal().compareTo(((UFDouble)o).toBigDecimal());
    }

    private void cutdown() {
        int p = -this.power;
        this.v[0] = this.v[0] / POWER_ARRAY[p] * POWER_ARRAY[p];
    }

    public UFDouble div(double d1) {
        UFDouble ufd = new UFDouble(d1);
        return this.div(ufd);
    }

    public UFDouble div(UFDouble ufd) {
        return this.div(ufd, -8);
    }

    public UFDouble div(UFDouble ufd, int power) {
        return this.div(ufd, power, 4);
    }

    public UFDouble div(UFDouble ufd, int power, int roundingMode) {
        int newPower = UFDouble.getValidPower(power);
        BigDecimal bd = this.toBigDecimal();
        BigDecimal divisor = ufd.toBigDecimal();
        int maxScale = divisor.scale() > bd.scale() ? divisor.scale() : bd.scale();
        int nPower = Math.abs(power);
        maxScale = maxScale > nPower ? maxScale : nPower;
        BigDecimal newbd = bd.divide(divisor, ++maxScale, RoundingMode.DOWN);
        UFDouble ufdNew = new UFDouble(newbd);
        return ufdNew.setScale(newPower, roundingMode);
    }

    @Override
    public double doubleValue() {
        return this.toDouble();
    }

    @Override
    public float floatValue() {
        return (float)this.getDouble();
    }

    public double getDouble() {
        return this.doubleValue();
    }

    public long[] getDV() {
        return this.v;
    }

    public byte getSIValue() {
        return this.si;
    }

    @Override
    public int intValue() {
        return (int)this.getDouble();
    }

    private void judgNegative() {
        int i;
        boolean isFs = false;
        for (i = this.v.length - 1; i >= 0; --i) {
            if (this.v[i] < 0L) {
                isFs = true;
                break;
            }
            if (this.v[i] > 0L) break;
        }
        if (isFs) {
            for (i = 0; i < this.v.length; ++i) {
                this.v[i] = -this.v[i];
            }
            this.si = (byte)-1;
        }
    }

    @Override
    public long longValue() {
        long d = 0L;
        for (int i = this.v.length - 1; i > 0; --i) {
            d *= 10000000000000000L;
            d += this.v[i];
        }
        return d * (long)this.si;
    }

    public UFDouble multiply(double d1) {
        UFDouble ufD1 = new UFDouble(d1);
        return this.multiply(ufD1, -8, 4);
    }

    public UFDouble multiply(UFDouble ufd) {
        return this.multiply(ufd, -8, 4);
    }

    public UFDouble multiply(UFDouble ufd, int newPower) {
        return this.multiply(ufd, newPower, 4);
    }

    public UFDouble multiply(UFDouble ufd, int newPower, int roundingMode) {
        newPower = UFDouble.getValidPower(newPower);
        BigDecimal bd = this.toBigDecimal();
        BigDecimal divisor = ufd.toBigDecimal();
        BigDecimal bdn = bd.multiply(divisor);
        bdn = bdn.setScale(-newPower, roundingMode);
        UFDouble ufdNew = new UFDouble(bdn);
        return ufdNew;
    }

    private void round(int roundingMode) {
        boolean increment = true;
        switch (roundingMode) {
            case 0: {
                increment = true;
                break;
            }
            case 2: {
                increment = this.si == 1;
                break;
            }
            case 3: {
                increment = this.si == -1;
                break;
            }
            case 1: {
                increment = false;
                break;
            }
        }
        int p = -this.power;
        long vxs = POWER_ARRAY[p + 1];
        if (increment) {
            this.v[0] = this.v[0] + vxs * 5L;
            this.adjustNotIncluedFs();
        }
        this.cutdown();
        boolean isZero = true;
        for (int i = 0; i < this.v.length; ++i) {
            if (this.v[i] == 0L) continue;
            isZero = false;
            break;
        }
        if (this.si == -1 && isZero) {
            this.si = 1;
        }
    }

    public UFDouble setScale(int power, int roundingMode) {
        UFDouble scaleDouble = null;
        if (this.power == power) {
            scaleDouble = (UFDouble)this.clone();
            scaleDouble.round(roundingMode);
        } else {
            int newPower = UFDouble.getValidPower(power);
            BigDecimal bd = this.toBigDecimal();
            bd = bd.setScale(-newPower, roundingMode);
            scaleDouble = new UFDouble(bd);
        }
        return scaleDouble;
    }

    private void setValue(double d, int newPower) throws NumberFormatException {
        if (d < 0.0) {
            d = -d;
            this.si = (byte)-1;
        }
        double dd = d;
        this.power = UFDouble.getValidPower(newPower);
        double dxs = d % 1.0;
        double ld = d -= dxs;
        for (int i = 1; i < this.v.length; ++i) {
            this.v[i] = (long)(d % 1.0E16);
            d /= 1.0E16;
        }
        long v2 = 0L;
        if (dxs == 0.0) {
            v2 = (long)(dxs * 1.0E16);
        } else if (dd / ld == 1.0) {
            dxs = 0.0;
            v2 = (long)(dxs * 1.0E16);
        } else {
            if (this.power <= -8) {
                int iv = (int)this.v[2];
                if (iv != 0) {
                    if (iv >= 1000000) {
                        this.power = 0;
                    } else if (iv >= 100000) {
                        this.power = -1;
                    } else if (iv >= 10000) {
                        this.power = -2;
                    } else if (iv >= 1000) {
                        this.power = -3;
                    } else if (iv >= 100) {
                        this.power = -4;
                    } else if (iv >= 10) {
                        this.power = -5;
                    } else if (iv >= 1) {
                        this.power = -6;
                    }
                } else {
                    iv = (int)this.v[1];
                    if (iv >= 100000000) {
                        this.power = -7;
                    }
                }
                if (this.power < 0) {
                    int ii = -this.power;
                    int i2 = 1;
                    for (int i = 1; i < ii; ++i) {
                        double dxs1;
                        double d1;
                        if (dd / (d1 = ld + (dxs1 = (double)Math.round(dxs * (double)(i2 *= 10)) / (double)i2)) != 1.0) continue;
                        dxs = dxs1;
                        break;
                    }
                }
            }
            v2 = (long)((dxs + 1.0E-11) * 1.0E16);
        }
        this.v[0] = v2;
        this.round(4);
    }

    public UFDouble sub(double d1) {
        UFDouble ufd = new UFDouble(d1);
        return this.sub(ufd, -8, 4);
    }

    public UFDouble sub(UFDouble ufd) {
        int power = Math.abs(ufd.getPower()) > Math.abs(this.getPower()) ? ufd.getPower() : this.getPower();
        return this.sub(ufd, power, 4);
    }

    public UFDouble sub(UFDouble ufd, int newPower) {
        return this.sub(ufd, newPower, 4);
    }

    public UFDouble sub(UFDouble ufd, int newPower, int roundingMode) {
        newPower = UFDouble.getValidPower(newPower);
        UFDouble ufdnew = new UFDouble(ufd);
        ufdnew.si = -ufdnew.si;
        return this.add(ufdnew, newPower, roundingMode);
    }

    public static UFDouble sum(double[] dArray) {
        return UFDouble.sum(dArray, -8);
    }

    public static UFDouble sum(double[] dArray, int newPower) {
        newPower = UFDouble.getValidPower(newPower);
        UFDouble ufd = new UFDouble(0, newPower);
        for (int i = 0; i < dArray.length; ++i) {
            ufd.addUp0(dArray[i]);
        }
        return ufd;
    }

    public static UFDouble sum(double[] dArray, int newPower, int roundingMode) {
        newPower = UFDouble.getValidPower(newPower);
        UFDouble ufd = new UFDouble(0, newPower);
        for (int i = 0; i < dArray.length; ++i) {
            UFDouble ufdNew = new UFDouble(dArray[i], newPower);
            ufd.addUp0(ufdNew, newPower, roundingMode);
        }
        return ufd;
    }

    public BigDecimal toBigDecimal() {
        return new BigDecimal(this.toString());
    }

    public BigDecimal toBigDecimal(int precious, RoundingMode mode) {
        return new BigDecimal(this.toString(), new MathContext(precious, mode));
    }

    public Double toDouble() {
        return new Double(this.toString());
    }

    private void toPlus() {
        if (this.si == 1) {
            return;
        }
        this.si = 1;
        for (int i = 0; i < this.v.length; ++i) {
            this.v[i] = -this.v[i];
        }
    }

    public String toString() {
        boolean addZero = false;
        StringBuffer sb = new StringBuffer();
        if (this.si == -1) {
            sb.append("-");
        }
        for (int i = this.v.length - 1; i > 0; --i) {
            if (this.v[i] == 0L && !addZero) continue;
            String temp = String.valueOf(this.v[i]);
            if (addZero) {
                int len = temp.length();
                int addZeroNo = 16 - len;
                for (int j = 0; j < addZeroNo; ++j) {
                    sb.append('0');
                }
            }
            sb.append(temp);
            addZero = true;
        }
        if (!addZero) {
            sb.append('0');
        }
        if (this.power < 0) {
            sb.append('.');
            for (int j = 0; j < 16 && j < -this.power; ++j) {
                sb.append(this.v[0] / POWER_ARRAY[j + 1] % 10L);
            }
        }
        int index = -1;
        if (this.isTrimZero() && this.power < 0) {
            String sTemp = sb.toString();
            int i = sb.length() - 1;
            while (i >= 0) {
                if (!sTemp.substring(i, i + 1).equals("0")) {
                    if (!sTemp.substring(i, i + 1).equals(".")) break;
                    index = i;
                    break;
                }
                index = i--;
            }
        }
        if (index >= 0) {
            sb = sb.delete(index, sb.length());
        }
        return sb.toString();
    }

    public UFDouble abs() {
        UFDouble fdnew = new UFDouble();
        fdnew.power = this.power;
        fdnew.si = 1;
        for (int i = 0; i < this.v.length; ++i) {
            fdnew.v[i] = this.v[i];
        }
        return fdnew;
    }

    public int getPower() {
        return this.power;
    }

    public boolean isTrimZero() {
        return this.trimZero;
    }

    public UFDouble mod(UFDouble ufd) {
        return this.mod(ufd, -8, 4);
    }

    public UFDouble mod(UFDouble ufd, int newPower) {
        return this.mod(ufd, newPower, 4);
    }

    public UFDouble mod(UFDouble ufd, int newPower, int roundingMode) {
        UFDouble ufdDiv = this.div(ufd, 0, 1);
        UFDouble ufdnew = this.sub(ufdDiv.multiply(ufd));
        if (ufd.si != this.si) {
            ufdnew = ufdnew.sub(ufd);
        }
        if (ufdnew.si != this.si) {
            ufdnew = ufdnew.sub(ufd);
        }
        ufdnew.power = newPower;
        ufdnew.round(roundingMode);
        return ufdnew;
    }

    public void setTrimZero(boolean newTrimZero) {
        this.trimZero = newTrimZero;
    }

    private static int getValidPower(int newPower) {
        int power;
        int n = power = newPower > 0 ? -newPower : newPower;
        if (power < -16) {
            power = -16;
        }
        return power;
    }

    public int hashCode() {
        int v = 0;
        for (int i = 0; i < this.v.length; ++i) {
            v = (int)((long)v + this.v[i]);
        }
        return v * this.si;
    }

    public boolean equals(Object o) {
        if (o instanceof UFDouble) {
            UFDouble ud = (UFDouble)o;
            return this.si == ud.si && Arrays.equals(this.v, ud.v);
        }
        return false;
    }

    public Object clone() {
        return new UFDouble(this);
    }

    static {
        for (int i = 0; i < POWER_ARRAY.length - 1; ++i) {
            UFDouble.POWER_ARRAY[i] = (long)Math.pow(10.0, 16 - i);
        }
        UFDouble.POWER_ARRAY[UFDouble.POWER_ARRAY.length - 1] = 0L;
        ONE_DBL = new UFDouble(1.0);
        ZERO_DBL = new UFDouble(0.0);
    }
}

