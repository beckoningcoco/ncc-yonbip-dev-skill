# |<<

**经营租出费用单子表 (aol_expense_b / nc.vo.aol.lease.expense.LeaseExpenseBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/119.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_expense_b | 经营费用单子表主键 | pk_expense_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 资产组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 4 | pk_org_v | 资产组织版本信息 | pk_org_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 5 | rowno | 行号 | rowno | varchar(50) |  | 字符串 (String) |
| 6 | pk_equip | 资产 | pk_equip | varchar(20) |  | 设备卡片 (EquipHeadVO) |
| 7 | exp_jobmngfil | 费用项目 | exp_jobmngfil | varchar(20) |  | 费用项目 (ExpenseTypeVO) |
| 8 | exp_rent | 费用金额 | exp_rent | decimal(28, 8) |  | 金额 (UFMoney) |  | [0 , ] |
| 9 | exp_rent_org | 费用金额（本币） | exp_rent_org | decimal(28, 8) |  | 金额 (UFMoney) |
| 10 | exp_rent_group | 费用金额（集团本币） | exp_rent_group | decimal(28, 8) |  | 金额 (UFMoney) |
| 11 | exp_rent_global | 费用金额（全局本币） | exp_rent_global | decimal(28, 8) |  | 金额 (UFMoney) |
| 12 | exp_cost_date | 发生日期 | exp_cost_date | char(19) |  | 日期 (UFDate) |
| 13 | pk_jobmngfil | 项目 | pk_jobmngfil | varchar(20) |  | 项目 (project) |
| 14 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 15 | src_pk_bill | 来源单据主键 | src_pk_bill | varchar(20) |  | 字符串 (String) |
| 16 | src_pk_bill_b | 来源单据表体主键 | src_pk_bill_b | varchar(20) |  | 字符串 (String) |
| 17 | src_bill_type | 来源单据类型 | src_bill_type | varchar(20) |  | 字符串 (String) |
| 18 | src_bill_code | 来源单据单据号 | src_bill_code | varchar(40) |  | 字符串 (String) |
| 19 | src_transi_type | 来源交易类型 | src_transi_type | varchar(30) |  | 字符串 (String) |
| 20 | pk_org_in | 承租组织最新版本 | pk_org_in | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 21 | pk_org_in_v | 承租组织 | pk_org_in_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 22 | pk_customer | 承租方 | pk_customer | varchar(20) |  | 客户基本信息 (customer) |
| 23 | pk_freecustom | 散户 | pk_freecustom | varchar(20) |  | 散户 (freecustom) |
| 24 | pk_contract | 合同编码 | pk_contract | varchar(20) |  | 经营性租出合同 (ContractOutHeadVO) |
| 25 | pk_lease_target | 租赁对象 | pk_lease_target | varchar(20) |  | 租赁对象 (LeaseTargetVO) |
| 26 | receivable_flag | 已确认 | receivable_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 27 | gather_money | 收款金额 | gather_money | decimal(28, 8) |  | 金额 (UFMoney) |
| 28 | gather_money_org | 收款金额（本币） | gather_money_org | decimal(28, 8) |  | 金额 (UFMoney) |
| 29 | gather_money_group | 收款金额（集团本币） | gather_money_group | decimal(28, 8) |  | 金额 (UFMoney) |
| 30 | gather_money_global | 收款金额（全局本币） | gather_money_global | decimal(28, 8) |  | 金额 (UFMoney) |
| 31 | pk_currency_origin | 原币币种 | pk_currency_origin | varchar(20) |  | 币种 (currtype) |
| 32 | pk_currency_local | 本币币种 | pk_currency_local | varchar(20) |  | 币种 (currtype) |
| 33 | origin_rate | 汇率 | origin_rate | decimal(28, 8) |  | 数值 (UFDouble) |
| 34 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 35 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 36 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 37 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 38 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 39 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 40 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 41 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 42 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 43 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 44 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 45 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 46 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 47 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 48 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 49 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 50 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 51 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 52 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 53 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |