# |<<

**业务联查注册 (iufo_tracedataregister / nc.pub.smart.tracedata.TraceDataRegisterVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3529.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_tracedata | 注册主键 | pk_tracedata | char(20) | √ | 主键 (UFID) |
| 2 | modulename | 模块名称 | modulename | varchar(50) |  | 字符串 (String) |
| 3 | classname | 类名称 | classname | varchar(100) |  | 字符串 (String) |
| 4 | tracedataname | 联查名称 | tracedataname | varchar(50) |  | 字符串 (String) |
| 5 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 6 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |