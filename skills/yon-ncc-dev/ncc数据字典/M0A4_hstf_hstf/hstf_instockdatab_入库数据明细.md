# |<<

**入库数据明细 (hstf_instockdatab / nc.vo.hstf.instockdata.InstockDataBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2770.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_instockdata_b | BID | pk_instockdata_b | char(20) | √ | 主键 (UFID) |
| 2 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 3 | cmaterialvid | 物料 | cmaterialvid | varchar(20) | √ | 物料基本信息（多版本） (material) |
| 4 | castunitid | 单位 | castunitid | varchar(20) |  | 计量单位 (measdoc) |
| 5 | vbatchcode | 批次号 | vbatchcode | varchar(40) |  | 字符串 (String) |
| 6 | nassistnum | 实收数量 | nassistnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | cvendorid | 供应商 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 8 | vnotebody | 行备注 | vnotebody | varchar(181) |  | 字符串 (String) |
| 9 | dproducedate | 生产日期 | dproducedate | char(19) |  | 日期 (UFDate) |
| 10 | dvalidate | 失效日期 | dvalidate | char(19) |  | 日期 (UFDate) |
| 11 | cproductorid | 生产厂商 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 12 | cvmivenderid | 寄存供应商 | cvmivenderid | varchar(20) |  | 供应商基本信息 (supplier) |
| 13 | ncostprice | 单价 | ncostprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | cunitid | 主单位 | cunitid | varchar(20) |  | 计量单位 (measdoc) |
| 15 | vchangerate | 换算率 | vchangerate | varchar(60) |  | 字符串 (String) |
| 16 | pk_batchcode | 批次主键 | pk_batchcode | varchar(20) |  | 批次档案 (BatchcodeVO) |
| 17 | vserialcode | 序列号 | vserialcode | varchar(128) |  | 字符串 (String) |
| 18 | dbizdate | 入库日期 | dbizdate | varchar(19) |  | 日期 (UFDate) |
| 19 | csnunitid | 序列号单位 | csnunitid | varchar(20) |  | 计量单位 (measdoc) |
| 20 | pk_serialcode | 序列号主键 | pk_serialcode | varchar(20) |  | 序列号档案 (SerialNoVO) |
| 21 | clocationid | 货位 | clocationid | varchar(20) |  | 货位 (rack) |
| 22 | srchid | 来源表头ID | srchid | varchar(50) |  | 字符串 (String) |
| 23 | srcbid | 来源表体ID | srcbid | varchar(50) |  | 字符串 (String) |
| 24 | nonhandnum | 现存量 | nonhandnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 25 | nmny | 金额 | nmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 26 | vbillbarcode | 条形码 | vbillbarcode | varchar(128) |  | 字符串 (String) |
| 27 | mcode | 物料编码 | mcode | varchar(50) |  | 字符串 (String) |
| 28 | mname | 物料名称 | mname | varchar(150) |  | 字符串 (String) |
| 29 | materialspec | 物料规格 | materialspec | varchar(50) |  | 字符串 (String) |
| 30 | materialtype | 物料型号 | materialtype | varchar(50) |  | 字符串 (String) |
| 31 | meascode | 单位编码 | meascode | varchar(50) |  | 字符串 (String) |
| 32 | measname | 单位名称 | measname | varchar(50) |  | 字符串 (String) |
| 33 | costprice | 价格 | costprice | varchar(50) |  | 字符串 (String) |
| 34 | mainmeascode | 主单位编码 | mainmeascode | varchar(50) |  | 字符串 (String) |
| 35 | mainmeasname | 主单位名称 | mainmeasname | varchar(50) |  | 字符串 (String) |
| 36 | procode | 生产厂商编码 | procode | varchar(50) |  | 字符串 (String) |
| 37 | proname | 生产厂商名称 | proname | varchar(150) |  | 字符串 (String) |
| 38 | rcode | 货位编码 | rcode | varchar(50) |  | 字符串 (String) |
| 39 | rname | 货位名称 | rname | varchar(100) |  | 字符串 (String) |
| 40 | vbdef1 | 表体自定义项1 | vbdef1 | varchar(101) |  | 自定义项 (Custom) |
| 41 | vbdef2 | 表体自定义项2 | vbdef2 | varchar(101) |  | 自定义项 (Custom) |
| 42 | vbdef3 | 表体自定义项3 | vbdef3 | varchar(101) |  | 自定义项 (Custom) |
| 43 | vbdef4 | 表体自定义项4 | vbdef4 | varchar(101) |  | 自定义项 (Custom) |
| 44 | vbdef5 | 表体自定义项5 | vbdef5 | varchar(101) |  | 自定义项 (Custom) |
| 45 | vbdef6 | 表体自定义项6 | vbdef6 | varchar(101) |  | 自定义项 (Custom) |
| 46 | vbdef7 | 表体自定义项7 | vbdef7 | varchar(101) |  | 自定义项 (Custom) |
| 47 | vbdef8 | 表体自定义项8 | vbdef8 | varchar(101) |  | 自定义项 (Custom) |
| 48 | vbdef10 | 表体自定义项10 | vbdef10 | varchar(101) |  | 自定义项 (Custom) |
| 49 | vbdef11 | 表体自定义项11 | vbdef11 | varchar(101) |  | 自定义项 (Custom) |
| 50 | vbdef12 | 表体自定义项12 | vbdef12 | varchar(101) |  | 自定义项 (Custom) |
| 51 | vbdef13 | 表体自定义项13 | vbdef13 | varchar(101) |  | 自定义项 (Custom) |
| 52 | vbdef14 | 表体自定义项14 | vbdef14 | varchar(101) |  | 自定义项 (Custom) |
| 53 | vbdef15 | 表体自定义项15 | vbdef15 | varchar(101) |  | 自定义项 (Custom) |
| 54 | vbdef16 | 表体自定义项16 | vbdef16 | varchar(101) |  | 自定义项 (Custom) |
| 55 | vbdef17 | 表体自定义项17 | vbdef17 | varchar(101) |  | 自定义项 (Custom) |
| 56 | vbdef18 | 表体自定义项18 | vbdef18 | varchar(101) |  | 自定义项 (Custom) |
| 57 | vbdef19 | 表体自定义项19 | vbdef19 | varchar(101) |  | 自定义项 (Custom) |
| 58 | vbdef20 | 表体自定义项20 | vbdef20 | varchar(101) |  | 自定义项 (Custom) |