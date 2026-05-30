# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9773.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_openmodify | pk_openmodify | pk_openmodify | char(20) | √ |
| 2 | approvedate | approvedate | approvedate | char(19) |
| 3 | approvenote | approvenote | approvenote | varchar2(1024) |
| 4 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 5 | attrname | attrname | attrname | varchar2(20) |  |  | '~' |
| 6 | billdate | billdate | billdate | char(19) |
| 7 | billitem | billitem | billitem | varchar2(181) |
| 8 | billmakedate | billmakedate | billmakedate | char(19) |
| 9 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 10 | cccategory | cccategory | cccategory | varchar2(20) |  |  | '~' |
| 11 | endport | endport | endport | varchar2(181) |
| 12 | form | form | form | number(38, 0) |
| 13 | futuredays | futuredays | futuredays | number(38, 0) |
| 14 | glclcamount | glclcamount | glclcamount | number(28, 8) |
| 15 | glcrate | glcrate | glcrate | number(28, 8) |
| 16 | gllclcamount | gllclcamount | gllclcamount | number(28, 8) |
| 17 | gllcrate | gllcrate | gllcrate | number(28, 8) |
| 18 | goodsitem | goodsitem | goodsitem | varchar2(181) |
| 19 | guaranteeamont | guaranteeamont | guaranteeamont | number(28, 8) |
| 20 | guaranteetype | guaranteetype | guaranteetype | number(38, 0) |
| 21 | isallowtransfer | isallowtransfer | isallowtransfer | char(1) |
| 22 | isbatch | isbatch | isbatch | char(1) |
| 23 | isdocubills | isdocubills | isdocubills | char(1) |
| 24 | isinitial | isinitial | isinitial | char(1) |
| 25 | isoverflow | isoverflow | isoverflow | char(1) |
| 26 | issuingbankaddr | issuingbankaddr | issuingbankaddr | varchar2(181) |
| 27 | istransfer | istransfer | istransfer | char(1) |
| 28 | latestdeliverdate | latestdeliverdate | latestdeliverdate | char(19) |
| 29 | latestshippingdate | latestshippingdate | latestshippingdate | char(19) |
| 30 | lcamount | lcamount | lcamount | number(28, 8) |
| 31 | lcno | lcno | lcno | varchar2(50) |
| 32 | lcstatus | lcstatus | lcstatus | number(38, 0) |
| 33 | lowscale | lowscale | lowscale | number(28, 8) |
| 34 | negotiatingtype | negotiatingtype | negotiatingtype | number(38, 0) |
| 35 | olclcamount | olclcamount | olclcamount | number(28, 8) |
| 36 | olcrate | olcrate | olcrate | number(28, 8) |
| 37 | otheritem | otheritem | otheritem | varchar2(181) |
| 38 | overscale | overscale | overscale | number(28, 8) |
| 39 | paytype | paytype | paytype | number(38, 0) |
| 40 | pk_acc_pledge | pk_acc_pledge | pk_acc_pledge | varchar2(20) |  |  | '~' |
| 41 | pk_bank_advising | pk_bank_advising | pk_bank_advising | varchar2(50) |
| 42 | pk_bank_cc | pk_bank_cc | pk_bank_cc | varchar2(20) |  |  | '~' |
| 43 | pk_bank_issuing | pk_bank_issuing | pk_bank_issuing | varchar2(20) |  |  | '~' |
| 44 | pk_bank_nego | pk_bank_nego | pk_bank_nego | varchar2(20) |  |  | '~' |
| 45 | pk_busipersion | pk_busipersion | pk_busipersion | varchar2(20) |  |  | '~' |
| 46 | pk_cccurrtype | pk_cccurrtype | pk_cccurrtype | varchar2(20) |  |  | '~' |
| 47 | pk_ccterm | pk_ccterm | pk_ccterm | varchar2(20) |  |  | '~' |
| 48 | pk_dept | pk_dept | pk_dept | varchar2(20) |  |  | '~' |
| 49 | pk_dept_poundage | pk_dept_poundage | pk_dept_poundage | varchar2(20) |  |  | '~' |
| 50 | pk_entrustorg | pk_entrustorg | pk_entrustorg | varchar2(20) |  |  | '~' |
| 51 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 52 | pk_guacurrtype | pk_guacurrtype | pk_guacurrtype | varchar2(20) |  |  | '~' |
| 53 | pk_guaprotocol | pk_guaprotocol | pk_guaprotocol | varchar2(20) |  |  | '~' |
| 54 | pk_lccurrtype | pk_lccurrtype | pk_lccurrtype | varchar2(20) |  |  | '~' |
| 55 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 56 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 57 | pk_planitem | pk_planitem | pk_planitem | varchar2(20) |  |  | '~' |
| 58 | pk_pledgecurr | pk_pledgecurr | pk_pledgecurr | varchar2(20) |  |  | '~' |
| 59 | pk_register | pk_register | pk_register | varchar2(20) |  |  | '~' |
| 60 | pk_supplier | pk_supplier | pk_supplier | varchar2(20) |  |  | '~' |
| 61 | pledgeamount | pledgeamount | pledgeamount | number(28, 8) |
| 62 | pledgecode | pledgecode | pledgecode | varchar2(50) |
| 63 | pledgescale | pledgescale | pledgescale | number(28, 8) |
| 64 | postponetype | postponetype | postponetype | number(38, 0) |
| 65 | priceitem | priceitem | priceitem | varchar2(181) |
| 66 | remark | remark | remark | varchar2(181) |
| 67 | specifydate | specifydate | specifydate | char(19) |
| 68 | startport | startport | startport | varchar2(181) |
| 69 | supplieraddr | supplieraddr | supplieraddr | varchar2(181) |
| 70 | swiftno | swiftno | swiftno | varchar2(50) |
| 71 | term | term | term | number(38, 0) |
| 72 | type | type | type | number(38, 0) |
| 73 | useccamount | useccamount | useccamount | number(28, 8) |
| 74 | validaddr | validaddr | validaddr | varchar2(181) |
| 75 | validdate | validdate | validdate | char(19) |
| 76 | versionno | versionno | versionno | number(38, 0) |
| 77 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 78 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 79 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 80 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 81 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 82 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 83 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 84 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 85 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 86 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 87 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 88 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 89 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 90 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 91 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 92 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 93 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 94 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 95 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 96 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 97 | vdef21 | vdef21 | vdef21 | varchar2(101) |
| 98 | vdef22 | vdef22 | vdef22 | varchar2(101) |
| 99 | vdef23 | vdef23 | vdef23 | varchar2(101) |
| 100 | vdef24 | vdef24 | vdef24 | varchar2(101) |
| 101 | vdef25 | vdef25 | vdef25 | varchar2(101) |
| 102 | vdef26 | vdef26 | vdef26 | varchar2(101) |
| 103 | vdef27 | vdef27 | vdef27 | varchar2(101) |
| 104 | vdef28 | vdef28 | vdef28 | varchar2(101) |
| 105 | vdef29 | vdef29 | vdef29 | varchar2(101) |
| 106 | vdef30 | vdef30 | vdef30 | varchar2(101) |
| 107 | creationtime | creationtime | creationtime | char(19) |
| 108 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 109 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 110 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 111 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 112 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |