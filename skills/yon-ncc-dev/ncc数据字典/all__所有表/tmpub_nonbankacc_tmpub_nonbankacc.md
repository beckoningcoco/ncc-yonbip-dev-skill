# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12163.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_nonbankacc | pk_nonbankacc | pk_nonbankacc | char(20) | √ |
| 2 | accname | accname | accname | varchar2(200) |
| 3 | accnum | accnum | accnum | varchar2(40) |
| 4 | accountproperty | accountproperty | accountproperty | number(38, 0) |
| 5 | address | address | address | varchar2(200) |
| 6 | areacode | areacode | areacode | varchar2(20) |  |  | '~' |
| 7 | bankarea | bankarea | bankarea | varchar2(80) |
| 8 | city | city | city | varchar2(80) |
| 9 | code | code | code | varchar2(40) |
| 10 | combineaccname | combineaccname | combineaccname | varchar2(200) |
| 11 | combineaccnum | combineaccnum | combineaccnum | varchar2(80) |
| 12 | combinenum | combinenum | combinenum | varchar2(80) |
| 13 | contactpsn | contactpsn | contactpsn | varchar2(25) |
| 14 | customernumber | customernumber | customernumber | varchar2(80) |
| 15 | disable_time | disable_time | disable_time | char(19) |
| 16 | disable_user | disable_user | disable_user | varchar2(20) |  |  | '~' |
| 17 | enable_state | enable_state | enable_state | varchar2(50) |
| 18 | enable_time | enable_time | enable_time | char(19) |
| 19 | enable_user | enable_user | enable_user | varchar2(20) |  |  | '~' |
| 20 | issigned | issigned | issigned | char(1) |
| 21 | memo | memo | memo | varchar2(200) |
| 22 | name | name | name | varchar2(50) |
| 23 | name2 | name2 | name2 | varchar2(200) |
| 24 | name3 | name3 | name3 | varchar2(200) |
| 25 | name4 | name4 | name4 | varchar2(200) |
| 26 | name5 | name5 | name5 | varchar2(200) |
| 27 | name6 | name6 | name6 | varchar2(200) |
| 28 | nonbankfininstitution | nonbankfininstitution | nonbankfininstitution | varchar2(20) |  |  | '~' |
| 29 | orgflag | orgflag | orgflag | number(38, 0) |
| 30 | orgnumber | orgnumber | orgnumber | varchar2(80) |
| 31 | pk_bankdoc | pk_bankdoc | pk_bankdoc | varchar2(20) |  |  | '~' |
| 32 | pk_banktype | pk_banktype | pk_banktype | varchar2(20) |  |  | '~' |
| 33 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 34 | pk_netbankinftp | pk_netbankinftp | pk_netbankinftp | varchar2(20) |  |  | '~' |
| 35 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 36 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 37 | province | province | province | varchar2(80) |
| 38 | tel | tel | tel | varchar2(30) |
| 39 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 40 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 41 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 42 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 43 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 44 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 45 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 46 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 47 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 48 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 49 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 50 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 51 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 52 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 53 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 54 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 55 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 56 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 57 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 58 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 59 | creationtime | creationtime | creationtime | char(19) |
| 60 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 61 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 62 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 63 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 64 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |