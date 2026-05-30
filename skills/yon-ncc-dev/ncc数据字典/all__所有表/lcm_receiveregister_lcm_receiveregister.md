# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9780.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_receiptregister | pk_receiptregister | pk_receiptregister | char(20) | √ |
| 2 | approvedate | approvedate | approvedate | char(19) |
| 3 | approvenote | approvenote | approvenote | varchar2(1024) |
| 4 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 5 | beneficiaryadress | beneficiaryadress | beneficiaryadress | varchar2(181) |
| 6 | billdate | billdate | billdate | char(19) |
| 7 | billitem | billitem | billitem | varchar2(181) |
| 8 | billmakedate | billmakedate | billmakedate | char(19) |
| 9 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 10 | collectionamount | collectionamount | collectionamount | number(28, 8) |
| 11 | collectionglcamt | collectionglcamt | collectionglcamt | number(28, 8) |
| 12 | collectiongllamt | collectiongllamt | collectiongllamt | number(28, 8) |
| 13 | collectionolcamt | collectionolcamt | collectionolcamt | number(28, 8) |
| 14 | commitamount | commitamount | commitamount | number(28, 8) |
| 15 | commitdate | commitdate | commitdate | char(19) |
| 16 | commitglamount | commitglamount | commitglamount | number(28, 8) |
| 17 | commitglcamount | commitglcamount | commitglcamount | number(28, 8) |
| 18 | commitolcamount | commitolcamount | commitolcamount | number(28, 8) |
| 19 | committor | committor | committor | varchar2(20) |  |  | '~' |
| 20 | contractno | contractno | contractno | varchar2(50) |
| 21 | customer | customer | customer | varchar2(20) |  |  | '~' |
| 22 | endport | endport | endport | varchar2(181) |
| 23 | form | form | form | number(38, 0) |
| 24 | futuredays | futuredays | futuredays | number(38, 0) |
| 25 | glclcamount | glclcamount | glclcamount | number(28, 8) |
| 26 | glcrate | glcrate | glcrate | number(28, 8) |
| 27 | gllclcamount | gllclcamount | gllclcamount | number(28, 8) |
| 28 | gllcrate | gllcrate | gllcrate | number(28, 8) |
| 29 | goodsitem | goodsitem | goodsitem | varchar2(181) |
| 30 | goodsorlabor | goodsorlabor | goodsorlabor | varchar2(20) |  |  | '~' |
| 31 | isallowtransfer | isallowtransfer | isallowtransfer | char(1) |
| 32 | isbatch | isbatch | isbatch | char(1) |
| 33 | isdocubills | isdocubills | isdocubills | char(1) |
| 34 | isinitial | isinitial | isinitial | char(1) |
| 35 | isoverflow | isoverflow | isoverflow | char(1) |
| 36 | issuingbankaddr | issuingbankaddr | issuingbankaddr | varchar2(181) |
| 37 | istransfer | istransfer | istransfer | char(1) |
| 38 | itemtype | itemtype | itemtype | varchar2(20) |  |  | '~' |
| 39 | latestdeliverdate | latestdeliverdate | latestdeliverdate | char(19) |
| 40 | latestshippingdate | latestshippingdate | latestshippingdate | char(19) |
| 41 | lcamount | lcamount | lcamount | number(28, 8) |
| 42 | lcbalanceamt | lcbalanceamt | lcbalanceamt | number(28, 8) |
| 43 | lcbalanceglcamt | lcbalanceglcamt | lcbalanceglcamt | number(28, 8) |
| 44 | lcbalancegllamt | lcbalancegllamt | lcbalancegllamt | number(28, 8) |
| 45 | lcbalanceolcamt | lcbalanceolcamt | lcbalanceolcamt | number(28, 8) |
| 46 | lcno | lcno | lcno | varchar2(50) |
| 47 | lcstatus | lcstatus | lcstatus | varchar2(50) |
| 48 | lcterm | lcterm | lcterm | number(38, 0) |
| 49 | lctype | lctype | lctype | number(38, 0) |
| 50 | limitday | limitday | limitday | number(38, 0) |
| 51 | lowscale | lowscale | lowscale | number(28, 8) |
| 52 | measureunit | measureunit | measureunit | varchar2(20) |  |  | '~' |
| 53 | negotiatingtype | negotiatingtype | negotiatingtype | number(38, 0) |
| 54 | olclcamount | olclcamount | olclcamount | number(28, 8) |
| 55 | olcrate | olcrate | olcrate | number(28, 8) |
| 56 | otheritem | otheritem | otheritem | varchar2(181) |
| 57 | overscale | overscale | overscale | number(28, 8) |
| 58 | paytype | paytype | paytype | number(38, 0) |
| 59 | pk_advisingbank | pk_advisingbank | pk_advisingbank | varchar2(20) |  |  | '~' |
| 60 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(20) |
| 61 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(50) |
| 62 | pk_busipersion | pk_busipersion | pk_busipersion | varchar2(20) |  |  | '~' |
| 63 | pk_dept | pk_dept | pk_dept | varchar2(20) |  |  | '~' |
| 64 | pk_entrustorg | pk_entrustorg | pk_entrustorg | varchar2(20) |  |  | '~' |
| 65 | pk_entrustorg_v | pk_entrustorg_v | pk_entrustorg_v | varchar2(20) |  |  | '~' |
| 66 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 67 | pk_issuingbank | pk_issuingbank | pk_issuingbank | varchar2(50) |  |  | '~' |
| 68 | pk_lccurrtype | pk_lccurrtype | pk_lccurrtype | varchar2(20) |  |  | '~' |
| 69 | pk_negotiatedbank | pk_negotiatedbank | pk_negotiatedbank | varchar2(20) |  |  | '~' |
| 70 | pk_openlcmbank | pk_openlcmbank | pk_openlcmbank | varchar2(20) |  |  | '~' |
| 71 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 72 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 73 | pk_planitem | pk_planitem | pk_planitem | varchar2(20) |  |  | '~' |
| 74 | pk_receivebank | pk_receivebank | pk_receivebank | varchar2(20) |  |  | '~' |
| 75 | pk_srcbill | pk_srcbill | pk_srcbill | varchar2(20) |
| 76 | pk_srcbilltype | pk_srcbilltype | pk_srcbilltype | varchar2(20) |  |  | '~' |
| 77 | postponetype | postponetype | postponetype | number(38, 0) |
| 78 | priceitem | priceitem | priceitem | varchar2(181) |
| 79 | receivedate | receivedate | receivedate | char(19) |
| 80 | remark | remark | remark | varchar2(181) |
| 81 | specifydate | specifydate | specifydate | char(19) |
| 82 | srcbusiflag | srcbusiflag | srcbusiflag | number(38, 0) |
| 83 | startport | startport | startport | varchar2(181) |
| 84 | stopdate | stopdate | stopdate | char(19) |
| 85 | stopoperator | stopoperator | stopoperator | varchar2(20) |  |  | '~' |
| 86 | stopoperatordate | stopoperatordate | stopoperatordate | char(19) |
| 87 | stopreason | stopreason | stopreason | number(38, 0) |
| 88 | submissionamount | submissionamount | submissionamount | number(28, 8) |
| 89 | submissioneglcamount | submissioneglcamount | submissioneglcamount | number(28, 8) |
| 90 | submissiongllamount | submissiongllamount | submissiongllamount | number(28, 8) |
| 91 | submissionolcamount | submissionolcamount | submissionolcamount | number(28, 8) |
| 92 | swiftno | swiftno | swiftno | varchar2(50) |
| 93 | validaddr | validaddr | validaddr | varchar2(181) |
| 94 | validdate | validdate | validdate | char(19) |
| 95 | vbillno | vbillno | vbillno | varchar2(40) |
| 96 | vbillstatus | vbillstatus | vbillstatus | number(38, 0) |
| 97 | voucherflag | voucherflag | voucherflag | char(1) |
| 98 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 99 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 100 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 101 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 102 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 103 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 104 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 105 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 106 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 107 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 108 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 109 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 110 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 111 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 112 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 113 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 114 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 115 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 116 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 117 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 118 | vdef21 | vdef21 | vdef21 | varchar2(101) |
| 119 | vdef22 | vdef22 | vdef22 | varchar2(101) |
| 120 | vdef23 | vdef23 | vdef23 | varchar2(101) |
| 121 | vdef24 | vdef24 | vdef24 | varchar2(101) |
| 122 | vdef25 | vdef25 | vdef25 | varchar2(101) |
| 123 | vdef26 | vdef26 | vdef26 | varchar2(101) |
| 124 | vdef27 | vdef27 | vdef27 | varchar2(101) |
| 125 | vdef28 | vdef28 | vdef28 | varchar2(101) |
| 126 | vdef29 | vdef29 | vdef29 | varchar2(101) |
| 127 | vdef30 | vdef30 | vdef30 | varchar2(101) |
| 128 | creationtime | creationtime | creationtime | char(19) |
| 129 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 130 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 131 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 132 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 133 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |