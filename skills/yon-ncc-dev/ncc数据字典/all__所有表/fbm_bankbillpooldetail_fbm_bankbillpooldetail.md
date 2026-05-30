# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8178.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bankbillpooldetail | pk_bankbillpooldetail | pk_bankbillpooldetail | char(20) | √ |
| 2 | billmoney | billmoney | billmoney | number(28, 8) |
| 3 | billpooltype | billpooltype | billpooltype | varchar2(20) |
| 4 | direction | direction | direction | char(1) |
| 5 | enddate | enddate | enddate | char(19) |
| 6 | note_no | note_no | note_no | varchar2(50) |
| 7 | pk_banktype | pk_banktype | pk_banktype | varchar2(20) |  |  | '~' |
| 8 | pk_bill | pk_bill | pk_bill | varchar2(20) |
| 9 | pk_billtype | pk_billtype | pk_billtype | varchar2(20) |
| 10 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(50) |
| 11 | pk_currency | pk_currency | pk_currency | varchar2(20) |  |  | '~' |
| 12 | pk_finorg | pk_finorg | pk_finorg | varchar2(20) |  |  | '~' |
| 13 | pk_finorg_v | pk_finorg_v | pk_finorg_v | varchar2(20) |  |  | '~' |
| 14 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 15 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 16 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 17 | pk_register | pk_register | pk_register | varchar2(20) |  |  | '~' |
| 18 | pledgerate | pledgerate | pledgerate | number(28, 8) |
| 19 | pooldate | pooldate | pooldate | char(19) |
| 20 | vbillno | vbillno | vbillno | varchar2(50) |
| 21 | def1 | def1 | def1 | varchar2(101) |
| 22 | def2 | def2 | def2 | varchar2(101) |
| 23 | def3 | def3 | def3 | varchar2(101) |
| 24 | def4 | def4 | def4 | varchar2(101) |
| 25 | def5 | def5 | def5 | varchar2(101) |
| 26 | def6 | def6 | def6 | varchar2(101) |
| 27 | def7 | def7 | def7 | varchar2(101) |
| 28 | def8 | def8 | def8 | varchar2(101) |
| 29 | def9 | def9 | def9 | varchar2(101) |
| 30 | def10 | def10 | def10 | varchar2(101) |
| 31 | def11 | def11 | def11 | varchar2(101) |
| 32 | def12 | def12 | def12 | varchar2(101) |
| 33 | def13 | def13 | def13 | varchar2(101) |
| 34 | def14 | def14 | def14 | varchar2(101) |
| 35 | def15 | def15 | def15 | varchar2(101) |
| 36 | def16 | def16 | def16 | varchar2(101) |
| 37 | def17 | def17 | def17 | varchar2(101) |
| 38 | def18 | def18 | def18 | varchar2(101) |
| 39 | def19 | def19 | def19 | varchar2(101) |
| 40 | def20 | def20 | def20 | varchar2(101) |
| 41 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 42 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |