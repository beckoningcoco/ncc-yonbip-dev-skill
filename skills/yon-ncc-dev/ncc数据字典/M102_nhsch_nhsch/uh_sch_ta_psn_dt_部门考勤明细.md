# |<<

**部门考勤明细 (uh_sch_ta_psn_dt / com.yonyou.yh.nhis.sch.ta.vo.SchTaPsnDtVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6274.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_tapsndt | 人员排班考勤主键 | pk_tapsndt | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_tapsn | 人员考勤排班 | pk_tapsn | varchar(50) |  | 字符串 (String) |
| 5 | pk_psn | 人员 | pk_psn | varchar(20) |  | 人员基本信息 (psndoc) |
| 6 | date_ta | 考勤日期 | date_ta | char(19) |  | 日期 (UFDate) |
| 7 | pk_tadpweek | 考勤部门计划周 | pk_tadpweek | varchar(20) |  | 排班_考勤_部门计划_周 (SchTaDpWeekVO) |
| 8 | dt_schtatype_plan | 计划考勤类型 | dt_schtatype_plan | varchar(50) |  | 字符串 (String) |
| 9 | name_schtatype_plan | 计划考勤名称 | name_schtatype_plan | varchar(50) |  | 字符串 (String) |
| 10 | flag_talock | 计划锁定标志 | flag_talock | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | dt_schtatype | 实际考勤类型 | dt_schtatype | varchar(50) |  | 字符串 (String) |
| 12 | name_schtatype | 实际考勤类型名称 | name_schtatype | varchar(50) |  | 字符串 (String) |
| 13 | flag_nomach | 考勤不符标志 | flag_nomach | char(1) |  | 布尔类型 (UFBoolean) |
| 14 | dt_schtars | 考勤不符原因 | dt_schtars | varchar(200) |  | 备注 (Memo) |
| 15 | desc_schtars | 考勤不符描述 | desc_schtars | varchar(200) |  | 备注 (Memo) |
| 16 | flag_fin | 排班完成标志 | flag_fin | char(1) |  | 布尔类型 (UFBoolean) |
| 17 | eu_tapsn_sch | 实际考勤类别 | eu_tapsn_sch | int |  | 整数 (Integer) |
| 18 | eu_tapsn_plan | 计划考勤类别 | eu_tapsn_plan | int |  | 整数 (Integer) |
| 19 | pk_schtatype | 实际考勤类型主键 | pk_schtatype | char(20) |  | 字符串 (String) |
| 20 | pk_schtatype_plan | 计划考勤类型主键 | pk_schtatype_plan | char(20) |  | 字符串 (String) |