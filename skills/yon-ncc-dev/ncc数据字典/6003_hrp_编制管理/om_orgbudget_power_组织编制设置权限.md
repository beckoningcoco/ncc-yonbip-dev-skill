# |<<

**组织编制设置权限 (om_orgbudget_power / nc.vo.hrp.budgetset.OrgBudgetPowerVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3949.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_om_budgetpower | 组织编制设置权限主键 | pk_om_budgetpower | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 组织主键 | pk_org | varchar(20) |  | 主键 (UFID) |
| 3 | pk_group | 集团主键 | pk_group | varchar(20) |  | 主键 (UFID) |
| 4 | pk_childorg | 子组织主键 | pk_childorg | varchar(20) |  | 主键 (UFID) |