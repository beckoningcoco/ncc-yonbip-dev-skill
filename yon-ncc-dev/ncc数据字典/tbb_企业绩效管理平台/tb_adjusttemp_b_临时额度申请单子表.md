# |<<

**临时额度申请单子表 (tb_adjusttemp_b / nc.vo.tb.adjbill.AdjustTempBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5692.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_adjusttemp_b | 临时额度申请单子表主键 | pk_adjusttemp_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_cube | 应用模型 | pk_cube | varchar(20) |  | 应用模型 (tb_cube) |
| 3 | dimvector | 维度向量 | dimvector | varchar(1024) |  | 字符串 (String) |
| 4 | adddata | 已追加额度 | adddata | decimal(28, 8) |  | 数值 (UFDouble) |
| 5 | applydata | 本次入账金额 | applydata | decimal(28, 8) |  | 数值 (UFDouble) |
| 6 | approvedata | 本次临时放行额度 | approvedata | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | availabledata | 可使用额度 | availabledata | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | ctrldata | 控制数 | ctrldata | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | effectdata | 原预算额度 | effectdata | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | measurename | 指标名称 | measurename | varchar(50) |  | 字符串 (String) |
| 11 | otherdims | 其他维度 | otherdims | varchar(50) |  | 字符串 (String) |
| 12 | otherdimsname | 其他维度名称 | otherdimsname | varchar(50) |  | 字符串 (String) |
| 13 | pk_measure | 指标 | pk_measure | varchar(50) |  | 字符串 (String) |
| 14 | pk_sheet | 表单 | pk_sheet | varchar(50) |  | 字符串 (String) |
| 15 | totaldata | 合计 | totaldata | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | uniqkey | 单元格标识 | uniqkey | varchar(50) |  | 字符串 (String) |
| 17 | useddata | 已使用额度 | useddata | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 19 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 20 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 21 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 22 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 23 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 24 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 25 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 26 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 27 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 28 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 29 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 30 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 31 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 32 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 33 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 34 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 35 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 36 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 37 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |