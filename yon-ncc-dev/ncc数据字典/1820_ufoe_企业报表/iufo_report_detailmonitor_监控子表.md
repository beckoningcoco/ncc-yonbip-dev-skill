# |<<

**监控子表 (iufo_report_detailmonitor / nc.vo.ufoe.monitor.ReportMonitorVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3500.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_sendreport | pk_sendreport | pk_sendreport | char(20) | √ | 主键 (UFID) |
| 2 | pk_iufomonitor | pk_iufomonitor | pk_iufomonitor | varchar(20) | √ | 字符串 (String) |
| 3 | pk_report | pk_report | pk_report | varchar(20) | √ | 字符串 (String) |
| 4 | repcode | 报表编码 | repcode | varchar(50) |  | 字符串 (String) |
| 5 | repname | 报表名称 | repname | varchar(100) |  | 字符串 (String) |
| 6 | pk_keygroup | pk_keygroup | pk_keygroup | char(20) |  | 字符串 (String) |
| 7 | keyval | 关键字组合 | keyval | varchar(200) |  | 字符串 (String) |
| 8 | errormsg | 错误信息 | errormsg | varchar(1000) |  | 字符串 (String) |
| 9 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 10 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 11 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 12 | def1 | 自定义项1 | def1 | varchar(100) |  | 字符串 (String) |
| 13 | def2 | 自定义项2 | def2 | varchar(100) |  | 字符串 (String) |
| 14 | def3 | 自定义项3 | def3 | varchar(100) |  | 字符串 (String) |
| 15 | def4 | 自定义项4 | def4 | varchar(100) |  | 字符串 (String) |
| 16 | def5 | 自定义项5 | def5 | varchar(100) |  | 字符串 (String) |
| 17 | def6 | 自定义项6 | def6 | varchar(100) |  | 字符串 (String) |
| 18 | def7 | 自定义项7 | def7 | varchar(100) |  | 字符串 (String) |
| 19 | def8 | 自定义项8 | def8 | varchar(100) |  | 字符串 (String) |
| 20 | def9 | 自定义项9 | def9 | varchar(100) |  | 字符串 (String) |
| 21 | def10 | 自定义项10 | def10 | varchar(100) |  | 字符串 (String) |