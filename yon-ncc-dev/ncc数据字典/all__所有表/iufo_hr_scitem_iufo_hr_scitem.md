# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9639.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_item | pk_item | pk_item | char(20) | √ |
| 2 | datatype | datatype | datatype | number(38, 0) |
| 3 | dfttablename | dfttablename | dfttablename | varchar2(50) |
| 4 | fieldcode | fieldcode | fieldcode | varchar2(50) |
| 5 | fieldname | fieldname | fieldname | varchar2(50) |
| 6 | fieldrefpk | fieldrefpk | fieldrefpk | blob |
| 7 | fieldtype | fieldtype | fieldtype | varchar2(50) |
| 8 | fieldvalue | fieldvalue | fieldvalue | blob |
| 9 | operator | operator | operator | varchar2(50) |
| 10 | pk_child | pk_child | pk_child | varchar2(50) |
| 11 | pk_parent | pk_parent | pk_parent | varchar2(50) |
| 12 | pk_statcond | pk_statcond | pk_statcond | varchar2(20) |  |  | '~' |
| 13 | refname | refname | refname | varchar2(80) |
| 14 | resid | resid | resid | varchar2(50) |
| 15 | resmodule | resmodule | resmodule | varchar2(50) |
| 16 | sequence | sequence | sequence | number(38, 0) |
| 17 | valuetype | valuetype | valuetype | varchar2(50) |
| 18 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 19 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |