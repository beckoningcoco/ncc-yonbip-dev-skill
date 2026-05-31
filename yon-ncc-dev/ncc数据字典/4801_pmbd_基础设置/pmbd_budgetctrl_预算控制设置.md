# |<<

**预算控制设置 (pmbd_budgetctrl / nc.vo.pbm.budgetctrl.BudgetCtrlHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4563.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_costbgtctrl | 预算控制主键 | pk_costbgtctrl | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | ctrl_name | 名称 | ctrl_name | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | bill_code | 编码 | bill_code | varchar(40) |  | 字符串 (String) |
| 5 | meomo | 备注 | meomo | varchar(300) |  | 字符串 (String) |
| 6 | rule_organizdate | 编制日期 | rule_organizdate | char(19) |  | 日期 (UFDate) |
| 7 | enablestate | 启用状态 | enablestate | int |  | 启用状态2(项目管理) (pmEnablestate2) |  | 2=已启用; |