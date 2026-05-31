# |<<

**分摊级次-成本组织 (cost_spgrade / nc.vo.co.bd.bd0030.SpgradeOrgVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1624.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_spgrade | 主键 | pk_spgrade | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 所属组织 | pk_org | varchar(20) | √ | 组织 (org) |
| 3 | code | 分摊级次编码 | code | varchar(50) | √ | 字符串 (String) |
| 4 | name | 分摊级次名称 | name | varchar(50) | √ | 字符串 (String) |
| 5 | splevel | 分摊级次等级 | splevel | int | √ | 分摊级次等级 (LevelEnum) |  | 1=一级; |