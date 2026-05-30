# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7138.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_disc | pk_disc | pk_disc | char(20) | √ |
| 2 | approvedate | approvedate | approvedate | char(19) |
| 3 | approvenote | approvenote | approvenote | varchar2(50) |
| 4 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 5 | approvestatus | approvestatus | approvestatus | number(38, 0) |
| 6 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 7 | billno | billno | billno | varchar2(50) |
| 8 | billtype | billtype | billtype | varchar2(20) |  |  | '~' |
| 9 | billversionpk | billversionpk | billversionpk | varchar2(50) |
| 10 | busitype | busitype | busitype | varchar2(50) |
| 11 | code | code | code | varchar2(30) |
| 12 | emendenum | emendenum | emendenum | number(38, 0) |
| 13 | flag_active | flag_active | flag_active | char(1) |
| 14 | lastmaketime | lastmaketime | lastmaketime | char(19) |
| 15 | maketime | maketime | maketime | char(19) |
| 16 | mnecode | mnecode | mnecode | varchar2(30) |
| 17 | name | name | name | varchar2(50) |
| 18 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 19 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 20 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 21 | ratio | ratio | ratio | number(14, 2) |
| 22 | srcbillid | srcbillid | srcbillid | varchar2(50) |
| 23 | srcbilltype | srcbilltype | srcbilltype | varchar2(50) |
| 24 | transtype | transtype | transtype | varchar2(50) |
| 25 | transtypepk | transtypepk | transtypepk | varchar2(20) |  |  | '~' |
| 26 | def1 | def1 | def1 | varchar2(101) |
| 27 | def2 | def2 | def2 | varchar2(101) |
| 28 | def3 | def3 | def3 | varchar2(101) |
| 29 | def4 | def4 | def4 | varchar2(101) |
| 30 | def5 | def5 | def5 | varchar2(101) |
| 31 | def6 | def6 | def6 | varchar2(101) |
| 32 | def7 | def7 | def7 | varchar2(101) |
| 33 | def8 | def8 | def8 | varchar2(101) |
| 34 | def9 | def9 | def9 | varchar2(101) |
| 35 | def10 | def10 | def10 | varchar2(101) |
| 36 | def11 | def11 | def11 | varchar2(101) |
| 37 | def12 | def12 | def12 | varchar2(101) |
| 38 | def13 | def13 | def13 | varchar2(101) |
| 39 | def14 | def14 | def14 | varchar2(101) |
| 40 | def15 | def15 | def15 | varchar2(101) |
| 41 | def16 | def16 | def16 | varchar2(101) |
| 42 | def17 | def17 | def17 | varchar2(101) |
| 43 | def18 | def18 | def18 | varchar2(101) |
| 44 | def19 | def19 | def19 | varchar2(101) |
| 45 | def20 | def20 | def20 | varchar2(101) |
| 46 | creationtime | creationtime | creationtime | char(19) |
| 47 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 48 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 49 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 50 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 51 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |