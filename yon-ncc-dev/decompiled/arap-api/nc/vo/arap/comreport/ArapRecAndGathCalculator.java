/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.fipub.report.ReportQueryCondVO
 *  nc.vo.pub.rs.MemoryResultSetMetaData
 *  nccloud.commons.lang.StringUtils
 */
package nc.vo.arap.comreport;

import java.sql.SQLException;
import java.util.Map;
import nc.vo.arap.comreport.ArapDetailCalculator;
import nc.vo.fipub.report.ReportQueryCondVO;
import nc.vo.pub.rs.MemoryResultSetMetaData;
import nccloud.commons.lang.StringUtils;

public class ArapRecAndGathCalculator
extends ArapDetailCalculator {
    public ArapRecAndGathCalculator(MemoryResultSetMetaData metaData, ReportQueryCondVO queryCondVO) throws SQLException {
        super(metaData, queryCondVO);
    }

    @Override
    protected void initIndex() throws SQLException {
        this.voucherIdx = this.metaData.getNameIndex("voucherid");
        this.pk_groupIdx = this.metaData.getNameIndex("pk_group");
        this.pk_orgIdx = this.metaData.getNameIndex("pk_org");
        this.pk_billIdx = this.metaData.getNameIndex("pk_bill");
        this.pk_tradetypeIdx = this.metaData.getNameIndex("pk_tradetype");
        this.orgIdx = this.metaData.getNameIndex("org");
        this.dealnumIdx = this.metaData.getNameIndex("pk_dealnum");
    }

    @Override
    protected void setVoucher(Object[][] datas, Map<String, String> voucherMap) {
        Object pk_billObj = null;
        Object dealnum = null;
        for (Object[] rowData : datas) {
            pk_billObj = rowData[this.pk_billIdx];
            dealnum = rowData[this.dealnumIdx];
            if (!StringUtils.isNotEmpty((CharSequence)((String)pk_billObj)) || !"~".equals(dealnum) && !StringUtils.isEmpty((CharSequence)((String)dealnum))) continue;
            rowData[this.voucherIdx] = voucherMap.get(pk_billObj);
        }
    }
}

