# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8587.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_voucher | pk_voucher | pk_voucher | char(20) | √ |
| 2 | addclass | addclass | addclass | varchar2(60) |
| 3 | adjustperiod | adjustperiod | adjustperiod | varchar2(3) |
| 4 | approver | approver | approver | varchar2(20) |
| 5 | attachment | attachment | attachment | number(38, 0) |
| 6 | billmaker | billmaker | billmaker | varchar2(20) |
| 7 | checkeddate | checkeddate | checkeddate | char(19) |
| 8 | contrastflag | contrastflag | contrastflag | number(38, 0) |
| 9 | convertflag | convertflag | convertflag | char(1) |
| 10 | deleteclass | deleteclass | deleteclass | varchar2(60) |
| 11 | detailmodflag | detailmodflag | detailmodflag | char(1) |
| 12 | discardflag | discardflag | discardflag | char(1) |
| 13 | errmessage | errmessage | errmessage | varchar2(60) |
| 14 | errmessageh | errmessageh | errmessageh | varchar2(90) |
| 15 | explanation | explanation | explanation | varchar2(150) |
| 16 | isdifflag | isdifflag | isdifflag | char(1) |
| 17 | modifyclass | modifyclass | modifyclass | varchar2(60) |
| 18 | modifyflag | modifyflag | modifyflag | char(20) |
| 19 | num | num | num | number(38, 0) |
| 20 | offervoucher | offervoucher | offervoucher | varchar2(20) |
| 21 | period | period | period | char(2) | √ |
| 22 | pk_accountingbook | pk_accountingbook | pk_accountingbook | char(20) | √ |
| 23 | pk_casher | pk_casher | pk_casher | varchar2(20) |
| 24 | pk_checked | pk_checked | pk_checked | varchar2(20) |
| 25 | pk_group | pk_group | pk_group | char(20) |
| 26 | pk_manager | pk_manager | pk_manager | varchar2(20) |
| 27 | pk_org | pk_org | pk_org | char(20) |
| 28 | pk_org_v | pk_org_v | pk_org_v | char(20) |
| 29 | pk_prepared | pk_prepared | pk_prepared | char(20) | √ |
| 30 | pk_setofbook | pk_setofbook | pk_setofbook | char(20) |
| 31 | pk_sourcepk | pk_sourcepk | pk_sourcepk | char(20) |
| 32 | pk_system | pk_system | pk_system | char(20) |
| 33 | pk_vouchertype | pk_vouchertype | pk_vouchertype | char(20) | √ |
| 34 | prepareddate | prepareddate | prepareddate | char(19) | √ |
| 35 | signdate | signdate | signdate | char(19) |
| 36 | signflag | signflag | signflag | char(1) |
| 37 | tallydate | tallydate | tallydate | char(19) |
| 38 | tempsaveflag | tempsaveflag | tempsaveflag | char(1) |  |  | 'N' |
| 39 | totalcredit | totalcredit | totalcredit | number(28, 8) |
| 40 | totalcreditglobal | totalcreditglobal | totalcreditglobal | number(28, 8) |
| 41 | totalcreditgroup | totalcreditgroup | totalcreditgroup | number(28, 8) |
| 42 | totalcreditsetofbook | totalcreditsetofbook | totalcreditsetofbook | number(28, 8) |
| 43 | totaldebit | totaldebit | totaldebit | number(28, 8) |
| 44 | totaldebitglobal | totaldebitglobal | totaldebitglobal | number(28, 8) |
| 45 | totaldebitgroup | totaldebitgroup | totaldebitgroup | number(28, 8) |
| 46 | totaldebitsetofbook | totaldebitsetofbook | totaldebitsetofbook | number(28, 8) |
| 47 | voucherkind | voucherkind | voucherkind | number(38, 0) |
| 48 | year | year | year | char(4) | √ |
| 49 | free1 | free1 | free1 | varchar2(60) |
| 50 | free2 | free2 | free2 | varchar2(60) |
| 51 | free3 | free3 | free3 | varchar2(60) |
| 52 | free4 | free4 | free4 | varchar2(60) |
| 53 | free5 | free5 | free5 | varchar2(60) |
| 54 | free6 | free6 | free6 | varchar2(60) |
| 55 | free7 | free7 | free7 | varchar2(60) |
| 56 | free8 | free8 | free8 | varchar2(60) |
| 57 | free9 | free9 | free9 | varchar2(60) |
| 58 | free10 | free10 | free10 | varchar2(60) |
| 59 | creationtime | creationtime | creationtime | char(19) |
| 60 | creator | creator | creator | char(20) |
| 61 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 62 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 63 | modifier | modifier | modifier | char(20) |
| 64 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |