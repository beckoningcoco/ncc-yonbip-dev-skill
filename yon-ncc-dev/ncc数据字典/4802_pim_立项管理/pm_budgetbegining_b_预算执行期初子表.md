# |<<

**预算执行期初子表 (pm_budgetbegining_b / nc.vo.pbm.budgetbegining.BudgetBeginingBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4411.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_budgetbegin_b | 预算执行期初子表主键 | pk_budgetbegin_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 项目组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_项目组织 (itemorg) |
| 4 | pk_org_v | 项目组织 | pk_org_v | varchar(20) |  | 组织_业务单元_项目组织版本信息 (itemorg_v) |
| 5 | rowno | 行号 | rowno | varchar(50) |  | 字符串 (String) |
| 6 | pk_cbsnode | CBS | pk_cbsnode | varchar(20) |  | 成本分解结构成员 (cbsnode) |
| 7 | pk_project | 项目 | pk_project | varchar(20) |  | 项目 (project) |
| 8 | pk_factor | 核算要素 | pk_factor | varchar(20) |  | 要素基本信息 (FactorAsoa) |
| 9 | exe_mny | 执行金额 | exe_mny | decimal(28, 8) |  | 金额 (UFMoney) |
| 10 | exe_mny_group | 执行金额(集团) | exe_mny_group | decimal(28, 8) |  | 金额 (UFMoney) |
| 11 | exe_mny_global | 执行金额(全局) | exe_mny_global | decimal(28, 8) |  | 金额 (UFMoney) |
| 12 | in_exe_mny | 收入执行金额 | in_exe_mny | decimal(28, 8) |  | 金额 (UFMoney) |
| 13 | in_exe_mny_group | 收入执行金额(集团) | in_exe_mny_group | decimal(28, 8) |  | 金额 (UFMoney) |
| 14 | in_exe_mny_global | 收入执行金额(全局) | in_exe_mny_global | decimal(28, 8) |  | 金额 (UFMoney) |
| 15 | ori_busidate | 原始业务日期 | ori_busidate | char(19) |  | 日期 (UFDate) |
| 16 | pk_material | 物资编码 | pk_material | varchar(20) |  | 物料基本信息 (material_v) |
| 17 | pk_measdoc | 单位 | pk_measdoc | varchar(20) |  | 计量单位 (measdoc) |
| 18 | nnum | 数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | exe_unit_price | 预算执行单价 | exe_unit_price | decimal(28, 8) |  | 金额 (UFMoney) |
| 20 | pk_wbs | 项目任务 | pk_wbs | varchar(20) |  | 项目任务 (WBS) |
| 21 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 22 | pk_mcontr | 合同编码 | pk_mcontr | varchar(50) |  | 字符串 (String) |
| 23 | pk_supplier | 供应商 | pk_supplier | varchar(20) |  | 供应商基本信息 (supplier) |
| 24 | memo | 备注 | memo | varchar(300) |  | 字符串 (String) |
| 25 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 26 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 27 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 28 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 29 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 30 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 31 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 32 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 33 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 34 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 35 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 36 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 37 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 38 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 39 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 40 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 41 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 42 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 43 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 44 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |