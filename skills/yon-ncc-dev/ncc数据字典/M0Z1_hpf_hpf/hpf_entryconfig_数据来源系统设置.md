# |<<

**数据来源系统设置 (hpf_entryconfig / nc.vo.hpfc.entryconfig.EntryconfigVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2625.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_entryconfig | 数据来源系统 | pk_entryconfig | char(20) | √ | 主键 (UFID) |
| 2 | code | 来源系统编码 | code | varchar(50) |  | 字符串 (String) |
| 3 | name | 来源系统名称 | name | varchar(50) |  | 字符串 (String) |
| 4 | datasource | 中间数据源 | datasource | varchar(50) |  | 字符串 (String) |
| 5 | itype | 系统类型 | itype | int |  | 系统类型 (SysTypeEnum) |  | 1=内部系统; |