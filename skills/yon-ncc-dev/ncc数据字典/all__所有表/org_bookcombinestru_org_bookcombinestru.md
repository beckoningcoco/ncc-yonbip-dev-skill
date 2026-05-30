# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10166.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bookcombinestru | pk_bookcombinestru | pk_bookcombinestru | char(20) | √ |
| 2 | code | code | code | varchar2(40) | √ |
| 3 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |  |  | 0 |
| 4 | enablestate | enablestate | enablestate | number(38, 0) |  |  | 1 |
| 5 | islastversion | islastversion | islastversion | char(1) |
| 6 | memo | memo | memo | varchar2(300) |
| 7 | mnecode | mnecode | mnecode | varchar2(75) |
| 8 | name | name | name | varchar2(300) | √ |
| 9 | name2 | name2 | name2 | varchar2(300) |
| 10 | name3 | name3 | name3 | varchar2(300) |
| 11 | name4 | name4 | name4 | varchar2(300) |
| 12 | name5 | name5 | name5 | varchar2(300) |
| 13 | name6 | name6 | name6 | varchar2(300) |
| 14 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 15 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 16 | pk_vid | pk_vid | pk_vid | varchar2(50) |  |  | '~' |
| 17 | shortname | shortname | shortname | varchar2(300) |
| 18 | shortname2 | shortname2 | shortname2 | varchar2(300) |
| 19 | shortname3 | shortname3 | shortname3 | varchar2(300) |
| 20 | shortname4 | shortname4 | shortname4 | varchar2(300) |
| 21 | shortname5 | shortname5 | shortname5 | varchar2(300) |
| 22 | shortname6 | shortname6 | shortname6 | varchar2(300) |
| 23 | venddate | venddate | venddate | char(19) |
| 24 | vname | vname | vname | varchar2(300) |
| 25 | vname2 | vname2 | vname2 | varchar2(300) |
| 26 | vname3 | vname3 | vname3 | varchar2(300) |
| 27 | vname4 | vname4 | vname4 | varchar2(300) |
| 28 | vname5 | vname5 | vname5 | varchar2(300) |
| 29 | vname6 | vname6 | vname6 | varchar2(300) |
| 30 | vno | vno | vno | varchar2(50) |
| 31 | vstartdate | vstartdate | vstartdate | char(19) |
| 32 | creationtime | creationtime | creationtime | char(19) |
| 33 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 34 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 35 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 36 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 37 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |