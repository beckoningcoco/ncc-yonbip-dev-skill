# |<<

**坏账计提方案子表 (arap_dstlcase_b / nc.vo.arap.badacc.DstlCaseChildVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/176.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dstlcase_b | 主键 | pk_dstlcase_b | char(20) | √ | 主键 (UFID) |
| 2 | num | 序号 | num | varchar(50) |  | 字符串 (String) |
| 3 | subname | 子方案名称 | subname | varchar(50) |  | 字符串 (String) |
| 4 | pk_dstlcase | 计提方案主表主键 | pk_dstlcase | char(20) |  | 主键 (UFID) |
| 5 | dstltype | 计提方式 | dstltype | varchar(50) |  | 计提方式 (methodEnum) |  | 0=销货百分比法; |