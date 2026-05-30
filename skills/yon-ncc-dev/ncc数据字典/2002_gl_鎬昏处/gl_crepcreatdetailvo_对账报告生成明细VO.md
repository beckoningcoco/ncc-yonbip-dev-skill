# |<<

**对账报告生成明细VO (gl_crepcreatdetailvo / nc.vo.gl.contrast.report.create.ContrastReportCreateDetailVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2398.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_creportcreaetdetail | 对账报告生成明细标识 | pk_creportcreaetdetail | char(20) | √ | 主键 (UFID) |
| 2 | bselect | 选择 | bselect | char(1) |  | 布尔类型 (UFBoolean) |
| 3 | rownum | 序号 | rownum | int |  | 整数 (Integer) |
| 4 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 5 | assid | 辅助核算 | assid | char(20) |  | 主键 (UFID) |
| 6 | pk_selfaccountingbook | 本方核算账簿 | pk_selfaccountingbook | char(20) |  | 主键 (UFID) |
| 7 | selfstatus | 本方状态 | selfstatus | varchar(50) |  | 字符串 (String) |
| 8 | self_accasoa | 本方科目 | self_accasoa | varchar(50) |  | 字符串 (String) |
| 9 | self_direction | 本方科目方向 | self_direction | char(1) |  | 字符串 (String) |
| 10 | self_un_quantity | 本方未对符数量 | self_un_quantity | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | self_un_cur | 本方未对符原币 | self_un_cur | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | self_un_orgcur | 本方未对符账簿本币 | self_un_orgcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | self_un_groupcur | 本方未对符集团本币 | self_un_groupcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | self_un_globalcur | 本方未对符全局本币 | self_un_globalcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | selfcontrastedquantity | 本方已对符数量 | selfcontrastedquantity | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | selfcontrastedcur | 本方已对符原币 | selfcontrastedcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | selfcontrastedorgcur | 本方已对符账簿本币 | selfcontrastedorgcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | self_contrastedgroupcur | 本方已对符集团本币 | self_contrastedgroupcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | selfcontrastedglobalcur | 本方已对符全局本币 | selfcontrastedglobalcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | selfsumquantity | 本方合计数量 | selfsumquantity | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | selfsumcur | 本方合计原币 | selfsumcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | selfsumorgcur | 本方合计账簿本币 | selfsumorgcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | selfsumgroupcur | 本方合计集团本币 | selfsumgroupcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | selfsumglobalcur | 本方合计全局本币 | selfsumglobalcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 25 | pk_oppaccountingbook | 对方核算账簿 | pk_oppaccountingbook | char(20) |  | 主键 (UFID) |
| 26 | oppstatus | 对方状态 | oppstatus | varchar(50) |  | 字符串 (String) |
| 27 | opp_accasoa | 对方科目 | opp_accasoa | varchar(50) |  | 字符串 (String) |
| 28 | opp_direction | 对方方向 | opp_direction | char(1) |  | 字符串 (String) |
| 29 | opp_un_quantity | 对方未对符数量 | opp_un_quantity | decimal(28, 8) |  | 数值 (UFDouble) |
| 30 | opp_un_cur | 对方未对符原币 | opp_un_cur | decimal(28, 8) |  | 数值 (UFDouble) |
| 31 | opp_un_orgcur | 对方未对符账簿本币 | opp_un_orgcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 32 | opp_un_groupcur | 对方未对符集团本币 | opp_un_groupcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 33 | opp_un_globalcur | 对方未对符全局本本 | opp_un_globalcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 34 | oppcontrastedquantity | 对方已对符数量 | oppcontrastedquantity | decimal(28, 8) |  | 数值 (UFDouble) |
| 35 | oppcontrastedcur | 对方已对符原币 | oppcontrastedcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 36 | oppcontrastedorgcur | 对方已对符账簿本币 | oppcontrastedorgcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 37 | oppcontrastedgroupcur | 对方已对符集团本币 | oppcontrastedgroupcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 38 | oppcontrastedglobalcur | 对方已对符全局本币 | oppcontrastedglobalcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 39 | opp_sum_quantity | 对方合计数量 | opp_sum_quantity | decimal(28, 8) |  | 数值 (UFDouble) |
| 40 | opp_sum_cur | 对方合计原币 | opp_sum_cur | decimal(28, 8) |  | 数值 (UFDouble) |
| 41 | opp_sum_orgcur | 对方合计账簿本币 | opp_sum_orgcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 42 | opp_sum_groupcur | 对方合计集团本币 | opp_sum_groupcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 43 | opp_sum_globalcur | 对方合计全局本币 | opp_sum_globalcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 44 | sumbalance_quantity | 合计数量差额 | sumbalance_quantity | decimal(28, 8) |  | 数值 (UFDouble) |
| 45 | sumbalance_cur | 合计原币差额 | sumbalance_cur | decimal(28, 8) |  | 数值 (UFDouble) |
| 46 | sumbalance_orgcur | 合计账簿本币差额 | sumbalance_orgcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 47 | sumbalance_groupcur | 合计集团本币差额 | sumbalance_groupcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 48 | sumbalance_globalcur | 合计全局本币差额 | sumbalance_globalcur | decimal(28, 8) |  | 数值 (UFDouble) |
| 49 | typevalue1 | 档案类型值1 | typevalue1 | varchar(220) |  | 字符串 (String) |
| 50 | typevalue2 | 档案类型值2 | typevalue2 | varchar(220) |  | 字符串 (String) |
| 51 | typevalue3 | 档案类型值3 | typevalue3 | varchar(220) |  | 字符串 (String) |
| 52 | typevalue4 | 档案类型值4 | typevalue4 | varchar(220) |  | 字符串 (String) |
| 53 | typevalue5 | 档案类型值5 | typevalue5 | varchar(220) |  | 字符串 (String) |
| 54 | typevalue6 | 档案类型值6 | typevalue6 | varchar(220) |  | 字符串 (String) |
| 55 | typevalue7 | 档案类型值7 | typevalue7 | varchar(220) |  | 字符串 (String) |
| 56 | typevalue8 | 档案类型值8 | typevalue8 | varchar(220) |  | 字符串 (String) |