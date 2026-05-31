# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6635.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_receiptregister | pk_receiptregister | pk_receiptregister | char(20) | √ |
| 2 | billdate | billdate | billdate | char(19) |
| 3 | collectionamount | collectionamount | collectionamount | number(28, 8) |
| 4 | collectionglcamt | collectionglcamt | collectionglcamt | number(28, 8) |
| 5 | collectiongllamt | collectiongllamt | collectiongllamt | number(28, 8) |
| 6 | collectionolcamt | collectionolcamt | collectionolcamt | number(28, 8) |
| 7 | customer | customer | customer | varchar2(20) |  |  | '~' |
| 8 | glclcamount | glclcamount | glclcamount | number(28, 8) |
| 9 | gllclcamount | gllclcamount | gllclcamount | number(28, 8) |
| 10 | isdocubills | isdocubills | isdocubills | char(1) |
| 11 | lcamount | lcamount | lcamount | number(28, 8) |
| 12 | lcbalanceamt | lcbalanceamt | lcbalanceamt | number(28, 8) |
| 13 | lcbalanceglcamt | lcbalanceglcamt | lcbalanceglcamt | number(28, 8) |
| 14 | lcbalancegllamt | lcbalancegllamt | lcbalancegllamt | number(28, 8) |
| 15 | lcbalanceolcamt | lcbalanceolcamt | lcbalanceolcamt | number(28, 8) |
| 16 | lcno | lcno | lcno | varchar2(50) |
| 17 | lcstatus | lcstatus | lcstatus | varchar2(50) |
| 18 | lcterm | lcterm | lcterm | number(38, 0) |
| 19 | lctype | lctype | lctype | number(38, 0) |
| 20 | olclcamount | olclcamount | olclcamount | number(28, 8) |
| 21 | paytype | paytype | paytype | number(38, 0) |
| 22 | pk_advisingbank | pk_advisingbank | pk_advisingbank | varchar2(50) |
| 23 | pk_busipersion | pk_busipersion | pk_busipersion | varchar2(20) |  |  | '~' |
| 24 | pk_dept | pk_dept | pk_dept | varchar2(20) |  |  | '~' |
| 25 | pk_group | pk_group | pk_group | varchar2(50) |
| 26 | pk_issuingbank | pk_issuingbank | pk_issuingbank | varchar2(50) |
| 27 | pk_lccurrtype | pk_lccurrtype | pk_lccurrtype | varchar2(20) |  |  | '~' |
| 28 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 29 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 30 | pk_receiptregister_b | pk_receiptregister_b | pk_receiptregister_b | varchar2(50) |
| 31 | pk_receivebank | pk_receivebank | pk_receivebank | varchar2(20) |  |  | '~' |
| 32 | receivedate | receivedate | receivedate | char(19) |
| 33 | submissionamount | submissionamount | submissionamount | number(28, 8) |
| 34 | submissioneglcamount | submissioneglcamount | submissioneglcamount | number(28, 8) |
| 35 | submissiongllamount | submissiongllamount | submissiongllamount | number(28, 8) |
| 36 | submissionolcamount | submissionolcamount | submissionolcamount | number(28, 8) |
| 37 | validdate | validdate | validdate | char(19) |
| 38 | vbillno | vbillno | vbillno | varchar2(50) |
| 39 | vbillstatus | vbillstatus | vbillstatus | number(38, 0) |
| 40 | def1 | def1 | def1 | varchar2(101) |
| 41 | def2 | def2 | def2 | varchar2(101) |
| 42 | def3 | def3 | def3 | varchar2(101) |
| 43 | def4 | def4 | def4 | varchar2(101) |
| 44 | def5 | def5 | def5 | varchar2(101) |
| 45 | def6 | def6 | def6 | varchar2(101) |
| 46 | def7 | def7 | def7 | varchar2(101) |
| 47 | def8 | def8 | def8 | varchar2(101) |
| 48 | def9 | def9 | def9 | varchar2(101) |
| 49 | def10 | def10 | def10 | varchar2(101) |
| 50 | def11 | def11 | def11 | varchar2(101) |
| 51 | def12 | def12 | def12 | varchar2(101) |
| 52 | def13 | def13 | def13 | varchar2(101) |
| 53 | def14 | def14 | def14 | varchar2(101) |
| 54 | def15 | def15 | def15 | varchar2(101) |
| 55 | def16 | def16 | def16 | varchar2(101) |
| 56 | def17 | def17 | def17 | varchar2(101) |
| 57 | def18 | def18 | def18 | varchar2(101) |
| 58 | def19 | def19 | def19 | varchar2(101) |
| 59 | def20 | def20 | def20 | varchar2(101) |
| 60 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 61 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |