# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8179.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_batmquotadetail | pk_batmquotadetail | pk_batmquotadetail | char(50) | √ |
| 2 | batmquotatype | batmquotatype | batmquotatype | varchar2(20) |
| 3 | billmoney | billmoney | billmoney | number(28, 8) |
| 4 | billtype | billtype | billtype | varchar2(20) |
| 5 | businessdate | businessdate | businessdate | char(19) |
| 6 | downquotaflag | downquotaflag | downquotaflag | char(1) |
| 7 | enddate | enddate | enddate | char(19) |
| 8 | issuedate | issuedate | issuedate | char(19) |
| 9 | note_no | note_no | note_no | varchar2(50) |
| 10 | occunitquota | occunitquota | occunitquota | number(28, 8) |
| 11 | occusharequota | occusharequota | occusharequota | number(28, 8) |
| 12 | pk_banktype | pk_banktype | pk_banktype | varchar2(20) |  |  | '~' |
| 13 | pk_bill | pk_bill | pk_bill | varchar2(50) |
| 14 | pk_billtype | pk_billtype | pk_billtype | varchar2(50) |
| 15 | pk_curr | pk_curr | pk_curr | varchar2(20) |  |  | '~' |
| 16 | pk_fundorg | pk_fundorg | pk_fundorg | varchar2(20) |  |  | '~' |
| 17 | pk_fundorg_v | pk_fundorg_v | pk_fundorg_v | varchar2(20) |  |  | '~' |
| 18 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 19 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 20 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 21 | pk_register | pk_register | pk_register | varchar2(20) |  |  | '~' |
| 22 | releassharequota | releassharequota | releassharequota | number(28, 8) |
| 23 | releasunitquota | releasunitquota | releasunitquota | number(28, 8) |
| 24 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 25 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 26 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 27 | saga_status | saga_status | saga_status | number(38, 0) |
| 28 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 29 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |