# |<<

**回写字段 (pub_writebackfield / nc.vo.pub.pfflow06.FieldMappingVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4797.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_writebackfield | 主键 | pk_writebackfield | char(20) | √ | 主键 (UFID) |
| 2 | pk_writebacksetting | 回写设置主键 | pk_writebacksetting | varchar(20) |  | 字符串 (String) |
| 3 | sourcefield | 回写字段 | sourcefield | varchar(512) |  | 字符串 (String) |
| 4 | targetfield | 目标字段 | targetfield | varchar(512) |  | 字符串 (String) |
| 5 | srcaccesstype | 来源分析方式 | srcaccesstype | varchar(50) |  | 来源分析方式 (SrcAccessType) |  | source_offset_type=差异; |