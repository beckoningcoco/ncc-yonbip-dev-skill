# |<<

**核算要素预算明细 (pm_budgetfactor / nc.vo.pbm.budget.BudgetFactorBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4413.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_budgetfactor | 主键 | pk_budgetfactor | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 项目组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_项目组织 (itemorg) |
| 4 | pk_org_v | 项目组织 | pk_org_v | varchar(20) |  | 组织_业务单元_项目组织版本信息 (itemorg_v) |
| 5 | rowno | 行号 | rowno | varchar(20) |  | 字符串 (String) |
| 6 | pk_cbsnode | CBS编码 | pk_cbsnode | varchar(20) |  | 成本分解结构成员 (cbsnode) |
| 7 | pk_factor | 核算要素 | pk_factor | varchar(20) |  | 要素基本信息 (FactorAsoa) |
| 8 | budget_mny | 预算金额 | budget_mny | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 9 | pre_stage_mny | 上阶段金额 | pre_stage_mny | decimal(28, 8) |  | 金额 (UFMoney) |
| 10 | tot_add_mny | 累计调整 | tot_add_mny | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 11 | exe_mny | 执行金额 | exe_mny | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 12 | bala_mny | 预算余额 | bala_mny | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 13 | memo | 备注 | memo | varchar(300) |  | 字符串 (String) |
| 14 | src_pk_budgetadd | 追加行的预算追加的来源主键 | src_pk_budgetadd | varchar(20) |  | 字符串 (String) |
| 15 | res_mny | 资源预算 | res_mny | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 16 | pre_exe_mny | 预占金额 | pre_exe_mny | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 17 | float_mny | 浮动金额 | float_mny | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 18 | float_per | 浮动百分比 | float_per | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 19 | in_bala_mny | 收入差额 | in_bala_mny | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 20 | in_exe_mny | 收入执行金额 | in_exe_mny | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 21 | in_tot_add | 累计收入调整 | in_tot_add | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 22 | in_budget | 收入预算 | in_budget | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 23 | bdef1 | 自定义项1 | bdef1 | varchar(101) |  | 自定义项 (Custom) |
| 24 | bdef2 | 自定义项2 | bdef2 | varchar(101) |  | 自定义项 (Custom) |
| 25 | bdef3 | 自定义项3 | bdef3 | varchar(101) |  | 自定义项 (Custom) |
| 26 | bdef4 | 自定义项4 | bdef4 | varchar(101) |  | 自定义项 (Custom) |
| 27 | bdef5 | 自定义项5 | bdef5 | varchar(101) |  | 自定义项 (Custom) |
| 28 | bdef6 | 自定义项6 | bdef6 | varchar(101) |  | 自定义项 (Custom) |
| 29 | bdef7 | 自定义项7 | bdef7 | varchar(101) |  | 自定义项 (Custom) |
| 30 | bdef8 | 自定义项8 | bdef8 | varchar(101) |  | 自定义项 (Custom) |
| 31 | bdef9 | 自定义项9 | bdef9 | varchar(101) |  | 自定义项 (Custom) |
| 32 | bdef10 | 自定义项10 | bdef10 | varchar(101) |  | 自定义项 (Custom) |
| 33 | bdef11 | 自定义项11 | bdef11 | varchar(101) |  | 自定义项 (Custom) |
| 34 | bdef12 | 自定义项12 | bdef12 | varchar(101) |  | 自定义项 (Custom) |
| 35 | bdef13 | 自定义项13 | bdef13 | varchar(101) |  | 自定义项 (Custom) |
| 36 | bdef14 | 自定义项14 | bdef14 | varchar(101) |  | 自定义项 (Custom) |
| 37 | bdef15 | 自定义项15 | bdef15 | varchar(101) |  | 自定义项 (Custom) |
| 38 | bdef16 | 自定义项16 | bdef16 | varchar(101) |  | 自定义项 (Custom) |
| 39 | bdef17 | 自定义项17 | bdef17 | varchar(101) |  | 自定义项 (Custom) |
| 40 | bdef18 | 自定义项18 | bdef18 | varchar(101) |  | 自定义项 (Custom) |
| 41 | bdef19 | 自定义项19 | bdef19 | varchar(101) |  | 自定义项 (Custom) |
| 42 | bdef20 | 自定义项20 | bdef20 | varchar(101) |  | 自定义项 (Custom) |