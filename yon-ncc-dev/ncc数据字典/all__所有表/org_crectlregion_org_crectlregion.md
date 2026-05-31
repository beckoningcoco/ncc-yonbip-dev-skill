# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10186.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ccregion | pk_ccregion | pk_ccregion | char(20) | √ |
| 2 | code | code | code | varchar2(40) | √ |
| 3 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |  |  | 0 |
| 4 | enablestate | enablestate | enablestate | number(38, 0) |  |  | 1 |
| 5 | layertype | layertype | layertype | number(38, 0) | √ |  | 0 |
| 6 | memo | memo | memo | varchar2(300) |
| 7 | mnecode | mnecode | mnecode | varchar2(75) |
| 8 | name | name | name | varchar2(300) | √ |
| 9 | name2 | name2 | name2 | varchar2(300) |
| 10 | name3 | name3 | name3 | varchar2(300) |
| 11 | name4 | name4 | name4 | varchar2(300) |
| 12 | name5 | name5 | name5 | varchar2(300) |
| 13 | name6 | name6 | name6 | varchar2(300) |
| 14 | pk_exratescheme | pk_exratescheme | pk_exratescheme | char(20) | √ |
| 15 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 16 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 17 | pk_timezone | pk_timezone | pk_timezone | char(20) | √ |
| 18 | shortname | shortname | shortname | varchar2(300) |
| 19 | shortname2 | shortname2 | shortname2 | varchar2(300) |
| 20 | shortname3 | shortname3 | shortname3 | varchar2(300) |
| 21 | shortname4 | shortname4 | shortname4 | varchar2(300) |
| 22 | shortname5 | shortname5 | shortname5 | varchar2(300) |
| 23 | shortname6 | shortname6 | shortname6 | varchar2(300) |
| 24 | creationtime | creationtime | creationtime | char(19) |
| 25 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 26 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 27 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 28 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 29 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |