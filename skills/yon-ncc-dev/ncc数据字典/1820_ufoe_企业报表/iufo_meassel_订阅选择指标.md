# |<<

**订阅选择指标 (iufo_meassel / nc.vo.iufo.measubscribe.MeasSelVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3477.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_meassel | 主键 | pk_meassel | char(20) | √ | 主键 (UFID) |
| 2 | meacode | 指标编码 | meacode | varchar(50) |  | 字符串 (String) |
| 3 | meaname | 指标名称 | meaname | varchar(50) |  | 字符串 (String) |
| 4 | pk_report | 所属报表 | pk_report | varchar(20) |  | 报表表样 (ufoereportinfo) |