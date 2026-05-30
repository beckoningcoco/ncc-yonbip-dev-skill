# |<<

**入库数据接收子表 (hstf_indatareceive_b / nc.vo.hstf.indatareceive.IndatareceiveBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2765.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_indatareceive_b | 子表主键 | pk_indatareceive_b | char(50) | √ | 主键 (UFID) |
| 2 | rowno | 行号 | rowno | varchar(50) |  | 字符串 (String) |
| 3 | pk_material | 物料 | pk_material | varchar(20) |  | 物料基本信息（多版本） (material) |
| 4 | castunitid | 单位 | castunitid | varchar(20) |  | 计量单位 (measdoc) |
| 5 | vchangerate | 换算率 | vchangerate | varchar(50) |  | 字符串 (String) |
| 6 | num | 数量 | num | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | nqtorigtaxprice | 含税单价 | nqtorigtaxprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | ncostprice | 成本价 | ncostprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | nmny | 金额 | nmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | vbatchcode | 批次号 | vbatchcode | varchar(50) |  | 字符串 (String) |
| 11 | serialcode | 序列号 | serialcode | varchar(50) |  | 字符串 (String) |
| 12 | vbillbarcode | 条形码 | vbillbarcode | varchar(50) |  | 字符串 (String) |
| 13 | dproducedate | 生产日期 | dproducedate | char(19) |  | 日期 (UFDate) |
| 14 | dvalidate | 失效日期 | dvalidate | char(19) |  | 日期 (UFDate) |
| 15 | dbizdate | 入库日期 | dbizdate | char(19) |  | 日期 (UFDate) |
| 16 | pk_manufacturer | 生产厂商 | pk_manufacturer | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 17 | pk_rack | 货位 | pk_rack | varchar(20) |  | 货位 (rack) |
| 18 | memo | 行备注 | memo | varchar(50) |  | 字符串 (String) |
| 19 | ccorrespondhid | 对应入库单主键 | ccorrespondhid | varchar(50) |  | 字符串 (String) |
| 20 | ccorrespondrowno | 对应入库单号 | ccorrespondrowno | varchar(50) |  | 字符串 (String) |
| 21 | srcmaterialcode | 对接系统物料编码 | srcmaterialcode | varchar(50) |  | 字符串 (String) |
| 22 | srcbillbid | 对接系统子表主键 | srcbillbid | varchar(50) |  | 字符串 (String) |
| 23 | hrpbillid | HRP系统子表主键 | hrpbillid | varchar(50) |  | 字符串 (String) |
| 24 | srcmaterialname | 对接系统物料名称 | srcmaterialname | varchar(50) |  | 字符串 (String) |
| 25 | standard | 对接系统物料规格 | standard | varchar(50) |  | 字符串 (String) |
| 26 | model | 对接系统物料型号 | model | varchar(50) |  | 字符串 (String) |
| 27 | srcunit | 对接系统物料计量单位 | srcunit | varchar(50) |  | 字符串 (String) |
| 28 | srclocationcode | 对接系统货位编码 | srclocationcode | varchar(50) |  | 字符串 (String) |
| 29 | srclocationname | 对接系统货位名称 | srclocationname | varchar(50) |  | 字符串 (String) |
| 30 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 31 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 32 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 33 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 34 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 35 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 36 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 37 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 38 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 39 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 40 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 41 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 42 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 43 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 44 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 45 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 46 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 47 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 48 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 49 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |