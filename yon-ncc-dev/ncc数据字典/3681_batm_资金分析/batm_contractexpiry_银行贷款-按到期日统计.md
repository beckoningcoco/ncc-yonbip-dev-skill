# |<<

**银行贷款-按到期日统计 (batm_contractexpiry / nc.vo.batm.cdmvo.ContractExpiryVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/214.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 2 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 4 | contractcode | 合同号 | contractcode | varchar(50) |  | 字符串 (String) |
| 5 | pk_debitorg | 借款单位 | pk_debitorg | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 6 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 7 | daystype | 到期日类型 | daystype | int |  | 整数 (Integer) |
| 8 | pk_creditbank | 贷款银行 | pk_creditbank | varchar(20) |  | 银行档案 (bankdoc) |
| 9 | paycode | 放款单号 | paycode | varchar(50) |  | 字符串 (String) |
| 10 | repaycode | 还款计划编号 | repaycode | varchar(50) |  | 字符串 (String) |
| 11 | paydate | 放款日期 | paydate | char(10) |  | 模糊日期 (UFLiteralDate) |
| 12 | repaydate | 预计还款日期 | repaydate | char(10) |  | 模糊日期 (UFLiteralDate) |
| 13 | rate | 利率 | rate | varchar(50) |  | 字符串 (String) |
| 14 | begindate | 开始日期 | begindate | char(10) |  | 模糊日期 (UFLiteralDate) |
| 15 | enddate | 结束日期 | enddate | char(10) |  | 模糊日期 (UFLiteralDate) |
| 16 | notyetmnt | 应还本金金额原币 | notyetmnt | decimal(28, 8) |  | 金额 (UFMoney) |
| 17 | olcnotyetmnt | 应还本金金额组织本币 | olcnotyetmnt | decimal(28, 8) |  | 金额 (UFMoney) |
| 18 | glcnotyetmnt | 应还本金金额集团本币 | glcnotyetmnt | decimal(28, 8) |  | 金额 (UFMoney) |
| 19 | gllcnotyetmnt | 应还本金金额全局本币 | gllcnotyetmnt | decimal(28, 8) |  | 金额 (UFMoney) |
| 20 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 21 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 22 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 23 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 24 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 25 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 26 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 27 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 28 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 29 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 30 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 31 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 32 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 33 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 34 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 35 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 36 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 37 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 38 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 39 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |