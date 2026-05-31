# |<<

**银行存款日发生额余额 (batm_dailydeposit / nc.vo.batm.ifacvo.DailydepositVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/215.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dailydeposit | 主键 | pk_dailydeposit | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 资金组织 | pk_org | varchar(20) |  | 组织_业务单元_资金组织 (fundorg) |
| 4 | pk_org_v | 资金组织版本信息 | pk_org_v | varchar(20) |  | 组织_业务单元_资金组织版本信息 (fundorg_v) |
| 5 | pk_depositorg | 存款单位 | pk_depositorg | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 6 | billdate | 统计日期 | billdate | char(10) |  | 模糊日期 (UFLiteralDate) |
| 7 | deposittype | 存款形式 | deposittype | varchar(50) |  | 字符串 (String) |
| 8 | pk_depositbank | 存款银行 | pk_depositbank | varchar(20) |  | 银行档案 (bankdoc) |
| 9 | pk_bankaccbas | 银行账户 | pk_bankaccbas | varchar(20) |  | 银行账户 (bankaccount) |
| 10 | pk_depositacc | 存款账号 | pk_depositacc | varchar(20) |  | 银行账户子户 (bankaccsub) |
| 11 | depositperiod | 期限 | depositperiod | varchar(50) |  | 字符串 (String) |
| 12 | rate | 利率 | rate | varchar(50) |  | 字符串 (String) |
| 13 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 14 | lastbalance | 昨日余额 | lastbalance | decimal(28, 8) |  | 金额 (UFMoney) |
| 15 | inmoney | 收入(原币） | inmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 16 | olcinmoney | 收入(组织本币） | olcinmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 17 | glcinmoney | 收入(集团本币） | glcinmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 18 | gllcinmoney | 收入(全局本币） | gllcinmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 19 | outmoney | 支出（原币） | outmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 20 | olcoutmoney | 支出（组织本币） | olcoutmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 21 | glcoutmoney | 支出（集团本币） | glcoutmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 22 | gllcoutmoney | 支出（全局本币） | gllcoutmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 23 | interest | 利息(原币） | interest | decimal(28, 8) |  | 金额 (UFMoney) |
| 24 | olcinterest | 利息(组织本币） | olcinterest | decimal(28, 8) |  | 金额 (UFMoney) |
| 25 | glcinterest | 利息(集团本币） | glcinterest | decimal(28, 8) |  | 金额 (UFMoney) |
| 26 | gllcinterest | 利息(全局本币） | gllcinterest | decimal(28, 8) |  | 金额 (UFMoney) |
| 27 | balance | 余额(原币） | balance | decimal(28, 8) |  | 金额 (UFMoney) |
| 28 | olcbalance | 余额(组织本币） | olcbalance | decimal(28, 8) |  | 金额 (UFMoney) |
| 29 | glcbalance | 余额(集团本币） | glcbalance | decimal(28, 8) |  | 金额 (UFMoney) |
| 30 | gllcbalance | 余额(全局本币） | gllcbalance | decimal(28, 8) |  | 金额 (UFMoney) |
| 31 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 32 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 33 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 34 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 35 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 36 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 37 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 38 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 39 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 40 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 41 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 42 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 43 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 44 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 45 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 46 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 47 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 48 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 49 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 50 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |