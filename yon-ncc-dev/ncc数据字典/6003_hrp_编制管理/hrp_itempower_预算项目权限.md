# |<<

**预算项目权限 (hrp_itempower / nc.vo.hrp.itempower.ItemPowerVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2741.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_item_power | 预算项目权限主键 | pk_item_power | char(20) | √ | 主键 (UFID) |
| 2 | item_year | 年度 | item_year | char(4) |  | 字符串 (String) |
| 3 | pk_budgetitem | 预算项目 | pk_budgetitem | varchar(20) |  | 预算项目 (BudgetItemVO) |
| 4 | impower_type | 授权类型 | impower_type | int |  | 授权类型 (enum) |  | 1=按预算项目授权; |