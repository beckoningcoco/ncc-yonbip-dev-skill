# |<<

**对象枚举值 (cca_objvalue / nc.vo.cca.rulescheme.allocruleset.ObjValueVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1291.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_objvalue | 主键 | pk_objvalue | char(20) | √ | 主键 (UFID) |
| 2 | value | 值 | value | varchar(50) |  | 字符串 (String) |
| 3 | pk_rulesection | 外键 | pk_rulesection | varchar(20) |  | 分摊_规则分段设置 (rulesection) |
| 4 | pk_allocruleset | 分摊规则设置主键 | pk_allocruleset | varchar(20) |  | 字符串 (String) |