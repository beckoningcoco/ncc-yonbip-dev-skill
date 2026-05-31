# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8434.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | accountcode | accountcode | accountcode | varchar2(40) |
| 2 | adjustperiod | adjustperiod | adjustperiod | varchar2(3) |
| 3 | assid | assid | assid | char(20) |
| 4 | creditamount | creditamount | creditamount | number(28, 8) |
| 5 | creditquantity | creditquantity | creditquantity | number(20, 8) |
| 6 | debitamount | debitamount | debitamount | number(28, 8) |
| 7 | debitquantity | debitquantity | debitquantity | number(20, 8) |
| 8 | fraccreditamount | fraccreditamount | fraccreditamount | number(28, 8) |
| 9 | fracdebitamount | fracdebitamount | fracdebitamount | number(28, 8) |
| 10 | globalcreditamount | globalcreditamount | globalcreditamount | number(28, 8) |
| 11 | globaldebitamount | globaldebitamount | globaldebitamount | number(28, 8) |
| 12 | groupcreditamount | groupcreditamount | groupcreditamount | number(28, 8) |
| 13 | groupdebitamount | groupdebitamount | groupdebitamount | number(28, 8) |
| 14 | localcreditamount | localcreditamount | localcreditamount | number(28, 8) |
| 15 | localdebitamount | localdebitamount | localdebitamount | number(28, 8) |
| 16 | period | period | period | char(2) |
| 17 | pk_accasoa | pk_accasoa | pk_accasoa | char(20) |
| 18 | pk_accchart | pk_accchart | pk_accchart | varchar2(20) |
| 19 | pk_account | pk_account | pk_account | varchar2(20) |
| 20 | pk_accountingbook | pk_accountingbook | pk_accountingbook | char(20) |
| 21 | pk_balance | pk_balance | pk_balance | char(20) | √ |
| 22 | pk_currtype | pk_currtype | pk_currtype | char(20) |
| 23 | pk_group | pk_group | pk_group | char(20) |
| 24 | pk_liabilitycenter | pk_liabilitycenter | pk_liabilitycenter | varchar2(20) | √ |  | '~' |
| 25 | pk_org | pk_org | pk_org | char(20) |
| 26 | pk_org_v | pk_org_v | pk_org_v | char(20) |
| 27 | pk_setofbook | pk_setofbook | pk_setofbook | char(20) |
| 28 | pk_unit | pk_unit | pk_unit | char(20) |
| 29 | setofbookcreditamount | setofbookcreditamount | setofbookcreditamount | number(28, 8) | √ |  | 0 |
| 30 | setofbookdebitamount | setofbookdebitamount | setofbookdebitamount | number(28, 8) | √ |  | 0 |
| 31 | voucherkind | voucherkind | voucherkind | number(38, 0) |
| 32 | year | year | year | char(4) |
| 33 | free1 | free1 | free1 | varchar2(60) |
| 34 | free2 | free2 | free2 | varchar2(60) |
| 35 | free3 | free3 | free3 | varchar2(60) |
| 36 | free4 | free4 | free4 | varchar2(60) |
| 37 | free5 | free5 | free5 | varchar2(60) |
| 38 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 39 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |