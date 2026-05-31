# |<<

**评估（后台） (fa_logevaluate / nc.vo.fa.assetcard.LogevaluateVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2044.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_logevaluate | 主键 | pk_logevaluate | char(20) | √ | 主键 (UFID) |
| 2 | pk_accbook | 账簿 | pk_accbook | varchar(20) |  | 账簿_财务核算账簿 (accountingbook) |
| 3 | bill_code | 评估单号 | bill_code | varchar(40) |  | 字符串 (String) |
| 4 | evaluate_date | 评估日期 | evaluate_date | char(19) |  | 日期 (UFDate) |
| 5 | oldvalue | 评估前原值 | oldvalue | decimal(28, 8) |  | 金额 (UFMoney) |
| 6 | newvalue | 评估后原值 | newvalue | decimal(28, 8) |  | 金额 (UFMoney) |
| 7 | olddep | 评估前累计折旧 | olddep | decimal(28, 8) |  | 金额 (UFMoney) |
| 8 | newdep | 评估后累计折旧 | newdep | decimal(28, 8) |  | 金额 (UFMoney) |
| 9 | newnetvalue | 评估后净值 | newnetvalue | decimal(28, 8) |  | 金额 (UFMoney) |
| 10 | oldnetvalue | 评估前净值 | oldnetvalue | decimal(28, 8) |  | 金额 (UFMoney) |
| 11 | newsalvage | 评估后净残值 | newsalvage | decimal(28, 8) |  | 金额 (UFMoney) |
| 12 | oldsalvage | 评估前净残值 | oldsalvage | decimal(28, 8) |  | 金额 (UFMoney) |
| 13 | oldservicemonth | 评估前使用月限 | oldservicemonth | int |  | 整数 (Integer) |
| 14 | newservicemonth | 评估后使用月限 | newservicemonth | int |  | 整数 (Integer) |
| 15 | oldworkloan | 评估前工作总量 | oldworkloan | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | newworkloan | 评估后工作总量 | newworkloan | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | pk_card | 卡片主键 | pk_card | char(20) |  | 主键 (UFID) |