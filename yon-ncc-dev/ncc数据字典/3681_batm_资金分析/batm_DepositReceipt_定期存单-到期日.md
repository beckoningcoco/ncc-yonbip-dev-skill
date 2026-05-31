# |<<

**定期存单-到期日 (batm_DepositReceipt / nc.vo.batm.ifacvo.DepositReceiptVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/222.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_depositreceipt | 定期存单主键 | pk_depositreceipt | char(20) | √ | 主键 (UFID) |
| 2 | deposittype | 存单类型 | deposittype | varchar(50) |  | 字符串 (String) |
| 3 | pk_group | 所属集团 | pk_group | varchar(50) |  | 字符串 (String) |
| 4 | pk_org | 资金组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 5 | pk_org_v | 资金组织版本 | pk_org_v | varchar(50) |  | 字符串 (String) |
| 6 | depositcode | 存单号 | depositcode | varchar(50) |  | 字符串 (String) |
| 7 | billstate | 单据状态 | billstate | varchar(50) |  | 字符串 (String) |
| 8 | pk_depositorg | 存款单位 | pk_depositorg | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 9 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 10 | pk_depositacc | 定期账户 | pk_depositacc | varchar(20) |  | 内部账户 (bd_accid) |
| 11 | depositamount | 存款金额 | depositamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 12 | depostbalmnt | 存款余额 | depostbalmnt | decimal(28, 8) |  | 金额 (UFMoney) |
| 13 | olcdepositamount | 存款金额组织本币金额 | olcdepositamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 14 | glcdepositamount | 存款金额集团本币金额 | glcdepositamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 15 | gllcdepositamount | 存款金额全局本币金额 | gllcdepositamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 16 | depositdate | 存款日期 | depositdate | char(19) |  | 日期 (UFDate) |
| 17 | depostperiod | 存期 | depostperiod | varchar(50) |  | 字符串 (String) |
| 18 | intervalunit | 存期单位 | intervalunit | varchar(50) |  | 字符串 (String) |
| 19 | depositinterval | 存款期间 | depositinterval | int |  | 整数 (Integer) |
| 20 | enddate | 到期日期 | enddate | char(19) |  | 日期 (UFDate) |
| 21 | pk_daystype | 到期期间 | pk_daystype | int |  | 整数 (Integer) |
| 22 | deposityrate | 定期年利率(%) | deposityrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | pk_depositbank | 存款银行 | pk_depositbank | varchar(50) |  | 字符串 (String) |
| 24 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 25 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 26 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 27 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 28 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 29 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 30 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 31 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 32 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 33 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 34 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 35 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 36 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 37 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 38 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 39 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 40 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 41 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 42 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 43 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |