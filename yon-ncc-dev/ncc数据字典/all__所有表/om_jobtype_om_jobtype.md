# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10114.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_jobtype | pk_jobtype | pk_jobtype | char(20) | √ |
| 2 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |  |  | 0 |
| 3 | enablestate | enablestate | enablestate | number(38, 0) |  |  | 1 |
| 4 | father_pk | father_pk | father_pk | varchar2(20) |  |  | '~' |
| 5 | inheritflag | inheritflag | inheritflag | char(1) |
| 6 | innercode | innercode | innercode | varchar2(200) |
| 7 | jobtypecode | jobtypecode | jobtypecode | varchar2(50) | √ |
| 8 | jobtypedesc | jobtypedesc | jobtypedesc | varchar2(1536) |
| 9 | jobtypename | jobtypename | jobtypename | varchar2(300) | √ |
| 10 | jobtypename2 | jobtypename2 | jobtypename2 | varchar2(300) |
| 11 | jobtypename3 | jobtypename3 | jobtypename3 | varchar2(300) |
| 12 | jobtypename4 | jobtypename4 | jobtypename4 | varchar2(300) |
| 13 | jobtypename5 | jobtypename5 | jobtypename5 | varchar2(300) |
| 14 | jobtypename6 | jobtypename6 | jobtypename6 | varchar2(300) |
| 15 | originaldocid | originaldocid | originaldocid | varchar2(20) |  |  | '~' |
| 16 | pk_grade_source | pk_grade_source | pk_grade_source | varchar2(20) |  |  | '~' |
| 17 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 18 | pk_joblevelsys | pk_joblevelsys | pk_joblevelsys | varchar2(20) |  |  | '~' |
| 19 | pk_level_source | pk_level_source | pk_level_source | char(20) |
| 20 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 21 | pvtjobgrade | pvtjobgrade | pvtjobgrade | char(1) |  |  | 'N' |
| 22 | redefineflag | redefineflag | redefineflag | char(1) |
| 23 | sourcetype | sourcetype | sourcetype | number(38, 0) |
| 24 | type_level | type_level | type_level | number(38, 0) |
| 25 | creationtime | creationtime | creationtime | char(19) |
| 26 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 27 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 28 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 29 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 30 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |