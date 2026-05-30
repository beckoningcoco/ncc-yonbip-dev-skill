# |<<

**适用对象属性映射 (bcbd_attrmap / nc.vo.bcbd.bartype.AttrMapVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/254.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_attrmap | 属性映射主键 | pk_attrmap | char(20) | √ | 主键 (UFID) |
| 2 | pk_appobjattr | 条码对象属性 | pk_appobjattr | varchar(20) |  | 条码应用对象属性 (barappobject_item) |
| 3 | referobjattr | 适用对象属性 | referobjattr | varchar(50) |  | 字符串 (String) |
| 4 | refobjattrname | 适用对象属性名称 | refobjattrname | varchar(200) |  | 多语文本 (MultiLangText) |
| 5 | accstrategy | 取值策略 | accstrategy | int |  | 取值策略 (AccStrategy) |  | 1=元数据; |