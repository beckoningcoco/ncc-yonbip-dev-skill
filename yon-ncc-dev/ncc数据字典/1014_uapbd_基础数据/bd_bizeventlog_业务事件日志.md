# |<<

**业务事件日志 (bd_bizeventlog / nc.vo.bd.pub.bizeventlog.BizeventlogVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/367.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bizeventlog | 业务事件信息主键 | pk_bizeventlog | char(20) | √ | 字符串 (String) |
| 2 | sourceid | 事件源 | sourceid | varchar(50) |  | 字符串 (String) |
| 3 | sourcename | 事件源名称 | sourcename | varchar(50) |  | 字符串 (String) |
| 4 | eventtype | 事件类型 | eventtype | varchar(50) |  | 字符串 (String) |
| 5 | eventtypename | 事件类型名称 | eventtypename | varchar(50) |  | 字符串 (String) |
| 6 | userobject | 事件参数 | userobject | image |  | BLOB (BLOB) |
| 7 | userid | 操作人 | userid | varchar(20) |  | 用户 (user) |
| 8 | opertime | 操作时间 | opertime | char(19) |  | 日期时间 (UFDateTime) |