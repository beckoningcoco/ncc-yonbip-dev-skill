# |<<

**业务联查分配 (iufo_tracedatadispatch / nc.pub.smart.tracedata.TraceDataDispatchVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3528.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dispatch | 分配主键 | pk_dispatch | char(20) | √ | 主键 (UFID) |
| 2 | pk_smart | 语义模型主键 | pk_smart | varchar(50) |  | 字符串 (String) |
| 3 | pk_tracedata | 业务联查主键 | pk_tracedata | varchar(50) |  | 字符串 (String) |
| 4 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 5 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |