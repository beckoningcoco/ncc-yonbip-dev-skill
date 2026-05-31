# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10201.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_vid | pk_vid | pk_vid | char(20) | √ |
| 2 | address | address | address | varchar2(20) |  |  | '~' |
| 3 | chargeleader | chargeleader | chargeleader | varchar2(20) |
| 4 | code | code | code | varchar2(40) | √ |
| 5 | createdate | createdate | createdate | char(10) |
| 6 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |  |  | 0 |
| 7 | deptcanceldate | deptcanceldate | deptcanceldate | char(10) |
| 8 | deptduty | deptduty | deptduty | varchar2(1536) |
| 9 | deptlevel | deptlevel | deptlevel | varchar2(20) |  |  | '~' |
| 10 | depttype | depttype | depttype | number(38, 0) |  |  | 0 |
| 11 | displayorder | displayorder | displayorder | number(38, 0) |
| 12 | enablestate | enablestate | enablestate | number(38, 0) |  |  | 1 |
| 13 | hrcanceled | hrcanceled | hrcanceled | char(1) |
| 14 | innercode | innercode | innercode | varchar2(200) |
| 15 | islastversion | islastversion | islastversion | char(1) |
| 16 | isretail | isretail | isretail | char(1) |
| 17 | memo | memo | memo | varchar2(200) |
| 18 | mnecode | mnecode | mnecode | varchar2(50) |
| 19 | name | name | name | varchar2(200) | √ |
| 20 | name2 | name2 | name2 | varchar2(200) |
| 21 | name3 | name3 | name3 | varchar2(200) |
| 22 | name4 | name4 | name4 | varchar2(200) |
| 23 | name5 | name5 | name5 | varchar2(200) |
| 24 | name6 | name6 | name6 | varchar2(200) |
| 25 | orgtype13 | orgtype13 | orgtype13 | char(1) |
| 26 | orgtype17 | orgtype17 | orgtype17 | char(1) |
| 27 | pk_calat | pk_calat | pk_calat | varchar2(20) |
| 28 | pk_dept | pk_dept | pk_dept | char(20) | √ |
| 29 | pk_fatherorg | pk_fatherorg | pk_fatherorg | varchar2(20) |  |  | '~' |
| 30 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 31 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 32 | principal | principal | principal | varchar2(20) |  |  | '~' |
| 33 | resposition | resposition | resposition | varchar2(20) |  |  | '~' |
| 34 | shortname | shortname | shortname | varchar2(200) |
| 35 | shortname2 | shortname2 | shortname2 | varchar2(200) |
| 36 | shortname3 | shortname3 | shortname3 | varchar2(200) |
| 37 | shortname4 | shortname4 | shortname4 | varchar2(200) |
| 38 | shortname5 | shortname5 | shortname5 | varchar2(200) |
| 39 | shortname6 | shortname6 | shortname6 | varchar2(200) |
| 40 | tel | tel | tel | varchar2(100) |
| 41 | venddate | venddate | venddate | char(19) |
| 42 | vname | vname | vname | varchar2(200) |
| 43 | vname2 | vname2 | vname2 | varchar2(200) |
| 44 | vname3 | vname3 | vname3 | varchar2(200) |
| 45 | vname4 | vname4 | vname4 | varchar2(200) |
| 46 | vname5 | vname5 | vname5 | varchar2(200) |
| 47 | vname6 | vname6 | vname6 | varchar2(200) |
| 48 | vno | vno | vno | varchar2(50) |
| 49 | vstartdate | vstartdate | vstartdate | char(19) |
| 50 | def1 | def1 | def1 | varchar2(101) |
| 51 | def2 | def2 | def2 | varchar2(101) |
| 52 | def3 | def3 | def3 | varchar2(101) |
| 53 | def4 | def4 | def4 | varchar2(101) |
| 54 | def5 | def5 | def5 | varchar2(101) |
| 55 | def6 | def6 | def6 | varchar2(101) |
| 56 | def7 | def7 | def7 | varchar2(101) |
| 57 | def8 | def8 | def8 | varchar2(101) |
| 58 | def9 | def9 | def9 | varchar2(101) |
| 59 | def10 | def10 | def10 | varchar2(101) |
| 60 | def11 | def11 | def11 | varchar2(101) |
| 61 | def12 | def12 | def12 | varchar2(101) |
| 62 | def13 | def13 | def13 | varchar2(101) |
| 63 | def14 | def14 | def14 | varchar2(101) |
| 64 | def15 | def15 | def15 | varchar2(101) |
| 65 | def16 | def16 | def16 | varchar2(101) |
| 66 | def17 | def17 | def17 | varchar2(101) |
| 67 | def18 | def18 | def18 | varchar2(101) |
| 68 | def19 | def19 | def19 | varchar2(101) |
| 69 | def20 | def20 | def20 | varchar2(101) |
| 70 | creationtime | creationtime | creationtime | char(19) |
| 71 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 72 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 73 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 74 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 75 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |