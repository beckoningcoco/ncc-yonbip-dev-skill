# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8191.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_action | pk_action | pk_action | char(20) | √ |
| 2 | actioncode | actioncode | actioncode | varchar2(50) |
| 3 | actiondate | actiondate | actiondate | char(19) |
| 4 | actionname | actionname | actionname | varchar2(50) |
| 5 | actionperson | actionperson | actionperson | varchar2(20) |  |  | '~' |
| 6 | beginstatus | beginstatus | beginstatus | varchar2(50) |
| 7 | billtype | billtype | billtype | varchar2(50) |
| 8 | billtypename | billtypename | billtypename | varchar2(50) |
| 9 | consignbank | consignbank | consignbank | varchar2(20) |  |  | '~' |
| 10 | consignbankacc | consignbankacc | consignbankacc | varchar2(20) |  |  | '~' |
| 11 | creditunit | creditunit | creditunit | varchar2(50) |
| 12 | debitunit | debitunit | debitunit | varchar2(20) |  |  | '~' |
| 13 | discountcharge | discountcharge | discountcharge | number(28, 8) |
| 14 | discountinterest | discountinterest | discountinterest | number(28, 8) |
| 15 | discountyrate | discountyrate | discountyrate | number(28, 8) |
| 16 | discount_account | discount_account | discount_account | varchar2(20) |  |  | '~' |
| 17 | dreturndate | dreturndate | dreturndate | char(19) |
| 18 | endorsee | endorsee | endorsee | varchar2(20) |  |  | '~' |
| 19 | endorser | endorser | endorser | varchar2(20) |  |  | '~' |
| 20 | endstatus | endstatus | endstatus | varchar2(50) |
| 21 | glcmoney | glcmoney | glcmoney | number(28, 8) |
| 22 | glcrate | glcrate | glcrate | number(28, 8) |
| 23 | gllcmoney | gllcmoney | gllcmoney | number(28, 8) |
| 24 | gllcrate | gllcrate | gllcrate | number(28, 8) |
| 25 | holderacc | holderacc | holderacc | varchar2(20) |  |  | '~' |
| 26 | holdunit | holdunit | holdunit | varchar2(20) |  |  | '~' |
| 27 | impawnmode | impawnmode | impawnmode | varchar2(50) |
| 28 | money | money | money | number(28, 8) |
| 29 | note | note | note | varchar2(181) |
| 30 | olcmoney | olcmoney | olcmoney | number(28, 8) |
| 31 | olcrate | olcrate | olcrate | number(28, 8) |
| 32 | outputunit | outputunit | outputunit | varchar2(20) |  |  | '~' |
| 33 | paybillunit | paybillunit | paybillunit | varchar2(20) |  |  | '~' |
| 34 | pk_bill | pk_bill | pk_bill | char(20) |
| 35 | pk_discount_bank | pk_discount_bank | pk_discount_bank | varchar2(20) |  |  | '~' |
| 36 | pk_register | pk_register | pk_register | char(20) |
| 37 | preturntype | preturntype | preturntype | varchar2(50) |
| 38 | returnperson | returnperson | returnperson | varchar2(20) |  |  | '~' |
| 39 | rreturntype | rreturntype | rreturntype | varchar2(50) |
| 40 | securityaccount | securityaccount | securityaccount | varchar2(20) |  |  | '~' |
| 41 | securitymoney | securitymoney | securitymoney | number(28, 8) |
| 42 | securityrate | securityrate | securityrate | number(28, 8) |
| 43 | serialnum | serialnum | serialnum | number(38, 0) |
| 44 | storagebank | storagebank | storagebank | varchar2(20) |  |  | '~' |
| 45 | storageunit | storageunit | storageunit | varchar2(20) |  |  | '~' |
| 46 | vbillno | vbillno | vbillno | varchar2(50) |
| 47 | def1 | def1 | def1 | varchar2(101) |
| 48 | def2 | def2 | def2 | varchar2(101) |
| 49 | def3 | def3 | def3 | varchar2(101) |
| 50 | def4 | def4 | def4 | varchar2(101) |
| 51 | def5 | def5 | def5 | varchar2(101) |
| 52 | def6 | def6 | def6 | varchar2(101) |
| 53 | def7 | def7 | def7 | varchar2(101) |
| 54 | def8 | def8 | def8 | varchar2(101) |
| 55 | def9 | def9 | def9 | varchar2(101) |
| 56 | def10 | def10 | def10 | varchar2(101) |
| 57 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 58 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |