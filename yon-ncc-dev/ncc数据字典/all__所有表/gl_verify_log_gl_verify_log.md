# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8584.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_verify_log | pk_verify_log | pk_verify_log | char(20) | √ |
| 2 | batchno | batchno | batchno | char(20) |
| 3 | businessdate | businessdate | businessdate | char(19) |
| 4 | bybusinessdate | bybusinessdate | bybusinessdate | char(19) |
| 5 | byvoucherdate | byvoucherdate | byvoucherdate | char(19) |
| 6 | clid | clid | clid | number(38, 0) |
| 7 | detailindex | detailindex | detailindex | number(38, 0) |
| 8 | itype | itype | itype | number(38, 0) |
| 9 | opdate | opdate | opdate | char(19) |
| 10 | operator | operator | operator | char(20) |
| 11 | pk_accountingbook | pk_accountingbook | pk_accountingbook | varchar2(50) |
| 12 | pk_detail | pk_detail | pk_detail | char(20) |
| 13 | pk_detail1 | pk_detail1 | pk_detail1 | char(20) |
| 14 | pk_group | pk_group | pk_group | varchar2(50) | √ |
| 15 | pk_org | pk_org | pk_org | varchar2(50) |
| 16 | pk_setofbook | pk_setofbook | pk_setofbook | char(20) |
| 17 | pk_verifydetail | pk_verifydetail | pk_verifydetail | char(20) |
| 18 | pk_verifydetail1 | pk_verifydetail1 | pk_verifydetail1 | char(20) |
| 19 | pk_verifyobj | pk_verifyobj | pk_verifyobj | char(20) |
| 20 | pk_verifyobj1 | pk_verifyobj1 | pk_verifyobj1 | varchar2(50) |
| 21 | pk_voucher | pk_voucher | pk_voucher | char(20) |
| 22 | pk_voucher1 | pk_voucher1 | pk_voucher1 | char(20) |
| 23 | verifycreditamount | verifycreditamount | verifycreditamount | number(28, 8) |
| 24 | verifycreditquantity | verifycreditquantity | verifycreditquantity | number(20, 8) |
| 25 | verifydebitamount | verifydebitamount | verifydebitamount | number(28, 8) |
| 26 | verifydebitquantity | verifydebitquantity | verifydebitquantity | number(20, 8) |
| 27 | verifyfraccreditamount | verifyfraccreditamount | verifyfraccreditamount | number(28, 8) |
| 28 | verifyfracdebitamount | verifyfracdebitamount | verifyfracdebitamount | number(28, 8) |
| 29 | verifyglobalcreditamount | verifyglobalcreditamount | verifyglobalcreditamount | number(28, 8) |
| 30 | verifyglobaldebitamount | verifyglobaldebitamount | verifyglobaldebitamount | number(28, 8) |
| 31 | verifygroupcreditamount | verifygroupcreditamount | verifygroupcreditamount | number(28, 8) |
| 32 | verifygroupdebitamount | verifygroupdebitamount | verifygroupdebitamount | number(28, 8) |
| 33 | verifylocalcreditamount | verifylocalcreditamount | verifylocalcreditamount | number(28, 8) |
| 34 | verifylocaldebitamount | verifylocaldebitamount | verifylocaldebitamount | number(28, 8) |
| 35 | voucherdate | voucherdate | voucherdate | char(19) |
| 36 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 37 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |