# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6760.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bankdoc | pk_bankdoc | pk_bankdoc | char(20) | √ |
| 2 | address | address | address | varchar2(20) |  |  | '~' |
| 3 | areacode | areacode | areacode | varchar2(20) |  |  | '~' |
| 4 | bankarea | bankarea | bankarea | varchar2(80) |
| 5 | bankcode | bankcode | bankcode | varchar2(50) |
| 6 | city | city | city | varchar2(120) |
| 7 | code | code | code | varchar2(40) |
| 8 | combinenum | combinenum | combinenum | varchar2(80) |
| 9 | customernumber | customernumber | customernumber | varchar2(80) |
| 10 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |
| 11 | enablestate | enablestate | enablestate | number(38, 0) |
| 12 | innercode | innercode | innercode | varchar2(200) |
| 13 | iscustbank | iscustbank | iscustbank | char(1) |
| 14 | isiban | isiban | isiban | char(1) |
| 15 | issigned | issigned | issigned | char(1) |
| 16 | mnecode | mnecode | mnecode | varchar2(50) |
| 17 | name | name | name | varchar2(300) |
| 18 | name2 | name2 | name2 | varchar2(300) |
| 19 | name3 | name3 | name3 | varchar2(300) |
| 20 | name4 | name4 | name4 | varchar2(300) |
| 21 | name5 | name5 | name5 | varchar2(300) |
| 22 | name6 | name6 | name6 | varchar2(300) |
| 23 | orgnumber | orgnumber | orgnumber | varchar2(80) |
| 24 | pcombinename | pcombinename | pcombinename | varchar2(300) |
| 25 | pcombinename2 | pcombinename2 | pcombinename2 | varchar2(300) |
| 26 | pcombinename3 | pcombinename3 | pcombinename3 | varchar2(300) |
| 27 | pcombinename4 | pcombinename4 | pcombinename4 | varchar2(300) |
| 28 | pcombinename5 | pcombinename5 | pcombinename5 | varchar2(300) |
| 29 | pcombinename6 | pcombinename6 | pcombinename6 | varchar2(300) |
| 30 | pcombinenum | pcombinenum | pcombinenum | varchar2(40) |
| 31 | pk_banktype | pk_banktype | pk_banktype | varchar2(20) |  |  | '~' |
| 32 | pk_combine | pk_combine | pk_combine | varchar2(20) |  |  | '~' |
| 33 | pk_country | pk_country | pk_country | varchar2(20) |  |  | '~' |
| 34 | pk_fatherbank | pk_fatherbank | pk_fatherbank | char(20) |  |  | '~' |
| 35 | pk_fundorg | pk_fundorg | pk_fundorg | varchar2(20) |  |  | '~' |
| 36 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 37 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 38 | pk_workcalendar | pk_workcalendar | pk_workcalendar | varchar2(20) |  |  | '~' |
| 39 | province | province | province | varchar2(120) |
| 40 | seq | seq | seq | varchar2(20) |
| 41 | shortname | shortname | shortname | varchar2(300) |
| 42 | swiftcode | swiftcode | swiftcode | varchar2(20) |
| 43 | def1 | def1 | def1 | varchar2(101) |
| 44 | def2 | def2 | def2 | varchar2(101) |
| 45 | def3 | def3 | def3 | varchar2(101) |
| 46 | def4 | def4 | def4 | varchar2(101) |
| 47 | def5 | def5 | def5 | varchar2(101) |
| 48 | creationtime | creationtime | creationtime | char(19) |
| 49 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 50 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 51 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 52 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 53 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |