# |<<

**排班_考勤_部门计划_周 (uh_sch_ta_dp_week / com.yonyou.yh.nhis.sch.ta.vo.SchTaDpWeekVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6272.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_tadpweek | 考勤部门计划周主键 | pk_tadpweek | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(50) |  | 字符串 (String) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | weekno | 星期数 | weekno | varchar(50) |  | 字符串 (String) |
| 5 | pk_dateslot | 日期分组 | pk_dateslot | varchar(20) |  | 排班_日期分组 (dateslot) |
| 6 | pk_schtatype | 计划考勤类型 | pk_schtatype | varchar(50) |  | 字符串 (String) |
| 7 | name_schtatype | 计划考勤类型名称 | name_schtatype | varchar(50) |  | 字符串 (String) |
| 8 | eu_tapsn_plan | 计划考勤类别 | eu_tapsn_plan | char(50) |  | 考勤类别 (enum) |  | 0=休假; |