# |<<

**常用规则 (pub_generalrule / nc.vo.riart.rule.GeneralRuleVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4730.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_generalrule | 常用规则pk | pk_generalrule | char(20) | √ | 主键 (UFID) |
| 2 | classname | 类名称 | classname | varchar(200) |  | 字符串 (String) |
| 3 | module | 模块号 | module | varchar(20) |  | 字符串 (String) |
| 4 | code | 编码 | code | varchar(20) |  | 字符串 (String) |
| 5 | explain | 常用规则说明 | explain | varchar(200) |  | 多语文本 (MultiLangText) |
| 6 | rulename | 常用规则名称 | rulename | varchar(200) |  | 多语文本 (MultiLangText) |
| 7 | billtype | 单据类型 | billtype | varchar(50) |  | 字符串 (String) |