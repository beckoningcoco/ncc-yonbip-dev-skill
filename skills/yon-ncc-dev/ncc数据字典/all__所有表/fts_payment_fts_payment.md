# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8403.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_payment | pk_payment | pk_payment | varchar2(20) | √ |
| 2 | acceptdate | acceptdate | acceptdate | char(19) |
| 3 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 4 | auditdate | auditdate | auditdate | char(19) |
| 5 | auditsignature | auditsignature | auditsignature | varchar2(20) |  |  | '~' |
| 6 | audittime | audittime | audittime | char(19) |
| 7 | backdate | backdate | backdate | char(19) |
| 8 | backtime | backtime | backtime | char(19) |
| 9 | backuser | backuser | backuser | varchar2(20) |  |  | '~' |
| 10 | backxjreason | backxjreason | backxjreason | varchar2(181) |
| 11 | billdate | billdate | billdate | char(19) |
| 12 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 13 | billsignature | billsignature | billsignature | varchar2(20) |  |  | '~' |
| 14 | billstatus | billstatus | billstatus | number(38, 0) |
| 15 | billtime | billtime | billtime | char(19) |
| 16 | brief | brief | brief | varchar2(272) |
| 17 | businessno | businessno | businessno | varchar2(50) |
| 18 | clearaccountdate | clearaccountdate | clearaccountdate | char(19) |
| 19 | cleardate | cleardate | cleardate | char(19) |
| 20 | clearinacctype | clearinacctype | clearinacctype | varchar2(50) |
| 21 | clearinszdirection | clearinszdirection | clearinszdirection | varchar2(50) |
| 22 | clearoutacctype | clearoutacctype | clearoutacctype | varchar2(50) |
| 23 | clearoutszdirection | clearoutszdirection | clearoutszdirection | varchar2(50) |
| 24 | consigndate | consigndate | consigndate | char(19) |
| 25 | consigner | consigner | consigner | varchar2(20) |  |  | '~' |
| 26 | consigntime | consigntime | consigntime | char(19) |
| 27 | decidedate | decidedate | decidedate | char(19) |
| 28 | decidesignature | decidesignature | decidesignature | varchar2(20) |  |  | '~' |
| 29 | decidetime | decidetime | decidetime | char(19) |
| 30 | decideuser | decideuser | decideuser | varchar2(20) |  |  | '~' |
| 31 | decidewfstatus | decidewfstatus | decidewfstatus | varchar2(50) |
| 32 | deliverdate | deliverdate | deliverdate | char(19) |
| 33 | deliversignature | deliversignature | deliversignature | varchar2(20) |  |  | '~' |
| 34 | delivertime | delivertime | delivertime | char(19) |
| 35 | delivertype | delivertype | delivertype | varchar2(30) |
| 36 | deliveruser | deliveruser | deliveruser | varchar2(20) |  |  | '~' |
| 37 | deliverwfstatus | deliverwfstatus | deliverwfstatus | varchar2(50) |
| 38 | destdeliverdirection | destdeliverdirection | destdeliverdirection | varchar2(30) |
| 39 | exprice | exprice | exprice | number(28, 8) |
| 40 | glcexdiffmnt | glcexdiffmnt | glcexdiffmnt | number(28, 8) |
| 41 | glcpaytotalmnt | glcpaytotalmnt | glcpaytotalmnt | number(28, 8) |
| 42 | glctotalamount | glctotalamount | glctotalamount | number(28, 8) |
| 43 | gllcexdiffmnt | gllcexdiffmnt | gllcexdiffmnt | number(28, 8) |
| 44 | gllcpaytotalmnt | gllcpaytotalmnt | gllcpaytotalmnt | number(28, 8) |
| 45 | gllctotalamount | gllctotalamount | gllctotalamount | number(28, 8) |
| 46 | iscommitbankreal | iscommitbankreal | iscommitbankreal | char(1) |
| 47 | iscommitinnerreal | iscommitinnerreal | iscommitinnerreal | char(1) |
| 48 | isdeliverback | isdeliverback | isdeliverback | char(1) |
| 49 | isexchangepay | isexchangepay | isexchangepay | char(1) |
| 50 | isinform | isinform | isinform | char(1) |
| 51 | ispayroll | ispayroll | ispayroll | char(1) |
| 52 | isreimbursement | isreimbursement | isreimbursement | char(1) |
| 53 | isreversebustype | isreversebustype | isreversebustype | char(1) |
| 54 | issimple | issimple | issimple | char(1) |
| 55 | isunitback | isunitback | isunitback | char(1) |
| 56 | makevdate | makevdate | makevdate | char(19) |
| 57 | makevtime | makevtime | makevtime | char(19) |
| 58 | makevuser | makevuser | makevuser | varchar2(20) |  |  | '~' |
| 59 | memo | memo | memo | varchar2(272) |
| 60 | olcexdiffmnt | olcexdiffmnt | olcexdiffmnt | number(28, 8) |
| 61 | olcpaytotalmnt | olcpaytotalmnt | olcpaytotalmnt | number(28, 8) |
| 62 | olctotalamount | olctotalamount | olctotalamount | number(28, 8) |
| 63 | paytotalmnt | paytotalmnt | paytotalmnt | number(28, 8) |
| 64 | paywfstatus | paywfstatus | paywfstatus | varchar2(50) |
| 65 | pk_billtype | pk_billtype | pk_billtype | varchar2(21) |
| 66 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |  |  | '~' |
| 67 | pk_clearinaccount | pk_clearinaccount | pk_clearinaccount | varchar2(20) |  |  | '~' |
| 68 | pk_clearinplan | pk_clearinplan | pk_clearinplan | varchar2(20) |  |  | '~' |
| 69 | pk_clearoutaccount | pk_clearoutaccount | pk_clearoutaccount | varchar2(20) |  |  | '~' |
| 70 | pk_clearoutplan | pk_clearoutplan | pk_clearoutplan | varchar2(20) |  |  | '~' |
| 71 | pk_costcenter | pk_costcenter | pk_costcenter | varchar2(20) |  |  | '~' |
| 72 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) | √ |
| 73 | pk_delgoorg | pk_delgoorg | pk_delgoorg | varchar2(20) |  |  | '~' |
| 74 | pk_delsourceorg | pk_delsourceorg | pk_delsourceorg | varchar2(20) |  |  | '~' |
| 75 | pk_fundpayorg | pk_fundpayorg | pk_fundpayorg | varchar2(20) |
| 76 | pk_fundpayorg_v | pk_fundpayorg_v | pk_fundpayorg_v | varchar2(20) |  |  | '~' |
| 77 | pk_gaincenter | pk_gaincenter | pk_gaincenter | varchar2(20) |  |  | '~' |
| 78 | pk_group | pk_group | pk_group | varchar2(20) | √ |
| 79 | pk_org | pk_org | pk_org | varchar2(20) | √ |
| 80 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 81 | pk_original | pk_original | pk_original | varchar2(20) |  |  | '~' |
| 82 | pk_paycurrtype | pk_paycurrtype | pk_paycurrtype | varchar2(20) |
| 83 | pk_srcbill | pk_srcbill | pk_srcbill | varchar2(20) |  |  | '~' |
| 84 | pk_transactorg | pk_transactorg | pk_transactorg | varchar2(20) |  |  | '~' |
| 85 | pk_transactorg_v | pk_transactorg_v | pk_transactorg_v | varchar2(20) |  |  | '~' |
| 86 | pk_vsourcebilltype | pk_vsourcebilltype | pk_vsourcebilltype | varchar2(21) |
| 87 | pk_vsourcebilltypeid | pk_vsourcebilltypeid | pk_vsourcebilltypeid | varchar2(20) |  |  | '~' |
| 88 | pk_vsourcedealtype | pk_vsourcedealtype | pk_vsourcedealtype | varchar2(21) |
| 89 | pk_vsourcedealtypeid | pk_vsourcedealtypeid | pk_vsourcedealtypeid | varchar2(20) |  |  | '~' |
| 90 | recmodul | recmodul | recmodul | varchar2(30) |
| 91 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 92 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 93 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 94 | saga_status | saga_status | saga_status | number(38, 0) |
| 95 | sjbackreason | sjbackreason | sjbackreason | varchar2(181) |
| 96 | srcdeliverdirection | srcdeliverdirection | srcdeliverdirection | varchar2(30) |
| 97 | strokes | strokes | strokes | number(38, 0) |
| 98 | submitdate | submitdate | submitdate | char(19) |
| 99 | submitsignature | submitsignature | submitsignature | varchar2(20) |  |  | '~' |
| 100 | submittime | submittime | submittime | char(19) |
| 101 | submituser | submituser | submituser | varchar2(20) |  |  | '~' |
| 102 | totalamount | totalamount | totalamount | number(28, 8) |
| 103 | unitapprover | unitapprover | unitapprover | varchar2(20) |  |  | '~' |
| 104 | unitbillmaker | unitbillmaker | unitbillmaker | varchar2(20) |  |  | '~' |
| 105 | vapprovenote | vapprovenote | vapprovenote | varchar2(1024) |
| 106 | vbillno | vbillno | vbillno | varchar2(50) |
| 107 | vbillstatus | vbillstatus | vbillstatus | number(38, 0) |
| 108 | voucherflag | voucherflag | voucherflag | char(1) |
| 109 | vsourcebustype | vsourcebustype | vsourcebustype | varchar2(30) |
| 110 | vsourcecode | vsourcecode | vsourcecode | varchar2(50) |
| 111 | wfsubmituser | wfsubmituser | wfsubmituser | varchar2(20) |  |  | '~' |
| 112 | vuserdef1 | vuserdef1 | vuserdef1 | varchar2(101) |
| 113 | vuserdef2 | vuserdef2 | vuserdef2 | varchar2(101) |
| 114 | vuserdef3 | vuserdef3 | vuserdef3 | varchar2(101) |
| 115 | vuserdef4 | vuserdef4 | vuserdef4 | varchar2(101) |
| 116 | vuserdef5 | vuserdef5 | vuserdef5 | varchar2(101) |
| 117 | vuserdef6 | vuserdef6 | vuserdef6 | varchar2(101) |
| 118 | vuserdef7 | vuserdef7 | vuserdef7 | varchar2(101) |
| 119 | vuserdef8 | vuserdef8 | vuserdef8 | varchar2(101) |
| 120 | vuserdef9 | vuserdef9 | vuserdef9 | varchar2(101) |
| 121 | vuserdef10 | vuserdef10 | vuserdef10 | varchar2(101) |
| 122 | creationtime | creationtime | creationtime | char(19) |
| 123 | creator | creator | creator | char(20) |
| 124 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 125 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 126 | modifier | modifier | modifier | char(20) |
| 127 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |