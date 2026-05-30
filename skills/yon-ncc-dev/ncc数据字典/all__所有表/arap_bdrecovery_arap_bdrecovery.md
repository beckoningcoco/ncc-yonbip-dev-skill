# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6572.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bdrecovery | pk_bdrecovery | pk_bdrecovery | char(20) | √ |
| 2 | approvedate | approvedate | approvedate | char(19) |
| 3 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 4 | approvestatus | approvestatus | approvestatus | number(38, 0) |
| 5 | billdate | billdate | billdate | char(19) |
| 6 | billno | billno | billno | varchar2(50) |
| 7 | billstatus | billstatus | billstatus | number(38, 0) |
| 8 | creatortime | creatortime | creatortime | char(19) |
| 9 | globalmoney | globalmoney | globalmoney | number(28, 8) |  |  | 0 |
| 10 | groupmoney | groupmoney | groupmoney | number(28, 8) |  |  | 0 |
| 11 | localmoney | localmoney | localmoney | number(28, 8) |  |  | 0 |
| 12 | money | money | money | number(28, 8) |  |  | 0 |
| 13 | nolossbill | nolossbill | nolossbill | char(1) |
| 14 | period | period | period | varchar2(20) |  |  | '~' |
| 15 | pk_billtype | pk_billtype | pk_billtype | varchar2(50) |
| 16 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 17 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 18 | recreason | recreason | recreason | varchar2(500) |
| 19 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 20 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) | √ |  | 0 |
| 21 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 22 | saga_status | saga_status | saga_status | number(38, 0) | √ |  | 0 |
| 23 | def1 | def1 | def1 | varchar2(101) |
| 24 | def2 | def2 | def2 | varchar2(101) |
| 25 | def3 | def3 | def3 | varchar2(101) |
| 26 | def4 | def4 | def4 | varchar2(101) |
| 27 | def5 | def5 | def5 | varchar2(101) |
| 28 | def6 | def6 | def6 | varchar2(101) |
| 29 | def7 | def7 | def7 | varchar2(101) |
| 30 | def8 | def8 | def8 | varchar2(101) |
| 31 | def9 | def9 | def9 | varchar2(101) |
| 32 | def10 | def10 | def10 | varchar2(101) |
| 33 | def11 | def11 | def11 | varchar2(101) |
| 34 | def12 | def12 | def12 | varchar2(101) |
| 35 | def13 | def13 | def13 | varchar2(101) |
| 36 | def14 | def14 | def14 | varchar2(101) |
| 37 | def15 | def15 | def15 | varchar2(101) |
| 38 | def16 | def16 | def16 | varchar2(101) |
| 39 | def17 | def17 | def17 | varchar2(101) |
| 40 | def18 | def18 | def18 | varchar2(101) |
| 41 | def19 | def19 | def19 | varchar2(101) |
| 42 | def20 | def20 | def20 | varchar2(101) |
| 43 | def21 | def21 | def21 | varchar2(101) |
| 44 | def22 | def22 | def22 | varchar2(101) |
| 45 | def23 | def23 | def23 | varchar2(101) |
| 46 | def24 | def24 | def24 | varchar2(101) |
| 47 | def25 | def25 | def25 | varchar2(101) |
| 48 | def26 | def26 | def26 | varchar2(101) |
| 49 | def27 | def27 | def27 | varchar2(101) |
| 50 | def28 | def28 | def28 | varchar2(101) |
| 51 | def29 | def29 | def29 | varchar2(101) |
| 52 | def30 | def30 | def30 | varchar2(101) |
| 53 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 54 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 55 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 56 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 57 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |