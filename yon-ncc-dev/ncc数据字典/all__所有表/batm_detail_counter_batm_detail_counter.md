# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6625.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_counter | pk_counter | pk_counter | char(20) | √ |
| 2 | acceptanceno | acceptanceno | acceptanceno | varchar2(50) |
| 3 | acceptperson | acceptperson | acceptperson | varchar2(50) |
| 4 | actioncode | actioncode | actioncode | varchar2(50) |
| 5 | actiondate | actiondate | actiondate | char(19) |
| 6 | actionname | actionname | actionname | varchar2(50) |
| 7 | actionperson | actionperson | actionperson | varchar2(20) |  |  | '~' |
| 8 | beginstatus | beginstatus | beginstatus | varchar2(50) |
| 9 | billtype | billtype | billtype | varchar2(50) |
| 10 | billtypename | billtypename | billtypename | varchar2(50) |
| 11 | consignbank | consignbank | consignbank | varchar2(20) |  |  | '~' |
| 12 | consignbankacc | consignbankacc | consignbankacc | varchar2(20) |  |  | '~' |
| 13 | contractno | contractno | contractno | varchar2(50) |
| 14 | decreasemode | decreasemode | decreasemode | varchar2(50) |
| 15 | direction | direction | direction | number(38, 0) |
| 16 | disableflag | disableflag | disableflag | char(1) |
| 17 | discountcharge | discountcharge | discountcharge | number(28, 8) |
| 18 | discountinterest | discountinterest | discountinterest | number(28, 8) |
| 19 | discountyrate | discountyrate | discountyrate | number(28, 8) |
| 20 | discount_account | discount_account | discount_account | varchar2(20) |  |  | '~' |
| 21 | dreturndate | dreturndate | dreturndate | char(19) |
| 22 | enddate | enddate | enddate | char(19) |
| 23 | endorsee | endorsee | endorsee | varchar2(20) |  |  | '~' |
| 24 | endorser | endorser | endorser | varchar2(20) |  |  | '~' |
| 25 | endstatus | endstatus | endstatus | varchar2(50) |
| 26 | fbmbillno | fbmbillno | fbmbillno | varchar2(50) |
| 27 | fbmbilltype | fbmbilltype | fbmbilltype | varchar2(20) |  |  | '~' |
| 28 | fbmstate | fbmstate | fbmstate | varchar2(50) |
| 29 | gatherdate | gatherdate | gatherdate | char(19) |
| 30 | glcmoney | glcmoney | glcmoney | number(28, 8) |
| 31 | glcrate | glcrate | glcrate | number(28, 8) |
| 32 | glgx | glgx | glgx | varchar2(20) |  |  | '~' |
| 33 | gllcmoney | gllcmoney | gllcmoney | number(28, 8) |
| 34 | gllcrate | gllcrate | gllcrate | number(28, 8) |
| 35 | holderacc | holderacc | holderacc | varchar2(20) |  |  | '~' |
| 36 | holdunit | holdunit | holdunit | varchar2(20) |  |  | '~' |
| 37 | initflag | initflag | initflag | char(1) |
| 38 | invoicedate | invoicedate | invoicedate | char(19) |
| 39 | invoiceunit | invoiceunit | invoiceunit | varchar2(20) |  |  | '~' |
| 40 | invoiceunitname | invoiceunitname | invoiceunitname | varchar2(50) |
| 41 | keepunit | keepunit | keepunit | varchar2(20) |  |  | '~' |
| 42 | keepunitname | keepunitname | keepunitname | varchar2(50) |
| 43 | money | money | money | number(28, 8) |
| 44 | olcmoney | olcmoney | olcmoney | number(28, 8) |
| 45 | olcrate | olcrate | olcrate | number(28, 8) |
| 46 | outputunit | outputunit | outputunit | varchar2(20) |  |  | '~' |
| 47 | paybank | paybank | paybank | varchar2(50) |
| 48 | paybankacc | paybankacc | paybankacc | varchar2(50) |
| 49 | paybilldate | paybilldate | paybilldate | char(19) |
| 50 | paybillunit | paybillunit | paybillunit | varchar2(20) |  |  | '~' |
| 51 | payunit | payunit | payunit | varchar2(50) |
| 52 | pk_action | pk_action | pk_action | char(20) | √ |
| 53 | pk_bill | pk_bill | pk_bill | char(20) | √ |
| 54 | pk_cctype | pk_cctype | pk_cctype | varchar2(50) |
| 55 | pk_curr | pk_curr | pk_curr | varchar2(20) |  |  | '~' |
| 56 | pk_discount_bank | pk_discount_bank | pk_discount_bank | varchar2(20) |  |  | '~' |
| 57 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 58 | pk_invoiceunit | pk_invoiceunit | pk_invoiceunit | varchar2(20) |  |  | '~' |
| 59 | pk_keeporg | pk_keeporg | pk_keeporg | varchar2(50) |
| 60 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 61 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 62 | pk_register | pk_register | pk_register | char(20) | √ |
| 63 | poundagemoney | poundagemoney | poundagemoney | number(28, 8) |
| 64 | receivebank | receivebank | receivebank | varchar2(50) |
| 65 | receivebankacc | receivebankacc | receivebankacc | varchar2(50) |
| 66 | receiveunit | receiveunit | receiveunit | varchar2(50) |
| 67 | registerstatus | registerstatus | registerstatus | varchar2(50) |
| 68 | returnperson | returnperson | returnperson | varchar2(20) |  |  | '~' |
| 69 | securityaccount | securityaccount | securityaccount | varchar2(20) |  |  | '~' |
| 70 | securitymoney | securitymoney | securitymoney | number(28, 8) |
| 71 | securityrate | securityrate | securityrate | number(28, 8) |
| 72 | serialnum | serialnum | serialnum | number(38, 0) |
| 73 | storagebank | storagebank | storagebank | varchar2(20) |  |  | '~' |
| 74 | storageunit | storageunit | storageunit | varchar2(20) |  |  | '~' |
| 75 | timelimit | timelimit | timelimit | varchar2(50) |
| 76 | usedccamount | usedccamount | usedccamount | number(28, 8) |
| 77 | vbillno | vbillno | vbillno | varchar2(50) |
| 78 | def1 | def1 | def1 | varchar2(101) |
| 79 | def2 | def2 | def2 | varchar2(101) |
| 80 | def3 | def3 | def3 | varchar2(101) |
| 81 | def4 | def4 | def4 | varchar2(101) |
| 82 | def5 | def5 | def5 | varchar2(101) |
| 83 | def6 | def6 | def6 | varchar2(101) |
| 84 | def7 | def7 | def7 | varchar2(101) |
| 85 | def8 | def8 | def8 | varchar2(101) |
| 86 | def9 | def9 | def9 | varchar2(101) |
| 87 | def10 | def10 | def10 | varchar2(101) |
| 88 | def11 | def11 | def11 | varchar2(101) |
| 89 | def12 | def12 | def12 | varchar2(101) |
| 90 | def13 | def13 | def13 | varchar2(101) |
| 91 | def14 | def14 | def14 | varchar2(101) |
| 92 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 93 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |