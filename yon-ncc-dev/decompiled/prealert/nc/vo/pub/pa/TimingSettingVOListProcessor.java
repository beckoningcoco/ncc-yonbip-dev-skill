/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.jdbc.framework.processor.BaseProcessor
 *  nc.vo.pub.lang.UFBoolean
 */
package nc.vo.pub.pa;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import nc.jdbc.framework.processor.BaseProcessor;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.pa.TimingSettingVO;

public class TimingSettingVOListProcessor
extends BaseProcessor {
    private static final long serialVersionUID = -1638765078484470876L;

    public Object processResultSet(ResultSet rs) throws SQLException {
        ArrayList<TimingSettingVO> list = new ArrayList<TimingSettingVO>();
        while (rs.next()) {
            TimingSettingVO tvo = this.convert(rs);
            list.add(tvo);
        }
        return list;
    }

    private TimingSettingVO convert(ResultSet rs) throws SQLException {
        TimingSettingVO vo = new TimingSettingVO();
        vo.setPk_timeconfig(rs.getString("pk_timeconfig"));
        vo.setPk_reference(rs.getString("pk_reference"));
        vo.setTimezone(rs.getString("timezone"));
        vo.setEffibegindate(rs.getString("effibegindate"));
        vo.setEffibegintime(rs.getString("effibegintime"));
        vo.setEffienddate(rs.getString("effienddate"));
        vo.setEffiendtime(rs.getString("effiendtime"));
        vo.setIsruncycledaily(UFBoolean.valueOf((String)rs.getString("isruncycledaily")));
        vo.setStarttime(rs.getString("starttime"));
        vo.setEndtime(rs.getString("endtime"));
        vo.setExecuteinterval(rs.getInt("executeinterval"));
        vo.setExeintervalunit(rs.getInt("exeintervalunit"));
        vo.setExecutetime(rs.getString("executetime"));
        vo.setFrequencytype(rs.getInt("frequencytype"));
        vo.setIntervaltime(rs.getInt("intervaltime"));
        vo.setExecuteday(rs.getString("executeday"));
        return vo;
    }
}

