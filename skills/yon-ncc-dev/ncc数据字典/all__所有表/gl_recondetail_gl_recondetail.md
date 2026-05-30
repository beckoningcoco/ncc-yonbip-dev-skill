# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8546.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_detail | pk_detail | pk_detail | char(20) | √ |
| 2 | assid | assid | assid | char(20) |
| 3 | creditamount | creditamount | creditamount | number(28, 8) |
| 4 | creditquantity | creditquantity | creditquantity | number(20, 8) |
| 5 | debitamount | debitamount | debitamount | number(28, 8) |
| 6 | debitquantity | debitquantity | debitquantity | number(20, 8) |
| 7 | discardflagv | discardflagv | discardflagv | char(1) |
| 8 | excrate1 | excrate1 | excrate1 | number(15, 8) |
| 9 | excrate2 | excrate2 | excrate2 | number(15, 8) |
| 10 | excrate3 | excrate3 | excrate3 | number(15, 8) |
| 11 | excrate4 | excrate4 | excrate4 | number(15, 8) |
| 12 | explanation | explanation | explanation | varchar2(1000) |
| 13 | fraccreditamount | fraccreditamount | fraccreditamount | number(28, 8) |
| 14 | fracdebitamount | fracdebitamount | fracdebitamount | number(28, 8) |
| 15 | globalcreditamount | globalcreditamount | globalcreditamount | number(28, 8) |
| 16 | globaldebitamount | globaldebitamount | globaldebitamount | number(28, 8) |
| 17 | groupcreditamount | groupcreditamount | groupcreditamount | number(28, 8) |
| 18 | groupdebitamount | groupdebitamount | groupdebitamount | number(28, 8) |
| 19 | localcreditamount | localcreditamount | localcreditamount | number(28, 8) |
| 20 | localdebitamount | localdebitamount | localdebitamount | number(28, 8) |
| 21 | pk_accasoa | pk_accasoa | pk_accasoa | char(20) |
| 22 | pk_accountingbook | pk_accountingbook | pk_accountingbook | char(20) |
| 23 | pk_currtype | pk_currtype | pk_currtype | char(20) |
| 24 | pk_org | pk_org | pk_org | char(20) |
| 25 | pk_org_v | pk_org_v | pk_org_v | char(20) |
| 26 | pk_setofbook | pk_setofbook | pk_setofbook | char(20) |
| 27 | pk_sourcepk | pk_sourcepk | pk_sourcepk | char(20) |
| 28 | pk_voucher | pk_voucher | pk_voucher | char(20) |
| 29 | price | price | price | number(28, 8) |
| 30 | voucherkindv | voucherkindv | voucherkindv | number(38, 0) |
| 31 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 32 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |