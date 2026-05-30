# |<<

**自定义字段对照表 (arap_deffieldmapping / nc.vo.arap.tally.DefFieldMappingVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/171.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_deffieldmapping | 主键 | pk_deffieldmapping | char(20) | √ | 主键 (UFID) |
| 2 | src_table | 来源表 | src_table | varchar(20) |  | 字符串 (String) |
| 3 | src_deffield | 来源自定义项 | src_deffield | varchar(50) |  | 字符串 (String) |
| 4 | tar_table | 目标表 | tar_table | varchar(20) |  | 字符串 (String) |
| 5 | tar_deffield | 目的自定义项 | tar_deffield | varchar(50) |  | 字符串 (String) |
| 6 | pk_billtype | 单据类型 | pk_billtype | char(20) |  | 主键 (UFID) |