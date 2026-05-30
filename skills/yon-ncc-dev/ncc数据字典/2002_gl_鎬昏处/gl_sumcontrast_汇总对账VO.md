# |<<

**汇总对账VO (gl_sumcontrast / nc.vo.gl.contrast.SumContrastVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2485.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_sumcontrast | 汇总对账标识 | pk_sumcontrast | char(20) | √ | 主键 (UFID) |
| 2 | pk_currtype | 币种标识 | pk_currtype | char(20) |  | 主键 (UFID) |
| 3 | quantityequal | 数量对账 | quantityequal | char(1) |  | 布尔类型 (UFBoolean) |
| 4 | amountequal | 原币对账 | amountequal | char(1) |  | 布尔类型 (UFBoolean) |
| 5 | orgamountequal | 账簿本币对账 | orgamountequal | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | groupamountequal | 集团本币对账 | groupamountequal | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | globalamountequal | 全局本币对账 | globalamountequal | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | pk_selfaccountingbook | 本方核算账簿 | pk_selfaccountingbook | char(20) |  | 主键 (UFID) |
| 9 | self_debitquantity | 本方借方数量 | self_debitquantity | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | self_debitamount | 本方借方原币 | self_debitamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | self_debitorgamount | 本方借方账簿本币 | self_debitorgamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | self_debitgroupamount | 本方借方集团本币 | self_debitgroupamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | self_debitglobalamount | 本方借方全局本币 | self_debitglobalamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | self_creditquantity | 本方贷方数量 | self_creditquantity | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | self_creditamount | 本方贷方原币 | self_creditamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | self_creditorgamount | 本方贷方账簿本币 | self_creditorgamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | self_creditgroupamount | 本方贷方集团本币 | self_creditgroupamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | self_creditglobalamount | 本方贷方全局本币 | self_creditglobalamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | self_quantityoccur | 本方数量净发生 | self_quantityoccur | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | self_amountoccur | 本方原币净发生 | self_amountoccur | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | self_orgamountoccur | 本方账簿本币净发生 | self_orgamountoccur | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | self_groupamountoccur | 本方集团本币净发生 | self_groupamountoccur | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | self_globalamountoccur | 本方全局本币净发生 | self_globalamountoccur | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | other_debitquantity | 对方借方数量 | other_debitquantity | decimal(28, 8) |  | 数值 (UFDouble) |
| 25 | other_debitamount | 对方借方原币 | other_debitamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 26 | other_debitorgamount | 对方借方账簿本币 | other_debitorgamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 27 | other_debitgroupamount | 对方借方集团本币 | other_debitgroupamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 28 | other_debitglobalamount | 对方借方全局本币 | other_debitglobalamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 29 | other_creditquantity | 对方贷方数量 | other_creditquantity | decimal(28, 8) |  | 数值 (UFDouble) |
| 30 | other_creditamount | 对方贷方原币 | other_creditamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 31 | other_creditorgamount | 对方贷方账簿本币 | other_creditorgamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 32 | other_creditgroupamount | 对方贷方集团本币 | other_creditgroupamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 33 | other_creditglobalamount | 对方贷方全局本币 | other_creditglobalamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 34 | other_quantityoccur | 对方数量净发生 | other_quantityoccur | decimal(28, 8) |  | 数值 (UFDouble) |
| 35 | other_amountoccur | 对方原币净发生 | other_amountoccur | decimal(28, 8) |  | 数值 (UFDouble) |
| 36 | other_orgamountoccur | 对方账簿本币净发生 | other_orgamountoccur | decimal(28, 8) |  | 数值 (UFDouble) |
| 37 | other_groupamountoccur | 对方集团本币净发生 | other_groupamountoccur | decimal(28, 8) |  | 数值 (UFDouble) |
| 38 | other_globalamountoccur | 对方全局本币净发生 | other_globalamountoccur | decimal(28, 8) |  | 数值 (UFDouble) |
| 39 | pk_otheraccountingbook | 对方核算账簿 | pk_otheraccountingbook | char(20) |  | 主键 (UFID) |
| 40 | quantitybalance | 数量余额 | quantitybalance | decimal(28, 8) |  | 数值 (UFDouble) |
| 41 | amountbalance | 原币余额 | amountbalance | decimal(28, 8) |  | 数值 (UFDouble) |
| 42 | orgamountbalance | 账簿本币余额 | orgamountbalance | decimal(28, 8) |  | 数值 (UFDouble) |
| 43 | groupamountbalance | 集团本币余额 | groupamountbalance | decimal(28, 8) |  | 数值 (UFDouble) |
| 44 | globalamountbalance | 全局本币余额 | globalamountbalance | decimal(28, 8) |  | 数值 (UFDouble) |
| 45 | bselect | 是否选择 | bselect | char(1) |  | 布尔类型 (UFBoolean) |
| 46 | rownum | 行号 | rownum | int |  | 整数 (Integer) |
| 47 | typevalue1 | 档案类型值1 | typevalue1 | varchar(220) |  | 字符串 (String) |
| 48 | typevalue2 | 档案类型值2 | typevalue2 | varchar(220) |  | 字符串 (String) |
| 49 | typevalue3 | 档案类型值3 | typevalue3 | varchar(220) |  | 字符串 (String) |
| 50 | typevalue4 | 档案类型值4 | typevalue4 | varchar(220) |  | 字符串 (String) |
| 51 | typevalue5 | 档案类型值5 | typevalue5 | varchar(220) |  | 字符串 (String) |
| 52 | typevalue6 | 档案类型值6 | typevalue6 | varchar(220) |  | 字符串 (String) |
| 53 | typevalue7 | 档案类型值7 | typevalue7 | varchar(220) |  | 字符串 (String) |
| 54 | typevalue8 | 档案类型值8 | typevalue8 | varchar(220) |  | 字符串 (String) |