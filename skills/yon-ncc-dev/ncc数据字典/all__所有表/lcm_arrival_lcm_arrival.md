# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9755.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_arrival | pk_arrival | pk_arrival | char(20) | √ |
| 2 | approvedate | approvedate | approvedate | char(19) |
| 3 | approvenote | approvenote | approvenote | varchar2(1024) |
| 4 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 5 | arrivalamt | arrivalamt | arrivalamt | number(28, 8) |
| 6 | arrivaldate | arrivaldate | arrivaldate | char(19) |
| 7 | arrivalstatus | arrivalstatus | arrivalstatus | number(38, 0) |
| 8 | billmakedate | billmakedate | billmakedate | char(19) |
| 9 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 10 | billno | billno | billno | varchar2(50) |
| 11 | cashway | cashway | cashway | number(38, 0) |
| 12 | commitamout | commitamout | commitamout | number(28, 8) |
| 13 | commitdate | commitdate | commitdate | char(19) |
| 14 | commitperson | commitperson | commitperson | varchar2(20) |  |  | '~' |
| 15 | committype | committype | committype | number(38, 0) |
| 16 | dishonour | dishonour | dishonour | varchar2(50) |
| 17 | disreason | disreason | disreason | varchar2(181) |
| 18 | glcarrivalamt | glcarrivalamt | glcarrivalamt | number(28, 8) |
| 19 | glcpayamt | glcpayamt | glcpayamt | number(28, 8) |
| 20 | glcrate | glcrate | glcrate | number(28, 8) |
| 21 | gllcarrivalamt | gllcarrivalamt | gllcarrivalamt | number(28, 8) |
| 22 | gllcpayamt | gllcpayamt | gllcpayamt | number(28, 8) |
| 23 | gllcrate | gllcrate | gllcrate | number(28, 8) |
| 24 | honouramount | honouramount | honouramount | number(28, 8) |
| 25 | isbatch | isbatch | isbatch | char(1) |
| 26 | isdeal | isdeal | isdeal | char(1) |
| 27 | isdocu | isdocu | isdocu | char(1) |
| 28 | isdocubills | isdocubills | isdocubills | char(1) |
| 29 | isinitial | isinitial | isinitial | char(1) |
| 30 | isinvoice | isinvoice | isinvoice | char(1) |
| 31 | ispay | ispay | ispay | char(1) |
| 32 | isvoucher | isvoucher | isvoucher | char(1) |
| 33 | lcamount | lcamount | lcamount | number(28, 8) |
| 34 | lcbalance | lcbalance | lcbalance | number(28, 8) |
| 35 | lcstatus | lcstatus | lcstatus | number(38, 0) |
| 36 | olcarrivalamt | olcarrivalamt | olcarrivalamt | number(28, 8) |
| 37 | olcpayamt | olcpayamt | olcpayamt | number(28, 8) |
| 38 | olcrate | olcrate | olcrate | number(28, 8) |
| 39 | payamount | payamount | payamount | number(28, 8) |
| 40 | paydate | paydate | paydate | char(19) |
| 41 | payflag | payflag | payflag | char(1) |
| 42 | pk_billtype | pk_billtype | pk_billtype | varchar2(20) |  |  | '~' |
| 43 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(20) |
| 44 | pk_busipersion | pk_busipersion | pk_busipersion | varchar2(20) |  |  | '~' |
| 45 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 46 | pk_dept | pk_dept | pk_dept | varchar2(20) |  |  | '~' |
| 47 | pk_entrustorg | pk_entrustorg | pk_entrustorg | varchar2(20) |  |  | '~' |
| 48 | pk_entrustorg_v | pk_entrustorg_v | pk_entrustorg_v | varchar2(20) |  |  | '~' |
| 49 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 50 | pk_openbank | pk_openbank | pk_openbank | varchar2(20) |  |  | '~' |
| 51 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 52 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 53 | pk_register | pk_register | pk_register | varchar2(20) |  |  | '~' |
| 54 | pk_srcbill | pk_srcbill | pk_srcbill | varchar2(50) |
| 55 | pk_supplier | pk_supplier | pk_supplier | varchar2(20) |  |  | '~' |
| 56 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 57 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 58 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 59 | saga_status | saga_status | saga_status | number(38, 0) |
| 60 | serialno | serialno | serialno | varchar2(101) |
| 61 | srcbillcode | srcbillcode | srcbillcode | varchar2(50) |
| 62 | srcbusiflag | srcbusiflag | srcbusiflag | number(38, 0) |
| 63 | srcno | srcno | srcno | varchar2(50) |
| 64 | submitdate | submitdate | submitdate | char(19) |
| 65 | submitter | submitter | submitter | varchar2(20) |  |  | '~' |
| 66 | thisarrivalamt | thisarrivalamt | thisarrivalamt | number(28, 8) |
| 67 | vbillno | vbillno | vbillno | varchar2(40) |
| 68 | vbillstatus | vbillstatus | vbillstatus | number(38, 0) |
| 69 | voucher | voucher | voucher | varchar2(20) |  |  | '~' |
| 70 | voucherdate | voucherdate | voucherdate | char(19) |
| 71 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 72 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 73 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 74 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 75 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 76 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 77 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 78 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 79 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 80 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 81 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 82 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 83 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 84 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 85 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 86 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 87 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 88 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 89 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 90 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 91 | vdef21 | vdef21 | vdef21 | varchar2(101) |
| 92 | vdef22 | vdef22 | vdef22 | varchar2(101) |
| 93 | vdef23 | vdef23 | vdef23 | varchar2(101) |
| 94 | vdef24 | vdef24 | vdef24 | varchar2(101) |
| 95 | vdef25 | vdef25 | vdef25 | varchar2(101) |
| 96 | vdef26 | vdef26 | vdef26 | varchar2(101) |
| 97 | vdef27 | vdef27 | vdef27 | varchar2(101) |
| 98 | vdef28 | vdef28 | vdef28 | varchar2(101) |
| 99 | vdef29 | vdef29 | vdef29 | varchar2(101) |
| 100 | vdef30 | vdef30 | vdef30 | varchar2(101) |
| 101 | creationtime | creationtime | creationtime | char(19) |
| 102 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 103 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 104 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 105 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 106 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |