# |<<

**预算执行单明细 (pm_budget_exe / nc.vo.pbm.budgetexe.BudgetExeBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4406.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_budget_exe_b | 预算执行明细主键 | pk_budget_exe_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 项目组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_项目组织 (itemorg) |
| 4 | pk_org_v | 项目组织 | pk_org_v | varchar(20) |  | 组织_业务单元_项目组织版本信息 (itemorg_v) |
| 5 | pk_project | 项目 | pk_project | varchar(20) |  | 项目(项目管理) (pmproject) |
| 6 | pk_budget | 预算主键 | pk_budget | char(20) |  | 主键 (UFID) |
| 7 | pk_wbs | 项目任务 | pk_wbs | varchar(20) |  | 项目任务 (WBS) |
| 8 | pk_factor | 核算要素 | pk_factor | varchar(20) |  | 要素基本信息 (FactorAsoa) |
| 9 | pk_cbsnode | CBS | pk_cbsnode | varchar(20) |  | 成本分解结构成员 (cbsnode) |
| 10 | bill_type | 来源单据类型 | bill_type | varchar(50) |  | 字符串 (String) |
| 11 | pk_transitype | 来源交易类型 | pk_transitype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 12 | bill_code | 来源单据编码 | bill_code | varchar(50) |  | 字符串 (String) |
| 13 | src_pk_bill | 来源单据主键 | src_pk_bill | char(20) |  | 主键 (UFID) |
| 14 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 15 | nmoney | 业务单据金额 | nmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 16 | nmoney_org | 业务单据金额（组织） | nmoney_org | decimal(28, 8) |  | 金额 (UFMoney) |
| 17 | nmoney_group | 业务单据金额（集团） | nmoney_group | decimal(28, 8) |  | 金额 (UFMoney) |
| 18 | nmoney_global | 业务单据金额（全局） | nmoney_global | decimal(28, 8) |  | 金额 (UFMoney) |
| 19 | pre_nmoney | 预占金额 | pre_nmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 20 | pre_nmoney_org | 预占金额（组织） | pre_nmoney_org | decimal(28, 8) |  | 金额 (UFMoney) |
| 21 | pre_nmoney_group | 预占金额（集团） | pre_nmoney_group | decimal(28, 8) |  | 金额 (UFMoney) |
| 22 | pre_nmoney_global | 预占金额（全局） | pre_nmoney_global | decimal(28, 8) |  | 金额 (UFMoney) |
| 23 | exe_mny | 执行金额 | exe_mny | decimal(28, 8) |  | 金额 (UFMoney) |
| 24 | exe_mny_org | 执行金额（组织） | exe_mny_org | decimal(28, 8) |  | 金额 (UFMoney) |
| 25 | exe_mny_group | 执行金额（集团） | exe_mny_group | decimal(28, 8) |  | 金额 (UFMoney) |
| 26 | exe_mny_global | 执行金额（全局） | exe_mny_global | decimal(28, 8) |  | 金额 (UFMoney) |
| 27 | in_exe_mny | 收入执行金额 | in_exe_mny | decimal(28, 8) |  | 金额 (UFMoney) |
| 28 | in_exe_mny_group | 收入执行金额（集团） | in_exe_mny_group | decimal(28, 8) |  | 金额 (UFMoney) |
| 29 | in_exe_mny_org | 收入执行金额（组织） | in_exe_mny_org | decimal(28, 8) |  | 金额 (UFMoney) |
| 30 | in_exe_mny_global | 收入执行金额（全局） | in_exe_mny_global | decimal(28, 8) |  | 金额 (UFMoney) |
| 31 | pk_material | 物资编码 | pk_material | varchar(20) |  | 物料基本信息 (material_v) |
| 32 | nnum | 数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 33 | pk_measdoc | 计量单位 | pk_measdoc | varchar(20) |  | 计量单位 (measdoc) |
| 34 | exe_unit_price | 预算执行单价 | exe_unit_price | decimal(28, 8) |  | 金额 (UFMoney) |
| 35 | pk_supplier | 供应商 | pk_supplier | varchar(20) |  | 供应商基本信息 (supplier) |
| 36 | total_release_pre_mny | 累计释放预占金额 | total_release_pre_mny | decimal(28, 8) |  | 金额 (UFMoney) |
| 37 | curr_release_pre_mny | 本次释放预占金额 | curr_release_pre_mny | decimal(28, 8) |  | 金额 (UFMoney) |
| 38 | rate_date | 汇率日期 | rate_date | char(19) |  | 日期 (UFDate) |
| 39 | bill_hid | 表头唯一标识 | bill_hid | varchar(50) |  | 字符串 (String) |
| 40 | bill_bid | 表体唯一标识 | bill_bid | char(20) |  | 主键 (UFID) |
| 41 | billmaketime | 制单日期 | billmaketime | char(19) |  | 日期 (UFDate) |
| 42 | digest | 摘要 | digest | varchar(50) |  | 字符串 (String) |
| 43 | top_pk_bill | 上游业务主键 | top_pk_bill | varchar(50) |  | 字符串 (String) |
| 44 | saga_gtxid | 全局事务id | saga_gtxid | varchar(50) |  | 字符串 (String) |
| 45 | saga_btxid | 子事务id | saga_btxid | varchar(50) |  | 字符串 (String) |
| 46 | saga_frozen | 冻结状态 | saga_frozen | int |  | 整数 (Integer) |
| 47 | saga_status | Saga事务状态 | saga_status | int |  | 整数 (Integer) |