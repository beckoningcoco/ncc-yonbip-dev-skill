/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.lang.UFDouble
 */
package nc.vo.arap.pub;

import nc.vo.arap.global.ArapCommonTool;
import nc.vo.pub.lang.UFDouble;

public class UFDoubleTool {
    public static boolean isXiangFan(UFDouble ufd, UFDouble ufd2) {
        UFDouble result = ufd.add(ufd2);
        return UFDoubleTool.isZero(result);
    }

    public static boolean isXiangdeng(UFDouble ufd, UFDouble ufd2) {
        if (ufd == null || ufd2 == null) {
            return false;
        }
        UFDouble cha = ufd.sub(ufd2);
        return UFDoubleTool.isZero(cha);
    }

    public static boolean isAbsDayu(UFDouble ufd, UFDouble ufd2) {
        if (ufd == null) {
            return false;
        }
        if (ufd2 == null) {
            return true;
        }
        UFDouble abs = ufd.abs();
        UFDouble abs2 = ufd2.abs();
        return ArapCommonTool.isLarge(abs, abs2);
    }

    public static boolean isTonghao(UFDouble ufd, UFDouble ufd2) {
        return (!ArapCommonTool.isLargeZero(ufd) || !ArapCommonTool.isLessZero(ufd2)) && (!ArapCommonTool.isLessZero(ufd) || !ArapCommonTool.isLargeZero(ufd2));
    }

    public static boolean isZero(UFDouble ufd) {
        if (ufd == null) {
            return false;
        }
        return ArapCommonTool.isZero(ufd);
    }

    public static boolean isDayu0(UFDouble ufd) {
        if (ufd == null) {
            return false;
        }
        return ArapCommonTool.isLargeZero(ufd);
    }

    public static boolean isXiaoyu(UFDouble ufd, UFDouble ufd2) {
        if (ufd == null || ufd2 == null) {
            return false;
        }
        UFDouble result = ufd.sub(ufd2);
        return !UFDoubleTool.isDayu0(result);
    }

    public static UFDouble getAbsMin(UFDouble ufd, UFDouble ufd2) {
        UFDouble ufd2_abs;
        if (ufd == null || ufd2 == null) {
            return null;
        }
        UFDouble ufd_abs = ufd.abs();
        if (UFDoubleTool.isXiaoyu(ufd_abs, ufd2_abs = ufd2.abs())) {
            return ufd_abs;
        }
        return ufd2_abs;
    }

    public static UFDouble sum(UFDouble ufd, UFDouble ufd2) {
        if (ufd == null) {
            return ufd2;
        }
        if (ufd2 == null) {
            return ufd;
        }
        UFDouble sum = ufd.add(ufd2);
        return sum;
    }
}

