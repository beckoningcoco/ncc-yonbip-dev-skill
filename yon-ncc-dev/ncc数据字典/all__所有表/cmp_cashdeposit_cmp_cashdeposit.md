# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7542.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cashdeposit | pk_cashdeposit | pk_cashdeposit | char(20) | √ |
| 2 | approvecomment | approvecomment | approvecomment | varchar2(50) |
| 3 | approvedate | approvedate | approvedate | char(19) |
| 4 | approvetime | approvetime | approvetime | char(19) |
| 5 | billdate | billdate | billdate | char(19) |
| 6 | billmakedate | billmakedate | billmakedate | char(19) |
| 7 | billmaketime | billmaketime | billmaketime | char(19) |
| 8 | billno | billno | billno | varchar2(50) |
| 9 | billstatus | billstatus | billstatus | number(38, 0) |
| 10 | billtypecode | billtypecode | billtypecode | varchar2(50) |
| 11 | brief | brief | brief | varchar2(181) |
| 12 | commitdate | commitdate | commitdate | char(19) |
| 13 | consigndate | consigndate | consigndate | char(19) |
| 14 | consignor | consignor | consignor | varchar2(20) |  |  | '~' |
| 15 | glcmoney | glcmoney | glcmoney | number(28, 8) |
| 16 | glcrate | glcrate | glcrate | number(28, 8) |
| 17 | gllcmoney | gllcmoney | gllcmoney | number(28, 8) |
| 18 | gllcrate | gllcrate | gllcrate | number(28, 8) |
| 19 | isinneracc | isinneracc | isinneracc | char(1) |
| 20 | isreturned | isreturned | isreturned | char(1) |
| 21 | isvoucher | isvoucher | isvoucher | char(1) |
| 22 | memo | memo | memo | varchar2(181) |
| 23 | money | money | money | number(28, 8) |
| 24 | olcmoney | olcmoney | olcmoney | number(28, 8) |
| 25 | olcrate | olcrate | olcrate | number(28, 8) |
| 26 | pk_approver | pk_approver | pk_approver | varchar2(20) |  |  | '~' |
| 27 | pk_balatype | pk_balatype | pk_balatype | varchar2(20) |  |  | '~' |
| 28 | pk_bankaccount | pk_bankaccount | pk_bankaccount | varchar2(20) |  |  | '~' |
| 29 | pk_billmaker | pk_billmaker | pk_billmaker | varchar2(20) |  |  | '~' |
| 30 | pk_billtype | pk_billtype | pk_billtype | varchar2(20) |  |  | '~' |
| 31 | pk_busiflow | pk_busiflow | pk_busiflow | varchar2(20) |  |  | '~' |
| 32 | pk_cashaccount | pk_cashaccount | pk_cashaccount | varchar2(20) |  |  | '~' |
| 33 | pk_commiter | pk_commiter | pk_commiter | varchar2(20) |  |  | '~' |
| 34 | pk_creator | pk_creator | pk_creator | varchar2(20) |  |  | '~' |
| 35 | pk_currency | pk_currency | pk_currency | varchar2(20) |  |  | '~' |
| 36 | pk_executor | pk_executor | pk_executor | varchar2(20) |  |  | '~' |
| 37 | pk_fundbankaccount | pk_fundbankaccount | pk_fundbankaccount | varchar2(20) |  |  | '~' |
| 38 | pk_fundorg | pk_fundorg | pk_fundorg | varchar2(20) |  |  | '~' |
| 39 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 40 | pk_modifier | pk_modifier | pk_modifier | varchar2(20) |  |  | '~' |
| 41 | pk_org | pk_org | pk_org | varchar2(20) |
| 42 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 43 | pk_srcbill | pk_srcbill | pk_srcbill | varchar2(50) |
| 44 | pk_srcbilltype | pk_srcbilltype | pk_srcbilltype | varchar2(20) |  |  | '~' |
| 45 | returnreason | returnreason | returnreason | varchar2(181) |
| 46 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 47 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 48 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 49 | saga_status | saga_status | saga_status | number(38, 0) |
| 50 | settledate | settledate | settledate | char(19) |
| 51 | settlestatus | settlestatus | settlestatus | number(38, 0) |
| 52 | srcbillno | srcbillno | srcbillno | varchar2(50) |
| 53 | srcbilltypecode | srcbilltypecode | srcbilltypecode | varchar2(50) |  |  | '~' |
| 54 | systemcode | systemcode | systemcode | varchar2(20) |  |  | '~' |
| 55 | vbillstatus | vbillstatus | vbillstatus | number(38, 0) |
| 56 | def1 | def1 | def1 | varchar2(101) |
| 57 | def2 | def2 | def2 | varchar2(101) |
| 58 | def3 | def3 | def3 | varchar2(101) |
| 59 | def4 | def4 | def4 | varchar2(101) |
| 60 | def5 | def5 | def5 | varchar2(101) |
| 61 | def6 | def6 | def6 | varchar2(101) |
| 62 | def7 | def7 | def7 | varchar2(101) |
| 63 | def8 | def8 | def8 | varchar2(101) |
| 64 | def9 | def9 | def9 | varchar2(101) |
| 65 | def10 | def10 | def10 | varchar2(101) |
| 66 | def11 | def11 | def11 | varchar2(101) |
| 67 | def12 | def12 | def12 | varchar2(101) |
| 68 | def13 | def13 | def13 | varchar2(101) |
| 69 | def14 | def14 | def14 | varchar2(101) |
| 70 | def15 | def15 | def15 | varchar2(101) |
| 71 | def16 | def16 | def16 | varchar2(101) |
| 72 | def17 | def17 | def17 | varchar2(101) |
| 73 | def18 | def18 | def18 | varchar2(101) |
| 74 | def19 | def19 | def19 | varchar2(101) |
| 75 | def20 | def20 | def20 | varchar2(101) |
| 76 | creationtime | creationtime | creationtime | char(19) |
| 77 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 78 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 79 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |