# |<<

**批量替换表头 (bd_replacebom / nc.vo.bd.bom.bom0212.entity.BomReplaceVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/957.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | 批量替换表头 | id | char(20) | √ | 主键 (UFID) |
| 2 | name | 名称 | name | varchar(50) |  | 字符串 (String) |
| 3 | replace_scope | 替换范围 | replace_scope | int | √ | 替换范围 (enum) | 1 | 1=替代本工厂所有BOM相关子项; |