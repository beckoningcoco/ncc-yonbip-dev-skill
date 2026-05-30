# |<<

**发生对账明细VO (gl_ResultOccurTabDetailVO / nc.vo.gl.contrast.result.ResultOccurTabDetailVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2470.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_occurtabdetail | 发生对账明细标识 | pk_occurtabdetail | char(20) | √ | 主键 (UFID) |
| 2 | rownum1 | 序号 | rownum1 | int |  | 整数 (Integer) |
| 3 | pk_currtype | 币种 | pk_currtype | char(20) |  | 主键 (UFID) |
| 4 | assid | 辅助核算 | assid | char(20) |  | 主键 (UFID) |
| 5 | pk_self | 本方核算账簿 | pk_self | char(20) |  | 主键 (UFID) |
| 6 | self_subjs | 本方科目 | self_subjs | varchar(50) |  | 字符串 (String) |
| 7 | self_direction | 本方方向 | self_direction | varchar(50) |  | 字符串 (String) |
| 8 | self_occur_quantity | 本方净发生数量 | self_occur_quantity | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | self_occur_cur | 本方净发生原币 | self_occur_cur | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | self_occur_orgcur | 本方净发生账簿本币 | self_occur_orgcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | self_occur_groupcur | 本方净发生集团本币 | self_occur_groupcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | self_occur_globalcur | 本方净发生全局本币 | self_occur_globalcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | self_accum_quantity | 本方累计净发生数量 | self_accum_quantity | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | self_accum_cur | 本方累计原币 | self_accum_cur | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | self_accum_orgcur | 本方累计账簿本币 | self_accum_orgcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | self_accum_groupcur | 本方累计集团本币 | self_accum_groupcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | self_accum_globalcur | 本方累计全局本币 | self_accum_globalcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | pk_opp | 对方核算账簿 | pk_opp | char(20) |  | 主键 (UFID) |
| 19 | opp_subjs | 对方科目 | opp_subjs | varchar(50) |  | 字符串 (String) |
| 20 | opp_direction | 对方方向 | opp_direction | varchar(50) |  | 字符串 (String) |
| 21 | opp_occur_quantity | 对方净发生数量 | opp_occur_quantity | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | opp_occur_cur | 对方净发生原币 | opp_occur_cur | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | opp_occur_orgcur | 对方净发生账簿本币 | opp_occur_orgcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | opp_occur_groupcur | 对方净发生集团本币 | opp_occur_groupcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 25 | opp_occur_globalcur | 对方净发生全局本币 | opp_occur_globalcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 26 | opp_accum_quantity | 对方累计数量 | opp_accum_quantity | decimal(28, 8) |  | 数值 (UFDouble) |
| 27 | opp_accum_cur | 对方累计原币 | opp_accum_cur | decimal(28, 8) |  | 数值 (UFDouble) |
| 28 | opp_accum_orgcur | 对方累计账簿本币 | opp_accum_orgcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 29 | opp_accum_groupcur | 对方累计集团本币 | opp_accum_groupcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 30 | opp_accum_globalcur | 对方累计全局本币 | opp_accum_globalcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 31 | bal_occur_quantity | 净发生数量差额 | bal_occur_quantity | decimal(28, 8) |  | 数值 (UFDouble) |
| 32 | bal_occur_cur | 净发生原币差额 | bal_occur_cur | decimal(28, 8) |  | 数值 (UFDouble) |
| 33 | bal_occur_orgcur | 净发生账簿本币差额 | bal_occur_orgcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 34 | bal_occur_groupcur | 净发生集团本币差额 | bal_occur_groupcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 35 | bal_occur_globalcur | 净发生全局本币差额 | bal_occur_globalcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 36 | bal_accum_quantity | 累计数量差额 | bal_accum_quantity | decimal(28, 8) |  | 数值 (UFDouble) |
| 37 | bal_accum_cur | 累计原币差额 | bal_accum_cur | decimal(28, 8) |  | 数值 (UFDouble) |
| 38 | bal_accum_orgcur | 累计账簿本币差额 | bal_accum_orgcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 39 | bal_accum_groupcur | 累计集团本币差额 | bal_accum_groupcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 40 | bal_accum_globalcur | 累计全局本币差额 | bal_accum_globalcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 41 | typevalue1 | 档案类型值1 | typevalue1 | varchar(50) |  | 字符串 (String) |
| 42 | typevalue2 | 档案类型值2 | typevalue2 | varchar(50) |  | 字符串 (String) |
| 43 | typevalue3 | 档案类型值3 | typevalue3 | varchar(50) |  | 字符串 (String) |
| 44 | typevalue4 | 档案类型值4 | typevalue4 | varchar(50) |  | 字符串 (String) |
| 45 | typevalue5 | 档案类型值5 | typevalue5 | varchar(50) |  | 字符串 (String) |
| 46 | typevalue6 | 档案类型值6 | typevalue6 | varchar(50) |  | 字符串 (String) |
| 47 | typevalue7 | 档案类型值7 | typevalue7 | varchar(50) |  | 字符串 (String) |
| 48 | typevalue8 | 档案类型值8 | typevalue8 | varchar(50) |  | 字符串 (String) |