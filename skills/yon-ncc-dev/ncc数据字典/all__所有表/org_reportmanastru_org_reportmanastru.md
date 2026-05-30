# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10288.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_reportmanastru | pk_reportmanastru | pk_reportmanastru | char(20) | √ |
| 2 | busiattr | busiattr | busiattr | char(20) | √ |
| 3 | code | code | code | varchar2(100) | √ |
| 4 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |  |  | 0 |
| 5 | enablestate | enablestate | enablestate | number(38, 0) |  |  | 1 |
| 6 | islastversion | islastversion | islastversion | char(1) |
| 7 | isunionstru | isunionstru | isunionstru | char(1) |
| 8 | memo | memo | memo | varchar2(300) |
| 9 | mnecode | mnecode | mnecode | varchar2(75) |
| 10 | name | name | name | varchar2(300) | √ |
| 11 | name2 | name2 | name2 | varchar2(300) |
| 12 | name3 | name3 | name3 | varchar2(300) |
| 13 | name4 | name4 | name4 | varchar2(300) |
| 14 | name5 | name5 | name5 | varchar2(300) |
| 15 | name6 | name6 | name6 | varchar2(300) |
| 16 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 17 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 18 | pk_vid | pk_vid | pk_vid | varchar2(20) |  |  | '~' |
| 19 | shortname | shortname | shortname | varchar2(300) |
| 20 | shortname2 | shortname2 | shortname2 | varchar2(300) |
| 21 | shortname3 | shortname3 | shortname3 | varchar2(300) |
| 22 | shortname4 | shortname4 | shortname4 | varchar2(300) |
| 23 | shortname5 | shortname5 | shortname5 | varchar2(300) |
| 24 | shortname6 | shortname6 | shortname6 | varchar2(300) |
| 25 | venddate | venddate | venddate | char(19) |
| 26 | vname | vname | vname | varchar2(300) |
| 27 | vname2 | vname2 | vname2 | varchar2(300) |
| 28 | vname3 | vname3 | vname3 | varchar2(300) |
| 29 | vname4 | vname4 | vname4 | varchar2(300) |
| 30 | vname5 | vname5 | vname5 | varchar2(300) |
| 31 | vname6 | vname6 | vname6 | varchar2(300) |
| 32 | vno | vno | vno | varchar2(50) |
| 33 | vstartdate | vstartdate | vstartdate | char(19) |
| 34 | creationtime | creationtime | creationtime | char(19) |
| 35 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 36 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 37 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 38 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 39 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |