# |<<

**评估单子表 (fa_evaluate_b / nc.vo.fa.evaluate.EvaluateBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2019.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_evaluate_b | 主键 | pk_evaluate_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 财务组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 财务组织 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | pk_card | 资产卡片 | pk_card | char(20) | √ | 资产卡片 (asset) |
| 6 | old_localoriginvalue | 评估前原值 | old_localoriginvalue | decimal(28, 8) |  | 金额 (UFMoney) |
| 7 | old_localoriginvalue_global | 评估前原值(全局) | old_localoriginvalue_global | decimal(28, 8) |  | 金额 (UFMoney) |
| 8 | old_curryeardep | 评估前本年折旧 | old_curryeardep | decimal(28, 8) |  | 金额 (UFMoney) |
| 9 | new_curryeardep | 评估后本年折旧 | new_curryeardep | decimal(28, 8) |  | 金额 (UFMoney) |
| 10 | old_localoriginvalue_group | 评估前原值(集团) | old_localoriginvalue_group | decimal(28, 8) |  | 金额 (UFMoney) |
| 11 | new_localoriginvalue | 评估后原值 | new_localoriginvalue | decimal(28, 8) |  | 金额 (UFMoney) |
| 12 | new_localoriginvalue_global | 评估后原值(全局) | new_localoriginvalue_global | decimal(28, 8) |  | 金额 (UFMoney) |
| 13 | new_localoriginvalue_group | 评估后原值(集团) | new_localoriginvalue_group | decimal(28, 8) |  | 金额 (UFMoney) |
| 14 | old_accudep | 评估前累计折旧 | old_accudep | decimal(28, 8) |  | 金额 (UFMoney) |
| 15 | old_accudep_global | 评估前累计折旧(全局) | old_accudep_global | decimal(28, 8) |  | 金额 (UFMoney) |
| 16 | old_accudep_group | 评估前累计折旧(集团) | old_accudep_group | decimal(28, 8) |  | 金额 (UFMoney) |
| 17 | new_accudep | 评估后累计折旧 | new_accudep | decimal(28, 8) |  | 金额 (UFMoney) |
| 18 | new_accudep_global | 评估后累计折旧(全局) | new_accudep_global | decimal(28, 8) |  | 金额 (UFMoney) |
| 19 | new_accudep_group | 评估后累计折旧(集团) | new_accudep_group | decimal(28, 8) |  | 金额 (UFMoney) |
| 20 | old_netvalue | 评估前净值 | old_netvalue | decimal(28, 8) |  | 金额 (UFMoney) |
| 21 | new_netvalue | 评估后净值 | new_netvalue | decimal(28, 8) |  | 金额 (UFMoney) |
| 22 | old_servicemonth | 评估前折旧期数 | old_servicemonth | int |  | 整数 (Integer) |
| 23 | new_servicemonth | 评估后折旧期数 | new_servicemonth | int |  | 整数 (Integer) |
| 24 | old_salvage | 评估前净残值 | old_salvage | decimal(28, 8) |  | 金额 (UFMoney) |
| 25 | old_salvage_global | 评估前净残值(全局) | old_salvage_global | decimal(28, 8) |  | 金额 (UFMoney) |
| 26 | old_salvage_group | 评估前净残值(集团) | old_salvage_group | decimal(28, 8) |  | 金额 (UFMoney) |
| 27 | new_salvage | 评估后净残值 | new_salvage | decimal(28, 8) |  | 金额 (UFMoney) |
| 28 | new_salvage_global | 评估后净残值(全局) | new_salvage_global | decimal(28, 8) |  | 金额 (UFMoney) |
| 29 | new_salvage_group | 评估后净残值(集团) | new_salvage_group | decimal(28, 8) |  | 金额 (UFMoney) |
| 30 | old_salvagerate | 评估前净残值率 | old_salvagerate | decimal(16, 8) |  | 数值 (UFDouble) |
| 31 | new_salvagerate | 评估后净残值率 | new_salvagerate | decimal(16, 8) |  | 数值 (UFDouble) |
| 32 | old_allworkloan | 评估前工作总量 | old_allworkloan | decimal(18, 8) |  | 数值 (UFDouble) |
| 33 | new_allworkloan | 评估后工作总量 | new_allworkloan | decimal(18, 8) |  | 数值 (UFDouble) |
| 34 | old_dep_end_date | 评估前折旧截止日期 | old_dep_end_date | char(19) |  | 日期 (UFDate) |
| 35 | new_dep_end_date | 评估后折旧截止日期 | new_dep_end_date | char(19) |  | 日期 (UFDate) |
| 36 | old_naturemonth | 评估前使用月限 | old_naturemonth | int |  | 整数 (Integer) |
| 37 | new_naturemonth | 评估后使用月限 | new_naturemonth | int |  | 整数 (Integer) |
| 38 | depamount | 月折旧额 | depamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 39 | usedmonth | 已使用月份 | usedmonth | int |  | 整数 (Integer) |
| 40 | accuworkloan | 累计工作量 | accuworkloan | decimal(28, 8) |  | 数值 (UFDouble) |
| 41 | pk_depmethod | 折旧方法 | pk_depmethod | varchar(20) |  | 折旧方法 (depmethod) |
| 42 | pk_currency | 币种 | pk_currency | varchar(20) |  | 币种 (currtype) |
| 43 | originvalue_cal_before | 评估前计算原值 | originvalue_cal_before | decimal(28, 8) |  | 金额 (UFMoney) |
| 44 | accudep_cal_before | 评估前计算累计折旧 | accudep_cal_before | decimal(28, 8) |  | 金额 (UFMoney) |
| 45 | usedmonth_cal_before | 评估前计算已计提月份 | usedmonth_cal_before | int |  | 整数 (Integer) |
| 46 | servicemonth_cal_before | 评估前计算使用月限 | servicemonth_cal_before | int |  | 整数 (Integer) |
| 47 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 48 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 49 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 50 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 51 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 52 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 53 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 54 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 55 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 56 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 57 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 58 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 59 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 60 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 61 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 62 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 63 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 64 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 65 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 66 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |