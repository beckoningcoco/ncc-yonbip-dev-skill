# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10220.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_hisorg | pk_hisorg | pk_hisorg | char(20) | √ |
| 2 | bednum | bednum | bednum | number(38, 0) |
| 3 | bednum_open | bednum_open | bednum_open | number(38, 0) |
| 4 | code | code | code | varchar2(50) |
| 5 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |
| 6 | enablestate | enablestate | enablestate | number(38, 0) |
| 7 | innercode | innercode | innercode | varchar2(50) |
| 8 | islastversion | islastversion | islastversion | char(1) |
| 9 | mnecode | mnecode | mnecode | varchar2(50) |
| 10 | name | name | name | varchar2(50) |
| 11 | note | note | note | varchar2(200) |
| 12 | orglevel | orglevel | orglevel | number(38, 0) |
| 13 | orgtype | orgtype | orgtype | number(38, 0) |
| 14 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 15 | pk_org | pk_org | pk_org | varchar2(20) | √ |  | '~' |
| 16 | pk_parentorg | pk_parentorg | pk_parentorg | varchar2(20) |  |  | '~' |
| 17 | pk_region | pk_region | pk_region | varchar2(20) |  |  | '~' |
| 18 | pk_vid | pk_vid | pk_vid | char(20) |  |  | '~' |
| 19 | shortname | shortname | shortname | varchar2(50) |
| 20 | venddate | venddate | venddate | char(19) |
| 21 | vname | vname | vname | varchar2(50) |
| 22 | vno | vno | vno | varchar2(50) |
| 23 | vstartdate | vstartdate | vstartdate | char(19) |
| 24 | def1 | def1 | def1 | varchar2(101) |
| 25 | def2 | def2 | def2 | varchar2(101) |
| 26 | def3 | def3 | def3 | varchar2(101) |
| 27 | def4 | def4 | def4 | varchar2(101) |
| 28 | def5 | def5 | def5 | varchar2(101) |
| 29 | def6 | def6 | def6 | varchar2(101) |
| 30 | def7 | def7 | def7 | varchar2(101) |
| 31 | def8 | def8 | def8 | varchar2(101) |
| 32 | def9 | def9 | def9 | varchar2(101) |
| 33 | def10 | def10 | def10 | varchar2(101) |
| 34 | def11 | def11 | def11 | varchar2(101) |
| 35 | def12 | def12 | def12 | varchar2(101) |
| 36 | def13 | def13 | def13 | varchar2(101) |
| 37 | def14 | def14 | def14 | varchar2(101) |
| 38 | def15 | def15 | def15 | varchar2(101) |
| 39 | def16 | def16 | def16 | varchar2(101) |
| 40 | def17 | def17 | def17 | varchar2(101) |
| 41 | def18 | def18 | def18 | varchar2(101) |
| 42 | def19 | def19 | def19 | varchar2(101) |
| 43 | def20 | def20 | def20 | varchar2(101) |
| 44 | creationtime | creationtime | creationtime | char(19) |
| 45 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 46 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 47 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 48 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 49 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |