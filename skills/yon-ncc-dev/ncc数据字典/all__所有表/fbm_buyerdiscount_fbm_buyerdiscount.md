# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8184.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_buyerdiscount | pk_buyerdiscount | pk_buyerdiscount | char(20) | √ |
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
| 12 | buyerinterest | buyerinterest | buyerinterest | char(1) |
| 13 | commitdate | commitdate | commitdate | char(19) |
| 14 | committor | committor | committor | varchar2(20) |  |  | '~' |
| 15 | dapprovedate | dapprovedate | dapprovedate | char(19) |
| 16 | ddiscountdate | ddiscountdate | ddiscountdate | char(19) |
| 17 | discountdelaydaynum | discountdelaydaynum | discountdelaydaynum | number(38, 0) |
| 18 | discountinterest | discountinterest | discountinterest | number(28, 8) |
| 19 | discountyrate | discountyrate | discountyrate | number(28, 8) |
| 20 | discount_account | discount_account | discount_account | varchar2(20) |  |  | '~' |
| 21 | doperatedate | doperatedate | doperatedate | char(19) |
| 22 | dvoucherdate | dvoucherdate | dvoucherdate | char(19) |
| 23 | enddate | enddate | enddate | char(19) |
| 24 | fbmbillno | fbmbillno | fbmbillno | varchar2(50) |
| 25 | glcchargemoney | glcchargemoney | glcchargemoney | number(28, 8) |
| 26 | glcinterestmoney | glcinterestmoney | glcinterestmoney | number(28, 8) |
| 27 | glcmoney | glcmoney | glcmoney | number(28, 8) |
| 28 | glcrate | glcrate | glcrate | number(15, 8) |
| 29 | gllcchargemoney | gllcchargemoney | gllcchargemoney | number(28, 8) |
| 30 | gllcinterestmoney | gllcinterestmoney | gllcinterestmoney | number(28, 8) |
| 31 | gllcmoney | gllcmoney | gllcmoney | number(28, 8) |
| 32 | gllcrate | gllcrate | gllcrate | number(28, 8) |
| 33 | haspassedntbcheck | haspassedntbcheck | haspassedntbcheck | char(1) |
| 34 | holdunit | holdunit | holdunit | varchar2(20) |  |  | '~' |
| 35 | interestbyfundorg | interestbyfundorg | interestbyfundorg | char(1) |
| 36 | interestplanitem | interestplanitem | interestplanitem | varchar2(20) |  |  | '~' |
| 37 | invoicedate | invoicedate | invoicedate | char(19) |
| 38 | isagent | isagent | isagent | char(1) |
| 39 | isorgpay | isorgpay | isorgpay | char(1) |
| 40 | money | money | money | number(28, 8) |
| 41 | note | note | note | varchar2(272) |
| 42 | olcchargemoney | olcchargemoney | olcchargemoney | number(28, 8) |
| 43 | olcinterestmoney | olcinterestmoney | olcinterestmoney | number(28, 8) |
| 44 | olcmoney | olcmoney | olcmoney | number(28, 8) |
| 45 | olcrate | olcrate | olcrate | number(15, 8) |
| 46 | opbilltype | opbilltype | opbilltype | varchar2(30) |
| 47 | paybank | paybank | paybank | varchar2(20) |  |  | '~' |
| 48 | paybankacc | paybankacc | paybankacc | varchar2(20) |  |  | '~' |
| 49 | payunit | payunit | payunit | varchar2(20) |  |  | '~' |
| 50 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(20) |  |  | '~' |
| 51 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |
| 52 | pk_costcenter | pk_costcenter | pk_costcenter | varchar2(20) |
| 53 | pk_curr | pk_curr | pk_curr | varchar2(20) |  |  | '~' |
| 54 | pk_discount_bank | pk_discount_bank | pk_discount_bank | varchar2(20) |  |  | '~' |
| 55 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 56 | pk_inbalaacc | pk_inbalaacc | pk_inbalaacc | varchar2(20) |  |  | '~' |
| 57 | pk_infundorg | pk_infundorg | pk_infundorg | varchar2(20) |  |  | '~' |
| 58 | pk_infundorg_v | pk_infundorg_v | pk_infundorg_v | varchar2(20) |  |  | '~' |
| 59 | pk_inreckonacc | pk_inreckonacc | pk_inreckonacc | varchar2(20) |  |  | '~' |
| 60 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 61 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 62 | pk_outfundorg | pk_outfundorg | pk_outfundorg | varchar2(20) |  |  | '~' |
| 63 | pk_outfundorg_v | pk_outfundorg_v | pk_outfundorg_v | varchar2(20) |  |  | '~' |
| 64 | pk_outreckonacc | pk_outreckonacc | pk_outreckonacc | varchar2(20) |  |  | '~' |
| 65 | pk_payfundorg | pk_payfundorg | pk_payfundorg | varchar2(20) |
| 66 | pk_payfundorg_v | pk_payfundorg_v | pk_payfundorg_v | varchar2(20) |
| 67 | pk_register | pk_register | pk_register | varchar2(20) |  |  | '~' |
| 68 | pk_signback | pk_signback | pk_signback | varchar2(50) |
| 69 | pk_signorg | pk_signorg | pk_signorg | varchar2(20) |  |  | '~' |
| 70 | pk_signorg_v | pk_signorg_v | pk_signorg_v | varchar2(20) |  |  | '~' |
| 71 | pk_srcbill | pk_srcbill | pk_srcbill | varchar2(50) |
| 72 | pk_srcbilltype | pk_srcbilltype | pk_srcbilltype | varchar2(50) |
| 73 | pk_usebillorg | pk_usebillorg | pk_usebillorg | varchar2(20) |  |  | '~' |
| 74 | pk_usebillorg_v | pk_usebillorg_v | pk_usebillorg_v | varchar2(20) |  |  | '~' |
| 75 | ratedaynum | ratedaynum | ratedaynum | number(38, 0) |
| 76 | receivebankacc | receivebankacc | receivebankacc | varchar2(20) |  |  | '~' |
| 77 | receiveunit | receiveunit | receiveunit | varchar2(20) |  |  | '~' |
| 78 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 79 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 80 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 81 | saga_status | saga_status | saga_status | number(38, 0) |
| 82 | tallydate | tallydate | tallydate | char(19) |
| 83 | tallyflag | tallyflag | tallyflag | char(1) |
| 84 | tallyor | tallyor | tallyor | varchar2(20) |  |  | '~' |
| 85 | tbbmessage | tbbmessage | tbbmessage | varchar2(1025) |
| 86 | vapprovenote | vapprovenote | vapprovenote | varchar2(1024) |
| 87 | vbillno | vbillno | vbillno | varchar2(50) |
| 88 | vbillstatus | vbillstatus | vbillstatus | number(38, 0) |
| 89 | voucher | voucher | voucher | char(1) |
| 90 | vvoucherid | vvoucherid | vvoucherid | varchar2(20) |  |  | '~' |
| 91 | def1 | def1 | def1 | varchar2(101) |
| 92 | def2 | def2 | def2 | varchar2(101) |
| 93 | def3 | def3 | def3 | varchar2(101) |
| 94 | def4 | def4 | def4 | varchar2(101) |
| 95 | def5 | def5 | def5 | varchar2(101) |
| 96 | def6 | def6 | def6 | varchar2(101) |
| 97 | def7 | def7 | def7 | varchar2(101) |
| 98 | def8 | def8 | def8 | varchar2(101) |
| 99 | def9 | def9 | def9 | varchar2(101) |
| 100 | def10 | def10 | def10 | varchar2(101) |
| 101 | def11 | def11 | def11 | varchar2(101) |
| 102 | def12 | def12 | def12 | varchar2(101) |
| 103 | def13 | def13 | def13 | varchar2(101) |
| 104 | def14 | def14 | def14 | varchar2(101) |
| 105 | def15 | def15 | def15 | varchar2(101) |
| 106 | def16 | def16 | def16 | varchar2(101) |
| 107 | def17 | def17 | def17 | varchar2(101) |
| 108 | def18 | def18 | def18 | varchar2(101) |
| 109 | def19 | def19 | def19 | varchar2(101) |
| 110 | def20 | def20 | def20 | varchar2(101) |
| 111 | creationtime | creationtime | creationtime | char(19) |
| 112 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 113 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 114 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 115 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 116 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |