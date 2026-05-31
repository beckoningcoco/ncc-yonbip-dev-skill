# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7270.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_userdefitem | pk_userdefitem | pk_userdefitem | char(20) | √ |
| 2 | bodydisptype | bodydisptype | bodydisptype | number(38, 0) |
| 3 | classid | classid | classid | varchar2(36) |  |  | '~' |
| 4 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |
| 5 | digits | digits | digits | number(38, 0) |
| 6 | disproperty | disproperty | disproperty | number(38, 0) | √ |  | 1 |
| 7 | enabled | enabled | enabled | char(1) |  |  | 'Y' |
| 8 | inputlength | inputlength | inputlength | number(38, 0) |
| 9 | memo | memo | memo | varchar2(200) |
| 10 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 11 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 12 | pk_userdefrule | pk_userdefrule | pk_userdefrule | varchar2(20) |  |  | '~' |
| 13 | propindex | propindex | propindex | number(38, 0) |
| 14 | showname | showname | showname | varchar2(300) |
| 15 | showname2 | showname2 | showname2 | varchar2(300) |
| 16 | showname3 | showname3 | showname3 | varchar2(300) |
| 17 | showname4 | showname4 | showname4 | varchar2(300) |
| 18 | showname5 | showname5 | showname5 | varchar2(300) |
| 19 | showname6 | showname6 | showname6 | varchar2(300) |
| 20 | usufruct | usufruct | usufruct | char(1) |  |  | 'N' |
| 21 | usufructgroup | usufructgroup | usufructgroup | varchar2(50) |
| 22 | creationtime | creationtime | creationtime | char(19) |
| 23 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 24 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 25 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 26 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 27 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |