# |<<

**凭证余额 (gl_balance / nc.vo.gl.balance.balance)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2350.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_balance | 余额主键 | pk_balance | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | char(20) |  | 字符串 (String) |
| 3 | pk_org | 财务组织 | pk_org | char(20) |  | 主键 (UFID) |
| 4 | pk_org_v | 财务组织版本 | pk_org_v | char(20) |  | 字符串 (String) |
| 5 | pk_accountingbook | 帐簿 | pk_accountingbook | char(20) |  | 主键 (UFID) |
| 6 | pk_unit | 业务单元 | pk_unit | varchar(50) |  | 字符串 (String) |
| 7 | pk_setofbook | 核算账簿 | pk_setofbook | char(20) |  | 主键 (UFID) |
| 8 | pk_accasoa | 科目主键 | pk_accasoa | char(20) |  | 主键 (UFID) |
| 9 | pk_currtype | 币种主键 | pk_currtype | char(20) |  | 主键 (UFID) |
| 10 | year | 会计年度 | year | char(4) |  | 主键 (UFID) |
| 11 | period | 会计期间 | period | char(2) |  | 主键 (UFID) |
| 12 | assid | 辅助核算标识 | assid | char(20) |  | 主键 (UFID) |
| 13 | debitquantity | 借方数量 | debitquantity | decimal(20, 8) |  | 数值 (UFDouble) |
| 14 | debitamount | 原币借发生额 | debitamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | fracdebitamount | 辅币借发生额 | fracdebitamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | localdebitamount | 本币借发生额 | localdebitamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | creditquantity | 贷方数量 | creditquantity | decimal(20, 8) |  | 数值 (UFDouble) |
| 18 | creditamount | 原币贷发生额 | creditamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | fraccreditamount | 辅币贷发生额 | fraccreditamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | localcreditamount | 本币贷发生额 | localcreditamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | groupdebitamount | 集团本币借发生额 | groupdebitamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | groupcreditamount | 集团本币贷发生额 | groupcreditamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | globaldebitamount | 全局本币借发生额 | globaldebitamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | globalcreditamount | 全局本币贷发生额 | globalcreditamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 25 | adjustperiod | 调整期间 | adjustperiod | varchar(3) |  | 字符串 (String) |
| 26 | setofbookdebitamount | 账簿类型借方发生额 | setofbookdebitamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 27 | setofbookcreditamounr | 账簿类型贷方发生额 | setofbookcreditamounr | decimal(28, 8) |  | 数值 (UFDouble) |
| 28 | pk_liabilitycenter | 利润中心 | pk_liabilitycenter | varchar(20) |  | 利润中心 (profitcenter) |
| 29 | free1 | 预留字段1 | free1 | varchar(60) |  | 字符串 (String) |
| 30 | free2 | 预留字段2 | free2 | varchar(60) |  | 字符串 (String) |
| 31 | free3 | 预留字段3 | free3 | varchar(60) |  | 字符串 (String) |
| 32 | free4 | 预留字段4 | free4 | varchar(60) |  | 字符串 (String) |
| 33 | free5 | 预留字段5 | free5 | varchar(60) |  | 字符串 (String) |