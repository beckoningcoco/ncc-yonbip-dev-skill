# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8207.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_paybill | pk_paybill | pk_paybill | char(20) | √ |
| 2 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 3 | approvetime | approvetime | approvetime | char(19) |
| 4 | billglcmoney | billglcmoney | billglcmoney | number(28, 8) |
| 5 | billglcrate | billglcrate | billglcrate | number(15, 8) |
| 6 | billgllcmoney | billgllcmoney | billgllcmoney | number(28, 8) |
| 7 | billgllcrate | billgllcrate | billgllcrate | number(15, 8) |
| 8 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 9 | billmoney | billmoney | billmoney | number(28, 8) |
| 10 | billolcmoney | billolcmoney | billolcmoney | number(28, 8) |
| 11 | billolcrate | billolcrate | billolcrate | number(15, 8) |
| 12 | billsignature | billsignature | billsignature | varchar2(1024) |
| 13 | buyerinterest | buyerinterest | buyerinterest | char(1) |
| 14 | code | code | code | varchar2(1024) |
| 15 | commitdate | commitdate | commitdate | char(19) |
| 16 | committor | committor | committor | varchar2(20) |  |  | '~' |
| 17 | cyberbankflag | cyberbankflag | cyberbankflag | char(1) |
| 18 | dapprovedate | dapprovedate | dapprovedate | char(19) |
| 19 | dept | dept | dept | varchar2(20) |  |  | '~' |
| 20 | disabledate | disabledate | disabledate | char(19) |
| 21 | disableflag | disableflag | disableflag | char(1) |
| 22 | disablenote | disablenote | disablenote | varchar2(200) |
| 23 | disableuser | disableuser | disableuser | varchar2(20) |  |  | '~' |
| 24 | doperatedate | doperatedate | doperatedate | char(19) |
| 25 | dvoucherdate | dvoucherdate | dvoucherdate | char(19) |
| 26 | ecdplatdate | ecdplatdate | ecdplatdate | varchar2(20) |
| 27 | ecdplatseq | ecdplatseq | ecdplatseq | varchar2(50) |
| 28 | elcpaymentreturninfo | elcpaymentreturninfo | elcpaymentreturninfo | varchar2(1024) |
| 29 | fbmbillno | fbmbillno | fbmbillno | varchar2(50) |
| 30 | glcmoney | glcmoney | glcmoney | number(28, 8) |
| 31 | glcrate | glcrate | glcrate | number(15, 8) |
| 32 | gllcmoney | gllcmoney | gllcmoney | number(28, 8) |
| 33 | gllcrate | gllcrate | gllcrate | number(15, 8) |
| 34 | haspassedntbcheck | haspassedntbcheck | haspassedntbcheck | char(1) |
| 35 | initflag | initflag | initflag | char(1) |
| 36 | iscantrans | iscantrans | iscantrans | char(1) |
| 37 | issamebank | issamebank | issamebank | char(1) |
| 38 | money | money | money | number(28, 8) |
| 39 | note | note | note | varchar2(200) |
| 40 | olcmoney | olcmoney | olcmoney | number(28, 8) |
| 41 | olcrate | olcrate | olcrate | number(15, 8) |
| 42 | operatetime | operatetime | operatetime | char(19) |
| 43 | orgcountpay | orgcountpay | orgcountpay | char(1) |
| 44 | paybilldate | paybilldate | paybilldate | char(19) |
| 45 | paybillplanitem | paybillplanitem | paybillplanitem | varchar2(20) |  |  | '~' |
| 46 | paybillunit | paybillunit | paybillunit | varchar2(20) |  |  | '~' |
| 47 | paymentstatus | paymentstatus | paymentstatus | number(38, 0) |
| 48 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(20) |  |  | '~' |
| 49 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |  |  | '~' |
| 50 | pk_curr | pk_curr | pk_curr | varchar2(20) |  |  | '~' |
| 51 | pk_entrustorg | pk_entrustorg | pk_entrustorg | varchar2(20) |  |  | '~' |
| 52 | pk_entrustorg_v | pk_entrustorg_v | pk_entrustorg_v | varchar2(20) |  |  | '~' |
| 53 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 54 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 55 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 56 | pk_register | pk_register | pk_register | varchar2(20) |  |  | '~' |
| 57 | recallinfo | recallinfo | recallinfo | varchar2(1024) |
| 58 | recallstatus | recallstatus | recallstatus | number(38, 0) |
| 59 | receiverisicbcflag | receiverisicbcflag | receiverisicbcflag | char(1) |
| 60 | receiveunit | receiveunit | receiveunit | varchar2(20) |  |  | '~' |
| 61 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 62 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 63 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 64 | saga_status | saga_status | saga_status | number(38, 0) |
| 65 | syscode | syscode | syscode | varchar2(50) |  |  | 'INPUT' |
| 66 | tbbmessage | tbbmessage | tbbmessage | varchar2(1025) |
| 67 | vapprovenote | vapprovenote | vapprovenote | varchar2(1024) |
| 68 | vbillno | vbillno | vbillno | varchar2(50) |
| 69 | vbillstatus | vbillstatus | vbillstatus | number(38, 0) |
| 70 | voucher | voucher | voucher | char(1) |
| 71 | vouchertime | vouchertime | vouchertime | char(19) |
| 72 | vvoucherid | vvoucherid | vvoucherid | varchar2(20) |  |  | '~' |
| 73 | def1 | def1 | def1 | varchar2(101) |
| 74 | def2 | def2 | def2 | varchar2(101) |
| 75 | def3 | def3 | def3 | varchar2(101) |
| 76 | def4 | def4 | def4 | varchar2(101) |
| 77 | def5 | def5 | def5 | varchar2(101) |
| 78 | def6 | def6 | def6 | varchar2(101) |
| 79 | def7 | def7 | def7 | varchar2(101) |
| 80 | def8 | def8 | def8 | varchar2(101) |
| 81 | def9 | def9 | def9 | varchar2(101) |
| 82 | def10 | def10 | def10 | varchar2(101) |
| 83 | def11 | def11 | def11 | varchar2(101) |
| 84 | def12 | def12 | def12 | varchar2(101) |
| 85 | def13 | def13 | def13 | varchar2(101) |
| 86 | def14 | def14 | def14 | varchar2(101) |
| 87 | def15 | def15 | def15 | varchar2(101) |
| 88 | def16 | def16 | def16 | varchar2(101) |
| 89 | def17 | def17 | def17 | varchar2(101) |
| 90 | def18 | def18 | def18 | varchar2(101) |
| 91 | def19 | def19 | def19 | varchar2(101) |
| 92 | def20 | def20 | def20 | varchar2(101) |
| 93 | creationtime | creationtime | creationtime | char(19) |
| 94 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 95 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 96 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 97 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 98 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |