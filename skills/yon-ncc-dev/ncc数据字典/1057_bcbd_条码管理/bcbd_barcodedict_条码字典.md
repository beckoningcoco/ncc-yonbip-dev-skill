# |<<

**条码字典 (bcbd_barcodedict / nc.vo.bcbd.barcodedict.BarCodeDictVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/257.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bcdict | 条码字典主键 | pk_bcdict | char(20) | √ | 主键 (UFID) |
| 2 | bcdictcode | 字典编码 | bcdictcode | varchar(50) |  | 字符串 (String) |
| 3 | bcdictname | 字典名称 | bcdictname | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | bappobjname | 条码对象 | bappobjname | varchar(20) |  | 条码应用对象 (barappobject) |
| 5 | bappobjattr | 条码对象属性 | bappobjattr | varchar(20) |  | 条码应用对象属性 (barappobject_item) |
| 6 | busiobjdoc | 业务对象档案 | busiobjdoc | varchar(36) |  | 实体 (entity) |
| 7 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 8 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 9 | dataoriginflag | 分布式 | dataoriginflag | varchar(50) |  | 数据来源 (dataorigin) |  | 0=本级产生; |