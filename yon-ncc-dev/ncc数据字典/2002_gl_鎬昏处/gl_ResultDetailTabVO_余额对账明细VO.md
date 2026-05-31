# |<<

**余额对账明细VO (gl_ResultDetailTabVO / nc.vo.gl.contrast.result.ResultDetailTabVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2467.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_resultdetailvo | 结果明细VO标识 | pk_resultdetailvo | char(20) | √ | 主键 (UFID) |
| 2 | rownum1 | 序号 | rownum1 | int |  | 整数 (Integer) |
| 3 | pk_currtype | 币种 | pk_currtype | char(20) |  | 主键 (UFID) |
| 4 | assid | 辅助核算 | assid | char(20) |  | 主键 (UFID) |
| 5 | self_accountingbook | 本方核算账簿 | self_accountingbook | char(20) |  | 主键 (UFID) |
| 6 | self_subj | 本方科目 | self_subj | char(20) |  | 主键 (UFID) |
| 7 | self_direction | 本方方向 | self_direction | varchar(50) |  | 字符串 (String) |
| 8 | self_yearinit_quantity | 本方年初数量 | self_yearinit_quantity | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | self_yearinit_cur | 本方年初原币 | self_yearinit_cur | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | self_yearinit_orgcur | 本方年初账簿本币 | self_yearinit_orgcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | self_yearinit_groupcur | 本方年初集团本币 | self_yearinit_groupcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | self_yearinit_globalcur | 本方年初全局本币 | self_yearinit_globalcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | self_init_quantity | 本方期初数量 | self_init_quantity | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | self_init_cur | 本方期初原币 | self_init_cur | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | self_init_orgcur | 本方期初账簿本币 | self_init_orgcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | self_init_groupcur | 本方期初集团本币 | self_init_groupcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | self_init_globalcur | 本方期初全局本币 | self_init_globalcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | self_end_quantity | 本方期末数量 | self_end_quantity | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | self_end_cur | 本方期末原币 | self_end_cur | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | self_end_orgcur | 本方期末账簿本币 | self_end_orgcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | self_end_groupcur | 本方期末集团本币 | self_end_groupcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | self_end_globalcur | 本方期末全局本币 | self_end_globalcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | other_accountingbook | 对方核算账簿 | other_accountingbook | char(20) |  | 主键 (UFID) |
| 24 | other_subj | 对方科目 | other_subj | varchar(50) |  | 字符串 (String) |
| 25 | other_direction | 对方方向 | other_direction | varchar(50) |  | 字符串 (String) |
| 26 | other_yearinit_quantity | 对方年初数量 | other_yearinit_quantity | decimal(28, 8) |  | 数值 (UFDouble) |
| 27 | other_yearinit_cur | 对方年初原币 | other_yearinit_cur | decimal(28, 8) |  | 数值 (UFDouble) |
| 28 | other_yearinit_orgcur | 对方年初账簿本币 | other_yearinit_orgcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 29 | other_yearinit_groupcur | 对方年初集团本币 | other_yearinit_groupcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 30 | other_yearinit_globalcur | 对方年初全局本币 | other_yearinit_globalcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 31 | other_init_quantity | 对方期初数量 | other_init_quantity | decimal(28, 8) |  | 数值 (UFDouble) |
| 32 | other_init_cur | 对方期初原币 | other_init_cur | decimal(28, 8) |  | 数值 (UFDouble) |
| 33 | other_init_orgcur | 对方期初账簿本币 | other_init_orgcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 34 | other_init_groupcur | 对方期初集团本币 | other_init_groupcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 35 | other_end_quantity | 对方期末数量 | other_end_quantity | decimal(28, 8) |  | 数值 (UFDouble) |
| 36 | other_end_cur | 对方期末原币 | other_end_cur | decimal(28, 8) |  | 数值 (UFDouble) |
| 37 | other_end_orgcur | 对方期末账簿本币 | other_end_orgcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 38 | other_end_groupcur | 对方期末集团本币 | other_end_groupcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 39 | other_end_globalcur | 对方期末全局本币 | other_end_globalcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 40 | balance_yearinit_quantity | 年初差额数量 | balance_yearinit_quantity | decimal(28, 8) |  | 数值 (UFDouble) |
| 41 | balance_yearinit_cur | 年初差额原币 | balance_yearinit_cur | decimal(28, 8) |  | 数值 (UFDouble) |
| 42 | balance_yearinit_orgcur | 年初差额账簿本币 | balance_yearinit_orgcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 43 | balance_yearinit_groupcur | 年初差额集团本币 | balance_yearinit_groupcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 44 | balance_yearinit_globalcur | 年初差额全局本币 | balance_yearinit_globalcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 45 | balance_init_quantity | 期初差额数量 | balance_init_quantity | decimal(28, 8) |  | 数值 (UFDouble) |
| 46 | balance_init_cur | 期初差额原币 | balance_init_cur | decimal(28, 8) |  | 数值 (UFDouble) |
| 47 | balance_init_orgcur | 期初差额账簿本币 | balance_init_orgcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 48 | balance_init_groupcur | 期初差额集团本币 | balance_init_groupcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 49 | balance_init_globalcur | 期初差额全局本币 | balance_init_globalcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 50 | balance_end_quantity | 期末差额数量 | balance_end_quantity | decimal(28, 8) |  | 数值 (UFDouble) |
| 51 | balance_end_cur | 期末差额原币 | balance_end_cur | decimal(28, 8) |  | 数值 (UFDouble) |
| 52 | balance_end_orgcur | 期末差额账簿本币 | balance_end_orgcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 53 | balance_end_groupcur | 期末差额集团本币 | balance_end_groupcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 54 | balance_end_globalcur | 期末差额全局本币 | balance_end_globalcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 55 | typevalue1 | 档案类型值1 | typevalue1 | varchar(220) |  | 字符串 (String) |
| 56 | typevalue2 | 档案类型值2 | typevalue2 | varchar(220) |  | 字符串 (String) |
| 57 | typevalue3 | 档案类型值3 | typevalue3 | varchar(220) |  | 字符串 (String) |
| 58 | typevalue4 | 档案类型值4 | typevalue4 | varchar(220) |  | 字符串 (String) |
| 59 | typevalue5 | 档案类型值5 | typevalue5 | varchar(220) |  | 字符串 (String) |
| 60 | typevalue6 | 档案类型值6 | typevalue6 | varchar(220) |  | 字符串 (String) |
| 61 | typevalue7 | 档案类型值7 | typevalue7 | varchar(220) |  | 字符串 (String) |
| 62 | typevalue8 | 档案类型值8 | typevalue8 | varchar(220) |  | 字符串 (String) |