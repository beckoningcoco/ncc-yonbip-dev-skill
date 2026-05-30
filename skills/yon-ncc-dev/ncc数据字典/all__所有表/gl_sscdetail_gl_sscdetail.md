# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8560.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_detail | pk_detail | pk_detail | char(20) | √ |
| 2 | assid | assid | assid | varchar2(20) |
| 3 | creditamount | creditamount | creditamount | number(28, 8) |
| 4 | creditquantity | creditquantity | creditquantity | number(28, 8) |
| 5 | debitamount | debitamount | debitamount | number(28, 8) |
| 6 | debitquantity | debitquantity | debitquantity | number(28, 8) |
| 7 | detailindex | detailindex | detailindex | number(38, 0) |
| 8 | direction | direction | direction | varchar2(1) |
| 9 | excrate1 | excrate1 | excrate1 | number(15, 8) |
| 10 | excrate2 | excrate2 | excrate2 | number(15, 8) |
| 11 | excrate3 | excrate3 | excrate3 | number(15, 8) |
| 12 | explanation | explanation | explanation | varchar2(400) |
| 13 | globalcreditamount | globalcreditamount | globalcreditamount | number(28, 8) |
| 14 | globaldebitamount | globaldebitamount | globaldebitamount | number(28, 8) |
| 15 | groupcreditamount | groupcreditamount | groupcreditamount | number(28, 8) |
| 16 | groupdebitamount | groupdebitamount | groupdebitamount | number(28, 8) |
| 17 | localcreditamount | localcreditamount | localcreditamount | number(28, 8) |
| 18 | localdebitamount | localdebitamount | localdebitamount | number(28, 8) |
| 19 | pk_accasoa | pk_accasoa | pk_accasoa | varchar2(20) |  |  | '~' |
| 20 | pk_accountingbook | pk_accountingbook | pk_accountingbook | varchar2(20) |  |  | '~' |
| 21 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 22 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 23 | pk_liabilitycenter | pk_liabilitycenter | pk_liabilitycenter | varchar2(20) |  |  | '~' |
| 24 | pk_liabilitycenter_v | pk_liabilitycenter_v | pk_liabilitycenter_v | varchar2(20) |  |  | '~' |
| 25 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 26 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 27 | pk_setofbook | pk_setofbook | pk_setofbook | varchar2(20) |  |  | '~' |
| 28 | pk_unit | pk_unit | pk_unit | varchar2(20) |  |  | '~' |
| 29 | pk_unit_v | pk_unit_v | pk_unit_v | varchar2(20) |  |  | '~' |
| 30 | pk_voucher | pk_voucher | pk_voucher | char(20) | √ |
| 31 | price | price | price | number(28, 8) |
| 32 | def1 | def1 | def1 | varchar2(101) |
| 33 | def2 | def2 | def2 | varchar2(101) |
| 34 | def3 | def3 | def3 | varchar2(101) |
| 35 | def4 | def4 | def4 | varchar2(101) |
| 36 | def5 | def5 | def5 | varchar2(101) |
| 37 | def6 | def6 | def6 | varchar2(101) |
| 38 | def7 | def7 | def7 | varchar2(101) |
| 39 | def8 | def8 | def8 | varchar2(101) |
| 40 | def9 | def9 | def9 | varchar2(101) |
| 41 | def10 | def10 | def10 | varchar2(101) |
| 42 | def11 | def11 | def11 | varchar2(101) |
| 43 | def12 | def12 | def12 | varchar2(101) |
| 44 | def13 | def13 | def13 | varchar2(101) |
| 45 | def14 | def14 | def14 | varchar2(101) |
| 46 | def15 | def15 | def15 | varchar2(101) |
| 47 | def16 | def16 | def16 | varchar2(101) |
| 48 | def17 | def17 | def17 | varchar2(101) |
| 49 | def18 | def18 | def18 | varchar2(101) |
| 50 | def19 | def19 | def19 | varchar2(101) |
| 51 | def20 | def20 | def20 | varchar2(300) |
| 52 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 53 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |