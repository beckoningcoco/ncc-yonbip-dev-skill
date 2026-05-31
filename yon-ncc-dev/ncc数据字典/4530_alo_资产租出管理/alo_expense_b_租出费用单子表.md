# |<<

**租出费用单子表 (alo_expense_b / nc.vo.alo.rent.expense.LeaseExpenseBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/92.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_expense_b | 租出费用单子表主键 | pk_expense_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 资产组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 4 | pk_org_v | 资产组织版本信息 | pk_org_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 5 | rowno | 行号 | rowno | varchar(50) |  | 字符串 (String) |
| 6 | pk_equip | 设备 | pk_equip | varchar(20) |  | 设备卡片 (EquipHeadVO) |
| 7 | equip_code | 设备编码 | equip_code | varchar(40) |  | 字符串 (String) |
| 8 | exp_jobmngfil | 费用项目 | exp_jobmngfil | varchar(20) |  | 费用项目 (ExpenseTypeVO) |
| 9 | exp_rent | 费用金额 | exp_rent | decimal(28, 8) |  | 金额 (UFMoney) |  | [0 , ] |
| 10 | exp_rent_org | 费用金额（本币） | exp_rent_org | decimal(28, 8) |  | 金额 (UFMoney) |
| 11 | exp_rent_group | 费用金额（集团本币） | exp_rent_group | decimal(28, 8) |  | 金额 (UFMoney) |
| 12 | exp_rent_global | 费用金额（全局本币） | exp_rent_global | decimal(28, 8) |  | 金额 (UFMoney) |
| 13 | pk_customer | 费用出资方 | pk_customer | int |  | 租赁对象 (LeaseObjectEnum) |  | 1=出租方; |