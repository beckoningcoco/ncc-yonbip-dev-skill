# |<<

**总额对账余额明细VO (gl_result / nc.vo.gl.contrast.result.ResultBalanceSubVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2466.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_balancedetail | 总额对账余额明细标识 | pk_balancedetail | char(20) | √ | 主键 (UFID) |
| 2 | pk_contrastrule | 内部交易对账规则 | pk_contrastrule | varchar(20) |  | 内部交易规则 (ContrastRuleVO) |
| 3 | year | 年度 | year | varchar(50) |  | 字符串 (String) |
| 4 | period | 月份 | period | varchar(50) |  | 字符串 (String) |
| 5 | report_status | 状态 | report_status | varchar(50) |  | 字符串 (String) |
| 6 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 7 | assid | 辅助核算 | assid | char(20) |  | 主键 (UFID) |
| 8 | pk_self | 本方核算账簿 | pk_self | varchar(20) |  | 账簿_财务核算账簿 (accountingbook) |
| 9 | pk_opp | 对方核算账簿 | pk_opp | varchar(20) |  | 账簿_财务核算账簿 (accountingbook) |
| 10 | pk_accasoa | 科目 | pk_accasoa | varchar(20) |  | 会计科目 (accasoa) |
| 11 | d_yearinit_quantity | 借方年初数量 | d_yearinit_quantity | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | d_yearinit_cur | 借方年初原币 | d_yearinit_cur | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | d_yearinit_orgcur | 借方年初账簿本币 | d_yearinit_orgcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | d_yearinit_groupcur | 借方年初集团本币 | d_yearinit_groupcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | d_yearinit_globalcur | 借方年初全局本币 | d_yearinit_globalcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | d_init_quantity | 借方期初数量 | d_init_quantity | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | d_init_cur | 借方期初原币 | d_init_cur | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | d_init_orgcur | 借方期初账簿本币 | d_init_orgcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | d_init_groupcur | 借方期初集团本币 | d_init_groupcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | d_init_globalcur | 借方期初全局本币 | d_init_globalcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | d_end_quantity | 借方期末数量 | d_end_quantity | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | d_end_cur | 借方期末原币 | d_end_cur | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | d_end_orgcur | 借方期末账簿本币 | d_end_orgcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | d_end_groupcur | 借方期末集团本币 | d_end_groupcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 25 | d_end_globalcur | 借方期末全局本币 | d_end_globalcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 26 | c_yearinit_quantity | 贷方年初数量 | c_yearinit_quantity | decimal(28, 8) |  | 数值 (UFDouble) |
| 27 | c_yearinit_cur | 贷方年初原币 | c_yearinit_cur | decimal(28, 8) |  | 数值 (UFDouble) |
| 28 | c_yearinit_orgcur | 贷方年初账簿本币 | c_yearinit_orgcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 29 | c_yearinit_groupcur | 贷方年初集团本币 | c_yearinit_groupcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 30 | c_yearinit_globalcur | 贷方年初全局本币 | c_yearinit_globalcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 31 | c_init_quantity | 贷方期初数量 | c_init_quantity | decimal(28, 8) |  | 数值 (UFDouble) |
| 32 | c_init_cur | 贷方期初原币 | c_init_cur | decimal(28, 8) |  | 数值 (UFDouble) |
| 33 | c_init_orgcur | 贷方期初账簿本币 | c_init_orgcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 34 | c_init_groupcur | 贷方期初集团本币 | c_init_groupcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 35 | c_init_globalcur | 贷方期初全局本币 | c_init_globalcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 36 | c_end_quantity | 贷方期末数量 | c_end_quantity | decimal(28, 8) |  | 数值 (UFDouble) |
| 37 | c_end_cur | 贷方期末原币 | c_end_cur | decimal(28, 8) |  | 数值 (UFDouble) |
| 38 | c_end_orgcur | 贷方期末账簿本币 | c_end_orgcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 39 | c_end_groupcur | 贷方期末集团本币 | c_end_groupcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 40 | c_end_globalcur | 贷方期末全局本币 | c_end_globalcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 41 | typevalue1 | 档案类型值1 | typevalue1 | varchar(50) |  | 字符串 (String) |
| 42 | typevalue2 | 档案类型值2 | typevalue2 | varchar(50) |  | 字符串 (String) |
| 43 | typevalue3 | 档案类型值3 | typevalue3 | varchar(50) |  | 字符串 (String) |
| 44 | typevalue4 | 档案类型值4 | typevalue4 | varchar(50) |  | 字符串 (String) |
| 45 | typevalue5 | 档案类型值5 | typevalue5 | varchar(50) |  | 字符串 (String) |
| 46 | typevalue6 | 档案类型值6 | typevalue6 | varchar(50) |  | 字符串 (String) |
| 47 | typevalue7 | 档案类型值7 | typevalue7 | varchar(50) |  | 字符串 (String) |
| 48 | typevalue8 | 档案类型值8 | typevalue8 | varchar(50) |  | 字符串 (String) |
| 49 | rownum | 行号 | rownum | int |  | 整数 (Integer) |