# |<<

**单据控制规则 (bd_crossrule / nc.vo.crosscheckrule.RuleVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/423.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rule | 规则主键 | pk_rule | char(20) | √ | 主键 (UFID) |
| 2 | code | 规则编码 | code | varchar(50) |  | 字符串 (String) |
| 3 | name | 规则名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) |  | 1=未启用; |