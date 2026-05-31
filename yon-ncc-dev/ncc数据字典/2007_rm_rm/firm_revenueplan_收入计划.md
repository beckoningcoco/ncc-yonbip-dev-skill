# |<<

**收入计划 (firm_revenueplan / nc.vo.rm.revenue.RevenuePlanVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2288.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_revenueplan | 收入计划主键 | pk_revenueplan | char(20) | √ | 主键 (UFID) |
| 2 | baseinforow | 合同基本信息行 | baseinforow | varchar(20) |  | 字符串 (String) |
| 3 | pk_contractbase | 合同基本信息主键 | pk_contractbase | varchar(20) |  | 合同基本信息 (contractbase) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | pk_financeorg | 财务组织 | pk_financeorg | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 6 | pk_financeorg_v | 财务组织版本 | pk_financeorg_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 7 | rowno | 行号 | rowno | varchar(50) |  | 字符串 (String) |
| 8 | pk_material | 物料 | pk_material | varchar(20) |  | 物料基本信息（多版本） (material) |
| 9 | pk_material_n | 物料最新版本 | pk_material_n | varchar(20) |  | 物料基本信息 (material_v) |
| 10 | confirmperiod | 收入确认期间 | confirmperiod | varchar(20) |  | 会计月份 (accperiodmonth) |
| 11 | nastnum | 数量 | nastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | notaxmny | 无税金额 | notaxmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | pricetaxmny | 价税合计 | pricetaxmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | oritaxnum | 原币税额 | oritaxnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | orgcurrexrate | 组织本币汇率 | orgcurrexrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | currnotaxmny | 本币无税金额 | currnotaxmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | taxnum | 本币税额 | taxnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | currmny | 本币价税合计 | currmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | grpexrate | 集团本位币汇率 | grpexrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | grpnotaxmny | 集团本币无税金额 | grpnotaxmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | grpcurrmny | 集团本币价税合计 | grpcurrmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | glbexrate | 全局本位币汇率 | glbexrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | glbnotaxmny | 全局本币无税金额 | glbnotaxmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | glbcurrmny | 全局本币价税合计 | glbcurrmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 25 | confirmed | 是否确认 | confirmed | char(1) |  | 布尔类型 (UFBoolean) |
| 26 | closeautoconf | 关账期自动确认 | closeautoconf | char(1) |  | 布尔类型 (UFBoolean) |
| 27 | memo | 备注 | memo | varchar(200) |  | 备注 (Memo) |
| 28 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 29 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 30 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 31 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 32 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 33 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 34 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 35 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 36 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 37 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 38 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 39 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 40 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 41 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 42 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 43 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 44 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 45 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 46 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 47 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |