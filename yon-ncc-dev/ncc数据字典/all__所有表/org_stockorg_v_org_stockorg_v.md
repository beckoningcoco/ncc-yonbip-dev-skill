# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10314.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_vid | pk_vid | pk_vid | char(20) | √ |
| 2 | addressbook | addressbook | addressbook | varchar2(20) |  |  | '~' |
| 3 | code | code | code | varchar2(50) |
| 4 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |  |  | 0 |
| 5 | enablestate | enablestate | enablestate | number(38, 0) |  |  | 1 |
| 6 | islastversion | islastversion | islastversion | char(1) |
| 7 | mnecode | mnecode | mnecode | varchar2(75) |
| 8 | name | name | name | varchar2(300) |
| 9 | name2 | name2 | name2 | varchar2(300) |
| 10 | name3 | name3 | name3 | varchar2(300) |
| 11 | name4 | name4 | name4 | varchar2(300) |
| 12 | name5 | name5 | name5 | varchar2(300) |
| 13 | name6 | name6 | name6 | varchar2(300) |
| 14 | pk_address | pk_address | pk_address | varchar2(20) |  |  | '~' |
| 15 | pk_areacl | pk_areacl | pk_areacl | varchar2(20) |  |  | '~' |
| 16 | pk_financeorg | pk_financeorg | pk_financeorg | char(20) |
| 17 | pk_group | pk_group | pk_group | char(20) | √ |
| 18 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 19 | pk_stockorg | pk_stockorg | pk_stockorg | char(20) | √ |
| 20 | shortname | shortname | shortname | varchar2(300) |
| 21 | shortname2 | shortname2 | shortname2 | varchar2(300) |
| 22 | shortname3 | shortname3 | shortname3 | varchar2(300) |
| 23 | shortname4 | shortname4 | shortname4 | varchar2(300) |
| 24 | shortname5 | shortname5 | shortname5 | varchar2(300) |
| 25 | shortname6 | shortname6 | shortname6 | varchar2(300) |
| 26 | venddate | venddate | venddate | char(19) |
| 27 | vname | vname | vname | varchar2(75) |
| 28 | vname2 | vname2 | vname2 | varchar2(50) |
| 29 | vname3 | vname3 | vname3 | varchar2(50) |
| 30 | vname4 | vname4 | vname4 | varchar2(50) |
| 31 | vname5 | vname5 | vname5 | varchar2(50) |
| 32 | vname6 | vname6 | vname6 | varchar2(50) |
| 33 | vno | vno | vno | varchar2(50) |
| 34 | vstartdate | vstartdate | vstartdate | char(19) |
| 35 | def1 | def1 | def1 | varchar2(101) |
| 36 | def2 | def2 | def2 | varchar2(101) |
| 37 | def3 | def3 | def3 | varchar2(101) |
| 38 | def4 | def4 | def4 | varchar2(101) |
| 39 | def5 | def5 | def5 | varchar2(101) |
| 40 | def6 | def6 | def6 | varchar2(101) |
| 41 | def7 | def7 | def7 | varchar2(101) |
| 42 | def8 | def8 | def8 | varchar2(101) |
| 43 | def9 | def9 | def9 | varchar2(101) |
| 44 | def10 | def10 | def10 | varchar2(101) |
| 45 | def11 | def11 | def11 | varchar2(101) |
| 46 | def12 | def12 | def12 | varchar2(101) |
| 47 | def13 | def13 | def13 | varchar2(101) |
| 48 | def14 | def14 | def14 | varchar2(101) |
| 49 | def15 | def15 | def15 | varchar2(101) |
| 50 | def16 | def16 | def16 | varchar2(101) |
| 51 | def17 | def17 | def17 | varchar2(101) |
| 52 | def18 | def18 | def18 | varchar2(101) |
| 53 | def19 | def19 | def19 | varchar2(101) |
| 54 | def20 | def20 | def20 | varchar2(101) |
| 55 | creationtime | creationtime | creationtime | char(19) |
| 56 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 57 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 58 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 59 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 60 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |