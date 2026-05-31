# |<<

**总额对账发生明细 (gl_ResultOccurSubVO / nc.vo.gl.contrast.result.ResultOccurSubVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2469.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_resultoccursub | 总额明细发生标识 | pk_resultoccursub | char(20) | √ | 主键 (UFID) |
| 2 | rownum | 序号 | rownum | int |  | 整数 (Integer) |
| 3 | pk_contrastrule | 内部交易对帐规则 | pk_contrastrule | varchar(20) |  | 内部交易规则 (ContrastRuleVO) |
| 4 | year | 年度 | year | varchar(50) |  | 字符串 (String) |
| 5 | period | 月份 | period | varchar(50) |  | 字符串 (String) |
| 6 | report_status | 状态 | report_status | varchar(50) |  | 字符串 (String) |
| 7 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 8 | assid | 辅助核算 | assid | char(20) |  | 主键 (UFID) |
| 9 | pk_self | 本方核算账簿 | pk_self | varchar(20) |  | 账簿_财务核算账簿 (accountingbook) |
| 10 | pk_opp | 对方核算账簿 | pk_opp | varchar(20) |  | 账簿_财务核算账簿 (accountingbook) |
| 11 | pk_accasoa | 科目标识 | pk_accasoa | varchar(20) |  | 会计科目 (accasoa) |
| 12 | debit_occur_quantity | 借方净发生数量 | debit_occur_quantity | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | debit_occur_cur | 借方净发生原币 | debit_occur_cur | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | debit_occur_orgcur | 借方净发生账簿本币 | debit_occur_orgcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | debit_occur_groupcur | 借方净发生集团本币 | debit_occur_groupcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | debit_occur_globalcur | 借方净发生全局本币 | debit_occur_globalcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | debit_accum_quantity | 借方累计数量 | debit_accum_quantity | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | debit_accum_cur | 借方累计原币 | debit_accum_cur | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | debit_accum_orgcur | 借方累计账簿本币 | debit_accum_orgcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | debit_accum_groupcur | 借方累计集团本币 | debit_accum_groupcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | debit_accum_globalcur | 借方累计全局本币 | debit_accum_globalcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | credit_occur_quantity | 贷方净发生数量 | credit_occur_quantity | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | credit_occur_cur | 贷方净发生原币 | credit_occur_cur | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | credit_occur_orgcur | 贷方净发生账簿本币 | credit_occur_orgcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 25 | credit_occur_groupcur | 贷方净发生集团本币 | credit_occur_groupcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 26 | credit_occur_globalcur | 贷方净发生全局本币 | credit_occur_globalcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 27 | credit_accum_quantity | 贷方累计数量 | credit_accum_quantity | decimal(28, 8) |  | 数值 (UFDouble) |
| 28 | credit_accum_cur | 贷方累计原币 | credit_accum_cur | decimal(28, 8) |  | 数值 (UFDouble) |
| 29 | credit_accum_orgcur | 贷方累计账簿本币 | credit_accum_orgcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 30 | credit_accum_groupcur | 贷方累计集团本币 | credit_accum_groupcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 31 | credit_accum_globalcur | 贷方累计全局本币 | credit_accum_globalcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 32 | typevalue1 | 档案类型值1 | typevalue1 | varchar(50) |  | 字符串 (String) |
| 33 | typevalue2 | 档案类型值2 | typevalue2 | varchar(50) |  | 字符串 (String) |
| 34 | typevalue3 | 档案类型值3 | typevalue3 | varchar(50) |  | 字符串 (String) |
| 35 | typevalue4 | 档案类型值4 | typevalue4 | varchar(50) |  | 字符串 (String) |
| 36 | typevalue5 | 档案类型值5 | typevalue5 | varchar(50) |  | 字符串 (String) |
| 37 | typevalue6 | 档案类型值6 | typevalue6 | varchar(50) |  | 字符串 (String) |
| 38 | typevalue7 | 档案类型值7 | typevalue7 | varchar(50) |  | 字符串 (String) |
| 39 | typevalue8 | 档案类型值8 | typevalue8 | varchar(50) |  | 字符串 (String) |