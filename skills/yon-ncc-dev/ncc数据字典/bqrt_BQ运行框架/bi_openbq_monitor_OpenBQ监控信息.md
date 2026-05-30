# |<<

**OpenBQ监控信息 (bi_openbq_monitor / uap.bq.openbq.vo.OpenBQMonitorVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1206.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk | 主键 | pk | char(20) | √ | 主键 (UFID) |
| 2 | username | 用户名 | username | varchar(50) |  | 字符串 (String) |
| 3 | devicetype | 设备类型 | devicetype | varchar(50) |  | 字符串 (String) |
| 4 | objectid | 对象pk | objectid | varchar(50) |  | 字符串 (String) |
| 5 | objecttype | 对象类型 | objecttype | varchar(50) |  | 字符串 (String) |
| 6 | callip | 访问IP | callip | varchar(50) |  | 字符串 (String) |
| 7 | calltime | 访问时间 | calltime | char(19) |  | 日期时间 (UFDateTime) |