# |<<

**出库数据接收子表 (hstf_outdatarece_b / nc.vo.hstf.outdatareceive.OutDataReceiveBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2779.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_outdatarece_b | 子表主键 | pk_outdatarece_b | char(20) | √ | 主键 (UFID) |
| 2 | rowno | 行号 | rowno | varchar(50) |  | 字符串 (String) |
| 3 | srcmaterialcode | 对接系统物料编码 | srcmaterialcode | varchar(50) |  | 字符串 (String) |
| 4 | srcbillbid | 对接系统子表主键 | srcbillbid | varchar(50) |  | 字符串 (String) |
| 5 | hrpbillid | HRP系统对应主键 | hrpbillid | varchar(1000) |  | 字符串 (String) |
| 6 | srcmaterialname | 对接系统物料名称 | srcmaterialname | varchar(50) |  | 字符串 (String) |
| 7 | srcformat | 对接系统规格 | srcformat | varchar(50) |  | 字符串 (String) |
| 8 | srcmodel | 对接系统型号 | srcmodel | varchar(50) |  | 字符串 (String) |
| 9 | srcunit | 对接系统计量单位 | srcunit | varchar(50) |  | 字符串 (String) |
| 10 | srcrackcode | 对接系统货位编码 | srcrackcode | varchar(50) |  | 字符串 (String) |
| 11 | srcrackname | 对接系统货位名称 | srcrackname | varchar(50) |  | 字符串 (String) |
| 12 | pk_material | 物料 | pk_material | varchar(20) |  | 物料基本信息（多版本） (material) |
| 13 | castunitid | 单位 | castunitid | varchar(20) |  | 计量单位 (measdoc) |
| 14 | vchangerate | 换算率 | vchangerate | varchar(50) |  | 字符串 (String) |
| 15 | nnum | 数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | nprice | 单价 | nprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | nmny | 金额 | nmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | vbatchcode | 批次号 | vbatchcode | varchar(50) |  | 字符串 (String) |
| 19 | vserialcode | 序列号 | vserialcode | varchar(50) |  | 字符串 (String) |
| 20 | vbarcode | 条形码 | vbarcode | varchar(50) |  | 字符串 (String) |
| 21 | dproduct | 生产日期 | dproduct | char(19) |  | 日期 (UFDate) |
| 22 | dvalidate | 失效日期 | dvalidate | char(19) |  | 日期 (UFDate) |
| 23 | dbizdate | 出库日期 | dbizdate | char(19) |  | 日期 (UFDate) |
| 24 | cproductorid | 生产厂商 | cproductorid | varchar(50) |  | 字符串 (String) |
| 25 | pk_rack | 货位 | pk_rack | varchar(20) |  | 货位 (rack) |
| 26 | memo | 行备注 | memo | varchar(50) |  | 字符串 (String) |
| 27 | ccorrespondcode | 对应入库单号 | ccorrespondcode | varchar(50) |  | 字符串 (String) |
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