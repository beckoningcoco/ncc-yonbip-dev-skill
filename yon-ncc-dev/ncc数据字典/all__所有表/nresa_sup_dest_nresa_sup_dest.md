# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10073.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dest | pk_dest | pk_dest | char(20) | √ |
| 2 | approvedate | approvedate | approvedate | char(19) |
| 3 | approvenote | approvenote | approvenote | varchar2(50) |
| 4 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 5 | approvestatus | approvestatus | approvestatus | number(38, 0) |
| 6 | billdate | billdate | billdate | char(19) |
| 7 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 8 | billno | billno | billno | varchar2(50) |
| 9 | billtype | billtype | billtype | varchar2(50) |
| 10 | billversionpk | billversionpk | billversionpk | varchar2(50) |
| 11 | bookmoney | bookmoney | bookmoney | number(28, 8) |
| 12 | busitype | busitype | busitype | varchar2(20) |  |  | '~' |
| 13 | emendenum | emendenum | emendenum | number(38, 0) |
| 14 | glbmoney | glbmoney | glbmoney | number(28, 8) |
| 15 | grpmoney | grpmoney | grpmoney | number(28, 8) |
| 16 | hvdate | hvdate | hvdate | char(19) |
| 17 | orgmoney | orgmoney | orgmoney | number(28, 8) |
| 18 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 19 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 20 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 21 | priceclass | priceclass | priceclass | varchar2(20) |  |  | '~' |
| 22 | saga_btxid | saga_btxid | saga_btxid | varchar2(80) |
| 23 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 24 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(80) |
| 25 | saga_status | saga_status | saga_status | number(38, 0) |
| 26 | transtype | transtype | transtype | varchar2(50) |  |  | '~' |
| 27 | transtypepk | transtypepk | transtypepk | varchar2(20) | √ |
| 28 | def1 | def1 | def1 | varchar2(101) |
| 29 | def2 | def2 | def2 | varchar2(101) |
| 30 | def3 | def3 | def3 | varchar2(101) |
| 31 | def4 | def4 | def4 | varchar2(101) |
| 32 | def5 | def5 | def5 | varchar2(101) |
| 33 | def6 | def6 | def6 | varchar2(101) |
| 34 | def7 | def7 | def7 | varchar2(101) |
| 35 | def8 | def8 | def8 | varchar2(101) |
| 36 | def9 | def9 | def9 | varchar2(101) |
| 37 | def10 | def10 | def10 | varchar2(101) |
| 38 | def11 | def11 | def11 | varchar2(101) |
| 39 | def12 | def12 | def12 | varchar2(101) |
| 40 | def13 | def13 | def13 | varchar2(101) |
| 41 | def14 | def14 | def14 | varchar2(101) |
| 42 | def15 | def15 | def15 | varchar2(101) |
| 43 | def16 | def16 | def16 | varchar2(101) |
| 44 | def17 | def17 | def17 | varchar2(101) |
| 45 | def18 | def18 | def18 | varchar2(101) |
| 46 | def19 | def19 | def19 | varchar2(101) |
| 47 | def20 | def20 | def20 | varchar2(101) |
| 48 | creationtime | creationtime | creationtime | char(19) |
| 49 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 50 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 51 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 52 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 53 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |