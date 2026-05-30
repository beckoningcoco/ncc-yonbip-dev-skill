# |<<

**档案类型 (bd_crossrulebusi / nc.vo.crosscheckrule.BusinessVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/424.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_business | 主键 | pk_business | char(20) | √ | 主键 (UFID) |
| 2 | pk_entity | 档案名称 | pk_entity | varchar(36) |  | 实体 (entity) |
| 3 | value_type | 值类型 | value_type | int | √ | 约束关系设置方式 (value_type) |  | 1=按枚举值; |