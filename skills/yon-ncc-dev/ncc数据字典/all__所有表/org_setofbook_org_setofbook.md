# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10302.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_setofbook | pk_setofbook | pk_setofbook | char(20) | √ |
| 2 | checkaim | checkaim | checkaim | varchar2(50) |
| 3 | code | code | code | varchar2(40) | √ |
| 4 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |  |  | 0 |
| 5 | isaccountbook | isaccountbook | isaccountbook | char(1) |
| 6 | isliabilitybook | isliabilitybook | isliabilitybook | char(1) |
| 7 | mnecode | mnecode | mnecode | varchar2(50) |
| 8 | name | name | name | varchar2(300) | √ |
| 9 | name2 | name2 | name2 | varchar2(300) |
| 10 | name3 | name3 | name3 | varchar2(300) |
| 11 | name4 | name4 | name4 | varchar2(300) |
| 12 | name5 | name5 | name5 | varchar2(300) |
| 13 | name6 | name6 | name6 | varchar2(300) |
| 14 | pk_accperiodscheme | pk_accperiodscheme | pk_accperiodscheme | char(20) | √ |
| 15 | pk_accsystem | pk_accsystem | pk_accsystem | varchar2(20) |  |  | '~' |
| 16 | pk_checkelemsystem | pk_checkelemsystem | pk_checkelemsystem | varchar2(20) |  |  | '~' |
| 17 | pk_exratescheme | pk_exratescheme | pk_exratescheme | varchar2(20) |  |  | '~' |
| 18 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 19 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 20 | pk_standardcurr | pk_standardcurr | pk_standardcurr | char(20) | √ |
| 21 | shortname | shortname | shortname | varchar2(300) |
| 22 | shortname2 | shortname2 | shortname2 | varchar2(300) |
| 23 | shortname3 | shortname3 | shortname3 | varchar2(300) |
| 24 | shortname4 | shortname4 | shortname4 | varchar2(300) |
| 25 | shortname5 | shortname5 | shortname5 | varchar2(300) |
| 26 | shortname6 | shortname6 | shortname6 | varchar2(300) |
| 27 | creationtime | creationtime | creationtime | char(19) |
| 28 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 29 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 30 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 31 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 32 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |