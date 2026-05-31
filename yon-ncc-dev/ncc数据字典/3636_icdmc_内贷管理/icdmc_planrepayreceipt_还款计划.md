# |<<

**还款计划 (icdmc_planrepayreceipt / nc.vo.icdmc.icdmc.financepayreceipt.PlanrepayReceiptVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3054.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_iplanrepayreceipt_b | 主键 | pk_iplanrepayreceipt_b | char(20) | √ | 主键 (UFID) |
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
| 17 | advancemny | 提前还本金额累计 | advancemny | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | olcadvancemny | 提前还本组织本币金额 | olcadvancemny | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | glcadvancemny | 提前还本集团本币金额 | glcadvancemny | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | gllcadvancemny | 提前还本全局本币金额 | gllcadvancemny | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | vdef1 | 自定义项1 | vdef1 | varchar(101) |  | 自定义项 (Custom) |
| 22 | vdef2 | 自定义项2 | vdef2 | varchar(101) |  | 自定义项 (Custom) |
| 23 | vdef3 | 自定义项3 | vdef3 | varchar(101) |  | 自定义项 (Custom) |
| 24 | vdef4 | 自定义项4 | vdef4 | varchar(101) |  | 自定义项 (Custom) |
| 25 | vdef5 | 自定义项5 | vdef5 | varchar(101) |  | 自定义项 (Custom) |
| 26 | vdef6 | 自定义项6 | vdef6 | varchar(101) |  | 自定义项 (Custom) |
| 27 | vdef7 | 自定义项7 | vdef7 | varchar(101) |  | 自定义项 (Custom) |
| 28 | vdef8 | 自定义项8 | vdef8 | varchar(101) |  | 自定义项 (Custom) |
| 29 | vdef10 | 自定义项10 | vdef10 | varchar(101) |  | 自定义项 (Custom) |
| 30 | vdef11 | 自定义项11 | vdef11 | varchar(101) |  | 自定义项 (Custom) |
| 31 | vdef12 | 自定义项12 | vdef12 | varchar(101) |  | 自定义项 (Custom) |
| 32 | vdef13 | 自定义项13 | vdef13 | varchar(101) |  | 自定义项 (Custom) |
| 33 | vdef14 | 自定义项14 | vdef14 | varchar(101) |  | 自定义项 (Custom) |
| 34 | vdef15 | 自定义项15 | vdef15 | varchar(101) |  | 自定义项 (Custom) |
| 35 | vdef16 | 自定义项16 | vdef16 | varchar(101) |  | 自定义项 (Custom) |
| 36 | vdef17 | 自定义项17 | vdef17 | varchar(101) |  | 自定义项 (Custom) |
| 37 | vdef18 | 自定义项18 | vdef18 | varchar(101) |  | 自定义项 (Custom) |
| 38 | vdef19 | 自定义项19 | vdef19 | varchar(101) |  | 自定义项 (Custom) |
| 39 | vdef20 | 自定义项20 | vdef20 | varchar(101) |  | 自定义项 (Custom) |
| 40 | vdef21 | 自定义项21 | vdef21 | varchar(101) |  | 自定义项 (Custom) |
| 41 | vdef22 | 自定义项22 | vdef22 | varchar(101) |  | 自定义项 (Custom) |
| 42 | vdef23 | 自定义项23 | vdef23 | varchar(101) |  | 自定义项 (Custom) |
| 43 | vdef24 | 自定义项24 | vdef24 | varchar(101) |  | 自定义项 (Custom) |
| 44 | vdef25 | 自定义项25 | vdef25 | varchar(101) |  | 自定义项 (Custom) |
| 45 | vdef26 | 自定义项26 | vdef26 | varchar(101) |  | 自定义项 (Custom) |
| 46 | vdef27 | 自定义项27 | vdef27 | varchar(101) |  | 自定义项 (Custom) |
| 47 | vdef28 | 自定义项28 | vdef28 | varchar(101) |  | 自定义项 (Custom) |
| 48 | vdef29 | 自定义项29 | vdef29 | varchar(101) |  | 自定义项 (Custom) |
| 49 | vdef30 | 自定义项30 | vdef30 | varchar(101) |  | 自定义项 (Custom) |