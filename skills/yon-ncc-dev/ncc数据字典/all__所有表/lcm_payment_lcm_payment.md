# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9774.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_payment | pk_payment | pk_payment | char(20) | √ |
| 2 | approvedate | approvedate | approvedate | char(19) |
| 3 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 4 | arrival_srccode | arrival_srccode | arrival_srccode | varchar2(50) |
| 5 | billmakedate | billmakedate | billmakedate | char(19) |
| 6 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 7 | buyglcamt | buyglcamt | buyglcamt | number(28, 8) |
| 8 | buygllcamt | buygllcamt | buygllcamt | number(28, 8) |
| 9 | buylcamt | buylcamt | buylcamt | number(28, 8) |
| 10 | buyremittanceamt | buyremittanceamt | buyremittanceamt | number(28, 8) |
| 11 | cctlcrate | cctlcrate | cctlcrate | number(28, 8) |
| 12 | commitdate | commitdate | commitdate | char(19) |
| 13 | committor | committor | committor | varchar2(20) |  |  | '~' |
| 14 | delegatesendamt | delegatesendamt | delegatesendamt | number(28, 8) |
| 15 | depositaccount | depositaccount | depositaccount | varchar2(20) |  |  | '~' |
| 16 | depositpayamt | depositpayamt | depositpayamt | number(28, 8) |
| 17 | depositpayglcamt | depositpayglcamt | depositpayglcamt | number(28, 8) |
| 18 | depositpaygllcamt | depositpaygllcamt | depositpaygllcamt | number(28, 8) |
| 19 | depositpaylcamt | depositpaylcamt | depositpaylcamt | number(28, 8) |
| 20 | depositpaylcmamt | depositpaylcmamt | depositpaylcmamt | number(28, 8) |
| 21 | depositpaylcmglcamt | depositpaylcmglcamt | depositpaylcmglcamt | number(28, 8) |
| 22 | depositpaylcmgllcamt | depositpaylcmgllcamt | depositpaylcmgllcamt | number(28, 8) |
| 23 | depositpaylcmlcamt | depositpaylcmlcamt | depositpaylcmlcamt | number(28, 8) |
| 24 | depositprofit_loss | depositprofit_loss | depositprofit_loss | number(28, 8) |
| 25 | deposittglcrate | deposittglcrate | deposittglcrate | number(28, 8) |
| 26 | deposittgllcrate | deposittgllcrate | deposittgllcrate | number(28, 8) |
| 27 | deposittolcrate | deposittolcrate | deposittolcrate | number(28, 8) |
| 28 | exchangerate | exchangerate | exchangerate | number(28, 8) |
| 29 | free_ccamount | free_ccamount | free_ccamount | number(28, 8) |
| 30 | glcdelegatesendamt | glcdelegatesendamt | glcdelegatesendamt | number(28, 8) |
| 31 | glcpoundageamount | glcpoundageamount | glcpoundageamount | number(28, 8) |
| 32 | glcrate | glcrate | glcrate | number(28, 8) |
| 33 | gllcdelegatesendamt | gllcdelegatesendamt | gllcdelegatesendamt | number(28, 8) |
| 34 | gllcpoundageamount | gllcpoundageamount | gllcpoundageamount | number(28, 8) |
| 35 | gllcrate | gllcrate | gllcrate | number(28, 8) |
| 36 | guaranteetype | guaranteetype | guaranteetype | number(38, 0) |
| 37 | haspassedntbcheck | haspassedntbcheck | haspassedntbcheck | char(1) |
| 38 | isinitial | isinitial | isinitial | char(1) |
| 39 | isoverflow | isoverflow | isoverflow | char(1) |
| 40 | isvoucher | isvoucher | isvoucher | char(1) |
| 41 | lcbalance | lcbalance | lcbalance | number(28, 8) |
| 42 | lcmamt | lcmamt | lcmamt | number(28, 8) |
| 43 | lowscale | lowscale | lowscale | number(28, 8) |
| 44 | modifydate | modifydate | modifydate | char(19) |
| 45 | ntbmessage | ntbmessage | ntbmessage | varchar2(50) |
| 46 | olcdelegatesendamt | olcdelegatesendamt | olcdelegatesendamt | number(28, 8) |
| 47 | olcpoundageamount | olcpoundageamount | olcpoundageamount | number(28, 8) |
| 48 | overscale | overscale | overscale | number(28, 8) |
| 49 | pay | pay | pay | number(28, 8) |
| 50 | payamt | payamt | payamt | number(28, 8) |
| 51 | paydate | paydate | paydate | char(19) |
| 52 | pk_arrival | pk_arrival | pk_arrival | varchar2(20) |  |  | '~' |
| 53 | pk_arrival_srcbill | pk_arrival_srcbill | pk_arrival_srcbill | varchar2(50) |
| 54 | pk_bank_issuing | pk_bank_issuing | pk_bank_issuing | varchar2(20) |  |  | '~' |
| 55 | pk_billtype | pk_billtype | pk_billtype | varchar2(20) |  |  | '~' |
| 56 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(50) |
| 57 | pk_busipersion | pk_busipersion | pk_busipersion | varchar2(20) |  |  | '~' |
| 58 | pk_ccprotocol | pk_ccprotocol | pk_ccprotocol | varchar2(20) |  |  | '~' |
| 59 | pk_cctcurrtype | pk_cctcurrtype | pk_cctcurrtype | varchar2(20) |  |  | '~' |
| 60 | pk_dept | pk_dept | pk_dept | varchar2(20) |  |  | '~' |
| 61 | pk_entrustorg | pk_entrustorg | pk_entrustorg | varchar2(20) |  |  | '~' |
| 62 | pk_entrustorg_v | pk_entrustorg_v | pk_entrustorg_v | varchar2(20) |  |  | '~' |
| 63 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 64 | pk_lcmcurrtype | pk_lcmcurrtype | pk_lcmcurrtype | varchar2(20) |  |  | '~' |
| 65 | pk_olccurrtype | pk_olccurrtype | pk_olccurrtype | varchar2(20) |  |  | '~' |
| 66 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 67 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 68 | pk_plan | pk_plan | pk_plan | varchar2(20) |  |  | '~' |
| 69 | pk_pledgecurr | pk_pledgecurr | pk_pledgecurr | varchar2(20) |  |  | '~' |
| 70 | pk_recaccount | pk_recaccount | pk_recaccount | varchar2(20) |  |  | '~' |
| 71 | pk_register | pk_register | pk_register | varchar2(20) |  |  | '~' |
| 72 | pk_sell_currtype | pk_sell_currtype | pk_sell_currtype | varchar2(20) |  |  | '~' |
| 73 | pk_srcbill | pk_srcbill | pk_srcbill | varchar2(20) |
| 74 | pk_supplier | pk_supplier | pk_supplier | varchar2(20) |  |  | '~' |
| 75 | poundageamount | poundageamount | poundageamount | number(28, 8) |
| 76 | relcommoney | relcommoney | relcommoney | number(28, 8) |
| 77 | relsharemoney | relsharemoney | relsharemoney | number(28, 8) |
| 78 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 79 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 80 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 81 | saga_status | saga_status | saga_status | number(38, 0) |
| 82 | sellaccount | sellaccount | sellaccount | varchar2(20) |  |  | '~' |
| 83 | sellamt | sellamt | sellamt | number(28, 8) |
| 84 | sellglcamt | sellglcamt | sellglcamt | number(28, 8) |
| 85 | sellglcrate | sellglcrate | sellglcrate | number(28, 8) |
| 86 | sellgllcamt | sellgllcamt | sellgllcamt | number(28, 8) |
| 87 | sellgllcrate | sellgllcrate | sellgllcrate | number(28, 8) |
| 88 | selllcamt | selllcamt | selllcamt | number(28, 8) |
| 89 | selllcrate | selllcrate | selllcrate | number(28, 8) |
| 90 | spotaccount | spotaccount | spotaccount | varchar2(20) |  |  | '~' |
| 91 | spotamt | spotamt | spotamt | number(28, 8) |
| 92 | spotglcamt | spotglcamt | spotglcamt | number(28, 8) |
| 93 | spotgllcamt | spotgllcamt | spotgllcamt | number(28, 8) |
| 94 | spotpaylcamt | spotpaylcamt | spotpaylcamt | number(28, 8) |
| 95 | srcbillcode | srcbillcode | srcbillcode | varchar2(20) |
| 96 | swapprofit_loss | swapprofit_loss | swapprofit_loss | number(28, 8) |
| 97 | thispayamt | thispayamt | thispayamt | number(28, 8) |
| 98 | thispayglcamt | thispayglcamt | thispayglcamt | number(28, 8) |
| 99 | thispaygllcamt | thispaygllcamt | thispaygllcamt | number(28, 8) |
| 100 | thispaylcamt | thispaylcamt | thispaylcamt | number(28, 8) |
| 101 | vbillno | vbillno | vbillno | varchar2(50) |
| 102 | vbillstatus | vbillstatus | vbillstatus | number(38, 0) |
| 103 | voucher | voucher | voucher | varchar2(20) |  |  | '~' |
| 104 | voucherdate | voucherdate | voucherdate | char(19) |
| 105 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 106 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 107 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 108 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 109 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 110 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 111 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 112 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 113 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 114 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 115 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 116 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 117 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 118 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 119 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 120 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 121 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 122 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 123 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 124 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 125 | creationtime | creationtime | creationtime | char(19) |
| 126 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 127 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 128 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 129 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 130 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |