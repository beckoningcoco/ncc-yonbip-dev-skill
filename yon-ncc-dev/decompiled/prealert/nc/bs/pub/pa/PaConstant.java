/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.RuntimeEnv
 *  nc.bs.ml.NCLangResOnserver
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.lang.ICalendar
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pub.lang.UFDateTime
 *  nc.vo.pub.lang.UFTime
 *  nc.vo.uap.scheduler.PeriodUnit
 *  nc.vo.uap.scheduler.TimeConfigVO
 *  nccloud.commons.lang.ArrayUtils
 */
package nc.bs.pub.pa;

import java.util.ArrayList;
import java.util.StringTokenizer;
import nc.bs.framework.common.RuntimeEnv;
import nc.bs.ml.NCLangResOnserver;
import nc.bs.pub.pa.PaUtils;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.lang.ICalendar;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.lang.UFTime;
import nc.vo.pub.pa.AlertTimeConfig;
import nc.vo.pub.pa.AlertregistryVO;
import nc.vo.pub.pa.AlerttypeBVO;
import nc.vo.pub.pa.Key;
import nc.vo.pub.pa.TimingSettingVO;
import nc.vo.uap.scheduler.PeriodUnit;
import nc.vo.uap.scheduler.TimeConfigVO;
import nccloud.commons.lang.ArrayUtils;

public class PaConstant {
    private static final String PA_WEB_PATH = "PreAlart";
    private static final String PA_MSG_PATH = "Messages";
    public static final String PREFILE_PATH = RuntimeEnv.getInstance().getNCHome() + PaUtils.FS + "webapps" + PaUtils.FS + "nc_web" + PaUtils.FS;
    public static final String FILE_RELATIVE_PATH = "webapps" + PaUtils.FS + "nc_web" + PaUtils.FS + "PreAlart" + PaUtils.FS + "Messages" + PaUtils.FS;
    public static final String FILE_WEB_RELATIVE_PATH = "PreAlart" + PaUtils.FS + "Messages" + PaUtils.FS;
    public static final String FILE_BASE_ABSOLUTE_PATH = RuntimeEnv.getInstance().getNCHome() + PaUtils.FS + FILE_RELATIVE_PATH;
    public static final String PA_BASE_PATH = PREFILE_PATH + "PreAlart" + PaUtils.FS;
    public static final String PLATFROM = NCLangResOnserver.getInstance().getStrByID("101502", "UPP101502-000057");
    public static final String PA_MODULE_PATH = "webapps" + PaUtils.FS + "nc_web" + PaUtils.FS + "PreAlart" + PaUtils.FS;
    public static final String PA_DB_RECEIVERNAME = "PreAlert Platform";
    public static final String PA_CN_RECEIVERNAME = "\u9884\u8b66\u5e73\u53f0";
    public static final String INVOKE_DB_RECEIVERNAME = "Auto Invoke";
    public static final String INVOKE_CN_RECEIVERNAME = "\u81ea\u52a8\u8c03\u7528";
    public static final String PA_DB_RECEIVERID = "PA";
    public static final String INVOKE_DB_RECEIVERID = "INVOKE";
    public static final String CYCLE_SEPARATOR = ",";
    public static final int TASKTYPE_PA = 0;
    public static final int TASKTYPE_BG = 1;
    public static final int TASKTYPE_TEMP = 2;
    public static final String STR_TEMPTASK = "[TempTask]";
    public static final String CONST_PA_SERVICE = "IPreAlertConfigService";

    public static final String getCharset() {
        return "UTF-8";
    }

    public static String getCycleSelector(boolean[] selectors, boolean isStartZero) {
        return PaUtils.getCycleSelector(selectors, CYCLE_SEPARATOR, isStartZero);
    }

    public static boolean[] getSelectorArray(String selectorStr, int length, boolean isStartZero) {
        return PaUtils.getSelectorArray(selectorStr, length, CYCLE_SEPARATOR, isStartZero);
    }

    public static int[] getSelectorArray(String selectorStr) {
        ArrayList<String> al = new ArrayList<String>();
        StringTokenizer sb = new StringTokenizer(selectorStr, CYCLE_SEPARATOR);
        while (sb.hasMoreTokens()) {
            String token = sb.nextToken();
            if (token == null || token.trim().length() <= 0) continue;
            al.add(token);
        }
        String[] selectStr = al.toArray(new String[al.size()]);
        int[] selector = new int[al.size()];
        for (int i = 0; i < al.size(); ++i) {
            selector[i] = Integer.parseInt(selectStr[i]);
        }
        return selector;
    }

    public static String getDate(UFDate ufDate) {
        if (ufDate == null) {
            return null;
        }
        return ufDate.toString();
    }

    public static String getTime(UFTime ufTime) {
        if (ufTime == null) {
            return null;
        }
        return ufTime.toString();
    }

    public static Key[] transVO2Key(AlerttypeBVO[] typeBVOArray) {
        if (ArrayUtils.isEmpty((Object[])typeBVOArray)) {
            return null;
        }
        Key[] values = new Key[typeBVOArray.length];
        for (int i = 0; i < typeBVOArray.length; ++i) {
            AlerttypeBVO typeBVO = typeBVOArray[i];
            values[i] = new Key();
            values[i].setName(typeBVO.getFieldname());
            values[i].setValue(typeBVO.getValue());
            values[i].setEditType(typeBVO.getVartype());
            values[i].setOperator(typeBVO.getOperator());
            if (typeBVO.getVartype() == null) continue;
            if (typeBVO.getVartype().equals("ComboBox")) {
                values[i].setDescription(typeBVO.getRefervalue());
                values[i].setRefName(typeBVO.getVariablename());
                continue;
            }
            if (typeBVO.getVartype().equals("Reference")) {
                values[i].setRefName(typeBVO.getRefername());
                values[i].setRefNameValue(typeBVO.getRefervalue());
                values[i].setDescription(typeBVO.getVariablename());
                continue;
            }
            values[i].setDescription(typeBVO.getVariablename());
        }
        return values;
    }

    public static AlerttypeBVO[] transKey2VO(Key[] keys) {
        if (ArrayUtils.isEmpty((Object[])keys)) {
            return null;
        }
        AlerttypeBVO[] typeBVOArray = new AlerttypeBVO[keys.length];
        for (int i = 0; i < keys.length; ++i) {
            Key key = keys[i];
            if (keys[i] == null) continue;
            typeBVOArray[i] = new AlerttypeBVO();
            typeBVOArray[i].setVartype(key.getEditType());
            typeBVOArray[i].setFieldname(key.getName());
            typeBVOArray[i].setValue(key.getValue());
            typeBVOArray[i].setRefername(key.getRefName());
            typeBVOArray[i].setOperator(key.getOperator());
            if (key.getEditType() != null && key.getEditType().equals("ComboBox")) {
                typeBVOArray[i].setRefervalue(key.getDescription());
                typeBVOArray[i].setVariablename(key.getRefName());
            } else {
                typeBVOArray[i].setVariablename(key.getDescription());
            }
            typeBVOArray[i].setDisplaynameid(typeBVOArray[i].getVariablename());
        }
        return typeBVOArray;
    }

    public static TimeConfigVO transAlertRegistryVO2TimeConfigVO(AlertregistryVO registryVO) {
        if (registryVO == null) {
            return null;
        }
        TimeConfigVO timeConfig = new TimeConfigVO();
        if (registryVO.getAlertTypeVo().getTasktype() == 1 && !registryVO.getIstiming().booleanValue()) {
            timeConfig.setJustInTime(true);
        } else {
            TimingSettingVO tsVO = registryVO.getTimingSettingVo();
            timeConfig = PaConstant.transTimingSettingVO2TimeConfigVO(tsVO);
            timeConfig.setJustInTime(!registryVO.getIstiming().booleanValue());
            if (tsVO != null && tsVO.getIsruncycledaily() != null && tsVO.getIsruncycledaily().booleanValue() && timeConfig.getEndDate() != null && timeConfig.getStartDate().compareTo(timeConfig.getEndDate()) == 0) {
                timeConfig.setJustInTime(true);
            }
        }
        return timeConfig;
    }

    public static TimeConfigVO transTimingSettingVO2TimeConfigVO(TimingSettingVO timeSettingVo) {
        TimeConfigVO timeConfig = new TimeConfigVO();
        if (timeSettingVo != null) {
            timeConfig.setPeriodUnit(PeriodUnit.getPeriodUnit((int)timeSettingVo.getFrequencytype()));
            if (timeSettingVo.getFrequencytype() == 4) {
                int[] selectors = PaConstant.getSelectorArray(timeSettingVo.getExecuteday());
                timeConfig.setDaysInWeek(selectors);
                timeConfig.setPeriod(timeSettingVo.getIntervaltime().intValue());
            } else if (timeSettingVo.getFrequencytype() == 5) {
                int[] selectors = PaConstant.getSelectorArray(timeSettingVo.getExecuteday());
                if (selectors != null && selectors.length > 0 && selectors[0] == 0) {
                    selectors[0] = -1;
                }
                timeConfig.setDaysInMonth(selectors);
                timeConfig.setPeriod(timeSettingVo.getIntervaltime().intValue());
            } else {
                timeConfig.setPeriod(timeSettingVo.getIntervaltime().intValue());
            }
            timeConfig.setStartDate(timeSettingVo.getEffibeginUFDate().asBegin(ICalendar.BASE_TIMEZONE));
            if (timeSettingVo.getEffibeginUFTime() != null) {
                timeConfig.setStartTime(timeSettingVo.getEffibeginUFTime());
            } else {
                timeConfig.setStartTime(new UFTime("00:00:00"));
            }
            if (timeSettingVo.getEffiendUFDate() != null) {
                timeConfig.setEndDate(timeSettingVo.getEffiendUFDate().asBegin(ICalendar.BASE_TIMEZONE));
                if (timeConfig.getStartDate().compareTo(timeConfig.getEndDate()) > 0) {
                    throw new IllegalArgumentException(NCLangRes4VoTransl.getNCLangRes().getStrByID("101502", "PaConstant-000000"));
                }
                if (timeConfig.getStartDate().compareTo(timeConfig.getEndDate()) == 0 && timeSettingVo.getIsruncycledaily().booleanValue()) {
                    timeSettingVo.setEffiendtime(timeSettingVo.getExecuteUFTime());
                }
                if (timeSettingVo.getEffiendUFTime() != null) {
                    timeConfig.setEndTime(timeSettingVo.getEffiendUFTime());
                    if (timeConfig.getEndDate() != null && timeConfig.getStartDate().compareTo(timeConfig.getEndDate()) == 0 && timeConfig.getStartTime().compareTo(timeConfig.getEndTime()) > 0 && timeSettingVo.getEffibeginUFDate().compareTo(timeSettingVo.getEffiendUFDate()) > 0) {
                        throw new IllegalArgumentException(NCLangRes4VoTransl.getNCLangRes().getStrByID("101502", "PaConstant-000001"));
                    }
                } else if (timeSettingVo.getIsruncycledaily().booleanValue()) {
                    timeConfig.setEndTime(timeSettingVo.getExecuteUFTime());
                } else {
                    timeConfig.setEndTime(timeSettingVo.getEndUFTime());
                }
            }
            if (timeSettingVo.getIsruncycledaily().booleanValue()) {
                if (timeConfig.getEndDate() != null && timeConfig.getStartDate().compareTo(timeConfig.getEndDate()) == 0) {
                    timeConfig.setJustInTime(true, new UFDateTime(timeConfig.getStartDate(), timeSettingVo.getExecuteUFTime()).getMillis());
                } else {
                    timeConfig.setExecTimeInDay(timeSettingVo.getExecuteUFTime());
                }
            } else {
                timeConfig.setPeriodInDay(timeSettingVo.getExecuteinterval().intValue());
                timeConfig.setPeriodUnitInDay(PeriodUnit.getPeriodUnit((int)timeSettingVo.getExeintervalunit()));
                timeConfig.setStartTimeInDay(timeSettingVo.getStartUFTime());
                timeConfig.setEndTimeInDay(timeSettingVo.getEndUFTime());
            }
        }
        return timeConfig;
    }

    public static TimingSettingVO transAlertTimeConfig2TimingSettingVO(AlertTimeConfig alertTimeConfig) {
        TimingSettingVO timingVO = new TimingSettingVO();
        if (alertTimeConfig != null) {
            timingVO.setFrequencytype(alertTimeConfig.getOccurType());
            timingVO.setIntervaltime(alertTimeConfig.getOccurInterval());
            if (alertTimeConfig.getOccurType() == 4 || alertTimeConfig.getOccurType() == 5) {
                boolean[] selectdays = alertTimeConfig.getOccurSelected();
                timingVO.setExecuteday(PaConstant.getCycleSelector(selectdays, true));
            }
            timingVO.setIsruncycledaily(UFBoolean.valueOf((boolean)alertTimeConfig.getDailyRunOnce()));
            if (alertTimeConfig.getDailyRunOnce()) {
                timingVO.setExecutetime(alertTimeConfig.getDailyRunOnceTime());
            } else {
                timingVO.setExecuteinterval(alertTimeConfig.getDailyRunCycleInterval());
                timingVO.setExeintervalunit(alertTimeConfig.getDailyRunCycleUnit());
                timingVO.setStarttime(alertTimeConfig.getDailyRunCycleBeginTime());
                timingVO.setEndtime(alertTimeConfig.getDailyRunCycleEndTime());
            }
            timingVO.setEffibegindate(alertTimeConfig.getExpireBeginDate());
            timingVO.setEffibegintime(alertTimeConfig.getExpireBeginTime());
            if (alertTimeConfig.getExpireEndDate() != null) {
                timingVO.setEffienddate(alertTimeConfig.getExpireEndDate());
            } else {
                timingVO.setEffienddate("");
            }
            if (alertTimeConfig.getExpireEndTime() != null) {
                timingVO.setEffiendtime(alertTimeConfig.getExpireEndTime());
            } else {
                timingVO.setEffiendtime("");
            }
        }
        return timingVO;
    }

    public static AlertTimeConfig transTimingSettingVO2AlertTimeConfig(TimingSettingVO timingSettingVO) {
        AlertTimeConfig timeConfig = new AlertTimeConfig();
        if (timingSettingVO != null) {
            if (timingSettingVO.getFrequencytype() != null) {
                timeConfig.setOccurType(timingSettingVO.getFrequencytype());
            }
            if (timingSettingVO.getIntervaltime() != null) {
                timeConfig.setOccurInterval(timingSettingVO.getIntervaltime());
            }
            if (timingSettingVO.getFrequencytype() == 4) {
                boolean[] selectors = PaConstant.getSelectorArray(timingSettingVO.getExecuteday(), 7, true);
                timeConfig.setOccurSelected(selectors);
            } else if (timingSettingVO.getFrequencytype() == 5) {
                boolean[] selectors = PaConstant.getSelectorArray(timingSettingVO.getExecuteday(), 32, true);
                timeConfig.setOccurSelected(selectors);
            }
            timeConfig.setDailyRunOnce(timingSettingVO.getIsruncycledaily().booleanValue());
            if (timingSettingVO.getIsruncycledaily().booleanValue()) {
                timeConfig.setDailyRunOnceTime(timingSettingVO.getExecuteUFTime());
            } else {
                timeConfig.setDailyRunCycleInterrval(timingSettingVO.getExecuteinterval());
                timeConfig.setDailyRunCycleUnit(timingSettingVO.getExeintervalunit());
                timeConfig.setDailyRunCycleBeginTime(timingSettingVO.getStartUFTime());
                timeConfig.setDailyRunCycleEndTime(timingSettingVO.getEndUFTime());
            }
            timeConfig.setExpireBeginDate(timingSettingVO.getEffibeginUFDate());
            timeConfig.setExpireBeginTime(timingSettingVO.getEffibeginUFTime());
            if (timingSettingVO.getEffiendUFDate() != null) {
                timeConfig.setExpireEndDate(timingSettingVO.getEffiendUFDate());
            } else {
                timeConfig.setExpireEndDate(null);
            }
            if (timingSettingVO.getEffiendUFTime() != null) {
                timeConfig.setExpireEndTime(timingSettingVO.getEffiendUFTime());
            } else {
                timeConfig.setExpireEndTime(null);
            }
        }
        return timeConfig;
    }
}

