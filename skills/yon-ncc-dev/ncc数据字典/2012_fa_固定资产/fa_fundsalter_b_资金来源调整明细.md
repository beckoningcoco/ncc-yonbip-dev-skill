# |<<

**资金来源调整明细 (fa_fundsalter_b / nc.vo.fa.fundsalter.FundsAlterBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2023.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_fundsalter_b | 主键 | pk_fundsalter_b | char(20) | √ | 主键 (UFID) |
| 2 | rowno | 行号 | rowno | varchar(50) |  | 字符串 (String) |
| 3 | pk_accbook | 资产账簿 | pk_accbook | varchar(20) |  | 账簿_财务核算账簿 (accountingbook) |
| 4 | pk_card | 资产卡片 | pk_card | varchar(20) |  | 资产卡片 (asset) |
| 5 | pk_usedept | 使用部门 | pk_usedept | varchar(20) |  | 组织_部门 (dept) |
| 6 | pk_currency | 币种 | pk_currency | varchar(20) |  | 币种 (currtype) |
| 7 | pk_fundsource | 资金来源 | pk_fundsource | varchar(20) |  | 医疗资金来源 (FundSourceVO) |
| 8 | pk_jobmngfil | 项目档案 | pk_jobmngfil | varchar(20) |  | 项目 (project) |
| 9 | localvalue_before | 变动前本币 | localvalue_before | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | localvalue_alter | 变动部分本币 | localvalue_alter | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | localvalue_after | 变动后本币 | localvalue_after | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | pk_reason | 变动原因 | pk_reason | varchar(20) |  | 原因 (reason) |
| 13 | srcbillid | 来源单据ID | srcbillid | varchar(50) |  | 字符串 (String) |
| 14 | srcbillno | 来源单据号 | srcbillno | varchar(50) |  | 字符串 (String) |
| 15 | srcbilltype | 来源单据类型 | srcbilltype | varchar(50) |  | 字符串 (String) |
| 16 | srcbillbid | 来源单据明细ID | srcbillbid | varchar(50) |  | 字符串 (String) |
| 17 | srcbillrowno | 来源单据行号 | srcbillrowno | varchar(50) |  | 字符串 (String) |
| 18 | def1 | 自定义项1 | def1 | varchar(100) |  | 字符串 (String) |
| 19 | def2 | 自定义项2 | def2 | varchar(100) |  | 字符串 (String) |
| 20 | def3 | 自定义项3 | def3 | varchar(100) |  | 字符串 (String) |
| 21 | def4 | 自定义项4 | def4 | varchar(100) |  | 字符串 (String) |
| 22 | def5 | 自定义项5 | def5 | varchar(100) |  | 字符串 (String) |
| 23 | def6 | 自定义项6 | def6 | varchar(100) |  | 字符串 (String) |
| 24 | def7 | 自定义项7 | def7 | varchar(100) |  | 字符串 (String) |
| 25 | def8 | 自定义项8 | def8 | varchar(100) |  | 字符串 (String) |
| 26 | def9 | 自定义项9 | def9 | varchar(100) |  | 字符串 (String) |
| 27 | def10 | 自定义项10 | def10 | varchar(100) |  | 字符串 (String) |
| 28 | def11 | 自定义项11 | def11 | varchar(100) |  | 字符串 (String) |
| 29 | def12 | 自定义项12 | def12 | varchar(100) |  | 字符串 (String) |
| 30 | def13 | 自定义项13 | def13 | varchar(100) |  | 字符串 (String) |
| 31 | def14 | 自定义项14 | def14 | varchar(100) |  | 字符串 (String) |
| 32 | def15 | 自定义项15 | def15 | varchar(100) |  | 字符串 (String) |
| 33 | def16 | 自定义项16 | def16 | varchar(100) |  | 字符串 (String) |
| 34 | def17 | 自定义项17 | def17 | varchar(100) |  | 字符串 (String) |
| 35 | def18 | 自定义项18 | def18 | varchar(100) |  | 字符串 (String) |
| 36 | def19 | 自定义项19 | def19 | varchar(100) |  | 字符串 (String) |
| 37 | def20 | 自定义项20 | def20 | varchar(100) |  | 字符串 (String) |