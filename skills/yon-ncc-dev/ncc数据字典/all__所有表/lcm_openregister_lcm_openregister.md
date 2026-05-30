# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9771.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_register | pk_register | pk_register | char(20) | √ |
| 2 | advisingbank | advisingbank | advisingbank | varchar2(50) |
| 3 | applyno | applyno | applyno | varchar2(20) |  |  | '~' |
| 4 | approvedate | approvedate | approvedate | char(19) |
| 5 | approvenote | approvenote | approvenote | varchar2(1024) |
| 6 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 7 | arrivalamount | arrivalamount | arrivalamount | number(28, 8) |
| 8 | billdate | billdate | billdate | char(19) |
| 9 | billitem | billitem | billitem | varchar2(181) |
| 10 | billmakedate | billmakedate | billmakedate | char(19) |
| 11 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 12 | cccategory | cccategory | cccategory | varchar2(20) |  |  | '~' |
| 13 | ccresource | ccresource | ccresource | number(38, 0) |
| 14 | cntbilltype | cntbilltype | cntbilltype | varchar2(10) |  |  | '~' |
| 15 | commitamount | commitamount | commitamount | number(28, 8) |
| 16 | commitdate | commitdate | commitdate | char(19) |
| 17 | committor | committor | committor | varchar2(20) |  |  | '~' |
| 18 | downquotaflag | downquotaflag | downquotaflag | char(1) |
| 19 | endport | endport | endport | varchar2(181) |
| 20 | form | form | form | number(38, 0) |
| 21 | futuredays | futuredays | futuredays | number(38, 0) |
| 22 | glclcamount | glclcamount | glclcamount | number(28, 8) |
| 23 | glcrate | glcrate | glcrate | number(28, 8) |
| 24 | gllclcamount | gllclcamount | gllclcamount | number(28, 8) |
| 25 | gllcrate | gllcrate | gllcrate | number(28, 8) |
| 26 | goodsitem | goodsitem | goodsitem | varchar2(181) |
| 27 | guaranteeamont | guaranteeamont | guaranteeamont | number(28, 8) |
| 28 | guaranteetype | guaranteetype | guaranteetype | number(38, 0) |
| 29 | haspassedntbcheck | haspassedntbcheck | haspassedntbcheck | char(1) |
| 30 | initpoolflag | initpoolflag | initpoolflag | char(1) |
| 31 | isallowtransfer | isallowtransfer | isallowtransfer | char(1) |
| 32 | isbatch | isbatch | isbatch | char(1) |
| 33 | isdocubills | isdocubills | isdocubills | char(1) |
| 34 | isinitial | isinitial | isinitial | char(1) |
| 35 | isoverflow | isoverflow | isoverflow | char(1) |
| 36 | isstop | isstop | isstop | char(1) |
| 37 | issuingbankaddr | issuingbankaddr | issuingbankaddr | varchar2(181) |
| 38 | istransfer | istransfer | istransfer | char(1) |
| 39 | latestdeliverdate | latestdeliverdate | latestdeliverdate | char(19) |
| 40 | latestshippingdate | latestshippingdate | latestshippingdate | char(19) |
| 41 | lcamount | lcamount | lcamount | number(28, 8) |
| 42 | lcbalance | lcbalance | lcbalance | number(28, 8) |
| 43 | lcno | lcno | lcno | varchar2(50) |
| 44 | lcstatus | lcstatus | lcstatus | number(38, 0) |
| 45 | lowscale | lowscale | lowscale | number(28, 8) |
| 46 | negotiatingtype | negotiatingtype | negotiatingtype | number(38, 0) |
| 47 | ntbmessage | ntbmessage | ntbmessage | varchar2(50) |
| 48 | occucommoney | occucommoney | occucommoney | number(28, 8) |
| 49 | occusharemoney | occusharemoney | occusharemoney | number(28, 8) |
| 50 | olclcamount | olclcamount | olclcamount | number(28, 8) |
| 51 | olcrate | olcrate | olcrate | number(28, 8) |
| 52 | otheritem | otheritem | otheritem | varchar2(181) |
| 53 | overscale | overscale | overscale | number(28, 8) |
| 54 | pay | pay | pay | number(28, 8) |
| 55 | paytype | paytype | paytype | number(38, 0) |
| 56 | pk_acc_pledge | pk_acc_pledge | pk_acc_pledge | varchar2(20) |  |  | '~' |
| 57 | pk_apply_org | pk_apply_org | pk_apply_org | varchar2(20) |  |  | '~' |
| 58 | pk_bank_cc | pk_bank_cc | pk_bank_cc | varchar2(20) |  |  | '~' |
| 59 | pk_bank_issuing | pk_bank_issuing | pk_bank_issuing | varchar2(20) |  |  | '~' |
| 60 | pk_bank_nego | pk_bank_nego | pk_bank_nego | varchar2(20) |  |  | '~' |
| 61 | pk_billtype | pk_billtype | pk_billtype | varchar2(20) |  |  | '~' |
| 62 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(50) |
| 63 | pk_busipersion | pk_busipersion | pk_busipersion | varchar2(20) |  |  | '~' |
| 64 | pk_cccurrtype | pk_cccurrtype | pk_cccurrtype | varchar2(20) |  |  | '~' |
| 65 | pk_ccterm | pk_ccterm | pk_ccterm | varchar2(20) |  |  | '~' |
| 66 | pk_dept | pk_dept | pk_dept | varchar2(20) |  |  | '~' |
| 67 | pk_dept_poundage | pk_dept_poundage | pk_dept_poundage | varchar2(20) |  |  | '~' |
| 68 | pk_entrustorg | pk_entrustorg | pk_entrustorg | varchar2(20) |  |  | '~' |
| 69 | pk_entrustorg_v | pk_entrustorg_v | pk_entrustorg_v | varchar2(20) |  |  | '~' |
| 70 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 71 | pk_guacurrtype | pk_guacurrtype | pk_guacurrtype | varchar2(20) |  |  | '~' |
| 72 | pk_guaprotocol | pk_guaprotocol | pk_guaprotocol | varchar2(20) |  |  | '~' |
| 73 | pk_lccurrtype | pk_lccurrtype | pk_lccurrtype | varchar2(20) |  |  | '~' |
| 74 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 75 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 76 | pk_pledgecurr | pk_pledgecurr | pk_pledgecurr | varchar2(20) |  |  | '~' |
| 77 | pk_srcbill | pk_srcbill | pk_srcbill | varchar2(20) |
| 78 | pk_supplier | pk_supplier | pk_supplier | varchar2(20) |  |  | '~' |
| 79 | pk_usectmanage | pk_usectmanage | pk_usectmanage | varchar2(20) |
| 80 | planitem | planitem | planitem | varchar2(20) |  |  | '~' |
| 81 | pledgeamount | pledgeamount | pledgeamount | number(28, 8) |
| 82 | pledgecode | pledgecode | pledgecode | varchar2(50) |
| 83 | pledgescale | pledgescale | pledgescale | number(28, 8) |
| 84 | postponetype | postponetype | postponetype | number(38, 0) |
| 85 | priceitem | priceitem | priceitem | varchar2(181) |
| 86 | rateversion | rateversion | rateversion | number(38, 0) |
| 87 | remark | remark | remark | varchar2(181) |
| 88 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 89 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 90 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 91 | saga_status | saga_status | saga_status | number(38, 0) |
| 92 | specifydate | specifydate | specifydate | char(19) |
| 93 | srcbillcode | srcbillcode | srcbillcode | varchar2(20) |
| 94 | startport | startport | startport | varchar2(181) |
| 95 | stopdate | stopdate | stopdate | char(19) |
| 96 | stopoperatedate | stopoperatedate | stopoperatedate | char(19) |
| 97 | stopoperateperson | stopoperateperson | stopoperateperson | varchar2(20) |  |  | '~' |
| 98 | stopreason | stopreason | stopreason | number(38, 0) |
| 99 | supplieraddr | supplieraddr | supplieraddr | varchar2(181) |
| 100 | swiftno | swiftno | swiftno | varchar2(50) |
| 101 | term | term | term | number(38, 0) |
| 102 | type | type | type | number(38, 0) |
| 103 | useccamount | useccamount | useccamount | number(28, 8) |
| 104 | useccolcamount | useccolcamount | useccolcamount | number(28, 8) |
| 105 | validaddr | validaddr | validaddr | varchar2(181) |
| 106 | validdate | validdate | validdate | char(19) |
| 107 | vbillno | vbillno | vbillno | varchar2(40) |
| 108 | vbillstatus | vbillstatus | vbillstatus | number(38, 0) |
| 109 | voucherdate | voucherdate | voucherdate | char(19) |
| 110 | voucherflag | voucherflag | voucherflag | char(1) |
| 111 | vouchermaker | vouchermaker | vouchermaker | varchar2(20) |  |  | '~' |
| 112 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 113 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 114 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 115 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 116 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 117 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 118 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 119 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 120 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 121 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 122 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 123 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 124 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 125 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 126 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 127 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 128 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 129 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 130 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 131 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 132 | vdef21 | vdef21 | vdef21 | varchar2(101) |
| 133 | vdef22 | vdef22 | vdef22 | varchar2(101) |
| 134 | vdef23 | vdef23 | vdef23 | varchar2(101) |
| 135 | vdef24 | vdef24 | vdef24 | varchar2(101) |
| 136 | vdef25 | vdef25 | vdef25 | varchar2(101) |
| 137 | vdef26 | vdef26 | vdef26 | varchar2(101) |
| 138 | vdef27 | vdef27 | vdef27 | varchar2(101) |
| 139 | vdef28 | vdef28 | vdef28 | varchar2(101) |
| 140 | vdef29 | vdef29 | vdef29 | varchar2(101) |
| 141 | vdef30 | vdef30 | vdef30 | varchar2(101) |
| 142 | creationtime | creationtime | creationtime | char(19) |
| 143 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 144 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 145 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 146 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 147 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |