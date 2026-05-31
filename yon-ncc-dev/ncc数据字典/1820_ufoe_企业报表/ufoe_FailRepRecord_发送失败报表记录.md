# |<<

**发送失败报表记录 (ufoe_FailRepRecord / nc.vo.iufo.monitor.repsub.FailRepRecordVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5901.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_failrep | 失败报表记录主键 | pk_failrep | varchar(50) | √ | 字符串 (String) |
| 2 | pk_report | 报表主键 | pk_report | varchar(50) |  | 字符串 (String) |
| 3 | report_name | 报表名称 | report_name | varchar(50) |  | 字符串 (String) |
| 4 | keygroupvalues | 关键字组合值 | keygroupvalues | varchar(50) |  | 字符串 (String) |
| 5 | failreason | 失败原因 | failreason | varchar(50) |  | 字符串 (String) |