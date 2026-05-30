# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9753.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_apply | pk_apply | pk_apply | char(20) | √ |
| 2 | applydate | applydate | applydate | char(19) |
| 3 | approvedate | approvedate | approvedate | char(19) |
| 4 | approvenote | approvenote | approvenote | varchar2(1024) |
| 5 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 6 | beneficiary | beneficiary | beneficiary | varchar2(20) |  |  | '~' |
| 7 | beneficiaryaddr | beneficiaryaddr | beneficiaryaddr | varchar2(181) |
| 8 | billitem | billitem | billitem | varchar2(181) |
| 9 | billmakedate | billmakedate | billmakedate | char(19) |
| 10 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 11 | ccresource | ccresource | ccresource | number(38, 0) |
| 12 | commitdate | commitdate | commitdate | char(19) |
| 13 | committor | committor | committor | varchar2(20) |  |  | '~' |
| 14 | contractno | contractno | contractno | varchar2(50) |
| 15 | endport | endport | endport | varchar2(181) |
| 16 | expectopendate | expectopendate | expectopendate | char(19) |
| 17 | form | form | form | number(38, 0) |
| 18 | futuredays | futuredays | futuredays | number(38, 0) |
| 19 | glclcamount | glclcamount | glclcamount | number(28, 8) |
| 20 | glcrate | glcrate | glcrate | number(28, 8) |
| 21 | gllclcamount | gllclcamount | gllclcamount | number(28, 8) |
| 22 | gllcrate | gllcrate | gllcrate | number(28, 8) |
| 23 | goodsitem | goodsitem | goodsitem | varchar2(181) |
| 24 | guaranteetype | guaranteetype | guaranteetype | number(38, 0) |
| 25 | haspassedntbcheck | haspassedntbcheck | haspassedntbcheck | char(1) |
| 26 | isallowtransfer | isallowtransfer | isallowtransfer | char(1) |
| 27 | isbatch | isbatch | isbatch | char(1) |
| 28 | isclose | isclose | isclose | char(1) |
| 29 | isdeal | isdeal | isdeal | char(1) |
| 30 | isinitial | isinitial | isinitial | char(1) |
| 31 | isoverflow | isoverflow | isoverflow | char(1) |
| 32 | issuingbankaddr | issuingbankaddr | issuingbankaddr | varchar2(181) |
| 33 | istransfer | istransfer | istransfer | char(1) |
| 34 | latestdeliverdate | latestdeliverdate | latestdeliverdate | char(19) |
| 35 | latestshippingdate | latestshippingdate | latestshippingdate | char(19) |
| 36 | lcamount | lcamount | lcamount | number(28, 8) |
| 37 | lcmno | lcmno | lcmno | varchar2(50) |
| 38 | lowscale | lowscale | lowscale | number(18, 8) |
| 39 | negotiatingtype | negotiatingtype | negotiatingtype | number(38, 0) |
| 40 | ntbmessage | ntbmessage | ntbmessage | varchar2(50) |
| 41 | olclcamount | olclcamount | olclcamount | number(28, 8) |
| 42 | olcrate | olcrate | olcrate | number(28, 8) |
| 43 | otheritem | otheritem | otheritem | varchar2(181) |
| 44 | overscale | overscale | overscale | number(18, 8) |
| 45 | paytype | paytype | paytype | number(38, 0) |
| 46 | pk_apply_org | pk_apply_org | pk_apply_org | varchar2(20) |  |  | '~' |
| 47 | pk_bank_advising | pk_bank_advising | pk_bank_advising | varchar2(50) |
| 48 | pk_bank_cc | pk_bank_cc | pk_bank_cc | varchar2(20) |  |  | '~' |
| 49 | pk_bank_issuing | pk_bank_issuing | pk_bank_issuing | varchar2(20) |  |  | '~' |
| 50 | pk_bank_nego | pk_bank_nego | pk_bank_nego | varchar2(20) |  |  | '~' |
| 51 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(20) |
| 52 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |
| 53 | pk_busipersion | pk_busipersion | pk_busipersion | varchar2(20) |  |  | '~' |
| 54 | pk_cccurrtype | pk_cccurrtype | pk_cccurrtype | varchar2(20) |  |  | '~' |
| 55 | pk_ccterm | pk_ccterm | pk_ccterm | varchar2(20) |  |  | '~' |
| 56 | pk_cctype | pk_cctype | pk_cctype | varchar2(20) |  |  | '~' |
| 57 | pk_dept | pk_dept | pk_dept | varchar2(20) |  |  | '~' |
| 58 | pk_entrustorg | pk_entrustorg | pk_entrustorg | varchar2(20) |  |  | '~' |
| 59 | pk_entrustorg_v | pk_entrustorg_v | pk_entrustorg_v | varchar2(20) |  |  | '~' |
| 60 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 61 | pk_lccurrtype | pk_lccurrtype | pk_lccurrtype | varchar2(20) |  |  | '~' |
| 62 | pk_marbasclass | pk_marbasclass | pk_marbasclass | varchar2(20) |  |  | '~' |
| 63 | pk_material | pk_material | pk_material | varchar2(20) |  |  | '~' |
| 64 | pk_measdoc | pk_measdoc | pk_measdoc | varchar2(20) |  |  | '~' |
| 65 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 66 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 67 | pk_planitem | pk_planitem | pk_planitem | varchar2(20) |  |  | '~' |
| 68 | pk_protocoltype | pk_protocoltype | pk_protocoltype | varchar2(20) |  |  | '~' |
| 69 | pk_supplier | pk_supplier | pk_supplier | varchar2(20) |  |  | '~' |
| 70 | postponetype | postponetype | postponetype | number(38, 0) |
| 71 | priceitem | priceitem | priceitem | varchar2(181) |
| 72 | remark | remark | remark | varchar2(181) |
| 73 | specifydate | specifydate | specifydate | char(19) |
| 74 | srcbilltype | srcbilltype | srcbilltype | varchar2(10) |  |  | '~' |
| 75 | srcbusiflag | srcbusiflag | srcbusiflag | number(38, 0) |
| 76 | startport | startport | startport | varchar2(181) |
| 77 | swiftno | swiftno | swiftno | varchar2(50) |
| 78 | term | term | term | number(38, 0) |
| 79 | type | type | type | number(38, 0) |
| 80 | useccamount | useccamount | useccamount | number(28, 8) |
| 81 | useccolcamount | useccolcamount | useccolcamount | number(28, 8) |
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