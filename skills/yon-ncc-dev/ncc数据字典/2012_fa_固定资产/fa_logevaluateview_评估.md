# |<<

**评估 (fa_logevaluateview / nc.vo.fa.asset.LogevaluateViewVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2045.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_logevaluate | 主键 | pk_logevaluate | char(20) | √ | 主键 (UFID) |
| 2 | pk_accbook | 资产账簿 | pk_accbook | varchar(20) |  | 账簿_财务核算账簿 (accountingbook) |
| 3 | bill_code | 评估单号 | bill_code | varchar(40) |  | 字符串 (String) |
| 4 | evaluate_date | 评估日期 | evaluate_date | char(19) |  | 日期 (UFDate) |
| 5 | oldvalue | 评估前原值 | oldvalue | decimal(28, 8) |  | 金额 (UFMoney) |
| 6 | newvalue | 评估后原值 | newvalue | decimal(28, 8) |  | 金额 (UFMoney) |
| 7 | olddep | 评估前累计折旧 | olddep | decimal(28, 8) |  | 金额 (UFMoney) |
| 8 | newdep | 评估后累计折旧 | newdep | decimal(28, 8) |  | 金额 (UFMoney) |
| 9 | oldsalvage | 评估前净残值 | oldsalvage | decimal(28, 8) |  | 金额 (UFMoney) |
| 10 | newsalvage | 评估后净残值 | newsalvage | decimal(28, 8) |  | 金额 (UFMoney) |
| 11 | oldworkloan | 评估前工作总量 | oldworkloan | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | newworkloan | 评估后工作总量 | newworkloan | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | oldnetvalue | 评估前净值 | oldnetvalue | decimal(28, 8) |  | 金额 (UFMoney) |
| 14 | newnetvalue | 评估后净值 | newnetvalue | decimal(28, 8) |  | 金额 (UFMoney) |
| 15 | oldservicemonth | 评估前使用月限 | oldservicemonth | int |  | 整数 (Integer) |
| 16 | newservicemonth | 评估后使用月限 | newservicemonth | int |  | 整数 (Integer) |
| 17 | edit_flag | 手工录入 | edit_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 18 | pk_bill | 单据主键 | pk_bill | varchar(20) |  | 字符串 (String) |
| 19 | bill_type | 单据类型 | bill_type | varchar(4) |  | 字符串 (String) |
| 20 | pk_card | 卡片主键 | pk_card | char(20) |  | 主键 (UFID) |