# |<<

**元数据属性分类设置 (fip_entityattcfg / nc.vo.fip.attconfig.EntityAttributeConfigVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2238.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_entityattcfg | 对象标识 | pk_entityattcfg | char(20) | √ | 主键 (UFID) |
| 2 | entityid | 实体ID | entityid | varchar(36) |  | 实体 (entity) |
| 3 | attrname | 属性名 | attrname | varchar(100) |  | 字符串 (String) |
| 4 | propertyid | 属性ID | propertyid | varchar(36) |  | 实体属性 (property) |
| 5 | configtype | 属性分类 | configtype | int |  | 属性分类 (attitype) |  | 0=非显示项; |