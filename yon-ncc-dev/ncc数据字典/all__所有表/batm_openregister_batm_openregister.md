# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6633.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_openregister | pk_openregister | pk_openregister | char(20) | √ |
| 2 | arrivalamount | arrivalamount | arrivalamount | number(28, 8) |
| 3 | billdate | billdate | billdate | char(19) |
| 4 | commitamount | commitamount | commitamount | number(28, 8) |
| 5 | glclcamount | glclcamount | glclcamount | number(28, 8) |
| 6 | gllclcamount | gllclcamount | gllclcamount | number(28, 8) |
| 7 | guaranteeamont | guaranteeamont | guaranteeamont | number(28, 8) |
| 8 | guaranteetype | guaranteetype | guaranteetype | number(38, 0) |
| 9 | isdocubills | isdocubills | isdocubills | char(1) |
| 10 | lcamount | lcamount | lcamount | number(28, 8) |
| 11 | lcbalance | lcbalance | lcbalance | number(28, 8) |
| 12 | lcno | lcno | lcno | varchar2(50) |
| 13 | lcstatus | lcstatus | lcstatus | varchar2(50) |
| 14 | olclcamount | olclcamount | olclcamount | number(28, 8) |
| 15 | pay | pay | pay | number(28, 8) |
| 16 | paytype | paytype | paytype | number(38, 0) |
| 17 | pk_bank_issuing | pk_bank_issuing | pk_bank_issuing | varchar2(50) |
| 18 | pk_billtype | pk_billtype | pk_billtype | varchar2(50) |
| 19 | pk_busipersion | pk_busipersion | pk_busipersion | varchar2(50) |
| 20 | pk_cccurrtype | pk_cccurrtype | pk_cccurrtype | varchar2(20) |  |  | '~' |
| 21 | pk_dept | pk_dept | pk_dept | varchar2(50) |
| 22 | pk_group | pk_group | pk_group | varchar2(50) |
| 23 | pk_guacurrtype | pk_guacurrtype | pk_guacurrtype | varchar2(50) |
| 24 | pk_lccurrtype | pk_lccurrtype | pk_lccurrtype | varchar2(20) |  |  | '~' |
| 25 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 26 | pk_org_v | pk_org_v | pk_org_v | varchar2(50) |
| 27 | pk_pledgecurr | pk_pledgecurr | pk_pledgecurr | varchar2(20) |  |  | '~' |
| 28 | pk_supplier | pk_supplier | pk_supplier | varchar2(50) |
| 29 | pledgeamount | pledgeamount | pledgeamount | number(28, 8) |
| 30 | term | term | term | number(38, 0) |
| 31 | type | type | type | number(38, 0) |
| 32 | useccamount | useccamount | useccamount | number(28, 8) |
| 33 | validdate | validdate | validdate | char(19) |
| 34 | vbillno | vbillno | vbillno | varchar2(50) |
| 35 | vbillstatus | vbillstatus | vbillstatus | varchar2(50) |
| 36 | def1 | def1 | def1 | varchar2(50) |
| 37 | def2 | def2 | def2 | varchar2(50) |
| 38 | def3 | def3 | def3 | varchar2(50) |
| 39 | def4 | def4 | def4 | varchar2(50) |
| 40 | def5 | def5 | def5 | varchar2(50) |
| 41 | def6 | def6 | def6 | varchar2(50) |
| 42 | def7 | def7 | def7 | varchar2(50) |
| 43 | def8 | def8 | def8 | varchar2(50) |
| 44 | def9 | def9 | def9 | varchar2(50) |
| 45 | def10 | def10 | def10 | varchar2(50) |
| 46 | def11 | def11 | def11 | varchar2(50) |
| 47 | def12 | def12 | def12 | varchar2(50) |
| 48 | def13 | def13 | def13 | varchar2(50) |
| 49 | def14 | def14 | def14 | varchar2(50) |
| 50 | def15 | def15 | def15 | varchar2(50) |
| 51 | def16 | def16 | def16 | varchar2(50) |
| 52 | def17 | def17 | def17 | varchar2(50) |
| 53 | def18 | def18 | def18 | varchar2(50) |
| 54 | def19 | def19 | def19 | varchar2(50) |
| 55 | def20 | def20 | def20 | varchar2(50) |
| 56 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 57 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |