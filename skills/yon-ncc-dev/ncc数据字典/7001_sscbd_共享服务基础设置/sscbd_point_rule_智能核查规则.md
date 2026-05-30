# |<<

**智能核查规则 (sscbd_point_rule / nc.vo.sscbd.sscbase.point.SSCPointRuleVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5533.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pointitem_rule | 主键 | pk_pointitem_rule | char(20) | √ | 主键 (UFID) |
| 2 | field | 票据字段 | field | varchar(50) | √ | 字符串 (String) |
| 3 | field_name | 票据字段名称 | field_name | varchar(100) | √ | 字符串 (String) |
| 4 | invoicetype | 发票类型 | invoicetype | int | √ | 发票类型 (invoicetype) |  | 1=增值税发票; |