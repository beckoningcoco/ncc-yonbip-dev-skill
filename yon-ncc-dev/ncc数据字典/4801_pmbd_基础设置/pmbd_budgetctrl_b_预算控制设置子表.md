# |<<

**预算控制设置子表 (pmbd_budgetctrl_b / nc.vo.pbm.budgetctrl.BudgetCtrlBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4564.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_costbgtctrl_b | 预算控制子表主键 | pk_costbgtctrl_b | char(20) | √ | 主键 (UFID) |
| 2 | rowno | 行号 | rowno | varchar(20) |  | 字符串 (String) |
| 3 | ctrl_type | 控制类型 | ctrl_type | int |  | 预算控制类型 (budgetctrltype) |  | 0=刚性控制; |