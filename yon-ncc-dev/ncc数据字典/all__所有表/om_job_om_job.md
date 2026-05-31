# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10104.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_job | pk_job | pk_job | char(20) | √ |
| 2 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |  |  | 0 |
| 3 | defaultjobrank | defaultjobrank | defaultjobrank | varchar2(20) |  |  | '~' |
| 4 | enablestate | enablestate | enablestate | number(38, 0) |  |  | 1 |
| 5 | inheritflag | inheritflag | inheritflag | char(1) |
| 6 | jobcode | jobcode | jobcode | varchar2(50) | √ |
| 7 | jobdesc | jobdesc | jobdesc | varchar2(1536) |
| 8 | jobname | jobname | jobname | varchar2(300) | √ |
| 9 | jobname2 | jobname2 | jobname2 | varchar2(300) |
| 10 | jobname3 | jobname3 | jobname3 | varchar2(300) |
| 11 | jobname4 | jobname4 | jobname4 | varchar2(300) |
| 12 | jobname5 | jobname5 | jobname5 | varchar2(300) |
| 13 | jobname6 | jobname6 | jobname6 | varchar2(300) |
| 14 | maxage | maxage | maxage | number(38, 0) |
| 15 | minage | minage | minage | number(38, 0) |
| 16 | originaldocid | originaldocid | originaldocid | varchar2(200) |  |  | '~' |
| 17 | pk_grade_source | pk_grade_source | pk_grade_source | varchar2(20) |  |  | '~' |
| 18 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 19 | pk_jobrank | pk_jobrank | pk_jobrank | varchar2(20) |  |  | '~' |
| 20 | pk_jobtype | pk_jobtype | pk_jobtype | char(20) | √ |  | '~' |
| 21 | pk_level_source | pk_level_source | pk_level_source | char(20) |
| 22 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 23 | pvtjobgrade | pvtjobgrade | pvtjobgrade | char(1) |  |  | 'N' |
| 24 | redefineflag | redefineflag | redefineflag | char(1) |
| 25 | reqedu | reqedu | reqedu | varchar2(300) |
| 26 | reqexp | reqexp | reqexp | varchar2(300) |
| 27 | reqother | reqother | reqother | varchar2(1500) |
| 28 | reqpro | reqpro | reqpro | varchar2(300) |
| 29 | reqsex | reqsex | reqsex | varchar2(300) |
| 30 | reqtlimit | reqtlimit | reqtlimit | varchar2(300) |
| 31 | reqyold | reqyold | reqyold | varchar2(300) |
| 32 | sourcetype | sourcetype | sourcetype | number(38, 0) |
| 33 | creationtime | creationtime | creationtime | char(19) |
| 34 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 35 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 36 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 37 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 38 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |