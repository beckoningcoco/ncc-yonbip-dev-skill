# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10243.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obsdept | pk_obsdept | pk_obsdept | char(20) | √ |
| 2 | code | code | code | varchar2(40) | √ |
| 3 | createdate | createdate | createdate | char(19) |
| 4 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |  |  | 0 |
| 5 | enablestate | enablestate | enablestate | number(38, 0) |  |  | 2 |
| 6 | innercode | innercode | innercode | varchar2(200) |
| 7 | mnecode | mnecode | mnecode | varchar2(75) |
| 8 | name | name | name | varchar2(300) | √ |
| 9 | name2 | name2 | name2 | varchar2(300) |
| 10 | name3 | name3 | name3 | varchar2(300) |
| 11 | name4 | name4 | name4 | varchar2(300) |
| 12 | name5 | name5 | name5 | varchar2(300) |
| 13 | name6 | name6 | name6 | varchar2(300) |
| 14 | pk_fatherdept | pk_fatherdept | pk_fatherdept | varchar2(20) |  |  | '~' |
| 15 | pk_group | pk_group | pk_group | char(20) | √ |
| 16 | pk_org | pk_org | pk_org | char(20) | √ |
| 17 | shortname | shortname | shortname | varchar2(300) |
| 18 | shortname2 | shortname2 | shortname2 | varchar2(300) |
| 19 | shortname3 | shortname3 | shortname3 | varchar2(300) |
| 20 | shortname4 | shortname4 | shortname4 | varchar2(300) |
| 21 | shortname5 | shortname5 | shortname5 | varchar2(300) |
| 22 | shortname6 | shortname6 | shortname6 | varchar2(300) |
| 23 | def1 | def1 | def1 | varchar2(101) |
| 24 | def2 | def2 | def2 | varchar2(101) |
| 25 | def3 | def3 | def3 | varchar2(101) |
| 26 | def4 | def4 | def4 | varchar2(101) |
| 27 | def5 | def5 | def5 | varchar2(101) |
| 28 | creationtime | creationtime | creationtime | char(19) |
| 29 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 30 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 31 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 32 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 33 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |