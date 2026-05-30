# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8586.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_voucher | pk_voucher | pk_voucher | char(20) | √ |
| 2 | acctype | acctype | acctype | number(38, 0) |
| 3 | addclass | addclass | addclass | varchar2(60) |
| 4 | adjustperiod | adjustperiod | adjustperiod | varchar2(3) |  |  | '~' |
| 5 | approver | approver | approver | varchar2(20) |
| 6 | attachment | attachment | attachment | number(38, 0) |
| 7 | billmaker | billmaker | billmaker | varchar2(20) |
| 8 | bug_totalcredit | bug_totalcredit | bug_totalcredit | number(28, 8) |
| 9 | bug_totaldebit | bug_totaldebit | bug_totaldebit | number(28, 8) |
| 10 | checkeddate | checkeddate | checkeddate | char(19) |
| 11 | contrastflag | contrastflag | contrastflag | number(38, 0) |
| 12 | convertflag | convertflag | convertflag | char(1) |
| 13 | cw_totalcredit | cw_totalcredit | cw_totalcredit | number(28, 8) |
| 14 | cw_totaldebit | cw_totaldebit | cw_totaldebit | number(28, 8) |
| 15 | deleteclass | deleteclass | deleteclass | varchar2(60) |
| 16 | detailmodflag | detailmodflag | detailmodflag | char(1) |
| 17 | difftype | difftype | difftype | number(38, 0) |
| 18 | discardflag | discardflag | discardflag | char(1) |
| 19 | errmessage | errmessage | errmessage | varchar2(60) |  |  | '~' |
| 20 | errmessageh | errmessageh | errmessageh | varchar2(90) |
| 21 | explanation | explanation | explanation | varchar2(1000) |
| 22 | exratedate2 | exratedate2 | exratedate2 | char(19) |
| 23 | isdifflag | isdifflag | isdifflag | char(1) |
| 24 | modifyclass | modifyclass | modifyclass | varchar2(60) |
| 25 | modifyflag | modifyflag | modifyflag | char(20) |
| 26 | num | num | num | number(38, 0) |
| 27 | offervoucher | offervoucher | offervoucher | varchar2(20) |
| 28 | period | period | period | char(2) | √ |  | '~' |
| 29 | pk_accountingbook | pk_accountingbook | pk_accountingbook | char(20) | √ |  | '~' |
| 30 | pk_casher | pk_casher | pk_casher | varchar2(20) |  |  | '~' |
| 31 | pk_checked | pk_checked | pk_checked | varchar2(20) |  |  | '~' |
| 32 | pk_exratescheme2 | pk_exratescheme2 | pk_exratescheme2 | varchar2(20) |
| 33 | pk_group | pk_group | pk_group | char(20) |
| 34 | pk_manager | pk_manager | pk_manager | varchar2(20) |
| 35 | pk_org | pk_org | pk_org | char(20) |
| 36 | pk_org_v | pk_org_v | pk_org_v | char(20) |
| 37 | pk_prepared | pk_prepared | pk_prepared | char(20) | √ |
| 38 | pk_setofbook | pk_setofbook | pk_setofbook | char(20) |
| 39 | pk_sourcepk | pk_sourcepk | pk_sourcepk | varchar2(20) |
| 40 | pk_system | pk_system | pk_system | char(20) |
| 41 | pk_vouchertype | pk_vouchertype | pk_vouchertype | char(20) | √ |  | '~' |
| 42 | preaccountflag | preaccountflag | preaccountflag | char(1) |  |  | 'N' |
| 43 | prepareddate | prepareddate | prepareddate | char(19) | √ |  | '~' |
| 44 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 45 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |  |  | 0 |
| 46 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 47 | saga_status | saga_status | saga_status | number(38, 0) |  |  | 0 |
| 48 | signdate | signdate | signdate | char(19) |
| 49 | signflag | signflag | signflag | char(1) |
| 50 | tallydate | tallydate | tallydate | char(19) |
| 51 | tempsaveflag | tempsaveflag | tempsaveflag | char(1) |  |  | 'N' |
| 52 | totalcredit | totalcredit | totalcredit | number(28, 8) |
| 53 | totalcreditglobal | totalcreditglobal | totalcreditglobal | number(28, 8) |  |  | 0 |
| 54 | totalcreditgroup | totalcreditgroup | totalcreditgroup | number(28, 8) |  |  | 0 |
| 55 | totalcreditsetofbook | totalcreditsetofbook | totalcreditsetofbook | number(28, 8) |  |  | 0 |
| 56 | totaldebit | totaldebit | totaldebit | number(28, 8) |
| 57 | totaldebitglobal | totaldebitglobal | totaldebitglobal | number(28, 8) |  |  | 0 |
| 58 | totaldebitgroup | totaldebitgroup | totaldebitgroup | number(28, 8) |  |  | 0 |
| 59 | totaldebitsetofbook | totaldebitsetofbook | totaldebitsetofbook | number(28, 8) |  |  | 0 |
| 60 | voucherkind | voucherkind | voucherkind | number(38, 0) |
| 61 | year | year | year | char(4) | √ |  | '~' |
| 62 | free1 | free1 | free1 | varchar2(60) |
| 63 | free2 | free2 | free2 | varchar2(60) |
| 64 | free3 | free3 | free3 | varchar2(60) |
| 65 | free4 | free4 | free4 | varchar2(60) |
| 66 | free5 | free5 | free5 | varchar2(60) |
| 67 | free6 | free6 | free6 | varchar2(60) |
| 68 | free7 | free7 | free7 | varchar2(60) |
| 69 | free8 | free8 | free8 | varchar2(60) |
| 70 | free9 | free9 | free9 | varchar2(60) |
| 71 | free10 | free10 | free10 | varchar2(60) |
| 72 | creationtime | creationtime | creationtime | char(19) |
| 73 | creator | creator | creator | char(20) |
| 74 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 75 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 76 | modifier | modifier | modifier | char(20) |
| 77 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |