# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8131.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_fundsalter | pk_fundsalter | pk_fundsalter | char(20) | √ |
| 2 | altervalue | altervalue | altervalue | number(28, 8) |
| 3 | approvedate | approvedate | approvedate | char(19) |
| 4 | approvenote | approvenote | approvenote | varchar2(50) |
| 5 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 6 | approvestatus | approvestatus | approvestatus | number(38, 0) |
| 7 | billdate | billdate | billdate | char(19) |
| 8 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 9 | billno | billno | billno | varchar2(50) |
| 10 | billtype | billtype | billtype | varchar2(20) |  |  | '~' |
| 11 | busitype | busitype | busitype | varchar2(20) |  |  | '~' |
| 12 | memo | memo | memo | varchar2(200) |
| 13 | pk_accbook | pk_accbook | pk_accbook | varchar2(20) |  |  | '~' |
| 14 | pk_group | pk_group | pk_group | varchar2(20) | √ |
| 15 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 16 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 17 | srcbillid | srcbillid | srcbillid | varchar2(50) |
| 18 | srcbilltype | srcbilltype | srcbilltype | varchar2(50) |
| 19 | transtype | transtype | transtype | varchar2(50) |
| 20 | transtypepk | transtypepk | transtypepk | varchar2(20) |  |  | '~' |
| 21 | def1 | def1 | def1 | varchar2(100) |
| 22 | def2 | def2 | def2 | varchar2(100) |
| 23 | def3 | def3 | def3 | varchar2(100) |
| 24 | def4 | def4 | def4 | varchar2(100) |
| 25 | def5 | def5 | def5 | varchar2(100) |
| 26 | def6 | def6 | def6 | varchar2(100) |
| 27 | def7 | def7 | def7 | varchar2(100) |
| 28 | def8 | def8 | def8 | varchar2(100) |
| 29 | def9 | def9 | def9 | varchar2(100) |
| 30 | def10 | def10 | def10 | varchar2(100) |
| 31 | def11 | def11 | def11 | varchar2(100) |
| 32 | def12 | def12 | def12 | varchar2(100) |
| 33 | def13 | def13 | def13 | varchar2(100) |
| 34 | def14 | def14 | def14 | varchar2(100) |
| 35 | def15 | def15 | def15 | varchar2(100) |
| 36 | def16 | def16 | def16 | varchar2(100) |
| 37 | def17 | def17 | def17 | varchar2(100) |
| 38 | def18 | def18 | def18 | varchar2(100) |
| 39 | def19 | def19 | def19 | varchar2(100) |
| 40 | def20 | def20 | def20 | varchar2(100) |
| 41 | creationtime | creationtime | creationtime | char(19) |
| 42 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 43 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 44 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 45 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 46 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |