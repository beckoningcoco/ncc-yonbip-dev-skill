# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8451.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_commondetail | pk_commondetail | pk_commondetail | char(20) | √ |
| 2 | assid | assid | assid | char(20) |
| 3 | bankaccount | bankaccount | bankaccount | char(20) |
| 4 | billtype | billtype | billtype | char(20) |
| 5 | checkdate | checkdate | checkdate | char(19) |
| 6 | checkno | checkno | checkno | char(30) |
| 7 | checkstyle | checkstyle | checkstyle | char(20) |
| 8 | contrastflag | contrastflag | contrastflag | number(38, 0) |
| 9 | creditamount | creditamount | creditamount | number(28, 8) |
| 10 | creditquantity | creditquantity | creditquantity | number(20, 8) |
| 11 | debitamount | debitamount | debitamount | number(28, 8) |
| 12 | debitquantity | debitquantity | debitquantity | number(20, 8) |
| 13 | detailindex | detailindex | detailindex | number(38, 0) |
| 14 | errmessage | errmessage | errmessage | varchar2(90) |
| 15 | excrate1 | excrate1 | excrate1 | number(15, 8) |
| 16 | excrate2 | excrate2 | excrate2 | number(15, 8) |
| 17 | excrate3 | excrate3 | excrate3 | number(15, 8) |
| 18 | excrate4 | excrate4 | excrate4 | number(15, 8) |
| 19 | explanation | explanation | explanation | varchar2(1000) |
| 20 | exratedate2 | exratedate2 | exratedate2 | char(19) |
| 21 | fraccreditamount | fraccreditamount | fraccreditamount | number(28, 8) |
| 22 | fracdebitamount | fracdebitamount | fracdebitamount | number(28, 8) |
| 23 | globalcreditamount | globalcreditamount | globalcreditamount | number(28, 8) |
| 24 | globaldebitamount | globaldebitamount | globaldebitamount | number(28, 8) |
| 25 | groupcreditamount | groupcreditamount | groupcreditamount | number(28, 8) |
| 26 | groupdebitamount | groupdebitamount | groupdebitamount | number(28, 8) |
| 27 | localcreditamount | localcreditamount | localcreditamount | number(28, 8) |
| 28 | localdebitamount | localdebitamount | localdebitamount | number(28, 8) |
| 29 | modifyflag | modifyflag | modifyflag | varchar2(50) |
| 30 | oppositesubj | oppositesubj | oppositesubj | varchar2(200) |
| 31 | pk_accasoa | pk_accasoa | pk_accasoa | char(20) |
| 32 | pk_accountingbook | pk_accountingbook | pk_accountingbook | char(20) |
| 33 | pk_commonvoucher | pk_commonvoucher | pk_commonvoucher | char(20) |
| 34 | pk_currtype | pk_currtype | pk_currtype | char(20) |
| 35 | pk_exratescheme2 | pk_exratescheme2 | pk_exratescheme2 | varchar2(20) |
| 36 | pk_group | pk_group | pk_group | char(20) |
| 37 | pk_liabilitycenter | pk_liabilitycenter | pk_liabilitycenter | varchar2(20) |
| 38 | pk_liabilitycenter_v | pk_liabilitycenter_v | pk_liabilitycenter_v | varchar2(20) |
| 39 | pk_org | pk_org | pk_org | char(20) |
| 40 | pk_setofbook | pk_setofbook | pk_setofbook | char(20) |
| 41 | pk_unit | pk_unit | pk_unit | varchar2(20) |
| 42 | price | price | price | number(28, 8) |
| 43 | recieptclass | recieptclass | recieptclass | varchar2(60) |
| 44 | setofbookcreditamount | setofbookcreditamount | setofbookcreditamount | number(28, 8) |
| 45 | setofbookdebitamount | setofbookdebitamount | setofbookdebitamount | number(28, 8) |
| 46 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 47 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |