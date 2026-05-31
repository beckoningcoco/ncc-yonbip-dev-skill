# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8219.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_storage | pk_storage | pk_storage | char(20) | √ |
| 2 | approvemodecode | approvemodecode | approvemodecode | varchar2(50) |
| 3 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 4 | approvetime | approvetime | approvetime | char(19) |
| 5 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 6 | billpoolbusicode | billpoolbusicode | billpoolbusicode | varchar2(50) |
| 7 | billpoolflag | billpoolflag | billpoolflag | char(1) |
| 8 | code | code | code | varchar2(1024) |
| 9 | commitdate | commitdate | commitdate | char(19) |
| 10 | committor | committor | committor | varchar2(20) |  |  | '~' |
| 11 | credtypecode | credtypecode | credtypecode | varchar2(50) |
| 12 | dapprovedate | dapprovedate | dapprovedate | char(19) |
| 13 | disabledate | disabledate | disabledate | char(19) |
| 14 | disableflag | disableflag | disableflag | char(1) |
| 15 | disablenote | disablenote | disablenote | varchar2(200) |
| 16 | disableuser | disableuser | disableuser | varchar2(20) |  |  | '~' |
| 17 | doperatedate | doperatedate | doperatedate | char(19) |
| 18 | dvoucherdate | dvoucherdate | dvoucherdate | char(19) |
| 19 | extractercode | extractercode | extractercode | varchar2(50) |
| 20 | extracteridcode | extracteridcode | extracteridcode | varchar2(50) |
| 21 | extractertelphone | extractertelphone | extractertelphone | varchar2(50) |
| 22 | glcrate | glcrate | glcrate | number(15, 8) |
| 23 | glcsummoney | glcsummoney | glcsummoney | number(28, 8) |
| 24 | gllcrate | gllcrate | gllcrate | number(28, 8) |
| 25 | gllcsummoney | gllcsummoney | gllcsummoney | number(28, 8) |
| 26 | haspassedntbcheck | haspassedntbcheck | haspassedntbcheck | char(1) |
| 27 | initflag | initflag | initflag | char(1) |
| 28 | inputdate | inputdate | inputdate | char(19) |
| 29 | inputperson | inputperson | inputperson | varchar2(20) |  |  | '~' |
| 30 | inputunit | inputunit | inputunit | varchar2(20) |  |  | '~' |
| 31 | memo | memo | memo | varchar2(181) |
| 32 | note | note | note | varchar2(200) |
| 33 | notetype | notetype | notetype | varchar2(20) |
| 34 | olcrate | olcrate | olcrate | number(15, 8) |
| 35 | olcsummoney | olcsummoney | olcsummoney | number(28, 8) |
| 36 | onlinebankflag | onlinebankflag | onlinebankflag | char(1) |
| 37 | outputdate | outputdate | outputdate | char(19) |
| 38 | outputperson | outputperson | outputperson | varchar2(20) |  |  | '~' |
| 39 | outputunit | outputunit | outputunit | varchar2(20) |  |  | '~' |
| 40 | pk_bankdoc | pk_bankdoc | pk_bankdoc | varchar2(20) |  |  | '~' |
| 41 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(20) |  |  | '~' |
| 42 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |  |  | '~' |
| 43 | pk_curr | pk_curr | pk_curr | varchar2(20) |  |  | '~' |
| 44 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 45 | pk_occupyctmanage | pk_occupyctmanage | pk_occupyctmanage | varchar2(20) |  |  | '~' |
| 46 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 47 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 48 | pk_srcbill | pk_srcbill | pk_srcbill | varchar2(50) |
| 49 | pledgerate | pledgerate | pledgerate | number(28, 2) |
| 50 | quotamanage | quotamanage | quotamanage | varchar2(50) |
| 51 | returndate | returndate | returndate | char(19) |
| 52 | returnperson | returnperson | returnperson | varchar2(20) |  |  | '~' |
| 53 | returnreason | returnreason | returnreason | varchar2(181) |
| 54 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 55 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 56 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 57 | saga_status | saga_status | saga_status | number(38, 0) |
| 58 | summoney | summoney | summoney | number(28, 8) |
| 59 | tasktype | tasktype | tasktype | varchar2(50) |
| 60 | tbbmessage | tbbmessage | tbbmessage | varchar2(1025) |
| 61 | unitplanitem | unitplanitem | unitplanitem | varchar2(20) |  |  | '~' |
| 62 | vapprovenote | vapprovenote | vapprovenote | varchar2(1024) |
| 63 | vbillno | vbillno | vbillno | varchar2(50) |
| 64 | vbillstatus | vbillstatus | vbillstatus | number(38, 0) |
| 65 | voucher | voucher | voucher | char(1) |
| 66 | vvoucherid | vvoucherid | vvoucherid | varchar2(20) |  |  | '~' |
| 67 | def1 | def1 | def1 | varchar2(101) |
| 68 | def2 | def2 | def2 | varchar2(101) |
| 69 | def3 | def3 | def3 | varchar2(101) |
| 70 | def4 | def4 | def4 | varchar2(101) |
| 71 | def5 | def5 | def5 | varchar2(101) |
| 72 | def6 | def6 | def6 | varchar2(101) |
| 73 | def7 | def7 | def7 | varchar2(101) |
| 74 | def8 | def8 | def8 | varchar2(101) |
| 75 | def9 | def9 | def9 | varchar2(101) |
| 76 | def10 | def10 | def10 | varchar2(101) |
| 77 | def11 | def11 | def11 | varchar2(101) |
| 78 | def12 | def12 | def12 | varchar2(101) |
| 79 | def13 | def13 | def13 | varchar2(101) |
| 80 | def14 | def14 | def14 | varchar2(101) |
| 81 | def15 | def15 | def15 | varchar2(101) |
| 82 | def16 | def16 | def16 | varchar2(101) |
| 83 | def17 | def17 | def17 | varchar2(101) |
| 84 | def18 | def18 | def18 | varchar2(101) |
| 85 | def19 | def19 | def19 | varchar2(101) |
| 86 | def20 | def20 | def20 | varchar2(101) |
| 87 | creationtime | creationtime | creationtime | char(19) |
| 88 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 89 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 90 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 91 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 92 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |