# |<<

**贷款还款计划 (batm_repayplan / nc.vo.batm.cdmvo.BatmRepayPlanVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/235.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_repayplan | 主键 | pk_repayplan | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | billsrc | 单据来源 | billsrc | varchar(50) |  | 字符串 (String) |
| 6 | billmakedate | 制单日期 | billmakedate | char(19) |  | 日期 (UFDate) |
| 7 | pk_contract | 合同主键 | pk_contract | varchar(50) |  | 字符串 (String) |
| 8 | paycode | 放款编号 | paycode | varchar(50) |  | 字符串 (String) |
| 9 | repaycode | 还款计划编号 | repaycode | varchar(50) |  | 字符串 (String) |
| 10 | repaydate | 到期日 | repaydate | char(19) |  | 日期 (UFDate) |
| 11 | preamount | 到期还款额 | preamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 12 | olcpreamount | 到期还款额（本币） | olcpreamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 13 | glcpreamount | 到期还款额（集团本币） | glcpreamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 14 | gllcpreamount | 到期还款额（全局本币） | gllcpreamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 15 | preinterest | 到期利息 | preinterest | decimal(28, 8) |  | 金额 (UFMoney) |
| 16 | olcpreinterest | 到期利息（本币） | olcpreinterest | decimal(28, 8) |  | 金额 (UFMoney) |
| 17 | glcpreinterest | 到期利息（集团本币） | glcpreinterest | decimal(28, 8) |  | 金额 (UFMoney) |
| 18 | gllcpreinterest | 到期利息（全局本币） | gllcpreinterest | decimal(28, 8) |  | 金额 (UFMoney) |
| 19 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 20 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 21 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 22 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 23 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 24 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 25 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 26 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 27 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 28 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 29 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 30 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 31 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 32 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 33 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 34 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 35 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 36 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 37 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 38 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |