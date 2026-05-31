# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8209.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_preturn | pk_preturn | pk_preturn | char(20) | √ |
| 2 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 3 | approvetime | approvetime | approvetime | char(19) |
| 4 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 5 | commitdate | commitdate | commitdate | char(19) |
| 6 | committor | committor | committor | varchar2(20) |  |  | '~' |
| 7 | dapprovedate | dapprovedate | dapprovedate | char(19) |
| 8 | doperatedate | doperatedate | doperatedate | char(19) |
| 9 | dreturndate | dreturndate | dreturndate | char(19) |
| 10 | dvoucherdate | dvoucherdate | dvoucherdate | char(19) |
| 11 | glcmoney | glcmoney | glcmoney | number(28, 8) |
| 12 | glcrate | glcrate | glcrate | number(15, 8) |
| 13 | gllcmoney | gllcmoney | gllcmoney | number(28, 8) |
| 14 | gllcrate | gllcrate | gllcrate | number(28, 8) |
| 15 | haspassedntbcheck | haspassedntbcheck | haspassedntbcheck | char(1) |
| 16 | money | money | money | number(28, 8) |
| 17 | olcmoney | olcmoney | olcmoney | number(28, 8) |
| 18 | olcrate | olcrate | olcrate | number(15, 8) |
| 19 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(20) |  |  | '~' |
| 20 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |  |  | '~' |
| 21 | pk_curr | pk_curr | pk_curr | varchar2(20) |  |  | '~' |
| 22 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 23 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 24 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 25 | planitem | planitem | planitem | varchar2(20) |  |  | '~' |
| 26 | returnnote | returnnote | returnnote | varchar2(181) |
| 27 | returnperson | returnperson | returnperson | varchar2(20) |  |  | '~' |
| 28 | returntype | returntype | returntype | varchar2(50) |
| 29 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 30 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 31 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 32 | saga_status | saga_status | saga_status | number(38, 0) |
| 33 | tbbmessage | tbbmessage | tbbmessage | varchar2(1025) |
| 34 | transform | transform | transform | char(1) |
| 35 | unittally | unittally | unittally | char(1) |
| 36 | vapprovenote | vapprovenote | vapprovenote | varchar2(1024) |
| 37 | vbillno | vbillno | vbillno | varchar2(50) |
| 38 | vbillstatus | vbillstatus | vbillstatus | number(38, 0) |
| 39 | voucher | voucher | voucher | char(1) |
| 40 | vvoucherid | vvoucherid | vvoucherid | varchar2(20) |  |  | '~' |
| 41 | def1 | def1 | def1 | varchar2(101) |
| 42 | def2 | def2 | def2 | varchar2(101) |
| 43 | def3 | def3 | def3 | varchar2(101) |
| 44 | def4 | def4 | def4 | varchar2(101) |
| 45 | def5 | def5 | def5 | varchar2(101) |
| 46 | def6 | def6 | def6 | varchar2(101) |
| 47 | def7 | def7 | def7 | varchar2(101) |
| 48 | def8 | def8 | def8 | varchar2(101) |
| 49 | def9 | def9 | def9 | varchar2(101) |
| 50 | def10 | def10 | def10 | varchar2(101) |
| 51 | def11 | def11 | def11 | varchar2(101) |
| 52 | def12 | def12 | def12 | varchar2(101) |
| 53 | def13 | def13 | def13 | varchar2(101) |
| 54 | def14 | def14 | def14 | varchar2(101) |
| 55 | def15 | def15 | def15 | varchar2(101) |
| 56 | def16 | def16 | def16 | varchar2(101) |
| 57 | def17 | def17 | def17 | varchar2(101) |
| 58 | def18 | def18 | def18 | varchar2(101) |
| 59 | def19 | def19 | def19 | varchar2(101) |
| 60 | def20 | def20 | def20 | varchar2(101) |
| 61 | creationtime | creationtime | creationtime | char(19) |
| 62 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 63 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 64 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 65 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 66 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |