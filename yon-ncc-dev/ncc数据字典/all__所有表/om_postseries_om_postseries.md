# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10130.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_postseries | pk_postseries | pk_postseries | char(20) | √ |  | '~' |
| 2 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |  |  | 0 |
| 3 | enablestate | enablestate | enablestate | number(38, 0) |  |  | 2 |
| 4 | father_pk | father_pk | father_pk | varchar2(20) |  |  | '~' |
| 5 | inheritflag | inheritflag | inheritflag | char(1) |
| 6 | innercode | innercode | innercode | varchar2(200) |
| 7 | pk_grade_source | pk_grade_source | pk_grade_source | char(20) |
| 8 | pk_group | pk_group | pk_group | char(20) | √ |  | '~' |
| 9 | pk_joblevelsys | pk_joblevelsys | pk_joblevelsys | varchar2(20) |  |  | '~' |
| 10 | pk_level_source | pk_level_source | pk_level_source | char(20) |
| 11 | pk_org | pk_org | pk_org | char(20) | √ |  | '~' |
| 12 | postseriescode | postseriescode | postseriescode | varchar2(40) | √ |
| 13 | postseriesdesc | postseriesdesc | postseriesdesc | varchar2(1536) |
| 14 | postseriesname | postseriesname | postseriesname | varchar2(300) | √ |
| 15 | postseriesname2 | postseriesname2 | postseriesname2 | varchar2(300) |
| 16 | postseriesname3 | postseriesname3 | postseriesname3 | varchar2(300) |
| 17 | postseriesname4 | postseriesname4 | postseriesname4 | varchar2(300) |
| 18 | postseriesname5 | postseriesname5 | postseriesname5 | varchar2(300) |
| 19 | postseriesname6 | postseriesname6 | postseriesname6 | varchar2(300) |
| 20 | seq | seq | seq | varchar2(20) |
| 21 | sourcetype | sourcetype | sourcetype | number(38, 0) |
| 22 | creationtime | creationtime | creationtime | char(19) |
| 23 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 24 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 25 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 26 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 27 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |