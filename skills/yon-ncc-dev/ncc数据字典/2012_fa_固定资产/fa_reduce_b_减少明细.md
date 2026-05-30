# |<<

**减少明细 (fa_reduce_b / nc.vo.fa.reduce.ReduceBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2056.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_reduce_b | 减少明细主键 | pk_reduce_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_accbook | 资产帐簿 | pk_accbook | varchar(50) |  | 字符串 (String) |
| 3 | pk_accbook_scale | 资产账簿精度控制 | pk_accbook_scale | varchar(50) |  | 字符串 (String) |
| 4 | pk_card | 资产卡片 | pk_card | char(20) | √ | 资产卡片 (asset) |
| 5 | pk_reducestyle | 减少方式 | pk_reducestyle | varchar(20) |  | 增减方式 (AddreduceStyleVO) |
| 6 | pk_reason | 减少原因 | pk_reason | varchar(20) |  | 原因 (reason) |
| 7 | pk_cumandoc | 减少对方单位 | pk_cumandoc | varchar(20) |  | 客商 (custsupplier) |
| 8 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 9 | bill_type | 单据类型 | bill_type | varchar(4) |  | 字符串 (String) |
| 10 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 11 | pk_org | 财务组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 12 | pk_org_v | 财务组织 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 13 | red_localoriginvalue | 本币原值 | red_localoriginvalue | decimal(28, 8) |  | 金额 (UFMoney) |
| 14 | red_localoriginvalue_group | 减少本币原值(集团) | red_localoriginvalue_group | decimal(28, 8) |  | 金额 (UFMoney) |
| 15 | red_localoriginvalue_global | 减少本币原值(全局) | red_localoriginvalue_global | decimal(28, 8) |  | 金额 (UFMoney) |
| 16 | red_accudep | 减少累计折旧 | red_accudep | decimal(28, 8) |  | 金额 (UFMoney) |
| 17 | red_accudep_group | 减少累计折旧(集团) | red_accudep_group | decimal(28, 8) |  | 金额 (UFMoney) |
| 18 | red_accudep_global | 减少累计折旧(全局) | red_accudep_global | decimal(28, 8) |  | 金额 (UFMoney) |
| 19 | red_predevaluate | 减值准备 | red_predevaluate | decimal(28, 8) |  | 金额 (UFMoney) |
| 20 | red_predevaluate_group | 减值准备(集团) | red_predevaluate_group | decimal(28, 8) |  | 金额 (UFMoney) |
| 21 | red_predevaluate_global | 减值准备(全局) | red_predevaluate_global | decimal(28, 8) |  | 金额 (UFMoney) |
| 22 | simulatedep | 模拟折旧 | simulatedep | decimal(28, 8) |  | 金额 (UFMoney) |
| 23 | simulatedep_group | 减少模拟折旧(集团) | simulatedep_group | decimal(28, 8) |  | 金额 (UFMoney) |
| 24 | simulatedep_global | 减少模拟折旧(全局) | simulatedep_global | decimal(28, 8) |  | 金额 (UFMoney) |
| 25 | purgerevenue | 清理收入 | purgerevenue | decimal(28, 8) |  | 金额 (UFMoney) |
| 26 | purgerevenue_group | 减少清理收入(集团) | purgerevenue_group | decimal(28, 8) |  | 金额 (UFMoney) |
| 27 | purgerevenue_global | 减少清理收入(全局) | purgerevenue_global | decimal(28, 8) |  | 金额 (UFMoney) |
| 28 | purgefee | 清理费用 | purgefee | decimal(28, 8) |  | 金额 (UFMoney) |
| 29 | purgefee_group | 减少清理费用(集团) | purgefee_group | decimal(28, 8) |  | 金额 (UFMoney) |
| 30 | purgefee_global | 减少清理费用(全局) | purgefee_global | decimal(28, 8) |  | 金额 (UFMoney) |
| 31 | red_netvalue | 净值 | red_netvalue | decimal(28, 8) |  | 金额 (UFMoney) |
| 32 | red_netvalue_group | 减少净值(集团) | red_netvalue_group | decimal(28, 8) |  | 金额 (UFMoney) |
| 33 | red_netvalue_global | 减少净值(全局) | red_netvalue_global | decimal(28, 8) |  | 金额 (UFMoney) |
| 34 | red_netrating | 净额 | red_netrating | decimal(28, 8) |  | 金额 (UFMoney) |
| 35 | red_netrating_group | 减少净额(集团) | red_netrating_group | decimal(28, 8) |  | 金额 (UFMoney) |
| 36 | red_netrating_global | 减少净额(全局) | red_netrating_global | decimal(28, 8) |  | 金额 (UFMoney) |
| 37 | red_salvage | 减少净残值 | red_salvage | decimal(28, 8) |  | 金额 (UFMoney) |
| 38 | red_salvage_group | 减少净残值(集团) | red_salvage_group | decimal(28, 8) |  | 金额 (UFMoney) |
| 39 | red_salvage_global | 减少净残值(全局) | red_salvage_global | decimal(28, 8) |  | 金额 (UFMoney) |
| 40 | pk_bill_src | 来源单据标识 | pk_bill_src | varchar(20) |  | 字符串 (String) |
| 41 | pk_bill_b_src | 来源单据表体标识 | pk_bill_b_src | varchar(20) |  | 字符串 (String) |
| 42 | accudep | 累计折旧 | accudep | decimal(28, 8) |  | 金额 (UFMoney) |
| 43 | pk_currency | 币种 | pk_currency | varchar(20) |  | 币种 (currtype) |
| 44 | servicemonth | 折旧期数 | servicemonth | int |  | 整数 (Integer) |
| 45 | tax_input | 进项税 | tax_input | decimal(28, 8) |  | 金额 (UFMoney) |
| 46 | usedmonth | 已计提期数 | usedmonth | int |  | 整数 (Integer) |
| 47 | usufructasset_flag | 是否使用权资产 | usufructasset_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 48 | reduce_rent | 剩余租金 | reduce_rent | decimal(28, 8) |  | 金额 (UFMoney) |
| 49 | pk_fundsource | 资金来源主键 | pk_fundsource | varchar(2000) |  | 字符串 (String) |
| 50 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 51 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 52 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 53 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 54 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 55 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 56 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 57 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 58 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 59 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 60 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 61 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 62 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 63 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 64 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 65 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 66 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 67 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 68 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 69 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |
| 70 | pk_fundsourcetxt | 资金来源 | pk_fundsourcetxt | varchar(101) |  | 自定义项 (Custom) |