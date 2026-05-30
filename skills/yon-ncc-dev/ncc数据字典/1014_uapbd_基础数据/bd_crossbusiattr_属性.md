# |<<

**属性 (bd_crossbusiattr / nc.vo.crosscheckrule.BusinessAttrVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/420.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_crossbusiattr | 主键 | pk_crossbusiattr | char(20) | √ | 主键 (UFID) |
| 2 | pk_property | 属性主键 | pk_property | varchar(36) |  | 实体属性 (property) |
| 3 | propertypath | 属性路径 | propertypath | varchar(200) |  | 字符串 (String) |
| 4 | pk_business | 档案类型主键 | pk_business | varchar(20) |  | 档案类型 (bd_crossrulebusi) |