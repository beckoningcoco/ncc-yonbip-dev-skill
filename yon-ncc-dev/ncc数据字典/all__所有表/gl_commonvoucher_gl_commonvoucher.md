# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8452.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_commonvoucher | pk_commonvoucher | pk_commonvoucher | char(20) | √ |
| 2 | addclass | addclass | addclass | varchar2(60) |
| 3 | attachment | attachment | attachment | number(38, 0) |
| 4 | commoncode | commoncode | commoncode | varchar2(20) |
| 5 | commonsummary | commonsummary | commonsummary | char(200) |
| 6 | deleteclass | deleteclass | deleteclass | varchar2(60) |
| 7 | detailmodflag | detailmodflag | detailmodflag | char(1) |
| 8 | discardflag | discardflag | discardflag | char(1) |
| 9 | errmessage | errmessage | errmessage | varchar2(90) |
| 10 | explanation | explanation | explanation | varchar2(1000) |
| 11 | exratedate2 | exratedate2 | exratedate2 | char(19) |
| 12 | isdifflag | isdifflag | isdifflag | char(1) |
| 13 | ispublic | ispublic | ispublic | char(1) |
| 14 | modifyclass | modifyclass | modifyclass | varchar2(60) |
| 15 | modifyflag | modifyflag | modifyflag | char(20) |
| 16 | num | num | num | number(38, 0) |
| 17 | period | period | period | char(2) |
| 18 | pk_accountingbook | pk_accountingbook | pk_accountingbook | char(20) |
| 19 | pk_casher | pk_casher | pk_casher | char(20) |
| 20 | pk_checked | pk_checked | pk_checked | char(20) |
| 21 | pk_commnvclass | pk_commnvclass | pk_commnvclass | char(20) |
| 22 | pk_exratescheme2 | pk_exratescheme2 | pk_exratescheme2 | varchar2(20) |
| 23 | pk_group | pk_group | pk_group | varchar2(50) |
| 24 | pk_manager | pk_manager | pk_manager | char(20) |
| 25 | pk_org | pk_org | pk_org | char(20) |
| 26 | pk_prepared | pk_prepared | pk_prepared | char(20) |
| 27 | pk_setofbook | pk_setofbook | pk_setofbook | char(20) |
| 28 | pk_system | pk_system | pk_system | char(20) |
| 29 | pk_user | pk_user | pk_user | char(20) |
| 30 | pk_vouchertype | pk_vouchertype | pk_vouchertype | char(20) |
| 31 | prepareddate | prepareddate | prepareddate | char(19) |
| 32 | signflag | signflag | signflag | char(1) |
| 33 | tallydate | tallydate | tallydate | char(19) |
| 34 | totalcredit | totalcredit | totalcredit | number(28, 8) |
| 35 | totalcreditglobal | totalcreditglobal | totalcreditglobal | number(28, 8) |
| 36 | totalcreditgroup | totalcreditgroup | totalcreditgroup | number(28, 8) |
| 37 | totalcreditsetofbook | totalcreditsetofbook | totalcreditsetofbook | number(28, 8) |
| 38 | totaldebit | totaldebit | totaldebit | number(28, 8) |
| 39 | totaldebitglobal | totaldebitglobal | totaldebitglobal | number(28, 8) |
| 40 | totaldebitgroup | totaldebitgroup | totaldebitgroup | number(28, 8) |
| 41 | totaldebitsetofbook | totaldebitsetofbook | totaldebitsetofbook | number(28, 8) |
| 42 | voucherkind | voucherkind | voucherkind | number(38, 0) |
| 43 | year | year | year | char(4) |
| 44 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 45 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |