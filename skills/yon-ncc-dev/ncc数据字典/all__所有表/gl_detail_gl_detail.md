# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8483.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_detail | pk_detail | pk_detail | char(20) | √ |
| 2 | accountcode | accountcode | accountcode | varchar2(40) |  |  | '~' |
| 3 | adjustperiod | adjustperiod | adjustperiod | varchar2(3) |
| 4 | assid | assid | assid | char(20) |
| 5 | bankaccount | bankaccount | bankaccount | char(20) |
| 6 | billtype | billtype | billtype | varchar2(60) |
| 7 | busireconno | busireconno | busireconno | varchar2(60) |
| 8 | checkdate | checkdate | checkdate | char(19) |
| 9 | checkno | checkno | checkno | varchar2(30) |
| 10 | checkstyle | checkstyle | checkstyle | varchar2(20) |
| 11 | contrastflag | contrastflag | contrastflag | number(38, 0) |
| 12 | convertflag | convertflag | convertflag | char(1) |
| 13 | creditamount | creditamount | creditamount | number(28, 8) |  |  | 0 |
| 14 | creditquantity | creditquantity | creditquantity | number(20, 8) |
| 15 | debitamount | debitamount | debitamount | number(28, 8) |  |  | 0 |
| 16 | debitquantity | debitquantity | debitquantity | number(20, 8) |  |  | 0 |
| 17 | detailindex | detailindex | detailindex | number(38, 0) |
| 18 | direction | direction | direction | char(1) |
| 19 | discardflagv | discardflagv | discardflagv | char(1) |
| 20 | errmessage | errmessage | errmessage | varchar2(90) |
| 21 | errmessage2 | errmessage2 | errmessage2 | varchar2(60) |
| 22 | errmessageh | errmessageh | errmessageh | varchar2(90) |
| 23 | excrate1 | excrate1 | excrate1 | number(15, 8) |  |  | 0 |
| 24 | excrate2 | excrate2 | excrate2 | number(15, 8) |  |  | 0 |
| 25 | excrate3 | excrate3 | excrate3 | number(15, 8) |  |  | 0 |
| 26 | excrate4 | excrate4 | excrate4 | number(15, 8) |  |  | 0 |
| 27 | explanation | explanation | explanation | varchar2(1000) |
| 28 | exratedate2 | exratedate2 | exratedate2 | char(19) |
| 29 | fraccreditamount | fraccreditamount | fraccreditamount | number(28, 8) |
| 30 | fracdebitamount | fracdebitamount | fracdebitamount | number(28, 8) |
| 31 | globalcreditamount | globalcreditamount | globalcreditamount | number(28, 8) |  |  | 0 |
| 32 | globaldebitamount | globaldebitamount | globaldebitamount | number(28, 8) |  |  | 0 |
| 33 | groupcreditamount | groupcreditamount | groupcreditamount | number(28, 8) |  |  | 0 |
| 34 | groupdebitamount | groupdebitamount | groupdebitamount | number(28, 8) |  |  | 0 |
| 35 | innerbusdate | innerbusdate | innerbusdate | char(19) |
| 36 | innerbusno | innerbusno | innerbusno | varchar2(60) |
| 37 | isdifflag | isdifflag | isdifflag | char(1) |
| 38 | localcreditamount | localcreditamount | localcreditamount | number(28, 8) |  |  | 0 |
| 39 | localdebitamount | localdebitamount | localdebitamount | number(28, 8) |  |  | 0 |
| 40 | modifyflag | modifyflag | modifyflag | char(23) |
| 41 | netbankflag | netbankflag | netbankflag | varchar2(30) |
| 42 | nov | nov | nov | number(38, 0) |
| 43 | oppositesubj | oppositesubj | oppositesubj | varchar2(200) |
| 44 | periodv | periodv | periodv | char(2) | √ |
| 45 | pk_accasoa | pk_accasoa | pk_accasoa | char(20) |
| 46 | pk_accchart | pk_accchart | pk_accchart | varchar2(20) |  |  | '~' |
| 47 | pk_account | pk_account | pk_account | varchar2(20) |  |  | '~' |
| 48 | pk_accountingbook | pk_accountingbook | pk_accountingbook | char(20) | √ |
| 49 | pk_currtype | pk_currtype | pk_currtype | char(20) |
| 50 | pk_exratescheme2 | pk_exratescheme2 | pk_exratescheme2 | varchar2(20) |
| 51 | pk_group | pk_group | pk_group | char(20) |
| 52 | pk_innerorg | pk_innerorg | pk_innerorg | varchar2(20) |
| 53 | pk_innersob | pk_innersob | pk_innersob | varchar2(20) |
| 54 | pk_liabilitycenter | pk_liabilitycenter | pk_liabilitycenter | varchar2(20) | √ |  | '~' |
| 55 | pk_liabilitycenter_v | pk_liabilitycenter_v | pk_liabilitycenter_v | varchar2(20) |  |  | '~' |
| 56 | pk_managerv | pk_managerv | pk_managerv | varchar2(20) |
| 57 | pk_offerdetail | pk_offerdetail | pk_offerdetail | char(20) |
| 58 | pk_org | pk_org | pk_org | char(20) |
| 59 | pk_org_v | pk_org_v | pk_org_v | char(20) |
| 60 | pk_othercorp | pk_othercorp | pk_othercorp | varchar2(4) |
| 61 | pk_otherorgbook | pk_otherorgbook | pk_otherorgbook | char(20) |
| 62 | pk_preparedv | pk_preparedv | pk_preparedv | char(20) |
| 63 | pk_setofbook | pk_setofbook | pk_setofbook | char(20) |
| 64 | pk_sourcepk | pk_sourcepk | pk_sourcepk | varchar2(20) |
| 65 | pk_systemv | pk_systemv | pk_systemv | char(20) |
| 66 | pk_unit | pk_unit | pk_unit | char(20) |
| 67 | pk_unit_v | pk_unit_v | pk_unit_v | varchar2(20) |
| 68 | pk_voucher | pk_voucher | pk_voucher | char(20) | √ |
| 69 | pk_vouchertypev | pk_vouchertypev | pk_vouchertypev | char(20) |
| 70 | prepareddatev | prepareddatev | prepareddatev | char(19) | √ |
| 71 | price | price | price | number(28, 8) |
| 72 | recieptclass | recieptclass | recieptclass | varchar2(60) |
| 73 | setofbookcreditamount | setofbookcreditamount | setofbookcreditamount | number(28, 8) | √ |  | 0 |
| 74 | setofbookdebitamount | setofbookdebitamount | setofbookdebitamount | number(28, 8) | √ |  | 0 |
| 75 | signdatev | signdatev | signdatev | char(19) |
| 76 | tempsaveflag | tempsaveflag | tempsaveflag | char(1) |  |  | 'N' |
| 77 | unitname | unitname | unitname | varchar2(200) |
| 78 | verifydate | verifydate | verifydate | char(19) |
| 79 | verifyno | verifyno | verifyno | varchar2(60) |
| 80 | voucherkindv | voucherkindv | voucherkindv | number(38, 0) |
| 81 | yearv | yearv | yearv | char(4) | √ |
| 82 | free1 | free1 | free1 | varchar2(60) |
| 83 | free2 | free2 | free2 | varchar2(60) |
| 84 | free3 | free3 | free3 | varchar2(60) |
| 85 | free4 | free4 | free4 | varchar2(60) |
| 86 | free5 | free5 | free5 | varchar2(60) |
| 87 | free6 | free6 | free6 | varchar2(60) |
| 88 | free7 | free7 | free7 | varchar2(60) |
| 89 | free8 | free8 | free8 | varchar2(60) |
| 90 | free9 | free9 | free9 | varchar2(60) |
| 91 | free10 | free10 | free10 | varchar2(60) |
| 92 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 93 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |