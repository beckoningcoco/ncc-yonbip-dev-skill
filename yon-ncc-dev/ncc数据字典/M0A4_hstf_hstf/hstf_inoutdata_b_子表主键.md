# |<<

**子表主键 (hstf_inoutdata_b / nc.vo.hstf.inoutdatareceive.InOutDataReceiveBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2768.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_inoutdata_b | 子表主键 | pk_inoutdata_b | char(50) | √ | 主键 (UFID) |
| 2 | rowno | 行号 | rowno | varchar(50) |  | 字符串 (String) |
| 3 | pk_inbid | 入库单行主键 | pk_inbid | varchar(50) |  | 字符串 (String) |
| 4 | pk_outbid | 出库单行主键 | pk_outbid | varchar(50) |  | 字符串 (String) |
| 5 | pk_material | 物料编码 | pk_material | varchar(20) |  | 物料基本信息（多版本） (material) |
| 6 | castunitid | 单位 | castunitid | varchar(20) |  | 计量单位 (measdoc) |
| 7 | vchangerate | 换算率 | vchangerate | varchar(50) |  | 字符串 (String) |
| 8 | nnum | 数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | nprice | 价格 | nprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | nmny | 金额 | nmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | vbatchcode | 批次号 | vbatchcode | varchar(50) |  | 字符串 (String) |
| 12 | vserialcode | 序列号 | vserialcode | varchar(50) |  | 字符串 (String) |
| 13 | vbarcode | 条形码 | vbarcode | varchar(50) |  | 字符串 (String) |
| 14 | dproduct | 生产日期 | dproduct | char(19) |  | 日期 (UFDate) |
| 15 | dvalidate | 失效日期 | dvalidate | char(19) |  | 日期 (UFDate) |
| 16 | dbizdate | 出库日期 | dbizdate | char(19) |  | 日期 (UFDate) |
| 17 | ccorrespondcode | 对应入库单号 | ccorrespondcode | varchar(50) |  | 字符串 (String) |
| 18 | cproductorid | 生产厂商 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 19 | pk_rack | 货位 | pk_rack | varchar(20) |  | 货位 (rack) |
| 20 | memo | 行备注 | memo | varchar(50) |  | 字符串 (String) |
| 21 | srcmaterialcode | 对接系统物料编码 | srcmaterialcode | varchar(50) |  | 字符串 (String) |
| 22 | srcmaterialname | 对接系统物料名称 | srcmaterialname | varchar(50) |  | 字符串 (String) |
| 23 | srcformat | 对接系统规格 | srcformat | varchar(50) |  | 字符串 (String) |
| 24 | srcmodel | 对接系统型号 | srcmodel | varchar(50) |  | 字符串 (String) |
| 25 | srcunit | 对接系统计量单位 | srcunit | varchar(50) |  | 字符串 (String) |
| 26 | srcrackcode | 对接系统货位编码 | srcrackcode | varchar(50) |  | 字符串 (String) |
| 27 | srcrackname | 对接系统货位名称 | srcrackname | varchar(50) |  | 字符串 (String) |