# |<<

**还款计划 (icdmc_planrepay / nc.vo.icdmc.icdmc.financepay.PlanRepayVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3052.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_iplanrepay_b | 主键 | pk_iplanrepay_b | char(20) | √ | 主键 (UFID) |
| 2 | rowno | 行号 | rowno | varchar(50) |  | 字符串 (String) |
| 3 | planrepaycode | 还款计划编码 | planrepaycode | varchar(50) |  | 字符串 (String) |
| 4 | planrepaydate | 计划还款日期 | planrepaydate | char(19) |  | 日期(开始) (UFDateBegin) |
| 5 | premny | 预计还本金 | premny | decimal(28, 8) |  | 数值 (UFDouble) |
| 6 | olcpremny | 预计还本金组织本币 | olcpremny | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | glcpremny | 预计还本金集团本币 | glcpremny | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | gllcpremny | 预计还本金全局本币 | gllcpremny | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | preinterest | 预计付利息 | preinterest | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | olcpreinterest | 预计付利息组织本币 | olcpreinterest | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | glcpreinterest | 预计付利息集团本币 | glcpreinterest | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | gllcpreinterest | 预计付利息全局本币 | gllcpreinterest | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | summny | 本利合计 | summny | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | olcsummny | 本利合计组织本币 | olcsummny | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | glcsummny | 本利合计集团本币 | glcsummny | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | gllcsummny | 本利合计全局本币 | gllcsummny | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | isrepay | 是否被引用（还本或付息）0未引用 1引用 | isrepay | char(1) |  | 布尔类型 (UFBoolean) |
| 18 | ispayinterest | 是否已计息 0未付息 1已付息2部分付息 | ispayinterest | int |  | 整数 (Integer) |
| 19 | repayamount | 已还本金 | repayamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | advancemny | 提前还本金额累计 | advancemny | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | olcadvancemny | 提前还本组织本币金额 | olcadvancemny | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | glcadvancemny | 提前还本集团本币金额 | glcadvancemny | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | gllcadvancemny | 提前还本全局本币金额 | gllcadvancemny | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | payinterest | 已付利息 | payinterest | decimal(28, 8) |  | 数值 (UFDouble) |
| 25 | versionno | 变更记录版本信息 | versionno | int |  | 整数 (Integer) |
| 26 | practiceplan | 实际类型0还本计划1付息计划2还本付息 | practiceplan | int |  | 整数 (Integer) |
| 27 | extinfoid | 展期id 展期生成的还款计划,要保存展期id | extinfoid | varchar(200) |  | 字符串 (String) |
| 28 | isrepayorpay | 用于区别是否还本或者付息 | isrepayorpay | int |  | 整数 (Integer) |
| 29 | pk_repayrules | 还款规则主键 | pk_repayrules | image |  | BLOB (BLOB) |
| 30 | vdef1 | 自定义项1 | vdef1 | varchar(101) |  | 自定义项 (Custom) |
| 31 | vdef2 | 自定义项2 | vdef2 | varchar(101) |  | 自定义项 (Custom) |
| 32 | vdef3 | 自定义项3 | vdef3 | varchar(101) |  | 自定义项 (Custom) |
| 33 | vdef4 | 自定义项4 | vdef4 | varchar(101) |  | 自定义项 (Custom) |
| 34 | vdef5 | 自定义项5 | vdef5 | varchar(101) |  | 自定义项 (Custom) |
| 35 | vdef6 | 自定义项6 | vdef6 | varchar(101) |  | 自定义项 (Custom) |
| 36 | vdef7 | 自定义项7 | vdef7 | varchar(101) |  | 自定义项 (Custom) |
| 37 | vdef8 | 自定义项8 | vdef8 | varchar(101) |  | 自定义项 (Custom) |
| 38 | vdef9 | 自定义项9 | vdef9 | varchar(101) |  | 自定义项 (Custom) |
| 39 | vdef10 | 自定义项10 | vdef10 | varchar(101) |  | 自定义项 (Custom) |
| 40 | vdef11 | 自定义项11 | vdef11 | varchar(101) |  | 自定义项 (Custom) |
| 41 | vdef12 | 自定义项12 | vdef12 | varchar(101) |  | 自定义项 (Custom) |
| 42 | vdef13 | 自定义项13 | vdef13 | varchar(101) |  | 自定义项 (Custom) |
| 43 | vdef14 | 自定义项14 | vdef14 | varchar(101) |  | 自定义项 (Custom) |
| 44 | vdef15 | 自定义项15 | vdef15 | varchar(101) |  | 自定义项 (Custom) |
| 45 | vdef16 | 自定义项16 | vdef16 | varchar(101) |  | 自定义项 (Custom) |
| 46 | vdef17 | 自定义项17 | vdef17 | varchar(101) |  | 自定义项 (Custom) |
| 47 | vdef18 | 自定义项18 | vdef18 | varchar(101) |  | 自定义项 (Custom) |
| 48 | vdef19 | 自定义项19 | vdef19 | varchar(101) |  | 自定义项 (Custom) |
| 49 | vdef20 | 自定义项20 | vdef20 | varchar(101) |  | 自定义项 (Custom) |