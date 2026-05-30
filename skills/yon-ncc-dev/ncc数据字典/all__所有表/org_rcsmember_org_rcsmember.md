# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10280.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rcsmember | pk_rcsmember | pk_rcsmember | char(20) | √ |
| 2 | code | code | code | varchar2(50) |
| 3 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |
| 4 | idx | idx | idx | number(38, 0) |
| 5 | innercode | innercode | innercode | varchar2(200) |
| 6 | isbalanceunit | isbalanceunit | isbalanceunit | char(1) |
| 7 | iscancel | iscancel | iscancel | char(1) |
| 8 | islastversion | islastversion | islastversion | char(1) |
| 9 | ismanageorg | ismanageorg | ismanageorg | char(1) |
| 10 | name | name | name | varchar2(300) |
| 11 | name2 | name2 | name2 | varchar2(300) |
| 12 | name3 | name3 | name3 | varchar2(300) |
| 13 | name4 | name4 | name4 | varchar2(300) |
| 14 | name5 | name5 | name5 | varchar2(300) |
| 15 | name6 | name6 | name6 | varchar2(300) |
| 16 | pk_entityorg | pk_entityorg | pk_entityorg | varchar2(20) |  |  | '~' |
| 17 | pk_fathermember | pk_fathermember | pk_fathermember | varchar2(20) |  |  | '~' |
| 18 | pk_fatherorg | pk_fatherorg | pk_fatherorg | varchar2(20) |  |  | '~' |
| 19 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 20 | pk_orgvid | pk_orgvid | pk_orgvid | varchar2(20) |  |  | '~' |
| 21 | pk_rcs | pk_rcs | pk_rcs | varchar2(20) |  |  | '~' |
| 22 | pk_svid | pk_svid | pk_svid | varchar2(20) |  |  | '~' |
| 23 | pk_vid | pk_vid | pk_vid | varchar2(20) |  |  | '~' |
| 24 | venddate | venddate | venddate | char(19) |
| 25 | vname | vname | vname | varchar2(300) |
| 26 | vname2 | vname2 | vname2 | varchar2(300) |
| 27 | vname3 | vname3 | vname3 | varchar2(300) |
| 28 | vname4 | vname4 | vname4 | varchar2(300) |
| 29 | vname5 | vname5 | vname5 | varchar2(300) |
| 30 | vname6 | vname6 | vname6 | varchar2(300) |
| 31 | vno | vno | vno | varchar2(50) |
| 32 | vstartdate | vstartdate | vstartdate | char(19) |
| 33 | creationtime | creationtime | creationtime | char(19) |
| 34 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 35 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 36 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 37 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 38 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |