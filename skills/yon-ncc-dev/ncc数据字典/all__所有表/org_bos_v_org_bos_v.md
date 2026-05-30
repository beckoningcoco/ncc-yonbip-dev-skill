# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10171.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_vid | pk_vid | pk_vid | char(20) | √ |
| 2 | code | code | code | varchar2(40) |
| 3 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |  |  | 0 |
| 4 | enablestate | enablestate | enablestate | number(38, 0) |  |  | 1 |
| 5 | islastversion | islastversion | islastversion | char(1) |
| 6 | memo | memo | memo | varchar2(300) |
| 7 | mnecode | mnecode | mnecode | varchar2(75) |
| 8 | name | name | name | varchar2(300) |
| 9 | name2 | name2 | name2 | varchar2(300) |
| 10 | name3 | name3 | name3 | varchar2(300) |
| 11 | name4 | name4 | name4 | varchar2(300) |
| 12 | name5 | name5 | name5 | varchar2(300) |
| 13 | name6 | name6 | name6 | varchar2(300) |
| 14 | pk_budgetorgstru | pk_budgetorgstru | pk_budgetorgstru | char(20) | √ |
| 15 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 16 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 17 | shortname | shortname | shortname | varchar2(300) |
| 18 | shortname2 | shortname2 | shortname2 | varchar2(300) |
| 19 | shortname3 | shortname3 | shortname3 | varchar2(300) |
| 20 | shortname4 | shortname4 | shortname4 | varchar2(300) |
| 21 | shortname5 | shortname5 | shortname5 | varchar2(300) |
| 22 | shortname6 | shortname6 | shortname6 | varchar2(300) |
| 23 | venddate | venddate | venddate | char(19) |
| 24 | vname | vname | vname | varchar2(300) |
| 25 | vname2 | vname2 | vname2 | varchar2(200) |
| 26 | vname3 | vname3 | vname3 | varchar2(200) |
| 27 | vname4 | vname4 | vname4 | varchar2(200) |
| 28 | vname5 | vname5 | vname5 | varchar2(200) |
| 29 | vname6 | vname6 | vname6 | varchar2(200) |
| 30 | vno | vno | vno | varchar2(50) |
| 31 | vstartdate | vstartdate | vstartdate | char(19) |
| 32 | def1 | def1 | def1 | varchar2(101) |
| 33 | def2 | def2 | def2 | varchar2(101) |
| 34 | def3 | def3 | def3 | varchar2(101) |
| 35 | def4 | def4 | def4 | varchar2(101) |
| 36 | def5 | def5 | def5 | varchar2(101) |
| 37 | def6 | def6 | def6 | varchar2(101) |
| 38 | def7 | def7 | def7 | varchar2(101) |
| 39 | def8 | def8 | def8 | varchar2(101) |
| 40 | def9 | def9 | def9 | varchar2(101) |
| 41 | def10 | def10 | def10 | varchar2(101) |
| 42 | creationtime | creationtime | creationtime | char(19) |
| 43 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 44 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 45 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 46 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 47 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |