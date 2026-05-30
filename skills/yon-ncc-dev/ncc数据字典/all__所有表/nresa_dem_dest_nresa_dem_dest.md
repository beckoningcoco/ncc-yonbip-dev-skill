# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10019.html

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
| 12 | busidate | busidate | busidate | char(19) |
| 13 | busitype | busitype | busitype | varchar2(20) |  |  | '~' |
| 14 | emendenum | emendenum | emendenum | number(38, 0) |
| 15 | glbmoney | glbmoney | glbmoney | number(28, 8) |
| 16 | grpmoney | grpmoney | grpmoney | number(28, 8) |
| 17 | hvdate | hvdate | hvdate | char(19) |
| 18 | inoutitem | inoutitem | inoutitem | varchar2(20) |  |  | '~' |
| 19 | orgmoney | orgmoney | orgmoney | number(28, 8) |
| 20 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 21 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 22 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 23 | priceclass | priceclass | priceclass | varchar2(20) |  |  | '~' |
| 24 | saga_btxid | saga_btxid | saga_btxid | varchar2(80) |
| 25 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 26 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(80) |
| 27 | saga_status | saga_status | saga_status | number(38, 0) |
| 28 | transtype | transtype | transtype | varchar2(50) |  |  | '~' |
| 29 | transtypepk | transtypepk | transtypepk | varchar2(20) | √ |
| 30 | def1 | def1 | def1 | varchar2(101) |
| 31 | def2 | def2 | def2 | varchar2(101) |
| 32 | def3 | def3 | def3 | varchar2(101) |
| 33 | def4 | def4 | def4 | varchar2(101) |
| 34 | def5 | def5 | def5 | varchar2(101) |
| 35 | def6 | def6 | def6 | varchar2(101) |
| 36 | def7 | def7 | def7 | varchar2(101) |
| 37 | def8 | def8 | def8 | varchar2(101) |
| 38 | def9 | def9 | def9 | varchar2(101) |
| 39 | def10 | def10 | def10 | varchar2(101) |
| 40 | def11 | def11 | def11 | varchar2(101) |
| 41 | def12 | def12 | def12 | varchar2(101) |
| 42 | def13 | def13 | def13 | varchar2(101) |
| 43 | def14 | def14 | def14 | varchar2(101) |
| 44 | def15 | def15 | def15 | varchar2(101) |
| 45 | def16 | def16 | def16 | varchar2(101) |
| 46 | def17 | def17 | def17 | varchar2(101) |
| 47 | def18 | def18 | def18 | varchar2(101) |
| 48 | def19 | def19 | def19 | varchar2(101) |
| 49 | def20 | def20 | def20 | varchar2(101) |
| 50 | creationtime | creationtime | creationtime | char(19) |
| 51 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 52 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 53 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 54 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 55 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |