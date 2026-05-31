# |<<

**签核申请单子表 (tb_adjustsign_b / nc.vo.tb.adjbill.AdjustSignBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5690.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_adjustsign_b | 签核申请单子表主键 | pk_adjustsign_b | varchar(50) | √ | 字符串 (String) |
| 2 | pk_cube | 应用模型 | pk_cube | varchar(20) |  | 应用模型 (tb_cube) |
| 3 | pk_measure | 指标 | pk_measure | varchar(20) |  | 字符串 (String) |
| 4 | otherdims | 其他维度 | otherdims | varchar(600) |  | 字符串 (String) |
| 5 | dimvector | 维度向量 | dimvector | varchar(1024) |  | 字符串 (String) |
| 6 | uniqkey | 单元格标识 | uniqkey | varchar(100) |  | 字符串 (String) |
| 7 | pk_sheet | 表单 | pk_sheet | varchar(20) |  | 字符串 (String) |
| 8 | effectdata | 原预算额度 | effectdata | decimal(31, 8) |  | 数值 (UFDouble) |
| 9 | adddata | 已追加额度 | adddata | decimal(31, 8) |  | 数值 (UFDouble) |
| 10 | totaldata | 合计 | totaldata | decimal(31, 8) |  | 数值 (UFDouble) |
| 11 | useddata | 已使用额度 | useddata | decimal(31, 8) |  | 数值 (UFDouble) |
| 12 | ctrldata | 控制数 | ctrldata | decimal(31, 8) |  | 数值 (UFDouble) |
| 13 | availabledata | 可使用额度 | availabledata | decimal(31, 8) |  | 数值 (UFDouble) |
| 14 | usedpercent | 支用率(%) | usedpercent | decimal(9, 8) |  | 数值 (UFDouble) |
| 15 | applydata | 本次入账金额 | applydata | decimal(31, 8) |  | 数值 (UFDouble) |
| 16 | approvedata | 本次给予额度金额 | approvedata | decimal(31, 8) |  | 数值 (UFDouble) |
| 17 | fntotaldata | 核准后可用总额度 | fntotaldata | decimal(31, 8) |  | 数值 (UFDouble) |
| 18 | fnusedpercent | 核准后可用总额度支用率(%) | fnusedpercent | decimal(9, 8) |  | 数值 (UFDouble) |
| 19 | fnoverpercent | 核准后可用总额度超支率(%) | fnoverpercent | decimal(9, 8) |  | 数值 (UFDouble) |
| 20 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 21 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 22 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 23 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 24 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 25 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 26 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 27 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 28 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 29 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 30 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 31 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 32 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 33 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 34 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 35 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 36 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 37 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 38 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 39 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |