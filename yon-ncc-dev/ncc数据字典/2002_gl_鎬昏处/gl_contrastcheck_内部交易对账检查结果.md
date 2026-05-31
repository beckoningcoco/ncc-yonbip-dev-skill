# |<<

**内部交易对账检查结果 (gl_contrastcheck / nc.vo.gl.contrast.init.ContrastInitCheckVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2372.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | subjpair | 科目对 | subjpair | char(20) | √ | 主键 (UFID) |
| 2 | pk_selfaccountingbook | 本方核算账簿 | pk_selfaccountingbook | varchar(50) |  | 字符串 (String) |
| 3 | selfquantity | 本方数量 | selfquantity | int |  | 整数 (Integer) |
| 4 | selfamount | 本方原币 | selfamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 5 | selforgamount | 本方账簿本币 | selforgamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 6 | selfgroupamount | 本方集团本币 | selfgroupamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | selfglobalamount | 本方全局本币 | selfglobalamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | pk_othaccountingbook | 对方核算账簿 | pk_othaccountingbook | varchar(50) |  | 字符串 (String) |
| 9 | oth_quantity | 对方数量 | oth_quantity | int |  | 整数 (Integer) |
| 10 | oth_amount | 对方原币 | oth_amount | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | oth_orgamount | 对方账簿本币 | oth_orgamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | oth_groupamount | 对方集团本币 | oth_groupamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | oth_globalamount | 对方全局本币 | oth_globalamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | balance_quantiy | 差额数量 | balance_quantiy | int |  | 整数 (Integer) |
| 15 | balance_amount | 差额原币 | balance_amount | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | balance_orgamount | 差额账簿本币 | balance_orgamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | balance_groupamount | 差额集团本币 | balance_groupamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | balance_globalamount | 差额全局本币 | balance_globalamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | checkresult | 检查结果 | checkresult | varchar(50) |  | 字符串 (String) |