# |<<

**条码应用对象属性 (bcbd_barappobject_item / nc.vo.bcbd.barappobject.BarAppObjectItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/256.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_barappobjectitem | 应用对象属性主键 | pk_barappobjectitem | char(20) | √ | 主键 (UFID) |
| 2 | attrclass | 属性分类 | attrclass | varchar(20) |  | 属性分类 (attrclass) |
| 3 | code | 属性编码 | code | varchar(50) |  | 字符串 (String) |
| 4 | name | 属性名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 5 | mdattrid | 属性路径 | mdattrid | varchar(200) |  | 字符串 (String) |
| 6 | datatype | 数据类型 | datatype | varchar(36) |  | 实体 (entity) |
| 7 | refrecordtype | 所属档案 | refrecordtype | varchar(36) |  | 实体 (entity) |
| 8 | bruleused | 是否规则可选 | bruleused | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | refattrs | 依赖属性 | refattrs | varchar(50) |  | 字符串 (String) |
| 10 | memo | 备注 | memo | varchar(200) |  | 备注 (Memo) |
| 11 | dataoriginflag | 分布式 | dataoriginflag | varchar(50) |  | 数据来源 (dataorigin) |  | 0=本级产生; |