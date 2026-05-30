# |<<

**坏帐计提方案因素值 (arap_dstlfactorvalue / nc.vo.arap.dstlfactorvalue.Entity)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/181.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dstlfactorvalue | 主键 | pk_dstlfactorvalue | char(20) | √ | 主键 (UFID) |
| 2 | dstlfactorvalueid | 方案因素值主键 | dstlfactorvalueid | char(20) |  | 主键 (UFID) |
| 3 | pk_dstlcase_b | 坏帐计提方案辅表主键 | pk_dstlcase_b | char(20) |  | 主键 (UFID) |
| 4 | pk_factor | 因素主键 | pk_factor | varchar(20) |  | 主键 (UFID) |
| 5 | value | 因素值 | value | varchar(50) |  | 字符串 (String) |
| 6 | operator | 运算符 | operator | varchar(10) |  | 字符串 (String) |