# |<<

**分摊_分摊规则分配 (cca_arassign / nc.vo.cca.rulescheme.allocruleset.AllocRuleAssignVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1273.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_arassgin | 主键 | pk_arassgin | char(20) | √ | 主键 (UFID) |
| 2 | pk_allocruleset | 分摊规则主键 | pk_allocruleset | varchar(20) |  | 分摊_分摊规则设置 (allocruleset) |
| 3 | pk_org | 业务单元 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | allocruletype | 分配类型 | allocruletype | int |  | 分摊规则类别 (allocruletype) |  | 0=责任分摊; |