# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8202.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_impawn | pk_impawn | pk_impawn | char(20) | √ |
| 2 | approvemodecode | approvemodecode | approvemodecode | varchar2(50) |
| 3 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 4 | approvetime | approvetime | approvetime | char(19) |
| 5 | backimpawnstatus | backimpawnstatus | backimpawnstatus | number(38, 0) |
| 6 | bankreturninfo | bankreturninfo | bankreturninfo | varchar2(1024) |
| 7 | billglcmoney | billglcmoney | billglcmoney | number(28, 8) |
| 8 | billglcrate | billglcrate | billglcrate | number(15, 8) |
| 9 | billgllcmoney | billgllcmoney | billgllcmoney | number(28, 8) |
| 10 | billgllcrate | billgllcrate | billgllcrate | number(15, 8) |
| 11 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 12 | billmediumcode | billmediumcode | billmediumcode | varchar2(50) |
| 13 | billmoney | billmoney | billmoney | number(28, 8) |
| 14 | billolcmoney | billolcmoney | billolcmoney | number(28, 8) |
| 15 | billolcrate | billolcrate | billolcrate | number(15, 8) |
| 16 | billpoolbusicode | billpoolbusicode | billpoolbusicode | varchar2(50) |
| 17 | billpoolflag | billpoolflag | billpoolflag | char(1) |
| 18 | billsignature | billsignature | billsignature | varchar2(1024) |
| 19 | busistatus | busistatus | busistatus | number(38, 0) |
| 20 | cacode | cacode | cacode | varchar2(1024) |
| 21 | code | code | code | varchar2(1024) |
| 22 | commitdate | commitdate | commitdate | char(19) |
| 23 | committor | committor | committor | varchar2(20) |  |  | '~' |
| 24 | creditunit | creditunit | creditunit | varchar2(50) |
| 25 | dapprovedate | dapprovedate | dapprovedate | char(19) |
| 26 | debitunit | debitunit | debitunit | varchar2(20) |  |  | '~' |
| 27 | disabledate | disabledate | disabledate | char(19) |
| 28 | disableflag | disableflag | disableflag | char(1) |
| 29 | disablenote | disablenote | disablenote | varchar2(200) |
| 30 | disableuser | disableuser | disableuser | varchar2(20) |  |  | '~' |
| 31 | doperatedate | doperatedate | doperatedate | char(19) |
| 32 | ecdplatdate | ecdplatdate | ecdplatdate | varchar2(20) |
| 33 | ecdplatseq | ecdplatseq | ecdplatseq | varchar2(50) |
| 34 | ecdswithdrawmsg | ecdswithdrawmsg | ecdswithdrawmsg | varchar2(181) |
| 35 | ecdswithdrawstatus | ecdswithdrawstatus | ecdswithdrawstatus | number(38, 0) |
| 36 | evaluateunit | evaluateunit | evaluateunit | varchar2(100) |
| 37 | evaluatevalue | evaluatevalue | evaluatevalue | number(28, 8) |
| 38 | fbmbillno | fbmbillno | fbmbillno | varchar2(100) |
| 39 | glcbrate | glcbrate | glcbrate | number(15, 8) |
| 40 | glcevaluatevalue | glcevaluatevalue | glcevaluatevalue | number(28, 8) |
| 41 | glcmoney | glcmoney | glcmoney | number(28, 8) |
| 42 | gllcbrate | gllcbrate | gllcbrate | number(15, 8) |
| 43 | gllcmoney | gllcmoney | gllcmoney | number(28, 8) |
| 44 | gllevaluatevalue | gllevaluatevalue | gllevaluatevalue | number(28, 8) |
| 45 | haspassedntbcheck | haspassedntbcheck | haspassedntbcheck | char(1) |
| 46 | holderaccount | holderaccount | holderaccount | varchar2(20) |  |  | '~' |
| 47 | impawnable | impawnable | impawnable | number(28, 8) |
| 48 | impawnbackdate | impawnbackdate | impawnbackdate | char(19) |
| 49 | impawnbackpersonid | impawnbackpersonid | impawnbackpersonid | varchar2(20) |  |  | '~' |
| 50 | impawnbacksignmsg | impawnbacksignmsg | impawnbacksignmsg | varchar2(181) |
| 51 | impawnbacksignstatus | impawnbacksignstatus | impawnbacksignstatus | number(38, 0) |
| 52 | impawnbacktype | impawnbacktype | impawnbacktype | varchar2(20) |
| 53 | impawnbackunit | impawnbackunit | impawnbackunit | varchar2(20) |  |  | '~' |
| 54 | impawnbank | impawnbank | impawnbank | varchar2(20) |  |  | '~' |
| 55 | impawndate | impawndate | impawndate | char(19) |
| 56 | impawnenddate | impawnenddate | impawnenddate | char(19) |
| 57 | impawnno | impawnno | impawnno | varchar2(50) |
| 58 | impawnpersonid | impawnpersonid | impawnpersonid | varchar2(20) |  |  | '~' |
| 59 | impawnrate | impawnrate | impawnrate | number(15, 8) |
| 60 | impawnscheme | impawnscheme | impawnscheme | varchar2(20) |
| 61 | impawnstatus | impawnstatus | impawnstatus | varchar2(50) |
| 62 | impawnunit | impawnunit | impawnunit | varchar2(20) |  |  | '~' |
| 63 | initflag | initflag | initflag | char(1) |
| 64 | isautorelievesign | isautorelievesign | isautorelievesign | char(1) |
| 65 | makevoucher | makevoucher | makevoucher | char(1) |
| 66 | money | money | money | number(28, 8) |
| 67 | note | note | note | varchar2(200) |
| 68 | olcbrate | olcbrate | olcbrate | number(15, 8) |
| 69 | olcevaluatevalue | olcevaluatevalue | olcevaluatevalue | number(28, 8) |
| 70 | olcmoney | olcmoney | olcmoney | number(28, 8) |
| 71 | onlinebankflag | onlinebankflag | onlinebankflag | char(1) |
| 72 | pawneeaccount | pawneeaccount | pawneeaccount | varchar2(50) |
| 73 | pawneetype | pawneetype | pawneetype | number(38, 0) |
| 74 | paymentstatus | paymentstatus | paymentstatus | number(38, 0) |
| 75 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(20) |  |  | '~' |
| 76 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |  |  | '~' |
| 77 | pk_curr | pk_curr | pk_curr | varchar2(20) |  |  | '~' |
| 78 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 79 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 80 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 81 | pk_register | pk_register | pk_register | varchar2(20) |  |  | '~' |
| 82 | pk_srcbill | pk_srcbill | pk_srcbill | varchar2(20) |
| 83 | preveriousstatus | preveriousstatus | preveriousstatus | varchar2(40) |
| 84 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 85 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 86 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 87 | saga_status | saga_status | saga_status | number(38, 0) |
| 88 | tasktype | tasktype | tasktype | varchar2(50) |
| 89 | tbbmessage | tbbmessage | tbbmessage | varchar2(50) |
| 90 | undoimpawn | undoimpawn | undoimpawn | varchar2(181) |
| 91 | undoimpawnwithdrawmsg | undoimpawnwithdrawmsg | undoimpawnwithdrawmsg | varchar2(181) |
| 92 | unimpawnwithdrawstatus | unimpawnwithdrawstatus | unimpawnwithdrawstatus | number(38, 0) |
| 93 | vapprovenote | vapprovenote | vapprovenote | varchar2(1024) |
| 94 | vbillno | vbillno | vbillno | varchar2(50) |
| 95 | vbillstatus | vbillstatus | vbillstatus | number(38, 0) |  |  | -1 |
| 96 | def1 | def1 | def1 | varchar2(101) |
| 97 | def2 | def2 | def2 | varchar2(101) |
| 98 | def3 | def3 | def3 | varchar2(101) |
| 99 | def4 | def4 | def4 | varchar2(101) |
| 100 | def5 | def5 | def5 | varchar2(101) |
| 101 | def6 | def6 | def6 | varchar2(101) |
| 102 | def7 | def7 | def7 | varchar2(101) |
| 103 | def8 | def8 | def8 | varchar2(101) |
| 104 | def9 | def9 | def9 | varchar2(101) |
| 105 | def10 | def10 | def10 | varchar2(101) |
| 106 | def11 | def11 | def11 | varchar2(101) |
| 107 | def12 | def12 | def12 | varchar2(101) |
| 108 | def13 | def13 | def13 | varchar2(101) |
| 109 | def14 | def14 | def14 | varchar2(101) |
| 110 | def15 | def15 | def15 | varchar2(101) |
| 111 | def16 | def16 | def16 | varchar2(101) |
| 112 | def17 | def17 | def17 | varchar2(101) |
| 113 | def18 | def18 | def18 | varchar2(101) |
| 114 | def19 | def19 | def19 | varchar2(101) |
| 115 | def20 | def20 | def20 | varchar2(101) |
| 116 | creationtime | creationtime | creationtime | char(19) |
| 117 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 118 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 119 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 120 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 121 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |