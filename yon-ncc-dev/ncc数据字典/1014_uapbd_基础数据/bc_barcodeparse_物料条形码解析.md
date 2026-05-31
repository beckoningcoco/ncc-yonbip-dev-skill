# |<<

**物料条形码解析 (bc_barcodeparse / nc.vo.bc.barcodeparse.BarCodeParseVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/240.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_barcodeparse | 主键 | pk_barcodeparse | char(20) | √ | 主键 (UFID) |
| 2 | vbarcode | 条码值 | vbarcode | varchar(1850) | √ | 字符串 (String) |
| 3 | cbarcoderulehid | 条码规则主键 | cbarcoderulehid | varchar(20) |  | 条码规则 (barcoderule_v) |
| 4 | cbarcoderulecode | 条码规则编码 | cbarcoderulecode | varchar(50) |  | 字符串 (String) |
| 5 | cbarcoderulename | 条码规则名称 | cbarcoderulename | varchar(200) |  | 多语文本 (MultiLangText) |
| 6 | vobject | 业务对象 | vobject | varchar(50) |  | 字符串 (String) |
| 7 | cmaterialvid | 物料主键 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 8 | cmaterialcode | 物料编码 | cmaterialcode | varchar(50) |  | 字符串 (String) |
| 9 | cmaterialname | 物料简称 | cmaterialname | varchar(50) |  | 字符串 (String) |
| 10 | materialmnecode | 助记码 | materialmnecode | varchar(50) |  | 字符串 (String) |
| 11 | materialbarcode | 条形码 | materialbarcode | varchar(50) |  | 字符串 (String) |
| 12 | materialclass | 物料基本分类 | materialclass | varchar(20) |  | 物料基本分类 (marbasclass) |
| 13 | cunitid | 主单位 | cunitid | varchar(20) |  | 计量单位 (measdoc) |
| 14 | castunitid | 单位 | castunitid | varchar(20) |  | 计量单位 (measdoc) |
| 15 | vbatchcode | 批次号 | vbatchcode | varchar(40) |  | 字符串 (String) |
| 16 | vchangerate | 换算率 | vchangerate | varchar(60) |  | 字符串 (String) |
| 17 | nsaleprice | 参考售价 | nsaleprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | ncostprice | 参考成本 | ncostprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | cwarehouseid | 仓库 | cwarehouseid | varchar(20) |  | 仓库 (stordoc) |
| 20 | clocationid | 货位 | clocationid | varchar(20) |  | 货位 (rack) |
| 21 | cvendorid | 供应商 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 22 | ccustomerid | 客户 | ccustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 23 | cpersonid | 人员 | cpersonid | varchar(20) |  | 人员基本信息 (psndoc) |
| 24 | cdptid | 部门 | cdptid | varchar(20) |  | 组织_部门 (dept) |
| 25 | dproducedate | 生产日期 | dproducedate | char(19) |  | 日期 (UFDate) |
| 26 | dvalidate | 失效日期 | dvalidate | char(19) |  | 日期 (UFDate) |
| 27 | cvalidunit | 保质期单位 | cvalidunit | int |  | 保质期单位 (Qualityunit) |  | 0=年; |