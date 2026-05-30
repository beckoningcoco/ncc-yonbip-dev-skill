# |<<

**定期通知存款 (batm_deposit / nc.vo.batm.ifacvo.DepositVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/220.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_deposit | 主键 | pk_deposit | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(50) |  | 字符串 (String) |
| 3 | pk_org | 资金组织 | pk_org | varchar(50) |  | 字符串 (String) |
| 4 | pk_org_v | 资金组织版本 | pk_org_v | varchar(50) |  | 字符串 (String) |
| 5 | pk_depositorg | 存款单位 | pk_depositorg | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 6 | pk_bank | 存款银行 | pk_bank | varchar(50) |  | 字符串 (String) |
| 7 | pk_depositacc | 账号 | pk_depositacc | varchar(50) |  | 字符串 (String) |
| 8 | depositcode | 存单号 | depositcode | varchar(50) |  | 字符串 (String) |
| 9 | deposittype | 存单类型 | deposittype | varchar(50) |  | 字符串 (String) |
| 10 | depositmode | 存款类型 | depositmode | varchar(50) |  | 字符串 (String) |
| 11 | pk_depostrate | 利率 | pk_depostrate | varchar(50) |  | 字符串 (String) |
| 12 | deposityrate | 年利率 | deposityrate | varchar(50) |  | 字符串 (String) |
| 13 | depositdate | 存款日期 | depositdate | char(19) |  | 日期(开始) (UFDateBegin) |
| 14 | enddate | 到期日期 | enddate | char(19) |  | 日期(结束) (UFDateEnd) |
| 15 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 16 | intervalunit | 期限 | intervalunit | varchar(50) |  | 字符串 (String) |
| 17 | billdate | 操作日期 | billdate | char(19) |  | 日期 (UFDate) |
| 18 | depostbalmnt | 存款余额 | depostbalmnt | decimal(28, 8) |  | 金额 (UFMoney) |
| 19 | depositamount | 存入原币金额 | depositamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 20 | withdrawamount | 支取原币金额 | withdrawamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 21 | interest | 利息原币金额 | interest | decimal(28, 8) |  | 金额 (UFMoney) |
| 22 | olcdepositamount | 存入组织本币金额 | olcdepositamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 23 | olcwithdrawamount | 支取组织本币金额 | olcwithdrawamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 24 | olcinterest | 利息组织本币金额 | olcinterest | decimal(28, 8) |  | 金额 (UFMoney) |
| 25 | glcdepositamount | 存入集团本币金额 | glcdepositamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 26 | glcwithdrawamount | 支取集团本币金额 | glcwithdrawamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 27 | glcinterest | 利息集团本币金额 | glcinterest | decimal(28, 8) |  | 金额 (UFMoney) |
| 28 | gllcdepositamount | 存入全局本币金额 | gllcdepositamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 29 | gllcwithdrawamount | 支取全局本币金额 | gllcwithdrawamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 30 | gllcinterest | 利息全局本币金额 | gllcinterest | decimal(28, 8) |  | 金额 (UFMoney) |
| 31 | olcdepostbalmnt | 存款组织本币余额 | olcdepostbalmnt | decimal(28, 8) |  | 金额 (UFMoney) |
| 32 | glcdepostbalmnt | 存款集团本币余额 | glcdepostbalmnt | decimal(28, 8) |  | 金额 (UFMoney) |
| 33 | gllcdepostbalmnt | 存款余全局本币额 | gllcdepostbalmnt | decimal(28, 8) |  | 金额 (UFMoney) |
| 34 | pk_sourcebill | 来源单据 | pk_sourcebill | varchar(50) |  | 字符串 (String) |
| 35 | redeposittype | 转存类型 | redeposittype | varchar(50) |  | 字符串 (String) |
| 36 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 37 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 38 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 39 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 40 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 41 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 42 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 43 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 44 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 45 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 46 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 47 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 48 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 49 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 50 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 51 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 52 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 53 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 54 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 55 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |