# |<<

**优质优价标准子表 (purp_qpstandard_b / nc.vo.pp.hqhp.qpstandard.entity.QPStandardItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4814.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_qpstandard_b | 子表主键 | pk_qpstandard_b | varchar(50) | √ | 字符串 (String) |
| 2 | bincludelower | 是否包含下限 | bincludelower | char(1) |  | 布尔类型 (UFBoolean) | Y |
| 3 | vlower | 下限值 | vlower | varchar(50) |  | 字符串 (String) |
| 4 | vupper | 上限值 | vupper | varchar(50) |  | 字符串 (String) |
| 5 | bincludeupper | 是否包含上限 | bincludeupper | char(1) |  | 布尔类型 (UFBoolean) | N |
| 6 | fadjusttype | 调整类型 | fadjusttype | int |  | 调整类型 (AdjustType) |  | 0=上调; |