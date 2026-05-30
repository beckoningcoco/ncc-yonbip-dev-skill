# |<<

**条码字典明细 (bcbd_barcodedict_b / nc.vo.bcbd.barcodedict.BarCodeDictBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/258.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_barcodedict_b | 条码字典明细主键 | pk_barcodedict_b | char(20) | √ | 主键 (UFID) |
| 2 | busiobject | 业务对象 | busiobject | varchar(50) |  | 字符串 (String) |
| 3 | busiobjname | 业务对象名称 | busiobjname | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | busiobjectid | 业务对象ID | busiobjectid | varchar(50) |  | 字符串 (String) |
| 5 | barcode | 条码值 | barcode | varchar(50) |  | 字符串 (String) |
| 6 | dataoriginflag | 分布式 | dataoriginflag | varchar(50) |  | 数据来源 (dataorigin) |  | 0=本级产生; |