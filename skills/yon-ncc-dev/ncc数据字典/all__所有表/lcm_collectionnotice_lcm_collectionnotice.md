# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9757.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_collectionnotice | pk_collectionnotice | pk_collectionnotice | char(20) | √ |
| 2 | actualcollectdate | actualcollectdate | actualcollectdate | char(19) |
| 3 | actualremitamount | actualremitamount | actualremitamount | number(28, 8) |
| 4 | actualremitglcamount | actualremitglcamount | actualremitglcamount | number(28, 8) |
| 5 | actualremitgllcamount | actualremitgllcamount | actualremitgllcamount | number(28, 8) |
| 6 | actualremitolcamount | actualremitolcamount | actualremitolcamount | number(28, 8) |
| 7 | approvedate | approvedate | approvedate | char(19) |
| 8 | approvenote | approvenote | approvenote | varchar2(1024) |
| 9 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 10 | billno | billno | billno | varchar2(50) |
| 11 | collectaccount | collectaccount | collectaccount | varchar2(20) |  |  | '~' |
| 12 | collectamount | collectamount | collectamount | number(28, 8) |
| 13 | collectglcamount | collectglcamount | collectglcamount | number(28, 8) |
| 14 | collectgllcamount | collectgllcamount | collectgllcamount | number(28, 8) |
| 15 | collectolcamount | collectolcamount | collectolcamount | number(28, 8) |
| 16 | collectplan | collectplan | collectplan | varchar2(20) |  |  | '~' |
| 17 | collectregdate | collectregdate | collectregdate | char(19) |
| 18 | collectregistrant | collectregistrant | collectregistrant | varchar2(20) |  |  | '~' |
| 19 | commitdate | commitdate | commitdate | char(19) |
| 20 | commitregdate | commitregdate | commitregdate | char(19) |
| 21 | commitregistrant | commitregistrant | commitregistrant | varchar2(20) |  |  | '~' |
| 22 | committdate | committdate | committdate | char(19) |
| 23 | committor | committor | committor | varchar2(20) |  |  | '~' |
| 24 | committype | committype | committype | number(38, 0) |
| 25 | docbillrepayamount | docbillrepayamount | docbillrepayamount | number(28, 8) |
| 26 | docbillrepayglcamount | docbillrepayglcamount | docbillrepayglcamount | number(28, 8) |
| 27 | docbillrepaygllcamount | docbillrepaygllcamount | docbillrepaygllcamount | number(28, 8) |
| 28 | docbillrepayolcamount | docbillrepayolcamount | docbillrepayolcamount | number(28, 8) |
| 29 | glcpoundageamount | glcpoundageamount | glcpoundageamount | number(28, 8) |
| 30 | glcrate | glcrate | glcrate | number(28, 8) |
| 31 | gllcpoundageamount | gllcpoundageamount | gllcpoundageamount | number(28, 8) |
| 32 | gllcrate | gllcrate | gllcrate | number(28, 8) |
| 33 | isbatch | isbatch | isbatch | char(1) |
| 34 | isdocubills | isdocubills | isdocubills | char(1) |
| 35 | isinitial | isinitial | isinitial | char(1) |
| 36 | nopayreason | nopayreason | nopayreason | varchar2(181) |
| 37 | olcpoundageamount | olcpoundageamount | olcpoundageamount | number(28, 8) |
| 38 | olcrate | olcrate | olcrate | number(28, 8) |
| 39 | paytype | paytype | paytype | number(38, 0) |
| 40 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(20) |
| 41 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |  |  | '~' |
| 42 | pk_busipersion | pk_busipersion | pk_busipersion | varchar2(20) |  |  | '~' |
| 43 | pk_customer | pk_customer | pk_customer | varchar2(20) |  |  | '~' |
| 44 | pk_dept | pk_dept | pk_dept | varchar2(20) |  |  | '~' |
| 45 | pk_dept_v | pk_dept_v | pk_dept_v | varchar2(20) |  |  | '~' |
| 46 | pk_entrustorg | pk_entrustorg | pk_entrustorg | varchar2(20) |  |  | '~' |
| 47 | pk_entrustorg_v | pk_entrustorg_v | pk_entrustorg_v | varchar2(20) |  |  | '~' |
| 48 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 49 | pk_lccurrtype | pk_lccurrtype | pk_lccurrtype | varchar2(20) |  |  | '~' |
| 50 | pk_lcno | pk_lcno | pk_lcno | varchar2(20) |  |  | '~' |
| 51 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 52 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 53 | pk_payaccount | pk_payaccount | pk_payaccount | varchar2(20) |  |  | '~' |
| 54 | pk_receivebank | pk_receivebank | pk_receivebank | varchar2(20) |  |  | '~' |
| 55 | pk_srcbill | pk_srcbill | pk_srcbill | varchar2(20) |
| 56 | pk_srcbilltype | pk_srcbilltype | pk_srcbilltype | varchar2(50) |
| 57 | pk_submissionno | pk_submissionno | pk_submissionno | varchar2(20) |  |  | '~' |
| 58 | pk_submission_srcbill | pk_submission_srcbill | pk_submission_srcbill | varchar2(50) |
| 59 | poundageamount | poundageamount | poundageamount | number(28, 8) |
| 60 | precolaptamount | precolaptamount | precolaptamount | number(28, 8) |
| 61 | precollectdate | precollectdate | precollectdate | char(19) |
| 62 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 63 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 64 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 65 | saga_status | saga_status | saga_status | number(38, 0) |
| 66 | submission_srccode | submission_srccode | submission_srccode | varchar2(50) |
| 67 | vbillno | vbillno | vbillno | varchar2(50) |
| 68 | vbillstatus | vbillstatus | vbillstatus | number(38, 0) |
| 69 | voucherdate | voucherdate | voucherdate | char(19) |
| 70 | voucherflag | voucherflag | voucherflag | char(1) |
| 71 | vouchermaker | vouchermaker | vouchermaker | varchar2(20) |  |  | '~' |
| 72 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 73 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 74 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 75 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 76 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 77 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 78 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 79 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 80 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 81 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 82 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 83 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 84 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 85 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 86 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 87 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 88 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 89 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 90 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 91 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 92 | vdef21 | vdef21 | vdef21 | varchar2(101) |
| 93 | vdef22 | vdef22 | vdef22 | varchar2(101) |
| 94 | vdef23 | vdef23 | vdef23 | varchar2(101) |
| 95 | vdef24 | vdef24 | vdef24 | varchar2(101) |
| 96 | vdef25 | vdef25 | vdef25 | varchar2(101) |
| 97 | vdef26 | vdef26 | vdef26 | varchar2(101) |
| 98 | vdef27 | vdef27 | vdef27 | varchar2(101) |
| 99 | vdef28 | vdef28 | vdef28 | varchar2(101) |
| 100 | vdef29 | vdef29 | vdef29 | varchar2(101) |
| 101 | vdef30 | vdef30 | vdef30 | varchar2(101) |
| 102 | creationtime | creationtime | creationtime | char(19) |
| 103 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 104 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 105 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 106 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 107 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |