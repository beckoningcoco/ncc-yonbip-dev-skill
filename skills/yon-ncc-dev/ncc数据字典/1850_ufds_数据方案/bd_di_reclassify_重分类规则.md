# |<<

**重分类规则 (bd_di_reclassify / nc.vo.bd.intdata.scheme.DIReclassifyRuleVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/796.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_reclassify | 规则ID | pk_reclassify | char(20) | √ | 主键 (UFID) |
| 2 | pk_scheme | 方案主键 | pk_scheme | varchar(50) |  | 字符串 (String) |
| 3 | srcrepitem | 来源报表项目 | srcrepitem | varchar(20) |  | DI报表项目 (reportitem) |
| 4 | srcprop | 来源属性 | srcprop | varchar(50) |  | 借贷 (enum) |  | debit=借; |