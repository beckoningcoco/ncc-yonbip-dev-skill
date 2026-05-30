# |<<

**医嘱频次时刻 (bd_term_freq_time / nc.vo.nhbd.mk.OrdFreTimeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1006.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_freqtime | 频次主键 | pk_freqtime | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | no | 频次序号 | no | int | √ | 整数 (Integer) |
| 5 | weekno | 星期数 | weekno | int |  | 整数 (Integer) |
| 6 | time_bill | 记账时刻 | time_bill | char(19) |  | 日期时间 (UFDateTime) |
| 7 | time_exec | 执行时刻 | time_exec | char(8) | √ | 时间 (UFTime) |
| 8 | crowno | 行号 | crowno | varchar(50) |  | 字符串 (String) |
| 9 | timescope | 时间范围 | timescope | int | √ | 整数 (Integer) |