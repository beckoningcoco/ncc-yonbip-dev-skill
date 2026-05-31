# |<<

**日期分组_时段 (bd_code_dateslot_sec / nc.vo.nhbd.code.dateslot.DateSlotSecVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/397.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dateslotsec | 排班日期分组时段主键 | pk_dateslotsec | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | rowno | 行号 | rowno | varchar(50) |  | 字符串 (String) |
| 6 | sortno | 序号 | sortno | int |  | 整数 (Integer) |
| 7 | name_time | 时段名称 | name_time | varchar(50) |  | 字符串 (String) |
| 8 | secmin | 时段期间分钟 | secmin | varchar(50) |  | 字符串 (String) |
| 9 | end_time | 结束时间 | end_time | varchar(50) |  | 字符串 (String) |
| 10 | begin_time | 开始时间 | begin_time | varchar(50) |  | 字符串 (String) |