# |<<

**档案约束关系 (bd_crossrulerest / nc.vo.crosscheckrule.RestraintVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/425.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_restraint | 主键 | pk_restraint | char(20) | √ | 主键 (UFID) |
| 2 | pk_business | 档案类型主键 | pk_business | varchar(20) |  | 档案类型 (bd_crossrulebusi) |
| 3 | expression | 表达式 | expression | image |  | BLOB (BLOB) |
| 4 | group_id | 组属性 | group_id | varchar(50) |  | 字符串 (String) |
| 5 | pk_rule | 单据控制规则 | pk_rule | varchar(20) |  | 单据控制规则 (bd_crossrule) |