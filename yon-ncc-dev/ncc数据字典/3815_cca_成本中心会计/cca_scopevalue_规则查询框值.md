# |<<

**规则查询框值 (cca_scopevalue / nc.vo.cca.rulescheme.allocruleset.ScopeValueVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1306.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_scopevalue | 主键 | pk_scopevalue | char(20) | √ | 主键 (UFID) |
| 2 | pk_rulesection | 分摊规则设置主键 | pk_rulesection | varchar(20) |  | 分摊_规则分段设置 (rulesection) |
| 3 | value | 值 | value | image |  | BLOB (BLOB) |
| 4 | pk_allocruleset | 规则主键 | pk_allocruleset | varchar(50) |  | 字符串 (String) |