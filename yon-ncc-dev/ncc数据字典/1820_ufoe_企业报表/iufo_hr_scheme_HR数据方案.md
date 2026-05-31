# |<<

**HR数据方案 (iufo_hr_scheme / nc.vo.iufo.hr.scheme.HRSchemeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3458.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | 主键 | id | char(20) | √ | 主键 (UFID) |
| 2 | pk_report | 报表pk | pk_report | varchar(20) |  | 报表表样 (ufoereportinfo) |
| 3 | statmainbody | 统计主体 | statmainbody | varchar(20) |  | 字符串 (String) |
| 4 | scheme | scheme | scheme | image |  | BLOB (BLOB) |
| 5 | dsname | 数据源 | dsname | varchar(50) |  | 字符串 (String) |
| 6 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 7 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |