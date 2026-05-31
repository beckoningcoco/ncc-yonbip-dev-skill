# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9769.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_openmodify | pk_openmodify | pk_openmodify | char(20) | √ |
| 2 | approvedate | approvedate | approvedate | char(19) |
| 3 | approvenote | approvenote | approvenote | varchar2(1024) |
| 4 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 5 | billdate | billdate | billdate | char(19) |
| 6 | billitem | billitem | billitem | varchar2(181) |
| 7 | billmakedate | billmakedate | billmakedate | char(19) |
| 8 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 9 | cccategory | cccategory | cccategory | varchar2(20) |  |  | '~' |
| 10 | commitdate | commitdate | commitdate | char(19) |  |  | '~' |
| 11 | committor | committor | committor | varchar2(20) |  |  | '~' |
| 12 | endport | endport | endport | varchar2(181) |
| 13 | form | form | form | number(38, 0) |
| 14 | futuredays | futuredays | futuredays | number(38, 0) |
| 15 | glclcamount | glclcamount | glclcamount | number(28, 8) |
| 16 | glcrate | glcrate | glcrate | number(28, 8) |
| 17 | gllclcamount | gllclcamount | gllclcamount | number(28, 8) |
| 18 | gllcrate | gllcrate | gllcrate | number(28, 8) |
| 19 | goodsitem | goodsitem | goodsitem | varchar2(181) |
| 20 | guaranteeamont | guaranteeamont | guaranteeamont | number(28, 8) |
| 21 | guaranteetype | guaranteetype | guaranteetype | number(38, 0) |
| 22 | isallowtransfer | isallowtransfer | isallowtransfer | char(1) |
| 23 | isbatch | isbatch | isbatch | char(1) |
| 24 | isdocubills | isdocubills | isdocubills | char(1) |
| 25 | isinitial | isinitial | isinitial | char(1) |
| 26 | isoverflow | isoverflow | isoverflow | char(1) |
| 27 | issuingbankaddr | issuingbankaddr | issuingbankaddr | varchar2(181) |
| 28 | istransfer | istransfer | istransfer | char(1) |
| 29 | latestdeliverdate | latestdeliverdate | latestdeliverdate | char(19) |
| 30 | latestshippingdate | latestshippingdate | latestshippingdate | char(19) |
| 31 | lcamount | lcamount | lcamount | number(28, 8) |
| 32 | lcno | lcno | lcno | varchar2(50) |
| 33 | lcstatus | lcstatus | lcstatus | number(38, 0) |
| 34 | limitday | limitday | limitday | number(38, 0) |
| 35 | lowscale | lowscale | lowscale | number(28, 8) |
| 36 | negotiatingtype | negotiatingtype | negotiatingtype | number(38, 0) |
| 37 | olclcamount | olclcamount | olclcamount | number(28, 8) |
| 38 | olcrate | olcrate | olcrate | number(28, 8) |
| 39 | openmodifydate | openmodifydate | openmodifydate | char(19) |
| 40 | openmodifyreason | openmodifyreason | openmodifyreason | varchar2(181) |
| 41 | otheritem | otheritem | otheritem | varchar2(181) |
| 42 | overscale | overscale | overscale | number(28, 8) |
| 43 | paytype | paytype | paytype | number(38, 0) |
| 44 | pk_acc_pledge | pk_acc_pledge | pk_acc_pledge | varchar2(20) |  |  | '~' |
| 45 | pk_bank_advising | pk_bank_advising | pk_bank_advising | varchar2(50) |
| 46 | pk_bank_cc | pk_bank_cc | pk_bank_cc | varchar2(20) |  |  | '~' |
| 47 | pk_bank_issuing | pk_bank_issuing | pk_bank_issuing | varchar2(20) |  |  | '~' |
| 48 | pk_bank_nego | pk_bank_nego | pk_bank_nego | varchar2(20) |  |  | '~' |
| 49 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(20) |
| 50 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |  |  | '~' |
| 51 | pk_busipersion | pk_busipersion | pk_busipersion | varchar2(20) |  |  | '~' |
| 52 | pk_cccurrtype | pk_cccurrtype | pk_cccurrtype | varchar2(20) |  |  | '~' |
| 53 | pk_ccterm | pk_ccterm | pk_ccterm | varchar2(20) |  |  | '~' |
| 54 | pk_dept | pk_dept | pk_dept | varchar2(20) |  |  | '~' |
| 55 | pk_dept_poundage | pk_dept_poundage | pk_dept_poundage | varchar2(20) |  |  | '~' |
| 56 | pk_entrustorg | pk_entrustorg | pk_entrustorg | varchar2(20) |  |  | '~' |
| 57 | pk_entrustorg_v | pk_entrustorg_v | pk_entrustorg_v | varchar2(20) |  |  | '~' |
| 58 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 59 | pk_guacurrtype | pk_guacurrtype | pk_guacurrtype | varchar2(20) |  |  | '~' |
| 60 | pk_guaprotocol | pk_guaprotocol | pk_guaprotocol | varchar2(20) |  |  | '~' |
| 61 | pk_lccurrtype | pk_lccurrtype | pk_lccurrtype | varchar2(20) |  |  | '~' |
| 62 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 63 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 64 | pk_planitem | pk_planitem | pk_planitem | varchar2(20) |  |  | '~' |
| 65 | pk_pledgecurr | pk_pledgecurr | pk_pledgecurr | varchar2(20) |  |  | '~' |
| 66 | pk_register | pk_register | pk_register | varchar2(20) |  |  | '~' |
| 67 | pk_srcbill | pk_srcbill | pk_srcbill | varchar2(20) |
| 68 | pk_supplier | pk_supplier | pk_supplier | varchar2(20) |  |  | '~' |
| 69 | pledgeamount | pledgeamount | pledgeamount | number(28, 8) |
| 70 | pledgecode | pledgecode | pledgecode | varchar2(50) |
| 71 | pledgescale | pledgescale | pledgescale | number(28, 8) |
| 72 | postponetype | postponetype | postponetype | number(38, 0) |
| 73 | priceitem | priceitem | priceitem | varchar2(181) |
| 74 | remark | remark | remark | varchar2(181) |
| 75 | specifydate | specifydate | specifydate | char(19) |
| 76 | startport | startport | startport | varchar2(181) |
| 77 | supplieraddr | supplieraddr | supplieraddr | varchar2(181) |
| 78 | swiftno | swiftno | swiftno | varchar2(50) |
| 79 | term | term | term | number(38, 0) |
| 80 | type | type | type | number(38, 0) |
| 81 | useccamount | useccamount | useccamount | number(28, 8) |
| 82 | validaddr | validaddr | validaddr | varchar2(181) |
| 83 | validdate | validdate | validdate | char(19) |
| 84 | vbillno | vbillno | vbillno | varchar2(40) |
| 85 | vbillstatus | vbillstatus | vbillstatus | number(38, 0) |
| 86 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 87 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 88 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 89 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 90 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 91 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 92 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 93 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 94 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 95 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 96 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 97 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 98 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 99 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 100 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 101 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 102 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 103 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 104 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 105 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 106 | vdef21 | vdef21 | vdef21 | varchar2(101) |
| 107 | vdef22 | vdef22 | vdef22 | varchar2(101) |
| 108 | vdef23 | vdef23 | vdef23 | varchar2(101) |
| 109 | vdef24 | vdef24 | vdef24 | varchar2(101) |
| 110 | vdef25 | vdef25 | vdef25 | varchar2(101) |
| 111 | vdef26 | vdef26 | vdef26 | varchar2(101) |
| 112 | vdef27 | vdef27 | vdef27 | varchar2(101) |
| 113 | vdef28 | vdef28 | vdef28 | varchar2(101) |
| 114 | vdef29 | vdef29 | vdef29 | varchar2(101) |
| 115 | vdef30 | vdef30 | vdef30 | varchar2(101) |
| 116 | creationtime | creationtime | creationtime | char(19) |
| 117 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 118 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 119 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 120 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 121 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |