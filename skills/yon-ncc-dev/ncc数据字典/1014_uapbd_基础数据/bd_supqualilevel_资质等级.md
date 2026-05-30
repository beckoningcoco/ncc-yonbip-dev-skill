# |<<

**资质等级 (bd_supqualilevel / nc.vo.bd.supplier.supqualidoc.SupQualiLevelVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/985.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_qualilevel | 主键 | pk_qualilevel | char(20) | √ | 主键 (UFID) |
| 2 | qualilevel | 等级 | qualilevel | varchar(200) | √ | 多语文本 (MultiLangText) |
| 3 | qualistatus | 状态 | qualistatus | int | √ | 资质等级状态 (enum) |  | 1=合格; |