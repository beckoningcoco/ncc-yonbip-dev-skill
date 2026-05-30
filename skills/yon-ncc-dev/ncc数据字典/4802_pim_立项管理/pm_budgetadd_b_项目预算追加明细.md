# |<<

**项目预算追加明细 (pm_budgetadd_b / nc.vo.pbm.budgetadd.BudgetAddBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4408.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_budgetadd_b | 成本子表标识 | pk_budgetadd_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 字符串 (String) |
| 3 | pk_org | 项目组织最新版本 | pk_org | varchar(20) |  | 字符串 (String) |
| 4 | pk_org_v | 项目组织 | pk_org_v | varchar(20) |  | 字符串 (String) |
| 5 | pk_budgetfactor | 预算编制行号 | pk_budgetfactor | varchar(20) |  | 核算要素预算明细 (budgetfactor) |
| 6 | pk_cbsnode | CBS编码 | pk_cbsnode | varchar(20) |  | 成本分解结构成员 (cbsnode) |
| 7 | rowno | 行号 | rowno | varchar(20) |  | 字符串 (String) |
| 8 | pk_factor | 核算要素 | pk_factor | varchar(20) |  | 要素基本信息 (FactorAsoa) |
| 9 | curr_this_mny | 预算金额 | curr_this_mny | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 10 | add_this_mny | 调整金额 | add_this_mny | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 11 | add_gather_mny | 调整后预算金额 | add_gather_mny | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 12 | bal_this_mny | 预算余额 | bal_this_mny | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 13 | res_mny | 资源预算调整 | res_mny | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 14 | curr_th_in | 收入预算 | curr_th_in | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 15 | add_th_in | 收入调整 | add_th_in | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 16 | add_ga_in | 调整后收入预算 | add_ga_in | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 17 | bal_th_in | 收入差额 | bal_th_in | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 18 | float_per | 浮动百分比 | float_per | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | float_mny | 浮动金额 | float_mny | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 20 | add_bal_mny | 调整后预算余额 | add_bal_mny | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 21 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 22 | exe_mny | 执行金额 | exe_mny | decimal(28, 8) |  | 数值 (UFDouble) |
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