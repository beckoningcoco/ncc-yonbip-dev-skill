# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8456.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_contrastdata | pk_contrastdata | pk_contrastdata | varchar2(36) | √ |
| 2 | accountprop | accountprop | accountprop | varchar2(36) |
| 3 | amountequal | amountequal | amountequal | varchar2(1) |
| 4 | assid | assid | assid | varchar2(36) |
| 5 | assidarray | assidarray | assidarray | varchar2(36) |
| 6 | busireconno | busireconno | busireconno | varchar2(60) |
| 7 | checkdate | checkdate | checkdate | char(19) |
| 8 | checkno | checkno | checkno | varchar2(30) |
| 9 | checkstyle | checkstyle | checkstyle | char(20) |
| 10 | convertflag | convertflag | convertflag | char(1) |
| 11 | creditamount | creditamount | creditamount | number(28, 8) |  |  | 0 |
| 12 | creditquantity | creditquantity | creditquantity | number(28, 8) |  |  | 0 |
| 13 | debitamount | debitamount | debitamount | number(28, 8) |  |  | 0 |
| 14 | debitquantity | debitquantity | debitquantity | number(28, 8) |  |  | 0 |
| 15 | detailno | detailno | detailno | number(38, 0) |
| 16 | discardflag | discardflag | discardflag | char(1) |
| 17 | errmessage | errmessage | errmessage | varchar2(60) |
| 18 | explanation | explanation | explanation | varchar2(1000) |
| 19 | globalcreditamount | globalcreditamount | globalcreditamount | number(28, 8) |  |  | 0 |
| 20 | globaldebitamount | globaldebitamount | globaldebitamount | number(28, 8) |  |  | 0 |
| 21 | groupcreditamount | groupcreditamount | groupcreditamount | number(28, 8) |  |  | 0 |
| 22 | groupdebitamount | groupdebitamount | groupdebitamount | number(28, 8) |  |  | 0 |
| 23 | innerbusdate | innerbusdate | innerbusdate | char(19) |
| 24 | innerbusno | innerbusno | innerbusno | varchar2(60) |
| 25 | iscontrasted | iscontrasted | iscontrasted | char(1) |
| 26 | isinit | isinit | isinit | char(1) |
| 27 | isreconcile | isreconcile | isreconcile | varchar2(1) |
| 28 | localcreditamount | localcreditamount | localcreditamount | number(28, 8) |  |  | 0 |
| 29 | localdebitamount | localdebitamount | localdebitamount | number(28, 8) |  |  | 0 |
| 30 | periodv | periodv | periodv | varchar2(2) |
| 31 | pk_accasoa | pk_accasoa | pk_accasoa | varchar2(36) |
| 32 | pk_accountingbook | pk_accountingbook | pk_accountingbook | varchar2(36) |  |  | '~' |
| 33 | pk_checked | pk_checked | pk_checked | varchar2(36) |
| 34 | pk_contrastrule | pk_contrastrule | pk_contrastrule | varchar2(36) |
| 35 | pk_corpcontrast | pk_corpcontrast | pk_corpcontrast | varchar2(36) |
| 36 | pk_currtype | pk_currtype | pk_currtype | char(20) |
| 37 | pk_customer | pk_customer | pk_customer | char(20) |
| 38 | pk_detail | pk_detail | pk_detail | varchar2(36) | √ |
| 39 | pk_group | pk_group | pk_group | varchar2(36) |
| 40 | pk_innerorg | pk_innerorg | pk_innerorg | varchar2(36) |
| 41 | pk_innersob | pk_innersob | pk_innersob | varchar2(36) |
| 42 | pk_managerv | pk_managerv | pk_managerv | varchar2(36) |
| 43 | pk_org | pk_org | pk_org | char(20) |
| 44 | pk_othercorp | pk_othercorp | pk_othercorp | varchar2(36) |
| 45 | pk_otherorgbook | pk_otherorgbook | pk_otherorgbook | varchar2(36) |
| 46 | pk_prepared | pk_prepared | pk_prepared | varchar2(36) |
| 47 | pk_reconcilerule | pk_reconcilerule | pk_reconcilerule | varchar2(36) |
| 48 | pk_setofbook | pk_setofbook | pk_setofbook | varchar2(36) |
| 49 | pk_sourcepk | pk_sourcepk | pk_sourcepk | varchar2(36) |
| 50 | pk_system | pk_system | pk_system | varchar2(36) |
| 51 | pk_voucher | pk_voucher | pk_voucher | varchar2(36) |
| 52 | pk_vouchertypev | pk_vouchertypev | pk_vouchertypev | varchar2(36) |
| 53 | prepareddatev | prepareddatev | prepareddatev | char(19) |
| 54 | price | price | price | number(28, 8) |
| 55 | quantityequal | quantityequal | quantityequal | varchar2(1) |
| 56 | totalcredit | totalcredit | totalcredit | number(28, 8) |
| 57 | totaldebit | totaldebit | totaldebit | number(28, 8) |
| 58 | voucherkind | voucherkind | voucherkind | number(38, 0) |
| 59 | voucherno | voucherno | voucherno | number(38, 0) |
| 60 | vouchexplanation | vouchexplanation | vouchexplanation | varchar2(1000) |
| 61 | yearinit | yearinit | yearinit | char(1) |
| 62 | yearv | yearv | yearv | varchar2(4) |
| 63 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 64 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |