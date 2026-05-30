# |<<

**预算项目 (hrp_budget_item / nc.vo.hrp.budgetitem.BudgetItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2730.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_budget_item | 预算项目主键 | pk_budget_item | char(20) | √ | 主键 (UFID) |
| 2 | pk_item_doc | 预算项目档案主键 | pk_item_doc | varchar(20) | √ | 预算项目档案 (BudgetItemDocVO) |
| 3 | item_attr | 预算项目属性 | item_attr | int | √ | 预算项目属性 (BudgetItem_DocAttrEnum) | 1 | 0=预算项目档案; |