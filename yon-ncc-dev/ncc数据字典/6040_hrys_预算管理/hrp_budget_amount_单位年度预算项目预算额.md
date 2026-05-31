# |<<

**单位年度预算项目预算额 (hrp_budget_amount / nc.vo.hrp.budgetmgt.BudgetAmountVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2725.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_budget_amount | 子表主键 | pk_budget_amount | char(20) | √ | 主键 (UFID) |
| 2 | pk_budget | 预算计划主键 | pk_budget | char(20) |  | 主键 (UFID) |
| 3 | pk_budget_item | 预算项目主键 | pk_budget_item | varchar(20) |  | 预算项目 (BudgetItemVO) |
| 4 | value_self | 本级预算额 | value_self | decimal(31, 2) |  | 数值 (UFDouble) |
| 5 | value_junior | 下级预算额 | value_junior | decimal(31, 2) |  | 数值 (UFDouble) |
| 6 | value_def | 自定义实际值 | value_def | decimal(31, 2) |  | 数值 (UFDouble) |