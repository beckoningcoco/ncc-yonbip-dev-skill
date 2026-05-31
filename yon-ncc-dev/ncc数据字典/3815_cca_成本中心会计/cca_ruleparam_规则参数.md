# |<<

**规则参数 (cca_ruleparam / nc.vo.cca.rulescheme.RuleParamVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1302.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ruleparam | 规则参数主键 | pk_ruleparam | char(20) | √ | 主键 (UFID) |
| 2 | pk_rulescheme | 规则方案主键 | pk_rulescheme | char(20) | √ | 规则方案 (cca_rulescheme) |
| 3 | ruletype | 规则类型 | ruletype | int |  | 规则类型 (RuletypeEnum) | 1 | 1=分摊规则; |