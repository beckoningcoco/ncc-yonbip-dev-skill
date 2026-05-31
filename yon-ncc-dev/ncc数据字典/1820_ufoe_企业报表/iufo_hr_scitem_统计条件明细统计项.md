# |<<

**统计条件明细统计项 (iufo_hr_scitem / nc.vo.iufo.hr.hrstatcond.HRStatItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3459.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_item | 统计项主键 | pk_item | char(20) | √ | 主键 (UFID) |
| 2 | pk_statcond | 所属统计条件 | pk_statcond | varchar(20) |  | 统计条件 (hrstatcond) |
| 3 | sequence | 序号 | sequence | int |  | 整数 (Integer) |
| 4 | fieldname | 字段名称 | fieldname | varchar(50) |  | 字符串 (String) |
| 5 | resmodule | 字段名称多语文件包 | resmodule | varchar(50) |  | 字符串 (String) |
| 6 | resid | 字段名称多语id | resid | varchar(50) |  | 字符串 (String) |
| 7 | fieldtype | 字段类型 | fieldtype | varchar(50) |  | 字符串 (String) |
| 8 | operator | 操作符 | operator | varchar(50) |  | 字符串 (String) |
| 9 | valuetype | 值类型 | valuetype | varchar(50) |  | 字符串 (String) |
| 10 | fieldvalue | 字段值 | fieldvalue | image |  | BLOB (BLOB) |
| 11 | fieldrefpk | 参照枚举真实值 | fieldrefpk | image |  | BLOB (BLOB) |
| 12 | fieldcode | 字段编码 | fieldcode | varchar(50) |  | 字符串 (String) |
| 13 | pk_parent | 表id | pk_parent | varchar(50) |  | 字符串 (String) |
| 14 | pk_child | 字段id | pk_child | varchar(50) |  | 字符串 (String) |
| 15 | datatype | 数据类型 | datatype | int |  | 整数 (Integer) |
| 16 | dfttablename | 缺省表名 | dfttablename | varchar(50) |  | 字符串 (String) |
| 17 | refname | 参照名称 | refname | varchar(80) |  | 字符串 (String) |