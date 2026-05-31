# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8196.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_endore | pk_endore | pk_endore | char(20) | √ |
| 2 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 3 | approvetime | approvetime | approvetime | char(19) |
| 4 | bankreturninfo | bankreturninfo | bankreturninfo | varchar2(1024) |
| 5 | banksubcompany | banksubcompany | banksubcompany | varchar2(50) |
| 6 | billgetbankcode | billgetbankcode | billgetbankcode | varchar2(50) |
| 7 | billgetbankname | billgetbankname | billgetbankname | varchar2(200) |
| 8 | billglcmoney | billglcmoney | billglcmoney | number(28, 8) |
| 9 | billglcrate | billglcrate | billglcrate | number(15, 8) |
| 10 | billgllcmoney | billgllcmoney | billgllcmoney | number(28, 8) |
| 11 | billgllcrate | billgllcrate | billgllcrate | number(15, 8) |
| 12 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 13 | billmoney | billmoney | billmoney | number(28, 8) |
| 14 | billolcmoney | billolcmoney | billolcmoney | number(28, 8) |
| 15 | billolcrate | billolcrate | billolcrate | number(15, 8) |
| 16 | billpoolflag | billpoolflag | billpoolflag | char(1) |
| 17 | billsignature | billsignature | billsignature | varchar2(1024) |
| 18 | busdate | busdate | busdate | char(19) |
| 19 | code | code | code | varchar2(1024) |
| 20 | commitdate | commitdate | commitdate | char(19) |
| 21 | committor | committor | committor | varchar2(20) |  |  | '~' |
| 22 | dapprovedate | dapprovedate | dapprovedate | char(19) |
| 23 | disabledate | disabledate | disabledate | char(19) |
| 24 | disableflag | disableflag | disableflag | char(1) |
| 25 | disablenote | disablenote | disablenote | varchar2(200) |
| 26 | disableuser | disableuser | disableuser | varchar2(20) |  |  | '~' |
| 27 | doperatedate | doperatedate | doperatedate | char(19) |
| 28 | dvoucherdate | dvoucherdate | dvoucherdate | char(19) |
| 29 | ecdplatdate | ecdplatdate | ecdplatdate | varchar2(20) |
| 30 | ecdplatseq | ecdplatseq | ecdplatseq | varchar2(50) |
| 31 | ecdswithdrawmsg | ecdswithdrawmsg | ecdswithdrawmsg | varchar2(181) |
| 32 | ecdswithdrawstatus | ecdswithdrawstatus | ecdswithdrawstatus | number(38, 0) |
| 33 | endoreplanitem | endoreplanitem | endoreplanitem | varchar2(20) |  |  | '~' |
| 34 | endoretype | endoretype | endoretype | varchar2(50) |
| 35 | endorsee | endorsee | endorsee | varchar2(20) |  |  | '~' |
| 36 | endorseebankacc | endorseebankacc | endorseebankacc | varchar2(20) |  |  | '~' |
| 37 | endorser | endorser | endorser | varchar2(20) |  |  | '~' |
| 38 | endorserbankacc | endorserbankacc | endorserbankacc | varchar2(20) |  |  | '~' |
| 39 | fbmbillno | fbmbillno | fbmbillno | varchar2(50) |
| 40 | gatherplanitem | gatherplanitem | gatherplanitem | varchar2(20) |  |  | '~' |
| 41 | glcmoney | glcmoney | glcmoney | number(28, 8) |
| 42 | glcrate | glcrate | glcrate | number(15, 8) |
| 43 | glcreckonamount | glcreckonamount | glcreckonamount | number(28, 8) |
| 44 | gllcmoney | gllcmoney | gllcmoney | number(28, 8) |
| 45 | gllcrate | gllcrate | gllcrate | number(15, 8) |
| 46 | gllcreckonamount | gllcreckonamount | gllcreckonamount | number(28, 8) |
| 47 | haspassedntbcheck | haspassedntbcheck | haspassedntbcheck | char(1) |
| 48 | imendorseraccount | imendorseraccount | imendorseraccount | varchar2(50) |
| 49 | issamebank | issamebank | issamebank | char(1) |
| 50 | money | money | money | number(28, 8) |
| 51 | note | note | note | varchar2(200) |
| 52 | olcmoney | olcmoney | olcmoney | number(28, 8) |
| 53 | olcrate | olcrate | olcrate | number(15, 8) |
| 54 | olcreckonamount | olcreckonamount | olcreckonamount | number(28, 8) |
| 55 | onlinebankflag | onlinebankflag | onlinebankflag | char(1) |
| 56 | opbilltype | opbilltype | opbilltype | varchar2(30) |
| 57 | ownendore | ownendore | ownendore | char(1) |
| 58 | paymentstatus | paymentstatus | paymentstatus | number(38, 0) |
| 59 | periodbegin | periodbegin | periodbegin | char(1) |
| 60 | pk_bankarchive | pk_bankarchive | pk_bankarchive | varchar2(20) |  |  | '~' |
| 61 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(20) |
| 62 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |  |  | '~' |
| 63 | pk_curr | pk_curr | pk_curr | varchar2(20) |  |  | '~' |
| 64 | pk_entrustorg | pk_entrustorg | pk_entrustorg | varchar2(20) |  |  | '~' |
| 65 | pk_entrustorg_v | pk_entrustorg_v | pk_entrustorg_v | varchar2(20) |  |  | '~' |
| 66 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 67 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 68 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 69 | pk_outorg | pk_outorg | pk_outorg | varchar2(20) |  |  | '~' |
| 70 | pk_outorg_fbacc | pk_outorg_fbacc | pk_outorg_fbacc | varchar2(20) |  |  | '~' |
| 71 | pk_outorg_inneracc | pk_outorg_inneracc | pk_outorg_inneracc | varchar2(20) |  |  | '~' |
| 72 | pk_outorg_v | pk_outorg_v | pk_outorg_v | varchar2(20) |  |  | '~' |
| 73 | pk_outpayorg | pk_outpayorg | pk_outpayorg | varchar2(20) |  |  | '~' |
| 74 | pk_outpayorg_inneracc | pk_outpayorg_inneracc | pk_outpayorg_inneracc | varchar2(20) |  |  | '~' |
| 75 | pk_outpayorg_v | pk_outpayorg_v | pk_outpayorg_v | varchar2(20) |  |  | '~' |
| 76 | pk_register | pk_register | pk_register | varchar2(20) |  |  | '~' |
| 77 | reckonamount | reckonamount | reckonamount | number(28, 8) |
| 78 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 79 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 80 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 81 | saga_status | saga_status | saga_status | number(38, 0) |
| 82 | syscode | syscode | syscode | varchar2(50) |
| 83 | tbbmessage | tbbmessage | tbbmessage | varchar2(1025) |
| 84 | vapprovenote | vapprovenote | vapprovenote | varchar2(1024) |
| 85 | vbillno | vbillno | vbillno | varchar2(50) |
| 86 | vbillstatus | vbillstatus | vbillstatus | number(38, 0) |
| 87 | voucher | voucher | voucher | char(1) |
| 88 | vvoucherid | vvoucherid | vvoucherid | varchar2(20) |  |  | '~' |
| 89 | def1 | def1 | def1 | varchar2(101) |
| 90 | def2 | def2 | def2 | varchar2(101) |
| 91 | def3 | def3 | def3 | varchar2(101) |
| 92 | def4 | def4 | def4 | varchar2(101) |
| 93 | def5 | def5 | def5 | varchar2(101) |
| 94 | def6 | def6 | def6 | varchar2(101) |
| 95 | def7 | def7 | def7 | varchar2(101) |
| 96 | def8 | def8 | def8 | varchar2(101) |
| 97 | def9 | def9 | def9 | varchar2(101) |
| 98 | def10 | def10 | def10 | varchar2(101) |
| 99 | def11 | def11 | def11 | varchar2(101) |
| 100 | def12 | def12 | def12 | varchar2(101) |
| 101 | def13 | def13 | def13 | varchar2(101) |
| 102 | def14 | def14 | def14 | varchar2(101) |
| 103 | def15 | def15 | def15 | varchar2(101) |
| 104 | def16 | def16 | def16 | varchar2(101) |
| 105 | def17 | def17 | def17 | varchar2(101) |
| 106 | def18 | def18 | def18 | varchar2(101) |
| 107 | def19 | def19 | def19 | varchar2(101) |
| 108 | def20 | def20 | def20 | varchar2(101) |
| 109 | creationtime | creationtime | creationtime | char(19) |
| 110 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 111 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 112 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 113 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 114 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |