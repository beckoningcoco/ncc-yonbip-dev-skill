/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.ml.NCLangRes4VoTransl
 */
package nc.vo.arap.comreport;

import nc.vo.arap.tally.BalanceVO;
import nc.vo.arap.tally.TallyAgrVO;
import nc.vo.arap.tally.TallyAllVO;
import nc.vo.arap.tally.TallyVO;
import nc.vo.ml.NCLangRes4VoTransl;

public enum ReportTableEnum {
    ARAP_BAL(BalanceVO.getDefaultTableName(), NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0017")),
    ARAP_TALLY(TallyVO.getDefaultTableName(), NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0598")),
    ARAP_TALLYALL(TallyAllVO.getDefaultTableName(), NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0599")),
    ARAP_TALLYAGR(TallyAgrVO.getDefaultTableName(), NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0403"));

    private final String code;
    private final String name;

    private ReportTableEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }
}

