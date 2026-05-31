# |<<

**约束数据 (bd_crossrestdata / nc.vo.crosscheckrule.RestraintDataVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/422.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_data | 主键 | pk_data | char(20) | √ | 字符串 (String) |
| 2 | data | 数据 | data | varchar(50) |  | 字符串 (String) |
| 3 | pk_restraint | 所属约束关系 | pk_restraint | varchar(20) |  | 档案约束关系 (bd_crossrulerest) |