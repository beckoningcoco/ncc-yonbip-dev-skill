# |<<

**日期分组_工作时间 (bd_code_dateslot_time / nc.vo.nhbd.code.dateslot.DateSlotTimeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/398.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dateslottime | 排班日期分组时间主键 | pk_dateslottime | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | code | 时间组编码 | code | varchar(50) |  | 字符串 (String) |
| 5 | name | 时间组名称 | name | varchar(50) |  | 字符串 (String) |
| 6 | time_begin | 开始时间 | time_begin | char(8) |  | 时间 (UFTime) |
| 7 | time_end | 结束时间 | time_end | char(8) |  | 时间 (UFTime) |
| 8 | valid_month_begin | 有效开始月 | valid_month_begin | int |  | 整数 (Integer) |
| 9 | valid_month_end | 有效结束月 | valid_month_end | int |  | 整数 (Integer) |
| 10 | valid_day_begin | 有效开始日 | valid_day_begin | int |  | 整数 (Integer) |
| 11 | valid_day_end | 有效结束日 | valid_day_end | int |  | 整数 (Integer) |
| 12 | rowno | 行号 | rowno | varchar(50) |  | 字符串 (String) |