# |<<

**内部结算规则 (nresa_insetrule / nc.vo.nresa.internally.rules.InsetRuleHVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3878.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_insetrule | 内部结算规则主键 | pk_insetrule | char(20) | √ | 主键 (UFID) |
| 2 | fsettletype | 内部结算类型 | fsettletype | varchar(20) |  | 内部结算类型 (SettleTypeEnum) | 1 | 1=跨利润中心调拨; |