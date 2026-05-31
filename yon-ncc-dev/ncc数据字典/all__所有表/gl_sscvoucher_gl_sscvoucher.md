# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8561.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_voucher | pk_voucher | pk_voucher | char(20) | √ |
| 2 | approvedate | approvedate | approvedate | char(19) |
| 3 | approvenote | approvenote | approvenote | varchar2(200) |
| 4 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 5 | approvestatus | approvestatus | approvestatus | number(38, 0) |
| 6 | billdate | billdate | billdate | char(19) |
| 7 | billno | billno | billno | varchar2(20) |
| 8 | billstatus | billstatus | billstatus | number(38, 0) |
| 9 | explanation | explanation | explanation | varchar2(400) |
| 10 | period | period | period | varchar2(2) |
| 11 | pk_accountingbook | pk_accountingbook | pk_accountingbook | varchar2(20) |  |  | '~' |
| 12 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(20) |
| 13 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |  |  | '~' |
| 14 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 15 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 16 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 17 | pk_prepared | pk_prepared | pk_prepared | varchar2(20) |  |  | '~' |
| 18 | pk_setofbook | pk_setofbook | pk_setofbook | varchar2(20) |  |  | '~' |
| 19 | pk_tradetypecode | pk_tradetypecode | pk_tradetypecode | varchar2(20) |
| 20 | pk_tradetypeid | pk_tradetypeid | pk_tradetypeid | varchar2(20) |  |  | '~' |
| 21 | pk_vouchertype | pk_vouchertype | pk_vouchertype | varchar2(20) |  |  | '~' |
| 22 | prepareddate | prepareddate | prepareddate | char(19) |
| 23 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 24 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) | √ |  | 0 |
| 25 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 26 | saga_status | saga_status | saga_status | number(38, 0) | √ |  | 0 |
| 27 | totalcredit | totalcredit | totalcredit | number(28, 8) |
| 28 | totalcreditglobal | totalcreditglobal | totalcreditglobal | number(28, 8) |
| 29 | totalcreditgroup | totalcreditgroup | totalcreditgroup | number(28, 8) |
| 30 | totaldebit | totaldebit | totaldebit | number(28, 8) |
| 31 | totaldebitglobal | totaldebitglobal | totaldebitglobal | number(28, 8) |
| 32 | totaldebitgroup | totaldebitgroup | totaldebitgroup | number(28, 8) |
| 33 | year | year | year | varchar2(4) |
| 34 | def1 | def1 | def1 | varchar2(101) |
| 35 | def2 | def2 | def2 | varchar2(101) |
| 36 | def3 | def3 | def3 | varchar2(101) |
| 37 | def4 | def4 | def4 | varchar2(101) |
| 38 | def5 | def5 | def5 | varchar2(101) |
| 39 | def6 | def6 | def6 | varchar2(101) |
| 40 | def7 | def7 | def7 | varchar2(101) |
| 41 | def8 | def8 | def8 | varchar2(101) |
| 42 | def9 | def9 | def9 | varchar2(101) |
| 43 | def10 | def10 | def10 | varchar2(101) |
| 44 | def11 | def11 | def11 | varchar2(101) |
| 45 | def12 | def12 | def12 | varchar2(101) |
| 46 | def13 | def13 | def13 | varchar2(101) |
| 47 | def14 | def14 | def14 | varchar2(101) |
| 48 | def15 | def15 | def15 | varchar2(101) |
| 49 | def16 | def16 | def16 | varchar2(101) |
| 50 | def17 | def17 | def17 | varchar2(101) |
| 51 | def18 | def18 | def18 | varchar2(101) |
| 52 | def19 | def19 | def19 | varchar2(101) |
| 53 | def20 | def20 | def20 | varchar2(101) |
| 54 | creationtime | creationtime | creationtime | char(19) |
| 55 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 56 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 57 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 58 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 59 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |