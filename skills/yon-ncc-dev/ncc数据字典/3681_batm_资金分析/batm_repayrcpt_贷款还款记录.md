# |<<

**贷款还款记录 (batm_repayrcpt / nc.vo.batm.cdmvo.BatmRepayrcptVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/236.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_repayrcpt | 主键 | pk_repayrcpt | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | billsrc | 单据来源 | billsrc | varchar(50) |  | 字符串 (String) |
| 6 | billmakedate | 制单日期 | billmakedate | char(19) |  | 日期 (UFDate) |
| 7 | pk_contract | 合同主键 | pk_contract | varchar(50) |  | 字符串 (String) |
| 8 | repaycode | 还款计划编号 | repaycode | varchar(50) |  | 字符串 (String) |
| 9 | repaydate | 还款日期 | repaydate | char(19) |  | 日期 (UFDate) |
| 10 | pk_currtype | 币种 | pk_currtype | varchar(50) |  | 字符串 (String) |
| 11 | repayamount | 还款本金 | repayamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 12 | olcrepayamount | 还款本金(本币) | olcrepayamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 13 | glcrepayamount | 还款本金(集团本币) | glcrepayamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 14 | gllcrepayamount | 还款本金(全局 本币) | gllcrepayamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 15 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 16 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 17 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 18 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 19 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 20 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 21 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 22 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 23 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 24 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 25 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 26 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 27 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 28 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 29 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 30 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 31 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 32 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 33 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 34 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |