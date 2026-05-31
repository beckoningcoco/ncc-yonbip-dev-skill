# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10277.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_purplanstru | pk_purplanstru | pk_purplanstru | char(20) | √ |
| 2 | code | code | code | varchar2(40) | √ |
| 3 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |  |  | 0 |
| 4 | enablestate | enablestate | enablestate | number(38, 0) |  |  | 1 |
| 5 | memo | memo | memo | varchar2(300) |
| 6 | mnecode | mnecode | mnecode | varchar2(75) |
| 7 | name | name | name | varchar2(300) | √ |
| 8 | name2 | name2 | name2 | varchar2(300) |
| 9 | name3 | name3 | name3 | varchar2(300) |
| 10 | name4 | name4 | name4 | varchar2(300) |
| 11 | name5 | name5 | name5 | varchar2(300) |
| 12 | name6 | name6 | name6 | varchar2(300) |
| 13 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 14 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 15 | shortname | shortname | shortname | varchar2(300) |
| 16 | shortname2 | shortname2 | shortname2 | varchar2(300) |
| 17 | shortname3 | shortname3 | shortname3 | varchar2(300) |
| 18 | shortname4 | shortname4 | shortname4 | varchar2(300) |
| 19 | shortname5 | shortname5 | shortname5 | varchar2(300) |
| 20 | shortname6 | shortname6 | shortname6 | varchar2(300) |
| 21 | def1 | def1 | def1 | varchar2(101) |
| 22 | def2 | def2 | def2 | varchar2(101) |
| 23 | def3 | def3 | def3 | varchar2(101) |
| 24 | def4 | def4 | def4 | varchar2(101) |
| 25 | def5 | def5 | def5 | varchar2(101) |
| 26 | def6 | def6 | def6 | varchar2(101) |
| 27 | def7 | def7 | def7 | varchar2(101) |
| 28 | def8 | def8 | def8 | varchar2(101) |
| 29 | def9 | def9 | def9 | varchar2(101) |
| 30 | def10 | def10 | def10 | varchar2(101) |
| 31 | creationtime | creationtime | creationtime | char(19) |
| 32 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 33 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 34 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 35 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 36 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |