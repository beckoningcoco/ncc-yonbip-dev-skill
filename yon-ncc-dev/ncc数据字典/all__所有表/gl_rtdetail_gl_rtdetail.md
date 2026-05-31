# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8552.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_detail | pk_detail | pk_detail | char(20) | √ |
| 2 | adjustperiod | adjustperiod | adjustperiod | varchar2(3) |
| 3 | assid | assid | assid | char(20) |
| 4 | bankaccount | bankaccount | bankaccount | char(20) |
| 5 | billtype | billtype | billtype | varchar2(60) |
| 6 | busireconno | busireconno | busireconno | varchar2(60) |
| 7 | checkdate | checkdate | checkdate | char(19) |
| 8 | checkno | checkno | checkno | varchar2(30) |
| 9 | checkstyle | checkstyle | checkstyle | varchar2(20) |
| 10 | contrastflag | contrastflag | contrastflag | number(38, 0) |
| 11 | convertflag | convertflag | convertflag | char(1) |
| 12 | creditamount | creditamount | creditamount | number(28, 8) |
| 13 | creditquantity | creditquantity | creditquantity | number(20, 8) |
| 14 | debitamount | debitamount | debitamount | number(28, 8) |
| 15 | debitquantity | debitquantity | debitquantity | number(20, 8) |
| 16 | detailindex | detailindex | detailindex | number(38, 0) |
| 17 | direction | direction | direction | char(1) |
| 18 | discardflagv | discardflagv | discardflagv | char(1) |
| 19 | errmessage | errmessage | errmessage | varchar2(90) |
| 20 | errmessage2 | errmessage2 | errmessage2 | varchar2(60) |
| 21 | errmessageh | errmessageh | errmessageh | varchar2(90) |
| 22 | excrate1 | excrate1 | excrate1 | number(15, 8) |
| 23 | excrate2 | excrate2 | excrate2 | number(15, 8) |
| 24 | excrate3 | excrate3 | excrate3 | number(15, 8) |  |  | 0 |
| 25 | excrate4 | excrate4 | excrate4 | number(15, 8) |  |  | 0 |
| 26 | explanation | explanation | explanation | varchar2(1000) |
| 27 | exratedate2 | exratedate2 | exratedate2 | char(19) |
| 28 | fraccreditamount | fraccreditamount | fraccreditamount | number(28, 8) |
| 29 | fracdebitamount | fracdebitamount | fracdebitamount | number(28, 8) |
| 30 | globalcreditamount | globalcreditamount | globalcreditamount | number(28, 8) |
| 31 | globaldebitamount | globaldebitamount | globaldebitamount | number(28, 8) |
| 32 | groupcreditamount | groupcreditamount | groupcreditamount | number(28, 8) |
| 33 | groupdebitamount | groupdebitamount | groupdebitamount | number(28, 8) |
| 34 | innerbusdate | innerbusdate | innerbusdate | char(19) |
| 35 | innerbusno | innerbusno | innerbusno | varchar2(60) |
| 36 | isdifflag | isdifflag | isdifflag | char(1) |
| 37 | localcreditamount | localcreditamount | localcreditamount | number(28, 8) |
| 38 | localdebitamount | localdebitamount | localdebitamount | number(28, 8) |
| 39 | modifyflag | modifyflag | modifyflag | char(23) |
| 40 | netbankflag | netbankflag | netbankflag | varchar2(30) |
| 41 | nov | nov | nov | number(38, 0) |
| 42 | oppositesubj | oppositesubj | oppositesubj | varchar2(200) |
| 43 | periodv | periodv | periodv | char(2) |
| 44 | pk_accasoa | pk_accasoa | pk_accasoa | varchar2(20) |  |  | '~' |
| 45 | pk_accountingbook | pk_accountingbook | pk_accountingbook | varchar2(20) |  |  | '~' |
| 46 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 47 | pk_exratescheme2 | pk_exratescheme2 | pk_exratescheme2 | varchar2(20) |
| 48 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 49 | pk_innerorg | pk_innerorg | pk_innerorg | varchar2(20) |
| 50 | pk_innersob | pk_innersob | pk_innersob | varchar2(20) |
| 51 | pk_liabilitycenter | pk_liabilitycenter | pk_liabilitycenter | varchar2(20) |
| 52 | pk_liabilitycenter_v | pk_liabilitycenter_v | pk_liabilitycenter_v | varchar2(20) |
| 53 | pk_managerv | pk_managerv | pk_managerv | varchar2(20) |
| 54 | pk_offerdetail | pk_offerdetail | pk_offerdetail | char(20) |
| 55 | pk_org | pk_org | pk_org | varchar2(20) |
| 56 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 57 | pk_othercorp | pk_othercorp | pk_othercorp | varchar2(4) |
| 58 | pk_otherorgbook | pk_otherorgbook | pk_otherorgbook | char(20) |
| 59 | pk_setofbook | pk_setofbook | pk_setofbook | varchar2(20) |  |  | '~' |
| 60 | pk_sourcepk | pk_sourcepk | pk_sourcepk | char(20) |
| 61 | pk_systemv | pk_systemv | pk_systemv | char(20) |
| 62 | pk_unit | pk_unit | pk_unit | varchar2(20) |
| 63 | pk_unit_v | pk_unit_v | pk_unit_v | varchar2(20) |
| 64 | pk_voucher | pk_voucher | pk_voucher | char(20) | √ |
| 65 | pk_vouchertypev | pk_vouchertypev | pk_vouchertypev | varchar2(20) |  |  | '~' |
| 66 | prepareddatev | prepareddatev | prepareddatev | char(19) |
| 67 | price | price | price | number(28, 8) |
| 68 | recieptclass | recieptclass | recieptclass | varchar2(60) |
| 69 | setofbookcreditamount | setofbookcreditamount | setofbookcreditamount | number(28, 8) |
| 70 | setofbookdebitamount | setofbookdebitamount | setofbookdebitamount | number(28, 8) |
| 71 | signdatev | signdatev | signdatev | char(19) |
| 72 | tempsaveflag | tempsaveflag | tempsaveflag | char(1) |  |  | 'N' |
| 73 | unitname | unitname | unitname | varchar2(50) |
| 74 | verifydate | verifydate | verifydate | char(19) |
| 75 | verifyno | verifyno | verifyno | varchar2(60) |
| 76 | voucherkindv | voucherkindv | voucherkindv | number(38, 0) |
| 77 | yearv | yearv | yearv | char(4) |
| 78 | free1 | free1 | free1 | varchar2(60) |
| 79 | free2 | free2 | free2 | varchar2(60) |
| 80 | free3 | free3 | free3 | varchar2(60) |
| 81 | free4 | free4 | free4 | varchar2(60) |
| 82 | free5 | free5 | free5 | varchar2(60) |
| 83 | free6 | free6 | free6 | varchar2(60) |
| 84 | free7 | free7 | free7 | varchar2(60) |
| 85 | free8 | free8 | free8 | varchar2(60) |
| 86 | free9 | free9 | free9 | varchar2(60) |
| 87 | free10 | free10 | free10 | varchar2(60) |
| 88 | freevalue1 | freevalue1 | freevalue1 | varchar2(50) |
| 89 | freevalue2 | freevalue2 | freevalue2 | varchar2(50) |
| 90 | freevalue3 | freevalue3 | freevalue3 | varchar2(50) |
| 91 | freevalue4 | freevalue4 | freevalue4 | varchar2(50) |
| 92 | freevalue5 | freevalue5 | freevalue5 | varchar2(50) |
| 93 | freevalue6 | freevalue6 | freevalue6 | varchar2(50) |
| 94 | freevalue7 | freevalue7 | freevalue7 | varchar2(50) |
| 95 | freevalue8 | freevalue8 | freevalue8 | varchar2(50) |
| 96 | freevalue9 | freevalue9 | freevalue9 | varchar2(50) |
| 97 | freevalue10 | freevalue10 | freevalue10 | varchar2(50) |
| 98 | freevalue11 | freevalue11 | freevalue11 | varchar2(50) |
| 99 | freevalue12 | freevalue12 | freevalue12 | varchar2(50) |
| 100 | freevalue13 | freevalue13 | freevalue13 | varchar2(50) |
| 101 | freevalue14 | freevalue14 | freevalue14 | varchar2(50) |
| 102 | freevalue15 | freevalue15 | freevalue15 | varchar2(50) |
| 103 | freevalue16 | freevalue16 | freevalue16 | varchar2(50) |
| 104 | freevalue17 | freevalue17 | freevalue17 | varchar2(50) |
| 105 | freevalue18 | freevalue18 | freevalue18 | varchar2(50) |
| 106 | freevalue19 | freevalue19 | freevalue19 | varchar2(50) |
| 107 | freevalue20 | freevalue20 | freevalue20 | varchar2(50) |
| 108 | freevalue21 | freevalue21 | freevalue21 | varchar2(50) |
| 109 | freevalue22 | freevalue22 | freevalue22 | varchar2(50) |
| 110 | freevalue23 | freevalue23 | freevalue23 | varchar2(50) |
| 111 | freevalue24 | freevalue24 | freevalue24 | varchar2(50) |
| 112 | freevalue25 | freevalue25 | freevalue25 | varchar2(50) |
| 113 | freevalue26 | freevalue26 | freevalue26 | varchar2(50) |
| 114 | freevalue27 | freevalue27 | freevalue27 | varchar2(50) |
| 115 | freevalue28 | freevalue28 | freevalue28 | varchar2(50) |
| 116 | freevalue29 | freevalue29 | freevalue29 | varchar2(50) |
| 117 | freevalue30 | freevalue30 | freevalue30 | varchar2(50) |
| 118 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 119 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |